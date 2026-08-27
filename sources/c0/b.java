package c0;

public final class b extends Throwable {

    public final int f2194a;

    public b(String str, int i10) {
        super(str);
        this.f2194a = i10;
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
        switch (this.f2194a) {
            case 0:
                a();
                break;
            case 1:
                b();
                break;
            case 2:
                c();
                break;
            case 3:
                d();
                break;
            default:
                e();
                break;
        }
        return this;
    }
}
