package li;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.widget.FrameLayout;
import com.google.android.gms.internal.vision.e2;
import hg.k0;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.i6;
public final class d {
    public int f15632b;
    public bh.a f15633c;
    public FrameLayout d;
    public boolean f15637i;
    public int f15641m;
    public int f15642n;
    public int f15643o;
    public int f15644p;
    public int f15645q;
    public int f15646r;
    public final ArrayList f15631a = new ArrayList();
    public final RenderNode f15634e = ah.f.m();
    public final c f15635f = new c(this, 1);
    public final c f15636g = new c(this, 2);
    public final c h = new c(this, 3);
    public int f15638j = 1;
    public int f15639k = 1;
    public int f15640l = 1;

    public static void a(d dVar, Canvas canvas, int i10, float f7, float f10, float f11, float f12) {
        RectF rectF;
        int i11;
        for (int i12 = 0; i12 < dVar.f15632b; i12++) {
            b bVar = (b) dVar.f15631a.get(i12);
            if (bVar.f15610a.intersects(f7, f10, f11, f12)) {
                if (i10 == 3) {
                    rectF = bVar.d;
                } else {
                    rectF = bVar.f15612c;
                }
                if (i10 == 3) {
                    i11 = bVar.f15620m;
                } else {
                    i11 = bVar.f15619l;
                }
                RenderNode a2 = bVar.a(i10);
                canvas.save();
                canvas.clipRect(bVar.f15610a);
                canvas.translate(rectF.left, rectF.top);
                float f13 = i11;
                canvas.scale(f13, f13);
                canvas.drawRenderNode(a2);
                canvas.restore();
            }
        }
    }

