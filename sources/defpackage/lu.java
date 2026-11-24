package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
public final class lu {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final mu c;

    public lu(mu muVar) {
        this.c = muVar;
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
