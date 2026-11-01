package ei;

import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import android.widget.FrameLayout;
import c3.i0;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.t6;
public final class e {
    public static final ColorMatrixColorFilter v = new ColorMatrixColorFilter(new ColorMatrix());
    public int f6631b;
    public ug.a f6632c;
    public FrameLayout d;
    public boolean f6636j;
    public ColorMatrixColorFilter f6637k;
    public boolean f6638l;
    public int f6642p;
    public int f6643q;
    public int f6644r;
    public int f6645s;
    public int f6646t;
    public int f6647u;
    public final ArrayList f6630a = new ArrayList();
    public final RenderNode e = w.c();
    public final d f6633f = new d(this, 1);
    public final d f6634g = new d(this, 2);
    public final d h = new d(this, 3);
    public final d f6635i = new d(this, 4);
    public int f6639m = 1;
    public int f6640n = 1;
    public int f6641o = 1;

    public static void a(e eVar, Canvas canvas, int i10, float f7, float f10, float f11, float f12) {
        RectF rectF;
        int i11;
        for (int i12 = 0; i12 < eVar.f6631b; i12++) {
            c cVar = (c) eVar.f6630a.get(i12);
            if (cVar.f6608a.intersects(f7, f10, f11, f12)) {
                if (i0.b(i10)) {
                    rectF = cVar.d;
                } else {
                    rectF = cVar.f6610c;
                }
                if (i0.b(i10)) {
                    i11 = cVar.f6620p;
                } else {
                    i11 = cVar.f6619o;
                }
                RenderNode a2 = cVar.a(i10);
                canvas.save();
                canvas.clipRect(cVar.f6608a);
                canvas.translate(rectF.left, rectF.top);
                float f13 = i11;
                canvas.scale(f13, f13);
                canvas.drawRenderNode(a2);
                canvas.restore();
            }
        }
    }

    public static void b(e eVar, int i10, Canvas canvas, RectF rectF, int i11, float f7, float f10) {
        RectF rectF2;
        int i12;
        for (int i13 = 0; i13 < eVar.f6631b; i13++) {
            c cVar = (c) eVar.f6630a.get(i13);
            if (RectF.intersects(cVar.f6608a, rectF)) {
                if (i0.b(i10)) {
                    rectF2 = cVar.d;
                } else {
                    rectF2 = cVar.f6610c;
                }
                if (i0.b(i10)) {
                    i12 = cVar.f6620p;
                } else {
                    i12 = cVar.f6619o;
                }
                canvas.save();
                float f11 = i11 * 2;
                RectF rectF3 = cVar.f6608a;
                float f12 = i11;
                canvas.clipRect(((rectF3.left - f11) - f7) / f12, ((rectF3.top - f11) - f10) / f12, ((rectF3.right + f11) - f7) / f12, ((rectF3.bottom + f11) - f10) / f12);
                canvas.translate((rectF2.left - f7) / f12, (rectF2.top - f10) / f12);
                if (i12 != i11) {
                    float f13 = i12 / f12;
                    canvas.scale(f13, f13);
                }
                canvas.drawRenderNode(cVar.a(i10));
                canvas.restore();
            }
        }
    }

    public static int c(int i10, int i11) {
        int i12 = i10 % i11;
        if (i12 > i11 / 2) {
            return i12 - i11;
        }
        if (i12 < (-i11) / 2) {
            return i12 + i11;
        }
        return i12;
    }

