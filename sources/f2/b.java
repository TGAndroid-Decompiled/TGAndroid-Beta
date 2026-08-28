package f2;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.BuildVars;
public final class b {
    public static boolean f5314i = true;
    public final int f5315a;
    public int f5316b;
    public Object f5317c;
    public Serializable d;
    public Object f5318e;
    public Object f5319f;
    public Object f5320g;
    public Object h;

    public b(int i9) {
        this.f5315a = i9;
    }

    public z9.a a() {
        String str;
        if (this.f5316b == 0) {
            str = " registrationStatus";
        } else {
            str = "";
        }
        if (((Long) this.f5319f) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.f5320g) == null) {
            str = ta.b.j(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new z9.a((String) this.f5317c, this.f5316b, (String) this.d, (String) this.f5318e, ((Long) this.f5319f).longValue(), ((Long) this.f5320g).longValue(), (String) this.h);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public boolean b(int i9) {
        ArrayList arrayList = (ArrayList) this.f5318e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            a aVar = (a) arrayList.get(i10);
            int i11 = aVar.f5306a;
            if (i11 == 8) {
                if (g(aVar.d, i10 + 1) == i9) {
                    return true;
                }
            } else {
                if (i11 == 1) {
                    int i12 = aVar.f5307b;
                    int i13 = aVar.d + i12;
                    while (i12 < i13) {
                        if (g(i12, i10 + 1) == i9) {
                            return true;
                        }
                        i12++;
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
        ArrayList arrayList = (ArrayList) this.f5318e;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            ((android.support.v4.media.c) this.f5320g).F((a) arrayList.get(i9));
        }
        m(arrayList);
        this.f5316b = 0;
    }

    public void d() {
        android.support.v4.media.c cVar = (android.support.v4.media.c) this.f5320g;
        c();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            a aVar = (a) arrayList.get(i9);
            int i10 = aVar.f5306a;
            if (i10 != 1) {
                if (i10 != 2) {
                    if (i10 != 4) {
                        if (i10 == 8) {
                            cVar.F(aVar);
                            cVar.L(aVar.f5307b, aVar.d);
                        }
                    } else {
                        cVar.F(aVar);
                        cVar.J(aVar.f5307b, aVar.d, aVar.f5308c);
                    }
                } else {
                    cVar.F(aVar);
                    int i11 = aVar.f5307b;
                    int i12 = aVar.d;
                    RecyclerView recyclerView = (RecyclerView) cVar.f281b;
                    recyclerView.e0(i11, i12, true);
                    recyclerView.f1362s0 = true;
                    recyclerView.f1357p0.f5471c += i12;
                }
            } else {
                cVar.F(aVar);
                cVar.K(aVar.f5307b, aVar.d);
            }
        }
        m(arrayList);
        this.f5316b = 0;
    }

    public void e(a aVar) {
        int i9;
        n2.w wVar = (n2.w) this.f5317c;
        int i10 = aVar.f5306a;
        if (i10 != 1 && i10 != 8) {
            int o6 = o(aVar.f5307b, i10);
            int i11 = aVar.f5307b;
            int i12 = aVar.f5306a;
            if (i12 != 2) {
                if (i12 == 4) {
                    i9 = 1;
                } else {
                    throw new IllegalArgumentException("op should be remove or update." + aVar);
                }
            } else {
                i9 = 0;
            }
            int i13 = 1;
            for (int i14 = 1; i14 < aVar.d; i14++) {
                int o9 = o((i9 * i14) + aVar.f5307b, aVar.f5306a);
                int i15 = aVar.f5306a;
                if (i15 == 2 ? o9 == o6 : !(i15 != 4 || o9 != o6 + 1)) {
                    i13++;
                } else {
                    a j10 = j(i15, o6, aVar.f5308c, i13);
                    f(j10, i11);
                    j10.f5308c = null;
                    wVar.h(j10);
                    if (aVar.f5306a == 4) {
                        i11 += i13;
                    }
                    o6 = o9;
                    i13 = 1;
                }
            }
            Object obj = aVar.f5308c;
            aVar.f5308c = null;
            wVar.h(aVar);
            if (i13 > 0) {
                a j11 = j(aVar.f5306a, o6, obj, i13);
                f(j11, i11);
                j11.f5308c = null;
                wVar.h(j11);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public void f(a aVar, int i9) {
        android.support.v4.media.c cVar = (android.support.v4.media.c) this.f5320g;
        cVar.F(aVar);
        int i10 = aVar.f5306a;
        if (i10 != 2) {
            if (i10 == 4) {
                cVar.J(i9, aVar.d, aVar.f5308c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i11 = aVar.d;
        RecyclerView recyclerView = (RecyclerView) cVar.f281b;
        recyclerView.e0(i9, i11, true);
        recyclerView.f1362s0 = true;
        recyclerView.f1357p0.f5471c += i11;
    }

    public int g(int i9, int i10) {
        ArrayList arrayList = (ArrayList) this.f5318e;
        int size = arrayList.size();
        while (i10 < size) {
            a aVar = (a) arrayList.get(i10);
            int i11 = aVar.f5306a;
            if (i11 == 8) {
                int i12 = aVar.f5307b;
                if (i12 == i9) {
                    i9 = aVar.d;
                } else {
                    if (i12 < i9) {
                        i9--;
                    }
                    if (aVar.d <= i9) {
                        i9++;
                    }
                }
            } else {
                int i13 = aVar.f5307b;
                if (i13 > i9) {
                    continue;
                } else if (i11 == 2) {
                    int i14 = aVar.d;
                    if (i9 < i13 + i14) {
                        return -1;
                    }
                    i9 -= i14;
                } else if (i11 == 1) {
                    i9 += aVar.d;
                }
            }
            i10++;
        }
        return i9;
    }

    public boolean h() {
        if (((ArrayList) this.d).size() > 0) {
            return true;
        }
        return false;
    }

    public void i(String str) {
        int i9;
        ArrayList arrayList = (ArrayList) this.f5319f;
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
        int i10 = 0;
        for (i9 = 0; i9 < stackTrace.length && i10 < 5; i9++) {
            String stackTraceElement = stackTrace[i9].toString();
            if (!stackTraceElement.startsWith("androidx.recyclerview.widget.") || i10 != 0) {
                sb2.append("\n");
                sb2.append(stackTraceElement);
                sb2.append("\n");
                i10++;
            }
        }
        arrayList.add(sb2.toString());
    }

    public a j(int i9, int i10, Object obj, int i11) {
        a aVar = (a) ((n2.w) this.f5317c).a();
        if (aVar == null) {
            ?? obj2 = new Object();
            obj2.f5306a = i9;
            obj2.f5307b = i10;
            obj2.d = i11;
            obj2.f5308c = obj;
            return obj2;
        }
        aVar.f5306a = i9;
        aVar.f5307b = i10;
        aVar.d = i11;
        aVar.f5308c = obj;
        return aVar;
    }

    public void k(a aVar) {
        android.support.v4.media.c cVar = (android.support.v4.media.c) this.f5320g;
        ((ArrayList) this.f5318e).add(aVar);
        int i9 = aVar.f5306a;
        if (i9 != 1) {
            if (i9 != 2) {
                if (i9 != 4) {
                    if (i9 == 8) {
                        cVar.L(aVar.f5307b, aVar.d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + aVar);
                }
                cVar.J(aVar.f5307b, aVar.d, aVar.f5308c);
                return;
            }
            int i10 = aVar.f5307b;
            int i11 = aVar.d;
            RecyclerView recyclerView = (RecyclerView) cVar.f281b;
            recyclerView.e0(i10, i11, false);
            recyclerView.f1362s0 = true;
            return;
        }
        cVar.K(aVar.f5307b, aVar.d);
    }

    public void l() {
        throw new UnsupportedOperationException("Method not decompiled: f2.b.l():void");
    }

    public void m(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i9 = 0; i9 < size; i9++) {
            a aVar = (a) arrayList.get(i9);
            aVar.f5308c = null;
            ((n2.w) this.f5317c).h(aVar);
        }
        arrayList.clear();
    }

    public java.lang.String n() {
        throw new UnsupportedOperationException("Method not decompiled: f2.b.n():java.lang.String");
    }

    public int o(int i9, int i10) {
        int i11;
        int i12;
        n2.w wVar = (n2.w) this.f5317c;
        ArrayList arrayList = (ArrayList) this.f5318e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            a aVar = (a) arrayList.get(size);
            int i13 = aVar.f5306a;
            if (i13 == 8) {
                int i14 = aVar.f5307b;
                int i15 = aVar.d;
                if (i14 < i15) {
                    i12 = i14;
                    i11 = i15;
                } else {
                    i11 = i14;
                    i12 = i15;
                }
                if (i9 >= i12 && i9 <= i11) {
                    if (i12 == i14) {
                        if (i10 == 1) {
                            aVar.d = i15 + 1;
                        } else if (i10 == 2) {
                            aVar.d = i15 - 1;
                        }
                        i9++;
                    } else {
                        if (i10 == 1) {
                            aVar.f5307b = i14 + 1;
                        } else if (i10 == 2) {
                            aVar.f5307b = i14 - 1;
                        }
                        i9--;
                    }
                } else if (i9 < i14) {
                    if (i10 == 1) {
                        aVar.f5307b = i14 + 1;
                        aVar.d = i15 + 1;
                    } else if (i10 == 2) {
                        aVar.f5307b = i14 - 1;
                        aVar.d = i15 - 1;
                    }
                }
            } else {
                int i16 = aVar.f5307b;
                if (i16 <= i9) {
                    if (i13 == 1) {
                        i9 -= aVar.d;
                    } else if (i13 == 2) {
                        i9 += aVar.d;
                    }
                } else if (i10 == 1) {
                    aVar.f5307b = i16 + 1;
                } else if (i10 == 2) {
                    aVar.f5307b = i16 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            a aVar2 = (a) arrayList.get(size2);
            if (aVar2.f5306a == 8) {
                int i17 = aVar2.d;
                if (i17 == aVar2.f5307b || i17 < 0) {
                    arrayList.remove(size2);
                    aVar2.f5308c = null;
                    wVar.h(aVar2);
                }
            } else if (aVar2.d <= 0) {
                arrayList.remove(size2);
                aVar2.f5308c = null;
                wVar.h(aVar2);
            }
        }
        return i9;
    }

    public String toString() {
        switch (this.f5315a) {
            case 2:
                zd.c cVar = zd.c.f50429e;
                return n();
            default:
                return super.toString();
        }
    }

    public b(android.support.v4.media.c cVar) {
        this.f5315a = 0;
        this.f5317c = new n2.w(30);
        this.d = new ArrayList();
        this.f5318e = new ArrayList();
        this.f5316b = 0;
        this.f5319f = BuildVars.DEBUG_VERSION ? new ArrayList() : null;
        this.f5320g = cVar;
        this.h = new xa.c(this, 13);
    }
}
