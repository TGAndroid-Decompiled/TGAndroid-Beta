package di;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.er;
public final class r4 {
    public final s4 f9325a;
    public androidx.car.app.utils.a d;
    public int f9329f;
    public int f9330g;
    public float f9332j;
    public float f9333k;
    public final ArrayList f9326b = new ArrayList();
    public int f9327c = 0;
    public boolean f9328e = false;
    public final float[] h = new float[16];
    public float[] f9331i = new float[16];
    public boolean f9334l = false;

    public r4(s4 s4Var) {
        this.f9325a = s4Var;
    }

    public final void a(int i7) {
        this.f9326b.add(new q4(3, 0.0f, 0.0f, i7, -1, 0.0f, null, null));
    }

    public final void b() {
        androidx.car.app.utils.a aVar;
        boolean z10 = this.f9328e;
        s4 s4Var = this.f9325a;
        if (!z10) {
            int i7 = this.f9327c;
            ArrayList arrayList = this.f9326b;
            if (i7 < arrayList.size()) {
                q4 q4Var = (q4) arrayList.get(this.f9327c);
                boolean z11 = true;
                this.f9327c++;
                int i10 = q4Var.f9261a;
                int i11 = q4Var.f9264e;
                float f10 = q4Var.f9262b;
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
                                        s4Var.f9388f = z11;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f9334l = true;
                                View view = q4Var.f9266g;
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
                                s4Var.f9392w.add(Integer.valueOf(i11));
                                s4Var.f9393x.put(Integer.valueOf(childCount), Integer.valueOf(i11));
                                s4Var.f9394y.put(Integer.valueOf(childCount), rectF);
                                s4Var.G = childCount;
                                s4Var.F = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                s4Var.H = ofFloat;
                                ofFloat.addUpdateListener(new ah.h(s4Var, 7));
                                s4Var.H.addListener(new ai.i0(s4Var, 6));
                                s4Var.H.setDuration(i12 * 16);
                                s4Var.H.setInterpolator(er.h);
                                s4Var.H.start();
                                return;
                            }
                            System.arraycopy(s4Var.f9386c, 0, this.h, 0, 16);
                            float f11 = q4Var.f9265f;
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
                            this.f9331i = fArr;
                            this.f9330g = i12;
                            this.f9329f = i12;
                            this.f9332j = s4Var.d;
                            this.f9333k = s4Var.f9387e;
                            return;
                        }
                        this.f9329f = i12;
                        this.f9330g = i12;
                        return;
                    }
                    s4Var.d = (q4Var.f9263c * 0.01f) + s4Var.d;
                    s4Var.f9387e = (f10 * 0.01f) + s4Var.f9387e;
                    this.f9329f = 1;
                    this.f9330g = 1;
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
        if (!this.f9328e && (aVar = this.d) != null) {
            aVar.run();
        }
    }

    public final void c(float f10, float f11) {
        this.f9326b.add(new q4(2, f10, f11, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = -1.0f;
        }
        this.f9326b.add(new q4(6, f10, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(w4 w4Var, int i7, float f10) {
        this.f9326b.add(new q4(5, 0.0f, 0.0f, 32, i7, f10, w4Var, null));
    }
}
