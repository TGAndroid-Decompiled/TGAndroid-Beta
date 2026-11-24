package defpackage;

import android.graphics.Paint;
public final class ms8 {
    public Paint a;
    public Paint b;
    public float c;
    public int d;
    public int e;
    public float f;

    public final void a(float f) {
        this.c = f;
        if (f < 0.0f) {
            this.c = 0.0f;
        } else if (f > 1.0f) {
            this.c = 1.0f;
        }
    }
}
