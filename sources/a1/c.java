package a1;

import ab.e0;
import ab.f0;
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
import bi.d1;
import bi.e1;
import bi.ea;
import bi.f1;
import bi.f9;
import bi.fa;
import bi.g1;
import bi.ga;
import bi.gb;
import bi.h3;
import bi.hb;
import bi.mb;
import bi.o0;
import bi.sb;
import bi.t1;
import bi.v6;
import bi.z;
import ci.x;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.b0;
import com.google.firebase.messaging.d0;
import com.google.firebase.messaging.m;
import com.google.firebase.messaging.y;
import di.ac;
import di.bb;
import di.d6;
import di.db;
import di.e7;
import di.fb;
import di.i7;
import di.ja;
import di.k8;
import di.kc;
import di.o1;
import di.r;
import di.yb;
import e9.l1;
import e9.q1;
import e9.s;
import h2.i;
import h2.j;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
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
import org.telegram.ui.Components.bm0;
import org.telegram.ui.Components.cm0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.ms0;
import org.telegram.ui.Components.ol0;
import qg.s1;
import r0.o;
import s4.l0;
import wh.k;
public final class c implements OnSuccessListener, i, i5.e, cm0, Utilities.Callback2Return, bm0, z1, f9, mb, k, o, Continuation, OnCompleteListener, ol0, Utilities.Callback5, s1, CameraController.VideoTakeCallback, l1 {
    public final int f34a;
    public final Object f35b;

    public c(Object obj, int i10) {
        this.f34a = i10;
        this.f35b = obj;
    }

