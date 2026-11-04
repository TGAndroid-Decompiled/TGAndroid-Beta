package ci;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import b8.mf;
import java.util.ArrayList;
import org.telegram.ui.Components.xq;
public final class a5 {
    public final b5 f4816a;
    public ai.z3 d;
    public int f4820f;
    public int f4821g;
    public float f4823j;
    public float f4824k;
    public final ArrayList f4817b = new ArrayList();
    public int f4818c = 0;
    public boolean f4819e = false;
    public final float[] h = new float[16];
    public float[] f4822i = new float[16];
    public boolean f4825l = false;

    public a5(b5 b5Var) {
        this.f4816a = b5Var;
    }

    public final void a(int i3) {
        this.f4817b.add(new z4(3, 0.0f, 0.0f, i3, -1, 0.0f, null, null));
    }

    public final void b() {
        ai.z3 z3Var;
        boolean z10 = this.f4819e;
        b5 b5Var = this.f4816a;
        if (!z10) {
            int i3 = this.f4818c;
            ArrayList arrayList = this.f4817b;
            if (i3 < arrayList.size()) {
                z4 z4Var = (z4) arrayList.get(this.f4818c);
                boolean z11 = true;
                this.f4818c++;
                int i10 = z4Var.f6452a;
                int i11 = z4Var.f6455e;
                float f10 = z4Var.f6453b;
                int i12 = z4Var.d;
                int c2 = o1.g.c(i10);
                if (c2 != 0) {
                    if (c2 != 1) {
                        if (c2 != 2) {
                            if (c2 != 3) {
                                if (c2 != 4) {
                                    if (c2 == 5) {
                                        if (f10 <= 0.0f) {
                                            z11 = false;
                                        }
                                        b5Var.f4869f = z11;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f4825l = true;
                                View view = z4Var.f6457g;
                                ValueAnimator valueAnimator = b5Var.H;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    b5Var.H = null;
                                }
                                RectF rectF = new RectF();
                                rectF.left = view.getX() - b5Var.getX();
                                rectF.top = view.getY() - b5Var.getY();
                                rectF.right = rectF.left + view.getWidth();
                                rectF.bottom = rectF.top + view.getHeight();
                                org.telegram.messenger.g0.E2(view);
                                int childCount = b5Var.getChildCount();
                                b5Var.addView(view, mf.e(64, 64, 17));
                                b5Var.f4873w.add(Integer.valueOf(i11));
                                b5Var.f4874x.put(Integer.valueOf(childCount), Integer.valueOf(i11));
                                b5Var.f4875y.put(Integer.valueOf(childCount), rectF);
                                b5Var.G = childCount;
                                b5Var.F = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                b5Var.H = ofFloat;
                                ofFloat.addUpdateListener(new bh.f(b5Var, 5));
                                b5Var.H.addListener(new ai.e1(b5Var, 1));
                                b5Var.H.setDuration(i12 * 16);
                                b5Var.H.setInterpolator(xq.h);
                                b5Var.H.start();
                                return;
                            }
                            System.arraycopy(b5Var.f4867c, 0, this.h, 0, 16);
                            float f11 = z4Var.f6456f;
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
                            this.f4822i = fArr;
                            this.f4821g = i12;
                            this.f4820f = i12;
                            this.f4823j = b5Var.d;
                            this.f4824k = b5Var.f4868e;
                            return;
                        }
                        this.f4820f = i12;
                        this.f4821g = i12;
                        return;
                    }
                    b5Var.d = (z4Var.f6454c * 0.01f) + b5Var.d;
                    b5Var.f4868e = (f10 * 0.01f) + b5Var.f4868e;
                    this.f4820f = 1;
                    this.f4821g = 1;
                    return;
                }
                Runnable runnable = z4Var.h;
                if (runnable != null) {
                    runnable.run();
                }
                b();
                return;
            }
        }
        b5Var.I = null;
        if (!this.f4819e && (z3Var = this.d) != null) {
            z3Var.run();
        }
    }

    public final void c(float f10, float f11) {
        this.f4817b.add(new z4(2, f10, f11, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = -1.0f;
        }
        this.f4817b.add(new z4(6, f10, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(f5 f5Var, int i3, float f10) {
        this.f4817b.add(new z4(5, 0.0f, 0.0f, 32, i3, f10, f5Var, null));
    }
}
