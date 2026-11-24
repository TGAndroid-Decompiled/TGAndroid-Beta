package defpackage;

import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
public final class tnc extends ShapeDrawable.ShaderFactory {
    @Override
    public final Shader resize(int i, int i2) {
        return new LinearGradient(0.0f, 0.0f, 0.0f, i2, -765355, -2148011, Shader.TileMode.CLAMP);
    }
}
