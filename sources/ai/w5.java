package ai;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zr;
public final class w5 {
    public final x5 f2354a;
    public y0 d;
    public int f2357f;
    public int f2358g;
    public float f2360j;
    public float f2361k;
    public final ArrayList f2355b = new ArrayList();
    public int f2356c = 0;
    public boolean e = false;
    public final float[] h = new float[16];
    public float[] f2359i = new float[16];
    public boolean f2362l = false;

    public w5(x5 x5Var) {
        this.f2354a = x5Var;
    }

    public final void a(int i10) {
        this.f2355b.add(new v5(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        y0 y0Var;
        boolean z10 = this.e;
        x5 x5Var = this.f2354a;
        if (!z10) {
            int i10 = this.f2356c;
            ArrayList arrayList = this.f2355b;
            if (i10 < arrayList.size()) {
                v5 v5Var = (v5) arrayList.get(this.f2356c);
                boolean z11 = true;
                this.f2356c++;
                int i11 = v5Var.f2300a;
                int i12 = v5Var.e;
                float f7 = v5Var.f2301b;
                int i13 = v5Var.d;
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
                                        x5Var.f2441f = z11;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f2362l = true;
                                View view = v5Var.f2304g;
                                ValueAnimator valueAnimator = x5Var.G;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    x5Var.G = null;
                                }
                                RectF rectF = new RectF();
                                rectF.left = view.getX() - x5Var.getX();
                                rectF.top = view.getY() - x5Var.getY();
                                rectF.right = rectF.left + view.getWidth();
                                rectF.bottom = rectF.top + view.getHeight();
                                AndroidUtilities.removeFromParent(view);
                                int childCount = x5Var.getChildCount();
                                x5Var.addView(view, w7.z5.e(64, 64, 17));
                                x5Var.v.add(Integer.valueOf(i12));
                                x5Var.f2445w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                                x5Var.f2446x.put(Integer.valueOf(childCount), rectF);
                                x5Var.F = childCount;
                                x5Var.E = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                x5Var.G = ofFloat;
                                ofFloat.addUpdateListener(new ah.c0(x5Var, 3));
                                x5Var.G.addListener(new ah.b(x5Var, 3));
                                x5Var.G.setDuration(i13 * 16);
                                x5Var.G.setInterpolator(zr.h);
                                x5Var.G.start();
                                return;
                            }
                            System.arraycopy(x5Var.f2440c, 0, this.h, 0, 16);
                            float f10 = v5Var.f2303f;
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
                            this.f2359i = fArr;
                            this.f2358g = i13;
                            this.f2357f = i13;
                            this.f2360j = x5Var.d;
                            this.f2361k = x5Var.e;
                            return;
                        }
                        this.f2357f = i13;
                        this.f2358g = i13;
                        return;
                    }
                    x5Var.d = (v5Var.f2302c * 0.01f) + x5Var.d;
                    x5Var.e = (f7 * 0.01f) + x5Var.e;
                    this.f2357f = 1;
                    this.f2358g = 1;
                    return;
                }
                Runnable runnable = v5Var.h;
                if (runnable != null) {
                    runnable.run();
                }
                b();
                return;
            }
        }
        x5Var.H = null;
        if (!this.e && (y0Var = this.d) != null) {
            y0Var.run();
        }
    }

    public final void c(float f7, float f10) {
        this.f2355b.add(new v5(2, f7, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = -1.0f;
        }
        this.f2355b.add(new v5(6, f7, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(c6 c6Var, int i10, float f7) {
        this.f2355b.add(new v5(5, 0.0f, 0.0f, 32, i10, f7, c6Var, null));
    }
}
