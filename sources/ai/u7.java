package ai;

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
import org.telegram.ui.Components.zc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ci0;
import org.telegram.ui.hg1;
import org.telegram.ui.i50;
import org.telegram.ui.i60;
import org.telegram.ui.kk0;
public final class u7 implements View.OnClickListener {
    public final int f1800a;
    public final int f1801b;
    public final Object f1802c;
    public final Object d;
    public final Object f1803e;

    public u7(KeyEvent.Callback callback, Object obj, int i10, Object obj2, int i11) {
        this.f1800a = i11;
        this.f1802c = callback;
        this.d = obj;
        this.f1801b = i10;
        this.f1803e = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1800a) {
            case 0:
                y7.o((y7) this.f1802c, (TLRPC.User) this.d, this.f1801b, (org.telegram.ui.ActionBar.c6) this.f1803e);
                return;
            case 1:
                org.telegram.ui.yb.W((org.telegram.ui.yb) this.f1802c, this.f1801b, (ArrayList) this.d, (Integer) this.f1803e);
                return;
            case 2:
                int[] iArr = (int[]) this.f1802c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                kk0 kk0Var = (kk0) this.f1803e;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                int i10 = this.f1801b;
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f20141a.L0.run();
                kk0Var.run();
                return;
            case 3:
                i60 i60Var = (i60) this.f1802c;
                ArrayList arrayList = (ArrayList) this.d;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f1803e;
                int size = arrayList.size();
                int i11 = this.f1801b;
                if (i11 < size) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) i60Var.f38678a1.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    i60Var.y1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    i50 i50Var = i60Var.f38703f3;
                    if (i50Var != null) {
                        i50Var.dismiss();
                        return;
                    } else if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                        i60Var.e1(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                ci.d dVar = (ci.d) this.f1802c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f1803e;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    int i12 = this.f1801b;
                    PasskeysController.create(context, i12, new ei.h1(dVar, context, e3Var, i12, 6));
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f1802c;
                String str = (String) this.f1803e;
                ((org.telegram.ui.ActionBar.m1) ((AtomicReference) this.d).get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (this.f1801b == profileActivity.O3) {
                        zc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessHoursCopied)).j();
                    } else {
                        zc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessLocationCopied)).j();
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 6:
                hg1 hg1Var = (hg1) this.f1802c;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.f1803e;
                MessagesController messagesController = hg1Var.getMessagesController();
                long j3 = -hg1Var.f38376a;
                if (messagesController.isDialogMuted(j3, tL_forumTopic.f19854id)) {
                    hg1Var.getNotificationsController().muteDialog(j3, tL_forumTopic.f19854id, false);
                    hg1Var.finishPreviewFragment();
                    if (zc.a(hg1Var)) {
                        zc.z(hg1Var, 4, 0, hg1Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(this.f1801b);
                return;
            default:
                ci.d dVar2 = (ci.d) this.f1802c;
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.f1803e;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    org.telegram.ui.Wallet.q3 q3Var = new org.telegram.ui.Wallet.q3(dVar2, e3Var2, c6Var, 0);
                    int i13 = this.f1801b;
                    org.telegram.ui.Wallet.l0 v = org.telegram.ui.Wallet.l0.v(i13);
                    v.h0(new ci0(i13, q3Var, v));
                    return;
                }
                return;
        }
    }

    public u7(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f1800a = i11;
        this.f1802c = obj;
        this.f1801b = i10;
        this.d = obj2;
        this.f1803e = obj3;
    }

    public u7(org.telegram.ui.ActionBar.m2 m2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.f1800a = i11;
        this.f1802c = m2Var;
        this.d = obj;
        this.f1803e = serializable;
        this.f1801b = i10;
    }
}
