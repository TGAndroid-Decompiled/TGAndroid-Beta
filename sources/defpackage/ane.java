package defpackage;
public abstract class ane {
    public static void a(vib vibVar, vib vibVar2, int i) {
        if (vibVar != null && vibVar2 != null && vibVar != vibVar2) {
            StringBuilder sb = new StringBuilder(i);
            sb.append(vibVar.g);
            ui6 ui6Var = (ui6) vibVar2.f;
            for (ui6 ui6Var2 = (ui6) vibVar.f; ui6Var2 != ui6Var; ui6Var2 = (ui6) ui6Var2.f) {
                sb.append(((vib) ui6Var2).g);
                ui6Var2.g();
            }
            vibVar.g = sb.toString();
        }
    }

    public static void b(ui6 ui6Var, ui6 ui6Var2) {
        vib vibVar = null;
        vib vibVar2 = null;
        int i = 0;
        while (ui6Var != null) {
            if (ui6Var instanceof vib) {
                vibVar2 = (vib) ui6Var;
                if (vibVar == null) {
                    vibVar = vibVar2;
                }
                i = vibVar2.g.length() + i;
            } else {
                a(vibVar, vibVar2, i);
                vibVar = null;
                vibVar2 = null;
                i = 0;
            }
            if (ui6Var == ui6Var2) {
                break;
            }
            ui6Var = (ui6) ui6Var.f;
        }
        a(vibVar, vibVar2, i);
    }
}
