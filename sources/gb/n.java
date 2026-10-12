package gb;

import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Comparator;
import java.util.Set;
public final class n extends AbstractMap implements Serializable {
    public static final j f10066r = new j(0);
    public final boolean f10068b;
    public m f10069c;
    public final m f10070f;
    public l h;
    public l f10071n;
    public int d = 0;
    public int e = 0;
    public final Comparator f10067a = f10066r;

    public n(boolean z10) {
        this.f10068b = z10;
        this.f10070f = new m(z10);
    }

    public final m a(Object obj, boolean z10) {
        int i10;
        m mVar;
        Comparable comparable;
        m mVar2;
        m mVar3 = this.f10069c;
        j jVar = f10066r;
        Comparator comparator = this.f10067a;
        if (mVar3 != null) {
            if (comparator == jVar) {
                comparable = (Comparable) obj;
            } else {
                comparable = null;
            }
            while (true) {
                Object obj2 = mVar3.f10063f;
                if (comparable != null) {
                    i10 = comparable.compareTo(obj2);
                } else {
                    i10 = comparator.compare(obj, obj2);
                }
                if (i10 == 0) {
                    return mVar3;
                }
                if (i10 < 0) {
                    mVar2 = mVar3.f10061b;
                } else {
                    mVar2 = mVar3.f10062c;
                }
                if (mVar2 == null) {
                    break;
                }
                mVar3 = mVar2;
            }
        } else {
            i10 = 0;
        }
        m mVar4 = mVar3;
        if (!z10) {
            return null;
        }
        m mVar5 = this.f10070f;
        if (mVar4 == null) {
            if (comparator == jVar && !(obj instanceof Comparable)) {
                throw new ClassCastException(obj.getClass().getName().concat(" is not Comparable"));
            }
            mVar = new m(this.f10068b, mVar4, obj, mVar5, mVar5.e);
            this.f10069c = mVar;
        } else {
            mVar = new m(this.f10068b, mVar4, obj, mVar5, mVar5.e);
            if (i10 < 0) {
                mVar4.f10061b = mVar;
            } else {
                mVar4.f10062c = mVar;
            }
            b(mVar4, true);
        }
        this.d++;
        this.e++;
        return mVar;
    }

    public final void b(m mVar, boolean z10) {
        int i10;
        int i11;
        int i12;
        int i13;
        while (mVar != null) {
            m mVar2 = mVar.f10061b;
            m mVar3 = mVar.f10062c;
            int i14 = 0;
            if (mVar2 != null) {
                i10 = mVar2.f10065r;
            } else {
                i10 = 0;
            }
            if (mVar3 != null) {
                i11 = mVar3.f10065r;
            } else {
                i11 = 0;
            }
            int i15 = i10 - i11;
            if (i15 == -2) {
                m mVar4 = mVar3.f10061b;
                m mVar5 = mVar3.f10062c;
                if (mVar5 != null) {
                    i13 = mVar5.f10065r;
                } else {
                    i13 = 0;
                }
                if (mVar4 != null) {
                    i14 = mVar4.f10065r;
                }
                int i16 = i14 - i13;
                if (i16 != -1 && (i16 != 0 || z10)) {
                    f(mVar3);
                    e(mVar);
                } else {
                    e(mVar);
                }
                if (z10) {
                    return;
                }
            } else if (i15 == 2) {
                m mVar6 = mVar2.f10061b;
                m mVar7 = mVar2.f10062c;
                if (mVar7 != null) {
                    i12 = mVar7.f10065r;
                } else {
                    i12 = 0;
                }
                if (mVar6 != null) {
                    i14 = mVar6.f10065r;
                }
                int i17 = i14 - i12;
                if (i17 != 1 && (i17 != 0 || z10)) {
                    e(mVar2);
                    f(mVar);
                } else {
                    f(mVar);
                }
                if (z10) {
                    return;
                }
            } else if (i15 == 0) {
                mVar.f10065r = i10 + 1;
                if (z10) {
                    return;
                }
            } else {
                mVar.f10065r = Math.max(i10, i11) + 1;
                if (!z10) {
                    return;
                }
            }
            mVar = mVar.f10060a;
        }
    }

