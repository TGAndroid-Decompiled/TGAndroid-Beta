package j3;

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
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.kb0;
import org.telegram.ui.Components.mo;
import org.telegram.ui.Components.n71;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.du;
import org.telegram.ui.xn;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
public final class v implements Runnable {
    public final int f9443a;
    public final int f9444b;
    public final int f9445c;
    public final Object d;

    public v(int i10, int i11, Object obj, int i12) {
        this.f9443a = i12;
        this.f9444b = i10;
        this.f9445c = i11;
        this.d = obj;
    }

    @Override
    public final void run() {
        switch (this.f9443a) {
            case 0:
                f0 f0Var = (f0) this.d;
                h5.m mVar = f0Var.f9123l;
                int i10 = this.f9444b;
                int i11 = this.f9445c;
                mVar.e(24, new w(i10, i11, 1));
                f0Var.V(2, 14, new h5.x(i10, i11));
                return;
            case 1:
                ((c0) this.d).f9000a.T(this.f9444b, this.f9445c);
                return;
            case 2:
                VoIPGroupNotification.d((Context) this.d, this.f9444b, this.f9445c);
                return;
            case 3:
                ((VoIPService) this.d).lambda$initiateActualEncryptedCall$86(this.f9444b, this.f9445c);
                return;
            case 4:
                ((ConnectionsManager) this.d).lambda$discardConnection$0(this.f9444b, this.f9445c);
                return;
            case 5:
                org.telegram.ui.web.x0 x0Var = (org.telegram.ui.web.x0) this.d;
                for (int i12 = 0; i12 < this.f9444b - this.f9445c; i12++) {
                    x0Var.goBack();
                }
                return;
            case 6:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(this.f9444b).getClientUserId());
                bundle.putInt("message_id", this.f9445c);
                ((org.telegram.ui.ActionBar.p2) this.d).presentFragment(new xn(bundle));
                return;
            case 7:
                mo moVar = (mo) this.d;
                int i13 = this.f9444b;
                if (i13 != 0) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f9445c);
                    notificationsSettings.edit().putInt("last_selected_mute_until_time", i13).putInt("last_selected_mute_until_time2", notificationsSettings.getInt("last_selected_mute_until_time", 0)).apply();
                }
                moVar.v(i13);
                return;
            case 8:
                io ioVar = (io) this.d;
                int i14 = this.f9444b;
                if (i14 != 0) {
                    SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(this.f9445c);
                    notificationsSettings2.edit().putInt("last_selected_mute_until_time", i14).putInt("last_selected_mute_until_time2", notificationsSettings2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                ioVar.run(Integer.valueOf(i14));
                return;
            case 9:
                sb0 sb0Var = ((kb0) this.d).U2;
                View d = sb0Var.d();
                kb0 kb0Var = sb0Var.f31031f;
                if (d != null) {
                    int top = d.getTop() + this.f9444b;
                    int top2 = d.getTop() + this.f9445c;
                    int i15 = top2 - top;
                    int paddingTop = kb0Var.getPaddingTop();
                    int height = kb0Var.getHeight() - kb0Var.getPaddingBottom();
                    if (i15 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i16 = top - paddingTop;
                    if (i16 < 0) {
                        kb0Var.scrollBy(0, i16);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.voip.h1 h1Var = ((org.telegram.ui.Components.voip.g1) this.d).f32051a;
                cf.f fVar = h1Var.L;
                if (fVar != null) {
                    fVar.d(this.f9444b, this.f9445c);
                }
                h1Var.i(false);
                return;
            case 11:
                ((SurfaceTextureHelper) this.d).lambda$setTextureSize$2(this.f9444b, this.f9445c);
                return;
            case 12:
                SurfaceViewRenderer.a((SurfaceViewRenderer) this.d, this.f9444b, this.f9445c);
                return;
            case 13:
                ((TextureViewRenderer) this.d).lambda$updateVideoSizes$1(this.f9444b, this.f9445c);
                return;
            default:
                int i17 = this.f9444b;
                uf.x xVar = (uf.x) this.d;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(i17).getDatabase().queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList<Long> arrayList = new ArrayList<>();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    a0.h hVar = new a0.h();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(longValue);
                        int i18 = this.f9445c;
                        if (isEncryptedDialog) {
                            if (i18 == 0 || i18 == 3) {
                                int encryptedChatId = DialogObject.getEncryptedChatId(longValue);
                                if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                                    arrayList3.add(Integer.valueOf(encryptedChatId));
                                    ?? obj = new Object();
                                    obj.f48777c = longValue;
                                    obj.f48776b = queryFinalized.intValue(1);
                                    arrayList4.add(obj);
                                    hVar.k(obj, obj.f48777c);
                                }
                            }
                        } else if (DialogObject.isUserDialog(longValue)) {
                            if (i18 != 2 && !arrayList.contains(Long.valueOf(longValue))) {
                                arrayList.add(Long.valueOf(longValue));
                                ?? obj2 = new Object();
                                obj2.f48777c = longValue;
                                obj2.f48776b = queryFinalized.intValue(1);
                                arrayList4.add(obj2);
                                hVar.k(obj2, obj2.f48777c);
                            }
                        } else {
                            long j10 = -longValue;
                            if (!arrayList2.contains(Long.valueOf(j10))) {
                                arrayList2.add(Long.valueOf(j10));
                                ?? obj22 = new Object();
                                obj22.f48777c = longValue;
                                obj22.f48776b = queryFinalized.intValue(1);
                                arrayList4.add(obj22);
                                hVar.k(obj22, obj22.f48777c);
                            }
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                    if (!arrayList3.isEmpty()) {
                        ArrayList<TLRPC.EncryptedChat> arrayList6 = new ArrayList<>();
                        MessagesStorage.getInstance(i17).getEncryptedChatsInternal(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i19 = 0; i19 < arrayList6.size(); i19++) {
                            uf.y yVar = (uf.y) hVar.f(DialogObject.makeEncryptedDialogId(arrayList6.get(i19).f20853id));
                            if (yVar != null) {
                                yVar.f48775a = arrayList6.get(i19);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                        MessagesStorage.getInstance(i17).getChatsInternal(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i20 = 0; i20 < arrayList7.size(); i20++) {
                            TLRPC.Chat chat = arrayList7.get(i20);
                            long j11 = -chat.f20845id;
                            if (chat.migrated_to != null) {
                                uf.y yVar2 = (uf.y) hVar.f(j11);
                                hVar.l(j11);
                                if (yVar2 != null) {
                                    arrayList4.remove(yVar2);
                                }
                            } else {
                                uf.y yVar3 = (uf.y) hVar.f(j11);
                                if (yVar3 != null) {
                                    yVar3.f48775a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        MessagesStorage.getInstance(i17).getUsersInternal(arrayList, arrayList5);
                        for (int i21 = 0; i21 < arrayList5.size(); i21++) {
                            TLRPC.User user = arrayList5.get(i21);
                            uf.y yVar4 = (uf.y) hVar.f(user.f20992id);
                            if (yVar4 != null) {
                                yVar4.f48775a = user;
                            }
                        }
                    }
                    Collections.sort(arrayList4, new du(19));
                    AndroidUtilities.runOnUIThread(new n71(xVar, arrayList4, hVar, 27));
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
        }
    }

    public v(c0 c0Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f9443a = 1;
        this.d = c0Var;
        this.f9444b = i10;
        this.f9445c = i11;
    }

    public v(Object obj, int i10, int i11, int i12) {
        this.f9443a = i12;
        this.d = obj;
        this.f9444b = i10;
        this.f9445c = i11;
    }
}
