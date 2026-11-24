package defpackage;

import java.util.ArrayList;
public final class geb extends x1 {
    public final ArrayList c;
    public final ArrayList d;
    public final feb a = new tg6();
    public final ArrayList b = new ArrayList();
    public boolean e = true;

    public geb(ArrayList arrayList, ArrayList arrayList2) {
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
    public final gk0 e() {
        return this.a;
    }

    @Override
    public final void g(qn5 qn5Var) {
        ArrayList arrayList;
        String str;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        ?? tg6Var = new tg6();
        ?? r3 = this.a;
        r3.b(tg6Var);
        ?? tg6Var2 = new tg6();
        tg6Var.b(tg6Var2);
        int i = 0;
        while (true) {
            arrayList = this.c;
            if (i >= size) {
                break;
            }
            String str2 = (String) arrayList2.get(i);
            ?? tg6Var3 = new tg6();
            if (i < arrayList.size()) {
                tg6Var3.h = (leb) arrayList.get(i);
            }
            qn5Var.a(str2.trim(), tg6Var3);
            tg6Var3.g = true;
            tg6Var2.b(tg6Var3);
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
            ?? tg6Var4 = new tg6();
            for (int i4 = 0; i4 < size; i4++) {
                if (i4 < i3.size()) {
                    str = (String) i3.get(i4);
                } else {
                    str = "";
                }
                ?? tg6Var5 = new tg6();
                if (i4 < arrayList.size()) {
                    tg6Var5.h = (leb) arrayList.get(i4);
                }
                qn5Var.a(str.trim(), tg6Var5);
                tg6Var4.b(tg6Var5);
            }
            if (r4 == 0) {
                r4 = new tg6();
                r3.b(r4);
            }
            r4.b(tg6Var4);
            r4 = r4;
        }
    }

    @Override
    public final vj2 h(vo3 vo3Var) {
        if (vo3Var.a.toString().contains("|")) {
            return vj2.a(vo3Var.b);
        }
        return null;
    }
}
