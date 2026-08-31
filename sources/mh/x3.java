package mh;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
public final class x3 {
    public final y3 f15035a;
    public androidx.car.app.utils.c d;
    public int f15039f;
    public int f15040g;
    public float f15042j;
    public float f15043k;
    public final ArrayList f15036b = new ArrayList();
    public int f15037c = 0;
    public boolean f15038e = false;
    public final float[] h = new float[16];
    public float[] f15041i = new float[16];
    public boolean f15044l = false;

    public x3(y3 y3Var) {
        this.f15035a = y3Var;
    }

    public final void a(int i10) {
        this.f15036b.add(new w3(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        androidx.car.app.utils.c cVar;
        boolean z4 = this.f15038e;
        y3 y3Var = this.f15035a;
        if (!z4) {
            int i10 = this.f15037c;
            ArrayList arrayList = this.f15036b;
            if (i10 < arrayList.size()) {
                w3 w3Var = (w3) arrayList.get(this.f15037c);
                boolean z10 = true;
                this.f15037c++;
                int i11 = w3Var.f14972a;
                int i12 = w3Var.f14975e;
                float f10 = w3Var.f14973b;
                int i13 = w3Var.d;
                int c3 = m1.j.c(i11);
                if (c3 != 0) {
                    if (c3 != 1) {
                        if (c3 != 2) {
                            if (c3 != 3) {
                                if (c3 != 4) {
                                    if (c3 == 5) {
                                        if (f10 <= 0.0f) {
                                            z10 = false;
                                        }
                                        y3Var.f15087f = z10;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f15044l = true;
                                View view = w3Var.f14977g;
                                ValueAnimator valueAnimator = y3Var.D;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    y3Var.D = null;
                                }
                                RectF rectF = new RectF();
                                rectF.left = view.getX() - y3Var.getX();
                                rectF.top = view.getY() - y3Var.getY();
                                rectF.right = rectF.left + view.getWidth();
                                rectF.bottom = rectF.top + view.getHeight();
                                AndroidUtilities.removeFromParent(view);
                                int childCount = y3Var.getChildCount();
                                y3Var.addView(view, k7.c6.e(64, 64, 17));
                                y3Var.v.add(Integer.valueOf(i12));
                                y3Var.f15091w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                                y3Var.f15092x.put(Integer.valueOf(childCount), rectF);
                                y3Var.C = childCount;
                                y3Var.B = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                y3Var.D = ofFloat;
                                ofFloat.addUpdateListener(new eg.m1(y3Var, 13));
                                y3Var.D.addListener(new dg.l0(y3Var, 10));
                                y3Var.D.setDuration(i13 * 16);
                                y3Var.D.setInterpolator(pr.h);
                                y3Var.D.start();
                                return;
                            }
                            System.arraycopy(y3Var.f15085c, 0, this.h, 0, 16);
                            float f11 = w3Var.f14976f;
                            float[] fArr = new float[16];
                            Matrix.setIdentityM(fArr, 0);
                            if (f11 != 0.0f) {
                                Matrix.rotateM(fArr, 0, -f11, 0.0f, 0.0f, 1.0f);
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
                            this.f15041i = fArr;
                            this.f15040g = i13;
                            this.f15039f = i13;
                            this.f15042j = y3Var.d;
                            this.f15043k = y3Var.f15086e;
                            return;
                        }
                        this.f15039f = i13;
                        this.f15040g = i13;
                        return;
                    }
                    y3Var.d = (w3Var.f14974c * 0.01f) + y3Var.d;
                    y3Var.f15086e = (f10 * 0.01f) + y3Var.f15086e;
                    this.f15039f = 1;
                    this.f15040g = 1;
                    return;
                }
                Runnable runnable = w3Var.h;
                if (runnable != null) {
                    runnable.run();
                }
                b();
                return;
            }
        }
        y3Var.E = null;
        if (!this.f15038e && (cVar = this.d) != null) {
            cVar.run();
        }
    }

    public final void c(float f10, float f11) {
        this.f15036b.add(new w3(2, f10, f11, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z4) {
        float f10;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = -1.0f;
        }
        this.f15036b.add(new w3(6, f10, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(d4 d4Var, int i10, float f10) {
        this.f15036b.add(new w3(5, 0.0f, 0.0f, 32, i10, f10, d4Var, null));
    }
}
