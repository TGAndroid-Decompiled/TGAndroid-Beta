package oi;

import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import android.widget.FrameLayout;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.k6;
public final class d {
    public static final ColorMatrixColorFilter v = new ColorMatrixColorFilter(new ColorMatrix());
    public int f21053b;
    public eh.a f21054c;
    public FrameLayout d;
    public boolean f21059j;
    public ColorMatrixColorFilter f21060k;
    public boolean f21061l;
    public int f21065p;
    public int f21066q;
    public int f21067r;
    public int f21068s;
    public int f21069t;
    public int f21070u;
    public final ArrayList f21052a = new ArrayList();
    public final RenderNode f21055e = w.m();
    public final c f21056f = new c(this, 1);
    public final c f21057g = new c(this, 2);
    public final c h = new c(this, 3);
    public final c f21058i = new c(this, 4);
    public int f21062m = 1;
    public int f21063n = 1;
    public int f21064o = 1;

    public static void a(d dVar, Canvas canvas, int i7, float f10, float f11, float f12, float f13) {
        RectF rectF;
        int i10;
        for (int i11 = 0; i11 < dVar.f21053b; i11++) {
            b bVar = (b) dVar.f21052a.get(i11);
            if (bVar.f21029a.intersects(f10, f11, f12, f13)) {
                if (jg.g.a(i7)) {
                    rectF = bVar.d;
                } else {
                    rectF = bVar.f21031c;
                }
                if (jg.g.a(i7)) {
                    i10 = bVar.f21042p;
                } else {
                    i10 = bVar.f21041o;
                }
                RenderNode a10 = bVar.a(i7);
                canvas.save();
                canvas.clipRect(bVar.f21029a);
                canvas.translate(rectF.left, rectF.top);
                float f14 = i10;
                canvas.scale(f14, f14);
                canvas.drawRenderNode(a10);
                canvas.restore();
            }
        }
    }

    public static void b(d dVar, int i7, Canvas canvas, RectF rectF, int i10, float f10, float f11) {
        RectF rectF2;
        int i11;
        for (int i12 = 0; i12 < dVar.f21053b; i12++) {
            b bVar = (b) dVar.f21052a.get(i12);
            if (RectF.intersects(bVar.f21029a, rectF)) {
                if (jg.g.a(i7)) {
                    rectF2 = bVar.d;
                } else {
                    rectF2 = bVar.f21031c;
                }
                if (jg.g.a(i7)) {
                    i11 = bVar.f21042p;
                } else {
                    i11 = bVar.f21041o;
                }
                canvas.save();
                float f12 = i10 * 2;
                RectF rectF3 = bVar.f21029a;
                float f13 = i10;
                canvas.clipRect(((rectF3.left - f12) - f10) / f13, ((rectF3.top - f12) - f11) / f13, ((rectF3.right + f12) - f10) / f13, ((rectF3.bottom + f12) - f11) / f13);
                canvas.translate((rectF2.left - f10) / f13, (rectF2.top - f11) / f13);
                if (i11 != i10) {
                    float f14 = i11 / f13;
                    canvas.scale(f14, f14);
                }
                canvas.drawRenderNode(bVar.a(i7));
                canvas.restore();
            }
        }
    }

    public static int c(int i7, int i10) {
        int i11 = i7 % i10;
        if (i11 > i10 / 2) {
            return i11 - i10;
        }
        if (i11 < (-i10) / 2) {
            return i11 + i10;
        }
        return i11;
    }

