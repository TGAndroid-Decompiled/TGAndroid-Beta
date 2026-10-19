package ne;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public final class j implements Iterable {
    public final f f17402a;
    public final e f17404c;
    public final i d;
    public boolean f17405f;
    public final ArrayList f17403b = new ArrayList();
    public final ArrayList e = new ArrayList();

    public j(f fVar, Interpolator interpolator, long j10) {
        this.f17402a = fVar;
        this.d = new i(this, fVar);
        if (interpolator != null && j10 > 0) {
            this.f17404c = new e(0, new le.b(this, 4), interpolator, j10);
        } else {
            this.f17404c = null;
        }
    }

    public final void h(float f7) {
        boolean z10;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        boolean z16;
        boolean z17;
        boolean z18;
        i iVar = this.d;
        boolean a2 = iVar.f17398b.a(f7);
        if (!iVar.d.a(f7) && !a2) {
            z10 = false;
        } else {
            z10 = true;
        }
        if (!iVar.e.a(f7) && !z10) {
            z11 = false;
        } else {
            z11 = true;
        }
        if (!iVar.f17400f.a(f7) && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!iVar.f17401g.a(f7) && !z12) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!iVar.f17399c.a(f7) && !z13) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!iVar.f17397a.k(f7) && !z14) {
            z15 = false;
        } else {
            z15 = true;
        }
        ArrayList arrayList = this.f17403b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g gVar = (g) obj;
            boolean a10 = gVar.f17395c.a(f7);
            if (!gVar.d.a(f7) && !a10) {
                z16 = false;
            } else {
                z16 = true;
            }
            if (!gVar.e.a(f7) && !z16) {
                z17 = false;
            } else {
                z17 = true;
            }
            if (!gVar.f17396f.a(f7) && !z17) {
                z18 = false;
            } else {
                z18 = true;
            }
            Object obj2 = gVar.f17393a;
            if (obj2 instanceof n) {
                if (!((n) obj2).a(f7) && !z18) {
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
            this.f17402a.F();
            if (f7 == 1.0f) {
                p(true);
            }
        }
    }

    @Override
    public final Iterator iterator() {
        return this.f17403b.iterator();
    }

    public final g m(int i10) {
        return (g) this.f17403b.get(i10);
    }

    public final void n(boolean z10) {
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
            g gVar = (g) obj;
            Object obj2 = gVar.f17393a;
            m mVar = gVar.f17396f;
            n nVar = gVar.e;
            if (obj2 instanceof h) {
                h hVar = (h) obj2;
                if (gVar.f17394b == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                arrayList2.size();
                int b10 = hVar.b(z11);
                int width = hVar.getWidth();
                int height = hVar.getHeight();
                int i15 = b10 + width + i10;
                int i16 = i11 + b10 + height;
                if (z10 && gVar.c() > 0.0f) {
                    float f7 = i10;
                    float f10 = i11;
                    float f11 = i15;
                    arrayList = arrayList2;
                    float f12 = i16;
                    if (nVar.b(f7, f10, f11, f12)) {
                        o();
                        nVar.e(f7, f10, f11, f12);
                    }
                    float f13 = b10;
                    if (mVar.b(f13)) {
                        o();
                        mVar.f17409c = f13;
                    }
                } else {
                    arrayList = arrayList2;
                    nVar.d(i10, i11, i15, i16);
                    mVar.d(b10);
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
        ArrayList arrayList3 = this.f17403b;
        if (z10) {
            int size2 = arrayList3.size();
            int i17 = 0;
            while (i17 < size2) {
                Object obj3 = arrayList3.get(i17);
                i17++;
                Object obj4 = ((g) obj3).f17393a;
            }
        }
        int size3 = arrayList3.size();
        int i18 = 0;
        while (i18 < size3) {
            Object obj5 = arrayList3.get(i18);
            i18++;
            Object obj6 = ((g) obj5).f17393a;
        }
        i iVar = this.d;
        if (z10) {
            m mVar2 = iVar.f17400f;
            f fVar = iVar.f17397a;
            m mVar3 = iVar.e;
            m mVar4 = iVar.d;
            m mVar5 = iVar.f17401g;
            float f14 = i10;
            if (mVar2.b(f14)) {
                o();
                iVar.f17400f.f17409c = f14;
            }
            float f15 = i11;
            if (mVar5.b(f15)) {
                o();
                mVar5.f17409c = f15;
            }
            float f16 = i12;
            if (mVar4.b(f16)) {
                o();
                mVar4.f17409c = f16;
            }
            float f17 = i13;
            if (mVar3.b(f17)) {
                o();
                mVar3.f17409c = f17;
            }
            if (fVar.i()) {
                o();
                fVar.m();
                return;
            }
            return;
        }
        iVar.f17400f.d(i10);
        iVar.f17401g.d(i11);
        iVar.d.d(i12);
        iVar.e.d(i13);
        iVar.f17397a.c();
    }

    public final void o() {
        if (!this.f17405f) {
            this.f17405f = true;
            e eVar = this.f17404c;
            if (eVar != null) {
                eVar.b();
                p(false);
                eVar.c(0.0f);
                return;
            }
            p(false);
        }
    }

    public final void p(boolean z10) {
        ArrayList arrayList = this.f17403b;
        boolean z11 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g gVar = (g) arrayList.get(size);
            gVar.a(z10);
            if (gVar.c() == 0.0f && gVar.h) {
                arrayList.remove(size);
                Object obj = gVar.f17393a;
                if (obj instanceof qe.a) {
                    ((qe.a) obj).a();
                }
                z11 = true;
            }
        }
        if (z11) {
            arrayList.trimToSize();
        }
        i iVar = this.d;
        iVar.f17398b.c(z10);
        iVar.d.c(z10);
        iVar.e.c(z10);
        iVar.f17400f.c(z10);
        iVar.f17401g.c(z10);
        iVar.f17399c.c(z10);
        iVar.f17397a.h(z10);
    }

    public final void q(List list, boolean z10) {
        boolean isEmpty;
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        int i11;
        e eVar = this.f17404c;
        i iVar = this.d;
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f17403b;
        if (!z10) {
            if (eVar != null) {
                eVar.b();
                p(false);
                eVar.c(0.0f);
            } else {
                p(false);
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                Object obj = ((g) arrayList2.get(size)).f17393a;
                if (obj instanceof qe.a) {
                    ((qe.a) obj).a();
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
                    g gVar = new g(arrayList.size(), obj2, true);
                    arrayList2.add(gVar);
                    arrayList.add(gVar);
                }
                arrayList2.trimToSize();
                arrayList.trimToSize();
            }
            i.a(iVar, i11, false);
            n(false);
            this.f17402a.F();
            return;
        }
        if (list != null && !list.isEmpty()) {
            if (arrayList.size() == list.size()) {
                for (int i12 = 0; i12 < list.size(); i12++) {
                    if (((g) arrayList.get(i12)).equals(list.get(i12))) {
                    }
                }
                isEmpty = true;
            }
            isEmpty = false;
            break;
        }
        isEmpty = arrayList.isEmpty();
        if (!isEmpty) {
            o();
            if (list != null && !list.isEmpty()) {
                boolean z14 = false;
                int i13 = 0;
                boolean z15 = false;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    g gVar2 = (g) arrayList2.get(i14);
                    Object obj3 = gVar2.f17393a;
                    m mVar = gVar2.d;
                    m mVar2 = gVar2.f17395c;
                    int indexOf = list.indexOf(obj3);
                    if (indexOf != -1) {
                        i13++;
                        float f7 = indexOf;
                        if (mVar2.b(f7)) {
                            o();
                            mVar2.f17409c = f7;
                        }
                        if (gVar2.f17394b != indexOf) {
                            gVar2.f17394b = indexOf;
                            if (!z14 && gVar2.h) {
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                            z15 = true;
                        }
                        if (mVar.b(1.0f)) {
                            o();
                            mVar.f17409c = 1.0f;
                            gVar2.h = false;
                            arrayList.add(gVar2);
                            i.a(iVar, arrayList.size(), true);
                            z14 = true;
                        }
                    } else if (mVar.b(0.0f)) {
                        o();
                        mVar.f17409c = 0.0f;
                        gVar2.h = true;
                        if (z14) {
                            z13 = arrayList.remove(gVar2);
                        } else {
                            int binarySearch = Collections.binarySearch(arrayList, gVar2);
                            if (binarySearch >= 0) {
                                arrayList.remove(binarySearch);
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                        }
                        if (z13) {
                            i.a(iVar, arrayList.size(), true);
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
                                if (((g) obj5).f17393a == null) {
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
                                if (obj4.equals(((g) obj6).f17393a)) {
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
                            o();
                            g gVar3 = new g(i15, obj4, false);
                            gVar3.d.f17409c = 1.0f;
                            gVar3.h = false;
                            arrayList2.add(gVar3);
                            int binarySearch2 = Collections.binarySearch(arrayList, gVar3);
                            if (binarySearch2 < 0) {
                                arrayList.add((-binarySearch2) - 1, gVar3);
                                i.a(iVar, arrayList.size(), true);
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
                if (!this.f17405f) {
                    int size4 = arrayList2.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 >= size4) {
                            break;
                        }
                        Object obj7 = arrayList2.get(i18);
                        i18++;
                        if (((g) obj7).d.b(0.0f)) {
                            o();
                            break;
                        }
                    }
                }
                if (this.f17405f) {
                    int size5 = arrayList2.size();
                    int i19 = 0;
                    while (i19 < size5) {
                        Object obj8 = arrayList2.get(i19);
                        i19++;
                        g gVar4 = (g) obj8;
                        if (gVar4.d.b(0.0f)) {
                            o();
                            gVar4.d.f17409c = 0.0f;
                            gVar4.h = true;
                            int binarySearch3 = Collections.binarySearch(arrayList, gVar4);
                            if (binarySearch3 >= 0) {
                                arrayList.remove(binarySearch3);
                            }
                            i.a(iVar, arrayList.size(), true);
                        }
                    }
                }
                z11 = true;
                z12 = false;
            }
            if (z12) {
                Collections.sort(arrayList2);
            }
            n(z11);
            if (this.f17405f) {
                this.f17405f = false;
                if (eVar != null) {
                    eVar.a(1.0f);
                }
            } else if (eVar == null) {
                int size6 = arrayList2.size();
                int i20 = 0;
                while (i20 < size6) {
                    Object obj9 = arrayList2.get(i20);
                    i20++;
                    g gVar5 = (g) obj9;
                    m mVar3 = gVar5.d;
                    mVar3.f17408b = mVar3.f17407a;
                    m mVar4 = gVar5.f17395c;
                    mVar4.f17408b = mVar4.f17407a;
                }
            }
        }
    }
}
