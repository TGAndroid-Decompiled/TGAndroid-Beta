package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.style.CharacterStyle;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import org.telegram.messenger.IMapsProvider;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
public final class z3f implements tq2, d23, s99, y2c, h4e, nh5, uw8, IMapsProvider, z8c, rb2, qhc, q30 {
    public static z3f G;
    public static z3f b;
    public final byte a;
    public static final z3f c = new z3f((byte) 1);
    public static final z3f d = new z3f((byte) 2);
    public static final z3f e = new z3f((byte) 3);
    public static final z3f f = new z3f((byte) 4);
    public static final z3f h = new z3f((byte) 5);
    public static final z3f n = new z3f((byte) 6);
    public static final z3f r = new z3f((byte) 7);
    public static final z3f s = new z3f((byte) 8);
    public static final z3f w = new z3f((byte) 9);
    public static final z3f x = new z3f((byte) 10);
    public static final z3f y = new z3f((byte) 11);
    public static final z3f E = new z3f((byte) 12);
    public static final z3f F = new z3f((byte) 13);

    public z3f(byte b2) {
        this.a = b2;
    }

    public static void n(q0d q0dVar, boolean z) {
        String str;
        sr0 sr0Var;
        nm9 nm9Var;
        h0d g = k0d.g(q0dVar);
        StringBuilder sb = new StringBuilder("widget ");
        sb.append(q0dVar.a);
        sb.append(": engine process died");
        if (z) {
            str = ", restarting";
        } else {
            str = "";
        }
        uh9.s(str, sb);
        if (z && g != null && (nm9Var = g.y) != null) {
            if (nm9Var.f0 && nm9Var.Y != null) {
                nm9Var.r0();
                nm9Var.q0();
            }
        } else if (z && g != null && (sr0Var = g.p) != null && sr0Var.G) {
            sr0Var.i();
            sr0Var.e();
        }
    }

    public static synchronized void p() {
        synchronized (z3f.class) {
            if (b == null) {
                b = new z3f((byte) 0);
            }
        }
    }

    @Override
    public final boolean A1(hm hmVar) {
        return false;
    }

