package defpackage;

import android.animation.ValueAnimator;
import android.graphics.RectF;
import android.opengl.Matrix;
import java.util.ArrayList;
public final class npa {
    public final opa a;
    public bm8 d;
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

    public npa(opa opaVar) {
        this.a = opaVar;
    }

    public final void a(int i) {
        this.b.add(new mpa(3, 0.0f, 0.0f, i, -1, 0.0f, null, null));
    }

    public final void b() {
        bm8 bm8Var;
        boolean z = this.e;
        opa opaVar = this.a;
        if (!z) {
            int i = this.c;
            ArrayList arrayList = this.b;
            if (i < arrayList.size()) {
                mpa mpaVar = (mpa) arrayList.get(this.c);
                boolean z2 = true;
                this.c++;
                int i2 = mpaVar.a;
                int i3 = mpaVar.e;
                float f = mpaVar.b;
                byte b = mpaVar.d;
                int F = ug8.F(i2);
                if (F != 0) {
                    if (F != 1) {
                        if (F != 2) {
                            if (F != 3) {
                                if (F != 4) {
                                    if (F == 5) {
                                        if (f <= 0.0f) {
                                            z2 = false;
                                        }
                                        opaVar.f = z2;
                                        b();
                                        return;
                                    }
                                    return;
                                }
                                this.l = true;
                                spa spaVar = mpaVar.g;
                                int i4 = opa.K;
                                ValueAnimator valueAnimator = opaVar.H;
                                if (valueAnimator != null) {
                                    valueAnimator.cancel();
                                    opaVar.H = null;
                                }
                                RectF rectF = new RectF();
                                rectF.left = spaVar.getX() - opaVar.getX();
                                rectF.top = spaVar.getY() - opaVar.getY();
                                rectF.right = rectF.left + spaVar.getWidth();
                                rectF.bottom = rectF.top + spaVar.getHeight();
                                gl.B2(spaVar);
                                int childCount = opaVar.getChildCount();
                                opaVar.addView(spaVar, nme.e(64, 64, 17));
                                opaVar.w.add(Integer.valueOf(i3));
                                opaVar.x.put(Integer.valueOf(childCount), Integer.valueOf(i3));
                                opaVar.y.put(Integer.valueOf(childCount), rectF);
                                opaVar.G = childCount;
                                opaVar.F = 0.0f;
                                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                                opaVar.H = ofFloat;
                                ofFloat.addUpdateListener(new gja(opaVar, (byte) 3));
                                opaVar.H.addListener(new ng9(opaVar, (byte) 19));
                                opaVar.H.setDuration(b << 4);
                                opaVar.H.setInterpolator(s33.h);
                                opaVar.H.start();
                                return;
                            }
                            System.arraycopy(opaVar.c, 0, this.h, 0, 16);
                            float f2 = mpaVar.f;
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
                            this.j = opaVar.d;
                            this.k = opaVar.e;
                            return;
                        }
                        this.f = b;
                        this.g = b;
                        return;
                    }
                    opaVar.d = (mpaVar.c * 0.01f) + opaVar.d;
                    opaVar.e = (f * 0.01f) + opaVar.e;
                    this.f = 1;
                    this.g = (byte) 1;
                    return;
                }
                t79 t79Var = mpaVar.h;
                if (t79Var != null) {
                    t79Var.run();
                }
                b();
                return;
            }
        }
        opaVar.I = null;
        if (!this.e && (bm8Var = this.d) != null) {
            bm8Var.run();
        }
    }

    public final void c(float f, float f2) {
        this.b.add(new mpa(2, f, f2, 0, -1, 0.0f, null, null));
    }

    public final void d(boolean z) {
        float f;
        if (z) {
            f = 1.0f;
        } else {
            f = -1.0f;
        }
        this.b.add(new mpa(6, f, 0.0f, 0, -1, 0.0f, null, null));
    }

    public final void e(spa spaVar, int i, float f) {
        this.b.add(new mpa(5, 0.0f, 0.0f, 32, i, f, spaVar, null));
    }
}
