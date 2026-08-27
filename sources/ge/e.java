package ge;

import g7.j8;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.regex.Pattern;
import je.q;
import je.r;
import je.t;

public final class e {

    public static final LinkedHashSet f6860p = new LinkedHashSet(Arrays.asList(je.b.class, je.i.class, je.h.class, je.j.class, t.class, je.n.class, je.l.class));

    public static final Map f6861q;

    public CharSequence f6862a;
    public boolean d;
    public boolean h;

    public final List f6868i;

    public final ke.b f6869j;

    public final List f6870k;

    public final d f6871l;

    public final ArrayList f6873n;

    public final LinkedHashSet f6874o;

    public int f6863b = 0;

    public int f6864c = 0;

    public int f6865e = 0;

    public int f6866f = 0;

    public int f6867g = 0;

    public final LinkedHashMap f6872m = new LinkedHashMap();

    static {
        HashMap map = new HashMap();
        map.put(je.b.class, new fe.a(1));
        map.put(je.i.class, new fe.a(3));
        map.put(je.h.class, new fe.a(2));
        map.put(je.j.class, new fe.a(4));
        map.put(t.class, new fe.a(7));
        map.put(je.n.class, new fe.a(6));
        map.put(je.l.class, new fe.a(5));
        f6861q = DesugarCollections.unmodifiableMap(map);
    }

    public e(ArrayList arrayList, ke.b bVar, ArrayList arrayList2) {
        ArrayList arrayList3 = new ArrayList();
        this.f6873n = arrayList3;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        this.f6874o = linkedHashSet;
        this.f6868i = arrayList;
        this.f6869j = bVar;
        this.f6870k = arrayList2;
        d dVar = new d(0);
        this.f6871l = dVar;
        arrayList3.add(dVar);
        linkedHashSet.add(dVar);
    }

    public final void a(le.a aVar) {
        while (!h().b(aVar.e())) {
            e(h());
        }
        h().e().b(aVar.e());
        this.f6873n.add(aVar);
        this.f6874o.add(aVar);
    }

