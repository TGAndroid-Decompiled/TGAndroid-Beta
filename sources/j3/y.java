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
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.eo;
import org.telegram.ui.Components.io;
import org.telegram.ui.Components.lb0;
import org.telegram.ui.Components.wp0;
import org.telegram.ui.Components.yw0;
import org.telegram.ui.tn;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;
public final class y implements Runnable {
    public final int f10851a;
    public final int f10852b;
    public final int f10853c;
    public final Object d;

    public y(int i10, int i11, Object obj, int i12) {
        this.f10851a = i12;
        this.f10852b = i10;
        this.f10853c = i11;
        this.d = obj;
    }

    @Override
    public final void run() {
        switch (this.f10851a) {
            case 0:
                ((k0) this.d).f10587l.e(24, new z(this.f10852b, this.f10853c, 1));
                return;
            case 1:
                ((h0) this.d).f10477a.a0(this.f10852b, this.f10853c);
                return;
            case 2:
                VoIPGroupNotification.d((Context) this.d, this.f10852b, this.f10853c);
                return;
            case 3:
                ((VoIPService) this.d).lambda$initiateActualEncryptedCall$86(this.f10852b, this.f10853c);
                return;
            case 4:
                ((ConnectionsManager) this.d).lambda$discardConnection$0(this.f10852b, this.f10853c);
                return;
            case 5:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.d;
                for (int i10 = 0; i10 < this.f10852b - this.f10853c; i10++) {
                    w0Var.goBack();
                }
                return;
            case 6:
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(this.f10852b).getClientUserId());
                bundle.putInt("message_id", this.f10853c);
                ((org.telegram.ui.ActionBar.o2) this.d).presentFragment(new tn(bundle));
                return;
            case 7:
                io ioVar = (io) this.d;
                int i11 = this.f10852b;
                if (i11 != 0) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f10853c);
                    notificationsSettings.edit().putInt("last_selected_mute_until_time", i11).putInt("last_selected_mute_until_time2", notificationsSettings.getInt("last_selected_mute_until_time", 0)).apply();
                }
                ioVar.w(i11);
                return;
            case 8:
                eo eoVar = (eo) this.d;
                int i12 = this.f10852b;
                if (i12 != 0) {
                    SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(this.f10853c);
                    notificationsSettings2.edit().putInt("last_selected_mute_until_time", i12).putInt("last_selected_mute_until_time2", notificationsSettings2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                eoVar.run(Integer.valueOf(i12));
                return;
            case 9:
                lb0 lb0Var = ((eb0) this.d).T2;
                View d = lb0Var.d();
                eb0 eb0Var = lb0Var.f30277f;
                if (d != null) {
                    int top = d.getTop() + this.f10852b;
                    int top2 = d.getTop() + this.f10853c;
                    int i13 = top2 - top;
                    int paddingTop = eb0Var.getPaddingTop();
                    int height = eb0Var.getHeight() - eb0Var.getPaddingBottom();
                    if (i13 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i14 = top - paddingTop;
                    if (i14 < 0) {
                        eb0Var.scrollBy(0, i14);
                        return;
                    }
                    return;
                }
                return;
            case 10:
                org.telegram.ui.Components.voip.h1 h1Var = ((org.telegram.ui.Components.voip.g1) this.d).f33705a;
                af.g gVar = h1Var.K;
                if (gVar != null) {
                    gVar.d(this.f10852b, this.f10853c);
                }
                h1Var.i(false);
                return;
            case 11:
                ((SurfaceTextureHelper) this.d).lambda$setTextureSize$2(this.f10852b, this.f10853c);
                return;
            case 12:
                SurfaceViewRenderer.a((SurfaceViewRenderer) this.d, this.f10852b, this.f10853c);
                return;
            case 13:
                ((TextureViewRenderer) this.d).lambda$updateVideoSizes$1(this.f10852b, this.f10853c);
                return;
            default:
                int i15 = this.f10852b;
                rf.y yVar = (rf.y) this.d;
                try {
                    SQLiteCursor queryFinalized = MessagesStorage.getInstance(i15).getDatabase().queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList<Long> arrayList = new ArrayList<>();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    a0.h hVar = new a0.h();
                    while (queryFinalized.next()) {
                        long longValue = queryFinalized.longValue(0);
                        boolean isEncryptedDialog = DialogObject.isEncryptedDialog(longValue);
                        int i16 = this.f10853c;
                        if (isEncryptedDialog) {
                            if (i16 == 0 || i16 == 3) {
                                int encryptedChatId = DialogObject.getEncryptedChatId(longValue);
                                if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                                    arrayList3.add(Integer.valueOf(encryptedChatId));
                                    ?? obj = new Object();
                                    obj.f47410c = longValue;
                                    obj.f47409b = queryFinalized.intValue(1);
                                    arrayList4.add(obj);
                                    hVar.k(obj, obj.f47410c);
                                }
                            }
                        } else if (DialogObject.isUserDialog(longValue)) {
                            if (i16 != 2 && !arrayList.contains(Long.valueOf(longValue))) {
                                arrayList.add(Long.valueOf(longValue));
                                ?? obj2 = new Object();
                                obj2.f47410c = longValue;
                                obj2.f47409b = queryFinalized.intValue(1);
                                arrayList4.add(obj2);
                                hVar.k(obj2, obj2.f47410c);
                            }
                        } else {
                            long j10 = -longValue;
                            if (!arrayList2.contains(Long.valueOf(j10))) {
                                arrayList2.add(Long.valueOf(j10));
                                ?? obj22 = new Object();
                                obj22.f47410c = longValue;
                                obj22.f47409b = queryFinalized.intValue(1);
                                arrayList4.add(obj22);
                                hVar.k(obj22, obj22.f47410c);
                            }
                        }
                    }
                    queryFinalized.dispose();
                    ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                    if (!arrayList3.isEmpty()) {
                        ArrayList<TLRPC.EncryptedChat> arrayList6 = new ArrayList<>();
                        MessagesStorage.getInstance(i15).getEncryptedChatsInternal(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                            rf.z zVar = (rf.z) hVar.f(DialogObject.makeEncryptedDialogId(arrayList6.get(i17).f22400id));
                            if (zVar != null) {
                                zVar.f47408a = arrayList6.get(i17);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                        MessagesStorage.getInstance(i15).getChatsInternal(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i18 = 0; i18 < arrayList7.size(); i18++) {
                            TLRPC.Chat chat = arrayList7.get(i18);
                            long j11 = -chat.f22392id;
                            if (chat.migrated_to != null) {
                                rf.z zVar2 = (rf.z) hVar.f(j11);
                                hVar.l(j11);
                                if (zVar2 != null) {
                                    arrayList4.remove(zVar2);
                                }
                            } else {
                                rf.z zVar3 = (rf.z) hVar.f(j11);
                                if (zVar3 != null) {
                                    zVar3.f47408a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        MessagesStorage.getInstance(i15).getUsersInternal(arrayList, arrayList5);
                        for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                            TLRPC.User user = arrayList5.get(i19);
                            rf.z zVar4 = (rf.z) hVar.f(user.f22539id);
                            if (zVar4 != null) {
                                zVar4.f47408a = user;
                            }
                        }
                    }
                    Collections.sort(arrayList4, new wp0(19));
                    AndroidUtilities.runOnUIThread(new yw0(yVar, arrayList4, hVar, 25));
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
        }
    }

    public y(h0 h0Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f10851a = 1;
        this.d = h0Var;
        this.f10852b = i10;
        this.f10853c = i11;
    }

    public y(Object obj, int i10, int i11, int i12) {
        this.f10851a = i12;
        this.d = obj;
        this.f10852b = i10;
        this.f10853c = i11;
    }
}
