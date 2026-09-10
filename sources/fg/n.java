package fg;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.voip.VoIPGroupNotification;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.p2;
import org.telegram.ui.Components.po;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.to;
import org.telegram.ui.Components.yb0;
import org.telegram.ui.eo;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
public final class n implements Runnable {
    public final int f8148a;
    public final int f8149b;
    public final int f8150c;
    public final Object d;

    public n(int i10, int i11, Object obj, int i12) {
        this.f8148a = i12;
        this.f8149b = i10;
        this.f8150c = i11;
        this.d = obj;
    }

    @Override
    public final void run() {
        switch (this.f8148a) {
            case 0:
                int i10 = this.f8149b;
                f0 f0Var = (f0) this.d;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(i10).getDatabase().queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList<Long> arrayList = new ArrayList<>();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    a0.i iVar = new a0.i();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(longValue);
                        int i11 = this.f8150c;
                        if (isEncryptedDialog) {
                            if (i11 == 0 || i11 == 3) {
                                int encryptedChatId = DialogObject.getEncryptedChatId(longValue);
                                if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                                    arrayList3.add(Integer.valueOf(encryptedChatId));
                                    ?? obj = new Object();
                                    obj.f8022c = longValue;
                                    obj.f8021b = queryFinalized.intValue(1);
                                    arrayList4.add(obj);
                                    iVar.k(obj, obj.f8022c);
                                }
                            }
                        } else if (DialogObject.isUserDialog(longValue)) {
                            if (i11 != 2 && !arrayList.contains(Long.valueOf(longValue))) {
                                arrayList.add(Long.valueOf(longValue));
                                ?? obj2 = new Object();
                                obj2.f8022c = longValue;
                                obj2.f8021b = queryFinalized.intValue(1);
                                arrayList4.add(obj2);
                                iVar.k(obj2, obj2.f8022c);
                            }
                        } else {
                            long j3 = -longValue;
                            if (!arrayList2.contains(Long.valueOf(j3))) {
                                arrayList2.add(Long.valueOf(j3));
                                ?? obj22 = new Object();
                                obj22.f8022c = longValue;
                                obj22.f8021b = queryFinalized.intValue(1);
                                arrayList4.add(obj22);
                                iVar.k(obj22, obj22.f8022c);
                            }
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                    if (!arrayList3.isEmpty()) {
                        ArrayList<TLRPC.EncryptedChat> arrayList6 = new ArrayList<>();
                        MessagesStorage.getInstance(i10).getEncryptedChatsInternal(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                            g0 g0Var = (g0) iVar.f(DialogObject.makeEncryptedDialogId(arrayList6.get(i12).f17203id));
                            if (g0Var != null) {
                                g0Var.f8020a = arrayList6.get(i12);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                        MessagesStorage.getInstance(i10).getChatsInternal(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i13 = 0; i13 < arrayList7.size(); i13++) {
                            TLRPC.Chat chat = arrayList7.get(i13);
                            long j10 = -chat.f17195id;
                            if (chat.migrated_to != null) {
                                g0 g0Var2 = (g0) iVar.f(j10);
                                iVar.l(j10);
                                if (g0Var2 != null) {
                                    arrayList4.remove(g0Var2);
                                }
                            } else {
                                g0 g0Var3 = (g0) iVar.f(j10);
                                if (g0Var3 != null) {
                                    g0Var3.f8020a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        MessagesStorage.getInstance(i10).getUsersInternal(arrayList, arrayList5);
                        for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                            TLRPC.User user = arrayList5.get(i14);
                            g0 g0Var4 = (g0) iVar.f(user.f17342id);
                            if (g0Var4 != null) {
                                g0Var4.f8020a = user;
                            }
                        }
                    }
                    Collections.sort(arrayList4, new a4.e(5));
                    AndroidUtilities.runOnUIThread(new a3.k0(f0Var, arrayList4, iVar, 22));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                i2.e0 e0Var = (i2.e0) this.d;
                e2.p pVar = e0Var.f10150m;
                int i15 = this.f8149b;
                int i16 = this.f8150c;
                pVar.e(24, new ch.c(i15, i16, 2));
                e0Var.p1(2, 14, new e2.w(i15, i16));
                return;
            case 2:
                ((i2.b0) this.d).f10108a.m1(this.f8149b, this.f8150c);
                return;
            case 3:
                VoIPGroupNotification.d((Context) this.d, this.f8149b, this.f8150c);
                return;
            case 4:
                ((VoIPService) this.d).lambda$initiateActualEncryptedCall$86(this.f8149b, this.f8150c);
                return;
            case 5:
                ((ConnectionsManager) this.d).lambda$discardConnection$0(this.f8149b, this.f8150c);
                return;
            case 6:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.d;
                for (int i17 = 0; i17 < this.f8149b - this.f8150c; i17++) {
                    y0Var.goBack();
                }
                return;
            case 7:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(this.f8149b).getClientUserId());
                bundle.putInt("message_id", this.f8150c);
                ((p2) this.d).presentFragment(new eo(bundle));
                return;
            case 8:
                to toVar = (to) this.d;
                int i18 = this.f8149b;
                if (i18 != 0) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f8150c);
                    notificationsSettings.edit().putInt("last_selected_mute_until_time", i18).putInt("last_selected_mute_until_time2", notificationsSettings.getInt("last_selected_mute_until_time", 0)).apply();
                }
                toVar.t(i18);
                return;
            case 9:
                po poVar = (po) this.d;
                int i19 = this.f8149b;
                if (i19 != 0) {
                    SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(this.f8150c);
                    notificationsSettings2.edit().putInt("last_selected_mute_until_time", i19).putInt("last_selected_mute_until_time2", notificationsSettings2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                poVar.run(Integer.valueOf(i19));
                return;
            case 10:
                yb0 yb0Var = ((rb0) this.d).X2;
                View d = yb0Var.d();
                rb0 rb0Var = yb0Var.f29296f;
                if (d != null) {
                    int top = d.getTop() + this.f8149b;
                    int top2 = d.getTop() + this.f8150c;
                    int i20 = top2 - top;
                    int paddingTop = rb0Var.getPaddingTop();
                    int height = rb0Var.getHeight() - rb0Var.getPaddingBottom();
                    if (i20 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i21 = top - paddingTop;
                    if (i21 < 0) {
                        rb0Var.scrollBy(0, i21);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.voip.i1 i1Var = ((org.telegram.ui.Components.voip.h1) this.d).f28159a;
                pf.e eVar = i1Var.O;
                if (eVar != null) {
                    eVar.d(this.f8149b, this.f8150c);
                }
                i1Var.i(false);
                return;
            case 12:
                ((SurfaceTextureHelper) this.d).lambda$setTextureSize$2(this.f8149b, this.f8150c);
                return;
            case 13:
                SurfaceViewRenderer.a((SurfaceViewRenderer) this.d, this.f8149b, this.f8150c);
                return;
            default:
                ((TextureViewRenderer) this.d).lambda$updateVideoSizes$1(this.f8149b, this.f8150c);
                return;
        }
    }

    public n(i2.b0 b0Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f8148a = 2;
        this.d = b0Var;
        this.f8149b = i10;
        this.f8150c = i11;
    }

    public n(Object obj, int i10, int i11, int i12) {
        this.f8148a = i12;
        this.d = obj;
        this.f8149b = i10;
        this.f8150c = i11;
    }
}
