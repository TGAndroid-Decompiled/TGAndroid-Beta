package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Shader;
import org.telegram.ui.LaunchActivity;
public final class o85 extends lka {
    public LinearGradient N0;
    public int O0;
    public final Matrix P0;
    public float Q0;
    public float R0;
    public float S0;
    public float T0;
    public float U0;
    public long V0;
    public final g95 W0;

    public o85(g95 g95Var, LaunchActivity launchActivity) {
        super(launchActivity);
        this.W0 = g95Var;
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
            int w0 = cmb.w0(null, cmb.Yh, false);
            int w02 = cmb.w0(null, cmb.ai, false);
            int i2 = cmb.Zh;
            this.N0 = new LinearGradient(0.0f, getTextHeight(), f2, 0.0f, new int[]{w0, w02, cmb.w0(null, i2, false), cmb.w0(null, i2, false)}, new float[]{0.0f, 0.38f, 0.76f, 1.0f}, Shader.TileMode.CLAMP);
            getPaint().setShader(this.N0);
            this.O0 = textWidth;
        }
    }

    @Override
    public final void onDraw(android.graphics.Canvas r13) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o85.onDraw(android.graphics.Canvas):void");
    }
}
