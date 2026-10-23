package hg;

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
import org.telegram.ui.ActionBar.n2;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.ic0;
import org.telegram.ui.Components.uo;
import org.telegram.ui.Components.yo;
import org.telegram.ui.qn;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
public final class n implements Runnable {
    public final int f11984a;
    public final int f11985b;
    public final int f11986c;
    public final Object d;

    public n(int i10, int i11, Object obj, int i12) {
        this.f11984a = i12;
        this.f11985b = i10;
        this.f11986c = i11;
        this.d = obj;
    }

    @Override
    public final void run() {
        switch (this.f11984a) {
            case 0:
                int i10 = this.f11985b;
                f0 f0Var = (f0) this.d;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(i10).getDatabase().queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList<Long> arrayList = new ArrayList<>();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    a0.h hVar = new a0.h();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(longValue);
                        int i11 = this.f11986c;
                        if (isEncryptedDialog) {
                            if (i11 == 0 || i11 == 3) {
                                int encryptedChatId = DialogObject.getEncryptedChatId(longValue);
                                if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                                    arrayList3.add(Integer.valueOf(encryptedChatId));
                                    ?? obj = new Object();
                                    obj.f11868c = longValue;
                                    obj.f11867b = queryFinalized.intValue(1);
                                    arrayList4.add(obj);
                                    hVar.k(obj, obj.f11868c);
                                }
                            }
                        } else if (DialogObject.isUserDialog(longValue)) {
                            if (i11 != 2 && !arrayList.contains(Long.valueOf(longValue))) {
                                arrayList.add(Long.valueOf(longValue));
                                ?? obj2 = new Object();
                                obj2.f11868c = longValue;
                                obj2.f11867b = queryFinalized.intValue(1);
                                arrayList4.add(obj2);
                                hVar.k(obj2, obj2.f11868c);
                            }
                        } else {
                            long j10 = -longValue;
                            if (!arrayList2.contains(Long.valueOf(j10))) {
                                arrayList2.add(Long.valueOf(j10));
                                ?? obj22 = new Object();
                                obj22.f11868c = longValue;
                                obj22.f11867b = queryFinalized.intValue(1);
                                arrayList4.add(obj22);
                                hVar.k(obj22, obj22.f11868c);
                            }
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                    if (!arrayList3.isEmpty()) {
                        ArrayList<TLRPC.EncryptedChat> arrayList6 = new ArrayList<>();
                        MessagesStorage.getInstance(i10).getEncryptedChatsInternal(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                            g0 g0Var = (g0) hVar.f(DialogObject.makeEncryptedDialogId(arrayList6.get(i12).f20288id));
                            if (g0Var != null) {
                                g0Var.f11866a = arrayList6.get(i12);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                        MessagesStorage.getInstance(i10).getChatsInternal(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i13 = 0; i13 < arrayList7.size(); i13++) {
                            TLRPC.Chat chat = arrayList7.get(i13);
                            long j11 = -chat.f20280id;
                            if (chat.migrated_to != null) {
                                g0 g0Var2 = (g0) hVar.f(j11);
                                hVar.l(j11);
                                if (g0Var2 != null) {
                                    arrayList4.remove(g0Var2);
                                }
                            } else {
                                g0 g0Var3 = (g0) hVar.f(j11);
                                if (g0Var3 != null) {
                                    g0Var3.f11866a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        MessagesStorage.getInstance(i10).getUsersInternal(arrayList, arrayList5);
                        for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                            TLRPC.User user = arrayList5.get(i14);
                            g0 g0Var4 = (g0) hVar.f(user.f20427id);
                            if (g0Var4 != null) {
                                g0Var4.f11866a = user;
                            }
                        }
                    }
                    Collections.sort(arrayList4, new a4.d(18));
                    AndroidUtilities.runOnUIThread(new ei.z1(f0Var, arrayList4, hVar, 14));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                i2.i0 i0Var = (i2.i0) this.d;
                e2.r rVar = i0Var.f12402m;
                int i15 = this.f11985b;
                int i16 = this.f11986c;
                rVar.e(24, new eh.c(i15, i16, 2));
                i0Var.t1(2, 14, new e2.y(i15, i16));
                return;
            case 2:
                ((i2.c0) this.d).f12325a.q1(this.f11985b, this.f11986c);
                return;
            case 3:
                VoIPGroupNotification.d((Context) this.d, this.f11985b, this.f11986c);
                return;
            case 4:
                ((VoIPService) this.d).lambda$initiateActualEncryptedCall$86(this.f11985b, this.f11986c);
                return;
            case 5:
                ((ConnectionsManager) this.d).lambda$discardConnection$0(this.f11985b, this.f11986c);
                return;
            case 6:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.d;
                for (int i17 = 0; i17 < this.f11985b - this.f11986c; i17++) {
                    x0Var.goBack();
                }
                return;
            case 7:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(this.f11985b).getClientUserId());
                bundle.putInt("message_id", this.f11986c);
                ((n2) this.d).presentFragment(new qn(bundle));
                return;
            case 8:
                yo yoVar = (yo) this.d;
                int i18 = this.f11985b;
                if (i18 != 0) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f11986c);
                    notificationsSettings.edit().putInt("last_selected_mute_until_time", i18).putInt("last_selected_mute_until_time2", notificationsSettings.getInt("last_selected_mute_until_time", 0)).apply();
                }
                yoVar.x(i18);
                return;
            case 9:
                uo uoVar = (uo) this.d;
                int i19 = this.f11985b;
                if (i19 != 0) {
                    SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(this.f11986c);
                    notificationsSettings2.edit().putInt("last_selected_mute_until_time", i19).putInt("last_selected_mute_until_time2", notificationsSettings2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                uoVar.run(Integer.valueOf(i19));
                return;
            case 10:
                ic0 ic0Var = ((bc0) this.d).V2;
                View d = ic0Var.d();
                bc0 bc0Var = ic0Var.f27242f;
                if (d != null) {
                    int top = d.getTop() + this.f11985b;
                    int top2 = d.getTop() + this.f11986c;
                    int i20 = top2 - top;
                    int paddingTop = bc0Var.getPaddingTop();
                    int height = bc0Var.getHeight() - bc0Var.getPaddingBottom();
                    if (i20 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i21 = top - paddingTop;
                    if (i21 < 0) {
                        bc0Var.scrollBy(0, i21);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.voip.h1 h1Var = ((org.telegram.ui.Components.voip.g1) this.d).f31426a;
                rf.d dVar = h1Var.O;
                if (dVar != null) {
                    dVar.d(this.f11985b, this.f11986c);
                }
                h1Var.i(false);
                return;
            case 12:
                ((SurfaceTextureHelper) this.d).lambda$setTextureSize$2(this.f11985b, this.f11986c);
                return;
            case 13:
                SurfaceViewRenderer.a((SurfaceViewRenderer) this.d, this.f11985b, this.f11986c);
                return;
            default:
                ((TextureViewRenderer) this.d).lambda$updateVideoSizes$1(this.f11985b, this.f11986c);
                return;
        }
    }

    public n(i2.c0 c0Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f11984a = 2;
        this.d = c0Var;
        this.f11985b = i10;
        this.f11986c = i11;
    }

    public n(Object obj, int i10, int i11, int i12) {
        this.f11984a = i12;
        this.d = obj;
        this.f11985b = i10;
        this.f11986c = i11;
    }
}
