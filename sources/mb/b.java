package mb;

import ai.c0;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.style.CharacterStyle;
import android.util.Log;
import androidx.fragment.app.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import b8.fd;
import b8.ke;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import d2.v;
import e3.b0;
import e3.i0;
import gi.v5;
import gi.w5;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Set;
import k2.p1;
import l.w;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.g10;
import org.telegram.messenger.na;
import org.telegram.messenger.o2;
import org.telegram.messenger.oa;
import org.telegram.messenger.pa;
import org.telegram.messenger.qa;
import org.telegram.messenger.ra;
import org.telegram.messenger.sa;
import org.telegram.messenger.ta;
import org.telegram.messenger.va;
import org.telegram.messenger.w9;
import org.telegram.messenger.wi;
import org.telegram.messenger.x9;
import org.telegram.messenger.zi;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Cells.i9;
import org.telegram.ui.Cells.l1;
import org.telegram.ui.Cells.q1;
import org.telegram.ui.Components.ng;
import org.telegram.ui.Components.p5;
import org.telegram.ui.Components.zh;
import org.telegram.ui.vq0;
public class b implements a7.c, s0, b4.k, com.google.android.gms.common.api.internal.q, e3.q, fg.a, gg.a, hf.b, t9.d, w, zh, IMapsProvider, hh.a, l1, p6.l, r0.q, p5.b, t4.d, x2.m, SuccessContinuation {
    public final int f19224a;

    public b(int i3) {
        this.f19224a = i3;
    }

    @Override
    public hf.a A(p4.q qVar) {
        return new df.k(qVar);
    }

