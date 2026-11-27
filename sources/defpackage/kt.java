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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.PhotoViewer;
import org.telegram.ui.ProfileActivity;
public final class kt implements Runnable {
    public final byte a;
    public final long b;
    public final Object c;

    public kt(long j, Object obj, byte b) {
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
        vnb vnbVar = null;
        boolean z3 = false;
        int i5 = 0;
        long j = this.b;
        Object obj = this.c;
        switch (b) {
            case 0:
                tw twVar = (tw) obj;
                if (twVar != null) {
                    twVar.a(true);
                }
                e S = LaunchActivity.S();
                if (S != null) {
                    S.presentFragment(new zu1(qu6.k(j, "user_id")));
                    return;
                }
                return;
            case 1:
                i30 i30Var = (i30) ((n20) obj).c;
                if (j == i30Var.o && (i = i30Var.G) != 9 && i != 10 && i != 8) {
                    SystemClock.elapsedRealtime();
                    i30Var.w = false;
                    i30Var.s(3);
                    i30Var.i.removeCallbacks(i30Var.D);
                    i30Var.h.b("recording started: retainedDurationMs=" + i30.r(i30Var.p));
                    return;
                }
                return;
            case 2:
                String str = gcc.a;
                ea3 ea3Var = ((n64) ((p30) ((lh2) obj).c)).a.s;
                uj U = ea3Var.U();
                ea3Var.V(U, 1010, new da3(U, j));
                return;
            case 3:
                ((ru0) obj).presentFragment(zu1.ha(j));
                return;
            case 4:
                ((dz0) obj).a(j);
                return;
            case 5:
                z61 z61Var = (z61) obj;
                z61Var.getClass();
                v21 Q = d31.b0(z61Var).Q(2131624052, 36, ob6.a0(null, null, 2131752626, hl.i0(j, false, false)));
                Q.s = false;
                Q.j();
                return;
            case 6:
                ((ly1) obj).presentFragment(zu1.ha(j));
                return;
            case 7:
                h42 h42Var = (h42) obj;
                n12 n12Var = h42Var.b;
                if (!h42Var.L && h42Var.M0 && h42Var.isShown()) {
                    a12 a12Var = n12Var.o3;
                    e eVar = n12Var.Z1;
                    if ((a12Var.Q() <= hl.L(20.0f) || h42Var.C0 || h42Var.L0) && SystemClock.uptimeMillis() < j) {
                        h42Var.postDelayed(h42Var.P0, 32L);
                        return;
                    }
                    h42Var.P0 = null;
                    vnb vnbVar2 = h42Var.a;
                    if (eVar != null && eVar.getParentActivity() != null) {
                        context = eVar.getParentActivity();
                    } else {
                        context = h42Var.getContext();
                    }
                    if (context != null) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar2, context);
                        String M0 = ob6.M0(2131742856, null);
                        id idVar = alertDialog$Builder.a;
                        idVar.S = M0;
                        f42 f42Var = new f42(h42Var, context);
                        f42Var.setTextSize(1, 18.0f);
                        yob.X(f42Var, aob.j5, vnbVar2);
                        yob.D(f42Var, aob.t5, vnbVar2);
                        f42Var.setHint(ob6.M0(2131742820, null));
                        f42Var.setText(h42Var.t0);
                        f42Var.setSelection(f42Var.length());
                        f42Var.setInputType(147457);
                        f42Var.setMaxLines(5);
                        f42Var.setImeOptions(6);
                        yob.F(f42Var, aob.k6, aob.l6, aob.p7, vnbVar2);
                        f42Var.setBackground(null);
                        f42Var.setPadding(0, hl.L(10.0f), hl.L(48.0f), hl.L(10.0f));
                        sg2 sg2Var = new sg2(1, vnbVar2, context);
                        int i6 = aob.i6;
                        hf0 f0 = aob.f0(aob.v0(i6, vnbVar2), 7, hl.L(12.0f));
                        uob M = yob.M(i6);
                        sg2Var.setBackground(f0);
                        yob.j(sg2Var, f0, null, M, vnbVar2);
                        String M02 = ob6.M0(2131742727, null);
                        if (h42Var.u0 && h42Var.getPublicKey() != null) {
                            z = false;
                        } else {
                            z = true;
                        }
                        sg2Var.e(M02, "", z, false, false);
                        sg2Var.setMultiline(true);
                        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) sg2Var.getCheckBoxView().getLayoutParams();
                        layoutParams.topMargin = 0;
                        if (ob6.a0) {
                            i2 = 5;
                        } else {
                            i2 = 3;
                        }
                        layoutParams.gravity = i2 | 16;
                        sg2Var.getCheckBoxView().setLayoutParams(layoutParams);
                        if (ob6.a0) {
                            i3 = hl.L(4.0f);
                        } else {
                            i3 = 0;
                        }
                        int L2 = hl.L(12.0f);
                        if (ob6.a0) {
                            L = 0;
                        } else {
                            L = hl.L(4.0f);
                        }
                        sg2Var.setPadding(i3, L2, L, hl.L(12.0f));
                        if (h42Var.getPublicKey() != null) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        sg2Var.setEnabled(z2);
                        sg2Var.setOnClickListener(new qd(sg2Var, (byte) 1));
                        LinearLayout linearLayout = new LinearLayout(context);
                        linearLayout.setOrientation(1);
                        linearLayout.addView(f42Var, tre.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                        linearLayout.addView(sg2Var, tre.t(-1, -2, 83, 8, 0, 8, 0));
                        idVar.H = (byte) 6;
                        alertDialog$Builder.n(linearLayout);
                        idVar.a = hl.L(292.0f);
                        alertDialog$Builder.g(ob6.M0(2131752570, null), new c22((byte) 5));
                        alertDialog$Builder.j(ob6.M0(2131754479, null), new ie(h42Var, f42Var, sg2Var, (byte) 22));
                        h42Var.U0 = idVar;
                        idVar.k0 = false;
                        idVar.setOnShowListener(new ig(f42Var, (byte) 3));
                        idVar.setOnDismissListener(new o1(h42Var, (byte) 15));
                        idVar.create();
                        Window window = idVar.getWindow();
                        Rect rect = new Rect();
                        n12Var.getWindow().getDecorView().getWindowVisibleDisplayFrame(rect);
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
                        idVar.show();
                        View c = idVar.c(-1);
                        if ((c instanceof TextView) && !TextUtils.isEmpty(h42Var.t0)) {
                            f42Var.addTextChangedListener(new g42(f42Var, (TextView) c));
                            return;
                        }
                        return;
                    }
                    return;
                }
                h42Var.P0 = null;
                return;
            case 8:
                v72 v72Var = (v72) obj;
                jj.J(v72Var.b.Z1.getParentActivity(), j, new ri6(v72Var, (byte) 18), v72Var.a);
                return;
            case 9:
                hl.c3(new ea2((qt0) obj, v2f.b(v2f.c(j)), (byte) 14));
                return;
            case 10:
                xo2 xo2Var = (xo2) obj;
                uc7.s1(xo2Var.a).Z2(this.b, xo2Var.o1, true, false, new lo2(xo2Var, (byte) 1));
                return;
            case 11:
                fp2 fp2Var = (fp2) obj;
                fp2Var.i = null;
                fp2Var.g.l(j);
                fp2Var.l++;
                fp2Var.a();
                ep2 ep2Var = fp2Var.h;
                if (ep2Var != null) {
                    ep2Var.W();
                    return;
                }
                return;
            case 12:
                ConnectionsManager.lambda$getHostByName$20((String) obj, j);
                return;
            case 13:
                ((pg3) obj).s.g0(j, false);
                return;
            case 14:
                uj3 uj3Var = (uj3) obj;
                uj3Var.U4(true, true);
                ArrayList arrayList = new ArrayList();
                arrayList.add(if7.a(j, 0L));
                uj3Var.E2.q(uj3Var, arrayList, null, false, uj3Var.L2, uj3Var.M2, uj3Var.N2, null);
                return;
            case 15:
                gx9 gx9Var = (gx9) obj;
                gx9Var.getClass();
                try {
                    jf7.Y(gx9Var.t0).b.executeFast("DELETE FROM search_recent WHERE did = " + j).stepThis().dispose();
                    return;
                } catch (Exception e) {
                    cc4.g(e, true);
                    return;
                }
            case 16:
                ((j95) obj).f1(j, false);
                return;
            case 17:
                ((GroupCallMessagesController) obj).lambda$pushMessageToList$7(j);
                return;
            case 18:
                ((d66) obj).presentFragment(zu1.ha(j));
                return;
            case 19:
                id6 id6Var = (id6) obj;
                ArrayList arrayList2 = id6Var.b;
                zh6 zh6Var = id6Var.a;
                hd6 hd6Var = (hd6) zh6Var.f(j);
                zh6Var.l(j);
                if (hd6Var != null) {
                    TLRPC.TL_messages_editMessage tL_messages_editMessage = new TLRPC.TL_messages_editMessage();
                    tL_messages_editMessage.peer = id6Var.getMessagesController().j1(hd6Var.a);
                    tL_messages_editMessage.id = hd6Var.b;
                    tL_messages_editMessage.flags |= 16384;
                    TLRPC.TL_inputMediaGeoLive tL_inputMediaGeoLive = new TLRPC.TL_inputMediaGeoLive();
                    tL_messages_editMessage.media = tL_inputMediaGeoLive;
                    tL_inputMediaGeoLive.stopped = true;
                    tL_inputMediaGeoLive.geo_point = new TLRPC.TL_inputGeoPointEmpty();
                    id6Var.getConnectionsManager().sendRequest(tL_messages_editMessage, new ad6(id6Var, (byte) 1));
                    arrayList2.remove(hd6Var);
                    id6Var.l(hd6Var, 1);
                    hl.c3(new dd6(id6Var, hd6Var, (byte) 0));
                    if (arrayList2.isEmpty()) {
                        id6Var.r(true);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                zu1 zu1Var = ((op1) obj).f;
                zu1Var.M5(true);
                Bundle bundle = new Bundle();
                bundle.putLong("user_id", j);
                if (j == zu1Var.getUserConfig().e()) {
                    bundle.putBoolean("my_profile", true);
                }
                zu1Var.presentFragment(new ProfileActivity(bundle, null));
                return;
            case 21:
                ((mt7) obj).a(Long.valueOf(j));
                return;
            case 22:
                vs7.b.add(Long.valueOf(j));
                vs7.j(j, 60000L);
                ((fd7) obj).run();
                v21 Q2 = vs7.h().Q(2131623990, 36, ob6.M0(2131749508, null));
                Q2.u = true;
                Q2.j();
                return;
            case 23:
                o68 o68Var = ((h58) obj).a;
                if (j <= 0) {
                    z3 = true;
                }
                o68Var.a0(z3);
                return;
            case 24:
                hl.d3((z58) obj, Math.max(0L, 500 - (System.currentTimeMillis() - j)));
                return;
            case 25:
                qd8 qd8Var = (qd8) obj;
                qd8Var.getClass();
                qd8Var.h("seekTo(" + Math.round(((float) j) / 1000.0f) + ", true);");
                hl.d3(new md8(qd8Var, (byte) 1), 100L);
                return;
            case 26:
                qe8 qe8Var = (qe8) obj;
                rt4 rt4Var = ve8.b;
                if (qe8Var != null) {
                    rt4Var.put(Long.valueOf(j), qe8Var);
                }
                if (rt4Var.get(Long.valueOf(j)) == null) {
                    ve8.c.put(Long.valueOf(j), Boolean.TRUE);
                }
                ArrayList arrayList3 = (ArrayList) ve8.d.remove(Long.valueOf(j));
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
                mj8 mj8Var = (mj8) obj;
                Activity u0 = hl.u0();
                e S2 = LaunchActivity.S();
                if (!PhotoViewer.q0().V0()) {
                    if (S2 != null) {
                        if (!S2.hasShownSheet()) {
                            vnbVar = S2.getResourceProvider();
                        }
                    }
                    new dza(u0, vnbVar, this.b, 15, "", new jj8(mj8Var, (byte) 0), 0L).show();
                    return;
                }
                vnbVar = new x53();
                new dza(u0, vnbVar, this.b, 15, "", new jj8(mj8Var, (byte) 0), 0L).show();
                return;
            case 28:
                yg9 yg9Var = (yg9) obj;
                jj.J(yg9Var.getParentActivity(), j, new ve9(yg9Var, (byte) 1), yg9Var.getResourceProvider());
                return;
            default:
                t2a t2aVar = (t2a) obj;
                HashSet hashSet = t2aVar.Z1;
                hashSet.remove(Long.valueOf(j));
                t2aVar.T1.b(true, hashSet, new o2a(t2aVar, (byte) 4), null);
                t2aVar.j1(true, false);
                return;
        }
    }

    public kt(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }
}
