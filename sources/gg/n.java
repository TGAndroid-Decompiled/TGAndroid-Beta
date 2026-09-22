package gg;

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
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.ko;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.zn;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
public final class n implements Runnable {
    public final int f9864a;
    public final int f9865b;
    public final int f9866c;
    public final Object d;

    public n(int i10, int i11, Object obj, int i12) {
        this.f9864a = i12;
        this.f9865b = i10;
        this.f9866c = i11;
        this.d = obj;
    }

    @Override
    public final void run() {
        switch (this.f9864a) {
            case 0:
                int i10 = this.f9865b;
                g0 g0Var = (g0) this.d;
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
                        int i11 = this.f9866c;
                        if (isEncryptedDialog) {
                            if (i11 == 0 || i11 == 3) {
                                int encryptedChatId = DialogObject.getEncryptedChatId(longValue);
                                if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                                    arrayList3.add(Integer.valueOf(encryptedChatId));
                                    ?? obj = new Object();
                                    obj.f9756c = longValue;
                                    obj.f9755b = queryFinalized.intValue(1);
                                    arrayList4.add(obj);
                                    iVar.k(obj, obj.f9756c);
                                }
                            }
                        } else if (DialogObject.isUserDialog(longValue)) {
                            if (i11 != 2 && !arrayList.contains(Long.valueOf(longValue))) {
                                arrayList.add(Long.valueOf(longValue));
                                ?? obj2 = new Object();
                                obj2.f9756c = longValue;
                                obj2.f9755b = queryFinalized.intValue(1);
                                arrayList4.add(obj2);
                                iVar.k(obj2, obj2.f9756c);
                            }
                        } else {
                            long j3 = -longValue;
                            if (!arrayList2.contains(Long.valueOf(j3))) {
                                arrayList2.add(Long.valueOf(j3));
                                ?? obj22 = new Object();
                                obj22.f9756c = longValue;
                                obj22.f9755b = queryFinalized.intValue(1);
                                arrayList4.add(obj22);
                                iVar.k(obj22, obj22.f9756c);
                            }
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                    if (!arrayList3.isEmpty()) {
                        ArrayList<TLRPC.EncryptedChat> arrayList6 = new ArrayList<>();
                        MessagesStorage.getInstance(i10).getEncryptedChatsInternal(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                            h0 h0Var = (h0) iVar.f(DialogObject.makeEncryptedDialogId(arrayList6.get(i12).f18351id));
                            if (h0Var != null) {
                                h0Var.f9754a = arrayList6.get(i12);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                        MessagesStorage.getInstance(i10).getChatsInternal(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i13 = 0; i13 < arrayList7.size(); i13++) {
                            TLRPC.Chat chat = arrayList7.get(i13);
                            long j10 = -chat.f18343id;
                            if (chat.migrated_to != null) {
                                h0 h0Var2 = (h0) iVar.f(j10);
                                iVar.l(j10);
                                if (h0Var2 != null) {
                                    arrayList4.remove(h0Var2);
                                }
                            } else {
                                h0 h0Var3 = (h0) iVar.f(j10);
                                if (h0Var3 != null) {
                                    h0Var3.f9754a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        MessagesStorage.getInstance(i10).getUsersInternal(arrayList, arrayList5);
                        for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                            TLRPC.User user = arrayList5.get(i14);
                            h0 h0Var4 = (h0) iVar.f(user.f18490id);
                            if (h0Var4 != null) {
                                h0Var4.f9754a = user;
                            }
                        }
                    }
                    Collections.sort(arrayList4, new a4.e(12));
                    AndroidUtilities.runOnUIThread(new t(g0Var, arrayList4, iVar, 0));
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 1:
                i2.e0 e0Var = (i2.e0) this.d;
                e2.p pVar = e0Var.f10668m;
                int i15 = this.f9865b;
                int i16 = this.f9866c;
                pVar.e(24, new dh.c(i15, i16, 2));
                e0Var.p1(2, 14, new e2.w(i15, i16));
                return;
            case 2:
                ((i2.b0) this.d).f10625a.m1(this.f9865b, this.f9866c);
                return;
            case 3:
                VoIPGroupNotification.d((Context) this.d, this.f9865b, this.f9866c);
                return;
            case 4:
                ((VoIPService) this.d).lambda$initiateActualEncryptedCall$86(this.f9865b, this.f9866c);
                return;
            case 5:
                ((ConnectionsManager) this.d).lambda$discardConnection$0(this.f9865b, this.f9866c);
                return;
            case 6:
                org.telegram.ui.web.z0 z0Var = (org.telegram.ui.web.z0) this.d;
                for (int i17 = 0; i17 < this.f9865b - this.f9866c; i17++) {
                    z0Var.goBack();
                }
                return;
            case 7:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(this.f9865b).getClientUserId());
                bundle.putInt("message_id", this.f9866c);
                ((n2) this.d).presentFragment(new zn(bundle));
                return;
            case 8:
                oo ooVar = (oo) this.d;
                int i18 = this.f9865b;
                if (i18 != 0) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f9866c);
                    notificationsSettings.edit().putInt("last_selected_mute_until_time", i18).putInt("last_selected_mute_until_time2", notificationsSettings.getInt("last_selected_mute_until_time", 0)).apply();
                }
                ooVar.u(i18);
                return;
            case 9:
                ko koVar = (ko) this.d;
                int i19 = this.f9865b;
                if (i19 != 0) {
                    SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(this.f9866c);
                    notificationsSettings2.edit().putInt("last_selected_mute_until_time", i19).putInt("last_selected_mute_until_time2", notificationsSettings2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                koVar.run(Integer.valueOf(i19));
                return;
            case 10:
                ac0 ac0Var = ((sb0) this.d).X2;
                View d = ac0Var.d();
                sb0 sb0Var = ac0Var.f22626f;
                if (d != null) {
                    int top = d.getTop() + this.f9865b;
                    int top2 = d.getTop() + this.f9866c;
                    int i20 = top2 - top;
                    int paddingTop = sb0Var.getPaddingTop();
                    int height = sb0Var.getHeight() - sb0Var.getPaddingBottom();
                    if (i20 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i21 = top - paddingTop;
                    if (i21 < 0) {
                        sb0Var.scrollBy(0, i21);
                        return;
                    }
                    return;
                }
                return;
            case 11:
                org.telegram.ui.Components.voip.j1 j1Var = ((org.telegram.ui.Components.voip.i1) this.d).f29356a;
                pf.e eVar = j1Var.O;
                if (eVar != null) {
                    eVar.d(this.f9865b, this.f9866c);
                }
                j1Var.i(false);
                return;
            case 12:
                ((SurfaceTextureHelper) this.d).lambda$setTextureSize$2(this.f9865b, this.f9866c);
                return;
            case 13:
                SurfaceViewRenderer.a((SurfaceViewRenderer) this.d, this.f9865b, this.f9866c);
                return;
            default:
                ((TextureViewRenderer) this.d).lambda$updateVideoSizes$1(this.f9865b, this.f9866c);
                return;
        }
    }

    public n(i2.b0 b0Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f9864a = 2;
        this.d = b0Var;
        this.f9865b = i10;
        this.f9866c = i11;
    }

    public n(Object obj, int i10, int i11, int i12) {
        this.f9864a = i12;
        this.d = obj;
        this.f9865b = i10;
        this.f9866c = i11;
    }
}
