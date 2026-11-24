package defpackage;

import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
public final class aq3 {
    public final RenderNode a = mk1.k();
    public final RenderNode[] b;
    public final RenderNode[] c;
    public final boolean d;
    public byte e;
    public byte f;
    public float g;
    public float h;
    public long i;
    public final cq3 j;

    public aq3(cq3 cq3Var, String str, int i, boolean z) {
        this.j = cq3Var;
        int i2 = i + 1;
        this.b = new RenderNode[i2];
        for (int i3 = 0; i3 < i2; i3++) {
            RenderNode[] renderNodeArr = this.b;
            mk1.p();
            renderNodeArr[i3] = mk1.d(str + "_down_" + i);
        }
        if (i <= 0 && !z) {
            this.c = this.b;
        } else {
            this.c = new RenderNode[i2];
            for (int i4 = 0; i4 < i2; i4++) {
                this.c[i4] = mk1.k();
            }
        }
        this.d = this.c == this.b;
        this.f = (byte) 1;
        this.e = (byte) 1;
    }

    public final void a(RenderNode renderNode) {
        boolean z;
        RenderNode[] renderNodeArr;
        boolean z2;
        int i;
        int width = renderNode.getWidth();
        int height = renderNode.getHeight();
        float f = width;
        cq3 cq3Var = this.j;
        int round = Math.round((cq3Var.d * f) / this.e);
        float f2 = height;
        byte b = cq3Var.d;
        int round2 = Math.round((b * f2) / this.f);
        float f3 = round;
        float f4 = f3 / f;
        float f5 = round2;
        float f6 = f5 / f2;
        float f7 = b;
        float f8 = (f * f7) / f3;
        float f9 = (f2 * f7) / f5;
        long r = hq6.r(hq6.r(hq6.r(hq6.r(hq6.r(0L, renderNode.getUniqueId()), round), round2), width), height);
        if (this.a.hasDisplayList() && this.b[0].hasDisplayList()) {
            z = false;
        } else {
            z = true;
        }
        int i2 = 0;
        while (true) {
            int length = this.b.length;
            z2 = this.d;
            if (i2 >= length) {
                break;
            }
            z |= !renderNodeArr[i2].hasDisplayList();
            if (!z2) {
                z |= !this.c[i2].hasDisplayList();
            }
            i2++;
        }
        if (this.i != r || z) {
            this.i = r;
            int i3 = 0;
            this.a.setPosition(0, 0, width, height);
            this.a.beginRecording(width, height).drawRenderNode(renderNode);
            this.a.endRecording();
            this.b[0].setPosition(0, 0, round, round2);
            RecordingCanvas beginRecording = this.b[0].beginRecording(round, round2);
            beginRecording.scale(f4, f6);
            beginRecording.drawRenderNode(this.a);
            this.b[0].endRecording();
            int i4 = 0;
            while (true) {
                RenderNode[] renderNodeArr2 = this.b;
                if (i4 < renderNodeArr2.length) {
                    renderNodeArr2[i4].setPosition(i3, i3, round, round2);
                    RecordingCanvas beginRecording2 = this.b[i4].beginRecording(round, round2);
                    if (i4 > 0) {
                        beginRecording2.drawRenderNode(this.b[i3]);
                    } else {
                        beginRecording2.scale(f4, f6);
                        beginRecording2.drawRenderNode(this.a);
                    }
                    this.b[i4].endRecording();
                    if (z2) {
                        this.b[i4].setScaleX(f8);
                        this.b[i4].setScaleY(f9);
                        this.b[i4].setPivotX(0.0f);
                        this.b[i4].setPivotY(0.0f);
                        i = 0;
                    } else {
                        i = 0;
                        this.c[i4].setPosition(0, 0, width, height);
                        RecordingCanvas beginRecording3 = this.c[i4].beginRecording(width, height);
                        beginRecording3.scale(f8, f9);
                        beginRecording3.drawRenderNode(this.b[i4]);
                        this.c[i4].endRecording();
                    }
                    i4++;
                    i3 = i;
                } else {
                    return;
                }
            }
        }
    }

    public final void b(float f, float f2) {
        float f3;
        RenderNode[] renderNodeArr;
        byte b = this.e;
        float f4 = 0.0f;
        if (b >= 2) {
            f3 = (this.g + f) % b;
        } else {
            f3 = 0.0f;
        }
        this.g = f3;
        byte b2 = this.f;
        if (b2 >= 2) {
            f4 = (this.h + f2) % b2;
        }
        this.h = f4;
        if (this.j.b) {
            this.a.setTranslationX(f3);
            this.a.setTranslationY(this.h);
            for (RenderNode renderNode : this.c) {
                renderNode.setTranslationX(-this.g);
                renderNode.setTranslationY(-this.h);
            }
        }
    }

    public final void c(float f) {
        this.b[0].setRenderEffect(RenderEffect.createBlurEffect(cq3.a(f, this.e), cq3.a(f, this.f), Shader.TileMode.CLAMP));
    }

    public final void d(float f, RenderEffect renderEffect) {
        this.b[0].setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(cq3.a(f, this.e), cq3.a(f, this.f), Shader.TileMode.CLAMP), renderEffect));
    }

    public final void e(RenderEffect renderEffect) {
        this.b[1].setRenderEffect(renderEffect);
    }
}
