package mi;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.TextUtils;
import android.util.Pair;
import android.view.Surface;
import android.view.View;
import b8.yd;
import ci.w9;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.a8;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.ic;
import org.telegram.messenger.ir;
import org.telegram.messenger.lr;
import org.telegram.messenger.pr;
import org.telegram.messenger.so;
import org.telegram.messenger.wy;
import org.telegram.messenger.yl;
import org.telegram.messenger.yy;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.la0;
import org.telegram.ui.Components.th0;
import org.telegram.ui.Components.ui0;
import org.telegram.ui.Components.vs;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ad;
import org.telegram.ui.bo;
import org.telegram.ui.cb;
import org.telegram.ui.hb;
import org.telegram.ui.hm;
import org.telegram.ui.kb;
import org.telegram.ui.kh;
import org.telegram.ui.ln;
import org.telegram.ui.m91;
import org.telegram.ui.mn;
import org.telegram.ui.nw;
import org.telegram.ui.oi;
import org.telegram.ui.qo;
import org.telegram.ui.um;
import org.telegram.ui.uw;
import org.telegram.ui.wm;
public final class d4 implements h4, vs, o4.n0, g2.k, o4.f1, oi.n, org.telegram.ui.Cells.u, gj0, org.telegram.ui.ActionBar.p1, nw, org.telegram.ui.w4, org.telegram.ui.Components.r4, so, ic, ui0, th0, ir, ResultCallback, lr {
    public final int f19562a;
    public final Object f19563b;
    public final Object f19564c;

