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
import org.telegram.ui.ck0;
import org.telegram.ui.d50;
import org.telegram.ui.d60;
import org.telegram.ui.wf1;
public final class t7 implements View.OnClickListener {
    public final int f1556a;
    public final int f1557b;
    public final Object f1558c;
    public final Object d;
    public final Object e;

    public t7(KeyEvent.Callback callback, Object obj, int i10, Object obj2, int i11) {
        this.f1556a = i11;
        this.f1558c = callback;
        this.d = obj;
        this.f1557b = i10;
        this.e = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1556a) {
            case 0:
                x7.m((x7) this.f1558c, (TLRPC.User) this.d, this.f1557b, (org.telegram.ui.ActionBar.d6) this.e);
                return;
            case 1:
                org.telegram.ui.ub.W((org.telegram.ui.ub) this.f1558c, this.f1557b, (ArrayList) this.d, (Integer) this.e);
                return;
            case 2:
                int[] iArr = (int[]) this.f1558c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                ck0 ck0Var = (ck0) this.e;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                int i10 = this.f1557b;
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f18662a.L0.run();
                ck0Var.run();
                return;
            case 3:
                d60 d60Var = (d60) this.f1558c;
                ArrayList arrayList = (ArrayList) this.d;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.e;
                int size = arrayList.size();
                int i11 = this.f1557b;
                if (i11 < size) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) d60Var.f32936a1.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    d60Var.x1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    d50 d50Var = d60Var.f32960f3;
                    if (d50Var != null) {
                        d50Var.dismiss();
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
                ci.d dVar = (ci.d) this.f1558c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.e;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    int i12 = this.f1557b;
                    PasskeysController.create(context, i12, new ei.h1(dVar, context, e3Var, i12, 6));
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f1558c;
                String str = (String) this.e;
                ((org.telegram.ui.ActionBar.m1) ((AtomicReference) this.d).get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (this.f1557b == profileActivity.O3) {
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
                wf1 wf1Var = (wf1) this.f1558c;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.e;
                MessagesController messagesController = wf1Var.getMessagesController();
                long j3 = -wf1Var.f39309a;
                if (messagesController.isDialogMuted(j3, tL_forumTopic.f18388id)) {
                    wf1Var.getNotificationsController().muteDialog(j3, tL_forumTopic.f18388id, false);
                    wf1Var.finishPreviewFragment();
                    if (xc.a(wf1Var)) {
                        xc.z(wf1Var, 4, 0, wf1Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(this.f1557b);
                return;
        }
    }

    public t7(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f1556a = i11;
        this.f1558c = obj;
        this.f1557b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public t7(org.telegram.ui.ActionBar.m2 m2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.f1556a = i11;
        this.f1558c = m2Var;
        this.d = obj;
        this.e = serializable;
        this.f1557b = i10;
    }
}
