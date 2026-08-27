package f2;

import android.animation.ValueAnimator;
import android.graphics.Bitmap;
import android.graphics.SurfaceTexture;
import android.opengl.Matrix;
import androidx.recyclerview.widget.RecyclerView;
import gh.d4;
import gh.g2;
import gh.k2;
import gh.y1;
import h3.e2;
import h3.m2;
import hh.a5;
import hh.b4;
import hh.bb;
import hh.d5;
import hh.e5;
import hh.f4;
import hh.fa;
import hh.g4;
import hh.j4;
import hh.w3;
import hh.x3;
import hh.y3;
import hh.z3;
import java.util.Arrays;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.ov0;
import org.telegram.ui.Components.zk0;

public final class r implements Runnable {

    public final int f5817a;

    public final Object f5818b;

    public r(h3.h0 h0Var, SurfaceTexture surfaceTexture) {
        this.f5817a = 12;
        this.f5818b = h0Var;
    }

    @Override
    public final void run() {
        char c10;
        boolean z10;
        boolean z11;
        int i10;
        char c11;
        switch (this.f5817a) {
            case 0:
                RecyclerView recyclerView = (RecyclerView) this.f5818b;
                if (recyclerView.getAdapter() != null) {
                    recyclerView.getAdapter().l();
                    return;
                }
                return;
            case 1:
                fh.u uVar = (fh.u) this.f5818b;
                uVar.f();
                uVar.e(true);
                return;
            case 2:
                try {
                    ((Bitmap) this.f5818b).recycle();
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 3:
                gf.q qVar = (gf.q) this.f5818b;
                long j10 = qVar.f7050b;
                if (j10 > 0) {
                    long j11 = j10 - 1;
                    qVar.f7050b = j11;
                    qVar.f7049a.g(j11);
                }
                if (qVar.f7050b <= 0) {
                    qVar.f7051c = false;
                }
                if (qVar.f7051c) {
                    AndroidUtilities.runOnUIThread(qVar.d, 1000L);
                    return;
                }
                return;
            case 4:
                ((gg.c) this.f5818b).f();
                return;
            case 5:
                gh.v vVar = (gh.v) this.f5818b;
                vVar.f7568d0.setTranslationX(vVar.f7567c0.getAnimatedWidth() + AndroidUtilities.dp(28.0f));
                return;
            case 6:
                ((gh.p0) this.f5818b).onBackPressed();
                return;
            case 7:
                b51 b51Var = ((k2) this.f5818b).U;
                if (b51Var != null) {
                    b51Var.N(false);
                    return;
                }
                return;
            case 8:
                ((y1) this.f5818b).c();
                return;
            case 9:
                g2 g2Var = (g2) this.f5818b;
                bb bbVar = g2Var.f7265e;
                if (bbVar != null) {
                    bbVar.d();
                    g2Var.invalidateSelf();
                    return;
                }
                return;
            case 10:
                ((d4) this.f5818b).o();
                return;
            case 11:
                ((d5.e0) this.f5818b).getClass();
                return;
            case 12:
                h3.k0 k0Var = ((h3.h0) this.f5818b).f7870a;
                k0Var.g0(null);
                k0Var.a0(0, 0);
                return;
            case 13:
                e2 e2Var = (e2) this.f5818b;
                try {
                    synchronized (e2Var) {
                    }
                    try {
                        e2Var.f7813a.handleMessage(e2Var.d, e2Var.f7816e);
                        boolean z12 = true;
                        return;
                    } finally {
                        e2Var.b(true);
                    }
                } catch (h3.n e9) {
                    d5.a.p("ExoPlayerImplInternal", "Unexpected error delivering message on external thread.", e9);
                    throw new RuntimeException(e9);
                }
            case 14:
                ((m2) this.f5818b).d();
                return;
            case 15:
                hh.b bVar = (hh.b) this.f5818b;
                bVar.getClass();
                new fa(bVar.getContext(), bVar.f8979b).show();
                return;
            case 16:
                hh.q qVar2 = (hh.q) this.f5818b;
                qVar2.getClass();
                try {
                    zk0 currentListView = qVar2.f9887t0.B.getCurrentListView();
                    if (currentListView == null || currentListView.getAdapter() == null) {
                        return;
                    }
                    currentListView.getAdapter().l();
                    return;
                } catch (Throwable unused2) {
                    return;
                }
            case 17:
                new ov0(((hh.g0) this.f5818b).getContext()).show();
                return;
            case 18:
                AndroidUtilities.showKeyboard(((hh.o0) this.f5818b).Z);
                return;
            case 19:
                AndroidUtilities.showKeyboard(((hh.t0) this.f5818b).h);
                return;
            case 20:
                AndroidUtilities.showKeyboard(((hh.x0) this.f5818b).f10316c);
                return;
            case 21:
                g4 g4Var = (g4) this.f5818b;
                g4Var.f9307d0 = false;
                g4Var.f9311f0 = false;
                g4Var.a(g4Var.S, g4Var.T, g4Var.U, g4Var.V);
                return;
            case 22:
                ((w3) this.f5818b).invalidateSelf();
                return;
            case 23:
                z3 z3Var = (z3) this.f5818b;
                y3 y3Var = z3Var.D;
                if (y3Var == null) {
                    c10 = 2;
                    if (Math.abs(z3Var.d) > 1.0E-4f || Math.abs(z3Var.f10413e) > 1.0E-4f) {
                        z3Var.a();
                    } else {
                        z10 = false;
                    }
                    if (z3Var.C != null) {
                        z11 = true;
                    } else {
                        z11 = z10;
                    }
                    if (z11) {
                        for (int i11 = 0; i11 < 6; i11++) {
                            Matrix.multiplyMV(z3Var.f10415n, 0, z3Var.f10412c, 0, z3Var.h[i11], 0);
                            z3Var.f10416r[i11] = z3Var.f10415n[c10];
                        }
                        Arrays.sort(z3Var.f10417s, new ag.h(z3Var, 2));
                        z3Var.invalidate();
                    }
                    if (z3Var.isAttachedToWindow()) {
                        AndroidUtilities.runOnUIThread(z3Var.E, 16L);
                        return;
                    }
                    return;
                }
                z3 z3Var2 = y3Var.f10367a;
                float[] fArr = y3Var.h;
                if (y3Var.f10370e || (i10 = y3Var.f10369c) == 0) {
                    c10 = 2;
                } else {
                    if (y3Var.f10376l) {
                        z3Var2.a();
                    } else {
                        int iB = m1.j.b(((x3) y3Var.f10368b.get(i10 - 1)).f10331a);
                        if (iB == 1 || iB == 2) {
                            c10 = 2;
                            z3Var2.a();
                            int i12 = y3Var.f10371f - 1;
                            y3Var.f10371f = i12;
                            if (i12 <= 0) {
                                y3Var.b();
                            }
                        } else if (iB == 3) {
                            float fPow = 1.0f - ((float) Math.pow(1.0f - (1.0f - (y3Var.f10371f / y3Var.f10372g)), 3.0d));
                            float f10 = 1.0f - fPow;
                            if (Math.abs(y3Var.f10374j * f10) > 1.0E-4f || Math.abs(y3Var.f10375k * f10) > 1.0E-4f) {
                                float[] fArr2 = new float[16];
                                c11 = 1;
                                float f11 = y3Var.f10374j * f10 * 0.96f;
                                z3Var2.getClass();
                                z3.b(1.0f, 0.0f, f11, fArr2);
                                z3Var2.getClass();
                                z3.d(fArr2, fArr, fArr);
                                float f12 = y3Var.f10375k * f10 * 0.96f;
                                z3Var2.getClass();
                                z3.b(0.0f, 1.0f, f12, fArr2);
                                z3.d(fArr2, fArr, fArr);
                            } else {
                                c11 = 1;
                            }
                            float[] fArr3 = y3Var.f10373i;
                            float[] fArr4 = z3Var2.f10412c;
                            for (int i13 = 0; i13 < 16; i13++) {
                                float f13 = fArr[i13];
                                fArr4[i13] = com.google.android.recaptcha.internal.a.z(fArr3[i13], f13, fPow, f13);
                            }
                            c10 = 2;
                            float f14 = fArr4[0];
                            float f15 = fArr4[c11];
                            float f16 = fArr4[2];
                            float[] fArr5 = new float[3];
                            fArr5[0] = f14;
                            fArr5[c11] = f15;
                            fArr5[2] = f16;
                            float f17 = fArr4[4];
                            float f18 = fArr4[5];
                            float f19 = fArr4[6];
                            float[] fArr6 = new float[3];
                            fArr6[0] = f17;
                            fArr6[c11] = f18;
                            fArr6[2] = f19;
                            float[] fArr7 = new float[3];
                            z3.e(fArr5);
                            z3.c(fArr5, fArr6, fArr7);
                            z3.e(fArr7);
                            z3.c(fArr7, fArr5, fArr6);
                            fArr4[0] = fArr5[0];
                            fArr4[c11] = fArr5[c11];
                            fArr4[2] = fArr5[2];
                            fArr4[4] = fArr6[0];
                            fArr4[5] = fArr6[c11];
                            fArr4[6] = fArr6[2];
                            fArr4[8] = fArr7[0];
                            fArr4[9] = fArr7[c11];
                            fArr4[10] = fArr7[2];
                            int i14 = y3Var.f10371f - 1;
                            y3Var.f10371f = i14;
                            if (i14 <= 0) {
                                System.arraycopy(y3Var.f10373i, 0, z3Var2.f10412c, 0, 16);
                                z3Var2.d = 0.0f;
                                z3Var2.f10413e = 0.0f;
                                y3Var.b();
                            }
                        }
                    }
                    c10 = 2;
                }
                z10 = true;
                if (z3Var.C != null) {
                    z11 = true;
                } else {
                    z11 = z10;
                }
                if (z11) {
                    while (i11 < 6) {
                        Matrix.multiplyMV(z3Var.f10415n, 0, z3Var.f10412c, 0, z3Var.h[i11], 0);
                        z3Var.f10416r[i11] = z3Var.f10415n[c10];
                    }
                    Arrays.sort(z3Var.f10417s, new ag.h(z3Var, 2));
                    z3Var.invalidate();
                }
                if (z3Var.isAttachedToWindow()) {
                    AndroidUtilities.runOnUIThread(z3Var.E, 16L);
                    return;
                }
                return;
            case 24:
                ((b4) this.f5818b).invalidate();
                return;
            case 25:
                ((f4) this.f5818b).invalidateSelf();
                return;
            case 26:
                e5 e5Var = (e5) this.f5818b;
                r rVar = e5Var.f9180e0;
                n9[] n9VarArr = e5Var.d;
                if (!n9VarArr[2 - e5Var.f9190n0].getImageReceiver().hasImageLoaded()) {
                    AndroidUtilities.cancelRunOnUIThread(rVar);
                    AndroidUtilities.runOnUIThread(rVar, 150L);
                    return;
                }
                j4 j4Var = e5Var.Q;
                if (j4Var != null && j4Var.f9526c == 1 && e5Var.isAttachedToWindow()) {
                    AndroidUtilities.cancelRunOnUIThread(rVar);
                    ValueAnimator valueAnimator = e5Var.f9178d0;
                    if (valueAnimator != null) {
                        valueAnimator.cancel();
                        e5Var.f9178d0 = null;
                    }
                    int i15 = 1 - e5Var.f9190n0;
                    e5Var.f9190n0 = i15;
                    oi0 lottieAnimation = n9VarArr[2 - i15].getImageReceiver().getLottieAnimation();
                    oi0 lottieAnimation2 = n9VarArr[e5Var.f9190n0 + 1].getImageReceiver().getLottieAnimation();
                    if (lottieAnimation2 != null && lottieAnimation != null) {
                        lottieAnimation2.Q(lottieAnimation.r(), false);
                    }
                    e5Var.S.c();
                    int i16 = e5Var.f9190n0 + 1;
                    TL_stars.starGiftAttributeBackdrop[] stargiftattributebackdropArr = e5Var.R;
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) e5Var.U.c();
                    stargiftattributebackdropArr[i16] = stargiftattributebackdrop;
                    e5Var.e(i16, stargiftattributebackdrop);
                    e5Var.g(1, (TL_stars.starGiftAttributePattern) e5Var.T.c(), true);
                    e5Var.a();
                    float f20 = e5Var.f9190n0;
                    ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(1.0f - f20, f20);
                    e5Var.f9178d0 = valueAnimatorOfFloat;
                    valueAnimatorOfFloat.addUpdateListener(new a5(e5Var, 2));
                    e5Var.f9178d0.addListener(new d5(e5Var));
                    e5Var.f9178d0.setDuration(320L);
                    e5Var.f9178d0.setInterpolator(er.h);
                    e5Var.f9178d0.start();
                    return;
                }
                return;
            case 27:
                ((bg.i) this.f5818b).setPaused(true);
                return;
            case 28:
                AndroidUtilities.showKeyboard((EditTextBoldCursor) this.f5818b);
                return;
            default:
                ((hh.x0[]) this.f5818b)[0].dismiss();
                return;
        }
    }

    public r(h3.q0 q0Var, e2 e2Var) {
        this.f5817a = 13;
        this.f5818b = e2Var;
    }

    public r(Object obj, int i10) {
        this.f5817a = i10;
        this.f5818b = obj;
    }
}
