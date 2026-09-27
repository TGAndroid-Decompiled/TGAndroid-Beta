package a1;

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
import ci.ac;
import ci.bb;
import ci.db;
import ci.e6;
import ci.f7;
import ci.fa;
import ci.fb;
import ci.ja;
import ci.k8;
import ci.kc;
import ci.mb;
import ci.p1;
import ci.r;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.a0;
import com.google.firebase.messaging.d0;
import com.google.firebase.messaging.f0;
import ei.l;
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
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.ActionBar.c2;
import org.telegram.ui.Components.al0;
import org.telegram.ui.Components.nl0;
import org.telegram.ui.Components.ol0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.Components.zr0;
import pg.v1;
import r0.l1;
import r0.n;
import s4.m0;
import vh.k;
public final class c implements OnSuccessListener, i, ol0, Utilities.Callback2Return, nl0, b2, t9, dc, k, n, al0, Utilities.Callback5, v1, CameraController.VideoTakeCallback, Continuation, OnCompleteListener {
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
        if (!jcVar.f1066c) {
            i10 = l1Var.d();
        }
        marginLayoutParams.topMargin = i10;
        if (jcVar.f1066c) {
            a2 = l1Var.f42185a.f(2).d;
        } else {
            a2 = l1Var.a();
        }
        marginLayoutParams.bottomMargin = a2;
        marginLayoutParams.leftMargin = defaultWindowInsets.f10579a;
        marginLayoutParams.rightMargin = defaultWindowInsets.f10581c;
        xb xbVar = jcVar.f1100s;
        if (xbVar != null) {
            xbVar.requestLayout();
        }
        yb ybVar = jcVar.v;
        if (ybVar != null) {
            ybVar.requestLayout();
        }
        return l1.f42184b;
    }

    @Override
    public void a(float f7, Canvas canvas, RectF rectF, boolean z10) {
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
        w0 w0Var = r3Var.f1333c;
        ArrayList arrayList = r3Var.f1341r;
        n1 n1Var = ((ai.l1) view).f1176f;
        int i14 = r3Var.N;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            j3 = 0;
            if (i16 >= n1Var.f1291f.size()) {
                break;
            }
            m1 m1Var = (m1) n1Var.f1291f.get(i16);
            long j11 = m1Var.f1232g;
            if (j11 > 0 && currentTime - m1Var.d <= g0.b(i14, (int) j11, 0)) {
                hashSet.add(Integer.valueOf(m1Var.f1228a));
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
            if (!m1Var2.f1229b && m1Var2.e && m1Var2.f1232g < j3) {
                j10 = j3;
            } else {
                if (hashSet.contains(Integer.valueOf(m1Var2.f1228a))) {
                    j10 = j3;
                    if (r3Var.f1343w != n1Var.f1289b || (i13 = r3Var.f1344x) == 0 || m1Var2.f1228a < i13) {
                        i11 = m1Var2.f1228a;
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
                    if (m1Var3.f1229b || !m1Var3.e || m1Var3.f1232g >= j10) {
                        if (hashSet.contains(Integer.valueOf(m1Var3.f1228a))) {
                            i12 = m1Var3.f1228a;
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
        r3Var.f1343w = n1Var.f1289b;
        r3Var.f1344x = i12;
        r3Var.f1345y = true;
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
        ((p1) this.f37b).invalidate();
    }

    @Override
    public void f(c2 c2Var, int i10) {
        switch (this.f36a) {
            case 5:
                ((Runnable) this.f37b).run();
                return;
            case 14:
                kc kcVar = ((ac) ((r) this.f37b)).S1;
                ci.yb ybVar = kcVar.X0;
                if (ybVar != null) {
                    ybVar.s(null, null, true);
                }
                mb mbVar = kcVar.f5050v1;
                if (mbVar != null) {
                    mbVar.q0();
                }
                ac acVar = kcVar.f4991c1;
                if (acVar != null) {
                    acVar.setHasRoundVideo(false);
                }
                k8 k8Var = kcVar.K1;
                if (k8Var != null) {
                    File file = k8Var.f4950o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        kcVar.K1.f4950o0 = null;
                    }
                    if (kcVar.K1.f4952p0 != null) {
                        try {
                            new File(kcVar.K1.f4952p0).delete();
                        } catch (Exception unused2) {
                        }
                        kcVar.K1.f4952p0 = null;
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ((e6) this.f37b).f4648a.f5364p2.r();
                return;
            case 28:
                ((ei.e) this.f37b).run();
                return;
            default:
                l lVar = (l) this.f37b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = lVar.getMessagesController().getInputUser(lVar.P);
                updatestarrefprogram.commission_permille = 0;
                c2 c2Var2 = new c2(lVar.getParentActivity(), 3, null);
                c2Var2.q(150L);
                lVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ei.b(lVar, c2Var2, 0));
                return;
        }
    }

    @Override
    public void g() {
        float f7;
        mb mbVar = (mb) this.f37b;
        TextView textView = mbVar.f5361o1;
        boolean a2 = mbVar.D0.a();
        ImageView imageView = mbVar.f5359n1;
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
    public void h(j jVar) {
        a4.k kVar = (a4.k) jVar;
        kVar.clear();
        ((a4.l) this.f37b).f270b.add(kVar);
    }

    @Override
    public void l(vh.g gVar, float f7, float f10) {
        va vaVar = (va) this.f37b;
        wa waVar = vaVar.v;
        if (!waVar.f1673x) {
            gVar.f44743q = new ua(vaVar, 2);
            float sqrt = (float) Math.sqrt(Math.pow(waVar.getHeight(), 2.0d) + Math.pow(waVar.getWidth(), 2.0d));
            ArrayList arrayList = vaVar.f1627i;
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
                d0.b((Intent) this.f37b);
                return;
            case 24:
                ((f0) this.f37b).f7300b.trySetResult(null);
                return;
            default:
                ((ScheduledFuture) this.f37b).cancel(false);
                return;
        }
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        fb fbVar = (fb) this.f37b;
        kc kcVar = fbVar.f4711a;
        ci.j7 j7Var = kcVar.O0;
        int i10 = kcVar.f4989c;
        if (j7Var != null) {
            j7Var.g(true);
        }
        if (kcVar.q0()) {
            kcVar.f5039s.d();
        }
        if (kcVar.G1 != null && kcVar.B0 != null) {
            kcVar.Q1 = false;
            kcVar.R1 = false;
            f7 f7Var = kcVar.C0;
            if (f7Var != null) {
                f7Var.c(false);
            }
            if (j3 <= 800) {
                kcVar.h(false, true);
                kcVar.d0(false);
                kcVar.J0.b(false, true);
                ci.j7 j7Var2 = kcVar.O0;
                if (j7Var2 != null) {
                    j7Var2.g(true);
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
            kcVar.i0(false, true);
            k8 o9 = k8.o(kcVar.G1, str, j3);
            o9.J0 = kcVar.f5049v0;
            o9.K0 = kcVar.f5053w0;
            o9.B();
            kcVar.h(false, true);
            kcVar.d0(false);
            kcVar.J0.b(false, true);
            ci.j7 j7Var3 = kcVar.O0;
            if (j7Var3 != null) {
                j7Var3.g(true);
            }
            if (kcVar.A0.j()) {
                kcVar.G1 = null;
                o9.P = 1.0f;
                if (kcVar.A0.l(o9)) {
                    k8 a2 = k8.a(kcVar.A0.getLayout(), kcVar.A0.getContent());
                    kcVar.K1 = a2;
                    fa.a(i10, a2);
                    kcVar.L1 = false;
                    int videoWidth = kcVar.B0.getVideoWidth();
                    int videoHeight = kcVar.B0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        k8 k8Var = kcVar.K1;
                        k8Var.f4943k0 = videoWidth;
                        k8Var.f4945l0 = videoHeight;
                        k8Var.A();
                    }
                }
                kcVar.m0(true);
                return;
            }
            kcVar.K1 = o9;
            fa.a(i10, o9);
            kcVar.L1 = false;
            int videoWidth2 = kcVar.B0.getVideoWidth();
            int videoHeight2 = kcVar.B0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                k8 k8Var2 = kcVar.K1;
                k8Var2.f4943k0 = videoWidth2;
                k8Var2.f4945l0 = videoHeight2;
                k8Var2.A();
            }
            kcVar.L(new db(fbVar, 3), 0L);
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
                a0 a0Var = (a0) obj;
                if (((FirebaseMessaging) this.f37b).e.n() && a0Var.h.a() != null) {
                    synchronized (a0Var) {
                        z10 = a0Var.f7279g;
                    }
                    if (!z10) {
                        a0Var.h(0L);
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
        bb bbVar = (bb) this.f37b;
        x51 x51Var = (x51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = x51Var.d;
        k8 k8Var = (k8) x51Var.G;
        bbVar.c(false, true);
        kc kcVar = bbVar.O;
        if (k8Var == kcVar.K1 || kcVar.X1) {
            return;
        }
        kcVar.f4994d1.setSelected(i10);
        kcVar.X1 = true;
        o8 o8Var = new o8(kcVar, i10, 6);
        mb mbVar = kcVar.f5050v1;
        k8 k8Var2 = kcVar.K1;
        if (mbVar != null && k8Var2 != null) {
            if (!mbVar.u0()) {
                o8Var.run();
                return;
            }
            k8Var2.f();
            boolean u02 = mbVar.u0();
            boolean z10 = mbVar.O0.getPainting().E;
            Utilities.searchQueue.postRunnable(new ja(kcVar, mbVar, k8Var2.f4939i0, k8Var2.f4941j0, k8Var2, z10, u02, o8Var, 0));
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
                zr0 zr0Var = (zr0) this.f37b;
                Integer num = (Integer) obj2;
                if (((Integer) obj).intValue() == -1) {
                    new y(zr0Var.f3601a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(zr0Var, 4)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override
    public void r0(View view, float f7, float f10) {
    }
}
