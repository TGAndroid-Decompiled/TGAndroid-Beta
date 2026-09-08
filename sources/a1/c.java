package a1;

import android.content.Intent;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.RectF;
import android.graphics.Region;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.webkit.WebView;
import android.widget.ImageView;
import android.widget.TextView;
import b5.h;
import bi.ba;
import bi.c9;
import bi.ca;
import bi.d1;
import bi.da;
import bi.db;
import bi.e1;
import bi.e3;
import bi.eb;
import bi.f1;
import bi.g1;
import bi.jb;
import bi.o0;
import bi.o1;
import bi.pb;
import bi.r6;
import bi.t1;
import bi.z;
import ci.x;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.b0;
import com.google.firebase.messaging.d0;
import com.google.firebase.messaging.y;
import di.b7;
import di.dc;
import di.f6;
import di.fb;
import di.fc;
import di.h7;
import di.hb;
import di.ja;
import di.l7;
import di.na;
import di.o8;
import di.p1;
import di.pc;
import di.r;
import di.rb;
import fg.k;
import h2.i;
import h2.j;
import j$.util.Objects;
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
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.bl0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.lr0;
import org.telegram.ui.Components.nk0;
import qg.s1;
import r0.l1;
import r0.n;
import s4.m0;
import wh.l;
public final class c implements OnSuccessListener, i, bl0, Utilities.Callback2Return, al0, a2, c9, jb, l, n, Continuation, OnCompleteListener, nk0, Utilities.Callback5, s1, CameraController.VideoTakeCallback, a5.b {
    public final int f37a;
    public final Object f38b;

    public c(Object obj, int i10) {
        this.f37a = i10;
        this.f38b = obj;
    }

