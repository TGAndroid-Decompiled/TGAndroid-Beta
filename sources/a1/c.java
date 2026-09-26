package a1;

import a4.l;
import ai.d2;
import ai.dc;
import ai.g0;
import ai.j7;
import ai.jc;
import ai.m1;
import ai.n1;
import ai.o1;
import ai.o8;
import ai.r3;
import ai.t9;
import ai.ua;
import ai.va;
import ai.w0;
import ai.wa;
import ai.xb;
import ai.y1;
import ai.yb;
import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.widget.ImageView;
import android.widget.TextView;
import bi.y;
import ci.bc;
import ci.cb;
import ci.e6;
import ci.eb;
import ci.f7;
import ci.ga;
import ci.gb;
import ci.ka;
import ci.l8;
import ci.lc;
import ci.nb;
import ci.p1;
import ci.r;
import ci.zb;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.c0;
import com.google.firebase.messaging.e0;
import com.google.firebase.messaging.z;
import h2.i;
import h2.j;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.concurrent.ScheduledFuture;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.camera.CameraController;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.z1;
import org.telegram.ui.Components.ml0;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.yr0;
import org.telegram.ui.Components.zk0;
import pg.v1;
import r0.l1;
import r0.n;
import s4.m0;
import vh.k;
public final class c implements OnSuccessListener, i, nl0, Utilities.Callback2Return, ml0, z1, t9, dc, k, n, zk0, Utilities.Callback5, v1, CameraController.VideoTakeCallback, Continuation, OnCompleteListener {
    public final int f36a;
    public final Object f37b;

    public c(Object obj, int i10) {
        this.f36a = i10;
        this.f37b = obj;
    }

    @Override
    public l1 Q0(View view, l1 l1Var) {
        int a2;
        jc jcVar = (jc) this.f37b;
        int i10 = 0;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jcVar.v.getLayoutParams();
        if (!jcVar.f1064c) {
            i10 = l1Var.d();
        }
        marginLayoutParams.topMargin = i10;
        if (jcVar.f1064c) {
            a2 = l1Var.f42139a.f(2).d;
        } else {
            a2 = l1Var.a();
        }
        marginLayoutParams.bottomMargin = a2;
        marginLayoutParams.leftMargin = defaultWindowInsets.f10576a;
        marginLayoutParams.rightMargin = defaultWindowInsets.f10578c;
        xb xbVar = jcVar.f1098s;
        if (xbVar != null) {
            xbVar.requestLayout();
        }
        yb ybVar = jcVar.v;
        if (ybVar != null) {
            ybVar.requestLayout();
        }
        return l1.f42138b;
    }

    @Override
    public void a() {
        ((p1) this.f37b).invalidate();
    }

    @Override
    public void b(boolean z10) {
        j7 j7Var = (j7) this.f37b;
        if (j7Var != null) {
            j7Var.c();
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        long j3;
        long j10;
        int i11;
        int i12;
        int i13;
        r3 r3Var = (r3) this.f37b;
        w0 w0Var = r3Var.f1331c;
        ArrayList arrayList = r3Var.f1339r;
        n1 n1Var = ((ai.l1) view).f1174f;
        int i14 = r3Var.N;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            j3 = 0;
            if (i16 >= n1Var.f1289f.size()) {
                break;
            }
            m1 m1Var = (m1) n1Var.f1289f.get(i16);
            long j11 = m1Var.f1230g;
            if (j11 > 0 && currentTime - m1Var.d <= g0.b(i14, (int) j11, 0)) {
                hashSet.add(Integer.valueOf(m1Var.f1226a));
            }
            i16++;
        }
        d2 d2Var = r3Var.P;
        if (d2Var != null) {
            j3 = d2Var.j();
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            m1 m1Var2 = (m1) arrayList.get(i17);
            if (!m1Var2.f1227b && m1Var2.e && m1Var2.f1230g < j3) {
                j10 = j3;
            } else {
                if (hashSet.contains(Integer.valueOf(m1Var2.f1226a))) {
                    j10 = j3;
                    if (r3Var.f1341w != n1Var.f1287b || (i13 = r3Var.f1342x) == 0 || m1Var2.f1226a < i13) {
                        i11 = m1Var2.f1226a;
                        break;
                    }
                } else {
                    j10 = j3;
                }
                i18++;
            }
            i17++;
            j3 = j10;
        }
        j10 = j3;
        i11 = -1;
        if (i11 < 0) {
            int i19 = 0;
            while (true) {
                if (i15 < arrayList.size()) {
                    m1 m1Var3 = (m1) arrayList.get(i15);
                    if (m1Var3.f1227b || !m1Var3.e || m1Var3.f1230g >= j10) {
                        if (hashSet.contains(Integer.valueOf(m1Var3.f1226a))) {
                            i12 = m1Var3.f1226a;
                            i18 = i19;
                            break;
                        }
                        i19++;
                    }
                    i15++;
                } else {
                    i18 = i19;
                    i12 = -1;
                    break;
                }
            }
        } else {
            i12 = i11;
        }
        if (i12 < 0) {
            return;
        }
        r3Var.f1341w = n1Var.f1287b;
        r3Var.f1342x = i12;
        r3Var.f1343y = true;
        m0 itemAnimator = w0Var.getItemAnimator();
        w0Var.setItemAnimator(null);
        r3Var.d.i1(i18, w0Var.getHeight() / 2, true);
        r3Var.e.m(i18);
        w0Var.setItemAnimator(itemAnimator);
    }

