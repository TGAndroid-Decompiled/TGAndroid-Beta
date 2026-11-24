package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public final class x46 implements Iterable {
    public final t46 a;
    public final y74 c;
    public final w46 d;
    public boolean f;
    public final ArrayList b = new ArrayList();
    public final ArrayList e = new ArrayList();

    public x46(t46 t46Var, Interpolator interpolator, long j) {
        this.a = t46Var;
        this.d = new w46(this, t46Var);
        if (interpolator != null && j > 0) {
            this.c = new y74(0, new z24(this, (byte) 12), interpolator, j);
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
        w46 w46Var = this.d;
        boolean a = w46Var.b.a(f);
        if (!w46Var.d.a(f) && !a) {
            z = false;
        } else {
            z = true;
        }
        if (!w46Var.e.a(f) && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!w46Var.f.a(f) && !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!w46Var.g.a(f) && !z3) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!w46Var.c.a(f) && !z4) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!w46Var.a.n(f) && !z5) {
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
            u46 u46Var = (u46) obj;
            boolean a2 = u46Var.c.a(f);
            if (!u46Var.d.a(f) && !a2) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (!u46Var.e.a(f) && !z7) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (!u46Var.f.a(f) && !z8) {
                z9 = false;
            } else {
                z9 = true;
            }
            Object obj2 = u46Var.a;
            if (obj2 instanceof b9c) {
                if (!((b9c) obj2).a(f) && !z9) {
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
            this.a.F();
            if (f == 1.0f) {
                l(true);
            }
        }
    }

    public final u46 i(int i) {
        return (u46) this.b.get(i);
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
            u46 u46Var = (u46) obj;
            Object obj2 = u46Var.a;
            a9c a9cVar = u46Var.f;
            b9c b9cVar = u46Var.e;
            if (obj2 instanceof v46) {
                v46 v46Var = (v46) obj2;
                if (u46Var.b == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList2.size();
                int b = v46Var.b(z2);
                int width = v46Var.getWidth();
                int height = v46Var.getHeight();
                int i6 = b + width + i;
                int i7 = i2 + b + height;
                if (z && u46Var.c() > 0.0f) {
                    float f = i;
                    float f2 = i2;
                    float f3 = i6;
                    arrayList = arrayList2;
                    float f4 = i7;
                    if (b9cVar.b(f, f2, f3, f4)) {
                        k();
                        b9cVar.e(f, f2, f3, f4);
                    }
                    float f5 = b;
                    if (a9cVar.b(f5)) {
                        k();
                        a9cVar.c = f5;
                    }
                } else {
                    arrayList = arrayList2;
                    b9cVar.d(i, i2, i6, i7);
                    a9cVar.d(b);
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
                Object obj4 = ((u46) obj3).a;
            }
        }
        int size3 = arrayList3.size();
        int i9 = 0;
        while (i9 < size3) {
            Object obj5 = arrayList3.get(i9);
            i9++;
            Object obj6 = ((u46) obj5).a;
        }
        w46 w46Var = this.d;
        if (z) {
            a9c a9cVar2 = w46Var.f;
            t46 t46Var = w46Var.a;
            a9c a9cVar3 = w46Var.e;
            a9c a9cVar4 = w46Var.d;
            a9c a9cVar5 = w46Var.g;
            float f6 = i;
            if (a9cVar2.b(f6)) {
                k();
                w46Var.f.c = f6;
            }
            float f7 = i2;
            if (a9cVar5.b(f7)) {
                k();
                a9cVar5.c = f7;
            }
            float f8 = i3;
            if (a9cVar4.b(f8)) {
                k();
                a9cVar4.c = f8;
            }
            float f9 = i4;
            if (a9cVar3.b(f9)) {
                k();
                a9cVar3.c = f9;
            }
            if (t46Var.m()) {
                k();
                t46Var.p();
                return;
            }
            return;
        }
        w46Var.f.d(i);
        w46Var.g.d(i2);
        w46Var.d.d(i3);
        w46Var.e.d(i4);
        w46Var.a.c();
    }

    public final void k() {
        if (!this.f) {
            this.f = true;
            y74 y74Var = this.c;
            if (y74Var != null) {
                y74Var.b();
                l(false);
                y74Var.c(0.0f);
                return;
            }
            l(false);
        }
    }

    public final void l(boolean z) {
        ArrayList arrayList = this.b;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            u46 u46Var = (u46) arrayList.get(size);
            u46Var.a(z);
            if (u46Var.c() == 0.0f && u46Var.h) {
                arrayList.remove(size);
                Object obj = u46Var.a;
                if (obj instanceof be3) {
                    ((be3) obj).a();
                }
                z2 = true;
            }
        }
        if (z2) {
            arrayList.trimToSize();
        }
        w46 w46Var = this.d;
        w46Var.b.c(z);
        w46Var.d.c(z);
        w46Var.e.c(z);
        w46Var.f.c(z);
        w46Var.g.c(z);
        w46Var.c.c(z);
        w46Var.a.k(z);
    }

    public final void m(List list, boolean z) {
        boolean isEmpty;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        int i2;
        y74 y74Var = this.c;
        w46 w46Var = this.d;
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.b;
        if (!z) {
            if (y74Var != null) {
                y74Var.b();
                l(false);
                y74Var.c(0.0f);
            } else {
                l(false);
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                Object obj = ((u46) arrayList2.get(size)).a;
                if (obj instanceof be3) {
                    ((be3) obj).a();
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
                    u46 u46Var = new u46(arrayList.size(), obj2, true);
                    arrayList2.add(u46Var);
                    arrayList.add(u46Var);
                }
                arrayList2.trimToSize();
                arrayList.trimToSize();
            }
            w46Var.a(i2, false);
            j(false);
            this.a.F();
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (arrayList.size() == list.size()) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    if (((u46) arrayList.get(i3)).equals(list.get(i3))) {
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
                    u46 u46Var2 = (u46) arrayList2.get(i5);
                    Object obj3 = u46Var2.a;
                    a9c a9cVar = u46Var2.d;
                    a9c a9cVar2 = u46Var2.c;
                    int indexOf = list.indexOf(obj3);
                    if (indexOf != -1) {
                        i4++;
                        float f = indexOf;
                        if (a9cVar2.b(f)) {
                            k();
                            a9cVar2.c = f;
                        }
                        if (u46Var2.b != indexOf) {
                            u46Var2.b = indexOf;
                            if (!z5 && u46Var2.h) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            z6 = true;
                        }
                        if (a9cVar.b(1.0f)) {
                            k();
                            a9cVar.c = 1.0f;
                            u46Var2.h = false;
                            arrayList.add(u46Var2);
                            w46Var.a(arrayList.size(), true);
                            z5 = true;
                        }
                    } else if (a9cVar.b(0.0f)) {
                        k();
                        a9cVar.c = 0.0f;
                        u46Var2.h = true;
                        if (z5) {
                            z4 = arrayList.remove(u46Var2);
                        } else {
                            int binarySearch = Collections.binarySearch(arrayList, u46Var2);
                            if (binarySearch >= 0) {
                                arrayList.remove(binarySearch);
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        }
                        if (z4) {
                            w46Var.a(arrayList.size(), true);
                        } else {
                            sc8.e();
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
                                if (((u46) obj5).a == null) {
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
                                if (obj4.equals(((u46) obj6).a)) {
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
                            u46 u46Var3 = new u46(i6, obj4, false);
                            u46Var3.d.c = 1.0f;
                            u46Var3.h = false;
                            arrayList2.add(u46Var3);
                            int binarySearch2 = Collections.binarySearch(arrayList, u46Var3);
                            if (binarySearch2 < 0) {
                                arrayList.add((-binarySearch2) - 1, u46Var3);
                                w46Var.a(arrayList.size(), true);
                            } else {
                                w26.j("Element already exists in list");
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
                        if (((u46) obj7).d.b(0.0f)) {
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
                        u46 u46Var4 = (u46) obj8;
                        if (u46Var4.d.b(0.0f)) {
                            k();
                            u46Var4.d.c = 0.0f;
                            u46Var4.h = true;
                            int binarySearch3 = Collections.binarySearch(arrayList, u46Var4);
                            if (binarySearch3 >= 0) {
                                arrayList.remove(binarySearch3);
                            }
                            w46Var.a(arrayList.size(), true);
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
                if (y74Var != null) {
                    y74Var.a(1.0f);
                }
            } else if (y74Var == null) {
                int size6 = arrayList2.size();
                int i11 = 0;
                while (i11 < size6) {
                    Object obj9 = arrayList2.get(i11);
                    i11++;
                    u46 u46Var5 = (u46) obj9;
                    a9c a9cVar3 = u46Var5.d;
                    a9cVar3.b = a9cVar3.a;
                    a9c a9cVar4 = u46Var5.c;
                    a9cVar4.b = a9cVar4.a;
                }
            }
        }
    }
}
