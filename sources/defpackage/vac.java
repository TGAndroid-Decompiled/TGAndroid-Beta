package defpackage;

import android.util.Range;
public final class vac {
    public long a;
    public long b;
    public double c;
    public Range d;

    public vac() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d));
        this.d = range;
        this.c = ((Double) range.getUpper()).doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public final void a(long j, long j2) {
        boolean z;
        double doubleValue;
        long j3;
        boolean z2 = false;
        if (j != -9223372036854775807L) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        if (j2 != -9223372036854775807L) {
            z2 = true;
        }
        gre.f(z2);
        long j4 = this.a;
        if (j4 != -9223372036854775807L) {
            if (this.b != -9223372036854775807L && j != j4) {
                doubleValue = (j2 - j3) / (j - j4);
                this.c = (((Double) this.d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.c * 0.800000011920929d);
                this.a = j;
                this.b = j2;
            }
        }
        doubleValue = ((Double) this.d.getUpper()).doubleValue();
        this.c = (((Double) this.d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.c * 0.800000011920929d);
        this.a = j;
        this.b = j2;
    }

    public final void b() {
        this.c = ((Double) this.d.getUpper()).doubleValue();
        this.a = -9223372036854775807L;
        this.b = -9223372036854775807L;
    }

    public final void c(float f) {
        boolean z;
        if (f > 0.0f) {
            z = true;
        } else {
            z = false;
        }
        gre.f(z);
        this.d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f));
        b();
    }
}
