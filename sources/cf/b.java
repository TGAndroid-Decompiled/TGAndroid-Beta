package cf;

import bf.c;
import df.g;
import gf.p;
import java.util.ArrayList;
public final class b extends jf.a {
    public final ArrayList f4603c;
    public final ArrayList d;
    public final bf.a f4601a = new p();
    public final ArrayList f4602b = new ArrayList();
    public boolean f4604e = true;

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.f4603c = arrayList;
        this.d = arrayList2;
    }

    public static ArrayList i(CharSequence charSequence) {
        String trim = charSequence.toString().trim();
        if (trim.startsWith("|")) {
            trim = trim.substring(1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int i3 = 0;
        while (i3 < trim.length()) {
            char charAt = trim.charAt(i3);
            if (charAt != '\\') {
                if (charAt != '|') {
                    sb2.append(charAt);
                } else {
                    arrayList.add(sb2.toString());
                    sb2.setLength(0);
                }
            } else {
                int i10 = i3 + 1;
                if (i10 < trim.length() && trim.charAt(i10) == '|') {
                    sb2.append('|');
                    i3 = i10;
                } else {
                    sb2.append('\\');
                }
            }
            i3++;
        }
        if (sb2.length() > 0) {
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f4604e) {
            this.f4604e = false;
        } else {
            this.f4602b.add(charSequence);
        }
    }

    @Override
    public final gf.a e() {
        return this.f4601a;
    }

    @Override
    public final void g(hf.a aVar) {
        ArrayList arrayList;
        String str;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        ?? pVar = new p();
        ?? r32 = this.f4601a;
        r32.b(pVar);
        ?? pVar2 = new p();
        pVar.b(pVar2);
        int i3 = 0;
        while (true) {
            arrayList = this.f4603c;
            if (i3 >= size) {
                break;
            }
            String str2 = (String) arrayList2.get(i3);
            ?? pVar3 = new p();
            if (i3 < arrayList.size()) {
                pVar3.h = (c) arrayList.get(i3);
            }
            aVar.a(str2.trim(), pVar3);
            pVar3.f3294g = true;
            pVar2.b(pVar3);
            i3++;
        }
        ArrayList arrayList3 = this.f4602b;
        int size2 = arrayList3.size();
        ?? r5 = 0;
        int i10 = 0;
        while (i10 < size2) {
            Object obj = arrayList3.get(i10);
            i10++;
            ArrayList i11 = i((CharSequence) obj);
            ?? pVar4 = new p();
            for (int i12 = 0; i12 < size; i12++) {
                if (i12 < i11.size()) {
                    str = (String) i11.get(i12);
                } else {
                    str = "";
                }
                ?? pVar5 = new p();
                if (i12 < arrayList.size()) {
                    pVar5.h = (c) arrayList.get(i12);
                }
                aVar.a(str.trim(), pVar5);
                pVar4.b(pVar5);
            }
            if (r5 == 0) {
                r5 = new p();
                r32.b(r5);
            }
            r5.b(pVar4);
            r5 = r5;
        }
    }

    @Override
    public final df.a h(g gVar) {
        if (gVar.f8862a.toString().contains("|")) {
            return df.a.a(gVar.f8863b);
        }
        return null;
    }
}
