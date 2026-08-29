package jh;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.jr;
public final class y3 {
    public final z3 f13114a;
    public androidx.car.app.utils.c d;
    public int f13118f;
    public int f13119g;
    public float f13121j;
    public float f13122k;
    public final ArrayList f13115b = new ArrayList();
    public int f13116c = 0;
    public boolean f13117e = false;
    public final float[] h = new float[16];
    public float[] f13120i = new float[16];
    public boolean f13123l = false;

    public y3(z3 z3Var) {
        this.f13114a = z3Var;
    }

    public final void a(int i10) {
        this.f13115b.add(new x3(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        androidx.car.app.utils.c cVar;
        boolean z10 = this.f13117e;
        z3 z3Var = this.f13114a;
        if (!z10) {
            int i10 = this.f13116c;
            ArrayList arrayList = this.f13115b;
            if (i10 < arrayList.size()) {
                x3 x3Var = (x3) arrayList.get(this.f13116c);
                boolean z11 = true;
                this.f13116c++;
                int i11 = x3Var.f13058a;
                int i12 = x3Var.f13061e;
                float f9 = x3Var.f13059b;
                int i13 = x3Var.d;
                int b10 = m1.j.b(i11);
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 != 2) {
                            if (b10 != 3) {
                                if (b10 != 4) {
                                    if (b10 == 5) {
                                        if (f9 <= 0.0f) {
                                            z11 = false;
                                        }
                                        z3Var.f13162f = z11;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f13123l = true;
                                View view = x3Var.f13063g;
                                ValueAnimator valueAnimator = z3Var.C;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    z3Var.C = null;
                                }
                                RectF rectF = new RectF();
                                rectF.left = view.getX() - z3Var.getX();
                                rectF.top = view.getY() - z3Var.getY();
                                rectF.right = rectF.left + view.getWidth();
                                rectF.bottom = rectF.top + view.getHeight();
                                AndroidUtilities.removeFromParent(view);
                                int childCount = z3Var.getChildCount();
                                z3Var.addView(view, i7.f6.e(64, 64, 17));
                                z3Var.v.add(Integer.valueOf(i12));
                                z3Var.f13166w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                                z3Var.f13167x.put(Integer.valueOf(childCount), rectF);
                                z3Var.B = childCount;
                                z3Var.A = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                z3Var.C = ofFloat;
                                ofFloat.addUpdateListener(new bg.q1(z3Var, 13));
                                z3Var.C.addListener(new ag.m0(z3Var, 9));
                                z3Var.C.setDuration(i13 * 16);
                                z3Var.C.setInterpolator(jr.h);
                                z3Var.C.start();
                                return;
                            }
                            System.arraycopy(z3Var.f13160c, 0, this.h, 0, 16);
                            float f10 = x3Var.f13062f;
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
                            this.f13120i = fArr;
                            this.f13119g = i13;
                            this.f13118f = i13;
                            this.f13121j = z3Var.d;
                            this.f13122k = z3Var.f13161e;
                            return;
                        }
                        this.f13118f = i13;
                        this.f13119g = i13;
                        return;
                    }
                    z3Var.d = (x3Var.f13060c * 0.01f) + z3Var.d;
                    z3Var.f13161e = (f9 * 0.01f) + z3Var.f13161e;
                    this.f13118f = 1;
                    this.f13119g = 1;
                    return;
                }
                Runnable runnable = x3Var.h;
                if (runnable != null) {
                    runnable.run();
                }
                b();
                return;
            }
        }
        z3Var.D = null;
        if (!this.f13117e && (cVar = this.d) != null) {
            cVar.run();
        }
    }

    public final void c(float f9, float f10) {
        this.f13115b.add(new x3(2, f9, f10, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        float f9;
        if (z10) {
            f9 = 1.0f;
        } else {
            f9 = -1.0f;
        }
        this.f13115b.add(new x3(6, f9, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(e4 e4Var, int i10, float f9) {
        this.f13115b.add(new x3(5, 0.0f, 0.0f, 32, i10, f9, e4Var, null));
    }
}
