package le;

import android.view.animation.Interpolator;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
public final class j implements Iterable {
    public final f f12888a;
    public final e f12890c;
    public final i d;
    public boolean f12891f;
    public final ArrayList f12889b = new ArrayList();
    public final ArrayList e = new ArrayList();

    public j(f fVar, Interpolator interpolator, long j3) {
        this.f12888a = fVar;
        this.d = new i(this, fVar);
        if (interpolator != null && j3 > 0) {
            this.f12890c = new e(0, new ce.m(this), interpolator, j3);
        } else {
            this.f12890c = null;
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
        i iVar = this.d;
        boolean a2 = iVar.f12884b.a(f7);
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
        if (!iVar.f12886f.a(f7) && !z11) {
            z12 = false;
        } else {
            z12 = true;
        }
        if (!iVar.f12887g.a(f7) && !z12) {
            z13 = false;
        } else {
            z13 = true;
        }
        if (!iVar.f12885c.a(f7) && !z13) {
            z14 = false;
        } else {
            z14 = true;
        }
        if (!iVar.f12883a.i(f7) && !z14) {
            z15 = false;
        } else {
            z15 = true;
        }
        ArrayList arrayList = this.f12889b;
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            g gVar = (g) obj;
            boolean a10 = gVar.f12881c.a(f7);
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
            if (!gVar.f12882f.a(f7) && !z17) {
                z18 = false;
            } else {
                z18 = true;
            }
            Object obj2 = gVar.f12879a;
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
            this.f12888a.x();
            if (f7 == 1.0f) {
                q(true);
            }
        }
    }

    @Override
    public final Iterator iterator() {
        return this.f12889b.iterator();
    }

