package lh;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.nr;
public final class x3 {
    public final y3 f13337a;
    public androidx.car.app.utils.c d;
    public int f13340f;
    public int f13341g;
    public float f13343j;
    public float f13344k;
    public final ArrayList f13338b = new ArrayList();
    public int f13339c = 0;
    public boolean e = false;
    public final float[] h = new float[16];
    public float[] f13342i = new float[16];
    public boolean f13345l = false;

    public x3(y3 y3Var) {
        this.f13337a = y3Var;
    }

    public final void a(int i10) {
        this.f13338b.add(new w3(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        androidx.car.app.utils.c cVar;
        boolean z4 = this.e;
        y3 y3Var = this.f13337a;
        if (!z4) {
            int i10 = this.f13339c;
            ArrayList arrayList = this.f13338b;
            if (i10 < arrayList.size()) {
                w3 w3Var = (w3) arrayList.get(this.f13339c);
                boolean z10 = true;
                this.f13339c++;
                int i11 = w3Var.f13284a;
                int i12 = w3Var.e;
                float f10 = w3Var.f13285b;
                int i13 = w3Var.d;
                int b10 = m1.j.b(i11);
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 != 2) {
                            if (b10 != 3) {
                                if (b10 != 4) {
                                    if (b10 == 5) {
                                        if (f10 <= 0.0f) {
                                            z10 = false;
                                        }
                                        y3Var.f13385f = z10;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f13345l = true;
                                View view = w3Var.f13288g;
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
                                y3Var.addView(view, k7.b6.e(64, 64, 17));
                                y3Var.v.add(Integer.valueOf(i12));
                                y3Var.f13389w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                                y3Var.f13390x.put(Integer.valueOf(childCount), rectF);
                                y3Var.C = childCount;
                                y3Var.B = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                y3Var.D = ofFloat;
                                ofFloat.addUpdateListener(new dg.o1(y3Var, 13));
                                y3Var.D.addListener(new cg.l0(y3Var, 9));
                                y3Var.D.setDuration(i13 * 16);
                                y3Var.D.setInterpolator(nr.h);
                                y3Var.D.start();
                                return;
                            }
                            System.arraycopy(y3Var.f13384c, 0, this.h, 0, 16);
                            float f11 = w3Var.f13287f;
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
                            this.f13342i = fArr;
                            this.f13341g = i13;
                            this.f13340f = i13;
                            this.f13343j = y3Var.d;
                            this.f13344k = y3Var.e;
                            return;
                        }
                        this.f13340f = i13;
                        this.f13341g = i13;
                        return;
                    }
                    y3Var.d = (w3Var.f13286c * 0.01f) + y3Var.d;
                    y3Var.e = (f10 * 0.01f) + y3Var.e;
                    this.f13340f = 1;
                    this.f13341g = 1;
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
        if (!this.e && (cVar = this.d) != null) {
            cVar.run();
        }
    }

    public final void c(float f10, float f11) {
        this.f13338b.add(new w3(2, f10, f11, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z4) {
        float f10;
        if (z4) {
            f10 = 1.0f;
        } else {
            f10 = -1.0f;
        }
        this.f13338b.add(new w3(6, f10, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(d4 d4Var, int i10, float f10) {
        this.f13338b.add(new w3(5, 0.0f, 0.0f, 32, i10, f10, d4Var, null));
    }
}
