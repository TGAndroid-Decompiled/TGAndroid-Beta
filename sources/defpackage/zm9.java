package defpackage;

import android.content.ComponentName;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.os.Process;
import android.os.SystemClock;
import android.provider.Settings;
import android.util.Log;
import android.util.LongSparseArray;
import android.view.View;
import android.view.Window;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.ArrayList;
import java.util.concurrent.TimeoutException;
import org.telegram.messenger.MediaController;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.LaunchActivity;
public final class zm9 implements hj, y27, qv0, ty9, tka, bf7, i27, bv9, jt1, v78, li1, i89, ep2, h23, a43, v30, rv9, je8 {
    public static zm9 c;
    public static final an9 d = new an9(0, 0, 0, false, false);
    public static final Object e = new Object();
    public static volatile zm9 f;
    public final byte a;
    public Object b;

    public zm9(byte b) {
        this.a = b;
        switch (b) {
            case 10:
                this.b = new LongSparseArray();
                return;
            case 27:
                this.b = new ConcurrentHashMap(16);
                return;
            default:
                this.b = new lh2[pj.values().length];
                return;
        }
    }

    public static synchronized zm9 I0() {
        zm9 zm9Var;
        synchronized (zm9.class) {
            zm9Var = c;
            if (zm9Var == null) {
                zm9Var = new zm9((byte) 0, false);
                c = zm9Var;
            }
        }
        return zm9Var;
    }

    public static zm9 J0(Context context) {
        zm9 zm9Var;
        synchronized (e) {
            if (f == null) {
                Context applicationContext = context.getApplicationContext();
                zm9 zm9Var2 = new zm9((byte) 1, false);
                ym4 ym4Var = new ym4((byte) 8, false);
                ym4Var.b = applicationContext;
                ym4Var.c = applicationContext.getContentResolver();
                zm9Var2.b = ym4Var;
                f = zm9Var2;
            }
            zm9Var = f;
        }
        return zm9Var;
    }

    @Override
    public final void A(boolean z) {
        j81 j81Var = (j81) this.b;
        j81Var.finishFragment();
        if (j81.f0(j81Var) != null && j81.g0(j81Var).getFragmentStack().size() >= 2) {
            e eVar = (e) j81.i0(j81Var).getFragmentStack().get(j81.h0(j81Var).getFragmentStack().size() - 2);
            if (eVar instanceof zu1) {
                ((zu1) eVar).k6(j81Var.Q, j81Var.R + 86400, z);
                return;
            }
            return;
        }
        zu1 zu1Var = j81Var.O;
        if (zu1Var != null) {
            zu1Var.k6(j81Var.Q, j81Var.R + 86400, z);
        }
    }

    @Override
    public final boolean A0() {
        return true;
    }

    @Override
    public final void B(Object obj) {
        w03 w03Var = (w03) obj;
        w03Var.getClass();
        va1 va1Var = (va1) this.b;
        if (va1Var.r() instanceof sm7) {
            va1Var.resumeWith(new ge9(w03Var));
        }
    }

    @Override
    public final boolean B0(int i, View view) {
        return false;
    }

    @Override
    public final void C(f27 f27Var, j27 j27Var) {
        ((fd1) this.b).f.removeCallbacksAndMessages(f27Var);
    }

