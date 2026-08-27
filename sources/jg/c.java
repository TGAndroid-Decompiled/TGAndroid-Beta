package jg;

import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.support.v4.media.session.z;
import org.telegram.messenger.MediaDataController;

public final class c {

    public final RenderNode f12960a = z.c();

    public final RenderNode[] f12961b;

    public final RenderNode[] f12962c;
    public final boolean d;

    public int f12963e;

    public int f12964f;

    public float f12965g;
    public float h;

    public long f12966i;

    public final e f12967j;

    public c(e eVar, String str, int i10, boolean z10) {
        this.f12967j = eVar;
        int i11 = i10 + 1;
        this.f12961b = new RenderNode[i11];
        for (int i12 = 0; i12 < i11; i12++) {
            RenderNode[] renderNodeArr = this.f12961b;
            z.i();
            renderNodeArr[i12] = z.d(str + "_down_" + i10);
        }
        if (i10 > 0 || z10) {
            this.f12962c = new RenderNode[i11];
            for (int i13 = 0; i13 < i11; i13++) {
                this.f12962c[i13] = z.c();
            }
        } else {
            this.f12962c = this.f12961b;
        }
        this.d = this.f12962c == this.f12961b;
        this.f12964f = 1;
        this.f12963e = 1;
    }

    public final void a(RenderNode renderNode) {
        boolean z10;
        int width = renderNode.getWidth();
        int height = renderNode.getHeight();
        float f10 = width;
        e eVar = this.f12967j;
        int iRound = Math.round((eVar.d * f10) / this.f12963e);
        float f11 = height;
        int iRound2 = Math.round((eVar.d * f11) / this.f12964f);
        float f12 = iRound;
        float f13 = f12 / f10;
        float f14 = iRound2;
        float f15 = f14 / f11;
        int i10 = eVar.d;
        float f16 = (f10 * i10) / f12;
        float f17 = (f11 * i10) / f14;
        long jCalcHash = MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(MediaDataController.calcHash(0L, renderNode.getUniqueId()), iRound), iRound2), width), height);
        boolean z11 = (this.f12960a.hasDisplayList() && this.f12961b[0].hasDisplayList()) ? false : true;
        int i11 = 0;
        while (true) {
            RenderNode[] renderNodeArr = this.f12961b;
            int length = renderNodeArr.length;
            z10 = this.d;
            if (i11 >= length) {
                break;
            }
            z11 |= !renderNodeArr[i11].hasDisplayList();
            if (!z10) {
                z11 |= !this.f12962c[i11].hasDisplayList();
            }
            i11++;
        }
        if (this.f12966i == jCalcHash && !z11) {
            return;
        }
        this.f12966i = jCalcHash;
        int i12 = 0;
        this.f12960a.setPosition(0, 0, width, height);
        this.f12960a.beginRecording(width, height).drawRenderNode(renderNode);
        this.f12960a.endRecording();
        this.f12961b[0].setPosition(0, 0, iRound, iRound2);
        RecordingCanvas recordingCanvasBeginRecording = this.f12961b[0].beginRecording(iRound, iRound2);
        recordingCanvasBeginRecording.scale(f13, f15);
        recordingCanvasBeginRecording.drawRenderNode(this.f12960a);
        this.f12961b[0].endRecording();
        int i13 = 0;
        while (true) {
            RenderNode[] renderNodeArr2 = this.f12961b;
            if (i13 >= renderNodeArr2.length) {
                return;
            }
            renderNodeArr2[i13].setPosition(i12, i12, iRound, iRound2);
            RecordingCanvas recordingCanvasBeginRecording2 = this.f12961b[i13].beginRecording(iRound, iRound2);
            if (i13 > 0) {
                recordingCanvasBeginRecording2.drawRenderNode(this.f12961b[i12]);
            } else {
                recordingCanvasBeginRecording2.scale(f13, f15);
                recordingCanvasBeginRecording2.drawRenderNode(this.f12960a);
            }
            this.f12961b[i13].endRecording();
            if (z10) {
                this.f12961b[i13].setScaleX(f16);
                this.f12961b[i13].setScaleY(f17);
                this.f12961b[i13].setPivotX(0.0f);
                this.f12961b[i13].setPivotY(0.0f);
            } else {
                this.f12962c[i13].setPosition(0, 0, width, height);
                RecordingCanvas recordingCanvasBeginRecording3 = this.f12962c[i13].beginRecording(width, height);
                recordingCanvasBeginRecording3.scale(f16, f17);
                recordingCanvasBeginRecording3.drawRenderNode(this.f12961b[i13]);
                this.f12962c[i13].endRecording();
            }
            i13++;
            i12 = 0;
        }
    }

    public final void b(float f10, float f11) {
        int i10 = this.f12963e;
        float f12 = i10 >= 2 ? (this.f12965g + f10) % i10 : 0.0f;
        this.f12965g = f12;
        int i11 = this.f12964f;
        this.h = i11 >= 2 ? (this.h + f11) % i11 : 0.0f;
        if (this.f12967j.f12973b) {
            this.f12960a.setTranslationX(f12);
            this.f12960a.setTranslationY(this.h);
            for (RenderNode renderNode : this.f12962c) {
                renderNode.setTranslationX(-this.f12965g);
                renderNode.setTranslationY(-this.h);
            }
        }
    }

    public final void c(float f10) {
        this.f12961b[0].setRenderEffect(RenderEffect.createBlurEffect(e.a(f10, this.f12963e), e.a(f10, this.f12964f), Shader.TileMode.CLAMP));
    }

    public final void d(float f10, RenderEffect renderEffect) {
        this.f12961b[0].setRenderEffect(RenderEffect.createChainEffect(RenderEffect.createBlurEffect(e.a(f10, this.f12963e), e.a(f10, this.f12964f), Shader.TileMode.CLAMP), renderEffect));
    }

    public final void e(RenderEffect renderEffect) {
        this.f12961b[1].setRenderEffect(renderEffect);
    }
}
