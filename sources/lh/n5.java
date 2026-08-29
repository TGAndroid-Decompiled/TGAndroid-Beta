package lh;

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
import org.telegram.ui.Components.tc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ob;
import org.telegram.ui.qj0;
import org.telegram.ui.r40;
import org.telegram.ui.r50;
import org.telegram.ui.ze1;
public final class n5 implements View.OnClickListener {
    public final int f15976a;
    public final int f15977b;
    public final Object f15978c;
    public final Object d;
    public final Object f15979e;

    public n5(KeyEvent.Callback callback, Object obj, int i10, Object obj2, int i11) {
        this.f15976a = i11;
        this.f15978c = callback;
        this.d = obj;
        this.f15977b = i10;
        this.f15979e = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f15976a) {
            case 0:
                q5.m((q5) this.f15978c, (TLRPC.User) this.d, this.f15977b, (org.telegram.ui.ActionBar.c6) this.f15979e);
                return;
            case 1:
                ob.W((ob) this.f15978c, this.f15977b, (ArrayList) this.d, (Integer) this.f15979e);
                return;
            case 2:
                int[] iArr = (int[]) this.f15978c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                qj0 qj0Var = (qj0) this.f15979e;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                int i10 = this.f15977b;
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f22714a.H0.run();
                qj0Var.run();
                return;
            case 3:
                r50 r50Var = (r50) this.f15978c;
                ArrayList arrayList = (ArrayList) this.d;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f15979e;
                int size = arrayList.size();
                int i11 = this.f15977b;
                if (i11 < size) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) r50Var.W0.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    r50Var.x1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    r40 r40Var = r50Var.f41875b3;
                    if (r40Var != null) {
                        r40Var.dismiss();
                        return;
                    } else if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                        r50Var.d1(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                nh.d dVar = (nh.d) this.f15978c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f15979e;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    int i12 = this.f15977b;
                    PasskeysController.create(context, i12, new jh.i0(dVar, context, f3Var, i12, 5));
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f15978c;
                String str = (String) this.f15979e;
                ((org.telegram.ui.ActionBar.o1) ((AtomicReference) this.d).get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (this.f15977b == profileActivity.K3) {
                        tc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessHoursCopied)).j();
                    } else {
                        tc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessLocationCopied)).j();
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                ze1 ze1Var = (ze1) this.f15978c;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.f15979e;
                MessagesController messagesController = ze1Var.getMessagesController();
                long j10 = -ze1Var.f45155a;
                if (messagesController.isDialogMuted(j10, tL_forumTopic.f22444id)) {
                    ze1Var.getNotificationsController().muteDialog(j10, tL_forumTopic.f22444id, false);
                    ze1Var.finishPreviewFragment();
                    if (tc.a(ze1Var)) {
                        tc.z(ze1Var, 4, 0, ze1Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(this.f15977b);
                return;
        }
    }

    public n5(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f15976a = i11;
        this.f15978c = obj;
        this.f15977b = i10;
        this.d = obj2;
        this.f15979e = obj3;
    }

    public n5(org.telegram.ui.ActionBar.o2 o2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.f15976a = i11;
        this.f15978c = o2Var;
        this.d = obj;
        this.f15979e = serializable;
        this.f15977b = i10;
    }
}
