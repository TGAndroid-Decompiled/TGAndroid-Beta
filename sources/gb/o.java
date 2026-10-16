package gb;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
public final class o extends AbstractMap implements Serializable {
    public static final k f10070r = new k(0);
    public final boolean f10072b;
    public n f10073c;
    public final n f10074f;
    public m h;
    public m f10075n;
    public int d = 0;
    public int e = 0;
    public final Comparator f10071a = f10070r;

    public o(boolean z10) {
        this.f10072b = z10;
        this.f10074f = new n(z10);
    }

    public final n a(Object obj, boolean z10) {
        int i10;
        n nVar;
        Comparable comparable;
        n nVar2;
        n nVar3 = this.f10073c;
        k kVar = f10070r;
        Comparator comparator = this.f10071a;
        if (nVar3 != null) {
            if (comparator == kVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = nVar3.f10067f;
                if (comparable != null) {
                    i10 = comparable.compareTo(obj2);
                } else {
                    i10 = comparator.compare(obj, obj2);
                }
                if (i10 == 0) {
                    return nVar3;
                }
                if (i10 < 0) {
                    nVar2 = nVar3.f10065b;
                } else {
                    nVar2 = nVar3.f10066c;
                }
                if (nVar2 == null) {
                    break;
                }
                nVar3 = nVar2;
            }
        } else {
            i10 = 0;
        }
        n nVar4 = nVar3;
        if (!z10) {
            return null;
        }
        n nVar5 = this.f10074f;
        if (nVar4 == null) {
            if (comparator == kVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            nVar = new n(this.f10072b, nVar4, obj, nVar5, nVar5.e);
            this.f10073c = nVar;
        } else {
            nVar = new n(this.f10072b, nVar4, obj, nVar5, nVar5.e);
            if (i10 < 0) {
                nVar4.f10065b = nVar;
            } else {
                nVar4.f10066c = nVar;
            }
            b(nVar4, true);
        }
        this.d++;
        this.e++;
        return nVar;
    }

    public final void b(n nVar, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        while (nVar != null) {
            n nVar2 = nVar.f10065b;
            n nVar3 = nVar.f10066c;
            int i14 = 0;
            if (nVar2 != null) {
                i10 = nVar2.f10069r;
            } else {
                i10 = 0;
            }
            if (nVar3 != null) {
                i11 = nVar3.f10069r;
            } else {
                i11 = 0;
            }
            int i15 = i10 - i11;
            if (i15 == -2) {
                n nVar4 = nVar3.f10065b;
                n nVar5 = nVar3.f10066c;
                if (nVar5 != null) {
                    i13 = nVar5.f10069r;
                } else {
                    i13 = 0;
                }
                if (nVar4 != null) {
                    i14 = nVar4.f10069r;
                }
                int i16 = i14 - i13;
                if (i16 != -1 && (i16 != 0 || z10)) {
                    f(nVar3);
                    e(nVar);
                } else {
                    e(nVar);
                }
                if (z10) {
                    return;
                }
            } else if (i15 == 2) {
                n nVar6 = nVar2.f10065b;
                n nVar7 = nVar2.f10066c;
                if (nVar7 != null) {
                    i12 = nVar7.f10069r;
                } else {
                    i12 = 0;
                }
                if (nVar6 != null) {
                    i14 = nVar6.f10069r;
                }
                int i17 = i14 - i12;
                if (i17 != 1 && (i17 != 0 || z10)) {
                    e(nVar2);
                    f(nVar);
                } else {
                    f(nVar);
                }
                if (z10) {
                    return;
                }
            } else if (i15 == 0) {
                nVar.f10069r = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                nVar.f10069r = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            nVar = nVar.f10064a;
        }
    }

    public final void c(n nVar, boolean z10) {
        n nVar2;
        n nVar3;
        int i10;
        if (z10) {
            n nVar4 = nVar.e;
            nVar4.d = nVar.d;
            nVar.d.e = nVar4;
        }
        n nVar5 = nVar.f10065b;
        n nVar6 = nVar.f10066c;
        n nVar7 = nVar.f10064a;
        int i11 = 0;
        if (nVar5 != null && nVar6 != null) {
            if (nVar5.f10069r > nVar6.f10069r) {
                n nVar8 = nVar5.f10066c;
                while (true) {
                    n nVar9 = nVar8;
                    nVar3 = nVar5;
                    nVar5 = nVar9;
                    if (nVar5 == null) {
                        break;
                    }
                    nVar8 = nVar5.f10066c;
                }
            } else {
                n nVar10 = nVar6.f10065b;
                while (true) {
                    nVar2 = nVar6;
                    nVar6 = nVar10;
                    if (nVar6 == null) {
                        break;
                    }
                    nVar10 = nVar6.f10065b;
                }
                nVar3 = nVar2;
            }
            c(nVar3, false);
            n nVar11 = nVar.f10065b;
            if (nVar11 != null) {
                i10 = nVar11.f10069r;
                nVar3.f10065b = nVar11;
                nVar11.f10064a = nVar3;
                nVar.f10065b = null;
            } else {
                i10 = 0;
            }
            n nVar12 = nVar.f10066c;
            if (nVar12 != null) {
                i11 = nVar12.f10069r;
                nVar3.f10066c = nVar12;
                nVar12.f10064a = nVar3;
                nVar.f10066c = null;
            }
            nVar3.f10069r = Math.max(i10, i11) + 1;
            d(nVar, nVar3);
            return;
        }
        if (nVar5 != null) {
            d(nVar, nVar5);
            nVar.f10065b = null;
        } else if (nVar6 != null) {
            d(nVar, nVar6);
            nVar.f10066c = null;
        } else {
            d(nVar, null);
        }
        b(nVar7, false);
        this.d--;
        this.e++;
    }

    @Override
    public final void clear() {
        this.f10073c = null;
        this.d = 0;
        this.e++;
        n nVar = this.f10074f;
        nVar.e = nVar;
        nVar.d = nVar;
    }

    @Override
    public final boolean containsKey(Object obj) {
        n nVar = null;
        if (obj != null) {
            try {
                nVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (nVar == null) {
            return false;
        }
        return true;
    }

    public final void d(n nVar, n nVar2) {
        n nVar3 = nVar.f10064a;
        nVar.f10064a = null;
        if (nVar2 != null) {
            nVar2.f10064a = nVar3;
        }
        if (nVar3 != null) {
            if (nVar3.f10065b == nVar) {
                nVar3.f10065b = nVar2;
                return;
            } else {
                nVar3.f10066c = nVar2;
                return;
            }
        }
        this.f10073c = nVar2;
    }

    public final void e(n nVar) {
        int i10;
        int i11;
        n nVar2 = nVar.f10065b;
        n nVar3 = nVar.f10066c;
        n nVar4 = nVar3.f10065b;
        n nVar5 = nVar3.f10066c;
        nVar.f10066c = nVar4;
        if (nVar4 != null) {
            nVar4.f10064a = nVar;
        }
        d(nVar, nVar3);
        nVar3.f10065b = nVar;
        nVar.f10064a = nVar3;
        int i12 = 0;
        if (nVar2 != null) {
            i10 = nVar2.f10069r;
        } else {
            i10 = 0;
        }
        if (nVar4 != null) {
            i11 = nVar4.f10069r;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        nVar.f10069r = max;
        if (nVar5 != null) {
            i12 = nVar5.f10069r;
        }
        nVar3.f10069r = Math.max(max, i12) + 1;
    }

    @Override
    public final Set entrySet() {
        m mVar = this.h;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this, 0);
        this.h = mVar2;
        return mVar2;
    }

    public final void f(n nVar) {
        int i10;
        int i11;
        n nVar2 = nVar.f10065b;
        n nVar3 = nVar.f10066c;
        n nVar4 = nVar2.f10065b;
        n nVar5 = nVar2.f10066c;
        nVar.f10065b = nVar5;
        if (nVar5 != null) {
            nVar5.f10064a = nVar;
        }
        d(nVar, nVar2);
        nVar2.f10066c = nVar;
        nVar.f10064a = nVar2;
        int i12 = 0;
        if (nVar3 != null) {
            i10 = nVar3.f10069r;
        } else {
            i10 = 0;
        }
        if (nVar5 != null) {
            i11 = nVar5.f10069r;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        nVar.f10069r = max;
        if (nVar4 != null) {
            i12 = nVar4.f10069r;
        }
        nVar2.f10069r = Math.max(max, i12) + 1;
    }

    @Override
    public final java.lang.Object get(java.lang.Object r3) {
        throw new UnsupportedOperationException("Method not decompiled: gb.o.get(java.lang.Object):java.lang.Object");
    }

    @Override
    public final Set keySet() {
        m mVar = this.f10075n;
        if (mVar != null) {
            return mVar;
        }
        m mVar2 = new m(this, 1);
        this.f10075n = mVar2;
        return mVar2;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.f10072b) {
                throw new NullPointerException("value == null");
            }
            n a2 = a(obj, true);
            Object obj3 = a2.f10068n;
            a2.f10068n = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    @Override
    public final java.lang.Object remove(java.lang.Object r3) {
        throw new UnsupportedOperationException("Method not decompiled: gb.o.remove(java.lang.Object):java.lang.Object");
    }

    @Override
    public final int size() {
        return this.d;
    }
}
