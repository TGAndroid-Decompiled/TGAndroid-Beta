package ah;

import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import org.telegram.messenger.MediaDataController;
public final class f {
    public final RenderNode f565a = e.c();
    public final RenderNode[] f566b;
    public final RenderNode[] f567c;
    public final boolean d;
    public int f568e;
    public int f569f;
    public float f570g;
    public float h;
    public long f571i;
    public final h f572j;

    public f(h hVar, String str, int i10, boolean z10) {
        this.f572j = hVar;
        int i11 = i10 + 1;
        this.f566b = new RenderNode[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            RenderNode[] renderNodeArr = this.f566b;
            e.j();
            renderNodeArr[i12] = e.d(str + "_down_" + i10);
        }
        if (i10 <= 0 && !z10) {
            this.f567c = this.f566b;
        } else {
            this.f567c = new RenderNode[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                this.f567c[i13] = e.c();
            }
        }
        this.d = this.f567c == this.f566b;
        this.f569f = 1;
        this.f568e = 1;
    }

    public final void a(RenderNode renderNode) {
        boolean z10;
        RenderNode[] renderNodeArr;
        boolean z11;
        int i10;
        int width = renderNode.getWidth();
        int height = renderNode.getHeight();
        float f7 = width;
        h hVar = this.f572j;
        int round = Math.round((hVar.d * f7) / this.f568e);
        float f10 = height;
        int round2 = Math.round((hVar.d * f10) / this.f569f);
        float f11 = round;
        float f12 = f11 / f7;
        float f13 = round2;
        float f14 = f13 / f10;
        int i11 = hVar.d;
        float f15 = (f7 * i11) / f11;
        float f16 = (f10 * i11) / f13;
        long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(0L, renderNode.getUniqueId()), round), round2), width), height);
        if (this.f565a.hasDisplayList() && this.f566b[0].hasDisplayList()) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i12 = 0;
        while (true) {
            int length = this.f566b.length;
            z11 = this.d;
            if (i12 >= length) {
                break;
            }
            z10 |= !renderNodeArr[i12].hasDisplayList();
            if (!z11) {
                z10 |= !this.f567c[i12].hasDisplayList();
            }
            i12++;
        }
        if (this.f571i != calcHash || z10) {
            this.f571i = calcHash;
            int i13 = 0;
            this.f565a.setPosition(0, 0, width, height);
            this.f565a.beginRecording(width, height).drawRenderNode(renderNode);
            this.f565a.endRecording();
            this.f566b[0].setPosition(0, 0, round, round2);
            RecordingCanvas beginRecording = this.f566b[0].beginRecording(round, round2);
            beginRecording.scale(f12, f14);
            beginRecording.drawRenderNode(this.f565a);
            this.f566b[0].endRecording();
            int i14 = 0;
            while (true) {
                RenderNode[] renderNodeArr2 = this.f566b;
                if (i14 < renderNodeArr2.length) {
                    renderNodeArr2[i14].setPosition(i13, i13, round, round2);
                    RecordingCanvas beginRecording2 = this.f566b[i14].beginRecording(round, round2);
                    if (i14 > 0) {
                        beginRecording2.drawRenderNode(this.f566b[i13]);
                    } else {
                        beginRecording2.scale(f12, f14);
                        beginRecording2.drawRenderNode(this.f565a);
                    }
                    this.f566b[i14].endRecording();
                    if (z11) {
                        this.f566b[i14].setScaleX(f15);
                        this.f566b[i14].setScaleY(f16);
                        this.f566b[i14].setPivotX(0.0f);
                        this.f566b[i14].setPivotY(0.0f);
                        i10 = 0;
                    } else {
                        i10 = 0;
                        this.f567c[i14].setPosition(0, 0, width, height);
                        RecordingCanvas beginRecording3 = this.f567c[i14].beginRecording(width, height);
                        beginRecording3.scale(f15, f16);
                        beginRecording3.drawRenderNode(this.f566b[i14]);
                        this.f567c[i14].endRecording();
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
        int i10 = this.f568e;
        float f12 = 0.0f;
        if (i10 >= 2) {
            f11 = (this.f570g + f7) % i10;
        } else {
            f11 = 0.0f;
        }
        this.f570g = f11;
        int i11 = this.f569f;
        if (i11 >= 2) {
            f12 = (this.h + f10) % i11;
        }
        this.h = f12;
        if (this.f572j.f578b) {
            this.f565a.setTranslationX(f11);
            this.f565a.setTranslationY(this.h);
            for (RenderNode renderNode : this.f567c) {
                renderNode.setTranslationX(-this.f570g);
                renderNode.setTranslationY(-this.h);
            }
        }
    }

    public final void c(float f7) {
        this.f566b[0].setRenderEffect(RenderEffect.createBlurEffect(h.a(f7, this.f568e), h.a(f7, this.f569f), Shader.TileMode.CLAMP));
    }

    public final void d(float f7, RenderEffect renderEffect) {
        this.f566b[0].setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(h.a(f7, this.f568e), h.a(f7, this.f569f), Shader.TileMode.CLAMP), renderEffect));
    }

    public final void e(RenderEffect renderEffect) {
        this.f566b[1].setRenderEffect(renderEffect);
    }
}
