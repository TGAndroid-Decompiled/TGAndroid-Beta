package ai;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
public final class v5 {
    public final w5 f2295a;
    public y0 d;
    public int f2298f;
    public int f2299g;
    public float f2301j;
    public float f2302k;
    public final ArrayList f2296b = new ArrayList();
    public int f2297c = 0;
    public boolean e = false;
    public final float[] h = new float[16];
    public float[] f2300i = new float[16];
    public boolean f2303l = false;

    public v5(w5 w5Var) {
        this.f2295a = w5Var;
    }

    public final void a(int i10) {
        this.f2296b.add(new u5(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        y0 y0Var;
        boolean z10 = this.e;
        w5 w5Var = this.f2295a;
        if (!z10) {
            int i10 = this.f2297c;
            ArrayList arrayList = this.f2296b;
            if (i10 < arrayList.size()) {
                u5 u5Var = (u5) arrayList.get(this.f2297c);
                boolean z11 = true;
                this.f2297c++;
                int i11 = u5Var.f2247a;
                int i12 = u5Var.e;
                float f7 = u5Var.f2248b;
                int i13 = u5Var.d;
                int c10 = m1.j.c(i11);
                if (c10 != 0) {
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 4) {
                                    if (c10 == 5) {
                                        if (f7 <= 0.0f) {
                                            z11 = false;
                                        }
                                        w5Var.f2365f = z11;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f2303l = true;
                                View view = u5Var.f2251g;
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
                                AndroidUtilities.removeFromParent(view);
                                int childCount = w5Var.getChildCount();
                                w5Var.addView(view, w7.z5.e(64, 64, 17));
                                w5Var.v.add(Integer.valueOf(i12));
                                w5Var.f2369w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                                w5Var.f2370x.put(Integer.valueOf(childCount), rectF);
                                w5Var.F = childCount;
                                w5Var.E = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                w5Var.G = ofFloat;
                                ofFloat.addUpdateListener(new ah.c0(w5Var, 3));
                                w5Var.G.addListener(new ah.b(w5Var, 3));
                                w5Var.G.setDuration(i13 * 16);
                                w5Var.G.setInterpolator(bs.h);
                                w5Var.G.start();
                                return;
                            }
                            System.arraycopy(w5Var.f2364c, 0, this.h, 0, 16);
                            float f10 = u5Var.f2250f;
                            float[] fArr = new float[16];
                            Matrix.setIdentityM(fArr, 0);
                            if (f10 != 0.0f) {
                                Matrix.rotateM(fArr, 0, -f10, 0.0f, 0.0f, 1.0f);
                            }
                            if (i12 != 0) {
                                if (i12 != 1) {
                                    if (i12 != 2) {
                                        if (i12 != 3) {
                                            if (i12 == 4) {
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
                            this.f2300i = fArr;
                            this.f2299g = i13;
                            this.f2298f = i13;
                            this.f2301j = w5Var.d;
                            this.f2302k = w5Var.e;
                            return;
                        }
                        this.f2298f = i13;
                        this.f2299g = i13;
                        return;
                    }
                    w5Var.d = (u5Var.f2249c * 0.01f) + w5Var.d;
                    w5Var.e = (f7 * 0.01f) + w5Var.e;
                    this.f2298f = 1;
                    this.f2299g = 1;
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
        if (!this.e && (y0Var = this.d) != null) {
            y0Var.run();
        }
    }

    public final void c(float f7, float f10) {
        this.f2296b.add(new u5(2, f7, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = -1.0f;
        }
        this.f2296b.add(new u5(6, f7, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(b6 b6Var, int i10, float f7) {
        this.f2296b.add(new u5(5, 0.0f, 0.0f, 32, i10, f7, b6Var, null));
    }
}
