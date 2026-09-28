package ah;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
public final class h {
    public final boolean f452a;
    public final boolean f453b;
    public final boolean f454c;
    public final int d;
    public final RenderNode[] e;
    public long f455f;
    public final RectF f456g = new RectF();
    public final a h = new Object();
    public final ArrayList f457i = new ArrayList();
    public int f458j;
    public int f459k;
    public Rect f460l;

    public h(boolean z10) {
        int i10;
        boolean isEnabled = LiteMode.isEnabled(262144);
        this.f452a = isEnabled;
        this.f454c = true;
        if (!isEnabled && !z10) {
            i10 = 8;
        } else {
            i10 = 1;
        }
        this.d = i10;
        this.f453b = z10;
        this.e = new RenderNode[isEnabled ? 2 : 1];
        int i11 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.e;
            if (i11 < renderNodeArr.length) {
                renderNodeArr[i11] = e.c();
                i11++;
            } else {
                return;
            }
        }
    }

    public static float a(float f7, float f10) {
        float f11;
        float f12 = 0.0f;
        if (f7 > 0.0f) {
            f11 = (f7 * 0.57735f) + 0.5f;
        } else {
            f11 = 0.0f;
        }
        float f13 = f11 / f10;
        if (f13 > 0.5f) {
            f12 = (f13 - 0.5f) / 0.57735f;
        }
        return Math.max(1.0f, f12);
    }

    public final void b(Canvas canvas, int i10) {
        if (canvas.isHardwareAccelerated()) {
            boolean z10 = this.f452a;
            if (!z10 && this.f454c) {
                canvas.drawRenderNode(this.e[0]);
                return;
            } else if (i10 == -2) {
                canvas.drawRenderNode(this.e[!z10 ? 1 : 0]);
                return;
            } else if (i10 == -4) {
                canvas.drawRenderNode(this.e[0]);
                return;
            } else if (i10 == -3) {
                canvas.drawRenderNode(this.e[1]);
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void c(android.graphics.Canvas r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: ah.h.c(android.graphics.Canvas, int):void");
    }

    public final RenderNode d(int i10, int i11) {
        f fVar;
        g gVar = (g) this.f457i.get(i11);
        if (this.f452a && (fVar = gVar.f451c) != null) {
            if (i10 == 0) {
                return fVar.f444c[0];
            }
            return gVar.f450b.f444c[0];
        }
        RenderNode[] renderNodeArr = gVar.f450b.f444c;
        return renderNodeArr[Math.min(i10, renderNodeArr.length - 1)];
    }

    public final boolean e(bh.a aVar, int i10, int i11) {
        long j3;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f458j;
            ArrayList arrayList = this.f457i;
            if (i12 < i14) {
                g gVar = (g) arrayList.get(i12);
                Rect rect = gVar.d;
                RectF rectF = this.f456g;
                rectF.set(rect);
                a aVar2 = this.h;
                aVar2.f418b = 0L;
                aVar2.f417a = false;
                aVar.b(aVar2, rectF);
                boolean z10 = aVar2.f417a;
                if (z10) {
                    j3 = -1;
                } else {
                    j3 = aVar2.f418b;
                }
                if (z10 || gVar.e != j3 || !gVar.f449a.hasDisplayList()) {
                    gVar.e = j3;
                    if (this.f460l == null) {
                        g gVar2 = (g) arrayList.get(i12);
                        Rect rect2 = gVar2.d;
                        this.f460l = rect2;
                        this.f459k = i12;
                        int width = rect2.width();
                        int i15 = this.d;
                        int i16 = width / i15;
                        int height = rect2.height() / i15;
                        gVar2.f449a.setPosition(0, 0, i16, height);
                        RecordingCanvas beginRecording = gVar2.f449a.beginRecording(i16, height);
                        float f7 = 1.0f / i15;
                        beginRecording.scale(f7, f7);
                        beginRecording.save();
                        beginRecording.translate(-rect.left, -rect.top);
                        aVar.f(beginRecording, rectF);
                        beginRecording.restore();
                        if (this.f460l != null) {
                            g gVar3 = (g) arrayList.get(this.f459k);
                            gVar3.f449a.endRecording();
                            f fVar = gVar3.f450b;
                            f fVar2 = gVar3.f451c;
                            if (fVar2 != null) {
                                fVar2.a(gVar3.f449a);
                                fVar.a(fVar2.f444c[0]);
                            } else {
                                fVar.a(gVar3.f449a);
                            }
                            this.f460l = null;
                            i13++;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                i12++;
            } else {
                if (i13 > 0) {
                    long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(0L, i10), i11);
                    int i17 = 0;
                    boolean z11 = false;
                    while (true) {
                        RenderNode[] renderNodeArr = this.e;
                        if (i17 >= renderNodeArr.length) {
                            break;
                        }
                        RenderNode renderNode = renderNodeArr[i17];
                        calcHash = MediaDataController.calcHash(calcHash, renderNode.getUniqueId());
                        for (int i18 = 0; i18 < this.f458j; i18++) {
                            RenderNode d = d(i17, i18);
                            Rect rect3 = ((g) arrayList.get(i18)).d;
                            calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(calcHash, rect3.left), rect3.top), rect3.right), rect3.bottom), d.getUniqueId());
                        }
                        if (!renderNode.hasDisplayList()) {
                            z11 = true;
                        }
                        i17++;
                    }
                    if (calcHash != this.f455f || z11) {
                        this.f455f = calcHash;
                        int i19 = 0;
                        while (true) {
                            RenderNode[] renderNodeArr2 = this.e;
                            if (i19 >= renderNodeArr2.length) {
                                return true;
                            }
                            RenderNode renderNode2 = renderNodeArr2[i19];
                            renderNode2.setPosition(0, 0, i10, i11);
                            RecordingCanvas beginRecording2 = renderNode2.beginRecording(i10, i11);
                            for (int i20 = 0; i20 < this.f458j; i20++) {
                                beginRecording2.save();
                                Rect rect4 = ((g) arrayList.get(i20)).d;
                                beginRecording2.translate(rect4.left, rect4.top);
                                beginRecording2.drawRenderNode(d(i19, i20));
                                beginRecording2.restore();
                            }
                            renderNode2.endRecording();
                            i19++;
                        }
                    }
                }
                return false;
            }
        }
    }

    public final void f(float f7, float f10) {
        for (int i10 = 0; i10 < this.f458j; i10++) {
            g gVar = (g) this.f457i.get(i10);
            gVar.f450b.b(f7, f10);
            f fVar = gVar.f451c;
            if (fVar != null) {
                fVar.b(f7, f10);
            }
        }
    }

    public final void g(int i10, List list) {
        ArrayList arrayList;
        this.f458j = i10;
        while (true) {
            int i11 = this.f458j;
            arrayList = this.f457i;
            if (i11 <= arrayList.size()) {
                break;
            }
            arrayList.add(new g(this));
        }
        for (int i12 = 0; i12 < this.f458j; i12++) {
            g.a((g) arrayList.get(i12), (RectF) list.get(i12));
        }
    }
}
