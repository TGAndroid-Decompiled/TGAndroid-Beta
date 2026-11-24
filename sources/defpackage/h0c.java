package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
public final class h0c extends ShapeDrawable.ShaderFactory {
    public final ll5 a;

    public h0c(ll5 ll5Var) {
        this.a = ll5Var;
    }

    @Override
    public final Shader resize(int i, int i2) {
        ll5 ll5Var = this.a;
        return new LinearGradient(0.0f, 0.0f, 0.0f, i2, ll5Var.a, ll5Var.b, Shader.TileMode.CLAMP);
    }
}
