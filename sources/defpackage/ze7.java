package defpackage;

import android.graphics.RuntimeShader;
import java.util.Arrays;
public final class ze7 {
    public final RuntimeShader a;
    public final float[] b = {1.0f, 1.0f, 0.0f, 0.0f};
    public final float[] c = {1.0f, 1.0f, 0.0f, 0.0f};

    public ze7(int i) {
        nm3.c();
        this.a = nm3.b(gl.v2(null, i));
    }

    public final void a(float[] fArr) {
        float[] fArr2 = this.b;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.a.setFloatUniform("transformGradient", fArr2);
        }
    }

    public final void b(float[] fArr) {
        float[] fArr2 = this.c;
        if (!Arrays.equals(fArr, fArr2)) {
            System.arraycopy(fArr, 0, fArr2, 0, 4);
            this.a.setFloatUniform("transformPattern", fArr2);
        }
    }
}
