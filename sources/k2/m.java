package k2;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;

public final class m {

    public static final Matrix f14376p = new Matrix();

    public final Path f14377a;

    public final Path f14378b;

    public final Matrix f14379c;
    public Paint d;

    public Paint f14380e;

    public PathMeasure f14381f;

    public final j f14382g;
    public float h;

    public float f14383i;

    public float f14384j;

    public float f14385k;

    public int f14386l;

    public String f14387m;

    public Boolean f14388n;

    public final a0.f f14389o;

    public m() {
        this.f14379c = new Matrix();
        this.h = 0.0f;
        this.f14383i = 0.0f;
        this.f14384j = 0.0f;
        this.f14385k = 0.0f;
        this.f14386l = 255;
        this.f14387m = null;
        this.f14388n = null;
        this.f14389o = new a0.f(0);
        this.f14382g = new j();
        this.f14377a = new Path();
        this.f14378b = new Path();
    }

    public final void a(j jVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f10;
        int i13;
        float f11;
        Matrix matrix2 = jVar.f14364a;
        ArrayList arrayList = jVar.f14365b;
        matrix2.set(matrix);
        Matrix matrix3 = jVar.f14364a;
        matrix3.preConcat(jVar.f14371j);
        canvas.save();
        char c10 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            k kVar = (k) arrayList.get(i14);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i10, i11);
            } else {
                if (kVar instanceof l) {
                    l lVar = (l) kVar;
                    float f12 = i10 / this.f14384j;
                    float f13 = i11 / this.f14385k;
                    float fMin = Math.min(f12, f13);
                    Matrix matrix4 = this.f14379c;
                    matrix4.set(matrix3);
                    matrix4.postScale(f12, f13);
                    float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                    matrix3.mapVectors(fArr);
                    float fHypot = (float) Math.hypot(fArr[c10], fArr[1]);
                    i12 = i14;
                    float fHypot2 = (float) Math.hypot(fArr[2], fArr[3]);
                    float f14 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                    float fMax = Math.max(fHypot, fHypot2);
                    float fAbs = fMax > 0.0f ? Math.abs(f14) / fMax : 0.0f;
                    if (fAbs != 0.0f) {
                        Path path = this.f14377a;
                        path.reset();
                        i0.e[] eVarArr = lVar.f14373a;
                        if (eVarArr != null) {
                            i0.e.b(eVarArr, path);
                        }
                        Path path2 = this.f14378b;
                        path2.reset();
                        if (lVar instanceof h) {
                            path2.setFillType(lVar.f14375c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                            path2.addPath(path, matrix4);
                            canvas.clipPath(path2);
                        } else {
                            i iVar = (i) lVar;
                            float f15 = iVar.f14358i;
                            if (f15 != 0.0f || iVar.f14359j != 1.0f) {
                                float f16 = iVar.f14360k;
                                float f17 = (f15 + f16) % 1.0f;
                                float f18 = (iVar.f14359j + f16) % 1.0f;
                                if (this.f14381f == null) {
                                    this.f14381f = new PathMeasure();
                                }
                                this.f14381f.setPath(path, false);
                                float length = this.f14381f.getLength();
                                float f19 = f17 * length;
                                float f20 = f18 * length;
                                path.reset();
                                if (f19 > f20) {
                                    this.f14381f.getSegment(f19, length, path, true);
                                    f10 = 0.0f;
                                    this.f14381f.getSegment(0.0f, f20, path, true);
                                } else {
                                    f10 = 0.0f;
                                    this.f14381f.getSegment(f19, f20, path, true);
                                }
                                path.rLineTo(f10, f10);
                            }
                            path2.addPath(path, matrix4);
                            b6.a aVar = iVar.f14356f;
                            if (((Shader) aVar.f2033b) == null && aVar.f2034c == 0) {
                                i13 = 16777215;
                                f11 = 255.0f;
                            } else {
                                if (this.f14380e == null) {
                                    i13 = 16777215;
                                    Paint paint = new Paint(1);
                                    this.f14380e = paint;
                                    paint.setStyle(Paint.Style.FILL);
                                } else {
                                    i13 = 16777215;
                                }
                                Paint paint2 = this.f14380e;
                                Shader shader = (Shader) aVar.f2033b;
                                if (shader != null) {
                                    shader.setLocalMatrix(matrix4);
                                    paint2.setShader(shader);
                                    paint2.setAlpha(Math.round(iVar.h * 255.0f));
                                    f11 = 255.0f;
                                } else {
                                    paint2.setShader(null);
                                    paint2.setAlpha(255);
                                    int i15 = aVar.f2034c;
                                    float f21 = iVar.h;
                                    PorterDuff.Mode mode = p.f14401s;
                                    f11 = 255.0f;
                                    paint2.setColor((i15 & i13) | (((int) (Color.alpha(i15) * f21)) << 24));
                                }
                                paint2.setColorFilter(null);
                                path2.setFillType(iVar.f14375c == 0 ? Path.FillType.WINDING : Path.FillType.EVEN_ODD);
                                canvas.drawPath(path2, paint2);
                            }
                            b6.a aVar2 = iVar.d;
                            if (((Shader) aVar2.f2033b) != null || aVar2.f2034c != 0) {
                                if (this.d == null) {
                                    Paint paint3 = new Paint(1);
                                    this.d = paint3;
                                    paint3.setStyle(Paint.Style.STROKE);
                                }
                                Paint paint4 = this.d;
                                Paint.Join join = iVar.f14362m;
                                if (join != null) {
                                    paint4.setStrokeJoin(join);
                                }
                                Paint.Cap cap = iVar.f14361l;
                                if (cap != null) {
                                    paint4.setStrokeCap(cap);
                                }
                                paint4.setStrokeMiter(iVar.f14363n);
                                Shader shader2 = (Shader) aVar2.f2033b;
                                if (shader2 != null) {
                                    shader2.setLocalMatrix(matrix4);
                                    paint4.setShader(shader2);
                                    paint4.setAlpha(Math.round(iVar.f14357g * f11));
                                } else {
                                    paint4.setShader(null);
                                    paint4.setAlpha(255);
                                    int i16 = aVar2.f2034c;
                                    float f22 = iVar.f14357g;
                                    PorterDuff.Mode mode2 = p.f14401s;
                                    paint4.setColor((i16 & i13) | (((int) (Color.alpha(i16) * f22)) << 24));
                                }
                                paint4.setColorFilter(null);
                                paint4.setStrokeWidth(iVar.f14355e * fMin * fAbs);
                                canvas.drawPath(path2, paint4);
                            }
                        }
                    }
                }
                i14 = i12 + 1;
                c10 = 0;
            }
            i12 = i14;
            i14 = i12 + 1;
            c10 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f14386l;
    }

    public void setAlpha(float f10) {
        setRootAlpha((int) (f10 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f14386l = i10;
    }

    public m(m mVar) {
        this.f14379c = new Matrix();
        this.h = 0.0f;
        this.f14383i = 0.0f;
        this.f14384j = 0.0f;
        this.f14385k = 0.0f;
        this.f14386l = 255;
        this.f14387m = null;
        this.f14388n = null;
        a0.f fVar = new a0.f(0);
        this.f14389o = fVar;
        this.f14382g = new j(mVar.f14382g, fVar);
        this.f14377a = new Path(mVar.f14377a);
        this.f14378b = new Path(mVar.f14378b);
        this.h = mVar.h;
        this.f14383i = mVar.f14383i;
        this.f14384j = mVar.f14384j;
        this.f14385k = mVar.f14385k;
        this.f14386l = mVar.f14386l;
        this.f14387m = mVar.f14387m;
        String str = mVar.f14387m;
        if (str != null) {
            fVar.put(str, this);
        }
        this.f14388n = mVar.f14388n;
    }
}
