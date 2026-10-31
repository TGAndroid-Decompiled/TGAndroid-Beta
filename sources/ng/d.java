package ng;

import ag.e0;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import ei.r;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import mg.i0;
import mg.p;
import org.telegram.messenger.bs;
import org.telegram.messenger.cd;
import org.telegram.messenger.cs;
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.gp;
import org.telegram.messenger.gs;
import org.telegram.messenger.i5;
import org.telegram.messenger.jj;
import org.telegram.messenger.mm;
import org.telegram.messenger.o5;
import org.telegram.messenger.oz;
import org.telegram.messenger.pc;
import org.telegram.messenger.qz;
import org.telegram.messenger.vp;
import org.telegram.messenger.w2;
import org.telegram.messenger.w3;
import org.telegram.messenger.zc;
import org.telegram.messenger.zr;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.l;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.x1;
import org.telegram.ui.ActionBar.y3;
import org.telegram.ui.Cells.k9;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Cells.u;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.g0;
import org.telegram.ui.Components.hk0;
import org.telegram.ui.Components.jb0;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.ui0;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ay;
import org.telegram.ui.b4;
import org.telegram.ui.b5;
import org.telegram.ui.cp;
import org.telegram.ui.f4;
import org.telegram.ui.fn;
import org.telegram.ui.gc1;
import org.telegram.ui.h0;
import org.telegram.ui.h4;
import org.telegram.ui.iq;
import org.telegram.ui.jb;
import org.telegram.ui.kd;
import org.telegram.ui.ki;
import org.telegram.ui.l1;
import org.telegram.ui.l3;
import org.telegram.ui.mp;
import org.telegram.ui.nj;
import org.telegram.ui.o3;
import org.telegram.ui.oo;
import org.telegram.ui.p4;
import org.telegram.ui.pb;
import org.telegram.ui.pb1;
import org.telegram.ui.po;
import org.telegram.ui.qp;
import org.telegram.ui.rv;
import org.telegram.ui.sb;
import org.telegram.ui.sn;
import org.telegram.ui.t4;
import org.telegram.ui.un;
import org.telegram.ui.ux;
import org.telegram.ui.v3;
import org.telegram.ui.w5;
import org.telegram.ui.x5;
public final class d implements ux, u, hk0, u1, t4, q4, gp, pc, uj0, ui0, zr, ResultCallback, cs, gc1 {
    public final int f13770a;
    public final Object f13771b;
    public final Object f13772c;

    public d(int i10, Object obj, Object obj2) {
        this.f13770a = i10;
        this.f13771b = obj;
        this.f13772c = obj2;
    }