    public final c d(int i7) {
        int c10 = p1.g.c(i7);
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 != 2) {
                    if (c10 == 3) {
                        this.f21059j = true;
                        return this.f21058i;
                    }
                    throw new IllegalArgumentException("Unknown source index: ".concat(jg.g.E(i7)));
                }
                return this.h;
            }
            return this.f21057g;
        }
        return this.f21056f;
    }

    public final void e() {
        int i7;
        int ceil;
        int ceil2;
        b bVar;
        float f10;
        float f11;
        float f12;
        float f13;
        float f14;
        float f15;
        int i10 = 0;
        while (true) {
            int i11 = this.f21053b;
            ArrayList arrayList = this.f21052a;
            if (i10 < i11) {
                b bVar2 = (b) arrayList.get(i10);
                eh.a aVar = this.f21054c;
                boolean z9 = this.f21059j;
                int width = this.d.getWidth();
                int height = this.d.getHeight();
                RectF rectF = bVar2.f21031c;
                RectF rectF2 = bVar2.d;
                float f16 = bVar2.f21045s;
                int i12 = bVar2.f21041o;
                if (f16 <= 0.0f) {
                    i7 = i10;
                    ceil = 0;
                } else {
                    i7 = i10;
                    ceil = ((int) Math.ceil(com.google.android.recaptcha.internal.a.B(f16, 0.57735f, 0.5f, 3.0f))) * i12;
                }
                float f17 = bVar2.f21046t;
                int i13 = bVar2.f21042p;
                if (f17 <= 0.0f) {
                    ceil2 = 0;
                } else {
                    ceil2 = ((int) Math.ceil(com.google.android.recaptcha.internal.a.B(f17, 0.57735f, 0.5f, 3.0f))) * i13;
                }
                RectF rectF3 = bVar2.f21044r;
                rectF3.set(bVar2.f21029a);
                float f18 = -((bVar2.f21043q / 2) + ceil2 + ceil + 1);
                rectF3.inset(f18, f18);
                Rect rect = bVar2.f21030b;
                int i14 = bVar2.f21043q;
                if (i14 > 0) {
                    float f19 = i14;
                    rect.left = ((int) Math.floor(rectF3.left / f19)) * i14;
                    rect.top = ((int) Math.floor(rectF3.top / f19)) * i14;
                    rect.right = ((int) Math.ceil(rectF3.right / f19)) * i14;
                    rect.bottom = ((int) Math.ceil(rectF3.bottom / f19)) * i14;
                    rectF.set(rect);
                    rectF.offset(bVar2.f21047u, bVar2.v);
                    rectF2.set(rect);
                    rectF2.offset(bVar2.f21048w, bVar2.f21049x);
                    int i15 = bVar2.f21042p;
                    float f20 = rectF2.left;
                    if (f20 < 0.0f) {
                        bVar = bVar2;
                        rectF2.left = (((float) Math.ceil((-f20) / f15)) * i15) + f20;
                    } else {
                        bVar = bVar2;
                    }
                    float f21 = rectF2.top;
                    if (f21 < 0.0f) {
                        rectF2.top = (((float) Math.ceil((-f21) / f14)) * i15) + f21;
                    }
                    if (width > 0) {
                        float f22 = rectF2.right;
                        if (f22 > width) {
                            rectF2.right = f22 - (((float) Math.ceil((f22 - f12) / f13)) * i15);
                        }
                    }
                    if (height > 0) {
                        float f23 = rectF2.bottom;
                        if (f23 > height) {
                            rectF2.bottom = f23 - (((float) Math.ceil((f23 - f10) / f11)) * i15);
                        }
                    }
                    bVar.f21037k = rect.width() / bVar.f21041o;
                    bVar.f21038l = rect.height() / bVar.f21041o;
                    bVar.f21039m = Math.max(1, Math.round(rectF2.width() / bVar.f21042p));
                    bVar.f21040n = Math.max(1, Math.round(rectF2.height() / bVar.f21042p));
                    bVar.f21032e.setPosition(0, 0, bVar.f21037k, bVar.f21038l);
                    RecordingCanvas beginRecording = bVar.f21032e.beginRecording();
                    beginRecording.save();
                    float f24 = 1.0f / bVar.f21041o;
                    beginRecording.scale(f24, f24, 0.0f, 0.0f);
                    beginRecording.translate(-rectF.left, -rectF.top);
                    aVar.d(beginRecording, rectF);
                    beginRecording.restore();
                    bVar.f21032e.endRecording();
                    bVar.f21033f.setPosition(0, 0, bVar.f21037k, bVar.f21038l);
                    bVar.f21033f.beginRecording().drawRenderNode(bVar.f21032e);
                    bVar.f21033f.endRecording();
                    bVar.f21034g.setPosition(0, 0, bVar.f21039m, bVar.f21040n);
                    RecordingCanvas beginRecording2 = bVar.f21034g.beginRecording();
                    float f25 = rectF.left - rectF2.left;
                    float f26 = bVar.f21042p;
                    beginRecording2.translate(f25 / f26, (rectF.top - rectF2.top) / f26);
                    int i16 = bVar.f21041o;
                    int i17 = bVar.f21042p;
                    if (i16 != i17) {
                        float f27 = i16 / i17;
                        beginRecording2.scale(f27, f27);
                    }
                    beginRecording2.drawRenderNode(bVar.f21033f);
                    bVar.f21034g.endRecording();
                    if (z9) {
                        bVar.h.setPosition(0, 0, bVar.f21037k, bVar.f21038l);
                        bVar.h.beginRecording().drawRenderNode(bVar.f21032e);
                        bVar.h.endRecording();
                        bVar.f21035i.setPosition(0, 0, bVar.f21039m, bVar.f21040n);
                        RecordingCanvas beginRecording3 = bVar.f21035i.beginRecording();
                        float f28 = rectF.left - rectF2.left;
                        float f29 = bVar.f21042p;
                        beginRecording3.translate(f28 / f29, (rectF.top - rectF2.top) / f29);
                        int i18 = bVar.f21041o;
                        int i19 = bVar.f21042p;
                        if (i18 != i19) {
                            float f30 = i18 / i19;
                            beginRecording3.scale(f30, f30);
                        }
                        beginRecording3.drawRenderNode(bVar.h);
                        bVar.f21035i.endRecording();
                    }
                    i10 = i7 + 1;
                } else {
                    throw new IllegalArgumentException("n must be positive");
                }
            } else {
                this.f21055e.setPosition(0, 0, this.d.getWidth(), this.d.getHeight());
                RecordingCanvas beginRecording4 = this.f21055e.beginRecording();
                for (int i20 = 0; i20 < this.f21053b; i20++) {
                    b bVar3 = (b) arrayList.get(i20);
                    beginRecording4.save();
                    RectF rectF4 = bVar3.f21029a;
                    RectF rectF5 = bVar3.f21031c;
                    beginRecording4.clipRect(rectF4);
                    beginRecording4.translate(rectF5.left, rectF5.top);
                    float f31 = bVar3.f21041o;
                    beginRecording4.scale(f31, f31);
                    beginRecording4.drawRenderNode(bVar3.f21032e);
                    beginRecording4.restore();
                    beginRecording4.drawRect(bVar3.f21029a, k6.Gm);
                    beginRecording4.drawRect(rectF5, k6.Fm);
                }
                this.f21055e.endRecording();
                return;
            }
        }
    }

    public final void f() {
        this.f21065p = -c(this.f21069t, this.f21062m);
        this.f21066q = -c(this.f21070u, this.f21062m);
        this.f21067r = -c(this.f21069t, this.f21063n);
        this.f21068s = -c(this.f21070u, this.f21063n);
        for (int i7 = 0; i7 < this.f21053b; i7++) {
            b bVar = (b) this.f21052a.get(i7);
            int i10 = this.f21065p;
            int i11 = this.f21066q;
            int i12 = this.f21067r;
            int i13 = this.f21068s;
            bVar.f21047u = i10;
            bVar.v = i11;
            bVar.f21048w = i12;
            bVar.f21049x = i13;
        }
    }
}
