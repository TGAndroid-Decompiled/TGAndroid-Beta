package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
public final class g2c extends ShapeDrawable.ShaderFactory {
    public final ol5 a;

    public g2c(ol5 ol5Var) {
        this.a = ol5Var;
    }

    @Override
    public final Shader resize(int i, int i2) {
        ol5 ol5Var = this.a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i2, ol5Var.a, ol5Var.b, Shader.TileMode.CLAMP);
    }
}
