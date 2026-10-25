package ch;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.x;
import java.util.ArrayList;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
public final class f {
    public final boolean f6324a;
    public final boolean f6325b;
    public final boolean f6326c;
    public final int d;
    public boolean e;
    public final RenderNode[] f6327f;
    public long f6328g;
    public final RectF h;
    public final a f6329i;
    public final ArrayList f6330j;
    public int f6331k;
    public int f6332l;
    public Rect f6333m;

    public f() {
        this(true, false);
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
            boolean z10 = this.f6324a;
            if (!z10 && this.f6326c) {
                canvas.drawRenderNode(this.f6327f[0]);
                return;
            } else if (i10 == -2) {
                canvas.drawRenderNode(this.f6327f[!z10 ? 1 : 0]);
                return;
            } else if (i10 == -4) {
                canvas.drawRenderNode(this.f6327f[0]);
                return;
            } else if (i10 == -3) {
                canvas.drawRenderNode(this.f6327f[1]);
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void c(Canvas canvas, int i10) {
        int i11;
        boolean z10 = this.f6324a;
        if (!z10 && this.f6326c) {
            i11 = 0;
        } else if (i10 == -2) {
            i11 = !z10 ? 1 : 0;
        } else if (i10 == -4) {
            i11 = 3;
        } else if (i10 == -3) {
            i11 = 1;
        } else {
            return;
        }
        for (int i12 = 0; i12 < this.f6331k; i12++) {
            e eVar = (e) this.f6330j.get(i12);
            Rect rect = eVar.d;
            if (!canvas.quickReject(rect.left, rect.top, rect.right, rect.bottom)) {
                canvas.save();
                Rect rect2 = eVar.d;
                canvas.translate(rect2.left, rect2.top);
                RenderNode d = d(i11, i12);
                if (!d.hasDisplayList()) {
                    this.e = true;
                }
                canvas.drawRenderNode(d);
                canvas.restore();
            }
        }
    }

    public final RenderNode d(int i10, int i11) {
        d dVar;
        e eVar = (e) this.f6330j.get(i11);
        if (this.f6324a && (dVar = eVar.f6323c) != null) {
            if (i10 == 3) {
                return dVar.f6316c[0];
            }
            if (i10 == 0) {
                RenderNode[] renderNodeArr = dVar.f6316c;
                return renderNodeArr[renderNodeArr.length - 1];
            }
            return eVar.f6322b.f6316c[0];
        }
        RenderNode[] renderNodeArr2 = eVar.f6322b.f6316c;
        return renderNodeArr2[Math.min(i10, renderNodeArr2.length - 1)];
    }

    public final void e(dh.a aVar, int i10, int i11) {
        long j10;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f6331k;
            ArrayList arrayList = this.f6330j;
            if (i12 < i14) {
                e eVar = (e) arrayList.get(i12);
                Rect rect = eVar.d;
                RectF rectF = this.h;
                rectF.set(rect);
                a aVar2 = this.f6329i;
                aVar2.f6297b = 0L;
                aVar2.f6296a = false;
                aVar.b(aVar2, rectF);
                boolean z10 = aVar2.f6296a;
                if (z10) {
                    j10 = -1;
                } else {
                    j10 = aVar2.f6297b;
                }
                if (z10 || eVar.e != j10 || !eVar.f6321a.hasDisplayList()) {
                    eVar.e = j10;
                    if (this.f6333m == null) {
                        e eVar2 = (e) arrayList.get(i12);
                        Rect rect2 = eVar2.d;
                        this.f6333m = rect2;
                        this.f6332l = i12;
                        int width = rect2.width();
                        int i15 = this.d;
                        int i16 = width / i15;
                        int height = rect2.height() / i15;
                        eVar2.f6321a.setPosition(0, 0, i16, height);
                        RecordingCanvas beginRecording = eVar2.f6321a.beginRecording(i16, height);
                        float f7 = 1.0f / i15;
                        beginRecording.scale(f7, f7);
                        beginRecording.save();
                        beginRecording.translate(-rect.left, -rect.top);
                        aVar.f(beginRecording, rectF);
                        beginRecording.restore();
                        if (this.f6333m != null) {
                            e eVar3 = (e) arrayList.get(this.f6332l);
                            eVar3.f6321a.endRecording();
                            d dVar = eVar3.f6322b;
                            d dVar2 = eVar3.f6323c;
                            if (dVar2 != null) {
                                dVar2.a(eVar3.f6321a);
                                dVar.a(dVar2.f6316c[0]);
                            } else {
                                dVar.a(eVar3.f6321a);
                            }
                            this.f6333m = null;
                            i13++;
                        } else {
                            throw new IllegalStateException();
                        }
                    } else {
                        throw new IllegalStateException();
                    }
                }
                i12++;
            } else if (i13 > 0) {
                long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(0L, i10), i11);
                int i17 = 0;
                boolean z11 = false;
                while (true) {
                    RenderNode[] renderNodeArr = this.f6327f;
                    if (i17 >= renderNodeArr.length) {
                        break;
                    }
                    RenderNode renderNode = renderNodeArr[i17];
                    calcHash = MediaDataController.calcHash(calcHash, renderNode.getUniqueId());
                    for (int i18 = 0; i18 < this.f6331k; i18++) {
                        RenderNode d = d(i17, i18);
                        Rect rect3 = ((e) arrayList.get(i18)).d;
                        calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(calcHash, rect3.left), rect3.top), rect3.right), rect3.bottom), d.getUniqueId());
                    }
                    if (!renderNode.hasDisplayList()) {
                        z11 = true;
                    }
                    i17++;
                }
                if (calcHash != this.f6328g || z11) {
                    this.f6328g = calcHash;
                    int i19 = 0;
                    while (true) {
                        RenderNode[] renderNodeArr2 = this.f6327f;
                        if (i19 < renderNodeArr2.length) {
                            RenderNode renderNode2 = renderNodeArr2[i19];
                            renderNode2.setPosition(0, 0, i10, i11);
                            RecordingCanvas beginRecording2 = renderNode2.beginRecording(i10, i11);
                            for (int i20 = 0; i20 < this.f6331k; i20++) {
                                beginRecording2.save();
                                Rect rect4 = ((e) arrayList.get(i20)).d;
                                beginRecording2.translate(rect4.left, rect4.top);
                                beginRecording2.drawRenderNode(d(i19, i20));
                                beginRecording2.restore();
                            }
                            renderNode2.endRecording();
                            i19++;
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

    public final void f(float f7, float f10) {
        for (int i10 = 0; i10 < this.f6331k; i10++) {
            e eVar = (e) this.f6330j.get(i10);
            eVar.f6322b.b(f7, f10);
            d dVar = eVar.f6323c;
            if (dVar != null) {
                dVar.b(f7, f10);
            }
        }
    }

    public final void g(int i10, ArrayList arrayList) {
        ArrayList arrayList2;
        this.f6331k = i10;
        while (true) {
            int i11 = this.f6331k;
            arrayList2 = this.f6330j;
            if (i11 <= arrayList2.size()) {
                break;
            }
            arrayList2.add(new e(this));
        }
        for (int i12 = 0; i12 < this.f6331k; i12++) {
            e.a((e) arrayList2.get(i12), (RectF) arrayList.get(i12));
        }
    }

    public final void h(qi.a aVar) {
        ArrayList arrayList;
        this.f6331k = aVar.f47065b;
        while (true) {
            int i10 = this.f6331k;
            arrayList = this.f6330j;
            if (i10 <= arrayList.size()) {
                break;
            }
            arrayList.add(new e(this));
        }
        for (int i11 = 0; i11 < this.f6331k; i11++) {
            e.a((e) arrayList.get(i11), aVar.c(i11));
        }
    }

    public f(boolean z10, boolean z11) {
        this.h = new RectF();
        this.f6329i = new Object();
        this.f6330j = new ArrayList();
        boolean isEnabled = LiteMode.isEnabled(262144);
        this.f6324a = isEnabled;
        this.f6326c = z10;
        int i10 = 1;
        this.d = (isEnabled || z11) ? 1 : 8;
        this.f6325b = z11;
        this.f6327f = new RenderNode[(isEnabled || !z10) ? 2 : 2];
        int i11 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.f6327f;
            if (i11 >= renderNodeArr.length) {
                return;
            }
            renderNodeArr[i11] = x.c();
            i11++;
        }
    }
}
