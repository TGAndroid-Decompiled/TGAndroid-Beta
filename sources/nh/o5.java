package nh;

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
import org.telegram.ui.c60;
import org.telegram.ui.d50;
import org.telegram.ui.kf1;
import org.telegram.ui.sb;
import org.telegram.ui.yj0;
public final class o5 implements View.OnClickListener {
    public final int f15707a;
    public final int f15708b;
    public final Object f15709c;
    public final Object d;
    public final Object e;

    public o5(KeyEvent.Callback callback, Object obj, int i10, Object obj2, int i11) {
        this.f15707a = i11;
        this.f15709c = callback;
        this.d = obj;
        this.f15708b = i10;
        this.e = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f15707a) {
            case 0:
                r5.m((r5) this.f15709c, (TLRPC.User) this.d, this.f15708b, (org.telegram.ui.ActionBar.f6) this.e);
                return;
            case 1:
                sb.W((sb) this.f15709c, this.f15708b, (ArrayList) this.d, (Integer) this.e);
                return;
            case 2:
                int[] iArr = (int[]) this.f15709c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                yj0 yj0Var = (yj0) this.e;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                int i10 = this.f15708b;
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f19503a.I0.run();
                yj0Var.run();
                return;
            case 3:
                c60 c60Var = (c60) this.f15709c;
                ArrayList arrayList = (ArrayList) this.d;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.e;
                int size = arrayList.size();
                int i11 = this.f15708b;
                if (i11 < size) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) c60Var.X0.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    c60Var.x1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    d50 d50Var = c60Var.c3;
                    if (d50Var != null) {
                        d50Var.dismiss();
                        return;
                    } else if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                        c60Var.d1(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                ph.d dVar = (ph.d) this.f15709c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.g3 g3Var = (org.telegram.ui.ActionBar.g3) this.e;
                if (!dVar.K) {
                    dVar.setLoading(true);
                    int i12 = this.f15708b;
                    PasskeysController.create(context, i12, new lh.i0(dVar, context, g3Var, i12, 5));
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f15709c;
                String str = (String) this.e;
                ((org.telegram.ui.ActionBar.p1) ((AtomicReference) this.d).get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (this.f15708b == profileActivity.L3) {
                        qc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessHoursCopied)).j();
                    } else {
                        qc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessLocationCopied)).j();
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                kf1 kf1Var = (kf1) this.f15709c;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.e;
                MessagesController messagesController = kf1Var.getMessagesController();
                long j10 = -kf1Var.f35668a;
                if (messagesController.isDialogMuted(j10, tL_forumTopic.f19236id)) {
                    kf1Var.getNotificationsController().muteDialog(j10, tL_forumTopic.f19236id, false);
                    kf1Var.finishPreviewFragment();
                    if (qc.a(kf1Var)) {
                        qc.z(kf1Var, 4, 0, kf1Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(this.f15708b);
                return;
        }
    }

    public o5(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f15707a = i11;
        this.f15709c = obj;
        this.f15708b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public o5(org.telegram.ui.ActionBar.p2 p2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.f15707a = i11;
        this.f15709c = p2Var;
        this.d = obj;
        this.e = serializable;
        this.f15708b = i10;
    }
}
