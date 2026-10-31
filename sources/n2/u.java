package n2;

import android.content.ContentProviderClient;
import android.content.Context;
import android.database.Cursor;
import android.graphics.Canvas;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.FrameLayout;
import androidx.lifecycle.m0;
import androidx.lifecycle.p0;
import androidx.lifecycle.s0;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.tasks.TaskCompletionSource;
import e9.n0;
import java.nio.ByteBuffer;
import java.util.Collection;
import java.util.List;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.aa;
import org.telegram.messenger.cb;
import org.telegram.messenger.cv;
import org.telegram.messenger.f8;
import org.telegram.messenger.ff;
import org.telegram.messenger.i0;
import org.telegram.messenger.k20;
import org.telegram.messenger.mc;
import org.telegram.messenger.nd;
import org.telegram.messenger.q0;
import org.telegram.messenger.q20;
import org.telegram.messenger.ra;
import org.telegram.messenger.x20;
import org.telegram.ui.ActionBar.b1;
import org.telegram.ui.ActionBar.b5;
import org.telegram.ui.ActionBar.p5;
import org.telegram.ui.ActionBar.s5;
import org.telegram.ui.ActionBar.t6;
import org.telegram.ui.Cells.w7;
import org.telegram.ui.Cells.x7;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.e50;
import org.telegram.ui.Components.eb0;
import org.telegram.ui.Components.ep0;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.kf0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.lj0;
import org.telegram.ui.Components.mn0;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.o71;
import org.telegram.ui.Components.s61;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.w71;
import org.telegram.ui.Components.w8;
import org.telegram.ui.Components.ws0;
import org.telegram.ui.Components.x40;
import org.telegram.ui.Components.zt0;
import ph.x1;
import qh.x0;
import sg.o0;
import th.z2;
import v7.i5;
public final class u implements o0.a, mc, wg.a, mn0, fe.g, iz, s61, l61, ws0, u71, qh.x, com.google.android.gms.common.api.internal.o, hu0, n5.b, lj0, ep0, s0, com.google.android.gms.common.api.internal.s {
    public final int f13479a;
    public Object f13480b;

    public u(Object obj, int i10) {
        this.f13479a = i10;
        this.f13480b = obj;
    }

    @Override
    public boolean A() {
        return false;
    }

    public wg.a B() {
        b5 b5Var;
        s5 s5Var = (s5) this.f13480b;
        if (s5Var.f20787a < 1.0f && (b5Var = s5Var.d) != null) {
            return b5Var.getButtonsGlassColorProvider();
        }
        return null;
    }

    @Override
    public void B0() {
        z2.h0((z2) this.f13480b);
    }

    @Override
    public b1 D(String str) {
        p5 p5Var = ((zt0) this.f13480b).I;
        return p5Var.d(0, 0, null, str, true, true, p5Var.m0);
    }

    @Override
    public int E() {
        int i10;
        s5 s5Var = (s5) this.f13480b;
        wg.a v = v();
        if (v != null && s5Var.d.b()) {
            i10 = v.E();
        } else {
            i10 = 0;
        }
        wg.a B = B();
        if (B != null) {
            return i0.b.f(s5Var.f20787a, B.E(), i10);
        }
        return i10;
    }

    @Override
    public p0 E0(Class cls, v1.b bVar) {
        m0 m0Var = null;
        for (v1.c cVar : (v1.c[]) this.f13480b) {
            if (cVar.f50284a.equals(cls)) {
                m0Var = new m0();
            }
        }
        if (m0Var != null) {
            return m0Var;
        }
        throw new IllegalArgumentException("No initializer set for given class ".concat(cls.getName()));
    }

    @Override
    public void F(boolean z10) {
        fe.b bVar = ((rh.i) this.f13480b).f47056s;
        if (bVar != null) {
            bVar.a(z10, true);
        }
    }

    public boolean G(int i10) {
        o71 o71Var = ((w71) this.f13480b).L;
        if (o71Var == null) {
            return false;
        }
        return o71Var.c(i10);
    }