    @Override
    public r0.l1 Q0(View view, r0.l1 l1Var) {
        int a2;
        sb sbVar = (sb) this.f35b;
        int i10 = 0;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) sbVar.v.getLayoutParams();
        if (!sbVar.f3666c) {
            i10 = l1Var.d();
        }
        marginLayoutParams.topMargin = i10;
        if (sbVar.f3666c) {
            a2 = l1Var.f43741a.f(2).d;
        } else {
            a2 = l1Var.a();
        }
        marginLayoutParams.bottomMargin = a2;
        marginLayoutParams.leftMargin = defaultWindowInsets.f10888a;
        marginLayoutParams.rightMargin = defaultWindowInsets.f10890c;
        gb gbVar = sbVar.f3700s;
        if (gbVar != null) {
            gbVar.requestLayout();
        }
        hb hbVar = sbVar.v;
        if (hbVar != null) {
            hbVar.requestLayout();
        }
        return r0.l1.f43740b;
    }

    @Override
    public boolean a(int r33, final android.view.View r34) {
        throw new UnsupportedOperationException("Method not decompiled: a1.c.a(int, android.view.View):boolean");
    }

    @Override
    public Object apply(Object obj) {
        ((qb.c) this.f35b).getClass();
        String N = f0.f396b.N((e0) obj);
        kotlin.jvm.internal.i.d(N, "SessionEvents.SESSION_EVENT_ENCODER.encode(value)");
        Log.d("EventGDTLogger", "Session Event: ".concat(N));
        byte[] bytes = N.getBytes(zd.a.f50124a);
        kotlin.jvm.internal.i.d(bytes, "this as java.lang.String).getBytes(charset)");
        return bytes;
    }

    @Override
    public void b(boolean z10) {
        v6 v6Var = (v6) this.f35b;
        if (v6Var != null) {
            v6Var.c();
        }
    }

    @Override
    public void c() {
        ((o1) this.f35b).invalidate();
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        long j10;
        long j11;
        int i11;
        int i12;
        int i13;
        h3 h3Var = (h3) this.f35b;
        o0 o0Var = h3Var.f3054c;
        ArrayList arrayList = h3Var.f3062r;
        f1 f1Var = ((d1) view).f2941f;
        int i14 = h3Var.N;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            j10 = 0;
            if (i16 >= f1Var.f3010f.size()) {
                break;
            }
            e1 e1Var = (e1) f1Var.f3010f.get(i16);
            long j12 = e1Var.f2974g;
            if (j12 > 0 && currentTime - e1Var.d <= z.b(i14, (int) j12, 0)) {
                hashSet.add(Integer.valueOf(e1Var.f2970a));
            }
            i16++;
        }
        t1 t1Var = h3Var.P;
        if (t1Var != null) {
            j10 = t1Var.j();
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            e1 e1Var2 = (e1) arrayList.get(i17);
            if (!e1Var2.f2971b && e1Var2.e && e1Var2.f2974g < j10) {
                j11 = j10;
            } else {
                if (hashSet.contains(Integer.valueOf(e1Var2.f2970a))) {
                    j11 = j10;
                    if (h3Var.f3064w != f1Var.f3008b || (i13 = h3Var.f3065x) == 0 || e1Var2.f2970a < i13) {
                        i11 = e1Var2.f2970a;
                        break;
                    }
                } else {
                    j11 = j10;
                }
                i18++;
            }
            i17++;
            j10 = j11;
        }
        j11 = j10;
        i11 = -1;
        if (i11 < 0) {
            int i19 = 0;
            while (true) {
                if (i15 < arrayList.size()) {
                    e1 e1Var3 = (e1) arrayList.get(i15);
                    if (e1Var3.f2971b || !e1Var3.e || e1Var3.f2974g >= j11) {
                        if (hashSet.contains(Integer.valueOf(e1Var3.f2970a))) {
                            i12 = e1Var3.f2970a;
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
        h3Var.f3064w = f1Var.f3008b;
        h3Var.f3065x = i12;
        h3Var.f3066y = true;
        l0 itemAnimator = o0Var.getItemAnimator();
        o0Var.setItemAnimator(null);
        h3Var.d.i1(i18, o0Var.getHeight() / 2, true);
        h3Var.e.m(i18);
        o0Var.setItemAnimator(itemAnimator);
    }

    @Override
    public Object e(Object obj, Object obj2) {
        return s.x((List) ((Collection) obj2), new n4.s(14, ((q1) this.f35b).f8607f, obj));
    }

    @Override
    public void f() {
        float f7;
        di.mb mbVar = (di.mb) this.f35b;
        TextView textView = mbVar.f7538o1;
        boolean a2 = mbVar.D0.a();
        ImageView imageView = mbVar.f7536n1;
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
    public void g(a2 a2Var, int i10) {
        switch (this.f34a) {
            case 6:
                ((Runnable) this.f35b).run();
                return;
            case 21:
                kc kcVar = ((ac) ((r) this.f35b)).S1;
                yb ybVar = kcVar.X0;
                if (ybVar != null) {
                    ybVar.s(null, null, true);
                }
                di.mb mbVar = kcVar.f7302v1;
                if (mbVar != null) {
                    mbVar.p0();
                }
                ac acVar = kcVar.f7243c1;
                if (acVar != null) {
                    acVar.setHasRoundVideo(false);
                }
                k8 k8Var = kcVar.K1;
                if (k8Var != null) {
                    File file = k8Var.f7202o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        kcVar.K1.f7202o0 = null;
                    }
                    if (kcVar.K1.f7204p0 != null) {
                        try {
                            new File(kcVar.K1.f7204p0).delete();
                        } catch (Exception unused2) {
                        }
                        kcVar.K1.f7204p0 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                ((d6) this.f35b).f6824a.f7541p2.s();
                return;
        }
    }

    @Override
    public void h(float f7, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.f35b;
        if (z10) {
            return;
        }
        path.rewind();
        float pow = (float) Math.pow(f7, 2.0d);
        path.addCircle((rectF.right + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), (rectF.bottom + AndroidUtilities.dp(7.0f)) - (AndroidUtilities.dp(14.0f) * pow), AndroidUtilities.dp(11.0f), Path.Direction.CW);
        canvas.clipPath(path, Region.Op.DIFFERENCE);
    }

    @Override
    public void i(j jVar) {
        a4.j jVar2 = (a4.j) jVar;
        jVar2.clear();
        ((a4.k) this.f35b).f274b.add(jVar2);
    }

    @Override
    public void o(wh.g gVar, float f7, float f10) {
        ga gaVar;
        fa faVar = (fa) this.f35b;
        if (!faVar.v.f3096x) {
            gVar.f47673q = new ea(faVar, 2);
            float sqrt = (float) Math.sqrt(Math.pow(gaVar.getHeight(), 2.0d) + Math.pow(gaVar.getWidth(), 2.0d));
            ArrayList arrayList = faVar.f3030i;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((wh.g) obj).j(f7, f10, sqrt, false);
            }
        }
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f34a) {
            case 17:
                b0.b((Intent) this.f35b);
                return;
            case 18:
                ((d0) this.f35b).f6172b.trySetResult(null);
                return;
            default:
                ((ScheduledFuture) this.f35b).cancel(false);
                return;
        }
    }

    @Override
    public void onFinishVideoRecording(String str, long j10) {
        fb fbVar = (fb) this.f35b;
        kc kcVar = fbVar.f6954a;
        i7 i7Var = kcVar.O0;
        int i10 = kcVar.f7241c;
        if (i7Var != null) {
            i7Var.g(true);
        }
        if (kcVar.p0()) {
            kcVar.f7291s.d();
        }
        if (kcVar.G1 != null && kcVar.B0 != null) {
            kcVar.Q1 = false;
            kcVar.R1 = false;
            e7 e7Var = kcVar.C0;
            if (e7Var != null) {
                e7Var.c(false);
            }
            if (j10 <= 800) {
                kcVar.g(false, true);
                kcVar.c0(false);
                kcVar.J0.b(false, true);
                i7 i7Var2 = kcVar.O0;
                if (i7Var2 != null) {
                    i7Var2.g(true);
                }
                try {
                    kcVar.G1.delete();
                    kcVar.G1 = null;
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
            kcVar.h0(false, true);
            k8 o10 = k8.o(kcVar.G1, str, j10);
            o10.J0 = kcVar.f7301v0;
            o10.K0 = kcVar.f7305w0;
            o10.B();
            kcVar.g(false, true);
            kcVar.c0(false);
            kcVar.J0.b(false, true);
            i7 i7Var3 = kcVar.O0;
            if (i7Var3 != null) {
                i7Var3.g(true);
            }
            if (kcVar.A0.j()) {
                kcVar.G1 = null;
                o10.P = 1.0f;
                if (kcVar.A0.l(o10)) {
                    k8 a2 = k8.a(kcVar.A0.getLayout(), kcVar.A0.getContent());
                    kcVar.K1 = a2;
                    di.fa.a(i10, a2);
                    kcVar.L1 = false;
                    int videoWidth = kcVar.B0.getVideoWidth();
                    int videoHeight = kcVar.B0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        k8 k8Var = kcVar.K1;
                        k8Var.f7195k0 = videoWidth;
                        k8Var.f7197l0 = videoHeight;
                        k8Var.A();
                    }
                }
                kcVar.l0(true);
                return;
            }
            kcVar.K1 = o10;
            di.fa.a(i10, o10);
            kcVar.L1 = false;
            int videoWidth2 = kcVar.B0.getVideoWidth();
            int videoHeight2 = kcVar.B0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                k8 k8Var2 = kcVar.K1;
                k8Var2.f7195k0 = videoWidth2;
                k8Var2.f7197l0 = videoHeight2;
                k8Var2.A();
            }
            kcVar.K(new db(fbVar, 3), 0L);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        boolean z10;
        switch (this.f34a) {
            case 0:
                ((b) this.f35b).invoke(obj);
                return;
            case 12:
                ((b1.f) this.f35b).invoke(obj);
                return;
            case 15:
                y yVar = (y) obj;
                if (((FirebaseMessaging) this.f35b).e.q() && yVar.h.a() != null) {
                    synchronized (yVar) {
                        z10 = yVar.f6229g;
                    }
                    if (!z10) {
                        yVar.h(0L);
                        return;
                    }
                    return;
                }
                return;
            case 20:
                ((b1.f) this.f35b).invoke(obj);
                return;
            default:
                ((e1.b) this.f35b).invoke(obj);
                return;
        }
    }

    @Override
    public void mo16run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        bb bbVar = (bb) this.f35b;
        l61 l61Var = (l61) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = l61Var.d;
        k8 k8Var = (k8) l61Var.G;
        bbVar.c(false, true);
        kc kcVar = bbVar.O;
        if (k8Var == kcVar.K1 || kcVar.X1) {
            return;
        }
        kcVar.f7246d1.setSelected(i10);
        kcVar.X1 = true;
        ah.g gVar = new ah.g(kcVar, i10, 7);
        di.mb mbVar = kcVar.f7302v1;
        k8 k8Var2 = kcVar.K1;
        if (mbVar != null && k8Var2 != null) {
            if (!mbVar.t0()) {
                gVar.run();
                return;
            }
            k8Var2.f();
            boolean t02 = mbVar.t0();
            boolean z10 = mbVar.O0.getPainting().E;
            Utilities.searchQueue.postRunnable(new ja(kcVar, mbVar, k8Var2.f7191i0, k8Var2.f7193j0, k8Var2, z10, t02, gVar, 0));
            return;
        }
        gVar.run();
    }

    @Override
    public Object then(Task task) {
        ((m) this.f35b).getClass();
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
        switch (this.f34a) {
            case 4:
                Long l4 = (Long) obj;
                return g1.a((g1) this.f35b, (Long) obj2);
            default:
                ms0 ms0Var = (ms0) this.f35b;
                Integer num = (Integer) obj2;
                if (((Integer) obj).intValue() == -1) {
                    new x(ms0Var.f4796a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new bi.o1(ms0Var, 4)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override
    public void p0(View view, float f7, float f10) {
    }
}
