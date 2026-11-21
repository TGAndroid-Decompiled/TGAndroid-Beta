package ah;

import ai.d0;
import ai.d1;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import bi.c6;
import bi.c9;
import bi.h0;
import bi.m0;
import bi.n6;
import bi.o1;
import bi.t6;
import bi.y;
import di.d7;
import di.f2;
import di.f8;
import di.gb;
import di.h1;
import di.i8;
import di.o0;
import fi.b5;
import fi.f9;
import fi.k4;
import fi.r3;
import fi.u1;
import fi.z3;
import hi.d3;
import hi.ia;
import hi.n8;
import hi.t;
import hi.w4;
import hi.x2;
import hi.z2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import oi.a6;
import org.telegram.messenger.a8;
import org.telegram.messenger.bz;
import org.telegram.messenger.ef;
import org.telegram.messenger.fj;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.j10;
import org.telegram.messenger.mp;
import org.telegram.messenger.q2;
import org.telegram.messenger.q9;
import org.telegram.messenger.u9;
import org.telegram.messenger.v3;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.t1;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.ActionBar.y0;
import org.telegram.ui.Cells.y8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.e8;
import org.telegram.ui.Components.ev;
import org.telegram.ui.Components.gq0;
import org.telegram.ui.Components.ir;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.mf;
import org.telegram.ui.Components.mi;
import org.telegram.ui.Components.oo;
import org.telegram.ui.Components.ot;
import org.telegram.ui.Components.ui;
import org.telegram.ui.Components.va0;
import org.telegram.ui.Components.w;
import org.telegram.ui.Components.y4;
import org.telegram.ui.bn;
import org.telegram.ui.jw0;
import sg.k0;
public final class h implements View.OnClickListener {
    public final int f1073a;
    public final Object f1074b;
    public final Object f1075c;
    public final Object d;

