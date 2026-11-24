package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.widget.FrameLayout;
import java.util.ArrayList;
public final class ew4 {
    public static final ColorMatrixColorFilter v = new ColorMatrixColorFilter(new ColorMatrix());
    public int b;
    public wg5 c;
    public FrameLayout d;
    public boolean j;
    public ColorMatrixColorFilter k;
    public boolean l;
    public int p;
    public int q;
    public int r;
    public int s;
    public int t;
    public int u;
    public final ArrayList a = new ArrayList();
    public final RenderNode e = mk1.m();
    public final dw4 f = new dw4(this, 1);
    public final dw4 g = new dw4(this, 2);
    public final dw4 h = new dw4(this, 3);
    public final dw4 i = new dw4(this, 4);
    public byte m = 1;
    public byte n = 1;
    public int o = 1;

    public static int a(int i, int i2) {
        int i3 = i % i2;
        if (i3 > i2 / 2) {
            return i3 - i2;
        }
        if (i3 < (-i2) / 2) {
            return i3 + i2;
        }
        return i3;
    }

    public final void b(int i, Canvas canvas, RectF rectF, int i2, float f, float f2) {
        RectF rectF2;
        byte b;
        for (int i3 = 0; i3 < this.b; i3++) {
            cw4 cw4Var = (cw4) this.a.get(i3);
            if (RectF.intersects(cw4Var.a, rectF)) {
                if (tb4.c(i)) {
                    rectF2 = cw4Var.d;
                } else {
                    rectF2 = cw4Var.c;
                }
                if (tb4.c(i)) {
                    b = cw4Var.p;
                } else {
                    b = cw4Var.o;
                }
                canvas.save();
                float f3 = i2 << 1;
                RectF rectF3 = cw4Var.a;
                float f4 = i2;
                canvas.clipRect(((rectF3.left - f3) - f) / f4, ((rectF3.top - f3) - f2) / f4, ((rectF3.right + f3) - f) / f4, ((rectF3.bottom + f3) - f2) / f4);
                canvas.translate((rectF2.left - f) / f4, (rectF2.top - f2) / f4);
                if (b != i2) {
                    float f5 = b / f4;
                    canvas.scale(f5, f5);
                }
                canvas.drawRenderNode(cw4Var.a(i));
                canvas.restore();
            }
        }
    }

    public final void c(Canvas canvas, int i, float f, float f2, float f3, float f4) {
        RectF rectF;
        byte b;
        for (int i2 = 0; i2 < this.b; i2++) {
            cw4 cw4Var = (cw4) this.a.get(i2);
            if (cw4Var.a.intersects(f, f2, f3, f4)) {
                if (tb4.c(i)) {
                    rectF = cw4Var.d;
                } else {
                    rectF = cw4Var.c;
                }
                if (tb4.c(i)) {
                    b = cw4Var.p;
                } else {
                    b = cw4Var.o;
                }
                RenderNode a = cw4Var.a(i);
                canvas.save();
                canvas.clipRect(cw4Var.a);
                canvas.translate(rectF.left, rectF.top);
                float f5 = b;
                canvas.scale(f5, f5);
                canvas.drawRenderNode(a);
                canvas.restore();
            }
        }
    }

    public final dw4 d(int i) {
        int F = ug8.F(i);
        if (F != 0) {
            if (F != 1) {
                if (F != 2) {
                    if (F == 3) {
                        this.j = true;
                        return this.i;
                    }
                    w26.j("Unknown source index: ".concat(tb4.B(i)));
                    return null;
                }
                return this.h;
            }
            return this.g;
        }
        return this.f;
    }

