package defpackage;
public abstract class yke {
    public static void a(ugb ugbVar, ugb ugbVar2, int i) {
        if (ugbVar != null && ugbVar2 != null && ugbVar != ugbVar2) {
            StringBuilder sb = new StringBuilder(i);
            sb.append(ugbVar.g);
            tg6 tg6Var = (tg6) ugbVar2.f;
            for (tg6 tg6Var2 = (tg6) ugbVar.f; tg6Var2 != tg6Var; tg6Var2 = (tg6) tg6Var2.f) {
                sb.append(((ugb) tg6Var2).g);
                tg6Var2.g();
            }
            ugbVar.g = sb.toString();
        }
    }

    public static void b(tg6 tg6Var, tg6 tg6Var2) {
        ugb ugbVar = null;
        ugb ugbVar2 = null;
        int i = 0;
        while (tg6Var != null) {
            if (tg6Var instanceof ugb) {
                ugbVar2 = (ugb) tg6Var;
                if (ugbVar == null) {
                    ugbVar = ugbVar2;
                }
                i = ugbVar2.g.length() + i;
            } else {
                a(ugbVar, ugbVar2, i);
                ugbVar = null;
                ugbVar2 = null;
                i = 0;
            }
            if (tg6Var == tg6Var2) {
                break;
            }
            tg6Var = (tg6) tg6Var.f;
        }
        a(ugbVar, ugbVar2, i);
    }
}
