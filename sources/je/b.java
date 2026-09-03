package je;

import ie.c;
import j4.h;
import java.util.ArrayList;
import ke.e;
import ne.p;
public final class b extends pe.a {
    public final ArrayList f9349c;
    public final ArrayList d;
    public final ie.a f9347a = new p();
    public final ArrayList f9348b = new ArrayList();
    public boolean e = true;

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.f9349c = arrayList;
        this.d = arrayList2;
    }

    public static ArrayList i(CharSequence charSequence) {
        String trim = charSequence.toString().trim();
        if (trim.startsWith("|")) {
            trim = trim.substring(1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb = new StringBuilder();
        int i10 = 0;
        while (i10 < trim.length()) {
            char charAt = trim.charAt(i10);
            if (charAt != '\\') {
                if (charAt != '|') {
                    sb.append(charAt);
                } else {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
            } else {
                int i11 = i10 + 1;
                if (i11 < trim.length() && trim.charAt(i11) == '|') {
                    sb.append('|');
                    i10 = i11;
                } else {
                    sb.append('\\');
                }
            }
            i10++;
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
            this.f9348b.add(charSequence);
        }
    }

    @Override
    public final ne.a e() {
        return this.f9347a;
    }

    @Override
    public final void g(oe.a aVar) {
        ArrayList arrayList;
        String str;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        ?? pVar = new p();
        ?? r32 = this.f9347a;
        r32.b(pVar);
        ?? pVar2 = new p();
        pVar.b(pVar2);
        int i10 = 0;
        while (true) {
            arrayList = this.f9349c;
            if (i10 >= size) {
                break;
            }
            String str2 = (String) arrayList2.get(i10);
            ?? pVar3 = new p();
            if (i10 < arrayList.size()) {
                pVar3.h = (c) arrayList.get(i10);
            }
            aVar.a(str2.trim(), pVar3);
            pVar3.f7469g = true;
            pVar2.b(pVar3);
            i10++;
        }
        ArrayList arrayList3 = this.f9348b;
        int size2 = arrayList3.size();
        ?? r52 = 0;
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList3.get(i11);
            i11++;
            ArrayList i12 = i((CharSequence) obj);
            ?? pVar4 = new p();
            for (int i13 = 0; i13 < size; i13++) {
                if (i13 < i12.size()) {
                    str = (String) i12.get(i13);
                } else {
                    str = "";
                }
                ?? pVar5 = new p();
                if (i13 < arrayList.size()) {
                    pVar5.h = (c) arrayList.get(i13);
                }
                aVar.a(str.trim(), pVar5);
                pVar4.b(pVar5);
            }
            if (r52 == 0) {
                r52 = new p();
                r32.b(r52);
            }
            r52.b(pVar4);
            r52 = r52;
        }
    }

    @Override
    public final h h(e eVar) {
        if (eVar.f10326a.toString().contains("|")) {
            return h.a(eVar.f10327b);
        }
        return null;
    }
}
