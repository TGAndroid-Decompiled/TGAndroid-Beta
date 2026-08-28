package ee;

import de.c;
import e4.h;
import fe.e;
import ie.p;
import java.util.ArrayList;
public final class b extends ke.a {
    public final ArrayList f5117c;
    public final ArrayList d;
    public final de.a f5115a = new p();
    public final ArrayList f5116b = new ArrayList();
    public boolean f5118e = true;

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.f5117c = arrayList;
        this.d = arrayList2;
    }

    public static ArrayList i(CharSequence charSequence) {
        String trim = charSequence.toString().trim();
        if (trim.startsWith("|")) {
            trim = trim.substring(1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int i9 = 0;
        while (i9 < trim.length()) {
            char charAt = trim.charAt(i9);
            if (charAt != '\\') {
                if (charAt != '|') {
                    sb2.append(charAt);
                } else {
                    arrayList.add(sb2.toString());
                    sb2.setLength(0);
                }
            } else {
                int i10 = i9 + 1;
                if (i10 < trim.length() && trim.charAt(i10) == '|') {
                    sb2.append('|');
                    i9 = i10;
                } else {
                    sb2.append('\\');
                }
            }
            i9++;
        }
        if (sb2.length() > 0) {
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f5118e) {
            this.f5118e = false;
        } else {
            this.f5116b.add(charSequence);
        }
    }

    @Override
    public final ie.a e() {
        return this.f5115a;
    }

    @Override
    public final void g(je.a aVar) {
        ArrayList arrayList;
        String str;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        ?? pVar = new p();
        ?? r32 = this.f5115a;
        r32.b(pVar);
        ?? pVar2 = new p();
        pVar.b(pVar2);
        int i9 = 0;
        while (true) {
            arrayList = this.f5117c;
            if (i9 >= size) {
                break;
            }
            String str2 = (String) arrayList2.get(i9);
            ?? pVar3 = new p();
            if (i9 < arrayList.size()) {
                pVar3.h = (c) arrayList.get(i9);
            }
            aVar.a(str2.trim(), pVar3);
            pVar3.f4480g = true;
            pVar2.b(pVar3);
            i9++;
        }
        ArrayList arrayList3 = this.f5116b;
        int size2 = arrayList3.size();
        ?? r52 = 0;
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
        if (eVar.f6062a.toString().contains("|")) {
            return h.a(eVar.f6063b);
        }
        return null;
    }
}
