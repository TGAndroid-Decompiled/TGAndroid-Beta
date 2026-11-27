package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.SurfaceTexture;
import android.graphics.drawable.Drawable;
import android.media.MediaCodec;
import android.os.Bundle;
import android.os.Parcel;
import android.util.Log;
import android.util.SparseArray;
import android.view.TextureView;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.FrameLayout;
import androidx.profileinstaller.ProfileInstallReceiver;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.File;
import java.io.FileOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Map;
import java.util.concurrent.locks.ReentrantLock;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Utilities;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.SecretMediaViewer;
import org.telegram.ui.ThemeActivity;
public class pq8 implements be8, mu8, iz8, ifc, hj, on5, uw8, rfc, tw8, dia, bl0, aea, fx7, lm6, ty9, jx9, v78, s99, p6d {
    public final byte a;
    public final Object b;

    public pq8(byte b) {
        this.a = b;
        switch (b) {
            case 22:
                this.b = new SparseArray();
                return;
            default:
                this.b = new ArrayList();
                return;
        }
    }

    @Override
    public final void A(jz8 jz8Var) {
        rz8 rz8Var = (rz8) this.b;
        FrameLayout frameLayout = rz8Var.f;
        if (frameLayout != null) {
            frameLayout.removeView(jz8Var);
        }
        if (rz8Var.G == jz8Var) {
            rz8Var.G = null;
        }
        g09 g09Var = rz8Var.d;
        if (g09Var != null) {
            g09Var.setScanHidden(false);
        }
    }

    @Override
    public final void B(of3 of3Var) {
        tzb tzbVar = ((ozb) this.b).w0;
        HashSet hashSet = tzb.s1;
        tzbVar.Q0(of3Var);
    }

    @Override
    public final float B0() {
        float f;
        float f2;
        ula ulaVar = (ula) this.b;
        bl0 e = e();
        bl0 i = i();
        if (e != null) {
            f = e.B0();
        } else {
            f = -1.0f;
        }
        if (i != null) {
            f2 = i.B0();
        } else {
            f2 = f;
        }
        if (f2 >= 0.0f && f >= 0.0f) {
            return hl.R1(f2, f, ulaVar.a);
        }
        if (ulaVar.a < 0.5f) {
            return f2;
        }
        return f;
    }

    @Override
    public final TextureView D() {
        return null;
    }

    @Override
    public final float D0() {
        float f;
        float f2;
        ula ulaVar = (ula) this.b;
        bl0 e = e();
        bl0 i = i();
        if (e != null) {
            f = e.D0();
        } else {
            f = -1.0f;
        }
        if (i != null) {
            f2 = i.D0();
        } else {
            f2 = f;
        }
        if (f2 >= 0.0f && f >= 0.0f) {
            return hl.R1(f2, f, ulaVar.a);
        }
        if (ulaVar.a < 0.5f) {
            return f2;
        }
        return f;
    }

    @Override
    public final boolean E() {
        v21 k = ((wua) this.b).j().k(false);
        k.u = true;
        k.j();
        return true;
    }

    @Override
    public final void G(float f) {
        ((k3b) this.b).setOutlineWidth(f);
    }

    @Override
    public final void H() {
        ((eja) this.b).J.a(-1);
    }

    @Override
    public final void I() {
        Log.d("ProfileInstaller", "DIAGNOSTIC_PROFILE_IS_COMPRESSED");
    }

    @Override
    public final void J(r47 r47Var) {
        ws8 ws8Var = ((ProfileActivity) this.b).n0;
        if (ws8Var != null && ws8Var.a) {
            ws8Var.L.e(true, 0.0f);
            ws8Var.invalidate();
        }
    }

    @Override
    public final b8 K(String str) {
        sla slaVar = ((eja) this.b).J;
        return slaVar.d(0, 0, null, str, true, true, slaVar.n0);
    }

    @Override
    public final int Q1() {
        int i;
        o27 o27Var;
        ula ulaVar = (ula) this.b;
        bl0 e = e();
        if (e != null) {
            i = e.Q1();
        } else {
            i = 0;
        }
        if (ulaVar.a < 1.0f && (o27Var = ulaVar.d) != null) {
            return vm2.f(ulaVar.a, o27Var.getButtonsGlassBackgroundColor(), i);
        }
        return i;
    }

