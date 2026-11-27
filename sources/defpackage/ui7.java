package defpackage;

import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Shader;
import android.text.Layout;
import android.view.Choreographer;
import android.view.View;
import java.util.ArrayList;
public final class ui7 implements Choreographer.FrameCallback {
    public static final LinearGradient E;
    public static final Matrix F = new Matrix();
    public static final Paint y;
    public final Choreographer a = Choreographer.getInstance();
    public ArrayList b = new ArrayList();
    public final ArrayList c = new ArrayList();
    public int d = 0;
    public int e = 0;
    public float f = 0.0f;
    public boolean h = false;
    public boolean n = true;
    public long r = 0;
    public float s = hl.L(40.0f);
    public View w;
    public lb2 x;

    static {
        Paint paint = new Paint(1);
        y = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.DST_IN));
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, 1.0f, 0.0f, -1, 16777215, Shader.TileMode.CLAMP);
        E = linearGradient;
        paint.setShader(linearGradient);
    }

    public static void b(Canvas canvas, Layout layout, int i, float f, ti7 ti7Var) {
        ti7 bm6Var;
        if (layout != null) {
            int lineCount = layout.getLineCount();
            if (i >= 0 && i < lineCount) {
                if (ti7Var != null) {
                    bm6Var = ti7Var;
                } else {
                    bm6Var = new bm6(layout, (byte) 13);
                }
                int width = layout.getWidth();
                layout.getHeight();
                int lineTop = layout.getLineTop(i);
                int lineBottom = layout.getLineBottom(i);
                if (lineTop > 0) {
                    canvas.save();
                    canvas.clipRect(0.0f, 0.0f, width, lineTop);
                    bm6Var.a(canvas);
                    canvas.restore();
                }
                float lineLeft = layout.getLineLeft(i);
                float lineRight = layout.getLineRight(i);
                float min = Math.min(lineLeft, lineRight);
                float max = Math.max(lineLeft, lineRight);
                if (max > min) {
                    int paragraphDirection = layout.getParagraphDirection(i);
                    float f2 = max - min;
                    float a = ete.a(f, 0.0f, f2);
                    float f3 = a / f2;
                    if (a > 0.0f) {
                        if (a >= f2) {
                            canvas.save();
                            canvas.clipRect(0.0f, lineTop, width, lineBottom);
                            bm6Var.a(canvas);
                            canvas.restore();
                            return;
                        }
                        float R1 = hl.R1(-hl.L(50.0f), f2, f3);
                        float f4 = lineTop;
                        float f5 = lineBottom;
                        int saveLayer = canvas.saveLayer(min, f4, max, f5, null);
                        canvas.save();
                        canvas.clipRect(min, f4, max, f5);
                        bm6Var.a(canvas);
                        canvas.restore();
                        Matrix matrix = F;
                        matrix.reset();
                        if (paragraphDirection >= 0) {
                            matrix.setScale(hl.L(50.0f), 1.0f);
                            matrix.postTranslate(R1, 0.0f);
                        } else {
                            matrix.setScale(-hl.L(50.0f), 1.0f);
                            matrix.postTranslate(f2 - R1, 0.0f);
                        }
                        E.setLocalMatrix(matrix);
                        canvas.drawRect(min, f4, max, f5, y);
                        canvas.restoreToCount(saveLayer);
                    }
                }
            }
        }
    }

    public static float h(Layout layout, int i) {
        float lineRight = layout.getLineRight(i) - layout.getLineLeft(i);
        if (lineRight >= 0.0f) {
            return lineRight;
        }
        return -lineRight;
    }

    public final void a(float f) {
        float f2;
        float f3;
        int size = this.b.size();
        View view = null;
        for (int i = 0; i < size; i++) {
            si7 si7Var = (si7) this.b.get(i);
            if (!this.n && i > this.d) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            ArrayList arrayList = this.c;
            if (i < arrayList.size()) {
                f3 = ((Float) arrayList.get(i)).floatValue();
            } else {
                f3 = f2;
            }
            if (f3 == f2) {
                f2 = f3;
            } else if (f > 0.0f) {
                float f4 = f / 0.2f;
                if (f2 > f3) {
                    f2 = Math.min(f2, f4 + f3);
                } else {
                    f2 = Math.max(f2, f3 - f4);
                }
            }
            if (i < arrayList.size() && f2 != f3) {
                arrayList.set(i, Float.valueOf(f2));
            }
            View e = si7Var.e();
            if (e != null && e != view) {
                if (e.getAlpha() != f2) {
                    e.setAlpha(f2);
                }
                view = e;
            }
        }
    }

    public final float c(si7 si7Var) {
        int d = d(si7Var);
        if (d >= 0) {
            ArrayList arrayList = this.c;
            if (d < arrayList.size()) {
                return ((Float) arrayList.get(d)).floatValue();
            }
            return 1.0f;
        }
        return 1.0f;
    }

    public final int d(si7 si7Var) {
        int size = this.b.size();
        for (int i = 0; i < size; i++) {
            if (this.b.get(i) == si7Var) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public final void doFrame(long j) {
        if (this.h) {
            long j2 = this.r;
            float f = 0.0f;
            if (j2 != 0) {
                float f2 = ((float) (j - j2)) * 1.0E-9f;
                if (!this.b.isEmpty() && f2 > 0.0f) {
                    float f3 = this.s * f2;
                    while (true) {
                        if (f3 <= 0.0f) {
                            break;
                        } else if (this.d >= this.b.size()) {
                            this.n = true;
                            break;
                        } else {
                            Layout a = ((si7) this.b.get(this.d)).a();
                            if (a != null && a.getLineCount() != 0) {
                                if (this.e >= a.getLineCount()) {
                                    int lineCount = a.getLineCount() - 1;
                                    this.e = lineCount;
                                    this.f = h(a, lineCount);
                                }
                                float h = h(a, this.e);
                                if (h <= 0.001f) {
                                    if (j(a)) {
                                        break;
                                    }
                                } else {
                                    float f4 = this.f;
                                    float f5 = h - f4;
                                    if (f5 <= 0.001f) {
                                        if (j(a)) {
                                            break;
                                        }
                                    } else {
                                        if (f3 < f5) {
                                            f5 = f3;
                                        }
                                        float f6 = f4 + f5;
                                        this.f = f6;
                                        f3 -= f5;
                                        if (h - f6 <= 0.001f && !j(a)) {
                                            f3 = 0.0f;
                                        }
                                    }
                                }
                            } else {
                                this.d++;
                                this.e = 0;
                                this.f = 0.0f;
                            }
                        }
                    }
                    this.n = f();
                } else {
                    this.n = this.b.isEmpty();
                }
                f = f2;
            }
            this.r = j;
            a(f);
            e();
            if (this.n) {
                this.h = false;
                ArrayList arrayList = this.c;
                int size = arrayList.size();
                for (int i = 0; i < size; i++) {
                    arrayList.set(i, Float.valueOf(1.0f));
                }
                int size2 = this.b.size();
                View view = null;
                for (int i2 = 0; i2 < size2; i2++) {
                    View e = ((si7) this.b.get(i2)).e();
                    if (e != null && e != view) {
                        if (e.getAlpha() != 1.0f) {
                            e.setAlpha(1.0f);
                        }
                        view = e;
                    }
                }
                lb2 lb2Var = this.x;
                if (lb2Var != null) {
                    lb2Var.run();
                    this.x = null;
                    return;
                }
                return;
            }
            this.a.postFrameCallback(this);
        }
    }

    public final void e() {
        View view;
        si7 si7Var;
        int i = this.d;
        if (i >= 0 && i < this.b.size() && (si7Var = (si7) this.b.get(this.d)) != null) {
            view = si7Var.e();
        } else {
            view = null;
        }
        if (view != null) {
            view.invalidate();
            View view2 = this.w;
            if (view2 != null && view2 != view) {
                view2.invalidate();
            }
            this.w = view;
        }
    }

    public final boolean f() {
        if (!this.b.isEmpty()) {
            int size = this.b.size() - 1;
            Layout layout = null;
            while (size >= 0) {
                layout = ((si7) this.b.get(size)).a();
                if (layout != null && layout.getLineCount() > 0) {
                    break;
                }
                size--;
            }
            if (size >= 0 && layout != null) {
                int i = this.d;
                if (i >= size) {
                    if (i <= size) {
                        int lineCount = layout.getLineCount() - 1;
                        float h = h(layout, lineCount);
                        if (this.e < lineCount || this.f < h - 0.001f) {
                            return false;
                        }
                    }
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    public final boolean g(si7 si7Var) {
        Layout a;
        if (d(si7Var) == this.d && (a = si7Var.a()) != null && this.e < a.getLineCount()) {
            return true;
        }
        return false;
    }

    public final boolean i(si7 si7Var) {
        int d = d(si7Var);
        if (d >= 0 && !this.b.isEmpty()) {
            int i = this.d;
            if (d < i || d <= i) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final boolean j(Layout layout) {
        int i = this.e + 1;
        this.e = i;
        this.f = 0.0f;
        if (i >= layout.getLineCount()) {
            int i2 = this.d + 1;
            this.d = i2;
            this.e = 0;
            this.f = 0.0f;
            if (i2 >= this.b.size()) {
                return true;
            }
        }
        return false;
    }

    public final void k(ArrayList arrayList) {
        float f;
        int i;
        ArrayList arrayList2;
        boolean z;
        boolean z2;
        float f2;
        int lineCount;
        float lineWidth;
        if (!this.b.isEmpty() && this.d >= this.b.size()) {
            int size = this.b.size() - 1;
            this.d = size;
            Layout a = ((si7) this.b.get(size)).a();
            if (a == null) {
                lineCount = 0;
            } else {
                lineCount = a.getLineCount() - 1;
            }
            int max = Math.max(0, lineCount);
            this.e = max;
            if (a == null) {
                lineWidth = 0.0f;
            } else {
                lineWidth = a.getLineWidth(max);
            }
            this.f = lineWidth;
        }
        if (arrayList == null) {
            arrayList = new ArrayList();
        }
        this.b = arrayList;
        if (arrayList.isEmpty()) {
            f = 0.0f;
        } else {
            f = 0.0f;
            for (int i2 = this.d; i2 < this.b.size(); i2++) {
                Layout a2 = ((si7) this.b.get(i2)).a();
                if (a2 != null) {
                    if (i2 == this.d) {
                        i = Math.min(Math.max(this.e, 0), Math.max(0, a2.getLineCount() - 1));
                    } else {
                        i = 0;
                    }
                    for (int i3 = i; i3 < a2.getLineCount(); i3++) {
                        float h = h(a2, i3);
                        if (h > 0.001f) {
                            if (i2 == this.d && i3 == i) {
                                h -= this.f;
                                if (h <= 0.001f) {
                                }
                            }
                            f += h;
                        }
                    }
                }
            }
        }
        float L = hl.L(40.0f);
        if (f <= 0.001f) {
            this.s = L;
        } else {
            this.s = Math.max(L, f / 1.05f);
        }
        this.n = f();
        while (true) {
            arrayList2 = this.c;
            if (arrayList2.size() <= this.b.size()) {
                break;
            }
            qd4.v(1, arrayList2);
        }
        int size2 = arrayList2.size();
        while (true) {
            int size3 = this.b.size();
            z = this.n;
            if (size2 >= size3) {
                break;
            }
            if (!z && size2 > this.d) {
                f2 = 0.0f;
            } else {
                f2 = 1.0f;
            }
            arrayList2.add(Float.valueOf(f2));
            size2++;
        }
        if (!z && !(z2 = this.h) && !z2) {
            this.h = true;
            if (f()) {
                this.n = true;
            }
            this.r = 0L;
            this.a.postFrameCallback(this);
        }
        a(0.0f);
        e();
    }
}
