package fi;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.view.View;
import c8.na;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.kt;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.ne0;
import org.telegram.ui.Components.nr;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.qf;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.f40;
import org.telegram.ui.h30;
import org.telegram.ui.lb;
import org.telegram.ui.mh0;
import org.telegram.ui.sv;
import org.telegram.ui.y91;
public final class j5 implements View.OnClickListener {
    public final int f12147a;
    public final int f12148b;
    public final Object f12149c;
    public final Object d;
    public final Object f12150e;

    public j5(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f12147a = i10;
        this.f12149c = obj;
        this.f12148b = i7;
        this.d = obj2;
        this.f12150e = obj3;
    }

    @Override
    public final void onClick(View view) {
        boolean z10;
        boolean z11;
        int i7 = this.f12147a;
        int i10 = this.f12148b;
        Object obj = this.f12150e;
        Object obj2 = this.d;
        Object obj3 = this.f12149c;
        switch (i7) {
            case 0:
                m5 m5Var = (m5) obj3;
                org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj;
                if (!((TLRPC.User) obj2).premium) {
                    m5Var.dismiss();
                    org.telegram.ui.ActionBar.g2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new ug.y0(Q, 14, false));
                        return;
                    }
                    return;
                } else if (m5Var.n1) {
                    m5Var.dismiss();
                    sv svVar = m5Var.f12265p1;
                    if (svVar != null) {
                        svVar.a(false);
                        return;
                    }
                    return;
                } else {
                    p6 R1 = np.u1(m5Var.f30139a).R1();
                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = R1.B;
                    if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(m5Var.f30139a).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                        if (m5Var.n1) {
                            m5Var.dismiss();
                            sv svVar2 = m5Var.f12265p1;
                            if (svVar2 != null) {
                                svVar2.a(false);
                                return;
                            }
                            return;
                        }
                        new lc(m5Var.f30145c, h6Var).t(org.telegram.messenger.g0.W2(hd.N0(2131744643, null)), null).k(true);
                        return;
                    }
                    TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
                    tL_stories_activateStealthMode.future = true;
                    tL_stories_activateStealthMode.past = true;
                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
                    tL_storiesStealthMode2.flags |= 3;
                    tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(m5Var.f30139a).getCurrentTime() + np.u1(m5Var.f30139a).f25823h0;
                    tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(m5Var.f30139a).getCurrentTime() + np.u1(m5Var.f30139a).f25814g0;
                    R1.i0(tL_storiesStealthMode2);
                    ConnectionsManager.getInstance(m5Var.f30139a).sendRequest(tL_stories_activateStealthMode, new k5(0));
                    try {
                        m5Var.f30142b.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                    m5Var.dismiss();
                    if (i10 == 0) {
                        m5.J0();
                    }
                    sv svVar3 = m5Var.f12265p1;
                    if (svVar3 != null) {
                        svVar3.a(true);
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
                mh0 mh0Var = (mh0) obj;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = np.u1(k10.f24932t0).f25821g7.edit();
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f28743a.M0.run();
                mh0Var.run();
                return;
            case 3:
                qf qfVar = (qf) obj3;
                final ji.j jVar = (ji.j) obj2;
                ArrayList arrayList = jVar.f17939b;
                bi.b1 b1Var = (bi.b1) obj;
                qfVar.getClass();
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                for (final int i11 = 0; i11 < arrayList.size(); i11++) {
                    Context context = qfVar.f38848a.getContext();
                    CharSequence charSequence = (CharSequence) arrayList.get(i11);
                    if (i11 == jVar.f17940c) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    nr nrVar = ai.k0.I0;
                    arrayList2.add(new ai.h0(context, charSequence, null, this.f12148b, z10));
                    arrayList3.add(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    jVar.d.a(Integer.valueOf(i11));
                                    return;
                                default:
                                    jVar.d.a(Integer.valueOf(i11));
                                    return;
                            }
                        }
                    });
                }
                b1Var.g(arrayList2, arrayList3);
                return;
            case 4:
                qf qfVar2 = (qf) obj3;
                final ji.j jVar2 = (ji.j) obj2;
                ArrayList arrayList4 = jVar2.f17939b;
                pe0 pe0Var = (pe0) obj;
                qfVar2.getClass();
                ArrayList arrayList5 = new ArrayList();
                ArrayList arrayList6 = new ArrayList();
                for (final int i12 = 0; i12 < arrayList4.size(); i12++) {
                    Context context2 = qfVar2.f38848a.getContext();
                    CharSequence charSequence2 = (CharSequence) arrayList4.get(i12);
                    if (i12 == jVar2.f17940c) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    nr nrVar2 = ai.k0.I0;
                    arrayList5.add(new ai.h0(context2, charSequence2, null, this.f12148b, z11));
                    arrayList6.add(new Runnable() {
                        @Override
                        public final void run() {
                            switch (r3) {
                                case 0:
                                    jVar2.d.a(Integer.valueOf(i12));
                                    return;
                                default:
                                    jVar2.d.a(Integer.valueOf(i12));
                                    return;
                            }
                        }
                    });
                }
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = pe0Var.f38539s;
                Context context3 = pe0Var.f38532a;
                org.telegram.ui.ActionBar.h6 h6Var2 = pe0Var.f38538r;
                ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout2 = new ActionBarPopupWindow$ActionBarPopupWindowLayout(2131232567, 0, context3, h6Var2);
                org.telegram.ui.ActionBar.q0.c(false, false, actionBarPopupWindow$ActionBarPopupWindowLayout2, 2131232059, hd.N0(2131753753, null), false, pe0Var.f38538r).setOnClickListener(new j70(pe0Var, 7));
                actionBarPopupWindow$ActionBarPopupWindowLayout2.a(new org.telegram.ui.ActionBar.d1(context3, h6Var2), na.o(-1, 8));
                for (int i13 = 0; i13 < arrayList5.size(); i13++) {
                    View view2 = (View) arrayList5.get(i13);
                    view2.setBackground(org.telegram.ui.ActionBar.m6.h0(org.telegram.ui.ActionBar.m6.r1(0.12f, org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.E8, h6Var2)), 2, -1));
                    view2.setMinimumWidth(org.telegram.messenger.g0.L(220.0f));
                    view2.setOnClickListener(new ne0(pe0Var, (Runnable) arrayList6.get(i13), 1));
                    actionBarPopupWindow$ActionBarPopupWindowLayout2.a(view2, na.o(-1, 44));
                }
                actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().e(actionBarPopupWindow$ActionBarPopupWindowLayout.b(actionBarPopupWindow$ActionBarPopupWindowLayout2));
                return;
            case 5:
                f40 f40Var = (f40) obj3;
                ArrayList arrayList7 = (ArrayList) obj2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) obj;
                if (i10 < arrayList7.size()) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) f40Var.V2.d.f(gj.B1(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    f40Var.D1(groupCallParticipant, gj.B1(groupCallParticipant.peer), ((Integer) arrayList7.get(i10)).intValue());
                    h30 h30Var = f40Var.f47451e5;
                    if (h30Var != null) {
                        h30Var.dismiss();
                        return;
                    } else if (((Integer) arrayList7.get(i10)).intValue() != 9 && ((Integer) arrayList7.get(i10)).intValue() != 10 && ((Integer) arrayList7.get(i10)).intValue() != 11) {
                        f40Var.g1(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 6:
                hi.d dVar = (hi.d) obj3;
                Context context4 = (Context) obj2;
                org.telegram.ui.ActionBar.w2 w2Var = (org.telegram.ui.ActionBar.w2) obj;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    int i14 = this.f12148b;
                    kt.b(i14, context4, new di.j0(dVar, context4, w2Var, i14, 8));
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
                        lc.b0(profileActivity).i(hd.N0(2131752749, null)).j();
                    } else {
                        lc.b0(profileActivity).i(hd.N0(2131752681, null)).j();
                    }
                    return;
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                    return;
                }
            default:
                y91 y91Var = (y91) obj3;
                TLRPC.TL_forumTopic tL_forumTopic = (TLRPC.TL_forumTopic) obj2;
                ActionBarPopupWindow$ActionBarPopupWindowLayout[] actionBarPopupWindow$ActionBarPopupWindowLayoutArr = (ActionBarPopupWindow$ActionBarPopupWindowLayout[]) obj;
                np messagesController = y91Var.getMessagesController();
                long j3 = -y91Var.f54075a;
                if (messagesController.u2(j3, tL_forumTopic.f28450id, null)) {
                    y91Var.getNotificationsController().G(j3, tL_forumTopic.f28450id, false);
                    y91Var.finishPreviewFragment();
                    if (lc.a(y91Var)) {
                        lc.z(y91Var, 4, 0, y91Var.getResourceProvider()).j();
                        return;
                    }
                    return;
                }
                actionBarPopupWindow$ActionBarPopupWindowLayoutArr[0].getSwipeBack().e(i10);
                return;
        }
    }

    public j5(Object obj, Object obj2, int i7, Object obj3, int i10) {
        this.f12147a = i10;
        this.f12149c = obj;
        this.d = obj2;
        this.f12148b = i7;
        this.f12150e = obj3;
    }

    public j5(org.telegram.ui.ActionBar.g2 g2Var, Object obj, Serializable serializable, int i7, int i10) {
        this.f12147a = i10;
        this.f12149c = g2Var;
        this.d = obj;
        this.f12150e = serializable;
        this.f12148b = i7;
    }
}
