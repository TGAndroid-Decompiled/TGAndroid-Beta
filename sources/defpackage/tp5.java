package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TimeZone;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.Intro;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.webrtc.VideoFrame;
public final class tp5 implements Runnable {
    public final byte a;
    public final Object b;

    public tp5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        vp5 vp5Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                long currentTimeMillis = System.currentTimeMillis();
                wp5 wp5Var = (wp5) ((up5) obj).b;
                Intro.setPage(wp5Var.I);
                Intro.setDate(((float) (currentTimeMillis - wp5Var.K)) / 1000.0f);
                Intro.onDrawFrame(0);
                vp5 vp5Var2 = wp5Var.J;
                if (vp5Var2 != null && vp5Var2.isAlive() && (eGLDisplay = (vp5Var = wp5Var.J).c) != null && (eGLSurface = vp5Var.f) != null) {
                    try {
                        vp5Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 1:
                wp5 wp5Var2 = (wp5) ((fu0) obj).c;
                wp5Var2.presentFragment(new mf6(), true);
                wp5Var2.N = true;
                return;
            case 2:
                ((vp5) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 3:
                fq5 fq5Var = (fq5) obj;
                fq5Var.f.e.smoothScrollTo(0, fq5Var.getHeight());
                return;
            case 4:
                ((VideoFrame.I420Buffer) obj).release();
                return;
            case 5:
                oh4 oh4Var = (oh4) obj;
                nv5 nv5Var = (nv5) oh4Var.c;
                if (nv5Var == nv5.b) {
                    oh4Var.a(nv5.a, true);
                    return;
                } else if (nv5Var == nv5.c) {
                    oh4Var.a(nv5.d, true);
                    return;
                } else {
                    return;
                }
            case 6:
                gw5 gw5Var = ((q88) obj).Q1;
                if (gw5Var != null) {
                    gw5Var.I0();
                    return;
                }
                return;
            case 7:
                ((c01) obj).b();
                return;
            case 8:
                ((oz5) obj).a.B0.setVisibility(8);
                return;
            case 9:
                zz5 zz5Var = (zz5) obj;
                LaunchActivity launchActivity = zz5Var.c;
                launchActivity.O0 = false;
                boolean z = launchActivity.N0;
                launchActivity.F();
                if (z != launchActivity.N0) {
                    zz5Var.requestLayout();
                    return;
                }
                return;
            case 10:
                h26 h26Var = ((z16) obj).c;
                h26Var.r1.presentFragment(uxa.d0(h26Var.e1(), true));
                return;
            case 11:
                y36 y36Var = (y36) obj;
                vw8 vw8Var = y36Var.d;
                if (vw8Var != null) {
                    y36Var.h0(vw8Var.getCurrentLink());
                    return;
                }
                return;
            case 12:
                DictationAsr.i0((vl3) ((xl3) obj).b, false, new Object());
                return;
            case 13:
                t66 t66Var = (t66) obj;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = t66Var.a;
                ArrayList arrayList2 = new ArrayList(arrayList);
                int size = arrayList2.size();
                int i = 0;
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    s66 s66Var = (s66) obj2;
                    if (s66Var.b && uptimeMillis - s66Var.c > 5000) {
                        arrayList.remove(s66Var);
                        t66Var.removeView(s66Var);
                    }
                }
                tp5 tp5Var = t66Var.h;
                t66Var.removeCallbacks(tp5Var);
                if (!arrayList.isEmpty()) {
                    t66Var.postDelayed(tp5Var, 500L);
                    return;
                }
                return;
            case 14:
                k76 k76Var = (k76) obj;
                ArrayList arrayList3 = k76Var.s;
                tp5 tp5Var2 = k76Var.F;
                if (tp5Var2 != null) {
                    gl.r(tp5Var2);
                    k76Var.F = null;
                }
                int currentTime = ConnectionsManager.getInstance(k76Var.O).getCurrentTime();
                for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                    j76 j76Var = (j76) arrayList3.get(size2);
                    ArrayList arrayList4 = j76Var.f;
                    int size3 = arrayList4.size();
                    int i2 = 0;
                    while (true) {
                        if (i2 < size3) {
                            Object obj3 = arrayList4.get(i2);
                            i2++;
                            i76 i76Var = (i76) obj3;
                            long j = i76Var.g;
                            if (j <= 0 || currentTime - i76Var.d > de5.b(j76Var.a, (int) j, 0)) {
                            }
                        } else {
                            arrayList3.remove(size2);
                        }
                    }
                }
                Collections.sort(arrayList3, new mz2(k76Var, (byte) 24));
                k76Var.n.O(true);
                k76Var.t(true);
                k76Var.l();
                return;
            case 15:
                xa8 xa8Var = ((w76) obj).e.a;
                if (xa8Var != null) {
                    xa8Var.d();
                    return;
                }
                return;
            case 16:
                ((SurfaceTexture) obj).release();
                return;
            case 17:
                if (!((k96) ((zj) obj).b).p0().getTimeZone().equals(TimeZone.getDefault())) {
                    k96.D0().Y0();
                    return;
                }
                return;
            case 18:
                try {
                    o39 currentListView = ((qa6) ((oa6) obj).p0).R0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        return;
                    }
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 19:
                EditTextBoldCursor[] editTextBoldCursorArr = ((gd6) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    gl.E3(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 20:
                jd6 jd6Var = (jd6) obj;
                ry8 ry8Var = jd6Var.e;
                EditTextBoldCursor editTextBoldCursor2 = jd6Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    jd6Var.E.L1(editTextBoldCursor2);
                    ry8Var.getAnimatedDrawable().I(0, false, false);
                    ry8Var.d();
                    return;
                }
                return;
            case 21:
                ((ry8) obj).d();
                return;
            case 22:
                double currentTimeMillis2 = System.currentTimeMillis();
                qd6 qd6Var = (qd6) ((aw3) obj).b;
                double d = qd6Var.R;
                oe6 oe6Var = qd6Var.w;
                qd6Var.R = currentTimeMillis2;
                int i3 = (int) (qd6Var.Q - (currentTimeMillis2 - d));
                qd6Var.Q = i3;
                if (i3 >= 1000) {
                    int i4 = i3 / 1000;
                    int i5 = i4 / 60;
                    int i6 = i4 - (i5 * 60);
                    oe6Var.setTextSize(1, 13.0f);
                    int i7 = qd6Var.F;
                    if (i7 != 4 && i7 != 3 && i7 != 11) {
                        if (i7 == 2) {
                            oe6Var.setText(k96.a0(null, null, 2131745104, Integer.valueOf(i5), Integer.valueOf(i6)));
                            return;
                        }
                        return;
                    }
                    oe6Var.setText(k96.a0(null, null, 2131752617, Integer.valueOf(i5), Integer.valueOf(i6)));
                    return;
                }
                qd6Var.q();
                int i8 = qd6Var.F;
                if (i8 == 3 || i8 == 4 || i8 == 2 || i8 == 11) {
                    oe6Var.setTextSize(1, 15.0f);
                    int i9 = qd6Var.F;
                    if (i9 == 4) {
                        oe6Var.setText(k96.M0(2131745984, null));
                    } else if (i9 == 15) {
                        oe6Var.setText(k96.M0(2131751435, null));
                    } else if (i9 != 11 && i9 != 3) {
                        oe6Var.setText(gl.E2(k96.M0(2131745985, null), true, 0.0f, 0.0f));
                    } else {
                        oe6Var.setText(k96.M0(2131745983, null));
                    }
                    int i10 = bkb.O9;
                    zkb.X(oe6Var, i10, null);
                    oe6Var.setTag(2131296388, Integer.valueOf(i10));
                    return;
                }
                return;
            case 23:
                double currentTimeMillis3 = System.currentTimeMillis();
                qe6 qe6Var = ((pe6) obj).b;
                double d2 = currentTimeMillis3 - qe6Var.e0;
                qe6Var.e0 = currentTimeMillis3;
                int i11 = (int) (qe6Var.c0 - d2);
                qe6Var.c0 = i11;
                if (i11 <= 1000) {
                    qe6.n(qe6Var);
                    qe6Var.w.setVisibility(8);
                    oe6 oe6Var2 = qe6Var.y;
                    if (oe6Var2 != null) {
                        oe6Var2.setVisibility(0);
                    }
                    qe6Var.s();
                    return;
                }
                return;
            case 24:
                double currentTimeMillis4 = System.currentTimeMillis();
                qe6 qe6Var2 = ((pe6) obj).b;
                double d3 = qe6Var2.d0;
                oe6 oe6Var3 = qe6Var2.w;
                qe6Var2.d0 = currentTimeMillis4;
                int i12 = (int) (qe6Var2.b0 - (currentTimeMillis4 - d3));
                qe6Var2.b0 = i12;
                if (i12 >= 1000) {
                    int i13 = i12 / 1000;
                    int i14 = i13 / 60;
                    int i15 = i13 - (i14 * 60);
                    int i16 = qe6Var2.j0;
                    if (i16 != 4 && i16 != 3 && i16 != 11) {
                        if (qe6Var2.i0 == 2 && (i16 == 2 || i16 == 17 || i16 == 16)) {
                            oe6Var3.setText(k96.a0("ResendSmsAvailableIn", null, 2131745926, Integer.valueOf(i14), Integer.valueOf(i15)));
                            return;
                        } else if (i16 == 2 || i16 == 17 || i16 == 16) {
                            oe6Var3.setText(k96.a0("SmsAvailableIn", null, 2131745105, Integer.valueOf(i14), Integer.valueOf(i15)));
                            return;
                        } else {
                            return;
                        }
                    }
                    oe6Var3.setText(k96.a0("CallAvailableIn", null, 2131752618, Integer.valueOf(i14), Integer.valueOf(i15)));
                    return;
                }
                qe6Var2.t();
                int i17 = qe6Var2.j0;
                if (i17 == 3 || i17 == 4 || i17 == 2 || i17 == 17 || i17 == 16 || i17 == 11) {
                    if (i17 == 4) {
                        oe6Var3.setText(k96.M0(2131745984, "RequestCallButton"));
                    } else if (i17 != 11 && i17 != 3) {
                        oe6Var3.setText(k96.M0(2131745982, "RequestSmsButton"));
                    } else {
                        oe6Var3.setText(k96.M0(2131745983, null));
                    }
                    int i18 = bkb.O9;
                    zkb.X(oe6Var3, i18, null);
                    oe6Var3.setTag(2131296388, Integer.valueOf(i18));
                    return;
                }
                return;
            case 25:
                ((e45) obj).run();
                return;
            case 26:
                ((ch6) obj).q();
                return;
            case 27:
                fi6 fi6Var = (fi6) obj;
                fi6Var.k = false;
                fi6Var.c();
                return;
            case 28:
                cj6 cj6Var = (cj6) obj;
                if (cj6Var.d) {
                    cj6Var.e = true;
                    cj6Var.r = false;
                    cj6Var.f = 0.0f;
                    cj6Var.h = SystemClock.uptimeMillis();
                    cj6Var.invalidate();
                    return;
                }
                return;
            default:
                ((ll6) obj).d.l(true, true, false, false);
                return;
        }
    }
}
