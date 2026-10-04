package ah;

import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import org.telegram.messenger.MediaDataController;
public final class g {
    public final RenderNode f479a = f.c();
    public final RenderNode[] f480b;
    public final RenderNode[] f481c;
    public final boolean d;
    public int f482e;
    public int f483f;
    public float f484g;
    public float h;
    public long f485i;
    public final i f486j;

    public g(i iVar, String str, int i10, boolean z10) {
        this.f486j = iVar;
        int i11 = i10 + 1;
        this.f480b = new RenderNode[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            RenderNode[] renderNodeArr = this.f480b;
            f.j();
            renderNodeArr[i12] = f.d(str + "_down_" + i10);
        }
        if (i10 <= 0 && !z10) {
            this.f481c = this.f480b;
        } else {
            this.f481c = new RenderNode[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                this.f481c[i13] = f.c();
            }
        }
        this.d = this.f481c == this.f480b;
        this.f483f = 1;
        this.f482e = 1;
    }

    public final void a(RenderNode renderNode) {
        boolean z10;
        RenderNode[] renderNodeArr;
        boolean z11;
        int width = renderNode.getWidth();
        int height = renderNode.getHeight();
        float f7 = width;
        i iVar = this.f486j;
        int round = Math.round((iVar.d * f7) / this.f482e);
        float f10 = height;
        int round2 = Math.round((iVar.d * f10) / this.f483f);
        float f11 = round;
        float f12 = f11 / f7;
        float f13 = round2;
        float f14 = f13 / f10;
        int i10 = iVar.d;
        float f15 = (f7 * i10) / f11;
        float f16 = (f10 * i10) / f13;
        long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(0L, renderNode.getUniqueId()), round), round2), width), height);
        if (this.f479a.hasDisplayList() && this.f480b[0].hasDisplayList()) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i11 = 0;
        while (true) {
            int length = this.f480b.length;
            z11 = this.d;
            if (i11 >= length) {
                break;
            }
            z10 |= !renderNodeArr[i11].hasDisplayList();
            if (!z11) {
                z10 |= !this.f481c[i11].hasDisplayList();
            }
            i11++;
        }
        if (this.f485i != calcHash || z10) {
            this.f485i = calcHash;
            int i12 = 0;
            this.f479a.setPosition(0, 0, width, height);
            this.f479a.beginRecording(width, height).drawRenderNode(renderNode);
            this.f479a.endRecording();
            this.f480b[0].setPosition(0, 0, round, round2);
            RecordingCanvas beginRecording = this.f480b[0].beginRecording(round, round2);
            beginRecording.scale(f12, f14);
            beginRecording.drawRenderNode(this.f479a);
            this.f480b[0].endRecording();
            int i13 = 0;
            while (true) {
                RenderNode[] renderNodeArr2 = this.f480b;
                if (i13 < renderNodeArr2.length) {
                    renderNodeArr2[i13].setPosition(i12, i12, round, round2);
                    RecordingCanvas beginRecording2 = this.f480b[i13].beginRecording(round, round2);
                    if (i13 > 0) {
                        beginRecording2.drawRenderNode(this.f480b[i12]);
                    } else {
                        beginRecording2.scale(f12, f14);
                        beginRecording2.drawRenderNode(this.f479a);
                    }
                    this.f480b[i13].endRecording();
                    if (z11) {
                        this.f480b[i13].setScaleX(f15);
                        this.f480b[i13].setScaleY(f16);
                        this.f480b[i13].setPivotX(0.0f);
                        this.f480b[i13].setPivotY(0.0f);
                    } else {
                        this.f481c[i13].setPosition(0, 0, width, height);
                        RecordingCanvas beginRecording3 = this.f481c[i13].beginRecording(width, height);
                        beginRecording3.scale(f15, f16);
                        beginRecording3.drawRenderNode(this.f480b[i13]);
                        this.f481c[i13].endRecording();
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
        int i10 = this.f482e;
        float f12 = 0.0f;
        if (i10 >= 2) {
            f11 = (this.f484g + f7) % i10;
        } else {
            f11 = 0.0f;
        }
        this.f484g = f11;
        int i11 = this.f483f;
        if (i11 >= 2) {
            f12 = (this.h + f10) % i11;
        }
        this.h = f12;
        if (this.f486j.f492b) {
            this.f479a.setTranslationX(f11);
            this.f479a.setTranslationY(this.h);
            for (RenderNode renderNode : this.f481c) {
                renderNode.setTranslationX(-this.f484g);
                renderNode.setTranslationY(-this.h);
            }
        }
    }

    public final void c(float f7) {
        this.f480b[0].setRenderEffect(RenderEffect.createBlurEffect(i.a(f7, this.f482e), i.a(f7, this.f483f), Shader.TileMode.CLAMP));
    }

    public final void d(float f7, RenderEffect renderEffect) {
        this.f480b[0].setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(i.a(f7, this.f482e), i.a(f7, this.f483f), Shader.TileMode.CLAMP), renderEffect));
    }

    public final void e(RenderEffect renderEffect) {
        this.f480b[1].setRenderEffect(renderEffect);
    }
}
