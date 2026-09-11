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
import org.telegram.ui.Components.yc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.eg1;
import org.telegram.ui.j50;
import org.telegram.ui.j60;
import org.telegram.ui.lk0;
public final class b7 implements View.OnClickListener {
    public final int f2800a;
    public final int f2801b;
    public final Object f2802c;
    public final Object d;
    public final Object f2803e;

    public b7(KeyEvent.Callback callback, Object obj, int i10, Object obj2, int i11) {
        this.f2800a = i11;
        this.f2802c = callback;
        this.d = obj;
        this.f2801b = i10;
        this.f2803e = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f2800a) {
            case 0:
                f7.m((f7) this.f2802c, (TLRPC.User) this.d, this.f2801b, (org.telegram.ui.ActionBar.f6) this.f2803e);
                return;
            case 1:
                org.telegram.ui.ub.W((org.telegram.ui.ub) this.f2802c, this.f2801b, (ArrayList) this.d, (Integer) this.f2803e);
                return;
            case 2:
                int[] iArr = (int[]) this.f2802c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                lk0 lk0Var = (lk0) this.f2803e;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                int i10 = this.f2801b;
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f20198a.L0.run();
                lk0Var.run();
                return;
            case 3:
                j60 j60Var = (j60) this.f2802c;
                ArrayList arrayList = (ArrayList) this.d;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f2803e;
                int size = arrayList.size();
                int i11 = this.f2801b;
                if (i11 < size) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) j60Var.f37513a1.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    j60Var.x1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    j50 j50Var = j60Var.f37538f3;
                    if (j50Var != null) {
                        j50Var.dismiss();
                        return;
                    } else if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                        j60Var.d1(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                di.d dVar = (di.d) this.f2802c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f2803e;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    int i12 = this.f2801b;
                    PasskeysController.create(context, i12, new fi.h1(dVar, context, f3Var, i12, 6));
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f2802c;
                String str = (String) this.f2803e;
                ((org.telegram.ui.ActionBar.n1) ((AtomicReference) this.d).get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (this.f2801b == profileActivity.O3) {
                        yc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessHoursCopied)).j();
                    } else {
                        yc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessLocationCopied)).j();
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            default:
                eg1 eg1Var = (eg1) this.f2802c;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.f2803e;
                MessagesController messagesController = eg1Var.getMessagesController();
                long j3 = -eg1Var.f36025a;
                if (messagesController.isDialogMuted(j3, tL_forumTopic.f19921id)) {
                    eg1Var.getNotificationsController().muteDialog(j3, tL_forumTopic.f19921id, false);
                    eg1Var.finishPreviewFragment();
                    if (yc.a(eg1Var)) {
                        yc.z(eg1Var, 4, 0, eg1Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(this.f2801b);
                return;
        }
    }

    public b7(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f2800a = i11;
        this.f2802c = obj;
        this.f2801b = i10;
        this.d = obj2;
        this.f2803e = obj3;
    }

    public b7(org.telegram.ui.ActionBar.n2 n2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.f2800a = i11;
        this.f2802c = n2Var;
        this.d = obj;
        this.f2803e = serializable;
        this.f2801b = i10;
    }
}
