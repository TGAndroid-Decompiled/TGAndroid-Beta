package c0;
public final class b extends Throwable {
    public final int f2724a;

    public b(String str, int i10) {
        super(str);
        this.f2724a = i10;
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

    @Override
    public final synchronized Throwable fillInStackTrace() {
        switch (this.f2724a) {
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
            default:
                e();
                return this;
        }
    }
}
