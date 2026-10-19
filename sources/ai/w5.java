package ai;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.bs;
public final class w5 {
    public final x5 f2351a;
    public y0 d;
    public int f2354f;
    public int f2355g;
    public float f2357j;
    public float f2358k;
    public final ArrayList f2352b = new ArrayList();
    public int f2353c = 0;
    public boolean e = false;
    public final float[] h = new float[16];
    public float[] f2356i = new float[16];
    public boolean f2359l = false;

    public w5(x5 x5Var) {
        this.f2351a = x5Var;
    }

    public final void a(int i10) {
        this.f2352b.add(new v5(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        y0 y0Var;
        boolean z10 = this.e;
        x5 x5Var = this.f2351a;
        if (!z10) {
            int i10 = this.f2353c;
            ArrayList arrayList = this.f2352b;
            if (i10 < arrayList.size()) {
                v5 v5Var = (v5) arrayList.get(this.f2353c);
                boolean z11 = true;
                this.f2353c++;
                int i11 = v5Var.f2298a;
                int i12 = v5Var.e;
                float f7 = v5Var.f2299b;
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
                                        x5Var.f2438f = z11;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f2359l = true;
                                View view = v5Var.f2302g;
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
                                x5Var.f2442w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                                x5Var.f2443x.put(Integer.valueOf(childCount), rectF);
                                x5Var.F = childCount;
                                x5Var.E = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                x5Var.G = ofFloat;
                                ofFloat.addUpdateListener(new ah.c0(x5Var, 3));
                                x5Var.G.addListener(new ah.b(x5Var, 3));
                                x5Var.G.setDuration(i13 * 16);
                                x5Var.G.setInterpolator(bs.h);
                                x5Var.G.start();
                                return;
                            }
                            System.arraycopy(x5Var.f2437c, 0, this.h, 0, 16);
                            float f10 = v5Var.f2301f;
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
                            this.f2356i = fArr;
                            this.f2355g = i13;
                            this.f2354f = i13;
                            this.f2357j = x5Var.d;
                            this.f2358k = x5Var.e;
                            return;
                        }
                        this.f2354f = i13;
                        this.f2355g = i13;
                        return;
                    }
                    x5Var.d = (v5Var.f2300c * 0.01f) + x5Var.d;
                    x5Var.e = (f7 * 0.01f) + x5Var.e;
                    this.f2354f = 1;
                    this.f2355g = 1;
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
        this.f2352b.add(new v5(2, f7, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = -1.0f;
        }
        this.f2352b.add(new v5(6, f7, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(c6 c6Var, int i10, float f7) {
        this.f2352b.add(new v5(5, 0.0f, 0.0f, 32, i10, f7, c6Var, null));
    }
}
