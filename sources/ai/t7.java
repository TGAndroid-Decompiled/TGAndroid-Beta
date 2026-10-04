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
import org.telegram.ui.gk0;
import org.telegram.ui.h60;
import org.telegram.ui.i50;
import org.telegram.ui.yf1;
public final class t7 implements View.OnClickListener {
    public final int f1694a;
    public final int f1695b;
    public final Object f1696c;
    public final Object d;
    public final Object f1697e;

    public t7(KeyEvent.Callback callback, Object obj, int i10, Object obj2, int i11) {
        this.f1694a = i11;
        this.f1696c = callback;
        this.d = obj;
        this.f1695b = i10;
        this.f1697e = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1694a) {
            case 0:
                x7.m((x7) this.f1696c, (TLRPC.User) this.d, this.f1695b, (org.telegram.ui.ActionBar.d6) this.f1697e);
                return;
            case 1:
                org.telegram.ui.wb.U((org.telegram.ui.wb) this.f1696c, this.f1695b, (ArrayList) this.d, (Integer) this.f1697e);
                return;
            case 2:
                int[] iArr = (int[]) this.f1696c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                gk0 gk0Var = (gk0) this.f1697e;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                int i10 = this.f1695b;
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f20368a.L0.run();
                gk0Var.run();
                return;
            case 3:
                h60 h60Var = (h60) this.f1696c;
                ArrayList arrayList = (ArrayList) this.d;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f1697e;
                int size = arrayList.size();
                int i11 = this.f1695b;
                if (i11 < size) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) h60Var.f36874a1.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    h60Var.x1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    i50 i50Var = h60Var.f36899f3;
                    if (i50Var != null) {
                        i50Var.dismiss();
                        return;
                    } else if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                        h60Var.d1(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                ci.d dVar = (ci.d) this.f1696c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f1697e;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    int i12 = this.f1695b;
                    PasskeysController.create(context, i12, new ei.i1(dVar, context, f3Var, i12, 6));
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f1696c;
                String str = (String) this.f1697e;
                ((org.telegram.ui.ActionBar.n1) ((AtomicReference) this.d).get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (this.f1695b == profileActivity.O3) {
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
                yf1 yf1Var = (yf1) this.f1696c;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.f1697e;
                MessagesController messagesController = yf1Var.getMessagesController();
                long j3 = -yf1Var.f43163a;
                if (messagesController.isDialogMuted(j3, tL_forumTopic.f20090id)) {
                    yf1Var.getNotificationsController().muteDialog(j3, tL_forumTopic.f20090id, false);
                    yf1Var.finishPreviewFragment();
                    if (yc.a(yf1Var)) {
                        yc.z(yf1Var, 4, 0, yf1Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(this.f1695b);
                return;
        }
    }

    public t7(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f1694a = i11;
        this.f1696c = obj;
        this.f1695b = i10;
        this.d = obj2;
        this.f1697e = obj3;
    }

    public t7(org.telegram.ui.ActionBar.n2 n2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.f1694a = i11;
        this.f1696c = n2Var;
        this.d = obj;
        this.f1697e = serializable;
        this.f1695b = i10;
    }
}
