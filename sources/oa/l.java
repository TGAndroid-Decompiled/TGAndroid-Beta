package oa;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;

public final class l extends AbstractMap implements Serializable {

    public static final d2.a f19402r = new d2.a(6);

    public final boolean f19404b;

    public k f19405c;

    public final k f19407f;
    public j h;

    public j f19408n;
    public int d = 0;

    public int f19406e = 0;

    public final Comparator f19403a = f19402r;

    public l(boolean z10) {
        this.f19404b = z10;
        this.f19407f = new k(z10);
    }

    public final k a(Object obj, boolean z10) {
        int iCompareTo;
        k kVar;
        k kVar2 = this.f19405c;
        d2.a aVar = f19402r;
        Comparator comparator = this.f19403a;
        if (kVar2 != null) {
            Comparable comparable = comparator == aVar ? (Comparable) obj : null;
            while (true) {
                Object obj2 = kVar2.f19399f;
                iCompareTo = comparable != null ? comparable.compareTo(obj2) : comparator.compare(obj, obj2);
                if (iCompareTo == 0) {
                    return kVar2;
                }
                k kVar3 = iCompareTo < 0 ? kVar2.f19396b : kVar2.f19397c;
                if (kVar3 == null) {
                    break;
                }
                kVar2 = kVar3;
            }
        } else {
            iCompareTo = 0;
        }
        k kVar4 = kVar2;
        if (!z10) {
            return null;
        }
        k kVar5 = this.f19407f;
        if (kVar4 != null) {
            kVar = new k(this.f19404b, kVar4, obj, kVar5, kVar5.f19398e);
            if (iCompareTo < 0) {
                kVar4.f19396b = kVar;
            } else {
                kVar4.f19397c = kVar;
            }
            b(kVar4, true);
        } else {
            if (comparator == aVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            kVar = new k(this.f19404b, kVar4, obj, kVar5, kVar5.f19398e);
            this.f19405c = kVar;
        }
        this.d++;
        this.f19406e++;
        return kVar;
    }

    public final void b(k kVar, boolean z10) {
        while (kVar != null) {
            k kVar2 = kVar.f19396b;
            k kVar3 = kVar.f19397c;
            int i10 = kVar2 != null ? kVar2.f19401r : 0;
            int i11 = kVar3 != null ? kVar3.f19401r : 0;
            int i12 = i10 - i11;
            if (i12 == -2) {
                k kVar4 = kVar3.f19396b;
                k kVar5 = kVar3.f19397c;
                int i13 = (kVar4 != null ? kVar4.f19401r : 0) - (kVar5 != null ? kVar5.f19401r : 0);
                if (i13 == -1 || (i13 == 0 && !z10)) {
                    e(kVar);
                } else {
                    f(kVar3);
                    e(kVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 2) {
                k kVar6 = kVar2.f19396b;
                k kVar7 = kVar2.f19397c;
                int i14 = (kVar6 != null ? kVar6.f19401r : 0) - (kVar7 != null ? kVar7.f19401r : 0);
                if (i14 == 1 || (i14 == 0 && !z10)) {
                    f(kVar);
                } else {
                    e(kVar2);
                    f(kVar);
                }
                if (z10) {
                    return;
                }
            } else if (i12 == 0) {
                kVar.f19401r = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                kVar.f19401r = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            kVar = kVar.f19395a;
        }
    }

    public final void c(k kVar, boolean z10) {
        k kVar2;
        k kVar3;
        int i10;
        if (z10) {
            k kVar4 = kVar.f19398e;
            kVar4.d = kVar.d;
            kVar.d.f19398e = kVar4;
        }
        k kVar5 = kVar.f19396b;
        k kVar6 = kVar.f19397c;
        k kVar7 = kVar.f19395a;
        int i11 = 0;
        if (kVar5 == null || kVar6 == null) {
            if (kVar5 != null) {
                d(kVar, kVar5);
                kVar.f19396b = null;
            } else if (kVar6 != null) {
                d(kVar, kVar6);
                kVar.f19397c = null;
            } else {
                d(kVar, null);
            }
            b(kVar7, false);
            this.d--;
            this.f19406e++;
            return;
        }
        if (kVar5.f19401r > kVar6.f19401r) {
            k kVar8 = kVar5.f19397c;
            while (true) {
                k kVar9 = kVar8;
                kVar3 = kVar5;
                kVar5 = kVar9;
                if (kVar5 == null) {
                    break;
                } else {
                    kVar8 = kVar5.f19397c;
                }
            }
        } else {
            k kVar10 = kVar6.f19396b;
            while (true) {
                kVar2 = kVar6;
                kVar6 = kVar10;
                if (kVar6 == null) {
                    break;
                } else {
                    kVar10 = kVar6.f19396b;
                }
            }
            kVar3 = kVar2;
        }
        c(kVar3, false);
        k kVar11 = kVar.f19396b;
        if (kVar11 != null) {
            i10 = kVar11.f19401r;
            kVar3.f19396b = kVar11;
            kVar11.f19395a = kVar3;
            kVar.f19396b = null;
        } else {
            i10 = 0;
        }
        k kVar12 = kVar.f19397c;
        if (kVar12 != null) {
            i11 = kVar12.f19401r;
            kVar3.f19397c = kVar12;
            kVar12.f19395a = kVar3;
            kVar.f19397c = null;
        }
        kVar3.f19401r = Math.max(i10, i11) + 1;
        d(kVar, kVar3);
    }

    @Override
    public final void clear() {
        this.f19405c = null;
        this.d = 0;
        this.f19406e++;
        k kVar = this.f19407f;
        kVar.f19398e = kVar;
        kVar.d = kVar;
    }

    @Override
    public final boolean containsKey(Object obj) {
        k kVarA = null;
        if (obj != null) {
            try {
                kVarA = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        return kVarA != null;
    }

    public final void d(k kVar, k kVar2) {
        k kVar3 = kVar.f19395a;
        kVar.f19395a = null;
        if (kVar2 != null) {
            kVar2.f19395a = kVar3;
        }
        if (kVar3 == null) {
            this.f19405c = kVar2;
        } else if (kVar3.f19396b == kVar) {
            kVar3.f19396b = kVar2;
        } else {
            kVar3.f19397c = kVar2;
        }
    }

    public final void e(k kVar) {
        k kVar2 = kVar.f19396b;
        k kVar3 = kVar.f19397c;
        k kVar4 = kVar3.f19396b;
        k kVar5 = kVar3.f19397c;
        kVar.f19397c = kVar4;
        if (kVar4 != null) {
            kVar4.f19395a = kVar;
        }
        d(kVar, kVar3);
        kVar3.f19396b = kVar;
        kVar.f19395a = kVar3;
        int iMax = Math.max(kVar2 != null ? kVar2.f19401r : 0, kVar4 != null ? kVar4.f19401r : 0) + 1;
        kVar.f19401r = iMax;
        kVar3.f19401r = Math.max(iMax, kVar5 != null ? kVar5.f19401r : 0) + 1;
    }

    @Override
    public final Set entrySet() {
        j jVar = this.h;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 0);
        this.h = jVar2;
        return jVar2;
    }

    public final void f(k kVar) {
        k kVar2 = kVar.f19396b;
        k kVar3 = kVar.f19397c;
        k kVar4 = kVar2.f19396b;
        k kVar5 = kVar2.f19397c;
        kVar.f19396b = kVar5;
        if (kVar5 != null) {
            kVar5.f19395a = kVar;
        }
        d(kVar, kVar2);
        kVar2.f19397c = kVar;
        kVar.f19395a = kVar2;
        int iMax = Math.max(kVar3 != null ? kVar3.f19401r : 0, kVar5 != null ? kVar5.f19401r : 0) + 1;
        kVar.f19401r = iMax;
        kVar2.f19401r = Math.max(iMax, kVar4 != null ? kVar4.f19401r : 0) + 1;
    }

    @Override
    public final Object get(Object obj) {
        k kVarA;
        if (obj != null) {
            try {
                kVarA = a(obj, false);
            } catch (ClassCastException unused) {
                kVarA = null;
            }
        } else {
            kVarA = null;
        }
        if (kVarA != null) {
            return kVarA.f19400n;
        }
        return null;
    }

    @Override
    public final Set keySet() {
        j jVar = this.f19408n;
        if (jVar != null) {
            return jVar;
        }
        j jVar2 = new j(this, 1);
        this.f19408n = jVar2;
        return jVar2;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        if (obj == null) {
            throw new NullPointerException("key == null");
        }
        if (obj2 == null && !this.f19404b) {
            throw new NullPointerException("value == null");
        }
        k kVarA = a(obj, true);
        Object obj3 = kVarA.f19400n;
        kVarA.f19400n = obj2;
        return obj3;
    }

    @Override
    public final Object remove(Object obj) {
        k kVarA;
        if (obj != null) {
            try {
                kVarA = a(obj, false);
            } catch (ClassCastException unused) {
                kVarA = null;
            }
        } else {
            kVarA = null;
        }
        if (kVarA != null) {
            c(kVarA, true);
        }
        if (kVarA != null) {
            return kVarA.f19400n;
        }
        return null;
    }

    @Override
    public final int size() {
        return this.d;
    }
}