    @Override
    public final boolean E(wb2 wb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean G0(wb2 wb2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override
    public final de8 J1() {
        return null;
    }

    @Override
    public final boolean K() {
        return false;
    }

    @Override
    public final boolean L1(long j) {
        return false;
    }

    @Override
    public final boolean M() {
        return false;
    }

    @Override
    public final String M0(wb2 wb2Var) {
        return null;
    }

    @Override
    public final int N() {
        return 0;
    }

    @Override
    public final int P(wb2 wb2Var) {
        return 0;
    }

    @Override
    public final boolean P0(wb2 wb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean R1(r47 r47Var) {
        return true;
    }

    @Override
    public final iv1 S() {
        return null;
    }

    @Override
    public final boolean V1(wb2 wb2Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean W1(wb2 wb2Var) {
        return false;
    }

    @Override
    public final boolean Z() {
        return false;
    }

    @Override
    public final iy7 a(jh5 jh5Var, fh5 fh5Var) {
        return new mh5(jh5Var, fh5Var);
    }

    @Override
    public final CharacterStyle a0(wb2 wb2Var) {
        return null;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        he6 he6Var = rjd.H;
        qbd qbdVar = (qbd) ((bmf) obj).k();
        qbdVar.W(qbdVar.R(), 19);
        ((TaskCompletionSource) obj2).setResult(Boolean.TRUE);
    }

    @Override
    public final Object apply(Object obj) {
        return (byte[]) obj;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final Object b0(am2 am2Var) {
        switch (this.a) {
            case 1:
                Object h2 = am2Var.h(new i09(od0.class, Executor.class));
                h2.getClass();
                return new p54((Executor) h2);
            default:
                return new ayd((kg7) am2Var.a(kg7.class));
        }
    }

    @Override
    public final iy7 c() {
        return new mh5(jh5.o, null);
    }

    @Override
    public final boolean c0() {
        return false;
    }

    public final void e(m34 m34Var) {
        m34Var.a(yme.class, czd.a);
        m34Var.a(sxe.class, sbe.a);
        m34Var.a(zme.class, gzd.a);
        m34Var.a(rne.class, rzd.a);
        m34Var.a(fne.class, qzd.a);
        m34Var.a(nne.class, a0e.a);
        m34Var.a(die.class, zud.a);
        m34Var.a(aie.class, vud.a);
        m34Var.a(ake.class, bxd.a);
        m34Var.a(jwe.class, h9e.a);
        m34Var.a(zhe.class, pud.a);
        m34Var.a(rhe.class, jud.a);
        m34Var.a(jpe.class, w1e.a);
        m34Var.a(q0f.class, jwd.a);
        m34Var.a(hje.class, vwd.a);
        m34Var.a(bje.class, ewd.a);
        m34Var.a(kpe.class, e2e.a);
        m34Var.a(wve.class, s8e.a);
        m34Var.a(xve.class, x8e.a);
        m34Var.a(rve.class, l8e.a);
        m34Var.a(ioe.class, c1e.a);
        m34Var.a(l0f.class, kqd.a);
        m34Var.a(qoe.class, h1e.a);
        m34Var.a(spe.class, j2e.a);
        m34Var.a(gqe.class, u2e.a);
        m34Var.a(ype.class, s2e.a);
        m34Var.a(xpe.class, k2e.a);
        m34Var.a(cte.class, l4e.a);
        m34Var.a(dte.class, q4e.a);
        m34Var.a(rte.class, c5e.a);
        m34Var.a(mte.class, w4e.a);
        m34Var.a(hoe.class, y0e.a);
        m34Var.a(ste.class, h5e.a);
        m34Var.a(cue.class, o6e.a);
        m34Var.a(hue.class, t6e.a);
        m34Var.a(iue.class, d7e.a);
        m34Var.a(ive.class, z7e.a);
        m34Var.a(hve.class, f8e.a);
        m34Var.a(yse.class, a3e.a);
        m34Var.a(dle.class, qyd.a);
        m34Var.a(yre.class, w3e.a);
        m34Var.a(vqe.class, p3e.a);
        m34Var.a(ose.class, c4e.a);
        m34Var.a(ewe.class, c9e.a);
        m34Var.a(eye.class, oce.a);
        m34Var.a(qee.class, lrd.a);
        m34Var.a(dee.class, ard.a);
        m34Var.a(xde.class, vqd.a);
        m34Var.a(iee.class, grd.a);
        m34Var.a(bfe.class, osd.a);
        m34Var.a(vee.class, isd.a);
        m34Var.a(hfe.class, ssd.a);
        m34Var.a(sfe.class, atd.a);
        m34Var.a(xfe.class, ftd.a);
        m34Var.a(bge.class, ktd.a);
        m34Var.a(lge.class, qtd.a);
        m34Var.a(bjd.class, upd.a);
        m34Var.a(njd.class, cqd.a);
        m34Var.a(gjd.class, aqd.a);
        m34Var.a(kke.class, eyd.a);
        m34Var.a(iie.class, gvd.a);
        m34Var.a(xed.class, wjd.a);
        m34Var.a(ped.class, bkd.a);
        m34Var.a(pie.class, rvd.a);
        m34Var.a(ifd.class, gkd.a);
        m34Var.a(dfd.class, lkd.a);
        m34Var.a(bhd.class, pmd.a);
        m34Var.a(tgd.class, vmd.a);
        m34Var.a(rfd.class, pkd.a);
        m34Var.a(mfd.class, vkd.a);
        m34Var.a(khd.class, zmd.a);
        m34Var.a(ehd.class, end.a);
        m34Var.a(rhd.class, nnd.a);
        m34Var.a(phd.class, rnd.a);
        m34Var.a(yid.class, ipd.a);
        m34Var.a(vid.class, opd.a);
        m34Var.a(cid.class, xnd.a);
        m34Var.a(whd.class, fod.a);
        m34Var.a(jid.class, nod.a);
        m34Var.a(gid.class, tod.a);
        m34Var.a(qze.class, aae.a);
        m34Var.a(mye.class, kvd.a);
        m34Var.a(cze.class, t0e.a);
        m34Var.a(yye.class, o0e.a);
        m34Var.a(pye.class, owd.a);
        m34Var.a(lze.class, s9e.a);
        m34Var.a(eze.class, m9e.a);
        m34Var.a(rze.class, fae.a);
        m34Var.a(qye.class, fxd.a);
        m34Var.a(c0f.class, xce.a);
        m34Var.a(b0f.class, dde.a);
        m34Var.a(xze.class, wce.a);
        m34Var.a(kwe.class, zae.a);
        m34Var.a(fke.class, mxd.a);
        m34Var.a(lle.class, xyd.a);
        m34Var.a(sde.class, qqd.a);
        m34Var.a(mje.class, axd.a);
        m34Var.a(pke.class, kyd.a);
        m34Var.a(vie.class, xvd.a);
        m34Var.a(boe.class, j0e.a);
        m34Var.a(sne.class, f0e.a);
        m34Var.a(jed.class, tjd.a);
        m34Var.a(txe.class, ybe.a);
        m34Var.a(dye.class, kce.a);
        m34Var.a(aye.class, dce.a);
        m34Var.a(mde.class, gqd.a);
        m34Var.a(lhe.class, cud.a);
        m34Var.a(ehe.class, wtd.a);
        m34Var.a(mge.class, vtd.a);
        m34Var.a(voe.class, l1e.a);
        m34Var.a(epe.class, s1e.a);
        m34Var.a(woe.class, r1e.a);
        m34Var.a(pgd.class, cmd.a);
        m34Var.a(kgd.class, imd.a);
        m34Var.a(rue.class, e7e.a);
        m34Var.a(cve.class, t7e.a);
        m34Var.a(vue.class, i7e.a);
        m34Var.a(wue.class, s7e.a);
        m34Var.a(rid.class, zod.a);
        m34Var.a(mid.class, fpd.a);
        m34Var.a(fxe.class, mbe.a);
        m34Var.a(bxe.class, gbe.a);
    }

    @Override
    public final nhc g(Class cls, e23 e23Var) {
        e23Var.getClass();
        return new rt9();
    }

    @Override
    public final Object mo21get() {
        return new ne5(Executors.newSingleThreadExecutor(), (byte) 1);
    }

    @Override
    public final int getInstallMapsString() {
        return 2131748950;
    }

    @Override
    public final String getMapsAppPackageName() {
        return "com.google.android.apps.maps";
    }

    @Override
    public final boolean h() {
        return true;
    }

    @Override
    public final boolean i1() {
        return false;
    }

    @Override
    public final boolean i2(int i) {
        return false;
    }

    @Override
    public final void initializeMaps(Context context) {
        synchronized (tk6.class) {
            tk6.a(context);
        }
    }

    @Override
    public final nhc j(ki2 ki2Var, e23 e23Var) {
        return xnb.a(this, ki2Var, e23Var);
    }

    @Override
    public final boolean j1(r47 r47Var) {
        return bp1.a(r47Var);
    }

    @Override
    public final boolean j2(wb2 wb2Var, r47 r47Var) {
        return false;
    }

    public final yye k(ko4 ko4Var) {
        String str = ko4Var.t;
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1354451219:
                    if (str.equals("application/vnd.dvb.ait")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1348231605:
                    if (str.equals("application/x-icy")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1248341703:
                    if (str.equals("application/id3")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case 1154383568:
                    if (str.equals("application/x-emsg")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 1652648887:
                    if (str.equals("application/x-scte35")) {
                        c2 = 4;
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    return new rr((byte) 0);
                case 1:
                    return new ql5();
                case 2:
                    return new vl5(null);
                case 3:
                    return new rr((byte) 1);
                case 4:
                    return new dpa();
            }
        }
        lq5.j(c00.i("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    @Override
    public final boolean k0(wb2 wb2Var, boolean z) {
        return false;
    }

    @Override
    public final boolean k1(wb2 wb2Var, int i) {
        return false;
    }

    @Override
    public final bmb l2() {
        return null;
    }

    @Override
    public final wj5 loadRawResourceStyle(Context context, int i) {
        InputStream openRawResource = context.getResources().openRawResource(i);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openRawResource.read(bArr, 0, 1024);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    xoe.a(openRawResource);
                    xoe.a(byteArrayOutputStream);
                    kk6 kk6Var = new kk6(new String(byteArrayOutputStream.toByteArray(), "UTF-8"));
                    ?? obj = new Object();
                    obj.a = kk6Var;
                    return obj;
                }
            }
        } catch (IOException e2) {
            throw new Resources.NotFoundException(dze.d("Failed to read resource ", i, ": ", e2.toString()));
        }
    }

    @Override
    public final sj5 newCameraUpdateLatLng(ak5 ak5Var) {
        LatLng latLng = new LatLng(ak5Var.a, ak5Var.b);
        try {
            agd agdVar = xud.a;
            xve.i(agdVar, "CameraUpdateFactory is not initialized");
            Parcel R = agdVar.R();
            jld.b(R, latLng);
            Parcel Q = agdVar.Q(R, 8);
            al5 T = br7.T(Q.readStrongBinder());
            Q.recycle();
            return new u05(new wz4(T));
        } catch (RemoteException e2) {
            p3d.i(e2);
            return null;
        }
    }

    @Override
    public final sj5 newCameraUpdateLatLngBounds(uj5 uj5Var, int i) {
        LatLngBounds latLngBounds = ((v05) uj5Var).a;
        try {
            agd agdVar = xud.a;
            xve.i(agdVar, "CameraUpdateFactory is not initialized");
            Parcel R = agdVar.R();
            jld.b(R, latLngBounds);
            R.writeInt(i);
            Parcel Q = agdVar.Q(R, 10);
            al5 T = br7.T(Q.readStrongBinder());
            Q.recycle();
            return new u05(new wz4(T));
        } catch (RemoteException e2) {
            p3d.i(e2);
            return null;
        }
    }

    @Override
    public final sj5 newCameraUpdateLatLngZoom(ak5 ak5Var, float f2) {
        LatLng latLng = new LatLng(ak5Var.a, ak5Var.b);
        try {
            agd agdVar = xud.a;
            xve.i(agdVar, "CameraUpdateFactory is not initialized");
            Parcel R = agdVar.R();
            jld.b(R, latLng);
            R.writeFloat(f2);
            Parcel Q = agdVar.Q(R, 9);
            al5 T = br7.T(Q.readStrongBinder());
            Q.recycle();
            return new u05(new wz4(T));
        } catch (RemoteException e2) {
            p3d.i(e2);
            return null;
        }
    }

    public final boolean o(ko4 ko4Var) {
        String str = ko4Var.t;
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean o0(wb2 wb2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final tj5 onCreateCircleOptions() {
        v34 v34Var = new v34((byte) 6);
        ?? obj = new Object();
        obj.a = null;
        obj.b = 0.0d;
        obj.c = 10.0f;
        obj.d = -16777216;
        obj.e = 0;
        obj.f = 0.0f;
        obj.h = true;
        obj.n = false;
        obj.r = null;
        v34Var.b = obj;
        return v34Var;
    }

    @Override
    public final vj5 onCreateLatLngBoundsBuilder() {
        kj4 kj4Var = new kj4((byte) 5);
        pz5 pz5Var = new pz5((byte) 0);
        pz5Var.b = Double.POSITIVE_INFINITY;
        pz5Var.c = Double.NEGATIVE_INFINITY;
        pz5Var.d = Double.NaN;
        pz5Var.e = Double.NaN;
        kj4Var.b = pz5Var;
        return kj4Var;
    }

    @Override
    public final xj5 onCreateMapView(Context context) {
        am2 am2Var = new am2((byte) 7, false);
        am2Var.b = new tt(am2Var, context);
        return am2Var;
    }

    @Override
    public final yj5 onCreateMarkerOptions() {
        xh4 xh4Var = new xh4((byte) 5, false);
        ?? obj = new Object();
        obj.e = 0.5f;
        obj.f = 1.0f;
        obj.n = true;
        obj.r = false;
        obj.s = 0.0f;
        obj.w = 0.5f;
        obj.x = 0.0f;
        obj.y = 1.0f;
        xh4Var.b = obj;
        return xh4Var;
    }

    @Override
    public final void s(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3) {
        if (i <= i2) {
            if (i3 != 1 && i3 != 2) {
                lq5.j(uh9.k(i3, "Illegal use of UpsampleAudioResampler. Channels:"));
                return;
            }
            int remaining = shortBuffer.remaining() / i3;
            int ceil = ((int) Math.ceil((i2 / i) * remaining)) - remaining;
            float f2 = remaining;
            float f3 = f2 / f2;
            float f4 = ceil;
            float f5 = f4 / f4;
            while (remaining > 0 && ceil > 0) {
                if (f3 >= f5) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i3 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    remaining--;
                    f3 = remaining / f2;
                } else {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i3));
                    if (i3 == 2) {
                        shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i3));
                    }
                    ceil--;
                    f5 = ceil / f4;
                }
            }
            return;
        }
        lq5.j("Illegal use of UpsampleAudioResampler");
    }

    @Override
    public final boolean s0(wb2 wb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final String u(long j) {
        return null;
    }

    @Override
    public final void u1(wb2 wb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        m01.u(wb2Var.getContext(), str);
    }

    @Override
    public final boolean w0(wb2 wb2Var) {
        return false;
    }

    @Override
    public final boolean w1() {
        return false;
    }

    @Override
    public final boolean y0(long j) {
        return false;
    }

    @Override
    public final Object zza() {
        he6 he6Var = cmf.n;
        he6 he6Var2 = id1.l;
        xve.e("Must be called from the main thread.");
        id1 id1Var = id1.n;
        xve.h(id1Var);
        xve.e("Must be called from the main thread.");
        return id1Var.e.a;
    }

    @Override
    public final void Q0() {
    }

    @Override
    public final void d() {
    }

    @Override
    public final void d2() {
    }

    @Override
    public final void f() {
    }

    @Override
    public final void i() {
    }

    @Override
    public final void k2() {
    }

    @Override
    public final void r() {
    }

    @Override
    public final void r0() {
    }

    @Override
    public final void z1() {
    }

    @Override
    public final void A(wb2 wb2Var) {
    }

    @Override
    public final void C0(wb2 wb2Var) {
    }

    @Override
    public final void G(wb2 wb2Var) {
    }

    @Override
    public final void G1(wb2 wb2Var) {
    }

    @Override
    public final void I1(wb2 wb2Var) {
    }

    @Override
    public final void J0(wb2 wb2Var) {
    }

    @Override
    public final void N0(wb2 wb2Var) {
    }

    @Override
    public final void N1(wb2 wb2Var) {
    }

    @Override
    public final void O(wb2 wb2Var) {
    }

    @Override
    public final void Q(wb2 wb2Var) {
    }

    @Override
    public final void T(r47 r47Var) {
    }

    @Override
    public final void U0(wb2 wb2Var) {
    }

    @Override
    public final void Y(int i) {
    }

    @Override
    public final void Y0(wb2 wb2Var) {
    }

    @Override
    public final void a1(wb2 wb2Var) {
    }

    @Override
    public final void d0(r47 r47Var) {
    }

    @Override
    public final void e2(wb2 wb2Var) {
    }

    @Override
    public final void g0(String str) {
    }

    @Override
    public final void h1(wb2 wb2Var) {
    }

    @Override
    public final void j0(wb2 wb2Var) {
    }

    @Override
    public final void l(wb2 wb2Var) {
    }

    @Override
    public final void m2(wb2 wb2Var) {
    }

    @Override
    public final void n1(o47 o47Var) {
    }

    @Override
    public final void v1(wb2 wb2Var) {
    }

    @Override
    public final void A0(wb2 wb2Var, boolean z) {
    }

    @Override
    public final void I0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void K1(String str, String str2) {
    }

    @Override
    public final void M1(wb2 wb2Var, q38 q38Var) {
    }

    @Override
    public final void U(wb2 wb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void U1(wb2 wb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void h0(wb2 wb2Var, int i) {
    }

    @Override
    public final void l0(wb2 wb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void l1(wb2 wb2Var, boolean z) {
    }

    @Override
    public final void q1(wb2 wb2Var, int i) {
    }

    @Override
    public final void u0(wb2 wb2Var, long j) {
    }

    @Override
    public final void y1(wb2 wb2Var, iq0 iq0Var) {
    }

    @Override
    public final void F(wb2 wb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void F1(wb2 wb2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void K0(wb2 wb2Var, float f2, float f3) {
    }

    @Override
    public final void L(wb2 wb2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override
    public final void a2(wb2 wb2Var, float f2, float f3) {
    }

    @Override
    public final void f1(wb2 wb2Var, float f2, float f3) {
    }

    @Override
    public final void h2(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void n0(wb2 wb2Var, int i, int i2) {
    }

    @Override
    public final void r1(wb2 wb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void v(wb2 wb2Var, float f2, float f3) {
    }

    @Override
    public final void W(wb2 wb2Var, TLRPC.User user, float f2, float f3) {
    }

    @Override
    public final void m(wb2 wb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void q0(wb2 wb2Var, float f2, float f3, boolean z) {
    }

    @Override
    public final void z(wb2 wb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void H(wb2 wb2Var, int i, float f2, float f3, boolean z) {
    }

    @Override
    public final void V0(wb2 wb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    @Override
    public final void c1(wb2 wb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override
    public final void T1(wb2 wb2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    @Override
    public final void t1(r47 r47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
