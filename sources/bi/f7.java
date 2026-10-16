package bi;

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
import org.telegram.ui.c90;
import org.telegram.ui.kg1;
import org.telegram.ui.n50;
import org.telegram.ui.n60;
import org.telegram.ui.nk0;
public final class f7 implements View.OnClickListener {
    public final int f3026a;
    public final int f3027b;
    public final Object f3028c;
    public final Object d;
    public final Object e;

    public f7(KeyEvent.Callback callback, Object obj, int i10, Object obj2, int i11) {
        this.f3026a = i11;
        this.f3028c = callback;
        this.d = obj;
        this.f3027b = i10;
        this.e = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3026a) {
            case 0:
                j7.n((j7) this.f3028c, (TLRPC.User) this.d, this.f3027b, (org.telegram.ui.ActionBar.c6) this.e);
                return;
            case 1:
                org.telegram.ui.ac.W((org.telegram.ui.ac) this.f3028c, this.f3027b, (ArrayList) this.d, (Integer) this.e);
                return;
            case 2:
                int[] iArr = (int[]) this.f3028c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                nk0 nk0Var = (nk0) this.e;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                int i10 = this.f3027b;
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f19248a.L0.run();
                nk0Var.run();
                return;
            case 3:
                n60 n60Var = (n60) this.f3028c;
                ArrayList arrayList = (ArrayList) this.d;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.e;
                int size = arrayList.size();
                int i11 = this.f3027b;
                if (i11 < size) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) n60Var.f38157a1.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    n60Var.y1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    n50 n50Var = n60Var.f38181f3;
                    if (n50Var != null) {
                        n50Var.dismiss();
                        return;
                    } else if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                        n60Var.e1(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                di.d dVar = (di.d) this.f3028c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.e;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    int i12 = this.f3027b;
                    PasskeysController.create(context, i12, new fi.g1(dVar, context, e3Var, i12, 6));
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f3028c;
                String str = (String) this.e;
                ((org.telegram.ui.ActionBar.m1) ((AtomicReference) this.d).get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (this.f3027b == profileActivity.O3) {
                        zc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessHoursCopied)).j();
                    } else {
                        zc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessLocationCopied)).j();
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            case 6:
                kg1 kg1Var = (kg1) this.f3028c;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.e;
                MessagesController messagesController = kg1Var.getMessagesController();
                long j10 = -kg1Var.f37380a;
                if (messagesController.isDialogMuted(j10, tL_forumTopic.f18968id)) {
                    kg1Var.getNotificationsController().muteDialog(j10, tL_forumTopic.f18968id, false);
                    kg1Var.finishPreviewFragment();
                    if (zc.a(kg1Var)) {
                        zc.z(kg1Var, 4, 0, kg1Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(this.f3027b);
                return;
            default:
                di.d dVar2 = (di.d) this.f3028c;
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.e;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    org.telegram.ui.Wallet.p3 p3Var = new org.telegram.ui.Wallet.p3(dVar2, e3Var2, c6Var, 0);
                    int i13 = this.f3027b;
                    org.telegram.ui.Wallet.k0 v = org.telegram.ui.Wallet.k0.v(i13);
                    v.h0(new c90(i13, p3Var, v));
                    return;
                }
                return;
        }
    }

    public f7(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f3026a = i11;
        this.f3028c = obj;
        this.f3027b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public f7(org.telegram.ui.ActionBar.m2 m2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.f3026a = i11;
        this.f3028c = m2Var;
        this.d = obj;
        this.e = serializable;
        this.f3027b = i10;
    }
}
