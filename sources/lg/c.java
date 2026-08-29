package lg;

import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.support.v4.media.session.z;
import org.telegram.messenger.MediaDataController;
public final class c {
    public final RenderNode f15241a = z.c();
    public final RenderNode[] f15242b;
    public final RenderNode[] f15243c;
    public final boolean d;
    public int f15244e;
    public int f15245f;
    public float f15246g;
    public float h;
    public long f15247i;
    public final e f15248j;

    public c(e eVar, String str, int i10, boolean z10) {
        this.f15248j = eVar;
        int i11 = i10 + 1;
        this.f15242b = new RenderNode[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            RenderNode[] renderNodeArr = this.f15242b;
            z.i();
            renderNodeArr[i12] = z.d(str + "_down_" + i10);
        }
        if (i10 <= 0 && !z10) {
            this.f15243c = this.f15242b;
        } else {
            this.f15243c = new RenderNode[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                this.f15243c[i13] = z.c();
            }
        }
        this.d = this.f15243c == this.f15242b;
        this.f15245f = 1;
        this.f15244e = 1;
    }

    public final void a(RenderNode renderNode) {
        boolean z10;
        RenderNode[] renderNodeArr;
        boolean z11;
        int width = renderNode.getWidth();
        int height = renderNode.getHeight();
        float f9 = width;
        e eVar = this.f15248j;
        int round = Math.round((eVar.d * f9) / this.f15244e);
        float f10 = height;
        int round2 = Math.round((eVar.d * f10) / this.f15245f);
        float f11 = round;
        float f12 = f11 / f9;
        float f13 = round2;
        float f14 = f13 / f10;
        int i10 = eVar.d;
        float f15 = (f9 * i10) / f11;
        float f16 = (f10 * i10) / f13;
        long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(0L, renderNode.getUniqueId()), round), round2), width), height);
        if (this.f15241a.hasDisplayList() && this.f15242b[0].hasDisplayList()) {
            z10 = false;
        } else {
            z10 = true;
        }
        int i11 = 0;
        while (true) {
            int length = this.f15242b.length;
            z11 = this.d;
            if (i11 >= length) {
                break;
            }
            z10 |= !renderNodeArr[i11].hasDisplayList();
            if (!z11) {
                z10 |= !this.f15243c[i11].hasDisplayList();
            }
            i11++;
        }
        if (this.f15247i != calcHash || z10) {
            this.f15247i = calcHash;
            int i12 = 0;
            this.f15241a.setPosition(0, 0, width, height);
            this.f15241a.beginRecording(width, height).drawRenderNode(renderNode);
            this.f15241a.endRecording();
            this.f15242b[0].setPosition(0, 0, round, round2);
            RecordingCanvas beginRecording = this.f15242b[0].beginRecording(round, round2);
            beginRecording.scale(f12, f14);
            beginRecording.drawRenderNode(this.f15241a);
            this.f15242b[0].endRecording();
            int i13 = 0;
            while (true) {
                RenderNode[] renderNodeArr2 = this.f15242b;
                if (i13 < renderNodeArr2.length) {
                    renderNodeArr2[i13].setPosition(i12, i12, round, round2);
                    RecordingCanvas beginRecording2 = this.f15242b[i13].beginRecording(round, round2);
                    if (i13 > 0) {
                        beginRecording2.drawRenderNode(this.f15242b[i12]);
                    } else {
                        beginRecording2.scale(f12, f14);
                        beginRecording2.drawRenderNode(this.f15241a);
                    }
                    this.f15242b[i13].endRecording();
                    if (z11) {
                        this.f15242b[i13].setScaleX(f15);
                        this.f15242b[i13].setScaleY(f16);
                        this.f15242b[i13].setPivotX(0.0f);
                        this.f15242b[i13].setPivotY(0.0f);
                    } else {
                        this.f15243c[i13].setPosition(0, 0, width, height);
                        RecordingCanvas beginRecording3 = this.f15243c[i13].beginRecording(width, height);
                        beginRecording3.scale(f15, f16);
                        beginRecording3.drawRenderNode(this.f15242b[i13]);
                        this.f15243c[i13].endRecording();
                    }
                    i13++;
                    i12 = 0;
                } else {
                    return;
                }
            }
        }
    }

    public final void b(float f9, float f10) {
        float f11;
        RenderNode[] renderNodeArr;
        int i10 = this.f15244e;
        float f12 = 0.0f;
        if (i10 >= 2) {
            f11 = (this.f15246g + f9) % i10;
        } else {
            f11 = 0.0f;
        }
        this.f15246g = f11;
        int i11 = this.f15245f;
        if (i11 >= 2) {
            f12 = (this.h + f10) % i11;
        }
        this.h = f12;
        if (this.f15248j.f15254b) {
            this.f15241a.setTranslationX(f11);
            this.f15241a.setTranslationY(this.h);
            for (RenderNode renderNode : this.f15243c) {
                renderNode.setTranslationX(-this.f15246g);
                renderNode.setTranslationY(-this.h);
            }
        }
    }

    public final void c(float f9) {
        this.f15242b[0].setRenderEffect(RenderEffect.createBlurEffect(e.a(f9, this.f15244e), e.a(f9, this.f15245f), Shader.TileMode.CLAMP));
    }

    public final void d(float f9, RenderEffect renderEffect) {
        this.f15242b[0].setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(e.a(f9, this.f15244e), e.a(f9, this.f15245f), Shader.TileMode.CLAMP), renderEffect));
    }

    public final void e(RenderEffect renderEffect) {
        this.f15242b[1].setRenderEffect(renderEffect);
    }
}
