package ig;

import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.support.v4.media.session.z;
import org.telegram.messenger.MediaDataController;
public final class c {
    public final RenderNode f11148a = z.c();
    public final RenderNode[] f11149b;
    public final RenderNode[] f11150c;
    public final boolean d;
    public int f11151e;
    public int f11152f;
    public float f11153g;
    public float h;
    public long f11154i;
    public final e f11155j;

    public c(e eVar, String str, int i9, boolean z10) {
        this.f11155j = eVar;
        int i10 = i9 + 1;
        this.f11149b = new RenderNode[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            RenderNode[] renderNodeArr = this.f11149b;
            z.i();
            renderNodeArr[i11] = z.d(str + "_down_" + i9);
        }
        if (i9 <= 0 && !z10) {
            this.f11150c = this.f11149b;
        } else {
            this.f11150c = new RenderNode[i10];
            for (int i12 = 0; i12 < i10; i12++) {
                this.f11150c[i12] = z.c();
            }
        }
        this.d = this.f11150c == this.f11149b;
        this.f11152f = 1;
        this.f11151e = 1;
    }

    public final void a(RenderNode renderNode) {
        boolean z10;
        RenderNode[] renderNodeArr;
        boolean z11;
        int width = renderNode.getWidth();
        int height = renderNode.getHeight();
        float f10 = width;
        e eVar = this.f11155j;
        int round = Math.round((eVar.d * f10) / this.f11151e);
        float f11 = height;
        int round2 = Math.round((eVar.d * f11) / this.f11152f);
        float f12 = round;
        float f13 = f12 / f10;
        float f14 = round2;
        float f15 = f14 / f11;
        int i9 = eVar.d;
        float f16 = (f10 * i9) / f12;
        float f17 = (f11 * i9) / f14;
        long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(0L, renderNode.getUniqueId()), round), round2), width), height);
        if (this.f11148a.hasDisplayList() && this.f11149b[0].hasDisplayList()) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i10 = 0;
        while (true) {
            int length = this.f11149b.length;
            z11 = this.d;
            if (i10 >= length) {
                break;
            }
            z10 |= !renderNodeArr[i10].hasDisplayList();
            if (!z11) {
                z10 |= !this.f11150c[i10].hasDisplayList();
            }
            i10++;
        }
        if (this.f11154i != calcHash || z10) {
            this.f11154i = calcHash;
            int i11 = 0;
            this.f11148a.setPosition(0, 0, width, height);
            this.f11148a.beginRecording(width, height).drawRenderNode(renderNode);
            this.f11148a.endRecording();
            this.f11149b[0].setPosition(0, 0, round, round2);
            RecordingCanvas beginRecording = this.f11149b[0].beginRecording(round, round2);
            beginRecording.scale(f13, f15);
            beginRecording.drawRenderNode(this.f11148a);
            this.f11149b[0].endRecording();
            int i12 = 0;
            while (true) {
                RenderNode[] renderNodeArr2 = this.f11149b;
                if (i12 < renderNodeArr2.length) {
                    renderNodeArr2[i12].setPosition(i11, i11, round, round2);
                    RecordingCanvas beginRecording2 = this.f11149b[i12].beginRecording(round, round2);
                    if (i12 > 0) {
                        beginRecording2.drawRenderNode(this.f11149b[i11]);
                    } else {
                        beginRecording2.scale(f13, f15);
                        beginRecording2.drawRenderNode(this.f11148a);
                    }
                    this.f11149b[i12].endRecording();
                    if (z11) {
                        this.f11149b[i12].setScaleX(f16);
                        this.f11149b[i12].setScaleY(f17);
                        this.f11149b[i12].setPivotX(0.0f);
                        this.f11149b[i12].setPivotY(0.0f);
                    } else {
                        this.f11150c[i12].setPosition(0, 0, width, height);
                        RecordingCanvas beginRecording3 = this.f11150c[i12].beginRecording(width, height);
                        beginRecording3.scale(f16, f17);
                        beginRecording3.drawRenderNode(this.f11149b[i12]);
                        this.f11150c[i12].endRecording();
                    }
                    i12++;
                    i11 = 0;
                } else {
                    return;
                }
            }
        }
    }

    public final void b(float f10, float f11) {
        float f12;
        RenderNode[] renderNodeArr;
        int i9 = this.f11151e;
        float f13 = 0.0f;
        if (i9 >= 2) {
            f12 = (this.f11153g + f10) % i9;
        } else {
            f12 = 0.0f;
        }
        this.f11153g = f12;
        int i10 = this.f11152f;
        if (i10 >= 2) {
            f13 = (this.h + f11) % i10;
        }
        this.h = f13;
        if (this.f11155j.f11161b) {
            this.f11148a.setTranslationX(f12);
            this.f11148a.setTranslationY(this.h);
            for (RenderNode renderNode : this.f11150c) {
                renderNode.setTranslationX(-this.f11153g);
                renderNode.setTranslationY(-this.h);
            }
        }
    }

    public final void c(float f10) {
        this.f11149b[0].setRenderEffect(RenderEffect.createBlurEffect(e.a(f10, this.f11151e), e.a(f10, this.f11152f), Shader.TileMode.CLAMP));
    }

    public final void d(float f10, RenderEffect renderEffect) {
        this.f11149b[0].setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(e.a(f10, this.f11151e), e.a(f10, this.f11152f), Shader.TileMode.CLAMP), renderEffect));
    }

    public final void e(RenderEffect renderEffect) {
        this.f11149b[1].setRenderEffect(renderEffect);
    }
}
