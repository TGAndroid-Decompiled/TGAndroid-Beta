package a1;

import ai.d2;
import ai.ec;
import ai.g0;
import ai.k7;
import ai.kc;
import ai.l1;
import ai.m1;
import ai.n1;
import ai.p8;
import ai.s3;
import ai.u9;
import ai.va;
import ai.w0;
import ai.wa;
import ai.xa;
import ai.y1;
import ai.yb;
import ai.zb;
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
import ci.j7;
import ci.ka;
import ci.l8;
import ci.lc;
import ci.nb;
import ci.o1;
import ci.r;
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
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.r61;
import org.telegram.ui.Components.ss0;
import org.telegram.ui.Components.ul0;
import pg.u1;
import r0.k1;
import r0.n;
import s4.n0;
import vh.k;
public final class c implements OnSuccessListener, i, im0, Utilities.Callback2Return, hm0, z1, u9, ec, k, n, ul0, Utilities.Callback5, u1, CameraController.VideoTakeCallback, Continuation, OnCompleteListener {
    public final int f40a;
    public final Object f41b;

    public c(Object obj, int i10) {
        this.f40a = i10;
        this.f41b = obj;
    }

    @Override
    public k1 M0(View view, k1 k1Var) {
        int a2;
        kc kcVar = (kc) this.f41b;
        int i10 = 0;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(k1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) kcVar.v.getLayoutParams();
        if (!kcVar.f1259c) {
            i10 = k1Var.d();
        }
        marginLayoutParams.topMargin = i10;
        if (kcVar.f1259c) {
            a2 = k1Var.f46867a.f(2).d;
        } else {
            a2 = k1Var.a();
        }
        marginLayoutParams.bottomMargin = a2;
        marginLayoutParams.leftMargin = defaultWindowInsets.f11575a;
        marginLayoutParams.rightMargin = defaultWindowInsets.f11577c;
        yb ybVar = kcVar.f1294s;
        if (ybVar != null) {
            ybVar.requestLayout();
        }
        zb zbVar = kcVar.v;
        if (zbVar != null) {
            zbVar.requestLayout();
        }
        return k1.f46866b;
    }

    @Override
    public boolean Y0(View view) {
        return false;
    }

    @Override
    public void a() {
        ((o1) this.f41b).invalidate();
    }

    @Override
    public void b(boolean z10) {
        k7 k7Var = (k7) this.f41b;
        if (k7Var != null) {
            k7Var.c();
        }
    }