    public static void b(d dVar, int i10, Canvas canvas, RectF rectF, int i11, float f7, float f10) {
        RectF rectF2;
        int i12;
        for (int i13 = 0; i13 < dVar.f15632b; i13++) {
            b bVar = (b) dVar.f15631a.get(i13);
            if (RectF.intersects(bVar.f15610a, rectF)) {
                if (i10 == 3) {
                    rectF2 = bVar.d;
                } else {
                    rectF2 = bVar.f15612c;
                }
                if (i10 == 3) {
                    i12 = bVar.f15620m;
                } else {
                    i12 = bVar.f15619l;
                }
                canvas.save();
                float f11 = i11;
                canvas.translate((rectF2.left - f7) / f11, (rectF2.top - f10) / f11);
                if (i12 != i11) {
                    float f12 = i12 / f11;
                    canvas.scale(f12, f12);
                }
                canvas.drawRenderNode(bVar.a(i10));
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

    public final c d(int i10) {
        int c10 = m1.j.c(i10);
        if (c10 != 0) {
            if (c10 != 1) {
                if (c10 == 2) {
                    return this.h;
                }
                throw new IllegalArgumentException("Unknown source index: ".concat(k0.D(i10)));
            }
            return this.f15636g;
        }
        return this.f15635f;
    }

    public final void e() {
        int ceil;
        int ceil2;
        int i10 = 0;
        while (true) {
            int i11 = this.f15632b;
            ArrayList arrayList = this.f15631a;
            if (i10 < i11) {
                b bVar = (b) arrayList.get(i10);
                bh.a aVar = this.f15633c;
                RectF rectF = bVar.d;
                RectF rectF2 = bVar.f15612c;
                float f7 = bVar.f15623p;
                int i12 = bVar.f15619l;
                if (f7 <= 0.0f) {
                    ceil = 0;
                } else {
                    ceil = ((int) Math.ceil(e2.B(f7, 0.57735f, 0.5f, 3.0f))) * i12;
                }
                float f10 = bVar.f15624q;
                int i13 = bVar.f15620m;
                if (f10 <= 0.0f) {
                    ceil2 = 0;
                } else {
                    ceil2 = ((int) Math.ceil(e2.B(f10, 0.57735f, 0.5f, 3.0f))) * i13;
                }
                int i14 = ceil2 + ceil;
                RectF rectF3 = bVar.f15622o;
                rectF3.set(bVar.f15610a);
                float f11 = -((bVar.f15621n / 2) + i14 + 1);
                rectF3.inset(f11, f11);
                Rect rect = bVar.f15611b;
                int i15 = bVar.f15621n;
                if (i15 > 0) {
                    float f12 = i15;
                    rect.left = ((int) Math.floor(rectF3.left / f12)) * i15;
                    rect.top = ((int) Math.floor(rectF3.top / f12)) * i15;
                    rect.right = ((int) Math.ceil(rectF3.right / f12)) * i15;
                    rect.bottom = ((int) Math.ceil(rectF3.bottom / f12)) * i15;
                    rectF2.set(rect);
                    rectF2.offset(bVar.f15625r, bVar.f15626s);
                    rectF.set(rect);
                    rectF.offset(bVar.f15627t, bVar.f15628u);
                    bVar.h = rect.width() / bVar.f15619l;
                    bVar.f15616i = rect.height() / bVar.f15619l;
                    bVar.f15617j = rect.width() / bVar.f15620m;
                    bVar.f15618k = rect.height() / bVar.f15620m;
                    bVar.f15613e.setPosition(0, 0, bVar.h, bVar.f15616i);
                    RecordingCanvas beginRecording = bVar.f15613e.beginRecording();
                    beginRecording.save();
                    float f13 = 1.0f / bVar.f15619l;
                    beginRecording.scale(f13, f13, 0.0f, 0.0f);
                    beginRecording.translate(-rectF2.left, -rectF2.top);
                    aVar.f(beginRecording, rectF2);
                    beginRecording.restore();
                    bVar.f15613e.endRecording();
                    bVar.f15614f.setPosition(0, 0, bVar.h, bVar.f15616i);
                    bVar.f15614f.beginRecording().drawRenderNode(bVar.f15613e);
                    bVar.f15614f.endRecording();
                    bVar.f15615g.setPosition(0, 0, bVar.f15617j, bVar.f15618k);
                    RecordingCanvas beginRecording2 = bVar.f15615g.beginRecording();
                    float f14 = rectF2.left - rectF.left;
                    float f15 = bVar.f15620m;
                    beginRecording2.translate(f14 / f15, (rectF2.top - rectF.top) / f15);
                    int i16 = bVar.f15619l;
                    int i17 = bVar.f15620m;
                    if (i16 != i17) {
                        float f16 = i16 / i17;
                        beginRecording2.scale(f16, f16);
                    }
                    beginRecording2.drawRenderNode(bVar.f15614f);
                    bVar.f15615g.endRecording();
                    i10++;
                } else {
                    throw new IllegalArgumentException("n must be positive");
                }
            } else {
                this.f15634e.setPosition(0, 0, this.d.getWidth(), this.d.getHeight());
                RecordingCanvas beginRecording3 = this.f15634e.beginRecording();
                for (int i18 = 0; i18 < this.f15632b; i18++) {
                    b bVar2 = (b) arrayList.get(i18);
                    beginRecording3.save();
                    RectF rectF4 = bVar2.f15610a;
                    RectF rectF5 = bVar2.f15612c;
                    beginRecording3.clipRect(rectF4);
                    beginRecording3.translate(rectF5.left, rectF5.top);
                    float f17 = bVar2.f15619l;
                    beginRecording3.scale(f17, f17);
                    beginRecording3.drawRenderNode(bVar2.f15613e);
                    beginRecording3.restore();
                    beginRecording3.drawRect(bVar2.f15610a, i6.Nl);
                    beginRecording3.drawRect(rectF5, i6.Ml);
                }
                this.f15634e.endRecording();
                return;
            }
        }
    }

    public final void f() {
        this.f15641m = -c(this.f15645q, this.f15638j);
        this.f15642n = -c(this.f15646r, this.f15638j);
        this.f15643o = -c(this.f15645q, this.f15639k);
        this.f15644p = -c(this.f15646r, this.f15639k);
        for (int i10 = 0; i10 < this.f15632b; i10++) {
            b bVar = (b) this.f15631a.get(i10);
            int i11 = this.f15641m;
            int i12 = this.f15642n;
            int i13 = this.f15643o;
            int i14 = this.f15644p;
            bVar.f15625r = i11;
            bVar.f15626s = i12;
            bVar.f15627t = i13;
            bVar.f15628u = i14;
        }
    }
}
