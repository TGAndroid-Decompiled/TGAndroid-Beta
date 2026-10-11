package gg;

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
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.Components.ap;
import org.telegram.ui.Components.ep;
import org.telegram.ui.Components.jc0;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.zn;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
public final class n implements Runnable {
    public final int f10732a;
    public final int f10733b;
    public final int f10734c;
    public final Object d;

    public n(int i10, int i11, Object obj, int i12) {
        this.f10732a = i12;
        this.f10733b = i10;
        this.f10734c = i11;
        this.d = obj;
    }

    @Override
    public final void run() {
        switch (this.f10732a) {
            case 0:
                int i10 = this.f10733b;
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
                        int i11 = this.f10734c;
                        if (isEncryptedDialog) {
                            if (i11 == 0 || i11 == 3) {
                                int encryptedChatId = DialogObject.getEncryptedChatId(longValue);
                                if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                                    arrayList3.add(Integer.valueOf(encryptedChatId));
                                    ?? obj = new Object();
                                    obj.f10610c = longValue;
                                    obj.f10609b = queryFinalized.intValue(1);
                                    arrayList4.add(obj);
                                    iVar.k(obj, obj.f10610c);
                                }
                            }
                        } else if (DialogObject.isUserDialog(longValue)) {
                            if (i11 != 2 && !arrayList.contains(Long.valueOf(longValue))) {
                                arrayList.add(Long.valueOf(longValue));
                                ?? obj2 = new Object();
                                obj2.f10610c = longValue;
                                obj2.f10609b = queryFinalized.intValue(1);
                                arrayList4.add(obj2);
                                iVar.k(obj2, obj2.f10610c);
                            }
                        } else {
                            long j3 = -longValue;
                            if (!arrayList2.contains(Long.valueOf(j3))) {
                                arrayList2.add(Long.valueOf(j3));
                                ?? obj22 = new Object();
                                obj22.f10610c = longValue;
                                obj22.f10609b = queryFinalized.intValue(1);
                                arrayList4.add(obj22);
                                iVar.k(obj22, obj22.f10610c);
                            }
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                    if (!arrayList3.isEmpty()) {
                        ArrayList<TLRPC.EncryptedChat> arrayList6 = new ArrayList<>();
                        MessagesStorage.getInstance(i10).getEncryptedChatsInternal(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i12 = 0; i12 < arrayList6.size(); i12++) {
                            g0 g0Var = (g0) iVar.f(DialogObject.makeEncryptedDialogId(arrayList6.get(i12).f20040id));
                            if (g0Var != null) {
                                g0Var.f10608a = arrayList6.get(i12);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                        MessagesStorage.getInstance(i10).getChatsInternal(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i13 = 0; i13 < arrayList7.size(); i13++) {
                            TLRPC.Chat chat = arrayList7.get(i13);
                            long j10 = -chat.f20032id;
                            if (chat.migrated_to != null) {
                                g0 g0Var2 = (g0) iVar.f(j10);
                                iVar.l(j10);
                                if (g0Var2 != null) {
                                    arrayList4.remove(g0Var2);
                                }
                            } else {
                                g0 g0Var3 = (g0) iVar.f(j10);
                                if (g0Var3 != null) {
                                    g0Var3.f10608a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        MessagesStorage.getInstance(i10).getUsersInternal(arrayList, arrayList5);
                        for (int i14 = 0; i14 < arrayList5.size(); i14++) {
                            TLRPC.User user = arrayList5.get(i14);
                            g0 g0Var4 = (g0) iVar.f(user.f20179id);
                            if (g0Var4 != null) {
                                g0Var4.f10608a = user;
                            }
                        }
                    }
                    Collections.sort(arrayList4, new a4.d(12));
                    AndroidUtilities.runOnUIThread(new a3.k0(f0Var, arrayList4, iVar, 29));
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 1:
                i2.f0 f0Var2 = (i2.f0) this.d;
                e2.p pVar = f0Var2.f11675m;
                int i15 = this.f10733b;
                int i16 = this.f10734c;
                pVar.e(24, new dh.c(i15, i16, 2));
                f0Var2.r1(2, 14, new e2.w(i15, i16));
                return;
            case 2:
                ((i2.c0) this.d).f11619a.o1(this.f10733b, this.f10734c);
                return;
            case 3:
                ((VoIPService) this.d).lambda$initiateActualEncryptedCall$86(this.f10733b, this.f10734c);
                return;
            case 4:
                ((ConnectionsManager) this.d).lambda$discardConnection$0(this.f10733b, this.f10734c);
                return;
            case 5:
                org.telegram.ui.web.y0 y0Var = (org.telegram.ui.web.y0) this.d;
                for (int i17 = 0; i17 < this.f10733b - this.f10734c; i17++) {
                    y0Var.goBack();
                }
                return;
            case 6:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(this.f10733b).getClientUserId());
                bundle.putInt("message_id", this.f10734c);
                ((m2) this.d).presentFragment(new zn(bundle));
                return;
            case 7:
                ep epVar = (ep) this.d;
                int i18 = this.f10733b;
                if (i18 != 0) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f10734c);
                    notificationsSettings.edit().putInt("last_selected_mute_until_time", i18).putInt("last_selected_mute_until_time2", notificationsSettings.getInt("last_selected_mute_until_time", 0)).apply();
                }
                epVar.x(i18);
                return;
            case 8:
                ap apVar = (ap) this.d;
                int i19 = this.f10733b;
                if (i19 != 0) {
                    SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(this.f10734c);
                    notificationsSettings2.edit().putInt("last_selected_mute_until_time", i19).putInt("last_selected_mute_until_time2", notificationsSettings2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                apVar.run(Integer.valueOf(i19));
                return;
            case 9:
                qc0 qc0Var = ((jc0) this.d).V2;
                View d = qc0Var.d();
                jc0 jc0Var = qc0Var.f30134f;
                if (d != null) {
                    int top = d.getTop() + this.f10733b;
                    int top2 = d.getTop() + this.f10734c;
                    int i20 = top2 - top;
                    int paddingTop = jc0Var.getPaddingTop();
                    int height = jc0Var.getHeight() - jc0Var.getPaddingBottom();
                    if (i20 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i21 = top - paddingTop;
                    if (i21 < 0) {
                        jc0Var.scrollBy(0, i21);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.voip.k1 k1Var = ((org.telegram.ui.Components.voip.j1) this.d).f32041a;
                qf.e eVar = k1Var.O;
                if (eVar != null) {
                    eVar.d(this.f10733b, this.f10734c);
                }
                k1Var.i(false);
                return;
            case 11:
                ((SurfaceTextureHelper) this.d).lambda$setTextureSize$2(this.f10733b, this.f10734c);
                return;
            case 12:
                SurfaceViewRenderer.a((SurfaceViewRenderer) this.d, this.f10733b, this.f10734c);
                return;
            default:
                ((TextureViewRenderer) this.d).lambda$updateVideoSizes$1(this.f10733b, this.f10734c);
                return;
        }
    }

    public n(i2.c0 c0Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f10732a = 2;
        this.d = c0Var;
        this.f10733b = i10;
        this.f10734c = i11;
    }

    public n(Object obj, int i10, int i11, int i12) {
        this.f10732a = i12;
        this.d = obj;
        this.f10733b = i10;
        this.f10734c = i11;
    }
}
