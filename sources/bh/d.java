package bh;

import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.support.v4.media.session.y;
import org.telegram.messenger.MediaDataController;
public final class d {
    public final RenderNode f2697a = y.c();
    public final RenderNode[] f2698b;
    public final RenderNode[] f2699c;
    public final boolean d;
    public int f2700e;
    public int f2701f;
    public float f2702g;
    public float h;
    public long f2703i;
    public final f f2704j;

    public d(f fVar, String str, int i10, boolean z10) {
        this.f2704j = fVar;
        int i11 = i10 + 1;
        this.f2698b = new RenderNode[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            RenderNode[] renderNodeArr = this.f2698b;
            y.j();
            renderNodeArr[i12] = y.d(str + "_down_" + i10);
        }
        if (i10 <= 0 && !z10) {
            this.f2699c = this.f2698b;
        } else {
            this.f2699c = new RenderNode[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                this.f2699c[i13] = y.c();
            }
        }
        this.d = this.f2699c == this.f2698b;
        this.f2701f = 1;
        this.f2700e = 1;
    }

    public final void a(RenderNode renderNode) {
        boolean z10;
        RenderNode[] renderNodeArr;
        boolean z11;
        int width = renderNode.getWidth();
        int height = renderNode.getHeight();
        float f7 = width;
        f fVar = this.f2704j;
        int round = Math.round((fVar.d * f7) / this.f2700e);
        float f10 = height;
        int round2 = Math.round((fVar.d * f10) / this.f2701f);
        float f11 = round;
        float f12 = f11 / f7;
        float f13 = round2;
        float f14 = f13 / f10;
        int i10 = fVar.d;
        float f15 = (f7 * i10) / f11;
        float f16 = (f10 * i10) / f13;
        long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(0L, renderNode.getUniqueId()), round), round2), width), height);
        if (this.f2697a.hasDisplayList() && this.f2698b[0].hasDisplayList()) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i11 = 0;
        while (true) {
            int length = this.f2698b.length;
            z11 = this.d;
            if (i11 >= length) {
                break;
            }
            z10 |= !renderNodeArr[i11].hasDisplayList();
            if (!z11) {
                z10 |= !this.f2699c[i11].hasDisplayList();
            }
            i11++;
        }
        if (this.f2703i != calcHash || z10) {
            this.f2703i = calcHash;
            int i12 = 0;
            this.f2697a.setPosition(0, 0, width, height);
            this.f2697a.beginRecording(width, height).drawRenderNode(renderNode);
            this.f2697a.endRecording();
            this.f2698b[0].setPosition(0, 0, round, round2);
            RecordingCanvas beginRecording = this.f2698b[0].beginRecording(round, round2);
            beginRecording.scale(f12, f14);
            beginRecording.drawRenderNode(this.f2697a);
            this.f2698b[0].endRecording();
            int i13 = 0;
            while (true) {
                RenderNode[] renderNodeArr2 = this.f2698b;
                if (i13 < renderNodeArr2.length) {
                    renderNodeArr2[i13].setPosition(i12, i12, round, round2);
                    RecordingCanvas beginRecording2 = this.f2698b[i13].beginRecording(round, round2);
                    if (i13 > 0) {
                        beginRecording2.drawRenderNode(this.f2698b[i12]);
                    } else {
                        beginRecording2.scale(f12, f14);
                        beginRecording2.drawRenderNode(this.f2697a);
                    }
                    this.f2698b[i13].endRecording();
                    if (z11) {
                        this.f2698b[i13].setScaleX(f15);
                        this.f2698b[i13].setScaleY(f16);
                        this.f2698b[i13].setPivotX(0.0f);
                        this.f2698b[i13].setPivotY(0.0f);
                    } else {
                        this.f2699c[i13].setPosition(0, 0, width, height);
                        RecordingCanvas beginRecording3 = this.f2699c[i13].beginRecording(width, height);
                        beginRecording3.scale(f15, f16);
                        beginRecording3.drawRenderNode(this.f2698b[i13]);
                        this.f2699c[i13].endRecording();
                    }
                    i13++;
                    i12 = 0;
                } else {
                    return;
                }
            }
        }
    }

    public final void b(float f7, float f10) {
        float f11;
        RenderNode[] renderNodeArr;
        int i10 = this.f2700e;
        float f12 = 0.0f;
        if (i10 >= 2) {
            f11 = (this.f2702g + f7) % i10;
        } else {
            f11 = 0.0f;
        }
        this.f2702g = f11;
        int i11 = this.f2701f;
        if (i11 >= 2) {
            f12 = (this.h + f10) % i11;
        }
        this.h = f12;
        if (this.f2704j.f2710b) {
            this.f2697a.setTranslationX(f11);
            this.f2697a.setTranslationY(this.h);
            for (RenderNode renderNode : this.f2699c) {
                renderNode.setTranslationX(-this.f2702g);
                renderNode.setTranslationY(-this.h);
            }
        }
    }

    public final void c(float f7) {
        this.f2698b[0].setRenderEffect(RenderEffect.createBlurEffect(f.a(f7, this.f2700e), f.a(f7, this.f2701f), Shader.TileMode.CLAMP));
    }

    public final void d(float f7, RenderEffect renderEffect) {
        this.f2698b[0].setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f.a(f7, this.f2700e), f.a(f7, this.f2701f), Shader.TileMode.CLAMP), renderEffect));
    }

    public final void e(RenderEffect renderEffect) {
        this.f2698b[1].setRenderEffect(renderEffect);
    }
}
