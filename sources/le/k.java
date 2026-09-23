package le;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import k2.u;
public final class k implements Iterable {
    public final g f13981a;
    public final f f13983c;
    public final j d;
    public boolean f13984f;
    public final ArrayList f13982b = new ArrayList();
    public final ArrayList e = new ArrayList();

    public k(g gVar, Interpolator interpolator, long j3) {
        this.f13981a = gVar;
        this.d = new j(this, gVar);
        if (interpolator != null && j3 > 0) {
            this.f13983c = new f(0, new u(this, 3), interpolator, j3);
        } else {
            this.f13983c = null;
        }
    }

    public final void i(float f7) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        j jVar = this.d;
        boolean a2 = jVar.f13977b.a(f7);
        if (!jVar.d.a(f7) && !a2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!jVar.e.a(f7) && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!jVar.f13979f.a(f7) && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!jVar.f13980g.a(f7) && !z12) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!jVar.f13978c.a(f7) && !z13) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!jVar.f13976a.k(f7) && !z14) {
            z15 = false;
        } else {
            z15 = true;
        }
        ArrayList arrayList = this.f13982b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            h hVar = (h) obj;
            boolean a10 = hVar.f13974c.a(f7);
            if (!hVar.d.a(f7) && !a10) {
                z16 = false;
            } else {
                z16 = true;
            }
            if (!hVar.e.a(f7) && !z16) {
                z17 = false;
            } else {
                z17 = true;
            }
            if (!hVar.f13975f.a(f7) && !z17) {
                z18 = false;
            } else {
                z18 = true;
            }
            Object obj2 = hVar.f13972a;
            if (obj2 instanceof o) {
                if (!((o) obj2).a(f7) && !z18) {
                    z18 = false;
                } else {
                    z18 = true;
                }
            }
            if (!z18 && !z15) {
                z15 = false;
            } else {
                z15 = true;
            }
        }
        if (z15) {
            this.f13981a.E();
            if (f7 == 1.0f) {
                q(true);
            }
        }
    }

    @Override
    public final Iterator iterator() {
        return this.f13982b.iterator();
    }

    public final h n(int i10) {
        return (h) this.f13982b.get(i10);
    }

    public final void o(boolean z10) {
        ArrayList arrayList;
        boolean z11;
        ArrayList arrayList2 = this.e;
        int size = arrayList2.size();
        int i10 = 0;
        int i11 = 0;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (i14 < size) {
            Object obj = arrayList2.get(i14);
            i14++;
            h hVar = (h) obj;
            Object obj2 = hVar.f13972a;
            n nVar = hVar.f13975f;
            o oVar = hVar.e;
            if (obj2 instanceof i) {
                i iVar = (i) obj2;
                if (hVar.f13973b == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                arrayList2.size();
                int b10 = iVar.b(z11);
                int width = iVar.getWidth();
                int height = iVar.getHeight();
                int i15 = b10 + width + i10;
                int i16 = i11 + b10 + height;
                if (z10 && hVar.c() > 0.0f) {
                    float f7 = i10;
                    float f10 = i11;
                    float f11 = i15;
                    arrayList = arrayList2;
                    float f12 = i16;
                    if (oVar.b(f7, f10, f11, f12)) {
                        p();
                        oVar.e(f7, f10, f11, f12);
                    }
                    float f13 = b10;
                    if (nVar.b(f13)) {
                        p();
                        nVar.f13988c = f13;
                    }
                } else {
                    arrayList = arrayList2;
                    oVar.d(i10, i11, i15, i16);
                    nVar.d(b10);
                }
                i12 = Math.max(i12, width);
                i13 = Math.max(i13, height);
                i11 = i16;
                i10 = i15;
            } else {
                arrayList = arrayList2;
            }
            arrayList2 = arrayList;
        }
        ArrayList arrayList3 = this.f13982b;
        if (z10) {
            int size2 = arrayList3.size();
            int i17 = 0;
            while (i17 < size2) {
                Object obj3 = arrayList3.get(i17);
                i17++;
                Object obj4 = ((h) obj3).f13972a;
            }
        }
        int size3 = arrayList3.size();
        int i18 = 0;
        while (i18 < size3) {
            Object obj5 = arrayList3.get(i18);
            i18++;
            Object obj6 = ((h) obj5).f13972a;
        }
        j jVar = this.d;
        if (z10) {
            n nVar2 = jVar.f13979f;
            g gVar = jVar.f13976a;
            n nVar3 = jVar.e;
            n nVar4 = jVar.d;
            n nVar5 = jVar.f13980g;
            float f14 = i10;
            if (nVar2.b(f14)) {
                p();
                jVar.f13979f.f13988c = f14;
            }
            float f15 = i11;
            if (nVar5.b(f15)) {
                p();
                nVar5.f13988c = f15;
            }
            float f16 = i12;
            if (nVar4.b(f16)) {
                p();
                nVar4.f13988c = f16;
            }
            float f17 = i13;
            if (nVar3.b(f17)) {
                p();
                nVar3.f13988c = f17;
            }
            if (gVar.i()) {
                p();
                gVar.l();
                return;
            }
            return;
        }
        jVar.f13979f.d(i10);
        jVar.f13980g.d(i11);
        jVar.d.d(i12);
        jVar.e.d(i13);
        jVar.f13976a.a();
    }

    public final void p() {
        if (!this.f13984f) {
            this.f13984f = true;
            f fVar = this.f13983c;
            if (fVar != null) {
                fVar.b();
                q(false);
                fVar.c(0.0f);
                return;
            }
            q(false);
        }
    }

    public final void q(boolean z10) {
        ArrayList arrayList = this.f13982b;
        boolean z11 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            h hVar = (h) arrayList.get(size);
            hVar.a(z10);
            if (hVar.c() == 0.0f && hVar.h) {
                arrayList.remove(size);
                Object obj = hVar.f13972a;
                if (obj instanceof oe.a) {
                    ((oe.a) obj).a();
                }
                z11 = true;
            }
        }
        if (z11) {
            arrayList.trimToSize();
        }
        j jVar = this.d;
        jVar.f13977b.c(z10);
        jVar.d.c(z10);
        jVar.e.c(z10);
        jVar.f13979f.c(z10);
        jVar.f13980g.c(z10);
        jVar.f13978c.c(z10);
        jVar.f13976a.g(z10);
    }

    public final void r(List list, boolean z10) {
        boolean isEmpty;
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        int i11;
        f fVar = this.f13983c;
        j jVar = this.d;
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f13982b;
        if (!z10) {
            if (fVar != null) {
                fVar.b();
                q(false);
                fVar.c(0.0f);
            } else {
                q(false);
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                Object obj = ((h) arrayList2.get(size)).f13972a;
                if (obj instanceof oe.a) {
                    ((oe.a) obj).a();
                }
            }
            arrayList2.clear();
            arrayList.clear();
            if (list != null) {
                i11 = list.size();
            } else {
                i11 = 0;
            }
            if (i11 > 0) {
                arrayList2.ensureCapacity(i11);
                arrayList.ensureCapacity(i11);
                for (Object obj2 : list) {
                    h hVar = new h(arrayList.size(), obj2, true);
                    arrayList2.add(hVar);
                    arrayList.add(hVar);
                }
                arrayList2.trimToSize();
                arrayList.trimToSize();
            }
            j.a(jVar, i11, false);
            o(false);
            this.f13981a.E();
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (arrayList.size() == list.size()) {
                for (int i12 = 0; i12 < list.size(); i12++) {
                    if (((h) arrayList.get(i12)).equals(list.get(i12))) {
                    }
                }
                isEmpty = true;
            }
            isEmpty = false;
            break;
        }
        isEmpty = arrayList.isEmpty();
        if (!isEmpty) {
            p();
            if (list != null && !list.isEmpty()) {
                boolean z14 = false;
                int i13 = 0;
                boolean z15 = false;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    h hVar2 = (h) arrayList2.get(i14);
                    Object obj3 = hVar2.f13972a;
                    n nVar = hVar2.d;
                    n nVar2 = hVar2.f13974c;
                    int indexOf = list.indexOf(obj3);
                    if (indexOf != -1) {
                        i13++;
                        float f7 = indexOf;
                        if (nVar2.b(f7)) {
                            p();
                            nVar2.f13988c = f7;
                        }
                        if (hVar2.f13973b != indexOf) {
                            hVar2.f13973b = indexOf;
                            if (!z14 && hVar2.h) {
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                            z15 = true;
                        }
                        if (nVar.b(1.0f)) {
                            p();
                            nVar.f13988c = 1.0f;
                            hVar2.h = false;
                            arrayList.add(hVar2);
                            j.a(jVar, arrayList.size(), true);
                            z14 = true;
                        }
                    } else if (nVar.b(0.0f)) {
                        p();
                        nVar.f13988c = 0.0f;
                        hVar2.h = true;
                        if (z14) {
                            z13 = arrayList.remove(hVar2);
                        } else {
                            int binarySearch = Collections.binarySearch(arrayList, hVar2);
                            if (binarySearch >= 0) {
                                arrayList.remove(binarySearch);
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        }
                        if (z13) {
                            j.a(jVar, arrayList.size(), true);
                        } else {
                            throw new IllegalArgumentException();
                        }
                    } else {
                        continue;
                    }
                }
                if (z14) {
                    Collections.sort(arrayList);
                }
                if (i13 < list.size()) {
                    arrayList2.ensureCapacity((list.size() - i13) + arrayList2.size());
                    int i15 = 0;
                    for (Object obj4 : list) {
                        if (obj4 == null) {
                            int size2 = arrayList2.size();
                            i10 = 0;
                            int i16 = 0;
                            while (i16 < size2) {
                                Object obj5 = arrayList2.get(i16);
                                i16++;
                                if (((h) obj5).f13972a == null) {
                                    break;
                                }
                                i10++;
                            }
                            i10 = -1;
                        } else {
                            int size3 = arrayList2.size();
                            i10 = 0;
                            int i17 = 0;
                            while (i17 < size3) {
                                Object obj6 = arrayList2.get(i17);
                                i17++;
                                if (obj4.equals(((h) obj6).f13972a)) {
                                    break;
                                }
                                i10++;
                            }
                            i10 = -1;
                        }
                        if (i10 == -1) {
                            if (i15 != arrayList2.size()) {
                                z15 = true;
                            }
                            p();
                            h hVar3 = new h(i15, obj4, false);
                            hVar3.d.f13988c = 1.0f;
                            hVar3.h = false;
                            arrayList2.add(hVar3);
                            int binarySearch2 = Collections.binarySearch(arrayList, hVar3);
                            if (binarySearch2 < 0) {
                                arrayList.add((-binarySearch2) - 1, hVar3);
                                j.a(jVar, arrayList.size(), true);
                            } else {
                                throw new IllegalArgumentException("Element already exists in list");
                            }
                        }
                        i15++;
                    }
                }
                z12 = z15;
                z11 = true;
            } else {
                if (!this.f13984f) {
                    int size4 = arrayList2.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 >= size4) {
                            break;
                        }
                        Object obj7 = arrayList2.get(i18);
                        i18++;
                        if (((h) obj7).d.b(0.0f)) {
                            p();
                            break;
                        }
                    }
                }
                if (this.f13984f) {
                    int size5 = arrayList2.size();
                    int i19 = 0;
                    while (i19 < size5) {
                        Object obj8 = arrayList2.get(i19);
                        i19++;
                        h hVar4 = (h) obj8;
                        if (hVar4.d.b(0.0f)) {
                            p();
                            hVar4.d.f13988c = 0.0f;
                            hVar4.h = true;
                            int binarySearch3 = Collections.binarySearch(arrayList, hVar4);
                            if (binarySearch3 >= 0) {
                                arrayList.remove(binarySearch3);
                            }
                            j.a(jVar, arrayList.size(), true);
                        }
                    }
                }
                z11 = true;
                z12 = false;
            }
            if (z12) {
                Collections.sort(arrayList2);
            }
            o(z11);
            if (this.f13984f) {
                this.f13984f = false;
                if (fVar != null) {
                    fVar.a(1.0f);
                }
            } else if (fVar == null) {
                int size6 = arrayList2.size();
                int i20 = 0;
                while (i20 < size6) {
                    Object obj9 = arrayList2.get(i20);
                    i20++;
                    h hVar5 = (h) obj9;
                    n nVar3 = hVar5.d;
                    nVar3.f13987b = nVar3.f13986a;
                    n nVar4 = hVar5.f13974c;
                    nVar4.f13987b = nVar4.f13986a;
                }
            }
        }
    }
}
