package d3;

import a8.ia;
import android.util.Range;
public final class z {
    public long f8111a;
    public long f8112b;
    public double f8113c;
    public Range d;

    public z() {
        Range range = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / 1.0f));
        this.d = range;
        this.f8113c = ((Double) range.getUpper()).doubleValue();
        this.f8111a = -9223372036854775807L;
        this.f8112b = -9223372036854775807L;
    }

    public final void a(long j3, long j10) {
        boolean z9;
        double doubleValue;
        long j11;
        boolean z10 = false;
        if (j3 != -9223372036854775807L) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        if (j10 != -9223372036854775807L) {
            z10 = true;
        }
        ia.f(z10);
        long j12 = this.f8111a;
        if (j12 != -9223372036854775807L) {
            if (this.f8112b != -9223372036854775807L && j3 != j12) {
                doubleValue = (j10 - j11) / (j3 - j12);
                this.f8113c = (((Double) this.d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.f8113c * 0.800000011920929d);
                this.f8111a = j3;
                this.f8112b = j10;
            }
        }
        doubleValue = ((Double) this.d.getUpper()).doubleValue();
        this.f8113c = (((Double) this.d.clamp(Double.valueOf(doubleValue))).doubleValue() * 0.20000000298023224d) + (this.f8113c * 0.800000011920929d);
        this.f8111a = j3;
        this.f8112b = j10;
    }

    public final void b() {
        this.f8113c = ((Double) this.d.getUpper()).doubleValue();
        this.f8111a = -9223372036854775807L;
        this.f8112b = -9223372036854775807L;
    }

    public final void c(float f10) {
        boolean z9;
        if (f10 > 0.0f) {
            z9 = true;
        } else {
            z9 = false;
        }
        ia.f(z9);
        this.d = new Range(Double.valueOf(0.0d), Double.valueOf(1.0d / f10));
        b();
    }
}