    @Override
    public boolean G() {
        switch (this.f13770a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void K(int i10, int i11, boolean z10) {
        switch (this.f13770a) {
            case 8:
                un unVar = (un) this.f13771b;
                unVar.v8();
                qz.Y(unVar.getAccountInstance(), (Uri) this.f13772c, unVar.f42297j6, unVar.D5, unVar.l4, null, unVar.F5, z10, i10, unVar.P8());
                return;
            case 9:
            default:
                fn fnVar = (fn) this.f13771b;
                jj jjVar = (jj) this.f13772c;
                if (z10) {
                    fnVar.f37301a.getMessagesController().v(jjVar.f16337k.f19814id, i10, o5.o(jjVar.f16337k.peer_id), null, false);
                    return;
                }
                return;
            case 10:
                un unVar2 = (un) this.f13771b;
                unVar2.getSendMessagesHelper().r0(oz.b((String) this.f13772c, unVar2.f42297j6, unVar2.D5, unVar2.l4, null, false, null, null, null, z10, i10, 0, null, false));
                unVar2.Z.setFieldText("");
                unVar2.r9(false);
                return;
        }
    }

    @Override
    public boolean N(ay ayVar) {
        switch (this.f13770a) {
            case 0:
                return false;
            default:
                return false;
        }
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        un.R0((un) this.f13771b, (Context) this.f13772c, tL_error);
        return false;
    }

    @Override
    public void b(float f7, float f10, int i10, View view) {
        float f11;
        h4 h4Var = (h4) this.f13771b;
        l3 l3Var = (l3) this.f13772c;
        if (h4Var.K == null || i10 - 1 >= 0) {
            k9 k9Var = h4Var.P0;
            if (k9Var != null) {
                if (k9Var.x()) {
                    h4Var.P0.f(false);
                    return;
                }
                h4Var.P0.f(false);
            }
            f4 adapter = l3Var.getAdapter();
            if ((view instanceof o3) && adapter.E != null) {
                o3 o3Var = (o3) view;
                if (h4Var.H0 == 0) {
                    if ((!o3Var.f40125c || f7 >= view.getMeasuredWidth() / 2) && !o3Var.d) {
                        TLObject e22 = vp.r1(h4Var.X).e2("previews");
                        if (e22 instanceof TLRPC.TL_user) {
                            h4Var.N(adapter.E.f19948id, (TLRPC.User) e22);
                            return;
                        }
                        int i11 = d20.f15147s0;
                        long j10 = adapter.E.f19948id;
                        h4Var.Z(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        h4Var.H0 = ConnectionsManager.getInstance(i11).sendRequest(tL_contacts_resolveUsername, new mm(h4Var, i11, j10));
                    }
                }
            } else if (i10 >= 0 && i10 < adapter.d.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i10);
                TL_iv.PageBlock x10 = h4.x(pageBlock);
                if (x10 instanceof v3) {
                    x10 = ((v3) x10).f42585b;
                }
                if (x10 instanceof TL_iv.pageBlockChannel) {
                    vp.r1(h4Var.X).v3(w3.K(((TL_iv.pageBlockChannel) x10).channel, false), h4Var.M, 2, null);
                    h4Var.m(false, true);
                } else if (x10 instanceof b4) {
                    b4 b4Var = (b4) x10;
                    h4Var.O(b4Var.f35976a.articles.get(b4Var.f35977b).url, null, null);
                } else if (x10 instanceof TL_iv.pageBlockDetails) {
                    View w9 = h4.w(view);
                    if (w9 instanceof l1) {
                        h4Var.d = null;
                        h4Var.f39483f = null;
                        if (adapter.e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) x10;
                            pageblockdetails.open = !pageblockdetails.open;
                            int b10 = adapter.b();
                            adapter.M();
                            int abs = Math.abs(adapter.b() - b10);
                            l1 l1Var = (l1) w9;
                            AnimatedArrowDrawable animatedArrowDrawable = l1Var.f39023f;
                            if (pageblockdetails.open) {
                                f11 = 0.0f;
                            } else {
                                f11 = 1.0f;
                            }
                            animatedArrowDrawable.a(f11);
                            l1Var.invalidate();
                            if (abs != 0) {
                                if (pageblockdetails.open) {
                                    adapter.o(i10 + 1, abs);
                                } else {
                                    adapter.p(i10 + 1, abs);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @Override
    public void c(long j10, TLRPC.MessagePeerReaction messagePeerReaction) {
        jj jjVar = (jj) this.f13772c;
        un unVar = ((ki) this.f13771b).f38872p;
        Bundle bundle = new Bundle();
        if (j10 > 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        bundle.putInt("report_reaction_message_id", jjVar.f1());
        bundle.putLong("report_reaction_from_dialog_id", unVar.f42297j6);
        unVar.presentFragment(new ProfileActivity(bundle, null));
        unVar.I7(true);
    }

    @Override
    public void d(b5 b5Var) {
        jb jbVar = (jb) this.f13771b;
        TLRPC.User user = (TLRPC.User) this.f13772c;
        int ordinal = b5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                pb pbVar = jbVar.f38483a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f19942id);
                    k2 k2Var = pbVar.f40563n;
                    if (k2Var.getMessagesController().E(bundle, k2Var, null, null)) {
                        k2Var.presentFragment(new un(bundle));
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        jbVar.a(user);
    }

    @Override
    public void g() {
        un unVar = (un) this.f13771b;
        unVar.getClass();
        ((r) this.f13772c).g();
        unVar.C9();
    }

    @Override
    public void h(x1 x1Var, int i10) {
        String str;
        int i11;
        switch (this.f13770a) {
            case 3:
                p4 p4Var = (p4) this.f13771b;
                p4Var.getClass();
                x1Var.dismiss();
                p4Var.a0((View) this.f13772c, true);
                return;
            case 5:
                gf.f.n(((sb) this.f13771b).getParentActivity(), (String) this.f13772c, true);
                return;
            case 7:
                kd.Z((kd) this.f13771b, (TLRPC.Chat) this.f13772c);
                return;
            case 18:
                cp cpVar = (cp) this.f13771b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = vp.h1((TLRPC.Chat) this.f13772c);
                tL_channels_updateUsername.username = "";
                cpVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new po(cpVar, 0), 64);
                return;
            case 22:
                g0 g0Var = (g0) this.f13771b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.f13772c;
                gf.e h = x1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                ConnectionsManager.getInstance(g0Var.f21583a).sendRequestTyped(deletetone, new a3.b(1), new org.telegram.tgnet.e(g0Var, h, tL_aiComposeTone, 1));
                return;
            case 23:
                ((i0) this.f13771b).i(((boolean[]) this.f13772c)[0]);
                return;
            case 24:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f13771b;
                LaunchActivity launchActivity = (LaunchActivity) this.f13772c;
                if (tL_langPackLanguage.official) {
                    str = "remote_" + tL_langPackLanguage.lang_code;
                } else {
                    str = "unofficial_" + tL_langPackLanguage.lang_code;
                }
                zc F0 = cd.D0().F0(str);
                zc zcVar = F0;
                if (F0 == null) {
                    ?? obj = new Object();
                    obj.f19495a = tL_langPackLanguage.native_name;
                    obj.f19496b = tL_langPackLanguage.name;
                    obj.f19497c = tL_langPackLanguage.lang_code;
                    obj.e = tL_langPackLanguage.base_lang_code;
                    obj.f19498f = tL_langPackLanguage.plural_code;
                    obj.f19499g = tL_langPackLanguage.rtl;
                    if (tL_langPackLanguage.official) {
                        obj.d = "remote";
                        zcVar = obj;
                    } else {
                        obj.d = "unofficial";
                        zcVar = obj;
                    }
                }
                cd.D0().c(zcVar, true, false, false, true, d20.f15147s0, null);
                launchActivity.y0(true);
                return;
            case 25:
                rv rvVar = (rv) this.f13771b;
                boolean[] zArr = (boolean[]) this.f13772c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                ay ayVar = (ay) rvVar.f41298b;
                ArrayList arrayList = (ArrayList) rvVar.f41299c;
                ayVar.getClass();
                int size = arrayList.size();
                for (int i12 = 0; i12 < size; i12++) {
                    Long l4 = (Long) arrayList.get(i12);
                    long longValue = l4.longValue();
                    if (z10) {
                        ayVar.getMessagesController().l4(longValue, ayVar.getMessagesController().Z1(l4), null, null, false);
                    }
                    if (z11) {
                        ayVar.getMessagesController().X(0, longValue, true);
                    }
                    ayVar.getMessagesController().w(longValue);
                }
                ayVar.m4(false);
                return;
            case 26:
                x1Var.dismiss();
                ((e0) this.f13771b).a(((EditText) this.f13772c).getText().toString());
                return;
            case 27:
                bs bsVar = (bs) this.f13772c;
                int i13 = ((int[]) this.f13771b)[0];
                if (i13 == 0) {
                    i11 = 900;
                } else if (i13 == 1) {
                    i11 = 3600;
                } else if (i13 == 2) {
                    i11 = 28800;
                } else {
                    i11 = Integer.MAX_VALUE;
                }
                bsVar.a(i11);
                return;
            case 28:
                ((AtomicBoolean) this.f13771b).set(true);
                ((q0.a) this.f13772c).accept(Boolean.FALSE);
                return;
            default:
                String str2 = (String) this.f13772c;
                k2 k2Var = (k2) this.f13771b;
                try {
                    Intent intent = new Intent("android.intent.action.VIEW", Uri.fromParts("sms", str2, null));
                    intent.putExtra("sms_body", i5.r(k2Var.getCurrentAccount()).s(1));
                    k2Var.getParentActivity().startActivityForResult(intent, 500);
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
        }
    }

    @Override
    public boolean h1(View view) {
        return false;
    }

    @Override
    public void i(boolean z10) {
        long j10 = ((TLRPC.User) this.f13772c).f19942id;
        un unVar = ((nj) this.f13771b).f39956b;
        long j11 = unVar.f42394r4;
        if (j10 != j11) {
            return;
        }
        unVar.Ga(j11, false);
    }

    @Override
    public void m(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((iq) this.f13771b).t0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f13772c);
    }

    @Override
    public void onComplete(Object obj) {
        sn snVar = (sn) this.f13771b;
        jb0 jb0Var = (jb0) this.f13772c;
        Pair pair = (Pair) obj;
        snVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            y3 y3Var = snVar.f41590f;
            if (y3Var != null && longValue == y3Var.h(snVar.f41600q ? 1 : 0) && bitmap != null) {
                jb0Var.f27299x = bitmap;
                jb0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        l.a(this, th2);
    }

    @Override
    public void q(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f13772c;
        f8.d("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f13771b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public void run(long j10) {
        boolean z10;
        switch (this.f13770a) {
            case 17:
                oo ooVar = (oo) this.f13771b;
                ooVar.getClass();
                ((x1) this.f13772c).dismiss();
                boolean z11 = false;
                ooVar.N0 = false;
                if (j10 != 0) {
                    ooVar.f40341v0 = j10;
                    TLRPC.Chat L0 = ooVar.getMessagesController().L0(Long.valueOf(j10));
                    ooVar.f40343w0 = L0;
                    TLRPC.ChatFull chatFull = ooVar.f40345x0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    if (L0.forum_tabs != ooVar.G0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (L0.forum_sidebar != ooVar.H0) {
                        z11 = true;
                    }
                    ooVar.getMessagesController().X4(ooVar.f40341v0, ooVar.E0, ooVar.G0, ooVar.H0);
                    TLRPC.Chat chat = ooVar.f40343w0;
                    chat.forum = ooVar.E0;
                    chat.forum_tabs = ooVar.G0;
                    chat.forum_sidebar = ooVar.H0;
                    if (z10 || z11) {
                        ooVar.u0(z10);
                        return;
                    }
                    return;
                }
                return;
            case 18:
            default:
                mp mpVar = (mp) this.f13771b;
                Runnable runnable = (Runnable) this.f13772c;
                if (j10 != 0) {
                    qp qpVar = mpVar.f39744y.d;
                    if (qpVar.f41026s) {
                        qpVar.f41027w.set(0, qpVar.getMessagesController().L0(Long.valueOf(j10)));
                    } else {
                        qpVar.E = j10;
                        qpVar.f41023f = qpVar.getMessagesController().L0(Long.valueOf(j10));
                    }
                    runnable.run();
                    return;
                }
                mpVar.getClass();
                return;
            case 19:
                qp qpVar2 = (qp) this.f13771b;
                k2 k2Var = (k2) this.f13772c;
                if (j10 != 0) {
                    qpVar2.getMessagesController().Y4(j10, false);
                    qpVar2.c0(qpVar2.getMessagesController().L0(Long.valueOf(j10)), k2Var);
                    return;
                }
                qpVar2.getClass();
                return;
        }
    }

    @Override
    public boolean y(ay ayVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i10, int i11, pb1 pb1Var) {
        switch (this.f13770a) {
            case 0:
                f fVar = (f) this.f13771b;
                String str = (String) this.f13772c;
                long j10 = 0;
                for (int i12 = 0; i12 < arrayList.size(); i12++) {
                    j10 = ((gs) arrayList.get(i12)).f15760a;
                    fVar.e.getSendMessagesHelper().r0(oz.b(str, j10, null, null, null, true, null, null, null, true, 0, 0, null, false));
                }
                ayVar.finishFragment();
                p.h(j10);
                return true;
            default:
                x5 x5Var = (x5) this.f13771b;
                ArrayList arrayList2 = x5Var.f43444c;
                ((ay) this.f13772c).finishFragment();
                w2 w2Var = null;
                int i13 = 0;
                int i14 = 0;
                while (true) {
                    boolean z12 = true;
                    if (i14 < arrayList.size()) {
                        int i15 = 0;
                        while (true) {
                            if (i15 < x5Var.d.size()) {
                                if (((w2) x5Var.d.get(i15)).f19043a == ((gs) arrayList.get(i14)).f15760a) {
                                    w2Var = (w2) x5Var.d.get(i15);
                                } else {
                                    i15++;
                                }
                            } else {
                                z12 = false;
                            }
                        }
                        if (!z12) {
                            int i16 = 2;
                            if (x5Var.getMessagesController().f18901s7.c(x5Var.e) == 2) {
                                i16 = 3;
                            }
                            ArrayList arrayList3 = x5Var.d;
                            w2 w2Var2 = new w2(((gs) arrayList.get(i14)).f15760a, i16);
                            arrayList3.add(w2Var2);
                            w2Var = w2Var2;
                        }
                        i14++;
                    } else {
                        x5Var.getMessagesController().f18901s7.h(x5Var.e, x5Var.d);
                        x5Var.Y();
                        if (w2Var != null) {
                            int i17 = 0;
                            while (true) {
                                if (i17 < arrayList2.size()) {
                                    if (((w5) arrayList2.get(i17)).f42879c != null && ((w5) arrayList2.get(i17)).f42879c.f19043a == w2Var.f19043a) {
                                        i13 = i17;
                                    } else {
                                        i17++;
                                    }
                                }
                            }
                            x5Var.f43443b.v0(i13);
                            org.telegram.messenger.i0.h3(new h0(5, x5Var, w2Var), 150L);
                        }
                        return true;
                    }
                }
                break;
        }
    }

    public d(String str, k2 k2Var) {
        this.f13770a = 29;
        this.f13772c = str;
        this.f13771b = k2Var;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        l.b(this, tL_error);
    }

    public d(jb jbVar, q1 q1Var, TLRPC.User user) {
        this.f13770a = 6;
        this.f13771b = jbVar;
        this.f13772c = user;
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
