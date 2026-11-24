package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
public final class ha {
    public static boolean i = true;
    public final byte a;
    public int b;
    public Object c;
    public Serializable d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public ha(v39 v39Var) {
        this.a = (byte) 0;
        this.c = new dd(30, (byte) 12);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.b = 0;
        boolean z = w01.a;
        this.f = new ArrayList();
        this.g = v39Var;
        this.h = new pj4(this, (byte) 19);
    }

    public final boolean a(int i2) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ga gaVar = (ga) arrayList.get(i3);
            byte b = gaVar.a;
            if (b == 8) {
                if (f(gaVar.d, i3 + 1) == i2) {
                    return true;
                }
            } else {
                if (b == 1) {
                    int i4 = gaVar.b;
                    int i5 = gaVar.d + i4;
                    while (i4 < i5) {
                        if (f(i4, i3 + 1) == i2) {
                            return true;
                        }
                        i4++;
                    }
                    continue;
                } else {
                    continue;
                }
            }
        }
        return false;
    }

    public final void b() {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ((v39) this.g).L1((ga) arrayList.get(i2));
        }
        l(arrayList);
        this.b = 0;
    }

    public final void c() {
        v39 v39Var = (v39) this.g;
        b();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ga gaVar = (ga) arrayList.get(i2);
            byte b = gaVar.a;
            if (b != 1) {
                if (b != 2) {
                    if (b != 4) {
                        if (b == 8) {
                            v39Var.L1(gaVar);
                            v39Var.S1(gaVar.b, gaVar.d);
                        }
                    } else {
                        v39Var.L1(gaVar);
                        v39Var.P1(gaVar.b, gaVar.d, gaVar.c);
                    }
                } else {
                    v39Var.L1(gaVar);
                    int i3 = gaVar.b;
                    int i4 = gaVar.d;
                    RecyclerView recyclerView = (RecyclerView) v39Var.b;
                    recyclerView.g0(i3, i4, true);
                    recyclerView.y0 = true;
                    recyclerView.v0.c += i4;
                }
            } else {
                v39Var.L1(gaVar);
                v39Var.Q1(gaVar.b, gaVar.d);
            }
        }
        l(arrayList);
        this.b = 0;
    }

    public final void d(ga gaVar) {
        int i2;
        dd ddVar = (dd) this.c;
        byte b = gaVar.a;
        if (b != 1 && b != 8) {
            int n = n(gaVar.b, b);
            int i3 = gaVar.b;
            byte b2 = gaVar.a;
            if (b2 != 2) {
                if (b2 == 4) {
                    i2 = 1;
                } else {
                    w26.i(gaVar, "op should be remove or update.");
                    return;
                }
            } else {
                i2 = 0;
            }
            int i4 = 1;
            for (int i5 = 1; i5 < gaVar.d; i5++) {
                int n2 = n((i2 * i5) + gaVar.b, gaVar.a);
                byte b3 = gaVar.a;
                if (b3 == 2 ? n2 == n : !(b3 != 4 || n2 != n + 1)) {
                    i4++;
                } else {
                    ga i6 = i(gaVar.c, b3, n, i4);
                    e(i6, i3);
                    i6.c = null;
                    ddVar.o0(i6);
                    if (gaVar.a == 4) {
                        i3 += i4;
                    }
                    i4 = 1;
                    n = n2;
                }
            }
            Object obj = gaVar.c;
            gaVar.c = null;
            ddVar.o0(gaVar);
            if (i4 > 0) {
                ga i7 = i(obj, gaVar.a, n, i4);
                e(i7, i3);
                i7.c = null;
                ddVar.o0(i7);
                return;
            }
            return;
        }
        w26.j("should not dispatch add or move for pre layout");
    }

    public final void e(ga gaVar, int i2) {
        v39 v39Var = (v39) this.g;
        v39Var.L1(gaVar);
        byte b = gaVar.a;
        if (b != 2) {
            if (b == 4) {
                v39Var.P1(i2, gaVar.d, gaVar.c);
                return;
            } else {
                w26.j("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = gaVar.d;
        RecyclerView recyclerView = (RecyclerView) v39Var.b;
        recyclerView.g0(i2, i3, true);
        recyclerView.y0 = true;
        recyclerView.v0.c += i3;
    }

    public final int f(int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        while (i3 < size) {
            ga gaVar = (ga) arrayList.get(i3);
            byte b = gaVar.a;
            int i4 = gaVar.b;
            if (b == 8) {
                if (i4 == i2) {
                    i2 = gaVar.d;
                } else {
                    if (i4 < i2) {
                        i2--;
                    }
                    if (gaVar.d <= i2) {
                        i2++;
                    }
                }
            } else if (i4 > i2) {
                continue;
            } else if (b == 2) {
                int i5 = gaVar.d;
                if (i2 < i4 + i5) {
                    return -1;
                }
                i2 -= i5;
            } else if (b == 1) {
                i2 += gaVar.d;
            }
            i3++;
        }
        return i2;
    }

    public final boolean g() {
        if (((ArrayList) this.d).size() > 0) {
            return true;
        }
        return false;
    }

    public final void h(String str) {
        int i2;
        ArrayList arrayList = (ArrayList) this.f;
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
        int i3 = 0;
        for (i2 = 0; i2 < stackTrace.length && i3 < 5; i2++) {
            String stackTraceElement = stackTrace[i2].toString();
            if (!stackTraceElement.startsWith("androidx.recyclerview.widget.") || i3 != 0) {
                sb.append("\n");
                sb.append(stackTraceElement);
                sb.append("\n");
                i3++;
            }
        }
        arrayList.add(sb.toString());
    }

    public final ga i(Object obj, int i2, int i3, int i4) {
        ga gaVar = (ga) ((dd) this.c).U();
        if (gaVar == null) {
            ?? obj2 = new Object();
            obj2.a = i2;
            obj2.b = i3;
            obj2.d = i4;
            obj2.c = obj;
            return obj2;
        }
        gaVar.a = i2;
        gaVar.b = i3;
        gaVar.d = i4;
        gaVar.c = obj;
        return gaVar;
    }

    public final void j(ga gaVar) {
        v39 v39Var = (v39) this.g;
        ((ArrayList) this.e).add(gaVar);
        byte b = gaVar.a;
        if (b != 1) {
            if (b != 2) {
                if (b != 4) {
                    if (b == 8) {
                        v39Var.S1(gaVar.b, gaVar.d);
                        return;
                    } else {
                        w26.i(gaVar, "Unknown update op type for ");
                        return;
                    }
                }
                v39Var.P1(gaVar.b, gaVar.d, gaVar.c);
                return;
            }
            int i2 = gaVar.b;
            int i3 = gaVar.d;
            RecyclerView recyclerView = (RecyclerView) v39Var.b;
            recyclerView.g0(i2, i3, false);
            recyclerView.y0 = true;
            return;
        }
        v39Var.Q1(gaVar.b, gaVar.d);
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ha.k():void");
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ga gaVar = (ga) arrayList.get(i2);
            gaVar.c = null;
            ((dd) this.c).o0(gaVar);
        }
        arrayList.clear();
    }

    public final java.lang.String m() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ha.m():java.lang.String");
    }

    public final int n(int i2, int i3) {
        int i4;
        int i5;
        dd ddVar = (dd) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ga gaVar = (ga) arrayList.get(size);
            byte b = gaVar.a;
            int i6 = gaVar.b;
            if (b == 8) {
                int i7 = gaVar.d;
                if (i6 < i7) {
                    i5 = i7;
                    i4 = i6;
                } else {
                    i4 = i7;
                    i5 = i6;
                }
                if (i2 >= i4 && i2 <= i5) {
                    if (i4 == i6) {
                        if (i3 == 1) {
                            gaVar.d = i7 + 1;
                        } else if (i3 == 2) {
                            gaVar.d = i7 - 1;
                        }
                        i2++;
                    } else {
                        if (i3 == 1) {
                            gaVar.b = i6 + 1;
                        } else if (i3 == 2) {
                            gaVar.b = i6 - 1;
                        }
                        i2--;
                    }
                } else if (i2 < i6) {
                    if (i3 == 1) {
                        gaVar.b = i6 + 1;
                        gaVar.d = i7 + 1;
                    } else if (i3 == 2) {
                        gaVar.b = i6 - 1;
                        gaVar.d = i7 - 1;
                    }
                }
            } else if (i6 <= i2) {
                if (b == 1) {
                    i2 -= gaVar.d;
                } else if (b == 2) {
                    i2 += gaVar.d;
                }
            } else if (i3 == 1) {
                gaVar.b = i6 + 1;
            } else if (i3 == 2) {
                gaVar.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ga gaVar2 = (ga) arrayList.get(size2);
            byte b2 = gaVar2.a;
            int i8 = gaVar2.d;
            if (b2 == 8) {
                if (i8 == gaVar2.b || i8 < 0) {
                    arrayList.remove(size2);
                    gaVar2.c = null;
                    ddVar.o0(gaVar2);
                }
            } else if (i8 <= 0) {
                arrayList.remove(size2);
                gaVar2.c = null;
                ddVar.o0(gaVar2);
            }
        }
        return i2;
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                a9b a9bVar = a9b.e;
                return m();
            default:
                return super.toString();
        }
    }

    public ha(byte b) {
        this.a = b;
    }
}
