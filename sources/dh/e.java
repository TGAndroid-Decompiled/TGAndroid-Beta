package dh;

import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.support.v4.media.session.w;
import org.telegram.messenger.ri;
public final class e {
    public final RenderNode f8385a = w.c();
    public final RenderNode[] f8386b;
    public final RenderNode[] f8387c;
    public final boolean d;
    public int f8388e;
    public int f8389f;
    public float f8390g;
    public float h;
    public long f8391i;
    public final g f8392j;

    public e(g gVar, String str, int i7, boolean z10) {
        this.f8392j = gVar;
        int i10 = i7 + 1;
        this.f8386b = new RenderNode[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            RenderNode[] renderNodeArr = this.f8386b;
            w.j();
            renderNodeArr[i11] = w.d(str + "_down_" + i7);
        }
        if (i7 <= 0 && !z10) {
            this.f8387c = this.f8386b;
        } else {
            this.f8387c = new RenderNode[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                this.f8387c[i12] = w.c();
            }
        }
        this.d = this.f8387c == this.f8386b;
        this.f8389f = 1;
        this.f8388e = 1;
    }

    public final void a(RenderNode renderNode) {
        boolean z10;
        RenderNode[] renderNodeArr;
        boolean z11;
        int i7;
        int width = renderNode.getWidth();
        int height = renderNode.getHeight();
        float f10 = width;
        g gVar = this.f8392j;
        int round = Math.round((gVar.d * f10) / this.f8388e);
        float f11 = height;
        int round2 = Math.round((gVar.d * f11) / this.f8389f);
        float f12 = round;
        float f13 = f12 / f10;
        float f14 = round2;
        float f15 = f14 / f11;
        int i10 = gVar.d;
        float f16 = (f10 * i10) / f12;
        float f17 = (f11 * i10) / f14;
        long r10 = ri.r(ri.r(ri.r(ri.r(ri.r(0L, renderNode.getUniqueId()), round), round2), width), height);
        if (this.f8385a.hasDisplayList() && this.f8386b[0].hasDisplayList()) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i11 = 0;
        while (true) {
            int length = this.f8386b.length;
            z11 = this.d;
            if (i11 >= length) {
                break;
            }
            z10 |= !renderNodeArr[i11].hasDisplayList();
            if (!z11) {
                z10 |= !this.f8387c[i11].hasDisplayList();
            }
            i11++;
        }
        if (this.f8391i != r10 || z10) {
            this.f8391i = r10;
            int i12 = 0;
            this.f8385a.setPosition(0, 0, width, height);
            this.f8385a.beginRecording(width, height).drawRenderNode(renderNode);
            this.f8385a.endRecording();
            this.f8386b[0].setPosition(0, 0, round, round2);
            RecordingCanvas beginRecording = this.f8386b[0].beginRecording(round, round2);
            beginRecording.scale(f13, f15);
            beginRecording.drawRenderNode(this.f8385a);
            this.f8386b[0].endRecording();
            int i13 = 0;
            while (true) {
                RenderNode[] renderNodeArr2 = this.f8386b;
                if (i13 < renderNodeArr2.length) {
                    renderNodeArr2[i13].setPosition(i12, i12, round, round2);
                    RecordingCanvas beginRecording2 = this.f8386b[i13].beginRecording(round, round2);
                    if (i13 > 0) {
                        beginRecording2.drawRenderNode(this.f8386b[i12]);
                    } else {
                        beginRecording2.scale(f13, f15);
                        beginRecording2.drawRenderNode(this.f8385a);
                    }
                    this.f8386b[i13].endRecording();
                    if (z11) {
                        this.f8386b[i13].setScaleX(f16);
                        this.f8386b[i13].setScaleY(f17);
                        this.f8386b[i13].setPivotX(0.0f);
                        this.f8386b[i13].setPivotY(0.0f);
                        i7 = 0;
                    } else {
                        i7 = 0;
                        this.f8387c[i13].setPosition(0, 0, width, height);
                        RecordingCanvas beginRecording3 = this.f8387c[i13].beginRecording(width, height);
                        beginRecording3.scale(f16, f17);
                        beginRecording3.drawRenderNode(this.f8386b[i13]);
                        this.f8387c[i13].endRecording();
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
        int i7 = this.f8388e;
        float f13 = 0.0f;
        if (i7 >= 2) {
            f12 = (this.f8390g + f10) % i7;
        } else {
            f12 = 0.0f;
        }
        this.f8390g = f12;
        int i10 = this.f8389f;
        if (i10 >= 2) {
            f13 = (this.h + f11) % i10;
        }
        this.h = f13;
        if (this.f8392j.f8398b) {
            this.f8385a.setTranslationX(f12);
            this.f8385a.setTranslationY(this.h);
            for (RenderNode renderNode : this.f8387c) {
                renderNode.setTranslationX(-this.f8390g);
                renderNode.setTranslationY(-this.h);
            }
        }
    }

    public final void c(float f10) {
        this.f8386b[0].setRenderEffect(RenderEffect.createBlurEffect(g.a(f10, this.f8388e), g.a(f10, this.f8389f), Shader.TileMode.CLAMP));
    }

    public final void d(float f10, RenderEffect renderEffect) {
        this.f8386b[0].setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(g.a(f10, this.f8388e), g.a(f10, this.f8389f), Shader.TileMode.CLAMP), renderEffect));
    }

    public final void e(RenderEffect renderEffect) {
        this.f8386b[1].setRenderEffect(renderEffect);
    }
}
