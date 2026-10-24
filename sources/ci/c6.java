package ci;

import android.content.Context;
import android.content.SharedPreferences;
import android.view.KeyEvent;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.PasskeysController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.vc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.t40;
import org.telegram.ui.u50;
import org.telegram.ui.vb;
import org.telegram.ui.wj0;
import org.telegram.ui.xe1;
public final class c6 implements View.OnClickListener {
    public final int f5222a;
    public final int f5223b;
    public final Object f5224c;
    public final Object d;
    public final Object e;

    public c6(KeyEvent.Callback callback, Object obj, int i10, Object obj2, int i11) {
        this.f5222a = i11;
        this.f5224c = callback;
        this.d = obj;
        this.f5223b = i10;
        this.e = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5222a) {
            case 0:
                f6.m((f6) this.f5224c, (TLRPC.User) this.d, this.f5223b, (org.telegram.ui.ActionBar.g6) this.e);
                return;
            case 1:
                vb.W((vb) this.f5224c, this.f5223b, (ArrayList) this.d, (Integer) this.e);
                return;
            case 2:
                int[] iArr = (int[]) this.f5224c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                wj0 wj0Var = (wj0) this.e;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                int i10 = this.f5223b;
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f20679a.N0.run();
                wj0Var.run();
                return;
            case 3:
                u50 u50Var = (u50) this.f5224c;
                ArrayList arrayList = (ArrayList) this.d;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.e;
                int size = arrayList.size();
                int i11 = this.f5223b;
                if (i11 < size) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) u50Var.f42217a1.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    u50Var.x1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    t40 t40Var = u50Var.f42241f3;
                    if (t40Var != null) {
                        t40Var.dismiss();
                        return;
                    } else if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                        u50Var.d1(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                ei.d dVar = (ei.d) this.f5224c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.e;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    int i12 = this.f5223b;
                    PasskeysController.create(context, i12, new ai.u0(dVar, context, h3Var, i12, 8));
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f5224c;
                String str = (String) this.e;
                ((org.telegram.ui.ActionBar.m1) ((AtomicReference) this.d).get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (this.f5223b == profileActivity.P3) {
                        vc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessHoursCopied)).j();
                    } else {
                        vc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessLocationCopied)).j();
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 6:
                xe1 xe1Var = (xe1) this.f5224c;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.e;
                MessagesController messagesController = xe1Var.getMessagesController();
                long j10 = -xe1Var.f43545a;
                if (messagesController.isDialogMuted(j10, tL_forumTopic.f20396id)) {
                    xe1Var.getNotificationsController().muteDialog(j10, tL_forumTopic.f20396id, false);
                    xe1Var.finishPreviewFragment();
                    if (vc.a(xe1Var)) {
                        vc.z(xe1Var, 4, 0, xe1Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(this.f5223b);
                return;
            default:
                ei.d dVar2 = (ei.d) this.f5224c;
                org.telegram.ui.ActionBar.h3 h3Var2 = (org.telegram.ui.ActionBar.h3) this.d;
                org.telegram.ui.ActionBar.g6 g6Var = (org.telegram.ui.ActionBar.g6) this.e;
                if (!dVar2.Q) {
                    dVar2.setLoading(true);
                    org.telegram.ui.Wallet.t3 t3Var = new org.telegram.ui.Wallet.t3(dVar2, h3Var2, g6Var, 0);
                    int i13 = this.f5223b;
                    org.telegram.ui.Wallet.l0 w9 = org.telegram.ui.Wallet.l0.w(i13);
                    w9.j0(new b41(i13, t3Var, w9));
                    return;
                }
                return;
        }
    }

    public c6(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f5222a = i11;
        this.f5224c = obj;
        this.f5223b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public c6(org.telegram.ui.ActionBar.o2 o2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.f5222a = i11;
        this.f5224c = o2Var;
        this.d = obj;
        this.e = serializable;
        this.f5223b = i10;
    }
}