    public final d d(int i10) {
        int c10 = m1.j.c(i10);
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 == 3) {
                        this.f6636j = true;
                        return this.f6635i;
                    }
                    throw new IllegalArgumentException("Unknown source index: ".concat(i0.F(i10)));
                }
                return this.h;
            }
            return this.f6634g;
        }
        return this.f6633f;
    }

    public final void e() {
        int i10;
        int ceil;
        int ceil2;
        c cVar;
        float f7;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        int i11 = 0;
        while (true) {
            int i12 = this.f6631b;
            ArrayList arrayList = this.f6630a;
            if (i11 < i12) {
                c cVar2 = (c) arrayList.get(i11);
                ug.a aVar = this.f6632c;
                boolean z10 = this.f6636j;
                int width = this.d.getWidth();
                int height = this.d.getHeight();
                RectF rectF = cVar2.f6610c;
                RectF rectF2 = cVar2.d;
                float f15 = cVar2.f6623s;
                int i13 = cVar2.f6619o;
                if (f15 <= 0.0f) {
                    i10 = i11;
                    ceil = 0;
                } else {
                    i10 = i11;
                    ceil = ((int) Math.ceil(i0.C(f15, 0.57735f, 0.5f, 3.0f))) * i13;
                }
                float f16 = cVar2.f6624t;
                int i14 = cVar2.f6620p;
                if (f16 <= 0.0f) {
                    ceil2 = 0;
                } else {
                    ceil2 = ((int) Math.ceil(i0.C(f16, 0.57735f, 0.5f, 3.0f))) * i14;
                }
                RectF rectF3 = cVar2.f6622r;
                rectF3.set(cVar2.f6608a);
                float f17 = -((cVar2.f6621q / 2) + ceil2 + ceil + 1);
                rectF3.inset(f17, f17);
                Rect rect = cVar2.f6609b;
                int i15 = cVar2.f6621q;
                if (i15 > 0) {
                    float f18 = i15;
                    rect.left = ((int) Math.floor(rectF3.left / f18)) * i15;
                    rect.top = ((int) Math.floor(rectF3.top / f18)) * i15;
                    rect.right = ((int) Math.ceil(rectF3.right / f18)) * i15;
                    rect.bottom = ((int) Math.ceil(rectF3.bottom / f18)) * i15;
                    rectF.set(rect);
                    rectF.offset(cVar2.f6625u, cVar2.v);
                    rectF2.set(rect);
                    rectF2.offset(cVar2.f6626w, cVar2.f6627x);
                    int i16 = cVar2.f6620p;
                    float f19 = rectF2.left;
                    if (f19 < 0.0f) {
                        cVar = cVar2;
                        rectF2.left = (((float) Math.ceil((-f19) / f14)) * i16) + f19;
                    } else {
                        cVar = cVar2;
                    }
                    float f20 = rectF2.top;
                    if (f20 < 0.0f) {
                        rectF2.top = (((float) Math.ceil((-f20) / f13)) * i16) + f20;
                    }
                    if (width > 0) {
                        float f21 = rectF2.right;
                        if (f21 > width) {
                            rectF2.right = f21 - (((float) Math.ceil((f21 - f11) / f12)) * i16);
                        }
                    }
                    if (height > 0) {
                        float f22 = rectF2.bottom;
                        if (f22 > height) {
                            rectF2.bottom = f22 - (((float) Math.ceil((f22 - f7) / f10)) * i16);
                        }
                    }
                    cVar.f6615k = rect.width() / cVar.f6619o;
                    cVar.f6616l = rect.height() / cVar.f6619o;
                    cVar.f6617m = Math.max(1, Math.round(rectF2.width() / cVar.f6620p));
                    cVar.f6618n = Math.max(1, Math.round(rectF2.height() / cVar.f6620p));
                    cVar.e.setPosition(0, 0, cVar.f6615k, cVar.f6616l);
                    RecordingCanvas beginRecording = cVar.e.beginRecording();
                    beginRecording.save();
                    float f23 = 1.0f / cVar.f6619o;
                    beginRecording.scale(f23, f23, 0.0f, 0.0f);
                    beginRecording.translate(-rectF.left, -rectF.top);
                    aVar.d(beginRecording, rectF);
                    beginRecording.restore();
                    cVar.e.endRecording();
                    cVar.f6611f.setPosition(0, 0, cVar.f6615k, cVar.f6616l);
                    cVar.f6611f.beginRecording().drawRenderNode(cVar.e);
                    cVar.f6611f.endRecording();
                    cVar.f6612g.setPosition(0, 0, cVar.f6617m, cVar.f6618n);
                    RecordingCanvas beginRecording2 = cVar.f6612g.beginRecording();
                    float f24 = rectF.left - rectF2.left;
                    float f25 = cVar.f6620p;
                    beginRecording2.translate(f24 / f25, (rectF.top - rectF2.top) / f25);
                    int i17 = cVar.f6619o;
                    int i18 = cVar.f6620p;
                    if (i17 != i18) {
                        float f26 = i17 / i18;
                        beginRecording2.scale(f26, f26);
                    }
                    beginRecording2.drawRenderNode(cVar.f6611f);
                    cVar.f6612g.endRecording();
                    if (z10) {
                        cVar.h.setPosition(0, 0, cVar.f6615k, cVar.f6616l);
                        cVar.h.beginRecording().drawRenderNode(cVar.e);
                        cVar.h.endRecording();
                        cVar.f6613i.setPosition(0, 0, cVar.f6617m, cVar.f6618n);
                        RecordingCanvas beginRecording3 = cVar.f6613i.beginRecording();
                        float f27 = rectF.left - rectF2.left;
                        float f28 = cVar.f6620p;
                        beginRecording3.translate(f27 / f28, (rectF.top - rectF2.top) / f28);
                        int i19 = cVar.f6619o;
                        int i20 = cVar.f6620p;
                        if (i19 != i20) {
                            float f29 = i19 / i20;
                            beginRecording3.scale(f29, f29);
                        }
                        beginRecording3.drawRenderNode(cVar.h);
                        cVar.f6613i.endRecording();
                    }
                    i11 = i10 + 1;
                } else {
                    throw new IllegalArgumentException("n must be positive");
                }
            } else {
                this.e.setPosition(0, 0, this.d.getWidth(), this.d.getHeight());
                RecordingCanvas beginRecording4 = this.e.beginRecording();
                for (int i21 = 0; i21 < this.f6631b; i21++) {
                    c cVar3 = (c) arrayList.get(i21);
                    beginRecording4.save();
                    RectF rectF4 = cVar3.f6608a;
                    RectF rectF5 = cVar3.f6610c;
                    beginRecording4.clipRect(rectF4);
                    beginRecording4.translate(rectF5.left, rectF5.top);
                    float f30 = cVar3.f6619o;
                    beginRecording4.scale(f30, f30);
                    beginRecording4.drawRenderNode(cVar3.e);
                    beginRecording4.restore();
                    beginRecording4.drawRect(cVar3.f6608a, t6.Gm);
                    beginRecording4.drawRect(rectF5, t6.Fm);
                }
                this.e.endRecording();
                return;
            }
        }
    }

    public final void f() {
        this.f6642p = -c(this.f6646t, this.f6639m);
        this.f6643q = -c(this.f6647u, this.f6639m);
        this.f6644r = -c(this.f6646t, this.f6640n);
        this.f6645s = -c(this.f6647u, this.f6640n);
        for (int i10 = 0; i10 < this.f6631b; i10++) {
            c cVar = (c) this.f6630a.get(i10);
            int i11 = this.f6642p;
            int i12 = this.f6643q;
            int i13 = this.f6644r;
            int i14 = this.f6645s;
            cVar.f6625u = i11;
            cVar.v = i12;
            cVar.f6626w = i13;
            cVar.f6627x = i14;
        }
    }
}