    public d4(int i3, Object obj, Object obj2) {
        this.f19562a = i3;
        this.f19563b = obj;
        this.f19564c = obj2;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public void L(int i3, int i10, boolean z10) {
        switch (this.f19562a) {
            case 18:
                wm wmVar = (wm) this.f19563b;
                wmVar.C8();
                yy.Y(wmVar.getAccountInstance(), (Uri) this.f19564c, wmVar.f51376k6, wmVar.E5, wmVar.f51397m4, null, wmVar.G5, z10, i3, wmVar.W8());
                return;
            case 19:
            default:
                hm hmVar = (hm) this.f19563b;
                zi ziVar = (zi) this.f19564c;
                if (z10) {
                    hmVar.f45934a.getMessagesController().v(ziVar.f26868k.f27022id, i3, org.telegram.messenger.m5.o(ziVar.f26868k.peer_id), null, false);
                    return;
                }
                return;
            case 20:
                wm wmVar2 = (wm) this.f19563b;
                wmVar2.getSendMessagesHelper().r0(wy.b((String) this.f19564c, wmVar2.f51376k6, wmVar2.E5, wmVar2.f51397m4, null, false, null, null, null, z10, i3, 0, null, false));
                wmVar2.f51237a0.setFieldText("");
                wmVar2.B9(false);
                return;
        }
    }

    @Override
    public boolean N(uw uwVar) {
        return false;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        wm.O0((wm) this.f19563b, (Context) this.f19564c, tL_error);
        return false;
    }

    @Override
    public void accept(Object obj) {
        switch (this.f19562a) {
            case 4:
                o4.h1 h1Var = (o4.h1) this.f19563b;
                d2.s1 s1Var = (d2.s1) this.f19564c;
                o4.l1 l1Var = (o4.l1) obj;
                h1Var.getClass();
                g9.l0 l0Var = s1Var.H;
                if (!l0Var.isEmpty()) {
                    d2.r1 c2 = s1Var.a().c();
                    g9.g2 it = l0Var.values().iterator();
                    while (it.hasNext()) {
                        d2.p1 p1Var = (d2.p1) it.next();
                        d2.o1 o1Var = (d2.o1) h1Var.d.f12137n.get(p1Var.f8284a.f8253b);
                        if (o1Var != null && p1Var.f8284a.f8252a == o1Var.f8252a) {
                            c2.a(new d2.p1(o1Var, p1Var.f8285b));
                        } else {
                            c2.a(p1Var);
                        }
                    }
                    s1Var = c2.b();
                }
                l1Var.g0(s1Var);
                return;
            case 5:
                o4.v vVar = (o4.v) this.f19564c;
                o4.l1 l1Var2 = (o4.l1) obj;
                o4.e0 e0Var = (o4.e0) ((o4.h1) this.f19563b).f20660a.get();
                if (e0Var != null && !e0Var.j()) {
                    e0Var.g(vVar, false);
                    return;
                }
                return;
            default:
                o4.h1 h1Var2 = (o4.h1) this.f19563b;
                Surface surface = (Surface) this.f19564c;
                o4.l1 l1Var3 = (o4.l1) obj;
                ((o4.e0) h1Var2.f20660a.get()).getClass();
                if (surface == null) {
                    l1Var3.Q(null);
                    h1Var2.f20665i = null;
                    return;
                }
                o4.g1 g1Var = new o4.g1(surface);
                h1Var2.f20665i = g1Var;
                l1Var3.Q(g1Var);
                return;
        }
    }

    @Override
    public void b(float f10, float f11, int i3, View view) {
        float f12;
        org.telegram.ui.i4 i4Var = (org.telegram.ui.i4) this.f19563b;
        org.telegram.ui.l3 l3Var = (org.telegram.ui.l3) this.f19564c;
        if (i4Var.L == null || i3 - 1 >= 0) {
            h9 h9Var = i4Var.Q0;
            if (h9Var != null) {
                if (h9Var.x()) {
                    i4Var.Q0.f(false);
                    return;
                }
                i4Var.Q0.f(false);
            }
            org.telegram.ui.g4 adapter = l3Var.getAdapter();
            if ((view instanceof org.telegram.ui.o3) && adapter.F != null) {
                org.telegram.ui.o3 o3Var = (org.telegram.ui.o3) view;
                if (i4Var.I0 == 0) {
                    if ((!o3Var.f48177c || f10 >= view.getMeasuredWidth() / 2) && !o3Var.d) {
                        TLObject f22 = hp.s1(i4Var.Y).f2("previews");
                        if (f22 instanceof TLRPC.TL_user) {
                            i4Var.N(adapter.F.f27156id, (TLRPC.User) f22);
                            return;
                        }
                        int i10 = h10.f22829t0;
                        long j10 = adapter.F.f27156id;
                        i4Var.Z(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        i4Var.I0 = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new yl(i4Var, i10, j10));
                    }
                }
            } else if (i3 >= 0 && i3 < adapter.d.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i3);
                TL_iv.PageBlock x10 = org.telegram.ui.i4.x(pageBlock);
                if (x10 instanceof org.telegram.ui.v3) {
                    x10 = ((org.telegram.ui.v3) x10).f50370b;
                }
                if (x10 instanceof TL_iv.pageBlockChannel) {
                    hp.s1(i4Var.Y).y3(org.telegram.messenger.t3.K(((TL_iv.pageBlockChannel) x10).channel, false), i4Var.N, 2, null);
                    i4Var.m(false, true);
                } else if (x10 instanceof org.telegram.ui.b4) {
                    org.telegram.ui.b4 b4Var = (org.telegram.ui.b4) x10;
                    i4Var.O(b4Var.f43913a.articles.get(b4Var.f43914b).url, null, null);
                } else if (x10 instanceof TL_iv.pageBlockDetails) {
                    View w10 = org.telegram.ui.i4.w(view);
                    if (w10 instanceof org.telegram.ui.k1) {
                        i4Var.d = null;
                        i4Var.f46114f = null;
                        if (adapter.f45516e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) x10;
                            pageblockdetails.open = !pageblockdetails.open;
                            int b10 = adapter.b();
                            adapter.M();
                            int abs = Math.abs(adapter.b() - b10);
                            org.telegram.ui.k1 k1Var = (org.telegram.ui.k1) w10;
                            AnimatedArrowDrawable animatedArrowDrawable = k1Var.f46740f;
                            if (pageblockdetails.open) {
                                f12 = 0.0f;
                            } else {
                                f12 = 1.0f;
                            }
                            animatedArrowDrawable.a(f12);
                            k1Var.invalidate();
                            if (abs != 0) {
                                if (pageblockdetails.open) {
                                    adapter.o(i3 + 1, abs);
                                } else {
                                    adapter.p(i3 + 1, abs);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void c(o4.v vVar) {
        switch (this.f19562a) {
            case 2:
                ((o4.d) this.f19564c).f(((o4.o0) this.f19563b).h.f20636t);
                return;
            default:
                o4.o0 o0Var = (o4.o0) this.f19563b;
                o0Var.getClass();
                String str = ((p4.h) this.f19564c).f53151a;
                if (TextUtils.isEmpty(str)) {
                    g2.a.l("MediaSessionLegacyStub", "onRemoveQueueItem(): Media ID shouldn't be null");
                    return;
                }
                o4.l1 l1Var = o0Var.h.f20636t;
                if (!l1Var.m0(17)) {
                    g2.a.l("MediaSessionLegacyStub", "Can't remove item by ID without COMMAND_GET_TIMELINE being available");
                    return;
                }
                d2.n1 y02 = l1Var.y0();
                d2.m1 m1Var = new d2.m1();
                for (int i3 = 0; i3 < y02.o(); i3++) {
                    if (TextUtils.equals(y02.m(i3, m1Var, 0L).f8210c.f8240a, str)) {
                        l1Var.O(i3);
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public void d(org.telegram.ui.e5 e5Var) {
        cb cbVar = (cb) this.f19563b;
        TLRPC.User user = (TLRPC.User) this.f19564c;
        int ordinal = e5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                hb hbVar = cbVar.f44282a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f27150id);
                    org.telegram.ui.ActionBar.d2 d2Var = hbVar.f45891n;
                    if (d2Var.getMessagesController().E(bundle, d2Var, null, null)) {
                        d2Var.presentFragment(new wm(bundle));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        cbVar.a(user);
    }

    @Override
    public void e(h0 h0Var) {
        switch (this.f19562a) {
            case 9:
                org.telegram.messenger.g0.h3(new lg.y((SpannableString) this.f19563b, h0Var, (org.telegram.messenger.voip.l0) this.f19564c, 15));
                return;
            default:
                org.telegram.messenger.g0.h3(new lg.y((SpannableString) this.f19563b, h0Var, (w9) this.f19564c, 16));
                return;
        }
    }

    @Override
    public void f(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        zi ziVar = (zi) this.f19564c;
        wm wmVar = ((kh) this.f19563b).f46947p;
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("report_reaction_message_id", ziVar.f1());
        bundle.putLong("report_reaction_from_dialog_id", wmVar.f51376k6);
        wmVar.presentFragment(new ProfileActivity(bundle, null));
        wmVar.O7(true);
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f19562a) {
            case 13:
                org.telegram.ui.r4 r4Var = (org.telegram.ui.r4) this.f19563b;
                r4Var.getClass();
                s1Var.dismiss();
                r4Var.b0((View) this.f19564c, true);
                return;
            case 14:
            case 16:
            default:
                bo boVar = (bo) this.f19563b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = hp.i1((TLRPC.Chat) this.f19564c);
                tL_channels_updateUsername.username = "";
                boVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new mn(boVar, 0), 64);
                return;
            case 15:
                sf.c.p(((kb) this.f19563b).getParentActivity(), (String) this.f19564c, true);
                return;
            case 17:
                ad.a0((ad) this.f19563b, (TLRPC.Chat) this.f19564c);
                return;
        }
    }

    @Override
    public void h() {
        wm wmVar = (wm) this.f19563b;
        wmVar.getClass();
        ((pi.q) this.f19564c).g();
        wmVar.M9();
    }

    @Override
    public Object i(o4.e0 e0Var, o4.v vVar, int i3) {
        switch (this.f19562a) {
            case 7:
                o4.f1 f1Var = (o4.f1) this.f19563b;
                o4.v0 v0Var = (o4.v0) this.f19564c;
                if (e0Var.j()) {
                    return yd.b(new o4.r1(-100));
                }
                return g2.n0.g0((l9.y) f1Var.i(e0Var, vVar, i3), new aa.a(e0Var, vVar, v0Var, 15));
            default:
                o4.f1 f1Var2 = (o4.f1) this.f19563b;
                o4.e1 e1Var = (o4.e1) this.f19564c;
                if (e0Var.j()) {
                    return yd.b(new o4.r1(-100));
                }
                return g2.n0.g0((l9.y) f1Var2.i(e0Var, vVar, i3), new aa.a(e0Var, vVar, e1Var, 16));
        }
    }

    @Override
    public void m() {
        n5 n5Var = (n5) this.f19563b;
        q5 q5Var = (q5) this.f19564c;
        TL_iv.pageTableCell pagetablecell = q5Var.f19843b;
        if (pagetablecell != null) {
            f6.d(pagetablecell, q5Var.f19842a.getText());
        }
        b3 b3Var = n5Var.F;
        if (b3Var != null && n5Var.f20029a != null) {
            t3.S1(b3Var.f19478a);
        }
    }

    @Override
    public void o(boolean z10) {
        long j10 = ((TLRPC.User) this.f19564c).f27150id;
        wm wmVar = ((oi) this.f19563b).f48298b;
        long j11 = wmVar.f51475s4;
        if (j10 != j11) {
            return;
        }
        wmVar.Qa(j11, false);
    }

    @Override
    public void onComplete(Object obj) {
        um umVar = (um) this.f19563b;
        la0 la0Var = (la0) this.f19564c;
        Pair pair = (Pair) obj;
        umVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            org.telegram.ui.ActionBar.p3 p3Var = umVar.f50124f;
            if (p3Var != null && longValue == p3Var.h(umVar.f50134q ? 1 : 0) && bitmap != null) {
                la0Var.f35670x = bitmap;
                la0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public void run(long j10) {
        boolean z10;
        switch (this.f19562a) {
            case 0:
                TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                tL_inlineButtonTypeUserProfile.user_id = j10;
                ((q3) this.f19563b).a((String) this.f19564c, tL_inlineButtonTypeUserProfile);
                return;
            case 27:
                ln lnVar = (ln) this.f19563b;
                lnVar.getClass();
                ((org.telegram.ui.ActionBar.s1) this.f19564c).dismiss();
                boolean z11 = false;
                lnVar.O0 = false;
                if (j10 != 0) {
                    lnVar.f47394w0 = j10;
                    TLRPC.Chat M0 = lnVar.getMessagesController().M0(Long.valueOf(j10));
                    lnVar.f47396x0 = M0;
                    TLRPC.ChatFull chatFull = lnVar.f47398y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    if (M0.forum_tabs != lnVar.H0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (M0.forum_sidebar != lnVar.I0) {
                        z11 = true;
                    }
                    lnVar.getMessagesController().a5(lnVar.f47394w0, lnVar.F0, lnVar.H0, lnVar.I0);
                    TLRPC.Chat chat = lnVar.f47396x0;
                    chat.forum = lnVar.F0;
                    chat.forum_tabs = lnVar.H0;
                    chat.forum_sidebar = lnVar.I0;
                    if (z10 || z11) {
                        lnVar.v0(z10);
                        return;
                    }
                    return;
                }
                return;
            default:
                qo qoVar = (qo) this.f19563b;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) this.f19564c;
                if (j10 != 0) {
                    qoVar.getMessagesController().b5(j10, false);
                    qoVar.d0(qoVar.getMessagesController().M0(Long.valueOf(j10)), d2Var);
                    return;
                }
                qoVar.getClass();
                return;
        }
    }

    @Override
    public void s(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f19564c;
        a8.d("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f19563b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public boolean y(uw uwVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i3, int i10, m91 m91Var) {
        org.telegram.ui.z5 z5Var = (org.telegram.ui.z5) this.f19563b;
        ArrayList arrayList2 = z5Var.f52535c;
        ((uw) this.f19564c).finishFragment();
        org.telegram.messenger.s2 s2Var = null;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z12 = true;
            if (i12 >= arrayList.size()) {
                break;
            }
            int i13 = 0;
            while (true) {
                if (i13 < z5Var.d.size()) {
                    if (((org.telegram.messenger.s2) z5Var.d.get(i13)).f25268a == ((pr) arrayList.get(i12)).f24797a) {
                        s2Var = (org.telegram.messenger.s2) z5Var.d.get(i13);
                        break;
                    }
                    i13++;
                } else {
                    z12 = false;
                    break;
                }
            }
            if (!z12) {
                int i14 = 2;
                if (z5Var.getMessagesController().f23111r7.c(z5Var.f52536e) == 2) {
                    i14 = 3;
                }
                ArrayList arrayList3 = z5Var.d;
                org.telegram.messenger.s2 s2Var2 = new org.telegram.messenger.s2(((pr) arrayList.get(i12)).f24797a, i14);
                arrayList3.add(s2Var2);
                s2Var = s2Var2;
            }
            i12++;
        }
        z5Var.getMessagesController().f23111r7.h(z5Var.f52536e, z5Var.d);
        z5Var.Z();
        if (s2Var != null) {
            int i15 = 0;
            while (true) {
                if (i15 < arrayList2.size()) {
                    if (((org.telegram.ui.y5) arrayList2.get(i15)).f52193c != null && ((org.telegram.ui.y5) arrayList2.get(i15)).f52193c.f25268a == s2Var.f25268a) {
                        i11 = i15;
                        break;
                    }
                    i15++;
                } else {
                    break;
                }
            }
            z5Var.f52534b.v0(i11);
            org.telegram.messenger.g0.i3(new org.telegram.messenger.voip.l0(16, z5Var, s2Var), 150L);
        }
        return true;
    }

    public d4(cb cbVar, org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        this.f19562a = 16;
        this.f19563b = cbVar;
        this.f19564c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
