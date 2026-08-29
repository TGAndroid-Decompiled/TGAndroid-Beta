package ba;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.BuildVars;
import p2.u;
public final class a {
    public static boolean f2025i = true;
    public final int f2026a;
    public int f2027b;
    public Object f2028c;
    public Serializable d;
    public Object f2029e;
    public Object f2030f;
    public Object f2031g;
    public Object h;

    public a(int i10) {
        this.f2026a = i10;
    }

    public b a() {
        String str;
        if (this.f2027b == 0) {
            str = " registrationStatus";
        } else {
            str = "";
        }
        if (((Long) this.f2031g) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.h) == null) {
            str = u3.c.k(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new b((String) this.f2028c, this.f2027b, (String) this.d, (String) this.f2029e, ((Long) this.f2031g).longValue(), ((Long) this.h).longValue(), (String) this.f2030f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public boolean b(int i10) {
        ArrayList arrayList = (ArrayList) this.f2029e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            f2.a aVar = (f2.a) arrayList.get(i11);
            int i12 = aVar.f6268a;
            if (i12 == 8) {
                if (g(aVar.d, i11 + 1) == i10) {
                    return true;
                }
            } else {
                if (i12 == 1) {
                    int i13 = aVar.f6269b;
                    int i14 = aVar.d + i13;
                    while (i13 < i14) {
                        if (g(i13, i11 + 1) == i10) {
                            return true;
                        }
                        i13++;
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public void c() {
        ArrayList arrayList = (ArrayList) this.f2029e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((za.c) this.f2030f).j((f2.a) arrayList.get(i10));
        }
        m(arrayList);
        this.f2027b = 0;
    }

    public void d() {
        za.c cVar = (za.c) this.f2030f;
        c();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f2.a aVar = (f2.a) arrayList.get(i10);
            int i11 = aVar.f6268a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            cVar.j(aVar);
                            cVar.x(aVar.f6269b, aVar.d);
                        }
                    } else {
                        cVar.j(aVar);
                        cVar.q(aVar.f6269b, aVar.d, aVar.f6270c);
                    }
                } else {
                    cVar.j(aVar);
                    int i12 = aVar.f6269b;
                    int i13 = aVar.d;
                    RecyclerView recyclerView = (RecyclerView) cVar.f50799b;
                    recyclerView.e0(i12, i13, true);
                    recyclerView.f1852s0 = true;
                    recyclerView.f1847p0.f6394c += i13;
                }
            } else {
                cVar.j(aVar);
                cVar.u(aVar.f6269b, aVar.d);
            }
        }
        m(arrayList);
        this.f2027b = 0;
    }

    public void e(f2.a aVar) {
        int i10;
        u uVar = (u) this.f2028c;
        int i11 = aVar.f6268a;
        if (i11 != 1 && i11 != 8) {
            int o10 = o(aVar.f6269b, i11);
            int i12 = aVar.f6269b;
            int i13 = aVar.f6268a;
            if (i13 != 2) {
                if (i13 == 4) {
                    i10 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + aVar);
                }
            } else {
                i10 = 0;
            }
            int i14 = 1;
            for (int i15 = 1; i15 < aVar.d; i15++) {
                int o11 = o((i10 * i15) + aVar.f6269b, aVar.f6268a);
                int i16 = aVar.f6268a;
                if (i16 == 2 ? o11 == o10 : !(i16 != 4 || o11 != o10 + 1)) {
                    i14++;
                } else {
                    f2.a j10 = j(i16, o10, aVar.f6270c, i14);
                    f(j10, i12);
                    j10.f6270c = null;
                    uVar.h(j10);
                    if (aVar.f6268a == 4) {
                        i12 += i14;
                    }
                    o10 = o11;
                    i14 = 1;
                }
            }
            Object obj = aVar.f6270c;
            aVar.f6270c = null;
            uVar.h(aVar);
            if (i14 > 0) {
                f2.a j11 = j(aVar.f6268a, o10, obj, i14);
                f(j11, i12);
                j11.f6270c = null;
                uVar.h(j11);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public void f(f2.a aVar, int i10) {
        za.c cVar = (za.c) this.f2030f;
        cVar.j(aVar);
        int i11 = aVar.f6268a;
        if (i11 != 2) {
            if (i11 == 4) {
                cVar.q(i10, aVar.d, aVar.f6270c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i12 = aVar.d;
        RecyclerView recyclerView = (RecyclerView) cVar.f50799b;
        recyclerView.e0(i10, i12, true);
        recyclerView.f1852s0 = true;
        recyclerView.f1847p0.f6394c += i12;
    }

    public int g(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.f2029e;
        int size = arrayList.size();
        while (i11 < size) {
            f2.a aVar = (f2.a) arrayList.get(i11);
            int i12 = aVar.f6268a;
            if (i12 == 8) {
                int i13 = aVar.f6269b;
                if (i13 == i10) {
                    i10 = aVar.d;
                } else {
                    if (i13 < i10) {
                        i10--;
                    }
                    if (aVar.d <= i10) {
                        i10++;
                    }
                }
            } else {
                int i14 = aVar.f6269b;
                if (i14 > i10) {
                    continue;
                } else if (i12 == 2) {
                    int i15 = aVar.d;
                    if (i10 < i14 + i15) {
                        return -1;
                    }
                    i10 -= i15;
                } else if (i12 == 1) {
                    i10 += aVar.d;
                }
            }
            i11++;
        }
        return i10;
    }

    public boolean h() {
        if (((ArrayList) this.d).size() > 0) {
            return true;
        }
        return false;
    }

    public void i(String str) {
        int i10;
        ArrayList arrayList = (ArrayList) this.h;
        if (arrayList == null) {
            return;
        }
        while (true) {
            if (arrayList.size() <= 5) {
                break;
            }
            arrayList.remove(0);
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(new Date().toString());
        sb2.append("  ");
        sb2.append(str);
        sb2.append("\n");
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        int i11 = 0;
        for (i10 = 0; i10 < stackTrace.length && i11 < 5; i10++) {
            String stackTraceElement = stackTrace[i10].toString();
            if (!stackTraceElement.startsWith("androidx.recyclerview.widget.") || i11 != 0) {
                sb2.append("\n");
                sb2.append(stackTraceElement);
                sb2.append("\n");
                i11++;
            }
        }
        arrayList.add(sb2.toString());
    }

    public f2.a j(int i10, int i11, Object obj, int i12) {
        f2.a aVar = (f2.a) ((u) this.f2028c).b();
        if (aVar == null) {
            ?? obj2 = new Object();
            obj2.f6268a = i10;
            obj2.f6269b = i11;
            obj2.d = i12;
            obj2.f6270c = obj;
            return obj2;
        }
        aVar.f6268a = i10;
        aVar.f6269b = i11;
        aVar.d = i12;
        aVar.f6270c = obj;
        return aVar;
    }

    public void k(f2.a aVar) {
        za.c cVar = (za.c) this.f2030f;
        ((ArrayList) this.f2029e).add(aVar);
        int i10 = aVar.f6268a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        cVar.x(aVar.f6269b, aVar.d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + aVar);
                }
                cVar.q(aVar.f6269b, aVar.d, aVar.f6270c);
                return;
            }
            int i11 = aVar.f6269b;
            int i12 = aVar.d;
            RecyclerView recyclerView = (RecyclerView) cVar.f50799b;
            recyclerView.e0(i11, i12, false);
            recyclerView.f1852s0 = true;
            return;
        }
        cVar.u(aVar.f6269b, aVar.d);
    }

    public void l() {
        throw new UnsupportedOperationException("Method not decompiled: ba.a.l():void");
    }

    public void m(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f2.a aVar = (f2.a) arrayList.get(i10);
            aVar.f6270c = null;
            ((u) this.f2028c).h(aVar);
        }
        arrayList.clear();
    }

    public java.lang.String n() {
        throw new UnsupportedOperationException("Method not decompiled: ba.a.n():java.lang.String");
    }

    public int o(int i10, int i11) {
        int i12;
        int i13;
        u uVar = (u) this.f2028c;
        ArrayList arrayList = (ArrayList) this.f2029e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f2.a aVar = (f2.a) arrayList.get(size);
            int i14 = aVar.f6268a;
            if (i14 == 8) {
                int i15 = aVar.f6269b;
                int i16 = aVar.d;
                if (i15 < i16) {
                    i13 = i15;
                    i12 = i16;
                } else {
                    i12 = i15;
                    i13 = i16;
                }
                if (i10 >= i13 && i10 <= i12) {
                    if (i13 == i15) {
                        if (i11 == 1) {
                            aVar.d = i16 + 1;
                        } else if (i11 == 2) {
                            aVar.d = i16 - 1;
                        }
                        i10++;
                    } else {
                        if (i11 == 1) {
                            aVar.f6269b = i15 + 1;
                        } else if (i11 == 2) {
                            aVar.f6269b = i15 - 1;
                        }
                        i10--;
                    }
                } else if (i10 < i15) {
                    if (i11 == 1) {
                        aVar.f6269b = i15 + 1;
                        aVar.d = i16 + 1;
                    } else if (i11 == 2) {
                        aVar.f6269b = i15 - 1;
                        aVar.d = i16 - 1;
                    }
                }
            } else {
                int i17 = aVar.f6269b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= aVar.d;
                    } else if (i14 == 2) {
                        i10 += aVar.d;
                    }
                } else if (i11 == 1) {
                    aVar.f6269b = i17 + 1;
                } else if (i11 == 2) {
                    aVar.f6269b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            f2.a aVar2 = (f2.a) arrayList.get(size2);
            if (aVar2.f6268a == 8) {
                int i18 = aVar2.d;
                if (i18 == aVar2.f6269b || i18 < 0) {
                    arrayList.remove(size2);
                    aVar2.f6270c = null;
                    uVar.h(aVar2);
                }
            } else if (aVar2.d <= 0) {
                arrayList.remove(size2);
                aVar2.f6270c = null;
                uVar.h(aVar2);
            }
        }
        return i10;
    }

    public String toString() {
        switch (this.f2026a) {
            case 1:
                be.b bVar = be.b.f2073e;
                return n();
            default:
                return super.toString();
        }
    }

    public a(za.c cVar) {
        this.f2026a = 3;
        this.f2028c = new u(30);
        this.d = new ArrayList();
        this.f2029e = new ArrayList();
        this.f2027b = 0;
        this.h = BuildVars.DEBUG_VERSION ? new ArrayList() : null;
        this.f2030f = cVar;
        this.f2031g = new ha.c(this, 15);
    }
}
