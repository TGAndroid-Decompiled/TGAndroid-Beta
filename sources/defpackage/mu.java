package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
public final class mu {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final nu c;

    public mu(nu nuVar) {
        this.c = nuVar;
    }

    public final float a(int i, int i2, float[] fArr) {
        float f = 0.0f;
        while (i < i2) {
            f += fArr[i];
            i++;
        }
        return 1000.0f / f;
    }
}
