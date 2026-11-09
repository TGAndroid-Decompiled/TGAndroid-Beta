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
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.i1;
import org.telegram.ui.ActionBar.l2;
import org.telegram.ui.ActionBar.l6;
import org.telegram.ui.ActionBar.u1;
import org.telegram.ui.ActionBar.v2;
import org.telegram.ui.ActionBar.z0;
import org.telegram.ui.Cells.w;
import org.telegram.ui.Cells.x8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.a8;
import org.telegram.ui.Components.bx;
import org.telegram.ui.Components.da0;
import org.telegram.ui.Components.di;
import org.telegram.ui.Components.e10;
import org.telegram.ui.Components.fq;
import org.telegram.ui.Components.ft;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.gt;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.i90;
import org.telegram.ui.Components.ia0;
import org.telegram.ui.Components.ja0;
import org.telegram.ui.Components.l60;
import org.telegram.ui.Components.lh;
import org.telegram.ui.Components.lt;
import org.telegram.ui.Components.nc0;
import org.telegram.ui.Components.r2;
import org.telegram.ui.Components.r4;
import org.telegram.ui.Components.r70;
import org.telegram.ui.Components.ru;
import org.telegram.ui.Components.s;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.tq;
import org.telegram.ui.Components.tt0;
import org.telegram.ui.Components.ue;
import org.telegram.ui.Components.vh;
import org.telegram.ui.Components.zs;
import org.telegram.ui.cn;
import org.telegram.ui.y40;
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
        ia0 ia0Var;
        l2 l2Var;
        CharSequence charSequence = null;
        boolean z9 = false;
        boolean z10 = true;
        switch (this.f1074a) {
            case 0:
                ((o) this.f1075b).a(view, (HashSet) this.f1076c, (Runnable) this.d);
                return;
            case 1:
                Context context = (Context) this.f1076c;
                g6 g6Var = (g6) this.d;
                if (((a1) this.f1075b).f3425f2.f6158a == cg.b.f6160a) {
                    new uc(context, g6Var).show();
                    return;
                }
                return;
            case 2:
                final v2 v2Var = (v2) this.f1076c;
                final fi.d dVar = (fi.d) this.d;
                v2Var.f28625b0 = false;
                dVar.setLoading(true);
                ((n9) this.f1075b).a(new c20() {
                    @Override
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.v2 v2Var2 = v2Var;
                                if (booleanValue) {
                                    v2Var2.dismiss();
                                    return;
                                }
                                final fi.d dVar2 = dVar;
                                org.telegram.messenger.g0.i3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                v2Var2.f28625b0 = false;
                                                dVar2.setLoading(false);
                                                return;
                                            default:
                                                v2Var2.f28625b0 = false;
                                                dVar2.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.v2 v2Var3 = v2Var;
                                if (booleanValue2) {
                                    v2Var3.dismiss();
                                    return;
                                }
                                final fi.d dVar3 = dVar;
                                org.telegram.messenger.g0.i3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                v2Var3.f28625b0 = false;
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                v2Var3.f28625b0 = false;
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
                final v2 v2Var2 = (v2) this.f1076c;
                final fi.d dVar2 = (fi.d) this.d;
                v2Var2.f28625b0 = false;
                dVar2.setLoading(true);
                ((k9) this.f1075b).a(new c20() {
                    @Override
                    public final void a(Object obj) {
                        Boolean bool = (Boolean) obj;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.v2 v2Var22 = v2Var2;
                                if (booleanValue) {
                                    v2Var22.dismiss();
                                    return;
                                }
                                final fi.d dVar22 = dVar2;
                                org.telegram.messenger.g0.i3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                v2Var22.f28625b0 = false;
                                                dVar22.setLoading(false);
                                                return;
                                            default:
                                                v2Var22.f28625b0 = false;
                                                dVar22.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.v2 v2Var3 = v2Var2;
                                if (booleanValue2) {
                                    v2Var3.dismiss();
                                    return;
                                }
                                final fi.d dVar3 = dVar2;
                                org.telegram.messenger.g0.i3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                v2Var3.f28625b0 = false;
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                v2Var3.f28625b0 = false;
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
                ((v2) this.d).dismiss();
                return;
            case 5:
                j4 j4Var = ((a4) this.f1075b).f8808x;
                j4Var.D0((q8) this.f1076c, (TL_stories.StoryItem) this.d);
                a4 a4Var = j4Var.f9168c1;
                if (a4Var != null) {
                    a4Var.a();
                    return;
                }
                return;
            case 6:
                a4 a4Var2 = (a4) this.f1075b;
                q9 q9Var = (q9) this.d;
                ((z0) this.f1076c).performHapticFeedback(3);
                hc X = hc.X();
                if (X != null) {
                    X.Q(2131624055, 36, g0.U2(id.M0(2131745933, null), new di.z0(4, a4Var2, q9Var))).j();
                    return;
                }
                return;
            case 7:
                v4 v4Var = (v4) this.f1075b;
                w4 w4Var = new w4(v4Var, 2);
                l5 l5Var = v4Var.f9863b;
                new ru(w4Var, l5Var.getContext(), l5Var.f9330s, (ArrayList) this.f1076c).show();
                ((l60) this.d).u();
                return;
            case 8:
                la laVar = (la) this.f1075b;
                FrameLayout frameLayout = (FrameLayout) this.f1076c;
                di.b bVar = (di.b) this.d;
                l60 l60Var = laVar.U0;
                if (l60Var == null || !l60Var.D()) {
                    fi.o oVar2 = new fi.o(laVar, 0);
                    boolean q10 = p10.i(laVar.U).q();
                    if (q10) {
                        oVar = null;
                    } else {
                        oVar = new fi.o(laVar, 1);
                    }
                    l60 F = l60.F(frameLayout, bVar, laVar.S0);
                    laVar.U0 = F;
                    F.p(13, g0.L(200.0f), id.N0("StoryPeriodHint"));
                    laVar.U0.k();
                    int i7 = 0;
                    while (true) {
                        int[] iArr = fi.r.P1;
                        if (i7 < 4) {
                            int i10 = iArr[i7];
                            l60 l60Var2 = laVar.U0;
                            if (i10 == Integer.MAX_VALUE) {
                                G = id.N0("StoryPeriodKeep");
                            } else {
                                G = id.G(i10 / 3600, "Hours", new Object[0]);
                            }
                            String str = G;
                            int i11 = l6.E8;
                            l60Var2.b(0, null, str, i11, i11, new m0(oVar2, i10, 5));
                            if (!q10 && i10 != 86400 && i10 != Integer.MAX_VALUE) {
                                m0Var = new m0(oVar, i10, 6);
                            } else {
                                m0Var = null;
                            }
                            l60Var2.M(m0Var);
                            if (laVar.W0 == i7) {
                                laVar.U0.L();
                            }
                            i7++;
                        } else {
                            l60 l60Var3 = laVar.U0;
                            l60Var3.f35617s = 0;
                            l60Var3.Z();
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
                f3 f3Var = ((z2) this.f1075b).f13242c;
                ArrayList arrayList = f3Var.f11968h0;
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
                if (x9Var.f12531k1) {
                    sg.q qVar = new sg.q(context2, x9Var.f12538p1);
                    x9Var.C1 = qVar;
                    qVar.I0(x9Var.f12529j1.f55094a, 2);
                    qVar.f55196o1 = new androidx.activity.n(x9Var, l0Var, 1);
                    qVar.n1 = new h8(2, x9Var, l0Var);
                    qVar.show();
                    return;
                }
                Runnable runnable = x9Var.f12546t1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 11:
                kg.e eVar = (kg.e) this.f1075b;
                l60 F2 = l60.F(((cn) this.f1076c).getLayoutContainer(), (g6) this.d, eVar.f17349n);
                F2.c(2131232087, id.M0(2131753702, null), new kg.d(eVar, 1), true);
                F2.E();
                if (eVar.f17354y != null) {
                    F2.c(2131232360, id.M0(2131753703, null), new kg.d(eVar, 2), false);
                }
                F2.a0(g0.L(10.0f), g0.L(7.0f));
                F2.f35617s = 0;
                F2.Z();
                return;
            case 12:
                i0 i0Var = (i0) this.f1075b;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.f1076c;
                r2 r2Var = (r2) this.d;
                fi.d dVar3 = i0Var.U1;
                if (!dVar3.Q) {
                    dVar3.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = qp.s1(i0Var.f28621a).o1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    ConnectionsManager.getInstance(i0Var.f28621a).sendRequest(updateconnectedbot, new bi.j(20, i0Var, r2Var));
                    return;
                }
                return;
            case 13:
                ki.a aVar = (ki.a) this.f1075b;
                c20 c20Var = (c20) this.f1076c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z11 = aVar.Q1;
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
                s sVar = (s) this.f1075b;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) this.f1076c;
                g6 g6Var2 = (g6) this.d;
                fi.d dVar4 = sVar.X1;
                if (dVar4.f11752c0 && !dVar4.Q) {
                    if (sVar.d1()) {
                        sVar.dismiss();
                        return;
                    }
                    dVar4.setLoading(true);
                    TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                    savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                    ConnectionsManager.getInstance(sVar.f28621a).sendRequestTyped(savetone, new d3.b(1), new t0(sVar, g6Var2, aiComposeTone, 4));
                    return;
                }
                return;
            case 16:
                ((boolean[]) this.f1075b)[0] = false;
                ((t4) this.f1076c).L(-1, 0, true);
                ((v2) ((f1) this.d).f14323b).f28660x0.run();
                return;
            case 17:
                Runnable runnable2 = (Runnable) this.d;
                r4 r4Var = (r4) this.f1076c;
                u1 u1Var = ((u1[]) this.f1075b)[0];
                if (u1Var != null) {
                    u1Var.setOnDismissListener(null);
                }
                runnable2.run();
                r4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 18:
                iz.f23423o0 = ((Integer) ((ArrayList) this.f1075b).get(((Integer) view.getTag()).intValue())).intValue();
                SharedPreferences.Editor edit = qp.e1().edit();
                edit.putInt("mapPreviewType", iz.f23423o0);
                edit.apply();
                ((Runnable) this.d).run();
                ((AlertDialog$Builder) this.f1076c).f27296a.L0.run();
                return;
            case 19:
                ((a8) this.f1075b).f31750n.X0((w) this.f1076c, (ij) this.d);
                return;
            case 20:
                di diVar = (di) this.f1075b;
                f2 f2Var = (f2) this.f1076c;
                g6 g6Var3 = (g6) this.d;
                f2 f2Var2 = diVar.W1;
                int i13 = diVar.D3;
                lh lhVar = diVar.C2;
                ue ueVar = diVar.Y1;
                if (ueVar != null) {
                    j3 = ueVar.j();
                } else {
                    j3 = 0;
                }
                long j10 = j3;
                diVar.H2 = j10;
                lhVar.setEffect(j10);
                diVar.f28629c1 = true;
                if (diVar.B1 - diVar.C1 < 0) {
                    g0.F3(diVar.f33038q1);
                    g0.F3(diVar.f33042r1);
                    try {
                        lhVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!qp.s1(i13).D3() && qp.s1(i13).U4 > diVar.C1) {
                        diVar.D1(f2Var);
                    }
                    ue ueVar2 = diVar.Y1;
                    if (ueVar2 != null) {
                        ueVar2.g(false);
                        diVar.Y1 = null;
                        return;
                    }
                    return;
                }
                if (diVar.B3 == null && (f2Var2 instanceof cn)) {
                    cn cnVar = (cn) f2Var2;
                    if (cnVar.c()) {
                        org.telegram.ui.Components.v4.J(diVar.getContext(), cnVar.a(), new c1(diVar, j10, 3), g6Var3);
                        diVar.v1(false, false);
                        return;
                    }
                }
                vh vhVar = diVar.f33047s2;
                if (vhVar != diVar.f32987a2 && vhVar != diVar.f33007h2) {
                    if (!vhVar.L(true, 0, 0, j10, diVar.f1())) {
                        diVar.f33069x4 = true;
                        diVar.dismiss();
                    }
                    u12 = false;
                } else {
                    u12 = diVar.u1(true, 0, 0, j10, diVar.f1());
                }
                ue ueVar3 = diVar.Y1;
                if (ueVar3 != null) {
                    ueVar3.g(!u12);
                    diVar.Y1 = null;
                }
                diVar.v1(false, false);
                return;
            case 21:
                di diVar2 = (di) this.f1075b;
                ij ijVar = (ij) this.f1076c;
                diVar2.v1(!diVar2.T1, true);
                TLRPC.Message message = ijVar.f23262k;
                boolean z12 = diVar2.T1;
                message.invert_media = z12;
                ((ia0) this.d).a(!z12, true);
                diVar2.Y1.e(ijVar);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = diVar2.f32987a2;
                if (chatAttachAlertPhotoLayout != null && (ia0Var = chatAttachAlertPhotoLayout.f31205d1) != null) {
                    ia0Var.a(!diVar2.T1, true);
                }
                diVar2.Y1.m(!diVar2.T1);
                return;
            case 22:
                fi.d dVar5 = (fi.d) this.d;
                ((c20) this.f1076c).a(new vf.b(new gp(dVar5, 4), new fq(2, (tq) this.f1075b, dVar5)));
                return;
            case 23:
                Context context3 = (Context) this.f1076c;
                ((sq) this.f1075b).getClass();
                g0.g(((x8) this.d).f30909a.getText().toString());
                if (g0.I3()) {
                    Toast.makeText(context3, id.M0(2131744194, null), 0).show();
                    return;
                }
                return;
            case 24:
                zs zsVar = (zs) this.f1075b;
                v vVar = (v) this.f1076c;
                q1 q1Var = (q1) this.d;
                try {
                    charSequence = ((ClipboardManager) zsVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(zsVar.getContext());
                } catch (Exception e10) {
                    org.telegram.messenger.a8.g(e10, true);
                }
                if (charSequence != null) {
                    vVar.setText(charSequence);
                    vVar.setSelection(0, vVar.getText().length());
                }
                q1Var.run();
                return;
            case 25:
                lt ltVar = (lt) this.f1075b;
                tt0 tt0Var = (tt0) this.f1076c;
                g6 g6Var4 = (g6) this.d;
                ft ftVar = ltVar.f35841a;
                kg.k kVar = ltVar.f35842b;
                if (kVar.isEnabled() && kVar.getAlpha() >= 0.5f) {
                    i1 i1Var = ltVar.K;
                    if (i1Var == null || !i1Var.f27524f) {
                        if (ltVar.f35846n) {
                            ftVar.m();
                            l60 l60Var4 = new l60(tt0Var, g6Var4, kVar, false, false, true);
                            l60Var4.X = g0.L(280.0f);
                            ftVar.o(null, new i90(l60Var4, ftVar));
                            l60Var4.U = true;
                            l60Var4.Z();
                            return;
                        } else if (!ltVar.f35844e) {
                            ltVar.x(1);
                            boolean isFocused = ftVar.isFocused();
                            gt gtVar = ltVar.d;
                            if (ftVar.length() <= 0) {
                                z10 = false;
                            }
                            gtVar.C(z10, false);
                            ftVar.requestFocus();
                            if (!isFocused) {
                                ftVar.setSelection(ftVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (ltVar.f35851y) {
                                ltVar.k(true);
                                ltVar.f35851y = false;
                                ltVar.p();
                            }
                            ltVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 26:
                e10 e10Var = (e10) this.f1075b;
                e10Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f1076c);
                alertDialog$Builder.f27296a.R = id.M0(2131749561, null);
                alertDialog$Builder.f27296a.T = g0.X2(id.M0(2131749562, null));
                alertDialog$Builder.k(id.M0(2131749563, null), new bx(e10Var, 4));
                alertDialog$Builder.h(id.M0(2131752589, null), null);
                ((f2) this.d).showDialog(alertDialog$Builder.f27296a);
                return;
            case 27:
                r70 r70Var = (r70) this.f1075b;
                v2 v2Var3 = (v2) this.f1076c;
                f2 f2Var3 = (f2) this.d;
                try {
                    if (r70Var.f37565b != null) {
                        ((ClipboardManager) org.telegram.messenger.t0.f25566b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", r70Var.f37565b));
                        if (v2Var3 != null && (l2Var = v2Var3.f28627c) != null) {
                            new hc(l2Var, null).k(false).j();
                        } else {
                            hc.j(f2Var3).j();
                        }
                    }
                    return;
                } catch (Exception e11) {
                    org.telegram.messenger.a8.g(e11, true);
                    return;
                }
            case 28:
                da0 da0Var = (da0) this.f1075b;
                ia0 ia0Var2 = (ia0) this.f1076c;
                ia0 ia0Var3 = (ia0) this.d;
                ja0 ja0Var = da0Var.f32920c0;
                mj mjVar = ja0Var.d;
                boolean z13 = mjVar.f24039l;
                boolean z14 = !z13;
                mjVar.f24039l = z14;
                if (!z13) {
                    if (!mjVar.f24038k) {
                        mjVar.f24038k = true;
                        ja0Var.f34980y = true;
                    }
                } else {
                    if (ja0Var.f34980y) {
                        mjVar.f24038k = false;
                    }
                    ja0Var.f34980y = false;
                }
                ia0Var2.a(z14, true);
                ia0Var3.a(mjVar.f24038k, true);
                da0Var.i();
                da0Var.l(true);
                return;
            default:
                nc0.J0((nc0) this.f1075b, (TLRPC.ChatFull) this.f1076c, (y40) this.d);
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
