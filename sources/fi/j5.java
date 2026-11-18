package fi;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.RectF;
import android.view.KeyEvent;
import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.jt;
import org.telegram.messenger.mp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.lc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.f40;
import org.telegram.ui.h30;
import org.telegram.ui.lb;
import org.telegram.ui.lh0;
import org.telegram.ui.sv;
import org.telegram.ui.y91;
public final class j5 implements View.OnClickListener {
    public final int f12155a;
    public final int f12156b;
    public final Object f12157c;
    public final Object d;
    public final Object f12158e;

    public j5(KeyEvent.Callback callback, Object obj, int i7, Object obj2, int i10) {
        this.f12155a = i10;
        this.f12157c = callback;
        this.d = obj;
        this.f12156b = i7;
        this.f12158e = obj2;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f12155a;
        int i10 = this.f12156b;
        Object obj = this.f12158e;
        Object obj2 = this.d;
        Object obj3 = this.f12157c;
        switch (i7) {
            case 0:
                m5 m5Var = (m5) obj3;
                org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj;
                if (!((TLRPC.User) obj2).premium) {
                    m5Var.dismiss();
                    org.telegram.ui.ActionBar.h2 Q = LaunchActivity.Q();
                    if (Q != null) {
                        Q.showDialog(new ug.z0(Q, 14, false));
                        return;
                    }
                    return;
                } else if (m5Var.n1) {
                    m5Var.dismiss();
                    sv svVar = m5Var.f12273p1;
                    if (svVar != null) {
                        svVar.a(false);
                        return;
                    }
                    return;
                } else {
                    p6 R1 = mp.u1(m5Var.f30189a).R1();
                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode = R1.B;
                    if (tL_storiesStealthMode != null && ConnectionsManager.getInstance(m5Var.f30189a).getCurrentTime() <= tL_storiesStealthMode.cooldown_until_date) {
                        if (m5Var.n1) {
                            m5Var.dismiss();
                            sv svVar2 = m5Var.f12273p1;
                            if (svVar2 != null) {
                                svVar2.a(false);
                                return;
                            }
                            return;
                        }
                        new lc(m5Var.f30195c, i6Var).t(org.telegram.messenger.g0.W2(gd.M0(2131744649, null)), null).k(true);
                        return;
                    }
                    TL_stories.TL_stories_activateStealthMode tL_stories_activateStealthMode = new TL_stories.TL_stories_activateStealthMode();
                    tL_stories_activateStealthMode.future = true;
                    tL_stories_activateStealthMode.past = true;
                    TL_stories.TL_storiesStealthMode tL_storiesStealthMode2 = new TL_stories.TL_storiesStealthMode();
                    tL_storiesStealthMode2.flags |= 3;
                    tL_storiesStealthMode2.cooldown_until_date = ConnectionsManager.getInstance(m5Var.f30189a).getCurrentTime() + mp.u1(m5Var.f30189a).f25662h0;
                    tL_storiesStealthMode2.active_until_date = ConnectionsManager.getInstance(m5Var.f30189a).getCurrentTime() + mp.u1(m5Var.f30189a).f25653g0;
                    R1.i0(tL_storiesStealthMode2);
                    ConnectionsManager.getInstance(m5Var.f30189a).sendRequest(tL_stories_activateStealthMode, new k5(0));
                    try {
                        m5Var.f30192b.performHapticFeedback(3);
                    } catch (Exception unused) {
                    }
                    m5Var.dismiss();
                    if (i10 == 0) {
                        m5.J0();
                    }
                    sv svVar3 = m5Var.f12273p1;
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
                lh0 lh0Var = (lh0) obj;
                iArr[0] = ((Integer) view.getTag()).intValue();
                SharedPreferences.Editor edit = mp.u1(j10.f24773t0).f25660g7.edit();
                if (i10 == 1) {
                    edit.putInt("popupAll", iArr[0]);
                } else if (i10 == 0) {
                    edit.putInt("popupGroup", iArr[0]);
                } else {
                    edit.putInt("popupChannel", iArr[0]);
                }
                edit.commit();
                alertDialog$Builder.f28746a.M0.run();
                lh0Var.run();
                return;
            case 3:
                f40 f40Var = (f40) obj3;
                ArrayList arrayList = (ArrayList) obj2;
                TLRPC.GroupCallParticipant groupCallParticipant = (TLRPC.GroupCallParticipant) obj;
                if (i10 < arrayList.size()) {
                    TLRPC.GroupCallParticipant groupCallParticipant2 = (TLRPC.GroupCallParticipant) f40Var.V2.d.f(fj.B1(groupCallParticipant.peer));
                    if (groupCallParticipant2 != null) {
                        groupCallParticipant = groupCallParticipant2;
                    }
                    f40Var.D1(groupCallParticipant, fj.B1(groupCallParticipant.peer), ((Integer) arrayList.get(i10)).intValue());
                    h30 h30Var = f40Var.f47461e5;
                    if (h30Var != null) {
                        h30Var.dismiss();
                        return;
                    } else if (((Integer) arrayList.get(i10)).intValue() != 9 && ((Integer) arrayList.get(i10)).intValue() != 10 && ((Integer) arrayList.get(i10)).intValue() != 11) {
                        f40Var.g1(true);
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                hi.d dVar = (hi.d) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.x2 x2Var = (org.telegram.ui.ActionBar.x2) obj;
                if (!dVar.R) {
                    dVar.setLoading(true);
                    int i11 = this.f12156b;
                    jt.b(i11, context, new di.j0(dVar, context, x2Var, i11, 8));
                    return;
                }
                return;
            case 5:
                ProfileActivity profileActivity = (ProfileActivity) obj3;
                String str = (String) obj;
                RectF rectF = ProfileActivity.Z6;
                ((org.telegram.ui.ActionBar.h1) ((AtomicReference) obj2).get()).dismiss();
                try {
                    org.telegram.messenger.g0.g(str);
                    if (i10 == profileActivity.P3) {
                        lc.b0(profileActivity).i(gd.M0(2131752750, null)).j();
                    } else {
                        lc.b0(profileActivity).i(gd.M0(2131752682, null)).j();
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
                mp messagesController = y91Var.getMessagesController();
                long j3 = -y91Var.f54109a;
                if (messagesController.u2(j3, tL_forumTopic.f28457id, null)) {
                    y91Var.getNotificationsController().G(j3, tL_forumTopic.f28457id, false);
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

    public j5(Object obj, int i7, Object obj2, Object obj3, int i10) {
        this.f12155a = i10;
        this.f12157c = obj;
        this.f12156b = i7;
        this.d = obj2;
        this.f12158e = obj3;
    }

    public j5(org.telegram.ui.ActionBar.h2 h2Var, Object obj, Serializable serializable, int i7, int i10) {
        this.f12155a = i10;
        this.f12157c = h2Var;
        this.d = obj;
        this.f12158e = serializable;
        this.f12156b = i7;
    }
}
