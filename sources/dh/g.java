package dh;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import java.util.ArrayList;
import org.telegram.messenger.qc;
import org.telegram.messenger.si;
public final class g {
    public final boolean f8435a;
    public final boolean f8436b;
    public final boolean f8437c;
    public final int d;
    public boolean f8438e;
    public final RenderNode[] f8439f;
    public long f8440g;
    public final RectF h = new RectF();
    public final a f8441i = new Object();
    public final ArrayList f8442j = new ArrayList();
    public int f8443k;
    public int f8444l;
    public Rect f8445m;

    public g(boolean z10) {
        int i7;
        boolean e10 = qc.e(262144);
        this.f8435a = e10;
        this.f8437c = true;
        if (!e10 && !z10) {
            i7 = 8;
        } else {
            i7 = 1;
        }
        this.d = i7;
        this.f8436b = z10;
        this.f8439f = new RenderNode[e10 ? 2 : 1];
        int i10 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.f8439f;
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
            boolean z10 = this.f8435a;
            if (!z10 && this.f8437c) {
                canvas.drawRenderNode(this.f8439f[0]);
                return;
            } else if (i7 == -2) {
                canvas.drawRenderNode(this.f8439f[!z10 ? 1 : 0]);
                return;
            } else if (i7 == -4) {
                canvas.drawRenderNode(this.f8439f[0]);
                return;
            } else if (i7 == -3) {
                canvas.drawRenderNode(this.f8439f[1]);
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void c(Canvas canvas, int i7) {
        int i10;
        boolean z10 = this.f8435a;
        if (!z10 && this.f8437c) {
            i10 = 0;
        } else if (i7 == -2) {
            i10 = !z10 ? 1 : 0;
        } else if (i7 == -4) {
            i10 = 3;
        } else if (i7 == -3) {
            i10 = 1;
        } else {
            return;
        }
        for (int i11 = 0; i11 < this.f8443k; i11++) {
            f fVar = (f) this.f8442j.get(i11);
            Rect rect = fVar.d;
            if (!canvas.quickReject(rect.left, rect.top, rect.right, rect.bottom)) {
                canvas.save();
                Rect rect2 = fVar.d;
                canvas.translate(rect2.left, rect2.top);
                RenderNode d = d(i10, i11);
                if (!d.hasDisplayList()) {
                    this.f8438e = true;
                }
                canvas.drawRenderNode(d);
                canvas.restore();
            }
        }
    }

    public final RenderNode d(int i7, int i10) {
        e eVar;
        f fVar = (f) this.f8442j.get(i10);
        if (this.f8435a && (eVar = fVar.f8433c) != null) {
            if (i7 == 3) {
                return eVar.f8425c[0];
            }
            if (i7 == 0) {
                RenderNode[] renderNodeArr = eVar.f8425c;
                return renderNodeArr[renderNodeArr.length - 1];
            }
            return fVar.f8432b.f8425c[0];
        }
        RenderNode[] renderNodeArr2 = fVar.f8432b.f8425c;
        return renderNodeArr2[Math.min(i7, renderNodeArr2.length - 1)];
    }

    public final void e(eh.a aVar, int i7, int i10) {
        long j3;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.f8443k;
            ArrayList arrayList = this.f8442j;
            if (i11 < i13) {
                f fVar = (f) arrayList.get(i11);
                Rect rect = fVar.d;
                RectF rectF = this.h;
                rectF.set(rect);
                a aVar2 = this.f8441i;
                aVar2.f8402b = 0L;
                aVar2.f8401a = false;
                aVar.c(aVar2, rectF);
                boolean z10 = aVar2.f8401a;
                if (z10) {
                    j3 = -1;
                } else {
                    j3 = aVar2.f8402b;
                }
                if (z10 || fVar.f8434e != j3 || !fVar.f8431a.hasDisplayList()) {
                    fVar.f8434e = j3;
                    if (this.f8445m == null) {
                        f fVar2 = (f) arrayList.get(i11);
                        Rect rect2 = fVar2.d;
                        this.f8445m = rect2;
                        this.f8444l = i11;
                        int width = rect2.width();
                        int i14 = this.d;
                        int i15 = width / i14;
                        int height = rect2.height() / i14;
                        fVar2.f8431a.setPosition(0, 0, i15, height);
                        RecordingCanvas beginRecording = fVar2.f8431a.beginRecording(i15, height);
                        float f10 = 1.0f / i14;
                        beginRecording.scale(f10, f10);
                        beginRecording.save();
                        beginRecording.translate(-rect.left, -rect.top);
                        aVar.d(beginRecording, rectF);
                        beginRecording.restore();
                        if (this.f8445m != null) {
                            f fVar3 = (f) arrayList.get(this.f8444l);
                            fVar3.f8431a.endRecording();
                            e eVar = fVar3.f8432b;
                            e eVar2 = fVar3.f8433c;
                            if (eVar2 != null) {
                                eVar2.a(fVar3.f8431a);
                                eVar.a(eVar2.f8425c[0]);
                            } else {
                                eVar.a(fVar3.f8431a);
                            }
                            this.f8445m = null;
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
                long r10 = si.r(si.r(0L, i7), i10);
                int i16 = 0;
                boolean z11 = false;
                while (true) {
                    RenderNode[] renderNodeArr = this.f8439f;
                    if (i16 >= renderNodeArr.length) {
                        break;
                    }
                    RenderNode renderNode = renderNodeArr[i16];
                    r10 = si.r(r10, renderNode.getUniqueId());
                    for (int i17 = 0; i17 < this.f8443k; i17++) {
                        RenderNode d = d(i16, i17);
                        Rect rect3 = ((f) arrayList.get(i17)).d;
                        r10 = si.r(si.r(si.r(si.r(si.r(r10, rect3.left), rect3.top), rect3.right), rect3.bottom), d.getUniqueId());
                    }
                    if (!renderNode.hasDisplayList()) {
                        z11 = true;
                    }
                    i16++;
                }
                if (r10 != this.f8440g || z11) {
                    this.f8440g = r10;
                    int i18 = 0;
                    while (true) {
                        RenderNode[] renderNodeArr2 = this.f8439f;
                        if (i18 < renderNodeArr2.length) {
                            RenderNode renderNode2 = renderNodeArr2[i18];
                            renderNode2.setPosition(0, 0, i7, i10);
                            RecordingCanvas beginRecording2 = renderNode2.beginRecording(i7, i10);
                            for (int i19 = 0; i19 < this.f8443k; i19++) {
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
        for (int i7 = 0; i7 < this.f8443k; i7++) {
            f fVar = (f) this.f8442j.get(i7);
            fVar.f8432b.b(f10, f11);
            e eVar = fVar.f8433c;
            if (eVar != null) {
                eVar.b(f10, f11);
            }
        }
    }

    public final void g(int i7, ArrayList arrayList) {
        ArrayList arrayList2;
        this.f8443k = i7;
        while (true) {
            int i10 = this.f8443k;
            arrayList2 = this.f8442j;
            if (i10 <= arrayList2.size()) {
                break;
            }
            arrayList2.add(new f(this));
        }
        for (int i11 = 0; i11 < this.f8443k; i11++) {
            f.a((f) arrayList2.get(i11), (RectF) arrayList.get(i11));
        }
    }

    public final void h(ti.a aVar) {
        ArrayList arrayList;
        this.f8443k = aVar.f58275b;
        while (true) {
            int i7 = this.f8443k;
            arrayList = this.f8442j;
            if (i7 <= arrayList.size()) {
                break;
            }
            arrayList.add(new f(this));
        }
        for (int i10 = 0; i10 < this.f8443k; i10++) {
            f.a((f) arrayList.get(i10), aVar.c(i10));
        }
    }
}
