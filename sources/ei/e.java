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
    public int f6630b;
    public ug.a f6631c;
    public FrameLayout d;
    public boolean f6635j;
    public ColorMatrixColorFilter f6636k;
    public boolean f6637l;
    public int f6641p;
    public int f6642q;
    public int f6643r;
    public int f6644s;
    public int f6645t;
    public int f6646u;
    public final ArrayList f6629a = new ArrayList();
    public final RenderNode e = w.c();
    public final d f6632f = new d(this, 1);
    public final d f6633g = new d(this, 2);
    public final d h = new d(this, 3);
    public final d f6634i = new d(this, 4);
    public int f6638m = 1;
    public int f6639n = 1;
    public int f6640o = 1;

    public static void a(e eVar, Canvas canvas, int i10, float f7, float f10, float f11, float f12) {
        RectF rectF;
        int i11;
        for (int i12 = 0; i12 < eVar.f6630b; i12++) {
            c cVar = (c) eVar.f6629a.get(i12);
            if (cVar.f6607a.intersects(f7, f10, f11, f12)) {
                if (i0.b(i10)) {
                    rectF = cVar.d;
                } else {
                    rectF = cVar.f6609c;
                }
                if (i0.b(i10)) {
                    i11 = cVar.f6619p;
                } else {
                    i11 = cVar.f6618o;
                }
                RenderNode a2 = cVar.a(i10);
                canvas.save();
                canvas.clipRect(cVar.f6607a);
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
        for (int i13 = 0; i13 < eVar.f6630b; i13++) {
            c cVar = (c) eVar.f6629a.get(i13);
            if (RectF.intersects(cVar.f6607a, rectF)) {
                if (i0.b(i10)) {
                    rectF2 = cVar.d;
                } else {
                    rectF2 = cVar.f6609c;
                }
                if (i0.b(i10)) {
                    i12 = cVar.f6619p;
                } else {
                    i12 = cVar.f6618o;
                }
                canvas.save();
                float f11 = i11;
                canvas.translate((rectF2.left - f7) / f11, (rectF2.top - f10) / f11);
                if (i12 != i11) {
                    float f12 = i12 / f11;
                    canvas.scale(f12, f12);
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
                        this.f6635j = true;
                        return this.f6634i;
                    }
                    throw new IllegalArgumentException("Unknown source index: ".concat(i0.F(i10)));
                }
                return this.h;
            }
            return this.f6633g;
        }
        return this.f6632f;
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
            int i12 = this.f6630b;
            ArrayList arrayList = this.f6629a;
            if (i11 < i12) {
                c cVar2 = (c) arrayList.get(i11);
                ug.a aVar = this.f6631c;
                boolean z10 = this.f6635j;
                int width = this.d.getWidth();
                int height = this.d.getHeight();
                RectF rectF = cVar2.f6609c;
                RectF rectF2 = cVar2.d;
                float f15 = cVar2.f6622s;
                int i13 = cVar2.f6618o;
                if (f15 <= 0.0f) {
                    i10 = i11;
                    ceil = 0;
                } else {
                    i10 = i11;
                    ceil = ((int) Math.ceil(i0.C(f15, 0.57735f, 0.5f, 3.0f))) * i13;
                }
                float f16 = cVar2.f6623t;
                int i14 = cVar2.f6619p;
                if (f16 <= 0.0f) {
                    ceil2 = 0;
                } else {
                    ceil2 = ((int) Math.ceil(i0.C(f16, 0.57735f, 0.5f, 3.0f))) * i14;
                }
                RectF rectF3 = cVar2.f6621r;
                rectF3.set(cVar2.f6607a);
                float f17 = -((cVar2.f6620q / 2) + ceil2 + ceil + 1);
                rectF3.inset(f17, f17);
                Rect rect = cVar2.f6608b;
                int i15 = cVar2.f6620q;
                if (i15 > 0) {
                    float f18 = i15;
                    rect.left = ((int) Math.floor(rectF3.left / f18)) * i15;
                    rect.top = ((int) Math.floor(rectF3.top / f18)) * i15;
                    rect.right = ((int) Math.ceil(rectF3.right / f18)) * i15;
                    rect.bottom = ((int) Math.ceil(rectF3.bottom / f18)) * i15;
                    rectF.set(rect);
                    rectF.offset(cVar2.f6624u, cVar2.v);
                    rectF2.set(rect);
                    rectF2.offset(cVar2.f6625w, cVar2.f6626x);
                    int i16 = cVar2.f6619p;
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
                    cVar.f6614k = rect.width() / cVar.f6618o;
                    cVar.f6615l = rect.height() / cVar.f6618o;
                    cVar.f6616m = Math.max(1, Math.round(rectF2.width() / cVar.f6619p));
                    cVar.f6617n = Math.max(1, Math.round(rectF2.height() / cVar.f6619p));
                    cVar.e.setPosition(0, 0, cVar.f6614k, cVar.f6615l);
                    RecordingCanvas beginRecording = cVar.e.beginRecording();
                    beginRecording.save();
                    float f23 = 1.0f / cVar.f6618o;
                    beginRecording.scale(f23, f23, 0.0f, 0.0f);
                    beginRecording.translate(-rectF.left, -rectF.top);
                    aVar.d(beginRecording, rectF);
                    beginRecording.restore();
                    cVar.e.endRecording();
                    cVar.f6610f.setPosition(0, 0, cVar.f6614k, cVar.f6615l);
                    cVar.f6610f.beginRecording().drawRenderNode(cVar.e);
                    cVar.f6610f.endRecording();
                    cVar.f6611g.setPosition(0, 0, cVar.f6616m, cVar.f6617n);
                    RecordingCanvas beginRecording2 = cVar.f6611g.beginRecording();
                    float f24 = rectF.left - rectF2.left;
                    float f25 = cVar.f6619p;
                    beginRecording2.translate(f24 / f25, (rectF.top - rectF2.top) / f25);
                    int i17 = cVar.f6618o;
                    int i18 = cVar.f6619p;
                    if (i17 != i18) {
                        float f26 = i17 / i18;
                        beginRecording2.scale(f26, f26);
                    }
                    beginRecording2.drawRenderNode(cVar.f6610f);
                    cVar.f6611g.endRecording();
                    if (z10) {
                        cVar.h.setPosition(0, 0, cVar.f6614k, cVar.f6615l);
                        cVar.h.beginRecording().drawRenderNode(cVar.e);
                        cVar.h.endRecording();
                        cVar.f6612i.setPosition(0, 0, cVar.f6616m, cVar.f6617n);
                        RecordingCanvas beginRecording3 = cVar.f6612i.beginRecording();
                        float f27 = rectF.left - rectF2.left;
                        float f28 = cVar.f6619p;
                        beginRecording3.translate(f27 / f28, (rectF.top - rectF2.top) / f28);
                        int i19 = cVar.f6618o;
                        int i20 = cVar.f6619p;
                        if (i19 != i20) {
                            float f29 = i19 / i20;
                            beginRecording3.scale(f29, f29);
                        }
                        beginRecording3.drawRenderNode(cVar.h);
                        cVar.f6612i.endRecording();
                    }
                    i11 = i10 + 1;
                } else {
                    throw new IllegalArgumentException("n must be positive");
                }
            } else {
                this.e.setPosition(0, 0, this.d.getWidth(), this.d.getHeight());
                RecordingCanvas beginRecording4 = this.e.beginRecording();
                for (int i21 = 0; i21 < this.f6630b; i21++) {
                    c cVar3 = (c) arrayList.get(i21);
                    beginRecording4.save();
                    RectF rectF4 = cVar3.f6607a;
                    RectF rectF5 = cVar3.f6609c;
                    beginRecording4.clipRect(rectF4);
                    beginRecording4.translate(rectF5.left, rectF5.top);
                    float f30 = cVar3.f6618o;
                    beginRecording4.scale(f30, f30);
                    beginRecording4.drawRenderNode(cVar3.e);
                    beginRecording4.restore();
                    beginRecording4.drawRect(cVar3.f6607a, t6.Gm);
                    beginRecording4.drawRect(rectF5, t6.Fm);
                }
                this.e.endRecording();
                return;
            }
        }
    }

    public final void f() {
        this.f6641p = -c(this.f6645t, this.f6638m);
        this.f6642q = -c(this.f6646u, this.f6638m);
        this.f6643r = -c(this.f6645t, this.f6639n);
        this.f6644s = -c(this.f6646u, this.f6639n);
        for (int i10 = 0; i10 < this.f6630b; i10++) {
            c cVar = (c) this.f6629a.get(i10);
            int i11 = this.f6641p;
            int i12 = this.f6642q;
            int i13 = this.f6643r;
            int i14 = this.f6644s;
            cVar.f6624u = i11;
            cVar.v = i12;
            cVar.f6625w = i13;
            cVar.f6626x = i14;
        }
    }
}
