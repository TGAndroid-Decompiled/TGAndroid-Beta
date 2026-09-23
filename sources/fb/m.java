package fb;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
public final class m extends AbstractMap implements Serializable {
    public static final i f9025r = new i(0);
    public final boolean f9027b;
    public l f9028c;
    public final l f9029f;
    public k h;
    public k f9030n;
    public int d = 0;
    public int e = 0;
    public final Comparator f9026a = f9025r;

    public m(boolean z10) {
        this.f9027b = z10;
        this.f9029f = new l(z10);
    }

    public final l a(Object obj, boolean z10) {
        int i10;
        l lVar;
        Comparable comparable;
        l lVar2;
        l lVar3 = this.f9028c;
        i iVar = f9025r;
        Comparator comparator = this.f9026a;
        if (lVar3 != null) {
            if (comparator == iVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = lVar3.f9022f;
                if (comparable != null) {
                    i10 = comparable.compareTo(obj2);
                } else {
                    i10 = comparator.compare(obj, obj2);
                }
                if (i10 == 0) {
                    return lVar3;
                }
                if (i10 < 0) {
                    lVar2 = lVar3.f9020b;
                } else {
                    lVar2 = lVar3.f9021c;
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
        l lVar5 = this.f9029f;
        if (lVar4 == null) {
            if (comparator == iVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            lVar = new l(this.f9027b, lVar4, obj, lVar5, lVar5.e);
            this.f9028c = lVar;
        } else {
            lVar = new l(this.f9027b, lVar4, obj, lVar5, lVar5.e);
            if (i10 < 0) {
                lVar4.f9020b = lVar;
            } else {
                lVar4.f9021c = lVar;
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
            l lVar2 = lVar.f9020b;
            l lVar3 = lVar.f9021c;
            int i14 = 0;
            if (lVar2 != null) {
                i10 = lVar2.f9024r;
            } else {
                i10 = 0;
            }
            if (lVar3 != null) {
                i11 = lVar3.f9024r;
            } else {
                i11 = 0;
            }
            int i15 = i10 - i11;
            if (i15 == -2) {
                l lVar4 = lVar3.f9020b;
                l lVar5 = lVar3.f9021c;
                if (lVar5 != null) {
                    i13 = lVar5.f9024r;
                } else {
                    i13 = 0;
                }
                if (lVar4 != null) {
                    i14 = lVar4.f9024r;
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
                l lVar6 = lVar2.f9020b;
                l lVar7 = lVar2.f9021c;
                if (lVar7 != null) {
                    i12 = lVar7.f9024r;
                } else {
                    i12 = 0;
                }
                if (lVar6 != null) {
                    i14 = lVar6.f9024r;
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
                lVar.f9024r = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                lVar.f9024r = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            lVar = lVar.f9019a;
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
        l lVar5 = lVar.f9020b;
        l lVar6 = lVar.f9021c;
        l lVar7 = lVar.f9019a;
        int i11 = 0;
        if (lVar5 != null && lVar6 != null) {
            if (lVar5.f9024r > lVar6.f9024r) {
                l lVar8 = lVar5.f9021c;
                while (true) {
                    l lVar9 = lVar8;
                    lVar3 = lVar5;
                    lVar5 = lVar9;
                    if (lVar5 == null) {
                        break;
                    }
                    lVar8 = lVar5.f9021c;
                }
            } else {
                l lVar10 = lVar6.f9020b;
                while (true) {
                    lVar2 = lVar6;
                    lVar6 = lVar10;
                    if (lVar6 == null) {
                        break;
                    }
                    lVar10 = lVar6.f9020b;
                }
                lVar3 = lVar2;
            }
            c(lVar3, false);
            l lVar11 = lVar.f9020b;
            if (lVar11 != null) {
                i10 = lVar11.f9024r;
                lVar3.f9020b = lVar11;
                lVar11.f9019a = lVar3;
                lVar.f9020b = null;
            } else {
                i10 = 0;
            }
            l lVar12 = lVar.f9021c;
            if (lVar12 != null) {
                i11 = lVar12.f9024r;
                lVar3.f9021c = lVar12;
                lVar12.f9019a = lVar3;
                lVar.f9021c = null;
            }
            lVar3.f9024r = Math.max(i10, i11) + 1;
            d(lVar, lVar3);
            return;
        }
        if (lVar5 != null) {
            d(lVar, lVar5);
            lVar.f9020b = null;
        } else if (lVar6 != null) {
            d(lVar, lVar6);
            lVar.f9021c = null;
        } else {
            d(lVar, null);
        }
        b(lVar7, false);
        this.d--;
        this.e++;
    }

    @Override
    public final void clear() {
        this.f9028c = null;
        this.d = 0;
        this.e++;
        l lVar = this.f9029f;
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
        l lVar3 = lVar.f9019a;
        lVar.f9019a = null;
        if (lVar2 != null) {
            lVar2.f9019a = lVar3;
        }
        if (lVar3 != null) {
            if (lVar3.f9020b == lVar) {
                lVar3.f9020b = lVar2;
                return;
            } else {
                lVar3.f9021c = lVar2;
                return;
            }
        }
        this.f9028c = lVar2;
    }

    public final void e(l lVar) {
        int i10;
        int i11;
        l lVar2 = lVar.f9020b;
        l lVar3 = lVar.f9021c;
        l lVar4 = lVar3.f9020b;
        l lVar5 = lVar3.f9021c;
        lVar.f9021c = lVar4;
        if (lVar4 != null) {
            lVar4.f9019a = lVar;
        }
        d(lVar, lVar3);
        lVar3.f9020b = lVar;
        lVar.f9019a = lVar3;
        int i12 = 0;
        if (lVar2 != null) {
            i10 = lVar2.f9024r;
        } else {
            i10 = 0;
        }
        if (lVar4 != null) {
            i11 = lVar4.f9024r;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        lVar.f9024r = max;
        if (lVar5 != null) {
            i12 = lVar5.f9024r;
        }
        lVar3.f9024r = Math.max(max, i12) + 1;
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
        l lVar2 = lVar.f9020b;
        l lVar3 = lVar.f9021c;
        l lVar4 = lVar2.f9020b;
        l lVar5 = lVar2.f9021c;
        lVar.f9020b = lVar5;
        if (lVar5 != null) {
            lVar5.f9019a = lVar;
        }
        d(lVar, lVar2);
        lVar2.f9021c = lVar;
        lVar.f9019a = lVar2;
        int i12 = 0;
        if (lVar3 != null) {
            i10 = lVar3.f9024r;
        } else {
            i10 = 0;
        }
        if (lVar5 != null) {
            i11 = lVar5.f9024r;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        lVar.f9024r = max;
        if (lVar4 != null) {
            i12 = lVar4.f9024r;
        }
        lVar2.f9024r = Math.max(max, i12) + 1;
    }

    @Override
    public final java.lang.Object get(java.lang.Object r3) {
        throw new UnsupportedOperationException("Method not decompiled: fb.m.get(java.lang.Object):java.lang.Object");
    }

    @Override
    public final Set keySet() {
        k kVar = this.f9030n;
        if (kVar != null) {
            return kVar;
        }
        k kVar2 = new k(this, 1);
        this.f9030n = kVar2;
        return kVar2;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.f9027b) {
                throw new NullPointerException("value == null");
            }
            l a2 = a(obj, true);
            Object obj3 = a2.f9023n;
            a2.f9023n = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    @Override
    public final java.lang.Object remove(java.lang.Object r3) {
        throw new UnsupportedOperationException("Method not decompiled: fb.m.remove(java.lang.Object):java.lang.Object");
    }

    @Override
    public final int size() {
        return this.d;
    }
}
