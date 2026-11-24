package defpackage;
public final class u9 {
    public final byte a;
    public final String b;
    public final s9 c;
    public final qp2 d;

    public u9(qp2 qp2Var, String str, s9 s9Var, byte b) {
        this.a = b;
        this.d = qp2Var;
        this.b = str;
        this.c = s9Var;
    }

    public final void a(Object obj) {
        byte b = this.a;
        String str = this.b;
        qp2 qp2Var = this.d;
        s9 s9Var = this.c;
        switch (b) {
            case 0:
                Integer num = (Integer) qp2Var.b.get(str);
                if (num != null) {
                    qp2Var.d.add(str);
                    try {
                        qp2Var.b(num.intValue(), s9Var, obj);
                        return;
                    } catch (Exception e) {
                        qp2Var.d.remove(str);
                        throw e;
                    }
                }
                w44.f("Attempting to launch an unregistered ActivityResultLauncher with contract ", s9Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                return;
            default:
                Integer num2 = (Integer) qp2Var.b.get(str);
                if (num2 != null) {
                    qp2Var.d.add(str);
                    try {
                        qp2Var.b(num2.intValue(), s9Var, obj);
                        return;
                    } catch (Exception e2) {
                        qp2Var.d.remove(str);
                        throw e2;
                    }
                }
                w44.f("Attempting to launch an unregistered ActivityResultLauncher with contract ", s9Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                return;
        }
    }
}
