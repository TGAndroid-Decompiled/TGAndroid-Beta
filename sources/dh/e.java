package dh;

import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.support.v4.media.session.w;
import org.telegram.messenger.si;
public final class e {
    public final RenderNode f8112a = w.c();
    public final RenderNode[] f8113b;
    public final RenderNode[] f8114c;
    public final boolean d;
    public int f8115e;
    public int f8116f;
    public float f8117g;
    public float h;
    public long f8118i;
    public final g f8119j;

    public e(g gVar, String str, int i7, boolean z10) {
        this.f8119j = gVar;
        int i10 = i7 + 1;
        this.f8113b = new RenderNode[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            RenderNode[] renderNodeArr = this.f8113b;
            w.j();
            renderNodeArr[i11] = w.d(str + "_down_" + i7);
        }
        if (i7 <= 0 && !z10) {
            this.f8114c = this.f8113b;
        } else {
            this.f8114c = new RenderNode[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                this.f8114c[i12] = w.c();
            }
        }
        this.d = this.f8114c == this.f8113b;
        this.f8116f = 1;
        this.f8115e = 1;
    }

    public final void a(RenderNode renderNode) {
        boolean z10;
        RenderNode[] renderNodeArr;
        boolean z11;
        int i7;
        int width = renderNode.getWidth();
        int height = renderNode.getHeight();
        float f10 = width;
        g gVar = this.f8119j;
        int round = Math.round((gVar.d * f10) / this.f8115e);
        float f11 = height;
        int round2 = Math.round((gVar.d * f11) / this.f8116f);
        float f12 = round;
        float f13 = f12 / f10;
        float f14 = round2;
        float f15 = f14 / f11;
        int i10 = gVar.d;
        float f16 = (f10 * i10) / f12;
        float f17 = (f11 * i10) / f14;
        long p10 = si.p(si.p(si.p(si.p(si.p(0L, renderNode.getUniqueId()), round), round2), width), height);
        if (this.f8112a.hasDisplayList() && this.f8113b[0].hasDisplayList()) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i11 = 0;
        while (true) {
            int length = this.f8113b.length;
            z11 = this.d;
            if (i11 >= length) {
                break;
            }
            z10 |= !renderNodeArr[i11].hasDisplayList();
            if (!z11) {
                z10 |= !this.f8114c[i11].hasDisplayList();
            }
            i11++;
        }
        if (this.f8118i != p10 || z10) {
            this.f8118i = p10;
            int i12 = 0;
            this.f8112a.setPosition(0, 0, width, height);
            this.f8112a.beginRecording(width, height).drawRenderNode(renderNode);
            this.f8112a.endRecording();
            this.f8113b[0].setPosition(0, 0, round, round2);
            RecordingCanvas beginRecording = this.f8113b[0].beginRecording(round, round2);
            beginRecording.scale(f13, f15);
            beginRecording.drawRenderNode(this.f8112a);
            this.f8113b[0].endRecording();
            int i13 = 0;
            while (true) {
                RenderNode[] renderNodeArr2 = this.f8113b;
                if (i13 < renderNodeArr2.length) {
                    renderNodeArr2[i13].setPosition(i12, i12, round, round2);
                    RecordingCanvas beginRecording2 = this.f8113b[i13].beginRecording(round, round2);
                    if (i13 > 0) {
                        beginRecording2.drawRenderNode(this.f8113b[i12]);
                    } else {
                        beginRecording2.scale(f13, f15);
                        beginRecording2.drawRenderNode(this.f8112a);
                    }
                    this.f8113b[i13].endRecording();
                    if (z11) {
                        this.f8113b[i13].setScaleX(f16);
                        this.f8113b[i13].setScaleY(f17);
                        this.f8113b[i13].setPivotX(0.0f);
                        this.f8113b[i13].setPivotY(0.0f);
                        i7 = 0;
                    } else {
                        i7 = 0;
                        this.f8114c[i13].setPosition(0, 0, width, height);
                        RecordingCanvas beginRecording3 = this.f8114c[i13].beginRecording(width, height);
                        beginRecording3.scale(f16, f17);
                        beginRecording3.drawRenderNode(this.f8113b[i13]);
                        this.f8114c[i13].endRecording();
                    }
                    i13++;
                    i12 = i7;
                } else {
                    return;
                }
            }
        }
    }

    public final void b(float f10, float f11) {
        float f12;
        RenderNode[] renderNodeArr;
        int i7 = this.f8115e;
        float f13 = 0.0f;
        if (i7 >= 2) {
            f12 = (this.f8117g + f10) % i7;
        } else {
            f12 = 0.0f;
        }
        this.f8117g = f12;
        int i10 = this.f8116f;
        if (i10 >= 2) {
            f13 = (this.h + f11) % i10;
        }
        this.h = f13;
        if (this.f8119j.f8125b) {
            this.f8112a.setTranslationX(f12);
            this.f8112a.setTranslationY(this.h);
            for (RenderNode renderNode : this.f8114c) {
                renderNode.setTranslationX(-this.f8117g);
                renderNode.setTranslationY(-this.h);
            }
        }
    }

    public final void c(float f10) {
        this.f8113b[0].setRenderEffect(RenderEffect.createBlurEffect(g.a(f10, this.f8115e), g.a(f10, this.f8116f), Shader.TileMode.CLAMP));
    }

    public final void d(float f10, RenderEffect renderEffect) {
        this.f8113b[0].setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(g.a(f10, this.f8115e), g.a(f10, this.f8116f), Shader.TileMode.CLAMP), renderEffect));
    }

    public final void e(RenderEffect renderEffect) {
        this.f8113b[1].setRenderEffect(renderEffect);
    }
}
