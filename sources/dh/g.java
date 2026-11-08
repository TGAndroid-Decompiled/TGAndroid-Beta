package dh;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import java.util.ArrayList;
import org.telegram.messenger.sc;
import org.telegram.messenger.ui;
public final class g {
    public final boolean f8734a;
    public final boolean f8735b;
    public final boolean f8736c;
    public final int d;
    public boolean f8737e;
    public final RenderNode[] f8738f;
    public long f8739g;
    public final RectF h = new RectF();
    public final a f8740i = new Object();
    public final ArrayList f8741j = new ArrayList();
    public int f8742k;
    public int f8743l;
    public Rect f8744m;

    public g(boolean z9) {
        int i7;
        boolean e10 = sc.e(262144);
        this.f8734a = e10;
        this.f8736c = true;
        if (!e10 && !z9) {
            i7 = 8;
        } else {
            i7 = 1;
        }
        this.d = i7;
        this.f8735b = z9;
        this.f8738f = new RenderNode[e10 ? 2 : 1];
        int i10 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.f8738f;
            if (i10 < renderNodeArr.length) {
                renderNodeArr[i10] = w.c();
                i10++;
            } else {
                return;
            }
        }
    }

    public static float a(float f10, float f11) {
        float f12;
        float f13 = 0.0f;
        if (f10 > 0.0f) {
            f12 = (f10 * 0.57735f) + 0.5f;
        } else {
            f12 = 0.0f;
        }
        float f14 = f12 / f11;
        if (f14 > 0.5f) {
            f13 = (f14 - 0.5f) / 0.57735f;
        }
        return Math.max(1.0f, f13);
    }

    public final void b(Canvas canvas, int i7) {
        if (canvas.isHardwareAccelerated()) {
            boolean z9 = this.f8734a;
            if (!z9 && this.f8736c) {
                canvas.drawRenderNode(this.f8738f[0]);
                return;
            } else if (i7 == -2) {
                canvas.drawRenderNode(this.f8738f[!z9 ? 1 : 0]);
                return;
            } else if (i7 == -4) {
                canvas.drawRenderNode(this.f8738f[0]);
                return;
            } else if (i7 == -3) {
                canvas.drawRenderNode(this.f8738f[1]);
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void c(Canvas canvas, int i7) {
        int i10;
        boolean z9 = this.f8734a;
        if (!z9 && this.f8736c) {
            i10 = 0;
        } else if (i7 == -2) {
            i10 = !z9 ? 1 : 0;
        } else if (i7 == -4) {
            i10 = 3;
        } else if (i7 == -3) {
            i10 = 1;
        } else {
            return;
        }
        for (int i11 = 0; i11 < this.f8742k; i11++) {
            f fVar = (f) this.f8741j.get(i11);
            Rect rect = fVar.d;
            if (!canvas.quickReject(rect.left, rect.top, rect.right, rect.bottom)) {
                canvas.save();
                Rect rect2 = fVar.d;
                canvas.translate(rect2.left, rect2.top);
                RenderNode d = d(i10, i11);
                if (!d.hasDisplayList()) {
                    this.f8737e = true;
                }
                canvas.drawRenderNode(d);
                canvas.restore();
            }
        }
    }

    public final RenderNode d(int i7, int i10) {
        e eVar;
        f fVar = (f) this.f8741j.get(i10);
        if (this.f8734a && (eVar = fVar.f8732c) != null) {
            if (i7 == 3) {
                return eVar.f8724c[0];
            }
            if (i7 == 0) {
                RenderNode[] renderNodeArr = eVar.f8724c;
                return renderNodeArr[renderNodeArr.length - 1];
            }
            return fVar.f8731b.f8724c[0];
        }
        RenderNode[] renderNodeArr2 = fVar.f8731b.f8724c;
        return renderNodeArr2[Math.min(i7, renderNodeArr2.length - 1)];
    }

    public final void e(eh.a aVar, int i7, int i10) {
        long j3;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.f8742k;
            ArrayList arrayList = this.f8741j;
            if (i11 < i13) {
                f fVar = (f) arrayList.get(i11);
                Rect rect = fVar.d;
                RectF rectF = this.h;
                rectF.set(rect);
                a aVar2 = this.f8740i;
                aVar2.f8701b = 0L;
                aVar2.f8700a = false;
                aVar.c(aVar2, rectF);
                boolean z9 = aVar2.f8700a;
                if (z9) {
                    j3 = -1;
                } else {
                    j3 = aVar2.f8701b;
                }
                if (z9 || fVar.f8733e != j3 || !fVar.f8730a.hasDisplayList()) {
                    fVar.f8733e = j3;
                    if (this.f8744m == null) {
                        f fVar2 = (f) arrayList.get(i11);
                        Rect rect2 = fVar2.d;
                        this.f8744m = rect2;
                        this.f8743l = i11;
                        int width = rect2.width();
                        int i14 = this.d;
                        int i15 = width / i14;
                        int height = rect2.height() / i14;
                        fVar2.f8730a.setPosition(0, 0, i15, height);
                        RecordingCanvas beginRecording = fVar2.f8730a.beginRecording(i15, height);
                        float f10 = 1.0f / i14;
                        beginRecording.scale(f10, f10);
                        beginRecording.save();
                        beginRecording.translate(-rect.left, -rect.top);
                        aVar.d(beginRecording, rectF);
                        beginRecording.restore();
                        if (this.f8744m != null) {
                            f fVar3 = (f) arrayList.get(this.f8743l);
                            fVar3.f8730a.endRecording();
                            e eVar = fVar3.f8731b;
                            e eVar2 = fVar3.f8732c;
                            if (eVar2 != null) {
                                eVar2.a(fVar3.f8730a);
                                eVar.a(eVar2.f8724c[0]);
                            } else {
                                eVar.a(fVar3.f8730a);
                            }
                            this.f8744m = null;
                            i12++;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                i11++;
            } else if (i12 > 0) {
                long p10 = ui.p(ui.p(0L, i7), i10);
                int i16 = 0;
                boolean z10 = false;
                while (true) {
                    RenderNode[] renderNodeArr = this.f8738f;
                    if (i16 >= renderNodeArr.length) {
                        break;
                    }
                    RenderNode renderNode = renderNodeArr[i16];
                    p10 = ui.p(p10, renderNode.getUniqueId());
                    for (int i17 = 0; i17 < this.f8742k; i17++) {
                        RenderNode d = d(i16, i17);
                        Rect rect3 = ((f) arrayList.get(i17)).d;
                        p10 = ui.p(ui.p(ui.p(ui.p(ui.p(p10, rect3.left), rect3.top), rect3.right), rect3.bottom), d.getUniqueId());
                    }
                    if (!renderNode.hasDisplayList()) {
                        z10 = true;
                    }
                    i16++;
                }
                if (p10 != this.f8739g || z10) {
                    this.f8739g = p10;
                    int i18 = 0;
                    while (true) {
                        RenderNode[] renderNodeArr2 = this.f8738f;
                        if (i18 < renderNodeArr2.length) {
                            RenderNode renderNode2 = renderNodeArr2[i18];
                            renderNode2.setPosition(0, 0, i7, i10);
                            RecordingCanvas beginRecording2 = renderNode2.beginRecording(i7, i10);
                            for (int i19 = 0; i19 < this.f8742k; i19++) {
                                beginRecording2.save();
                                Rect rect4 = ((f) arrayList.get(i19)).d;
                                beginRecording2.translate(rect4.left, rect4.top);
                                beginRecording2.drawRenderNode(d(i18, i19));
                                beginRecording2.restore();
                            }
                            renderNode2.endRecording();
                            i18++;
                        } else {
                            return;
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public final void f(float f10, float f11) {
        for (int i7 = 0; i7 < this.f8742k; i7++) {
            f fVar = (f) this.f8741j.get(i7);
            fVar.f8731b.b(f10, f11);
            e eVar = fVar.f8732c;
            if (eVar != null) {
                eVar.b(f10, f11);
            }
        }
    }

    public final void g(int i7, ArrayList arrayList) {
        ArrayList arrayList2;
        this.f8742k = i7;
        while (true) {
            int i10 = this.f8742k;
            arrayList2 = this.f8741j;
            if (i10 <= arrayList2.size()) {
                break;
            }
            arrayList2.add(new f(this));
        }
        for (int i11 = 0; i11 < this.f8742k; i11++) {
            f.a((f) arrayList2.get(i11), (RectF) arrayList.get(i11));
        }
    }

    public final void h(qi.a aVar) {
        ArrayList arrayList;
        this.f8742k = aVar.f54153b;
        while (true) {
            int i7 = this.f8742k;
            arrayList = this.f8741j;
            if (i7 <= arrayList.size()) {
                break;
            }
            arrayList.add(new f(this));
        }
        for (int i10 = 0; i10 < this.f8742k; i10++) {
            f.a((f) arrayList.get(i10), aVar.c(i10));
        }
    }
}
