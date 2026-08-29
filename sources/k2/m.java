package k2;

import ag.j2;
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
    public static final Matrix f13367p = new Matrix();
    public final Path f13368a;
    public final Path f13369b;
    public final Matrix f13370c;
    public Paint d;
    public Paint f13371e;
    public PathMeasure f13372f;
    public final j f13373g;
    public float h;
    public float f13374i;
    public float f13375j;
    public float f13376k;
    public int f13377l;
    public String f13378m;
    public Boolean f13379n;
    public final a0.f f13380o;

    public m() {
        this.f13370c = new Matrix();
        this.h = 0.0f;
        this.f13374i = 0.0f;
        this.f13375j = 0.0f;
        this.f13376k = 0.0f;
        this.f13377l = 255;
        this.f13378m = null;
        this.f13379n = null;
        this.f13380o = new a0.k(0);
        this.f13373g = new j();
        this.f13368a = new Path();
        this.f13369b = new Path();
    }

    public final void a(j jVar, Matrix matrix, Canvas canvas, int i10, int i11) {
        int i12;
        float f9;
        float f10;
        int i13;
        float f11;
        Path.FillType fillType;
        Path.FillType fillType2;
        Matrix matrix2 = jVar.f13355a;
        ArrayList arrayList = jVar.f13356b;
        matrix2.set(matrix);
        Matrix matrix3 = jVar.f13355a;
        matrix3.preConcat(jVar.f13362j);
        canvas.save();
        char c3 = 0;
        int i14 = 0;
        while (i14 < arrayList.size()) {
            k kVar = (k) arrayList.get(i14);
            if (kVar instanceof j) {
                a((j) kVar, matrix3, canvas, i10, i11);
            } else if (kVar instanceof l) {
                l lVar = (l) kVar;
                float f12 = i10 / this.f13375j;
                float f13 = i11 / this.f13376k;
                float min = Math.min(f12, f13);
                Matrix matrix4 = this.f13370c;
                matrix4.set(matrix3);
                matrix4.postScale(f12, f13);
                float[] fArr = {0.0f, 1.0f, 1.0f, 0.0f};
                matrix3.mapVectors(fArr);
                i12 = i14;
                float f14 = (fArr[0] * fArr[3]) - (fArr[1] * fArr[2]);
                float max = Math.max((float) Math.hypot(fArr[c3], fArr[1]), (float) Math.hypot(fArr[2], fArr[3]));
                if (max > 0.0f) {
                    f9 = Math.abs(f14) / max;
                } else {
                    f9 = 0.0f;
                }
                if (f9 != 0.0f) {
                    Path path = this.f13368a;
                    path.reset();
                    i0.d[] dVarArr = lVar.f13364a;
                    if (dVarArr != null) {
                        i0.d.b(dVarArr, path);
                    }
                    Path path2 = this.f13369b;
                    path2.reset();
                    if (lVar instanceof h) {
                        if (lVar.f13366c == 0) {
                            fillType2 = Path.FillType.WINDING;
                        } else {
                            fillType2 = Path.FillType.EVEN_ODD;
                        }
                        path2.setFillType(fillType2);
                        path2.addPath(path, matrix4);
                        canvas.clipPath(path2);
                    } else {
                        i iVar = (i) lVar;
                        float f15 = iVar.f13349i;
                        if (f15 != 0.0f || iVar.f13350j != 1.0f) {
                            float f16 = iVar.f13351k;
                            float f17 = (f15 + f16) % 1.0f;
                            float f18 = (iVar.f13350j + f16) % 1.0f;
                            if (this.f13372f == null) {
                                this.f13372f = new PathMeasure();
                            }
                            this.f13372f.setPath(path, false);
                            float length = this.f13372f.getLength();
                            float f19 = f17 * length;
                            float f20 = f18 * length;
                            path.reset();
                            if (f19 > f20) {
                                this.f13372f.getSegment(f19, length, path, true);
                                f10 = 0.0f;
                                this.f13372f.getSegment(0.0f, f20, path, true);
                            } else {
                                f10 = 0.0f;
                                this.f13372f.getSegment(f19, f20, path, true);
                            }
                            path.rLineTo(f10, f10);
                        }
                        path2.addPath(path, matrix4);
                        j2 j2Var = iVar.f13347f;
                        if (((Shader) j2Var.f559c) != null || j2Var.f558b != 0) {
                            if (this.f13371e == null) {
                                i13 = 16777215;
                                Paint paint = new Paint(1);
                                this.f13371e = paint;
                                paint.setStyle(Paint.Style.FILL);
                            } else {
                                i13 = 16777215;
                            }
                            Paint paint2 = this.f13371e;
                            Shader shader = (Shader) j2Var.f559c;
                            if (shader != null) {
                                shader.setLocalMatrix(matrix4);
                                paint2.setShader(shader);
                                paint2.setAlpha(Math.round(iVar.h * 255.0f));
                                f11 = 255.0f;
                            } else {
                                paint2.setShader(null);
                                paint2.setAlpha(255);
                                int i15 = j2Var.f558b;
                                float f21 = iVar.h;
                                PorterDuff.Mode mode = p.f13392s;
                                f11 = 255.0f;
                                paint2.setColor((i15 & i13) | (((int) (Color.alpha(i15) * f21)) << 24));
                            }
                            paint2.setColorFilter(null);
                            if (iVar.f13366c == 0) {
                                fillType = Path.FillType.WINDING;
                            } else {
                                fillType = Path.FillType.EVEN_ODD;
                            }
                            path2.setFillType(fillType);
                            canvas.drawPath(path2, paint2);
                        } else {
                            i13 = 16777215;
                            f11 = 255.0f;
                        }
                        j2 j2Var2 = iVar.d;
                        if (((Shader) j2Var2.f559c) != null || j2Var2.f558b != 0) {
                            if (this.d == null) {
                                Paint paint3 = new Paint(1);
                                this.d = paint3;
                                paint3.setStyle(Paint.Style.STROKE);
                            }
                            Paint paint4 = this.d;
                            Paint.Join join = iVar.f13353m;
                            if (join != null) {
                                paint4.setStrokeJoin(join);
                            }
                            Paint.Cap cap = iVar.f13352l;
                            if (cap != null) {
                                paint4.setStrokeCap(cap);
                            }
                            paint4.setStrokeMiter(iVar.f13354n);
                            Shader shader2 = (Shader) j2Var2.f559c;
                            if (shader2 != null) {
                                shader2.setLocalMatrix(matrix4);
                                paint4.setShader(shader2);
                                paint4.setAlpha(Math.round(iVar.f13348g * f11));
                            } else {
                                paint4.setShader(null);
                                paint4.setAlpha(255);
                                int i16 = j2Var2.f558b;
                                float f22 = iVar.f13348g;
                                PorterDuff.Mode mode2 = p.f13392s;
                                paint4.setColor((i16 & i13) | (((int) (Color.alpha(i16) * f22)) << 24));
                            }
                            paint4.setColorFilter(null);
                            paint4.setStrokeWidth(iVar.f13346e * min * f9);
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
        return this.f13377l;
    }

    public void setAlpha(float f9) {
        setRootAlpha((int) (f9 * 255.0f));
    }

    public void setRootAlpha(int i10) {
        this.f13377l = i10;
    }

    public m(m mVar) {
        this.f13370c = new Matrix();
        this.h = 0.0f;
        this.f13374i = 0.0f;
        this.f13375j = 0.0f;
        this.f13376k = 0.0f;
        this.f13377l = 255;
        this.f13378m = null;
        this.f13379n = null;
        ?? kVar = new a0.k(0);
        this.f13380o = kVar;
        this.f13373g = new j(mVar.f13373g, kVar);
        this.f13368a = new Path(mVar.f13368a);
        this.f13369b = new Path(mVar.f13369b);
        this.h = mVar.h;
        this.f13374i = mVar.f13374i;
        this.f13375j = mVar.f13375j;
        this.f13376k = mVar.f13376k;
        this.f13377l = mVar.f13377l;
        this.f13378m = mVar.f13378m;
        String str = mVar.f13378m;
        if (str != null) {
            kVar.put(str, this);
        }
        this.f13379n = mVar.f13379n;
    }
}
