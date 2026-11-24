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
public final class k1f implements lr2, w23, h89, z0c, u1e, kh5, mv8, IMapsProvider, a7c, mc2, sfc, p40 {
    public static k1f G;
    public static k1f b;
    public final byte a;
    public static final k1f c = new k1f((byte) 1);
    public static final k1f d = new k1f((byte) 2);
    public static final k1f e = new k1f((byte) 3);
    public static final k1f f = new k1f((byte) 4);
    public static final k1f h = new k1f((byte) 5);
    public static final k1f n = new k1f((byte) 6);
    public static final k1f r = new k1f((byte) 7);
    public static final k1f s = new k1f((byte) 8);
    public static final k1f w = new k1f((byte) 9);
    public static final k1f x = new k1f((byte) 10);
    public static final k1f y = new k1f((byte) 11);
    public static final k1f E = new k1f((byte) 12);
    public static final k1f F = new k1f((byte) 13);

    public k1f(Context context) {
        this.a = (byte) 29;
    }

    public static synchronized void o() {
        synchronized (k1f.class) {
            if (b == null) {
                b = new k1f((byte) 0);
            }
        }
    }

    @Override
    public final boolean A0(long j) {
        return false;
    }

    @Override
    public final boolean D1(gn gnVar) {
        return false;
    }

