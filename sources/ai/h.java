package ai;

import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.Toast;
import ci.i7;
import ci.k8;
import ci.n8;
import ci.nb;
import ei.r9;
import gi.la;
import gi.r8;
import gi.x9;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import org.telegram.messenger.a8;
import org.telegram.messenger.az;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.hp;
import org.telegram.messenger.m9;
import org.telegram.messenger.q9;
import org.telegram.messenger.u10;
import org.telegram.messenger.ye;
import org.telegram.messenger.zi;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.w8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.cl;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.gp;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.pu;
import org.telegram.ui.Components.se;
import org.telegram.ui.Components.sq;
import org.telegram.ui.Components.th;
import org.telegram.ui.Components.tq;
import org.telegram.ui.Components.vp0;
import org.telegram.ui.Components.xs;
import org.telegram.ui.Components.y7;
import org.telegram.ui.wm;
public final class h implements View.OnClickListener {
    public final int f668a;
    public final Object f669b;
    public final Object f670c;
    public final Object d;

    public h(Object obj, Object obj2, Object obj3, int i3) {
        this.f668a = i3;
        this.f669b = obj;
        this.f670c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        gi.o oVar;
        String G;
        cg.l0 l0Var;
        long j10;
        bi biVar;
        boolean u12;
        ca0 ca0Var;
        int i3 = this.f668a;
        CharSequence charSequence = null;
        boolean z10 = false;
        Object obj = this.d;
        Object obj2 = this.f670c;
        Object obj3 = this.f669b;
        switch (i3) {
            case 0:
                new e0((Context) obj2, null, null, (m9) obj).show();
                ((j) obj3).dismiss();
                return;
            case 1:
                e0 e0Var = (e0) obj3;
                boolean[] zArr = (boolean[]) obj2;
                org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj;
                if (!zArr[0]) {
                    zArr[0] = true;
                    q9.c(e0Var.f28583a).e(e0Var.Q1, new m(e0Var, zArr, e6Var, 0));
                    return;
                }
                return;
            case 2:
                s0 s0Var = (s0) obj3;
                int i10 = s0Var.f28583a;
                m9 m9Var = s0Var.f962f2;
                new ci.p1((Context) obj2, (org.telegram.ui.ActionBar.e6) obj, i10, m9Var.d.title, m9Var.h, false).show();
                s0Var.dismiss();
                return;
            case 3:
                s0 s0Var2 = (s0) obj3;
                boolean[] zArr2 = (boolean[]) obj2;
                org.telegram.ui.ActionBar.e6 e6Var2 = (org.telegram.ui.ActionBar.e6) obj;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    q9.c(s0Var2.f28583a).e(s0Var2.R1, new m(s0Var2, zArr2, e6Var2, 1));
                    return;
                }
                return;
            case 4:
                o4 o4Var = (o4) obj3;
                ((f60) obj2).u();
                vp0 vp0Var = o4Var.f856a;
                d4 d4Var = new d4(o4Var, (TL_stars.SavedStarGift) obj, 0);
                HashMap hashMap = u4.V;
                vp0Var.h(null, d4Var);
                return;
            case 5:
                ((bh.m) obj3).a(view, (HashSet) obj2, (Runnable) obj);
                return;
            case 6:
                Context context = (Context) obj2;
                org.telegram.ui.ActionBar.e6 e6Var3 = (org.telegram.ui.ActionBar.e6) obj;
                if (((ci.t0) obj3).f6001g2.f8923a == dg.b.f8925a) {
                    new nb(context, e6Var3).show();
                    return;
                }
                return;
            case 7:
                final org.telegram.ui.ActionBar.t2 t2Var = (org.telegram.ui.ActionBar.t2) obj2;
                final gi.d dVar = (gi.d) obj;
                t2Var.f28590c0 = false;
                dVar.setLoading(true);
                ((n8) obj3).a(new u10() {
                    @Override
                    public final void a(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.t2 t2Var2 = t2Var;
                                if (booleanValue) {
                                    t2Var2.dismiss();
                                    return;
                                }
                                final gi.d dVar2 = dVar;
                                org.telegram.messenger.g0.i3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                t2Var2.f28590c0 = false;
                                                dVar2.setLoading(false);
                                                return;
                                            default:
                                                t2Var2.f28590c0 = false;
                                                dVar2.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.t2 t2Var3 = t2Var;
                                if (booleanValue2) {
                                    t2Var3.dismiss();
                                    return;
                                }
                                final gi.d dVar3 = dVar;
                                org.telegram.messenger.g0.i3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                t2Var3.f28590c0 = false;
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                t2Var3.f28590c0 = false;
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
                final org.telegram.ui.ActionBar.t2 t2Var2 = (org.telegram.ui.ActionBar.t2) obj2;
                final gi.d dVar2 = (gi.d) obj;
                t2Var2.f28590c0 = false;
                dVar2.setLoading(true);
                ((k8) obj3).a(new u10() {
                    @Override
                    public final void a(Object obj4) {
                        Boolean bool = (Boolean) obj4;
                        switch (r3) {
                            case 0:
                                boolean booleanValue = bool.booleanValue();
                                final org.telegram.ui.ActionBar.t2 t2Var22 = t2Var2;
                                if (booleanValue) {
                                    t2Var22.dismiss();
                                    return;
                                }
                                final gi.d dVar22 = dVar2;
                                org.telegram.messenger.g0.i3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                t2Var22.f28590c0 = false;
                                                dVar22.setLoading(false);
                                                return;
                                            default:
                                                t2Var22.f28590c0 = false;
                                                dVar22.setLoading(false);
                                                return;
                                        }
                                    }
                                }, 400L);
                                return;
                            default:
                                boolean booleanValue2 = bool.booleanValue();
                                final org.telegram.ui.ActionBar.t2 t2Var3 = t2Var2;
                                if (booleanValue2) {
                                    t2Var3.dismiss();
                                    return;
                                }
                                final gi.d dVar3 = dVar2;
                                org.telegram.messenger.g0.i3(new Runnable() {
                                    @Override
                                    public final void run() {
                                        switch (r3) {
                                            case 0:
                                                t2Var3.f28590c0 = false;
                                                dVar3.setLoading(false);
                                                return;
                                            default:
                                                t2Var3.f28590c0 = false;
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
                ((ei.d2) obj3).a(Long.valueOf(((long[]) obj2)[0]));
                ((org.telegram.ui.ActionBar.t2) obj).dismiss();
                return;
            case 10:
                ei.j4 j4Var = ((ei.b4) obj3).f10126x;
                j4Var.D0((r8) obj2, (TL_stories.StoryItem) obj);
                ei.b4 b4Var = j4Var.f10449d1;
                if (b4Var != null) {
                    b4Var.a();
                    return;
                }
                return;
            case 11:
                ei.b4 b4Var2 = (ei.b4) obj3;
                r9 r9Var = (r9) obj;
                ((org.telegram.ui.ActionBar.y0) obj2).performHapticFeedback(3);
                fc X = fc.X();
                if (X != null) {
                    X.Q(2131624055, 36, org.telegram.messenger.g0.U2(bd.M0(2131745943, null), new ei.b0(b4Var2, r9Var))).j();
                    return;
                }
                return;
            case 12:
                ei.u4 u4Var = (ei.u4) obj3;
                c7 c7Var = new c7(u4Var, 3);
                ei.k5 k5Var = u4Var.f11088b;
                new pu(c7Var, k5Var.getContext(), k5Var.f10578s, (ArrayList) obj2).show();
                ((f60) obj).u();
                return;
            case 13:
                la laVar = (la) obj3;
                FrameLayout frameLayout = (FrameLayout) obj2;
                ei.b bVar = (ei.b) obj;
                f60 f60Var = laVar.V0;
                if (f60Var == null || !f60Var.D()) {
                    gi.o oVar2 = new gi.o(laVar, 0);
                    boolean q10 = h10.i(laVar.V).q();
                    if (q10) {
                        oVar = null;
                    } else {
                        oVar = new gi.o(laVar, 1);
                    }
                    f60 F = f60.F(frameLayout, bVar, laVar.T0);
                    laVar.V0 = F;
                    F.p(13, org.telegram.messenger.g0.L(200.0f), bd.N0("StoryPeriodHint"));
                    laVar.V0.k();
                    int i11 = 0;
                    while (true) {
                        int[] iArr = gi.r.Q1;
                        if (i11 < 4) {
                            int i12 = iArr[i11];
                            f60 f60Var2 = laVar.V0;
                            if (i12 == Integer.MAX_VALUE) {
                                G = bd.N0("StoryPeriodKeep");
                            } else {
                                G = bd.G(i12 / 3600, "Hours", new Object[0]);
                            }
                            String str = G;
                            int i13 = org.telegram.ui.ActionBar.k6.E8;
                            f60Var2.b(0, null, str, i13, i13, new cg.l0(oVar2, i12, 5));
                            if (!q10 && i12 != 86400 && i12 != Integer.MAX_VALUE) {
                                l0Var = new cg.l0(oVar, i12, 6);
                            } else {
                                l0Var = null;
                            }
                            f60Var2.M(l0Var);
                            if (laVar.X0 == i11) {
                                laVar.V0.L();
                            }
                            i11++;
                        } else {
                            f60 f60Var3 = laVar.V0;
                            f60Var3.f33747s = 0;
                            f60Var3.Z();
                            return;
                        }
                    }
                } else {
                    return;
                }
                break;
            case 14:
                ye yeVar = (ye) obj2;
                gi.z2 z2Var = (gi.z2) obj;
                gi.d3 d3Var = ((gi.x2) obj3).f13824c;
                ArrayList arrayList = d3Var.f12572i0;
                if (arrayList.contains(yeVar)) {
                    arrayList.remove(yeVar);
                } else if (arrayList.size() + 1 > d3Var.S) {
                    int i14 = -d3Var.O;
                    d3Var.O = i14;
                    org.telegram.messenger.g0.G3(i14, z2Var, null);
                    org.telegram.messenger.p2.APP_ERROR.a();
                    return;
                } else {
                    arrayList.add(yeVar);
                }
                org.telegram.messenger.g0.b4(d3Var.d);
                d3Var.j();
                return;
            case 15:
                x9 x9Var = (x9) obj3;
                Context context2 = (Context) obj2;
                tg.k0 k0Var = (tg.k0) obj;
                if (x9Var.f13216l1) {
                    tg.q qVar = new tg.q(context2, x9Var.f13224q1);
                    x9Var.D1 = qVar;
                    qVar.I0(x9Var.k1.f55186a, 2);
                    qVar.f55290p1 = new androidx.activity.n(x9Var, k0Var, 1);
                    qVar.f55289o1 = new i7(2, x9Var, k0Var);
                    qVar.show();
                    return;
                }
                Runnable runnable = x9Var.f13232u1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 16:
                lg.e eVar = (lg.e) obj3;
                f60 F2 = f60.F(((wm) obj2).getLayoutContainer(), (org.telegram.ui.ActionBar.e6) obj, eVar.f18276n);
                F2.c(2131232087, bd.M0(2131753702, null), new lg.d(eVar, 1), true);
                F2.E();
                if (eVar.f18281y != null) {
                    F2.c(2131232360, bd.M0(2131753703, null), new lg.d(eVar, 2), false);
                }
                F2.a0(org.telegram.messenger.g0.L(10.0f), org.telegram.messenger.g0.L(7.0f));
                F2.f33747s = 0;
                F2.Z();
                return;
            case 17:
                lg.j0 j0Var = (lg.j0) obj3;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) obj2;
                org.telegram.ui.Components.o2 o2Var = (org.telegram.ui.Components.o2) obj;
                gi.d dVar3 = j0Var.V1;
                if (!dVar3.R) {
                    dVar3.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = hp.s1(j0Var.f28583a).o1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    ConnectionsManager.getInstance(j0Var.f28583a).sendRequest(updateconnectedbot, new f3(23, j0Var, o2Var));
                    return;
                }
                return;
            case 18:
                li.a aVar = (li.a) obj3;
                u10 u10Var = (u10) obj2;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                boolean z11 = aVar.R1;
                if (chat != null && !org.telegram.messenger.t3.w(27, chat)) {
                    z10 = true;
                }
                aVar.d1(u10Var, z11, z10);
                return;
            case 19:
                ((fa.f) obj3).c();
                ((mi.b6) obj2).D((mi.m0) obj);
                return;
            case 20:
                org.telegram.ui.Components.r rVar = (org.telegram.ui.Components.r) obj3;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj2;
                org.telegram.ui.ActionBar.e6 e6Var4 = (org.telegram.ui.ActionBar.e6) obj;
                gi.d dVar4 = rVar.Y1;
                if (dVar4.f12517d0 && !dVar4.R) {
                    if (rVar.d1()) {
                        rVar.dismiss();
                        return;
                    }
                    dVar4.setLoading(true);
                    TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                    savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                    ConnectionsManager.getInstance(rVar.f28583a).sendRequestTyped(savetone, new c3.b(1), new n0(rVar, e6Var4, aiComposeTone, 6));
                    return;
                }
                return;
            case 21:
                ((boolean[]) obj3)[0] = false;
                ((org.telegram.ui.Components.r4) obj2).L(-1, 0, true);
                ((org.telegram.ui.ActionBar.t2) ((hi.d) obj).f14429b).f28625y0.run();
                return;
            case 22:
                Runnable runnable2 = (Runnable) obj2;
                org.telegram.ui.Components.p4 p4Var = (org.telegram.ui.Components.p4) obj;
                org.telegram.ui.ActionBar.s1 s1Var = ((org.telegram.ui.ActionBar.s1[]) obj3)[0];
                if (s1Var != null) {
                    s1Var.setOnDismissListener(null);
                }
                runnable2.run();
                p4Var.a(((org.telegram.ui.Cells.k) view).getAccountNumber());
                return;
            case 23:
                az.f21650o0 = ((Integer) ((ArrayList) obj3).get(((Integer) view.getTag()).intValue())).intValue();
                SharedPreferences.Editor edit = hp.e1().edit();
                edit.putInt("mapPreviewType", az.f21650o0);
                edit.apply();
                ((Runnable) obj2).run();
                ((AlertDialog$Builder) obj).f27343a.O0.run();
                return;
            case 24:
                ((y7) obj3).f40642n.X0((org.telegram.ui.Cells.w) obj2, (zi) obj);
                return;
            case 25:
                bi biVar2 = (bi) obj3;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                org.telegram.ui.ActionBar.e6 e6Var5 = (org.telegram.ui.ActionBar.e6) obj;
                org.telegram.ui.ActionBar.d2 d2Var2 = biVar2.X1;
                int i15 = biVar2.E3;
                ih ihVar = biVar2.D2;
                se seVar = biVar2.Z1;
                if (seVar != null) {
                    j10 = seVar.j();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                biVar2.I2 = j11;
                ihVar.setEffect(j11);
                biVar2.f28593d1 = true;
                if (biVar2.C1 - biVar2.D1 < 0) {
                    org.telegram.messenger.g0.F3(biVar2.f32266r1);
                    org.telegram.messenger.g0.F3(biVar2.f32270s1);
                    try {
                        ihVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!hp.s1(i15).D3() && hp.s1(i15).U4 > biVar2.D1) {
                        biVar2.D1(d2Var);
                    }
                    se seVar2 = biVar2.Z1;
                    if (seVar2 != null) {
                        seVar2.g(false);
                        biVar2.Z1 = null;
                        return;
                    }
                    return;
                }
                if (biVar2.C3 == null && (d2Var2 instanceof wm)) {
                    wm wmVar = (wm) d2Var2;
                    if (wmVar.c()) {
                        org.telegram.ui.Components.t4.L(biVar2.getContext(), wmVar.a(), new ei.c1(biVar2, j11, 4), e6Var5);
                        biVar = biVar2;
                        biVar.v1(false, false);
                        return;
                    }
                }
                th thVar = biVar2.f32275t2;
                if (thVar != biVar2.f32215b2 && thVar != biVar2.f32235i2) {
                    if (!thVar.L(true, 0, 0, j11, biVar2.f1())) {
                        biVar2.f32297y4 = true;
                        biVar2.dismiss();
                    }
                    u12 = false;
                    biVar = biVar2;
                } else {
                    biVar = biVar2;
                    u12 = biVar.u1(true, 0, 0, j11, biVar2.f1());
                }
                se seVar3 = biVar.Z1;
                if (seVar3 != null) {
                    seVar3.g(!u12);
                    biVar.Z1 = null;
                }
                biVar.v1(false, false);
                return;
            case 26:
                bi biVar3 = (bi) obj3;
                zi ziVar = (zi) obj2;
                biVar3.v1(!biVar3.U1, true);
                TLRPC.Message message = ziVar.f26868k;
                boolean z12 = biVar3.U1;
                message.invert_media = z12;
                ((ca0) obj).a(!z12, true);
                biVar3.Z1.e(ziVar);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar3.f32215b2;
                if (chatAttachAlertPhotoLayout != null && (ca0Var = chatAttachAlertPhotoLayout.f31272e1) != null) {
                    ca0Var.a(!biVar3.U1, true);
                }
                biVar3.Z1.m(!biVar3.U1);
                return;
            case 27:
                gi.d dVar5 = (gi.d) obj;
                ((u10) obj2).a(new sf.b(new gp(dVar5, 4), new cl(7, (tq) obj3, dVar5)));
                return;
            case 28:
                Context context3 = (Context) obj2;
                ((sq) obj3).getClass();
                org.telegram.messenger.g0.g(((w8) obj).f30822a.getText().toString());
                if (org.telegram.messenger.g0.I3()) {
                    Toast.makeText(context3, bd.M0(2131744204, null), 0).show();
                    return;
                }
                return;
            default:
                xs xsVar = (xs) obj3;
                ci.s sVar = (ci.s) obj2;
                gi.q1 q1Var = (gi.q1) obj;
                try {
                    charSequence = ((ClipboardManager) xsVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(xsVar.getContext());
                } catch (Exception e10) {
                    a8.g(e10, true);
                }
                if (charSequence != null) {
                    sVar.setText(charSequence);
                    sVar.setSelection(0, sVar.getText().length());
                }
                q1Var.run();
                return;
        }
    }
}
