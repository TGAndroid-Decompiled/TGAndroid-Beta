package defpackage;
public final class u9 {
    public final byte a;
    public final String b;
    public final s9 c;
    public final br2 d;

    public u9(br2 br2Var, String str, s9 s9Var, byte b) {
        this.a = b;
        this.d = br2Var;
        this.b = str;
        this.c = s9Var;
    }

    public final void a(Object obj) {
        byte b = this.a;
        String str = this.b;
        br2 br2Var = this.d;
        s9 s9Var = this.c;
        switch (b) {
            case 0:
                Integer num = (Integer) br2Var.b.get(str);
                if (num != null) {
                    br2Var.d.add(str);
                    try {
                        br2Var.b(num.intValue(), s9Var, obj);
                        return;
                    } catch (Exception e) {
                        br2Var.d.remove(str);
                        throw e;
                    }
                }
                zo4.n("Attempting to launch an unregistered ActivityResultLauncher with contract ", s9Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                return;
            default:
                Integer num2 = (Integer) br2Var.b.get(str);
                if (num2 != null) {
                    br2Var.d.add(str);
                    try {
                        br2Var.b(num2.intValue(), s9Var, obj);
                        return;
                    } catch (Exception e2) {
                        br2Var.d.remove(str);
                        throw e2;
                    }
                }
                zo4.n("Attempting to launch an unregistered ActivityResultLauncher with contract ", s9Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                return;
        }
    }
}
