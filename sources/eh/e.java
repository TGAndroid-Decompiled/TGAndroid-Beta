package eh;

import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.support.v4.media.session.w;
import org.telegram.messenger.li;
public final class e {
    public final RenderNode f10000a = w.c();
    public final RenderNode[] f10001b;
    public final RenderNode[] f10002c;
    public final boolean d;
    public int f10003e;
    public int f10004f;
    public float f10005g;
    public float h;
    public long f10006i;
    public final g f10007j;

    public e(g gVar, String str, int i3, boolean z10) {
        this.f10007j = gVar;
        int i10 = i3 + 1;
        this.f10001b = new RenderNode[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            RenderNode[] renderNodeArr = this.f10001b;
            w.j();
            renderNodeArr[i11] = w.d(str + "_down_" + i3);
        }
        if (i3 <= 0 && !z10) {
            this.f10002c = this.f10001b;
        } else {
            this.f10002c = new RenderNode[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                this.f10002c[i12] = w.c();
            }
        }
        this.d = this.f10002c == this.f10001b;
        this.f10004f = 1;
        this.f10003e = 1;
    }

    public final void a(RenderNode renderNode) {
        boolean z10;
        RenderNode[] renderNodeArr;
        boolean z11;
        int i3;
        int width = renderNode.getWidth();
        int height = renderNode.getHeight();
        float f10 = width;
        g gVar = this.f10007j;
        int round = Math.round((gVar.d * f10) / this.f10003e);
        float f11 = height;
        int round2 = Math.round((gVar.d * f11) / this.f10004f);
        float f12 = round;
        float f13 = f12 / f10;
        float f14 = round2;
        float f15 = f14 / f11;
        int i10 = gVar.d;
        float f16 = (f10 * i10) / f12;
        float f17 = (f11 * i10) / f14;
        long p10 = li.p(li.p(li.p(li.p(li.p(0L, renderNode.getUniqueId()), round), round2), width), height);
        if (this.f10000a.hasDisplayList() && this.f10001b[0].hasDisplayList()) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i11 = 0;
        while (true) {
            int length = this.f10001b.length;
            z11 = this.d;
            if (i11 >= length) {
                break;
            }
            z10 |= !renderNodeArr[i11].hasDisplayList();
            if (!z11) {
                z10 |= !this.f10002c[i11].hasDisplayList();
            }
            i11++;
        }
        if (this.f10006i != p10 || z10) {
            this.f10006i = p10;
            int i12 = 0;
            this.f10000a.setPosition(0, 0, width, height);
            this.f10000a.beginRecording(width, height).drawRenderNode(renderNode);
            this.f10000a.endRecording();
            this.f10001b[0].setPosition(0, 0, round, round2);
            RecordingCanvas beginRecording = this.f10001b[0].beginRecording(round, round2);
            beginRecording.scale(f13, f15);
            beginRecording.drawRenderNode(this.f10000a);
            this.f10001b[0].endRecording();
            int i13 = 0;
            while (true) {
                RenderNode[] renderNodeArr2 = this.f10001b;
                if (i13 < renderNodeArr2.length) {
                    renderNodeArr2[i13].setPosition(i12, i12, round, round2);
                    RecordingCanvas beginRecording2 = this.f10001b[i13].beginRecording(round, round2);
                    if (i13 > 0) {
                        beginRecording2.drawRenderNode(this.f10001b[i12]);
                    } else {
                        beginRecording2.scale(f13, f15);
                        beginRecording2.drawRenderNode(this.f10000a);
                    }
                    this.f10001b[i13].endRecording();
                    if (z11) {
                        this.f10001b[i13].setScaleX(f16);
                        this.f10001b[i13].setScaleY(f17);
                        this.f10001b[i13].setPivotX(0.0f);
                        this.f10001b[i13].setPivotY(0.0f);
                        i3 = 0;
                    } else {
                        i3 = 0;
                        this.f10002c[i13].setPosition(0, 0, width, height);
                        RecordingCanvas beginRecording3 = this.f10002c[i13].beginRecording(width, height);
                        beginRecording3.scale(f16, f17);
                        beginRecording3.drawRenderNode(this.f10001b[i13]);
                        this.f10002c[i13].endRecording();
                    }
                    i13++;
                    i12 = i3;
                } else {
                    return;
                }
            }
        }
    }

    public final void b(float f10, float f11) {
        float f12;
        RenderNode[] renderNodeArr;
        int i3 = this.f10003e;
        float f13 = 0.0f;
        if (i3 >= 2) {
            f12 = (this.f10005g + f10) % i3;
        } else {
            f12 = 0.0f;
        }
        this.f10005g = f12;
        int i10 = this.f10004f;
        if (i10 >= 2) {
            f13 = (this.h + f11) % i10;
        }
        this.h = f13;
        if (this.f10007j.f10013b) {
            this.f10000a.setTranslationX(f12);
            this.f10000a.setTranslationY(this.h);
            for (RenderNode renderNode : this.f10002c) {
                renderNode.setTranslationX(-this.f10005g);
                renderNode.setTranslationY(-this.h);
            }
        }
    }

    public final void c(float f10) {
        this.f10001b[0].setRenderEffect(RenderEffect.createBlurEffect(g.a(f10, this.f10003e), g.a(f10, this.f10004f), Shader.TileMode.CLAMP));
    }

    public final void d(float f10, RenderEffect renderEffect) {
        this.f10001b[0].setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(g.a(f10, this.f10003e), g.a(f10, this.f10004f), Shader.TileMode.CLAMP), renderEffect));
    }

    public final void e(RenderEffect renderEffect) {
        this.f10001b[1].setRenderEffect(renderEffect);
    }
}
