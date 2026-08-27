package o1;

public final class k {

    public double f19148a;

    public double f19149b;

    public boolean f19150c;
    public double d;

    public double f19151e;

    public double f19152f;

    public double f19153g;
    public double h;

    public double f19154i;

    public final e f19155j;

    public k() {
        this.f19148a = Math.sqrt(1500.0d);
        this.f19149b = 0.5d;
        this.f19150c = false;
        this.f19154i = Double.MAX_VALUE;
        this.f19155j = new e();
    }

    public final void a(float f10) {
        if (f10 < 0.0f) {
            throw new IllegalArgumentException("Damping ratio must be non-negative");
        }
        this.f19149b = f10;
        this.f19150c = false;
    }

    public final void b(float f10) {
        if (f10 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f19148a = Math.sqrt(f10);
        this.f19150c = false;
    }

    public final e c(double d, double d10, long j10) {
        double dSin;
        double dCos;
        if (!this.f19150c) {
            if (this.f19154i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d11 = this.f19149b;
            if (d11 > 1.0d) {
                double d12 = this.f19148a;
                this.f19152f = (Math.sqrt((d11 * d11) - 1.0d) * d12) + ((-d11) * d12);
                double d13 = this.f19149b;
                double d14 = this.f19148a;
                this.f19153g = ((-d13) * d14) - (Math.sqrt((d13 * d13) - 1.0d) * d14);
            } else if (d11 >= 0.0d && d11 < 1.0d) {
                this.h = Math.sqrt(1.0d - (d11 * d11)) * this.f19148a;
            }
            this.f19150c = true;
        }
        double d15 = j10 / 1000.0d;
        double d16 = d - this.f19154i;
        double d17 = this.f19149b;
        if (d17 > 1.0d) {
            double d18 = this.f19153g;
            double d19 = ((d18 * d16) - d10) / (d18 - this.f19152f);
            double d20 = d16 - d19;
            dSin = (Math.pow(2.718281828459045d, this.f19152f * d15) * d19) + (Math.pow(2.718281828459045d, d18 * d15) * d20);
            double d21 = this.f19153g;
            double dPow = Math.pow(2.718281828459045d, d21 * d15) * d20 * d21;
            double d22 = this.f19152f;
            dCos = (Math.pow(2.718281828459045d, d22 * d15) * d19 * d22) + dPow;
        } else if (d17 == 1.0d) {
            double d23 = this.f19148a;
            double d24 = (d23 * d16) + d10;
            double d25 = (d24 * d15) + d16;
            double dPow2 = Math.pow(2.718281828459045d, (-d23) * d15) * d25;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f19148a) * d15) * d25;
            double d26 = -this.f19148a;
            dCos = (Math.pow(2.718281828459045d, d26 * d15) * d24) + (dPow3 * d26);
            dSin = dPow2;
        } else {
            double d27 = 1.0d / this.h;
            double d28 = this.f19148a;
            double d29 = ((d17 * d28 * d16) + d10) * d27;
            dSin = ((Math.sin(this.h * d15) * d29) + (Math.cos(this.h * d15) * d16)) * Math.pow(2.718281828459045d, (-d17) * d28 * d15);
            double d30 = this.f19148a;
            double d31 = this.f19149b;
            double d32 = (-d30) * dSin * d31;
            double dPow4 = Math.pow(2.718281828459045d, (-d31) * d30 * d15);
            double d33 = this.h;
            double dSin2 = Math.sin(d33 * d15) * (-d33) * d16;
            double d34 = this.h;
            dCos = (((Math.cos(d34 * d15) * d29 * d34) + dSin2) * dPow4) + d32;
        }
        float f10 = (float) (dSin + this.f19154i);
        e eVar = this.f19155j;
        eVar.f19127a = f10;
        eVar.f19128b = (float) dCos;
        return eVar;
    }

    public k(float f10) {
        this.f19148a = Math.sqrt(1500.0d);
        this.f19149b = 0.5d;
        this.f19150c = false;
        this.f19155j = new e();
        this.f19154i = f10;
    }
}
