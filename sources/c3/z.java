package c3;

import android.util.Range;
import b8.zb;
public final class z {
    public long f4134a;
    public long f4135b;
    public double f4136c;
    public Range d;

    public z() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / 1.0f));
        this.d = range;
        this.f4136c = ((Double) range.getUpper()).doubleValue();
        this.f4134a = -9223372036854775807L;
        this.f4135b = -9223372036854775807L;
    }

    public final void a(long j10, long j11) {
        boolean z10;
        double doubleValue;
        long j12;
        boolean z11 = false;
        if (j10 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        if (j11 != -9223372036854775807L) {
            z11 = true;
        }
        zb.f(z11);
        long j13 = this.f4134a;
        if (j13 != -9223372036854775807L) {
            if (this.f4135b != -9223372036854775807L && j10 != j13) {
                doubleValue = (j11 - j12) / (j10 - j13);
                this.f4136c = (((Double) this.d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.f4136c * 0.800000011920929d);
                this.f4134a = j10;
                this.f4135b = j11;
            }
        }
        doubleValue = ((Double) this.d.getUpper()).doubleValue();
        this.f4136c = (((Double) this.d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.f4136c * 0.800000011920929d);
        this.f4134a = j10;
        this.f4135b = j11;
    }

    public final void b() {
        this.f4136c = ((Double) this.d.getUpper()).doubleValue();
        this.f4134a = -9223372036854775807L;
        this.f4135b = -9223372036854775807L;
    }

    public final void c(float f10) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        zb.f(z10);
        this.d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f10));
        b();
    }
}
