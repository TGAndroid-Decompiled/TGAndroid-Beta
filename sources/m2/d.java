package m2;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import bg.f0;
import h2.o;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import oi.c6;
import oi.d4;
import oi.e1;
import oi.g0;
import oi.h0;
import oi.k0;
import oi.k5;
import oi.n5;
import oi.q3;
import oi.y2;
import org.telegram.messenger.a8;
import org.telegram.messenger.cz;
import org.telegram.messenger.dd;
import org.telegram.messenger.ez;
import org.telegram.messenger.fm;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.messenger.m5;
import org.telegram.messenger.nc;
import org.telegram.messenger.np;
import org.telegram.messenger.nr;
import org.telegram.messenger.qr;
import org.telegram.messenger.s2;
import org.telegram.messenger.t3;
import org.telegram.messenger.ur;
import org.telegram.messenger.yo;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.k;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.ActionBar.p3;
import org.telegram.ui.ActionBar.q1;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.Cells.h9;
import org.telegram.ui.Cells.u;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.d0;
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.hj0;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.ra0;
import org.telegram.ui.Components.uh0;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.a4;
import org.telegram.ui.ad;
import org.telegram.ui.an;
import org.telegram.ui.c5;
import org.telegram.ui.db;
import org.telegram.ui.e4;
import org.telegram.ui.g4;
import org.telegram.ui.ho;
import org.telegram.ui.ib;
import org.telegram.ui.j1;
import org.telegram.ui.k3;
import org.telegram.ui.ka1;
import org.telegram.ui.lb;
import org.telegram.ui.lm;
import org.telegram.ui.mp;
import org.telegram.ui.n3;
import org.telegram.ui.oh;
import org.telegram.ui.p4;
import org.telegram.ui.po;
import org.telegram.ui.qn;
import org.telegram.ui.rn;
import org.telegram.ui.si;
import org.telegram.ui.sw;
import org.telegram.ui.to;
import org.telegram.ui.tr;
import org.telegram.ui.u3;
import org.telegram.ui.u4;
import org.telegram.ui.u5;
import org.telegram.ui.u91;
import org.telegram.ui.x5;
import org.telegram.ui.y5;
import org.telegram.ui.ym;
import org.telegram.ui.yw;
import ri.q;
public final class d implements o, k0, dt, d4, u, hj0, q1, sw, u4, r4, yo, nc, vi0, uh0, nr, ResultCallback, qr, ka1 {
    public final int f20121a;
    public final Object f20122b;
    public final Object f20123c;

    public d(int i7, Object obj, Object obj2) {
        this.f20121a = i7;
        this.f20122b = obj;
        this.f20123c = obj2;
    }

