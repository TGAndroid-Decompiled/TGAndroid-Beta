package o1;
public final class l {
    public double f15538a;
    public double f15539b;
    public boolean f15540c;
    public double d;
    public double e;
    public double f15541f;
    public double f15542g;
    public double h;
    public double f15543i;
    public final e f15544j;

    public l() {
        this.f15538a = Math.sqrt(1500.0d);
        this.f15539b = 0.5d;
        this.f15540c = false;
        this.f15543i = Double.MAX_VALUE;
        this.f15544j = new Object();
    }

    public final void a(float f7) {
        if (f7 >= 0.0f) {
            this.f15539b = f7;
            this.f15540c = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final void b(float f7) {
        if (f7 > 0.0f) {
            this.f15538a = Math.sqrt(f7);
            this.f15540c = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public final e c(double d, double d10, long j3) {
        double sin;
        double cos;
        if (!this.f15540c) {
            if (this.f15543i != Double.MAX_VALUE) {
                double d11 = this.f15539b;
                if (d11 > 1.0d) {
                    double d12 = this.f15538a;
                    this.f15541f = (Math.sqrt((d11 * d11) - 1.0d) * d12) + ((-d11) * d12);
                    double d13 = this.f15539b;
                    double d14 = this.f15538a;
                    this.f15542g = ((-d13) * d14) - (Math.sqrt((d13 * d13) - 1.0d) * d14);
                } else if (d11 >= 0.0d && d11 < 1.0d) {
                    this.h = Math.sqrt(1.0d - (d11 * d11)) * this.f15538a;
                }
                this.f15540c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d15 = j3 / 1000.0d;
        double d16 = d - this.f15543i;
        double d17 = this.f15539b;
        int i10 = (d17 > 1.0d ? 1 : (d17 == 1.0d ? 0 : -1));
        if (i10 > 0) {
            double d18 = this.f15542g;
            double d19 = ((d18 * d16) - d10) / (d18 - this.f15541f);
            double d20 = d16 - d19;
            sin = (Math.pow(2.718281828459045d, this.f15541f * d15) * d19) + (Math.pow(2.718281828459045d, d18 * d15) * d20);
            double d21 = this.f15542g;
            double pow = Math.pow(2.718281828459045d, d21 * d15) * d20 * d21;
            double d22 = this.f15541f;
            cos = (Math.pow(2.718281828459045d, d22 * d15) * d19 * d22) + pow;
        } else if (i10 == 0) {
            double d23 = this.f15538a;
            double d24 = (d23 * d16) + d10;
            double d25 = (d24 * d15) + d16;
            double pow2 = Math.pow(2.718281828459045d, (-d23) * d15) * d25;
            double pow3 = Math.pow(2.718281828459045d, (-this.f15538a) * d15) * d25;
            double d26 = -this.f15538a;
            cos = (Math.pow(2.718281828459045d, d26 * d15) * d24) + (pow3 * d26);
            sin = pow2;
        } else {
            double d27 = 1.0d / this.h;
            double d28 = this.f15538a;
            double d29 = ((d17 * d28 * d16) + d10) * d27;
            sin = ((Math.sin(this.h * d15) * d29) + (Math.cos(this.h * d15) * d16)) * Math.pow(2.718281828459045d, (-d17) * d28 * d15);
            double d30 = this.f15538a;
            double d31 = this.f15539b;
            double d32 = (-d30) * sin * d31;
            double pow4 = Math.pow(2.718281828459045d, (-d31) * d30 * d15);
            double d33 = this.h;
            double sin2 = Math.sin(d33 * d15) * (-d33) * d16;
            double d34 = this.h;
            cos = (((Math.cos(d34 * d15) * d29 * d34) + sin2) * pow4) + d32;
        }
        e eVar = this.f15544j;
        eVar.f15517a = (float) (sin + this.f15543i);
        eVar.f15518b = (float) cos;
        return eVar;
    }

    public l(float f7) {
        this.f15538a = Math.sqrt(1500.0d);
        this.f15539b = 0.5d;
        this.f15540c = false;
        this.f15544j = new Object();
        this.f15543i = f7;
    }
}
