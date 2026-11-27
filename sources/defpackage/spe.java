package defpackage;
public abstract class spe {
    public static void a(qkb qkbVar, qkb qkbVar2, int i) {
        if (qkbVar != null && qkbVar2 != null && qkbVar != qkbVar2) {
            StringBuilder sb = new StringBuilder(i);
            sb.append(qkbVar.g);
            yi6 yi6Var = (yi6) qkbVar2.f;
            for (yi6 yi6Var2 = (yi6) qkbVar.f; yi6Var2 != yi6Var; yi6Var2 = (yi6) yi6Var2.f) {
                sb.append(((qkb) yi6Var2).g);
                yi6Var2.g();
            }
            qkbVar.g = sb.toString();
        }
    }

    public static void b(yi6 yi6Var, yi6 yi6Var2) {
        qkb qkbVar = null;
        qkb qkbVar2 = null;
        int i = 0;
        while (yi6Var != null) {
            if (yi6Var instanceof qkb) {
                qkbVar2 = (qkb) yi6Var;
                if (qkbVar == null) {
                    qkbVar = qkbVar2;
                }
                i = qkbVar2.g.length() + i;
            } else {
                a(qkbVar, qkbVar2, i);
                qkbVar = null;
                qkbVar2 = null;
                i = 0;
            }
            if (yi6Var == yi6Var2) {
                break;
            }
            yi6Var = (yi6) yi6Var.f;
        }
        a(qkbVar, qkbVar2, i);
    }
}
