package fi;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.mt;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.c40;
import org.telegram.ui.e30;
import org.telegram.ui.ih0;
import org.telegram.ui.lb;
import org.telegram.ui.pv;
import org.telegram.ui.u91;
public final class l5 implements View.OnClickListener {
    public final int f11994a;
    public final int f11995b;
    public final Object f11996c;
    public final Object d;
    public final Object f11997e;

    public l5(KeyEvent.Callback callback, Object obj, int i7, Object obj2, int i10) {
        this.f11994a = i10;
        this.f11996c = callback;
        this.d = obj;
        this.f11995b = i7;
        this.f11997e = obj2;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f11994a;
        int i10 = this.f11995b;
        Object obj = this.f11997e;
        Object obj2 = this.d;
        Object obj3 = this.f11996c;
        switch (i7) {
            case 0:
                o5 o5Var = (o5) obj3;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                if (!((TLRPC.User) obj2).premium) {
                    o5Var.dismiss();
                    org.telegram.ui.ActionBar.e2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new ug.x0(Q, 14, false));
                        return;
                    }
                    return;
                } else if (o5Var.n1) {
                    o5Var.dismiss();
                    pv pvVar = o5Var.f12121p1;
                    if (pvVar != null) {
                        pvVar.a(false);
                        return;
                    }
                    return;
                } else {
                    s6 P1 = np.s1(o5Var.f29679a).P1();
                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = P1.B;
                    if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(o5Var.f29679a).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                        if (o5Var.n1) {
                            o5Var.dismiss();
                            pv pvVar2 = o5Var.f12121p1;
                            if (pvVar2 != null) {
                                pvVar2.a(false);
                                return;
                            }
                            return;
                        }
                        new cc(o5Var.f29685c, e6Var).t(org.telegram.messenger.g0.X2(hd.M0(2131744884, null)), null).k(true);
                        return;
                    }
                    TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
                    tL_stories_activateStealthMode.future = true;
                    tL_stories_activateStealthMode.past = true;
                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
                    tL_storiesStealthMode2.flags |= 3;
                    tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(o5Var.f29679a).getCurrentTime() + np.s1(o5Var.f29679a).f25294h0;
                    tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(o5Var.f29679a).getCurrentTime() + np.s1(o5Var.f29679a).f25285g0;
                    P1.i0(tL_storiesStealthMode2);
                    ConnectionsManager.getInstance(o5Var.f29679a).sendRequest(tL_stories_activateStealthMode, new m5(0));
                    try {
                        o5Var.f29682b.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                    o5Var.dismiss();
                    if (i10 == 0) {
                        o5.I0();
                    }
                    pv pvVar3 = o5Var.f12121p1;
                    if (pvVar3 != null) {
                        pvVar3.a(true);
                        return;
                    }
                    return;
                }
            case 1:
                lb.b0((lb) obj3, i10, (ArrayList) obj2, (Integer) obj);
                return;
            case 2:
                int[] iArr = (int[]) obj3;
                AlertDialog$Builder alertDialog$Builder = (AlertDialog$Builder) obj2;
                ih0 ih0Var = (ih0) obj;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = np.s1(m10.f24940t0).f25273e7.edit();
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f28392a.M0.run();
                ih0Var.run();
                return;
            case 3:
                c40 c40Var = (c40) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) obj;
                if (i10 < arrayList.size()) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) c40Var.V2.d.f(gj.B1(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    c40Var.C1(groupCallParticipant, gj.B1(groupCallParticipant.peer), ((Integer) arrayList.get(i10)).intValue());
                    e30 e30Var = c40Var.f45903e5;
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
                hi.d dVar = (hi.d) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.u2 u2Var = (org.telegram.ui.ActionBar.u2) obj;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    int i11 = this.f11995b;
                    mt.b(i11, context, new di.k0(dVar, context, u2Var, i11, 8));
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                String str = (String) obj;
                RectF rectF = ProfileActivity.X6;
                ((org.telegram.ui.ActionBar.g1) ((AtomicReference) obj2).get()).dismiss();
                try {
                    org.telegram.messenger.g0.g(str);
                    if (i10 == profileActivity.P3) {
                        cc.a0(profileActivity).i(hd.M0(2131752761, null)).j();
                    } else {
                        cc.a0(profileActivity).i(hd.M0(2131752693, null)).j();
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                u91 u91Var = (u91) obj3;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj;
                np messagesController = u91Var.getMessagesController();
                long j3 = -u91Var.f51835a;
                if (messagesController.r2(j3, tL_forumTopic.f28103id, null)) {
                    u91Var.getNotificationsController().G(j3, tL_forumTopic.f28103id, false);
                    u91Var.finishPreviewFragment();
                    if (cc.a(u91Var)) {
                        cc.z(u91Var, 4, 0, u91Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(i10);
                return;
        }
    }

    public l5(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f11994a = i10;
        this.f11996c = obj;
        this.f11995b = i7;
        this.d = obj2;
        this.f11997e = obj3;
    }

    public l5(org.telegram.ui.ActionBar.e2 e2Var, Object obj, Serializable serializable, int i7, int i10) {
        this.f11994a = i10;
        this.f11996c = e2Var;
        this.d = obj;
        this.f11997e = serializable;
        this.f11995b = i7;
    }
}
