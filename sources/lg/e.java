package lg;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.z;
import g.x;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
public final class e {
    public final boolean f15253a;
    public final boolean f15254b;
    public final boolean f15255c;
    public final int d;
    public final RenderNode[] f15256e;
    public long f15257f;
    public final RectF f15258g = new RectF();
    public final x h = new Object();
    public final ArrayList f15259i = new ArrayList();
    public int f15260j;
    public int f15261k;
    public Rect f15262l;

    public e(boolean z10) {
        int i10;
        boolean isEnabled = LiteMode.isEnabled(262144);
        this.f15253a = isEnabled;
        this.f15255c = true;
        if (!isEnabled && !z10) {
            i10 = 8;
        } else {
            i10 = 1;
        }
        this.d = i10;
        this.f15254b = z10;
        this.f15256e = new RenderNode[isEnabled ? 2 : 1];
        int i11 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.f15256e;
            if (i11 < renderNodeArr.length) {
                renderNodeArr[i11] = z.c();
                i11++;
            } else {
                return;
            }
        }
    }

    public static float a(float f9, float f10) {
        float f11;
        float f12 = 0.0f;
        if (f9 > 0.0f) {
            f11 = (f9 * 0.57735f) + 0.5f;
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
            boolean z10 = this.f15253a;
            if (!z10 && this.f15255c) {
                canvas.drawRenderNode(this.f15256e[0]);
                return;
            } else if (i10 == -2) {
                canvas.drawRenderNode(this.f15256e[!z10 ? 1 : 0]);
                return;
            } else if (i10 == -4) {
                canvas.drawRenderNode(this.f15256e[0]);
                return;
            } else if (i10 == -3) {
                canvas.drawRenderNode(this.f15256e[1]);
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void c(android.graphics.Canvas r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: lg.e.c(android.graphics.Canvas, int):void");
    }

    public final RenderNode d(int i10, int i11) {
        c cVar;
        d dVar = (d) this.f15259i.get(i11);
        if (this.f15253a && (cVar = dVar.f15251c) != null) {
            if (i10 == 0) {
                return cVar.f15243c[0];
            }
            return dVar.f15250b.f15243c[0];
        }
        RenderNode[] renderNodeArr = dVar.f15250b.f15243c;
        return renderNodeArr[Math.min(i10, renderNodeArr.length - 1)];
    }

    public final boolean e(mg.a aVar, int i10, int i11) {
        long j10;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f15260j;
            ArrayList arrayList = this.f15259i;
            if (i12 < i14) {
                d dVar = (d) arrayList.get(i12);
                Rect rect = dVar.d;
                RectF rectF = this.f15258g;
                rectF.set(rect);
                x xVar = this.h;
                xVar.f6955a = 0L;
                xVar.f6956b = false;
                aVar.g(xVar, rectF);
                boolean z10 = xVar.f6956b;
                if (z10) {
                    j10 = -1;
                } else {
                    j10 = xVar.f6955a;
                }
                if (z10 || dVar.f15252e != j10 || !dVar.f15249a.hasDisplayList()) {
                    dVar.f15252e = j10;
                    if (this.f15262l == null) {
                        d dVar2 = (d) arrayList.get(i12);
                        Rect rect2 = dVar2.d;
                        this.f15262l = rect2;
                        this.f15261k = i12;
                        int width = rect2.width();
                        int i15 = this.d;
                        int i16 = width / i15;
                        int height = rect2.height() / i15;
                        dVar2.f15249a.setPosition(0, 0, i16, height);
                        RecordingCanvas beginRecording = dVar2.f15249a.beginRecording(i16, height);
                        float f9 = 1.0f / i15;
                        beginRecording.scale(f9, f9);
                        beginRecording.save();
                        beginRecording.translate(-rect.left, -rect.top);
                        aVar.e(beginRecording, rectF);
                        beginRecording.restore();
                        if (this.f15262l != null) {
                            d dVar3 = (d) arrayList.get(this.f15261k);
                            dVar3.f15249a.endRecording();
                            c cVar = dVar3.f15250b;
                            c cVar2 = dVar3.f15251c;
                            if (cVar2 != null) {
                                cVar2.a(dVar3.f15249a);
                                cVar.a(cVar2.f15243c[0]);
                            } else {
                                cVar.a(dVar3.f15249a);
                            }
                            this.f15262l = null;
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
                        RenderNode[] renderNodeArr = this.f15256e;
                        if (i17 >= renderNodeArr.length) {
                            break;
                        }
                        RenderNode renderNode = renderNodeArr[i17];
                        calcHash = MediaDataController.calcHash(calcHash, renderNode.getUniqueId());
                        for (int i18 = 0; i18 < this.f15260j; i18++) {
                            RenderNode d = d(i17, i18);
                            Rect rect3 = ((d) arrayList.get(i18)).d;
                            calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(calcHash, rect3.left), rect3.top), rect3.right), rect3.bottom), d.getUniqueId());
                        }
                        if (!renderNode.hasDisplayList()) {
                            z11 = true;
                        }
                        i17++;
                    }
                    if (calcHash != this.f15257f || z11) {
                        this.f15257f = calcHash;
                        int i19 = 0;
                        while (true) {
                            RenderNode[] renderNodeArr2 = this.f15256e;
                            if (i19 >= renderNodeArr2.length) {
                                return true;
                            }
                            RenderNode renderNode2 = renderNodeArr2[i19];
                            renderNode2.setPosition(0, 0, i10, i11);
                            RecordingCanvas beginRecording2 = renderNode2.beginRecording(i10, i11);
                            for (int i20 = 0; i20 < this.f15260j; i20++) {
                                beginRecording2.save();
                                Rect rect4 = ((d) arrayList.get(i20)).d;
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

    public final void f(float f9, float f10) {
        for (int i10 = 0; i10 < this.f15260j; i10++) {
            d dVar = (d) this.f15259i.get(i10);
            dVar.f15250b.b(f9, f10);
            c cVar = dVar.f15251c;
            if (cVar != null) {
                cVar.b(f9, f10);
            }
        }
    }

    public final void g(int i10, List list) {
        ArrayList arrayList;
        this.f15260j = i10;
        while (true) {
            int i11 = this.f15260j;
            arrayList = this.f15259i;
            if (i11 <= arrayList.size()) {
                break;
            }
            arrayList.add(new d(this));
        }
        for (int i12 = 0; i12 < this.f15260j; i12++) {
            RectF rectF = (RectF) list.get(i12);
            Rect rect = ((d) arrayList.get(i12)).d;
            float f9 = rectF.left;
            float f10 = 16;
            rect.left = Math.round(f9 - (f9 % f10));
            float f11 = rectF.top;
            rect.top = Math.round(f11 - (f11 % f10));
            float f12 = rectF.right;
            rect.right = Math.round((f10 - (f12 % f10)) + f12);
            float f13 = rectF.bottom;
            rect.bottom = Math.round((f10 - (f13 % f10)) + f13);
        }
    }
}
