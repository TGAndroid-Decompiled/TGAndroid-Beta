package k2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import b4.e0;
import java.util.ArrayList;
public final class m {
    public static final Matrix f10377p = new Matrix();
    public final Path f10378a;
    public final Path f10379b;
    public final Matrix f10380c;
    public Paint d;
    public Paint f10381e;
    public PathMeasure f10382f;
    public final j f10383g;
    public float h;
    public float f10384i;
    public float f10385j;
    public float f10386k;
    public int f10387l;
    public String f10388m;
    public Boolean f10389n;
    public final a0.f f10390o;

    public m() {
        this.f10380c = new Matrix();
        this.h = 0.0f;
        this.f10384i = 0.0f;
        this.f10385j = 0.0f;
        this.f10386k = 0.0f;
        this.f10387l = 255;
        this.f10388m = null;
        this.f10389n = null;
        this.f10390o = new a0.k(0);
        this.f10383g = new j();
        this.f10378a = new Path();
        this.f10379b = new Path();
    }

    public final void a(j jVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f10;
        float f11;
        int i13;
        float f12;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = jVar.f10365a;
        ArrayList arrayList = jVar.f10366b;
        matrix2.set(matrix);
        Matrix matrix3 = jVar.f10365a;
        matrix3.preConcat(jVar.f10372j);
        canvas.save();
        char c3 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            k kVar = (k) arrayList.get(i14);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i10, i11);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f13 = i10 / this.f10385j;
                float f14 = i11 / this.f10386k;
                float min = Math.min(f13, f14);
                Matrix matrix4 = this.f10380c;
                matrix4.set(matrix3);
                matrix4.postScale(f13, f14);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                i12 = i14;
                float f15 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max((float) Math.hypot(fArr[c3], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
                if (max > 0.0f) {
                    f10 = Math.abs(f15) / max;
                } else {
                    f10 = 0.0f;
                }
                if (f10 != 0.0f) {
                    Path path = this.f10378a;
                    path.reset();
                    i0.d[] dVarArr = lVar.f10374a;
                    if (dVarArr != null) {
                        i0.d.b(dVarArr, path);
                    }
                    Path path2 = this.f10379b;
                    path2.reset();
                    if (lVar instanceof h) {
                        if (lVar.f10376c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f16 = iVar.f10359i;
                        if (f16 != 0.0f || iVar.f10360j != 1.0f) {
                            float f17 = iVar.f10361k;
                            float f18 = (f16 + f17) % 1.0f;
                            float f19 = (iVar.f10360j + f17) % 1.0f;
                            if (this.f10382f == null) {
                                this.f10382f = new PathMeasure();
                            }
                            this.f10382f.setPath(path, false);
                            float length = this.f10382f.getLength();
                            float f20 = f18 * length;
                            float f21 = f19 * length;
                            path.reset();
                            if (f20 > f21) {
                                this.f10382f.getSegment(f20, length, path, true);
                                f11 = 0.0f;
                                this.f10382f.getSegment(0.0f, f21, path, true);
                            } else {
                                f11 = 0.0f;
                                this.f10382f.getSegment(f20, f21, path, true);
                            }
                            path.rLineTo(f11, f11);
                        }
                        path2.addPath(path, matrix4);
                        e0 e0Var = iVar.f10357f;
                        if (((Shader) e0Var.f1475c) != null || e0Var.f1474b != 0) {
                            if (this.f10381e == null) {
                                i13 = 16777215;
                                Paint paint = new Paint(1);
                                this.f10381e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i13 = 16777215;
                            }
                            Paint paint2 = this.f10381e;
                            Shader shader = (Shader) e0Var.f1475c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.h * 255.0f));
                                f12 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i15 = e0Var.f1474b;
                                float f22 = iVar.h;
                                PorterDuff.Mode mode = p.f10402s;
                                f12 = 255.0f;
                                paint2.setColor((i15 & i13) | (((int) (Color.alpha(i15) * f22)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (iVar.f10376c == 0) {
                                fillType = Path.FillType.WINDING;
                            } else {
                                fillType = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType);
                            canvas.drawPath(path2, paint2);
                        } else {
                            i13 = 16777215;
                            f12 = 255.0f;
                        }
                        e0 e0Var2 = iVar.d;
                        if (((Shader) e0Var2.f1475c) != null || e0Var2.f1474b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = iVar.f10363m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f10362l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f10364n);
                            Shader shader2 = (Shader) e0Var2.f1475c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f10358g * f12));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i16 = e0Var2.f1474b;
                                float f23 = iVar.f10358g;
                                PorterDuff.Mode mode2 = p.f10402s;
                                paint4.setColor((i16 & i13) | (((int) (Color.alpha(i16) * f23)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f10356e * min * f10);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i14 = i12 + 1;
                c3 = 0;
            }
            i12 = i14;
            i14 = i12 + 1;
            c3 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f10387l;
    }

    public void setAlpha(float f10) {
        setRootAlpha((int) (f10 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f10387l = i10;
    }

    public m(m mVar) {
        this.f10380c = new Matrix();
        this.h = 0.0f;
        this.f10384i = 0.0f;
        this.f10385j = 0.0f;
        this.f10386k = 0.0f;
        this.f10387l = 255;
        this.f10388m = null;
        this.f10389n = null;
        ?? kVar = new a0.k(0);
        this.f10390o = kVar;
        this.f10383g = new j(mVar.f10383g, kVar);
        this.f10378a = new Path(mVar.f10378a);
        this.f10379b = new Path(mVar.f10379b);
        this.h = mVar.h;
        this.f10384i = mVar.f10384i;
        this.f10385j = mVar.f10385j;
        this.f10386k = mVar.f10386k;
        this.f10387l = mVar.f10387l;
        this.f10388m = mVar.f10388m;
        String str = mVar.f10388m;
        if (str != null) {
            kVar.put(str, this);
        }
        this.f10389n = mVar.f10389n;
    }
}
