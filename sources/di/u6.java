package di;

import org.telegram.messenger.y10;
public final class u6 implements y10 {
    public final int f9865a = 1;
    public final y8 f9866b;
    public final int f9867c;
    public final y10 d;
    public final boolean[] f9868e;
    public final y10 f9869f;

    public u6(y8 y8Var, int i7, y10 y10Var, boolean[] zArr, y10 y10Var2) {
        this.f9866b = y8Var;
        this.f9867c = i7;
        this.d = y10Var;
        this.f9868e = zArr;
        this.f9869f = y10Var2;
    }

    @Override
    public final void a(Object obj) {
        String str;
        String str2;
        Boolean bool = (Boolean) obj;
        switch (this.f9865a) {
            case 0:
                this.f9868e[0] = true;
                if (this.f9867c > 0) {
                    this.f9866b.Q();
                }
                y10 y10Var = this.d;
                if (y10Var != null) {
                    if (bool.booleanValue()) {
                        str = "paid";
                    } else {
                        str = "failed";
                    }
                    y10Var.a(str);
                }
                y10 y10Var2 = this.f9869f;
                if (y10Var2 != null) {
                    y10Var2.a(Boolean.TRUE);
                    return;
                }
                return;
            default:
                if (this.f9867c > 0) {
                    this.f9866b.Q();
                }
                y10 y10Var3 = this.d;
                if (y10Var3 != null) {
                    y10Var3.a(Boolean.TRUE);
                }
                this.f9868e[0] = true;
                y10 y10Var4 = this.f9869f;
                if (y10Var4 != null) {
                    if (bool.booleanValue()) {
                        str2 = "paid";
                    } else {
                        str2 = "failed";
                    }
                    y10Var4.a(str2);
                    return;
                }
                return;
        }
    }

    public u6(y8 y8Var, boolean[] zArr, int i7, y10 y10Var, y10 y10Var2) {
        this.f9866b = y8Var;
        this.f9868e = zArr;
        this.f9867c = i7;
        this.d = y10Var;
        this.f9869f = y10Var2;
    }
}
