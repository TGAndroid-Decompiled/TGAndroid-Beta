package di;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.messenger.pt;
import org.telegram.messenger.qp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.hc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c40;
import org.telegram.ui.d10;
import org.telegram.ui.e30;
import org.telegram.ui.gh0;
import org.telegram.ui.mb;
import org.telegram.ui.ov;
import org.telegram.ui.v91;
public final class t5 implements View.OnClickListener {
    public final int f9790a;
    public final int f9791b;
    public final Object f9792c;
    public final Object d;
    public final Object f9793e;

    public t5(KeyEvent.Callback callback, Object obj, int i7, Object obj2, int i10) {
        this.f9790a = i10;
        this.f9792c = callback;
        this.d = obj;
        this.f9791b = i7;
        this.f9793e = obj2;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f9790a;
        int i10 = this.f9791b;
        Object obj = this.f9793e;
        Object obj2 = this.d;
        Object obj3 = this.f9792c;
        switch (i7) {
            case 0:
                w5 w5Var = (w5) obj3;
                org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj;
                if (!((TLRPC.User) obj2).premium) {
                    w5Var.dismiss();
                    org.telegram.ui.ActionBar.f2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new ug.w0(Q, 14, false));
                        return;
                    }
                    return;
                } else if (w5Var.f9905j1) {
                    w5Var.dismiss();
                    ov ovVar = w5Var.l1;
                    if (ovVar != null) {
                        ovVar.a(false);
                        return;
                    }
                    return;
                } else {
                    y6 P1 = qp.s1(w5Var.f28612a).P1();
                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = P1.B;
                    if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(w5Var.f28612a).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                        if (w5Var.f9905j1) {
                            w5Var.dismiss();
                            ov ovVar2 = w5Var.l1;
                            if (ovVar2 != null) {
                                ovVar2.a(false);
                                return;
                            }
                            return;
                        }
                        new hc(w5Var.f28618c, f6Var).t(org.telegram.messenger.g0.X2(hd.M0(2131744885, null)), null).k(true);
                        return;
                    }
                    TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
                    tL_stories_activateStealthMode.future = true;
                    tL_stories_activateStealthMode.past = true;
                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
                    tL_storiesStealthMode2.flags |= 3;
                    tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(w5Var.f28612a).getCurrentTime() + qp.s1(w5Var.f28612a).f24771g0;
                    tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(w5Var.f28612a).getCurrentTime() + qp.s1(w5Var.f28612a).f24762f0;
                    P1.i0(tL_storiesStealthMode2);
                    ConnectionsManager.getInstance(w5Var.f28612a).sendRequest(tL_stories_activateStealthMode, new u5(0));
                    try {
                        w5Var.f28615b.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                    w5Var.dismiss();
                    if (i10 == 0) {
                        w5.I0();
                    }
                    ov ovVar3 = w5Var.l1;
                    if (ovVar3 != null) {
                        ovVar3.a(true);
                        return;
                    }
                    return;
                }
            case 1:
                mb.b0((mb) obj3, i10, (ArrayList) obj2, (Integer) obj);
                return;
            case 2:
                int[] iArr = (int[]) obj3;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) obj2;
                gh0 gh0Var = (gh0) obj;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = qp.s1(p10.f24459s0).f24749d7.edit();
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f27292a.L0.run();
                gh0Var.run();
                return;
            case 3:
                c40 c40Var = (c40) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) obj;
                if (i10 < arrayList.size()) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) c40Var.R2.d.f(ij.C1(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    c40Var.C1(groupCallParticipant, ij.C1(groupCallParticipant.peer), ((Integer) arrayList.get(i10)).intValue());
                    e30 e30Var = c40Var.W4;
                    if (e30Var != null) {
                        e30Var.dismiss();
                        return;
                    } else if (((Integer) arrayList.get(i10)).intValue() != 9 && ((Integer) arrayList.get(i10)).intValue() != 10 && ((Integer) arrayList.get(i10)).intValue() != 11) {
                        c40Var.f1(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                fi.d dVar = (fi.d) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.v2 v2Var = (org.telegram.ui.ActionBar.v2) obj;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    int i11 = this.f9791b;
                    pt.b(i11, context, new bi.v0(dVar, context, v2Var, i11, 8));
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                String str = (String) obj;
                RectF rectF = ProfileActivity.S6;
                ((org.telegram.ui.ActionBar.g1) ((AtomicReference) obj2).get()).dismiss();
                try {
                    org.telegram.messenger.g0.g(str);
                    if (i10 == profileActivity.N3) {
                        hc.a0(profileActivity).i(hd.M0(2131752761, null)).j();
                    } else {
                        hc.a0(profileActivity).i(hd.M0(2131752693, null)).j();
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            case 6:
                v91 v91Var = (v91) obj3;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj;
                qp messagesController = v91Var.getMessagesController();
                long j3 = -v91Var.f50619a;
                if (messagesController.r2(j3, tL_forumTopic.f27004id, null)) {
                    v91Var.getNotificationsController().G(j3, tL_forumTopic.f27004id, false);
                    v91Var.finishPreviewFragment();
                    if (hc.a(v91Var)) {
                        hc.z(v91Var, 4, 0, v91Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(i10);
                return;
            default:
                fi.d dVar2 = (fi.d) obj3;
                org.telegram.ui.ActionBar.v2 v2Var2 = (org.telegram.ui.ActionBar.v2) obj2;
                org.telegram.ui.ActionBar.f6 f6Var2 = (org.telegram.ui.ActionBar.f6) obj;
                if (!dVar2.Q) {
                    dVar2.setLoading(true);
                    org.telegram.ui.Wallet.k4 k4Var = new org.telegram.ui.Wallet.k4(dVar2, v2Var2, f6Var2, 0);
                    org.telegram.ui.Wallet.n0 x10 = org.telegram.ui.Wallet.n0.x(i10);
                    x10.m0(new d10(i10, k4Var, x10));
                    return;
                }
                return;
        }
    }

    public t5(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f9790a = i10;
        this.f9792c = obj;
        this.f9791b = i7;
        this.d = obj2;
        this.f9793e = obj3;
    }

    public t5(org.telegram.ui.ActionBar.f2 f2Var, Object obj, Serializable serializable, int i7, int i10) {
        this.f9790a = i10;
        this.f9792c = f2Var;
        this.d = obj;
        this.f9793e = serializable;
        this.f9791b = i7;
    }
}