    public final void c(m mVar, boolean z10) {
        m mVar2;
        m mVar3;
        int i10;
        if (z10) {
            m mVar4 = mVar.e;
            mVar4.d = mVar.d;
            mVar.d.e = mVar4;
        }
        m mVar5 = mVar.f10061b;
        m mVar6 = mVar.f10062c;
        m mVar7 = mVar.f10060a;
        int i11 = 0;
        if (mVar5 != null && mVar6 != null) {
            if (mVar5.f10065r > mVar6.f10065r) {
                m mVar8 = mVar5.f10062c;
                while (true) {
                    m mVar9 = mVar8;
                    mVar3 = mVar5;
                    mVar5 = mVar9;
                    if (mVar5 == null) {
                        break;
                    }
                    mVar8 = mVar5.f10062c;
                }
            } else {
                m mVar10 = mVar6.f10061b;
                while (true) {
                    mVar2 = mVar6;
                    mVar6 = mVar10;
                    if (mVar6 == null) {
                        break;
                    }
                    mVar10 = mVar6.f10061b;
                }
                mVar3 = mVar2;
            }
            c(mVar3, false);
            m mVar11 = mVar.f10061b;
            if (mVar11 != null) {
                i10 = mVar11.f10065r;
                mVar3.f10061b = mVar11;
                mVar11.f10060a = mVar3;
                mVar.f10061b = null;
            } else {
                i10 = 0;
            }
            m mVar12 = mVar.f10062c;
            if (mVar12 != null) {
                i11 = mVar12.f10065r;
                mVar3.f10062c = mVar12;
                mVar12.f10060a = mVar3;
                mVar.f10062c = null;
            }
            mVar3.f10065r = Math.max(i10, i11) + 1;
            d(mVar, mVar3);
            return;
        }
        if (mVar5 != null) {
            d(mVar, mVar5);
            mVar.f10061b = null;
        } else if (mVar6 != null) {
            d(mVar, mVar6);
            mVar.f10062c = null;
        } else {
            d(mVar, null);
        }
        b(mVar7, false);
        this.d--;
        this.e++;
    }

    @Override
    public final void clear() {
        this.f10069c = null;
        this.d = 0;
        this.e++;
        m mVar = this.f10070f;
        mVar.e = mVar;
        mVar.d = mVar;
    }

    @Override
    public final boolean containsKey(Object obj) {
        m mVar = null;
        if (obj != null) {
            try {
                mVar = a(obj, false);
            } catch (ClassCastException unused) {
            }
        }
        if (mVar == null) {
            return false;
        }
        return true;
    }

    public final void d(m mVar, m mVar2) {
        m mVar3 = mVar.f10060a;
        mVar.f10060a = null;
        if (mVar2 != null) {
            mVar2.f10060a = mVar3;
        }
        if (mVar3 != null) {
            if (mVar3.f10061b == mVar) {
                mVar3.f10061b = mVar2;
                return;
            } else {
                mVar3.f10062c = mVar2;
                return;
            }
        }
        this.f10069c = mVar2;
    }

    public final void e(m mVar) {
        int i10;
        int i11;
        m mVar2 = mVar.f10061b;
        m mVar3 = mVar.f10062c;
        m mVar4 = mVar3.f10061b;
        m mVar5 = mVar3.f10062c;
        mVar.f10062c = mVar4;
        if (mVar4 != null) {
            mVar4.f10060a = mVar;
        }
        d(mVar, mVar3);
        mVar3.f10061b = mVar;
        mVar.f10060a = mVar3;
        int i12 = 0;
        if (mVar2 != null) {
            i10 = mVar2.f10065r;
        } else {
            i10 = 0;
        }
        if (mVar4 != null) {
            i11 = mVar4.f10065r;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        mVar.f10065r = max;
        if (mVar5 != null) {
            i12 = mVar5.f10065r;
        }
        mVar3.f10065r = Math.max(max, i12) + 1;
    }

    @Override
    public final Set entrySet() {
        l lVar = this.h;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this, 0);
        this.h = lVar2;
        return lVar2;
    }

    public final void f(m mVar) {
        int i10;
        int i11;
        m mVar2 = mVar.f10061b;
        m mVar3 = mVar.f10062c;
        m mVar4 = mVar2.f10061b;
        m mVar5 = mVar2.f10062c;
        mVar.f10061b = mVar5;
        if (mVar5 != null) {
            mVar5.f10060a = mVar;
        }
        d(mVar, mVar2);
        mVar2.f10062c = mVar;
        mVar.f10060a = mVar2;
        int i12 = 0;
        if (mVar3 != null) {
            i10 = mVar3.f10065r;
        } else {
            i10 = 0;
        }
        if (mVar5 != null) {
            i11 = mVar5.f10065r;
        } else {
            i11 = 0;
        }
        int max = Math.max(i10, i11) + 1;
        mVar.f10065r = max;
        if (mVar4 != null) {
            i12 = mVar4.f10065r;
        }
        mVar2.f10065r = Math.max(max, i12) + 1;
    }

    @Override
    public final java.lang.Object get(java.lang.Object r3) {
        throw new UnsupportedOperationException("Method not decompiled: gb.n.get(java.lang.Object):java.lang.Object");
    }

    @Override
    public final Set keySet() {
        l lVar = this.f10071n;
        if (lVar != null) {
            return lVar;
        }
        l lVar2 = new l(this, 1);
        this.f10071n = lVar2;
        return lVar2;
    }

    @Override
    public final Object put(Object obj, Object obj2) {
        if (obj != null) {
            if (obj2 == null && !this.f10068b) {
                throw new NullPointerException("value == null");
            }
            m a2 = a(obj, true);
            Object obj3 = a2.f10064n;
            a2.f10064n = obj2;
            return obj3;
        }
        throw new NullPointerException("key == null");
    }

    @Override
    public final java.lang.Object remove(java.lang.Object r3) {
        throw new UnsupportedOperationException("Method not decompiled: gb.n.remove(java.lang.Object):java.lang.Object");
    }

    @Override
    public final int size() {
        return this.d;
    }
}
