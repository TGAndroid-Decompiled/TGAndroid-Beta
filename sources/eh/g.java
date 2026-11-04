package eh;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderNode;
import android.support.v4.media.session.w;
import java.util.ArrayList;
import org.telegram.messenger.lc;
import org.telegram.messenger.li;
public final class g {
    public final boolean f10012a;
    public final boolean f10013b;
    public final boolean f10014c;
    public final int d;
    public boolean f10015e;
    public final RenderNode[] f10016f;
    public long f10017g;
    public final RectF h = new RectF();
    public final a f10018i = new Object();
    public final ArrayList f10019j = new ArrayList();
    public int f10020k;
    public int f10021l;
    public Rect f10022m;

    public g(boolean z10) {
        int i3;
        boolean e10 = lc.e(262144);
        this.f10012a = e10;
        this.f10014c = true;
        if (!e10 && !z10) {
            i3 = 8;
        } else {
            i3 = 1;
        }
        this.d = i3;
        this.f10013b = z10;
        this.f10016f = new RenderNode[e10 ? 2 : 1];
        int i10 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.f10016f;
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

    public final void b(Canvas canvas, int i3) {
        if (canvas.isHardwareAccelerated()) {
            boolean z10 = this.f10012a;
            if (!z10 && this.f10014c) {
                canvas.drawRenderNode(this.f10016f[0]);
                return;
            } else if (i3 == -2) {
                canvas.drawRenderNode(this.f10016f[!z10 ? 1 : 0]);
                return;
            } else if (i3 == -4) {
                canvas.drawRenderNode(this.f10016f[0]);
                return;
            } else if (i3 == -3) {
                canvas.drawRenderNode(this.f10016f[1]);
                return;
            } else {
                return;
            }
        }
        throw new IllegalStateException();
    }

    public final void c(Canvas canvas, int i3) {
        int i10;
        boolean z10 = this.f10012a;
        if (!z10 && this.f10014c) {
            i10 = 0;
        } else if (i3 == -2) {
            i10 = !z10 ? 1 : 0;
        } else if (i3 == -4) {
            i10 = 3;
        } else if (i3 == -3) {
            i10 = 1;
        } else {
            return;
        }
        for (int i11 = 0; i11 < this.f10020k; i11++) {
            f fVar = (f) this.f10019j.get(i11);
            Rect rect = fVar.d;
            if (!canvas.quickReject(rect.left, rect.top, rect.right, rect.bottom)) {
                canvas.save();
                Rect rect2 = fVar.d;
                canvas.translate(rect2.left, rect2.top);
                RenderNode d = d(i10, i11);
                if (!d.hasDisplayList()) {
                    this.f10015e = true;
                }
                canvas.drawRenderNode(d);
                canvas.restore();
            }
        }
    }

    public final RenderNode d(int i3, int i10) {
        e eVar;
        f fVar = (f) this.f10019j.get(i10);
        if (this.f10012a && (eVar = fVar.f10010c) != null) {
            if (i3 == 3) {
                return eVar.f10002c[0];
            }
            if (i3 == 0) {
                RenderNode[] renderNodeArr = eVar.f10002c;
                return renderNodeArr[renderNodeArr.length - 1];
            }
            return fVar.f10009b.f10002c[0];
        }
        RenderNode[] renderNodeArr2 = fVar.f10009b.f10002c;
        return renderNodeArr2[Math.min(i3, renderNodeArr2.length - 1)];
    }

    public final void e(fh.a aVar, int i3, int i10) {
        long j10;
        int i11 = 0;
        int i12 = 0;
        while (true) {
            int i13 = this.f10020k;
            ArrayList arrayList = this.f10019j;
            if (i11 < i13) {
                f fVar = (f) arrayList.get(i11);
                Rect rect = fVar.d;
                RectF rectF = this.h;
                rectF.set(rect);
                a aVar2 = this.f10018i;
                aVar2.f9979b = 0L;
                aVar2.f9978a = false;
                aVar.b(aVar2, rectF);
                boolean z10 = aVar2.f9978a;
                if (z10) {
                    j10 = -1;
                } else {
                    j10 = aVar2.f9979b;
                }
                if (z10 || fVar.f10011e != j10 || !fVar.f10008a.hasDisplayList()) {
                    fVar.f10011e = j10;
                    if (this.f10022m == null) {
                        f fVar2 = (f) arrayList.get(i11);
                        Rect rect2 = fVar2.d;
                        this.f10022m = rect2;
                        this.f10021l = i11;
                        int width = rect2.width();
                        int i14 = this.d;
                        int i15 = width / i14;
                        int height = rect2.height() / i14;
                        fVar2.f10008a.setPosition(0, 0, i15, height);
                        RecordingCanvas beginRecording = fVar2.f10008a.beginRecording(i15, height);
                        float f10 = 1.0f / i14;
                        beginRecording.scale(f10, f10);
                        beginRecording.save();
                        beginRecording.translate(-rect.left, -rect.top);
                        aVar.d(beginRecording, rectF);
                        beginRecording.restore();
                        if (this.f10022m != null) {
                            f fVar3 = (f) arrayList.get(this.f10021l);
                            fVar3.f10008a.endRecording();
                            e eVar = fVar3.f10009b;
                            e eVar2 = fVar3.f10010c;
                            if (eVar2 != null) {
                                eVar2.a(fVar3.f10008a);
                                eVar.a(eVar2.f10002c[0]);
                            } else {
                                eVar.a(fVar3.f10008a);
                            }
                            this.f10022m = null;
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
                long p10 = li.p(li.p(0L, i3), i10);
                int i16 = 0;
                boolean z11 = false;
                while (true) {
                    RenderNode[] renderNodeArr = this.f10016f;
                    if (i16 >= renderNodeArr.length) {
                        break;
                    }
                    RenderNode renderNode = renderNodeArr[i16];
                    p10 = li.p(p10, renderNode.getUniqueId());
                    for (int i17 = 0; i17 < this.f10020k; i17++) {
                        RenderNode d = d(i16, i17);
                        Rect rect3 = ((f) arrayList.get(i17)).d;
                        p10 = li.p(li.p(li.p(li.p(li.p(p10, rect3.left), rect3.top), rect3.right), rect3.bottom), d.getUniqueId());
                    }
                    if (!renderNode.hasDisplayList()) {
                        z11 = true;
                    }
                    i16++;
                }
                if (p10 != this.f10017g || z11) {
                    this.f10017g = p10;
                    int i18 = 0;
                    while (true) {
                        RenderNode[] renderNodeArr2 = this.f10016f;
                        if (i18 < renderNodeArr2.length) {
                            RenderNode renderNode2 = renderNodeArr2[i18];
                            renderNode2.setPosition(0, 0, i3, i10);
                            RecordingCanvas beginRecording2 = renderNode2.beginRecording(i3, i10);
                            for (int i19 = 0; i19 < this.f10020k; i19++) {
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
        for (int i3 = 0; i3 < this.f10020k; i3++) {
            f fVar = (f) this.f10019j.get(i3);
            fVar.f10009b.b(f10, f11);
            e eVar = fVar.f10010c;
            if (eVar != null) {
                eVar.b(f10, f11);
            }
        }
    }

    public final void g(int i3, ArrayList arrayList) {
        ArrayList arrayList2;
        this.f10020k = i3;
        while (true) {
            int i10 = this.f10020k;
            arrayList2 = this.f10019j;
            if (i10 <= arrayList2.size()) {
                break;
            }
            arrayList2.add(new f(this));
        }
        for (int i11 = 0; i11 < this.f10020k; i11++) {
            f.a((f) arrayList2.get(i11), (RectF) arrayList.get(i11));
        }
    }

    public final void h(ri.a aVar) {
        ArrayList arrayList;
        this.f10020k = aVar.f54544b;
        while (true) {
            int i3 = this.f10020k;
            arrayList = this.f10019j;
            if (i3 <= arrayList.size()) {
                break;
            }
            arrayList.add(new f(this));
        }
        for (int i10 = 0; i10 < this.f10020k; i10++) {
            f.a((f) arrayList.get(i10), aVar.c(i10));
        }
    }
}