    @Override
    public final int X() {
        int i;
        ula ulaVar = (ula) this.b;
        bl0 e = e();
        if (e != null && ulaVar.d.f()) {
            i = e.X();
        } else {
            i = 0;
        }
        bl0 i2 = i();
        if (i2 != null) {
            return vm2.f(ulaVar.a, i2.X(), i);
        }
        return i;
    }

    @Override
    public final b8 Z(int i, Runnable runnable, String str, boolean z, boolean z2) {
        eja ejaVar = (eja) this.b;
        b8 e = ejaVar.J.e(0, i, str);
        if (z) {
            int i2 = aob.p7;
            e.d(ejaVar.c0(i2), ejaVar.c0(i2));
        }
        e.setOnClickListener(new hw2(this, z2, runnable));
        return e;
    }

    @Override
    public final void a(int i, g43 g43Var, long j, int i2) {
        ((MediaCodec) this.b).queueSecureInputBuffer(i, 0, g43Var.i, j, i2);
    }

    @Override
    public final void accept(Object obj, Object obj2) {
        TaskCompletionSource taskCompletionSource = (TaskCompletionSource) obj2;
        p7d p7dVar = (p7d) ((f6d) obj).k();
        Parcel c = p7dVar.c();
        v6d.b(c, (e6d) this.b);
        try {
            p7dVar.b.transact(1, c, null, 1);
            c.recycle();
            taskCompletionSource.setResult(null);
        } catch (Throwable th) {
            c.recycle();
            throw th;
        }
    }

    @Override
    public final void b(int i, int i2, int i3, long j) {
        ((MediaCodec) this.b).queueInputBuffer(i, 0, i2, j, i3);
    }

    @Override
    public final void d(String str) {
        rz8 rz8Var = (rz8) this.b;
        if (rz8Var.getParentActivity() != null) {
            m01.u(rz8Var.getParentActivity(), str);
        }
    }

    public final bl0 e() {
        o27 o27Var = ((ula) this.b).d;
        if (o27Var != null) {
            return o27Var.getMenuGlassColorProvider();
        }
        return null;
    }

