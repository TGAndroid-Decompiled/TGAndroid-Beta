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
public final class i {
    public final boolean f454a;
    public final boolean f455b;
    public final boolean f456c;
    public final int d;
    public boolean e;
    public final RenderNode[] f457f;
    public long f458g;
    public final RectF h = new RectF();
    public final a f459i = new Object();
    public final ArrayList f460j = new ArrayList();
    public int f461k;
    public int f462l;
    public Rect f463m;

    public i(boolean z10) {
        int i10;
        boolean isEnabled = LiteMode.isEnabled(262144);
        this.f454a = isEnabled;
        this.f456c = true;
        if (!isEnabled && !z10) {
            i10 = 8;
        } else {
            i10 = 1;
        }
        this.d = i10;
        this.f455b = z10;
        this.f457f = new RenderNode[isEnabled ? 2 : 1];
        int i11 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.f457f;
            if (i11 < renderNodeArr.length) {
                renderNodeArr[i11] = f.c();
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
            boolean z10 = this.f454a;
            if (!z10 && this.f456c) {
                canvas.drawRenderNode(this.f457f[0]);
                return;
            } else if (i10 == -2) {
                canvas.drawRenderNode(this.f457f[!z10 ? 1 : 0]);
                return;
            } else if (i10 == -4) {
                canvas.drawRenderNode(this.f457f[0]);
                return;
            } else if (i10 == -3) {
                canvas.drawRenderNode(this.f457f[1]);
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void c(android.graphics.Canvas r8, int r9) {
        throw new UnsupportedOperationException("Method not decompiled: ah.i.c(android.graphics.Canvas, int):void");
    }

    public final RenderNode d(int i10, int i11) {
        g gVar;
        h hVar = (h) this.f460j.get(i11);
        if (this.f454a && (gVar = hVar.f453c) != null) {
            if (i10 == 0) {
                return gVar.f446c[0];
            }
            return hVar.f452b.f446c[0];
        }
        RenderNode[] renderNodeArr = hVar.f452b.f446c;
        return renderNodeArr[Math.min(i10, renderNodeArr.length - 1)];
    }

    public final boolean e(bh.a aVar, int i10, int i11) {
        long j3;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f461k;
            ArrayList arrayList = this.f460j;
            if (i12 < i14) {
                h hVar = (h) arrayList.get(i12);
                Rect rect = hVar.d;
                RectF rectF = this.h;
                rectF.set(rect);
                a aVar2 = this.f459i;
                aVar2.f418b = 0L;
                aVar2.f417a = false;
                aVar.b(aVar2, rectF);
                boolean z10 = aVar2.f417a;
                if (z10) {
                    j3 = -1;
                } else {
                    j3 = aVar2.f418b;
                }
                if (z10 || hVar.e != j3 || !hVar.f451a.hasDisplayList()) {
                    hVar.e = j3;
                    if (this.f463m == null) {
                        h hVar2 = (h) arrayList.get(i12);
                        Rect rect2 = hVar2.d;
                        this.f463m = rect2;
                        this.f462l = i12;
                        int width = rect2.width();
                        int i15 = this.d;
                        int i16 = width / i15;
                        int height = rect2.height() / i15;
                        hVar2.f451a.setPosition(0, 0, i16, height);
                        RecordingCanvas beginRecording = hVar2.f451a.beginRecording(i16, height);
                        float f7 = 1.0f / i15;
                        beginRecording.scale(f7, f7);
                        beginRecording.save();
                        beginRecording.translate(-rect.left, -rect.top);
                        aVar.f(beginRecording, rectF);
                        beginRecording.restore();
                        if (this.f463m != null) {
                            h hVar3 = (h) arrayList.get(this.f462l);
                            hVar3.f451a.endRecording();
                            g gVar = hVar3.f452b;
                            g gVar2 = hVar3.f453c;
                            if (gVar2 != null) {
                                gVar2.a(hVar3.f451a);
                                gVar.a(gVar2.f446c[0]);
                            } else {
                                gVar.a(hVar3.f451a);
                            }
                            this.f463m = null;
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
                        RenderNode[] renderNodeArr = this.f457f;
                        if (i17 >= renderNodeArr.length) {
                            break;
                        }
                        RenderNode renderNode = renderNodeArr[i17];
                        calcHash = MediaDataController.calcHash(calcHash, renderNode.getUniqueId());
                        for (int i18 = 0; i18 < this.f461k; i18++) {
                            RenderNode d = d(i17, i18);
                            Rect rect3 = ((h) arrayList.get(i18)).d;
                            calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(calcHash, rect3.left), rect3.top), rect3.right), rect3.bottom), d.getUniqueId());
                        }
                        if (!renderNode.hasDisplayList()) {
                            z11 = true;
                        }
                        i17++;
                    }
                    if (calcHash != this.f458g || z11) {
                        this.f458g = calcHash;
                        int i19 = 0;
                        while (true) {
                            RenderNode[] renderNodeArr2 = this.f457f;
                            if (i19 >= renderNodeArr2.length) {
                                return true;
                            }
                            RenderNode renderNode2 = renderNodeArr2[i19];
                            renderNode2.setPosition(0, 0, i10, i11);
                            RecordingCanvas beginRecording2 = renderNode2.beginRecording(i10, i11);
                            for (int i20 = 0; i20 < this.f461k; i20++) {
                                beginRecording2.save();
                                Rect rect4 = ((h) arrayList.get(i20)).d;
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
        for (int i10 = 0; i10 < this.f461k; i10++) {
            h hVar = (h) this.f460j.get(i10);
            hVar.f452b.b(f7, f10);
            g gVar = hVar.f453c;
            if (gVar != null) {
                gVar.b(f7, f10);
            }
        }
    }

    public final void g(int i10, List list) {
        ArrayList arrayList;
        this.f461k = i10;
        while (true) {
            int i11 = this.f461k;
            arrayList = this.f460j;
            if (i11 <= arrayList.size()) {
                break;
            }
            arrayList.add(new h(this));
        }
        for (int i12 = 0; i12 < this.f461k; i12++) {
            h.a((h) arrayList.get(i12), (RectF) list.get(i12));
        }
    }

    public final void h(li.a aVar) {
        ArrayList arrayList;
        this.f461k = aVar.f14137b;
        while (true) {
            int i10 = this.f461k;
            arrayList = this.f460j;
            if (i10 <= arrayList.size()) {
                break;
            }
            arrayList.add(new h(this));
        }
        for (int i11 = 0; i11 < this.f461k; i11++) {
            h.a((h) arrayList.get(i11), aVar.c(i11));
        }
    }
}
