package bh;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.x;
import java.util.ArrayList;
import java.util.List;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
public final class f {
    public final boolean f4387a;
    public final boolean f4388b;
    public final boolean f4389c;
    public final int d;
    public final RenderNode[] e;
    public long f4390f;
    public final RectF f4391g = new RectF();
    public final a h = new Object();
    public final ArrayList f4392i = new ArrayList();
    public int f4393j;
    public int f4394k;
    public Rect f4395l;

    public f(boolean z10) {
        int i10;
        boolean isEnabled = LiteMode.isEnabled(262144);
        this.f4387a = isEnabled;
        this.f4389c = true;
        if (!isEnabled && !z10) {
            i10 = 8;
        } else {
            i10 = 1;
        }
        this.d = i10;
        this.f4388b = z10;
        this.e = new RenderNode[isEnabled ? 2 : 1];
        int i11 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.e;
            if (i11 < renderNodeArr.length) {
                renderNodeArr[i11] = x.c();
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
            boolean z10 = this.f4387a;
            if (!z10 && this.f4389c) {
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
        throw new UnsupportedOperationException("Method not decompiled: bh.f.c(android.graphics.Canvas, int):void");
    }

    public final RenderNode d(int i10, int i11) {
        d dVar;
        e eVar = (e) this.f4392i.get(i11);
        if (this.f4387a && (dVar = eVar.f4386c) != null) {
            if (i10 == 0) {
                return dVar.f4379c[0];
            }
            return eVar.f4385b.f4379c[0];
        }
        RenderNode[] renderNodeArr = eVar.f4385b.f4379c;
        return renderNodeArr[Math.min(i10, renderNodeArr.length - 1)];
    }

    public final boolean e(ch.a aVar, int i10, int i11) {
        long j10;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f4393j;
            ArrayList arrayList = this.f4392i;
            if (i12 < i14) {
                e eVar = (e) arrayList.get(i12);
                Rect rect = eVar.d;
                RectF rectF = this.f4391g;
                rectF.set(rect);
                a aVar2 = this.h;
                aVar2.f4356b = 0L;
                aVar2.f4355a = false;
                aVar.e(aVar2, rectF);
                boolean z10 = aVar2.f4355a;
                if (z10) {
                    j10 = -1;
                } else {
                    j10 = aVar2.f4356b;
                }
                if (z10 || eVar.e != j10 || !eVar.f4384a.hasDisplayList()) {
                    eVar.e = j10;
                    if (this.f4395l == null) {
                        e eVar2 = (e) arrayList.get(i12);
                        Rect rect2 = eVar2.d;
                        this.f4395l = rect2;
                        this.f4394k = i12;
                        int width = rect2.width();
                        int i15 = this.d;
                        int i16 = width / i15;
                        int height = rect2.height() / i15;
                        eVar2.f4384a.setPosition(0, 0, i16, height);
                        RecordingCanvas beginRecording = eVar2.f4384a.beginRecording(i16, height);
                        float f7 = 1.0f / i15;
                        beginRecording.scale(f7, f7);
                        beginRecording.save();
                        beginRecording.translate(-rect.left, -rect.top);
                        aVar.f(beginRecording, rectF);
                        beginRecording.restore();
                        if (this.f4395l != null) {
                            e eVar3 = (e) arrayList.get(this.f4394k);
                            eVar3.f4384a.endRecording();
                            d dVar = eVar3.f4385b;
                            d dVar2 = eVar3.f4386c;
                            if (dVar2 != null) {
                                dVar2.a(eVar3.f4384a);
                                dVar.a(dVar2.f4379c[0]);
                            } else {
                                dVar.a(eVar3.f4384a);
                            }
                            this.f4395l = null;
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
                        for (int i18 = 0; i18 < this.f4393j; i18++) {
                            RenderNode d = d(i17, i18);
                            Rect rect3 = ((e) arrayList.get(i18)).d;
                            calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(calcHash, rect3.left), rect3.top), rect3.right), rect3.bottom), d.getUniqueId());
                        }
                        if (!renderNode.hasDisplayList()) {
                            z11 = true;
                        }
                        i17++;
                    }
                    if (calcHash != this.f4390f || z11) {
                        this.f4390f = calcHash;
                        int i19 = 0;
                        while (true) {
                            RenderNode[] renderNodeArr2 = this.e;
                            if (i19 >= renderNodeArr2.length) {
                                return true;
                            }
                            RenderNode renderNode2 = renderNodeArr2[i19];
                            renderNode2.setPosition(0, 0, i10, i11);
                            RecordingCanvas beginRecording2 = renderNode2.beginRecording(i10, i11);
                            for (int i20 = 0; i20 < this.f4393j; i20++) {
                                beginRecording2.save();
                                Rect rect4 = ((e) arrayList.get(i20)).d;
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
        for (int i10 = 0; i10 < this.f4393j; i10++) {
            e eVar = (e) this.f4392i.get(i10);
            eVar.f4385b.b(f7, f10);
            d dVar = eVar.f4386c;
            if (dVar != null) {
                dVar.b(f7, f10);
            }
        }
    }

    public final void g(int i10, List list) {
        ArrayList arrayList;
        this.f4393j = i10;
        while (true) {
            int i11 = this.f4393j;
            arrayList = this.f4392i;
            if (i11 <= arrayList.size()) {
                break;
            }
            arrayList.add(new e(this));
        }
        for (int i12 = 0; i12 < this.f4393j; i12++) {
            e.a((e) arrayList.get(i12), (RectF) list.get(i12));
        }
    }
}
