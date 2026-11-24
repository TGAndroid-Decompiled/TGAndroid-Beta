package defpackage;

import org.telegram.tgnet.TLRPC;
public final class af2 implements qob {
    public final byte a;
    public final bf2 b;

    public af2(bf2 bf2Var, byte b) {
        this.a = b;
        this.b = bf2Var;
    }

    @Override
    public final void a(TLRPC.WallPaper wallPaper) {
        byte b = this.a;
        bf2 bf2Var = this.b;
        switch (b) {
            case 0:
                if2 if2Var = bf2Var.a;
                if2Var.R1.H();
                if2Var.dismiss();
                return;
            default:
                if2 if2Var2 = bf2Var.a;
                if2Var2.R1.H();
                if2Var2.dismiss();
                return;
        }
    }
}
