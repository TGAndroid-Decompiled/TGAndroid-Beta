package defpackage;

import android.graphics.Color;
import org.telegram.messenger.Utilities;
public final class qc {
    public final float a;
    public final hi2 b;
    public final hi2 c;

    public qc(float f) {
        this.a = f;
        this.b = a(10.0f * f, new pc(f, (byte) 0));
        this.c = a(4.0f * f, new pc(f, (byte) 1));
    }

    public static hi2 a(float f, pc pcVar) {
        float pow;
        float[] fArr = new float[32];
        int[] iArr = new int[32];
        for (int i = 0; i < 32; i++) {
            float f2 = (i * f) / 31.0f;
            fArr[i] = f2;
            switch (pcVar.a) {
                case 0:
                    pow = (float) Math.pow(Math.max(0.0d, 1.0d - (f2 / (pcVar.b * 10.0f))), 2.2d);
                    break;
                default:
                    pow = (((float) Math.exp((-f2) / (pcVar.b * 0.9f))) - 0.011743626f) / 0.9882564f;
                    break;
            }
            iArr[i] = Color.argb(Math.round(Utilities.i(pow, 1.0f, 0.0f) * 255.0f), 255, 255, 255);
        }
        return new hi2(fArr, iArr, (byte) 4);
    }
}
