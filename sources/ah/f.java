package ah;

import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import org.telegram.messenger.MediaDataController;
public final class f {
    public final RenderNode f563a = e.c();
    public final RenderNode[] f564b;
    public final RenderNode[] f565c;
    public final boolean d;
    public int f566e;
    public int f567f;
    public float f568g;
    public float h;
    public long f569i;
    public final h f570j;

    public f(h hVar, String str, int i10, boolean z10) {
        this.f570j = hVar;
        int i11 = i10 + 1;
        this.f564b = new RenderNode[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            RenderNode[] renderNodeArr = this.f564b;
            e.j();
            renderNodeArr[i12] = e.d(str + "_down_" + i10);
        }
        if (i10 <= 0 && !z10) {
            this.f565c = this.f564b;
        } else {
            this.f565c = new RenderNode[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                this.f565c[i13] = e.c();
            }
        }
        this.d = this.f565c == this.f564b;
        this.f567f = 1;
        this.f566e = 1;
    }

    public final void a(RenderNode renderNode) {
        boolean z10;
        RenderNode[] renderNodeArr;
        boolean z11;
        int i10;
        int width = renderNode.getWidth();
        int height = renderNode.getHeight();
        float f7 = width;
        h hVar = this.f570j;
        int round = Math.round((hVar.d * f7) / this.f566e);
        float f10 = height;
        int round2 = Math.round((hVar.d * f10) / this.f567f);
        float f11 = round;
        float f12 = f11 / f7;
        float f13 = round2;
        float f14 = f13 / f10;
        int i11 = hVar.d;
        float f15 = (f7 * i11) / f11;
        float f16 = (f10 * i11) / f13;
        long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(0L, renderNode.getUniqueId()), round), round2), width), height);
        if (this.f563a.hasDisplayList() && this.f564b[0].hasDisplayList()) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i12 = 0;
        while (true) {
            int length = this.f564b.length;
            z11 = this.d;
            if (i12 >= length) {
                break;
            }
            z10 |= !renderNodeArr[i12].hasDisplayList();
            if (!z11) {
                z10 |= !this.f565c[i12].hasDisplayList();
            }
            i12++;
        }
        if (this.f569i != calcHash || z10) {
            this.f569i = calcHash;
            int i13 = 0;
            this.f563a.setPosition(0, 0, width, height);
            this.f563a.beginRecording(width, height).drawRenderNode(renderNode);
            this.f563a.endRecording();
            this.f564b[0].setPosition(0, 0, round, round2);
            RecordingCanvas beginRecording = this.f564b[0].beginRecording(round, round2);
            beginRecording.scale(f12, f14);
            beginRecording.drawRenderNode(this.f563a);
            this.f564b[0].endRecording();
            int i14 = 0;
            while (true) {
                RenderNode[] renderNodeArr2 = this.f564b;
                if (i14 < renderNodeArr2.length) {
                    renderNodeArr2[i14].setPosition(i13, i13, round, round2);
                    RecordingCanvas beginRecording2 = this.f564b[i14].beginRecording(round, round2);
                    if (i14 > 0) {
                        beginRecording2.drawRenderNode(this.f564b[i13]);
                    } else {
                        beginRecording2.scale(f12, f14);
                        beginRecording2.drawRenderNode(this.f563a);
                    }
                    this.f564b[i14].endRecording();
                    if (z11) {
                        this.f564b[i14].setScaleX(f15);
                        this.f564b[i14].setScaleY(f16);
                        this.f564b[i14].setPivotX(0.0f);
                        this.f564b[i14].setPivotY(0.0f);
                        i10 = 0;
                    } else {
                        i10 = 0;
                        this.f565c[i14].setPosition(0, 0, width, height);
                        RecordingCanvas beginRecording3 = this.f565c[i14].beginRecording(width, height);
                        beginRecording3.scale(f15, f16);
                        beginRecording3.drawRenderNode(this.f564b[i14]);
                        this.f565c[i14].endRecording();
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
        int i10 = this.f566e;
        float f12 = 0.0f;
        if (i10 >= 2) {
            f11 = (this.f568g + f7) % i10;
        } else {
            f11 = 0.0f;
        }
        this.f568g = f11;
        int i11 = this.f567f;
        if (i11 >= 2) {
            f12 = (this.h + f10) % i11;
        }
        this.h = f12;
        if (this.f570j.f576b) {
            this.f563a.setTranslationX(f11);
            this.f563a.setTranslationY(this.h);
            for (RenderNode renderNode : this.f565c) {
                renderNode.setTranslationX(-this.f568g);
                renderNode.setTranslationY(-this.h);
            }
        }
    }

    public final void c(float f7) {
        this.f564b[0].setRenderEffect(RenderEffect.createBlurEffect(h.a(f7, this.f566e), h.a(f7, this.f567f), Shader.TileMode.CLAMP));
    }

    public final void d(float f7, RenderEffect renderEffect) {
        this.f564b[0].setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(h.a(f7, this.f566e), h.a(f7, this.f567f), Shader.TileMode.CLAMP), renderEffect));
    }

    public final void e(RenderEffect renderEffect) {
        this.f564b[1].setRenderEffect(renderEffect);
    }
}
