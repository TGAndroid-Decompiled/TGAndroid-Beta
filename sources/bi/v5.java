package bi;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.xq;
public final class v5 {
    public final w5 f4873a;
    public ai.d0 d;
    public int f4877f;
    public int f4878g;
    public float f4880j;
    public float f4881k;
    public final ArrayList f4874b = new ArrayList();
    public int f4875c = 0;
    public boolean f4876e = false;
    public final float[] h = new float[16];
    public float[] f4879i = new float[16];
    public boolean f4882l = false;

    public v5(w5 w5Var) {
        this.f4873a = w5Var;
    }

    public final void a(int i7) {
        this.f4874b.add(new u5(3, 0.0f, 0.0f, i7, -1, 0.0f, null, null));
    }

    public final void b() {
        ai.d0 d0Var;
        boolean z9 = this.f4876e;
        w5 w5Var = this.f4873a;
        if (!z9) {
            int i7 = this.f4875c;
            ArrayList arrayList = this.f4874b;
            if (i7 < arrayList.size()) {
                u5 u5Var = (u5) arrayList.get(this.f4875c);
                boolean z10 = true;
                this.f4875c++;
                int i10 = u5Var.f4805a;
                int i11 = u5Var.f4808e;
                float f10 = u5Var.f4806b;
                int i12 = u5Var.d;
                int c10 = p1.g.c(i10);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 4) {
                                    if (c10 == 5) {
                                        if (f10 <= 0.0f) {
                                            z10 = false;
                                        }
                                        w5Var.f4967f = z10;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f4882l = true;
                                View view = u5Var.f4810g;
                                ValueAnimator valueAnimator = w5Var.G;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    w5Var.G = null;
                                }
                                RectF rectF = new RectF();
                                rectF.left = view.getX() - w5Var.getX();
                                rectF.top = view.getY() - w5Var.getY();
                                rectF.right = rectF.left + view.getWidth();
                                rectF.bottom = rectF.top + view.getHeight();
                                org.telegram.messenger.g0.E2(view);
                                int childCount = w5Var.getChildCount();
                                w5Var.addView(view, c8.ha.e(64, 64, 17));
                                w5Var.f4971w.add(Integer.valueOf(i11));
                                w5Var.f4972x.put(Integer.valueOf(childCount), Integer.valueOf(i11));
                                w5Var.f4973y.put(Integer.valueOf(childCount), rectF);
                                w5Var.F = childCount;
                                w5Var.E = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                w5Var.G = ofFloat;
                                ofFloat.addUpdateListener(new ah.h(w5Var, 5));
                                w5Var.G.addListener(new t5(w5Var, 0));
                                w5Var.G.setDuration(i12 * 16);
                                w5Var.G.setInterpolator(xq.h);
                                w5Var.G.start();
                                return;
                            }
                            System.arraycopy(w5Var.f4965c, 0, this.h, 0, 16);
                            float f11 = u5Var.f4809f;
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
                            this.f4879i = fArr;
                            this.f4878g = i12;
                            this.f4877f = i12;
                            this.f4880j = w5Var.d;
                            this.f4881k = w5Var.f4966e;
                            return;
                        }
                        this.f4877f = i12;
                        this.f4878g = i12;
                        return;
                    }
                    w5Var.d = (u5Var.f4807c * 0.01f) + w5Var.d;
                    w5Var.f4966e = (f10 * 0.01f) + w5Var.f4966e;
                    this.f4877f = 1;
                    this.f4878g = 1;
                    return;
                }
                Runnable runnable = u5Var.h;
                if (runnable != null) {
                    runnable.run();
                }
                b();
                return;
            }
        }
        w5Var.H = null;
        if (!this.f4876e && (d0Var = this.d) != null) {
            d0Var.run();
        }
    }

    public final void c(float f10, float f11) {
        this.f4874b.add(new u5(2, f10, f11, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z9) {
        float f10;
        if (z9) {
            f10 = 1.0f;
        } else {
            f10 = -1.0f;
        }
        this.f4874b.add(new u5(6, f10, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(b6 b6Var, int i7, float f10) {
        this.f4874b.add(new u5(5, 0.0f, 0.0f, 32, i7, f10, b6Var, null));
    }
}
