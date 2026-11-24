package defpackage;

import android.graphics.SurfaceTexture;
import android.os.Looper;
import android.os.SystemClock;
import java.util.ArrayList;
import java.util.Collections;
import java.util.TimeZone;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.Intro;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Dictation.DictationAsr;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.web.HttpGetFileTask;
import org.webrtc.VideoFrame;
public final class kg5 implements Runnable {
    public final byte a;
    public final Object b;

    public kg5(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void run() {
        ur5 ur5Var;
        EGLDisplay eGLDisplay;
        EGLSurface eGLSurface;
        byte b = this.a;
        int i = 0;
        Object obj = this.b;
        switch (b) {
            case 0:
                cn0 cn0Var = (cn0) obj;
                Utilities.g.c(new if4(cn0Var, new ArrayList(((lg5) cn0Var.c).f), ((lg5) cn0Var.c).r, (byte) 22));
                return;
            case 1:
                ((lj4) obj).A();
                return;
            case 2:
                HttpGetFileTask.a((HttpGetFileTask) obj);
                return;
            case 3:
                ((fn5) ((zk) obj).b).e(null);
                return;
            case 4:
                ((ImageReceiver) obj).invalidate();
                return;
            case 5:
                bp5 bp5Var = (bp5) obj;
                s09 s09Var = bp5Var.p1;
                if (bp5Var.r1) {
                    s09Var.getAnimatedDrawable().F(0);
                    s09Var.setAnimation(bp5Var.s1);
                    s09Var.d();
                    return;
                }
                return;
            case 6:
                vr5 vr5Var = (vr5) obj;
                ur5 ur5Var2 = vr5Var.J;
                int i2 = cmb.c6;
                int w0 = cmb.w0(null, i2, false);
                int i3 = ur5.E;
                ur5Var2.a(2131231540, 17, w0, true);
                vr5Var.J.c();
                ur5 ur5Var3 = vr5Var.J;
                ur5Var3.b(ur5Var3.w, 23, true);
                vr5Var.J.d();
                Intro.a(cmb.w0(null, i2, false));
                return;
            case 7:
                long currentTimeMillis = System.currentTimeMillis();
                vr5 vr5Var2 = (vr5) ((tr5) obj).b;
                Intro.setPage(vr5Var2.I);
                Intro.setDate(((float) (currentTimeMillis - vr5Var2.K)) / 1000.0f);
                Intro.onDrawFrame(0);
                ur5 ur5Var4 = vr5Var2.J;
                if (ur5Var4 != null && ur5Var4.isAlive() && (eGLDisplay = (ur5Var = vr5Var2.J).c) != null && (eGLSurface = ur5Var.f) != null) {
                    try {
                        ur5Var.b.eglSwapBuffers(eGLDisplay, eGLSurface);
                        return;
                    } catch (Exception unused) {
                        return;
                    }
                }
                return;
            case 8:
                vr5 vr5Var3 = (vr5) ((ov0) obj).c;
                vr5Var3.presentFragment(new mh6(), true);
                vr5Var3.N = true;
                return;
            case 9:
                ((ur5) obj).finish();
                Looper myLooper = Looper.myLooper();
                if (myLooper != null) {
                    myLooper.quit();
                    return;
                }
                return;
            case 10:
                ds5 ds5Var = (ds5) obj;
                ds5Var.f.e.smoothScrollTo(0, ds5Var.getHeight());
                return;
            case 11:
                ((VideoFrame.I420Buffer) obj).release();
                return;
            case 12:
                sj4 sj4Var = (sj4) obj;
                nx5 nx5Var = (nx5) sj4Var.c;
                if (nx5Var == nx5.b) {
                    sj4Var.a(nx5.a, true);
                    return;
                } else if (nx5Var == nx5.c) {
                    sj4Var.a(nx5.d, true);
                    return;
                } else {
                    return;
                }
            case 13:
                gy5 gy5Var = ((sa8) obj).Q1;
                if (gy5Var != null) {
                    gy5Var.I0();
                    return;
                }
                return;
            case 14:
                ((k11) obj).b();
                return;
            case 15:
                ((o16) obj).a.B0.setVisibility(8);
                return;
            case 16:
                z16 z16Var = (z16) obj;
                LaunchActivity launchActivity = z16Var.c;
                launchActivity.O0 = false;
                boolean z = launchActivity.N0;
                launchActivity.G();
                if (z != launchActivity.N0) {
                    z16Var.requestLayout();
                    return;
                }
                return;
            case 17:
                i46 i46Var = ((a46) obj).c;
                i46Var.r1.presentFragment(xza.e0(i46Var.e1(), true));
                return;
            case 18:
                y56 y56Var = (y56) obj;
                wy8 wy8Var = y56Var.d;
                if (wy8Var != null) {
                    y56Var.i0(wy8Var.getCurrentLink());
                    return;
                }
                return;
            case 19:
                DictationAsr.i0((gn3) ((in3) obj).b, false, new Object());
                return;
            case 20:
                t86 t86Var = (t86) obj;
                long uptimeMillis = SystemClock.uptimeMillis();
                ArrayList arrayList = t86Var.a;
                ArrayList arrayList2 = new ArrayList(arrayList);
                int size = arrayList2.size();
                while (i < size) {
                    Object obj2 = arrayList2.get(i);
                    i++;
                    s86 s86Var = (s86) obj2;
                    if (s86Var.b && uptimeMillis - s86Var.c > 5000) {
                        arrayList.remove(s86Var);
                        t86Var.removeView(s86Var);
                    }
                }
                kg5 kg5Var = t86Var.h;
                t86Var.removeCallbacks(kg5Var);
                if (!arrayList.isEmpty()) {
                    t86Var.postDelayed(kg5Var, 500L);
                    return;
                }
                return;
            case 21:
                k96 k96Var = (k96) obj;
                ArrayList arrayList3 = k96Var.s;
                kg5 kg5Var2 = k96Var.F;
                if (kg5Var2 != null) {
                    gm.r(kg5Var2);
                    k96Var.F = null;
                }
                int currentTime = ConnectionsManager.getInstance(k96Var.O).getCurrentTime();
                for (int size2 = arrayList3.size() - 1; size2 >= 0; size2--) {
                    j96 j96Var = (j96) arrayList3.get(size2);
                    ArrayList arrayList4 = j96Var.f;
                    int size3 = arrayList4.size();
                    int i4 = 0;
                    while (true) {
                        if (i4 < size3) {
                            Object obj3 = arrayList4.get(i4);
                            i4++;
                            i96 i96Var = (i96) obj3;
                            long j = i96Var.g;
                            if (j <= 0 || currentTime - i96Var.d > bg5.b(j96Var.a, (int) j, 0)) {
                            }
                        } else {
                            arrayList3.remove(size2);
                        }
                    }
                }
                Collections.sort(arrayList3, new x03(k96Var, (byte) 25));
                k96Var.n.O(true);
                k96Var.t(true);
                k96Var.l();
                return;
            case 22:
                ad8 ad8Var = ((v96) obj).e.a;
                if (ad8Var != null) {
                    ad8Var.d();
                    return;
                }
                return;
            case 23:
                ((SurfaceTexture) obj).release();
                return;
            case 24:
                if (!((jb6) ((zk) obj).b).p0().getTimeZone().equals(TimeZone.getDefault())) {
                    jb6.D0().Y0();
                    return;
                }
                return;
            case 25:
                try {
                    r59 currentListView = ((pc6) ((nc6) obj).p0).R0.getCurrentListView();
                    if (currentListView != null && currentListView.getAdapter() != null) {
                        currentListView.getAdapter().f();
                        return;
                    }
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 26:
                EditTextBoldCursor[] editTextBoldCursorArr = ((ff6) obj).b;
                if (editTextBoldCursorArr != null) {
                    editTextBoldCursorArr[0].requestFocus();
                    EditTextBoldCursor editTextBoldCursor = editTextBoldCursorArr[0];
                    editTextBoldCursor.setSelection(editTextBoldCursor.length());
                    gm.E3(editTextBoldCursorArr[0]);
                    return;
                }
                return;
            case 27:
                if6 if6Var = (if6) obj;
                s09 s09Var2 = if6Var.e;
                EditTextBoldCursor editTextBoldCursor2 = if6Var.a;
                if (editTextBoldCursor2 != null) {
                    editTextBoldCursor2.requestFocus();
                    editTextBoldCursor2.setSelection(editTextBoldCursor2.length());
                    if6Var.E.M1(editTextBoldCursor2);
                    s09Var2.getAnimatedDrawable().I(0, false, false);
                    s09Var2.d();
                    return;
                }
                return;
            case 28:
                ((s09) obj).d();
                return;
            default:
                double currentTimeMillis2 = System.currentTimeMillis();
                pf6 pf6Var = (pf6) ((lx3) obj).b;
                double d = pf6Var.R;
                ng6 ng6Var = pf6Var.w;
                pf6Var.R = currentTimeMillis2;
                int i5 = (int) (pf6Var.Q - (currentTimeMillis2 - d));
                pf6Var.Q = i5;
                if (i5 >= 1000) {
                    int i6 = i5 / 1000;
                    int i7 = i6 / 60;
                    int i8 = i6 - (i7 * 60);
                    ng6Var.setTextSize(1, 13.0f);
                    int i9 = pf6Var.F;
                    if (i9 != 4 && i9 != 3 && i9 != 11) {
                        if (i9 == 2) {
                            ng6Var.setText(jb6.a0(null, null, 2131745030, Integer.valueOf(i7), Integer.valueOf(i8)));
                            return;
                        }
                        return;
                    }
                    ng6Var.setText(jb6.a0(null, null, 2131752582, Integer.valueOf(i7), Integer.valueOf(i8)));
                    return;
                }
                pf6Var.q();
                int i10 = pf6Var.F;
                if (i10 == 3 || i10 == 4 || i10 == 2 || i10 == 11) {
                    ng6Var.setTextSize(1, 15.0f);
                    int i11 = pf6Var.F;
                    if (i11 == 4) {
                        ng6Var.setText(jb6.M0(2131745910, null));
                    } else if (i11 == 15) {
                        ng6Var.setText(jb6.M0(2131751384, null));
                    } else if (i11 != 11 && i11 != 3) {
                        ng6Var.setText(gm.E2(jb6.M0(2131745911, null), true, 0.0f, 0.0f));
                    } else {
                        ng6Var.setText(jb6.M0(2131745909, null));
                    }
                    int i12 = cmb.O9;
                    anb.X(ng6Var, i12, null);
                    ng6Var.setTag(2131296388, Integer.valueOf(i12));
                    return;
                }
                return;
        }
    }
}
