package c0;
public final class b extends Throwable {
    public final int f2055a;

    public b(String str, int i9) {
        super(str);
        this.f2055a = i9;
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
        switch (this.f2055a) {
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
