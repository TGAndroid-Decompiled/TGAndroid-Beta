package defpackage;

import android.graphics.Canvas;
import android.graphics.RecordingCanvas;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
public final class br9 implements mz4, kl0 {
    public final RenderNode a;
    public final ye9 b;
    public boolean c;

    public br9(ye9 ye9Var) {
        RenderNode renderNode = new RenderNode("rtmpStreamGlass");
        this.a = renderNode;
        this.b = ye9Var;
        float max = Math.max(0.0f, ((((hl.N(9.0f) * 0.57735f) + 0.5f) / 5.0f) - 0.5f) / 0.57735f);
        renderNode.setRenderEffect(RenderEffect.createBlurEffect(max, max, Shader.TileMode.CLAMP));
        renderNode.setPivotX(0.0f);
        renderNode.setPivotY(0.0f);
        renderNode.setScaleX(5.0f);
        renderNode.setScaleY(5.0f);
    }

    public final void a(int i, int i2) {
        if (!this.c && i > 0 && i2 > 0 && vy4.f().a) {
            int i3 = (i + 4) / 5;
            int i4 = (i2 + 4) / 5;
            this.a.setPosition(0, 0, i3, i4);
            this.c = true;
            RecordingCanvas beginRecording = this.a.beginRecording(i3, i4);
            try {
                beginRecording.scale(0.2f, 0.2f);
                this.b.m(beginRecording);
            } finally {
                this.a.endRecording();
                this.c = false;
            }
        }
    }

    @Override
    public final jl0 b() {
        return new ar9(this);
    }

    @Override
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        canvas.save();
        canvas.clipRect(f, f2, f3, f4);
        if (vy4.f().a && canvas.isHardwareAccelerated()) {
            canvas.drawRenderNode(this.a);
        } else {
            canvas.drawColor(-14933463);
        }
        canvas.restore();
    }

    @Override
    public final void c(jl0 jl0Var) {
    }
}
