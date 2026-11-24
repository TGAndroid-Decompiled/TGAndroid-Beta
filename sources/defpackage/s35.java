package defpackage;
public final class s35 implements Runnable {
    public final byte a;
    public final u35 b;
    public final String c;

    public s35(u35 u35Var, String str, byte b) {
        this.a = b;
        this.b = u35Var;
        this.c = str;
    }

    @Override
    public final void run() {
        byte b = this.a;
        String str = this.c;
        u35 u35Var = this.b;
        switch (b) {
            case 0:
                u35Var.a(str);
                return;
            default:
                u35Var.a(str);
                return;
        }
    }
}
