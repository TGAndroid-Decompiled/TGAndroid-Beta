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
public final class jy4 {
    public static final ColorMatrixColorFilter v = new ColorMatrixColorFilter(new ColorMatrix());
    public int b;
    public yi5 c;
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
    public final RenderNode e = vk1.m();
    public final iy4 f = new iy4(this, 1);
    public final iy4 g = new iy4(this, 2);
    public final iy4 h = new iy4(this, 3);
    public final iy4 i = new iy4(this, 4);
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
            hy4 hy4Var = (hy4) this.a.get(i3);
            if (RectF.intersects(hy4Var.a, rectF)) {
                if (qd4.c(i)) {
                    rectF2 = hy4Var.d;
                } else {
                    rectF2 = hy4Var.c;
                }
                if (qd4.c(i)) {
                    b = hy4Var.p;
                } else {
                    b = hy4Var.o;
                }
                canvas.save();
                float f3 = i2 << 1;
                RectF rectF3 = hy4Var.a;
                float f4 = i2;
                canvas.clipRect(((rectF3.left - f3) - f) / f4, ((rectF3.top - f3) - f2) / f4, ((rectF3.right + f3) - f) / f4, ((rectF3.bottom + f3) - f2) / f4);
                canvas.translate((rectF2.left - f) / f4, (rectF2.top - f2) / f4);
                if (b != i2) {
                    float f5 = b / f4;
                    canvas.scale(f5, f5);
                }
                canvas.drawRenderNode(hy4Var.a(i));
                canvas.restore();
            }
        }
    }

    public final void c(Canvas canvas, int i, float f, float f2, float f3, float f4) {
        RectF rectF;
        byte b;
        for (int i2 = 0; i2 < this.b; i2++) {
            hy4 hy4Var = (hy4) this.a.get(i2);
            if (hy4Var.a.intersects(f, f2, f3, f4)) {
                if (qd4.c(i)) {
                    rectF = hy4Var.d;
                } else {
                    rectF = hy4Var.c;
                }
                if (qd4.c(i)) {
                    b = hy4Var.p;
                } else {
                    b = hy4Var.o;
                }
                RenderNode a = hy4Var.a(i);
                canvas.save();
                canvas.clipRect(hy4Var.a);
                canvas.translate(rectF.left, rectF.top);
                float f5 = b;
                canvas.scale(f5, f5);
                canvas.drawRenderNode(a);
                canvas.restore();
            }
        }
    }

    public final iy4 d(int i) {
        int F = ik8.F(i);
        if (F != 0) {
            if (F != 1) {
                if (F != 2) {
                    if (F == 3) {
                        this.j = true;
                        return this.i;
                    }
                    lq5.j("Unknown source index: ".concat(qd4.B(i)));
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
        hy4 hy4Var;
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
                hy4 hy4Var2 = (hy4) arrayList.get(i2);
                yi5 yi5Var = this.c;
                boolean z = this.j;
                int width = this.d.getWidth();
                int height = this.d.getHeight();
                RectF rectF = hy4Var2.c;
                RectF rectF2 = hy4Var2.d;
                float f7 = hy4Var2.s;
                byte b = hy4Var2.o;
                if (f7 <= 0.0f) {
                    i = i2;
                    ceil = 0;
                } else {
                    i = i2;
                    ceil = ((int) Math.ceil(xnb.z(f7, 0.57735f, 0.5f, 3.0f))) * b;
                }
                float f8 = hy4Var2.t;
                byte b2 = hy4Var2.p;
                if (f8 <= 0.0f) {
                    ceil2 = 0;
                } else {
                    ceil2 = ((int) Math.ceil(xnb.z(f8, 0.57735f, 0.5f, 3.0f))) * b2;
                }
                RectF rectF3 = hy4Var2.r;
                rectF3.set(hy4Var2.a);
                float f9 = -((hy4Var2.q / 2) + ceil2 + ceil + 1);
                rectF3.inset(f9, f9);
                Rect rect = hy4Var2.b;
                int i4 = hy4Var2.q;
                if (i4 > 0) {
                    float f10 = i4;
                    rect.left = ((int) Math.floor(rectF3.left / f10)) * i4;
                    rect.top = ((int) Math.floor(rectF3.top / f10)) * i4;
                    rect.right = ((int) Math.ceil(rectF3.right / f10)) * i4;
                    rect.bottom = ((int) Math.ceil(rectF3.bottom / f10)) * i4;
                    rectF.set(rect);
                    rectF.offset(hy4Var2.u, hy4Var2.v);
                    rectF2.set(rect);
                    rectF2.offset(hy4Var2.w, hy4Var2.x);
                    byte b3 = hy4Var2.p;
                    float f11 = rectF2.left;
                    if (f11 < 0.0f) {
                        hy4Var = hy4Var2;
                        rectF2.left = (((float) Math.ceil((-f11) / f6)) * b3) + f11;
                    } else {
                        hy4Var = hy4Var2;
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
                    hy4Var.k = rect.width() / hy4Var.o;
                    hy4Var.l = rect.height() / hy4Var.o;
                    hy4Var.m = Math.max(1, Math.round(rectF2.width() / hy4Var.p));
                    hy4Var.n = Math.max(1, Math.round(rectF2.height() / hy4Var.p));
                    hy4Var.e.setPosition(0, 0, hy4Var.k, hy4Var.l);
                    RecordingCanvas beginRecording = hy4Var.e.beginRecording();
                    beginRecording.save();
                    float f15 = 1.0f / hy4Var.o;
                    beginRecording.scale(f15, f15, 0.0f, 0.0f);
                    beginRecording.translate(-rectF.left, -rectF.top);
                    yi5Var.g(beginRecording, rectF);
                    beginRecording.restore();
                    hy4Var.e.endRecording();
                    hy4Var.f.setPosition(0, 0, hy4Var.k, hy4Var.l);
                    hy4Var.f.beginRecording().drawRenderNode(hy4Var.e);
                    hy4Var.f.endRecording();
                    hy4Var.g.setPosition(0, 0, hy4Var.m, hy4Var.n);
                    RecordingCanvas beginRecording2 = hy4Var.g.beginRecording();
                    float f16 = rectF.left - rectF2.left;
                    float f17 = hy4Var.p;
                    beginRecording2.translate(f16 / f17, (rectF.top - rectF2.top) / f17);
                    byte b4 = hy4Var.o;
                    byte b5 = hy4Var.p;
                    if (b4 != b5) {
                        float f18 = b4 / b5;
                        beginRecording2.scale(f18, f18);
                    }
                    beginRecording2.drawRenderNode(hy4Var.f);
                    hy4Var.g.endRecording();
                    if (z) {
                        hy4Var.h.setPosition(0, 0, hy4Var.k, hy4Var.l);
                        hy4Var.h.beginRecording().drawRenderNode(hy4Var.e);
                        hy4Var.h.endRecording();
                        hy4Var.i.setPosition(0, 0, hy4Var.m, hy4Var.n);
                        RecordingCanvas beginRecording3 = hy4Var.i.beginRecording();
                        float f19 = rectF.left - rectF2.left;
                        float f20 = hy4Var.p;
                        beginRecording3.translate(f19 / f20, (rectF.top - rectF2.top) / f20);
                        byte b6 = hy4Var.o;
                        byte b7 = hy4Var.p;
                        if (b6 != b7) {
                            float f21 = b6 / b7;
                            beginRecording3.scale(f21, f21);
                        }
                        beginRecording3.drawRenderNode(hy4Var.h);
                        hy4Var.i.endRecording();
                    }
                    i2 = i + 1;
                } else {
                    lq5.j("n must be positive");
                    return;
                }
            } else {
                this.e.setPosition(0, 0, this.d.getWidth(), this.d.getHeight());
                RecordingCanvas beginRecording4 = this.e.beginRecording();
                for (int i5 = 0; i5 < this.b; i5++) {
                    hy4 hy4Var3 = (hy4) arrayList.get(i5);
                    beginRecording4.save();
                    RectF rectF4 = hy4Var3.a;
                    RectF rectF5 = hy4Var3.c;
                    beginRecording4.clipRect(rectF4);
                    beginRecording4.translate(rectF5.left, rectF5.top);
                    float f22 = hy4Var3.o;
                    beginRecording4.scale(f22, f22);
                    beginRecording4.drawRenderNode(hy4Var3.e);
                    beginRecording4.restore();
                    beginRecording4.drawRect(hy4Var3.a, aob.Jm);
                    beginRecording4.drawRect(rectF5, aob.Im);
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
            hy4 hy4Var = (hy4) this.a.get(i);
            int i2 = this.p;
            int i3 = this.q;
            int i4 = this.r;
            int i5 = this.s;
            hy4Var.u = i2;
            hy4Var.v = i3;
            hy4Var.w = i4;
            hy4Var.x = i5;
        }
    }
}
