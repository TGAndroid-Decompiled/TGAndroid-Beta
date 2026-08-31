package da;

import androidx.recyclerview.widget.RecyclerView;
import f2.o0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import org.telegram.messenger.BuildVars;
import p2.v;
import y5.h;
public final class a {
    public static boolean f4380i = true;
    public final int f4381a;
    public int f4382b;
    public Object f4383c;
    public Serializable d;
    public Object f4384e;
    public Object f4385f;
    public Object f4386g;
    public Object h;

    public a(int i10) {
        this.f4381a = i10;
    }

    public b a() {
        String str;
        if (this.f4382b == 0) {
            str = " registrationStatus";
        } else {
            str = "";
        }
        if (((Long) this.f4386g) == null) {
            str = str.concat(" expiresInSecs");
        }
        if (((Long) this.h) == null) {
            str = w.c.e(str, " tokenCreationEpochInSecs");
        }
        if (str.isEmpty()) {
            return new b((String) this.f4383c, this.f4382b, (String) this.d, (String) this.f4384e, ((Long) this.f4386g).longValue(), ((Long) this.h).longValue(), (String) this.f4385f);
        }
        throw new IllegalStateException("Missing required properties:".concat(str));
    }

    public boolean b(int i10) {
        ArrayList arrayList = (ArrayList) this.f4384e;
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            f2.a aVar = (f2.a) arrayList.get(i11);
            int i12 = aVar.f5725a;
            if (i12 == 8) {
                if (g(aVar.d, i11 + 1) == i10) {
                    return true;
                }
            } else {
                if (i12 == 1) {
                    int i13 = aVar.f5726b;
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
        ArrayList arrayList = (ArrayList) this.f4384e;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((o0) this.f4385f).a((f2.a) arrayList.get(i10));
        }
        m(arrayList);
        this.f4382b = 0;
    }

    public void d() {
        o0 o0Var = (o0) this.f4385f;
        c();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f2.a aVar = (f2.a) arrayList.get(i10);
            int i11 = aVar.f5725a;
            if (i11 != 1) {
                if (i11 != 2) {
                    if (i11 != 4) {
                        if (i11 == 8) {
                            o0Var.a(aVar);
                            o0Var.d(aVar.f5726b, aVar.d);
                        }
                    } else {
                        o0Var.a(aVar);
                        o0Var.b(aVar.f5726b, aVar.d, aVar.f5727c);
                    }
                } else {
                    o0Var.a(aVar);
                    int i12 = aVar.f5726b;
                    int i13 = aVar.d;
                    RecyclerView recyclerView = o0Var.f5902a;
                    recyclerView.e0(i12, i13, true);
                    recyclerView.f1344t0 = true;
                    recyclerView.f1339q0.f5829c += i13;
                }
            } else {
                o0Var.a(aVar);
                o0Var.c(aVar.f5726b, aVar.d);
            }
        }
        m(arrayList);
        this.f4382b = 0;
    }

