package fe;

import e4.h;
import ee.c;
import ee.d;
import ee.e;
import ee.f;
import java.util.ArrayList;
import je.p;

public final class b extends le.a {

    public final ArrayList f6048c;
    public final ArrayList d;

    public final ee.a f6046a = new ee.a();

    public final ArrayList f6047b = new ArrayList();

    public boolean f6049e = true;

    public b(ArrayList arrayList, ArrayList arrayList2) {
        this.f6048c = arrayList;
        this.d = arrayList2;
    }

    public static ArrayList i(CharSequence charSequence) {
        String strTrim = charSequence.toString().trim();
        if (strTrim.startsWith("|")) {
            strTrim = strTrim.substring(1);
        }
        ArrayList arrayList = new ArrayList();
        StringBuilder sb2 = new StringBuilder();
        int i10 = 0;
        while (i10 < strTrim.length()) {
            char cCharAt = strTrim.charAt(i10);
            if (cCharAt == '\\') {
                int i11 = i10 + 1;
                if (i11 >= strTrim.length() || strTrim.charAt(i11) != '|') {
                    sb2.append('\\');
                } else {
                    sb2.append('|');
                    i10 = i11;
                }
            } else if (cCharAt != '|') {
                sb2.append(cCharAt);
            } else {
                arrayList.add(sb2.toString());
                sb2.setLength(0);
            }
            i10++;
        }
        if (sb2.length() > 0) {
            arrayList.add(sb2.toString());
        }
        return arrayList;
    }

    @Override
    public final void a(CharSequence charSequence) {
        if (this.f6049e) {
            this.f6049e = false;
        } else {
            this.f6047b.add(charSequence);
        }
    }

    @Override
    public final je.a e() {
        return this.f6046a;
    }

    @Override
    public final void g(ke.a aVar) {
        ArrayList arrayList;
        ArrayList arrayList2 = this.d;
        int size = arrayList2.size();
        e eVar = new e();
        ee.a aVar2 = this.f6046a;
        aVar2.b(eVar);
        p fVar = new f();
        eVar.b(fVar);
        int i10 = 0;
        while (true) {
            arrayList = this.f6048c;
            if (i10 >= size) {
                break;
            }
            String str = (String) arrayList2.get(i10);
            d dVar = new d();
            if (i10 < arrayList.size()) {
                dVar.h = (c) arrayList.get(i10);
            }
            aVar.a(str.trim(), dVar);
            dVar.f5379g = true;
            fVar.b(dVar);
            i10++;
        }
        ArrayList arrayList3 = this.f6047b;
        int size2 = arrayList3.size();
        p bVar = null;
        int i11 = 0;
        while (i11 < size2) {
            Object obj = arrayList3.get(i11);
            i11++;
            ArrayList arrayListI = i((CharSequence) obj);
            p fVar2 = new f();
            int i12 = 0;
            while (i12 < size) {
                String str2 = i12 < arrayListI.size() ? (String) arrayListI.get(i12) : "";
                d dVar2 = new d();
                if (i12 < arrayList.size()) {
                    dVar2.h = (c) arrayList.get(i12);
                }
                aVar.a(str2.trim(), dVar2);
                fVar2.b(dVar2);
                i12++;
            }
            if (bVar == null) {
                bVar = new ee.b();
                aVar2.b(bVar);
            }
            bVar.b(fVar2);
        }
    }

    @Override
    public final h h(ge.e eVar) {
        if (eVar.f6862a.toString().contains("|")) {
            return h.a(eVar.f6863b);
        }
        return null;
    }
}
