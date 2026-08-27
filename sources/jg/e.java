package jg;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.z;
import g.y;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;

public final class e {

    public final boolean f12972a;

    public final boolean f12973b;

    public final boolean f12974c;
    public final int d;

    public final RenderNode[] f12975e;

    public long f12976f;

    public final RectF f12977g = new RectF();
    public final y h = new y();

    public final ArrayList f12978i = new ArrayList();

    public int f12979j;

    public int f12980k;

    public Rect f12981l;

    public e(boolean z10) {
        boolean zIsEnabled = LiteMode.isEnabled(262144);
        this.f12972a = zIsEnabled;
        this.f12974c = true;
        this.d = (zIsEnabled || z10) ? 1 : 8;
        this.f12973b = z10;
        this.f12975e = new RenderNode[zIsEnabled ? 2 : 1];
        int i10 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.f12975e;
            if (i10 >= renderNodeArr.length) {
                return;
            }
            renderNodeArr[i10] = z.c();
            i10++;
        }
    }

    public static float a(float f10, float f11) {
        float f12 = (f10 > 0.0f ? (f10 * 0.57735f) + 0.5f : 0.0f) / f11;
        return Math.max(1.0f, f12 > 0.5f ? (f12 - 0.5f) / 0.57735f : 0.0f);
    }

    public final void b(Canvas canvas, int i10) {
        if (!canvas.isHardwareAccelerated()) {
            throw new IllegalStateException();
        }
        boolean z10 = this.f12972a;
        if (!z10 && this.f12974c) {
            canvas.drawRenderNode(this.f12975e[0]);
            return;
        }
        if (i10 == -2) {
            canvas.drawRenderNode(this.f12975e[!z10 ? 1 : 0]);
        } else if (i10 == -4) {
            canvas.drawRenderNode(this.f12975e[0]);
        } else if (i10 == -3) {
            canvas.drawRenderNode(this.f12975e[1]);
        }
    }

    public final void c(Canvas canvas, int i10) {
        int i11;
        boolean z10 = this.f12972a;
        if (z10 || !this.f12974c) {
            i11 = 1;
            if (i10 == -2) {
                i11 = 1 ^ (z10 ? 1 : 0);
            } else if (i10 == -4) {
                i11 = 0;
            } else if (i10 != -3) {
                return;
            }
        } else {
            i11 = 0;
        }
        for (int i12 = 0; i12 < this.f12979j; i12++) {
            d dVar = (d) this.f12978i.get(i12);
            Rect rect = dVar.d;
            if (!canvas.quickReject(rect.left, rect.top, rect.right, rect.bottom)) {
                canvas.save();
                Rect rect2 = dVar.d;
                canvas.translate(rect2.left, rect2.top);
                canvas.drawRenderNode(d(i11, i12));
                canvas.restore();
            }
        }
    }

    public final RenderNode d(int i10, int i11) {
        c cVar;
        d dVar = (d) this.f12978i.get(i11);
        if (this.f12972a && (cVar = dVar.f12970c) != null) {
            return i10 == 0 ? cVar.f12962c[0] : dVar.f12969b.f12962c[0];
        }
        RenderNode[] renderNodeArr = dVar.f12969b.f12962c;
        return renderNodeArr[Math.min(i10, renderNodeArr.length - 1)];
    }

    public final boolean e(kg.a aVar, int i10, int i11) {
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f12979j;
            ArrayList arrayList = this.f12978i;
            if (i12 >= i14) {
                if (i13 > 0) {
                    long jCalcHash = MediaDataController.calcHash(MediaDataController.calcHash(0L, i10), i11);
                    int i15 = 0;
                    boolean z10 = false;
                    while (true) {
                        RenderNode[] renderNodeArr = this.f12975e;
                        if (i15 >= renderNodeArr.length) {
                            break;
                        }
                        RenderNode renderNode = renderNodeArr[i15];
                        jCalcHash = MediaDataController.calcHash(jCalcHash, renderNode.getUniqueId());
                        for (int i16 = 0; i16 < this.f12979j; i16++) {
                            d dVar = (d) arrayList.get(i16);
                            RenderNode renderNodeD = d(i15, i16);
                            Rect rect = dVar.d;
                            jCalcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(jCalcHash, rect.left), rect.top), rect.right), rect.bottom), renderNodeD.getUniqueId());
                        }
                        if (!renderNode.hasDisplayList()) {
                            z10 = true;
                        }
                        i15++;
                    }
                    if (jCalcHash != this.f12976f || z10) {
                        this.f12976f = jCalcHash;
                        int i17 = 0;
                        while (true) {
                            RenderNode[] renderNodeArr2 = this.f12975e;
                            if (i17 >= renderNodeArr2.length) {
                                return true;
                            }
                            RenderNode renderNode2 = renderNodeArr2[i17];
                            renderNode2.setPosition(0, 0, i10, i11);
                            RecordingCanvas recordingCanvasBeginRecording = renderNode2.beginRecording(i10, i11);
                            for (int i18 = 0; i18 < this.f12979j; i18++) {
                                d dVar2 = (d) arrayList.get(i18);
                                recordingCanvasBeginRecording.save();
                                Rect rect2 = dVar2.d;
                                recordingCanvasBeginRecording.translate(rect2.left, rect2.top);
                                recordingCanvasBeginRecording.drawRenderNode(d(i17, i18));
                                recordingCanvasBeginRecording.restore();
                            }
                            renderNode2.endRecording();
                            i17++;
                        }
                    }
                }
                return false;
            }
            d dVar3 = (d) arrayList.get(i12);
            Rect rect3 = dVar3.d;
            RectF rectF = this.f12977g;
            rectF.set(rect3);
            y yVar = this.h;
            yVar.f6326a = 0L;
            yVar.f6327b = false;
            aVar.g(yVar, rectF);
            boolean z11 = yVar.f6327b;
            long j10 = z11 ? -1L : yVar.f6326a;
            if (z11 || dVar3.f12971e != j10 || !dVar3.f12968a.hasDisplayList()) {
                dVar3.f12971e = j10;
                if (this.f12981l != null) {
                    throw new IllegalStateException();
                }
                d dVar4 = (d) arrayList.get(i12);
                Rect rect4 = dVar4.d;
                this.f12981l = rect4;
                this.f12980k = i12;
                int iWidth = rect4.width();
                int i19 = this.d;
                int i20 = iWidth / i19;
                int iHeight = rect4.height() / i19;
                dVar4.f12968a.setPosition(0, 0, i20, iHeight);
                RecordingCanvas recordingCanvasBeginRecording2 = dVar4.f12968a.beginRecording(i20, iHeight);
                float f10 = 1.0f / i19;
                recordingCanvasBeginRecording2.scale(f10, f10);
                recordingCanvasBeginRecording2.save();
                recordingCanvasBeginRecording2.translate(-rect3.left, -rect3.top);
                aVar.e(recordingCanvasBeginRecording2, rectF);
                recordingCanvasBeginRecording2.restore();
                if (this.f12981l == null) {
                    throw new IllegalStateException();
                }
                d dVar5 = (d) arrayList.get(this.f12980k);
                dVar5.f12968a.endRecording();
                c cVar = dVar5.f12969b;
                c cVar2 = dVar5.f12970c;
                if (cVar2 != null) {
                    cVar2.a(dVar5.f12968a);
                    cVar.a(cVar2.f12962c[0]);
                } else {
                    cVar.a(dVar5.f12968a);
                }
                this.f12981l = null;
                i13++;
            }
            i12++;
        }
    }

    public final void f(float f10, float f11) {
        for (int i10 = 0; i10 < this.f12979j; i10++) {
            d dVar = (d) this.f12978i.get(i10);
            dVar.f12969b.b(f10, f11);
            c cVar = dVar.f12970c;
            if (cVar != null) {
                cVar.b(f10, f11);
            }
        }
    }

    public final void g(int i10, List list) {
        ArrayList arrayList;
        this.f12979j = i10;
        while (true) {
            int i11 = this.f12979j;
            arrayList = this.f12978i;
            if (i11 <= arrayList.size()) {
                break;
            } else {
                arrayList.add(new d(this));
            }
        }
        for (int i12 = 0; i12 < this.f12979j; i12++) {
            d dVar = (d) arrayList.get(i12);
            RectF rectF = (RectF) list.get(i12);
            Rect rect = dVar.d;
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
