package ei;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.bd;
import org.telegram.messenger.gt;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.fc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ch0;
import org.telegram.ui.kb;
import org.telegram.ui.lv;
import org.telegram.ui.m91;
import org.telegram.ui.rw;
import org.telegram.ui.x30;
import org.telegram.ui.z20;
public final class t5 implements View.OnClickListener {
    public final int f11048a;
    public final int f11049b;
    public final Object f11050c;
    public final Object d;
    public final Object f11051e;

    public t5(KeyEvent.Callback callback, Object obj, int i3, Object obj2, int i10) {
        this.f11048a = i10;
        this.f11050c = callback;
        this.d = obj;
        this.f11049b = i3;
        this.f11051e = obj2;
    }

    @Override
    public final void onClick(View view) {
        int i3 = this.f11048a;
        int i10 = this.f11049b;
        Object obj = this.f11051e;
        Object obj2 = this.d;
        Object obj3 = this.f11050c;
        switch (i3) {
            case 0:
                w5 w5Var = (w5) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                if (!((TLRPC.User) obj2).premium) {
                    w5Var.dismiss();
                    org.telegram.ui.ActionBar.d2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new vg.v0(Q, 14, false));
                        return;
                    }
                    return;
                } else if (w5Var.k1) {
                    w5Var.dismiss();
                    lv lvVar = w5Var.m1;
                    if (lvVar != null) {
                        lvVar.a(false);
                        return;
                    }
                    return;
                } else {
                    z6 P1 = hp.s1(w5Var.f28583a).P1();
                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = P1.B;
                    if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(w5Var.f28583a).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                        if (w5Var.k1) {
                            w5Var.dismiss();
                            lv lvVar2 = w5Var.m1;
                            if (lvVar2 != null) {
                                lvVar2.a(false);
                                return;
                            }
                            return;
                        }
                        new fc(w5Var.f28589c, e6Var).t(org.telegram.messenger.g0.X2(bd.M0(2131744894, null)), null).k(true);
                        return;
                    }
                    TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
                    tL_stories_activateStealthMode.future = true;
                    tL_stories_activateStealthMode.past = true;
                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
                    tL_storiesStealthMode2.flags |= 3;
                    tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(w5Var.f28583a).getCurrentTime() + hp.s1(w5Var.f28583a).f23019h0;
                    tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(w5Var.f28583a).getCurrentTime() + hp.s1(w5Var.f28583a).f23011g0;
                    P1.i0(tL_storiesStealthMode2);
                    ConnectionsManager.getInstance(w5Var.f28583a).sendRequest(tL_stories_activateStealthMode, new u5(0));
                    try {
                        w5Var.f28586b.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                    w5Var.dismiss();
                    if (i10 == 0) {
                        w5.I0();
                    }
                    lv lvVar3 = w5Var.m1;
                    if (lvVar3 != null) {
                        lvVar3.a(true);
                        return;
                    }
                    return;
                }
            case 1:
                kb.b0((kb) obj3, i10, (ArrayList) obj2, (Integer) obj);
                return;
            case 2:
                int[] iArr = (int[]) obj3;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) obj2;
                ch0 ch0Var = (ch0) obj;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = hp.s1(h10.f22829t0).f22989d7.edit();
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f27343a.O0.run();
                ch0Var.run();
                return;
            case 3:
                x30 x30Var = (x30) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) obj;
                if (i10 < arrayList.size()) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) x30Var.S2.d.f(zi.C1(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    x30Var.z1(groupCallParticipant, zi.C1(groupCallParticipant.peer), ((Integer) arrayList.get(i10)).intValue());
                    z20 z20Var = x30Var.X4;
                    if (z20Var != null) {
                        z20Var.dismiss();
                        return;
                    } else if (((Integer) arrayList.get(i10)).intValue() != 9 && ((Integer) arrayList.get(i10)).intValue() != 10 && ((Integer) arrayList.get(i10)).intValue() != 11) {
                        x30Var.f1(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                gi.d dVar = (gi.d) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    int i11 = this.f11049b;
                    gt.b(i11, context, new ci.o0(dVar, context, t2Var, i11, 8));
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                String str = (String) obj;
                RectF rectF = ProfileActivity.T6;
                ((org.telegram.ui.ActionBar.f1) ((AtomicReference) obj2).get()).dismiss();
                try {
                    org.telegram.messenger.g0.g(str);
                    if (i10 == profileActivity.O3) {
                        fc.a0(profileActivity).i(bd.M0(2131752761, null)).j();
                    } else {
                        fc.a0(profileActivity).i(bd.M0(2131752693, null)).j();
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 6:
                m91 m91Var = (m91) obj3;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj;
                hp messagesController = m91Var.getMessagesController();
                long j10 = -m91Var.f47575a;
                if (messagesController.r2(j10, tL_forumTopic.f27053id, null)) {
                    m91Var.getNotificationsController().G(j10, tL_forumTopic.f27053id, false);
                    m91Var.finishPreviewFragment();
                    if (fc.a(m91Var)) {
                        fc.z(m91Var, 4, 0, m91Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(i10);
                return;
            default:
                gi.d dVar2 = (gi.d) obj3;
                org.telegram.ui.ActionBar.t2 t2Var2 = (org.telegram.ui.ActionBar.t2) obj2;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj;
                if (!dVar2.R) {
                    dVar2.setLoading(true);
                    org.telegram.ui.Wallet.i4 i4Var = new org.telegram.ui.Wallet.i4(dVar2, t2Var2, e6Var2, 0);
                    org.telegram.ui.Wallet.k0 x10 = org.telegram.ui.Wallet.k0.x(i10);
                    x10.m0(new rw(i10, i4Var, x10));
                    return;
                }
                return;
        }
    }

    public t5(Object obj, int i3, Object obj2, Object obj3, int i10) {
        this.f11048a = i10;
        this.f11050c = obj;
        this.f11049b = i3;
        this.d = obj2;
        this.f11051e = obj3;
    }

    public t5(org.telegram.ui.ActionBar.d2 d2Var, Object obj, Serializable serializable, int i3, int i10) {
        this.f11048a = i10;
        this.f11050c = d2Var;
        this.d = obj;
        this.f11051e = serializable;
        this.f11049b = i3;
    }
}
