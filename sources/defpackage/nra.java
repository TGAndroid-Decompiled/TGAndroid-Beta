package defpackage;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import java.util.ArrayList;
public final class nra {
    public final ora a;
    public no8 d;
    public int f;
    public byte g;
    public float j;
    public float k;
    public final ArrayList b = new ArrayList();
    public int c = 0;
    public boolean e = false;
    public final float[] h = new float[16];
    public float[] i = new float[16];
    public boolean l = false;

    public nra(ora oraVar) {
        this.a = oraVar;
    }

    public final void a(int i) {
        this.b.add(new mra(3, 0.0f, 0.0f, i, -1, 0.0f, null, null));
    }

    public final void b() {
        no8 no8Var;
        boolean z = this.e;
        ora oraVar = this.a;
        if (!z) {
            int i = this.c;
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                mra mraVar = (mra) arrayList.get(this.c);
                boolean z2 = true;
                this.c++;
                int i2 = mraVar.a;
                int i3 = mraVar.e;
                float f = mraVar.b;
                byte b = mraVar.d;
                int F = wi8.F(i2);
                if (F != 0) {
                    if (F != 1) {
                        if (F != 2) {
                            if (F != 3) {
                                if (F != 4) {
                                    if (F == 5) {
                                        if (f <= 0.0f) {
                                            z2 = false;
                                        }
                                        oraVar.f = z2;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.l = true;
                                sra sraVar = mraVar.g;
                                int i4 = ora.K;
                                ValueAnimator valueAnimator = oraVar.H;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    oraVar.H = null;
                                }
                                RectF rectF = new RectF();
                                rectF.left = sraVar.getX() - oraVar.getX();
                                rectF.top = sraVar.getY() - oraVar.getY();
                                rectF.right = rectF.left + sraVar.getWidth();
                                rectF.bottom = rectF.top + sraVar.getHeight();
                                gm.B2(sraVar);
                                int childCount = oraVar.getChildCount();
                                oraVar.addView(sraVar, qoe.e(64, 64, 17));
                                oraVar.w.add(Integer.valueOf(i3));
                                oraVar.x.put(Integer.valueOf(childCount), Integer.valueOf(i3));
                                oraVar.y.put(Integer.valueOf(childCount), rectF);
                                oraVar.G = childCount;
                                oraVar.F = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                oraVar.H = ofFloat;
                                ofFloat.addUpdateListener(new rha(oraVar, (byte) 5));
                                oraVar.H.addListener(new c39(oraVar, (byte) 21));
                                oraVar.H.setDuration(b << 4);
                                oraVar.H.setInterpolator(d53.h);
                                oraVar.H.start();
                                return;
                            }
                            System.arraycopy(oraVar.c, 0, this.h, 0, 16);
                            float f2 = mraVar.f;
                            float[] fArr = new float[16];
                            Matrix.setIdentityM(fArr, 0);
                            if (f2 != 0.0f) {
                                Matrix.rotateM(fArr, 0, -f2, 0.0f, 0.0f, 1.0f);
                            }
                            if (i3 != 0) {
                                if (i3 != 1) {
                                    if (i3 != 2) {
                                        if (i3 != 3) {
                                            if (i3 == 4) {
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
                            this.i = fArr;
                            this.g = b;
                            this.f = b;
                            this.j = oraVar.d;
                            this.k = oraVar.e;
                            return;
                        }
                        this.f = b;
                        this.g = b;
                        return;
                    }
                    oraVar.d = (mraVar.c * 0.01f) + oraVar.d;
                    oraVar.e = (f * 0.01f) + oraVar.e;
                    this.f = 1;
                    this.g = (byte) 1;
                    return;
                }
                v99 v99Var = mraVar.h;
                if (v99Var != null) {
                    v99Var.run();
                }
                b();
                return;
            }
        }
        oraVar.I = null;
        if (!this.e && (no8Var = this.d) != null) {
            no8Var.run();
        }
    }

    public final void c(float f, float f2) {
        this.b.add(new mra(2, f, f2, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = -1.0f;
        }
        this.b.add(new mra(6, f, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(sra sraVar, int i, float f) {
        this.b.add(new mra(5, 0.0f, 0.0f, 32, i, f, sraVar, null));
    }
}
