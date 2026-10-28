package bi;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.Components.kb1;
public final class r5 {
    public final s5 f5327a;
    public ai.e0 d;
    public int f5330f;
    public int f5331g;
    public float f5333j;
    public float f5334k;
    public final ArrayList f5328b = new ArrayList();
    public int f5329c = 0;
    public boolean e = false;
    public final float[] h = new float[16];
    public float[] f5332i = new float[16];
    public boolean f5335l = false;

    public r5(s5 s5Var) {
        this.f5327a = s5Var;
    }

    public final void a(int i10) {
        this.f5328b.add(new q5(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        ai.e0 e0Var;
        boolean z10 = this.e;
        s5 s5Var = this.f5327a;
        if (!z10) {
            int i10 = this.f5329c;
            ArrayList arrayList = this.f5328b;
            if (i10 < arrayList.size()) {
                q5 q5Var = (q5) arrayList.get(this.f5329c);
                boolean z11 = true;
                this.f5329c++;
                int i11 = q5Var.f5267a;
                int i12 = q5Var.e;
                float f7 = q5Var.f5268b;
                int i13 = q5Var.d;
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
                                        s5Var.f5400f = z11;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f5335l = true;
                                View view = q5Var.f5271g;
                                ValueAnimator valueAnimator = s5Var.G;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    s5Var.G = null;
                                }
                                RectF rectF = new RectF();
                                rectF.left = view.getX() - s5Var.getX();
                                rectF.top = view.getY() - s5Var.getY();
                                rectF.right = rectF.left + view.getWidth();
                                rectF.bottom = rectF.top + view.getHeight();
                                AndroidUtilities.removeFromParent(view);
                                int childCount = s5Var.getChildCount();
                                s5Var.addView(view, kb1.i(64, 64, 17));
                                s5Var.v.add(Integer.valueOf(i12));
                                s5Var.f5404w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                                s5Var.f5405x.put(Integer.valueOf(childCount), rectF);
                                s5Var.F = childCount;
                                s5Var.E = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                s5Var.G = ofFloat;
                                ofFloat.addUpdateListener(new ai.g0(s5Var, 5));
                                s5Var.G.addListener(new bh.b(s5Var, 4));
                                s5Var.G.setDuration(i13 * 16);
                                s5Var.G.setInterpolator(ds.h);
                                s5Var.G.start();
                                return;
                            }
                            System.arraycopy(s5Var.f5399c, 0, this.h, 0, 16);
                            float f10 = q5Var.f5270f;
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
                            this.f5332i = fArr;
                            this.f5331g = i13;
                            this.f5330f = i13;
                            this.f5333j = s5Var.d;
                            this.f5334k = s5Var.e;
                            return;
                        }
                        this.f5330f = i13;
                        this.f5331g = i13;
                        return;
                    }
                    s5Var.d = (q5Var.f5269c * 0.01f) + s5Var.d;
                    s5Var.e = (f7 * 0.01f) + s5Var.e;
                    this.f5330f = 1;
                    this.f5331g = 1;
                    return;
                }
                Runnable runnable = q5Var.h;
                if (runnable != null) {
                    runnable.run();
                }
                b();
                return;
            }
        }
        s5Var.H = null;
        if (!this.e && (e0Var = this.d) != null) {
            e0Var.run();
        }
    }

    public final void c(float f7, float f10) {
        this.f5328b.add(new q5(2, f7, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        float f7;
        if (z10) {
            f7 = 1.0f;
        } else {
            f7 = -1.0f;
        }
        this.f5328b.add(new q5(6, f7, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(x5 x5Var, int i10, float f7) {
        this.f5328b.add(new q5(5, 0.0f, 0.0f, 32, i10, f7, x5Var, null));
    }
}