    @Override
    public void c(float f7, float f10, int i10, View view) {
        long j3;
        long j10;
        int i11;
        int i12;
        int i13;
        s3 s3Var = (s3) this.f41b;
        w0 w0Var = s3Var.f1509c;
        ArrayList arrayList = s3Var.f1518r;
        n1 n1Var = ((l1) view).f1324f;
        int i14 = s3Var.N;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            j3 = 0;
            if (i16 >= n1Var.f1445f.size()) {
                break;
            }
            m1 m1Var = (m1) n1Var.f1445f.get(i16);
            long j11 = m1Var.f1385g;
            if (j11 > 0 && currentTime - m1Var.d <= g0.b(i14, (int) j11, 0)) {
                hashSet.add(Integer.valueOf(m1Var.f1380a));
            }
            i16++;
        }
        d2 d2Var = s3Var.P;
        if (d2Var != null) {
            j3 = d2Var.j();
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            m1 m1Var2 = (m1) arrayList.get(i17);
            if (!m1Var2.f1381b && m1Var2.f1383e && m1Var2.f1385g < j3) {
                j10 = j3;
            } else {
                if (hashSet.contains(Integer.valueOf(m1Var2.f1380a))) {
                    j10 = j3;
                    if (s3Var.f1520w != n1Var.f1442b || (i13 = s3Var.f1521x) == 0 || m1Var2.f1380a < i13) {
                        i11 = m1Var2.f1380a;
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
                    if (m1Var3.f1381b || !m1Var3.f1383e || m1Var3.f1385g >= j10) {
                        if (hashSet.contains(Integer.valueOf(m1Var3.f1380a))) {
                            i12 = m1Var3.f1380a;
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
        s3Var.f1520w = n1Var.f1442b;
        s3Var.f1521x = i12;
        s3Var.f1522y = true;
        n0 itemAnimator = w0Var.getItemAnimator();
        w0Var.setItemAnimator(null);
        s3Var.d.i1(i18, w0Var.getHeight() / 2, true);
        s3Var.f1512e.m(i18);
        w0Var.setItemAnimator(itemAnimator);
    }

    @Override
    public boolean d(int r33, final android.view.View r34) {
        throw new UnsupportedOperationException("Method not decompiled: a1.c.d(int, android.view.View):boolean");
    }

    @Override
    public void e() {
        float f7;
        nb nbVar = (nb) this.f41b;
        TextView textView = nbVar.f5815o1;
        boolean a2 = nbVar.D0.a();
        ImageView imageView = nbVar.f5813n1;
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
        switch (this.f40a) {
            case 5:
                ((Runnable) this.f41b).run();
                return;
            case 14:
                lc lcVar = ((bc) ((r) this.f41b)).S1;
                ci.zb zbVar = lcVar.X0;
                if (zbVar != null) {
                    zbVar.s(null, null, true);
                }
                nb nbVar = lcVar.f5526v1;
                if (nbVar != null) {
                    nbVar.p0();
                }
                bc bcVar = lcVar.f5466c1;
                if (bcVar != null) {
                    bcVar.setHasRoundVideo(false);
                }
                l8 l8Var = lcVar.K1;
                if (l8Var != null) {
                    File file = l8Var.f5424o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        lcVar.K1.f5424o0 = null;
                    }
                    if (lcVar.K1.f5426p0 != null) {
                        try {
                            new File(lcVar.K1.f5426p0).delete();
                        } catch (Exception unused2) {
                        }
                        lcVar.K1.f5426p0 = null;
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ((e6) this.f41b).f5028a.f5818p2.s();
                return;
            default:
                ((ei.e) this.f41b).run();
                return;
        }
    }

    @Override
    public void g(float f7, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.f41b;
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
        a4.j jVar2 = (a4.j) jVar;
        jVar2.clear();
        ((a4.k) this.f41b).f291b.add(jVar2);
    }

    @Override
    public void l(vh.g gVar, float f7, float f10) {
        xa xaVar;
        wa waVar = (wa) this.f41b;
        if (!waVar.v.f1926x) {
            gVar.f49781q = new va(waVar, 2);
            float sqrt = (float) Math.sqrt(Math.pow(xaVar.getHeight(), 2.0d) + Math.pow(xaVar.getWidth(), 2.0d));
            ArrayList arrayList = waVar.f1874i;
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
        switch (this.f40a) {
            case 23:
                c0.b((Intent) this.f41b);
                return;
            case 24:
                ((e0) this.f41b).f7930b.trySetResult(null);
                return;
            default:
                ((ScheduledFuture) this.f41b).cancel(false);
                return;
        }
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        gb gbVar = (gb) this.f41b;
        lc lcVar = gbVar.f5131a;
        j7 j7Var = lcVar.O0;
        int i10 = lcVar.f5464c;
        if (j7Var != null) {
            j7Var.g(true);
        }
        if (lcVar.p0()) {
            lcVar.f5515s.d();
        }
        if (lcVar.G1 != null && lcVar.B0 != null) {
            lcVar.Q1 = false;
            lcVar.R1 = false;
            f7 f7Var = lcVar.C0;
            if (f7Var != null) {
                f7Var.c(false);
            }
            if (j3 <= 800) {
                lcVar.g(false, true);
                lcVar.c0(false);
                lcVar.J0.b(false, true);
                j7 j7Var2 = lcVar.O0;
                if (j7Var2 != null) {
                    j7Var2.g(true);
                }
                try {
                    lcVar.G1.delete();
                    lcVar.G1 = null;
                } catch (Exception e7) {
                    FileLog.e(e7);
                }
                if (str != null) {
                    try {
                        new File(str).delete();
                        return;
                    } catch (Exception e10) {
                        FileLog.e(e10);
                        return;
                    }
                }
                return;
            }
            lcVar.h0(false, true);
            l8 o9 = l8.o(lcVar.G1, str, j3);
            o9.J0 = lcVar.f5525v0;
            o9.K0 = lcVar.f5529w0;
            o9.B();
            lcVar.g(false, true);
            lcVar.c0(false);
            lcVar.J0.b(false, true);
            j7 j7Var3 = lcVar.O0;
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
                        l8Var.f5417k0 = videoWidth;
                        l8Var.f5419l0 = videoHeight;
                        l8Var.A();
                    }
                }
                lcVar.l0(true);
                return;
            }
            lcVar.K1 = o9;
            ga.a(i10, o9);
            lcVar.L1 = false;
            int videoWidth2 = lcVar.B0.getVideoWidth();
            int videoHeight2 = lcVar.B0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                l8 l8Var2 = lcVar.K1;
                l8Var2.f5417k0 = videoWidth2;
                l8Var2.f5419l0 = videoHeight2;
                l8Var2.A();
            }
            lcVar.K(new eb(gbVar, 3), 0L);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        boolean z10;
        switch (this.f40a) {
            case 0:
                ((b) this.f41b).invoke(obj);
                return;
            case 13:
                ((b1.f) this.f41b).invoke(obj);
                return;
            case 21:
                z zVar = (z) obj;
                if (((FirebaseMessaging) this.f41b).f7891e.q() && zVar.h.a() != null) {
                    synchronized (zVar) {
                        z10 = zVar.f7998g;
                    }
                    if (!z10) {
                        zVar.h(0L);
                        return;
                    }
                    return;
                }
                return;
            case 26:
                ((b1.f) this.f41b).invoke(obj);
                return;
            default:
                ((e1.b) this.f41b).invoke(obj);
                return;
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        cb cbVar = (cb) this.f41b;
        r61 r61Var = (r61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = r61Var.d;
        l8 l8Var = (l8) r61Var.G;
        cbVar.c(false, true);
        lc lcVar = cbVar.O;
        if (l8Var == lcVar.K1 || lcVar.X1) {
            return;
        }
        lcVar.f5469d1.setSelected(i10);
        lcVar.X1 = true;
        p8 p8Var = new p8(lcVar, i10, 6);
        nb nbVar = lcVar.f5526v1;
        l8 l8Var2 = lcVar.K1;
        if (nbVar != null && l8Var2 != null) {
            if (!nbVar.t0()) {
                p8Var.run();
                return;
            }
            l8Var2.f();
            boolean t02 = nbVar.t0();
            boolean z10 = nbVar.O0.getPainting().E;
            Utilities.searchQueue.postRunnable(new ka(lcVar, nbVar, l8Var2.f5413i0, l8Var2.f5415j0, l8Var2, z10, t02, p8Var, 0));
            return;
        }
        p8Var.run();
    }

    @Override
    public Object then(Task task) {
        ((com.google.firebase.messaging.n) this.f41b).getClass();
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
        switch (this.f40a) {
            case 3:
                Long l4 = (Long) obj;
                return ai.o1.a((ai.o1) this.f41b, (Long) obj2);
            default:
                ss0 ss0Var = (ss0) this.f41b;
                Integer num = (Integer) obj2;
                if (((Integer) obj).intValue() == -1) {
                    new y(ss0Var.f3940a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(ss0Var, 4)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override
    public void n0(View view, float f7, float f10) {
    }
}
