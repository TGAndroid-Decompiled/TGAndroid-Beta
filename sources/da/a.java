package da;

import androidx.recyclerview.widget.RecyclerView;
import f2.n0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import o5.i;
import org.telegram.messenger.BuildVars;
import p2.w;
import vh.v2;
public final class a {
    public static boolean f4300i = true;
    public final int f4301a;
    public int f4302b;
    public Object f4303c;
    public Serializable d;
    public Object e;
    public Object f4304f;
    public Object f4305g;
    public Object h;

    public a(int i10) {
        this.f4301a = i10;
    }

    public b a() {
        String str;
        if (this.f4302b == 0) {
            str = " registrationStatus";
        } else {
            str = "";
        }
        if (((Long) this.f4305g) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.h) == null) {
            str = v2.k(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new b((String) this.f4303c, this.f4302b, (String) this.d, (String) this.e, ((Long) this.f4305g).longValue(), ((Long) this.h).longValue(), (String) this.f4304f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public boolean b(int i10) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            f2.a aVar = (f2.a) arrayList.get(i11);
            int i12 = aVar.f5654a;
            if (i12 == 8) {
                if (g(aVar.d, i11 + 1) == i10) {
                    return true;
                }
            } else {
                if (i12 == 1) {
                    int i13 = aVar.f5655b;
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
            ((n0) this.f4304f).a((f2.a) arrayList.get(i10));
        }
        m(arrayList);
        this.f4302b = 0;
    }

    public void d() {
        n0 n0Var = (n0) this.f4304f;
        c();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f2.a aVar = (f2.a) arrayList.get(i10);
            int i11 = aVar.f5654a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            n0Var.a(aVar);
                            n0Var.d(aVar.f5655b, aVar.d);
                        }
                    } else {
                        n0Var.a(aVar);
                        n0Var.b(aVar.f5655b, aVar.d, aVar.f5656c);
                    }
                } else {
                    n0Var.a(aVar);
                    int i12 = aVar.f5655b;
                    int i13 = aVar.d;
                    RecyclerView recyclerView = n0Var.f5812a;
                    recyclerView.e0(i12, i13, true);
                    recyclerView.f1245t0 = true;
                    recyclerView.f1240q0.f5744c += i13;
                }
            } else {
                n0Var.a(aVar);
                n0Var.c(aVar.f5655b, aVar.d);
            }
        }
        m(arrayList);
        this.f4302b = 0;
    }

    public void e(f2.a aVar) {
        int i10;
        w wVar = (w) this.f4303c;
        int i11 = aVar.f5654a;
        if (i11 != 1 && i11 != 8) {
            int o10 = o(aVar.f5655b, i11);
            int i12 = aVar.f5655b;
            int i13 = aVar.f5654a;
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
                int o11 = o((i10 * i15) + aVar.f5655b, aVar.f5654a);
                int i16 = aVar.f5654a;
                if (i16 == 2 ? o11 == o10 : !(i16 != 4 || o11 != o10 + 1)) {
                    i14++;
                } else {
                    f2.a j10 = j(i16, o10, aVar.f5656c, i14);
                    f(j10, i12);
                    j10.f5656c = null;
                    wVar.h(j10);
                    if (aVar.f5654a == 4) {
                        i12 += i14;
                    }
                    o10 = o11;
                    i14 = 1;
                }
            }
            Object obj = aVar.f5656c;
            aVar.f5656c = null;
            wVar.h(aVar);
            if (i14 > 0) {
                f2.a j11 = j(aVar.f5654a, o10, obj, i14);
                f(j11, i12);
                j11.f5656c = null;
                wVar.h(j11);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public void f(f2.a aVar, int i10) {
        n0 n0Var = (n0) this.f4304f;
        n0Var.a(aVar);
        int i11 = aVar.f5654a;
        if (i11 != 2) {
            if (i11 == 4) {
                n0Var.b(i10, aVar.d, aVar.f5656c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i12 = aVar.d;
        RecyclerView recyclerView = n0Var.f5812a;
        recyclerView.e0(i10, i12, true);
        recyclerView.f1245t0 = true;
        recyclerView.f1240q0.f5744c += i12;
    }

    public int g(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        while (i11 < size) {
            f2.a aVar = (f2.a) arrayList.get(i11);
            int i12 = aVar.f5654a;
            if (i12 == 8) {
                int i13 = aVar.f5655b;
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
                int i14 = aVar.f5655b;
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
        StringBuilder sb = new StringBuilder();
        sb.append(new Date().toString());
        sb.append("  ");
        sb.append(str);
        sb.append("\n");
        StackTraceElement[] stackTrace = new Exception().getStackTrace();
        int i11 = 0;
        for (i10 = 0; i10 < stackTrace.length && i11 < 5; i10++) {
            String stackTraceElement = stackTrace[i10].toString();
            if (!stackTraceElement.startsWith("androidx.recyclerview.widget.") || i11 != 0) {
                sb.append("\n");
                sb.append(stackTraceElement);
                sb.append("\n");
                i11++;
            }
        }
        arrayList.add(sb.toString());
    }

    public f2.a j(int i10, int i11, Object obj, int i12) {
        f2.a aVar = (f2.a) ((w) this.f4303c).b();
        if (aVar == null) {
            ?? obj2 = new Object();
            obj2.f5654a = i10;
            obj2.f5655b = i11;
            obj2.d = i12;
            obj2.f5656c = obj;
            return obj2;
        }
        aVar.f5654a = i10;
        aVar.f5655b = i11;
        aVar.d = i12;
        aVar.f5656c = obj;
        return aVar;
    }

    public void k(f2.a aVar) {
        n0 n0Var = (n0) this.f4304f;
        ((ArrayList) this.e).add(aVar);
        int i10 = aVar.f5654a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        n0Var.d(aVar.f5655b, aVar.d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + aVar);
                }
                n0Var.b(aVar.f5655b, aVar.d, aVar.f5656c);
                return;
            }
            int i11 = aVar.f5655b;
            int i12 = aVar.d;
            RecyclerView recyclerView = n0Var.f5812a;
            recyclerView.e0(i11, i12, false);
            recyclerView.f1245t0 = true;
            return;
        }
        n0Var.c(aVar.f5655b, aVar.d);
    }

    public void l() {
        throw new UnsupportedOperationException("Method not decompiled: da.a.l():void");
    }

    public void m(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f2.a aVar = (f2.a) arrayList.get(i10);
            aVar.f5656c = null;
            ((w) this.f4303c).h(aVar);
        }
        arrayList.clear();
    }

    public java.lang.String n() {
        throw new UnsupportedOperationException("Method not decompiled: da.a.n():java.lang.String");
    }

    public int o(int i10, int i11) {
        int i12;
        int i13;
        w wVar = (w) this.f4303c;
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f2.a aVar = (f2.a) arrayList.get(size);
            int i14 = aVar.f5654a;
            if (i14 == 8) {
                int i15 = aVar.f5655b;
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
                            aVar.f5655b = i15 + 1;
                        } else if (i11 == 2) {
                            aVar.f5655b = i15 - 1;
                        }
                        i10--;
                    }
                } else if (i10 < i15) {
                    if (i11 == 1) {
                        aVar.f5655b = i15 + 1;
                        aVar.d = i16 + 1;
                    } else if (i11 == 2) {
                        aVar.f5655b = i15 - 1;
                        aVar.d = i16 - 1;
                    }
                }
            } else {
                int i17 = aVar.f5655b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= aVar.d;
                    } else if (i14 == 2) {
                        i10 += aVar.d;
                    }
                } else if (i11 == 1) {
                    aVar.f5655b = i17 + 1;
                } else if (i11 == 2) {
                    aVar.f5655b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            f2.a aVar2 = (f2.a) arrayList.get(size2);
            if (aVar2.f5654a == 8) {
                int i18 = aVar2.d;
                if (i18 == aVar2.f5655b || i18 < 0) {
                    arrayList.remove(size2);
                    aVar2.f5656c = null;
                    wVar.h(aVar2);
                }
            } else if (aVar2.d <= 0) {
                arrayList.remove(size2);
                aVar2.f5656c = null;
                wVar.h(aVar2);
            }
        }
        return i10;
    }

    public String toString() {
        switch (this.f4301a) {
            case 1:
                de.b bVar = de.b.e;
                return n();
            default:
                return super.toString();
        }
    }

    public a(n0 n0Var) {
        this.f4301a = 3;
        this.f4303c = new w(30);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f4302b = 0;
        this.h = BuildVars.DEBUG_VERSION ? new ArrayList() : null;
        this.f4304f = n0Var;
        this.f4305g = new i(this, 14);
    }
}
