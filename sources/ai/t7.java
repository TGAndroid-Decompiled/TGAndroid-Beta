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
import org.telegram.ui.Components.yc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ck0;
import org.telegram.ui.d50;
import org.telegram.ui.d60;
import org.telegram.ui.wf1;
public final class t7 implements View.OnClickListener {
    public final int f1561a;
    public final int f1562b;
    public final Object f1563c;
    public final Object d;
    public final Object e;

    public t7(KeyEvent.Callback callback, Object obj, int i10, Object obj2, int i11) {
        this.f1561a = i11;
        this.f1563c = callback;
        this.d = obj;
        this.f1562b = i10;
        this.e = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1561a) {
            case 0:
                x7.m((x7) this.f1563c, (TLRPC.User) this.d, this.f1562b, (org.telegram.ui.ActionBar.d6) this.e);
                return;
            case 1:
                org.telegram.ui.ub.W((org.telegram.ui.ub) this.f1563c, this.f1562b, (ArrayList) this.d, (Integer) this.e);
                return;
            case 2:
                int[] iArr = (int[]) this.f1563c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                ck0 ck0Var = (ck0) this.e;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                int i10 = this.f1562b;
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f18678a.L0.run();
                ck0Var.run();
                return;
            case 3:
                d60 d60Var = (d60) this.f1563c;
                ArrayList arrayList = (ArrayList) this.d;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.e;
                int size = arrayList.size();
                int i11 = this.f1562b;
                if (i11 < size) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) d60Var.f33013a1.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    d60Var.x1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    d50 d50Var = d60Var.f33037f3;
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
                ci.d dVar = (ci.d) this.f1563c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.e;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    int i12 = this.f1562b;
                    PasskeysController.create(context, i12, new ei.h1(dVar, context, e3Var, i12, 6));
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f1563c;
                String str = (String) this.e;
                ((org.telegram.ui.ActionBar.m1) ((AtomicReference) this.d).get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (this.f1562b == profileActivity.O3) {
                        yc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessHoursCopied)).j();
                    } else {
                        yc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessLocationCopied)).j();
                    }
                    return;
                } catch (Exception e) {
                    FileLog.e(e);
                    return;
                }
            default:
                wf1 wf1Var = (wf1) this.f1563c;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.e;
                MessagesController messagesController = wf1Var.getMessagesController();
                long j3 = -wf1Var.f39397a;
                if (messagesController.isDialogMuted(j3, tL_forumTopic.f18404id)) {
                    wf1Var.getNotificationsController().muteDialog(j3, tL_forumTopic.f18404id, false);
                    wf1Var.finishPreviewFragment();
                    if (yc.a(wf1Var)) {
                        yc.z(wf1Var, 4, 0, wf1Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(this.f1562b);
                return;
        }
    }

    public t7(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f1561a = i11;
        this.f1563c = obj;
        this.f1562b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public t7(org.telegram.ui.ActionBar.m2 m2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.f1561a = i11;
        this.f1563c = m2Var;
        this.d = obj;
        this.e = serializable;
        this.f1562b = i10;
    }
}
