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
public final class et implements Runnable {
    public final byte a;
    public final long b;
    public final Object c;

    public et(long j, Object obj, byte b) {
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
        wjb wjbVar = null;
        boolean z3 = false;
        int i5 = 0;
        long j = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                sw swVar = (sw) obj;
                if (swVar != null) {
                    swVar.a(true);
                }
                d S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(new mu1(ls6.k(j, "user_id")));
                    return;
                }
                return;
            case 1:
                h30 h30Var = (h30) ((m20) obj).c;
                if (j == h30Var.o && (i = h30Var.G) != 9 && i != 10 && i != 8) {
                    SystemClock.elapsedRealtime();
                    h30Var.w = false;
                    h30Var.s(3);
                    h30Var.i.removeCallbacks(h30Var.D);
                    h30Var.h.b("recording started: retainedDurationMs=" + h30.r(h30Var.p));
                    return;
                }
                return;
            case 2:
                String str = g8c.a;
                l93 l93Var = ((t54) ((o30) ((tg2) obj).c)).a.s;
                tj U = l93Var.U();
                l93Var.V(U, 1010, new i93(U, j));
                return;
            case 3:
                ((iu0) obj).presentFragment(mu1.U9(j));
                return;
            case 4:
                ((vy0) obj).a(j);
                return;
            case 5:
                r61 r61Var = (r61) obj;
                r61Var.getClass();
                m21 Q = u21.b0(r61Var).Q(2131624052, 36, k96.a0(null, null, 2131752633, gl.i0(j, false, false)));
                Q.r = false;
                Q.j();
                return;
            case 6:
                ((vx1) obj).presentFragment(mu1.U9(j));
                return;
            case 7:
                r32 r32Var = (r32) obj;
                x02 x02Var = r32Var.b;
                if (!r32Var.L && r32Var.M0 && r32Var.isShown()) {
                    k02 k02Var = x02Var.o3;
                    d dVar = x02Var.Z1;
                    if ((k02Var.Q() <= gl.L(20.0f) || r32Var.C0 || r32Var.L0) && SystemClock.uptimeMillis() < j) {
                        r32Var.postDelayed(r32Var.P0, 32L);
                        return;
                    }
                    r32Var.P0 = null;
                    wjb wjbVar2 = r32Var.a;
                    if (dVar != null && dVar.getParentActivity() != null) {
                        context = dVar.getParentActivity();
                    } else {
                        context = r32Var.getContext();
                    }
                    if (context != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, wjbVar2, context);
                        String M0 = k96.M0(2131742962, null);
                        hd hdVar = alertDialog$Builder.a;
                        hdVar.S = M0;
                        p32 p32Var = new p32(r32Var, context);
                        p32Var.setTextSize(1, 18.0f);
                        zkb.X(p32Var, bkb.i5, wjbVar2);
                        zkb.D(p32Var, bkb.s5, wjbVar2);
                        p32Var.setHint(k96.M0(2131742926, null));
                        p32Var.setText(r32Var.t0);
                        p32Var.setSelection(p32Var.length());
                        p32Var.setInputType(147457);
                        p32Var.setMaxLines(5);
                        p32Var.setImeOptions(6);
                        zkb.F(p32Var, bkb.j6, bkb.k6, bkb.o7, wjbVar2);
                        p32Var.setBackground(null);
                        p32Var.setPadding(0, gl.L(10.0f), gl.L(48.0f), gl.L(10.0f));
                        ag2 ag2Var = new ag2(1, wjbVar2, context);
                        int i6 = bkb.h6;
                        ff0 f0 = bkb.f0(bkb.v0(i6, wjbVar2), 7, gl.L(12.0f));
                        vkb M = zkb.M(i6);
                        ag2Var.setBackground(f0);
                        zkb.j(ag2Var, f0, null, M, wjbVar2);
                        String M02 = k96.M0(2131742833, null);
                        if (r32Var.u0 && r32Var.getPublicKey() != null) {
                            z = false;
                        } else {
                            z = true;
                        }
                        ag2Var.e(M02, "", z, false, false);
                        ag2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) ag2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        if (k96.a0) {
                            i2 = 5;
                        } else {
                            i2 = 3;
                        }
                        layoutParams.gravity = i2 | 16;
                        ag2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        if (k96.a0) {
                            i3 = gl.L(4.0f);
                        } else {
                            i3 = 0;
                        }
                        int L2 = gl.L(12.0f);
                        if (k96.a0) {
                            L = 0;
                        } else {
                            L = gl.L(4.0f);
                        }
                        ag2Var.setPadding(i3, L2, L, gl.L(12.0f));
                        if (r32Var.getPublicKey() != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        ag2Var.setEnabled(z2);
                        ag2Var.setOnClickListener(new ke(ag2Var, (byte) 1));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.addView(p32Var, nme.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        linearLayout.addView(ag2Var, nme.t(-1, -2, 83, 8, 0, 8, 0));
                        hdVar.H = (byte) 6;
                        alertDialog$Builder.n(linearLayout);
                        hdVar.a = gl.L(292.0f);
                        alertDialog$Builder.g(k96.M0(2131752577, null), new k32((byte) 0));
                        alertDialog$Builder.j(k96.M0(2131754483, null), new ie(r32Var, p32Var, ag2Var, (byte) 22));
                        r32Var.U0 = hdVar;
                        hdVar.k0 = false;
                        hdVar.setOnShowListener(new jg(p32Var, (byte) 3));
                        hdVar.setOnDismissListener(new n1(r32Var, (byte) 15));
                        hdVar.create();
                        Window window = hdVar.getWindow();
                        Rect rect = new Rect();
                        x02Var.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
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
                        hdVar.show();
                        View c = hdVar.c(-1);
                        if ((c instanceof TextView) && !TextUtils.isEmpty(r32Var.t0)) {
                            p32Var.addTextChangedListener(new q32(p32Var, (TextView) c));
                            return;
                        }
                        return;
                    }
                    return;
                }
                r32Var.P0 = null;
                return;
            case 8:
                e72 e72Var = (e72) obj;
                ij.J(e72Var.b.Z1.getParentActivity(), j, new qx4(e72Var), e72Var.a);
                return;
            case 9:
                gl.d3(new n92((it0) obj, dye.b(dye.c(j)), (byte) 12));
                return;
            case 10:
                eo2 eo2Var = (eo2) obj;
                na7.q1(eo2Var.a).S2(this.b, eo2Var.o1, true, false, new sn2(eo2Var, (byte) 1));
                return;
            case 11:
                mo2 mo2Var = (mo2) obj;
                mo2Var.i = null;
                mo2Var.g.l(j);
                mo2Var.l++;
                mo2Var.a();
                lo2 lo2Var = mo2Var.h;
                if (lo2Var != null) {
                    lo2Var.U0();
                    return;
                }
                return;
            case 12:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j);
                return;
            case 13:
                ((vf3) obj).s.g0(j, false);
                return;
            case 14:
                cj3 cj3Var = (cj3) obj;
                cj3Var.Q4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(zc7.a(j, 0L));
                cj3Var.E2.r(cj3Var, arrayList, null, false, cj3Var.L2, cj3Var.M2, cj3Var.N2, null);
                return;
            case 15:
                mt9 mt9Var = (mt9) obj;
                mt9Var.getClass();
                try {
                    ad7.Y(mt9Var.t0).b.executeFast("DELETE FROM search_recent WHERE did = " + j).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    fa4.g(e, true);
                    return;
                }
            case 16:
                ((h75) obj).e1(j, false);
                return;
            case 17:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$7(j);
                return;
            case 18:
                ((z36) obj).presentFragment(mu1.U9(j));
                return;
            case 19:
                eb6 eb6Var = (eb6) obj;
                ArrayList arrayList2 = eb6Var.b;
                vf6 vf6Var = eb6Var.a;
                db6 db6Var = (db6) vf6Var.f(j);
                vf6Var.l(j);
                if (db6Var != null) {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = eb6Var.getMessagesController().h1(db6Var.a);
                    tL_messages_editMessage.id = db6Var.b;
                    tL_messages_editMessage.flags |= 16384;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    eb6Var.getConnectionsManager().sendRequest(tL_messages_editMessage, new wa6(eb6Var, (byte) 0));
                    arrayList2.remove(db6Var);
                    eb6Var.l(db6Var, 1);
                    gl.d3(new xa6(eb6Var, db6Var, (byte) 0));
                    if (arrayList2.isEmpty()) {
                        eb6Var.r(true);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                mu1 mu1Var = ((ap1) obj).f;
                mu1Var.F5(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j);
                if (j == mu1Var.getUserConfig().e()) {
                    bundle.putBoolean("my_profile", true);
                }
                mu1Var.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 21:
                ((gq7) obj).a(Long.valueOf(j));
                return;
            case 22:
                vp7.b.add(Long.valueOf(j));
                vp7.j(j, 60000L);
                ((pc7) obj).run();
                m21 Q2 = vp7.h().Q(2131623990, 36, k96.M0(2131749547, null));
                Q2.t = true;
                Q2.j();
                return;
            case 23:
                y28 y28Var = ((r18) obj).a;
                if (j <= 0) {
                    z3 = true;
                }
                y28Var.a0(z3);
                return;
            case 24:
                gl.e3((m28) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j)));
                return;
            case 25:
                aa8 aa8Var = (aa8) obj;
                aa8Var.getClass();
                aa8Var.h("seekTo(" + Math.round(((float) j) / 1000.0f) + ", true);");
                gl.e3(new w98(aa8Var, (byte) 1), 100L);
                return;
            case 26:
                bb8 bb8Var = (bb8) obj;
                nr4 nr4Var = gb8.b;
                if (bb8Var != null) {
                    nr4Var.put(Long.valueOf(j), bb8Var);
                }
                if (nr4Var.get(Long.valueOf(j)) == null) {
                    gb8.c.put(Long.valueOf(j), Boolean.TRUE);
                }
                ArrayList arrayList3 = (ArrayList) gb8.d.remove(Long.valueOf(j));
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
                yf8 yf8Var = (yf8) obj;
                Activity u0 = gl.u0();
                d S2 = LaunchActivity.S();
                if (!PhotoViewer.r0().U0()) {
                    if (S2 != null) {
                        if (!S2.hasShownSheet()) {
                            wjbVar = S2.getResourceProvider();
                        }
                    }
                    new zua(u0, wjbVar, this.b, 15, "", new vf8(yf8Var, (byte) 0), 0L).show();
                    return;
                }
                wjbVar = new f53();
                new zua(u0, wjbVar, this.b, 15, "", new vf8(yf8Var, (byte) 0), 0L).show();
                return;
            case 28:
                hd9 hd9Var = (hd9) obj;
                ij.J(hd9Var.getParentActivity(), j, new u39(hd9Var, (byte) 4), hd9Var.getResourceProvider());
                return;
            default:
                zy9 zy9Var = (zy9) obj;
                HashSet hashSet = zy9Var.Z1;
                hashSet.remove(Long.valueOf(j));
                zy9Var.T1.b(true, hashSet, new uy9(zy9Var, (byte) 5), null);
                zy9Var.i1(true, false);
                return;
        }
    }

    public et(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }
}
