package di;

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
import org.telegram.ui.Components.wc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.cf1;
import org.telegram.ui.fk0;
import org.telegram.ui.fx;
import org.telegram.ui.wb;
import org.telegram.ui.x40;
import org.telegram.ui.x50;
public final class c6 implements View.OnClickListener {
    public final int f8457a;
    public final int f8458b;
    public final Object f8459c;
    public final Object d;
    public final Object e;

    public c6(KeyEvent.Callback callback, Object obj, int i10, Object obj2, int i11) {
        this.f8457a = i11;
        this.f8459c = callback;
        this.d = obj;
        this.f8458b = i10;
        this.e = obj2;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f8457a;
        int i11 = this.f8458b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f8459c;
        switch (i10) {
            case 0:
                f6.m((f6) obj3, (TLRPC.User) obj2, i11, (org.telegram.ui.ActionBar.u6) obj);
                return;
            case 1:
                wb.X((wb) obj3, i11, (ArrayList) obj2, (Integer) obj);
                return;
            case 2:
                int[] iArr = (int[]) obj3;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) obj2;
                fk0 fk0Var = (fk0) obj;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                if (i11 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i11 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f22369a.N0.run();
                fk0Var.run();
                return;
            case 3:
                x50 x50Var = (x50) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) obj;
                if (i11 < arrayList.size()) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) x50Var.f45491a1.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    x50Var.x1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    x40 x40Var = x50Var.f45515f3;
                    if (x40Var != null) {
                        x40Var.dismiss();
                        return;
                    } else if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                        x50Var.d1(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                fi.d dVar = (fi.d) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.k3 k3Var = (org.telegram.ui.ActionBar.k3) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    int i12 = this.f8458b;
                    PasskeysController.create(context, i12, new bi.v0(dVar, context, k3Var, i12, 9));
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                String str = (String) obj;
                int i13 = ProfileActivity.R6;
                ((org.telegram.ui.ActionBar.o1) ((AtomicReference) obj2).get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (i11 == profileActivity.O3) {
                        wc.b0(profileActivity).i(LocaleController.getString(R.string.BusinessHoursCopied)).j();
                    } else {
                        wc.b0(profileActivity).i(LocaleController.getString(R.string.BusinessLocationCopied)).j();
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 6:
                cf1 cf1Var = (cf1) obj3;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj;
                MessagesController messagesController = cf1Var.getMessagesController();
                long j10 = -cf1Var.f38288a;
                if (messagesController.isDialogMuted(j10, tL_forumTopic.f22080id)) {
                    cf1Var.getNotificationsController().muteDialog(j10, tL_forumTopic.f22080id, false);
                    cf1Var.finishPreviewFragment();
                    if (wc.a(cf1Var)) {
                        wc.z(cf1Var, 4, 0, cf1Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(i11);
                return;
            default:
                fi.d dVar2 = (fi.d) obj3;
                org.telegram.ui.ActionBar.k3 k3Var2 = (org.telegram.ui.ActionBar.k3) obj2;
                org.telegram.ui.ActionBar.u6 u6Var = (org.telegram.ui.ActionBar.u6) obj;
                if (!dVar2.Q) {
                    dVar2.setLoading(true);
                    org.telegram.ui.Wallet.t3 t3Var = new org.telegram.ui.Wallet.t3(dVar2, k3Var2, u6Var, 0);
                    org.telegram.ui.Wallet.l0 x9 = org.telegram.ui.Wallet.l0.x(i11);
                    x9.m0(new fx(i11, t3Var, x9));
                    return;
                }
                return;
        }
    }

    public c6(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f8457a = i11;
        this.f8459c = obj;
        this.f8458b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public c6(org.telegram.ui.ActionBar.r2 r2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.f8457a = i11;
        this.f8459c = r2Var;
        this.d = obj;
        this.e = serializable;
        this.f8458b = i10;
    }
}
