package defpackage;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
public final class odc {
    public static final Matrix p = new Matrix();
    public final Path a;
    public final Path b;
    public final Matrix c;
    public Paint d;
    public Paint e;
    public PathMeasure f;
    public final ldc g;
    public float h;
    public float i;
    public float j;
    public float k;
    public int l;
    public String m;
    public Boolean n;
    public final qs o;

    public odc(odc odcVar) {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        ?? vlaVar = new vla(0);
        this.o = vlaVar;
        this.g = new ldc(odcVar.g, vlaVar);
        this.a = new Path(odcVar.a);
        this.b = new Path(odcVar.b);
        this.h = odcVar.h;
        this.i = odcVar.i;
        this.j = odcVar.j;
        this.k = odcVar.k;
        this.l = odcVar.l;
        this.m = odcVar.m;
        String str = odcVar.m;
        if (str != null) {
            vlaVar.put(str, this);
        }
        this.n = odcVar.n;
    }

    public final void a(ldc ldcVar, Matrix matrix, Canvas canvas, int i, int i2) {
        int i3;
        float f;
        float f2;
        int i4;
        float f3;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = ldcVar.a;
        ArrayList arrayList = ldcVar.b;
        matrix2.set(matrix);
        Matrix matrix3 = ldcVar.a;
        matrix3.preConcat(ldcVar.j);
        canvas.save();
        char c = 0;
        int i5 = 0;
        while (i5 < arrayList.size()) {
            mdc mdcVar = (mdc) arrayList.get(i5);
            if (mdcVar instanceof ldc) {
                a((ldc) mdcVar, matrix3, canvas, i, i2);
            } else if (mdcVar instanceof ndc) {
                ndc ndcVar = (ndc) mdcVar;
                float f4 = i / this.j;
                float f5 = i2 / this.k;
                float min = Math.min(f4, f5);
                Matrix matrix4 = this.c;
                matrix4.set(matrix3);
                matrix4.postScale(f4, f5);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                boolean z = c;
                i3 = i5;
                float f6 = (fArr[z ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max((float) Math.hypot(fArr[c], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
                if (max > 0.0f) {
                    f = Math.abs(f6) / max;
                } else {
                    f = 0.0f;
                }
                if (f != 0.0f) {
                    Path path = this.a;
                    path.reset();
                    q18[] q18VarArr = ndcVar.a;
                    if (q18VarArr != null) {
                        hve.f(q18VarArr, path);
                    }
                    Path path2 = this.b;
                    path2.reset();
                    if (ndcVar instanceof jdc) {
                        if (ndcVar.c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        kdc kdcVar = (kdc) ndcVar;
                        float f7 = kdcVar.i;
                        if (f7 != 0.0f || kdcVar.j != 1.0f) {
                            float f8 = kdcVar.k;
                            float f9 = (f7 + f8) % 1.0f;
                            float f10 = (kdcVar.j + f8) % 1.0f;
                            PathMeasure pathMeasure = this.f;
                            PathMeasure pathMeasure2 = pathMeasure;
                            if (pathMeasure == null) {
                                PathMeasure pathMeasure3 = new PathMeasure();
                                this.f = pathMeasure3;
                                pathMeasure2 = pathMeasure3;
                            }
                            pathMeasure2.setPath(path, z);
                            float length = this.f.getLength();
                            float f11 = f9 * length;
                            float f12 = f10 * length;
                            path.reset();
                            int i6 = (f11 > f12 ? 1 : (f11 == f12 ? 0 : -1));
                            PathMeasure pathMeasure4 = this.f;
                            if (i6 > 0) {
                                pathMeasure4.getSegment(f11, length, path, true);
                                f2 = 0.0f;
                                this.f.getSegment(0.0f, f12, path, true);
                            } else {
                                f2 = 0.0f;
                                pathMeasure4.getSegment(f11, f12, path, true);
                            }
                            path.rLineTo(f2, f2);
                        }
                        path2.addPath(path, matrix4);
                        lp lpVar = kdcVar.f;
                        if (((Shader) lpVar.c) != null || lpVar.b != 0) {
                            if (this.e == null) {
                                i4 = 16777215;
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i4 = 16777215;
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) lpVar.c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(kdcVar.h * 255.0f));
                                f3 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i7 = lpVar.b;
                                float f13 = kdcVar.h;
                                PorterDuff.Mode mode = rdc.w;
                                f3 = 255.0f;
                                paint2.setColor((i7 & i4) | (((int) (Color.alpha(i7) * f13)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (kdcVar.c == 0) {
                                fillType = Path.FillType.WINDING;
                            } else {
                                fillType = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType);
                            canvas.drawPath(path2, paint2);
                        } else {
                            f3 = 255.0f;
                            i4 = 16777215;
                        }
                        lp lpVar2 = kdcVar.d;
                        if (((Shader) lpVar2.c) != null || lpVar2.b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = kdcVar.m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = kdcVar.l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(kdcVar.n);
                            Shader shader2 = (Shader) lpVar2.c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(kdcVar.g * f3));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i8 = lpVar2.b;
                                float f14 = kdcVar.g;
                                PorterDuff.Mode mode2 = rdc.w;
                                paint4.setColor((i8 & i4) | (((int) (Color.alpha(i8) * f14)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(kdcVar.e * min * f);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i5 = i3 + 1;
                c = 0;
            }
            i3 = i5;
            i5 = i3 + 1;
            c = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.l;
    }

    public void setAlpha(float f) {
        setRootAlpha((int) (f * 255.0f));
    }

    public void setRootAlpha(int i) {
        this.l = i;
    }

    public odc() {
        this.c = new Matrix();
        this.h = 0.0f;
        this.i = 0.0f;
        this.j = 0.0f;
        this.k = 0.0f;
        this.l = 255;
        this.m = null;
        this.n = null;
        this.o = new vla(0);
        this.g = new ldc();
        this.a = new Path();
        this.b = new Path();
    }
}
