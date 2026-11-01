package kg;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.v2;
public final class s0 {
    public static boolean f11262i = true;
    public final int f11263a;
    public int f11264b;
    public Object f11265c;
    public Serializable d;
    public Object e;
    public Object f11266f;
    public Object f11267g;
    public Object h;

    public s0(int i10) {
        this.f11263a = i10;
    }

    public sa.a a() {
        String str;
        if (this.f11264b == 0) {
            str = " registrationStatus";
        } else {
            str = "";
        }
        if (((Long) this.f11266f) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.f11267g) == null) {
            str = sc.e.A(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new sa.a((String) this.f11265c, this.f11264b, (String) this.d, (String) this.e, ((Long) this.f11266f).longValue(), ((Long) this.f11267g).longValue(), (String) this.h);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public boolean b(int i10) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            s4.a aVar = (s4.a) arrayList.get(i11);
            int i12 = aVar.f47876a;
            if (i12 == 8) {
                if (g(aVar.d, i11 + 1) == i10) {
                    return true;
                }
            } else {
                if (i12 == 1) {
                    int i13 = aVar.f47877b;
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
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((l2.f) this.f11266f).o((s4.a) arrayList.get(i10));
        }
        m(arrayList);
        this.f11264b = 0;
    }

    public void d() {
        l2.f fVar = (l2.f) this.f11266f;
        c();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            s4.a aVar = (s4.a) arrayList.get(i10);
            int i11 = aVar.f47876a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            fVar.o(aVar);
                            fVar.y(aVar.f47877b, aVar.d);
                        }
                    } else {
                        fVar.o(aVar);
                        fVar.w(aVar.f47877b, aVar.d, aVar.f47878c);
                    }
                } else {
                    fVar.o(aVar);
                    int i12 = aVar.f47877b;
                    int i13 = aVar.d;
                    RecyclerView recyclerView = (RecyclerView) fVar.f11588b;
                    recyclerView.f0(i12, i13, true);
                    recyclerView.f1923x0 = true;
                    recyclerView.f1918u0.f48066c += i13;
                }
            } else {
                fVar.o(aVar);
                fVar.x(aVar.f47877b, aVar.d);
            }
        }
        m(arrayList);
        this.f11264b = 0;
    }

    public void e(s4.a aVar) {
        int i10;
        c5.x xVar = (c5.x) this.f11265c;
        int i11 = aVar.f47876a;
        if (i11 != 1 && i11 != 8) {
            int o10 = o(aVar.f47877b, i11);
            int i12 = aVar.f47877b;
            int i13 = aVar.f47876a;
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
                int o11 = o((i10 * i15) + aVar.f47877b, aVar.f47876a);
                int i16 = aVar.f47876a;
                if (i16 == 2 ? o11 == o10 : !(i16 != 4 || o11 != o10 + 1)) {
                    i14++;
                } else {
                    s4.a j10 = j(i16, o10, aVar.f47878c, i14);
                    f(j10, i12);
                    j10.f47878c = null;
                    xVar.r(j10);
                    if (aVar.f47876a == 4) {
                        i12 += i14;
                    }
                    i14 = 1;
                    o10 = o11;
                }
            }
            Object obj = aVar.f47878c;
            aVar.f47878c = null;
            xVar.r(aVar);
            if (i14 > 0) {
                s4.a j11 = j(aVar.f47876a, o10, obj, i14);
                f(j11, i12);
                j11.f47878c = null;
                xVar.r(j11);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public void f(s4.a aVar, int i10) {
        l2.f fVar = (l2.f) this.f11266f;
        fVar.o(aVar);
        int i11 = aVar.f47876a;
        if (i11 != 2) {
            if (i11 == 4) {
                fVar.w(i10, aVar.d, aVar.f47878c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i12 = aVar.d;
        RecyclerView recyclerView = (RecyclerView) fVar.f11588b;
        recyclerView.f0(i10, i12, true);
        recyclerView.f1923x0 = true;
        recyclerView.f1918u0.f48066c += i12;
    }

    public int g(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        while (i11 < size) {
            s4.a aVar = (s4.a) arrayList.get(i11);
            int i12 = aVar.f47876a;
            if (i12 == 8) {
                int i13 = aVar.f47877b;
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
                int i14 = aVar.f47877b;
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

    public s4.a j(int i10, int i11, Object obj, int i12) {
        s4.a aVar = (s4.a) ((c5.x) this.f11265c).b();
        if (aVar == null) {
            ?? obj2 = new Object();
            obj2.f47876a = i10;
            obj2.f47877b = i11;
            obj2.d = i12;
            obj2.f47878c = obj;
            return obj2;
        }
        aVar.f47876a = i10;
        aVar.f47877b = i11;
        aVar.d = i12;
        aVar.f47878c = obj;
        return aVar;
    }

    public void k(s4.a aVar) {
        l2.f fVar = (l2.f) this.f11266f;
        ((ArrayList) this.e).add(aVar);
        int i10 = aVar.f47876a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        fVar.y(aVar.f47877b, aVar.d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + aVar);
                }
                fVar.w(aVar.f47877b, aVar.d, aVar.f47878c);
                return;
            }
            int i11 = aVar.f47877b;
            int i12 = aVar.d;
            RecyclerView recyclerView = (RecyclerView) fVar.f11588b;
            recyclerView.f0(i11, i12, false);
            recyclerView.f1923x0 = true;
            return;
        }
        fVar.x(aVar.f47877b, aVar.d);
    }

    public void l() {
        throw new UnsupportedOperationException("Method not decompiled: kg.s0.l():void");
    }

    public void m(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            s4.a aVar = (s4.a) arrayList.get(i10);
            aVar.f47878c = null;
            ((c5.x) this.f11265c).r(aVar);
        }
        arrayList.clear();
    }

    public java.lang.String n() {
        throw new UnsupportedOperationException("Method not decompiled: kg.s0.n():java.lang.String");
    }

    public int o(int i10, int i11) {
        int i12;
        int i13;
        c5.x xVar = (c5.x) this.f11265c;
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            s4.a aVar = (s4.a) arrayList.get(size);
            int i14 = aVar.f47876a;
            if (i14 == 8) {
                int i15 = aVar.f47877b;
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
                            aVar.f47877b = i15 + 1;
                        } else if (i11 == 2) {
                            aVar.f47877b = i15 - 1;
                        }
                        i10--;
                    }
                } else if (i10 < i15) {
                    if (i11 == 1) {
                        aVar.f47877b = i15 + 1;
                        aVar.d = i16 + 1;
                    } else if (i11 == 2) {
                        aVar.f47877b = i15 - 1;
                        aVar.d = i16 - 1;
                    }
                }
            } else {
                int i17 = aVar.f47877b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= aVar.d;
                    } else if (i14 == 2) {
                        i10 += aVar.d;
                    }
                } else if (i11 == 1) {
                    aVar.f47877b = i17 + 1;
                } else if (i11 == 2) {
                    aVar.f47877b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            s4.a aVar2 = (s4.a) arrayList.get(size2);
            if (aVar2.f47876a == 8) {
                int i18 = aVar2.d;
                if (i18 == aVar2.f47877b || i18 < 0) {
                    arrayList.remove(size2);
                    aVar2.f47878c = null;
                    xVar.r(aVar2);
                }
            } else if (aVar2.d <= 0) {
                arrayList.remove(size2);
                aVar2.f47878c = null;
                xVar.r(aVar2);
            }
        }
        return i10;
    }

    public String toString() {
        switch (this.f11263a) {
            case 1:
                le.b bVar = le.b.e;
                return n();
            default:
                return super.toString();
        }
    }

    public s0(l2.f fVar) {
        this.f11263a = 2;
        this.f11265c = new c5.x(30, 14);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f11264b = 0;
        boolean z10 = v2.f18578a;
        this.h = new ArrayList();
        this.f11266f = fVar;
        this.f11267g = new n2.u(this, 22);
    }
}
