package jh;

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
import org.telegram.ui.Components.mc;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qb;
import org.telegram.ui.s40;
import org.telegram.ui.s50;
import org.telegram.ui.uj0;
import org.telegram.ui.we1;

public final class l5 implements View.OnClickListener {

    public final int f13619a;

    public final int f13620b;

    public final Object f13621c;
    public final Object d;

    public final Object f13622e;

    public l5(KeyEvent.Callback callback, Object obj, int i10, Object obj2, int i11) {
        this.f13619a = i11;
        this.f13621c = callback;
        this.d = obj;
        this.f13620b = i10;
        this.f13622e = obj2;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f13619a) {
            case 0:
                o5.m((o5) this.f13621c, (TLRPC.User) this.d, this.f13620b, (org.telegram.ui.ActionBar.c6) this.f13622e);
                break;
            case 1:
                qb.W((qb) this.f13621c, this.f13620b, (ArrayList) this.d, (Integer) this.f13622e);
                break;
            case 2:
                int[] iArr = (int[]) this.f13621c;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) this.d;
                uj0 uj0Var = (uj0) this.f13622e;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(UserConfig.selectedAccount).edit();
                int i10 = this.f13620b;
                if (i10 == 1) {
                    editorEdit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    editorEdit.putInt("popupGroup", iArr[0]);
                } else {
                    editorEdit.putInt("popupChannel", iArr[0]);
                }
                editorEdit.commit();
                alertDialog$Builder.f22702a.H0.run();
                uj0Var.run();
                break;
            case 3:
                s50 s50Var = (s50) this.f13621c;
                ArrayList arrayList = (ArrayList) this.d;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) this.f13622e;
                int size = arrayList.size();
                int i11 = this.f13620b;
                if (i11 < size) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) s50Var.W0.participants.f(MessageObject.getPeerId(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    s50Var.x1(groupCallParticipant, MessageObject.getPeerId(groupCallParticipant.peer), ((Integer) arrayList.get(i11)).intValue());
                    s40 s40Var = s50Var.f42416b3;
                    if (s40Var != null) {
                        s40Var.dismiss();
                        break;
                    } else if (((Integer) arrayList.get(i11)).intValue() != 9 && ((Integer) arrayList.get(i11)).intValue() != 10 && ((Integer) arrayList.get(i11)).intValue() != 11) {
                        s50Var.d1(true);
                        break;
                    }
                }
                break;
            case 4:
                lh.d dVar = (lh.d) this.f13621c;
                Context context = (Context) this.d;
                org.telegram.ui.ActionBar.e3 e3Var = (org.telegram.ui.ActionBar.e3) this.f13622e;
                if (!dVar.J) {
                    dVar.setLoading(true);
                    int i12 = this.f13620b;
                    PasskeysController.create(context, i12, new hh.j0(dVar, context, e3Var, i12, 7));
                    break;
                }
                break;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) this.f13621c;
                AtomicReference atomicReference = (AtomicReference) this.d;
                String str = (String) this.f13622e;
                ((org.telegram.ui.ActionBar.n1) atomicReference.get()).dismiss();
                try {
                    AndroidUtilities.addToClipboard(str);
                    if (this.f13620b == profileActivity.K3) {
                        mc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessHoursCopied)).j();
                    } else {
                        mc.a0(profileActivity).i(LocaleController.getString(R.string.BusinessLocationCopied)).j();
                    }
                } catch (Exception e9) {
                    FileLog.e(e9);
                    return;
                }
                break;
            default:
                we1 we1Var = (we1) this.f13621c;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) this.d;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) this.f13622e;
                MessagesController messagesController = we1Var.getMessagesController();
                long j10 = -we1Var.f43719a;
                if (!messagesController.isDialogMuted(j10, tL_forumTopic.f22432id)) {
                    actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(this.f13620b);
                } else {
                    we1Var.getNotificationsController().muteDialog(j10, tL_forumTopic.f22432id, false);
                    we1Var.finishPreviewFragment();
                    if (mc.a(we1Var)) {
                        mc.z(we1Var, 4, 0, we1Var.getResourceProvider()).j();
                    }
                }
                break;
        }
    }

    public l5(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f13619a = i11;
        this.f13621c = obj;
        this.f13620b = i10;
        this.d = obj2;
        this.f13622e = obj3;
    }

    public l5(org.telegram.ui.ActionBar.n2 n2Var, Object obj, Serializable serializable, int i10, int i11) {
        this.f13619a = i11;
        this.f13621c = n2Var;
        this.d = obj;
        this.f13622e = serializable;
        this.f13620b = i10;
    }
}