    @Override
    public boolean d(int r33, final android.view.View r34) {
        throw new UnsupportedOperationException("Method not decompiled: a1.c.d(int, android.view.View):boolean");
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void e() {
        float f7;
        nb nbVar = (nb) this.f37b;
        TextView textView = nbVar.f5357o1;
        boolean a2 = nbVar.D0.a();
        ImageView imageView = nbVar.f5355n1;
        imageView.animate().cancel();
        ViewPropertyAnimator animate = imageView.animate();
        float f10 = 0.6f;
        if (a2) {
            f7 = 1.0f;
        } else {
            f7 = 0.6f;
        }
        animate.alpha(f7).translationY(0.0f).setDuration(150L).start();
        imageView.setClickable(a2);
        textView.animate().cancel();
        ViewPropertyAnimator animate2 = textView.animate();
        if (a2) {
            f10 = 1.0f;
        }
        animate2.alpha(f10).translationY(0.0f).setDuration(150L).start();
        textView.setClickable(a2);
    }

    @Override
    public void f(a2 a2Var, int i10) {
        switch (this.f36a) {
            case 5:
                ((Runnable) this.f37b).run();
                return;
            case 14:
                lc lcVar = ((bc) ((r) this.f37b)).S1;
                zb zbVar = lcVar.X0;
                if (zbVar != null) {
                    zbVar.s(null, null, true);
                }
                nb nbVar = lcVar.f5094v1;
                if (nbVar != null) {
                    nbVar.q0();
                }
                bc bcVar = lcVar.f5035c1;
                if (bcVar != null) {
                    bcVar.setHasRoundVideo(false);
                }
                l8 l8Var = lcVar.K1;
                if (l8Var != null) {
                    File file = l8Var.f4994o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        lcVar.K1.f4994o0 = null;
                    }
                    if (lcVar.K1.f4996p0 != null) {
                        try {
                            new File(lcVar.K1.f4996p0).delete();
                        } catch (Exception unused2) {
                        }
                        lcVar.K1.f4996p0 = null;
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ((e6) this.f37b).f4638a.f5360p2.r();
                return;
            default:
                ((ei.e) this.f37b).run();
                return;
        }
    }

    @Override
    public void g(float f7, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.f37b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f7, 2.0d);
        path.addCircle((rectF.right + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), (rectF.bottom + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), AndroidUtilities.dp(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override
    public void h(j jVar) {
        a4.k kVar = (a4.k) jVar;
        kVar.clear();
        ((l) this.f37b).f270b.add(kVar);
    }

    @Override
    public void l(vh.g gVar, float f7, float f10) {
        va vaVar = (va) this.f37b;
        wa waVar = vaVar.v;
        if (!waVar.f1671x) {
            gVar.f44696q = new ua(vaVar, 2);
            float sqrt = (float) Math.sqrt(Math.pow(waVar.getHeight(), 2.0d) + Math.pow(waVar.getWidth(), 2.0d));
            ArrayList arrayList = vaVar.f1625i;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((vh.g) obj).j(f7, f10, sqrt, false);
            }
        }
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f36a) {
            case 23:
                c0.b((Intent) this.f37b);
                return;
            case 24:
                ((e0) this.f37b).f7291b.trySetResult(null);
                return;
            default:
                ((ScheduledFuture) this.f37b).cancel(false);
                return;
        }
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        gb gbVar = (gb) this.f37b;
        lc lcVar = gbVar.f4734a;
        ci.j7 j7Var = lcVar.O0;
        int i10 = lcVar.f5033c;
        if (j7Var != null) {
            j7Var.g(true);
        }
        if (lcVar.q0()) {
            lcVar.f5083s.d();
        }
        if (lcVar.G1 != null && lcVar.B0 != null) {
            lcVar.Q1 = false;
            lcVar.R1 = false;
            f7 f7Var = lcVar.C0;
            if (f7Var != null) {
                f7Var.c(false);
            }
            if (j3 <= 800) {
                lcVar.h(false, true);
                lcVar.d0(false);
                lcVar.J0.b(false, true);
                ci.j7 j7Var2 = lcVar.O0;
                if (j7Var2 != null) {
                    j7Var2.g(true);
                }
                try {
                    lcVar.G1.delete();
                    lcVar.G1 = null;
                } catch (Exception e) {
                    FileLog.e(e);
                }
                if (str != null) {
                    try {
                        new File(str).delete();
                        return;
                    } catch (Exception e7) {
                        FileLog.e(e7);
                        return;
                    }
                }
                return;
            }
            lcVar.i0(false, true);
            l8 o9 = l8.o(lcVar.G1, str, j3);
            o9.J0 = lcVar.f5093v0;
            o9.K0 = lcVar.f5097w0;
            o9.B();
            lcVar.h(false, true);
            lcVar.d0(false);
            lcVar.J0.b(false, true);
            ci.j7 j7Var3 = lcVar.O0;
            if (j7Var3 != null) {
                j7Var3.g(true);
            }
            if (lcVar.A0.j()) {
                lcVar.G1 = null;
                o9.P = 1.0f;
                if (lcVar.A0.l(o9)) {
                    l8 a2 = l8.a(lcVar.A0.getLayout(), lcVar.A0.getContent());
                    lcVar.K1 = a2;
                    ga.a(i10, a2);
                    lcVar.L1 = false;
                    int videoWidth = lcVar.B0.getVideoWidth();
                    int videoHeight = lcVar.B0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        l8 l8Var = lcVar.K1;
                        l8Var.f4987k0 = videoWidth;
                        l8Var.f4989l0 = videoHeight;
                        l8Var.A();
                    }
                }
                lcVar.m0(true);
                return;
            }
            lcVar.K1 = o9;
            ga.a(i10, o9);
            lcVar.L1 = false;
            int videoWidth2 = lcVar.B0.getVideoWidth();
            int videoHeight2 = lcVar.B0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                l8 l8Var2 = lcVar.K1;
                l8Var2.f4987k0 = videoWidth2;
                l8Var2.f4989l0 = videoHeight2;
                l8Var2.A();
            }
            lcVar.L(new eb(gbVar, 3), 0L);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        boolean z10;
        switch (this.f36a) {
            case 0:
                ((f) this.f37b).invoke(obj);
                return;
            case 13:
                ((b1.f) this.f37b).invoke(obj);
                return;
            case 21:
                z zVar = (z) obj;
                if (((FirebaseMessaging) this.f37b).e.n() && zVar.h.a() != null) {
                    synchronized (zVar) {
                        z10 = zVar.f7351g;
                    }
                    if (!z10) {
                        zVar.h(0L);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ((b1.f) this.f37b).invoke(obj);
                return;
            default:
                ((e1.b) this.f37b).invoke(obj);
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        cb cbVar = (cb) this.f37b;
        w51 w51Var = (w51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = w51Var.d;
        l8 l8Var = (l8) w51Var.G;
        cbVar.c(false, true);
        lc lcVar = cbVar.O;
        if (l8Var == lcVar.K1 || lcVar.X1) {
            return;
        }
        lcVar.f5038d1.setSelected(i10);
        lcVar.X1 = true;
        o8 o8Var = new o8(lcVar, i10, 6);
        nb nbVar = lcVar.f5094v1;
        l8 l8Var2 = lcVar.K1;
        if (nbVar != null && l8Var2 != null) {
            if (!nbVar.u0()) {
                o8Var.run();
                return;
            }
            l8Var2.f();
            boolean u02 = nbVar.u0();
            boolean z10 = nbVar.O0.getPainting().E;
            Utilities.searchQueue.postRunnable(new ka(lcVar, nbVar, l8Var2.f4983i0, l8Var2.f4985j0, l8Var2, z10, u02, o8Var, 0));
            return;
        }
        o8Var.run();
    }

    @Override
    public Object then(Task task) {
        ((com.google.firebase.messaging.n) this.f37b).getClass();
        Bundle bundle = (Bundle) task.getResult(IOException.class);
        if (bundle != null) {
            String string = bundle.getString("registration_id");
            if (string != null) {
                return string;
            }
            String string2 = bundle.getString("unregistered");
            if (string2 != null) {
                return string2;
            }
            String string3 = bundle.getString("error");
            if (!"RST".equals(string3)) {
                if (string3 != null) {
                    throw new IOException(string3);
                }
                Log.w("FirebaseMessaging", "Unexpected response: " + bundle, new Throwable());
                throw new IOException("SERVICE_NOT_AVAILABLE");
            }
            throw new IOException("INSTANCE_ID_RESET");
        }
        throw new IOException("SERVICE_NOT_AVAILABLE");
    }

    @Override
    public Object run(Object obj, Object obj2) {
        switch (this.f36a) {
            case 3:
                Long l4 = (Long) obj;
                return o1.a((o1) this.f37b, (Long) obj2);
            default:
                yr0 yr0Var = (yr0) this.f37b;
                Integer num = (Integer) obj2;
                if (((Integer) obj).intValue() == -1) {
                    new y(yr0Var.f3599a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(yr0Var, 4)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
