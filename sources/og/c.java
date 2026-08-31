package og;

import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.support.v4.media.session.y;
import org.telegram.messenger.MediaDataController;
public final class c {
    public final RenderNode f16771a = y.c();
    public final RenderNode[] f16772b;
    public final RenderNode[] f16773c;
    public final boolean d;
    public int f16774e;
    public int f16775f;
    public float f16776g;
    public float h;
    public long f16777i;
    public final e f16778j;

    public c(e eVar, String str, int i10, boolean z4) {
        this.f16778j = eVar;
        int i11 = i10 + 1;
        this.f16772b = new RenderNode[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            RenderNode[] renderNodeArr = this.f16772b;
            y.i();
            renderNodeArr[i12] = y.d(str + "_down_" + i10);
        }
        if (i10 <= 0 && !z4) {
            this.f16773c = this.f16772b;
        } else {
            this.f16773c = new RenderNode[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                this.f16773c[i13] = y.c();
            }
        }
        this.d = this.f16773c == this.f16772b;
        this.f16775f = 1;
        this.f16774e = 1;
    }

    public final void a(RenderNode renderNode) {
        boolean z4;
        RenderNode[] renderNodeArr;
        boolean z10;
        int width = renderNode.getWidth();
        int height = renderNode.getHeight();
        float f10 = width;
        e eVar = this.f16778j;
        int round = Math.round((eVar.d * f10) / this.f16774e);
        float f11 = height;
        int round2 = Math.round((eVar.d * f11) / this.f16775f);
        float f12 = round;
        float f13 = f12 / f10;
        float f14 = round2;
        float f15 = f14 / f11;
        int i10 = eVar.d;
        float f16 = (f10 * i10) / f12;
        float f17 = (f11 * i10) / f14;
        long calcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(0L, renderNode.getUniqueId()), round), round2), width), height);
        if (this.f16771a.hasDisplayList() && this.f16772b[0].hasDisplayList()) {
            z4 = false;
        } else {
            z4 = true;
        }
        int i11 = 0;
        while (true) {
            int length = this.f16772b.length;
            z10 = this.d;
            if (i11 >= length) {
                break;
            }
            z4 |= !renderNodeArr[i11].hasDisplayList();
            if (!z10) {
                z4 |= !this.f16773c[i11].hasDisplayList();
            }
            i11++;
        }
        if (this.f16777i != calcHash || z4) {
            this.f16777i = calcHash;
            int i12 = 0;
            this.f16771a.setPosition(0, 0, width, height);
            this.f16771a.beginRecording(width, height).drawRenderNode(renderNode);
            this.f16771a.endRecording();
            this.f16772b[0].setPosition(0, 0, round, round2);
            RecordingCanvas beginRecording = this.f16772b[0].beginRecording(round, round2);
            beginRecording.scale(f13, f15);
            beginRecording.drawRenderNode(this.f16771a);
            this.f16772b[0].endRecording();
            int i13 = 0;
            while (true) {
                RenderNode[] renderNodeArr2 = this.f16772b;
                if (i13 < renderNodeArr2.length) {
                    renderNodeArr2[i13].setPosition(i12, i12, round, round2);
                    RecordingCanvas beginRecording2 = this.f16772b[i13].beginRecording(round, round2);
                    if (i13 > 0) {
                        beginRecording2.drawRenderNode(this.f16772b[i12]);
                    } else {
                        beginRecording2.scale(f13, f15);
                        beginRecording2.drawRenderNode(this.f16771a);
                    }
                    this.f16772b[i13].endRecording();
                    if (z10) {
                        this.f16772b[i13].setScaleX(f16);
                        this.f16772b[i13].setScaleY(f17);
                        this.f16772b[i13].setPivotX(0.0f);
                        this.f16772b[i13].setPivotY(0.0f);
                    } else {
                        this.f16773c[i13].setPosition(0, 0, width, height);
                        RecordingCanvas beginRecording3 = this.f16773c[i13].beginRecording(width, height);
                        beginRecording3.scale(f16, f17);
                        beginRecording3.drawRenderNode(this.f16772b[i13]);
                        this.f16773c[i13].endRecording();
                    }
                    i13++;
                    i12 = 0;
                } else {
                    return;
                }
            }
        }
    }

    public final void b(float f10, float f11) {
        float f12;
        RenderNode[] renderNodeArr;
        int i10 = this.f16774e;
        float f13 = 0.0f;
        if (i10 >= 2) {
            f12 = (this.f16776g + f10) % i10;
        } else {
            f12 = 0.0f;
        }
        this.f16776g = f12;
        int i11 = this.f16775f;
        if (i11 >= 2) {
            f13 = (this.h + f11) % i11;
        }
        this.h = f13;
        if (this.f16778j.f16784b) {
            this.f16771a.setTranslationX(f12);
            this.f16771a.setTranslationY(this.h);
            for (RenderNode renderNode : this.f16773c) {
                renderNode.setTranslationX(-this.f16776g);
                renderNode.setTranslationY(-this.h);
            }
        }
    }

    public final void c(float f10) {
        this.f16772b[0].setRenderEffect(RenderEffect.createBlurEffect(e.a(f10, this.f16774e), e.a(f10, this.f16775f), Shader.TileMode.CLAMP));
    }

    public final void d(float f10, RenderEffect renderEffect) {
        this.f16772b[0].setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(e.a(f10, this.f16774e), e.a(f10, this.f16775f), Shader.TileMode.CLAMP), renderEffect));
    }

    public final void e(RenderEffect renderEffect) {
        this.f16772b[1].setRenderEffect(renderEffect);
    }
}
