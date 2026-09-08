package c0;
public final class b extends Throwable {
    public final int f4130a;

    public b(String str, int i10) {
        super(str);
        this.f4130a = i10;
    }

    private final synchronized Throwable a() {
        return this;
    }

    private final synchronized Throwable b() {
        return this;
    }

    private final synchronized Throwable c() {
        return this;
    }

    private final synchronized Throwable d() {
        return this;
    }

    private final synchronized Throwable e() {
        return this;
    }

    private final synchronized Throwable f() {
        return this;
    }

    @Override
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f4130a) {
            case 0:
                a();
                return this;
            case 1:
                b();
                return this;
            case 2:
                c();
                return this;
            case 3:
                d();
                return this;
            case 4:
                e();
                return this;
            default:
                f();
                return this;
        }
    }
}
