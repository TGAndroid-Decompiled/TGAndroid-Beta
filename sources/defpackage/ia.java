package defpackage;

import androidx.recyclerview.widget.RecyclerView;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
public final class ia {
    public static boolean i = true;
    public final byte a;
    public int b;
    public Object c;
    public Serializable d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;

    public ia(k09 k09Var) {
        this.a = (byte) 0;
        this.c = new ed(30, (byte) 12);
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.b = 0;
        boolean z = f11.a;
        this.f = new ArrayList();
        this.g = k09Var;
        this.h = new kj4(this, (byte) 21);
    }

    public final boolean a(int i2) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        for (int i3 = 0; i3 < size; i3++) {
            ha haVar = (ha) arrayList.get(i3);
            byte b = haVar.a;
            if (b == 8) {
                if (f(haVar.d, i3 + 1) == i2) {
                    return true;
                }
            } else {
                if (b == 1) {
                    int i4 = haVar.b;
                    int i5 = haVar.d + i4;
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
            ((k09) this.g).o2((ha) arrayList.get(i2));
        }
        l(arrayList);
        this.b = 0;
    }

    public final void c() {
        k09 k09Var = (k09) this.g;
        b();
        ArrayList arrayList = (ArrayList) this.d;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ha haVar = (ha) arrayList.get(i2);
            byte b = haVar.a;
            if (b != 1) {
                if (b != 2) {
                    if (b != 4) {
                        if (b == 8) {
                            k09Var.o2(haVar);
                            k09Var.r2(haVar.b, haVar.d);
                        }
                    } else {
                        k09Var.o2(haVar);
                        k09Var.p2(haVar.b, haVar.d, haVar.c);
                    }
                } else {
                    k09Var.o2(haVar);
                    int i3 = haVar.b;
                    int i4 = haVar.d;
                    RecyclerView recyclerView = (RecyclerView) k09Var.b;
                    recyclerView.h0(i3, i4, true);
                    recyclerView.y0 = true;
                    recyclerView.v0.c += i4;
                }
            } else {
                k09Var.o2(haVar);
                k09Var.q2(haVar.b, haVar.d);
            }
        }
        l(arrayList);
        this.b = 0;
    }

    public final void d(ha haVar) {
        int i2;
        ed edVar = (ed) this.c;
        byte b = haVar.a;
        if (b != 1 && b != 8) {
            int n = n(haVar.b, b);
            int i3 = haVar.b;
            byte b2 = haVar.a;
            if (b2 != 2) {
                if (b2 == 4) {
                    i2 = 1;
                } else {
                    lq5.q(haVar, "op should be remove or update.");
                    return;
                }
            } else {
                i2 = 0;
            }
            int i4 = 1;
            for (int i5 = 1; i5 < haVar.d; i5++) {
                int n2 = n((i2 * i5) + haVar.b, haVar.a);
                byte b3 = haVar.a;
                if (b3 == 2 ? n2 == n : !(b3 != 4 || n2 != n + 1)) {
                    i4++;
                } else {
                    ha i6 = i(haVar.c, b3, n, i4);
                    e(i6, i3);
                    i6.c = null;
                    edVar.r0(i6);
                    if (haVar.a == 4) {
                        i3 += i4;
                    }
                    i4 = 1;
                    n = n2;
                }
            }
            Object obj = haVar.c;
            haVar.c = null;
            edVar.r0(haVar);
            if (i4 > 0) {
                ha i7 = i(obj, haVar.a, n, i4);
                e(i7, i3);
                i7.c = null;
                edVar.r0(i7);
                return;
            }
            return;
        }
        lq5.j("should not dispatch add or move for pre layout");
    }

    public final void e(ha haVar, int i2) {
        k09 k09Var = (k09) this.g;
        k09Var.o2(haVar);
        byte b = haVar.a;
        if (b != 2) {
            if (b == 4) {
                k09Var.p2(i2, haVar.d, haVar.c);
                return;
            } else {
                lq5.j("only remove and update ops can be dispatched in first pass");
                return;
            }
        }
        int i3 = haVar.d;
        RecyclerView recyclerView = (RecyclerView) k09Var.b;
        recyclerView.h0(i2, i3, true);
        recyclerView.y0 = true;
        recyclerView.v0.c += i3;
    }

