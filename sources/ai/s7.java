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
import org.telegram.ui.Components.xc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.fg1;
import org.telegram.ui.i50;
import org.telegram.ui.i60;
import org.telegram.ui.lk0;
public final class s7 implements View.OnClickListener {
    public final int f1508a;
    public final int f1509b;
    public final Object f1510c;
    public final Object d;
    public final Object e;

    public s7(KeyEvent.Callback callback, Object obj, int i10, Object obj2, int i11) {
        this.f1508a = i11;
        this.f1510c = callback;
        this.d = obj;
        this.f1509b = i10;
        this.e = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1508a) {
            case 0:
                w7.m((w7) this.f1510c, (TLRPC.User) this.d, this.f1509b, (org.telegram.ui.ActionBar.f6) this.e);
                return;
            case 1:
                org.telegram.ui.vb.W((org.telegram.ui.vb) this.f1510c, this.f1509b, (ArrayList) this.d, (Integer) this.e);
                return;
            case 2:
                int[] iArr = (int[]) this.f1510c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                lk0 lk0Var = (lk0) this.e;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                int i10 = this.f1509b;
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f18654a.L0.run();
                lk0Var.run();
                return;
            case 3:
                i60 i60Var = (i60) this.f1510c;
                ArrayList arrayList = (ArrayList) this.d;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.e;
                int size = arrayList.size();
                int i11 = this.f1509b;
                if (i11 < size) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) i60Var.f34360a1.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    i60Var.x1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    i50 i50Var = i60Var.f34384f3;
                    if (i50Var != null) {
                        i50Var.dismiss();
                        return;
                    } else if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                        i60Var.d1(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                ci.d dVar = (ci.d) this.f1510c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.e;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    int i12 = this.f1509b;
                    PasskeysController.create(context, i12, new ei.h1(dVar, context, f3Var, i12, 6));
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f1510c;
                String str = (String) this.e;
                ((org.telegram.ui.ActionBar.n1) ((AtomicReference) this.d).get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (this.f1509b == profileActivity.O3) {
                        xc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessHoursCopied)).j();
                    } else {
                        xc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessLocationCopied)).j();
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                fg1 fg1Var = (fg1) this.f1510c;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.e;
                MessagesController messagesController = fg1Var.getMessagesController();
                long j3 = -fg1Var.f33596a;
                if (messagesController.isDialogMuted(j3, tL_forumTopic.f18380id)) {
                    fg1Var.getNotificationsController().muteDialog(j3, tL_forumTopic.f18380id, false);
                    fg1Var.finishPreviewFragment();
                    if (xc.a(fg1Var)) {
                        xc.z(fg1Var, 4, 0, fg1Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(this.f1509b);
                return;
        }
    }

    public s7(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f1508a = i11;
        this.f1510c = obj;
        this.f1509b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public s7(org.telegram.ui.ActionBar.n2 n2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.f1508a = i11;
        this.f1510c = n2Var;
        this.d = obj;
        this.e = serializable;
        this.f1509b = i10;
    }
}
