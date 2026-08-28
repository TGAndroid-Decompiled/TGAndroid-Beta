package ig;

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
    public final boolean f11160a;
    public final boolean f11161b;
    public final boolean f11162c;
    public final int d;
    public final RenderNode[] f11163e;
    public long f11164f;
    public final RectF f11165g = new RectF();
    public final x h = new Object();
    public final ArrayList f11166i = new ArrayList();
    public int f11167j;
    public int f11168k;
    public Rect f11169l;

    public e(boolean z10) {
        int i9;
        boolean isEnabled = LiteMode.isEnabled(262144);
        this.f11160a = isEnabled;
        this.f11162c = true;
        if (!isEnabled && !z10) {
            i9 = 8;
        } else {
            i9 = 1;
        }
        this.d = i9;
        this.f11161b = z10;
        this.f11163e = new RenderNode[isEnabled ? 2 : 1];
        int i10 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.f11163e;
            if (i10 < renderNodeArr.length) {
                renderNodeArr[i10] = z.c();
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

    public final void b(Canvas canvas, int i9) {
        if (canvas.isHardwareAccelerated()) {
            boolean z10 = this.f11160a;
            if (!z10 && this.f11162c) {
                canvas.drawRenderNode(this.f11163e[0]);
                return;
            } else if (i9 == -2) {
                canvas.drawRenderNode(this.f11163e[!z10 ? 1 : 0]);
                return;
            } else if (i9 == -4) {
                canvas.drawRenderNode(this.f11163e[0]);
                return;
            } else if (i9 == -3) {
                canvas.drawRenderNode(this.f11163e[1]);
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void c(android.graphics.Canvas r7, int r8) {
        throw new UnsupportedOperationException("Method not decompiled: ig.e.c(android.graphics.Canvas, int):void");
    }

    public final RenderNode d(int i9, int i10) {
        c cVar;
        d dVar = (d) this.f11166i.get(i10);
        if (this.f11160a && (cVar = dVar.f11158c) != null) {
            if (i9 == 0) {
                return cVar.f11150c[0];
            }
            return dVar.f11157b.f11150c[0];
        }
        RenderNode[] renderNodeArr = dVar.f11157b.f11150c;
        return renderNodeArr[Math.min(i9, renderNodeArr.length - 1)];
    }

    public final boolean e(jg.a aVar, int i9, int i10) {
        long j10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.f11167j;
            ArrayList arrayList = this.f11166i;
            if (i11 < i13) {
                d dVar = (d) arrayList.get(i11);
                Rect rect = dVar.d;
                RectF rectF = this.f11165g;
                rectF.set(rect);
                x xVar = this.h;
                xVar.f7045a = 0L;
                xVar.f7046b = false;
                aVar.g(xVar, rectF);
                boolean z10 = xVar.f7046b;
                if (z10) {
                    j10 = -1;
                } else {
                    j10 = xVar.f7045a;
                }
                if (z10 || dVar.f11159e != j10 || !dVar.f11156a.hasDisplayList()) {
                    dVar.f11159e = j10;
                    if (this.f11169l == null) {
                        d dVar2 = (d) arrayList.get(i11);
                        Rect rect2 = dVar2.d;
                        this.f11169l = rect2;
                        this.f11168k = i11;
                        int width = rect2.width();
                        int i14 = this.d;
                        int i15 = width / i14;
                        int height = rect2.height() / i14;
                        dVar2.f11156a.setPosition(0, 0, i15, height);
                        RecordingCanvas beginRecording = dVar2.f11156a.beginRecording(i15, height);
                        float f10 = 1.0f / i14;
                        beginRecording.scale(f10, f10);
                        beginRecording.save();
                        beginRecording.translate(-rect.left, -rect.top);
                        aVar.e(beginRecording, rectF);
                        beginRecording.restore();
                        if (this.f11169l != null) {
                            d dVar3 = (d) arrayList.get(this.f11168k);
                            dVar3.f11156a.endRecording();
                            c cVar = dVar3.f11157b;
                            c cVar2 = dVar3.f11158c;
                            if (cVar2 != null) {
                                cVar2.a(dVar3.f11156a);
                                cVar.a(cVar2.f11150c[0]);
                            } else {
                                cVar.a(dVar3.f11156a);
                            }
                            this.f11169l = null;
                            i12++;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                i11++;
            } else {
                if (i12 > 0) {
                    long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(0L, i9), i10);
                    int i16 = 0;
                    boolean z11 = false;
                    while (true) {
                        RenderNode[] renderNodeArr = this.f11163e;
                        if (i16 >= renderNodeArr.length) {
                            break;
                        }
                        RenderNode renderNode = renderNodeArr[i16];
                        calcHash = MediaDataController.calcHash(calcHash, renderNode.getUniqueId());
                        for (int i17 = 0; i17 < this.f11167j; i17++) {
                            RenderNode d = d(i16, i17);
                            Rect rect3 = ((d) arrayList.get(i17)).d;
                            calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(calcHash, rect3.left), rect3.top), rect3.right), rect3.bottom), d.getUniqueId());
                        }
                        if (!renderNode.hasDisplayList()) {
                            z11 = true;
                        }
                        i16++;
                    }
                    if (calcHash != this.f11164f || z11) {
                        this.f11164f = calcHash;
                        int i18 = 0;
                        while (true) {
                            RenderNode[] renderNodeArr2 = this.f11163e;
                            if (i18 >= renderNodeArr2.length) {
                                return true;
                            }
                            RenderNode renderNode2 = renderNodeArr2[i18];
                            renderNode2.setPosition(0, 0, i9, i10);
                            RecordingCanvas beginRecording2 = renderNode2.beginRecording(i9, i10);
                            for (int i19 = 0; i19 < this.f11167j; i19++) {
                                beginRecording2.save();
                                Rect rect4 = ((d) arrayList.get(i19)).d;
                                beginRecording2.translate(rect4.left, rect4.top);
                                beginRecording2.drawRenderNode(d(i18, i19));
                                beginRecording2.restore();
                            }
                            renderNode2.endRecording();
                            i18++;
                        }
                    }
                }
                return false;
            }
        }
    }

    public final void f(float f10, float f11) {
        for (int i9 = 0; i9 < this.f11167j; i9++) {
            d dVar = (d) this.f11166i.get(i9);
            dVar.f11157b.b(f10, f11);
            c cVar = dVar.f11158c;
            if (cVar != null) {
                cVar.b(f10, f11);
            }
        }
    }

    public final void g(int i9, List list) {
        ArrayList arrayList;
        this.f11167j = i9;
        while (true) {
            int i10 = this.f11167j;
            arrayList = this.f11166i;
            if (i10 <= arrayList.size()) {
                break;
            }
            arrayList.add(new d(this));
        }
        for (int i11 = 0; i11 < this.f11167j; i11++) {
            RectF rectF = (RectF) list.get(i11);
            Rect rect = ((d) arrayList.get(i11)).d;
            float f10 = rectF.left;
            float f11 = 16;
            rect.left = Math.round(f10 - (f10 % f11));
            float f12 = rectF.top;
            rect.top = Math.round(f12 - (f12 % f11));
            float f13 = rectF.right;
            rect.right = Math.round((f11 - (f13 % f11)) + f13);
            float f14 = rectF.bottom;
            rect.bottom = Math.round((f11 - (f14 % f11)) + f14);
        }
    }
}
