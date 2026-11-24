package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
public final class gyb extends ShapeDrawable.ShaderFactory {
    public final mj5 a;

    public gyb(mj5 mj5Var) {
        this.a = mj5Var;
    }

    @Override
    public final Shader resize(int i, int i2) {
        mj5 mj5Var = this.a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i2, mj5Var.a, mj5Var.b, Shader.TileMode.CLAMP);
    }
}
