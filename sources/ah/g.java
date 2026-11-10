package ah;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import bg.m0;
import bi.a1;
import bi.h8;
import bi.k9;
import bi.n9;
import bi.t0;
import bi.uc;
import bi.v;
import bi.w4;
import di.a4;
import di.c1;
import di.j4;
import di.l5;
import di.q9;
import di.v4;
import di.z1;
import fi.b3;
import fi.f3;
import fi.la;
import fi.q1;
import fi.q8;
import fi.x9;
import fi.z2;
import h9.f1;
import java.util.ArrayList;
import java.util.HashSet;
import kg.i0;
import li.a6;
import org.telegram.messenger.a8;
import org.telegram.messenger.c20;
import org.telegram.messenger.g0;
import org.telegram.messenger.gf;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.iz;
import org.telegram.messenger.mj;
import org.telegram.messenger.p10;
import org.telegram.messenger.p2;
import org.telegram.messenger.qp;
import org.telegram.messenger.t3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.ActionBar.h6;
import org.telegram.ui.ActionBar.i1;
import org.telegram.ui.ActionBar.m2;
import org.telegram.ui.ActionBar.m6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.w2;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Cells.w;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ax;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.ci;
import org.telegram.ui.Components.d10;
import org.telegram.ui.Components.et;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.h90;
import org.telegram.ui.Components.ha0;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.kh;
import org.telegram.ui.Components.kt;
import org.telegram.ui.Components.mc0;
import org.telegram.ui.Components.q2;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.qu;
import org.telegram.ui.Components.ro;
import org.telegram.ui.Components.rq;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.st0;
import org.telegram.ui.Components.te;
import org.telegram.ui.Components.u4;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.ys;
import org.telegram.ui.Components.z7;
import org.telegram.ui.cn;
import org.telegram.ui.z40;
import sg.l0;
public final class g implements View.OnClickListener {
    public final int f1074a;
    public final Object f1075b;
    public final Object f1076c;
    public final Object d;

