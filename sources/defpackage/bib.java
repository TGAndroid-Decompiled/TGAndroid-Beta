package defpackage;

import java.util.ArrayList;
public final class bib extends y1 {
    public final ArrayList c;
    public final ArrayList d;
    public final aib a = new yi6();
    public final ArrayList b = new ArrayList();
    public boolean e = true;

    public bib(ArrayList arrayList, ArrayList arrayList2) {
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
    public final hk0 e() {
        return this.a;
    }

    @Override
    public final void g(tp5 tp5Var) {
        ArrayList arrayList;
        String str;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        ?? yi6Var = new yi6();
        ?? r3 = this.a;
        r3.b(yi6Var);
        ?? yi6Var2 = new yi6();
        yi6Var.b(yi6Var2);
        int i = 0;
        while (true) {
            arrayList = this.c;
            if (i >= size) {
                break;
            }
            String str2 = (String) arrayList2.get(i);
            ?? yi6Var3 = new yi6();
            if (i < arrayList.size()) {
                yi6Var3.h = (gib) arrayList.get(i);
            }
            tp5Var.a(str2.trim(), yi6Var3);
            yi6Var3.g = true;
            yi6Var2.b(yi6Var3);
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
            ?? yi6Var4 = new yi6();
            for (int i4 = 0; i4 < size; i4++) {
                if (i4 < i3.size()) {
                    str = (String) i3.get(i4);
                } else {
                    str = "";
                }
                ?? yi6Var5 = new yi6();
                if (i4 < arrayList.size()) {
                    yi6Var5.h = (gib) arrayList.get(i4);
                }
                tp5Var.a(str.trim(), yi6Var5);
                yi6Var4.b(yi6Var5);
            }
            if (r4 == 0) {
                r4 = new yi6();
                r3.b(r4);
            }
            r4.b(yi6Var4);
            r4 = r4;
        }
    }

    @Override
    public final qk2 h(mp3 mp3Var) {
        if (mp3Var.a.toString().contains("|")) {
            return qk2.a(mp3Var.b);
        }
        return null;
    }
}