    public void e(f2.a aVar) {
        int i10;
        v vVar = (v) this.f4383c;
        int i11 = aVar.f5725a;
        if (i11 != 1 && i11 != 8) {
            int o10 = o(aVar.f5726b, i11);
            int i12 = aVar.f5726b;
            int i13 = aVar.f5725a;
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
                int o11 = o((i10 * i15) + aVar.f5726b, aVar.f5725a);
                int i16 = aVar.f5725a;
                if (i16 == 2 ? o11 == o10 : !(i16 != 4 || o11 != o10 + 1)) {
                    i14++;
                } else {
                    f2.a j10 = j(i16, o10, aVar.f5727c, i14);
                    f(j10, i12);
                    j10.f5727c = null;
                    vVar.h(j10);
                    if (aVar.f5725a == 4) {
                        i12 += i14;
                    }
                    o10 = o11;
                    i14 = 1;
                }
            }
            Object obj = aVar.f5727c;
            aVar.f5727c = null;
            vVar.h(aVar);
            if (i14 > 0) {
                f2.a j11 = j(aVar.f5725a, o10, obj, i14);
                f(j11, i12);
                j11.f5727c = null;
                vVar.h(j11);
                return;
            }
            return;
        }
        throw new IllegalArgumentException("should not dispatch add or move for pre layout");
    }

    public void f(f2.a aVar, int i10) {
        o0 o0Var = (o0) this.f4385f;
        o0Var.a(aVar);
        int i11 = aVar.f5725a;
        if (i11 != 2) {
            if (i11 == 4) {
                o0Var.b(i10, aVar.d, aVar.f5727c);
                return;
            }
            throw new IllegalArgumentException("only remove and update ops can be dispatched in first pass");
        }
        int i12 = aVar.d;
        RecyclerView recyclerView = o0Var.f5902a;
        recyclerView.e0(i10, i12, true);
        recyclerView.f1344t0 = true;
        recyclerView.f1339q0.f5829c += i12;
    }

    public int g(int i10, int i11) {
        ArrayList arrayList = (ArrayList) this.f4384e;
        int size = arrayList.size();
        while (i11 < size) {
            f2.a aVar = (f2.a) arrayList.get(i11);
            int i12 = aVar.f5725a;
            if (i12 == 8) {
                int i13 = aVar.f5726b;
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
                int i14 = aVar.f5726b;
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
        f2.a aVar = (f2.a) ((v) this.f4383c).b();
        if (aVar == null) {
            ?? obj2 = new Object();
            obj2.f5725a = i10;
            obj2.f5726b = i11;
            obj2.d = i12;
            obj2.f5727c = obj;
            return obj2;
        }
        aVar.f5725a = i10;
        aVar.f5726b = i11;
        aVar.d = i12;
        aVar.f5727c = obj;
        return aVar;
    }

    public void k(f2.a aVar) {
        o0 o0Var = (o0) this.f4385f;
        ((ArrayList) this.f4384e).add(aVar);
        int i10 = aVar.f5725a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 == 8) {
                        o0Var.d(aVar.f5726b, aVar.d);
                        return;
                    }
                    throw new IllegalArgumentException("Unknown update op type for " + aVar);
                }
                o0Var.b(aVar.f5726b, aVar.d, aVar.f5727c);
                return;
            }
            int i11 = aVar.f5726b;
            int i12 = aVar.d;
            RecyclerView recyclerView = o0Var.f5902a;
            recyclerView.e0(i11, i12, false);
            recyclerView.f1344t0 = true;
            return;
        }
        o0Var.c(aVar.f5726b, aVar.d);
    }

    public void l() {
        throw new UnsupportedOperationException("Method not decompiled: da.a.l():void");
    }

    public void m(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            f2.a aVar = (f2.a) arrayList.get(i10);
            aVar.f5727c = null;
            ((v) this.f4383c).h(aVar);
        }
        arrayList.clear();
    }

    public java.lang.String n() {
        throw new UnsupportedOperationException("Method not decompiled: da.a.n():java.lang.String");
    }

    public int o(int i10, int i11) {
        int i12;
        int i13;
        v vVar = (v) this.f4383c;
        ArrayList arrayList = (ArrayList) this.f4384e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            f2.a aVar = (f2.a) arrayList.get(size);
            int i14 = aVar.f5725a;
            if (i14 == 8) {
                int i15 = aVar.f5726b;
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
                            aVar.f5726b = i15 + 1;
                        } else if (i11 == 2) {
                            aVar.f5726b = i15 - 1;
                        }
                        i10--;
                    }
                } else if (i10 < i15) {
                    if (i11 == 1) {
                        aVar.f5726b = i15 + 1;
                        aVar.d = i16 + 1;
                    } else if (i11 == 2) {
                        aVar.f5726b = i15 - 1;
                        aVar.d = i16 - 1;
                    }
                }
            } else {
                int i17 = aVar.f5726b;
                if (i17 <= i10) {
                    if (i14 == 1) {
                        i10 -= aVar.d;
                    } else if (i14 == 2) {
                        i10 += aVar.d;
                    }
                } else if (i11 == 1) {
                    aVar.f5726b = i17 + 1;
                } else if (i11 == 2) {
                    aVar.f5726b = i17 - 1;
                }
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            f2.a aVar2 = (f2.a) arrayList.get(size2);
            if (aVar2.f5725a == 8) {
                int i18 = aVar2.d;
                if (i18 == aVar2.f5726b || i18 < 0) {
                    arrayList.remove(size2);
                    aVar2.f5727c = null;
                    vVar.h(aVar2);
                }
            } else if (aVar2.d <= 0) {
                arrayList.remove(size2);
                aVar2.f5727c = null;
                vVar.h(aVar2);
            }
        }
        return i10;
    }

    public String toString() {
        switch (this.f4381a) {
            case 1:
                de.b bVar = de.b.f4426e;
                return n();
            default:
                return super.toString();
        }
    }

    public a(o0 o0Var) {
        this.f4381a = 2;
        this.f4383c = new v(30);
        this.d = new ArrayList();
        this.f4384e = new ArrayList();
        this.f4382b = 0;
        this.h = BuildVars.DEBUG_VERSION ? new ArrayList() : null;
        this.f4385f = o0Var;
        this.f4386g = new h(this, 13);
    }
}
