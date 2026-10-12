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
import org.telegram.ui.lg1;
import org.telegram.ui.n50;
import org.telegram.ui.n60;
import org.telegram.ui.ok0;
public final class f7 implements View.OnClickListener {
    public final int f3022a;
    public final int f3023b;
    public final Object f3024c;
    public final Object d;
    public final Object e;

    public f7(KeyEvent.Callback callback, Object obj, int i10, Object obj2, int i11) {
        this.f3022a = i11;
        this.f3024c = callback;
        this.d = obj;
        this.f3023b = i10;
        this.e = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f3022a) {
            case 0:
                j7.n((j7) this.f3024c, (TLRPC.User) this.d, this.f3023b, (org.telegram.ui.ActionBar.c6) this.e);
                return;
            case 1:
                org.telegram.ui.ac.W((org.telegram.ui.ac) this.f3024c, this.f3023b, (ArrayList) this.d, (Integer) this.e);
                return;
            case 2:
                int[] iArr = (int[]) this.f3024c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                ok0 ok0Var = (ok0) this.e;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                int i10 = this.f3023b;
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f19548a.L0.run();
                ok0Var.run();
                return;
            case 3:
                n60 n60Var = (n60) this.f3024c;
                ArrayList arrayList = (ArrayList) this.d;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.e;
                int size = arrayList.size();
                int i11 = this.f3023b;
                if (i11 < size) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) n60Var.f38442a1.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    n60Var.y1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    n50 n50Var = n60Var.f38466f3;
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
                di.d dVar = (di.d) this.f3024c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.e;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    int i12 = this.f3023b;
                    PasskeysController.create(context, i12, new fi.g1(dVar, context, e3Var, i12, 6));
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f3024c;
                String str = (String) this.e;
                ((org.telegram.ui.ActionBar.m1) ((AtomicReference) this.d).get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (this.f3023b == profileActivity.O3) {
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
                lg1 lg1Var = (lg1) this.f3024c;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.e;
                MessagesController messagesController = lg1Var.getMessagesController();
                long j10 = -lg1Var.f37957a;
                if (messagesController.isDialogMuted(j10, tL_forumTopic.f19268id)) {
                    lg1Var.getNotificationsController().muteDialog(j10, tL_forumTopic.f19268id, false);
                    lg1Var.finishPreviewFragment();
                    if (zc.a(lg1Var)) {
                        zc.z(lg1Var, 4, 0, lg1Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(this.f3023b);
                return;
            default:
                di.d dVar2 = (di.d) this.f3024c;
                org.telegram.ui.ActionBar.e3 e3Var2 = (org.telegram.ui.ActionBar.e3) this.d;
                org.telegram.ui.ActionBar.c6 c6Var = (org.telegram.ui.ActionBar.c6) this.e;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    org.telegram.ui.Wallet.o3 o3Var = new org.telegram.ui.Wallet.o3(dVar2, e3Var2, c6Var, 0);
                    int i13 = this.f3023b;
                    org.telegram.ui.Wallet.j0 v = org.telegram.ui.Wallet.j0.v(i13);
                    v.h0(new c90(i13, o3Var, v));
                    return;
                }
                return;
        }
    }

    public f7(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f3022a = i11;
        this.f3024c = obj;
        this.f3023b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public f7(org.telegram.ui.ActionBar.m2 m2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.f3022a = i11;
        this.f3024c = m2Var;
        this.d = obj;
        this.e = serializable;
        this.f3023b = i10;
    }
}
