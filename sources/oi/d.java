package oi;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.x;
import android.widget.FrameLayout;
import c3.h0;
import java.util.ArrayList;
import org.telegram.ui.ActionBar.y6;
public final class d {
    public int f19446b;
    public dh.a f19447c;
    public FrameLayout d;
    public boolean f19450i;
    public int f19454m;
    public int f19455n;
    public int f19456o;
    public int f19457p;
    public int f19458q;
    public int f19459r;
    public final ArrayList f19445a = new ArrayList();
    public final RenderNode e = x.m();
    public final c f19448f = new c(this, 1);
    public final c f19449g = new c(this, 2);
    public final c h = new c(this, 3);
    public int f19451j = 1;
    public int f19452k = 1;
    public int f19453l = 1;

    public static void a(d dVar, Canvas canvas, int i10, float f7, float f10, float f11, float f12) {
        RectF rectF;
        int i11;
        for (int i12 = 0; i12 < dVar.f19446b; i12++) {
            b bVar = (b) dVar.f19445a.get(i12);
            if (bVar.f19425a.intersects(f7, f10, f11, f12)) {
                if (i10 == 3) {
                    rectF = bVar.d;
                } else {
                    rectF = bVar.f19427c;
                }
                if (i10 == 3) {
                    i11 = bVar.f19434m;
                } else {
                    i11 = bVar.f19433l;
                }
                RenderNode a2 = bVar.a(i10);
                canvas.save();
                canvas.clipRect(bVar.f19425a);
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
        for (int i13 = 0; i13 < dVar.f19446b; i13++) {
            b bVar = (b) dVar.f19445a.get(i13);
            if (RectF.intersects(bVar.f19425a, rectF)) {
                if (i10 == 3) {
                    rectF2 = bVar.d;
                } else {
                    rectF2 = bVar.f19427c;
                }
                if (i10 == 3) {
                    i12 = bVar.f19434m;
                } else {
                    i12 = bVar.f19433l;
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
                throw new IllegalArgumentException("Unknown source index: ".concat(ic.a.D(i10)));
            }
            return this.f19449g;
        }
        return this.f19448f;
    }

    public final void e() {
        int ceil;
        int ceil2;
        int i10 = 0;
        while (true) {
            int i11 = this.f19446b;
            ArrayList arrayList = this.f19445a;
            if (i10 < i11) {
                b bVar = (b) arrayList.get(i10);
                dh.a aVar = this.f19447c;
                RectF rectF = bVar.d;
                RectF rectF2 = bVar.f19427c;
                float f7 = bVar.f19437p;
                int i12 = bVar.f19433l;
                if (f7 <= 0.0f) {
                    ceil = 0;
                } else {
                    ceil = ((int) Math.ceil(h0.C(f7, 0.57735f, 0.5f, 3.0f))) * i12;
                }
                float f10 = bVar.f19438q;
                int i13 = bVar.f19434m;
                if (f10 <= 0.0f) {
                    ceil2 = 0;
                } else {
                    ceil2 = ((int) Math.ceil(h0.C(f10, 0.57735f, 0.5f, 3.0f))) * i13;
                }
                int i14 = ceil2 + ceil;
                RectF rectF3 = bVar.f19436o;
                rectF3.set(bVar.f19425a);
                float f11 = -((bVar.f19435n / 2) + i14 + 1);
                rectF3.inset(f11, f11);
                Rect rect = bVar.f19426b;
                int i15 = bVar.f19435n;
                if (i15 > 0) {
                    float f12 = i15;
                    rect.left = ((int) Math.floor(rectF3.left / f12)) * i15;
                    rect.top = ((int) Math.floor(rectF3.top / f12)) * i15;
                    rect.right = ((int) Math.ceil(rectF3.right / f12)) * i15;
                    rect.bottom = ((int) Math.ceil(rectF3.bottom / f12)) * i15;
                    rectF2.set(rect);
                    rectF2.offset(bVar.f19439r, bVar.f19440s);
                    rectF.set(rect);
                    rectF.offset(bVar.f19441t, bVar.f19442u);
                    bVar.h = rect.width() / bVar.f19433l;
                    bVar.f19430i = rect.height() / bVar.f19433l;
                    bVar.f19431j = rect.width() / bVar.f19434m;
                    bVar.f19432k = rect.height() / bVar.f19434m;
                    bVar.e.setPosition(0, 0, bVar.h, bVar.f19430i);
                    RecordingCanvas beginRecording = bVar.e.beginRecording();
                    beginRecording.save();
                    float f13 = 1.0f / bVar.f19433l;
                    beginRecording.scale(f13, f13, 0.0f, 0.0f);
                    beginRecording.translate(-rectF2.left, -rectF2.top);
                    aVar.f(beginRecording, rectF2);
                    beginRecording.restore();
                    bVar.e.endRecording();
                    bVar.f19428f.setPosition(0, 0, bVar.h, bVar.f19430i);
                    bVar.f19428f.beginRecording().drawRenderNode(bVar.e);
                    bVar.f19428f.endRecording();
                    bVar.f19429g.setPosition(0, 0, bVar.f19431j, bVar.f19432k);
                    RecordingCanvas beginRecording2 = bVar.f19429g.beginRecording();
                    float f14 = rectF2.left - rectF.left;
                    float f15 = bVar.f19434m;
                    beginRecording2.translate(f14 / f15, (rectF2.top - rectF.top) / f15);
                    int i16 = bVar.f19433l;
                    int i17 = bVar.f19434m;
                    if (i16 != i17) {
                        float f16 = i16 / i17;
                        beginRecording2.scale(f16, f16);
                    }
                    beginRecording2.drawRenderNode(bVar.f19428f);
                    bVar.f19429g.endRecording();
                    i10++;
                } else {
                    throw new IllegalArgumentException("n must be positive");
                }
            } else {
                this.e.setPosition(0, 0, this.d.getWidth(), this.d.getHeight());
                RecordingCanvas beginRecording3 = this.e.beginRecording();
                for (int i18 = 0; i18 < this.f19446b; i18++) {
                    b bVar2 = (b) arrayList.get(i18);
                    beginRecording3.save();
                    RectF rectF4 = bVar2.f19425a;
                    RectF rectF5 = bVar2.f19427c;
                    beginRecording3.clipRect(rectF4);
                    beginRecording3.translate(rectF5.left, rectF5.top);
                    float f17 = bVar2.f19433l;
                    beginRecording3.scale(f17, f17);
                    beginRecording3.drawRenderNode(bVar2.e);
                    beginRecording3.restore();
                    beginRecording3.drawRect(bVar2.f19425a, y6.Rl);
                    beginRecording3.drawRect(rectF5, y6.Ql);
                }
                this.e.endRecording();
                return;
            }
        }
    }

    public final void f() {
        this.f19454m = -c(this.f19458q, this.f19451j);
        this.f19455n = -c(this.f19459r, this.f19451j);
        this.f19456o = -c(this.f19458q, this.f19452k);
        this.f19457p = -c(this.f19459r, this.f19452k);
        for (int i10 = 0; i10 < this.f19446b; i10++) {
            b bVar = (b) this.f19445a.get(i10);
            int i11 = this.f19454m;
            int i12 = this.f19455n;
            int i13 = this.f19456o;
            int i14 = this.f19457p;
            bVar.f19439r = i11;
            bVar.f19440s = i12;
            bVar.f19441t = i13;
            bVar.f19442u = i14;
        }
    }
}
