package oh;

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
import org.telegram.ui.Components.qc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ak0;
import org.telegram.ui.d60;
import org.telegram.ui.e50;
import org.telegram.ui.mf1;
import org.telegram.ui.sb;
public final class o5 implements View.OnClickListener {
    public final int f17551a;
    public final int f17552b;
    public final Object f17553c;
    public final Object d;
    public final Object f17554e;

    public o5(KeyEvent.Callback callback, Object obj, int i10, Object obj2, int i11) {
        this.f17551a = i11;
        this.f17553c = callback;
        this.d = obj;
        this.f17552b = i10;
        this.f17554e = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f17551a) {
            case 0:
                r5.m((r5) this.f17553c, (TLRPC.User) this.d, this.f17552b, (org.telegram.ui.ActionBar.g6) this.f17554e);
                return;
            case 1:
                sb.W((sb) this.f17553c, this.f17552b, (ArrayList) this.d, (Integer) this.f17554e);
                return;
            case 2:
                int[] iArr = (int[]) this.f17553c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                ak0 ak0Var = (ak0) this.f17554e;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                int i10 = this.f17552b;
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f21166a.I0.run();
                ak0Var.run();
                return;
            case 3:
                d60 d60Var = (d60) this.f17553c;
                ArrayList arrayList = (ArrayList) this.d;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f17554e;
                int size = arrayList.size();
                int i11 = this.f17552b;
                if (i11 < size) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) d60Var.X0.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    d60Var.x1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    e50 e50Var = d60Var.c3;
                    if (e50Var != null) {
                        e50Var.dismiss();
                        return;
                    } else if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                        d60Var.d1(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                qh.d dVar = (qh.d) this.f17553c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.h3 h3Var = (org.telegram.ui.ActionBar.h3) this.f17554e;
                if (!dVar.K) {
                    dVar.setLoading(true);
                    int i12 = this.f17552b;
                    PasskeysController.create(context, i12, new mh.h0(dVar, context, h3Var, i12, 5));
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f17553c;
                String str = (String) this.f17554e;
                ((org.telegram.ui.ActionBar.p1) ((AtomicReference) this.d).get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (this.f17552b == profileActivity.L3) {
                        qc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessHoursCopied)).j();
                    } else {
                        qc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessLocationCopied)).j();
                    }
                    return;
                } catch (Exception e6) {
                    FileLog.e(e6);
                    return;
                }
            default:
                mf1 mf1Var = (mf1) this.f17553c;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.f17554e;
                MessagesController messagesController = mf1Var.getMessagesController();
                long j10 = -mf1Var.f39102a;
                if (messagesController.isDialogMuted(j10, tL_forumTopic.f20895id)) {
                    mf1Var.getNotificationsController().muteDialog(j10, tL_forumTopic.f20895id, false);
                    mf1Var.finishPreviewFragment();
                    if (qc.a(mf1Var)) {
                        qc.z(mf1Var, 4, 0, mf1Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(this.f17552b);
                return;
        }
    }

    public o5(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f17551a = i11;
        this.f17553c = obj;
        this.f17552b = i10;
        this.d = obj2;
        this.f17554e = obj3;
    }

    public o5(org.telegram.ui.ActionBar.p2 p2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.f17551a = i11;
        this.f17553c = p2Var;
        this.d = obj;
        this.f17554e = serializable;
        this.f17552b = i10;
    }
}
