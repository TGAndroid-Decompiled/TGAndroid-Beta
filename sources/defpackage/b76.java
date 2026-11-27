package defpackage;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public final class b76 implements Iterable {
    public final x66 a;
    public final t84 c;
    public final a76 d;
    public boolean f;
    public final ArrayList b = new ArrayList();
    public final ArrayList e = new ArrayList();

    public b76(x66 x66Var, Interpolator interpolator, long j) {
        this.a = x66Var;
        this.d = new a76(this, x66Var);
        if (interpolator != null && j > 0) {
            this.c = new t84(0, new xh4(this, (byte) 10), interpolator, j);
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
        a76 a76Var = this.d;
        boolean a = a76Var.b.a(f);
        if (!a76Var.d.a(f) && !a) {
            z = false;
        } else {
            z = true;
        }
        if (!a76Var.e.a(f) && !z) {
            z2 = false;
        } else {
            z2 = true;
        }
        if (!a76Var.f.a(f) && !z2) {
            z3 = false;
        } else {
            z3 = true;
        }
        if (!a76Var.g.a(f) && !z3) {
            z4 = false;
        } else {
            z4 = true;
        }
        if (!a76Var.c.a(f) && !z4) {
            z5 = false;
        } else {
            z5 = true;
        }
        if (!a76Var.a.n(f) && !z5) {
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
            y66 y66Var = (y66) obj;
            boolean a2 = y66Var.c.a(f);
            if (!y66Var.d.a(f) && !a2) {
                z7 = false;
            } else {
                z7 = true;
            }
            if (!y66Var.e.a(f) && !z7) {
                z8 = false;
            } else {
                z8 = true;
            }
            if (!y66Var.f.a(f) && !z8) {
                z9 = false;
            } else {
                z9 = true;
            }
            Object obj2 = y66Var.a;
            if (obj2 instanceof bdc) {
                if (!((bdc) obj2).a(f) && !z9) {
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
            this.a.H();
            if (f == 1.0f) {
                l(true);
            }
        }
    }

    public final y66 i(int i) {
        return (y66) this.b.get(i);
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
            y66 y66Var = (y66) obj;
            Object obj2 = y66Var.a;
            adc adcVar = y66Var.f;
            bdc bdcVar = y66Var.e;
            if (obj2 instanceof z66) {
                z66 z66Var = (z66) obj2;
                if (y66Var.b == 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                arrayList2.size();
                int b = z66Var.b(z2);
                int width = z66Var.getWidth();
                int height = z66Var.getHeight();
                int i6 = b + width + i;
                int i7 = i2 + b + height;
                if (z && y66Var.c() > 0.0f) {
                    float f = i;
                    float f2 = i2;
                    float f3 = i6;
                    arrayList = arrayList2;
                    float f4 = i7;
                    if (bdcVar.b(f, f2, f3, f4)) {
                        k();
                        bdcVar.e(f, f2, f3, f4);
                    }
                    float f5 = b;
                    if (adcVar.b(f5)) {
                        k();
                        adcVar.c = f5;
                    }
                } else {
                    arrayList = arrayList2;
                    bdcVar.d(i, i2, i6, i7);
                    adcVar.d(b);
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
                Object obj4 = ((y66) obj3).a;
            }
        }
        int size3 = arrayList3.size();
        int i9 = 0;
        while (i9 < size3) {
            Object obj5 = arrayList3.get(i9);
            i9++;
            Object obj6 = ((y66) obj5).a;
        }
        a76 a76Var = this.d;
        if (z) {
            adc adcVar2 = a76Var.f;
            x66 x66Var = a76Var.a;
            adc adcVar3 = a76Var.e;
            adc adcVar4 = a76Var.d;
            adc adcVar5 = a76Var.g;
            float f6 = i;
            if (adcVar2.b(f6)) {
                k();
                a76Var.f.c = f6;
            }
            float f7 = i2;
            if (adcVar5.b(f7)) {
                k();
                adcVar5.c = f7;
            }
            float f8 = i3;
            if (adcVar4.b(f8)) {
                k();
                adcVar4.c = f8;
            }
            float f9 = i4;
            if (adcVar3.b(f9)) {
                k();
                adcVar3.c = f9;
            }
            if (x66Var.m()) {
                k();
                x66Var.p();
                return;
            }
            return;
        }
        a76Var.f.d(i);
        a76Var.g.d(i2);
        a76Var.d.d(i3);
        a76Var.e.d(i4);
        a76Var.a.c();
    }

    public final void k() {
        if (!this.f) {
            this.f = true;
            t84 t84Var = this.c;
            if (t84Var != null) {
                t84Var.b();
                l(false);
                t84Var.c(0.0f);
                return;
            }
            l(false);
        }
    }

    public final void l(boolean z) {
        ArrayList arrayList = this.b;
        boolean z2 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            y66 y66Var = (y66) arrayList.get(size);
            y66Var.a(z);
            if (y66Var.c() == 0.0f && y66Var.h) {
                arrayList.remove(size);
                Object obj = y66Var.a;
                if (obj instanceof ve3) {
                    ((ve3) obj).a();
                }
                z2 = true;
            }
        }
        if (z2) {
            arrayList.trimToSize();
        }
        a76 a76Var = this.d;
        a76Var.b.c(z);
        a76Var.d.c(z);
        a76Var.e.c(z);
        a76Var.f.c(z);
        a76Var.g.c(z);
        a76Var.c.c(z);
        a76Var.a.j(z);
    }

    public final void m(List list, boolean z) {
        boolean isEmpty;
        boolean z2;
        boolean z3;
        int i;
        boolean z4;
        int i2;
        t84 t84Var = this.c;
        a76 a76Var = this.d;
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.b;
        if (!z) {
            if (t84Var != null) {
                t84Var.b();
                l(false);
                t84Var.c(0.0f);
            } else {
                l(false);
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                Object obj = ((y66) arrayList2.get(size)).a;
                if (obj instanceof ve3) {
                    ((ve3) obj).a();
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
                    y66 y66Var = new y66(arrayList.size(), obj2, true);
                    arrayList2.add(y66Var);
                    arrayList.add(y66Var);
                }
                arrayList2.trimToSize();
                arrayList.trimToSize();
            }
            a76Var.a(i2, false);
            j(false);
            this.a.H();
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (arrayList.size() == list.size()) {
                for (int i3 = 0; i3 < list.size(); i3++) {
                    if (((y66) arrayList.get(i3)).equals(list.get(i3))) {
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
                    y66 y66Var2 = (y66) arrayList2.get(i5);
                    Object obj3 = y66Var2.a;
                    adc adcVar = y66Var2.d;
                    adc adcVar2 = y66Var2.c;
                    int indexOf = list.indexOf(obj3);
                    if (indexOf != -1) {
                        i4++;
                        float f = indexOf;
                        if (adcVar2.b(f)) {
                            k();
                            adcVar2.c = f;
                        }
                        if (y66Var2.b != indexOf) {
                            y66Var2.b = indexOf;
                            if (!z5 && y66Var2.h) {
                                z5 = false;
                            } else {
                                z5 = true;
                            }
                            z6 = true;
                        }
                        if (adcVar.b(1.0f)) {
                            k();
                            adcVar.c = 1.0f;
                            y66Var2.h = false;
                            arrayList.add(y66Var2);
                            a76Var.a(arrayList.size(), true);
                            z5 = true;
                        }
                    } else if (adcVar.b(0.0f)) {
                        k();
                        adcVar.c = 0.0f;
                        y66Var2.h = true;
                        if (z5) {
                            z4 = arrayList.remove(y66Var2);
                        } else {
                            int binarySearch = Collections.binarySearch(arrayList, y66Var2);
                            if (binarySearch >= 0) {
                                arrayList.remove(binarySearch);
                                z4 = true;
                            } else {
                                z4 = false;
                            }
                        }
                        if (z4) {
                            a76Var.a(arrayList.size(), true);
                        } else {
                            iy8.d();
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
                                if (((y66) obj5).a == null) {
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
                                if (obj4.equals(((y66) obj6).a)) {
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
                            y66 y66Var3 = new y66(i6, obj4, false);
                            y66Var3.d.c = 1.0f;
                            y66Var3.h = false;
                            arrayList2.add(y66Var3);
                            int binarySearch2 = Collections.binarySearch(arrayList, y66Var3);
                            if (binarySearch2 < 0) {
                                arrayList.add((-binarySearch2) - 1, y66Var3);
                                a76Var.a(arrayList.size(), true);
                            } else {
                                lq5.j("Element already exists in list");
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
                        if (((y66) obj7).d.b(0.0f)) {
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
                        y66 y66Var4 = (y66) obj8;
                        if (y66Var4.d.b(0.0f)) {
                            k();
                            y66Var4.d.c = 0.0f;
                            y66Var4.h = true;
                            int binarySearch3 = Collections.binarySearch(arrayList, y66Var4);
                            if (binarySearch3 >= 0) {
                                arrayList.remove(binarySearch3);
                            }
                            a76Var.a(arrayList.size(), true);
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
                if (t84Var != null) {
                    t84Var.a(1.0f);
                }
            } else if (t84Var == null) {
                int size6 = arrayList2.size();
                int i11 = 0;
                while (i11 < size6) {
                    Object obj9 = arrayList2.get(i11);
                    i11++;
                    y66 y66Var5 = (y66) obj9;
                    adc adcVar3 = y66Var5.d;
                    adcVar3.b = adcVar3.a;
                    adc adcVar4 = y66Var5.c;
                    adcVar4.b = adcVar4.a;
                }
            }
        }
    }
}