    public h(Object obj, Object obj2, Object obj3, int i7) {
        this.f1073a = i7;
        this.f1074b = obj;
        this.f1075c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        hi.q qVar;
        String G;
        d1 d1Var;
        long j3;
        ui uiVar;
        boolean v12;
        va0 va0Var;
        int i7 = this.f1073a;
        CharSequence charSequence = null;
        boolean z10 = false;
        Object obj = this.d;
        Object obj2 = this.f1075c;
        Object obj3 = this.f1074b;
        switch (i7) {
            case 0:
                ((o) obj3).a(view, (HashSet) obj2, (Runnable) obj);
                return;
            case 1:
                new y((Context) obj2, null, null, (q9) obj).show();
                ((bi.g) obj3).dismiss();
                return;
            case 2:
                y yVar = (y) obj3;
                boolean[] zArr = (boolean[]) obj2;
                h6 h6Var = (h6) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    u9.c(yVar.f30170a).e(yVar.T1, new bi.j(yVar, zArr, h6Var, 0));
                    return;
                }
                return;
            case 3:
                m0 m0Var = (m0) obj3;
                int i10 = m0Var.f30170a;
                q9 q9Var = m0Var.f3864i2;
                new h1((Context) obj2, (h6) obj, i10, q9Var.d.title, q9Var.h, false).show();
                m0Var.dismiss();
                return;
            case 4:
                m0 m0Var2 = (m0) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                h6 h6Var2 = (h6) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    u9.c(m0Var2.f30170a).e(m0Var2.U1, new bi.j(m0Var2, zArr2, h6Var2, 1));
                    return;
                }
                return;
            case 5:
                n6 n6Var = (n6) obj3;
                ((a70) obj2).v();
                gq0 gq0Var = n6Var.f3944a;
                c6 c6Var = new c6(n6Var, (TL_stars.SavedStarGift) obj, 0);
                HashMap hashMap = t6.V;
                gq0Var.h(null, c6Var);
                return;
            case 6:
                Context context = (Context) obj2;
                h6 h6Var3 = (h6) obj;
                if (((o0) obj3).B1.f5300a == cg.b.f5302a) {
                    new gb(context, h6Var3).show();
                    return;
                }
                return;
            case 7:
                final w2 w2Var = (w2) obj2;
                final hi.e eVar = (hi.e) obj;
                w2Var.f30177c0 = false;
                eVar.setLoading(true);
                ((i8) obj3).a(new x10() {
                    @Override
                    public final void a(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
                                if (booleanValue) {
                                    w2Var2.dismiss();
                                    return;
                                }
                                final hi.e eVar2 = eVar;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                w2Var2.f30177c0 = false;
                                                eVar2.setLoading(false);
                                                return;
                                            default:
                                                w2Var2.f30177c0 = false;
                                                eVar2.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.w2 w2Var3 = w2Var;
                                if (booleanValue2) {
                                    w2Var3.dismiss();
                                    return;
                                }
                                final hi.e eVar3 = eVar;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                w2Var3.f30177c0 = false;
                                                eVar3.setLoading(false);
                                                return;
                                            default:
                                                w2Var3.f30177c0 = false;
                                                eVar3.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                        }
                    }
                });
                return;
            case 8:
                final w2 w2Var2 = (w2) obj2;
                final hi.e eVar2 = (hi.e) obj;
                w2Var2.f30177c0 = false;
                eVar2.setLoading(true);
                ((f8) obj3).a(new x10() {
                    @Override
                    public final void a(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.w2 w2Var22 = w2Var2;
                                if (booleanValue) {
                                    w2Var22.dismiss();
                                    return;
                                }
                                final hi.e eVar22 = eVar2;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                w2Var22.f30177c0 = false;
                                                eVar22.setLoading(false);
                                                return;
                                            default:
                                                w2Var22.f30177c0 = false;
                                                eVar22.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.w2 w2Var3 = w2Var2;
                                if (booleanValue2) {
                                    w2Var3.dismiss();
                                    return;
                                }
                                final hi.e eVar3 = eVar2;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                w2Var3.f30177c0 = false;
                                                eVar3.setLoading(false);
                                                return;
                                            default:
                                                w2Var3.f30177c0 = false;
                                                eVar3.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                        }
                    }
                });
                return;
            case 9:
                ((u1) obj3).a(Long.valueOf(((long[]) obj2)[0]));
                ((w2) obj).dismiss();
                return;
            case 10:
                z3 z3Var = ((r3) obj3).f12529x;
                z3Var.D0((n8) obj2, (TL_stories.StoryItem) obj);
                r3 r3Var = z3Var.f12857d1;
                if (r3Var != null) {
                    r3Var.a();
                    return;
                }
                return;
            case 11:
                r3 r3Var2 = (r3) obj3;
                f9 f9Var = (f9) obj;
                ((y0) obj2).performHapticFeedback(3);
                lc Y = lc.Y();
                if (Y != null) {
                    Y.Q(2131624056, 36, g0.T2(gd.N0(2131745737, null), new f2(29, r3Var2, f9Var))).j();
                    return;
                }
                return;
            case 12:
                k4 k4Var = (k4) obj3;
                c9 c9Var = new c9(k4Var, 3);
                b5 b5Var = k4Var.f12221b;
                new ev(c9Var, b5Var.getContext(), b5Var.f11816s, (ArrayList) obj2).show();
                ((a70) obj).v();
                return;
            case 13:
                ia iaVar = (ia) obj3;
                FrameLayout frameLayout = (FrameLayout) obj2;
                fi.b bVar = (fi.b) obj;
                a70 a70Var = iaVar.V0;
                if (a70Var == null || !a70Var.E()) {
                    hi.q qVar2 = new hi.q(iaVar, 0);
                    boolean q10 = j10.i(iaVar.V).q();
                    if (q10) {
                        qVar = null;
                    } else {
                        qVar = new hi.q(iaVar, 1);
                    }
                    a70 G2 = a70.G(frameLayout, bVar, iaVar.T0);
                    iaVar.V0 = G2;
                    G2.p(13, g0.L(200.0f), gd.O0("StoryPeriodHint"));
                    iaVar.V0.k();
                    int i11 = 0;
                    while (true) {
                        int[] iArr = t.Q1;
                        if (i11 < 4) {
                            int i12 = iArr[i11];
                            a70 a70Var2 = iaVar.V0;
                            if (i12 == Integer.MAX_VALUE) {
                                G = gd.O0("StoryPeriodKeep");
                            } else {
                                G = gd.G(i12 / 3600, "Hours", new Object[0]);
                            }
                            String str = G;
                            int i13 = m6.E8;
                            a70Var2.b(0, null, str, i13, i13, new ai.y0(qVar2, i12, 9));
                            if (!q10 && i12 != 86400 && i12 != Integer.MAX_VALUE) {
                                d1Var = new d1(qVar, i12, 1);
                            } else {
                                d1Var = null;
                            }
                            a70Var2.N(d1Var);
                            if (iaVar.X0 == i11) {
                                iaVar.V0.M();
                            }
                            i11++;
                        } else {
                            a70 a70Var3 = iaVar.V0;
                            a70Var3.f33384s = 0;
                            a70Var3.a0();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 14:
                ef efVar = (ef) obj2;
                z2 z2Var = (z2) obj;
                d3 d3Var = ((x2) obj3).f15740c;
                ArrayList arrayList = d3Var.f14497i0;
                if (arrayList.contains(efVar)) {
                    arrayList.remove(efVar);
                } else if (arrayList.size() + 1 > d3Var.S) {
                    int i14 = -d3Var.O;
                    d3Var.O = i14;
                    g0.E3(i14, z2Var, null);
                    q2.APP_ERROR.a();
                    return;
                } else {
                    arrayList.add(efVar);
                }
                g0.Z3(d3Var.d);
                d3Var.j();
                return;
            case 15:
                hi.u9 u9Var = (hi.u9) obj3;
                Context context2 = (Context) obj2;
                k0 k0Var = (k0) obj;
                if (u9Var.l1) {
                    sg.q qVar3 = new sg.q(context2, u9Var.f14896q1);
                    u9Var.D1 = qVar3;
                    qVar3.J0(u9Var.f14887k1.f57259a, 2);
                    qVar3.f57364s1 = new androidx.activity.n(u9Var, k0Var, 1);
                    qVar3.f57363r1 = new d7(2, u9Var, k0Var);
                    qVar3.show();
                    return;
                }
                Runnable runnable = u9Var.f14904u1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 16:
                kg.e eVar3 = (kg.e) obj3;
                a70 G3 = a70.G(((bn) obj2).getLayoutContainer(), (h6) obj, eVar3.f18321n);
                G3.c(2131232089, gd.N0(2131753699, null), new kg.d(eVar3, 1), true);
                G3.F();
                if (eVar3.f18326y != null) {
                    G3.c(2131232362, gd.N0(2131753700, null), new kg.d(eVar3, 2), false);
                }
                G3.b0(g0.L(10.0f), g0.L(7.0f));
                G3.f33384s = 0;
                G3.a0();
                return;
            case 17:
                kg.k0 k0Var2 = (kg.k0) obj3;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) obj2;
                jw0 jw0Var = (jw0) obj;
                hi.e eVar4 = k0Var2.Y1;
                if (!eVar4.R) {
                    eVar4.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = mp.u1(k0Var2.f30170a).q1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    ConnectionsManager.getInstance(k0Var2.f30170a).sendRequest(updateconnectedbot, new o1(21, k0Var2, jw0Var));
                    return;
                }
                return;
            case 18:
                ni.a aVar = (ni.a) obj3;
                x10 x10Var = (x10) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                boolean z11 = aVar.U1;
                if (chat != null && !v3.w(27, chat)) {
                    z10 = true;
                }
                aVar.e1(x10Var, z11, z10);
                return;
            case 19:
                ((ga.d) obj3).c();
                ((a6) obj2).D((oi.k0) obj);
                return;
            case 20:
                w wVar = (w) obj3;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj2;
                h6 h6Var4 = (h6) obj;
                hi.e eVar5 = wVar.f41603b2;
                if (eVar5.f14564e0 && !eVar5.R) {
                    if (wVar.e1()) {
                        wVar.dismiss();
                        return;
                    }
                    eVar5.setLoading(true);
                    TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                    savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                    ConnectionsManager.getInstance(wVar.f30170a).sendRequestTyped(savetone, new d3.b(1), new h0(wVar, h6Var4, aiComposeTone, 7));
                    return;
                }
                return;
            case 21:
                ((boolean[]) obj3)[0] = false;
                ((a5) obj2).O(-1, 0, true);
                ((w2) ((w4) obj).f15705b).f30215y0.run();
                return;
            case 22:
                Runnable runnable2 = (Runnable) obj;
                y4 y4Var = (y4) obj2;
                t1 t1Var = ((t1[]) obj3)[0];
                if (t1Var != null) {
                    t1Var.setOnDismissListener(null);
                }
                runnable2.run();
                y4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 23:
                bz.f23211o0 = ((Integer) ((ArrayList) obj3).get(((Integer) view.getTag()).intValue())).intValue();
                SharedPreferences.Editor edit = mp.g1().edit();
                edit.putInt("mapPreviewType", bz.f23211o0);
                edit.apply();
                ((Runnable) obj).run();
                ((AlertDialog$Builder) obj2).f28774a.M0.run();
                return;
            case 24:
                ((e8) obj3).f34700n.Y0((org.telegram.ui.Cells.w) obj2, (fj) obj);
                return;
            case 25:
                ui uiVar2 = (ui) obj3;
                g2 g2Var = (g2) obj2;
                h6 h6Var5 = (h6) obj;
                g2 g2Var2 = uiVar2.f40375a2;
                int i15 = uiVar2.H3;
                ci ciVar = uiVar2.G2;
                df dfVar = uiVar2.f40381c2;
                if (dfVar != null) {
                    j3 = dfVar.k();
                } else {
                    j3 = 0;
                }
                uiVar2.L2 = j3;
                ciVar.setEffect(j3);
                uiVar2.f30188g1 = true;
                if (uiVar2.F1 - uiVar2.G1 < 0) {
                    g0.D3(uiVar2.f40439u1);
                    g0.D3(uiVar2.f40443v1);
                    try {
                        ciVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!mp.u1(i15).K3() && mp.u1(i15).X4 > uiVar2.G1) {
                        uiVar2.E1(g2Var);
                    }
                    df dfVar2 = uiVar2.f40381c2;
                    if (dfVar2 != null) {
                        dfVar2.h(false);
                        uiVar2.f40381c2 = null;
                        return;
                    }
                    return;
                }
                if (uiVar2.F3 == null && (g2Var2 instanceof bn)) {
                    bn bnVar = (bn) g2Var2;
                    if (bnVar.c()) {
                        c5.J(uiVar2.getContext(), bnVar.a(), new d0(uiVar2, j3, 4), h6Var5);
                        uiVar = uiVar2;
                        uiVar.w1(false, false);
                        return;
                    }
                }
                mi miVar = uiVar2.f40448w2;
                if (miVar != uiVar2.f40386e2 && miVar != uiVar2.f40406l2) {
                    if (!miVar.M(true, 0, 0, j3, uiVar2.g1())) {
                        uiVar2.B4 = true;
                        uiVar2.dismiss();
                    }
                    v12 = false;
                    uiVar = uiVar2;
                } else {
                    uiVar = uiVar2;
                    v12 = uiVar.v1(true, 0, 0, j3, uiVar2.g1());
                }
                df dfVar3 = uiVar.f40381c2;
                if (dfVar3 != null) {
                    dfVar3.h(!v12);
                    uiVar.f40381c2 = null;
                }
                uiVar.w1(false, false);
                return;
            case 26:
                ui uiVar3 = (ui) obj3;
                fj fjVar = (fj) obj2;
                uiVar3.w1(!uiVar3.X1, true);
                TLRPC.Message message = fjVar.f23993k;
                boolean z12 = uiVar3.X1;
                message.invert_media = z12;
                ((va0) obj).a(!z12, true);
                uiVar3.f40381c2.f(fjVar);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = uiVar3.f40386e2;
                if (chatAttachAlertPhotoLayout != null && (va0Var = chatAttachAlertPhotoLayout.f32809e1) != null) {
                    va0Var.a(!uiVar3.X1, true);
                }
                uiVar3.f40381c2.n(!uiVar3.X1);
                return;
            case 27:
                hi.e eVar6 = (hi.e) obj;
                ((x10) obj2).a(new vf.b(new oo(eVar6, 6), new mf(24, (jr) obj3, eVar6)));
                return;
            case 28:
                Context context3 = (Context) obj2;
                ((ir) obj3).getClass();
                g0.g(((y8) obj).f32512a.getText().toString());
                if (g0.G3()) {
                    Toast.makeText(context3, gd.N0(2131743953, null), 0).show();
                    return;
                }
                return;
            default:
                ot otVar = (ot) obj3;
                di.q qVar4 = (di.q) obj2;
                ai.i iVar = (ai.i) obj;
                try {
                    charSequence = ((ClipboardManager) otVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(otVar.getContext());
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (charSequence != null) {
                    qVar4.setText(charSequence);
                    qVar4.setSelection(0, qVar4.getText().length());
                }
                iVar.run();
                return;
        }
    }

    public h(Object obj, Runnable runnable, Object obj2, int i7) {
        this.f1073a = i7;
        this.f1074b = obj;
        this.d = runnable;
        this.f1075c = obj2;
    }
}
