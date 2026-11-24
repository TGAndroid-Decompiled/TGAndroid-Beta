package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.location.Location;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.gms.location.LocationResult;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.ThemeActivity;
public class et8 implements ft8, yx8, ldc, gk, ln5, mv8, udc, lv8, mga, am0, jca, zv7, jm6, cx9, rv9, i68, h89, a4d, OnFailureListener, v76 {
    public final byte a;
    public final Object b;

    public et8(tfc tfcVar, sfc sfcVar, x23 x23Var) {
        this.a = (byte) 21;
        tfcVar.getClass();
        sfcVar.getClass();
        x23Var.getClass();
        this.b = new wm9(tfcVar, sfcVar, x23Var);
    }

    @Override
    public final void C0(int i) {
        m5d m5dVar = (m5d) this.b;
        ReentrantLock reentrantLock = m5dVar.o;
        reentrantLock.lock();
        try {
            if (m5dVar.n) {
                m5dVar.n = false;
                m5dVar.b.C0(i);
                m5dVar.m = null;
                m5dVar.l = null;
            } else {
                m5dVar.n = true;
                m5dVar.d.onConnectionSuspended(i);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public final void D() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public final boolean F() {
        u31 k = ((wsa) this.b).j().k(false);
        k.u = true;
        k.j();
        return true;
    }

    @Override
    public final void I() {
        ((nha) this.b).J.a(-1);
    }

    @Override
    public final a8 K(String str) {
        zja zjaVar = ((nha) this.b).J;
        return zjaVar.d(0, 0, null, str, true, true, zjaVar.n0);
    }

    @Override
    public final int K1() {
        int i;
        h27 h27Var;
        bka bkaVar = (bka) this.b;
        am0 i2 = i();
        if (i2 != null) {
            i = i2.K1();
        } else {
            i = 0;
        }
        if (bkaVar.a < 1.0f && (h27Var = bkaVar.d) != null) {
            return on2.f(bkaVar.a, h27Var.getButtonsGlassBackgroundColor(), i);
        }
        return i;
    }

    @Override
    public final void L(ImageReceiver imageReceiver) {
        ((cj9) this.b).s0(true);
    }

    @Override
    public final void O(float f) {
        ((n1b) this.b).setOutlineWidth(f);
    }

    @Override
    public final int V() {
        int i;
        bka bkaVar = (bka) this.b;
        am0 i2 = i();
        if (i2 != null && bkaVar.d.g()) {
            i = i2.V();
        } else {
            i = 0;
        }
        am0 k = k();
        if (k != null) {
            return on2.f(bkaVar.a, k.V(), i);
        }
        return i;
    }

    @Override
    public final void a(int i, z43 z43Var, long j, int i2) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i, 0, z43Var.i, j, i2);
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 25:
                TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
                a5d a5dVar = (a5d) ((q3d) obj).k();
                Parcel c = a5dVar.c();
                g4d.b(c, (p3d) obj3);
                try {
                    a5dVar.b.transact(1, c, null, 1);
                    c.recycle();
                    taskCompletionSource.setResult(null);
                    return;
                } catch (Throwable th) {
                    c.recycle();
                    throw th;
                }
            default:
                y0e y0eVar = new y0e((TaskCompletionSource) obj2, (byte) 0);
                ref refVar = (ref) ((r9f) obj).k();
                Parcel obtain = Parcel.obtain();
                obtain.writeInterfaceToken(refVar.b);
                int i = oid.a;
                obtain.writeStrongBinder(y0eVar);
                obtain.writeInt(1);
                ((nw8) obj3).writeToParcel(obtain, 0);
                Parcel obtain2 = Parcel.obtain();
                try {
                    refVar.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return;
                } finally {
                    obtain.recycle();
                    obtain2.recycle();
                }
        }
    }