    public final g n(int i10) {
        return (g) this.f12889b.get(i10);
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
            g gVar = (g) obj;
            Object obj2 = gVar.f12879a;
            m mVar = gVar.f12882f;
            n nVar = gVar.e;
            if (obj2 instanceof h) {
                h hVar = (h) obj2;
                if (gVar.f12880b == 0) {
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
                        p();
                        nVar.e(f7, f10, f11, f12);
                    }
                    float f13 = b10;
                    if (mVar.b(f13)) {
                        p();
                        mVar.f12895c = f13;
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
        ArrayList arrayList3 = this.f12889b;
        if (z10) {
            int size2 = arrayList3.size();
            int i17 = 0;
            while (i17 < size2) {
                Object obj3 = arrayList3.get(i17);
                i17++;
                Object obj4 = ((g) obj3).f12879a;
            }
        }
        int size3 = arrayList3.size();
        int i18 = 0;
        while (i18 < size3) {
            Object obj5 = arrayList3.get(i18);
            i18++;
            Object obj6 = ((g) obj5).f12879a;
        }
        i iVar = this.d;
        if (z10) {
            m mVar2 = iVar.f12886f;
            f fVar = iVar.f12883a;
            m mVar3 = iVar.e;
            m mVar4 = iVar.d;
            m mVar5 = iVar.f12887g;
            float f14 = i10;
            if (mVar2.b(f14)) {
                p();
                iVar.f12886f.f12895c = f14;
            }
            float f15 = i11;
            if (mVar5.b(f15)) {
                p();
                mVar5.f12895c = f15;
            }
            float f16 = i12;
            if (mVar4.b(f16)) {
                p();
                mVar4.f12895c = f16;
            }
            float f17 = i13;
            if (mVar3.b(f17)) {
                p();
                mVar3.f12895c = f17;
            }
            if (fVar.g()) {
                p();
                fVar.j();
                return;
            }
            return;
        }
        iVar.f12886f.d(i10);
        iVar.f12887g.d(i11);
        iVar.d.d(i12);
        iVar.e.d(i13);
        iVar.f12883a.a();
    }

    public final void p() {
        if (!this.f12891f) {
            this.f12891f = true;
            e eVar = this.f12890c;
            if (eVar != null) {
                eVar.b();
                q(false);
                eVar.c(0.0f);
                return;
            }
            q(false);
        }
    }

    public final void q(boolean z10) {
        ArrayList arrayList = this.f12889b;
        boolean z11 = false;
        for (int size = arrayList.size() - 1; size >= 0; size--) {
            g gVar = (g) arrayList.get(size);
            gVar.a(z10);
            if (gVar.c() == 0.0f && gVar.h) {
                arrayList.remove(size);
                Object obj = gVar.f12879a;
                if (obj instanceof oe.a) {
                    ((oe.a) obj).a();
                }
                z11 = true;
            }
        }
        if (z11) {
            arrayList.trimToSize();
        }
        i iVar = this.d;
        iVar.f12884b.c(z10);
        iVar.d.c(z10);
        iVar.e.c(z10);
        iVar.f12886f.c(z10);
        iVar.f12887g.c(z10);
        iVar.f12885c.c(z10);
        iVar.f12883a.e(z10);
    }

    public final void r(List list, boolean z10) {
        boolean isEmpty;
        boolean z11;
        boolean z12;
        int i10;
        boolean z13;
        int i11;
        e eVar = this.f12890c;
        i iVar = this.d;
        ArrayList arrayList = this.e;
        ArrayList arrayList2 = this.f12889b;
        if (!z10) {
            if (eVar != null) {
                eVar.b();
                q(false);
                eVar.c(0.0f);
            } else {
                q(false);
            }
            for (int size = arrayList2.size() - 1; size >= 0; size--) {
                Object obj = ((g) arrayList2.get(size)).f12879a;
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
                    g gVar = new g(arrayList.size(), obj2, true);
                    arrayList2.add(gVar);
                    arrayList.add(gVar);
                }
                arrayList2.trimToSize();
                arrayList.trimToSize();
            }
            i.a(iVar, i11, false);
            o(false);
            this.f12888a.x();
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
            p();
            if (list != null && !list.isEmpty()) {
                boolean z14 = false;
                int i13 = 0;
                boolean z15 = false;
                for (int i14 = 0; i14 < arrayList2.size(); i14++) {
                    g gVar2 = (g) arrayList2.get(i14);
                    Object obj3 = gVar2.f12879a;
                    m mVar = gVar2.d;
                    m mVar2 = gVar2.f12881c;
                    int indexOf = list.indexOf(obj3);
                    if (indexOf != -1) {
                        i13++;
                        float f7 = indexOf;
                        if (mVar2.b(f7)) {
                            p();
                            mVar2.f12895c = f7;
                        }
                        if (gVar2.f12880b != indexOf) {
                            gVar2.f12880b = indexOf;
                            if (!z14 && gVar2.h) {
                                z14 = false;
                            } else {
                                z14 = true;
                            }
                            z15 = true;
                        }
                        if (mVar.b(1.0f)) {
                            p();
                            mVar.f12895c = 1.0f;
                            gVar2.h = false;
                            arrayList.add(gVar2);
                            i.a(iVar, arrayList.size(), true);
                            z14 = true;
                        }
                    } else if (mVar.b(0.0f)) {
                        p();
                        mVar.f12895c = 0.0f;
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
                                if (((g) obj5).f12879a == null) {
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
                                if (obj4.equals(((g) obj6).f12879a)) {
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
                            g gVar3 = new g(i15, obj4, false);
                            gVar3.d.f12895c = 1.0f;
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
                if (!this.f12891f) {
                    int size4 = arrayList2.size();
                    int i18 = 0;
                    while (true) {
                        if (i18 >= size4) {
                            break;
                        }
                        Object obj7 = arrayList2.get(i18);
                        i18++;
                        if (((g) obj7).d.b(0.0f)) {
                            p();
                            break;
                        }
                    }
                }
                if (this.f12891f) {
                    int size5 = arrayList2.size();
                    int i19 = 0;
                    while (i19 < size5) {
                        Object obj8 = arrayList2.get(i19);
                        i19++;
                        g gVar4 = (g) obj8;
                        if (gVar4.d.b(0.0f)) {
                            p();
                            gVar4.d.f12895c = 0.0f;
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
            o(z11);
            if (this.f12891f) {
                this.f12891f = false;
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
                    mVar3.f12894b = mVar3.f12893a;
                    m mVar4 = gVar5.f12881c;
                    mVar4.f12894b = mVar4.f12893a;
                }
            }
        }
    }
}
