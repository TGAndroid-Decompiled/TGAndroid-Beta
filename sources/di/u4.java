package di;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.nr;
public final class u4 {
    public final v4 f9887a;
    public ai.r d;
    public int f9891f;
    public int f9892g;
    public float f9894j;
    public float f9895k;
    public final ArrayList f9888b = new ArrayList();
    public int f9889c = 0;
    public boolean f9890e = false;
    public final float[] h = new float[16];
    public float[] f9893i = new float[16];
    public boolean f9896l = false;

    public u4(v4 v4Var) {
        this.f9887a = v4Var;
    }

    public final void a(int i7) {
        this.f9888b.add(new t4(3, 0.0f, 0.0f, i7, -1, 0.0f, null, null));
    }

    public final void b() {
        ai.r rVar;
        boolean z10 = this.f9890e;
        v4 v4Var = this.f9887a;
        if (!z10) {
            int i7 = this.f9889c;
            ArrayList arrayList = this.f9888b;
            if (i7 < arrayList.size()) {
                t4 t4Var = (t4) arrayList.get(this.f9889c);
                boolean z11 = true;
                this.f9889c++;
                int i10 = t4Var.f9822a;
                int i11 = t4Var.f9825e;
                float f10 = t4Var.f9823b;
                int i12 = t4Var.d;
                int c10 = p1.g.c(i10);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 4) {
                                    if (c10 == 5) {
                                        if (f10 <= 0.0f) {
                                            z11 = false;
                                        }
                                        v4Var.f9948f = z11;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f9896l = true;
                                View view = t4Var.f9827g;
                                ValueAnimator valueAnimator = v4Var.H;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    v4Var.H = null;
                                }
                                RectF rectF = new RectF();
                                rectF.left = view.getX() - v4Var.getX();
                                rectF.top = view.getY() - v4Var.getY();
                                rectF.right = rectF.left + view.getWidth();
                                rectF.bottom = rectF.top + view.getHeight();
                                org.telegram.messenger.g0.E2(view);
                                int childCount = v4Var.getChildCount();
                                v4Var.addView(view, c8.ma.e(64, 64, 17));
                                v4Var.f9952w.add(Integer.valueOf(i11));
                                v4Var.f9953x.put(Integer.valueOf(childCount), Integer.valueOf(i11));
                                v4Var.f9954y.put(Integer.valueOf(childCount), rectF);
                                v4Var.G = childCount;
                                v4Var.F = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                v4Var.H = ofFloat;
                                ofFloat.addUpdateListener(new ah.g(v4Var, 7));
                                v4Var.H.addListener(new ai.k0(v4Var, 6));
                                v4Var.H.setDuration(i12 * 16);
                                v4Var.H.setInterpolator(nr.h);
                                v4Var.H.start();
                                return;
                            }
                            System.arraycopy(v4Var.f9946c, 0, this.h, 0, 16);
                            float f11 = t4Var.f9826f;
                            float[] fArr = new float[16];
                            Matrix.setIdentityM(fArr, 0);
                            if (f11 != 0.0f) {
                                Matrix.rotateM(fArr, 0, -f11, 0.0f, 0.0f, 1.0f);
                            }
                            if (i11 != 0) {
                                if (i11 != 1) {
                                    if (i11 != 2) {
                                        if (i11 != 3) {
                                            if (i11 == 4) {
                                                Matrix.rotateM(fArr, 0, 180.0f, 0.0f, 1.0f, 0.0f);
                                            }
                                        } else {
                                            Matrix.rotateM(fArr, 0, -90.0f, 1.0f, 0.0f, 0.0f);
                                        }
                                    } else {
                                        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
                                    }
                                } else {
                                    Matrix.rotateM(fArr, 0, -90.0f, 0.0f, 1.0f, 0.0f);
                                }
                            } else {
                                Matrix.rotateM(fArr, 0, 90.0f, 0.0f, 1.0f, 0.0f);
                            }
                            this.f9893i = fArr;
                            this.f9892g = i12;
                            this.f9891f = i12;
                            this.f9894j = v4Var.d;
                            this.f9895k = v4Var.f9947e;
                            return;
                        }
                        this.f9891f = i12;
                        this.f9892g = i12;
                        return;
                    }
                    v4Var.d = (t4Var.f9824c * 0.01f) + v4Var.d;
                    v4Var.f9947e = (f10 * 0.01f) + v4Var.f9947e;
                    this.f9891f = 1;
                    this.f9892g = 1;
                    return;
                }
                Runnable runnable = t4Var.h;
                if (runnable != null) {
                    runnable.run();
                }
                b();
                return;
            }
        }
        v4Var.I = null;
        if (!this.f9890e && (rVar = this.d) != null) {
            rVar.run();
        }
    }

    public final void c(float f10, float f11) {
        this.f9888b.add(new t4(2, f10, f11, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = -1.0f;
        }
        this.f9888b.add(new t4(6, f10, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(z4 z4Var, int i7, float f10) {
        this.f9888b.add(new t4(5, 0.0f, 0.0f, 32, i7, f10, z4Var, null));
    }
}