    public final void b(o oVar) {
        k kVar = oVar.f6922b;
        kVar.a();
        ArrayList arrayList = kVar.f6908c;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            je.m mVar = (je.m) obj;
            r rVar = oVar.f6921a;
            mVar.g();
            je.p pVar = (je.p) rVar.f12926e;
            mVar.f12926e = pVar;
            if (pVar != null) {
                pVar.f12927f = mVar;
            }
            mVar.f12927f = rVar;
            rVar.f12926e = mVar;
            je.p pVar2 = (je.p) rVar.f12924b;
            mVar.f12924b = pVar2;
            if (((je.p) mVar.f12926e) == null) {
                pVar2.f12925c = mVar;
            }
            String str = mVar.f12921g;
            LinkedHashMap linkedHashMap = this.f6872m;
            if (!linkedHashMap.containsKey(str)) {
                linkedHashMap.put(str, mVar);
            }
        }
    }

    public final void c() {
        CharSequence charSequenceSubSequence;
        if (this.d) {
            int i10 = this.f6863b + 1;
            CharSequence charSequence = this.f6862a;
            CharSequence charSequenceSubSequence2 = charSequence.subSequence(i10, charSequence.length());
            int i11 = 4 - (this.f6864c % 4);
            StringBuilder sb2 = new StringBuilder(charSequenceSubSequence2.length() + i11);
            for (int i12 = 0; i12 < i11; i12++) {
                sb2.append(' ');
            }
            sb2.append(charSequenceSubSequence2);
            charSequenceSubSequence = sb2.toString();
        } else {
            CharSequence charSequence2 = this.f6862a;
            charSequenceSubSequence = charSequence2.subSequence(this.f6863b, charSequence2.length());
        }
        h().a(charSequenceSubSequence);
    }

    public final void d() {
        if (this.f6862a.charAt(this.f6863b) != '\t') {
            this.f6863b++;
            this.f6864c++;
        } else {
            this.f6863b++;
            int i10 = this.f6864c;
            this.f6864c = (4 - (i10 % 4)) + i10;
        }
    }

    public final void e(le.a aVar) {
        if (h() == aVar) {
            a9.p.s(1, this.f6873n);
        }
        if (aVar instanceof o) {
            b((o) aVar);
        }
        aVar.d();
    }

    public final void f(List list) {
        for (int size = list.size() - 1; size >= 0; size--) {
            e((le.a) list.get(size));
        }
    }

    public final void g() {
        int i10 = this.f6863b;
        int i11 = this.f6864c;
        this.h = true;
        int length = this.f6862a.length();
        while (i10 < length) {
            char cCharAt = this.f6862a.charAt(i10);
            if (cCharAt == '\t') {
                i10++;
                i11 += 4 - (i11 % 4);
            } else if (cCharAt != ' ') {
                this.h = false;
                break;
            } else {
                i10++;
                i11++;
            }
        }
        this.f6865e = i10;
        this.f6866f = i11;
        this.f6867g = i11 - this.f6864c;
    }

    public final le.a h() {
        return (le.a) i0.a.i(1, this.f6873n);
    }

    public final void i(String str) {
        le.a aVar;
        e8.b bVar;
        boolean z10;
        boolean z11;
        ee.c cVar;
        char cCharAt;
        int i10;
        f fVar;
        e8.b bVar2;
        g gVar;
        int i11;
        StringBuilder sbD;
        boolean z12;
        l lVar;
        char cCharAt2;
        l lVar2;
        boolean z13;
        int i12;
        String string = str;
        int length = string.length();
        StringBuilder sb2 = null;
        for (int i13 = 0; i13 < length; i13++) {
            char cCharAt3 = string.charAt(i13);
            if (cCharAt3 == 0) {
                if (sb2 == null) {
                    sb2 = new StringBuilder(length);
                    sb2.append((CharSequence) string, 0, i13);
                }
                sb2.append((char) 65533);
            } else if (sb2 != null) {
                sb2.append(cCharAt3);
            }
        }
        if (sb2 != null) {
            string = sb2.toString();
        }
        this.f6862a = string;
        this.f6863b = 0;
        this.f6864c = 0;
        this.d = false;
        ArrayList arrayList = this.f6873n;
        int i14 = 1;
        for (le.a aVar2 : arrayList.subList(1, arrayList.size())) {
            g();
            e4.h hVarH = aVar2.h(this);
            if (hVarH == null) {
                break;
            }
            if (hVarH.f5206c) {
                e(aVar2);
                return;
            }
            int i15 = hVarH.f5204a;
            if (i15 != -1) {
                k(i15);
            } else {
                int i16 = hVarH.f5205b;
                if (i16 != -1) {
                    j(i16);
                }
            }
            i14++;
        }
        ArrayList arrayList2 = new ArrayList(arrayList.subList(i14, arrayList.size()));
        le.a aVar3 = (le.a) arrayList.get(i14 - 1);
        boolean zIsEmpty = arrayList2.isEmpty();
        boolean zF = (aVar3.e() instanceof r) || aVar3.f();
        while (true) {
            if (zF) {
                g();
                if (!this.h) {
                    int i17 = 4;
                    if (this.f6867g >= 4 || !Character.isLetter(Character.codePointAt(this.f6862a, this.f6865e))) {
                        ga.c cVar2 = new ga.c(aVar3, 15);
                        Iterator it = this.f6868i.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                char c10 = ' ';
                                switch (((fe.a) it.next()).f6045a) {
                                    case 0:
                                        aVar = aVar3;
                                        CharSequence charSequence = this.f6862a;
                                        StringBuilder sbD2 = cVar2.d();
                                        if (sbD2 == null || !sbD2.toString().contains("|") || sbD2.toString().contains("\n")) {
                                            bVar = null;
                                        } else {
                                            CharSequence charSequenceSubSequence = charSequence.subSequence(this.f6863b, charSequence.length());
                                            ArrayList arrayList3 = new ArrayList();
                                            boolean z14 = false;
                                            int i18 = 0;
                                            while (true) {
                                                int i19 = 0;
                                                while (true) {
                                                    if (i18 < charSequenceSubSequence.length()) {
                                                        char cCharAt4 = charSequenceSubSequence.charAt(i18);
                                                        if (cCharAt4 == '\t' || cCharAt4 == ' ') {
                                                            i18++;
                                                        } else if (cCharAt4 == '-' || cCharAt4 == ':') {
                                                            if (i19 != 0 || arrayList3.isEmpty()) {
                                                                if (cCharAt4 == ':') {
                                                                    i18++;
                                                                    z10 = true;
                                                                } else {
                                                                    z10 = false;
                                                                }
                                                                boolean z15 = false;
                                                                while (i18 < charSequenceSubSequence.length() && charSequenceSubSequence.charAt(i18) == '-') {
                                                                    i18++;
                                                                    z15 = true;
                                                                }
                                                                if (z15) {
                                                                    if (i18 >= charSequenceSubSequence.length() || charSequenceSubSequence.charAt(i18) != ':') {
                                                                        z11 = false;
                                                                    } else {
                                                                        i18++;
                                                                        z11 = true;
                                                                    }
                                                                    if (z10 && z11) {
                                                                        cVar = ee.c.f5377b;
                                                                    } else if (z10) {
                                                                        cVar = ee.c.f5376a;
                                                                    } else {
                                                                        cVar = z11 ? ee.c.f5378c : null;
                                                                    }
                                                                    arrayList3.add(cVar);
                                                                }
                                                            }
                                                        } else if (cCharAt4 == '|') {
                                                            i18++;
                                                            i19++;
                                                            if (i19 <= 1) {
                                                                z14 = true;
                                                            }
                                                        }
                                                    } else if (!z14) {
                                                    }
                                                    arrayList3 = null;
                                                }
                                            }
                                            if (arrayList3 == null || arrayList3.isEmpty()) {
                                                bVar = null;
                                            } else {
                                                ArrayList arrayListI = fe.b.i(sbD2);
                                                if (arrayList3.size() >= arrayListI.size()) {
                                                    e8.b bVar3 = new e8.b(new fe.b(arrayList3, arrayListI));
                                                    bVar3.f5351a = this.f6863b;
                                                    bVar3.f5353c = true;
                                                    bVar = bVar3;
                                                } else {
                                                    bVar = null;
                                                }
                                            }
                                        }
                                        break;
                                    case 1:
                                        aVar = aVar3;
                                        int i20 = this.f6865e;
                                        if (a.i(this, i20)) {
                                            int i21 = this.f6864c + this.f6867g;
                                            int i22 = i21 + 1;
                                            CharSequence charSequence2 = this.f6862a;
                                            int i23 = i20 + 1;
                                            if (i23 < charSequence2.length() && ((cCharAt = charSequence2.charAt(i23)) == '\t' || cCharAt == ' ')) {
                                                i22 = i21 + 2;
                                            }
                                            bVar = new e8.b(new a());
                                            bVar.f5352b = i22;
                                        } else {
                                            bVar = null;
                                        }
                                        break;
                                    case 2:
                                        aVar = aVar3;
                                        int i24 = this.f6867g;
                                        if (i24 < 4) {
                                            int i25 = this.f6865e;
                                            CharSequence charSequence3 = this.f6862a;
                                            int length2 = charSequence3.length();
                                            int i26 = i25;
                                            int i27 = 0;
                                            int i28 = 0;
                                            while (true) {
                                                i10 = i25;
                                                if (i26 < length2) {
                                                    char cCharAt5 = charSequence3.charAt(i26);
                                                    if (cCharAt5 == '`') {
                                                        i27++;
                                                    } else if (cCharAt5 == '~') {
                                                        i28++;
                                                    }
                                                    i26++;
                                                    i25 = i10;
                                                }
                                            }
                                            int i29 = 3;
                                            if (i27 < 3) {
                                                if (i28 >= i29 || i27 != 0) {
                                                    fVar = null;
                                                } else {
                                                    fVar = new f('~', i28, i24);
                                                }
                                            } else if (i28 == 0) {
                                                int i30 = i10 + i27;
                                                int length3 = charSequence3.length();
                                                while (true) {
                                                    if (i30 >= length3) {
                                                        i30 = -1;
                                                    } else if (charSequence3.charAt(i30) != '`') {
                                                        i30++;
                                                    }
                                                }
                                                if (i30 != -1) {
                                                    fVar = null;
                                                } else {
                                                    fVar = new f('`', i27, i24);
                                                }
                                            } else {
                                                i29 = 3;
                                                if (i28 >= i29) {
                                                    fVar = null;
                                                } else {
                                                    fVar = null;
                                                }
                                            }
                                            if (fVar != null) {
                                                bVar2 = new e8.b(fVar);
                                                bVar2.f5351a = i10 + fVar.f6875a.h;
                                                bVar = bVar2;
                                            }
                                        }
                                        bVar = null;
                                        break;
                                    case 3:
                                        aVar = aVar3;
                                        if (this.f6867g < 4) {
                                            CharSequence charSequence4 = this.f6862a;
                                            int i31 = this.f6865e;
                                            int iB = j8.b('#', charSequence4, i31, charSequence4.length()) - i31;
                                            if (iB == 0 || iB > 6) {
                                                gVar = null;
                                            } else {
                                                int i32 = i31 + iB;
                                                if (i32 >= charSequence4.length()) {
                                                    gVar = new g(iB, "");
                                                } else {
                                                    char cCharAt6 = charSequence4.charAt(i32);
                                                    char c11 = ' ';
                                                    char c12 = '\t';
                                                    if (cCharAt6 == ' ' || cCharAt6 == '\t') {
                                                        int length4 = charSequence4.length() - 1;
                                                        while (true) {
                                                            if (length4 < i32) {
                                                                length4 = i32 - 1;
                                                            } else {
                                                                char cCharAt7 = charSequence4.charAt(length4);
                                                                if (cCharAt7 == c12 || cCharAt7 == c11) {
                                                                    length4--;
                                                                    c11 = ' ';
                                                                    c12 = '\t';
                                                                }
                                                            }
                                                        }
                                                        int i33 = length4;
                                                        while (true) {
                                                            if (i33 < i32) {
                                                                i33 = i32 - 1;
                                                            } else if (charSequence4.charAt(i33) == '#') {
                                                                i33--;
                                                            }
                                                        }
                                                        int i34 = i33;
                                                        while (true) {
                                                            if (i34 < i32) {
                                                                i34 = i32 - 1;
                                                            } else {
                                                                char cCharAt8 = charSequence4.charAt(i34);
                                                                if (cCharAt8 == '\t' || cCharAt8 == ' ') {
                                                                    i34--;
                                                                }
                                                            }
                                                        }
                                                        gVar = i34 != i33 ? new g(iB, charSequence4.subSequence(i32, i34 + 1).toString()) : new g(iB, charSequence4.subSequence(i32, length4 + 1).toString());
                                                    } else {
                                                        gVar = null;
                                                    }
                                                }
                                            }
                                            if (gVar != null) {
                                                bVar2 = new e8.b(gVar);
                                                bVar2.f5351a = charSequence4.length();
                                            } else {
                                                char cCharAt9 = charSequence4.charAt(i31);
                                                if (cCharAt9 == '-') {
                                                    if (j8.c(j8.b('-', charSequence4, i31 + 1, charSequence4.length()), charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                                        i11 = 2;
                                                    } else {
                                                        i11 = 0;
                                                    }
                                                } else if (cCharAt9 != '=') {
                                                    i11 = 0;
                                                } else if (j8.c(j8.b('=', charSequence4, i31 + 1, charSequence4.length()), charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                                    i11 = 1;
                                                } else if (j8.c(j8.b('-', charSequence4, i31 + 1, charSequence4.length()), charSequence4.length(), charSequence4) >= charSequence4.length()) {
                                                    i11 = 2;
                                                } else {
                                                    i11 = 0;
                                                }
                                                if (i11 > 0 && (sbD = cVar2.d()) != null) {
                                                    bVar2 = new e8.b(new g(i11, sbD.toString()));
                                                    bVar2.f5351a = charSequence4.length();
                                                    bVar2.f5353c = true;
                                                }
                                            }
                                            bVar = bVar2;
                                        }
                                        bVar = null;
                                        break;
                                    case 4:
                                        aVar = aVar3;
                                        int i35 = this.f6865e;
                                        CharSequence charSequence5 = this.f6862a;
                                        if (this.f6867g >= 4 || charSequence5.charAt(i35) != '<') {
                                            bVar = null;
                                        } else {
                                            int i36 = 1;
                                            while (true) {
                                                if (i36 > 7) {
                                                    bVar = null;
                                                } else {
                                                    if (i36 != 7 || !(((le.a) cVar2.f6834b).e() instanceof r)) {
                                                        Pattern[] patternArr = h.f6881e[i36];
                                                        Pattern pattern = patternArr[0];
                                                        Pattern pattern2 = patternArr[1];
                                                        if (pattern.matcher(charSequence5.subSequence(i35, charSequence5.length())).find()) {
                                                            bVar = new e8.b(new h(pattern2));
                                                            bVar.f5351a = this.f6863b;
                                                            break;
                                                        }
                                                    }
                                                    i36++;
                                                }
                                            }
                                        }
                                        break;
                                    case 5:
                                        aVar = aVar3;
                                        if (this.f6867g < 4) {
                                            bVar = null;
                                        } else if (this.h || (h().e() instanceof r)) {
                                            bVar = null;
                                        } else {
                                            bVar = new e8.b(new g());
                                            bVar.f5352b = this.f6864c + 4;
                                        }
                                        break;
                                    case 6:
                                        le.a aVar4 = (le.a) cVar2.f6834b;
                                        int i37 = this.f6867g;
                                        if (i37 < 4) {
                                            int i38 = this.f6865e;
                                            int i39 = this.f6864c + i37;
                                            boolean z16 = cVar2.d() != null;
                                            CharSequence charSequence6 = this.f6862a;
                                            char cCharAt10 = charSequence6.charAt(i38);
                                            if (cCharAt10 == '*' || cCharAt10 == '+' || cCharAt10 == '-') {
                                                z12 = z16;
                                                aVar = aVar3;
                                                int i40 = i38 + 1;
                                                if (i40 >= charSequence6.length() || (cCharAt2 = charSequence6.charAt(i40)) == '\t' || cCharAt2 == ' ') {
                                                    je.c cVar3 = new je.c();
                                                    cVar3.f12909g = cCharAt10;
                                                    lVar = new l(cVar3, i40);
                                                } else {
                                                    lVar = null;
                                                }
                                            } else {
                                                int length5 = charSequence6.length();
                                                int i41 = i38;
                                                int i42 = 0;
                                                while (true) {
                                                    if (i41 < length5) {
                                                        int i43 = length5;
                                                        char cCharAt11 = charSequence6.charAt(i41);
                                                        z12 = z16;
                                                        if (cCharAt11 != ')' && cCharAt11 != '.') {
                                                            switch (cCharAt11) {
                                                                case '0':
                                                                case '1':
                                                                case '2':
                                                                case '3':
                                                                case '4':
                                                                case '5':
                                                                case '6':
                                                                case '7':
                                                                case '8':
                                                                case '9':
                                                                    i42++;
                                                                    if (i42 <= 9) {
                                                                        i41++;
                                                                        length5 = i43;
                                                                        z16 = z12;
                                                                    }
                                                                    break;
                                                                default:
                                                                    break;
                                                            }
                                                        } else {
                                                            if (i42 >= 1) {
                                                                int i44 = i41 + 1;
                                                                if (i44 < charSequence6.length()) {
                                                                    char cCharAt12 = charSequence6.charAt(i44);
                                                                    aVar = aVar3;
                                                                    if (cCharAt12 == '\t' || cCharAt12 == ' ') {
                                                                    }
                                                                } else {
                                                                    aVar = aVar3;
                                                                }
                                                                String string2 = charSequence6.subSequence(i38, i41).toString();
                                                                q qVar = new q();
                                                                qVar.f12928g = Integer.parseInt(string2);
                                                                qVar.h = cCharAt11;
                                                                lVar = new l(qVar, i44);
                                                            }
                                                            lVar = null;
                                                        }
                                                    } else {
                                                        z12 = z16;
                                                    }
                                                    aVar = aVar3;
                                                    lVar = null;
                                                }
                                            }
                                            if (lVar == null) {
                                                lVar2 = null;
                                            } else {
                                                je.n nVar = lVar.f6913a;
                                                int i45 = lVar.f6914b;
                                                int i46 = (i45 - i38) + i39;
                                                int length6 = charSequence6.length();
                                                int i47 = i46;
                                                while (true) {
                                                    if (i45 >= length6) {
                                                        z13 = false;
                                                    } else {
                                                        char cCharAt13 = charSequence6.charAt(i45);
                                                        if (cCharAt13 == '\t') {
                                                            i47 = (4 - (i47 % 4)) + i47;
                                                        } else if (cCharAt13 == ' ') {
                                                            i47++;
                                                        } else {
                                                            z13 = true;
                                                        }
                                                        i45++;
                                                    }
                                                }
                                                if (!z12 || ((!(nVar instanceof q) || ((q) nVar).f12928g == 1) && z13)) {
                                                    if (!z13 || i47 - i46 > 4) {
                                                        i47 = i46 + 1;
                                                    }
                                                    lVar2 = new l(nVar, i47);
                                                } else {
                                                    lVar2 = null;
                                                }
                                            }
                                            if (lVar2 != null) {
                                                je.n nVar2 = lVar2.f6913a;
                                                int i48 = lVar2.f6914b;
                                                n nVar3 = new n(i48 - this.f6864c);
                                                if (aVar4 instanceof m) {
                                                    je.n nVar4 = ((m) aVar4).f6915a;
                                                    if (((nVar4 instanceof je.c) && (nVar2 instanceof je.c)) ? Character.valueOf(((je.c) nVar4).f12909g).equals(Character.valueOf(((je.c) nVar2).f12909g)) : ((nVar4 instanceof q) && (nVar2 instanceof q)) ? Character.valueOf(((q) nVar4).h).equals(Character.valueOf(((q) nVar2).h)) : false) {
                                                        bVar2 = new e8.b(nVar3);
                                                        bVar2.f5352b = i48;
                                                        bVar = bVar2;
                                                        break;
                                                    }
                                                }
                                                bVar = new e8.b(new m(nVar2), nVar3);
                                                bVar.f5352b = i48;
                                                break;
                                            }
                                        } else {
                                            aVar = aVar3;
                                        }
                                        bVar = null;
                                        break;
                                    case 7:
                                        if (this.f6867g >= 4) {
                                            bVar = null;
                                        } else {
                                            int i49 = this.f6865e;
                                            CharSequence charSequence7 = this.f6862a;
                                            int length7 = charSequence7.length();
                                            int i50 = 0;
                                            int i51 = 0;
                                            int i52 = 0;
                                            while (true) {
                                                if (i49 >= length7) {
                                                    int i53 = i51;
                                                    int i54 = i52;
                                                    if ((i50 >= 3 && i53 == 0 && i54 == 0) || ((i53 >= 3 && i50 == 0 && i54 == 0) || (i54 >= 3 && i50 == 0 && i53 == 0))) {
                                                        bVar = new e8.b(new d(1));
                                                        bVar.f5351a = charSequence7.length();
                                                    }
                                                } else {
                                                    char cCharAt14 = charSequence7.charAt(i49);
                                                    if (cCharAt14 == '\t' || cCharAt14 == c10) {
                                                        i51 = i51;
                                                        i52 = i52;
                                                    } else if (cCharAt14 == '*') {
                                                        i52++;
                                                    } else if (cCharAt14 == '-') {
                                                        i50++;
                                                    } else if (cCharAt14 == '_') {
                                                        i51++;
                                                    }
                                                    i49++;
                                                    c10 = ' ';
                                                }
                                                bVar = null;
                                            }
                                        }
                                        aVar = aVar3;
                                        break;
                                    default:
                                        if (this.f6867g >= i17) {
                                            bVar = null;
                                        } else {
                                            int i55 = this.f6865e;
                                            CharSequence charSequence8 = this.f6862a;
                                            int length8 = charSequence8.length();
                                            int i56 = i55;
                                            while (true) {
                                                if (i56 >= length8) {
                                                    i12 = length8 - i55;
                                                } else if ('$' != charSequence8.charAt(i56)) {
                                                    i12 = i56 - i55;
                                                } else {
                                                    i56++;
                                                }
                                            }
                                            if (i12 >= 2 && j8.b(' ', charSequence8, i55 + i12, length8) == length8) {
                                                bVar = new e8.b(new ic.b(i12));
                                                bVar.f5351a = length8 + 1;
                                            } else {
                                                bVar = null;
                                            }
                                        }
                                        aVar = aVar3;
                                        break;
                                }
                                if (bVar == null) {
                                    aVar3 = aVar;
                                    i17 = 4;
                                }
                            } else {
                                aVar = aVar3;
                                bVar = null;
                            }
                        }
                        if (bVar == null) {
                            k(this.f6865e);
                        } else {
                            if (!zIsEmpty) {
                                f(arrayList2);
                                zIsEmpty = true;
                            }
                            int i57 = bVar.f5351a;
                            if (i57 != -1) {
                                k(i57);
                            } else {
                                int i58 = bVar.f5352b;
                                if (i58 != -1) {
                                    j(i58);
                                }
                            }
                            if (bVar.f5353c) {
                                le.a aVarH = h();
                                a9.p.s(1, arrayList);
                                this.f6874o.remove(aVarH);
                                if (aVarH instanceof o) {
                                    b((o) aVarH);
                                }
                                aVarH.e().g();
                            }
                            le.a[] aVarArr = (le.a[]) bVar.d;
                            int length9 = aVarArr.length;
                            int i59 = 0;
                            while (i59 < length9) {
                                le.a aVar5 = aVarArr[i59];
                                a(aVar5);
                                zF = aVar5.f();
                                i59++;
                                aVar = aVar5;
                            }
                            aVar3 = aVar;
                        }
                    }
                }
                aVar = aVar3;
                k(this.f6865e);
            } else {
                aVar = aVar3;
            }
            if (!zIsEmpty && !this.h && h().c()) {
                c();
                return;
            }
            if (!zIsEmpty) {
                f(arrayList2);
            }
            if (!aVar.f()) {
                c();
                return;
            } else {
                if (this.h) {
                    return;
                }
                a(new o());
                c();
                return;
            }
        }
    }

    public final void j(int i10) {
        int i11;
        int i12 = this.f6866f;
        if (i10 >= i12) {
            this.f6863b = this.f6865e;
            this.f6864c = i12;
        }
        int length = this.f6862a.length();
        while (true) {
            i11 = this.f6864c;
            if (i11 >= i10 || this.f6863b == length) {
                break;
            } else {
                d();
            }
        }
        if (i11 <= i10) {
            this.d = false;
            return;
        }
        this.f6863b--;
        this.f6864c = i10;
        this.d = true;
    }

    public final void k(int i10) {
        int i11 = this.f6865e;
        if (i10 >= i11) {
            this.f6863b = i11;
            this.f6864c = this.f6866f;
        }
        int length = this.f6862a.length();
        while (true) {
            int i12 = this.f6863b;
            if (i12 >= i10 || i12 == length) {
                break;
            } else {
                d();
            }
        }
        this.d = false;
    }
}
