package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.SurfaceTexture;
import android.os.Build;
import android.os.Handler;
import android.text.Editable;
import android.text.TextUtils;
import android.text.style.CharacterStyle;
import android.util.Base64;
import android.util.Log;
import android.view.TextureView;
import android.view.View;
import androidx.media3.decoder.ffmpeg.FfmpegAudioRenderer;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_keyboard;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.m;
import org.telegram.ui.o;
public final class i4d implements ca1, r56, av2, ka8, co7, ir9, v02, i8b, bc1, bb2, ia8, v49, lo2, o13, i33, u30, yr9, sa8 {
    public static i4d b;
    public static final cs4 c = new cs4((byte) 1);
    public static final tef d = new tef((byte) 1);
    public final Object a;

    public i4d(byte b2) {
        dgf dgfVar;
        w17 w17Var;
        switch (b2) {
            case 2:
                try {
                    dgfVar = (dgf) Class.forName("com.google.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused) {
                    dgfVar = d;
                }
                agf agfVar = new agf(tef.b, dgfVar);
                Charset charset = eff.a;
                this.a = agfVar;
                return;
            case 7:
                this.a = new AtomicInteger(0);
                return;
            case 9:
                this.a = new CopyOnWriteArrayList();
                return;
            case 27:
                this.a = new ConcurrentHashMap(16);
                return;
            default:
                ft8 ft8Var = ft8.c;
                try {
                    w17Var = (w17) Class.forName("androidx.datastore.preferences.protobuf.DescriptorMessageInfoFactory").getDeclaredMethod("getInstance", null).invoke(null, null);
                } catch (Exception unused2) {
                    w17Var = c;
                }
                w17[] w17VarArr = {cs4.b, w17Var};
                ?? obj = new Object();
                obj.a = w17VarArr;
                Charset charset2 = mp5.a;
                this.a = obj;
                return;
        }
    }

    public static synchronized i4d N2(Context context) {
        i4d P2;
        synchronized (i4d.class) {
            P2 = P2(context.getApplicationContext());
        }
        return P2;
    }

    public static synchronized i4d P2(Context context) {
        i4d i4dVar;
        synchronized (i4d.class) {
            i4dVar = b;
            if (i4dVar == null) {
                i4dVar = new i4d(context);
                b = i4dVar;
            }
        }
        return i4dVar;
    }

    @Override
    public final boolean A1(gb2 gb2Var, int i) {
        return false;
    }

    @Override
    public final void A2(long j, int i, long j2) {
        tg2 tg2Var = ((FfmpegAudioRenderer) this.a).K;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new l30(tg2Var, i, j, j2, (byte) 0));
        }
    }

    @Override
    public final boolean B2(gb2 gb2Var, k27 k27Var) {
        return false;
    }

    @Override
    public final void C(int i, int i2) {
        ((w39) this.a).j(i, i2);
    }

    @Override
    public final View C0() {
        return ((ou3) this.a).N1;
    }

    @Override
    public final void D(pd5 pd5Var) {
        tg2 tg2Var = ((FfmpegAudioRenderer) this.a).K;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new m30(tg2Var, pd5Var, (byte) 0));
        }
    }

    @Override
    public final boolean D0(gb2 gb2Var, TLRPC.PollAnswer pollAnswer) {
        return false;
    }

    @Override
    public final void D2(Object obj) {
        aj0 aj0Var = (aj0) this.a;
        if (((Boolean) obj).booleanValue()) {
            if (aj0Var.S()) {
                aj0Var.X(aj0Var.q(2131689614));
            }
            lj0 lj0Var = aj0Var.m0;
            if (!lj0Var.l) {
                Log.w("BiometricFragment", "Failure not sent to client. Client is not awaiting a result.");
            } else {
                Executor executor = lj0Var.b;
                if (executor == null) {
                    executor = new yi0((byte) 1);
                }
                executor.execute(new ri0(aj0Var, (byte) 0));
            }
            lj0 lj0Var2 = aj0Var.m0;
            hh7 hh7Var = lj0Var2.s;
            if (hh7Var == null) {
                hh7Var = new hh7();
                lj0Var2.s = hh7Var;
            }
            lj0.f(hh7Var, Boolean.FALSE);
        }
    }

    @Override
    public final void E1() {
        ((FfmpegAudioRenderer) this.a).b0 = true;
    }

    @Override
    public final gib E2() {
        return null;
    }

    @Override
    public final boolean F0(gb2 gb2Var) {
        return false;
    }

    @Override
    public final boolean F2() {
        return false;
    }

    @Override
    public final boolean G(gb2 gb2Var, TLRPC.TodoItem todoItem) {
        return false;
    }

    @Override
    public final boolean G0() {
        return false;
    }

    @Override
    public final void H(String str) {
        u8 u8Var = (u8) this.a;
        u8Var.finishFragment(false);
        h45 h45Var = u8Var.y;
        LaunchActivity launchActivity = (LaunchActivity) h45Var.b;
        String str2 = LaunchActivity.C1;
        hd hdVar = new hd(3, null, launchActivity);
        hdVar.j0 = false;
        hdVar.show();
        byte[] decode = Base64.decode(str.substring(17), 8);
        TLRPC.TL_auth_acceptLoginToken tL_auth_acceptLoginToken = new TLRPC.TL_auth_acceptLoginToken();
        tL_auth_acceptLoginToken.token = decode;
        ConnectionsManager.getInstance(launchActivity.P).sendRequest(tL_auth_acceptLoginToken, new rv3(hdVar, (u8) h45Var.c, (byte) 14));
    }

    @Override
    public final void H1(View view, boolean z) {
        if (z == ((ChatAttachAlertPhotoLayout) this.a).L && (view instanceof o48)) {
            o48 o48Var = (o48) view;
            o48Var.y.c(o48Var);
        }
    }

    public final void I2(hj0 hj0Var, gj0 gj0Var) {
        Object obj = this.a;
        ho4 ho4Var = (ho4) obj;
        if (ho4Var == null) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Client fragment manager was null.");
        } else if (ho4Var.P()) {
            Log.e("BiometricPromptCompat", "Unable to start authentication. Called after onSaveInstanceState().");
        } else {
            ho4 ho4Var2 = (ho4) obj;
            aj0 aj0Var = (aj0) ho4Var2.D("androidx.biometric.BiometricFragment");
            if (aj0Var == null) {
                aj0Var = new aj0();
                id0 id0Var = new id0(ho4Var2);
                id0Var.f(0, aj0Var, "androidx.biometric.BiometricFragment");
                id0Var.e(true, true);
                ho4Var2.A(true);
                ho4Var2.E();
            }
            en4 k = aj0Var.k();
            if (k == null) {
                Log.e("BiometricFragment", "Not launching prompt. Client activity was null.");
                return;
            }
            aj0Var.m0.d = hj0Var;
            int a = wmd.a(hj0Var, gj0Var);
            if (Build.VERSION.SDK_INT < 30 && a == 15 && gj0Var == null) {
                aj0Var.m0.e = rae.a();
            } else {
                aj0Var.m0.e = gj0Var;
            }
            boolean R = aj0Var.R();
            lj0 lj0Var = aj0Var.m0;
            if (R) {
                lj0Var.i = aj0Var.q(2131689577);
            } else {
                lj0Var.i = null;
            }
            if (aj0Var.R() && new ej0(new dj0(k)).a(255) != 0) {
                aj0Var.m0.l = true;
                aj0Var.T();
            } else if (aj0Var.m0.n) {
                aj0Var.l0.postDelayed(new zi0(aj0Var), 600L);
            } else {
                aj0Var.Y();
            }
        }
    }

    @Override
    public final boolean J0(long j) {
        return false;
    }

    @Override
    public final void J1(RectF rectF) {
        ((jjc) this.a).l(rectF);
    }

    public final void J2(dv8 dv8Var, Thread thread, Throwable th) {
        dy2 dy2Var = (dy2) this.a;
        synchronized (dy2Var) {
            String str = "Handling uncaught exception \"" + th + "\" from thread " + thread.getName();
            if (Log.isLoggable("FirebaseCrashlytics", 3)) {
                Log.d("FirebaseCrashlytics", str, null);
            }
            n9e.a();
            try {
                try {
                    u8c.a(((pz2) dy2Var.e.b).b(new by2(dy2Var, System.currentTimeMillis(), th, thread, dv8Var)));
                } catch (TimeoutException unused) {
                    Log.e("FirebaseCrashlytics", "Cannot send reports. Timed out while fetching settings.", null);
                }
            } catch (Exception e) {
                Log.e("FirebaseCrashlytics", "Error handling uncaught exception", e);
            }
        }
    }

    @Override
    public final boolean K(int i) {
        if (((ChatAttachAlertPhotoLayout) this.a).H.d(i) == 0) {
            return true;
        }
        return false;
    }

    @Override
    public final void K0() {
        ((y23) this.a).e.invalidate();
    }

    @Override
    public final void K1(gb2 gb2Var, TLRPC.WebPage webPage, String str, boolean z) {
        d01.t(gb2Var.getContext(), str);
    }

    public final void K2() {
        ((fx0) this.a).p0 = false;
    }

    @Override
    public final void L() {
        ((FfmpegAudioRenderer) this.a).h0 = true;
    }

    public final void L2(cl1 cl1Var) {
        ((fx0) this.a).I0 = cl1Var;
    }

    @Override
    public final void M(Object obj) {
        d03 d03Var = (d03) obj;
        d03Var.getClass();
        na1 na1Var = (na1) this.a;
        if (na1Var.r() instanceof tj7) {
            na1Var.resumeWith(new sa9(d03Var));
        }
    }

    public final void M2() {
        ((fx0) this.a).show();
    }

    @Override
    public final boolean N1() {
        return false;
    }

    @Override
    public final boolean O() {
        return false;
    }

    @Override
    public final vf6 O0() {
        return null;
    }

    public final synchronized void O2() {
        d1b d1bVar = (d1b) this.a;
        ReentrantLock reentrantLock = d1bVar.a;
        reentrantLock.lock();
        d1bVar.b.edit().clear().apply();
        reentrantLock.unlock();
    }

    @Override
    public final void P1() {
        ((ou3) this.a).F0();
    }

    @Override
    public final boolean Q() {
        return false;
    }

    @Override
    public final int Q0() {
        return ((ou3) this.a).O1;
    }

    @Override
    public final int R() {
        return 0;
    }

    @Override
    public final int S1() {
        return ((ou3) this.a).P1;
    }

    @Override
    public final boolean T0(gb2 gb2Var, TLRPC.TodoItem todoItem, boolean z) {
        return false;
    }

    @Override
    public final boolean T1(gm gmVar) {
        return false;
    }

    @Override
    public final boolean U() {
        ou3 ou3Var = (ou3) this.a;
        if (ou3Var.N1 == ou3Var.l1 && ou3Var.x1 && "inapp".equals(na7.q1(ou3Var.a).k4.I0.f)) {
            return false;
        }
        return true;
    }

    @Override
    public final void U0() {
        boolean z;
        pn2 pn2Var = (pn2) this.a;
        fm0 fm0Var = pn2Var.a;
        mo2 mo2Var = pn2Var.w;
        if (mo2Var.n && mo2Var.l == 0) {
            z = true;
        } else {
            z = false;
        }
        fm0Var.a(z, true);
        pn2Var.d.g3.O(true);
    }

    @Override
    public final boolean U1(int i) {
        if (i == ((mt9) this.a).e0) {
            return true;
        }
        return false;
    }

    @Override
    public final int V(gb2 gb2Var) {
        return 0;
    }

    @Override
    public final boolean V1() {
        return false;
    }

    @Override
    public final boolean W0(String str, u91 u91Var) {
        return false;
    }

    @Override
    public final vu1 X() {
        return null;
    }

    @Override
    public final String Z0() {
        return null;
    }

    @Override
    public final ma8 Z1() {
        return null;
    }

    @Override
    public final void a(int i, boolean z) {
        lo0 lo0Var = ((eo0) this.a).d;
        lo0Var.e0 = i;
        lo0Var.I0(true);
    }

    @Override
    public final boolean a0(boolean z, float f, iv9 iv9Var) {
        return false;
    }

    @Override
    public final boolean a1() {
        return false;
    }

    @Override
    public final float a2() {
        return 0.0f;
    }

    @Override
    public final boolean b() {
        return false;
    }

    @Override
    public final boolean b0() {
        return false;
    }

    @Override
    public final String b1(gb2 gb2Var) {
        return null;
    }

    @Override
    public final boolean c2(long j) {
        return false;
    }

    @Override
    public final void close() {
        ((pn2) this.a).finishFragment();
    }

    @Override
    public final void d(int i) {
        tg2 tg2Var = ((FfmpegAudioRenderer) this.a).K;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new eg(tg2Var, i, (byte) 4));
        }
    }

    @Override
    public final boolean d1() {
        return false;
    }

    @Override
    public final void e() {
        stc stcVar = ((ou3) this.a).m1;
        if (stcVar != null && stcVar.x) {
            stcVar.a.f0();
            stcVar.n();
            stcVar.g0.d(true, true);
        }
    }

    @Override
    public final boolean e0() {
        return false;
    }

    @Override
    public final void e1(long j, int i, g28 g28Var) {
        b81 b81Var = (b81) this.a;
        if (b81Var.b == null) {
            g28Var.run();
        }
        b81Var.b.post(g28Var);
    }

    @Override
    public final CharacterStyle f0(gb2 gb2Var) {
        return null;
    }

    @Override
    public final void f1() {
        ((FfmpegAudioRenderer) this.a).u();
    }

    @Override
    public final void f2(int i, int i2) {
        ((w39) this.a).n(i, i2, null);
    }

    @Override
    public final boolean g0() {
        return false;
    }

    @Override
    public final boolean g2(k27 k27Var) {
        return true;
    }

    @Override
    public final long getDuration() {
        return 0L;
    }

    @Override
    public final void h(boolean z) {
        tg2 tg2Var = ((FfmpegAudioRenderer) this.a).K;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new x6c((byte) 3, tg2Var, z));
        }
    }

    @Override
    public final void h0(long j) {
        ((pn2) this.a).presentFragment(mu1.W9(j));
    }

    @Override
    public final boolean h1(gb2 gb2Var, TL_iv.PageBlock pageBlock) {
        return false;
    }

    @Override
    public final boolean i0() {
        return false;
    }

    @Override
    public final boolean j() {
        return false;
    }

    @Override
    public final void j1(int i, int i2) {
        ((w39) this.a).q(i, i2);
    }

    @Override
    public final TextureView k0() {
        return null;
    }

    @Override
    public final oc8 k1() {
        return null;
    }

    @Override
    public final boolean k2(gb2 gb2Var, TLRPC.User user) {
        return false;
    }

    @Override
    public final boolean l() {
        return true;
    }

    @Override
    public final boolean l2(gb2 gb2Var) {
        return false;
    }

    @Override
    public final long m() {
        return 0L;
    }

    @Override
    public final void m2(ArrayList arrayList) {
        boolean z;
        mt9 mt9Var = (mt9) this.a;
        for (int i = 0; i < arrayList.size(); i++) {
            mt9Var.K.add(((xr9) arrayList.get(i)).a);
        }
        ji3 ji3Var = mt9Var.V;
        if (ji3Var != null) {
            if (mt9Var.E0 > 0) {
                z = true;
            } else {
                z = false;
            }
            ji3Var.d(z, false);
        }
        mt9Var.f();
    }

    @Override
    public final void n0(Rect rect) {
        rect.setEmpty();
    }

    @Override
    public final boolean n2(int i) {
        jm6 M = ((ChatAttachAlertPhotoLayout) this.a).H.M(i);
        if (M != null && ChatAttachAlertPhotoLayout.t1.containsKey(Integer.valueOf(M.C))) {
            return true;
        }
        return false;
    }

    @Override
    public final void o(long j) {
        FfmpegAudioRenderer ffmpegAudioRenderer = (FfmpegAudioRenderer) this.a;
        ffmpegAudioRenderer.i0 = true;
        tg2 tg2Var = ffmpegAudioRenderer.K;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new et(tg2Var, j, (byte) 2));
        }
    }

    @Override
    public final void o0(int i, int i2) {
        ((w39) this.a).p(i, i2);
    }

    @Override
    public final void onResult(Object obj) {
        k03 k03Var = (k03) obj;
        k03Var.getClass();
        na1 na1Var = (na1) this.a;
        if (na1Var.r() instanceof tj7) {
            na1Var.resumeWith(k03Var);
        }
    }

    @Override
    public final void p() {
        a.t();
        boolean z = w01.a;
        a.q();
        d01.t(((kf1) this.a).n.getParentActivity(), w01.g);
    }

    @Override
    public final View p0(LaunchActivity launchActivity) {
        return null;
    }

    @Override
    public final boolean p1() {
        return false;
    }

    @Override
    public final boolean q2(int i, View view) {
        return false;
    }

    @Override
    public final void r(int i) {
        boolean z;
        mt9 mt9Var = (mt9) this.a;
        mt9Var.E0--;
        mt9Var.f0 = i;
        if (mt9Var.g0 != i) {
            mt9Var.s.clear();
        }
        if (mt9Var.h0 != i) {
            mt9Var.J.clear();
        }
        mt9Var.O = true;
        ji3 ji3Var = mt9Var.V;
        if (ji3Var != null) {
            if (mt9Var.E0 > 0) {
                z = true;
            } else {
                z = false;
            }
            ji3Var.d(z, true);
        }
        mt9Var.f();
        ji3 ji3Var2 = mt9Var.V;
        if (ji3Var2 != null) {
            ji3Var2.c();
        }
    }

    @Override
    public final boolean s0(gb2 gb2Var, boolean z) {
        return false;
    }

    @Override
    public final void s1(boolean z) {
        ((jjc) this.a).setEditPillHidden(z);
    }

    @Override
    public final void t0(pd5 pd5Var) {
        tg2 tg2Var = ((FfmpegAudioRenderer) this.a).K;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new m30(tg2Var, pd5Var, (byte) 1));
        }
    }

    @Override
    public final vf6 t1() {
        return null;
    }

    @Override
    public final int u() {
        return 0;
    }

    @Override
    public final void u1() {
        ou3 ou3Var = (ou3) this.a;
        ou3Var.M1 = null;
        ou3Var.E0();
    }

    @Override
    public final void v(boolean z) {
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = (ChatAttachAlertPhotoLayout) this.a;
        chatAttachAlertPhotoLayout.M = z ? (byte) 1 : (byte) 0;
        chatAttachAlertPhotoLayout.F.e1(true);
    }

    @Override
    public final boolean w(long j, int i, int i2, int i3, j8b j8bVar) {
        b81 b81Var = (b81) this.a;
        if (b81Var.b != null) {
            int i4 = 0;
            while (true) {
                if (i4 >= b81Var.b.getChildCount()) {
                    break;
                }
                View childAt = b81Var.b.getChildAt(i4);
                if (childAt instanceof y71) {
                    y71 y71Var = (y71) childAt;
                    if (y71Var.n != null) {
                        for (int i5 = 0; i5 < y71Var.n.size(); i5++) {
                            ArrayList arrayList = ((z71) y71Var.n.valueAt(i5)).b;
                            if (arrayList != null && arrayList.contains(Integer.valueOf(i2))) {
                                int keyAt = y71Var.n.keyAt(i5);
                                b81Var.i0 = keyAt;
                                ImageReceiver imageReceiver = (ImageReceiver) y71Var.r.get(keyAt);
                                if (imageReceiver != null) {
                                    j8bVar.c = imageReceiver;
                                    sg0 sg0Var = b81Var.j0;
                                    if (sg0Var == null) {
                                        sg0Var = new sg0(this, (byte) 23);
                                        b81Var.j0 = sg0Var;
                                    }
                                    j8bVar.e = sg0Var;
                                    j8bVar.a = y71Var;
                                    j8bVar.g = b81Var.fragmentView;
                                    j8bVar.h = gl.L(36.0f);
                                    j8bVar.i = b81Var.fragmentView.getBottom();
                                    j8bVar.b = null;
                                    return true;
                                }
                            }
                        }
                        continue;
                    } else {
                        continue;
                    }
                }
                i4++;
            }
        }
        return false;
    }

    @Override
    public final void w1(Exception exc) {
        lad.d("DecoderAudioRenderer", "Audio sink error", exc);
        tg2 tg2Var = ((FfmpegAudioRenderer) this.a).K;
        Handler handler = (Handler) tg2Var.b;
        if (handler != null) {
            handler.post(new j30(tg2Var, exc, (byte) 1));
        }
    }

    @Override
    public final jjc w2() {
        return (jjc) this.a;
    }

    @Override
    public final String x(long j) {
        return null;
    }

    @Override
    public final boolean x0(gb2 gb2Var, TLRPC.Chat chat) {
        return false;
    }

    @Override
    public final boolean y1() {
        return false;
    }

    @Override
    public final boolean y2(int i) {
        return false;
    }

    @Override
    public final void z(k27 k27Var) {
        m mVar = ((o) this.a).v0[0];
        if (mVar != null) {
            mVar.b.J0(true);
        }
    }

    @Override
    public final boolean z1(k27 k27Var) {
        return oo1.a(k27Var);
    }

    @Override
    public final void z2(vq0 vq0Var) {
        kk7.f(y31.c0((y31) this.a)).d(vq0Var);
    }

    @Override
    public final void B() {
    }

    @Override
    public final void B0() {
    }

    @Override
    public final void C2() {
    }

    @Override
    public final void I0() {
    }

    @Override
    public final void L0() {
    }

    @Override
    public final void R1() {
    }

    @Override
    public final void S() {
    }

    @Override
    public final void c() {
    }

    @Override
    public final void i1() {
    }

    @Override
    public final void k() {
    }

    @Override
    public final void onDismiss() {
    }

    @Override
    public final void p2() {
    }

    @Override
    public final void t() {
    }

    @Override
    public final void t2() {
    }

    @Override
    public final void u2() {
    }

    @Override
    public final void z0() {
    }

    @Override
    public final void D1(h27 h27Var) {
    }

    @Override
    public final void F(gb2 gb2Var) {
    }

    @Override
    public final void G2(int i) {
    }

    @Override
    public final void H0(ya8 ya8Var) {
    }

    @Override
    public final void H2(gb2 gb2Var) {
    }

    @Override
    public final void J(gb2 gb2Var) {
    }

    @Override
    public final void L1(View view) {
    }

    @Override
    public final void M1(gb2 gb2Var) {
    }

    @Override
    public final void N0(gb2 gb2Var) {
    }

    @Override
    public final void P0(Object obj) {
    }

    @Override
    public final void Q1(vf7 vf7Var) {
    }

    @Override
    public final void S0(float f) {
    }

    @Override
    public final void T(gb2 gb2Var) {
    }

    @Override
    public final void W(gb2 gb2Var) {
    }

    @Override
    public final void X0(gb2 gb2Var) {
    }

    @Override
    public final void X1(gb2 gb2Var) {
    }

    @Override
    public final void Y(k27 k27Var) {
    }

    @Override
    public final void Y1(gb2 gb2Var) {
    }

    @Override
    public final void c1(gb2 gb2Var) {
    }

    @Override
    public final void d0(int i) {
    }

    @Override
    public final void e2(gb2 gb2Var) {
    }

    @Override
    public final void f(long j) {
    }

    @Override
    public final void g(float f) {
    }

    @Override
    public final void g1(TLRPC.User user) {
    }

    @Override
    public final void h2(boolean z) {
    }

    @Override
    public final void i(boolean z) {
    }

    @Override
    public final void j0(k27 k27Var) {
    }

    @Override
    public final void l0(String str) {
    }

    @Override
    public final void l1(gb2 gb2Var) {
    }

    @Override
    public final void n(View view) {
    }

    @Override
    public final void n1(gb2 gb2Var) {
    }

    @Override
    public final void o1(boolean z) {
    }

    @Override
    public final void q(gb2 gb2Var) {
    }

    @Override
    public final void q0(View view) {
    }

    @Override
    public final void q1(gb2 gb2Var) {
    }

    @Override
    public final void r0(gb2 gb2Var) {
    }

    @Override
    public final void u0(k27 k27Var) {
    }

    @Override
    public final void v2(gb2 gb2Var) {
    }

    @Override
    public final void x1(gb2 gb2Var) {
    }

    @Override
    public final void y0(View view) {
    }

    @Override
    public final void C1(gb2 gb2Var, boolean z) {
    }

    @Override
    public final void E0(gb2 gb2Var, long j) {
    }

    @Override
    public final void F1(gb2 gb2Var, int i) {
    }

    @Override
    public final void M0(gb2 gb2Var, boolean z) {
    }

    @Override
    public final void O1(gb2 gb2Var, iq0 iq0Var) {
    }

    @Override
    public final void V0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void Z(gb2 gb2Var, TLRPC.MessageExtendedMedia messageExtendedMedia) {
    }

    @Override
    public final void b2(String str, String str2) {
    }

    @Override
    public final void d2(gb2 gb2Var, k08 k08Var) {
    }

    @Override
    public final void j2(gb2 gb2Var, TL_keyboard.KeyboardInlineButton keyboardInlineButton) {
    }

    @Override
    public final void m0(gb2 gb2Var, int i) {
    }

    @Override
    public final void o2(int i, ArrayList arrayList) {
    }

    @Override
    public final void v0(gb2 gb2Var, TL_keyboard.KeyboardButtonProto keyboardButtonProto) {
    }

    @Override
    public final void y(SurfaceTexture surfaceTexture, Bitmap bitmap) {
    }

    @Override
    public final void A(gb2 gb2Var, float f, float f2) {
    }

    @Override
    public final void G1(gb2 gb2Var, boolean z, boolean z2) {
    }

    @Override
    public final void I(gb2 gb2Var, TLRPC.Document document, RectF rectF) {
    }

    @Override
    public final void P(gb2 gb2Var, CharacterStyle characterStyle, boolean z) {
    }

    @Override
    public final void W1(gb2 gb2Var, TLObject tLObject, boolean z) {
    }

    @Override
    public final void Y0(gb2 gb2Var, float f, float f2) {
    }

    @Override
    public final void r2(Canvas canvas, int i, int i2) {
    }

    @Override
    public final void s2(gb2 gb2Var, float f, float f2) {
    }

    @Override
    public final void v1(gb2 gb2Var, float f, float f2) {
    }

    @Override
    public final void w0(gb2 gb2Var, int i, int i2) {
    }

    @Override
    public final void x2(gb2 gb2Var, boolean z, boolean z2) {
    }

    public i4d(Context context) {
        String e;
        d1b a = d1b.a(context);
        this.a = a;
        a.b();
        String e2 = a.e("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(e2) || (e = a.e(d1b.f("googleSignInOptions", e2))) == null) {
            return;
        }
        try {
            GoogleSignInOptions.b(e);
        } catch (JSONException unused) {
        }
    }

    public i4d(Object obj) {
        this.a = obj;
    }

    public i4d(LaunchActivity launchActivity, Executor executor, aod aodVar) {
        if (launchActivity == null) {
            w26.j("FragmentActivity must not be null.");
            throw null;
        } else if (executor != null) {
            ho4 u = launchActivity.u();
            lj0 lj0Var = (lj0) new g29(launchActivity).k(lj0.class);
            this.a = u;
            lj0Var.b = executor;
            lj0Var.c = aodVar;
        } else {
            w26.j("Executor must not be null.");
            throw null;
        }
    }

    public i4d(Context context, wjb wjbVar) {
        fx0 fx0Var = new fx0(1, wjbVar, context, false);
        this.a = fx0Var;
        fx0Var.K();
    }

    @Override
    public final void A0(gb2 gb2Var, float f, float f2, boolean z) {
    }

    @Override
    public final void E(gb2 gb2Var, TLRPC.User user, TLRPC.Document document, String str) {
    }

    @Override
    public final void c0(gb2 gb2Var, TLRPC.User user, float f, float f2) {
    }

    @Override
    public final void s(gb2 gb2Var, TLRPC.PollAnswer pollAnswer, TLRPC.MessageMedia messageMedia, int i) {
    }

    @Override
    public final void N(gb2 gb2Var, int i, float f, float f2, boolean z) {
    }

    @Override
    public final void m1(gb2 gb2Var, TLRPC.ReactionCount reactionCount, boolean z, float f, float f2) {
    }

    @Override
    public final void r1(gb2 gb2Var, ArrayList arrayList, int i, int i2, int i3) {
    }

    @Override
    public final void i2(gb2 gb2Var, TLRPC.Chat chat, int i, float f, float f2, boolean z) {
    }

    @Override
    public final void R0(ArrayList arrayList, Editable editable, boolean z, int i, int i2, long j, boolean z2, long j2) {
    }

    @Override
    public final void I1(k27 k27Var, String str, String str2, String str3, String str4, int i, int i2) {
    }

    @Override
    public final void B1(int i, boolean z, boolean z2, int i2, int i3, long j, boolean z3, boolean z4, long j2) {
    }
}
