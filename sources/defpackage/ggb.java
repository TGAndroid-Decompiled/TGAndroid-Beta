package defpackage;

import java.util.ArrayList;
public final class ggb extends x1 {
    public final ArrayList c;
    public final ArrayList d;
    public final fgb a = new ui6();
    public final ArrayList b = new ArrayList();
    public boolean e = true;

    public ggb(ArrayList arrayList, ArrayList arrayList2) {
        this.c = arrayList;
        this.d = arrayList2;
    }

    public static ArrayList i(CharSequence charSequence) {
        String trim = charSequence.toString().trim();
        if (trim.startsWith("|")) {
            trim = trim.substring(1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i = 0;
        while (i < trim.length()) {
            char charAt = trim.charAt(i);
            if (charAt != '\\') {
                if (charAt != '|') {
                    sb.append(charAt);
                } else {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                int i2 = i + 1;
                if (i2 < trim.length() && trim.charAt(i2) == '|') {
                    sb.append('|');
                    i = i2;
                } else {
                    sb.append('\\');
                }
            }
            i++;
        }
        if (sb.length() > 0) {
            arrayList.add(sb.toString());
        }
        return arrayList;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.e) {
            this.e = false;
        } else {
            this.b.add(charSequence);
        }
    }

    @Override
    public final gl0 e() {
        return this.a;
    }

    @Override
    public final void g(qp5 qp5Var) {
        ArrayList arrayList;
        String str;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        ?? ui6Var = new ui6();
        ?? r3 = this.a;
        r3.b(ui6Var);
        ?? ui6Var2 = new ui6();
        ui6Var.b(ui6Var2);
        int i = 0;
        while (true) {
            arrayList = this.c;
            if (i >= size) {
                break;
            }
            String str2 = (String) arrayList2.get(i);
            ?? ui6Var3 = new ui6();
            if (i < arrayList.size()) {
                ui6Var3.h = (lgb) arrayList.get(i);
            }
            qp5Var.a(str2.trim(), ui6Var3);
            ui6Var3.g = true;
            ui6Var2.b(ui6Var3);
            i++;
        }
        ArrayList arrayList3 = this.b;
        int size2 = arrayList3.size();
        ?? r4 = 0;
        int i2 = 0;
        while (i2 < size2) {
            Object obj = arrayList3.get(i2);
            i2++;
            ArrayList i3 = i((CharSequence) obj);
            ?? ui6Var4 = new ui6();
            for (int i4 = 0; i4 < size; i4++) {
                if (i4 < i3.size()) {
                    str = (String) i3.get(i4);
                } else {
                    str = "";
                }
                ?? ui6Var5 = new ui6();
                if (i4 < arrayList.size()) {
                    ui6Var5.h = (lgb) arrayList.get(i4);
                }
                qp5Var.a(str.trim(), ui6Var5);
                ui6Var4.b(ui6Var5);
            }
            if (r4 == 0) {
                r4 = new ui6();
                r3.b(r4);
            }
            r4.b(ui6Var4);
            r4 = r4;
        }
    }

    @Override
    public final il2 h(fq3 fq3Var) {
        if (fq3Var.a.toString().contains("|")) {
            return il2.a(fq3Var.b);
        }
        return null;
    }
}
