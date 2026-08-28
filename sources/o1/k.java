package o1;
public final class k {
    public double f18801a;
    public double f18802b;
    public boolean f18803c;
    public double d;
    public double f18804e;
    public double f18805f;
    public double f18806g;
    public double h;
    public double f18807i;
    public final e f18808j;

    public k() {
        this.f18801a = Math.sqrt(1500.0d);
        this.f18802b = 0.5d;
        this.f18803c = false;
        this.f18807i = Double.MAX_VALUE;
        this.f18808j = new Object();
    }

    public final void a(float f10) {
        if (f10 >= 0.0f) {
            this.f18802b = f10;
            this.f18803c = false;
            return;
        }
        throw new IllegalArgumentException("Damping ratio must be non-negative");
    }

    public final void b(float f10) {
        if (f10 > 0.0f) {
            this.f18801a = Math.sqrt(f10);
            this.f18803c = false;
            return;
        }
        throw new IllegalArgumentException("Spring stiffness constant must be positive.");
    }

    public final e c(double d, double d9, long j10) {
        double sin;
        double cos;
        if (!this.f18803c) {
            if (this.f18807i != Double.MAX_VALUE) {
                double d10 = this.f18802b;
                if (d10 > 1.0d) {
                    double d11 = this.f18801a;
                    this.f18805f = (Math.sqrt((d10 * d10) - 1.0d) * d11) + ((-d10) * d11);
                    double d12 = this.f18802b;
                    double d13 = this.f18801a;
                    this.f18806g = ((-d12) * d13) - (Math.sqrt((d12 * d12) - 1.0d) * d13);
                } else if (d10 >= 0.0d && d10 < 1.0d) {
                    this.h = Math.sqrt(1.0d - (d10 * d10)) * this.f18801a;
                }
                this.f18803c = true;
            } else {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
        }
        double d14 = j10 / 1000.0d;
        double d15 = d - this.f18807i;
        double d16 = this.f18802b;
        int i9 = (d16 > 1.0d ? 1 : (d16 == 1.0d ? 0 : -1));
        if (i9 > 0) {
            double d17 = this.f18806g;
            double d18 = ((d17 * d15) - d9) / (d17 - this.f18805f);
            double d19 = d15 - d18;
            sin = (Math.pow(2.718281828459045d, this.f18805f * d14) * d18) + (Math.pow(2.718281828459045d, d17 * d14) * d19);
            double d20 = this.f18806g;
            double pow = Math.pow(2.718281828459045d, d20 * d14) * d19 * d20;
            double d21 = this.f18805f;
            cos = (Math.pow(2.718281828459045d, d21 * d14) * d18 * d21) + pow;
        } else if (i9 == 0) {
            double d22 = this.f18801a;
            double d23 = (d22 * d15) + d9;
            double d24 = (d23 * d14) + d15;
            double pow2 = Math.pow(2.718281828459045d, (-d22) * d14) * d24;
            double pow3 = Math.pow(2.718281828459045d, (-this.f18801a) * d14) * d24;
            double d25 = -this.f18801a;
            cos = (Math.pow(2.718281828459045d, d25 * d14) * d23) + (pow3 * d25);
            sin = pow2;
        } else {
            double d26 = 1.0d / this.h;
            double d27 = this.f18801a;
            double d28 = ((d16 * d27 * d15) + d9) * d26;
            sin = ((Math.sin(this.h * d14) * d28) + (Math.cos(this.h * d14) * d15)) * Math.pow(2.718281828459045d, (-d16) * d27 * d14);
            double d29 = this.f18801a;
            double d30 = this.f18802b;
            double d31 = (-d29) * sin * d30;
            double pow4 = Math.pow(2.718281828459045d, (-d30) * d29 * d14);
            double d32 = this.h;
            double sin2 = Math.sin(d32 * d14) * (-d32) * d15;
            double d33 = this.h;
            cos = (((Math.cos(d33 * d14) * d28 * d33) + sin2) * pow4) + d31;
        }
        e eVar = this.f18808j;
        eVar.f18780a = (float) (sin + this.f18807i);
        eVar.f18781b = (float) cos;
        return eVar;
    }

    public k(float f10) {
        this.f18801a = Math.sqrt(1500.0d);
        this.f18802b = 0.5d;
        this.f18803c = false;
        this.f18808j = new Object();
        this.f18807i = f10;
    }
}
