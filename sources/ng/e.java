package ng;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.y;
import g.x;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
public final class e {
    public final boolean f14997a;
    public final boolean f14998b;
    public final boolean f14999c;
    public final int d;
    public final RenderNode[] e;
    public long f15000f;
    public final RectF f15001g = new RectF();
    public final x h = new Object();
    public final ArrayList f15002i = new ArrayList();
    public int f15003j;
    public int f15004k;
    public Rect f15005l;

    public e(boolean z4) {
        int i10;
        boolean isEnabled = LiteMode.isEnabled(262144);
        this.f14997a = isEnabled;
        this.f14999c = true;
        if (!isEnabled && !z4) {
            i10 = 8;
        } else {
            i10 = 1;
        }
        this.d = i10;
        this.f14998b = z4;
        this.e = new RenderNode[isEnabled ? 2 : 1];
        int i11 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.e;
            if (i11 < renderNodeArr.length) {
                renderNodeArr[i11] = y.c();
                i11++;
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

    public final void b(Canvas canvas, int i10) {
        if (canvas.isHardwareAccelerated()) {
            boolean z4 = this.f14997a;
            if (!z4 && this.f14999c) {
                canvas.drawRenderNode(this.e[0]);
                return;
            } else if (i10 == -2) {
                canvas.drawRenderNode(this.e[!z4 ? 1 : 0]);
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
        throw new UnsupportedOperationException("Method not decompiled: ng.e.c(android.graphics.Canvas, int):void");
    }

    public final RenderNode d(int i10, int i11) {
        c cVar;
        d dVar = (d) this.f15002i.get(i11);
        if (this.f14997a && (cVar = dVar.f14996c) != null) {
            if (i10 == 0) {
                return cVar.f14989c[0];
            }
            return dVar.f14995b.f14989c[0];
        }
        RenderNode[] renderNodeArr = dVar.f14995b.f14989c;
        return renderNodeArr[Math.min(i10, renderNodeArr.length - 1)];
    }

    public final boolean e(og.a aVar, int i10, int i11) {
        long j10;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f15003j;
            ArrayList arrayList = this.f15002i;
            if (i12 < i14) {
                d dVar = (d) arrayList.get(i12);
                Rect rect = dVar.d;
                RectF rectF = this.f15001g;
                rectF.set(rect);
                x xVar = this.h;
                xVar.f6326a = 0L;
                xVar.f6327b = false;
                aVar.g(xVar, rectF);
                boolean z4 = xVar.f6327b;
                if (z4) {
                    j10 = -1;
                } else {
                    j10 = xVar.f6326a;
                }
                if (z4 || dVar.e != j10 || !dVar.f14994a.hasDisplayList()) {
                    dVar.e = j10;
                    if (this.f15005l == null) {
                        d dVar2 = (d) arrayList.get(i12);
                        Rect rect2 = dVar2.d;
                        this.f15005l = rect2;
                        this.f15004k = i12;
                        int width = rect2.width();
                        int i15 = this.d;
                        int i16 = width / i15;
                        int height = rect2.height() / i15;
                        dVar2.f14994a.setPosition(0, 0, i16, height);
                        RecordingCanvas beginRecording = dVar2.f14994a.beginRecording(i16, height);
                        float f10 = 1.0f / i15;
                        beginRecording.scale(f10, f10);
                        beginRecording.save();
                        beginRecording.translate(-rect.left, -rect.top);
                        aVar.e(beginRecording, rectF);
                        beginRecording.restore();
                        if (this.f15005l != null) {
                            d dVar3 = (d) arrayList.get(this.f15004k);
                            dVar3.f14994a.endRecording();
                            c cVar = dVar3.f14995b;
                            c cVar2 = dVar3.f14996c;
                            if (cVar2 != null) {
                                cVar2.a(dVar3.f14994a);
                                cVar.a(cVar2.f14989c[0]);
                            } else {
                                cVar.a(dVar3.f14994a);
                            }
                            this.f15005l = null;
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
                    boolean z10 = false;
                    while (true) {
                        RenderNode[] renderNodeArr = this.e;
                        if (i17 >= renderNodeArr.length) {
                            break;
                        }
                        RenderNode renderNode = renderNodeArr[i17];
                        calcHash = MediaDataController.calcHash(calcHash, renderNode.getUniqueId());
                        for (int i18 = 0; i18 < this.f15003j; i18++) {
                            RenderNode d = d(i17, i18);
                            Rect rect3 = ((d) arrayList.get(i18)).d;
                            calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(calcHash, rect3.left), rect3.top), rect3.right), rect3.bottom), d.getUniqueId());
                        }
                        if (!renderNode.hasDisplayList()) {
                            z10 = true;
                        }
                        i17++;
                    }
                    if (calcHash != this.f15000f || z10) {
                        this.f15000f = calcHash;
                        int i19 = 0;
                        while (true) {
                            RenderNode[] renderNodeArr2 = this.e;
                            if (i19 >= renderNodeArr2.length) {
                                return true;
                            }
                            RenderNode renderNode2 = renderNodeArr2[i19];
                            renderNode2.setPosition(0, 0, i10, i11);
                            RecordingCanvas beginRecording2 = renderNode2.beginRecording(i10, i11);
                            for (int i20 = 0; i20 < this.f15003j; i20++) {
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

    public final void f(float f10, float f11) {
        for (int i10 = 0; i10 < this.f15003j; i10++) {
            d dVar = (d) this.f15002i.get(i10);
            dVar.f14995b.b(f10, f11);
            c cVar = dVar.f14996c;
            if (cVar != null) {
                cVar.b(f10, f11);
            }
        }
    }

    public final void g(int i10, List list) {
        ArrayList arrayList;
        this.f15003j = i10;
        while (true) {
            int i11 = this.f15003j;
            arrayList = this.f15002i;
            if (i11 <= arrayList.size()) {
                break;
            }
            arrayList.add(new d(this));
        }
        for (int i12 = 0; i12 < this.f15003j; i12++) {
            RectF rectF = (RectF) list.get(i12);
            Rect rect = ((d) arrayList.get(i12)).d;
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
