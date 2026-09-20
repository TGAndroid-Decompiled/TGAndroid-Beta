package a1;

import a4.k;
import ai.d2;
import ai.dc;
import ai.g0;
import ai.i7;
import ai.jc;
import ai.m1;
import ai.n1;
import ai.n8;
import ai.o1;
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
import ci.cc;
import ci.ec;
import ci.f6;
import ci.fb;
import ci.h7;
import ci.hb;
import ci.ja;
import ci.jb;
import ci.l7;
import ci.na;
import ci.o8;
import ci.oc;
import ci.p1;
import ci.qb;
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
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.ui.ActionBar.a2;
import org.telegram.ui.ActionBar.b2;
import org.telegram.ui.Components.kl0;
import org.telegram.ui.Components.ll0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.xk0;
import org.telegram.ui.Components.xr0;
import pg.u1;
import r0.l1;
import r0.n;
import s4.m0;
import vh.h;
import vh.l;
public final class c implements OnSuccessListener, i, ll0, Utilities.Callback2Return, kl0, a2, t9, dc, l, n, xk0, Utilities.Callback5, u1, CameraController.VideoTakeCallback, Continuation, OnCompleteListener {
    public final int f36a;
    public final Object f37b;

    public c(Object obj, int i10) {
        this.f36a = i10;
        this.f37b = obj;
    }

