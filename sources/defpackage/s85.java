package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import org.telegram.ui.LaunchActivity;
public final class s85 extends ema {
    public LinearGradient N0;
    public int O0;
    public final Matrix P0;
    public float Q0;
    public float R0;
    public float S0;
    public float T0;
    public float U0;
    public long V0;
    public final j95 W0;

    public s85(j95 j95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.W0 = j95Var;
        this.P0 = new Matrix();
        this.Q0 = -1.0f;
    }

    @Override
    public final void d(int i) {
        super.d(i);
        int textWidth = getTextWidth();
        if (textWidth != this.O0) {
            float f = textWidth;
            this.U0 = 1.3f * f;
            float f2 = f * 2.0f;
            int w0 = aob.w0(null, aob.Zh, false);
            int w02 = aob.w0(null, aob.bi, false);
            int i2 = aob.ai;
            this.N0 = new LinearGradient(0.0f, getTextHeight(), f2, 0.0f, new int[]{w0, w02, aob.w0(null, i2, false), aob.w0(null, i2, false)}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
            getPaint().setShader(this.N0);
            this.O0 = textWidth;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.s85.onDraw(android.graphics.Canvas):void");
    }
}
