package ag;

import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.widget.Toast;
import bi.q6;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import m.p3;
import org.telegram.messenger.cd;
import org.telegram.messenger.f8;
import org.telegram.messenger.jj;
import org.telegram.messenger.nj;
import org.telegram.messenger.q20;
import org.telegram.messenger.t9;
import org.telegram.messenger.tz;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.messenger.x9;
import org.telegram.messenger.zc;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Cells.z8;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.bi;
import org.telegram.ui.Components.br;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.cr;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.hd0;
import org.telegram.ui.Components.ho;
import org.telegram.ui.Components.i31;
import org.telegram.ui.Components.ih;
import org.telegram.ui.Components.j80;
import org.telegram.ui.Components.k31;
import org.telegram.ui.Components.l31;
import org.telegram.ui.Components.m31;
import org.telegram.ui.Components.mt;
import org.telegram.ui.Components.o4;
import org.telegram.ui.Components.pe;
import org.telegram.ui.Components.pe0;
import org.telegram.ui.Components.px;
import org.telegram.ui.Components.q4;
import org.telegram.ui.Components.qq;
import org.telegram.ui.Components.rt;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.st;
import org.telegram.ui.Components.t10;
import org.telegram.ui.Components.ua0;
import org.telegram.ui.Components.uh;
import org.telegram.ui.Components.uu0;
import org.telegram.ui.Components.v7;
import org.telegram.ui.Components.vq0;
import org.telegram.ui.Components.wt;
import org.telegram.ui.Components.z60;
import org.telegram.ui.Components.z90;
import org.telegram.ui.Components.za0;
import org.telegram.ui.er0;
import org.telegram.ui.un;
import org.telegram.ui.v50;
import org.telegram.ui.xk;
import org.telegram.ui.zd;
import rh.y7;
public final class i implements View.OnClickListener {
    public final int f556a;
    public final Object f557b;
    public final Object f558c;
    public final Object d;

    public i(Object obj, Object obj2, Object obj3, int i10) {
        this.f556a = i10;
        this.f557b = obj;
        this.f558c = obj2;
        this.d = obj3;
    }

