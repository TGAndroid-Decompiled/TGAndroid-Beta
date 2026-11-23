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
import org.telegram.messenger.az;
import org.telegram.messenger.dd;
import org.telegram.messenger.dm;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.mr;
import org.telegram.messenger.nc;
import org.telegram.messenger.np;
import org.telegram.messenger.or;
import org.telegram.messenger.pr;
import org.telegram.messenger.tr;
import org.telegram.messenger.yo;
import org.telegram.messenger.yy;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.ResultCallback;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.j9;
import org.telegram.ui.Components.AnimatedArrowDrawable;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.fi0;
import org.telegram.ui.Components.gj0;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.rj0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ad;
import org.telegram.ui.at;
import org.telegram.ui.bn;
import org.telegram.ui.cx;
import org.telegram.ui.db;
import org.telegram.ui.ib;
import org.telegram.ui.io;
import org.telegram.ui.lb;
import org.telegram.ui.mm;
import org.telegram.ui.nh;
import org.telegram.ui.oa1;
import org.telegram.ui.qo;
import org.telegram.ui.rn;
import org.telegram.ui.sn;
import org.telegram.ui.ti;
import org.telegram.ui.uo;
import org.telegram.ui.ww;
import org.telegram.ui.y91;
import org.telegram.ui.zm;
public final class e0 implements mt, f4, org.telegram.ui.Cells.u, rj0, org.telegram.ui.ActionBar.q1, ww, org.telegram.ui.u4, org.telegram.ui.Components.a5, yo, nc, gj0, fi0, mr, ResultCallback, pr, oa1 {
    public final int f22033a;
    public final Object f22034b;
    public final Object f22035c;

    public e0(int i7, Object obj, Object obj2) {
        this.f22033a = i7;
        this.f22034b = obj;
        this.f22035c = obj2;
    }

    @Override
    public boolean G() {
        return false;
    }

    @Override
    public void O(int i7, int i10, boolean z10) {
        switch (this.f22033a) {
            case 10:
                bn bnVar = (bn) this.f22034b;
                bnVar.E8();
                az.Y(bnVar.getAccountInstance(), (Uri) this.f22035c, bnVar.f46056l6, bnVar.F5, bnVar.f46067m4, null, bnVar.H5, z10, i7, bnVar.Y8());
                return;
            case 11:
            default:
                mm mmVar = (mm) this.f22034b;
                gj gjVar = (gj) this.f22035c;
                if (z10) {
                    mmVar.f49910a.getMessagesController().v(gjVar.f24177k.f28419id, i7, org.telegram.messenger.n5.o(gjVar.f24177k.peer_id), null, false);
                    return;
                }
                return;
            case 12:
                bn bnVar2 = (bn) this.f22034b;
                bnVar2.getSendMessagesHelper().r0(yy.b((String) this.f22035c, bnVar2.f46056l6, bnVar2.F5, bnVar2.f46067m4, null, false, null, null, null, z10, i7, 0, null, false));
                bnVar2.f45903a0.setFieldText("");
                bnVar2.D9(false);
                return;
        }
    }

    @Override
    public boolean P(cx cxVar) {
        return false;
    }

    @Override
    public void a(long j3, TLRPC.MessagePeerReaction messagePeerReaction) {
        gj gjVar = (gj) this.f22035c;
        bn bnVar = ((nh) this.f22034b).f50198p;
        Bundle bundle = new Bundle();
        if (j3 > 0) {
            bundle.putLong("user_id", j3);
        } else {
            bundle.putLong("chat_id", -j3);
        }
        bundle.putInt("report_reaction_message_id", gjVar.e1());
        bundle.putLong("report_reaction_from_dialog_id", bnVar.f46056l6);
        bnVar.presentFragment(new ProfileActivity(bundle, null));
        bnVar.P7(true);
    }

    @Override
    public boolean b1(View view) {
        return false;
    }

