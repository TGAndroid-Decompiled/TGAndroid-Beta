package nh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.u6;
import org.telegram.ui.v6;
public final class b {
    public final boolean f16251a;
    public long f16259k;
    public boolean f16261m;
    public boolean f16262n;
    public boolean f16263o;
    public boolean f16264p;
    public boolean f16265q;
    public long f16266r;
    public long f16267s;
    public long f16268t;
    public long f16269u;
    public long v;
    public ArrayList f16252b = new ArrayList();
    public final LongSparseArray f16253c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f16254e = new ArrayList();
    public final ArrayList f16255f = new ArrayList();
    public final ArrayList f16256g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f16257i = new HashSet();
    public final HashSet f16258j = new HashSet();
    public final HashSet f16260l = new HashSet();

    public b(boolean z4) {
        this.f16251a = z4;
    }

    public final void a(int i10, boolean z4) {
        if (this.f16251a) {
            if (!z4) {
                if (i10 == 0) {
                    this.f16261m = false;
                    return;
                } else if (i10 == 1) {
                    this.f16262n = false;
                    return;
                } else if (i10 == 2) {
                    this.f16263o = false;
                    return;
                } else if (i10 == 3) {
                    this.f16264p = false;
                    return;
                } else if (i10 == 4) {
                    this.f16265q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f16261m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f16262n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f16263o = b(i10, this.f16254e);
            } else if (i10 == 3) {
                this.f16264p = b(i10, this.f16255f);
            } else if (i10 == 4) {
                this.f16265q = b(i10, this.f16256g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f16258j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f16251a) {
            HashSet hashSet = this.f16257i;
            hashSet.clear();
            HashSet hashSet2 = this.f16258j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j10 = ((a) it.next()).f16246b;
                if (j10 != 0) {
                    hashSet.add(Long.valueOf(j10));
                }
            }
            HashSet hashSet3 = this.f16260l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                u6 u6Var = (u6) this.f16253c.get(((Long) it2.next()).longValue());
                if (u6Var != null) {
                    SparseArray sparseArray = u6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((v6) sparseArray.valueAt(i10)).f42015b;
                            int size = arrayList.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj = arrayList.get(i11);
                                i11++;
                                if (!hashSet2.contains((a) obj)) {
                                    break;
                                }
                            }
                            i10++;
                        } else {
                            hashSet3.add(Long.valueOf(u6Var.f41727a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f16259k = 0L;
        this.f16258j.clear();
        this.f16260l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.f16254e;
        }
        if (i10 == 3) {
            return this.f16255f;
        }
        if (i10 == 4) {
            return this.f16256g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f16266r;
        }
        if (i10 == 1) {
            return this.f16267s;
        }
        if (i10 == 2) {
            return this.f16268t;
        }
        if (i10 == 3) {
            return this.f16269u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z4) {
        long j10 = aVar.f16247c;
        if (!z4) {
            j10 = -j10;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f16266r += j10;
        } else if (i10 == 1) {
            this.f16267s += j10;
        } else if (i10 == 2) {
            this.f16268t += j10;
        } else if (i10 == 3) {
            this.f16269u += j10;
        } else if (i10 == 4) {
            this.v += j10;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f16254e.isEmpty() && this.f16255f.isEmpty()) {
            if (this.f16251a || this.f16252b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f16258j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f16259k -= aVar.f16247c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f16259k += aVar.f16247c;
            a(aVar.d, true);
        }
        c();
    }
}
