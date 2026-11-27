package defpackage;
public final class v9 {
    public final byte a;
    public final String b;
    public final t9 c;
    public final jq2 d;

    public v9(jq2 jq2Var, String str, t9 t9Var, byte b) {
        this.a = b;
        this.d = jq2Var;
        this.b = str;
        this.c = t9Var;
    }

    public final void a(Object obj) {
        byte b = this.a;
        String str = this.b;
        jq2 jq2Var = this.d;
        t9 t9Var = this.c;
        switch (b) {
            case 0:
                Integer num = (Integer) jq2Var.b.get(str);
                if (num != null) {
                    jq2Var.d.add(str);
                    try {
                        jq2Var.b(num.intValue(), t9Var, obj);
                        return;
                    } catch (Exception e) {
                        jq2Var.d.remove(str);
                        throw e;
                    }
                }
                xi4.n("Attempting to launch an unregistered ActivityResultLauncher with contract ", t9Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                return;
            default:
                Integer num2 = (Integer) jq2Var.b.get(str);
                if (num2 != null) {
                    jq2Var.d.add(str);
                    try {
                        jq2Var.b(num2.intValue(), t9Var, obj);
                        return;
                    } catch (Exception e2) {
                        jq2Var.d.remove(str);
                        throw e2;
                    }
                }
                xi4.n("Attempting to launch an unregistered ActivityResultLauncher with contract ", t9Var, " and input ", obj, ". You must ensure the ActivityResultLauncher is registered before calling launch().");
                return;
        }
    }
}