    @Override
    public void E() {
        switch (this.f20121a) {
            case 2:
                ((h0) this.f20122b).i();
                ((g0) this.f20123c).u0();
                return;
            default:
                k5 k5Var = (k5) this.f20122b;
                n5 n5Var = (n5) this.f20123c;
                TL_iv.pageTableCell pagetablecell = n5Var.f21846b;
                if (pagetablecell != null) {
                    c6.d(pagetablecell, n5Var.f21845a.getText());
                }
                y2 y2Var = k5Var.F;
                if (y2Var != null && k5Var.f22106a != null) {
                    q3.S1(y2Var.f22138a);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean H() {
        return false;
    }

    @Override
    public void L(int i7, int i10, boolean z10) {
        switch (this.f20121a) {
            case 12:
                an anVar = (an) this.f20122b;
                anVar.E8();
                ez.Y(anVar.getAccountInstance(), (Uri) this.f20123c, anVar.f45259k6, anVar.E5, anVar.f45281m4, null, anVar.G5, z10, i7, anVar.Y8());
                return;
            case 13:
            default:
                lm lmVar = (lm) this.f20122b;
                gj gjVar = (gj) this.f20123c;
                if (z10) {
                    lmVar.f49005a.getMessagesController().v(gjVar.f23817k.f28072id, i7, m5.o(gjVar.f23817k.peer_id), null, false);
                    return;
                }
                return;
            case 14:
                an anVar2 = (an) this.f20122b;
                anVar2.getSendMessagesHelper().r0(cz.b((String) this.f20123c, anVar2.f45259k6, anVar2.E5, anVar2.f45281m4, null, false, null, null, null, z10, i7, 0, null, false));
                anVar2.f45118a0.setFieldText("");
                anVar2.D9(false);
                return;
        }
    }

    @Override
    public boolean P(yw ywVar) {
        return false;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        gj gjVar = (gj) this.f20123c;
        an anVar = ((oh) this.f20122b).f49969p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", gjVar.e1());
        bundle.putLong("report_reaction_from_dialog_id", anVar.f45259k6);
        anVar.presentFragment(new ProfileActivity(bundle, null));
        anVar.P7(true);
    }

    @Override
    public m60 b(e1 e1Var) {
        oi.o oVar = (oi.o) ((k8.a) this.f20122b).f17789c;
        m60 m60Var = new m60(oVar, (e6) this.f20123c, e1Var, false, false, true);
        oVar.I = m60Var;
        return m60Var;
    }

    @Override
    public void c(c5 c5Var) {
        db dbVar = (db) this.f20122b;
        TLRPC.User user = (TLRPC.User) this.f20123c;
        int ordinal = c5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                ib ibVar = dbVar.f46348a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f28200id);
                    e2 e2Var = ibVar.f48013n;
                    if (e2Var.getMessagesController().E(bundle, e2Var, null, null)) {
                        e2Var.presentFragment(new an(bundle));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        dbVar.a(user);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public boolean d(TLRPC.TL_error tL_error) {
        an.Q0((an) this.f20122b, (Context) this.f20123c, tL_error);
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        float f12;
        g4 g4Var = (g4) this.f20122b;
        k3 k3Var = (k3) this.f20123c;
        if (g4Var.L == null || i7 - 1 >= 0) {
            h9 h9Var = g4Var.Q0;
            if (h9Var != null) {
                if (h9Var.x()) {
                    g4Var.Q0.f(false);
                    return;
                }
                g4Var.Q0.f(false);
            }
            e4 adapter = k3Var.getAdapter();
            if ((view instanceof n3) && adapter.F != null) {
                n3 n3Var = (n3) view;
                if (g4Var.I0 == 0) {
                    if ((!n3Var.f49431c || f10 >= view.getMeasuredWidth() / 2) && !n3Var.d) {
                        TLObject f22 = np.s1(g4Var.Y).f2("previews");
                        if (f22 instanceof TLRPC.TL_user) {
                            g4Var.N(adapter.F.f28206id, (TLRPC.User) f22);
                            return;
                        }
                        int i10 = m10.f24934t0;
                        long j3 = adapter.F.f28206id;
                        g4Var.Z(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        g4Var.I0 = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new fm(g4Var, i10, j3));
                    }
                }
            } else if (i7 >= 0 && i7 < adapter.d.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i7);
                TL_iv.PageBlock x10 = g4.x(pageBlock);
                if (x10 instanceof u3) {
                    x10 = ((u3) x10).f51729b;
                }
                if (x10 instanceof TL_iv.pageBlockChannel) {
                    np.s1(g4Var.Y).y3(t3.K(((TL_iv.pageBlockChannel) x10).channel, false), g4Var.N, 2, null);
                    g4Var.m(false, true);
                } else if (x10 instanceof a4) {
                    a4 a4Var = (a4) x10;
                    g4Var.O(a4Var.f44931a.articles.get(a4Var.f44932b).url, null, null);
                } else if (x10 instanceof TL_iv.pageBlockDetails) {
                    View w10 = g4.w(view);
                    if (w10 instanceof j1) {
                        g4Var.d = null;
                        g4Var.f49452f = null;
                        if (adapter.f46541e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) x10;
                            pageblockdetails.open = !pageblockdetails.open;
                            int b10 = adapter.b();
                            adapter.M();
                            int abs = Math.abs(adapter.b() - b10);
                            j1 j1Var = (j1) w10;
                            AnimatedArrowDrawable animatedArrowDrawable = j1Var.f48185f;
                            if (pageblockdetails.open) {
                                f12 = 0.0f;
                            } else {
                                f12 = 1.0f;
                            }
                            animatedArrowDrawable.a(f12);
                            j1Var.invalidate();
                            if (abs != 0) {
                                if (pageblockdetails.open) {
                                    adapter.o(i7 + 1, abs);
                                } else {
                                    adapter.p(i7 + 1, abs);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public void h(t1 t1Var, int i7) {
        String str;
        switch (this.f20121a) {
            case 7:
                p4 p4Var = (p4) this.f20122b;
                p4Var.getClass();
                t1Var.dismiss();
                p4Var.b0((View) this.f20123c, true);
                return;
            case 9:
                vf.c.p(((lb) this.f20122b).getParentActivity(), (String) this.f20123c, true);
                return;
            case 11:
                ad.a0((ad) this.f20122b, (TLRPC.Chat) this.f20123c);
                return;
            case 22:
                ho hoVar = (ho) this.f20122b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = np.i1((TLRPC.Chat) this.f20123c);
                tL_channels_updateUsername.username = "";
                hoVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new rn(hoVar, 0), 64);
                return;
            case 26:
                d0 d0Var = (d0) this.f20122b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.f20123c;
                vf.b h = t1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                ConnectionsManager.getInstance(d0Var.f29679a).sendRequestTyped(deletetone, new d3.b(1), new bi.h0(d0Var, h, tL_aiComposeTone, 5));
                return;
            case 27:
                ((f0) this.f20122b).j(((boolean[]) this.f20123c)[0]);
                return;
            case 28:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f20122b;
                LaunchActivity launchActivity = (LaunchActivity) this.f20123c;
                if (tL_langPackLanguage.official) {
                    str = "remote_" + tL_langPackLanguage.lang_code;
                } else {
                    str = "unofficial_" + tL_langPackLanguage.lang_code;
                }
                dd G0 = hd.E0().G0(str);
                dd ddVar = G0;
                if (G0 == null) {
                    ?? obj = new Object();
                    obj.f23058a = tL_langPackLanguage.native_name;
                    obj.f23059b = tL_langPackLanguage.name;
                    obj.f23060c = tL_langPackLanguage.lang_code;
                    obj.f23061e = tL_langPackLanguage.base_lang_code;
                    obj.f23062f = tL_langPackLanguage.plural_code;
                    obj.f23063g = tL_langPackLanguage.rtl;
                    if (tL_langPackLanguage.official) {
                        obj.d = "remote";
                        ddVar = obj;
                    } else {
                        obj.d = "unofficial";
                        ddVar = obj;
                    }
                }
                hd.E0().c(ddVar, true, false, false, true, m10.f24934t0, null);
                launchActivity.y0(true);
                return;
            default:
                tr trVar = (tr) this.f20122b;
                boolean[] zArr = (boolean[]) this.f20123c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                yw ywVar = (yw) trVar.f51653b;
                ArrayList arrayList = (ArrayList) trVar.f51654c;
                ywVar.getClass();
                int size = arrayList.size();
                for (int i10 = 0; i10 < size; i10++) {
                    Long l10 = (Long) arrayList.get(i10);
                    long longValue = l10.longValue();
                    if (z10) {
                        ywVar.getMessagesController().o4(longValue, ywVar.getMessagesController().a2(l10), null, null, false);
                    }
                    if (z11) {
                        ywVar.getMessagesController().X(0, longValue, true);
                    }
                    ywVar.getMessagesController().w(longValue);
                }
                ywVar.n4(false);
                return;
        }
    }

    @Override
    public void i() {
        an anVar = (an) this.f20122b;
        anVar.getClass();
        ((q) this.f20123c).g();
        anVar.O9();
    }

    @Override
    public void invoke(Object obj) {
        ((b) obj).onRenderedFirstFrame((a) this.f20122b);
    }

    @Override
    public void j(boolean z10) {
        long j3 = ((TLRPC.User) this.f20123c).f28200id;
        an anVar = ((si) this.f20122b).f51228b;
        long j10 = anVar.f45358s4;
        if (j3 != j10) {
            return;
        }
        anVar.Ta(j10, false);
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((mp) this.f20122b).u0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f20123c);
    }

    @Override
    public void onComplete(Object obj) {
        ym ymVar = (ym) this.f20122b;
        ra0 ra0Var = (ra0) this.f20123c;
        Pair pair = (Pair) obj;
        ymVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            p3 p3Var = ymVar.f53545f;
            if (p3Var != null && longValue == p3Var.h(ymVar.f53555q ? 1 : 0) && bitmap != null) {
                ra0Var.f38938x = bitmap;
                ra0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        k.a(this, th2);
    }

    @Override
    public void r(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f20123c;
        a8.d("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f20122b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public void run(long j3) {
        boolean z10;
        switch (this.f20121a) {
            case 3:
                TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                tL_inlineButtonTypeUserProfile.user_id = j3;
                ((oi.n3) this.f20122b).a((String) this.f20123c, tL_inlineButtonTypeUserProfile);
                return;
            case 21:
                qn qnVar = (qn) this.f20122b;
                qnVar.getClass();
                ((t1) this.f20123c).dismiss();
                boolean z11 = false;
                qnVar.O0 = false;
                if (j3 != 0) {
                    qnVar.f50691w0 = j3;
                    TLRPC.Chat M0 = qnVar.getMessagesController().M0(Long.valueOf(j3));
                    qnVar.f50693x0 = M0;
                    TLRPC.ChatFull chatFull = qnVar.f50695y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    if (M0.forum_tabs != qnVar.H0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (M0.forum_sidebar != qnVar.I0) {
                        z11 = true;
                    }
                    qnVar.getMessagesController().b5(qnVar.f50691w0, qnVar.F0, qnVar.H0, qnVar.I0);
                    TLRPC.Chat chat = qnVar.f50693x0;
                    chat.forum = qnVar.F0;
                    chat.forum_tabs = qnVar.H0;
                    chat.forum_sidebar = qnVar.I0;
                    if (z10 || z11) {
                        qnVar.v0(z10);
                        return;
                    }
                    return;
                }
                return;
            case 23:
                to toVar = (to) this.f20122b;
                e2 e2Var = (e2) this.f20123c;
                if (j3 != 0) {
                    toVar.getMessagesController().c5(j3, false);
                    toVar.d0(toVar.getMessagesController().M0(Long.valueOf(j3)), e2Var);
                    return;
                }
                toVar.getClass();
                return;
            default:
                po poVar = (po) this.f20122b;
                Runnable runnable = (Runnable) this.f20123c;
                if (j3 != 0) {
                    to toVar2 = poVar.f50329y.d;
                    if (toVar2.f51624s) {
                        toVar2.f51625w.set(0, toVar2.getMessagesController().M0(Long.valueOf(j3)));
                    } else {
                        toVar2.F = j3;
                        toVar2.f51621f = toVar2.getMessagesController().M0(Long.valueOf(j3));
                    }
                    runnable.run();
                    return;
                }
                poVar.getClass();
                return;
        }
    }

    @Override
    public boolean y(yw ywVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, u91 u91Var) {
        y5 y5Var = (y5) this.f20122b;
        ArrayList arrayList2 = y5Var.f53415c;
        ((yw) this.f20123c).finishFragment();
        s2 s2Var = null;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            boolean z12 = true;
            if (i12 >= arrayList.size()) {
                break;
            }
            int i13 = 0;
            while (true) {
                if (i13 < y5Var.d.size()) {
                    if (((s2) y5Var.d.get(i13)).f26391a == ((ur) arrayList.get(i12)).f26860a) {
                        s2Var = (s2) y5Var.d.get(i13);
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
                if (y5Var.getMessagesController().f25392s7.c(y5Var.f53416e) == 2) {
                    i14 = 3;
                }
                ArrayList arrayList3 = y5Var.d;
                s2 s2Var2 = new s2(((ur) arrayList.get(i12)).f26860a, i14);
                arrayList3.add(s2Var2);
                s2Var = s2Var2;
            }
            i12++;
        }
        y5Var.getMessagesController().f25392s7.h(y5Var.f53416e, y5Var.d);
        y5Var.Z();
        if (s2Var != null) {
            int i15 = 0;
            while (true) {
                if (i15 < arrayList2.size()) {
                    if (((x5) arrayList2.get(i15)).f53097c != null && ((x5) arrayList2.get(i15)).f53097c.f26391a == s2Var.f26391a) {
                        i11 = i15;
                        break;
                    }
                    i15++;
                } else {
                    break;
                }
            }
            y5Var.f53414b.v0(i11);
            org.telegram.messenger.g0.i3(new u5(0, y5Var, s2Var), 150L);
        }
        return true;
    }

    public d(a aVar, Object obj, long j3) {
        this.f20121a = 0;
        this.f20122b = aVar;
        this.f20123c = obj;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        k.b(this, tL_error);
    }

    public d(db dbVar, org.telegram.ui.Cells.q1 q1Var, TLRPC.User user) {
        this.f20121a = 10;
        this.f20122b = dbVar;
        this.f20123c = user;
    }

    @Override
    public void r0(View view, float f10, float f11) {
    }
}
