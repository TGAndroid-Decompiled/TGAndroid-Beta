package d3;

import a8.ma;
import android.util.Range;
public final class y {
    public long f7768a;
    public long f7769b;
    public double f7770c;
    public Range d;

    public y() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / 1.0f));
        this.d = range;
        this.f7770c = ((Double) range.getUpper()).doubleValue();
        this.f7768a = -9223372036854775807L;
        this.f7769b = -9223372036854775807L;
    }

    public final void a(long j3, long j10) {
        boolean z10;
        double doubleValue;
        long j11;
        boolean z11 = false;
        if (j3 != -9223372036854775807L) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        if (j10 != -9223372036854775807L) {
            z11 = true;
        }
        ma.f(z11);
        long j12 = this.f7768a;
        if (j12 != -9223372036854775807L) {
            if (this.f7769b != -9223372036854775807L && j3 != j12) {
                doubleValue = (j10 - j11) / (j3 - j12);
                this.f7770c = (((Double) this.d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.f7770c * 0.800000011920929d);
                this.f7768a = j3;
                this.f7769b = j10;
            }
        }
        doubleValue = ((Double) this.d.getUpper()).doubleValue();
        this.f7770c = (((Double) this.d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.f7770c * 0.800000011920929d);
        this.f7768a = j3;
        this.f7769b = j10;
    }

    public final void b() {
        this.f7770c = ((Double) this.d.getUpper()).doubleValue();
        this.f7768a = -9223372036854775807L;
        this.f7769b = -9223372036854775807L;
    }

    public final void c(float f10) {
        boolean z10;
        if (f10 > 0.0f) {
            z10 = true;
        } else {
            z10 = false;
        }
        ma.f(z10);
        this.d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f10));
        b();
    }
}