    public Signature[] C0(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    @Override
    public long D() {
        throw new NoSuchElementException();
    }

    @Override
    public boolean E(l.k kVar) {
        return false;
    }

    @Override
    public void E1(q1 q1Var, TLRPC.WebPage webPage, String str, boolean z10) {
        sf.c.t(q1Var.getContext(), str);
    }

    @Override
    public int F() {
        return 0;
    }

    @Override
    public p0 G(Class cls, x1.b bVar) {
        switch (this.f19224a) {
            case 3:
                return a(cls);
            default:
                return a(cls);
        }
    }

    @Override
    public CharacterStyle G1(q1 q1Var) {
        return null;
    }

    @Override
    public void H0(ShortBuffer shortBuffer, int i3, ShortBuffer shortBuffer2, int i10) {
        int min = Math.min(shortBuffer.remaining(), shortBuffer2.remaining() / 2);
        for (int i11 = 0; i11 < min; i11++) {
            short s6 = shortBuffer.get();
            shortBuffer2.put(s6);
            shortBuffer2.put(s6);
        }
    }

    @Override
    public boolean I1(q1 q1Var, zi ziVar) {
        return false;
    }

    @Override
    public boolean J0(long j10) {
        return false;
    }

    @Override
    public boolean L1() {
        return false;
    }

    @Override
    public int M() {
        return 0;
    }

    @Override
    public float O() {
        return -1.0f;
    }

    @Override
    public boolean P0(q1 q1Var, boolean z10) {
        return false;
    }

    @Override
    public boolean P1(q1 q1Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public boolean Q(q1 q1Var, TLRPC.TodoItem todoItem, boolean z10) {
        return false;
    }

    @Override
    public boolean R() {
        return false;
    }

    @Override
    public boolean S(q1 q1Var) {
        return false;
    }

    @Override
    public vq0 S1() {
        return null;
    }

    @Override
    public boolean T() {
        return false;
    }

    @Override
    public boolean V1(long j10) {
        return false;
    }

    @Override
    public float W() {
        return -1.0f;
    }

    @Override
    public int X() {
        return 0;
    }

    @Override
    public boolean X0(zi ziVar) {
        return f1.a(ziVar);
    }

    @Override
    public void Y(ng ngVar) {
        ngVar.run();
    }

    @Override
    public boolean Y1(q1 q1Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public kh.a Z() {
        return null;
    }

    @Override
    public p0 a(Class cls) {
        switch (this.f19224a) {
            case 3:
                return new m0(true);
            default:
                return new y1.b();
        }
    }

    @Override
    public float a0() {
        return 0.0f;
    }

    @Override
    public boolean b0(q1 q1Var) {
        return false;
    }

    @Override
    public boolean c() {
        return false;
    }

    @Override
    public int c0() {
        return 0;
    }

    @Override
    public boolean d() {
        return true;
    }

    @Override
    public boolean d0(q1 q1Var, TLRPC.User user) {
        return false;
    }

    @Override
    public int e(Context context, String str, boolean z10) {
        return a7.f.d(context, str, z10);
    }

    @Override
    public boolean e2(q1 q1Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public boolean f0() {
        return false;
    }

    @Override
    public String g(q1 q1Var) {
        return null;
    }

    @Override
    public boolean g0() {
        return false;
    }

    @Override
    public Object mo5get() {
        kb.a aVar = new kb.a(27);
        HashMap hashMap = new HashMap();
        Set set = Collections.EMPTY_SET;
        if (set != null) {
            hashMap.put(k5.d.f16877a, new t5.b(30000L, 86400000L, set));
            if (set != null) {
                hashMap.put(k5.d.f16879c, new t5.b(1000L, 86400000L, set));
                if (set != null) {
                    Set unmodifiableSet = DesugarCollections.unmodifiableSet(new HashSet(Arrays.asList(t5.c.f54938b)));
                    if (unmodifiableSet != null) {
                        hashMap.put(k5.d.f16878b, new t5.b(86400000L, 86400000L, unmodifiableSet));
                        if (hashMap.keySet().size() >= k5.d.values().length) {
                            new HashMap();
                            return new t5.a(aVar, hashMap);
                        }
                        throw new IllegalStateException("Not all priorities have been configured");
                    }
                    throw new NullPointerException("Null flags");
                }
                throw new NullPointerException("Null flags");
            }
            throw new NullPointerException("Null flags");
        }
        throw new NullPointerException("Null flags");
    }

    @Override
    public int getInstallMapsString() {
        return 2131749204;
    }

    @Override
    public String getMapsAppPackageName() {
        return "com.google.android.apps.maps";
    }

    @Override
    public b4.m h(v vVar) {
        String str = vVar.f8489s;
        List list = vVar.v;
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c2 = '\b';
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                    return new d4.i(list);
                case 1:
                    return new ui.f(3);
                case 2:
                    return new v5();
                case 3:
                    return new p4.q(27);
                case 4:
                    return new i4.a(list);
                case 5:
                    return new f4.a(list);
                case 6:
                    return new j4.b(list);
                case 7:
                    return new g4.a();
                case '\b':
                    return new h4.d();
            }
        }
        throw new IllegalArgumentException(t4.c.f("Unsupported MIME type: ", str));
    }

    @Override
    public i0 i0(int i3, int i10) {
        return new e3.n();
    }

    @Override
    public void initializeMaps(Context context) {
        synchronized (j8.a.class) {
            j8.a.a(context);
        }
    }

    @Override
    public int j0(q1 q1Var) {
        return 0;
    }

    @Override
    public int k(Context context, String str) {
        return a7.f.a(context, str);
    }

    @Override
    public boolean l(v vVar) {
        String str = vVar.f8489s;
        if (!Objects.equals(str, "text/x-ssa") && !Objects.equals(str, "text/vtt") && !Objects.equals(str, "application/x-mp4-vtt") && !Objects.equals(str, "application/x-subrip") && !Objects.equals(str, "application/x-quicktime-tx3g") && !Objects.equals(str, "application/pgs") && !Objects.equals(str, "application/vobsub") && !Objects.equals(str, "application/dvbsubs") && !Objects.equals(str, "application/ttml+xml")) {
            return false;
        }
        return true;
    }

    @Override
    public void l0(ShortBuffer shortBuffer, int i3, ShortBuffer shortBuffer2, int i10, int i11) {
        if (i3 <= i10) {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalArgumentException(p1.i(i11, "Illegal use of UpsampleAudioResampler. Channels:"));
            }
            int remaining = shortBuffer.remaining() / i11;
            int ceil = ((int) Math.ceil((i10 / i3) * remaining)) - remaining;
            float f10 = remaining;
            float f11 = f10 / f10;
            float f12 = ceil;
            float f13 = f12 / f12;
            while (remaining > 0 && ceil > 0) {
                if (f11 >= f13) {
                    shortBuffer2.put(shortBuffer.get());
                    if (i11 == 2) {
                        shortBuffer2.put(shortBuffer.get());
                    }
                    remaining--;
                    f11 = remaining / f10;
                } else {
                    shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i11));
                    if (i11 == 2) {
                        shortBuffer2.put(shortBuffer2.get(shortBuffer2.position() - i11));
                    }
                    ceil--;
                    f13 = ceil / f12;
                }
            }
            return;
        }
        throw new IllegalArgumentException("Illegal use of UpsampleAudioResampler");
    }

    @Override
    public ra loadRawResourceStyle(Context context, int i3) {
        InputStream openRawResource = context.getResources().openRawResource(i3);
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] bArr = new byte[1024];
            while (true) {
                int read = openRawResource.read(bArr, 0, 1024);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    w6.b.a(openRawResource);
                    w6.b.a(byteArrayOutputStream);
                    l8.e eVar = new l8.e(new String(byteArrayOutputStream.toByteArray(), "UTF-8"));
                    ?? obj = new Object();
                    obj.f21483a = eVar;
                    return obj;
                }
            }
        } catch (IOException e10) {
            String obj2 = e10.toString();
            throw new Resources.NotFoundException("Failed to read resource " + i3 + ": " + obj2);
        }
    }

    @Override
    public Object m(com.google.android.gms.common.api.q qVar) {
        return null;
    }

    @Override
    public boolean m0() {
        return false;
    }

    @Override
    public boolean m2(int i3) {
        return false;
    }

    @Override
    public boolean n1() {
        return false;
    }

    @Override
    public na newCameraUpdateLatLng(va vaVar) {
        LatLng latLng = new LatLng(vaVar.f25843a, vaVar.f25844b);
        try {
            k8.a aVar = fd.f2607a;
            p6.m.h(aVar, "CameraUpdateFactory is not initialized");
            Parcel P0 = aVar.P0();
            u7.b.b(P0, latLng);
            Parcel O0 = aVar.O0(P0, 8);
            z6.a M0 = z6.b.M0(O0.readStrongBinder());
            O0.recycle();
            return new w9(new w5(M0));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public na newCameraUpdateLatLngBounds(pa paVar, int i3) {
        LatLngBounds latLngBounds = ((x9) paVar).f26356a;
        try {
            k8.a aVar = fd.f2607a;
            p6.m.h(aVar, "CameraUpdateFactory is not initialized");
            Parcel P0 = aVar.P0();
            u7.b.b(P0, latLngBounds);
            P0.writeInt(i3);
            Parcel O0 = aVar.O0(P0, 10);
            z6.a M0 = z6.b.M0(O0.readStrongBinder());
            O0.recycle();
            return new w9(new w5(M0));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public na newCameraUpdateLatLngZoom(va vaVar, float f10) {
        LatLng latLng = new LatLng(vaVar.f25843a, vaVar.f25844b);
        try {
            k8.a aVar = fd.f2607a;
            p6.m.h(aVar, "CameraUpdateFactory is not initialized");
            Parcel P0 = aVar.P0();
            u7.b.b(P0, latLng);
            P0.writeFloat(f10);
            Parcel O0 = aVar.O0(P0, 9);
            z6.a M0 = z6.b.M0(O0.readStrongBinder());
            O0.recycle();
            return new w9(new w5(M0));
        } catch (RemoteException e10) {
            throw new RuntimeException(e10);
        }
    }

    @Override
    public boolean next() {
        return false;
    }

    @Override
    public Exception o(Status status) {
        return p6.m.l(status);
    }

    @Override
    public boolean o0(p5 p5Var) {
        return false;
    }

    @Override
    public oa onCreateCircleOptions() {
        hi.d dVar = new hi.d(23, false);
        ?? obj = new Object();
        obj.f18097a = null;
        obj.f18098b = 0.0d;
        obj.f18099c = 10.0f;
        obj.d = -16777216;
        obj.f18100e = 0;
        obj.f18101f = 0.0f;
        obj.h = true;
        obj.f18102n = false;
        obj.f18103r = null;
        dVar.f14429b = obj;
        return dVar;
    }

    @Override
    public qa onCreateLatLngBoundsBuilder() {
        w5 w5Var = new w5(24, false);
        l8.d dVar = new l8.d(0);
        dVar.f18106b = Double.POSITIVE_INFINITY;
        dVar.f18107c = Double.NEGATIVE_INFINITY;
        dVar.d = Double.NaN;
        dVar.f18108e = Double.NaN;
        w5Var.f13798b = dVar;
        return w5Var;
    }

    @Override
    public sa onCreateMapView(Context context) {
        ke keVar = new ke(10);
        keVar.f2716b = new c0(keVar, context);
        return keVar;
    }

    @Override
    public ta onCreateMarkerOptions() {
        v5 v5Var = new v5(24);
        ?? obj = new Object();
        obj.f18114e = 0.5f;
        obj.f18115f = 1.0f;
        obj.f18116n = true;
        obj.f18117r = false;
        obj.f18118s = 0.0f;
        obj.f18119w = 0.5f;
        obj.f18120x = 0.0f;
        obj.f18121y = 1.0f;
        v5Var.f13688b = obj;
        return v5Var;
    }

    @Override
    public boolean p1(q1 q1Var, int i3) {
        return false;
    }

    @Override
    public int q0(v vVar) {
        String str = vVar.f8489s;
        if (str != null) {
            char c2 = 65535;
            switch (str.hashCode()) {
                case -1351681404:
                    if (str.equals("application/dvbsubs")) {
                        c2 = 0;
                        break;
                    }
                    break;
                case -1248334819:
                    if (str.equals("application/pgs")) {
                        c2 = 1;
                        break;
                    }
                    break;
                case -1026075066:
                    if (str.equals("application/x-mp4-vtt")) {
                        c2 = 2;
                        break;
                    }
                    break;
                case -1004728940:
                    if (str.equals("text/vtt")) {
                        c2 = 3;
                        break;
                    }
                    break;
                case 691401887:
                    if (str.equals("application/x-quicktime-tx3g")) {
                        c2 = 4;
                        break;
                    }
                    break;
                case 822864842:
                    if (str.equals("text/x-ssa")) {
                        c2 = 5;
                        break;
                    }
                    break;
                case 1157994102:
                    if (str.equals("application/vobsub")) {
                        c2 = 6;
                        break;
                    }
                    break;
                case 1668750253:
                    if (str.equals("application/x-subrip")) {
                        c2 = 7;
                        break;
                    }
                    break;
                case 1693976202:
                    if (str.equals("application/ttml+xml")) {
                        c2 = '\b';
                        break;
                    }
                    break;
            }
            switch (c2) {
                case 0:
                case 1:
                case 2:
                    return 2;
                case 3:
                    return 1;
                case 4:
                    return 2;
                case 5:
                    return 1;
                case 6:
                    return 2;
                case 7:
                case '\b':
                    return 1;
            }
        }
        throw new IllegalArgumentException(t4.c.f("Unsupported MIME type: ", str));
    }

    @Override
    public Object q1(ke keVar) {
        switch (this.f19224a) {
            case 11:
                g gVar = (g) keVar.a(g.class);
                return new nb.a(0);
            default:
                a aVar = (a) keVar.a(a.class);
                return new b(0);
        }
    }

    @Override
    public i9 q2() {
        return null;
    }

    @Override
    public void r() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public long t() {
        throw new NoSuchElementException();
    }

    @Override
    public Task then(Object obj) {
        Void r12 = (Void) obj;
        return Tasks.forResult(Boolean.TRUE);
    }

    @Override
    public void u(int i3, Object obj) {
        String str;
        switch (i3) {
            case 1:
                str = "RESULT_INSTALL_SUCCESS";
                break;
            case 2:
                str = "RESULT_ALREADY_INSTALLED";
                break;
            case 3:
                str = "RESULT_UNSUPPORTED_ART_VERSION";
                break;
            case 4:
                str = "RESULT_NOT_WRITABLE";
                break;
            case 5:
                str = "RESULT_DESIRED_FORMAT_UNSUPPORTED";
                break;
            case 6:
                str = "RESULT_BASELINE_PROFILE_NOT_FOUND";
                break;
            case 7:
                str = "RESULT_IO_EXCEPTION";
                break;
            case 8:
                str = "RESULT_PARSE_EXCEPTION";
                break;
            case 9:
            default:
                str = "";
                break;
            case 10:
                str = "RESULT_INSTALL_SKIP_FILE_SUCCESS";
                break;
            case 11:
                str = "RESULT_DELETE_SKIP_FILE_SUCCESS";
                break;
        }
        if (i3 != 6 && i3 != 7 && i3 != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) obj);
        }
    }

    @Override
    public int u0() {
        return 0;
    }

    @Override
    public int v1(int i3, int i10, int i11) {
        return i3 * 2;
    }

    @Override
    public int w0() {
        return 0;
    }

    @Override
    public boolean w1(q1 q1Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public int x() {
        return 0;
    }

    @Override
    public boolean x0(zi ziVar) {
        return true;
    }

    @Override
    public boolean y1() {
        return false;
    }

    @Override
    public String z(long j10) {
        return null;
    }

    public b() {
        this.f19224a = 13;
        if (Build.VERSION.SDK_INT >= 35) {
        }
    }

    @Override
    public void K1() {
    }

    @Override
    public void L() {
    }

    @Override
    public void c1() {
    }

    @Override
    public void h2() {
    }

    @Override
    public void j() {
    }

    @Override
    public void o2() {
    }

    @Override
    public void q() {
    }

    @Override
    public void r0() {
    }

    @Override
    public void v() {
    }

    @Override
    public void v0() {
    }

    @Override
    public void z0() {
    }

    @Override
    public void A1(q1 q1Var) {
    }

    @Override
    public void B(q1 q1Var) {
    }

    @Override
    public void C(q1 q1Var) {
    }

    @Override
    public void C1(zi ziVar) {
    }

    @Override
    public void D0(q1 q1Var) {
    }

    @Override
    public void G0(q1 q1Var) {
    }

    @Override
    public void I(q1 q1Var) {
    }

    @Override
    public void I0(Object obj) {
    }

    @Override
    public void J(wi wiVar) {
    }

    @Override
    public void K0(q1 q1Var) {
    }

    @Override
    public void N(q1 q1Var) {
    }

    @Override
    public void P(zi ziVar) {
    }

    @Override
    public void Q0(q1 q1Var) {
    }

    @Override
    public void S0(q1 q1Var) {
    }

    @Override
    public void V(q1 q1Var) {
    }

    @Override
    public void Z1(q1 q1Var) {
    }

    @Override
    public void a1(TLRPC.User user) {
    }

    @Override
    public void e0(int i3) {
    }

    @Override
    public void f(b0 b0Var) {
    }

    @Override
    public void f2(q1 q1Var) {
    }

    @Override
    public void k0(q1 q1Var) {
    }

    @Override
    public void n0(String str) {
    }

    @Override
    public void p(q1 q1Var) {
    }

    @Override
    public void s(q1 q1Var) {
    }

    @Override
    public void t1(q1 q1Var) {
    }

    @Override
    public void w(q1 q1Var) {
    }

    @Override
    public void y(q1 q1Var) {
    }

    @Override
    public void y0(q1 q1Var) {
    }

    @Override
    public void H(q1 q1Var, o2 o2Var) {
    }

    @Override
    public void L0(q1 q1Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public void M1(q1 q1Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public void Q1(q1 q1Var, g10 g10Var) {
    }

    @Override
    public void U1(String str, String str2) {
    }

    @Override
    public void a2(q1 q1Var, long j10) {
    }

    @Override
    public void b(l.k kVar, boolean z10) {
    }

    @Override
    public void d1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void f1(q1 q1Var, int i3) {
    }

    @Override
    public void u1(q1 q1Var, boolean z10) {
    }

    @Override
    public void x1(q1 q1Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public void z1(q1 q1Var, int i3) {
    }

    @Override
    public void A0(q1 q1Var, TLObject tLObject, boolean z10) {
    }

    @Override
    public void B0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void E0(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void K(q1 q1Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public void N0(q1 q1Var, CharacterStyle characterStyle, boolean z10) {
    }

    @Override
    public void h0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void i1(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void p0(q1 q1Var, float f10, float f11) {
    }

    @Override
    public void p2(q1 q1Var, int i3, int i10) {
    }

    @Override
    public void r1(q1 q1Var, boolean z10, boolean z11) {
    }

    @Override
    public void N1(q1 q1Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public void n(q1 q1Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i3) {
    }

    @Override
    public void onScrollLimit(int i3, int i10, int i11, boolean z10) {
    }

    @Override
    public void onScrollProgress(int i3, int i10, int i11, int i12) {
    }

    @Override
    public void s0(q1 q1Var, TLRPC.User user, float f10, float f11) {
    }

    @Override
    public void t0(q1 q1Var, float f10, float f11, boolean z10) {
    }

    @Override
    public void W1(q1 q1Var, int i3, float f10, float f11, boolean z10) {
    }

    @Override
    public void i(q1 q1Var, ArrayList arrayList, int i3, int i10, int i11) {
    }

    @Override
    public void i2(q1 q1Var, TLRPC.ReactionCount reactionCount, boolean z10, float f10, float f11) {
    }

    @Override
    public void o1(int i3, boolean z10, boolean z11, int i10, int i11, long j10, boolean z12, boolean z13, long j11) {
    }

    @Override
    public void U(q1 q1Var, TLRPC.Chat chat, int i3, float f10, float f11, boolean z10) {
    }

    @Override
    public void R1(ArrayList arrayList, CharSequence charSequence, boolean z10, int i3, int i10, long j10, boolean z11, long j11) {
    }

    @Override
    public void H1(zi ziVar, String str, String str2, String str3, String str4, int i3, int i10) {
    }
}
