package defpackage;

import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Intro;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.HttpGetFileTask;
import org.webrtc.VideoFrame;
public final class ea5 implements Runnable {
    public final byte a;
    public final Object b;

    public ea5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        xr5 xr5Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((ka5) obj).requestLayout();
                return;
            case 1:
                ((ra5) obj).h(true);
                return;
            case 2:
                bb5 bb5Var = (bb5) obj;
                int i2 = bb5.W;
                cb5 cb5Var = bb5Var.V;
                za5 za5Var = cb5Var.b;
                if (za5Var != null) {
                    if (za5Var.a.contains(bb5Var) || cb5Var.b.c.contains(bb5Var)) {
                        cb5Var.b.i(false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                mb5 mb5Var = (mb5) obj;
                mb5Var.Q0 = null;
                mb5Var.setVisibleParticipant(true);
                return;
            case 4:
                xc5 xc5Var = (xc5) obj;
                xc5Var.E = null;
                xc5Var.F = null;
                xc5Var.G = null;
                xc5Var.H = null;
                xc5Var.J = null;
                xc5Var.I = null;
                xc5Var.K = 0.0d;
                xc5Var.d0(false, true);
                xc5Var.d.m(null, null, xc5Var.r, null);
                xc5Var.f.setAnimation(xc5Var.S);
                xc5Var.S.H(0);
                return;
            case 5:
                bs2.v(null, 2131749132, d31.b0(((id5) obj).c), 2131624000, 36);
                return;
            case 6:
                bj3 bj3Var = ((ex9) ((ef5) obj)).f0;
                if (!bj3Var.x0.canScrollVertically(-1)) {
                    bj3Var.w0.g1(0, 0);
                    return;
                }
                return;
            case 7:
                ((ig5) obj).b.a();
                return;
            case 8:
                cm0 cm0Var = (cm0) obj;
                Utilities.g.c(new re4(cm0Var, new ArrayList(((ng5) cm0Var.c).f), ((ng5) cm0Var.c).r, (byte) 25));
                return;
            case 9:
                ((kj4) obj).Y();
                return;
            case 10:
                HttpGetFileTask.b((HttpGetFileTask) obj);
                return;
            case 11:
                ((in5) ((ak) obj).b).e(null);
                return;
            case 12:
                ((ImageReceiver) obj).invalidate();
                return;
            case 13:
                ep5 ep5Var = (ep5) obj;
                e29 e29Var = ep5Var.p1;
                if (ep5Var.r1) {
                    e29Var.getAnimatedDrawable().F(0);
                    e29Var.setAnimation(ep5Var.s1);
                    e29Var.d();
                    return;
                }
                return;
            case 14:
                yr5 yr5Var = (yr5) obj;
                xr5 xr5Var2 = yr5Var.J;
                int i3 = aob.d6;
                int w0 = aob.w0(null, i3, false);
                int i4 = xr5.E;
                xr5Var2.a(2131231539, 17, w0, true);
                yr5Var.J.c();
                xr5 xr5Var3 = yr5Var.J;
                xr5Var3.b(xr5Var3.w, 23, true);
                yr5Var.J.d();
                Intro.a(aob.w0(null, i3, false));
                return;
            case 15:
                long currentTimeMillis = System.currentTimeMillis();
                yr5 yr5Var2 = (yr5) ((wr5) obj).b;
                Intro.setPage(yr5Var2.I);
                Intro.setDate(((float) (currentTimeMillis - yr5Var2.K)) / 1000.0f);
                Intro.onDrawFrame(0);
                xr5 xr5Var4 = yr5Var2.J;
                if (xr5Var4 != null && xr5Var4.isAlive() && (eGLDisplay = (xr5Var = yr5Var2.J).c) != null && (eGLSurface = xr5Var.f) != null) {
                    try {
                        xr5Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 16:
                yr5 yr5Var3 = (yr5) ((ou0) obj).c;
                yr5Var3.presentFragment(new qh6(), true);
                yr5Var3.N = true;
                return;
            case 17:
                ((xr5) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 18:
                gs5 gs5Var = (gs5) obj;
                gs5Var.f.e.smoothScrollTo(0, gs5Var.getHeight());
                return;
            case 19:
                ((VideoFrame.I420Buffer) obj).release();
                return;
            case 20:
                qj4 qj4Var = (qj4) obj;
                sx5 sx5Var = (sx5) qj4Var.c;
                if (sx5Var == sx5.b) {
                    qj4Var.a(sx5.a, true);
                    return;
                } else if (sx5Var == sx5.c) {
                    qj4Var.a(sx5.d, true);
                    return;
                } else {
                    return;
                }
            case 21:
                ly5 ly5Var = ((hc8) obj).K1;
                if (ly5Var != null) {
                    ly5Var.J0();
                    return;
                }
                return;
            case 22:
                ((l01) obj).b();
                return;
            case 23:
                ((r16) obj).a.B0.setVisibility(8);
                return;
            case 24:
                c26 c26Var = (c26) obj;
                LaunchActivity launchActivity = c26Var.c;
                launchActivity.O0 = false;
                boolean z = launchActivity.N0;
                launchActivity.G();
                if (z != launchActivity.N0) {
                    c26Var.requestLayout();
                    return;
                }
                return;
            case 25:
                l46 l46Var = ((d46) obj).c;
                l46Var.r1.presentFragment(w1b.d0(l46Var.f1(), true));
                return;
            case 26:
                c66 c66Var = (c66) obj;
                g09 g09Var = c66Var.d;
                if (g09Var != null) {
                    c66Var.h0(g09Var.getCurrentLink());
                    return;
                }
                return;
            case 27:
                DictationAsr.k0((nm3) ((pm3) obj).b, false, new Object());
                return;
            case 28:
                x86 x86Var = (x86) obj;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = x86Var.a;
                ArrayList arrayList2 = new ArrayList(arrayList);
                int size = arrayList2.size();
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    w86 w86Var = (w86) obj2;
                    if (w86Var.b && uptimeMillis - w86Var.c > 5000) {
                        arrayList.remove(w86Var);
                        x86Var.removeView(w86Var);
                    }
                }
                ea5 ea5Var = x86Var.h;
                x86Var.removeCallbacks(ea5Var);
                if (!arrayList.isEmpty()) {
                    x86Var.postDelayed(ea5Var, 500L);
                    return;
                }
                return;
            default:
                o96 o96Var = (o96) obj;
                ArrayList arrayList3 = o96Var.s;
                ea5 ea5Var2 = o96Var.F;
                if (ea5Var2 != null) {
                    hl.r(ea5Var2);
                    o96Var.F = null;
                }
                int currentTime = ConnectionsManager.getInstance(o96Var.O).getCurrentTime();
                for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                    n96 n96Var = (n96) arrayList3.get(size2);
                    ArrayList arrayList4 = n96Var.f;
                    int size3 = arrayList4.size();
                    int i5 = 0;
                    while (true) {
                        if (i5 < size3) {
                            Object obj3 = arrayList4.get(i5);
                            i5++;
                            m96 m96Var = (m96) obj3;
                            long j = m96Var.g;
                            if (j <= 0 || currentTime - m96Var.d > eg5.b(n96Var.a, (int) j, 0)) {
                            }
                        } else {
                            arrayList3.remove(size2);
                        }
                    }
                }
                Collections.sort(arrayList3, new f03(o96Var, (byte) 27));
                o96Var.n.O(true);
                o96Var.t(true);
                o96Var.l();
                return;
        }
    }
}
