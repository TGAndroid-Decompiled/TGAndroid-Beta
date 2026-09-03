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
    public static final Matrix f9646p = new Matrix();
    public final Path f9647a;
    public final Path f9648b;
    public final Matrix f9649c;
    public Paint d;
    public Paint e;
    public PathMeasure f9650f;
    public final j f9651g;
    public float h;
    public float f9652i;
    public float f9653j;
    public float f9654k;
    public int f9655l;
    public String f9656m;
    public Boolean f9657n;
    public final a0.f f9658o;

    public m() {
        this.f9649c = new Matrix();
        this.h = 0.0f;
        this.f9652i = 0.0f;
        this.f9653j = 0.0f;
        this.f9654k = 0.0f;
        this.f9655l = 255;
        this.f9656m = null;
        this.f9657n = null;
        this.f9658o = new a0.k(0);
        this.f9651g = new j();
        this.f9647a = new Path();
        this.f9648b = new Path();
    }

    public final void a(j jVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f10;
        float f11;
        int i13;
        float f12;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = jVar.f9635a;
        ArrayList arrayList = jVar.f9636b;
        matrix2.set(matrix);
        Matrix matrix3 = jVar.f9635a;
        matrix3.preConcat(jVar.f9641j);
        canvas.save();
        char c3 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            k kVar = (k) arrayList.get(i14);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i10, i11);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f13 = i10 / this.f9653j;
                float f14 = i11 / this.f9654k;
                float min = Math.min(f13, f14);
                Matrix matrix4 = this.f9649c;
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
                    Path path = this.f9647a;
                    path.reset();
                    i0.d[] dVarArr = lVar.f9643a;
                    if (dVarArr != null) {
                        i0.d.b(dVarArr, path);
                    }
                    Path path2 = this.f9648b;
                    path2.reset();
                    if (lVar instanceof h) {
                        if (lVar.f9645c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f16 = iVar.f9629i;
                        if (f16 != 0.0f || iVar.f9630j != 1.0f) {
                            float f17 = iVar.f9631k;
                            float f18 = (f16 + f17) % 1.0f;
                            float f19 = (iVar.f9630j + f17) % 1.0f;
                            if (this.f9650f == null) {
                                this.f9650f = new PathMeasure();
                            }
                            this.f9650f.setPath(path, false);
                            float length = this.f9650f.getLength();
                            float f20 = f18 * length;
                            float f21 = f19 * length;
                            path.reset();
                            if (f20 > f21) {
                                this.f9650f.getSegment(f20, length, path, true);
                                f11 = 0.0f;
                                this.f9650f.getSegment(0.0f, f21, path, true);
                            } else {
                                f11 = 0.0f;
                                this.f9650f.getSegment(f20, f21, path, true);
                            }
                            path.rLineTo(f11, f11);
                        }
                        path2.addPath(path, matrix4);
                        e0 e0Var = iVar.f9627f;
                        if (((Shader) e0Var.f1379c) != null || e0Var.f1378b != 0) {
                            if (this.e == null) {
                                i13 = 16777215;
                                Paint paint = new Paint(1);
                                this.e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i13 = 16777215;
                            }
                            Paint paint2 = this.e;
                            Shader shader = (Shader) e0Var.f1379c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.h * 255.0f));
                                f12 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i15 = e0Var.f1378b;
                                float f22 = iVar.h;
                                PorterDuff.Mode mode = p.f9669s;
                                f12 = 255.0f;
                                paint2.setColor((i15 & i13) | (((int) (Color.alpha(i15) * f22)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (iVar.f9645c == 0) {
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
                        if (((Shader) e0Var2.f1379c) != null || e0Var2.f1378b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = iVar.f9633m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f9632l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f9634n);
                            Shader shader2 = (Shader) e0Var2.f1379c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f9628g * f12));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i16 = e0Var2.f1378b;
                                float f23 = iVar.f9628g;
                                PorterDuff.Mode mode2 = p.f9669s;
                                paint4.setColor((i16 & i13) | (((int) (Color.alpha(i16) * f23)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.e * min * f10);
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
        return this.f9655l;
    }

    public void setAlpha(float f10) {
        setRootAlpha((int) (f10 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f9655l = i10;
    }

    public m(m mVar) {
        this.f9649c = new Matrix();
        this.h = 0.0f;
        this.f9652i = 0.0f;
        this.f9653j = 0.0f;
        this.f9654k = 0.0f;
        this.f9655l = 255;
        this.f9656m = null;
        this.f9657n = null;
        ?? kVar = new a0.k(0);
        this.f9658o = kVar;
        this.f9651g = new j(mVar.f9651g, kVar);
        this.f9647a = new Path(mVar.f9647a);
        this.f9648b = new Path(mVar.f9648b);
        this.h = mVar.h;
        this.f9652i = mVar.f9652i;
        this.f9653j = mVar.f9653j;
        this.f9654k = mVar.f9654k;
        this.f9655l = mVar.f9655l;
        this.f9656m = mVar.f9656m;
        String str = mVar.f9656m;
        if (str != null) {
            kVar.put(str, this);
        }
        this.f9657n = mVar.f9657n;
    }
}
