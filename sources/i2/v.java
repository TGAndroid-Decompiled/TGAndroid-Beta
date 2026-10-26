package i2;

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
import org.telegram.ui.ActionBar.r2;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.ap;
import org.telegram.ui.Components.hc0;
import org.telegram.ui.Components.wo;
import org.telegram.ui.un;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
public final class v implements Runnable {
    public final int f13775a;
    public final int f13776b;
    public final int f13777c;
    public final Object d;

    public v(int i10, int i11, Object obj, int i12) {
        this.f13775a = i12;
        this.f13776b = i10;
        this.f13777c = i11;
        this.d = obj;
    }

    @Override
    public final void run() {
        switch (this.f13775a) {
            case 0:
                j0 j0Var = (j0) this.d;
                e2.r rVar = j0Var.f13603m;
                int i10 = this.f13776b;
                int i11 = this.f13777c;
                rVar.e(24, new fh.c(i10, i11, 2));
                j0Var.t1(2, 14, new e2.y(i10, i11));
                return;
            case 1:
                ((d0) this.d).f13509a.q1(this.f13776b, this.f13777c);
                return;
            case 2:
                int i12 = this.f13776b;
                ig.g0 g0Var = (ig.g0) this.d;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(i12).getDatabase().queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList<Long> arrayList = new ArrayList<>();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    a0.h hVar = new a0.h();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(longValue);
                        int i13 = this.f13777c;
                        if (isEncryptedDialog) {
                            if (i13 == 0 || i13 == 3) {
                                int encryptedChatId = DialogObject.getEncryptedChatId(longValue);
                                if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                                    arrayList3.add(Integer.valueOf(encryptedChatId));
                                    ?? obj = new Object();
                                    obj.f14066c = longValue;
                                    obj.f14065b = queryFinalized.intValue(1);
                                    arrayList4.add(obj);
                                    hVar.k(obj, obj.f14066c);
                                }
                            }
                        } else if (DialogObject.isUserDialog(longValue)) {
                            if (i13 != 2 && !arrayList.contains(Long.valueOf(longValue))) {
                                arrayList.add(Long.valueOf(longValue));
                                ?? obj2 = new Object();
                                obj2.f14066c = longValue;
                                obj2.f14065b = queryFinalized.intValue(1);
                                arrayList4.add(obj2);
                                hVar.k(obj2, obj2.f14066c);
                            }
                        } else {
                            long j10 = -longValue;
                            if (!arrayList2.contains(Long.valueOf(j10))) {
                                arrayList2.add(Long.valueOf(j10));
                                ?? obj22 = new Object();
                                obj22.f14066c = longValue;
                                obj22.f14065b = queryFinalized.intValue(1);
                                arrayList4.add(obj22);
                                hVar.k(obj22, obj22.f14066c);
                            }
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                    if (!arrayList3.isEmpty()) {
                        ArrayList<TLRPC.EncryptedChat> arrayList6 = new ArrayList<>();
                        MessagesStorage.getInstance(i12).getEncryptedChatsInternal(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i14 = 0; i14 < arrayList6.size(); i14++) {
                            ig.h0 h0Var = (ig.h0) hVar.f(DialogObject.makeEncryptedDialogId(arrayList6.get(i14).f22035id));
                            if (h0Var != null) {
                                h0Var.f14064a = arrayList6.get(i14);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                        MessagesStorage.getInstance(i12).getChatsInternal(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i15 = 0; i15 < arrayList7.size(); i15++) {
                            TLRPC.Chat chat = arrayList7.get(i15);
                            long j11 = -chat.f22027id;
                            if (chat.migrated_to != null) {
                                ig.h0 h0Var2 = (ig.h0) hVar.f(j11);
                                hVar.l(j11);
                                if (h0Var2 != null) {
                                    arrayList4.remove(h0Var2);
                                }
                            } else {
                                ig.h0 h0Var3 = (ig.h0) hVar.f(j11);
                                if (h0Var3 != null) {
                                    h0Var3.f14064a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        MessagesStorage.getInstance(i12).getUsersInternal(arrayList, arrayList5);
                        for (int i16 = 0; i16 < arrayList5.size(); i16++) {
                            TLRPC.User user = arrayList5.get(i16);
                            ig.h0 h0Var4 = (ig.h0) hVar.f(user.f22176id);
                            if (h0Var4 != null) {
                                h0Var4.f14064a = user;
                            }
                        }
                    }
                    Collections.sort(arrayList4, new a4.d(20));
                    AndroidUtilities.runOnUIThread(new e2.m0(g0Var, arrayList4, hVar, 18));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 3:
                VoIPGroupNotification.d((Context) this.d, this.f13776b, this.f13777c);
                return;
            case 4:
                ((VoIPService) this.d).lambda$initiateActualEncryptedCall$86(this.f13776b, this.f13777c);
                return;
            case 5:
                ((ConnectionsManager) this.d).lambda$discardConnection$0(this.f13776b, this.f13777c);
                return;
            case 6:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.d;
                for (int i17 = 0; i17 < this.f13776b - this.f13777c; i17++) {
                    x0Var.goBack();
                }
                return;
            case 7:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(this.f13776b).getClientUserId());
                bundle.putInt("message_id", this.f13777c);
                ((r2) this.d).presentFragment(new un(bundle));
                return;
            case 8:
                ap apVar = (ap) this.d;
                int i18 = this.f13776b;
                if (i18 != 0) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f13777c);
                    notificationsSettings.edit().putInt("last_selected_mute_until_time", i18).putInt("last_selected_mute_until_time2", notificationsSettings.getInt("last_selected_mute_until_time", 0)).apply();
                }
                apVar.u(i18);
                return;
            case 9:
                wo woVar = (wo) this.d;
                int i19 = this.f13776b;
                if (i19 != 0) {
                    SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(this.f13777c);
                    notificationsSettings2.edit().putInt("last_selected_mute_until_time", i19).putInt("last_selected_mute_until_time2", notificationsSettings2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                woVar.run(Integer.valueOf(i19));
                return;
            case 10:
                hc0 hc0Var = ((ac0) this.d).f26464f3;
                View d = hc0Var.d();
                ac0 ac0Var = hc0Var.f28920f;
                if (d != null) {
                    int top = d.getTop() + this.f13776b;
                    int top2 = d.getTop() + this.f13777c;
                    int i20 = top2 - top;
                    int paddingTop = ac0Var.getPaddingTop();
                    int height = ac0Var.getHeight() - ac0Var.getPaddingBottom();
                    if (i20 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i21 = top - paddingTop;
                    if (i21 < 0) {
                        ac0Var.scrollBy(0, i21);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.voip.i1 i1Var = ((org.telegram.ui.Components.voip.h1) this.d).f33831a;
                sf.d dVar = i1Var.O;
                if (dVar != null) {
                    dVar.d(this.f13776b, this.f13777c);
                }
                i1Var.i(false);
                return;
            case 12:
                ((SurfaceTextureHelper) this.d).lambda$setTextureSize$2(this.f13776b, this.f13777c);
                return;
            case 13:
                SurfaceViewRenderer.a((SurfaceViewRenderer) this.d, this.f13776b, this.f13777c);
                return;
            default:
                ((TextureViewRenderer) this.d).lambda$updateVideoSizes$1(this.f13776b, this.f13777c);
                return;
        }
    }

    public v(d0 d0Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f13775a = 1;
        this.d = d0Var;
        this.f13776b = i10;
        this.f13777c = i11;
    }

    public v(Object obj, int i10, int i11, int i12) {
        this.f13775a = i12;
        this.d = obj;
        this.f13776b = i10;
        this.f13777c = i11;
    }
}
