package di;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.er;
public final class r4 {
    public final s4 f9315a;
    public ai.r d;
    public int f9319f;
    public int f9320g;
    public float f9322j;
    public float f9323k;
    public final ArrayList f9316b = new ArrayList();
    public int f9317c = 0;
    public boolean f9318e = false;
    public final float[] h = new float[16];
    public float[] f9321i = new float[16];
    public boolean f9324l = false;

    public r4(s4 s4Var) {
        this.f9315a = s4Var;
    }

    public final void a(int i7) {
        this.f9316b.add(new q4(3, 0.0f, 0.0f, i7, -1, 0.0f, null, null));
    }

    public final void b() {
        ai.r rVar;
        boolean z10 = this.f9318e;
        s4 s4Var = this.f9315a;
        if (!z10) {
            int i7 = this.f9317c;
            ArrayList arrayList = this.f9316b;
            if (i7 < arrayList.size()) {
                q4 q4Var = (q4) arrayList.get(this.f9317c);
                boolean z11 = true;
                this.f9317c++;
                int i10 = q4Var.f9263a;
                int i11 = q4Var.f9266e;
                float f10 = q4Var.f9264b;
                int i12 = q4Var.d;
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
                                        s4Var.f9374f = z11;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f9324l = true;
                                View view = q4Var.f9268g;
                                ValueAnimator valueAnimator = s4Var.H;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    s4Var.H = null;
                                }
                                RectF rectF = new RectF();
                                rectF.left = view.getX() - s4Var.getX();
                                rectF.top = view.getY() - s4Var.getY();
                                rectF.right = rectF.left + view.getWidth();
                                rectF.bottom = rectF.top + view.getHeight();
                                org.telegram.messenger.g0.E2(view);
                                int childCount = s4Var.getChildCount();
                                s4Var.addView(view, c8.ja.e(64, 64, 17));
                                s4Var.f9378w.add(Integer.valueOf(i11));
                                s4Var.f9379x.put(Integer.valueOf(childCount), Integer.valueOf(i11));
                                s4Var.f9380y.put(Integer.valueOf(childCount), rectF);
                                s4Var.G = childCount;
                                s4Var.F = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                s4Var.H = ofFloat;
                                ofFloat.addUpdateListener(new ah.h(s4Var, 7));
                                s4Var.H.addListener(new ai.j0(s4Var, 6));
                                s4Var.H.setDuration(i12 * 16);
                                s4Var.H.setInterpolator(er.h);
                                s4Var.H.start();
                                return;
                            }
                            System.arraycopy(s4Var.f9372c, 0, this.h, 0, 16);
                            float f11 = q4Var.f9267f;
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
                            this.f9321i = fArr;
                            this.f9320g = i12;
                            this.f9319f = i12;
                            this.f9322j = s4Var.d;
                            this.f9323k = s4Var.f9373e;
                            return;
                        }
                        this.f9319f = i12;
                        this.f9320g = i12;
                        return;
                    }
                    s4Var.d = (q4Var.f9265c * 0.01f) + s4Var.d;
                    s4Var.f9373e = (f10 * 0.01f) + s4Var.f9373e;
                    this.f9319f = 1;
                    this.f9320g = 1;
                    return;
                }
                Runnable runnable = q4Var.h;
                if (runnable != null) {
                    runnable.run();
                }
                b();
                return;
            }
        }
        s4Var.I = null;
        if (!this.f9318e && (rVar = this.d) != null) {
            rVar.run();
        }
    }

    public final void c(float f10, float f11) {
        this.f9316b.add(new q4(2, f10, f11, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = -1.0f;
        }
        this.f9316b.add(new q4(6, f10, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(w4 w4Var, int i7, float f10) {
        this.f9316b.add(new q4(5, 0.0f, 0.0f, 32, i7, f10, w4Var, null));
    }
}
