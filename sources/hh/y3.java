package hh;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.er;

public final class y3 {

    public final z3 f10367a;
    public androidx.car.app.utils.b d;

    public int f10371f;

    public int f10372g;

    public float f10374j;

    public float f10375k;

    public final ArrayList f10368b = new ArrayList();

    public int f10369c = 0;

    public boolean f10370e = false;
    public final float[] h = new float[16];

    public float[] f10373i = new float[16];

    public boolean f10376l = false;

    public y3(z3 z3Var) {
        this.f10367a = z3Var;
    }

    public final void a(int i10) {
        this.f10368b.add(new x3(3, 0.0f, 0.0f, i10, -1, 0.0f, null, null));
    }

    public final void b() {
        androidx.car.app.utils.b bVar;
        boolean z10 = this.f10370e;
        z3 z3Var = this.f10367a;
        if (!z10) {
            int i10 = this.f10369c;
            ArrayList arrayList = this.f10368b;
            if (i10 < arrayList.size()) {
                x3 x3Var = (x3) arrayList.get(this.f10369c);
                this.f10369c++;
                int i11 = x3Var.f10331a;
                int i12 = x3Var.f10334e;
                float f10 = x3Var.f10332b;
                int i13 = x3Var.d;
                int iB = m1.j.b(i11);
                if (iB == 0) {
                    Runnable runnable = x3Var.h;
                    if (runnable != null) {
                        runnable.run();
                    }
                    b();
                    return;
                }
                if (iB == 1) {
                    z3Var.d = (x3Var.f10333c * 0.01f) + z3Var.d;
                    z3Var.f10413e = (f10 * 0.01f) + z3Var.f10413e;
                    this.f10371f = 1;
                    this.f10372g = 1;
                    return;
                }
                if (iB == 2) {
                    this.f10371f = i13;
                    this.f10372g = i13;
                    return;
                }
                if (iB == 3) {
                    System.arraycopy(z3Var.f10412c, 0, this.h, 0, 16);
                    float f11 = x3Var.f10335f;
                    float[] fArr = new float[16];
                    Matrix.setIdentityM(fArr, 0);
                    if (f11 != 0.0f) {
                        Matrix.rotateM(fArr, 0, -f11, 0.0f, 0.0f, 1.0f);
                    }
                    if (i12 == 0) {
                        Matrix.rotateM(fArr, 0, 90.0f, 0.0f, 1.0f, 0.0f);
                    } else if (i12 == 1) {
                        Matrix.rotateM(fArr, 0, -90.0f, 0.0f, 1.0f, 0.0f);
                    } else if (i12 == 2) {
                        Matrix.rotateM(fArr, 0, 90.0f, 1.0f, 0.0f, 0.0f);
                    } else if (i12 == 3) {
                        Matrix.rotateM(fArr, 0, -90.0f, 1.0f, 0.0f, 0.0f);
                    } else if (i12 == 4) {
                        Matrix.rotateM(fArr, 0, 180.0f, 0.0f, 1.0f, 0.0f);
                    }
                    this.f10373i = fArr;
                    this.f10372g = i13;
                    this.f10371f = i13;
                    this.f10374j = z3Var.d;
                    this.f10375k = z3Var.f10413e;
                    return;
                }
                if (iB != 4) {
                    if (iB != 5) {
                        return;
                    }
                    z3Var.f10414f = f10 > 0.0f;
                    b();
                    return;
                }
                this.f10376l = true;
                View view = x3Var.f10336g;
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
                z3Var.addView(view, h7.z5.e(64, 64, 17));
                z3Var.v.add(Integer.valueOf(i12));
                z3Var.f10418w.put(Integer.valueOf(childCount), Integer.valueOf(i12));
                z3Var.f10419x.put(Integer.valueOf(childCount), rectF);
                z3Var.B = childCount;
                z3Var.A = 0.0f;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                z3Var.C = valueAnimatorOfFloat;
                valueAnimatorOfFloat.addUpdateListener(new ag.u(z3Var, 7));
                z3Var.C.addListener(new ag.r1(z3Var, 6));
                z3Var.C.setDuration(((long) i13) * 16);
                z3Var.C.setInterpolator(er.h);
                z3Var.C.start();
                return;
            }
        }
        z3Var.D = null;
        if (this.f10370e || (bVar = this.d) == null) {
            return;
        }
        bVar.run();
    }

    public final void c(float f10, float f11) {
        this.f10368b.add(new x3(2, f10, f11, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z10) {
        this.f10368b.add(new x3(6, z10 ? 1.0f : -1.0f, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(e4 e4Var, int i10, float f10) {
        this.f10368b.add(new x3(5, 0.0f, 0.0f, 32, i10, f10, e4Var, null));
    }
}
