package fi;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.view.View;
import c8.na;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.jt;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.g70;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.kr;
import org.telegram.ui.Components.me0;
import org.telegram.ui.Components.oe0;
import org.telegram.ui.Components.qf;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.e40;
import org.telegram.ui.g30;
import org.telegram.ui.kh0;
import org.telegram.ui.lb;
import org.telegram.ui.rv;
import org.telegram.ui.w91;
public final class k5 implements View.OnClickListener {
    public final int f12187a;
    public final int f12188b;
    public final Object f12189c;
    public final Object d;
    public final Object f12190e;

    public k5(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f12187a = i10;
        this.f12189c = obj;
        this.f12188b = i7;
        this.d = obj2;
        this.f12190e = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        int i7 = this.f12187a;
        int i10 = this.f12188b;
        Object obj = this.f12190e;
        Object obj2 = this.d;
        Object obj3 = this.f12189c;
        switch (i7) {
            case 0:
                n5 n5Var = (n5) obj3;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                if (!((TLRPC.User) obj2).premium) {
                    n5Var.dismiss();
                    org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new ug.y0(Q, 14, false));
                        return;
                    }
                    return;
                } else if (n5Var.n1) {
                    n5Var.dismiss();
                    rv rvVar = n5Var.f12308p1;
                    if (rvVar != null) {
                        rvVar.a(false);
                        return;
                    }
                    return;
                } else {
                    p6 R1 = mp.u1(n5Var.f30223a).R1();
                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = R1.B;
                    if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(n5Var.f30223a).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                        if (n5Var.n1) {
                            n5Var.dismiss();
                            rv rvVar2 = n5Var.f12308p1;
                            if (rvVar2 != null) {
                                rvVar2.a(false);
                                return;
                            }
                            return;
                        }
                        new kc(n5Var.f30229c, i6Var).t(org.telegram.messenger.g0.W2(gd.N0(2131744643, null)), null).k(true);
                        return;
                    }
                    TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
                    tL_stories_activateStealthMode.future = true;
                    tL_stories_activateStealthMode.past = true;
                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
                    tL_storiesStealthMode2.flags |= 3;
                    tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(n5Var.f30223a).getCurrentTime() + mp.u1(n5Var.f30223a).f25755h0;
                    tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(n5Var.f30223a).getCurrentTime() + mp.u1(n5Var.f30223a).f25746g0;
                    R1.i0(tL_storiesStealthMode2);
                    ConnectionsManager.getInstance(n5Var.f30223a).sendRequest(tL_stories_activateStealthMode, new l5(0));
                    try {
                        n5Var.f30226b.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                    n5Var.dismiss();
                    if (i10 == 0) {
                        n5.J0();
                    }
                    rv rvVar3 = n5Var.f12308p1;
                    if (rvVar3 != null) {
                        rvVar3.a(true);
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
                kh0 kh0Var = (kh0) obj;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = mp.u1(i10.f24637t0).f25753g7.edit();
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f28835a.M0.run();
                kh0Var.run();
                return;
            case 3:
                qf qfVar = (qf) obj3;
                final ji.k kVar = (ji.k) obj2;
                ArrayList arrayList = kVar.f18044b;
                bi.b1 b1Var = (bi.b1) obj;
                qfVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (final int i11 = 0; i11 < arrayList.size(); i11++) {
                    Context context = qfVar.f38823a.getContext();
                    CharSequence charSequence = (CharSequence) arrayList.get(i11);
                    if (i11 == kVar.f18045c) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    kr krVar = ai.l0.I0;
                    arrayList2.add(new ai.i0(context, charSequence, null, this.f12188b, z10));
                    arrayList3.add(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    kVar.d.a(Integer.valueOf(i11));
                                    return;
                                default:
                                    kVar.d.a(Integer.valueOf(i11));
                                    return;
                            }
                        }
                    });
                }
                b1Var.g(arrayList2, arrayList3);
                return;
            case 4:
                qf qfVar2 = (qf) obj3;
                final ji.k kVar2 = (ji.k) obj2;
                ArrayList arrayList4 = kVar2.f18044b;
                oe0 oe0Var = (oe0) obj;
                qfVar2.getClass();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (final int i12 = 0; i12 < arrayList4.size(); i12++) {
                    Context context2 = qfVar2.f38823a.getContext();
                    CharSequence charSequence2 = (CharSequence) arrayList4.get(i12);
                    if (i12 == kVar2.f18045c) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    kr krVar2 = ai.l0.I0;
                    arrayList5.add(new ai.i0(context2, charSequence2, null, this.f12188b, z11));
                    arrayList6.add(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    kVar2.d.a(Integer.valueOf(i12));
                                    return;
                                default:
                                    kVar2.d.a(Integer.valueOf(i12));
                                    return;
                            }
                        }
                    });
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = oe0Var.f38141s;
                Context context3 = oe0Var.f38134a;
                org.telegram.ui.ActionBar.i6 i6Var2 = oe0Var.f38140r;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232570, 0, context3, i6Var2);
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232062, gd.N0(2131753753, null), false, oe0Var.f38140r).setOnClickListener(new g70(oe0Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(new org.telegram.ui.ActionBar.d1(context3, i6Var2), na.o(-1, 8));
                for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                    View view2 = (View) arrayList5.get(i13);
                    view2.setBackground(org.telegram.ui.ActionBar.n6.h0(org.telegram.ui.ActionBar.n6.r1(0.12f, org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.E8, i6Var2)), 2, -1));
                    view2.setMinimumWidth(org.telegram.messenger.g0.L(220.0f));
                    view2.setOnClickListener(new me0(oe0Var, (Runnable) arrayList6.get(i13), 1));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(view2, na.o(-1, 44));
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(actionBarPopupWindow$ActionBarPopupWindowLayout.b(actionBarPopupWindow$ActionBarPopupWindowLayout2));
                return;
            case 5:
                e40 e40Var = (e40) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) obj;
                if (i10 < arrayList7.size()) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) e40Var.V2.d.f(fj.B1(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    e40Var.D1(groupCallParticipant, fj.B1(groupCallParticipant.peer), ((Integer) arrayList7.get(i10)).intValue());
                    g30 g30Var = e40Var.f47339e5;
                    if (g30Var != null) {
                        g30Var.dismiss();
                        return;
                    } else if (((Integer) arrayList7.get(i10)).intValue() != 9 && ((Integer) arrayList7.get(i10)).intValue() != 10 && ((Integer) arrayList7.get(i10)).intValue() != 11) {
                        e40Var.g1(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 6:
                hi.e eVar = (hi.e) obj3;
                Context context4 = (Context) obj2;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj;
                if (!eVar.R) {
                    eVar.setLoading(true);
                    int i14 = this.f12188b;
                    jt.b(i14, context4, new di.j0(eVar, context4, w2Var, i14, 8));
                    return;
                }
                return;
            case 7:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                String str = (String) obj;
                RectF rectF = ProfileActivity.Z6;
                ((org.telegram.ui.ActionBar.g1) ((AtomicReference) obj2).get()).dismiss();
                try {
                    org.telegram.messenger.g0.g(str);
                    if (i10 == profileActivity.P3) {
                        kc.b0(profileActivity).i(gd.N0(2131752749, null)).j();
                    } else {
                        kc.b0(profileActivity).i(gd.N0(2131752681, null)).j();
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                w91 w91Var = (w91) obj3;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj;
                mp messagesController = w91Var.getMessagesController();
                long j3 = -w91Var.f53216a;
                if (messagesController.u2(j3, tL_forumTopic.f28544id, null)) {
                    w91Var.getNotificationsController().G(j3, tL_forumTopic.f28544id, false);
                    w91Var.finishPreviewFragment();
                    if (kc.a(w91Var)) {
                        kc.z(w91Var, 4, 0, w91Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(i10);
                return;
        }
    }

    public k5(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f12187a = i10;
        this.f12189c = obj;
        this.d = obj2;
        this.f12188b = i7;
        this.f12190e = obj3;
    }

    public k5(org.telegram.ui.ActionBar.g2 g2Var, Object obj, Serializable serializable, int i7, int i10) {
        this.f12187a = i10;
        this.f12189c = g2Var;
        this.d = obj;
        this.f12190e = serializable;
        this.f12188b = i7;
    }
}
