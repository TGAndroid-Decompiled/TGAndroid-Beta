package a5;

import a8.wa;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PorterDuff;
import android.graphics.Shader;
import java.util.ArrayList;
public final class n {
    public static final Matrix f242p = new Matrix();
    public final Path f243a;
    public final Path f244b;
    public final Matrix f245c;
    public Paint d;
    public Paint f246e;
    public PathMeasure f247f;
    public final k f248g;
    public float h;
    public float f249i;
    public float f250j;
    public float f251k;
    public int f252l;
    public String f253m;
    public Boolean f254n;
    public final a0.f f255o;

    public n() {
        this.f245c = new Matrix();
        this.h = 0.0f;
        this.f249i = 0.0f;
        this.f250j = 0.0f;
        this.f251k = 0.0f;
        this.f252l = 255;
        this.f253m = null;
        this.f254n = null;
        this.f255o = new a0.l(0);
        this.f248g = new k();
        this.f243a = new Path();
        this.f244b = new Path();
    }

    public final void a(k kVar, Matrix matrix, Canvas canvas, int i7, int i10) {
        int i11;
        float f10;
        float f11;
        int i12;
        float f12;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = kVar.f230a;
        ArrayList arrayList = kVar.f231b;
        matrix2.set(matrix);
        Matrix matrix3 = kVar.f230a;
        matrix3.preConcat(kVar.f237j);
        canvas.save();
        char c10 = 0;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            l lVar = (l) arrayList.get(i13);
            if (lVar instanceof k) {
                a((k) lVar, matrix3, canvas, i7, i10);
            } else if (lVar instanceof m) {
                m mVar = (m) lVar;
                float f13 = i7 / this.f250j;
                float f14 = i10 / this.f251k;
                float min = Math.min(f13, f14);
                Matrix matrix4 = this.f245c;
                matrix4.set(matrix3);
                matrix4.postScale(f13, f14);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                boolean z9 = c10;
                i11 = i13;
                float f15 = (fArr[z9 ? 1 : 0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max((float) Math.hypot(fArr[c10], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
                if (max > 0.0f) {
                    f10 = Math.abs(f15) / max;
                } else {
                    f10 = 0.0f;
                }
                if (f10 != 0.0f) {
                    Path path = this.f243a;
                    path.reset();
                    i0.d[] dVarArr = mVar.f239a;
                    if (dVarArr != null) {
                        i0.d.b(dVarArr, path);
                    }
                    Path path2 = this.f244b;
                    path2.reset();
                    if (mVar instanceof i) {
                        if (mVar.f241c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        j jVar = (j) mVar;
                        float f16 = jVar.f224i;
                        if (f16 != 0.0f || jVar.f225j != 1.0f) {
                            float f17 = jVar.f226k;
                            float f18 = (f16 + f17) % 1.0f;
                            float f19 = (jVar.f225j + f17) % 1.0f;
                            if (this.f247f == null) {
                                this.f247f = new PathMeasure();
                            }
                            this.f247f.setPath(path, z9);
                            float length = this.f247f.getLength();
                            float f20 = f18 * length;
                            float f21 = f19 * length;
                            path.reset();
                            if (f20 > f21) {
                                this.f247f.getSegment(f20, length, path, true);
                                f11 = 0.0f;
                                this.f247f.getSegment(0.0f, f21, path, true);
                            } else {
                                f11 = 0.0f;
                                this.f247f.getSegment(f20, f21, path, true);
                            }
                            path.rLineTo(f11, f11);
                        }
                        path2.addPath(path, matrix4);
                        wa waVar = jVar.f222f;
                        if (((Shader) waVar.f701c) != null || waVar.f700b != 0) {
                            if (this.f246e == null) {
                                i12 = 16777215;
                                Paint paint = new Paint(1);
                                this.f246e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i12 = 16777215;
                            }
                            Paint paint2 = this.f246e;
                            Shader shader = (Shader) waVar.f701c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(jVar.h * 255.0f));
                                f12 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i14 = waVar.f700b;
                                float f22 = jVar.h;
                                PorterDuff.Mode mode = q.f267w;
                                f12 = 255.0f;
                                paint2.setColor((i14 & i12) | (((int) (Color.alpha(i14) * f22)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (jVar.f241c == 0) {
                                fillType = Path.FillType.WINDING;
                            } else {
                                fillType = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType);
                            canvas.drawPath(path2, paint2);
                        } else {
                            f12 = 255.0f;
                            i12 = 16777215;
                        }
                        wa waVar2 = jVar.d;
                        if (((Shader) waVar2.f701c) != null || waVar2.f700b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = jVar.f228m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = jVar.f227l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(jVar.f229n);
                            Shader shader2 = (Shader) waVar2.f701c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(jVar.f223g * f12));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i15 = waVar2.f700b;
                                float f23 = jVar.f223g;
                                PorterDuff.Mode mode2 = q.f267w;
                                paint4.setColor((i15 & i12) | (((int) (Color.alpha(i15) * f23)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(jVar.f221e * min * f10);
                            canvas.drawPath(path2, paint4);
                        }
                    }
                }
                i13 = i11 + 1;
                c10 = 0;
            }
            i11 = i13;
            i13 = i11 + 1;
            c10 = 0;
        }
        canvas.restore();
    }

    public float getAlpha() {
        return getRootAlpha() / 255.0f;
    }

    public int getRootAlpha() {
        return this.f252l;
    }

    public void setAlpha(float f10) {
        setRootAlpha((int) (f10 * 255.0f));
    }

    public void setRootAlpha(int i7) {
        this.f252l = i7;
    }

    public n(n nVar) {
        this.f245c = new Matrix();
        this.h = 0.0f;
        this.f249i = 0.0f;
        this.f250j = 0.0f;
        this.f251k = 0.0f;
        this.f252l = 255;
        this.f253m = null;
        this.f254n = null;
        ?? lVar = new a0.l(0);
        this.f255o = lVar;
        this.f248g = new k(nVar.f248g, lVar);
        this.f243a = new Path(nVar.f243a);
        this.f244b = new Path(nVar.f244b);
        this.h = nVar.h;
        this.f249i = nVar.f249i;
        this.f250j = nVar.f250j;
        this.f251k = nVar.f251k;
        this.f252l = nVar.f252l;
        this.f253m = nVar.f253m;
        String str = nVar.f253m;
        if (str != null) {
            lVar.put(str, this);
        }
        this.f254n = nVar.f254n;
    }
}
