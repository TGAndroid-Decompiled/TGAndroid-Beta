package defpackage;
public final class u57 implements Runnable {
    public final byte a;
    public final j67 b;

    public u57(j67 j67Var, byte b) {
        this.a = b;
        this.b = j67Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        j67 j67Var = this.b;
        switch (b) {
            case 0:
                j67Var.l();
                return;
            case 1:
                j67Var.getClass();
                qna.f(false);
                qna qnaVar = j67Var.i0;
                if (qnaVar != null) {
                    qnaVar.b(j67Var.F);
                }
                gm.c3(new u57(j67Var, (byte) 0));
                return;
            case 2:
                qna.f(false);
                qna qnaVar2 = j67Var.i0;
                if (qnaVar2 != null) {
                    qnaVar2.b(j67Var.F);
                }
                gm.c3(new u57(j67Var, (byte) 3));
                return;
            default:
                j67Var.k();
                return;
        }
    }
}
