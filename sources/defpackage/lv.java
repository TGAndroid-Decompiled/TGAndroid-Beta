package defpackage;

import java.util.ArrayList;
import java.util.HashMap;
public final class lv {
    public final ArrayList a = new ArrayList();
    public final HashMap b = new HashMap();
    public final mv c;

    public lv(mv mvVar) {
        this.c = mvVar;
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