    @Override
    public final void C0(long j, int i, long j2) {
        lh2 lh2Var = ((FfmpegAudioRenderer) this.b).K;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new m30(lh2Var, i, j, j2, (byte) 0));
        }
    }

    @Override
    public final boolean C1(int i) {
        if (i == ((gx9) this.b).e0) {
            return true;
        }
        return false;
    }

    @Override
    public final zh6 D0() {
        return null;
    }

    @Override
    public final boolean E() {
        iv3 iv3Var = (iv3) this.b;
        if (iv3Var.N1 == iv3Var.l1 && iv3Var.x1 && "inapp".equals(uc7.s1(iv3Var.a).k4.Q0.f)) {
            return false;
        }
        return true;
    }

    @Override
    public final boolean E0() {
        return false;
    }

    @Override
    public final boolean G(boolean z, float f2, cz9 cz9Var) {
        return false;
    }

    @Override
    public final boolean H() {
        return false;
    }

    public final LongSparseArray H0(long j, long j2) {
        LongSparseArray longSparseArray = (LongSparseArray) ((LongSparseArray) this.b).get(j);
        if (longSparseArray == null) {
            return null;
        }
        return (LongSparseArray) longSparseArray.get(j2);
    }

    @Override
    public final void I(long j) {
        ((io2) this.b).presentFragment(zu1.ha(j));
    }

    @Override
    public final void J(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public final View K(LaunchActivity launchActivity) {
        return null;
    }

    public final boolean K0(ry6 ry6Var) {
        ym4 ym4Var = (ym4) this.b;
        uy6 uy6Var = ry6Var.a;
        ym4Var.getClass();
        int i = uy6Var.c;
        String str = uy6Var.a;
        try {
            int i2 = Build.VERSION.SDK_INT;
            if (i2 != 23 || !str.equals("android.media.session.MediaController")) {
                ApplicationInfo applicationInfo = ((Context) ym4Var.b).getPackageManager().getApplicationInfo(str, 0);
                if (applicationInfo != null) {
                    if (i2 < 28) {
                        i = applicationInfo.uid;
                    }
                    if (i != 1000 && i != Process.myUid() && !ym4Var.m0(uy6Var, "android.permission.STATUS_BAR_SERVICE") && !ym4Var.m0(uy6Var, "android.permission.MEDIA_CONTENT_CONTROL")) {
                        String string = Settings.Secure.getString((ContentResolver) ym4Var.c, "enabled_notification_listeners");
                        if (string != null) {
                            for (String str2 : string.split(":")) {
                                ComponentName unflattenFromString = ComponentName.unflattenFromString(str2);
                                if (unflattenFromString != null && unflattenFromString.getPackageName().equals(str)) {
                                    return true;
                                }
                            }
                        }
                    } else {
                        return true;
                    }
                }
                return false;
            }
            return true;
        } catch (PackageManager.NameNotFoundException unused) {
            efd.b("MediaSessionManager", "Package " + str + " doesn't exist");
            return false;
        }
    }

    @Override
    public final void M(qf5 qf5Var) {
        lh2 lh2Var = ((FfmpegAudioRenderer) this.b).K;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new n30(lh2Var, qf5Var, (byte) 1));
        }
    }

    public final void M0(oy8 oy8Var, Thread thread, Throwable th) {
        yy2 yy2Var = (yy2) this.b;
        synchronized (yy2Var) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            dee.a();
            try {
                try {
                    ucc.a(((i03) yy2Var.e.b).b(new wy2(yy2Var, System.currentTimeMillis(), th, thread, oy8Var)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e2) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e2);
            }
        }
    }

    public final void N0(long j, long j2, long j3, Object obj) {
        LongSparseArray longSparseArray = (LongSparseArray) this.b;
        LongSparseArray longSparseArray2 = (LongSparseArray) longSparseArray.get(j);
        if (longSparseArray2 == null) {
            longSparseArray2 = new LongSparseArray();
            longSparseArray.put(j, longSparseArray2);
        }
        LongSparseArray longSparseArray3 = (LongSparseArray) longSparseArray2.get(j2);
        if (longSparseArray3 == null) {
            longSparseArray3 = new LongSparseArray();
            longSparseArray2.put(j2, longSparseArray3);
        }
        longSparseArray3.get(j3);
        longSparseArray3.put(j3, obj);
    }

    @Override
    public final void O(String str) {
        ((zu1) ((bn0) this.b).c).ta(str, false);
    }

    public final Object O0(long j, long j2, long j3) {
        LongSparseArray longSparseArray;
        LongSparseArray longSparseArray2 = (LongSparseArray) ((LongSparseArray) this.b).get(j);
        if (longSparseArray2 == null || (longSparseArray = (LongSparseArray) longSparseArray2.get(j2)) == null) {
            return null;
        }
        Object obj = longSparseArray.get(j3);
        longSparseArray.remove(j3);
        return obj;
    }

    @Override
    public final View P() {
        return ((iv3) this.b).N1;
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final int S() {
        return 0;
    }

    @Override
    public final int U() {
        return ((iv3) this.b).O1;
    }

    @Override
    public final void W() {
        boolean z;
        io2 io2Var = (io2) this.b;
        fm0 fm0Var = io2Var.a;
        fp2 fp2Var = io2Var.w;
        if (fp2Var.n && fp2Var.l == 0) {
            z = true;
        } else {
            z = false;
        }
        fm0Var.a(z, true);
        io2Var.d.g3.O(true);
    }

    @Override
    public final boolean X() {
        return false;
    }

    @Override
    public final void X1(ArrayList arrayList) {
        boolean z;
        gx9 gx9Var = (gx9) this.b;
        for (int i = 0; i < arrayList.size(); i++) {
            gx9Var.K.add(((qv9) arrayList.get(i)).a);
        }
        dj3 dj3Var = gx9Var.V;
        if (dj3Var != null) {
            if (gx9Var.E0 > 0) {
                z = true;
            } else {
                z = false;
            }
            dj3Var.d(z, false);
        }
        gx9Var.f();
    }

    @Override
    public final boolean Y() {
        return false;
    }

    @Override
    public final void Z() {
        ((FfmpegAudioRenderer) this.b).u();
    }

    @Override
    public final zh6 Z0() {
        return null;
    }

    @Override
    public final dg8 a0() {
        return null;
    }

    @Override
    public final void b() {
        hyc hycVar = ((iv3) this.b).m1;
        if (hycVar != null && hycVar.x) {
            hycVar.a.f0();
            hycVar.n();
            hycVar.g0.d(true, true);
        }
    }

    @Override
    public final void b0() {
        ((q33) this.b).e.invalidate();
    }

    @Override
    public final void c(int i, boolean z) {
        tg1 tg1Var = ((rg1) this.b).f;
        tg1Var.E = i;
        tg1Var.d(true);
    }

    @Override
    public final void close() {
        ((io2) this.b).finishFragment();
    }

    @Override
    public final void d(int i) {
        lh2 lh2Var = ((FfmpegAudioRenderer) this.b).K;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new zd(lh2Var, i, (byte) 4));
        }
    }

    @Override
    public final boolean d0() {
        return false;
    }

    @Override
    public final float e0() {
        return c00.d(9.66f, eg0.f(((z61) this.b).Q), 0);
    }

    @Override
    public final void f(f27 f27Var, boolean z) {
        switch (this.a) {
            case 3:
                if (f27Var instanceof zdb) {
                    ((zdb) f27Var).z.k().c(false);
                }
                y27 y27Var = ((c9) this.b).e;
                if (y27Var != null) {
                    y27Var.f(f27Var, z);
                    return;
                }
                return;
            default:
                ((cp) this.b).g(f27Var);
                return;
        }
    }

    @Override
    public final void f0(boolean z) {
        ((vnc) this.b).setEditPillHidden(z);
    }

    @Override
    public final void g0() {
        iv3 iv3Var = (iv3) this.b;
        iv3Var.M1 = null;
        iv3Var.F0();
    }

    @Override
    public final CharSequence getContentDescription() {
        j20 j20Var = (j20) this.b;
        return ob6.a0("AccDescrPlayerDuration", null, 2131754801, ob6.G(j20Var.w2 / 60, "Minutes", new Object[0]) + ' ' + ob6.G(j20Var.w2 % 60, "Seconds", new Object[0]), ob6.G(j20Var.x2 / 60, "Minutes", new Object[0]) + ' ' + ob6.G(j20Var.x2 % 60, "Seconds", new Object[0]));
    }

    @Override
    public final long getDuration() {
        return 0L;
    }

    @Override
    public final void h(boolean z) {
        lh2 lh2Var = ((FfmpegAudioRenderer) this.b).K;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new xac((byte) 3, lh2Var, z));
        }
    }

    @Override
    public final void h0(Exception exc) {
        efd.d("DecoderAudioRenderer", "Audio sink error", exc);
        lh2 lh2Var = ((FfmpegAudioRenderer) this.b).K;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new k30(lh2Var, exc, (byte) 1));
        }
    }

    @Override
    public final boolean i() {
        return false;
    }

    @Override
    public final int i0() {
        return 0;
    }

    @Override
    public final int j0() {
        return ((z61) this.b).R;
    }

    @Override
    public final long k() {
        return 0L;
    }

    @Override
    public final void k0(f27 f27Var, j27 j27Var) {
        fd1 fd1Var = (fd1) this.b;
        Handler handler = fd1Var.f;
        ed1 ed1Var = null;
        handler.removeCallbacksAndMessages(null);
        ArrayList arrayList = fd1Var.n;
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                if (f27Var == ((ed1) arrayList.get(i)).b) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i == -1) {
            return;
        }
        int i2 = i + 1;
        if (i2 < arrayList.size()) {
            ed1Var = (ed1) arrayList.get(i2);
        }
        handler.postAtTime(new dd1(this, ed1Var, j27Var, f27Var), f27Var, SystemClock.uptimeMillis() + 200);
    }

    @Override
    public final void l0() {
        ((FfmpegAudioRenderer) this.b).b0 = true;
    }

    @Override
    public final void m0(RectF rectF) {
        ((vnc) this.b).l(rectF);
    }

    @Override
    public final void n(long j) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.b;
        ffmpegAudioRenderer.i0 = true;
        lh2 lh2Var = ffmpegAudioRenderer.K;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new kt(lh2Var, j, (byte) 2));
        }
    }

    @Override
    public final void n0(View view, boolean z) {
        if (z == ((ChatAttachAlertPhotoLayout) this.b).L && (view instanceof d88)) {
            d88 d88Var = (d88) view;
            d88Var.y.c(d88Var);
        }
    }

    @Override
    public final void o(boolean z, float f2) {
        if (z) {
            MediaController.z().k0(MediaController.z().v0, f2);
        }
        r47 r47Var = MediaController.z().v0;
        if (r47Var != null && r47Var.I3()) {
            ((j20) this.b).X0(r47Var, false);
        }
    }

    @Override
    public final void onResult(Object obj) {
        d13 d13Var = (d13) obj;
        d13Var.getClass();
        va1 va1Var = (va1) this.b;
        if (va1Var.r() instanceof sm7) {
            va1Var.resumeWith(d13Var);
        }
    }

    @Override
    public final void p(int i) {
        boolean z;
        gx9 gx9Var = (gx9) this.b;
        gx9Var.E0--;
        gx9Var.f0 = i;
        if (gx9Var.g0 != i) {
            gx9Var.s.clear();
        }
        if (gx9Var.h0 != i) {
            gx9Var.J.clear();
        }
        gx9Var.O = true;
        dj3 dj3Var = gx9Var.V;
        if (dj3Var != null) {
            if (gx9Var.E0 > 0) {
                z = true;
            } else {
                z = false;
            }
            dj3Var.d(z, true);
        }
        gx9Var.f();
        dj3 dj3Var2 = gx9Var.V;
        if (dj3Var2 != null) {
            dj3Var2.c();
        }
    }

    @Override
    public final void p0() {
        ((iv3) this.b).G0();
    }

    @Override
    public final int q() {
        return 0;
    }

    @Override
    public final int q0() {
        return ((iv3) this.b).P1;
    }

    @Override
    public final void r(boolean z) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.b;
        chatAttachAlertPhotoLayout.M = z ? (byte) 1 : (byte) 0;
        chatAttachAlertPhotoLayout.F.f1(true);
    }

    @Override
    public final float r0() {
        return 0.0f;
    }

    @Override
    public final boolean s0(int i) {
        no6 M = ((ChatAttachAlertPhotoLayout) this.b).H.M(i);
        if (M != null && ChatAttachAlertPhotoLayout.t1.containsKey(Integer.valueOf(M.C))) {
            return true;
        }
        return false;
    }

    @Override
    public final void t(boolean z) {
        fm0 fm0Var = ((z61) this.b).U;
        if (fm0Var != null && fm0Var.f != z) {
            fm0Var.a(z, true);
        }
    }

    @Override
    public final void u(qf5 qf5Var) {
        lh2 lh2Var = ((FfmpegAudioRenderer) this.b).K;
        Handler handler = (Handler) lh2Var.b;
        if (handler != null) {
            handler.post(new n30(lh2Var, qf5Var, (byte) 0));
        }
    }

    @Override
    public final boolean v() {
        return false;
    }

    @Override
    public final boolean w(int i) {
        if (((ChatAttachAlertPhotoLayout) this.b).H.d(i) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final View x0() {
        return (vnc) this.b;
    }

    @Override
    public final void y(int i, int i2, boolean z) {
        switch (this.a) {
            case 2:
                b1 b1Var = (b1) this.b;
                b1Var.n1(i, i2, z);
                b1Var.dismiss();
                return;
            default:
                hl.d3(new zd(this, i, (byte) 6), 50L);
                return;
        }
    }

    @Override
    public final void y0() {
        try {
            Intent intent = new Intent();
            intent.setType("video/*");
            intent.setAction("android.intent.action.GET_CONTENT");
            intent.putExtra("android.intent.extra.sizeLimit", 2097152000L);
            Intent intent2 = new Intent("android.intent.action.PICK");
            intent2.setType("image/*");
            Intent createChooser = Intent.createChooser(intent2, null);
            createChooser.putExtra("android.intent.extra.INITIAL_INTENTS", new Intent[]{intent});
            ((zu1) this.b).startActivityForResult(createChooser, 1);
        } catch (Exception e2) {
            cc4.g(e2, true);
        }
    }

    @Override
    public final void z() {
        ((FfmpegAudioRenderer) this.b).h0 = true;
    }

    @Override
    public final boolean z0(f27 f27Var) {
        switch (this.a) {
            case 3:
                c9 c9Var = (c9) this.b;
                if (f27Var != c9Var.c) {
                    j27 j27Var = ((zdb) f27Var).A;
                    y27 y27Var = c9Var.e;
                    if (y27Var != null) {
                        return y27Var.z0(f27Var);
                    }
                }
                return false;
            default:
                Window.Callback callback = ((cp) this.b).f.getCallback();
                if (callback != null) {
                    callback.onMenuOpened(108, f27Var);
                    return true;
                }
                return true;
        }
    }

    @Override
    public final void D() {
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void T() {
    }

    @Override
    public final void e() {
    }

    @Override
    public final void j() {
    }

    @Override
    public final void w0() {
    }

    @Override
    public final void x() {
    }

    @Override
    public final void F0(boolean z) {
    }

    @Override
    public final void G0(int i) {
    }

    @Override
    public final void L(View view) {
    }

    @Override
    public final void N(View view) {
    }

    @Override
    public final void R(ne8 ne8Var) {
    }

    @Override
    public final void V(float f2) {
    }

    @Override
    public final void a(float f2) {
    }

    @Override
    public final void c0(int i) {
    }

    @Override
    public final void g(long j) {
    }

    @Override
    public final void l(View view) {
    }

    @Override
    public final void m(ArrayList arrayList) {
    }

    @Override
    public final void o0(View view) {
    }

    @Override
    public final void t0(boolean z) {
    }

    @Override
    public final void F(boolean z, boolean z2) {
    }

    @Override
    public final void s(SurfaceTexture surfaceTexture, Bitmap bitmap) {
    }

    @Override
    public final void u0(int i, ArrayList arrayList) {
    }

    public zm9(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public zm9(al5 al5Var) {
        this.a = (byte) 9;
        xve.h(al5Var);
        this.b = al5Var;
    }

    public zm9(byte b, boolean z) {
        this.a = b;
    }

    @Override
    public final void v0(Canvas canvas, int i, int i2) {
    }
}
