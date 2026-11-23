package oi;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.widget.EditText;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.messenger.a8;
import org.telegram.messenger.cd;
import org.telegram.messenger.cm;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.lr;
import org.telegram.messenger.mc;
import org.telegram.messenger.mp;
import org.telegram.messenger.nr;
import org.telegram.messenger.or;
import org.telegram.messenger.sr;
import org.telegram.messenger.xo;
import org.telegram.messenger.xy;
import org.telegram.messenger.zy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.Components.za0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ad;
import org.telegram.ui.bn;
import org.telegram.ui.bx;
import org.telegram.ui.db;
import org.telegram.ui.ib;
import org.telegram.ui.io;
import org.telegram.ui.lb;
import org.telegram.ui.ma1;
import org.telegram.ui.mm;
import org.telegram.ui.np;
import org.telegram.ui.oh;
import org.telegram.ui.qo;
import org.telegram.ui.rn;
import org.telegram.ui.sn;
import org.telegram.ui.ti;
import org.telegram.ui.uo;
import org.telegram.ui.vw;
import org.telegram.ui.w91;
import org.telegram.ui.zm;
import org.telegram.ui.zs;
public final class f0 implements kt, g4, org.telegram.ui.Cells.u, rj0, org.telegram.ui.ActionBar.q1, vw, org.telegram.ui.u4, org.telegram.ui.Components.z4, xo, mc, gj0, fi0, lr, ResultCallback, or, ma1 {
    public final int f22163a;
    public final Object f22164b;
    public final Object f22165c;

    public f0(int i7, Object obj, Object obj2) {
        this.f22163a = i7;
        this.f22164b = obj;
        this.f22165c = obj2;
    }

    @Override
    public boolean F() {
        return false;
    }

    @Override
    public void I(int i7, int i10, boolean z10) {
        switch (this.f22163a) {
            case 10:
                bn bnVar = (bn) this.f22164b;
                bnVar.E8();
                zy.Y(bnVar.getAccountInstance(), (Uri) this.f22165c, bnVar.f46271l6, bnVar.F5, bnVar.f46282m4, null, bnVar.H5, z10, i7, bnVar.Y8());
                return;
            case 11:
            default:
                mm mmVar = (mm) this.f22164b;
                fj fjVar = (fj) this.f22165c;
                if (z10) {
                    mmVar.f50079a.getMessagesController().v(fjVar.f24073k.f28513id, i7, org.telegram.messenger.n5.o(fjVar.f24073k.peer_id), null, false);
                    return;
                }
                return;
            case 12:
                bn bnVar2 = (bn) this.f22164b;
                bnVar2.getSendMessagesHelper().r0(xy.b((String) this.f22165c, bnVar2.f46271l6, bnVar2.F5, bnVar2.f46282m4, null, false, null, null, null, z10, i7, 0, null, false));
                bnVar2.f46118a0.setFieldText("");
                bnVar2.D9(false);
                return;
        }
    }

    @Override
    public boolean O(bx bxVar) {
        return false;
    }

    @Override
    public boolean U0(View view) {
        return false;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        fj fjVar = (fj) this.f22165c;
        bn bnVar = ((oh) this.f22164b).f50696p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", fjVar.e1());
        bundle.putLong("report_reaction_from_dialog_id", bnVar.f46271l6);
        bnVar.presentFragment(new ProfileActivity(bundle, null));
        bnVar.P7(true);
    }

