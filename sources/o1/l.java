package o1;
public final class l {
    public double f19046a;
    public double f19047b;
    public boolean f19048c;
    public double d;
    public double f19049e;
    public double f19050f;
    public double f19051g;
    public double h;
    public double f19052i;
    public final f f19053j;

    public l() {
        this.f19046a = Math.sqrt(1500.0d);
        this.f19047b = 0.5d;
        this.f19048c = false;
        this.f19052i = Double.MAX_VALUE;
        this.f19053j = new Object();
    }

    public final void a(float f9) {
        if (f9 >= 0.0f) {
            this.f19047b = f9;
            this.f19048c = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final void b(float f9) {
        if (f9 > 0.0f) {
            this.f19046a = Math.sqrt(f9);
            this.f19048c = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public final f c(double d, double d10, long j10) {
        double sin;
        double cos;
        if (!this.f19048c) {
            if (this.f19052i != Double.MAX_VALUE) {
                double d11 = this.f19047b;
                if (d11 > 1.0d) {
                    double d12 = this.f19046a;
                    this.f19050f = (Math.sqrt((d11 * d11) - 1.0d) * d12) + ((-d11) * d12);
                    double d13 = this.f19047b;
                    double d14 = this.f19046a;
                    this.f19051g = ((-d13) * d14) - (Math.sqrt((d13 * d13) - 1.0d) * d14);
                } else if (d11 >= 0.0d && d11 < 1.0d) {
                    this.h = Math.sqrt(1.0d - (d11 * d11)) * this.f19046a;
                }
                this.f19048c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d15 = j10 / 1000.0d;
        double d16 = d - this.f19052i;
        double d17 = this.f19047b;
        int i10 = (d17 > 1.0d ? 1 : (d17 == 1.0d ? 0 : -1));
        if (i10 > 0) {
            double d18 = this.f19051g;
            double d19 = ((d18 * d16) - d10) / (d18 - this.f19050f);
            double d20 = d16 - d19;
            sin = (Math.pow(2.718281828459045d, this.f19050f * d15) * d19) + (Math.pow(2.718281828459045d, d18 * d15) * d20);
            double d21 = this.f19051g;
            double pow = Math.pow(2.718281828459045d, d21 * d15) * d20 * d21;
            double d22 = this.f19050f;
            cos = (Math.pow(2.718281828459045d, d22 * d15) * d19 * d22) + pow;
        } else if (i10 == 0) {
            double d23 = this.f19046a;
            double d24 = (d23 * d16) + d10;
            double d25 = (d24 * d15) + d16;
            double pow2 = Math.pow(2.718281828459045d, (-d23) * d15) * d25;
            double pow3 = Math.pow(2.718281828459045d, (-this.f19046a) * d15) * d25;
            double d26 = -this.f19046a;
            cos = (Math.pow(2.718281828459045d, d26 * d15) * d24) + (pow3 * d26);
            sin = pow2;
        } else {
            double d27 = 1.0d / this.h;
            double d28 = this.f19046a;
            double d29 = ((d17 * d28 * d16) + d10) * d27;
            sin = ((Math.sin(this.h * d15) * d29) + (Math.cos(this.h * d15) * d16)) * Math.pow(2.718281828459045d, (-d17) * d28 * d15);
            double d30 = this.f19046a;
            double d31 = this.f19047b;
            double d32 = (-d30) * sin * d31;
            double pow4 = Math.pow(2.718281828459045d, (-d31) * d30 * d15);
            double d33 = this.h;
            double sin2 = Math.sin(d33 * d15) * (-d33) * d16;
            double d34 = this.h;
            cos = (((Math.cos(d34 * d15) * d29 * d34) + sin2) * pow4) + d32;
        }
        f fVar = this.f19053j;
        fVar.f19025a = (float) (sin + this.f19052i);
        fVar.f19026b = (float) cos;
        return fVar;
    }

    public l(float f9) {
        this.f19046a = Math.sqrt(1500.0d);
        this.f19047b = 0.5d;
        this.f19048c = false;
        this.f19053j = new Object();
        this.f19052i = f9;
    }
}
