package ih;

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
import org.telegram.ui.Components.oc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.o40;
import org.telegram.ui.o50;
import org.telegram.ui.pb;
import org.telegram.ui.tj0;
import org.telegram.ui.we1;
public final class p5 implements View.OnClickListener {
    public final int f11952a;
    public final int f11953b;
    public final Object f11954c;
    public final Object d;
    public final Object f11955e;

    public p5(KeyEvent.Callback callback, Object obj, int i9, Object obj2, int i10) {
        this.f11952a = i10;
        this.f11954c = callback;
        this.d = obj;
        this.f11953b = i9;
        this.f11955e = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f11952a) {
            case 0:
                s5.m((s5) this.f11954c, (TLRPC.User) this.d, this.f11953b, (org.telegram.ui.ActionBar.b6) this.f11955e);
                return;
            case 1:
                pb.V((pb) this.f11954c, this.f11953b, (ArrayList) this.d, (Integer) this.f11955e);
                return;
            case 2:
                int[] iArr = (int[]) this.f11954c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                tj0 tj0Var = (tj0) this.f11955e;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                int i9 = this.f11953b;
                if (i9 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i9 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f22702a.H0.run();
                tj0Var.run();
                return;
            case 3:
                o50 o50Var = (o50) this.f11954c;
                ArrayList arrayList = (ArrayList) this.d;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f11955e;
                int size = arrayList.size();
                int i10 = this.f11953b;
                if (i10 < size) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) o50Var.W0.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    o50Var.x1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i10)).intValue());
                    o40 o40Var = o50Var.f40887b3;
                    if (o40Var != null) {
                        o40Var.dismiss();
                        return;
                    } else if (((Integer) arrayList.get(i10)).intValue() != 9 && ((Integer) arrayList.get(i10)).intValue() != 10 && ((Integer) arrayList.get(i10)).intValue() != 11) {
                        o50Var.d1(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                kh.d dVar = (kh.d) this.f11954c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f11955e;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    int i11 = this.f11953b;
                    PasskeysController.create(context, i11, new gh.j0(dVar, context, f3Var, i11, 7));
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f11954c;
                String str = (String) this.f11955e;
                ((org.telegram.ui.ActionBar.o1) ((AtomicReference) this.d).get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (this.f11953b == profileActivity.K3) {
                        oc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessHoursCopied)).j();
                    } else {
                        oc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessLocationCopied)).j();
                    }
                    return;
                } catch (Exception e10) {
                    FileLog.e(e10);
                    return;
                }
            default:
                we1 we1Var = (we1) this.f11954c;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.f11955e;
                MessagesController messagesController = we1Var.getMessagesController();
                long j10 = -we1Var.f43741a;
                if (messagesController.isDialogMuted(j10, tL_forumTopic.f22432id)) {
                    we1Var.getNotificationsController().muteDialog(j10, tL_forumTopic.f22432id, false);
                    we1Var.finishPreviewFragment();
                    if (oc.a(we1Var)) {
                        oc.z(we1Var, 4, 0, we1Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(this.f11953b);
                return;
        }
    }

    public p5(Object obj, int i9, Object obj2, Object obj3, int i10) {
        this.f11952a = i10;
        this.f11954c = obj;
        this.f11953b = i9;
        this.d = obj2;
        this.f11955e = obj3;
    }

    public p5(org.telegram.ui.ActionBar.o2 o2Var, Object obj, Serializable serializable, int i9, int i10) {
        this.f11952a = i10;
        this.f11954c = o2Var;
        this.d = obj;
        this.f11955e = serializable;
        this.f11953b = i9;
    }
}
