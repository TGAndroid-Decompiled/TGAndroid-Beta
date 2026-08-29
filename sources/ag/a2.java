package ag;
public final class a2 {
    public double f414a;
    public double f415b;

    public a2(double d, double d10) {
        this.f414a = d;
        this.f415b = d10;
    }

    public final double a(double d, double d10) {
        return Math.sqrt(Math.pow(d10 - this.f415b, 2.0d) + Math.pow(d - this.f414a, 2.0d));
    }
}