    @Override
    public final void onClick(View view) {
        long j10;
        boolean t12;
        za0 za0Var;
        org.telegram.ui.ActionBar.p2 p2Var;
        View view2;
        String L0;
        CharSequence charSequence = null;
        boolean z10 = false;
        boolean z11 = true;
        switch (this.f556a) {
            case 0:
                j jVar = (j) this.f557b;
                z60 F = z60.F(((un) this.f558c).getLayoutContainer(), (p6) this.d, jVar.f574n);
                F.c(2131232086, cd.L0(2131753702, null), new h(jVar, 1), true);
                F.E();
                if (jVar.f579y != null) {
                    F.c(2131232359, cd.L0(2131753703, null), new h(jVar, 2), false);
                }
                F.a0(org.telegram.messenger.i0.L(10.0f), org.telegram.messenger.i0.L(7.0f));
                F.f32941s = 0;
                F.Z();
                return;
            case 1:
                j1 j1Var = (j1) this.f557b;
                TL_account.TL_connectedBot tL_connectedBot = (TL_account.TL_connectedBot) this.f558c;
                qq qqVar = (qq) this.d;
                vh.d dVar = j1Var.U1;
                if (!dVar.Q) {
                    dVar.setLoading(true);
                    TL_account.updateConnectedBot updateconnectedbot = new TL_account.updateConnectedBot();
                    updateconnectedbot.deleted = true;
                    updateconnectedbot.bot = vp.r1(j1Var.f21583a).n1(tL_connectedBot.bot_id);
                    updateconnectedbot.recipients = new TL_account.TL_inputBusinessBotRecipients();
                    ConnectionsManager.getInstance(j1Var.f21583a).sendRequest(updateconnectedbot, new k0(1, j1Var, qqVar));
                    return;
                }
                return;
            case 2:
                ai.a aVar = (ai.a) this.f557b;
                q20 q20Var = (q20) this.f558c;
                TLRPC.Chat chat = (TLRPC.Chat) this.d;
                boolean z12 = aVar.Q1;
                if (chat != null && !w3.w(27, chat)) {
                    z10 = true;
                }
                aVar.d1(q20Var, z12, z10);
                return;
            case 3:
                ((p3) this.f557b).a();
                ((q6) this.f558c).D((bi.p0) this.d);
                return;
            case 4:
                er0 er0Var = (er0) this.f557b;
                Context context = (Context) this.f558c;
                Bitmap bitmap = (Bitmap) this.d;
                if (er0Var.f10193u1) {
                    ig.u uVar = new ig.u(context, er0Var.f10203z1);
                    uVar.I0(er0Var.f10191t1.f8432a, 2);
                    uVar.f8478o1 = new androidx.activity.o(er0Var, bitmap, 3);
                    uVar.f8477n1 = new jg.m(er0Var, 1);
                    uVar.show();
                    return;
                }
                Runnable runnable = er0Var.D1;
                if (runnable != null) {
                    runnable.run();
                    return;
                }
                return;
            case 5:
                org.telegram.ui.Components.r rVar = (org.telegram.ui.Components.r) this.f557b;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) this.f558c;
                p6 p6Var = (p6) this.d;
                vh.d dVar2 = rVar.X1;
                if (dVar2.f51052c0 && !dVar2.Q) {
                    if (rVar.d1()) {
                        rVar.dismiss();
                        return;
                    }
                    dVar2.setLoading(true);
                    TL_aicompose.saveTone savetone = new TL_aicompose.saveTone();
                    savetone.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                    ConnectionsManager.getInstance(rVar.f21583a).sendRequestTyped(savetone, new a3.b(1), new org.telegram.tgnet.e(rVar, p6Var, aiComposeTone, 2));
                    return;
                }
                return;
            case 6:
                ((boolean[]) this.f557b)[0] = false;
                ((q4) this.f558c).K(-1, 0, true);
                ((org.telegram.ui.ActionBar.z2) ((l2.f) this.d).f11587b).f21621x0.run();
                return;
            case 7:
                Runnable runnable2 = (Runnable) this.f558c;
                o4 o4Var = (o4) this.d;
                org.telegram.ui.ActionBar.x1 x1Var = ((org.telegram.ui.ActionBar.x1[]) this.f557b)[0];
                if (x1Var != null) {
                    x1Var.setOnDismissListener(null);
                }
                runnable2.run();
                o4Var.a(((org.telegram.ui.Cells.j) view).getAccountNumber());
                return;
            case 8:
                tz.f18169o0 = ((Integer) ((ArrayList) this.f557b).get(((Integer) view.getTag()).intValue())).intValue();
                SharedPreferences.Editor edit = vp.d1().edit();
                edit.putInt("mapPreviewType", tz.f18169o0);
                edit.apply();
                ((Runnable) this.f558c).run();
                ((AlertDialog$Builder) this.d).f20134a.N0.run();
                return;
            case 9:
                ((v7) this.f557b).f31156n.X0((org.telegram.ui.Cells.w) this.f558c, (jj) this.d);
                return;
            case 10:
                bi biVar = (bi) this.f557b;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f558c;
                p6 p6Var2 = (p6) this.d;
                org.telegram.ui.ActionBar.k2 k2Var2 = biVar.W1;
                int i10 = biVar.D3;
                ih ihVar = biVar.C2;
                pe peVar = biVar.Y1;
                if (peVar != null) {
                    j10 = peVar.j();
                } else {
                    j10 = 0;
                }
                long j11 = j10;
                biVar.H2 = j11;
                ihVar.setEffect(j11);
                biVar.f21591c1 = true;
                if (biVar.B1 - biVar.C1 < 0) {
                    org.telegram.messenger.i0.E3(biVar.f24712q1);
                    org.telegram.messenger.i0.E3(biVar.f24716r1);
                    try {
                        ihVar.performHapticFeedback(3, 2);
                    } catch (Exception unused) {
                    }
                    if (!vp.r1(i10).A3() && vp.r1(i10).V4 > biVar.C1) {
                        biVar.C1(k2Var);
                    }
                    pe peVar2 = biVar.Y1;
                    if (peVar2 != null) {
                        peVar2.g(false);
                        biVar.Y1 = null;
                        return;
                    }
                    return;
                }
                if (biVar.B3 == null && (k2Var2 instanceof un)) {
                    un unVar = (un) k2Var2;
                    if (unVar.c()) {
                        s4.L(biVar.getContext(), unVar.a(), new m4.x0(biVar, j11, 2), p6Var2);
                        biVar.u1(false, false);
                        return;
                    }
                }
                uh uhVar = biVar.f24721s2;
                if (uhVar != biVar.a2 && uhVar != biVar.f24679h2) {
                    if (!uhVar.J(true, 0, 0, j11, biVar.e1())) {
                        biVar.f24743x4 = true;
                        biVar.dismiss();
                    }
                    t12 = false;
                } else {
                    t12 = biVar.t1(true, 0, 0, j11, biVar.e1());
                }
                pe peVar3 = biVar.Y1;
                if (peVar3 != null) {
                    peVar3.g(!t12);
                    biVar.Y1 = null;
                }
                biVar.u1(false, false);
                return;
            case 11:
                bi biVar2 = (bi) this.f557b;
                jj jjVar = (jj) this.f558c;
                biVar2.u1(!biVar2.T1, true);
                TLRPC.Message message = jjVar.f16337k;
                boolean z13 = biVar2.T1;
                message.invert_media = z13;
                ((za0) this.d).a(!z13, true);
                biVar2.Y1.e(jjVar);
                ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = biVar2.a2;
                if (chatAttachAlertPhotoLayout != null && (za0Var = chatAttachAlertPhotoLayout.f23857d1) != null) {
                    za0Var.a(!biVar2.T1, true);
                }
                biVar2.Y1.m(!biVar2.T1);
                return;
            case 12:
                vh.d dVar3 = (vh.d) this.d;
                ((q20) this.f558c).a(new gf.e(new ho(dVar3, 6), new org.telegram.ui.Components.cd(26, (cr) this.f557b, dVar3)));
                return;
            case 13:
                Context context2 = (Context) this.f558c;
                ((br) this.f557b).getClass();
                org.telegram.messenger.i0.g(((z8) this.d).f23648a.getText().toString());
                if (org.telegram.messenger.i0.H3()) {
                    Toast.makeText(context2, cd.L0(2131744219, null), 0).show();
                    return;
                }
                return;
            case 14:
                mt mtVar = (mt) this.f557b;
                zd zdVar = (zd) this.f558c;
                n0 n0Var = (n0) this.d;
                try {
                    charSequence = ((ClipboardManager) mtVar.getContext().getSystemService("clipboard")).getPrimaryClip().getItemAt(0).coerceToText(mtVar.getContext());
                } catch (Exception e) {
                    f8.g(e, true);
                }
                if (charSequence != null) {
                    zdVar.setText(charSequence);
                    zdVar.setSelection(0, zdVar.getText().length());
                }
                n0Var.run();
                return;
            case 15:
                wt wtVar = (wt) this.f557b;
                uu0 uu0Var = (uu0) this.f558c;
                p6 p6Var3 = (p6) this.d;
                rt rtVar = wtVar.f32239a;
                r rVar2 = wtVar.f32240b;
                if (rVar2.isEnabled() && rVar2.getAlpha() >= 0.5f) {
                    org.telegram.ui.ActionBar.m1 m1Var = wtVar.K;
                    if (m1Var == null || !m1Var.f20565f) {
                        if (wtVar.f32243n) {
                            rtVar.m();
                            z60 z60Var = new z60(uu0Var, p6Var3, rVar2, false, false, true);
                            z60Var.X = org.telegram.messenger.i0.L(280.0f);
                            rtVar.o(null, new z90(z60Var, rtVar));
                            z60Var.U = true;
                            z60Var.Z();
                            return;
                        } else if (!wtVar.e) {
                            wtVar.x(1);
                            boolean isFocused = rtVar.isFocused();
                            st stVar = wtVar.d;
                            if (rtVar.length() <= 0) {
                                z11 = false;
                            }
                            stVar.D(z11, false);
                            rtVar.requestFocus();
                            if (!isFocused) {
                                rtVar.setSelection(rtVar.length());
                                return;
                            }
                            return;
                        } else {
                            if (wtVar.f32248y) {
                                wtVar.k(true);
                                wtVar.f32248y = false;
                                wtVar.p();
                            }
                            wtVar.v();
                            return;
                        }
                    }
                    return;
                }
                return;
            case 16:
                t10 t10Var = (t10) this.f557b;
                t10Var.dismiss();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder((Context) this.f558c);
                alertDialog$Builder.f20134a.R = cd.L0(2131749570, null);
                alertDialog$Builder.f20134a.T = org.telegram.messenger.i0.W2(cd.L0(2131749571, null));
                alertDialog$Builder.k(cd.L0(2131749572, null), new px(t10Var, 4));
                alertDialog$Builder.h(cd.L0(2131752589, null), null);
                ((org.telegram.ui.ActionBar.k2) this.d).showDialog(alertDialog$Builder.f20134a);
                return;
            case 17:
                j80 j80Var = (j80) this.f557b;
                org.telegram.ui.ActionBar.z2 z2Var = (org.telegram.ui.ActionBar.z2) this.f558c;
                org.telegram.ui.ActionBar.k2 k2Var3 = (org.telegram.ui.ActionBar.k2) this.d;
                try {
                    if (j80Var.f27257b != null) {
                        ((ClipboardManager) org.telegram.messenger.w0.f19025b.getSystemService("clipboard")).setPrimaryClip(ClipData.newPlainText("label", j80Var.f27257b));
                        if (z2Var != null && (p2Var = z2Var.f21589c) != null) {
                            new cc(p2Var, null).k(false).j();
                        } else {
                            cc.j(k2Var3).j();
                        }
                    }
                    return;
                } catch (Exception e7) {
                    f8.g(e7, true);
                    return;
                }
            case 18:
                ua0 ua0Var = (ua0) this.f557b;
                za0 za0Var2 = (za0) this.f558c;
                za0 za0Var3 = (za0) this.d;
                ab0 ab0Var = ua0Var.f30881c0;
                nj njVar = ab0Var.d;
                boolean z14 = njVar.f17122l;
                boolean z15 = !z14;
                njVar.f17122l = z15;
                if (!z14) {
                    if (!njVar.f17121k) {
                        njVar.f17121k = true;
                        ab0Var.f24361y = true;
                    }
                } else {
                    if (ab0Var.f24361y) {
                        njVar.f17121k = false;
                    }
                    ab0Var.f24361y = false;
                }
                za0Var2.a(z15, true);
                za0Var3.a(njVar.f17121k, true);
                ua0Var.i();
                ua0Var.l(true);
                return;
            case 19:
                hd0.J0((hd0) this.f557b, (TLRPC.ChatFull) this.f558c, (v50) this.d);
                return;
            case 20:
                pe0 pe0Var = (pe0) this.f557b;
                Context context3 = (Context) this.f558c;
                p6 p6Var4 = (p6) this.d;
                if (pe0Var.h == null) {
                    vh.n2 n2Var = new vh.n2(context3, p6Var4, cd.L0(2131743633, null), pe0Var.f29348f);
                    pe0Var.h = n2Var;
                    n2Var.o(new eb0(pe0Var, 8));
                    pe0Var.h.f51504m1 = pe0Var.f29349n;
                }
                pe0Var.h.show();
                return;
            case 21:
                k31 k31Var = (k31) this.f557b;
                zc zcVar = (zc) this.d;
                m31 m31Var = k31Var.f27632n;
                Runnable runnable3 = ((Runnable[]) this.f558c)[0];
                if (runnable3 != null) {
                    runnable3.run();
                }
                String str = m31Var.f28277r1;
                l31 l31Var = m31Var.E1;
                if (!TextUtils.equals(str, zcVar.f19498f)) {
                    View view3 = l31Var.d;
                    if (view3 == m31Var.f28281v1 || view3 == m31Var.f28275p1) {
                        m31Var.f28278s1 = m31Var.f28277r1;
                    }
                    i31 i31Var = k31Var.e;
                    String str2 = zcVar.f19498f;
                    m31Var.f28277r1 = str2;
                    i31Var.setText(m31.K0(m31.O0(str2, null, null)));
                    if (m31Var.f28273n1 != null) {
                        view2 = m31Var.f28274o1;
                    } else {
                        view2 = m31Var.f28280u1;
                    }
                    l31Var.D(view2);
                    m31.S0(m31Var.f28277r1);
                    m31Var.W0();
                    return;
                }
                return;
            case 22:
                xk xkVar = (xk) this.f557b;
                org.telegram.messenger.t10 t10Var2 = (org.telegram.messenger.t10) this.f558c;
                org.telegram.ui.ActionBar.k1 k1Var = (org.telegram.ui.ActionBar.k1) this.d;
                long j12 = xkVar.f25289b;
                t10Var2.J(j12, true, false);
                TLRPC.Chat L02 = vp.r1(xkVar.f25288a).L0(Long.valueOf(-j12));
                if (L02 != null && w3.V(L02)) {
                    L0 = cd.L0(2131743975, null);
                } else if (L02 != null) {
                    L0 = cd.L0(2131743973, null);
                } else {
                    L0 = cd.L0(2131743974, null);
                }
                cc.a0(xkVar.f25290c).K(2131624101, org.telegram.messenger.i0.W2(L0), cd.L0(2131743910, null), new gi0(20, xkVar, t10Var2)).j();
                k1Var.d(true);
                return;
            case 23:
                new ph.m((Context) this.f558c, null, null, (t9) this.d).show();
                ((ph.e) this.f557b).dismiss();
                return;
            case 24:
                ph.m mVar = (ph.m) this.f557b;
                boolean[] zArr = (boolean[]) this.f558c;
                p6 p6Var5 = (p6) this.d;
                if (!zArr[0]) {
                    zArr[0] = true;
                    x9.c(mVar.f21583a).e(mVar.P1, new kg.d0(mVar, zArr, p6Var5, 6));
                    return;
                }
                return;
            case 25:
                ph.w wVar = (ph.w) this.f557b;
                Context context4 = (Context) this.f558c;
                p6 p6Var6 = (p6) this.d;
                int i11 = wVar.f21583a;
                t9 t9Var = wVar.f45340e2;
                new rh.t0(context4, p6Var6, i11, t9Var.d.title, t9Var.h, false).show();
                wVar.dismiss();
                return;
            case 26:
                ph.w wVar2 = (ph.w) this.f557b;
                boolean[] zArr2 = (boolean[]) this.f558c;
                p6 p6Var7 = (p6) this.d;
                if (!zArr2[0]) {
                    zArr2[0] = true;
                    x9.c(wVar2.f21583a).e(wVar2.Q1, new kg.d0(wVar2, zArr2, p6Var7, 7));
                    return;
                }
                return;
            case 27:
                ph.f2 f2Var = (ph.f2) this.f557b;
                ((z60) this.f558c).u();
                vq0 vq0Var = f2Var.f45042a;
                ph.y1 y1Var = new ph.y1(f2Var, (TL_stars.SavedStarGift) this.d, 0);
                HashMap hashMap = ph.j2.U;
                vq0Var.h(null, y1Var);
                return;
            case 28:
                ((qg.h) this.f557b).a(view, (HashSet) this.f558c, (Runnable) this.d);
                return;
            default:
                Context context5 = (Context) this.f558c;
                p6 p6Var8 = (p6) this.d;
                if (((rh.b0) this.f557b).f46662f2.f48254a == sf.b.f48256a) {
                    new y7(context5, p6Var8).show();
                    return;
                }
                return;
        }
    }
}