    @Override
    public final boolean E(rc2 rc2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean J0(rc2 rc2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override
    public final boolean K() {
        return false;
    }

    @Override
    public final pc8 M1() {
        return null;
    }

    @Override
    public final boolean N() {
        return false;
    }

    @Override
    public final int O() {
        return 0;
    }

    @Override
    public final boolean O1(long j) {
        return false;
    }

    @Override
    public final String P0(rc2 rc2Var) {
        return null;
    }

    @Override
    public final int Q(rc2 rc2Var) {
        return 0;
    }

    @Override
    public final hw1 S() {
        return null;
    }

    @Override
    public final boolean S0(rc2 rc2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean U1(k47 k47Var) {
        return true;
    }

    @Override
    public final Object X(sm2 sm2Var) {
        switch (this.a) {
            case 1:
                Object i = sm2Var.i(new yy8(me0.class, Executor.class));
                i.getClass();
                return new e64((Executor) i);
            default:
                return new nvd((cg7) sm2Var.a(cg7.class));
        }
    }

    @Override
    public final boolean Y1(rc2 rc2Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean Z() {
        return false;
    }

    @Override
    public final boolean Z1(rc2 rc2Var) {
        return false;
    }

    @Override
    public final cx7 a(gh5 gh5Var, ch5 ch5Var) {
        return new jh5(gh5Var, ch5Var);
    }

    @Override
    public final CharacterStyle a0(rc2 rc2Var) {
        return null;
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        ce6 ce6Var = bhd.H;
        z8d z8dVar = (z8d) ((mjf) obj).k();
        z8dVar.W(z8dVar.R(), 19);
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
    public final pfc d(Class cls, x23 x23Var) {
        x23Var.getClass();
        return new as9();
    }

    @Override
    public final boolean d0() {
        return false;
    }

    @Override
    public final cx7 e() {
        return new jh5(gh5.o, null);
    }

    @Override
    public final boolean f() {
        return true;
    }

    @Override
    public final pfc g(cj2 cj2Var, x23 x23Var) {
        return mlb.a(this, cj2Var, x23Var);
    }

    @Override
    public final Object mo8get() {
        return new ke5(Executors.newSingleThreadExecutor(), (byte) 1);
    }

    @Override
    public final int getInstallMapsString() {
        return 2131748953;
    }

    @Override
    public final String getMapsAppPackageName() {
        return "com.google.android.apps.maps";
    }

    @Override
    public final void initializeMaps(Context context) {
        synchronized (rk6.class) {
            rk6.a(context);
        }
    }

    public final void j(c44 c44Var) {
        c44Var.a(ike.class, pwd.a);
        c44Var.a(eve.class, d9e.a);
        c44Var.a(jke.class, twd.a);
        c44Var.a(ble.class, exd.a);
        c44Var.a(pke.class, dxd.a);
        c44Var.a(xke.class, nxd.a);
        c44Var.a(nfe.class, msd.a);
        c44Var.a(kfe.class, isd.a);
        c44Var.a(khe.class, oud.a);
        c44Var.a(vte.class, u6e.a);
        c44Var.a(jfe.class, csd.a);
        c44Var.a(bfe.class, wrd.a);
        c44Var.a(ume.class, jzd.a);
        c44Var.a(bye.class, wtd.a);
        c44Var.a(rge.class, iud.a);
        c44Var.a(lge.class, rtd.a);
        c44Var.a(vme.class, rzd.a);
        c44Var.a(ite.class, f6e.a);
        c44Var.a(jte.class, k6e.a);
        c44Var.a(dte.class, y5e.a);
        c44Var.a(tle.class, pyd.a);
        c44Var.a(wxe.class, wnd.a);
        c44Var.a(bme.class, uyd.a);
        c44Var.a(dne.class, wzd.a);
        c44Var.a(rne.class, h0e.a);
        c44Var.a(jne.class, f0e.a);
        c44Var.a(ine.class, xzd.a);
        c44Var.a(oqe.class, y1e.a);
        c44Var.a(pqe.class, d2e.a);
        c44Var.a(dre.class, p2e.a);
        c44Var.a(yqe.class, j2e.a);
        c44Var.a(sle.class, lyd.a);
        c44Var.a(ere.class, u2e.a);
        c44Var.a(ore.class, b4e.a);
        c44Var.a(tre.class, g4e.a);
        c44Var.a(ure.class, q4e.a);
        c44Var.a(use.class, m5e.a);
        c44Var.a(tse.class, s5e.a);
        c44Var.a(jqe.class, n0e.a);
        c44Var.a(nie.class, dwd.a);
        c44Var.a(kpe.class, j1e.a);
        c44Var.a(goe.class, c1e.a);
        c44Var.a(aqe.class, p1e.a);
        c44Var.a(qte.class, p6e.a);
        c44Var.a(qve.class, z9e.a);
        c44Var.a(bce.class, xod.a);
        c44Var.a(obe.class, mod.a);
        c44Var.a(ibe.class, hod.a);
        c44Var.a(tbe.class, sod.a);
        c44Var.a(mce.class, aqd.a);
        c44Var.a(gce.class, upd.a);
        c44Var.a(sce.class, fqd.a);
        c44Var.a(dde.class, nqd.a);
        c44Var.a(ide.class, sqd.a);
        c44Var.a(mde.class, xqd.a);
        c44Var.a(wde.class, drd.a);
        c44Var.a(lgd.class, fnd.a);
        c44Var.a(xgd.class, nnd.a);
        c44Var.a(qgd.class, lnd.a);
        c44Var.a(uhe.class, rvd.a);
        c44Var.a(sfe.class, tsd.a);
        c44Var.a(gcd.class, ghd.a);
        c44Var.a(ybd.class, lhd.a);
        c44Var.a(zfe.class, etd.a);
        c44Var.a(rcd.class, qhd.a);
        c44Var.a(mcd.class, vhd.a);
        c44Var.a(ked.class, zjd.a);
        c44Var.a(ced.class, gkd.a);
        c44Var.a(add.class, zhd.a);
        c44Var.a(vcd.class, fid.a);
        c44Var.a(ted.class, kkd.a);
        c44Var.a(ned.class, pkd.a);
        c44Var.a(afd.class, ykd.a);
        c44Var.a(yed.class, cld.a);
        c44Var.a(igd.class, tmd.a);
        c44Var.a(fgd.class, zmd.a);
        c44Var.a(mfd.class, ild.a);
        c44Var.a(ffd.class, qld.a);
        c44Var.a(tfd.class, yld.a);
        c44Var.a(qfd.class, emd.a);
        c44Var.a(bxe.class, n7e.a);
        c44Var.a(w6a.class, xsd.a);
        c44Var.a(owe.class, gyd.a);
        c44Var.a(kwe.class, byd.a);
        c44Var.a(bwe.class, bud.a);
        c44Var.a(wwe.class, f7e.a);
        c44Var.a(pwe.class, z6e.a);
        c44Var.a(cxe.class, s7e.a);
        c44Var.a(cwe.class, sud.a);
        c44Var.a(nxe.class, iae.a);
        c44Var.a(mxe.class, oae.a);
        c44Var.a(ixe.class, hae.a);
        c44Var.a(wte.class, k8e.a);
        c44Var.a(phe.class, zud.a);
        c44Var.a(vie.class, kwd.a);
        c44Var.a(dbe.class, bod.a);
        c44Var.a(wge.class, nud.a);
        c44Var.a(zhe.class, xvd.a);
        c44Var.a(fge.class, ktd.a);
        c44Var.a(lle.class, wxd.a);
        c44Var.a(cle.class, sxd.a);
        c44Var.a(sbd.class, dhd.a);
        c44Var.a(fve.class, j9e.a);
        c44Var.a(pve.class, v9e.a);
        c44Var.a(mve.class, o9e.a);
        c44Var.a(xae.class, rnd.a);
        c44Var.a(vee.class, prd.a);
        c44Var.a(oee.class, jrd.a);
        c44Var.a(xde.class, ird.a);
        c44Var.a(gme.class, yyd.a);
        c44Var.a(pme.class, fzd.a);
        c44Var.a(hme.class, ezd.a);
        c44Var.a(ydd.class, mjd.a);
        c44Var.a(tdd.class, sjd.a);
        c44Var.a(dse.class, r4e.a);
        c44Var.a(ose.class, g5e.a);
        c44Var.a(hse.class, v4e.a);
        c44Var.a(ise.class, f5e.a);
        c44Var.a(bgd.class, kmd.a);
        c44Var.a(wfd.class, qmd.a);
        c44Var.a(rue.class, x8e.a);
        c44Var.a(nue.class, r8e.a);
    }

    public final iwe l(go4 go4Var) {
        String str = go4Var.t;
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
                    return new qs((byte) 0);
                case 1:
                    return new nl5();
                case 2:
                    return new sl5(null);
                case 3:
                    return new qs((byte) 1);
                case 4:
                    return new hna();
            }
        }
        u36.j(b10.h("Attempted to create decoder for unsupported MIME type: ", str));
        return null;
    }

    @Override
    public final boolean l0(rc2 rc2Var, boolean z) {
        return false;
    }

    @Override
    public final boolean l1() {
        return false;
    }

    @Override
    public final tj5 loadRawResourceStyle(Context context, int i) {
        InputStream openRawResource = context.getResources().openRawResource(i);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openRawResource.read(bArr, 0, 1024);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    hme.a(openRawResource);
                    hme.a(byteArrayOutputStream);
                    ik6 ik6Var = new ik6(new String(byteArrayOutputStream.toByteArray(), "UTF-8"));
                    ?? obj = new Object();
                    obj.a = ik6Var;
                    return obj;
                }
            }
        } catch (IOException e2) {
            throw new Resources.NotFoundException(mle.d("Failed to read resource ", i, ": ", e2.toString()));
        }
    }

