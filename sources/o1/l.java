package o1;
public final class l {
    public double f17623a;
    public double f17624b;
    public boolean f17625c;
    public double d;
    public double e;
    public double f17626f;
    public double f17627g;
    public double h;
    public double f17628i;
    public final e f17629j;

    public l() {
        this.f17623a = Math.sqrt(1500.0d);
        this.f17624b = 0.5d;
        this.f17625c = false;
        this.f17628i = Double.MAX_VALUE;
        this.f17629j = new Object();
    }

    public final void a(float f7) {
        if (f7 >= 0.0f) {
            this.f17624b = f7;
            this.f17625c = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final void b(float f7) {
        if (f7 > 0.0f) {
            this.f17623a = Math.sqrt(f7);
            this.f17625c = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public final e c(double d, double d10, long j10) {
        double sin;
        double cos;
        if (!this.f17625c) {
            if (this.f17628i != Double.MAX_VALUE) {
                double d11 = this.f17624b;
                if (d11 > 1.0d) {
                    double d12 = this.f17623a;
                    this.f17626f = (Math.sqrt((d11 * d11) - 1.0d) * d12) + ((-d11) * d12);
                    double d13 = this.f17624b;
                    double d14 = this.f17623a;
                    this.f17627g = ((-d13) * d14) - (Math.sqrt((d13 * d13) - 1.0d) * d14);
                } else if (d11 >= 0.0d && d11 < 1.0d) {
                    this.h = Math.sqrt(1.0d - (d11 * d11)) * this.f17623a;
                }
                this.f17625c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d15 = j10 / 1000.0d;
        double d16 = d - this.f17628i;
        double d17 = this.f17624b;
        int i10 = (d17 > 1.0d ? 1 : (d17 == 1.0d ? 0 : -1));
        if (i10 > 0) {
            double d18 = this.f17627g;
            double d19 = ((d18 * d16) - d10) / (d18 - this.f17626f);
            double d20 = d16 - d19;
            sin = (Math.pow(2.718281828459045d, this.f17626f * d15) * d19) + (Math.pow(2.718281828459045d, d18 * d15) * d20);
            double d21 = this.f17627g;
            double pow = Math.pow(2.718281828459045d, d21 * d15) * d20 * d21;
            double d22 = this.f17626f;
            cos = (Math.pow(2.718281828459045d, d22 * d15) * d19 * d22) + pow;
        } else if (i10 == 0) {
            double d23 = this.f17623a;
            double d24 = (d23 * d16) + d10;
            double d25 = (d24 * d15) + d16;
            double pow2 = Math.pow(2.718281828459045d, (-d23) * d15) * d25;
            double pow3 = Math.pow(2.718281828459045d, (-this.f17623a) * d15) * d25;
            double d26 = -this.f17623a;
            cos = (Math.pow(2.718281828459045d, d26 * d15) * d24) + (pow3 * d26);
            sin = pow2;
        } else {
            double d27 = 1.0d / this.h;
            double d28 = this.f17623a;
            double d29 = ((d17 * d28 * d16) + d10) * d27;
            sin = ((Math.sin(this.h * d15) * d29) + (Math.cos(this.h * d15) * d16)) * Math.pow(2.718281828459045d, (-d17) * d28 * d15);
            double d30 = this.f17623a;
            double d31 = this.f17624b;
            double d32 = (-d30) * sin * d31;
            double pow4 = Math.pow(2.718281828459045d, (-d31) * d30 * d15);
            double d33 = this.h;
            double sin2 = Math.sin(d33 * d15) * (-d33) * d16;
            double d34 = this.h;
            cos = (((Math.cos(d34 * d15) * d29 * d34) + sin2) * pow4) + d32;
        }
        e eVar = this.f17629j;
        eVar.f17602a = (float) (sin + this.f17628i);
        eVar.f17603b = (float) cos;
        return eVar;
    }

    public l(float f7) {
        this.f17623a = Math.sqrt(1500.0d);
        this.f17624b = 0.5d;
        this.f17625c = false;
        this.f17629j = new Object();
        this.f17628i = f7;
    }
}