    @Override
    public l1 P0(View view, l1 l1Var) {
        int a2;
        jc jcVar = (jc) this.f37b;
        int i10 = 0;
        i0.b defaultWindowInsets = AndroidUtilities.getDefaultWindowInsets(l1Var, false);
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) jcVar.v.getLayoutParams();
        if (!jcVar.f1073c) {
            i10 = l1Var.d();
        }
        marginLayoutParams.topMargin = i10;
        if (jcVar.f1073c) {
            a2 = l1Var.f42154a.f(2).d;
        } else {
            a2 = l1Var.a();
        }
        marginLayoutParams.bottomMargin = a2;
        marginLayoutParams.leftMargin = defaultWindowInsets.f10592a;
        marginLayoutParams.rightMargin = defaultWindowInsets.f10594c;
        xb xbVar = jcVar.f1107s;
        if (xbVar != null) {
            xbVar.requestLayout();
        }
        yb ybVar = jcVar.v;
        if (ybVar != null) {
            ybVar.requestLayout();
        }
        return l1.f42153b;
    }

    @Override
    public void a() {
        ((p1) this.f37b).invalidate();
    }

    @Override
    public void b(boolean z10) {
        i7 i7Var = (i7) this.f37b;
        if (i7Var != null) {
            i7Var.c();
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
        w0 w0Var = r3Var.f1330c;
        ArrayList arrayList = r3Var.f1338r;
        n1 n1Var = ((ai.l1) view).f1174f;
        int i14 = r3Var.N;
        int currentTime = ConnectionsManager.getInstance(i14).getCurrentTime();
        HashSet hashSet = new HashSet();
        int i15 = 0;
        int i16 = 0;
        while (true) {
            j3 = 0;
            if (i16 >= n1Var.f1282f.size()) {
                break;
            }
            m1 m1Var = (m1) n1Var.f1282f.get(i16);
            long j11 = m1Var.f1231g;
            if (j11 > 0 && currentTime - m1Var.d <= g0.b(i14, (int) j11, 0)) {
                hashSet.add(Integer.valueOf(m1Var.f1227a));
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
            if (!m1Var2.f1228b && m1Var2.e && m1Var2.f1231g < j3) {
                j10 = j3;
            } else {
                if (hashSet.contains(Integer.valueOf(m1Var2.f1227a))) {
                    j10 = j3;
                    if (r3Var.f1340w != n1Var.f1280b || (i13 = r3Var.f1341x) == 0 || m1Var2.f1227a < i13) {
                        i11 = m1Var2.f1227a;
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
                    if (m1Var3.f1228b || !m1Var3.e || m1Var3.f1231g >= j10) {
                        if (hashSet.contains(Integer.valueOf(m1Var3.f1227a))) {
                            i12 = m1Var3.f1227a;
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
        r3Var.f1340w = n1Var.f1280b;
        r3Var.f1341x = i12;
        r3Var.f1342y = true;
        m0 itemAnimator = w0Var.getItemAnimator();
        w0Var.setItemAnimator(null);
        r3Var.d.i1(i18, w0Var.getHeight() / 2, true);
        r3Var.e.m(i18);
        w0Var.setItemAnimator(itemAnimator);
    }

    @Override
    public boolean c1(View view) {
        return false;
    }

    @Override
    public boolean d(int r33, final android.view.View r34) {
        throw new UnsupportedOperationException("Method not decompiled: a1.c.d(int, android.view.View):boolean");
    }

    @Override
    public void e() {
        float f7;
        qb qbVar = (qb) this.f37b;
        TextView textView = qbVar.f5436o1;
        boolean a2 = qbVar.D0.a();
        ImageView imageView = qbVar.f5434n1;
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
    public void f(float f7, Canvas canvas, RectF rectF, boolean z10) {
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
    public void g(j jVar) {
        k kVar = (k) jVar;
        kVar.clear();
        ((a4.l) this.f37b).f270b.add(kVar);
    }

    @Override
    public void k(b2 b2Var, int i10) {
        switch (this.f36a) {
            case 5:
                ((Runnable) this.f37b).run();
                return;
            case 14:
                oc ocVar = ((ec) ((r) this.f37b)).S1;
                cc ccVar = ocVar.X0;
                if (ccVar != null) {
                    ccVar.s(null, null, true);
                }
                qb qbVar = ocVar.f5273v1;
                if (qbVar != null) {
                    qbVar.q0();
                }
                ec ecVar = ocVar.f5214c1;
                if (ecVar != null) {
                    ecVar.setHasRoundVideo(false);
                }
                o8 o8Var = ocVar.K1;
                if (o8Var != null) {
                    File file = o8Var.f5173o0;
                    if (file != null) {
                        try {
                            file.delete();
                        } catch (Exception unused) {
                        }
                        ocVar.K1.f5173o0 = null;
                    }
                    if (ocVar.K1.f5175p0 != null) {
                        try {
                            new File(ocVar.K1.f5175p0).delete();
                        } catch (Exception unused2) {
                        }
                        ocVar.K1.f5175p0 = null;
                        return;
                    }
                    return;
                }
                return;
            case 19:
                ((f6) this.f37b).f4662a.f5439p2.r();
                return;
            case 28:
                ((ei.e) this.f37b).run();
                return;
            default:
                ei.l lVar = (ei.l) this.f37b;
                TL_bots.updateStarRefProgram updatestarrefprogram = new TL_bots.updateStarRefProgram();
                updatestarrefprogram.bot = lVar.getMessagesController().getInputUser(lVar.P);
                updatestarrefprogram.commission_permille = 0;
                b2 b2Var2 = new b2(lVar.getParentActivity(), 3, null);
                b2Var2.q(150L);
                lVar.getConnectionsManager().sendRequest(updatestarrefprogram, new ei.b(lVar, b2Var2, 0));
                return;
        }
    }

    @Override
    public void l(h hVar, float f7, float f10) {
        va vaVar = (va) this.f37b;
        wa waVar = vaVar.v;
        if (!waVar.f1676x) {
            hVar.f44714q = new ua(vaVar, 2);
            float sqrt = (float) Math.sqrt(Math.pow(waVar.getHeight(), 2.0d) + Math.pow(waVar.getWidth(), 2.0d));
            ArrayList arrayList = vaVar.f1624i;
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                ((h) obj).j(f7, f10, sqrt, false);
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
                ((e0) this.f37b).f7309b.trySetResult(null);
                return;
            default:
                ((ScheduledFuture) this.f37b).cancel(false);
                return;
        }
    }

    @Override
    public void onFinishVideoRecording(String str, long j3) {
        jb jbVar = (jb) this.f37b;
        oc ocVar = jbVar.f4860a;
        l7 l7Var = ocVar.O0;
        int i10 = ocVar.f5212c;
        if (l7Var != null) {
            l7Var.g(true);
        }
        if (ocVar.q0()) {
            ocVar.f5262s.d();
        }
        if (ocVar.G1 != null && ocVar.B0 != null) {
            ocVar.Q1 = false;
            ocVar.R1 = false;
            h7 h7Var = ocVar.C0;
            if (h7Var != null) {
                h7Var.c(false);
            }
            if (j3 <= 800) {
                ocVar.h(false, true);
                ocVar.d0(false);
                ocVar.J0.b(false, true);
                l7 l7Var2 = ocVar.O0;
                if (l7Var2 != null) {
                    l7Var2.g(true);
                }
                try {
                    ocVar.G1.delete();
                    ocVar.G1 = null;
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
            ocVar.i0(false, true);
            o8 o9 = o8.o(ocVar.G1, str, j3);
            o9.J0 = ocVar.f5272v0;
            o9.K0 = ocVar.f5276w0;
            o9.B();
            ocVar.h(false, true);
            ocVar.d0(false);
            ocVar.J0.b(false, true);
            l7 l7Var3 = ocVar.O0;
            if (l7Var3 != null) {
                l7Var3.g(true);
            }
            if (ocVar.A0.j()) {
                ocVar.G1 = null;
                o9.P = 1.0f;
                if (ocVar.A0.l(o9)) {
                    o8 a2 = o8.a(ocVar.A0.getLayout(), ocVar.A0.getContent());
                    ocVar.K1 = a2;
                    ja.a(i10, a2);
                    ocVar.L1 = false;
                    int videoWidth = ocVar.B0.getVideoWidth();
                    int videoHeight = ocVar.B0.getVideoHeight();
                    if (videoWidth > 0 && videoHeight > 0) {
                        o8 o8Var = ocVar.K1;
                        o8Var.f5166k0 = videoWidth;
                        o8Var.f5168l0 = videoHeight;
                        o8Var.A();
                    }
                }
                ocVar.m0(true);
                return;
            }
            ocVar.K1 = o9;
            ja.a(i10, o9);
            ocVar.L1 = false;
            int videoWidth2 = ocVar.B0.getVideoWidth();
            int videoHeight2 = ocVar.B0.getVideoHeight();
            if (videoWidth2 > 0 && videoHeight2 > 0) {
                o8 o8Var2 = ocVar.K1;
                o8Var2.f5166k0 = videoWidth2;
                o8Var2.f5168l0 = videoHeight2;
                o8Var2.A();
            }
            ocVar.L(new hb(jbVar, 3), 0L);
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
                        z10 = zVar.f7369g;
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
        fb fbVar = (fb) this.f37b;
        w51 w51Var = (w51) obj;
        View view = (View) obj2;
        ((Integer) obj3).getClass();
        ((Float) obj4).getClass();
        ((Float) obj5).getClass();
        int i10 = w51Var.d;
        o8 o8Var = (o8) w51Var.G;
        fbVar.c(false, true);
        oc ocVar = fbVar.O;
        if (o8Var == ocVar.K1 || ocVar.X1) {
            return;
        }
        ocVar.f5217d1.setSelected(i10);
        ocVar.X1 = true;
        n8 n8Var = new n8(ocVar, i10, 6);
        qb qbVar = ocVar.f5273v1;
        o8 o8Var2 = ocVar.K1;
        if (qbVar != null && o8Var2 != null) {
            if (!qbVar.u0()) {
                n8Var.run();
                return;
            }
            o8Var2.f();
            boolean u02 = qbVar.u0();
            boolean z10 = qbVar.O0.getPainting().E;
            Utilities.searchQueue.postRunnable(new na(ocVar, qbVar, o8Var2.f5162i0, o8Var2.f5164j0, o8Var2, z10, u02, n8Var, 0));
            return;
        }
        n8Var.run();
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
                xr0 xr0Var = (xr0) this.f37b;
                Integer num = (Integer) obj2;
                if (((Integer) obj).intValue() == -1) {
                    new y(xr0Var.f3607a, LocaleController.getString(R.string.ProfileBotPreviewLanguageChoose), new y1(xr0Var, 4)).show();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
        }
    }

    @Override
    public void q0(View view, float f7, float f10) {
    }
}
