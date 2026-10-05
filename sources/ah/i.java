package ah;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import java.util.ArrayList;
import org.telegram.messenger.LiteMode;
import org.telegram.messenger.MediaDataController;
public final class i {
    public final boolean f491a;
    public final boolean f492b;
    public final boolean f493c;
    public final int d;
    public boolean f494e;
    public final RenderNode[] f495f;
    public long f496g;
    public final RectF h;
    public final a f497i;
    public final ArrayList f498j;
    public int f499k;
    public int f500l;
    public Rect f501m;

    public i() {
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
            boolean z10 = this.f491a;
            if (!z10 && this.f493c) {
                canvas.drawRenderNode(this.f495f[0]);
                return;
            } else if (i10 == -2) {
                canvas.drawRenderNode(this.f495f[!z10 ? 1 : 0]);
                return;
            } else if (i10 == -4) {
                canvas.drawRenderNode(this.f495f[0]);
                return;
            } else if (i10 == -3) {
                canvas.drawRenderNode(this.f495f[1]);
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void c(Canvas canvas, int i10) {
        int i11;
        boolean z10 = this.f491a;
        if (!z10 && this.f493c) {
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
        for (int i12 = 0; i12 < this.f499k; i12++) {
            h hVar = (h) this.f498j.get(i12);
            Rect rect = hVar.d;
            if (!canvas.quickReject(rect.left, rect.top, rect.right, rect.bottom)) {
                canvas.save();
                Rect rect2 = hVar.d;
                canvas.translate(rect2.left, rect2.top);
                RenderNode d = d(i11, i12);
                if (!d.hasDisplayList()) {
                    this.f494e = true;
                }
                canvas.drawRenderNode(d);
                canvas.restore();
            }
        }
    }

    public final RenderNode d(int i10, int i11) {
        g gVar;
        h hVar = (h) this.f498j.get(i11);
        if (this.f491a && (gVar = hVar.f489c) != null) {
            if (i10 == 3) {
                return gVar.f481c[0];
            }
            if (i10 == 0) {
                RenderNode[] renderNodeArr = gVar.f481c;
                return renderNodeArr[renderNodeArr.length - 1];
            }
            return hVar.f488b.f481c[0];
        }
        RenderNode[] renderNodeArr2 = hVar.f488b.f481c;
        return renderNodeArr2[Math.min(i10, renderNodeArr2.length - 1)];
    }

    public final void e(bh.a aVar, int i10, int i11) {
        long j3;
        int i12 = 0;
        int i13 = 0;
        while (true) {
            int i14 = this.f499k;
            ArrayList arrayList = this.f498j;
            if (i12 < i14) {
                h hVar = (h) arrayList.get(i12);
                Rect rect = hVar.d;
                RectF rectF = this.h;
                rectF.set(rect);
                a aVar2 = this.f497i;
                aVar2.f451b = 0L;
                aVar2.f450a = false;
                aVar.b(aVar2, rectF);
                boolean z10 = aVar2.f450a;
                if (z10) {
                    j3 = -1;
                } else {
                    j3 = aVar2.f451b;
                }
                if (z10 || hVar.f490e != j3 || !hVar.f487a.hasDisplayList()) {
                    hVar.f490e = j3;
                    if (this.f501m == null) {
                        h hVar2 = (h) arrayList.get(i12);
                        Rect rect2 = hVar2.d;
                        this.f501m = rect2;
                        this.f500l = i12;
                        int width = rect2.width();
                        int i15 = this.d;
                        int i16 = width / i15;
                        int height = rect2.height() / i15;
                        hVar2.f487a.setPosition(0, 0, i16, height);
                        RecordingCanvas beginRecording = hVar2.f487a.beginRecording(i16, height);
                        float f7 = 1.0f / i15;
                        beginRecording.scale(f7, f7);
                        beginRecording.save();
                        beginRecording.translate(-rect.left, -rect.top);
                        aVar.f(beginRecording, rectF);
                        beginRecording.restore();
                        if (this.f501m != null) {
                            h hVar3 = (h) arrayList.get(this.f500l);
                            hVar3.f487a.endRecording();
                            g gVar = hVar3.f488b;
                            g gVar2 = hVar3.f489c;
                            if (gVar2 != null) {
                                gVar2.a(hVar3.f487a);
                                gVar.a(gVar2.f481c[0]);
                            } else {
                                gVar.a(hVar3.f487a);
                            }
                            this.f501m = null;
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
                    RenderNode[] renderNodeArr = this.f495f;
                    if (i17 >= renderNodeArr.length) {
                        break;
                    }
                    RenderNode renderNode = renderNodeArr[i17];
                    calcHash = MediaDataController.calcHash(calcHash, renderNode.getUniqueId());
                    for (int i18 = 0; i18 < this.f499k; i18++) {
                        RenderNode d = d(i17, i18);
                        Rect rect3 = ((h) arrayList.get(i18)).d;
                        calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(calcHash, rect3.left), rect3.top), rect3.right), rect3.bottom), d.getUniqueId());
                    }
                    if (!renderNode.hasDisplayList()) {
                        z11 = true;
                    }
                    i17++;
                }
                if (calcHash != this.f496g || z11) {
                    this.f496g = calcHash;
                    int i19 = 0;
                    while (true) {
                        RenderNode[] renderNodeArr2 = this.f495f;
                        if (i19 < renderNodeArr2.length) {
                            RenderNode renderNode2 = renderNodeArr2[i19];
                            renderNode2.setPosition(0, 0, i10, i11);
                            RecordingCanvas beginRecording2 = renderNode2.beginRecording(i10, i11);
                            for (int i20 = 0; i20 < this.f499k; i20++) {
                                beginRecording2.save();
                                Rect rect4 = ((h) arrayList.get(i20)).d;
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
        for (int i10 = 0; i10 < this.f499k; i10++) {
            h hVar = (h) this.f498j.get(i10);
            hVar.f488b.b(f7, f10);
            g gVar = hVar.f489c;
            if (gVar != null) {
                gVar.b(f7, f10);
            }
        }
    }

    public final void g(int i10, ArrayList arrayList) {
        ArrayList arrayList2;
        this.f499k = i10;
        while (true) {
            int i11 = this.f499k;
            arrayList2 = this.f498j;
            if (i11 <= arrayList2.size()) {
                break;
            }
            arrayList2.add(new h(this));
        }
        for (int i12 = 0; i12 < this.f499k; i12++) {
            h.a((h) arrayList2.get(i12), (RectF) arrayList.get(i12));
        }
    }

    public final void h(ni.a aVar) {
        ArrayList arrayList;
        this.f499k = aVar.f16919b;
        while (true) {
            int i10 = this.f499k;
            arrayList = this.f498j;
            if (i10 <= arrayList.size()) {
                break;
            }
            arrayList.add(new h(this));
        }
        for (int i11 = 0; i11 < this.f499k; i11++) {
            h.a((h) arrayList.get(i11), aVar.c(i11));
        }
    }

    public i(boolean z10, boolean z11) {
        this.h = new RectF();
        this.f497i = new Object();
        this.f498j = new ArrayList();
        boolean isEnabled = LiteMode.isEnabled(262144);
        this.f491a = isEnabled;
        this.f493c = z10;
        int i10 = 1;
        this.d = (isEnabled || z11) ? 1 : 8;
        this.f492b = z11;
        this.f495f = new RenderNode[(isEnabled || !z10) ? 2 : 2];
        int i11 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.f495f;
            if (i11 >= renderNodeArr.length) {
                return;
            }
            renderNodeArr[i11] = f.c();
            i11++;
        }
    }
}
