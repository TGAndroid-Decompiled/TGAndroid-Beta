package o1;
public final class l {
    public double f16984a;
    public double f16985b;
    public boolean f16986c;
    public double d;
    public double f16987e;
    public double f16988f;
    public double f16989g;
    public double h;
    public double f16990i;
    public final e f16991j;

    public l() {
        this.f16984a = Math.sqrt(1500.0d);
        this.f16985b = 0.5d;
        this.f16986c = false;
        this.f16990i = Double.MAX_VALUE;
        this.f16991j = new Object();
    }

    public final void a(float f7) {
        if (f7 >= 0.0f) {
            this.f16985b = f7;
            this.f16986c = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final void b(float f7) {
        if (f7 > 0.0f) {
            this.f16984a = Math.sqrt(f7);
            this.f16986c = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public final e c(double d, double d10, long j3) {
        double sin;
        double cos;
        if (!this.f16986c) {
            if (this.f16990i != Double.MAX_VALUE) {
                double d11 = this.f16985b;
                if (d11 > 1.0d) {
                    double d12 = this.f16984a;
                    this.f16988f = (Math.sqrt((d11 * d11) - 1.0d) * d12) + ((-d11) * d12);
                    double d13 = this.f16985b;
                    double d14 = this.f16984a;
                    this.f16989g = ((-d13) * d14) - (Math.sqrt((d13 * d13) - 1.0d) * d14);
                } else if (d11 >= 0.0d && d11 < 1.0d) {
                    this.h = Math.sqrt(1.0d - (d11 * d11)) * this.f16984a;
                }
                this.f16986c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d15 = j3 / 1000.0d;
        double d16 = d - this.f16990i;
        double d17 = this.f16985b;
        int i10 = (d17 > 1.0d ? 1 : (d17 == 1.0d ? 0 : -1));
        if (i10 > 0) {
            double d18 = this.f16989g;
            double d19 = ((d18 * d16) - d10) / (d18 - this.f16988f);
            double d20 = d16 - d19;
            sin = (Math.pow(2.718281828459045d, this.f16988f * d15) * d19) + (Math.pow(2.718281828459045d, d18 * d15) * d20);
            double d21 = this.f16989g;
            double pow = Math.pow(2.718281828459045d, d21 * d15) * d20 * d21;
            double d22 = this.f16988f;
            cos = (Math.pow(2.718281828459045d, d22 * d15) * d19 * d22) + pow;
        } else if (i10 == 0) {
            double d23 = this.f16984a;
            double d24 = (d23 * d16) + d10;
            double d25 = (d24 * d15) + d16;
            double pow2 = Math.pow(2.718281828459045d, (-d23) * d15) * d25;
            double pow3 = Math.pow(2.718281828459045d, (-this.f16984a) * d15) * d25;
            double d26 = -this.f16984a;
            cos = (Math.pow(2.718281828459045d, d26 * d15) * d24) + (pow3 * d26);
            sin = pow2;
        } else {
            double d27 = 1.0d / this.h;
            double d28 = this.f16984a;
            double d29 = ((d17 * d28 * d16) + d10) * d27;
            sin = ((Math.sin(this.h * d15) * d29) + (Math.cos(this.h * d15) * d16)) * Math.pow(2.718281828459045d, (-d17) * d28 * d15);
            double d30 = this.f16984a;
            double d31 = this.f16985b;
            double d32 = (-d30) * sin * d31;
            double pow4 = Math.pow(2.718281828459045d, (-d31) * d30 * d15);
            double d33 = this.h;
            double sin2 = Math.sin(d33 * d15) * (-d33) * d16;
            double d34 = this.h;
            cos = (((Math.cos(d34 * d15) * d29 * d34) + sin2) * pow4) + d32;
        }
        e eVar = this.f16991j;
        eVar.f16962a = (float) (sin + this.f16990i);
        eVar.f16963b = (float) cos;
        return eVar;
    }

    public l(float f7) {
        this.f16984a = Math.sqrt(1500.0d);
        this.f16985b = 0.5d;
        this.f16986c = false;
        this.f16991j = new Object();
        this.f16990i = f7;
    }
}
