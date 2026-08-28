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
    public static final Matrix f14555p = new Matrix();
    public final Path f14556a;
    public final Path f14557b;
    public final Matrix f14558c;
    public Paint d;
    public Paint f14559e;
    public PathMeasure f14560f;
    public final j f14561g;
    public float h;
    public float f14562i;
    public float f14563j;
    public float f14564k;
    public int f14565l;
    public String f14566m;
    public Boolean f14567n;
    public final a0.f f14568o;

    public m() {
        this.f14558c = new Matrix();
        this.h = 0.0f;
        this.f14562i = 0.0f;
        this.f14563j = 0.0f;
        this.f14564k = 0.0f;
        this.f14565l = 255;
        this.f14566m = null;
        this.f14567n = null;
        this.f14568o = new a0.k(0);
        this.f14561g = new j();
        this.f14556a = new Path();
        this.f14557b = new Path();
    }

    public final void a(j jVar, Matrix matrix, Canvas canvas, int i9, int i10) {
        int i11;
        float f10;
        float f11;
        int i12;
        float f12;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = jVar.f14543a;
        ArrayList arrayList = jVar.f14544b;
        matrix2.set(matrix);
        Matrix matrix3 = jVar.f14543a;
        matrix3.preConcat(jVar.f14550j);
        canvas.save();
        char c10 = 0;
        int i13 = 0;
        while (i13 < arrayList.size()) {
            k kVar = (k) arrayList.get(i13);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i9, i10);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f13 = i9 / this.f14563j;
                float f14 = i10 / this.f14564k;
                float min = Math.min(f13, f14);
                Matrix matrix4 = this.f14558c;
                matrix4.set(matrix3);
                matrix4.postScale(f13, f14);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                i11 = i13;
                float f15 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max((float) Math.hypot(fArr[c10], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
                if (max > 0.0f) {
                    f10 = Math.abs(f15) / max;
                } else {
                    f10 = 0.0f;
                }
                if (f10 != 0.0f) {
                    Path path = this.f14556a;
                    path.reset();
                    i0.d[] dVarArr = lVar.f14552a;
                    if (dVarArr != null) {
                        i0.d.b(dVarArr, path);
                    }
                    Path path2 = this.f14557b;
                    path2.reset();
                    if (lVar instanceof h) {
                        if (lVar.f14554c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f16 = iVar.f14537i;
                        if (f16 != 0.0f || iVar.f14538j != 1.0f) {
                            float f17 = iVar.f14539k;
                            float f18 = (f16 + f17) % 1.0f;
                            float f19 = (iVar.f14538j + f17) % 1.0f;
                            if (this.f14560f == null) {
                                this.f14560f = new PathMeasure();
                            }
                            this.f14560f.setPath(path, false);
                            float length = this.f14560f.getLength();
                            float f20 = f18 * length;
                            float f21 = f19 * length;
                            path.reset();
                            if (f20 > f21) {
                                this.f14560f.getSegment(f20, length, path, true);
                                f11 = 0.0f;
                                this.f14560f.getSegment(0.0f, f21, path, true);
                            } else {
                                f11 = 0.0f;
                                this.f14560f.getSegment(f20, f21, path, true);
                            }
                            path.rLineTo(f11, f11);
                        }
                        path2.addPath(path, matrix4);
                        a6.a aVar = iVar.f14535f;
                        if (((Shader) aVar.f101b) != null || aVar.f102c != 0) {
                            if (this.f14559e == null) {
                                i12 = 16777215;
                                Paint paint = new Paint(1);
                                this.f14559e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i12 = 16777215;
                            }
                            Paint paint2 = this.f14559e;
                            Shader shader = (Shader) aVar.f101b;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.h * 255.0f));
                                f12 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i14 = aVar.f102c;
                                float f22 = iVar.h;
                                PorterDuff.Mode mode = p.f14580s;
                                f12 = 255.0f;
                                paint2.setColor((i14 & i12) | (((int) (Color.alpha(i14) * f22)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (iVar.f14554c == 0) {
                                fillType = Path.FillType.WINDING;
                            } else {
                                fillType = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType);
                            canvas.drawPath(path2, paint2);
                        } else {
                            i12 = 16777215;
                            f12 = 255.0f;
                        }
                        a6.a aVar2 = iVar.d;
                        if (((Shader) aVar2.f101b) != null || aVar2.f102c != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = iVar.f14541m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f14540l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f14542n);
                            Shader shader2 = (Shader) aVar2.f101b;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f14536g * f12));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i15 = aVar2.f102c;
                                float f23 = iVar.f14536g;
                                PorterDuff.Mode mode2 = p.f14580s;
                                paint4.setColor((i15 & i12) | (((int) (Color.alpha(i15) * f23)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f14534e * min * f10);
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
        return this.f14565l;
    }

    public void setAlpha(float f10) {
        setRootAlpha((int) (f10 * 255.0f));
    }

    public void setRootAlpha(int i9) {
        this.f14565l = i9;
    }

    public m(m mVar) {
        this.f14558c = new Matrix();
        this.h = 0.0f;
        this.f14562i = 0.0f;
        this.f14563j = 0.0f;
        this.f14564k = 0.0f;
        this.f14565l = 255;
        this.f14566m = null;
        this.f14567n = null;
        ?? kVar = new a0.k(0);
        this.f14568o = kVar;
        this.f14561g = new j(mVar.f14561g, kVar);
        this.f14556a = new Path(mVar.f14556a);
        this.f14557b = new Path(mVar.f14557b);
        this.h = mVar.h;
        this.f14562i = mVar.f14562i;
        this.f14563j = mVar.f14563j;
        this.f14564k = mVar.f14564k;
        this.f14565l = mVar.f14565l;
        this.f14566m = mVar.f14566m;
        String str = mVar.f14566m;
        if (str != null) {
            kVar.put(str, this);
        }
        this.f14567n = mVar.f14567n;
    }
}
