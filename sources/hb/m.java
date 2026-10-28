package hb;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
public final class m extends AbstractMap implements Serializable {
    public static final a5.b f12751r = new a5.b(2);
    public final boolean f12753b;
    public l f12754c;
    public final l f12755f;
    public k h;
    public k f12756n;
    public int d = 0;
    public int e = 0;
    public final Comparator f12752a = f12751r;

    public m(boolean z10) {
        this.f12753b = z10;
        this.f12755f = new l(z10);
    }

    public final l a(Object obj, boolean z10) {
        int i10;
        l lVar;
        Comparable comparable;
        l lVar2;
        l lVar3 = this.f12754c;
        a5.b bVar = f12751r;
        Comparator comparator = this.f12752a;
        if (lVar3 != null) {
            if (comparator == bVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = lVar3.f12748f;
                if (comparable != null) {
                    i10 = comparable.compareTo(obj2);
                } else {
                    i10 = comparator.compare(obj, obj2);
                }
                if (i10 == 0) {
                    return lVar3;
                }
                if (i10 < 0) {
                    lVar2 = lVar3.f12746b;
                } else {
                    lVar2 = lVar3.f12747c;
                }
                if (lVar2 == null) {
                    break;
                }
                lVar3 = lVar2;
            }
        } else {
            i10 = 0;
        }
        l lVar4 = lVar3;
        if (!z10) {
            return null;
        }
        l lVar5 = this.f12755f;
        if (lVar4 == null) {
            if (comparator == bVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            lVar = new l(this.f12753b, lVar4, obj, lVar5, lVar5.e);
            this.f12754c = lVar;
        } else {
            lVar = new l(this.f12753b, lVar4, obj, lVar5, lVar5.e);
            if (i10 < 0) {
                lVar4.f12746b = lVar;
            } else {
                lVar4.f12747c = lVar;
            }
            b(lVar4, true);
        }
        this.d++;
        this.e++;
        return lVar;
    }

    public final void b(l lVar, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        while (lVar != null) {
            l lVar2 = lVar.f12746b;
            l lVar3 = lVar.f12747c;
            int i14 = 0;
            if (lVar2 != null) {
                i10 = lVar2.f12750r;
            } else {
                i10 = 0;
            }
            if (lVar3 != null) {
                i11 = lVar3.f12750r;
            } else {
                i11 = 0;
            }
            int i15 = i10 - i11;
            if (i15 == -2) {
                l lVar4 = lVar3.f12746b;
                l lVar5 = lVar3.f12747c;
                if (lVar5 != null) {
                    i13 = lVar5.f12750r;
                } else {
                    i13 = 0;
                }
                if (lVar4 != null) {
                    i14 = lVar4.f12750r;
                }
                int i16 = i14 - i13;
                if (i16 != -1 && (i16 != 0 || z10)) {
                    f(lVar3);
                    e(lVar);
                } else {
                    e(lVar);
                }
                if (z10) {
                    return;
                }
            } else if (i15 == 2) {
                l lVar6 = lVar2.f12746b;
                l lVar7 = lVar2.f12747c;
                if (lVar7 != null) {
                    i12 = lVar7.f12750r;
                } else {
                    i12 = 0;
                }
                if (lVar6 != null) {
                    i14 = lVar6.f12750r;
                }
                int i17 = i14 - i12;
                if (i17 != 1 && (i17 != 0 || z10)) {
                    e(lVar2);
                    f(lVar);
                } else {
                    f(lVar);
                }
                if (z10) {
                    return;
                }
            } else if (i15 == 0) {
                lVar.f12750r = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                lVar.f12750r = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            lVar = lVar.f12745a;
        }
    }

    public final void c(l lVar, boolean z10) {
        l lVar2;
        l lVar3;
        int i10;
        if (z10) {
            l lVar4 = lVar.e;
            lVar4.d = lVar.d;
            lVar.d.e = lVar4;
        }
        l lVar5 = lVar.f12746b;
        l lVar6 = lVar.f12747c;
        l lVar7 = lVar.f12745a;
        int i11 = 0;
        if (lVar5 != null && lVar6 != null) {
            if (lVar5.f12750r > lVar6.f12750r) {
                l lVar8 = lVar5.f12747c;
                while (true) {
                    l lVar9 = lVar8;
                    lVar3 = lVar5;
                    lVar5 = lVar9;
                    if (lVar5 == null) {
                        break;
                    }
                    lVar8 = lVar5.f12747c;
                }
            } else {
                l lVar10 = lVar6.f12746b;
                while (true) {
                    lVar2 = lVar6;
                    lVar6 = lVar10;
                    if (lVar6 == null) {
                        break;
                    }
                    lVar10 = lVar6.f12746b;
                }
                lVar3 = lVar2;
            }
            c(lVar3, false);
            l lVar11 = lVar.f12746b;
            if (lVar11 != null) {
                i10 = lVar11.f12750r;
                lVar3.f12746b = lVar11;
                lVar11.f12745a = lVar3;
                lVar.f12746b = null;
            } else {
                i10 = 0;
            }
            l lVar12 = lVar.f12747c;
            if (lVar12 != null) {
                i11 = lVar12.f12750r;
                lVar3.f12747c = lVar12;
                lVar12.f12745a = lVar3;
                lVar.f12747c = null;
            }
            lVar3.f12750r = Math.max(i10, i11) + 1;
            d(lVar, lVar3);
            return;
        }
        if (lVar5 != null) {
            d(lVar, lVar5);
            lVar.f12746b = null;
        } else if (lVar6 != null) {
            d(lVar, lVar6);
            lVar.f12747c = null;
        } else {
            d(lVar, null);
        }
        b(lVar7, false);
        this.d--;
        this.e++;
    }

    @Override
    public final void clear() {
        this.f12754c = null;
        this.d = 0;
        this.e++;
        l lVar = this.f12755f;
        lVar.e = lVar;
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
        l lVar3 = lVar.f12745a;
        lVar.f12745a = null;
        if (lVar2 != null) {
            lVar2.f12745a = lVar3;
        }
        if (lVar3 != null) {
            if (lVar3.f12746b == lVar) {
                lVar3.f12746b = lVar2;
                return;
            } else {
                lVar3.f12747c = lVar2;
                return;
            }
        }
        this.f12754c = lVar2;
    }

    public final void e(l lVar) {
        int i10;
        int i11;
        l lVar2 = lVar.f12746b;
        l lVar3 = lVar.f12747c;
        l lVar4 = lVar3.f12746b;
        l lVar5 = lVar3.f12747c;
        lVar.f12747c = lVar4;
        if (lVar4 != null) {
            lVar4.f12745a = lVar;
        }
        d(lVar, lVar3);
        lVar3.f12746b = lVar;
        lVar.f12745a = lVar3;
        int i12 = 0;
        if (lVar2 != null) {
            i10 = lVar2.f12750r;
        } else {
            i10 = 0;
        }
        if (lVar4 != null) {
            i11 = lVar4.f12750r;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        lVar.f12750r = max;
        if (lVar5 != null) {
            i12 = lVar5.f12750r;
        }
        lVar3.f12750r = Math.max(max, i12) + 1;
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
        int i10;
        int i11;
        l lVar2 = lVar.f12746b;
        l lVar3 = lVar.f12747c;
        l lVar4 = lVar2.f12746b;
        l lVar5 = lVar2.f12747c;
        lVar.f12746b = lVar5;
        if (lVar5 != null) {
            lVar5.f12745a = lVar;
        }
        d(lVar, lVar2);
        lVar2.f12747c = lVar;
        lVar.f12745a = lVar2;
        int i12 = 0;
        if (lVar3 != null) {
            i10 = lVar3.f12750r;
        } else {
            i10 = 0;
        }
        if (lVar5 != null) {
            i11 = lVar5.f12750r;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        lVar.f12750r = max;
        if (lVar4 != null) {
            i12 = lVar4.f12750r;
        }
        lVar2.f12750r = Math.max(max, i12) + 1;
    }

    @Override
    public final java.lang.Object get(java.lang.Object r3) {
        throw new UnsupportedOperationException("Method not decompiled: hb.m.get(java.lang.Object):java.lang.Object");
    }

    @Override
    public final Set keySet() {
        k kVar = this.f12756n;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this, 1);
        this.f12756n = kVar2;
        return kVar2;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.f12753b) {
                throw new NullPointerException("value == null");
            }
            l a2 = a(obj, true);
            Object obj3 = a2.f12749n;
            a2.f12749n = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    @Override
    public final java.lang.Object remove(java.lang.Object r3) {
        throw new UnsupportedOperationException("Method not decompiled: hb.m.remove(java.lang.Object):java.lang.Object");
    }

    @Override
    public final int size() {
        return this.d;
    }
}
