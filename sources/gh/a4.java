package gh;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gr;
public final class a4 {
    public final b4 f7778a;
    public androidx.car.app.utils.c d;
    public int f7782f;
    public int f7783g;
    public float f7785j;
    public float f7786k;
    public final ArrayList f7779b = new ArrayList();
    public int f7780c = 0;
    public boolean f7781e = false;
    public final float[] h = new float[16];
    public float[] f7784i = new float[16];
    public boolean f7787l = false;

    public a4(b4 b4Var) {
        this.f7778a = b4Var;
    }

    public final void a(int i9) {
        this.f7779b.add(new z3(3, 0.0f, 0.0f, i9, -1, 0.0f, null, null));
    }

    public final void b() {
        androidx.car.app.utils.c cVar;
        boolean z10 = this.f7781e;
        b4 b4Var = this.f7778a;
        if (!z10) {
            int i9 = this.f7780c;
            ArrayList arrayList = this.f7779b;
            if (i9 < arrayList.size()) {
                z3 z3Var = (z3) arrayList.get(this.f7780c);
                boolean z11 = true;
                this.f7780c++;
                int i10 = z3Var.f9250a;
                int i11 = z3Var.f9253e;
                float f10 = z3Var.f9251b;
                int i12 = z3Var.d;
                int b10 = m1.j.b(i10);
                if (b10 != 0) {
                    if (b10 != 1) {
                        if (b10 != 2) {
                            if (b10 != 3) {
                                if (b10 != 4) {
                                    if (b10 == 5) {
                                        if (f10 <= 0.0f) {
                                            z11 = false;
                                        }
                                        b4Var.f7846f = z11;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.f7787l = true;
                                View view = z3Var.f9255g;
                                ValueAnimator valueAnimator = b4Var.C;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    b4Var.C = null;
                                }
                                RectF rectF = new RectF();
                                rectF.left = view.getX() - b4Var.getX();
                                rectF.top = view.getY() - b4Var.getY();
                                rectF.right = rectF.left + view.getWidth();
                                rectF.bottom = rectF.top + view.getHeight();
                                AndroidUtilities.removeFromParent(view);
                                int childCount = b4Var.getChildCount();
                                b4Var.addView(view, g7.e6.e(64, 64, 17));
                                b4Var.v.add(Integer.valueOf(i11));
                                b4Var.f7850w.put(Integer.valueOf(childCount), Integer.valueOf(i11));
                                b4Var.f7851x.put(Integer.valueOf(childCount), rectF);
                                b4Var.B = childCount;
                                b4Var.A = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                b4Var.C = ofFloat;
                                ofFloat.addUpdateListener(new bg.b(b4Var, 4));
                                b4Var.C.addListener(new ag.e(b4Var, 4));
                                b4Var.C.setDuration(i12 * 16);
                                b4Var.C.setInterpolator(gr.h);
                                b4Var.C.start();
                                return;
                            }
                            System.arraycopy(b4Var.f7844c, 0, this.h, 0, 16);
                            float f11 = z3Var.f9254f;
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
                            this.f7784i = fArr;
                            this.f7783g = i12;
                            this.f7782f = i12;
                            this.f7785j = b4Var.d;
                            this.f7786k = b4Var.f7845e;
                            return;
                        }
                        this.f7782f = i12;
                        this.f7783g = i12;
                        return;
                    }
                    b4Var.d = (z3Var.f9252c * 0.01f) + b4Var.d;
                    b4Var.f7845e = (f10 * 0.01f) + b4Var.f7845e;
                    this.f7782f = 1;
                    this.f7783g = 1;
                    return;
                }
                Runnable runnable = z3Var.h;
                if (runnable != null) {
                    runnable.run();
                }
                b();
                return;
            }
        }
        b4Var.D = null;
        if (!this.f7781e && (cVar = this.d) != null) {
            cVar.run();
        }
    }

    public final void c(float f10, float f11) {
        this.f7779b.add(new z3(2, f10, f11, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        float f10;
        if (z10) {
            f10 = 1.0f;
        } else {
            f10 = -1.0f;
        }
        this.f7779b.add(new z3(6, f10, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(g4 g4Var, int i9, float f10) {
        this.f7779b.add(new z3(5, 0.0f, 0.0f, 32, i9, f10, g4Var, null));
    }
}
