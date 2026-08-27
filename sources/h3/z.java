package h3;

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
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.bo;
import org.telegram.ui.Components.gs0;
import org.telegram.ui.Components.lp0;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.xn;
import org.telegram.ui.rn;
import org.webrtc.SurfaceTextureHelper;
import org.webrtc.SurfaceViewRenderer;
import org.webrtc.TextureViewRenderer;

public final class z implements Runnable {

    public final int f8257a;

    public final int f8258b;

    public final int f8259c;
    public final Object d;

    public z(int i10, int i11, Object obj, int i12) {
        this.f8257a = i12;
        this.f8258b = i10;
        this.f8259c = i11;
        this.d = obj;
    }

    @Override
    public final void run() {
        switch (this.f8257a) {
            case 0:
                ((k0) this.d).f7980l.e(24, new a0(this.f8258b, this.f8259c, 1));
                break;
            case 1:
                ((h0) this.d).f7870a.a0(this.f8258b, this.f8259c);
                break;
            case 2:
                VoIPGroupNotification.decline((Context) this.d, this.f8258b, this.f8259c);
                break;
            case 3:
                ((VoIPService) this.d).lambda$initiateActualEncryptedCall$86(this.f8258b, this.f8259c);
                break;
            case 4:
                ((ConnectionsManager) this.d).lambda$discardConnection$0(this.f8258b, this.f8259c);
                break;
            case 5:
                org.telegram.ui.web.w0 w0Var = (org.telegram.ui.web.w0) this.d;
                for (int i10 = 0; i10 < this.f8258b - this.f8259c; i10++) {
                    w0Var.goBack();
                }
                break;
            case 6:
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", UserConfig.getInstance(this.f8258b).getClientUserId());
                bundle.putInt("message_id", this.f8259c);
                n2Var.presentFragment(new rn(bundle));
                break;
            case 7:
                bo boVar = (bo) this.d;
                int i11 = this.f8258b;
                if (i11 != 0) {
                    SharedPreferences notificationsSettings = MessagesController.getNotificationsSettings(this.f8259c);
                    notificationsSettings.edit().putInt("last_selected_mute_until_time", i11).putInt("last_selected_mute_until_time2", notificationsSettings.getInt("last_selected_mute_until_time", 0)).apply();
                }
                boVar.v(i11);
                break;
            case 8:
                xn xnVar = (xn) this.d;
                int i12 = this.f8258b;
                if (i12 != 0) {
                    SharedPreferences notificationsSettings2 = MessagesController.getNotificationsSettings(this.f8259c);
                    notificationsSettings2.edit().putInt("last_selected_mute_until_time", i12).putInt("last_selected_mute_until_time2", notificationsSettings2.getInt("last_selected_mute_until_time", 0)).apply();
                }
                xnVar.run(Integer.valueOf(i12));
                break;
            case 9:
                ab0 ab0Var = ((ta0) this.d).T2;
                View viewD = ab0Var.d();
                ta0 ta0Var = ab0Var.f26716f;
                if (viewD != null) {
                    int top = viewD.getTop() + this.f8258b;
                    int top2 = viewD.getTop() + this.f8259c;
                    int i13 = top2 - top;
                    int paddingTop = ta0Var.getPaddingTop();
                    int height = ta0Var.getHeight() - ta0Var.getPaddingBottom();
                    if (i13 <= height - paddingTop) {
                        top = (top + top2) / 2;
                        paddingTop = (paddingTop + height) / 2;
                    }
                    int i14 = top - paddingTop;
                    if (i14 < 0) {
                        ta0Var.scrollBy(0, i14);
                    }
                    break;
                }
                break;
            case 10:
                org.telegram.ui.Components.voip.g1 g1Var = ((org.telegram.ui.Components.voip.f1) this.d).f33555a;
                ye.d dVar = g1Var.K;
                if (dVar != null) {
                    dVar.d(this.f8258b, this.f8259c);
                }
                g1Var.i(false);
                break;
            case 11:
                ((SurfaceTextureHelper) this.d).lambda$setTextureSize$2(this.f8258b, this.f8259c);
                break;
            case 12:
                ((SurfaceViewRenderer) this.d).lambda$onFrameResolutionChanged$0(this.f8258b, this.f8259c);
                break;
            case 13:
                ((TextureViewRenderer) this.d).lambda$updateVideoSizes$1(this.f8258b, this.f8259c);
                break;
            default:
                int i15 = this.f8258b;
                pf.x xVar = (pf.x) this.d;
                try {
                    SQLiteCursor sQLiteCursorQueryFinalized = MessagesStorage.getInstance(i15).getDatabase().queryFinalized("SELECT did, date FROM search_recent WHERE 1", new Object[0]);
                    ArrayList<Long> arrayList = new ArrayList<>();
                    ArrayList arrayList2 = new ArrayList();
                    ArrayList arrayList3 = new ArrayList();
                    new ArrayList();
                    ArrayList arrayList4 = new ArrayList();
                    a0.h hVar = new a0.h();
                    while (sQLiteCursorQueryFinalized.next()) {
                        long jLongValue = sQLiteCursorQueryFinalized.longValue(0);
                        boolean zIsEncryptedDialog = DialogObject.isEncryptedDialog(jLongValue);
                        int i16 = this.f8259c;
                        if (zIsEncryptedDialog) {
                            if (i16 == 0 || i16 == 3) {
                                int encryptedChatId = DialogObject.getEncryptedChatId(jLongValue);
                                if (!arrayList3.contains(Integer.valueOf(encryptedChatId))) {
                                    arrayList3.add(Integer.valueOf(encryptedChatId));
                                    pf.y yVar = new pf.y();
                                    yVar.f45969c = jLongValue;
                                    yVar.f45968b = sQLiteCursorQueryFinalized.intValue(1);
                                    arrayList4.add(yVar);
                                    hVar.k(yVar, yVar.f45969c);
                                }
                            }
                        } else if (!DialogObject.isUserDialog(jLongValue)) {
                            long j10 = -jLongValue;
                            if (!arrayList2.contains(Long.valueOf(j10))) {
                                arrayList2.add(Long.valueOf(j10));
                                pf.y yVar2 = new pf.y();
                                yVar2.f45969c = jLongValue;
                                yVar2.f45968b = sQLiteCursorQueryFinalized.intValue(1);
                                arrayList4.add(yVar2);
                                hVar.k(yVar2, yVar2.f45969c);
                            }
                        } else if (i16 != 2 && !arrayList.contains(Long.valueOf(jLongValue))) {
                            arrayList.add(Long.valueOf(jLongValue));
                            pf.y yVar3 = new pf.y();
                            yVar3.f45969c = jLongValue;
                            yVar3.f45968b = sQLiteCursorQueryFinalized.intValue(1);
                            arrayList4.add(yVar3);
                            hVar.k(yVar3, yVar3.f45969c);
                        }
                    }
                    sQLiteCursorQueryFinalized.dispose();
                    ArrayList<TLRPC.User> arrayList5 = new ArrayList<>();
                    if (!arrayList3.isEmpty()) {
                        ArrayList<TLRPC.EncryptedChat> arrayList6 = new ArrayList<>();
                        MessagesStorage.getInstance(i15).getEncryptedChatsInternal(TextUtils.join(",", arrayList3), arrayList6, arrayList);
                        for (int i17 = 0; i17 < arrayList6.size(); i17++) {
                            pf.y yVar4 = (pf.y) hVar.f(DialogObject.makeEncryptedDialogId(arrayList6.get(i17).f22388id));
                            if (yVar4 != null) {
                                yVar4.f45967a = arrayList6.get(i17);
                            }
                        }
                    }
                    if (!arrayList2.isEmpty()) {
                        ArrayList<TLRPC.Chat> arrayList7 = new ArrayList<>();
                        MessagesStorage.getInstance(i15).getChatsInternal(TextUtils.join(",", arrayList2), arrayList7);
                        for (int i18 = 0; i18 < arrayList7.size(); i18++) {
                            TLRPC.Chat chat = arrayList7.get(i18);
                            long j11 = -chat.f22380id;
                            if (chat.migrated_to != null) {
                                pf.y yVar5 = (pf.y) hVar.f(j11);
                                hVar.l(j11);
                                if (yVar5 != null) {
                                    arrayList4.remove(yVar5);
                                }
                            } else {
                                pf.y yVar6 = (pf.y) hVar.f(j11);
                                if (yVar6 != null) {
                                    yVar6.f45967a = chat;
                                }
                            }
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        MessagesStorage.getInstance(i15).getUsersInternal(arrayList, arrayList5);
                        for (int i19 = 0; i19 < arrayList5.size(); i19++) {
                            TLRPC.User user = arrayList5.get(i19);
                            pf.y yVar7 = (pf.y) hVar.f(user.f22527id);
                            if (yVar7 != null) {
                                yVar7.f45967a = user;
                            }
                        }
                    }
                    Collections.sort(arrayList4, new lp0(19));
                    AndroidUtilities.runOnUIThread(new gs0(xVar, arrayList4, hVar, 25));
                } catch (Exception e9) {
                    FileLog.e(e9);
                }
                break;
        }
    }

    public z(h0 h0Var, SurfaceTexture surfaceTexture, int i10, int i11) {
        this.f8257a = 1;
        this.d = h0Var;
        this.f8258b = i10;
        this.f8259c = i11;
    }

    public z(Object obj, int i10, int i11, int i12) {
        this.f8257a = i12;
        this.d = obj;
        this.f8258b = i10;
        this.f8259c = i11;
    }
}
