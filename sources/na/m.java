package na;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
public final class m extends AbstractMap implements Serializable {
    public static final d2.a f18553r = new d2.a(6);
    public final boolean f18555b;
    public l f18556c;
    public final l f18558f;
    public k h;
    public k f18559n;
    public int d = 0;
    public int f18557e = 0;
    public final Comparator f18554a = f18553r;

    public m(boolean z10) {
        this.f18555b = z10;
        this.f18558f = new l(z10);
    }

    public final l a(Object obj, boolean z10) {
        int i9;
        l lVar;
        Comparable comparable;
        l lVar2;
        l lVar3 = this.f18556c;
        d2.a aVar = f18553r;
        Comparator comparator = this.f18554a;
        if (lVar3 != null) {
            if (comparator == aVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = lVar3.f18550f;
                if (comparable != null) {
                    i9 = comparable.compareTo(obj2);
                } else {
                    i9 = comparator.compare(obj, obj2);
                }
                if (i9 == 0) {
                    return lVar3;
                }
                if (i9 < 0) {
                    lVar2 = lVar3.f18547b;
                } else {
                    lVar2 = lVar3.f18548c;
                }
                if (lVar2 == null) {
                    break;
                }
                lVar3 = lVar2;
            }
        } else {
            i9 = 0;
        }
        l lVar4 = lVar3;
        if (!z10) {
            return null;
        }
        l lVar5 = this.f18558f;
        if (lVar4 == null) {
            if (comparator == aVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            lVar = new l(this.f18555b, lVar4, obj, lVar5, lVar5.f18549e);
            this.f18556c = lVar;
        } else {
            lVar = new l(this.f18555b, lVar4, obj, lVar5, lVar5.f18549e);
            if (i9 < 0) {
                lVar4.f18547b = lVar;
            } else {
                lVar4.f18548c = lVar;
            }
            b(lVar4, true);
        }
        this.d++;
        this.f18557e++;
        return lVar;
    }

    public final void b(l lVar, boolean z10) {
        int i9;
        int i10;
        int i11;
        int i12;
        while (lVar != null) {
            l lVar2 = lVar.f18547b;
            l lVar3 = lVar.f18548c;
            int i13 = 0;
            if (lVar2 != null) {
                i9 = lVar2.f18552r;
            } else {
                i9 = 0;
            }
            if (lVar3 != null) {
                i10 = lVar3.f18552r;
            } else {
                i10 = 0;
            }
            int i14 = i9 - i10;
            if (i14 == -2) {
                l lVar4 = lVar3.f18547b;
                l lVar5 = lVar3.f18548c;
                if (lVar5 != null) {
                    i12 = lVar5.f18552r;
                } else {
                    i12 = 0;
                }
                if (lVar4 != null) {
                    i13 = lVar4.f18552r;
                }
                int i15 = i13 - i12;
                if (i15 != -1 && (i15 != 0 || z10)) {
                    f(lVar3);
                    e(lVar);
                } else {
                    e(lVar);
                }
                if (z10) {
                    return;
                }
            } else if (i14 == 2) {
                l lVar6 = lVar2.f18547b;
                l lVar7 = lVar2.f18548c;
                if (lVar7 != null) {
                    i11 = lVar7.f18552r;
                } else {
                    i11 = 0;
                }
                if (lVar6 != null) {
                    i13 = lVar6.f18552r;
                }
                int i16 = i13 - i11;
                if (i16 != 1 && (i16 != 0 || z10)) {
                    e(lVar2);
                    f(lVar);
                } else {
                    f(lVar);
                }
                if (z10) {
                    return;
                }
            } else if (i14 == 0) {
                lVar.f18552r = i9 + 1;
                if (z10) {
                    return;
                }
            } else {
                lVar.f18552r = Math.max(i9, i10) + 1;
                if (!z10) {
                    return;
                }
            }
            lVar = lVar.f18546a;
        }
    }

    public final void c(l lVar, boolean z10) {
        l lVar2;
        l lVar3;
        int i9;
        if (z10) {
            l lVar4 = lVar.f18549e;
            lVar4.d = lVar.d;
            lVar.d.f18549e = lVar4;
        }
        l lVar5 = lVar.f18547b;
        l lVar6 = lVar.f18548c;
        l lVar7 = lVar.f18546a;
        int i10 = 0;
        if (lVar5 != null && lVar6 != null) {
            if (lVar5.f18552r > lVar6.f18552r) {
                l lVar8 = lVar5.f18548c;
                while (true) {
                    l lVar9 = lVar8;
                    lVar3 = lVar5;
                    lVar5 = lVar9;
                    if (lVar5 == null) {
                        break;
                    }
                    lVar8 = lVar5.f18548c;
                }
            } else {
                l lVar10 = lVar6.f18547b;
                while (true) {
                    lVar2 = lVar6;
                    lVar6 = lVar10;
                    if (lVar6 == null) {
                        break;
                    }
                    lVar10 = lVar6.f18547b;
                }
                lVar3 = lVar2;
            }
            c(lVar3, false);
            l lVar11 = lVar.f18547b;
            if (lVar11 != null) {
                i9 = lVar11.f18552r;
                lVar3.f18547b = lVar11;
                lVar11.f18546a = lVar3;
                lVar.f18547b = null;
            } else {
                i9 = 0;
            }
            l lVar12 = lVar.f18548c;
            if (lVar12 != null) {
                i10 = lVar12.f18552r;
                lVar3.f18548c = lVar12;
                lVar12.f18546a = lVar3;
                lVar.f18548c = null;
            }
            lVar3.f18552r = Math.max(i9, i10) + 1;
            d(lVar, lVar3);
            return;
        }
        if (lVar5 != null) {
            d(lVar, lVar5);
            lVar.f18547b = null;
        } else if (lVar6 != null) {
            d(lVar, lVar6);
            lVar.f18548c = null;
        } else {
            d(lVar, null);
        }
        b(lVar7, false);
        this.d--;
        this.f18557e++;
    }

    @Override
    public final void clear() {
        this.f18556c = null;
        this.d = 0;
        this.f18557e++;
        l lVar = this.f18558f;
        lVar.f18549e = lVar;
        lVar.d = lVar;
    }

    @Override
    public final boolean containsKey(Object obj) {
        l lVar = null;
        if (obj != null) {
            try {
                lVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (lVar == null) {
            return false;
        }
        return true;
    }

    public final void d(l lVar, l lVar2) {
        l lVar3 = lVar.f18546a;
        lVar.f18546a = null;
        if (lVar2 != null) {
            lVar2.f18546a = lVar3;
        }
        if (lVar3 != null) {
            if (lVar3.f18547b == lVar) {
                lVar3.f18547b = lVar2;
                return;
            } else {
                lVar3.f18548c = lVar2;
                return;
            }
        }
        this.f18556c = lVar2;
    }

    public final void e(l lVar) {
        int i9;
        int i10;
        l lVar2 = lVar.f18547b;
        l lVar3 = lVar.f18548c;
        l lVar4 = lVar3.f18547b;
        l lVar5 = lVar3.f18548c;
        lVar.f18548c = lVar4;
        if (lVar4 != null) {
            lVar4.f18546a = lVar;
        }
        d(lVar, lVar3);
        lVar3.f18547b = lVar;
        lVar.f18546a = lVar3;
        int i11 = 0;
        if (lVar2 != null) {
            i9 = lVar2.f18552r;
        } else {
            i9 = 0;
        }
        if (lVar4 != null) {
            i10 = lVar4.f18552r;
        } else {
            i10 = 0;
        }
        int max = Math.max(i9, i10) + 1;
        lVar.f18552r = max;
        if (lVar5 != null) {
            i11 = lVar5.f18552r;
        }
        lVar3.f18552r = Math.max(max, i11) + 1;
    }

    @Override
    public final Set entrySet() {
        k kVar = this.h;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this, 0);
        this.h = kVar2;
        return kVar2;
    }

    public final void f(l lVar) {
        int i9;
        int i10;
        l lVar2 = lVar.f18547b;
        l lVar3 = lVar.f18548c;
        l lVar4 = lVar2.f18547b;
        l lVar5 = lVar2.f18548c;
        lVar.f18547b = lVar5;
        if (lVar5 != null) {
            lVar5.f18546a = lVar;
        }
        d(lVar, lVar2);
        lVar2.f18548c = lVar;
        lVar.f18546a = lVar2;
        int i11 = 0;
        if (lVar3 != null) {
            i9 = lVar3.f18552r;
        } else {
            i9 = 0;
        }
        if (lVar5 != null) {
            i10 = lVar5.f18552r;
        } else {
            i10 = 0;
        }
        int max = Math.max(i9, i10) + 1;
        lVar.f18552r = max;
        if (lVar4 != null) {
            i11 = lVar4.f18552r;
        }
        lVar2.f18552r = Math.max(max, i11) + 1;
    }

    @Override
    public final java.lang.Object get(java.lang.Object r3) {
        throw new UnsupportedOperationException("Method not decompiled: na.m.get(java.lang.Object):java.lang.Object");
    }

    @Override
    public final Set keySet() {
        k kVar = this.f18559n;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this, 1);
        this.f18559n = kVar2;
        return kVar2;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.f18555b) {
                throw new NullPointerException("value == null");
            }
            l a2 = a(obj, true);
            Object obj3 = a2.f18551n;
            a2.f18551n = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    @Override
    public final java.lang.Object remove(java.lang.Object r3) {
        throw new UnsupportedOperationException("Method not decompiled: na.m.remove(java.lang.Object):java.lang.Object");
    }

    @Override
    public final int size() {
        return this.d;
    }
}
