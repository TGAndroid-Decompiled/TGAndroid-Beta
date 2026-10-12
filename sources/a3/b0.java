package a3;

import android.util.Range;
import v7.u6;
public final class b0 {
    public long f69a;
    public long f70b;
    public double f71c;
    public Range d;

    public b0() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / 1.0f));
        this.d = range;
        this.f71c = ((Double) range.getUpper()).doubleValue();
        this.f69a = -9223372036854775807L;
        this.f70b = -9223372036854775807L;
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
        u6.g(z10);
        if (j11 != -9223372036854775807L) {
            z11 = true;
        }
        u6.g(z11);
        long j13 = this.f69a;
        if (j13 != -9223372036854775807L) {
            if (this.f70b != -9223372036854775807L && j10 != j13) {
                doubleValue = (j11 - j12) / (j10 - j13);
                this.f71c = (((Double) this.d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.f71c * 0.800000011920929d);
                this.f69a = j10;
                this.f70b = j11;
            }
        }
        doubleValue = ((Double) this.d.getUpper()).doubleValue();
        this.f71c = (((Double) this.d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.f71c * 0.800000011920929d);
        this.f69a = j10;
        this.f70b = j11;
    }

    public final void b() {
        this.f71c = ((Double) this.d.getUpper()).doubleValue();
        this.f69a = -9223372036854775807L;
        this.f70b = -9223372036854775807L;
    }

    public final void c(float f7) {
        boolean z10;
        if (f7 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        u6.g(z10);
        this.d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f7));
        b();
    }
}