    public final int f(int i2, int i3) {
        ArrayList arrayList = (ArrayList) this.e;
        int size = arrayList.size();
        while (i3 < size) {
            ha haVar = (ha) arrayList.get(i3);
            byte b = haVar.a;
            int i4 = haVar.b;
            if (b == 8) {
                if (i4 == i2) {
                    i2 = haVar.d;
                } else {
                    if (i4 < i2) {
                        i2--;
                    }
                    if (haVar.d <= i2) {
                        i2++;
                    }
                }
            } else if (i4 > i2) {
                continue;
            } else if (b == 2) {
                int i5 = haVar.d;
                if (i2 < i4 + i5) {
                    return -1;
                }
                i2 -= i5;
            } else if (b == 1) {
                i2 += haVar.d;
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

    public final ha i(Object obj, int i2, int i3, int i4) {
        ha haVar = (ha) ((ed) this.c).U();
        if (haVar == null) {
            ?? obj2 = new Object();
            obj2.a = i2;
            obj2.b = i3;
            obj2.d = i4;
            obj2.c = obj;
            return obj2;
        }
        haVar.a = i2;
        haVar.b = i3;
        haVar.d = i4;
        haVar.c = obj;
        return haVar;
    }

    public final void j(ha haVar) {
        k09 k09Var = (k09) this.g;
        ((ArrayList) this.e).add(haVar);
        byte b = haVar.a;
        if (b != 1) {
            if (b != 2) {
                if (b != 4) {
                    if (b == 8) {
                        k09Var.r2(haVar.b, haVar.d);
                        return;
                    } else {
                        lq5.q(haVar, "Unknown update op type for ");
                        return;
                    }
                }
                k09Var.p2(haVar.b, haVar.d, haVar.c);
                return;
            }
            int i2 = haVar.b;
            int i3 = haVar.d;
            RecyclerView recyclerView = (RecyclerView) k09Var.b;
            recyclerView.h0(i2, i3, false);
            recyclerView.y0 = true;
            return;
        }
        k09Var.q2(haVar.b, haVar.d);
    }

    public final void k() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia.k():void");
    }

    public final void l(ArrayList arrayList) {
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            ha haVar = (ha) arrayList.get(i2);
            haVar.c = null;
            ((ed) this.c).r0(haVar);
        }
        arrayList.clear();
    }

    public final java.lang.String m() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ia.m():java.lang.String");
    }

    public final int n(int i2, int i3) {
        int i4;
        int i5;
        ed edVar = (ed) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            ha haVar = (ha) arrayList.get(size);
            byte b = haVar.a;
            int i6 = haVar.b;
            if (b == 8) {
                int i7 = haVar.d;
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
                            haVar.d = i7 + 1;
                        } else if (i3 == 2) {
                            haVar.d = i7 - 1;
                        }
                        i2++;
                    } else {
                        if (i3 == 1) {
                            haVar.b = i6 + 1;
                        } else if (i3 == 2) {
                            haVar.b = i6 - 1;
                        }
                        i2--;
                    }
                } else if (i2 < i6) {
                    if (i3 == 1) {
                        haVar.b = i6 + 1;
                        haVar.d = i7 + 1;
                    } else if (i3 == 2) {
                        haVar.b = i6 - 1;
                        haVar.d = i7 - 1;
                    }
                }
            } else if (i6 <= i2) {
                if (b == 1) {
                    i2 -= haVar.d;
                } else if (b == 2) {
                    i2 += haVar.d;
                }
            } else if (i3 == 1) {
                haVar.b = i6 + 1;
            } else if (i3 == 2) {
                haVar.b = i6 - 1;
            }
        }
        for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
            ha haVar2 = (ha) arrayList.get(size2);
            byte b2 = haVar2.a;
            int i8 = haVar2.d;
            if (b2 == 8) {
                if (i8 == haVar2.b || i8 < 0) {
                    arrayList.remove(size2);
                    haVar2.c = null;
                    edVar.r0(haVar2);
                }
            } else if (i8 <= 0) {
                arrayList.remove(size2);
                haVar2.c = null;
                edVar.r0(haVar2);
            }
        }
        return i2;
    }

    public final String toString() {
        switch (this.a) {
            case 2:
                ycb ycbVar = ycb.e;
                return m();
            default:
                return super.toString();
        }
    }

    public ia(byte b) {
        this.a = b;
    }
}
