package ff;

import ef.c;
import gf.h;
import java.util.ArrayList;
import kf.p;
public final class b extends mf.a {
    public final ArrayList f11477c;
    public final ArrayList d;
    public final ef.a f11475a = new p();
    public final ArrayList f11476b = new ArrayList();
    public boolean f11478e = true;

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.f11477c = arrayList;
        this.d = arrayList2;
    }

    public static ArrayList i(CharSequence charSequence) {
        String trim = charSequence.toString().trim();
        if (trim.startsWith("|")) {
            trim = trim.substring(1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int i7 = 0;
        while (i7 < trim.length()) {
            char charAt = trim.charAt(i7);
            if (charAt != '\\') {
                if (charAt != '|') {
                    sb2.append(charAt);
                } else {
                    arrayList.add(sb2.toString());
                    sb2.setLength(0);
                }
            } else {
                int i10 = i7 + 1;
                if (i10 < trim.length() && trim.charAt(i10) == '|') {
                    sb2.append('|');
                    i7 = i10;
                } else {
                    sb2.append('\\');
                }
            }
            i7++;
        }
        if (sb2.length() > 0) {
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f11478e) {
            this.f11478e = false;
        } else {
            this.f11476b.add(charSequence);
        }
    }

    @Override
    public final kf.a e() {
        return this.f11475a;
    }

    @Override
    public final void g(lf.a aVar) {
        ArrayList arrayList;
        String str;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        ?? pVar = new p();
        ?? r32 = this.f11475a;
        r32.b(pVar);
        ?? pVar2 = new p();
        pVar.b(pVar2);
        int i7 = 0;
        while (true) {
            arrayList = this.f11477c;
            if (i7 >= size) {
                break;
            }
            String str2 = (String) arrayList2.get(i7);
            ?? pVar3 = new p();
            if (i7 < arrayList.size()) {
                pVar3.h = (c) arrayList.get(i7);
            }
            aVar.a(str2.trim(), pVar3);
            pVar3.f10804g = true;
            pVar2.b(pVar3);
            i7++;
        }
        ArrayList arrayList3 = this.f11476b;
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
    public final gf.a h(h hVar) {
        if (hVar.f13892a.toString().contains("|")) {
            return gf.a.a(hVar.f13893b);
        }
        return null;
    }
}