    @Override
    public void c(org.telegram.ui.c5 c5Var) {
        db dbVar = (db) this.f22034b;
        TLRPC.User user = (TLRPC.User) this.f22035c;
        int ordinal = c5Var.ordinal();
        if (ordinal != 0) {
            if (ordinal == 3) {
                ib ibVar = dbVar.f46870a;
                if (user != null) {
                    Bundle bundle = new Bundle();
                    bundle.putLong("user_id", user.f28547id);
                    org.telegram.ui.ActionBar.g2 g2Var = ibVar.f48698n;
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
    public void d(boolean z10) {
        long j3 = ((TLRPC.User) this.f22035c).f28547id;
        bn bnVar = ((ti) this.f22034b).f52284b;
        long j10 = bnVar.f46144s4;
        if (j3 != j10) {
            return;
        }
        bnVar.Ta(j10, false);
    }

    @Override
    public boolean e(TLRPC.TL_error tL_error) {
        bn.Q0((bn) this.f22034b, (Context) this.f22035c, tL_error);
        return false;
    }

    @Override
    public void f(float f10, float f11, int i7, View view) {
        float f12;
        org.telegram.ui.g4 g4Var = (org.telegram.ui.g4) this.f22034b;
        org.telegram.ui.k3 k3Var = (org.telegram.ui.k3) this.f22035c;
        if (g4Var.L == null || i7 - 1 >= 0) {
            j9 j9Var = g4Var.Q0;
            if (j9Var != null) {
                if (j9Var.x()) {
                    g4Var.Q0.f(false);
                    return;
                }
                g4Var.Q0.f(false);
            }
            org.telegram.ui.e4 adapter = k3Var.getAdapter();
            if ((view instanceof org.telegram.ui.n3) && adapter.F != null) {
                org.telegram.ui.n3 n3Var = (org.telegram.ui.n3) view;
                if (g4Var.I0 == 0) {
                    if ((!n3Var.f50065c || f10 >= view.getMeasuredWidth() / 2) && !n3Var.d) {
                        TLObject h22 = np.u1(g4Var.Y).h2("previews");
                        if (h22 instanceof TLRPC.TL_user) {
                            g4Var.N(adapter.F.f28553id, (TLRPC.User) h22);
                            return;
                        }
                        int i10 = k10.f24932t0;
                        long j3 = adapter.F.f28553id;
                        g4Var.Z(true);
                        TLRPC.TL_contacts_resolveUsername tL_contacts_resolveUsername = new TLRPC.TL_contacts_resolveUsername();
                        tL_contacts_resolveUsername.username = "previews";
                        g4Var.I0 = ConnectionsManager.getInstance(i10).sendRequest(tL_contacts_resolveUsername, new dm(g4Var, i10, j3));
                    }
                }
            } else if (i7 >= 0 && i7 < adapter.d.size()) {
                TL_iv.PageBlock pageBlock = (TL_iv.PageBlock) adapter.d.get(i7);
                TL_iv.PageBlock x10 = org.telegram.ui.g4.x(pageBlock);
                if (x10 instanceof org.telegram.ui.u3) {
                    x10 = ((org.telegram.ui.u3) x10).f52424b;
                }
                if (x10 instanceof TL_iv.pageBlockChannel) {
                    np.u1(g4Var.Y).F3(org.telegram.messenger.v3.K(((TL_iv.pageBlockChannel) x10).channel, false), g4Var.N, 2, null);
                    g4Var.m(false, true);
                } else if (x10 instanceof org.telegram.ui.a4) {
                    org.telegram.ui.a4 a4Var = (org.telegram.ui.a4) x10;
                    g4Var.O(a4Var.f45458a.articles.get(a4Var.f45459b).url, null, null);
                } else if (x10 instanceof TL_iv.pageBlockDetails) {
                    View w10 = org.telegram.ui.g4.w(view);
                    if (w10 instanceof org.telegram.ui.j1) {
                        g4Var.d = null;
                        g4Var.f50728f = null;
                        if (adapter.f47091e.indexOf(pageBlock) >= 0) {
                            TL_iv.pageBlockDetails pageblockdetails = (TL_iv.pageBlockDetails) x10;
                            pageblockdetails.open = !pageblockdetails.open;
                            int b10 = adapter.b();
                            adapter.M();
                            int abs = Math.abs(adapter.b() - b10);
                            org.telegram.ui.j1 j1Var = (org.telegram.ui.j1) w10;
                            AnimatedArrowDrawable animatedArrowDrawable = j1Var.f48876f;
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
    public void g() {
        switch (this.f22033a) {
            case 0:
                ((h0) this.f22034b).i();
                ((g0) this.f22035c).k2();
                return;
            default:
                l5 l5Var = (l5) this.f22034b;
                o5 o5Var = (o5) this.f22035c;
                TL_iv.pageTableCell pagetablecell = o5Var.f22254b;
                if (pagetablecell != null) {
                    d6.d(pagetablecell, o5Var.f22253a.getText());
                }
                a3 a3Var = l5Var.F;
                if (a3Var != null && l5Var.f22468a != null) {
                    s3.S1(a3Var.f21961a);
                    return;
                }
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        String str;
        int i10;
        switch (this.f22033a) {
            case 5:
                org.telegram.ui.p4 p4Var = (org.telegram.ui.p4) this.f22034b;
                p4Var.getClass();
                t1Var.dismiss();
                p4Var.b0((View) this.f22035c, true);
                return;
            case 7:
                vf.c.p(((lb) this.f22034b).getParentActivity(), (String) this.f22035c, true);
                return;
            case 9:
                ad.a0((ad) this.f22034b, (TLRPC.Chat) this.f22035c);
                return;
            case 20:
                io ioVar = (io) this.f22034b;
                TLRPC.TL_channels_updateUsername tL_channels_updateUsername = new TLRPC.TL_channels_updateUsername();
                tL_channels_updateUsername.channel = np.k1((TLRPC.Chat) this.f22035c);
                tL_channels_updateUsername.username = "";
                ioVar.getConnectionsManager().sendRequest(tL_channels_updateUsername, new sn(ioVar, 0), 64);
                return;
            case 24:
                org.telegram.ui.Components.n0 n0Var = (org.telegram.ui.Components.n0) this.f22034b;
                TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) this.f22035c;
                vf.b h = t1Var.h(-1, true, true);
                h.d();
                TL_aicompose.deleteTone deletetone = new TL_aicompose.deleteTone();
                deletetone.tone = TL_aicompose.InputAiComposeTone.from(tL_aiComposeTone);
                ConnectionsManager.getInstance(n0Var.f30139a).sendRequestTyped(deletetone, new d3.b(1), new bi.h0(n0Var, h, tL_aiComposeTone, 6));
                return;
            case 25:
                ((bg.g0) this.f22034b).d(((boolean[]) this.f22035c)[0]);
                return;
            case 26:
                TLRPC.TL_langPackLanguage tL_langPackLanguage = (TLRPC.TL_langPackLanguage) this.f22034b;
                LaunchActivity launchActivity = (LaunchActivity) this.f22035c;
                if (tL_langPackLanguage.official) {
                    str = "remote_" + tL_langPackLanguage.lang_code;
                } else {
                    str = "unofficial_" + tL_langPackLanguage.lang_code;
                }
                dd G0 = hd.E0().G0(str);
                dd ddVar = G0;
                if (G0 == null) {
                    ?? obj = new Object();
                    obj.f23493a = tL_langPackLanguage.native_name;
                    obj.f23494b = tL_langPackLanguage.name;
                    obj.f23495c = tL_langPackLanguage.lang_code;
                    obj.f23496e = tL_langPackLanguage.base_lang_code;
                    obj.f23497f = tL_langPackLanguage.plural_code;
                    obj.f23498g = tL_langPackLanguage.rtl;
                    if (tL_langPackLanguage.official) {
                        obj.d = "remote";
                        ddVar = obj;
                    } else {
                        obj.d = "unofficial";
                        ddVar = obj;
                    }
                }
                hd.E0().c(ddVar, true, false, false, true, k10.f24932t0, null);
                launchActivity.y0(true);
                return;
            case 27:
                at atVar = (at) this.f22034b;
                boolean[] zArr = (boolean[]) this.f22035c;
                boolean z10 = zArr[0];
                boolean z11 = zArr[1];
                cx cxVar = (cx) atVar.f45645b;
                ArrayList arrayList = (ArrayList) atVar.f45646c;
                cxVar.getClass();
                int size = arrayList.size();
                for (int i11 = 0; i11 < size; i11++) {
                    Long l10 = (Long) arrayList.get(i11);
                    long longValue = l10.longValue();
                    if (z10) {
                        cxVar.getMessagesController().w4(longValue, cxVar.getMessagesController().c2(l10), null, null, false);
                    }
                    if (z11) {
                        cxVar.getMessagesController().X(0, longValue, true);
                    }
                    cxVar.getMessagesController().w(longValue);
                }
                cxVar.p4(false);
                return;
            case 28:
                t1Var.dismiss();
                ((li.d) this.f22034b).a(((EditText) this.f22035c).getText().toString());
                return;
            default:
                or orVar = (or) this.f22035c;
                int i12 = ((int[]) this.f22034b)[0];
                if (i12 == 0) {
                    i10 = 900;
                } else if (i12 == 1) {
                    i10 = 3600;
                } else if (i12 == 2) {
                    i10 = 28800;
                } else {
                    i10 = Integer.MAX_VALUE;
                }
                orVar.a(i10);
                return;
        }
    }

    @Override
    public void i() {
        bn bnVar = (bn) this.f22034b;
        bnVar.getClass();
        ((ri.q) this.f22035c).g();
        bnVar.O9();
    }

    @Override
    public void k(TLRPC.TL_inputCheckPasswordSRP tL_inputCheckPasswordSRP) {
        ((org.telegram.ui.np) this.f22034b).u0(tL_inputCheckPasswordSRP, (TwoStepVerificationActivity) this.f22035c);
    }

    @Override
    public void onComplete(Object obj) {
        zm zmVar = (zm) this.f22034b;
        cb0 cb0Var = (cb0) this.f22035c;
        Pair pair = (Pair) obj;
        zmVar.getClass();
        if (pair != null) {
            long longValue = ((Long) pair.first).longValue();
            Bitmap bitmap = (Bitmap) pair.second;
            org.telegram.ui.ActionBar.s3 s3Var = zmVar.f54552f;
            if (s3Var != null && longValue == s3Var.h(zmVar.f54562q ? 1 : 0) && bitmap != null) {
                cb0Var.f34131x = bitmap;
                cb0Var.i();
            }
        }
    }

    @Override
    public void onError(Throwable th2) {
        org.telegram.tgnet.k.a(this, th2);
    }

    @Override
    public void q(Exception exc) {
        AtomicReference atomicReference = (AtomicReference) this.f22035c;
        a8.d("mlkit: failed to detect language in message");
        ((AtomicBoolean) this.f22034b).set(false);
        if (atomicReference.get() != null) {
            ((Runnable) atomicReference.get()).run();
            atomicReference.set(null);
        }
    }

    @Override
    public void run(long j3) {
        boolean z10;
        switch (this.f22033a) {
            case 1:
                TL_keyboard.TL_inlineButtonTypeUserProfile tL_inlineButtonTypeUserProfile = new TL_keyboard.TL_inlineButtonTypeUserProfile();
                tL_inlineButtonTypeUserProfile.user_id = j3;
                ((p3) this.f22034b).a((String) this.f22035c, tL_inlineButtonTypeUserProfile);
                return;
            case 19:
                rn rnVar = (rn) this.f22034b;
                rnVar.getClass();
                ((org.telegram.ui.ActionBar.t1) this.f22035c).dismiss();
                boolean z11 = false;
                rnVar.O0 = false;
                if (j3 != 0) {
                    rnVar.f51705w0 = j3;
                    TLRPC.Chat O0 = rnVar.getMessagesController().O0(Long.valueOf(j3));
                    rnVar.f51707x0 = O0;
                    TLRPC.ChatFull chatFull = rnVar.f51709y0;
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
                    rnVar.getMessagesController().m5(rnVar.f51705w0, rnVar.F0, rnVar.H0, rnVar.I0);
                    TLRPC.Chat chat = rnVar.f51707x0;
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
                uo uoVar = (uo) this.f22034b;
                org.telegram.ui.ActionBar.g2 g2Var = (org.telegram.ui.ActionBar.g2) this.f22035c;
                if (j3 != 0) {
                    uoVar.getMessagesController().n5(j3, false);
                    uoVar.d0(uoVar.getMessagesController().O0(Long.valueOf(j3)), g2Var);
                    return;
                }
                uoVar.getClass();
                return;
            default:
                qo qoVar = (qo) this.f22034b;
                Runnable runnable = (Runnable) this.f22035c;
                if (j3 != 0) {
                    uo uoVar2 = qoVar.f51249y.d;
                    if (uoVar2.f52604s) {
                        uoVar2.f52605w.set(0, uoVar2.getMessagesController().O0(Long.valueOf(j3)));
                    } else {
                        uoVar2.F = j3;
                        uoVar2.f52601f = uoVar2.getMessagesController().O0(Long.valueOf(j3));
                    }
                    runnable.run();
                    return;
                }
                qoVar.getClass();
                return;
        }
    }

    @Override
    public boolean y(cx cxVar, ArrayList arrayList, CharSequence charSequence, boolean z10, boolean z11, int i7, int i10, y91 y91Var) {
        org.telegram.ui.x5 x5Var = (org.telegram.ui.x5) this.f22034b;
        ArrayList arrayList2 = x5Var.f53556c;
        ((cx) this.f22035c).finishFragment();
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
                if (i13 < x5Var.d.size()) {
                    if (((org.telegram.messenger.t2) x5Var.d.get(i13)).f26911a == ((tr) arrayList.get(i12)).f27037a) {
                        t2Var = (org.telegram.messenger.t2) x5Var.d.get(i13);
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
                if (x5Var.getMessagesController().f25941u7.c(x5Var.f53557e) == 2) {
                    i14 = 3;
                }
                ArrayList arrayList3 = x5Var.d;
                org.telegram.messenger.t2 t2Var2 = new org.telegram.messenger.t2(((tr) arrayList.get(i12)).f27037a, i14);
                arrayList3.add(t2Var2);
                t2Var = t2Var2;
            }
            i12++;
        }
        x5Var.getMessagesController().f25941u7.h(x5Var.f53557e, x5Var.d);
        x5Var.Z();
        if (t2Var != null) {
            int i15 = 0;
            while (true) {
                if (i15 < arrayList2.size()) {
                    if (((org.telegram.ui.w5) arrayList2.get(i15)).f52941c != null && ((org.telegram.ui.w5) arrayList2.get(i15)).f52941c.f26911a == t2Var.f26911a) {
                        i11 = i15;
                        break;
                    }
                    i15++;
                } else {
                    break;
                }
            }
            x5Var.f53555b.v0(i11);
            org.telegram.messenger.g0.h3(new s2(26, x5Var, t2Var), 150L);
        }
        return true;
    }

    public e0(db dbVar, org.telegram.ui.Cells.r1 r1Var, TLRPC.User user) {
        this.f22033a = 8;
        this.f22034b = dbVar;
        this.f22035c = user;
    }

    @Override
    public void onError(TLRPC.TL_error tL_error) {
        org.telegram.tgnet.k.b(this, tL_error);
    }

    @Override
    public void s0(View view, float f10, float f11) {
    }
}
