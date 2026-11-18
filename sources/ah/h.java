package ah;

import ai.b1;
import ai.d0;
import ai.w0;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import bi.h0;
import bi.k1;
import bi.k6;
import bi.m0;
import bi.q6;
import bi.y;
import bi.z5;
import bi.z8;
import di.d7;
import di.e8;
import di.gb;
import di.h1;
import di.h8;
import di.o0;
import di.w2;
import fi.a5;
import fi.f9;
import fi.k4;
import fi.r3;
import fi.u1;
import fi.z3;
import hi.a3;
import hi.e3;
import hi.ja;
import hi.o8;
import hi.s;
import hi.v9;
import hi.w4;
import hi.y2;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import kg.l0;
import oi.j0;
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
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.ActionBar.n6;
import org.telegram.ui.ActionBar.x2;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Cells.w;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ai;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.bv;
import org.telegram.ui.Components.df;
import org.telegram.ui.Components.eq0;
import org.telegram.ui.Components.f8;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.hr;
import org.telegram.ui.Components.ki;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.mg;
import org.telegram.ui.Components.mo;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.si;
import org.telegram.ui.Components.ta0;
import org.telegram.ui.Components.v;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.y60;
import org.telegram.ui.Components.z4;
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
        hi.p pVar;
        String G;
        b1 b1Var;
        long j3;
        si siVar;
        boolean v12;
        ta0 ta0Var;
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
                i6 i6Var = (i6) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    u9.c(yVar.f30189a).e(yVar.T1, new bi.j(yVar, zArr, i6Var, 0));
                    return;
                }
                return;
            case 3:
                m0 m0Var = (m0) obj3;
                int i10 = m0Var.f30189a;
                q9 q9Var = m0Var.f3866i2;
                new h1((Context) obj2, (i6) obj, i10, q9Var.d.title, q9Var.h, false).show();
                m0Var.dismiss();
                return;
            case 4:
                m0 m0Var2 = (m0) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                i6 i6Var2 = (i6) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    u9.c(m0Var2.f30189a).e(m0Var2.U1, new bi.j(m0Var2, zArr2, i6Var2, 1));
                    return;
                }
                return;
            case 5:
                k6 k6Var = (k6) obj3;
                ((y60) obj2).v();
                eq0 eq0Var = k6Var.f3813a;
                z5 z5Var = new z5(k6Var, (TL_stars.SavedStarGift) obj, 0);
                HashMap hashMap = q6.V;
                eq0Var.h(null, z5Var);
                return;
            case 6:
                Context context = (Context) obj2;
                i6 i6Var3 = (i6) obj;
                if (((o0) obj3).B1.f5274a == cg.b.f5276a) {
                    new gb(context, i6Var3).show();
                    return;
                }
                return;
            case 7:
                final x2 x2Var = (x2) obj2;
                final hi.d dVar = (hi.d) obj;
                x2Var.f30196c0 = false;
                dVar.setLoading(true);
                ((h8) obj3).a(new x10() {
                    @Override
                    public final void a(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.x2 x2Var2 = x2Var;
                                if (booleanValue) {
                                    x2Var2.dismiss();
                                    return;
                                }
                                final hi.d dVar2 = dVar;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                x2Var2.f30196c0 = false;
                                                dVar2.setLoading(false);
                                                return;
                                            default:
                                                x2Var2.f30196c0 = false;
                                                dVar2.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.x2 x2Var3 = x2Var;
                                if (booleanValue2) {
                                    x2Var3.dismiss();
                                    return;
                                }
                                final hi.d dVar3 = dVar;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                x2Var3.f30196c0 = false;
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                x2Var3.f30196c0 = false;
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
            case 8:
                final x2 x2Var2 = (x2) obj2;
                final hi.d dVar2 = (hi.d) obj;
                x2Var2.f30196c0 = false;
                dVar2.setLoading(true);
                ((e8) obj3).a(new x10() {
                    @Override
                    public final void a(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.x2 x2Var22 = x2Var2;
                                if (booleanValue) {
                                    x2Var22.dismiss();
                                    return;
                                }
                                final hi.d dVar22 = dVar2;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                x2Var22.f30196c0 = false;
                                                dVar22.setLoading(false);
                                                return;
                                            default:
                                                x2Var22.f30196c0 = false;
                                                dVar22.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.x2 x2Var3 = x2Var2;
                                if (booleanValue2) {
                                    x2Var3.dismiss();
                                    return;
                                }
                                final hi.d dVar3 = dVar2;
                                org.telegram.messenger.g0.h3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                x2Var3.f30196c0 = false;
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                x2Var3.f30196c0 = false;
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
            case 9:
                ((u1) obj3).a(Long.valueOf(((long[]) obj2)[0]));
                ((x2) obj).dismiss();
                return;
            case 10:
                z3 z3Var = ((r3) obj3).f12501x;
                z3Var.D0((o8) obj2, (TL_stories.StoryItem) obj);
                r3 r3Var = z3Var.f12819d1;
                if (r3Var != null) {
                    r3Var.a();
                    return;
                }
                return;
            case 11:
                r3 r3Var2 = (r3) obj3;
                f9 f9Var = (f9) obj;
                ((z0) obj2).performHapticFeedback(3);
                lc Y = lc.Y();
                if (Y != null) {
                    Y.Q(2131624056, 36, g0.T2(gd.M0(2131745738, null), new w2(27, r3Var2, f9Var))).j();
                    return;
                }
                return;
            case 12:
                k4 k4Var = (k4) obj3;
                z8 z8Var = new z8(k4Var, 3);
                a5 a5Var = k4Var.f12185b;
                new bv(z8Var, a5Var.getContext(), a5Var.f11735s, (ArrayList) obj2).show();
                ((y60) obj).v();
                return;
            case 13:
                ja jaVar = (ja) obj3;
                FrameLayout frameLayout = (FrameLayout) obj2;
                fi.b bVar = (fi.b) obj;
                y60 y60Var = jaVar.V0;
                if (y60Var == null || !y60Var.E()) {
                    hi.p pVar2 = new hi.p(jaVar, 0);
                    boolean q10 = j10.i(jaVar.V).q();
                    if (q10) {
                        pVar = null;
                    } else {
                        pVar = new hi.p(jaVar, 1);
                    }
                    y60 G2 = y60.G(frameLayout, bVar, jaVar.T0);
                    jaVar.V0 = G2;
                    G2.p(13, g0.L(200.0f), gd.N0("StoryPeriodHint"));
                    jaVar.V0.k();
                    int i11 = 0;
                    while (true) {
                        int[] iArr = s.Q1;
                        if (i11 < 4) {
                            int i12 = iArr[i11];
                            y60 y60Var2 = jaVar.V0;
                            if (i12 == Integer.MAX_VALUE) {
                                G = gd.N0("StoryPeriodKeep");
                            } else {
                                G = gd.G(i12 / 3600, "Hours", new Object[0]);
                            }
                            String str = G;
                            int i13 = n6.E8;
                            y60Var2.b(0, null, str, i13, i13, new w0(pVar2, i12, 9));
                            if (!q10 && i12 != 86400 && i12 != Integer.MAX_VALUE) {
                                b1Var = new b1(pVar, i12, 1);
                            } else {
                                b1Var = null;
                            }
                            y60Var2.N(b1Var);
                            if (jaVar.X0 == i11) {
                                jaVar.V0.M();
                            }
                            i11++;
                        } else {
                            y60 y60Var3 = jaVar.V0;
                            y60Var3.f42375s = 0;
                            y60Var3.a0();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 14:
                ef efVar = (ef) obj2;
                a3 a3Var = (a3) obj;
                e3 e3Var = ((y2) obj3).f15762c;
                ArrayList arrayList = e3Var.f14549i0;
                if (arrayList.contains(efVar)) {
                    arrayList.remove(efVar);
                } else if (arrayList.size() + 1 > e3Var.S) {
                    int i14 = -e3Var.O;
                    e3Var.O = i14;
                    g0.E3(i14, a3Var, null);
                    q2.APP_ERROR.a();
                    return;
                } else {
                    arrayList.add(efVar);
                }
                g0.Z3(e3Var.d);
                e3Var.j();
                return;
            case 15:
                v9 v9Var = (v9) obj3;
                Context context2 = (Context) obj2;
                k0 k0Var = (k0) obj;
                if (v9Var.l1) {
                    sg.q qVar = new sg.q(context2, v9Var.f14924q1);
                    v9Var.D1 = qVar;
                    qVar.J0(v9Var.f14915k1.f57218a, 2);
                    qVar.f57323s1 = new androidx.activity.n(v9Var, k0Var, 1);
                    qVar.f57322r1 = new d7(2, v9Var, k0Var);
                    qVar.show();
                    return;
                }
                Runnable runnable = v9Var.f14932u1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 16:
                kg.e eVar = (kg.e) obj3;
                y60 G3 = y60.G(((bn) obj2).getLayoutContainer(), (i6) obj, eVar.f18295n);
                G3.c(2131232089, gd.M0(2131753700, null), new kg.d(eVar, 1), true);
                G3.F();
                if (eVar.f18300y != null) {
                    G3.c(2131232362, gd.M0(2131753701, null), new kg.d(eVar, 2), false);
                }
                G3.b0(g0.L(10.0f), g0.L(7.0f));
                G3.f42375s = 0;
                G3.a0();
                return;
            case 17:
                l0 l0Var = (l0) obj3;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) obj2;
                jw0 jw0Var = (jw0) obj;
                hi.d dVar3 = l0Var.Y1;
                if (!dVar3.R) {
                    dVar3.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = mp.u1(l0Var.f30189a).q1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    ConnectionsManager.getInstance(l0Var.f30189a).sendRequest(updateconnectedbot, new k1(21, l0Var, jw0Var));
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
                ((oi.z5) obj2).D((j0) obj);
                return;
            case 20:
                v vVar = (v) obj3;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj2;
                i6 i6Var4 = (i6) obj;
                hi.d dVar4 = vVar.f40455b2;
                if (dVar4.f14342e0 && !dVar4.R) {
                    if (vVar.e1()) {
                        vVar.dismiss();
                        return;
                    }
                    dVar4.setLoading(true);
                    TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                    savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                    ConnectionsManager.getInstance(vVar.f30189a).sendRequestTyped(savetone, new d3.b(1), new h0(vVar, i6Var4, aiComposeTone, 7));
                    return;
                }
                return;
            case 21:
                ((boolean[]) obj3)[0] = false;
                ((z4) obj2).O(-1, 0, true);
                ((x2) ((w4) obj).f15645b).f30234y0.run();
                return;
            case 22:
                Runnable runnable2 = (Runnable) obj;
                x4 x4Var = (x4) obj2;
                org.telegram.ui.ActionBar.u1 u1Var = ((org.telegram.ui.ActionBar.u1[]) obj3)[0];
                if (u1Var != null) {
                    u1Var.setOnDismissListener(null);
                }
                runnable2.run();
                x4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 23:
                bz.f23186o0 = ((Integer) ((ArrayList) obj3).get(((Integer) view.getTag()).intValue())).intValue();
                SharedPreferences.Editor edit = mp.g1().edit();
                edit.putInt("mapPreviewType", bz.f23186o0);
                edit.apply();
                ((Runnable) obj).run();
                ((AlertDialog$Builder) obj2).f28746a.M0.run();
                return;
            case 24:
                ((f8) obj3).f35022n.Y0((w) obj2, (fj) obj);
                return;
            case 25:
                si siVar2 = (si) obj3;
                h2 h2Var = (h2) obj2;
                i6 i6Var5 = (i6) obj;
                h2 h2Var2 = siVar2.f39659a2;
                int i15 = siVar2.H3;
                ai aiVar = siVar2.G2;
                df dfVar = siVar2.f39665c2;
                if (dfVar != null) {
                    j3 = dfVar.k();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                siVar2.L2 = j10;
                aiVar.setEffect(j10);
                siVar2.f30207g1 = true;
                if (siVar2.F1 - siVar2.G1 < 0) {
                    g0.D3(siVar2.f39723u1);
                    g0.D3(siVar2.f39727v1);
                    try {
                        aiVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!mp.u1(i15).K3() && mp.u1(i15).X4 > siVar2.G1) {
                        siVar2.E1(h2Var);
                    }
                    df dfVar2 = siVar2.f39665c2;
                    if (dfVar2 != null) {
                        dfVar2.h(false);
                        siVar2.f39665c2 = null;
                        return;
                    }
                    return;
                }
                if (siVar2.F3 == null && (h2Var2 instanceof bn)) {
                    bn bnVar = (bn) h2Var2;
                    if (bnVar.c()) {
                        b5.J(siVar2.getContext(), bnVar.a(), new d0(siVar2, j10, 4), i6Var5);
                        siVar = siVar2;
                        siVar.w1(false, false);
                        return;
                    }
                }
                ki kiVar = siVar2.f39732w2;
                if (kiVar != siVar2.f39670e2 && kiVar != siVar2.f39690l2) {
                    if (!kiVar.M(true, 0, 0, j10, siVar2.g1())) {
                        siVar2.B4 = true;
                        siVar2.dismiss();
                    }
                    v12 = false;
                    siVar = siVar2;
                } else {
                    siVar = siVar2;
                    v12 = siVar.v1(true, 0, 0, j10, siVar2.g1());
                }
                df dfVar3 = siVar.f39665c2;
                if (dfVar3 != null) {
                    dfVar3.h(!v12);
                    siVar.f39665c2 = null;
                }
                siVar.w1(false, false);
                return;
            case 26:
                si siVar3 = (si) obj3;
                fj fjVar = (fj) obj2;
                siVar3.w1(!siVar3.X1, true);
                TLRPC.Message message = fjVar.f23968k;
                boolean z12 = siVar3.X1;
                message.invert_media = z12;
                ((ta0) obj).a(!z12, true);
                siVar3.f39665c2.f(fjVar);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = siVar3.f39670e2;
                if (chatAttachAlertPhotoLayout != null && (ta0Var = chatAttachAlertPhotoLayout.f32776e1) != null) {
                    ta0Var.a(!siVar3.X1, true);
                }
                siVar3.f39665c2.n(!siVar3.X1);
                return;
            case 27:
                hi.d dVar5 = (hi.d) obj;
                ((x10) obj2).a(new vf.b(new mo(dVar5, 6), new mg(22, (hr) obj3, dVar5)));
                return;
            case 28:
                Context context3 = (Context) obj2;
                ((gr) obj3).getClass();
                g0.g(((x8) obj).f32437a.getText().toString());
                if (g0.G3()) {
                    Toast.makeText(context3, gd.M0(2131743959, null), 0).show();
                    return;
                }
                return;
            default:
                mt mtVar = (mt) obj3;
                di.q qVar2 = (di.q) obj2;
                ai.n nVar = (ai.n) obj;
                try {
                    charSequence = ((ClipboardManager) mtVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(mtVar.getContext());
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (charSequence != null) {
                    qVar2.setText(charSequence);
                    qVar2.setSelection(0, qVar2.getText().length());
                }
                nVar.run();
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
