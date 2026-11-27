package defpackage;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
public final class d71 {
    public final boolean a;
    public long k;
    public boolean m;
    public boolean n;
    public boolean o;
    public boolean p;
    public boolean q;
    public long r;
    public long s;
    public long t;
    public long u;
    public long v;
    public ArrayList b = new ArrayList();
    public final LongSparseArray c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f = new ArrayList();
    public final ArrayList g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet i = new HashSet();
    public final HashSet j = new HashSet();
    public final HashSet l = new HashSet();

    public d71(boolean z) {
        this.a = z;
    }

    public final void a(int i, boolean z) {
        if (this.a) {
            if (!z) {
                if (i == 0) {
                    this.m = false;
                    return;
                } else if (i == 1) {
                    this.n = false;
                    return;
                } else if (i == 2) {
                    this.o = false;
                    return;
                } else if (i == 3) {
                    this.p = false;
                    return;
                } else if (i == 4) {
                    this.q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i == 0) {
                this.m = b(i, arrayList);
            } else if (i == 1) {
                this.n = b(i, arrayList);
            } else if (i == 2) {
                this.o = b(i, this.e);
            } else if (i == 3) {
                this.p = b(i, this.f);
            } else if (i == 4) {
                this.q = b(i, this.g);
            } else if (i == 7) {
                b(i, this.h);
            }
        }
    }

    public final boolean b(int i, ArrayList arrayList) {
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (((c71) arrayList.get(i2)).d == i && !this.j.contains(arrayList.get(i2))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.a) {
            HashSet hashSet = this.i;
            hashSet.clear();
            HashSet hashSet2 = this.j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j = ((c71) it.next()).b;
                if (j != 0) {
                    hashSet.add(Long.valueOf(j));
                }
            }
            HashSet hashSet3 = this.l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                t61 t61Var = (t61) this.c.get(((Long) it2.next()).longValue());
                if (t61Var != null) {
                    SparseArray sparseArray = t61Var.d;
                    int i = 0;
                    while (true) {
                        if (i < sparseArray.size()) {
                            ArrayList arrayList = ((u61) sparseArray.valueAt(i)).b;
                            int size = arrayList.size();
                            int i2 = 0;
                            while (i2 < size) {
                                Object obj = arrayList.get(i2);
                                i2++;
                                if (!hashSet2.contains((c71) obj)) {
                                    break;
                                }
                            }
                            i++;
                        } else {
                            hashSet3.add(Long.valueOf(t61Var.a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.k = 0L;
        this.j.clear();
        this.l.clear();
    }

    public final ArrayList e(int i) {
        if (i == 0 || i == 1) {
            return this.d;
        }
        if (i == 2) {
            return this.e;
        }
        if (i == 3) {
            return this.f;
        }
        if (i == 4) {
            return this.g;
        }
        if (i == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i) {
        if (i == 0) {
            return this.r;
        }
        if (i == 1) {
            return this.s;
        }
        if (i == 2) {
            return this.t;
        }
        if (i == 3) {
            return this.u;
        }
        if (i == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(c71 c71Var, boolean z) {
        long j = c71Var.c;
        if (!z) {
            j = -j;
        }
        byte b = c71Var.d;
        if (b == 0) {
            this.r += j;
        } else if (b == 1) {
            this.s += j;
        } else if (b == 2) {
            this.t += j;
        } else if (b == 3) {
            this.u += j;
        } else if (b == 4) {
            this.v += j;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f.isEmpty()) {
            if (this.a || this.b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(c71 c71Var) {
        HashSet hashSet = this.j;
        if (hashSet.contains(c71Var)) {
            hashSet.remove(c71Var);
            g(c71Var, false);
            this.k -= c71Var.c;
            a(c71Var.d, false);
        } else {
            hashSet.add(c71Var);
            g(c71Var, true);
            this.k += c71Var.c;
            a(c71Var.d, true);
        }
        c();
    }
}
