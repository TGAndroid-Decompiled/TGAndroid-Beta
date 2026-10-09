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
import org.telegram.ui.Components.ad;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.bi0;
import org.telegram.ui.fg1;
import org.telegram.ui.g50;
import org.telegram.ui.g60;
import org.telegram.ui.jk0;
public final class u7 implements View.OnClickListener {
    public final int f1802a;
    public final int f1803b;
    public final Object f1804c;
    public final Object d;
    public final Object f1805e;

    public u7(KeyEvent.Callback callback, Object obj, int i10, Object obj2, int i11) {
        this.f1802a = i11;
        this.f1804c = callback;
        this.d = obj;
        this.f1803b = i10;
        this.f1805e = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f1802a) {
            case 0:
                y7.o((y7) this.f1804c, (TLRPC.User) this.d, this.f1803b, (org.telegram.ui.ActionBar.e6) this.f1805e);
                return;
            case 1:
                org.telegram.ui.vb.W((org.telegram.ui.vb) this.f1804c, this.f1803b, (ArrayList) this.d, (Integer) this.f1805e);
                return;
            case 2:
                int[] iArr = (int[]) this.f1804c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                jk0 jk0Var = (jk0) this.f1805e;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                int i10 = this.f1803b;
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f20374a.L0.run();
                jk0Var.run();
                return;
            case 3:
                g60 g60Var = (g60) this.f1804c;
                ArrayList arrayList = (ArrayList) this.d;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f1805e;
                int size = arrayList.size();
                int i11 = this.f1803b;
                if (i11 < size) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) g60Var.f37789a1.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    g60Var.y1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    g50 g50Var = g60Var.f37814f3;
                    if (g50Var != null) {
                        g50Var.dismiss();
                        return;
                    } else if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                        g60Var.e1(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                ci.d dVar = (ci.d) this.f1804c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f1805e;
                if (!dVar.N) {
                    dVar.setLoading(true);
                    int i12 = this.f1803b;
                    PasskeysController.create(context, i12, new ei.h1(dVar, context, f3Var, i12, 6));
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f1804c;
                String str = (String) this.f1805e;
                ((org.telegram.ui.ActionBar.n1) ((AtomicReference) this.d).get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (this.f1803b == profileActivity.O3) {
                        ad.a0(profileActivity).i(LocaleController.getString(R.string.BusinessHoursCopied)).j();
                    } else {
                        ad.a0(profileActivity).i(LocaleController.getString(R.string.BusinessLocationCopied)).j();
                    }
                    return;
                } catch (Exception e7) {
                    FileLog.e(e7);
                    return;
                }
            case 6:
                fg1 fg1Var = (fg1) this.f1804c;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.f1805e;
                MessagesController messagesController = fg1Var.getMessagesController();
                long j3 = -fg1Var.f37558a;
                if (messagesController.isDialogMuted(j3, tL_forumTopic.f20090id)) {
                    fg1Var.getNotificationsController().muteDialog(j3, tL_forumTopic.f20090id, false);
                    fg1Var.finishPreviewFragment();
                    if (ad.a(fg1Var)) {
                        ad.z(fg1Var, 4, 0, fg1Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(this.f1803b);
                return;
            default:
                ci.d dVar2 = (ci.d) this.f1804c;
                org.telegram.ui.ActionBar.f3 f3Var2 = (org.telegram.ui.ActionBar.f3) this.d;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) this.f1805e;
                if (!dVar2.N) {
                    dVar2.setLoading(true);
                    org.telegram.ui.Wallet.o3 o3Var = new org.telegram.ui.Wallet.o3(dVar2, f3Var2, e6Var, 0);
                    int i13 = this.f1803b;
                    org.telegram.ui.Wallet.k0 v = org.telegram.ui.Wallet.k0.v(i13);
                    v.h0(new bi0(i13, o3Var, v));
                    return;
                }
                return;
        }
    }

    public u7(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f1802a = i11;
        this.f1804c = obj;
        this.f1803b = i10;
        this.d = obj2;
        this.f1805e = obj3;
    }

    public u7(org.telegram.ui.ActionBar.n2 n2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.f1802a = i11;
        this.f1804c = n2Var;
        this.d = obj;
        this.f1805e = serializable;
        this.f1803b = i10;
    }
}