    @Override
    public final boolean m1(k47 k47Var) {
        return aq1.a(k47Var);
    }

    @Override
    public final boolean m2(int i) {
        return false;
    }

    public final boolean n(go4 go4Var) {
        String str = go4Var.t;
        if (!"application/id3".equals(str) && !"application/x-emsg".equals(str) && !"application/x-scte35".equals(str) && !"application/x-icy".equals(str) && !"application/vnd.dvb.ait".equals(str)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean n1(rc2 rc2Var, int i) {
        return false;
    }

    @Override
    public final boolean n2(rc2 rc2Var, k47 k47Var) {
        return false;
    }

    @Override
    public final pj5 newCameraUpdateLatLng(xj5 xj5Var) {
        LatLng latLng = new LatLng(xj5Var.a, xj5Var.b);
        try {
            jdd jddVar = ksd.a;
            ite.i(jddVar, "CameraUpdateFactory is not initialized");
            Parcel R = jddVar.R();
            tid.b(R, latLng);
            Parcel Q = jddVar.Q(R, 8);
            xk5 T = eq7.T(Q.readStrongBinder());
            Q.recycle();
            return new p05(new sz4(T));
        } catch (RemoteException e2) {
            i2d.h(e2);
            return null;
        }
    }

    @Override
    public final pj5 newCameraUpdateLatLngBounds(rj5 rj5Var, int i) {
        LatLngBounds latLngBounds = ((q05) rj5Var).a;
        try {
            jdd jddVar = ksd.a;
            ite.i(jddVar, "CameraUpdateFactory is not initialized");
            Parcel R = jddVar.R();
            tid.b(R, latLngBounds);
            R.writeInt(i);
            Parcel Q = jddVar.Q(R, 10);
            xk5 T = eq7.T(Q.readStrongBinder());
            Q.recycle();
            return new p05(new sz4(T));
        } catch (RemoteException e2) {
            i2d.h(e2);
            return null;
        }
    }

    @Override
    public final pj5 newCameraUpdateLatLngZoom(xj5 xj5Var, float f2) {
        LatLng latLng = new LatLng(xj5Var.a, xj5Var.b);
        try {
            jdd jddVar = ksd.a;
            ite.i(jddVar, "CameraUpdateFactory is not initialized");
            Parcel R = jddVar.R();
            tid.b(R, latLng);
            R.writeFloat(f2);
            Parcel Q = jddVar.Q(R, 9);
            xk5 T = eq7.T(Q.readStrongBinder());
            Q.recycle();
            return new p05(new sz4(T));
        } catch (RemoteException e2) {
            i2d.h(e2);
            return null;
        }
    }

    @Override
    public final qj5 onCreateCircleOptions() {
        k44 k44Var = new k44((byte) 7);
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
        k44Var.b = obj;
        return k44Var;
    }

    @Override
    public final sj5 onCreateLatLngBoundsBuilder() {
        ?? obj = new Object();
        kz5 kz5Var = new kz5((byte) 0);
        kz5Var.b = Double.POSITIVE_INFINITY;
        kz5Var.c = Double.NEGATIVE_INFINITY;
        kz5Var.d = Double.NaN;
        kz5Var.e = Double.NaN;
        obj.a = kz5Var;
        return obj;
    }

    @Override
    public final uj5 onCreateMapView(Context context) {
        sm2 sm2Var = new sm2((byte) 8, false);
        sm2Var.b = new su(sm2Var, context);
        return sm2Var;
    }

    @Override
    public final vj5 onCreateMarkerOptions() {
        ai4 ai4Var = new ai4((byte) 5, false);
        ?? obj = new Object();
        obj.e = 0.5f;
        obj.f = 1.0f;
        obj.n = true;
        obj.r = false;
        obj.s = 0.0f;
        obj.w = 0.5f;
        obj.x = 0.0f;
        obj.y = 1.0f;
        ai4Var.b = obj;
        return ai4Var;
    }

    @Override
    public final boolean p0(rc2 rc2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final hkb p2() {
        return null;
    }

    @Override
    public final void s(ShortBuffer shortBuffer, int i, ShortBuffer shortBuffer2, int i2, int i3) {
        if (i <= i2) {
            if (i3 != 1 && i3 != 2) {
                u36.j(hg9.j(i3, "Illegal use of UpsampleAudioResampler. Channels:"));
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
        u36.j("Illegal use of UpsampleAudioResampler");
    }

    @Override
    public final String t(long j) {
        return null;
    }

    @Override
    public final boolean t0(rc2 rc2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final boolean x0(rc2 rc2Var) {
        return false;
    }

    @Override
    public final void x1(rc2 rc2Var, TLRPC.WebPage webPage, String str, boolean z) {
        l11.u(rc2Var.getContext(), str);
    }

    @Override
    public final boolean z1() {
        return false;
    }

    @Override
    public final Object zza() {
        ce6 ce6Var = njf.n;
        ce6 ce6Var2 = ie1.l;
        ite.e("Must be called from the main thread.");
        ie1 ie1Var = ie1.n;
        ite.h(ie1Var);
        ite.e("Must be called from the main thread.");
        return ie1Var.e.a;
    }

    public k1f(byte b2) {
        this.a = b2;
    }

    @Override
    public final void C1() {
    }

    @Override
    public final void T0() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void g2() {
    }

    @Override
    public final void h() {
    }

    @Override
    public final void i() {
    }

    @Override
    public final void o2() {
    }

    @Override
    public final void q() {
    }

    @Override
    public final void s0() {
    }

    @Override
    public final void A(rc2 rc2Var) {
    }

    @Override
    public final void F0(rc2 rc2Var) {
    }

    @Override
    public final void G(rc2 rc2Var) {
    }

    @Override
    public final void J1(rc2 rc2Var) {
    }

    @Override
    public final void L1(rc2 rc2Var) {
    }

    @Override
    public final void M0(rc2 rc2Var) {
    }

    @Override
    public final void P(rc2 rc2Var) {
    }

    @Override
    public final void Q0(rc2 rc2Var) {
    }

    @Override
    public final void Q1(rc2 rc2Var) {
    }

    @Override
    public final void R(rc2 rc2Var) {
    }

    @Override
    public final void T(k47 k47Var) {
    }

    @Override
    public final void U0(rc2 rc2Var) {
    }

    @Override
    public final void X0(rc2 rc2Var) {
    }

    @Override
    public final void Y(int i) {
    }

    @Override
    public final void Z0(rc2 rc2Var) {
    }

    @Override
    public final void e0(k47 k47Var) {
    }

    @Override
    public final void h0(String str) {
    }

    @Override
    public final void i2(rc2 rc2Var) {
    }

    @Override
    public final void k(rc2 rc2Var) {
    }

    @Override
    public final void k0(rc2 rc2Var) {
    }

    @Override
    public final void k1(rc2 rc2Var) {
    }

    @Override
    public final void q1(h47 h47Var) {
    }

    @Override
    public final void q2(rc2 rc2Var) {
    }

    @Override
    public final void y1(rc2 rc2Var) {
    }

    @Override
    public final void B1(rc2 rc2Var, ir0 ir0Var) {
    }

    @Override
    public final void D0(rc2 rc2Var, boolean z) {
    }

    @Override
    public final void L0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void N1(String str, String str2) {
    }

    @Override
    public final void P1(rc2 rc2Var, n28 n28Var) {
    }

    @Override
    public final void U(rc2 rc2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void X1(rc2 rc2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void i0(rc2 rc2Var, int i) {
    }

    @Override
    public final void m0(rc2 rc2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void o1(rc2 rc2Var, boolean z) {
    }

    @Override
    public final void t1(rc2 rc2Var, int i) {
    }

    @Override
    public final void v0(rc2 rc2Var, long j) {
    }

    @Override
    public final void F(rc2 rc2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void I1(rc2 rc2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void M(rc2 rc2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override
    public final void N0(rc2 rc2Var, float f2, float f3) {
    }

    @Override
    public final void d2(rc2 rc2Var, float f2, float f3) {
    }

    @Override
    public final void i1(rc2 rc2Var, float f2, float f3) {
    }

    @Override
    public final void l2(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override
    public final void o0(rc2 rc2Var, int i, int i2) {
    }

    @Override
    public final void u(rc2 rc2Var, float f2, float f3) {
    }

    @Override
    public final void u1(rc2 rc2Var, boolean z, boolean z2) {
    }

    @Override
    public final void W(rc2 rc2Var, TLRPC.User user, float f2, float f3) {
    }

    @Override
    public final void m(rc2 rc2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void r0(rc2 rc2Var, float f2, float f3, boolean z) {
    }

    @Override
    public final void z(rc2 rc2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void H(rc2 rc2Var, int i, float f2, float f3, boolean z) {
    }

    @Override
    public final void V0(rc2 rc2Var, TLRPC.ReactionCount reactionCount, boolean z, float f2, float f3) {
    }

    @Override
    public final void b1(rc2 rc2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override
    public final void W1(rc2 rc2Var, TLRPC.Chat chat, int i, float f2, float f3, boolean z) {
    }

    @Override
    public final void w1(k47 k47Var, String str, String str2, String str3, String str4, int i, int i2) {
    }
}
