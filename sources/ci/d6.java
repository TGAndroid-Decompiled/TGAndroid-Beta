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
import org.telegram.ui.Components.xc;
import org.telegram.ui.Components.y31;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.q40;
import org.telegram.ui.q50;
import org.telegram.ui.re1;
import org.telegram.ui.sj0;
import org.telegram.ui.vb;
public final class d6 implements View.OnClickListener {
    public final int f5320a;
    public final int f5321b;
    public final Object f5322c;
    public final Object d;
    public final Object e;

    public d6(int i10, int i11, KeyEvent.Callback callback, Object obj, Object obj2) {
        this.f5320a = i11;
        this.f5322c = callback;
        this.d = obj;
        this.f5321b = i10;
        this.e = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f5320a) {
            case 0:
                g6.n((g6) this.f5322c, (TLRPC.User) this.d, this.f5321b, (org.telegram.ui.ActionBar.d6) this.e);
                return;
            case 1:
                vb.W((vb) this.f5322c, this.f5321b, (ArrayList) this.d, (Integer) this.e);
                return;
            case 2:
                int[] iArr = (int[]) this.f5322c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                sj0 sj0Var = (sj0) this.e;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                int i10 = this.f5321b;
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f20608a.L0.run();
                sj0Var.run();
                return;
            case 3:
                q50 q50Var = (q50) this.f5322c;
                ArrayList arrayList = (ArrayList) this.d;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.e;
                int size = arrayList.size();
                int i11 = this.f5321b;
                if (i11 < size) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) q50Var.f40379a1.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    q50Var.y1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    q40 q40Var = q50Var.f40403f3;
                    if (q40Var != null) {
                        q40Var.dismiss();
                        return;
                    } else if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                        q50Var.e1(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                ei.d dVar = (ei.d) this.f5322c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.e;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    int i12 = this.f5321b;
                    PasskeysController.create(context, i12, new ai.u0(dVar, context, f3Var, i12, 8));
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f5322c;
                String str = (String) this.e;
                ((org.telegram.ui.ActionBar.m1) ((AtomicReference) this.d).get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (this.f5321b == profileActivity.P3) {
                        xc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessHoursCopied)).j();
                    } else {
                        xc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessLocationCopied)).j();
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 6:
                re1 re1Var = (re1) this.f5322c;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.e;
                MessagesController messagesController = re1Var.getMessagesController();
                long j10 = -re1Var.f41151a;
                if (messagesController.isDialogMuted(j10, tL_forumTopic.f20331id)) {
                    re1Var.getNotificationsController().muteDialog(j10, tL_forumTopic.f20331id, false);
                    re1Var.finishPreviewFragment();
                    if (xc.a(re1Var)) {
                        xc.z(re1Var, 4, 0, re1Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(this.f5321b);
                return;
            default:
                ei.d dVar2 = (ei.d) this.f5322c;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.d;
                org.telegram.ui.ActionBar.d6 d6Var = (org.telegram.ui.ActionBar.d6) this.e;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    org.telegram.ui.Wallet.u3 u3Var = new org.telegram.ui.Wallet.u3(dVar2, f3Var2, d6Var, 0);
                    int i13 = this.f5321b;
                    org.telegram.ui.Wallet.m0 w9 = org.telegram.ui.Wallet.m0.w(i13);
                    w9.j0(new y31(i13, u3Var, w9));
                    return;
                }
                return;
        }
    }

    public d6(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f5320a = i11;
        this.f5322c = obj;
        this.f5321b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public d6(org.telegram.ui.ActionBar.n2 n2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.f5320a = i11;
        this.f5322c = n2Var;
        this.d = obj;
        this.e = serializable;
        this.f5321b = i10;
    }
}