    public g(Object obj, Object obj2, Object obj3, int i7) {
        this.f1074a = i7;
        this.f1075b = obj;
        this.f1076c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        fi.o oVar;
        String G;
        m0 m0Var;
        long j3;
        boolean u12;
        ha0 ha0Var;
        m2 m2Var;
        CharSequence charSequence = null;
        boolean z9 = false;
        boolean z10 = true;
        switch (this.f1074a) {
            case 0:
                ((o) this.f1075b).a(view, (HashSet) this.f1076c, (Runnable) this.d);
                return;
            case 1:
                Context context = (Context) this.f1076c;
                h6 h6Var = (h6) this.d;
                if (((a1) this.f1075b).f3428i2.f6163a == cg.b.f6165a) {
                    new uc(context, h6Var).show();
                    return;
                }
                return;
            case 2:
                final w2 w2Var = (w2) this.f1076c;
                final fi.d dVar = (fi.d) this.d;
                w2Var.f28673b0 = false;
                dVar.setLoading(true);
                ((n9) this.f1075b).a(new c20() {
                    @Override
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.w2 w2Var2 = w2Var;
                                if (booleanValue) {
                                    w2Var2.dismiss();
                                    return;
                                }
                                final fi.d dVar2 = dVar;
                                org.telegram.messenger.g0.i3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                w2Var2.f28673b0 = false;
                                                dVar2.setLoading(false);
                                                return;
                                            default:
                                                w2Var2.f28673b0 = false;
                                                dVar2.setLoading(false);
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
                                final fi.d dVar3 = dVar;
                                org.telegram.messenger.g0.i3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                w2Var3.f28673b0 = false;
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                w2Var3.f28673b0 = false;
                                                dVar3.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                        }
                    }
                });
                return;
            case 3:
                final w2 w2Var2 = (w2) this.f1076c;
                final fi.d dVar2 = (fi.d) this.d;
                w2Var2.f28673b0 = false;
                dVar2.setLoading(true);
                ((k9) this.f1075b).a(new c20() {
                    @Override
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.w2 w2Var22 = w2Var2;
                                if (booleanValue) {
                                    w2Var22.dismiss();
                                    return;
                                }
                                final fi.d dVar22 = dVar2;
                                org.telegram.messenger.g0.i3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                w2Var22.f28673b0 = false;
                                                dVar22.setLoading(false);
                                                return;
                                            default:
                                                w2Var22.f28673b0 = false;
                                                dVar22.setLoading(false);
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
                                final fi.d dVar3 = dVar2;
                                org.telegram.messenger.g0.i3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                w2Var3.f28673b0 = false;
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                w2Var3.f28673b0 = false;
                                                dVar3.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                        }
                    }
                });
                return;
            case 4:
                ((z1) this.f1075b).a(Long.valueOf(((long[]) this.f1076c)[0]));
                ((w2) this.d).dismiss();
                return;
            case 5:
                j4 j4Var = ((a4) this.f1075b).f8813x;
                j4Var.D0((q8) this.f1076c, (TL_stories.StoryItem) this.d);
                a4 a4Var = j4Var.f9173c1;
                if (a4Var != null) {
                    a4Var.a();
                    return;
                }
                return;
            case 6:
                a4 a4Var2 = (a4) this.f1075b;
                q9 q9Var = (q9) this.d;
                ((z0) this.f1076c).performHapticFeedback(3);
                gc X = gc.X();
                if (X != null) {
                    X.Q(2131624055, 36, g0.U2(id.M0(2131745933, null), new di.z0(4, a4Var2, q9Var))).j();
                    return;
                }
                return;
            case 7:
                v4 v4Var = (v4) this.f1075b;
                w4 w4Var = new w4(v4Var, 2);
                l5 l5Var = v4Var.f9868b;
                new qu(w4Var, l5Var.getContext(), l5Var.f9335s, (ArrayList) this.f1076c).show();
                ((k60) this.d).u();
                return;
            case 8:
                la laVar = (la) this.f1075b;
                FrameLayout frameLayout = (FrameLayout) this.f1076c;
                di.b bVar = (di.b) this.d;
                k60 k60Var = laVar.U0;
                if (k60Var == null || !k60Var.D()) {
                    fi.o oVar2 = new fi.o(laVar, 0);
                    boolean q10 = p10.i(laVar.U).q();
                    if (q10) {
                        oVar = null;
                    } else {
                        oVar = new fi.o(laVar, 1);
                    }
                    k60 F = k60.F(frameLayout, bVar, laVar.S0);
                    laVar.U0 = F;
                    F.p(13, g0.L(200.0f), id.N0("StoryPeriodHint"));
                    laVar.U0.k();
                    int i7 = 0;
                    while (true) {
                        int[] iArr = fi.r.P1;
                        if (i7 < 4) {
                            int i10 = iArr[i7];
                            k60 k60Var2 = laVar.U0;
                            if (i10 == Integer.MAX_VALUE) {
                                G = id.N0("StoryPeriodKeep");
                            } else {
                                G = id.G(i10 / 3600, "Hours", new Object[0]);
                            }
                            String str = G;
                            int i11 = m6.E8;
                            k60Var2.b(0, null, str, i11, i11, new m0(oVar2, i10, 5));
                            if (!q10 && i10 != 86400 && i10 != Integer.MAX_VALUE) {
                                m0Var = new m0(oVar, i10, 6);
                            } else {
                                m0Var = null;
                            }
                            k60Var2.M(m0Var);
                            if (laVar.W0 == i7) {
                                laVar.U0.L();
                            }
                            i7++;
                        } else {
                            k60 k60Var3 = laVar.U0;
                            k60Var3.f35219s = 0;
                            k60Var3.Z();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 9:
                gf gfVar = (gf) this.f1076c;
                b3 b3Var = (b3) this.d;
                f3 f3Var = ((z2) this.f1075b).f13244c;
                ArrayList arrayList = f3Var.f11972h0;
                if (arrayList.contains(gfVar)) {
                    arrayList.remove(gfVar);
                } else if (arrayList.size() + 1 > f3Var.R) {
                    int i12 = -f3Var.N;
                    f3Var.N = i12;
                    g0.G3(i12, b3Var, null);
                    p2.APP_ERROR.a();
                    return;
                } else {
                    arrayList.add(gfVar);
                }
                g0.b4(f3Var.d);
                f3Var.j();
                return;
            case 10:
                x9 x9Var = (x9) this.f1075b;
                Context context2 = (Context) this.f1076c;
                l0 l0Var = (l0) this.d;
                if (x9Var.f12535k1) {
                    sg.q qVar = new sg.q(context2, x9Var.f12542p1);
                    x9Var.C1 = qVar;
                    qVar.I0(x9Var.f12533j1.f55093a, 2);
                    qVar.f55195r1 = new androidx.activity.n(x9Var, l0Var, 1);
                    qVar.f55194q1 = new h8(2, x9Var, l0Var);
                    qVar.show();
                    return;
                }
                Runnable runnable = x9Var.f12550t1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 11:
                kg.e eVar = (kg.e) this.f1075b;
                k60 F2 = k60.F(((cn) this.f1076c).getLayoutContainer(), (h6) this.d, eVar.f17349n);
                F2.c(2131232087, id.M0(2131753702, null), new kg.d(eVar, 1), true);
                F2.E();
                if (eVar.f17354y != null) {
                    F2.c(2131232360, id.M0(2131753703, null), new kg.d(eVar, 2), false);
                }
                F2.a0(g0.L(10.0f), g0.L(7.0f));
                F2.f35219s = 0;
                F2.Z();
                return;
            case 12:
                i0 i0Var = (i0) this.f1075b;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.f1076c;
                q2 q2Var = (q2) this.d;
                fi.d dVar3 = i0Var.X1;
                if (!dVar3.Q) {
                    dVar3.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = qp.s1(i0Var.f28669a).o1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    ConnectionsManager.getInstance(i0Var.f28669a).sendRequest(updateconnectedbot, new bi.j(20, i0Var, q2Var));
                    return;
                }
                return;
            case 13:
                ki.a aVar = (ki.a) this.f1075b;
                c20 c20Var = (c20) this.f1076c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z11 = aVar.T1;
                if (chat != null && !t3.w(27, chat)) {
                    z9 = true;
                }
                aVar.d1(c20Var, z11, z9);
                return;
            case 14:
                ((ga.d) this.f1075b).c();
                ((a6) this.f1076c).D((li.l0) this.d);
                return;
            case 15:
                org.telegram.ui.Components.r rVar = (org.telegram.ui.Components.r) this.f1075b;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) this.f1076c;
                h6 h6Var2 = (h6) this.d;
                fi.d dVar4 = rVar.f37431a2;
                if (dVar4.f11756c0 && !dVar4.Q) {
                    if (rVar.d1()) {
                        rVar.dismiss();
                        return;
                    }
                    dVar4.setLoading(true);
                    TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                    savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                    ConnectionsManager.getInstance(rVar.f28669a).sendRequestTyped(savetone, new d3.b(1), new t0(rVar, h6Var2, aiComposeTone, 4));
                    return;
                }
                return;
            case 16:
                ((boolean[]) this.f1075b)[0] = false;
                ((s4) this.f1076c).L(-1, 0, true);
                ((w2) ((f1) this.d).f14325b).f28711x0.run();
                return;
            case 17:
                Runnable runnable2 = (Runnable) this.d;
                q4 q4Var = (q4) this.f1076c;
                u1 u1Var = ((u1[]) this.f1075b)[0];
                if (u1Var != null) {
                    u1Var.setOnDismissListener(null);
                }
                runnable2.run();
                q4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 18:
                iz.f23427o0 = ((Integer) ((ArrayList) this.f1075b).get(((Integer) view.getTag()).intValue())).intValue();
                SharedPreferences.Editor edit = qp.e1().edit();
                edit.putInt("mapPreviewType", iz.f23427o0);
                edit.apply();
                ((Runnable) this.d).run();
                ((AlertDialog$Builder) this.f1076c).f27300a.L0.run();
                return;
            case 19:
                ((z7) this.f1075b).f40892n.X0((w) this.f1076c, (ij) this.d);
                return;
            case 20:
                ci ciVar = (ci) this.f1075b;
                f2 f2Var = (f2) this.f1076c;
                h6 h6Var3 = (h6) this.d;
                f2 f2Var2 = ciVar.Z1;
                int i13 = ciVar.G3;
                kh khVar = ciVar.F2;
                te teVar = ciVar.f32594b2;
                if (teVar != null) {
                    j3 = teVar.j();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                ciVar.K2 = j10;
                khVar.setEffect(j10);
                ciVar.f28685f1 = true;
                if (ciVar.E1 - ciVar.F1 < 0) {
                    g0.F3(ciVar.f32651t1);
                    g0.F3(ciVar.f32655u1);
                    try {
                        khVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!qp.s1(i13).D3() && qp.s1(i13).U4 > ciVar.F1) {
                        ciVar.D1(f2Var);
                    }
                    te teVar2 = ciVar.f32594b2;
                    if (teVar2 != null) {
                        teVar2.g(false);
                        ciVar.f32594b2 = null;
                        return;
                    }
                    return;
                }
                if (ciVar.E3 == null && (f2Var2 instanceof cn)) {
                    cn cnVar = (cn) f2Var2;
                    if (cnVar.c()) {
                        u4.J(ciVar.getContext(), cnVar.a(), new c1(ciVar, j10, 3), h6Var3);
                        ciVar.v1(false, false);
                        return;
                    }
                }
                uh uhVar = ciVar.f32660v2;
                if (uhVar != ciVar.d2 && uhVar != ciVar.f32619k2) {
                    if (!uhVar.L(true, 0, 0, j10, ciVar.f1())) {
                        ciVar.A4 = true;
                        ciVar.dismiss();
                    }
                    u12 = false;
                } else {
                    u12 = ciVar.u1(true, 0, 0, j10, ciVar.f1());
                }
                te teVar3 = ciVar.f32594b2;
                if (teVar3 != null) {
                    teVar3.g(!u12);
                    ciVar.f32594b2 = null;
                }
                ciVar.v1(false, false);
                return;
            case 21:
                ci ciVar2 = (ci) this.f1075b;
                ij ijVar = (ij) this.f1076c;
                ciVar2.v1(!ciVar2.W1, true);
                TLRPC.Message message = ijVar.f23266k;
                boolean z12 = ciVar2.W1;
                message.invert_media = z12;
                ((ha0) this.d).a(!z12, true);
                ciVar2.f32594b2.e(ijVar);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = ciVar2.d2;
                if (chatAttachAlertPhotoLayout != null && (ha0Var = chatAttachAlertPhotoLayout.f31216d1) != null) {
                    ha0Var.a(!ciVar2.W1, true);
                }
                ciVar2.f32594b2.m(!ciVar2.W1);
                return;
            case 22:
                fi.d dVar5 = (fi.d) this.d;
                ((c20) this.f1076c).a(new vf.b(new gp(dVar5, 4), new ro(3, (sq) this.f1075b, dVar5)));
                return;
            case 23:
                Context context3 = (Context) this.f1076c;
                ((rq) this.f1075b).getClass();
                g0.g(((x8) this.d).f30920a.getText().toString());
                if (g0.I3()) {
                    Toast.makeText(context3, id.M0(2131744194, null), 0).show();
                    return;
                }
                return;
            case 24:
                ys ysVar = (ys) this.f1075b;
                v vVar = (v) this.f1076c;
                q1 q1Var = (q1) this.d;
                try {
                    charSequence = ((ClipboardManager) ysVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(ysVar.getContext());
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (charSequence != null) {
                    vVar.setText(charSequence);
                    vVar.setSelection(0, vVar.getText().length());
                }
                q1Var.run();
                return;
            case 25:
                kt ktVar = (kt) this.f1075b;
                st0 st0Var = (st0) this.f1076c;
                h6 h6Var4 = (h6) this.d;
                et etVar = ktVar.f35433a;
                kg.k kVar = ktVar.f35434b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    i1 i1Var = ktVar.K;
                    if (i1Var == null || !i1Var.f27532f) {
                        if (ktVar.f35438n) {
                            etVar.m();
                            k60 k60Var4 = new k60(st0Var, h6Var4, kVar, false, false, true);
                            k60Var4.X = g0.L(280.0f);
                            etVar.o(null, new h90(k60Var4, etVar));
                            k60Var4.U = true;
                            k60Var4.Z();
                            return;
                        } else if (!ktVar.f35436e) {
                            ktVar.x(1);
                            boolean isFocused = etVar.isFocused();
                            ft ftVar = ktVar.d;
                            if (etVar.length() <= 0) {
                                z10 = false;
                            }
                            ftVar.C(z10, false);
                            etVar.requestFocus();
                            if (!isFocused) {
                                etVar.setSelection(etVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (ktVar.f35443y) {
                                ktVar.k(true);
                                ktVar.f35443y = false;
                                ktVar.p();
                            }
                            ktVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 26:
                d10 d10Var = (d10) this.f1075b;
                d10Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f1076c);
                alertDialog$Builder.f27300a.R = id.M0(2131749561, null);
                alertDialog$Builder.f27300a.T = g0.X2(id.M0(2131749562, null));
                alertDialog$Builder.k(id.M0(2131749563, null), new ax(d10Var, 4));
                alertDialog$Builder.h(id.M0(2131752589, null), null);
                ((f2) this.d).showDialog(alertDialog$Builder.f27300a);
                return;
            case 27:
                q70 q70Var = (q70) this.f1075b;
                w2 w2Var3 = (w2) this.f1076c;
                f2 f2Var3 = (f2) this.d;
                try {
                    if (q70Var.f37156b != null) {
                        ((ClipboardManager) org.telegram.messenger.t0.f25570b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", q70Var.f37156b));
                        if (w2Var3 != null && (m2Var = w2Var3.f28675c) != null) {
                            new gc(m2Var, null).k(false).j();
                        } else {
                            gc.j(f2Var3).j();
                        }
                    }
                    return;
                } catch (Exception e11) {
                    a8.g(e11, true);
                    return;
                }
            case 28:
                ca0 ca0Var = (ca0) this.f1075b;
                ha0 ha0Var2 = (ha0) this.f1076c;
                ha0 ha0Var3 = (ha0) this.d;
                ia0 ia0Var = ca0Var.f32524c0;
                mj mjVar = ia0Var.d;
                boolean z13 = mjVar.f24043l;
                boolean z14 = !z13;
                mjVar.f24043l = z14;
                if (!z13) {
                    if (!mjVar.f24042k) {
                        mjVar.f24042k = true;
                        ia0Var.f34589y = true;
                    }
                } else {
                    if (ia0Var.f34589y) {
                        mjVar.f24042k = false;
                    }
                    ia0Var.f34589y = false;
                }
                ha0Var2.a(z14, true);
                ha0Var3.a(mjVar.f24042k, true);
                ca0Var.i();
                ca0Var.l(true);
                return;
            default:
                mc0.J0((mc0) this.f1075b, (TLRPC.ChatFull) this.f1076c, (z40) this.d);
                return;
        }
    }

    public g(Object obj, Runnable runnable, Object obj2, int i7) {
        this.f1074a = i7;
        this.f1075b = obj;
        this.d = runnable;
        this.f1076c = obj2;
    }
}
