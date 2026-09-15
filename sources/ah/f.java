package ah;

import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import org.telegram.messenger.MediaDataController;
public final class f {
    public final RenderNode f440a = e.c();
    public final RenderNode[] f441b;
    public final RenderNode[] f442c;
    public final boolean d;
    public int e;
    public int f443f;
    public float f444g;
    public float h;
    public long f445i;
    public final h f446j;

    public f(h hVar, String str, int i10, boolean z10) {
        this.f446j = hVar;
        int i11 = i10 + 1;
        this.f441b = new RenderNode[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            RenderNode[] renderNodeArr = this.f441b;
            e.j();
            renderNodeArr[i12] = e.d(str + "_down_" + i10);
        }
        if (i10 <= 0 && !z10) {
            this.f442c = this.f441b;
        } else {
            this.f442c = new RenderNode[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                this.f442c[i13] = e.c();
            }
        }
        this.d = this.f442c == this.f441b;
        this.f443f = 1;
        this.e = 1;
    }

    public final void a(RenderNode renderNode) {
        boolean z10;
        RenderNode[] renderNodeArr;
        boolean z11;
        int width = renderNode.getWidth();
        int height = renderNode.getHeight();
        float f7 = width;
        h hVar = this.f446j;
        int round = Math.round((hVar.d * f7) / this.e);
        float f10 = height;
        int round2 = Math.round((hVar.d * f10) / this.f443f);
        float f11 = round;
        float f12 = f11 / f7;
        float f13 = round2;
        float f14 = f13 / f10;
        int i10 = hVar.d;
        float f15 = (f7 * i10) / f11;
        float f16 = (f10 * i10) / f13;
        long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(0L, renderNode.getUniqueId()), round), round2), width), height);
        if (this.f440a.hasDisplayList() && this.f441b[0].hasDisplayList()) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i11 = 0;
        while (true) {
            int length = this.f441b.length;
            z11 = this.d;
            if (i11 >= length) {
                break;
            }
            z10 |= !renderNodeArr[i11].hasDisplayList();
            if (!z11) {
                z10 |= !this.f442c[i11].hasDisplayList();
            }
            i11++;
        }
        if (this.f445i != calcHash || z10) {
            this.f445i = calcHash;
            int i12 = 0;
            this.f440a.setPosition(0, 0, width, height);
            this.f440a.beginRecording(width, height).drawRenderNode(renderNode);
            this.f440a.endRecording();
            this.f441b[0].setPosition(0, 0, round, round2);
            RecordingCanvas beginRecording = this.f441b[0].beginRecording(round, round2);
            beginRecording.scale(f12, f14);
            beginRecording.drawRenderNode(this.f440a);
            this.f441b[0].endRecording();
            int i13 = 0;
            while (true) {
                RenderNode[] renderNodeArr2 = this.f441b;
                if (i13 < renderNodeArr2.length) {
                    renderNodeArr2[i13].setPosition(i12, i12, round, round2);
                    RecordingCanvas beginRecording2 = this.f441b[i13].beginRecording(round, round2);
                    if (i13 > 0) {
                        beginRecording2.drawRenderNode(this.f441b[i12]);
                    } else {
                        beginRecording2.scale(f12, f14);
                        beginRecording2.drawRenderNode(this.f440a);
                    }
                    this.f441b[i13].endRecording();
                    if (z11) {
                        this.f441b[i13].setScaleX(f15);
                        this.f441b[i13].setScaleY(f16);
                        this.f441b[i13].setPivotX(0.0f);
                        this.f441b[i13].setPivotY(0.0f);
                    } else {
                        this.f442c[i13].setPosition(0, 0, width, height);
                        RecordingCanvas beginRecording3 = this.f442c[i13].beginRecording(width, height);
                        beginRecording3.scale(f15, f16);
                        beginRecording3.drawRenderNode(this.f441b[i13]);
                        this.f442c[i13].endRecording();
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
        int i10 = this.e;
        float f12 = 0.0f;
        if (i10 >= 2) {
            f11 = (this.f444g + f7) % i10;
        } else {
            f11 = 0.0f;
        }
        this.f444g = f11;
        int i11 = this.f443f;
        if (i11 >= 2) {
            f12 = (this.h + f10) % i11;
        }
        this.h = f12;
        if (this.f446j.f451b) {
            this.f440a.setTranslationX(f11);
            this.f440a.setTranslationY(this.h);
            for (RenderNode renderNode : this.f442c) {
                renderNode.setTranslationX(-this.f444g);
                renderNode.setTranslationY(-this.h);
            }
        }
    }

    public final void c(float f7) {
        this.f441b[0].setRenderEffect(RenderEffect.createBlurEffect(h.a(f7, this.e), h.a(f7, this.f443f), Shader.TileMode.CLAMP));
    }

    public final void d(float f7, RenderEffect renderEffect) {
        this.f441b[0].setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(h.a(f7, this.e), h.a(f7, this.f443f), Shader.TileMode.CLAMP), renderEffect));
    }

    public final void e(RenderEffect renderEffect) {
        this.f441b[1].setRenderEffect(renderEffect);
    }
}
