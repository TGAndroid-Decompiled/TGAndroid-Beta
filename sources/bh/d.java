package bh;

import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.support.v4.media.session.x;
import org.telegram.messenger.MediaDataController;
public final class d {
    public final RenderNode f4379a = x.c();
    public final RenderNode[] f4380b;
    public final RenderNode[] f4381c;
    public final boolean d;
    public int e;
    public int f4382f;
    public float f4383g;
    public float h;
    public long f4384i;
    public final f f4385j;

    public d(f fVar, String str, int i10, boolean z10) {
        this.f4385j = fVar;
        int i11 = i10 + 1;
        this.f4380b = new RenderNode[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            RenderNode[] renderNodeArr = this.f4380b;
            x.j();
            renderNodeArr[i12] = x.d(str + "_down_" + i10);
        }
        if (i10 <= 0 && !z10) {
            this.f4381c = this.f4380b;
        } else {
            this.f4381c = new RenderNode[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                this.f4381c[i13] = x.c();
            }
        }
        this.d = this.f4381c == this.f4380b;
        this.f4382f = 1;
        this.e = 1;
    }

    public final void a(RenderNode renderNode) {
        boolean z10;
        RenderNode[] renderNodeArr;
        boolean z11;
        int i10;
        int width = renderNode.getWidth();
        int height = renderNode.getHeight();
        float f7 = width;
        f fVar = this.f4385j;
        int round = Math.round((fVar.d * f7) / this.e);
        float f10 = height;
        int round2 = Math.round((fVar.d * f10) / this.f4382f);
        float f11 = round;
        float f12 = f11 / f7;
        float f13 = round2;
        float f14 = f13 / f10;
        int i11 = fVar.d;
        float f15 = (f7 * i11) / f11;
        float f16 = (f10 * i11) / f13;
        long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(0L, renderNode.getUniqueId()), round), round2), width), height);
        if (this.f4379a.hasDisplayList() && this.f4380b[0].hasDisplayList()) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i12 = 0;
        while (true) {
            int length = this.f4380b.length;
            z11 = this.d;
            if (i12 >= length) {
                break;
            }
            z10 |= !renderNodeArr[i12].hasDisplayList();
            if (!z11) {
                z10 |= !this.f4381c[i12].hasDisplayList();
            }
            i12++;
        }
        if (this.f4384i != calcHash || z10) {
            this.f4384i = calcHash;
            int i13 = 0;
            this.f4379a.setPosition(0, 0, width, height);
            this.f4379a.beginRecording(width, height).drawRenderNode(renderNode);
            this.f4379a.endRecording();
            this.f4380b[0].setPosition(0, 0, round, round2);
            RecordingCanvas beginRecording = this.f4380b[0].beginRecording(round, round2);
            beginRecording.scale(f12, f14);
            beginRecording.drawRenderNode(this.f4379a);
            this.f4380b[0].endRecording();
            int i14 = 0;
            while (true) {
                RenderNode[] renderNodeArr2 = this.f4380b;
                if (i14 < renderNodeArr2.length) {
                    renderNodeArr2[i14].setPosition(i13, i13, round, round2);
                    RecordingCanvas beginRecording2 = this.f4380b[i14].beginRecording(round, round2);
                    if (i14 > 0) {
                        beginRecording2.drawRenderNode(this.f4380b[i13]);
                    } else {
                        beginRecording2.scale(f12, f14);
                        beginRecording2.drawRenderNode(this.f4379a);
                    }
                    this.f4380b[i14].endRecording();
                    if (z11) {
                        this.f4380b[i14].setScaleX(f15);
                        this.f4380b[i14].setScaleY(f16);
                        this.f4380b[i14].setPivotX(0.0f);
                        this.f4380b[i14].setPivotY(0.0f);
                        i10 = 0;
                    } else {
                        i10 = 0;
                        this.f4381c[i14].setPosition(0, 0, width, height);
                        RecordingCanvas beginRecording3 = this.f4381c[i14].beginRecording(width, height);
                        beginRecording3.scale(f15, f16);
                        beginRecording3.drawRenderNode(this.f4380b[i14]);
                        this.f4381c[i14].endRecording();
                    }
                    i14++;
                    i13 = i10;
                } else {
                    return;
                }
            }
        }
    }

    public final void b(float f7, float f10) {
        float f11;
        RenderNode[] renderNodeArr;
        int i10 = this.e;
        float f12 = 0.0f;
        if (i10 >= 2) {
            f11 = (this.f4383g + f7) % i10;
        } else {
            f11 = 0.0f;
        }
        this.f4383g = f11;
        int i11 = this.f4382f;
        if (i11 >= 2) {
            f12 = (this.h + f10) % i11;
        }
        this.h = f12;
        if (this.f4385j.f4390b) {
            this.f4379a.setTranslationX(f11);
            this.f4379a.setTranslationY(this.h);
            for (RenderNode renderNode : this.f4381c) {
                renderNode.setTranslationX(-this.f4383g);
                renderNode.setTranslationY(-this.h);
            }
        }
    }

    public final void c(float f7) {
        this.f4380b[0].setRenderEffect(RenderEffect.createBlurEffect(f.a(f7, this.e), f.a(f7, this.f4382f), Shader.TileMode.CLAMP));
    }

    public final void d(float f7, RenderEffect renderEffect) {
        this.f4380b[0].setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(f.a(f7, this.e), f.a(f7, this.f4382f), Shader.TileMode.CLAMP), renderEffect));
    }

    public final void e(RenderEffect renderEffect) {
        this.f4380b[1].setRenderEffect(renderEffect);
    }
}