    public final void e() {
        int i;
        int ceil;
        int ceil2;
        cw4 cw4Var;
        float f;
        float f2;
        float f3;
        float f4;
        float f5;
        float f6;
        int i2 = 0;
        while (true) {
            int i3 = this.b;
            ArrayList arrayList = this.a;
            if (i2 < i3) {
                cw4 cw4Var2 = (cw4) arrayList.get(i2);
                wg5 wg5Var = this.c;
                boolean z = this.j;
                int width = this.d.getWidth();
                int height = this.d.getHeight();
                RectF rectF = cw4Var2.c;
                RectF rectF2 = cw4Var2.d;
                float f7 = cw4Var2.s;
                byte b = cw4Var2.o;
                if (f7 <= 0.0f) {
                    i = i2;
                    ceil = 0;
                } else {
                    i = i2;
                    ceil = ((int) Math.ceil(yjb.z(f7, 0.57735f, 0.5f, 3.0f))) * b;
                }
                float f8 = cw4Var2.t;
                byte b2 = cw4Var2.p;
                if (f8 <= 0.0f) {
                    ceil2 = 0;
                } else {
                    ceil2 = ((int) Math.ceil(yjb.z(f8, 0.57735f, 0.5f, 3.0f))) * b2;
                }
                RectF rectF3 = cw4Var2.r;
                rectF3.set(cw4Var2.a);
                float f9 = -((cw4Var2.q / 2) + ceil2 + ceil + 1);
                rectF3.inset(f9, f9);
                Rect rect = cw4Var2.b;
                int i4 = cw4Var2.q;
                if (i4 > 0) {
                    float f10 = i4;
                    rect.left = ((int) Math.floor(rectF3.left / f10)) * i4;
                    rect.top = ((int) Math.floor(rectF3.top / f10)) * i4;
                    rect.right = ((int) Math.ceil(rectF3.right / f10)) * i4;
                    rect.bottom = ((int) Math.ceil(rectF3.bottom / f10)) * i4;
                    rectF.set(rect);
                    rectF.offset(cw4Var2.u, cw4Var2.v);
                    rectF2.set(rect);
                    rectF2.offset(cw4Var2.w, cw4Var2.x);
                    byte b3 = cw4Var2.p;
                    float f11 = rectF2.left;
                    if (f11 < 0.0f) {
                        cw4Var = cw4Var2;
                        rectF2.left = (((float) Math.ceil((-f11) / f6)) * b3) + f11;
                    } else {
                        cw4Var = cw4Var2;
                    }
                    float f12 = rectF2.top;
                    if (f12 < 0.0f) {
                        rectF2.top = (((float) Math.ceil((-f12) / f5)) * b3) + f12;
                    }
                    if (width > 0) {
                        float f13 = rectF2.right;
                        if (f13 > width) {
                            rectF2.right = f13 - (((float) Math.ceil((f13 - f3) / f4)) * b3);
                        }
                    }
                    if (height > 0) {
                        float f14 = rectF2.bottom;
                        if (f14 > height) {
                            rectF2.bottom = f14 - (((float) Math.ceil((f14 - f) / f2)) * b3);
                        }
                    }
                    cw4Var.k = rect.width() / cw4Var.o;
                    cw4Var.l = rect.height() / cw4Var.o;
                    cw4Var.m = Math.max(1, Math.round(rectF2.width() / cw4Var.p));
                    cw4Var.n = Math.max(1, Math.round(rectF2.height() / cw4Var.p));
                    cw4Var.e.setPosition(0, 0, cw4Var.k, cw4Var.l);
                    RecordingCanvas beginRecording = cw4Var.e.beginRecording();
                    beginRecording.save();
                    float f15 = 1.0f / cw4Var.o;
                    beginRecording.scale(f15, f15, 0.0f, 0.0f);
                    beginRecording.translate(-rectF.left, -rectF.top);
                    wg5Var.d(beginRecording, rectF);
                    beginRecording.restore();
                    cw4Var.e.endRecording();
                    cw4Var.f.setPosition(0, 0, cw4Var.k, cw4Var.l);
                    cw4Var.f.beginRecording().drawRenderNode(cw4Var.e);
                    cw4Var.f.endRecording();
                    cw4Var.g.setPosition(0, 0, cw4Var.m, cw4Var.n);
                    RecordingCanvas beginRecording2 = cw4Var.g.beginRecording();
                    float f16 = rectF.left - rectF2.left;
                    float f17 = cw4Var.p;
                    beginRecording2.translate(f16 / f17, (rectF.top - rectF2.top) / f17);
                    byte b4 = cw4Var.o;
                    byte b5 = cw4Var.p;
                    if (b4 != b5) {
                        float f18 = b4 / b5;
                        beginRecording2.scale(f18, f18);
                    }
                    beginRecording2.drawRenderNode(cw4Var.f);
                    cw4Var.g.endRecording();
                    if (z) {
                        cw4Var.h.setPosition(0, 0, cw4Var.k, cw4Var.l);
                        cw4Var.h.beginRecording().drawRenderNode(cw4Var.e);
                        cw4Var.h.endRecording();
                        cw4Var.i.setPosition(0, 0, cw4Var.m, cw4Var.n);
                        RecordingCanvas beginRecording3 = cw4Var.i.beginRecording();
                        float f19 = rectF.left - rectF2.left;
                        float f20 = cw4Var.p;
                        beginRecording3.translate(f19 / f20, (rectF.top - rectF2.top) / f20);
                        byte b6 = cw4Var.o;
                        byte b7 = cw4Var.p;
                        if (b6 != b7) {
                            float f21 = b6 / b7;
                            beginRecording3.scale(f21, f21);
                        }
                        beginRecording3.drawRenderNode(cw4Var.h);
                        cw4Var.i.endRecording();
                    }
                    i2 = i + 1;
                } else {
                    w26.j("n must be positive");
                    return;
                }
            } else {
                this.e.setPosition(0, 0, this.d.getWidth(), this.d.getHeight());
                RecordingCanvas beginRecording4 = this.e.beginRecording();
                for (int i5 = 0; i5 < this.b; i5++) {
                    cw4 cw4Var3 = (cw4) arrayList.get(i5);
                    beginRecording4.save();
                    RectF rectF4 = cw4Var3.a;
                    RectF rectF5 = cw4Var3.c;
                    beginRecording4.clipRect(rectF4);
                    beginRecording4.translate(rectF5.left, rectF5.top);
                    float f22 = cw4Var3.o;
                    beginRecording4.scale(f22, f22);
                    beginRecording4.drawRenderNode(cw4Var3.e);
                    beginRecording4.restore();
                    beginRecording4.drawRect(cw4Var3.a, bkb.Jm);
                    beginRecording4.drawRect(rectF5, bkb.Im);
                }
                this.e.endRecording();
                return;
            }
        }
    }

    public final void f() {
        this.p = -a(this.t, this.m);
        this.q = -a(this.u, this.m);
        this.r = -a(this.t, this.n);
        this.s = -a(this.u, this.n);
        for (int i = 0; i < this.b; i++) {
            cw4 cw4Var = (cw4) this.a.get(i);
            int i2 = this.p;
            int i3 = this.q;
            int i4 = this.r;
            int i5 = this.s;
            cw4Var.u = i2;
            cw4Var.v = i3;
            cw4Var.w = i4;
            cw4Var.x = i5;
        }
    }
}