    @Override
    public Cursor I(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f13480b;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException e) {
            Log.w("FontsProvider", "Unable to query the content provider", e);
            return null;
        }
    }

    public void J(float f7) {
        w71 w71Var = (w71) this.f13480b;
        View[] viewArr = w71Var.e;
        if (f7 == 1.0f) {
            if (viewArr[1] != null) {
                w71Var.G();
                w71Var.h.put(w71Var.f32092f[1], viewArr[1]);
                w71Var.removeView(viewArr[1]);
                w71Var.F(viewArr[0], 0.0f);
                viewArr[1] = null;
            }
            w71Var.A(w71Var.f32090b);
            return;
        }
        View view = viewArr[1];
        if (view == null) {
            return;
        }
        if (w71Var.D) {
            w71Var.F(view, (1.0f - f7) * viewArr[0].getMeasuredWidth());
            View view2 = viewArr[0];
            w71Var.F(view2, (-view2.getMeasuredWidth()) * f7);
        } else {
            w71Var.F(view, (1.0f - f7) * (-viewArr[0].getMeasuredWidth()));
            View view3 = viewArr[0];
            w71Var.F(view3, view3.getMeasuredWidth() * f7);
        }
        w71Var.x(false);
    }

    @Override
    public float N() {
        float f7;
        float f10;
        s5 s5Var = (s5) this.f13480b;
        wg.a v = v();
        wg.a B = B();
        if (v != null) {
            f7 = v.N();
        } else {
            f7 = -1.0f;
        }
        if (B != null) {
            f10 = B.N();
        } else {
            f10 = f7;
        }
        if (f10 >= 0.0f && f7 >= 0.0f) {
            return i0.T1(f10, f7, s5Var.f20787a);
        }
        if (s5Var.f20787a < 0.5f) {
            return f10;
        }
        return f7;
    }

    public void P(p4.p pVar, p4.m mVar, Collection collection) {
        p4.e eVar = (p4.e) this.f13480b;
        if (pVar == eVar.f44730y && mVar != null) {
            p4.v vVar = eVar.f44729x.f44823a;
            String d = mVar.d();
            p4.w wVar = new p4.w(vVar, d, eVar.b(vVar, d), false);
            wVar.i(mVar);
            if (eVar.d != wVar) {
                eVar.h(eVar, wVar, eVar.f44730y, 3, eVar.f44729x, collection);
                eVar.f44729x = null;
                eVar.f44730y = null;
            }
        } else if (pVar == eVar.e) {
            if (mVar != null) {
                eVar.n(eVar.d, mVar);
            }
            eVar.d.n(collection);
        }
    }

    @Override
    public float X() {
        float f7;
        float f10;
        s5 s5Var = (s5) this.f13480b;
        wg.a v = v();
        wg.a B = B();
        if (v != null) {
            f7 = v.X();
        } else {
            f7 = -1.0f;
        }
        if (B != null) {
            f10 = B.X();
        } else {
            f10 = f7;
        }
        if (f10 >= 0.0f && f7 >= 0.0f) {
            return i0.T1(f10, f7, s5Var.f20787a);
        }
        if (s5Var.f20787a < 0.5f) {
            return f10;
        }
        return f7;
    }

    public Point a0(cb cbVar) {
        a6.i iVar = (a6.i) this.f13480b;
        LatLng latLng = new LatLng(cbVar.f14971a, cbVar.f14972b);
        try {
            i8.b bVar = (i8.b) iVar.f307b;
            Parcel P0 = bVar.P0();
            s7.b.b(P0, latLng);
            Parcel O0 = bVar.O0(P0, 2);
            x6.a M0 = x6.b.M0(O0.readStrongBinder());
            O0.recycle();
            return (Point) x6.b.N0(M0);
        } catch (RemoteException e) {
            throw new RuntimeException(e);
        }
    }

    @Override
    public float a1() {
        return i0.a.d(9.66f, ei.b.d(rh.i.e0((rh.i) this.f13480b).f7766b), 0);
    }

    @Override
    public void accept(Object obj, Object obj2) {
        v8.e eVar = (v8.e) this.f13480b;
        e8.b bVar = (e8.b) obj;
        bVar.getClass();
        e8.a aVar = new e8.a(1, (TaskCompletionSource) obj2);
        try {
            e8.i iVar = (e8.i) bVar.v();
            Bundle H = bVar.H();
            Parcel obtain = Parcel.obtain();
            obtain.writeInterfaceToken("com.google.android.gms.wallet.internal.IOwService");
            int i10 = e8.c.f6313a;
            obtain.writeInt(1);
            eVar.writeToParcel(obtain, 0);
            obtain.writeInt(1);
            H.writeToParcel(obtain, 0);
            obtain.writeStrongBinder(aVar);
            iVar.f6321a.transact(14, obtain, null, 1);
            obtain.recycle();
        } catch (RemoteException e) {
            Log.e("WalletClientImpl", "RemoteException during isReadyToPay", e);
            Bundle bundle = Bundle.EMPTY;
            i5.a(Status.h, Boolean.FALSE, aVar.f6312b);
        }
    }

    @Override
    public ByteBuffer b() {
        ff ffVar = (ff) this.f13480b;
        ffVar.f15557p.d();
        return (ByteBuffer) ffVar.f15557p.f6119f;
    }

    @Override
    public float b0() {
        float f7;
        wg.a v = v();
        wg.a B = B();
        if (v != null) {
            f7 = v.b0();
        } else {
            f7 = 0.0f;
        }
        if (B != null) {
            return i0.T1(B.b0(), f7, ((s5) this.f13480b).f20787a);
        }
        return f7;
    }

    @Override
    public void c(String str) {
        qh.i0 i0Var = (qh.i0) this.f13480b;
        if (i0Var.getParentActivity() != null) {
            gf.f.r(i0Var.getParentActivity(), str);
        }
    }

    @Override
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.f13480b;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    @Override
    public p0 d(Class cls) {
        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
    }

    @Override
    public boolean e() {
        return false;
    }

    @Override
    public boolean f() {
        return true;
    }

    @Override
    public int g1() {
        return rh.i.f0((rh.i) this.f13480b).d;
    }

    @Override
    public Object get() {
        return new s5.i(Integer.valueOf(s5.i.d).intValue(), (Context) ((zc.a) this.f13480b).get(), "com.google.android.datatransport.events");
    }

    @Override
    public float getBlurAngle() {
        return ((ff) this.f13480b).f15561t;
    }

    @Override
    public float getBlurExcludeBlurSize() {
        return ((ff) this.f13480b).f15560s;
    }

    @Override
    public PointF getBlurExcludePoint() {
        return ((ff) this.f13480b).f15559r;
    }

    @Override
    public float getBlurExcludeSize() {
        return ((ff) this.f13480b).f15558q;
    }

    @Override
    public int getBlurType() {
        return ((ff) this.f13480b).f15555n;
    }

    @Override
    public CharSequence getContentDescription() {
        k20 k20Var;
        x7 x7Var = (x7) this.f13480b;
        try {
            StringBuilder sb2 = new StringBuilder();
            if (!TextUtils.isEmpty(x7Var.f23591s)) {
                sb2.append(x7Var.f23591s);
            }
            w7 w7Var = x7Var.f23590r;
            if (w7Var != null && (k20Var = w7Var.e) != null) {
                CharSequence charSequence = (CharSequence) k20Var.d(0, Integer.valueOf(x7Var.f23588f));
                if (!TextUtils.isEmpty(charSequence)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence);
                }
                CharSequence charSequence2 = (CharSequence) x7Var.f23590r.e.d(-1, Integer.valueOf(x7Var.f23590r.b()));
                CharSequence charSequence3 = (CharSequence) x7Var.f23590r.e.d(1, Integer.valueOf(x7Var.f23590r.a()));
                if (!TextUtils.isEmpty(charSequence2) && !TextUtils.isEmpty(charSequence3)) {
                    if (sb2.length() > 0) {
                        sb2.append(", ");
                    }
                    sb2.append(charSequence2);
                    sb2.append(" – ");
                    sb2.append(charSequence3);
                }
            }
            if (sb2.length() > 0) {
                return sb2.toString();
            }
            return null;
        } catch (Throwable th2) {
            f8.g(th2, true);
            return x7Var.f23591s;
        }
    }

    @Override
    public float getContrastValue() {
        return a1.g.c(((ff) this.f13480b).d, 100.0f, 0.3f, 1.0f);
    }

    @Override
    public float getEnhanceValue() {
        return ((ff) this.f13480b).f15545a / 100.0f;
    }

    @Override
    public float getExposureValue() {
        return ((ff) this.f13480b).f15547c / 100.0f;
    }

    @Override
    public float getFadeValue() {
        return ((ff) this.f13480b).f15549g / 100.0f;
    }

    @Override
    public float getGrainValue() {
        return (((ff) this.f13480b).f15554m / 100.0f) * 0.04f;
    }

    @Override
    public float getHighlightsValue() {
        return c3.i0.x(((ff) this.f13480b).f15551j, 0.75f, 100.0f, 100.0f);
    }

    @Override
    public float getSaturationValue() {
        float f7 = ((ff) this.f13480b).f15548f / 100.0f;
        if (f7 > 0.0f) {
            f7 *= 1.05f;
        }
        return f7 + 1.0f;
    }

    @Override
    public float getShadowsValue() {
        return c3.i0.x(((ff) this.f13480b).f15552k, 0.55f, 100.0f, 100.0f);
    }

    @Override
    public float getSharpenValue() {
        return a1.g.c(((ff) this.f13480b).f15556o, 100.0f, 0.6f, 0.11f);
    }

    @Override
    public float getSoftenSkinValue() {
        return ((ff) this.f13480b).f15546b / 100.0f;
    }

    @Override
    public int getTintHighlightsColor() {
        return ((ff) this.f13480b).f15550i;
    }

    @Override
    public float getTintHighlightsIntensityValue() {
        if (((ff) this.f13480b).f15550i == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public int getTintShadowsColor() {
        return ((ff) this.f13480b).h;
    }

    @Override
    public float getTintShadowsIntensityValue() {
        if (((ff) this.f13480b).h == 0) {
            return 0.0f;
        }
        return 0.5f;
    }

    @Override
    public float getVignetteValue() {
        return ((ff) this.f13480b).f15553l / 100.0f;
    }

    @Override
    public float getWarmthValue() {
        return ((ff) this.f13480b).e / 100.0f;
    }

    @Override
    public boolean h() {
        return false;
    }

    @Override
    public int h0() {
        int i10;
        wg.a v = v();
        wg.a B = B();
        if (v != null) {
            i10 = v.h0();
        } else {
            i10 = 0;
        }
        if (B != null) {
            return i0.b.f(((s5) this.f13480b).f20787a, B.h0(), i10);
        }
        return i10;
    }

    @Override
    public void i(Object obj) {
        Location location;
        ra raVar = ((aa) obj).f14597a;
        List list = ((LocationResult) this.f13480b).f5412a;
        int size = list.size();
        if (size == 0) {
            location = null;
        } else {
            location = (Location) list.get(size - 1);
        }
        m2.t tVar = (m2.t) raVar;
        if (location == null) {
            tVar.getClass();
        } else {
            ((nd) tVar.f12684b).m(location);
        }
    }

    @Override
    public void invalidate() {
        ((jf0) this.f13480b).h.invalidate();
    }

    @Override
    public void j(ImageReceiver imageReceiver) {
        ((cv) this.f13480b).s0(true);
    }

    @Override
    public int j0() {
        int i10;
        wg.a v = v();
        wg.a B = B();
        if (v != null) {
            i10 = v.j0();
        } else {
            i10 = 0;
        }
        if (B != null) {
            return i0.b.f(((s5) this.f13480b).f20787a, B.j0(), i10);
        }
        return i10;
    }

    @Override
    public void k(boolean z10, float f7) {
        int[] iArr;
        int round;
        x7 x7Var = (x7) this.f13480b;
        w7 w7Var = x7Var.f23590r;
        if (w7Var != null && x7Var.f23589n != null) {
            if (w7Var.f23408c != null) {
                double length = f7 * (iArr.length - 1);
                int j10 = Utilities.j((int) Math.floor(length), x7Var.f23590r.f23408c.length - 1, 0);
                int j11 = Utilities.j((int) Math.ceil(length), x7Var.f23590r.f23408c.length - 1, 0);
                int[] iArr2 = x7Var.f23590r.f23408c;
                round = Math.round(i0.W1(Math.round(((float) (length - Math.floor(length))) * x7Var.f23590r.d) / x7Var.f23590r.d, iArr2[j10], iArr2[j11]));
            } else {
                round = Math.round(((x7Var.f23590r.a() - x7Var.f23590r.b()) * f7) + w7Var.b());
            }
            int i10 = x7Var.h;
            if (i10 != Integer.MIN_VALUE) {
                round = Math.max(round, i10);
            }
            int i11 = x7Var.f23588f;
            if (i11 != round) {
                if (x7Var.c(i11) != x7Var.c(round)) {
                    i0.b4(x7Var.e);
                }
                x7Var.f23588f = round;
                x7Var.e(round, true);
                q20 q20Var = x7Var.f23589n;
                if (q20Var != null) {
                    q20Var.a(Integer.valueOf(x7Var.f23588f));
                }
            }
        }
    }

    @Override
    public b1 k0(int i10, Runnable runnable, String str, boolean z10, boolean z11) {
        zt0 zt0Var = (zt0) this.f13480b;
        b1 e = zt0Var.I.e(0, i10, str);
        if (z10) {
            int i11 = t6.f21153p7;
            e.d(zt0Var.q0(i11), zt0Var.q0(i11));
        }
        e.setOnClickListener(new cb0(this, z11, runnable));
        return e;
    }

    @Override
    public boolean l() {
        return false;
    }

    @Override
    public boolean m(float f7) {
        return false;
    }

    @Override
    public int n0() {
        int i10;
        b5 b5Var;
        s5 s5Var = (s5) this.f13480b;
        wg.a v = v();
        if (v != null) {
            i10 = v.n0();
        } else {
            i10 = 0;
        }
        if (s5Var.f20787a < 1.0f && (b5Var = s5Var.d) != null) {
            return i0.b.f(s5Var.f20787a, b5Var.getButtonsGlassBackgroundColor(), i10);
        }
        return i10;
    }

    @Override
    public void onError(u61 u61Var, Exception exc) {
        switch (this.f13479a) {
            case 11:
                f8.g(exc, true);
                return;
            default:
                return;
        }
    }

    @Override
    public void onRenderedFirstFrame() {
        int i10 = this.f13479a;
    }

    @Override
    public void onSeekFinished(j2.a aVar) {
        int i10 = this.f13479a;
    }

    @Override
    public void onSeekStarted(j2.a aVar) {
        int i10 = this.f13479a;
    }

    @Override
    public void onStateChanged(boolean z10, int i10) {
        e50 e50Var;
        x20 x20Var;
        switch (this.f13479a) {
            case 11:
                x40 x40Var = (x40) this.f13480b;
                u61 u61Var = x40Var.H0.S;
                if (u61Var != null && u61Var.d0() && i10 == 4 && (x20Var = (e50Var = x40Var.H0).R) != null) {
                    u61 u61Var2 = e50Var.S;
                    long j10 = x20Var.f19183a;
                    if (j10 <= 0) {
                        j10 = 0;
                    }
                    u61Var2.p0(j10);
                    return;
                }
                return;
            default:
                nj0 nj0Var = (nj0) this.f13480b;
                if (z10 && nj0Var.f28805n.S() >= 0) {
                    nj0Var.f28809x = true;
                }
                kf0 kf0Var = nj0Var.f28804f;
                eb0 eb0Var = nj0Var.f28810y;
                kf0Var.a(z10, true);
                i0.r(eb0Var);
                if (z10) {
                    i0.h3(eb0Var, 16L);
                    return;
                }
                return;
        }
    }

    @Override
    public boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        switch (this.f13479a) {
            case 11:
                return false;
            default:
                return false;
        }
    }

    @Override
    public void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        int i10 = this.f13479a;
    }

    @Override
    public void onVideoSizeChanged(int i10, int i11, int i12, float f7) {
        int i13 = this.f13479a;
    }

    @Override
    public boolean p() {
        return !((ff) this.f13480b).f15557p.s();
    }

    @Override
    public int p0() {
        w7 w7Var = ((x7) this.f13480b).f23590r;
        if (w7Var == null) {
            return 0;
        }
        int[] iArr = w7Var.f23408c;
        if (iArr != null) {
            return (iArr.length - 1) * w7Var.d;
        }
        return w7Var.a() - w7Var.b();
    }

    @Override
    public void s(qh.y yVar) {
        qh.i0 i0Var = (qh.i0) this.f13480b;
        FrameLayout frameLayout = i0Var.f45650f;
        if (frameLayout != null) {
            frameLayout.removeView(yVar);
        }
        if (i0Var.F == yVar) {
            i0Var.F = null;
        }
        x0 x0Var = i0Var.d;
        if (x0Var != null) {
            x0Var.setScanHidden(false);
        }
    }

    @Override
    public int u() {
        int i10;
        s5 s5Var = (s5) this.f13480b;
        wg.a v = v();
        if (v != null && s5Var.d.b()) {
            i10 = v.u();
        } else {
            i10 = 0;
        }
        wg.a B = B();
        if (B != null) {
            return i0.b.f(s5Var.f20787a, B.u(), i10);
        }
        return i10;
    }

    public wg.a v() {
        b5 b5Var = ((s5) this.f13480b).d;
        if (b5Var != null) {
            return b5Var.getMenuGlassColorProvider();
        }
        return null;
    }

    @Override
    public int w() {
        int i10;
        wg.a v = v();
        wg.a B = B();
        if (v != null) {
            i10 = v.w();
        } else {
            i10 = 0;
        }
        if (B != null) {
            return i0.b.f(((s5) this.f13480b).f20787a, B.w(), i10);
        }
        return i10;
    }

    @Override
    public void x(View view, o0 o0Var, boolean z10, boolean z11) {
        sg.s sVar = (sg.s) this.f13480b;
        sVar.f48465a.qb(null, sVar.e, sVar.f48466b, view, 0.0f, 0.0f, o0Var, false, z10, z11, false);
        i0.g3(new x1(this, 29));
    }

    @Override
    public void y() {
        ((zt0) this.f13480b).I.a(-1);
    }

    @Override
    public void z() {
        ((w8) this.f13480b).f32099a.invalidate();
    }

    public u(int i10) {
        this.f13479a = i10;
        switch (i10) {
            case 2:
                this.f13480b = new o2.d(1.0f, 5, 0, false);
                return;
            case 3:
                this.f13480b = new Object();
                return;
            case 4:
            default:
                this.f13480b = n0.t();
                return;
            case 5:
                return;
        }
    }

    @Override
    public void onRenderedFirstFrame(j2.a aVar) {
        int i10 = this.f13479a;
    }

    public u(v1.c[] initializers) {
        this.f13479a = 28;
        kotlin.jvm.internal.i.e(initializers, "initializers");
        this.f13480b = initializers;
    }

    public u(EditText editText) {
        this.f13479a = 17;
        this.f13480b = new m4.c(editText);
    }

    public u(String str, String str2) {
        this.f13479a = 4;
        this.f13480b = new q0(str, str2);
    }

    public u(Context context, Uri uri) {
        this.f13479a = 1;
        this.f13480b = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    private final void K() {
    }

    private final void M() {
    }

    @Override
    public void C() {
    }

    @Override
    public void V() {
    }

    @Override
    public void a() {
    }

    @Override
    public void n() {
    }

    @Override
    public void t() {
    }

    private final void L(j2.a aVar) {
    }

    private final void O(j2.a aVar) {
    }

    private final void Q(j2.a aVar) {
    }

    private final void R(j2.a aVar) {
    }

    private final void S(j2.a aVar) {
    }

    private final void T(j2.a aVar) {
    }

    private final void U(SurfaceTexture surfaceTexture) {
    }

    private final void W(SurfaceTexture surfaceTexture) {
    }

    @Override
    public void g(boolean z10) {
    }

    private final void H(u61 u61Var, Exception exc) {
    }

    @Override
    public void q(int i10, Drawable drawable) {
    }

    private final void Y(int i10, int i11, float f7, int i12) {
    }

    private final void Z(int i10, int i11, float f7, int i12) {
    }

    @Override
    public void o(ImageReceiver imageReceiver, boolean z10, boolean z11, boolean z12) {
    }

    @Override
    public void r(Canvas canvas, RectF rectF, float f7, float f10, float f11, int i10, boolean z10) {
    }
}
