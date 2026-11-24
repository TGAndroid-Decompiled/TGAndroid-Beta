package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public final class x66 implements Iterable {
    public final t66 a;
    public final h94 c;
    public final w66 d;
    public boolean f;
    public final ArrayList b = new ArrayList();
    public final ArrayList e = new ArrayList();

    public x66(t66 t66Var, Interpolator interpolator, long j) {
        this.a = t66Var;
        this.d = new w66(this, t66Var);
        if (interpolator != null && j > 0) {
            this.c = new h94(0, new ai4(this, (byte) 10), interpolator, j);
        } else {
            this.c = null;
        }
    }

    public final void h(float f) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        w66 w66Var = this.d;
        boolean a = w66Var.b.a(f);
        if (!w66Var.d.a(f) && !a) {
            z = false;
        } else {
            z = true;
        }
        if (!w66Var.e.a(f) && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!w66Var.f.a(f) && !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!w66Var.g.a(f) && !z3) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!w66Var.c.a(f) && !z4) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!w66Var.a.m(f) && !z5) {
            z6 = false;
        } else {
            z6 = true;
        }
        ArrayList arrayList = this.b;
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            u66 u66Var = (u66) obj;
            boolean a2 = u66Var.c.a(f);
            if (!u66Var.d.a(f) && !a2) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (!u66Var.e.a(f) && !z7) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (!u66Var.f.a(f) && !z8) {
                z9 = false;
            } else {
                z9 = true;
            }
            Object obj2 = u66Var.a;
            if (obj2 instanceof cbc) {
                if (!((cbc) obj2).a(f) && !z9) {
                    z9 = false;
                } else {
                    z9 = true;
                }
            }
            if (!z9 && !z6) {
                z6 = false;
            } else {
                z6 = true;
            }
        }
        if (z6) {
            this.a.A();
            if (f == 1.0f) {
                l(true);
            }
        }
    }

    public final u66 i(int i) {
        return (u66) this.b.get(i);
    }

    @Override
    public final Iterator iterator() {
        return this.b.iterator();
    }

    public final void j(boolean z) {
        ArrayList arrayList;
        boolean z2;
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i5 < size) {
            Object obj = arrayList2.get(i5);
            i5++;
            u66 u66Var = (u66) obj;
            Object obj2 = u66Var.a;
            bbc bbcVar = u66Var.f;
            cbc cbcVar = u66Var.e;
            if (obj2 instanceof v66) {
                v66 v66Var = (v66) obj2;
                if (u66Var.b == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList2.size();
                int b = v66Var.b(z2);
                int width = v66Var.getWidth();
                int height = v66Var.getHeight();
                int i6 = b + width + i;
                int i7 = i2 + b + height;
                if (z && u66Var.c() > 0.0f) {
                    float f = i;
                    float f2 = i2;
                    float f3 = i6;
                    arrayList = arrayList2;
                    float f4 = i7;
                    if (cbcVar.b(f, f2, f3, f4)) {
                        k();
                        cbcVar.e(f, f2, f3, f4);
                    }
                    float f5 = b;
                    if (bbcVar.b(f5)) {
                        k();
                        bbcVar.c = f5;
                    }
                } else {
                    arrayList = arrayList2;
                    cbcVar.d(i, i2, i6, i7);
                    bbcVar.d(b);
                }
                i3 = Math.max(i3, width);
                i4 = Math.max(i4, height);
                i2 = i7;
                i = i6;
            } else {
                arrayList = arrayList2;
            }
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = this.b;
        if (z) {
            int size2 = arrayList3.size();
            int i8 = 0;
            while (i8 < size2) {
                Object obj3 = arrayList3.get(i8);
                i8++;
                Object obj4 = ((u66) obj3).a;
            }
        }
        int size3 = arrayList3.size();
        int i9 = 0;
        while (i9 < size3) {
            Object obj5 = arrayList3.get(i9);
            i9++;
            Object obj6 = ((u66) obj5).a;
        }
        w66 w66Var = this.d;
        if (z) {
            bbc bbcVar2 = w66Var.f;
            t66 t66Var = w66Var.a;
            bbc bbcVar3 = w66Var.e;
            bbc bbcVar4 = w66Var.d;
            bbc bbcVar5 = w66Var.g;
            float f6 = i;
            if (bbcVar2.b(f6)) {
                k();
                w66Var.f.c = f6;
            }
            float f7 = i2;
            if (bbcVar5.b(f7)) {
                k();
                bbcVar5.c = f7;
            }
            float f8 = i3;
            if (bbcVar4.b(f8)) {
                k();
                bbcVar4.c = f8;
            }
            float f9 = i4;
            if (bbcVar3.b(f9)) {
                k();
                bbcVar3.c = f9;
            }
            if (t66Var.l()) {
                k();
                t66Var.o();
                return;
            }
            return;
        }
        w66Var.f.d(i);
        w66Var.g.d(i2);
        w66Var.d.d(i3);
        w66Var.e.d(i4);
        w66Var.a.c();
    }

    public final void k() {
        if (!this.f) {
            this.f = true;
            h94 h94Var = this.c;
            if (h94Var != null) {
                h94Var.b();
                l(false);
                h94Var.c(0.0f);
                return;
            }
            l(false);
        }
    }

    public final void l(boolean z) {
        ArrayList arrayList = this.b;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u66 u66Var = (u66) arrayList.get(size);
            u66Var.a(z);
            if (u66Var.c() == 0.0f && u66Var.h) {
                arrayList.remove(size);
                Object obj = u66Var.a;
                if (obj instanceof nf3) {
                    ((nf3) obj).a();
                }
                z2 = true;
            }
        }
        if (z2) {
            arrayList.trimToSize();
        }
        w66 w66Var = this.d;
        w66Var.b.c(z);
        w66Var.d.c(z);
        w66Var.e.c(z);
        w66Var.f.c(z);
        w66Var.g.c(z);
        w66Var.c.c(z);
        w66Var.a.j(z);
    }

    public final void m(List list, boolean z) {
        boolean isEmpty;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        int i2;
        h94 h94Var = this.c;
        w66 w66Var = this.d;
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.b;
        if (!z) {
            if (h94Var != null) {
                h94Var.b();
                l(false);
                h94Var.c(0.0f);
            } else {
                l(false);
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                Object obj = ((u66) arrayList2.get(size)).a;
                if (obj instanceof nf3) {
                    ((nf3) obj).a();
                }
            }
            arrayList2.clear();
            arrayList.clear();
            if (list != null) {
                i2 = list.size();
            } else {
                i2 = 0;
            }
            if (i2 > 0) {
                arrayList2.ensureCapacity(i2);
                arrayList.ensureCapacity(i2);
                for (Object obj2 : list) {
                    u66 u66Var = new u66(arrayList.size(), obj2, true);
                    arrayList2.add(u66Var);
                    arrayList.add(u66Var);
                }
                arrayList2.trimToSize();
                arrayList.trimToSize();
            }
            w66Var.a(i2, false);
            j(false);
            this.a.A();
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (arrayList.size() == list.size()) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    if (((u66) arrayList.get(i3)).equals(list.get(i3))) {
                    }
                }
                isEmpty = true;
            }
            isEmpty = false;
            break;
        }
        isEmpty = arrayList.isEmpty();
        if (!isEmpty) {
            k();
            if (list != null && !list.isEmpty()) {
                boolean z5 = false;
                int i4 = 0;
                boolean z6 = false;
                for (int i5 = 0; i5 < arrayList2.size(); i5++) {
                    u66 u66Var2 = (u66) arrayList2.get(i5);
                    Object obj3 = u66Var2.a;
                    bbc bbcVar = u66Var2.d;
                    bbc bbcVar2 = u66Var2.c;
                    int indexOf = list.indexOf(obj3);
                    if (indexOf != -1) {
                        i4++;
                        float f = indexOf;
                        if (bbcVar2.b(f)) {
                            k();
                            bbcVar2.c = f;
                        }
                        if (u66Var2.b != indexOf) {
                            u66Var2.b = indexOf;
                            if (!z5 && u66Var2.h) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            z6 = true;
                        }
                        if (bbcVar.b(1.0f)) {
                            k();
                            bbcVar.c = 1.0f;
                            u66Var2.h = false;
                            arrayList.add(u66Var2);
                            w66Var.a(arrayList.size(), true);
                            z5 = true;
                        }
                    } else if (bbcVar.b(0.0f)) {
                        k();
                        bbcVar.c = 0.0f;
                        u66Var2.h = true;
                        if (z5) {
                            z4 = arrayList.remove(u66Var2);
                        } else {
                            int binarySearch = Collections.binarySearch(arrayList, u66Var2);
                            if (binarySearch >= 0) {
                                arrayList.remove(binarySearch);
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        }
                        if (z4) {
                            w66Var.a(arrayList.size(), true);
                        } else {
                            i98.g();
                            return;
                        }
                    } else {
                        continue;
                    }
                }
                if (z5) {
                    Collections.sort(arrayList);
                }
                if (i4 < list.size()) {
                    arrayList2.ensureCapacity((list.size() - i4) + arrayList2.size());
                    int i6 = 0;
                    for (Object obj4 : list) {
                        if (obj4 == null) {
                            int size2 = arrayList2.size();
                            i = 0;
                            int i7 = 0;
                            while (i7 < size2) {
                                Object obj5 = arrayList2.get(i7);
                                i7++;
                                if (((u66) obj5).a == null) {
                                    break;
                                }
                                i++;
                            }
                            i = -1;
                        } else {
                            int size3 = arrayList2.size();
                            i = 0;
                            int i8 = 0;
                            while (i8 < size3) {
                                Object obj6 = arrayList2.get(i8);
                                i8++;
                                if (obj4.equals(((u66) obj6).a)) {
                                    break;
                                }
                                i++;
                            }
                            i = -1;
                        }
                        if (i == -1) {
                            if (i6 != arrayList2.size()) {
                                z6 = true;
                            }
                            k();
                            u66 u66Var3 = new u66(i6, obj4, false);
                            u66Var3.d.c = 1.0f;
                            u66Var3.h = false;
                            arrayList2.add(u66Var3);
                            int binarySearch2 = Collections.binarySearch(arrayList, u66Var3);
                            if (binarySearch2 < 0) {
                                arrayList.add((-binarySearch2) - 1, u66Var3);
                                w66Var.a(arrayList.size(), true);
                            } else {
                                u36.j("Element already exists in list");
                                return;
                            }
                        }
                        i6++;
                    }
                }
                z3 = z6;
                z2 = true;
            } else {
                if (!this.f) {
                    int size4 = arrayList2.size();
                    int i9 = 0;
                    while (true) {
                        if (i9 >= size4) {
                            break;
                        }
                        Object obj7 = arrayList2.get(i9);
                        i9++;
                        if (((u66) obj7).d.b(0.0f)) {
                            k();
                            break;
                        }
                    }
                }
                if (this.f) {
                    int size5 = arrayList2.size();
                    int i10 = 0;
                    while (i10 < size5) {
                        Object obj8 = arrayList2.get(i10);
                        i10++;
                        u66 u66Var4 = (u66) obj8;
                        if (u66Var4.d.b(0.0f)) {
                            k();
                            u66Var4.d.c = 0.0f;
                            u66Var4.h = true;
                            int binarySearch3 = Collections.binarySearch(arrayList, u66Var4);
                            if (binarySearch3 >= 0) {
                                arrayList.remove(binarySearch3);
                            }
                            w66Var.a(arrayList.size(), true);
                        }
                    }
                }
                z2 = true;
                z3 = false;
            }
            if (z3) {
                Collections.sort(arrayList2);
            }
            j(z2);
            if (this.f) {
                this.f = false;
                if (h94Var != null) {
                    h94Var.a(1.0f);
                }
            } else if (h94Var == null) {
                int size6 = arrayList2.size();
                int i11 = 0;
                while (i11 < size6) {
                    Object obj9 = arrayList2.get(i11);
                    i11++;
                    u66 u66Var5 = (u66) obj9;
                    bbc bbcVar3 = u66Var5.d;
                    bbcVar3.b = bbcVar3.a;
                    bbc bbcVar4 = u66Var5.c;
                    bbcVar4.b = bbcVar4.a;
                }
            }
        }
    }
}
