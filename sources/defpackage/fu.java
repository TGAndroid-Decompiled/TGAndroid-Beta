package defpackage;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.voip.GroupCallMessagesController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public final class fu implements Runnable {
    public final byte a;
    public final long b;
    public final Object c;

    public fu(long j, Object obj, byte b) {
        this.a = b;
        this.b = j;
        this.c = obj;
    }

    @Override
    public final void run() {
        int i;
        Context context;
        boolean z;
        int i2;
        int i3;
        int L;
        boolean z2;
        int i4;
        byte b = this.a;
        ylb ylbVar = null;
        boolean z3 = false;
        int i5 = 0;
        long j = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                sx sxVar = (sx) obj;
                if (sxVar != null) {
                    sxVar.a(true);
                }
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(new yv1(kt6.k(j, "user_id")));
                    return;
                }
                return;
            case 1:
                h40 h40Var = (h40) ((m30) obj).c;
                if (j == h40Var.o && (i = h40Var.G) != 9 && i != 10 && i != 8) {
                    SystemClock.elapsedRealtime();
                    h40Var.w = false;
                    h40Var.s(3);
                    h40Var.i.removeCallbacks(h40Var.D);
                    h40Var.h.b("recording started: retainedDurationMs=" + h40.r(h40Var.p));
                    return;
                }
                return;
            case 2:
                String str = hac.a;
                xa3 xa3Var = ((c74) ((o40) ((lx6) obj).c)).a.s;
                tk U = xa3Var.U();
                xa3Var.V(U, 1010, new ua3(U, j));
                return;
            case 3:
                ((rv0) obj).presentFragment(yv1.ga(j));
                return;
            case 4:
                ((c01) obj).a(j);
                return;
            case 5:
                y71 y71Var = (y71) obj;
                y71Var.getClass();
                u31 Q = c41.b0(y71Var).Q(2131624052, 36, jb6.a0(null, null, 2131752598, gm.i0(j, false, false)));
                Q.s = false;
                Q.j();
                return;
            case 6:
                ((iz1) obj).presentFragment(yv1.ga(j));
                return;
            case 7:
                c52 c52Var = (c52) obj;
                i22 i22Var = c52Var.b;
                if (!c52Var.L && c52Var.M0 && c52Var.isShown()) {
                    v12 v12Var = i22Var.o3;
                    d dVar = i22Var.Z1;
                    if ((v12Var.Q() <= gm.L(20.0f) || c52Var.C0 || c52Var.L0) && SystemClock.uptimeMillis() < j) {
                        c52Var.postDelayed(c52Var.P0, 32L);
                        return;
                    }
                    c52Var.P0 = null;
                    ylb ylbVar2 = c52Var.a;
                    if (dVar != null && dVar.getParentActivity() != null) {
                        context = dVar.getParentActivity();
                    } else {
                        context = c52Var.getContext();
                    }
                    if (context != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar2, context);
                        String M0 = jb6.M0(2131742888, null);
                        he heVar = alertDialog$Builder.a;
                        heVar.S = M0;
                        a52 a52Var = new a52(c52Var, context);
                        a52Var.setTextSize(1, 18.0f);
                        anb.X(a52Var, cmb.i5, ylbVar2);
                        anb.D(a52Var, cmb.s5, ylbVar2);
                        a52Var.setHint(jb6.M0(2131742852, null));
                        a52Var.setText(c52Var.t0);
                        a52Var.setSelection(a52Var.length());
                        a52Var.setInputType(147457);
                        a52Var.setMaxLines(5);
                        a52Var.setImeOptions(6);
                        anb.F(a52Var, cmb.j6, cmb.k6, cmb.o7, ylbVar2);
                        a52Var.setBackground(null);
                        a52Var.setPadding(0, gm.L(10.0f), gm.L(48.0f), gm.L(10.0f));
                        oh2 oh2Var = new oh2(1, ylbVar2, context);
                        int i6 = cmb.h6;
                        fg0 f0 = cmb.f0(cmb.v0(i6, ylbVar2), 7, gm.L(12.0f));
                        wmb M = anb.M(i6);
                        oh2Var.setBackground(f0);
                        anb.j(oh2Var, f0, null, M, ylbVar2);
                        String M02 = jb6.M0(2131742759, null);
                        if (c52Var.u0 && c52Var.getPublicKey() != null) {
                            z = false;
                        } else {
                            z = true;
                        }
                        oh2Var.e(M02, "", z, false, false);
                        oh2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) oh2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        if (jb6.a0) {
                            i2 = 5;
                        } else {
                            i2 = 3;
                        }
                        layoutParams.gravity = i2 | 16;
                        oh2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        if (jb6.a0) {
                            i3 = gm.L(4.0f);
                        } else {
                            i3 = 0;
                        }
                        int L2 = gm.L(12.0f);
                        if (jb6.a0) {
                            L = 0;
                        } else {
                            L = gm.L(4.0f);
                        }
                        oh2Var.setPadding(i3, L2, L, gm.L(12.0f));
                        if (c52Var.getPublicKey() != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        oh2Var.setEnabled(z2);
                        oh2Var.setOnClickListener(new kf(oh2Var, (byte) 1));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.addView(a52Var, qoe.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        linearLayout.addView(oh2Var, qoe.t(-1, -2, 83, 8, 0, 8, 0));
                        heVar.H = (byte) 6;
                        alertDialog$Builder.n(linearLayout);
                        heVar.a = gm.L(292.0f);
                        alertDialog$Builder.g(jb6.M0(2131752542, null), new a32((byte) 1));
                        alertDialog$Builder.j(jb6.M0(2131754483, null), new jf(c52Var, a52Var, oh2Var, (byte) 22));
                        c52Var.U0 = heVar;
                        heVar.k0 = false;
                        heVar.setOnShowListener(new jh(a52Var, (byte) 3));
                        heVar.setOnDismissListener(new n1(c52Var, (byte) 15));
                        heVar.create();
                        Window window = heVar.getWindow();
                        Rect rect = new Rect();
                        i22Var.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
                        if (window != null && rect.height() > 0) {
                            WindowManager.LayoutParams attributes = window.getAttributes();
                            View decorView = window.getDecorView();
                            int i7 = attributes.width;
                            if (i7 <= 0) {
                                i7 = rect.width();
                            }
                            if (attributes.width > 0) {
                                i4 = 1073741824;
                            } else {
                                i4 = Integer.MIN_VALUE;
                            }
                            decorView.measure(View.MeasureSpec.makeMeasureSpec(i7, i4), View.MeasureSpec.makeMeasureSpec(rect.height(), Integer.MIN_VALUE));
                            attributes.gravity = 49;
                            attributes.y = Math.max(0, (rect.height() - decorView.getMeasuredHeight()) / 2);
                            window.setAttributes(attributes);
                        }
                        heVar.show();
                        View c = heVar.c(-1);
                        if ((c instanceof TextView) && !TextUtils.isEmpty(c52Var.t0)) {
                            a52Var.addTextChangedListener(new b52(a52Var, (TextView) c));
                            return;
                        }
                        return;
                    }
                    return;
                }
                c52Var.P0 = null;
                return;
            case 8:
                p82 p82Var = (p82) obj;
                ik.J(p82Var.b.Z1.getParentActivity(), j, new ni6(p82Var, (byte) 18), p82Var.a);
                return;
            case 9:
                gm.c3(new ra2((qu0) obj, f0f.b(f0f.c(j)), (byte) 13));
                return;
            case 10:
                pp2 pp2Var = (pp2) obj;
                oc7.r1(pp2Var.a).V2(this.b, pp2Var.o1, true, false, new dp2(pp2Var, (byte) 1));
                return;
            case 11:
                xp2 xp2Var = (xp2) obj;
                xp2Var.i = null;
                xp2Var.g.l(j);
                xp2Var.l++;
                xp2Var.a();
                wp2 wp2Var = xp2Var.h;
                if (wp2Var != null) {
                    wp2Var.U();
                    return;
                }
                return;
            case 12:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j);
                return;
            case 13:
                ((ih3) obj).s.g0(j, false);
                return;
            case 14:
                nk3 nk3Var = (nk3) obj;
                nk3Var.U4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(bf7.a(j, 0L));
                nk3Var.E2.q(nk3Var, arrayList, null, false, nk3Var.L2, nk3Var.M2, nk3Var.N2, null);
                return;
            case 15:
                ov9 ov9Var = (ov9) obj;
                ov9Var.getClass();
                try {
                    cf7.Y(ov9Var.t0).b.executeFast("DELETE FROM search_recent WHERE did = " + j).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    fc4.g(e, true);
                    return;
                }
            case 16:
                ((g95) obj).e1(j, false);
                return;
            case 17:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$7(j);
                return;
            case 18:
                ((z56) obj).presentFragment(yv1.ga(j));
                return;
            case 19:
                dd6 dd6Var = (dd6) obj;
                ArrayList arrayList2 = dd6Var.b;
                vh6 vh6Var = dd6Var.a;
                cd6 cd6Var = (cd6) vh6Var.f(j);
                vh6Var.l(j);
                if (cd6Var != null) {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = dd6Var.getMessagesController().i1(cd6Var.a);
                    tL_messages_editMessage.id = cd6Var.b;
                    tL_messages_editMessage.flags |= 16384;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    dd6Var.getConnectionsManager().sendRequest(tL_messages_editMessage, new vc6(dd6Var, (byte) 0));
                    arrayList2.remove(cd6Var);
                    dd6Var.l(cd6Var, 1);
                    gm.c3(new wc6(dd6Var, cd6Var, (byte) 0));
                    if (arrayList2.isEmpty()) {
                        dd6Var.r(true);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                yv1 yv1Var = ((nq1) obj).f;
                yv1Var.N5(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j);
                if (j == yv1Var.getUserConfig().e()) {
                    bundle.putBoolean("my_profile", true);
                }
                yv1Var.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 21:
                ((js7) obj).a(Long.valueOf(j));
                return;
            case 22:
                yr7.b.add(Long.valueOf(j));
                yr7.j(j, 60000L);
                ((ud7) obj).run();
                u31 Q2 = yr7.h().Q(2131623990, 36, jb6.M0(2131749496, null));
                Q2.u = true;
                Q2.j();
                return;
            case 23:
                a58 a58Var = ((u38) obj).a;
                if (j <= 0) {
                    z3 = true;
                }
                a58Var.a0(z3);
                return;
            case 24:
                gm.d3((p48) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j)));
                return;
            case 25:
                bc8 bc8Var = (bc8) obj;
                bc8Var.getClass();
                bc8Var.h("seekTo(" + Math.round(((float) j) / 1000.0f) + ", true);");
                gm.d3(new xb8(bc8Var, (byte) 1), 100L);
                return;
            case 26:
                ed8 ed8Var = (ed8) obj;
                ot4 ot4Var = jd8.b;
                if (ed8Var != null) {
                    ot4Var.put(Long.valueOf(j), ed8Var);
                }
                if (ot4Var.get(Long.valueOf(j)) == null) {
                    jd8.c.put(Long.valueOf(j), Boolean.TRUE);
                }
                ArrayList arrayList3 = (ArrayList) jd8.d.remove(Long.valueOf(j));
                if (arrayList3 != null) {
                    int size = arrayList3.size();
                    while (i5 < size) {
                        Object obj2 = arrayList3.get(i5);
                        i5++;
                        ((Runnable) obj2).run();
                    }
                    return;
                }
                return;
            case 27:
                ai8 ai8Var = (ai8) obj;
                Activity u0 = gm.u0();
                d S2 = LaunchActivity.S();
                if (!PhotoViewer.r0().V0()) {
                    if (S2 != null) {
                        if (!S2.hasShownSheet()) {
                            ylbVar = S2.getResourceProvider();
                        }
                    }
                    new dxa(u0, ylbVar, this.b, 15, "", new xh8(ai8Var, (byte) 0), 0L).show();
                    return;
                }
                ylbVar = new r63();
                new dxa(u0, ylbVar, this.b, 15, "", new xh8(ai8Var, (byte) 0), 0L).show();
                return;
            case 28:
                jf9 jf9Var = (jf9) obj;
                ik.J(jf9Var.getParentActivity(), j, new x59(jf9Var, (byte) 4), jf9Var.getResourceProvider());
                return;
            default:
                b1a b1aVar = (b1a) obj;
                HashSet hashSet = b1aVar.Z1;
                hashSet.remove(Long.valueOf(j));
                b1aVar.T1.b(true, hashSet, new w0a(b1aVar, (byte) 5), null);
                b1aVar.i1(true, false);
                return;
        }
    }

    public fu(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }
}