    @Override
    public l1 T0(View view, l1 l1Var) {
        int a2;
        pb pbVar = (pb) this.f38b;
        int i10 = 0;
        i0.c defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) pbVar.v.getLayoutParams();
        if (!pbVar.f3564c) {
            i10 = l1Var.d();
        }
        marginLayoutParams.topMargin = i10;
        if (pbVar.f3564c) {
            a2 = l1Var.f44739a.f(2).d;
        } else {
            a2 = l1Var.a();
        }
        marginLayoutParams.bottomMargin = a2;
        marginLayoutParams.leftMargin = defaultWindowInsets.f11451a;
        marginLayoutParams.rightMargin = defaultWindowInsets.f11453c;
        db dbVar = pbVar.f3599s;
        if (dbVar != null) {
            dbVar.requestLayout();
        }
        eb ebVar = pbVar.v;
        if (ebVar != null) {
            ebVar.requestLayout();
        }
        return l1.f44738b;
    }

    @Override
    public boolean a(int r33, final android.view.View r34) {
        throw new UnsupportedOperationException("Method not decompiled: a1.c.a(int, android.view.View):boolean");
    }

    @Override
    public void b() {
        ((p1) this.f38b).invalidate();
    }

    @Override
    public void c(WebView webView, a5.a aVar, Uri uri, boolean z10, h hVar) {
        h hVar2;
        k kVar = (k) this.f38b;
        if (webView == kVar.f9543m && z10 && kVar.d.equals(uri.toString())) {
            int i10 = aVar.f297b;
            if (i10 == 0) {
                aVar.d(0);
                kVar.g((String) aVar.f298c, hVar);
            } else if (i10 == 1) {
                synchronized (kVar.f9533a) {
                    if (!kVar.f9546p && (hVar2 = kVar.f9544n) != null && hVar2 == hVar) {
                        aVar.d(1);
                        byte[] bArr = (byte[]) aVar.d;
                        Objects.requireNonNull(bArr);
                        kVar.f9539i.execute(new b7(22, kVar, bArr));
                    }
                }
            }
        }
    }

    @Override
    public void d(float f7, float f10, int i10, View view) {
        long j3;
        long j10;
        int i11;
        int i12;
        int i13;
        e3 e3Var = (e3) this.f38b;
        o0 o0Var = e3Var.f3031c;
        ArrayList arrayList = e3Var.f3040r;
        f1 f1Var = ((d1) view).f2878f;
        int i14 = e3Var.N;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            j3 = 0;
            if (i16 >= f1Var.f2978f.size()) {
                break;
            }
            e1 e1Var = (e1) f1Var.f2978f.get(i16);
            long j11 = e1Var.f2930g;
            if (j11 > 0 && currentTime - e1Var.d <= z.b(i14, (int) j11, 0)) {
                hashSet.add(Integer.valueOf(e1Var.f2925a));
            }
            i16++;
        }
        t1 t1Var = e3Var.P;
        if (t1Var != null) {
            j3 = t1Var.j();
        }
        int i17 = 0;
        int i18 = 0;
        while (i17 < arrayList.size()) {
            e1 e1Var2 = (e1) arrayList.get(i17);
            if (!e1Var2.f2926b && e1Var2.f2928e && e1Var2.f2930g < j3) {
                j10 = j3;
            } else {
                if (hashSet.contains(Integer.valueOf(e1Var2.f2925a))) {
                    j10 = j3;
                    if (e3Var.f3042w != f1Var.f2975b || (i13 = e3Var.f3043x) == 0 || e1Var2.f2925a < i13) {
                        i11 = e1Var2.f2925a;
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
                    e1 e1Var3 = (e1) arrayList.get(i15);
                    if (e1Var3.f2926b || !e1Var3.f2928e || e1Var3.f2930g >= j10) {
                        if (hashSet.contains(Integer.valueOf(e1Var3.f2925a))) {
                            i12 = e1Var3.f2925a;
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
        e3Var.f3042w = f1Var.f2975b;
        e3Var.f3043x = i12;
        e3Var.f3044y = true;
        m0 itemAnimator = o0Var.getItemAnimator();
        o0Var.setItemAnimator(null);
        e3Var.d.i1(i18, o0Var.getHeight() / 2, true);
        e3Var.f3034e.m(i18);
        o0Var.setItemAnimator(itemAnimator);
    }

    @Override
    public boolean d1(View view) {
        return false;
    }

    @Override
    public void e(boolean z10) {
        r6 r6Var = (r6) this.f38b;
        if (r6Var != null) {
            r6Var.c();
        }
    }

    @Override
    public void f() {
        float f7;
        rb rbVar = (rb) this.f38b;
        TextView textView = rbVar.f8007o1;
        boolean a2 = rbVar.D0.a();
        ImageView imageView = rbVar.f8005n1;
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
    public void g(b2 b2Var, int i10) {
        switch (this.f37a) {
            case 5:
                ((Runnable) this.f38b).run();
                return;
            case 20:
                pc pcVar = ((fc) ((r) this.f38b)).S1;
                dc dcVar = pcVar.X0;
                if (dcVar != null) {
                    dcVar.s(null, null, true);
                }
                rb rbVar = pcVar.f7938v1;
                if (rbVar != null) {
                    rbVar.q0();
                }
                fc fcVar = pcVar.f7878c1;
                if (fcVar != null) {
                    fcVar.setHasRoundVideo(false);
                }
                o8 o8Var = pcVar.K1;
                if (o8Var != null) {
                    File file = o8Var.f7799o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        pcVar.K1.f7799o0 = null;
                    }
                    if (pcVar.K1.f7801p0 != null) {
                        try {
                            new File(pcVar.K1.f7801p0).delete();
                        } catch (Exception unused2) {
                        }
                        pcVar.K1.f7801p0 = null;
                        return;
                    }
                    return;
                }
                return;
            default:
                ((f6) this.f38b).f7261a.f8010p2.r();
                return;
        }
    }

    @Override
    public void h(float f7, Canvas canvas, RectF rectF, boolean z10) {
        Path path = (Path) this.f38b;
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
        a4.k kVar = (a4.k) jVar;
        kVar.clear();
        ((a4.l) this.f38b).f289b.add(kVar);
    }

    @Override
    public void o(wh.h hVar, float f7, float f10) {
        ca caVar = (ca) this.f38b;
        da daVar = caVar.v;
        if (!daVar.f2912x) {
            hVar.f48656q = new ba(caVar, 2);
            float sqrt = (float) Math.sqrt(Math.pow(daVar.getHeight(), 2.0d) + Math.pow(daVar.getWidth(), 2.0d));
            ArrayList arrayList = caVar.f2857i;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((wh.h) obj).j(f7, f10, sqrt, false);
            }
        }
    }

    @Override
    public void onComplete(Task task) {
        switch (this.f37a) {
            case 16:
                b0.b((Intent) this.f38b);
                return;
            case 17:
                ((d0) this.f38b).f6377b.trySetResult(null);
                return;
            default:
                ((ScheduledFuture) this.f38b).cancel(false);
                return;
        }
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        di.jb jbVar = (di.jb) this.f38b;
        pc pcVar = jbVar.f7471a;
        l7 l7Var = pcVar.O0;
        int i10 = pcVar.f7876c;
        if (l7Var != null) {
            l7Var.g(true);
        }
        if (pcVar.q0()) {
            pcVar.f7927s.d();
        }
        if (pcVar.G1 != null && pcVar.B0 != null) {
            pcVar.Q1 = false;
            pcVar.R1 = false;
            h7 h7Var = pcVar.C0;
            if (h7Var != null) {
                h7Var.c(false);
            }
            if (j3 <= 800) {
                pcVar.h(false, true);
                pcVar.d0(false);
                pcVar.J0.b(false, true);
                l7 l7Var2 = pcVar.O0;
                if (l7Var2 != null) {
                    l7Var2.g(true);
                }
                try {
                    pcVar.G1.delete();
                    pcVar.G1 = null;
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
            pcVar.i0(false, true);
            o8 o9 = o8.o(pcVar.G1, str, j3);
            o9.J0 = pcVar.f7937v0;
            o9.K0 = pcVar.f7941w0;
            o9.B();
            pcVar.h(false, true);
            pcVar.d0(false);
            pcVar.J0.b(false, true);
            l7 l7Var3 = pcVar.O0;
            if (l7Var3 != null) {
                l7Var3.g(true);
            }
            if (pcVar.A0.j()) {
                pcVar.G1 = null;
                o9.P = 1.0f;
                if (pcVar.A0.l(o9)) {
                    o8 a2 = o8.a(pcVar.A0.getLayout(), pcVar.A0.getContent());
                    pcVar.K1 = a2;
                    ja.a(i10, a2);
                    pcVar.L1 = false;
                    int videoWidth = pcVar.B0.getVideoWidth();
                    int videoHeight = pcVar.B0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        o8 o8Var = pcVar.K1;
                        o8Var.f7792k0 = videoWidth;
                        o8Var.f7794l0 = videoHeight;
                        o8Var.A();
                    }
                }
                pcVar.m0(true);
                return;
            }
            pcVar.K1 = o9;
            ja.a(i10, o9);
            pcVar.L1 = false;
            int videoWidth2 = pcVar.B0.getVideoWidth();
            int videoHeight2 = pcVar.B0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                o8 o8Var2 = pcVar.K1;
                o8Var2.f7792k0 = videoWidth2;
                o8Var2.f7794l0 = videoHeight2;
                o8Var2.A();
            }
            pcVar.L(new hb(jbVar, 3), 0L);
        }
    }

    @Override
    public void onSuccess(Object obj) {
        boolean z10;
        switch (this.f37a) {
            case 0:
                ((f) this.f38b).invoke(obj);
                return;
            case 11:
                ((b1.f) this.f38b).invoke(obj);
                return;
            case 14:
                y yVar = (y) obj;
                if (((FirebaseMessaging) this.f38b).f6341e.n() && yVar.h.a() != null) {
                    synchronized (yVar) {
                        z10 = yVar.f6445g;
                    }
                    if (!z10) {
                        yVar.h(0L);
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ((b1.f) this.f38b).invoke(obj);
                return;
            case 27:
                ((e1.b) this.f38b).invoke(obj);
                return;
            default:
                ((e1.b) this.f38b).invoke(obj);
                return;
        }
    }

    @Override
    public void mo17run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        fb fbVar = (fb) this.f38b;
        h51 h51Var = (h51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = h51Var.d;
        o8 o8Var = (o8) h51Var.G;
        fbVar.c(false, true);
        pc pcVar = fbVar.O;
        if (o8Var == pcVar.K1 || pcVar.X1) {
            return;
        }
        pcVar.f7881d1.setSelected(i10);
        pcVar.X1 = true;
        ah.g gVar = new ah.g(pcVar, i10, 7);
        rb rbVar = pcVar.f7938v1;
        o8 o8Var2 = pcVar.K1;
        if (rbVar != null && o8Var2 != null) {
            if (!rbVar.u0()) {
                gVar.run();
                return;
            }
            o8Var2.f();
            boolean u02 = rbVar.u0();
            boolean z10 = rbVar.O0.getPainting().E;
            Utilities.searchQueue.postRunnable(new na(pcVar, rbVar, o8Var2.f7788i0, o8Var2.f7790j0, o8Var2, z10, u02, gVar, 0));
            return;
        }
        gVar.run();
    }

    @Override
    public Object then(Task task) {
        ((com.google.firebase.messaging.n) this.f38b).getClass();
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
        switch (this.f37a) {
            case 3:
                Long l4 = (Long) obj;
                return g1.a((g1) this.f38b, (Long) obj2);
            default:
                lr0 lr0Var = (lr0) this.f38b;
                Integer num = (Integer) obj2;
                if (((Integer) obj).intValue() == -1) {
                    new x(lr0Var.f4875a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new o1(lr0Var, 4)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