    @Override
    public final void f(int i, Serializable serializable) {
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
    public final void finish() {
        Point point = hl.q;
        if (point.x > point.y) {
            ((ozb) this.b).w0.finishPreviewFragment();
        }
    }

    @Override
    public final void g(float f) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        ac8 ac8Var = secretMediaViewer.E;
        if (ac8Var != null) {
            long U = ac8Var.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.p0(f * ((float) U), false);
            }
            secretMediaViewer.E.g0();
        }
    }

    @Override
    public final void g1(Bundle bundle) {
        b8d b8dVar = (b8d) this.b;
        ReentrantLock reentrantLock = b8dVar.o;
        reentrantLock.lock();
        try {
            b8dVar.m = ws2.f;
            b8dVar.j();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public final Object mo21get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 11:
                return new hu9(hu9.d, (Context) ((pq5) obj).a, "com.google.android.datatransport.events");
            default:
                return new zaa((yja) ((tw8) obj).mo21get());
        }
    }

    @Override
    public final CharSequence getContentDescription() {
        rob robVar = (rob) this.b;
        byte b = robVar.d;
        return String.valueOf(Math.round((robVar.b.getProgress() * (robVar.e - b)) + b));
    }

    @Override
    public final void h(float f) {
        SecretMediaViewer secretMediaViewer = (SecretMediaViewer) this.b;
        ac8 ac8Var = secretMediaViewer.E;
        if (ac8Var != null) {
            ac8Var.f0();
            long U = secretMediaViewer.E.U();
            if (U != -9223372036854775807L) {
                secretMediaViewer.E.p0(f * ((float) U), false);
            }
        }
    }

    public final bl0 i() {
        o27 o27Var;
        ula ulaVar = (ula) this.b;
        if (ulaVar.a < 1.0f && (o27Var = ulaVar.d) != null) {
            return o27Var.getButtonsGlassColorProvider();
        }
        return null;
    }

    @Override
    public final int i0() {
        rob robVar = (rob) this.b;
        return robVar.e - robVar.d;
    }

    public final void j(StringBuilder sb) {
        String str;
        if (((Boolean) qd4.l(1, (ArrayList) this.b)).booleanValue()) {
            str = "</ol>";
        } else {
            str = "</ul>";
        }
        sb.append(str);
    }

    @Override
    public final void k(r47 r47Var) {
        ProfileActivity profileActivity = (ProfileActivity) this.b;
        profileActivity.a.K0(true);
        gr8 gr8Var = profileActivity.O;
        if (gr8Var != null && gr8Var.getCurrentListView() != null) {
            profileActivity.O.getCurrentListView().K0(true);
        }
        profileActivity.d1.setBackgroundColor(vm2.f(0.1f, profileActivity.Y1(profileActivity.Z4.f), aob.v0(aob.a7, profileActivity.A0)));
    }

    public final void l(StringBuilder sb) {
        while (!((ArrayList) this.b).isEmpty()) {
            j(sb);
        }
    }

    @Override
    public final void m(ArrayList arrayList) {
        am2 am2Var = (am2) this.b;
        try {
            if (!arrayList.isEmpty()) {
                q7a q7aVar = (q7a) arrayList.get(0);
                if (q7aVar.c != null) {
                    File z = xb4.z(4);
                    am2Var.f = new File(z, Utilities.b.nextInt() + ".jpg");
                    Point b1 = hl.b1();
                    Bitmap G = in5.G(q7aVar.c, null, (float) b1.x, (float) b1.y, true);
                    G.compress(Bitmap.CompressFormat.JPEG, 87, new FileOutputStream((File) am2Var.f));
                    ((qvc) am2Var.e).b((File) am2Var.f, G, true);
                }
            }
        } catch (Throwable th) {
            cc4.g(th, true);
        }
    }

    @Override
    public final int m0() {
        int i;
        bl0 e = e();
        bl0 i2 = i();
        if (e != null) {
            i = e.m0();
        } else {
            i = 0;
        }
        if (i2 != null) {
            return vm2.f(((ula) this.b).a, i2.m0(), i);
        }
        return i;
    }

    @Override
    public final float m1() {
        float f;
        bl0 e = e();
        bl0 i = i();
        if (e != null) {
            f = e.m1();
        } else {
            f = 0.0f;
        }
        if (i != null) {
            return hl.R1(i.m1(), f, ((ula) this.b).a);
        }
        return f;
    }

    public final nhc n(Class cls) {
        String str;
        String a;
        ki2 a2 = s89.a(cls);
        ko9 ko9Var = (ko9) this.b;
        Map map = ki2.b;
        Class cls2 = a2.a;
        cls2.getClass();
        if (cls2.isAnonymousClass() || cls2.isLocalClass()) {
            str = null;
        } else if (cls2.isArray()) {
            Class<?> componentType = cls2.getComponentType();
            if (componentType.isPrimitive() && (a = tvd.a(componentType.getName())) != null) {
                str = a.concat("Array");
            } else {
                str = null;
            }
            if (str == null) {
                str = "kotlin.Array";
            }
        } else {
            String a3 = tvd.a(cls2.getName());
            if (a3 == null) {
                str = cls2.getCanonicalName();
            } else {
                str = a3;
            }
        }
        if (str != null) {
            return ko9Var.t(a2, "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(str));
        }
        lq5.j("Local and anonymous classes can not be ViewModels");
        return null;
    }

    @Override
    public final void o(boolean z, float f) {
        rob robVar = (rob) this.b;
        ThemeActivity themeActivity = robVar.r;
        byte b = robVar.d;
        themeActivity.D0(Math.round(((robVar.e - b) * f) + b));
    }

    @Override
    public final int o1() {
        int i;
        bl0 e = e();
        bl0 i2 = i();
        if (e != null) {
            i = e.o1();
        } else {
            i = 0;
        }
        if (i2 != null) {
            return vm2.f(((ula) this.b).a, i2.o1(), i);
        }
        return i;
    }

    @Override
    public final void onStateChanged(boolean z, int i) {
        x59 x59Var = (x59) this.b;
        if (z && x59Var.n.S() >= 0) {
            x59Var.x = true;
        }
        mf8 mf8Var = x59Var.f;
        v59 v59Var = x59Var.y;
        mf8Var.a(z, true);
        hl.r(v59Var);
        if (z) {
            hl.d3(v59Var, 16L);
        }
    }

    @Override
    public final boolean onSurfaceDestroyed(SurfaceTexture surfaceTexture) {
        return false;
    }

    @Override
    public final void p(float f) {
        Point point = hl.q;
        if (point.x > point.y) {
            ((ozb) this.b).w0.movePreviewFragment(f);
        }
    }

    public void q() {
        View view = (View) this.b;
        if (view != null) {
            ((InputMethodManager) view.getContext().getSystemService("input_method")).hideSoftInputFromWindow(view.getWindowToken(), 0);
        }
    }

    @Override
    public final void r(ImageReceiver imageReceiver) {
        ((pk9) this.b).s0(true);
    }

    public final boolean s() {
        q6d q6dVar = ((d6d) this.b).d;
        if (q6dVar != null && q6dVar.g()) {
            return true;
        }
        return false;
    }

    @Override
    public final void setParameters(Bundle bundle) {
        ((MediaCodec) this.b).setParameters(bundle);
    }

    public void t() {
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
                view.post(new vc(view, (byte) 7));
            }
        }
    }

    @Override
    public final void w(ws2 ws2Var) {
        b8d b8dVar = (b8d) this.b;
        ReentrantLock reentrantLock = b8dVar.o;
        reentrantLock.lock();
        try {
            b8dVar.m = ws2Var;
            b8dVar.j();
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public final int x0() {
        int i;
        ula ulaVar = (ula) this.b;
        bl0 e = e();
        if (e != null && ulaVar.d.f()) {
            i = e.x0();
        } else {
            i = 0;
        }
        bl0 i2 = i();
        if (i2 != null) {
            return vm2.f(ulaVar.a, i2.x0(), i);
        }
        return i;
    }

    @Override
    public final int x1() {
        int i;
        bl0 e = e();
        bl0 i2 = i();
        if (e != null) {
            i = e.x1();
        } else {
            i = 0;
        }
        if (i2 != null) {
            return vm2.f(((ula) this.b).a, i2.x1(), i);
        }
        return i;
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        ((yg9) this.b).w0(i, i2, z);
    }

    @Override
    public final void y0() {
        try {
            Intent intent = new Intent("android.intent.action.PICK");
            intent.setType("image/*");
            ((Activity) ((am2) this.b).c).startActivityForResult(intent, 11);
        } catch (Exception e) {
            cc4.g(e, true);
        }
    }

    @Override
    public final void z0(int i) {
        b8d b8dVar = (b8d) this.b;
        ReentrantLock reentrantLock = b8dVar.o;
        reentrantLock.lock();
        try {
            if (b8dVar.n) {
                b8dVar.n = false;
                b8dVar.b.z0(i);
                b8dVar.m = null;
                b8dVar.l = null;
            } else {
                b8dVar.n = true;
                b8dVar.d.onConnectionSuspended(i);
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    @Override
    public final void onRenderedFirstFrame() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void flush() {
    }

    @Override
    public final void shutdown() {
    }

    @Override
    public final void start() {
    }

    @Override
    public final void u() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void onRenderedFirstFrame(uj ujVar) {
    }

    @Override
    public final void onSeekFinished(uj ujVar) {
    }

    @Override
    public final void onSeekStarted(uj ujVar) {
    }

    @Override
    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public pq8(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public pq8(rhc rhcVar, qhc qhcVar) {
        this(rhcVar, qhcVar, c23.b);
        this.a = (byte) 24;
        rhcVar.getClass();
    }

    public pq8(rhc rhcVar, qhc qhcVar, e23 e23Var) {
        this.a = (byte) 24;
        rhcVar.getClass();
        qhcVar.getClass();
        e23Var.getClass();
        this.b = new ko9(rhcVar, qhcVar, e23Var);
    }

    public pq8(jp4 jp4Var) {
        this(jp4Var.f(), jp4Var.c(), jp4Var.d());
        this.a = (byte) 24;
        jp4Var.getClass();
    }

    @Override
    public final float get() {
        return ((k3b) this.b).G;
    }

    @Override
    public final void onError(kfc kfcVar, Exception exc) {
    }

    @Override
    public final void z(int i, Drawable drawable) {
    }

    @Override
    public final void onVideoSizeChanged(int i, int i2, int i3, float f) {
    }

    @Override
    public final void v(ImageReceiver imageReceiver, boolean z, boolean z2, boolean z3) {
    }
}