    @Override
    public void c(org.telegram.ui.c5 c5Var) {
        db dbVar = (db) this.f22164b;
        TLRPC.User user = (TLRPC.User) this.f22165c;
        int ordinal = c5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                ib ibVar = dbVar.f47023a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f28641id);
                    org.telegram.ui.ActionBar.g2 g2Var = ibVar.f48771n;
                    if (g2Var.getMessagesController().E(bundle, g2Var, null, null)) {
                        g2Var.presentFragment(new bn(bundle));
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
    public boolean d(TLRPC.TL_error tL_error) {
        bn.Q0((bn) this.f22164b, (Context) this.f22165c, tL_error);
        return false;
    }

    @Override
    public void f() {
        bn bnVar = (bn) this.f22164b;
        bnVar.getClass();
        ((ri.q) this.f22165c).g();
        bnVar.O9();
    }

    @Override
    public void g(float f10, float f11, int i7, View view) {
        float f12;
        org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f22164b;
        org.telegram.ui.k3 k3Var = (org.telegram.ui.k3) this.f22165c;
        if (g4Var.L == null || i7 - 1 >= 0) {
            i9 i9Var = g4Var.Q0;
            if (i9Var != null) {
                if (i9Var.x()) {
                    g4Var.Q0.f(false);
                    return;
                }
                g4Var.Q0.f(false);
            }
            org.telegram.ui.e4 adapter = k3Var.getAdapter();
            if ((view instanceof org.telegram.ui.n3) && adapter.F != null) {
                org.telegram.ui.n3 n3Var = (org.telegram.ui.n3) view;
                if (g4Var.I0 == 0) {
                    if ((!n3Var.f50182c || f10 >= view.getMeasuredWidth() / 2) && !n3Var.d) {
                        TLObject h22 = mp.u1(g4Var.Y).h2("previews");
                        if (h22 instanceof TLRPC.TL_user) {
                            g4Var.N(adapter.F.f28647id, (TLRPC.User) h22);
                            return;
                        }
                        int i10 = i10.f24637t0;
                        long j3 = adapter.F.f28647id;
                        g4Var.Z(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        g4Var.I0 = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new cm(g4Var, i10, j3));
                    }
                }
            } else if (i7 >= 0 && i7 < adapter.d.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i7);
                TL_iv.PageBlock x10 = org.telegram.ui.g4.x(pageBlock);
                if (x10 instanceof org.telegram.ui.u3) {
                    x10 = ((org.telegram.ui.u3) x10).f52524b;
                }
                if (x10 instanceof TL_iv.pageBlockChannel) {
                    mp.u1(g4Var.Y).F3(org.telegram.messenger.v3.K(((TL_iv.pageBlockChannel) x10).channel, false), g4Var.N, 2, null);
                    g4Var.m(false, true);
                } else if (x10 instanceof org.telegram.ui.a4) {
                    org.telegram.ui.a4 a4Var = (org.telegram.ui.a4) x10;
                    g4Var.O(a4Var.f45578a.articles.get(a4Var.f45579b).url, null, null);
                } else if (x10 instanceof TL_iv.pageBlockDetails) {
                    View w10 = org.telegram.ui.g4.w(view);
                    if (w10 instanceof org.telegram.ui.j1) {
                        g4Var.d = null;
                        g4Var.f50842f = null;
                        if (adapter.f47313e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) x10;
                            pageblockdetails.open = !pageblockdetails.open;
                            int b10 = adapter.b();
                            adapter.M();
                            int abs = Math.abs(adapter.b() - b10);
                            org.telegram.ui.j1 j1Var = (org.telegram.ui.j1) w10;
                            AnimatedArrowDrawable animatedArrowDrawable = j1Var.f48967f;
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
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        String str;
        int i10;
        switch (this.f22163a) {
            case 5:
                org.telegram.ui.p4 p4Var = (org.telegram.ui.p4) this.f22164b;
                p4Var.getClass();
                t1Var.dismiss();
                p4Var.b0((View) this.f22165c, true);
                return;
            case 7:
                vf.c.p(((lb) this.f22164b).getParentActivity(), (String) this.f22165c, true);
                return;
            case 9:
                ad.a0((ad) this.f22164b, (TLRPC.Chat) this.f22165c);
                return;
            case 20:
                io ioVar = (io) this.f22164b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = mp.k1((TLRPC.Chat) this.f22165c);
                tL_channels_updateUsername.username = "";
                ioVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new sn(ioVar, 0), 64);
                return;
            case 24:
                org.telegram.ui.Components.m0 m0Var = (org.telegram.ui.Components.m0) this.f22164b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.f22165c;
                vf.b h = t1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                ConnectionsManager.getInstance(m0Var.f30223a).sendRequestTyped(deletetone, new d3.b(1), new bi.h0(m0Var, h, tL_aiComposeTone, 6));
                return;
            case 25:
                ((bg.g0) this.f22164b).q(((boolean[]) this.f22165c)[0]);
                return;
            case 26:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f22164b;
                LaunchActivity launchActivity = (LaunchActivity) this.f22165c;
                if (tL_langPackLanguage.official) {
                    str = "remote_" + tL_langPackLanguage.lang_code;
                } else {
                    str = "unofficial_" + tL_langPackLanguage.lang_code;
                }
                cd G0 = gd.E0().G0(str);
                cd cdVar = G0;
                if (G0 == null) {
                    ?? obj = new Object();
                    obj.f23443a = tL_langPackLanguage.native_name;
                    obj.f23444b = tL_langPackLanguage.name;
                    obj.f23445c = tL_langPackLanguage.lang_code;
                    obj.f23446e = tL_langPackLanguage.base_lang_code;
                    obj.f23447f = tL_langPackLanguage.plural_code;
                    obj.f23448g = tL_langPackLanguage.rtl;
                    if (tL_langPackLanguage.official) {
                        obj.d = "remote";
                        cdVar = obj;
                    } else {
                        obj.d = "unofficial";
                        cdVar = obj;
                    }
                }
                gd.E0().c(cdVar, true, false, false, true, i10.f24637t0, null);
                launchActivity.y0(true);
                return;
            case 27:
                zs zsVar = (zs) this.f22164b;
                boolean[] zArr = (boolean[]) this.f22165c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                bx bxVar = (bx) zsVar.f54713b;
                ArrayList arrayList = (ArrayList) zsVar.f54714c;
                bxVar.getClass();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Long l10 = (Long) arrayList.get(i11);
                    long longValue = l10.longValue();
                    if (z10) {
                        bxVar.getMessagesController().w4(longValue, bxVar.getMessagesController().c2(l10), null, null, false);
                    }
                    if (z11) {
                        bxVar.getMessagesController().X(0, longValue, true);
                    }
                    bxVar.getMessagesController().w(longValue);
                }
                bxVar.p4(false);
                return;
            case 28:
                t1Var.dismiss();
                ((ki.n2) this.f22164b).a(((EditText) this.f22165c).getText().toString());
                return;
            default:
                nr nrVar = (nr) this.f22165c;
                int i12 = ((int[]) this.f22164b)[0];
                if (i12 == 0) {
                    i10 = 900;
                } else if (i12 == 1) {
                    i10 = 3600;
                } else if (i12 == 2) {
                    i10 = 28800;
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                nrVar.a(i10);
                return;
        }
    }

    @Override
    public void j(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((np) this.f22164b).u0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f22165c);
    }

    @Override
    public void onComplete(Object obj) {
        zm zmVar = (zm) this.f22164b;
        za0 za0Var = (za0) this.f22165c;
        Pair pair = (Pair) obj;
        zmVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            org.telegram.ui.ActionBar.s3 s3Var = zmVar.f54653f;
            if (s3Var != null && longValue == s3Var.h(zmVar.f54663q ? 1 : 0) && bitmap != null) {
                za0Var.f42807x = bitmap;
                za0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.l.a(this, th2);
    }

    @Override
    public void q(boolean z10) {
        long j3 = ((TLRPC.User) this.f22165c).f28641id;
        bn bnVar = ((ti) this.f22164b).f52410b;
        long j10 = bnVar.f46359s4;
        if (j3 != j10) {
            return;
        }
        bnVar.Ta(j10, false);
    }

    @Override
    public void run(long j3) {
        boolean z10;
        switch (this.f22163a) {
            case 1:
                TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                tL_inlineButtonTypeUserProfile.user_id = j3;
                ((q3) this.f22164b).a((String) this.f22165c, tL_inlineButtonTypeUserProfile);
                return;
            case 19:
                rn rnVar = (rn) this.f22164b;
                rnVar.getClass();
                ((org.telegram.ui.ActionBar.t1) this.f22165c).dismiss();
                boolean z11 = false;
                rnVar.O0 = false;
                if (j3 != 0) {
                    rnVar.f51794w0 = j3;
                    TLRPC.Chat O0 = rnVar.getMessagesController().O0(Long.valueOf(j3));
                    rnVar.f51796x0 = O0;
                    TLRPC.ChatFull chatFull = rnVar.f51798y0;
                    if (chatFull != null) {
                        chatFull.hidden_prehistory = true;
                    }
                    if (O0.forum_tabs != rnVar.H0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (O0.forum_sidebar != rnVar.I0) {
                        z11 = true;
                    }
                    rnVar.getMessagesController().m5(rnVar.f51794w0, rnVar.F0, rnVar.H0, rnVar.I0);
                    TLRPC.Chat chat = rnVar.f51796x0;
                    chat.forum = rnVar.F0;
                    chat.forum_tabs = rnVar.H0;
                    chat.forum_sidebar = rnVar.I0;
                    if (z10 || z11) {
                        rnVar.v0(z10);
                        return;
                    }
                    return;
                }
                return;
            case 21:
                uo uoVar = (uo) this.f22164b;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f22165c;
                if (j3 != 0) {
                    uoVar.getMessagesController().n5(j3, false);
                    uoVar.d0(uoVar.getMessagesController().O0(Long.valueOf(j3)), g2Var);
                    return;
                }
                uoVar.getClass();
                return;
            default:
                qo qoVar = (qo) this.f22164b;
                Runnable runnable = (Runnable) this.f22165c;
                if (j3 != 0) {
                    uo uoVar2 = qoVar.f51498y.d;
                    if (uoVar2.f52703s) {
                        uoVar2.f52704w.set(0, uoVar2.getMessagesController().O0(Long.valueOf(j3)));
                    } else {
                        uoVar2.F = j3;
                        uoVar2.f52700f = uoVar2.getMessagesController().O0(Long.valueOf(j3));
                    }
                    runnable.run();
                    return;
                }
                qoVar.getClass();
                return;
        }
    }

    @Override
    public void s(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f22165c;
        a8.d("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f22164b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public void u() {
        switch (this.f22163a) {
            case 0:
                ((i0) this.f22164b).i();
                ((h0) this.f22165c).w0();
                return;
            default:
                m5 m5Var = (m5) this.f22164b;
                p5 p5Var = (p5) this.f22165c;
                TL_iv.pageTableCell pagetablecell = p5Var.f22382b;
                if (pagetablecell != null) {
                    e6.d(pagetablecell, p5Var.f22381a.getText());
                }
                b3 b3Var = m5Var.F;
                if (b3Var != null && m5Var.f22598a != null) {
                    t3.S1(b3Var.f22090a);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean z(bx bxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, w91 w91Var) {
        org.telegram.ui.y5 y5Var = (org.telegram.ui.y5) this.f22164b;
        ArrayList arrayList2 = y5Var.f54226c;
        ((bx) this.f22165c).finishFragment();
        org.telegram.messenger.t2 t2Var = null;
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
                    if (((org.telegram.messenger.t2) y5Var.d.get(i13)).f27031a == ((sr) arrayList.get(i12)).f26946a) {
                        t2Var = (org.telegram.messenger.t2) y5Var.d.get(i13);
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
                if (y5Var.getMessagesController().f25873u7.c(y5Var.f54227e) == 2) {
                    i14 = 3;
                }
                ArrayList arrayList3 = y5Var.d;
                org.telegram.messenger.t2 t2Var2 = new org.telegram.messenger.t2(((sr) arrayList.get(i12)).f26946a, i14);
                arrayList3.add(t2Var2);
                t2Var = t2Var2;
            }
            i12++;
        }
        y5Var.getMessagesController().f25873u7.h(y5Var.f54227e, y5Var.d);
        y5Var.Z();
        if (t2Var != null) {
            int i15 = 0;
            while (true) {
                if (i15 < arrayList2.size()) {
                    if (((org.telegram.ui.x5) arrayList2.get(i15)).f53856c != null && ((org.telegram.ui.x5) arrayList2.get(i15)).f53856c.f27031a == t2Var.f27031a) {
                        i11 = i15;
                        break;
                    }
                    i15++;
                } else {
                    break;
                }
            }
            y5Var.f54225b.v0(i11);
            org.telegram.messenger.g0.h3(new org.telegram.ui.u5(0, y5Var, t2Var), 150L);
        }
        return true;
    }

    public f0(db dbVar, org.telegram.ui.Cells.r1 r1Var, TLRPC.User user) {
        this.f22163a = 8;
        this.f22164b = dbVar;
        this.f22165c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.l.b(this, tL_error);
    }

    @Override
    public void f0(View view, float f10, float f11) {
    }
}
