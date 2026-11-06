package fi;
public final class f extends gh.b {
    public final int f11946s;

    public f(int i7, org.telegram.ui.ActionBar.f6 f6Var) {
        super(i7, f6Var);
        this.f11946s = 2;
    }

    @Override
    public int A() {
        switch (this.f11946s) {
            case 2:
                if (c()) {
                    return 117440511;
                }
                return 285212672;
            default:
                return super.A();
        }
    }

    @Override
    public int O() {
        switch (this.f11946s) {
            case 2:
                if (c()) {
                    return 301989887;
                }
                return 536870912;
            default:
                return super.O();
        }
    }

    @Override
    public int R0() {
        switch (this.f11946s) {
            case 2:
                if (c()) {
                    return 83886079;
                }
                return 536870912;
            default:
                return super.R0();
        }
    }

    @Override
    public boolean c() {
        switch (this.f11946s) {
            case 0:
                return true;
            case 1:
                return true;
            default:
                return super.c();
        }
    }

    public f(org.telegram.ui.ActionBar.f6 f6Var, int i7, float f10, int i10) {
        super(f6Var, i7, f10);
        this.f11946s = i10;
    }
}