    @Override
    public final void b(int i, int i2, int i3, long j) {
        ((MediaCodec) this.b).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override
    public final void c(Object obj) {
        Location location;
        mj5 mj5Var = ((m05) obj).a;
        List list = ((LocationResult) this.b).a;
        int size = list.size();
        if (size == 0) {
            location = null;
        } else {
            location = (Location) list.get(size - 1);
        }
        mj5Var.onLocationChanged(location);
    }

    @Override
    public final a8 c0(int i, Runnable runnable, String str, boolean z, boolean z2) {
        nha nhaVar = (nha) this.b;
        a8 e = nhaVar.J.e(0, i, str);
        if (z) {
            int i2 = cmb.o7;
            e.d(nhaVar.c0(i2), nhaVar.c0(i2));
        }
        e.setOnClickListener(new xw2(this, z2, runnable));
        return e;
    }

    @Override
    public final void e(String str) {
        iy8 iy8Var = (iy8) this.b;
        if (iy8Var.getParentActivity() != null) {
            l11.u(iy8Var.getParentActivity(), str);
        }
    }

    @Override
    public final void f(float f) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        la8 la8Var = secretMediaViewer.E;
        if (la8Var != null) {
            long U = la8Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.p0(f * ((float) U), false);
            }
            secretMediaViewer.E.g0();
        }
    }

    @Override
    public final void finish() {
        Point point = gm.q;
        if (point.x > point.y) {
            ((nxb) this.b).w0.finishPreviewFragment();
        }
    }

    @Override
    public final void g(int i, Serializable serializable) {
        String str;
        switch (i) {
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
        if (i != 6 && i != 7 && i != 8) {
            Log.d("ProfileInstaller", str);
        } else {
            Log.e("ProfileInstaller", str, (Throwable) serializable);
        }
        ((ProfileInstallReceiver) this.b).setResultCode(i);
    }

    @Override
    public final int g0() {
        int i;
        am0 i2 = i();
        am0 k = k();
        if (i2 != null) {
            i = i2.g0();
        } else {
            i = 0;
        }
        if (k != null) {
            return on2.f(((bka) this.b).a, k.g0(), i);
        }
        return i;
    }

    @Override
    public final float g1() {
        float f;
        am0 i = i();
        am0 k = k();
        if (i != null) {
            f = i.g1();
        } else {
            f = 0.0f;
        }
        if (k != null) {
            return gm.R1(k.g1(), f, ((bka) this.b).a);
        }
        return f;
    }

    @Override
    public final Object mo8get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 8:
                return new qs9(qs9.d, (Context) ((mq5) obj).a, "com.google.android.datatransport.events");
            default:
                return new j9a((hia) ((lv8) obj).mo8get());
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        tmb tmbVar = (tmb) this.b;
        byte b = tmbVar.d;
        return String.valueOf(Math.round((tmbVar.b.getProgress() * (tmbVar.e - b)) + b));
    }

    @Override
    public final void h(float f) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        la8 la8Var = secretMediaViewer.E;
        if (la8Var != null) {
            la8Var.f0();
            long U = secretMediaViewer.E.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.p0(f * ((float) U), false);
            }
        }
    }

    @Override
    public final int h1() {
        int i;
        am0 i2 = i();
        am0 k = k();
        if (i2 != null) {
            i = i2.h1();
        } else {
            i = 0;
        }
        if (k != null) {
            return on2.f(((bka) this.b).a, k.h1(), i);
        }
        return i;
    }

    public final am0 i() {
        h27 h27Var = ((bka) this.b).d;
        if (h27Var != null) {
            return h27Var.getMenuGlassColorProvider();
        }
        return null;
    }

    @Override
    public final void j(float f) {
        Point point = gm.q;
        if (point.x > point.y) {
            ((nxb) this.b).w0.movePreviewFragment(f);
        }
    }

    @Override
    public final int j0() {
        tmb tmbVar = (tmb) this.b;
        return tmbVar.e - tmbVar.d;
    }

    @Override
    public final void j1(Bundle bundle) {
        m5d m5dVar = (m5d) this.b;
        ReentrantLock reentrantLock = m5dVar.o;
        reentrantLock.lock();
        try {
            m5dVar.m = ot2.f;
            m5dVar.j();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final am0 k() {
        h27 h27Var;
        bka bkaVar = (bka) this.b;
        if (bkaVar.a < 1.0f && (h27Var = bkaVar.d) != null) {
            return h27Var.getButtonsGlassColorProvider();
        }
        return null;
    }

    public final pfc l(Class cls) {
        String str;
        String a;
        cj2 a2 = h79.a(cls);
        wm9 wm9Var = (wm9) this.b;
        Map map = cj2.b;
        Class cls2 = a2.a;
        cls2.getClass();
        if (cls2.isAnonymousClass() || cls2.isLocalClass()) {
            str = null;
        } else if (cls2.isArray()) {
            Class<?> componentType = cls2.getComponentType();
            if (componentType.isPrimitive() && (a = gtd.a(componentType.getName())) != null) {
                str = a.concat("Array");
            } else {
                str = null;
            }
            if (str == null) {
                str = "kotlin.Array";
            }
        } else {
            String a3 = gtd.a(cls2.getName());
            if (a3 == null) {
                str = cls2.getCanonicalName();
            } else {
                str = a3;
            }
        }
        if (str != null) {
            return wm9Var.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str));
        }
        u36.j("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override
    public final void m(ArrayList arrayList) {
        sm2 sm2Var = (sm2) this.b;
        try {
            if (!arrayList.isEmpty()) {
                z5a z5aVar = (z5a) arrayList.get(0);
                if (z5aVar.c != null) {
                    File z = bc4.z(4);
                    sm2Var.f = new File(z, Utilities.b.nextInt() + ".jpg");
                    Point b1 = gm.b1();
                    Bitmap G = fn5.G(z5aVar.c, null, (float) b1.x, (float) b1.y, true);
                    G.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream((File) sm2Var.f));
                    ((etc) sm2Var.e).b((File) sm2Var.f, G, true);
                }
            }
        } catch (Throwable th) {
            fc4.g(th, true);
        }
    }

    @Override
    public final void n(boolean z, float f) {
        tmb tmbVar = (tmb) this.b;
        ThemeActivity themeActivity = tmbVar.r;
        byte b = tmbVar.d;
        themeActivity.D0(Math.round(((tmbVar.e - b) * f) + b));
    }

    public void o() {
        View view = (View) this.b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override
    public final void onFailure(Exception exc) {
        zfd zfdVar = (zfd) this.b;
        zfdVar.getClass();
        ce6 ce6Var = zfd.i;
        Log.w(ce6Var.a, ce6Var.d("Fail to store SessionState", new Object[0]), exc);
        zfdVar.b(100);
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        l49 l49Var = (l49) this.b;
        if (z && l49Var.n.S() >= 0) {
            l49Var.x = true;
        }
        ae8 ae8Var = l49Var.f;
        pp8 pp8Var = l49Var.y;
        ae8Var.a(z, true);
        gm.r(pp8Var);
        if (z) {
            gm.d3(pp8Var, 16L);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public final void p(zx8 zx8Var) {
        iy8 iy8Var = (iy8) this.b;
        FrameLayout frameLayout = iy8Var.f;
        if (frameLayout != null) {
            frameLayout.removeView(zx8Var);
        }
        if (iy8Var.G == zx8Var) {
            iy8Var.G = null;
        }
        wy8 wy8Var = iy8Var.d;
        if (wy8Var != null) {
            wy8Var.setScanHidden(false);
        }
    }

    public final boolean q() {
        b4d b4dVar = ((o3d) this.b).d;
        if (b4dVar != null && b4dVar.g()) {
            return true;
        }
        return false;
    }

    public void r() {
        View view;
        View view2 = (View) this.b;
        if (view2 != null) {
            if (!view2.isInEditMode() && !view2.onCheckIsTextEditor()) {
                view = view2.getRootView().findFocus();
            } else {
                view2.requestFocus();
                view = view2;
            }
            if (view == null) {
                view = view2.getRootView().findViewById(16908290);
            }
            if (view != null && view.hasWindowFocus()) {
                view.post(new ud(view, (byte) 6));
            }
        }
    }

    @Override
    public final int r1() {
        int i;
        am0 i2 = i();
        am0 k = k();
        if (i2 != null) {
            i = i2.r1();
        } else {
            i = 0;
        }
        if (k != null) {
            return on2.f(((bka) this.b).a, k.r1(), i);
        }
        return i;
    }

    @Override
    public final void setParameters(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    @Override
    public final void t0() {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            ((Activity) ((sm2) this.b).c).startActivityForResult(intent, 11);
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final int u0() {
        int i;
        bka bkaVar = (bka) this.b;
        am0 i2 = i();
        if (i2 != null && bkaVar.d.g()) {
            i = i2.u0();
        } else {
            i = 0;
        }
        am0 k = k();
        if (k != null) {
            return on2.f(bkaVar.a, k.u0(), i);
        }
        return i;
    }

    @Override
    public final void v(ot2 ot2Var) {
        m5d m5dVar = (m5d) this.b;
        ReentrantLock reentrantLock = m5dVar.o;
        reentrantLock.lock();
        try {
            m5dVar.m = ot2Var;
            m5dVar.j();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public final void w(hg3 hg3Var) {
        sxb sxbVar = ((nxb) this.b).w0;
        HashSet hashSet = sxb.s1;
        sxbVar.Q0(hg3Var);
    }

    @Override
    public final float w0() {
        float f;
        float f2;
        bka bkaVar = (bka) this.b;
        am0 i = i();
        am0 k = k();
        if (i != null) {
            f = i.w0();
        } else {
            f = -1.0f;
        }
        if (k != null) {
            f2 = k.w0();
        } else {
            f2 = f;
        }
        if (f2 >= 0.0f && f >= 0.0f) {
            return gm.R1(f2, f, bkaVar.a);
        }
        if (bkaVar.a < 0.5f) {
            return f2;
        }
        return f;
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        ((jf9) this.b).w0(i, i2, z);
    }

    @Override
    public final float y0() {
        float f;
        float f2;
        bka bkaVar = (bka) this.b;
        am0 i = i();
        am0 k = k();
        if (i != null) {
            f = i.y0();
        } else {
            f = -1.0f;
        }
        if (k != null) {
            f2 = k.y0();
        } else {
            f2 = f;
        }
        if (f2 >= 0.0f && f >= 0.0f) {
            return gm.R1(f2, f, bkaVar.a);
        }
        if (bkaVar.a < 0.5f) {
            return f2;
        }
        return f;
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    @Override
    public final void d() {
    }

    @Override
    public final void flush() {
    }

    @Override
    public final void s() {
    }

    @Override
    public final void shutdown() {
    }

    @Override
    public final void start() {
    }

    @Override
    public final void x() {
    }

    public et8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public et8() {
        this.a = (byte) 19;
        this.b = new SparseArray();
    }

    public et8(tfc tfcVar, sfc sfcVar) {
        this(tfcVar, sfcVar, v23.b);
        this.a = (byte) 21;
        tfcVar.getClass();
    }

    @Override
    public final void onRenderedFirstFrame(tk tkVar) {
    }

    @Override
    public final void onSeekFinished(tk tkVar) {
    }

    @Override
    public final void onSeekStarted(tk tkVar) {
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public et8(ua4 ua4Var, nw8 nw8Var) {
        this.a = (byte) 27;
        this.b = nw8Var;
    }

    public et8(gp4 gp4Var) {
        this(gp4Var.f(), gp4Var.c(), gp4Var.d());
        this.a = (byte) 21;
        gp4Var.getClass();
    }

    @Override
    public final void B0(int i, Drawable drawable) {
    }

    @Override
    public final float get() {
        return ((n1b) this.b).G;
    }

    @Override
    public final void onError(ndc ndcVar, Exception exc) {
    }

    @Override
    public final void b0(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
    }

    @Override
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
    }
}
