package nh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.u6;
import org.telegram.ui.v6;
public final class b {
    public final boolean f16249a;
    public long f16257k;
    public boolean f16259m;
    public boolean f16260n;
    public boolean f16261o;
    public boolean f16262p;
    public boolean f16263q;
    public long f16264r;
    public long f16265s;
    public long f16266t;
    public long f16267u;
    public long v;
    public ArrayList f16250b = new ArrayList();
    public final LongSparseArray f16251c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f16252e = new ArrayList();
    public final ArrayList f16253f = new ArrayList();
    public final ArrayList f16254g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f16255i = new HashSet();
    public final HashSet f16256j = new HashSet();
    public final HashSet f16258l = new HashSet();

    public b(boolean z4) {
        this.f16249a = z4;
    }

    public final void a(int i10, boolean z4) {
        if (this.f16249a) {
            if (!z4) {
                if (i10 == 0) {
                    this.f16259m = false;
                    return;
                } else if (i10 == 1) {
                    this.f16260n = false;
                    return;
                } else if (i10 == 2) {
                    this.f16261o = false;
                    return;
                } else if (i10 == 3) {
                    this.f16262p = false;
                    return;
                } else if (i10 == 4) {
                    this.f16263q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f16259m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f16260n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f16261o = b(i10, this.f16252e);
            } else if (i10 == 3) {
                this.f16262p = b(i10, this.f16253f);
            } else if (i10 == 4) {
                this.f16263q = b(i10, this.f16254g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f16256j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f16249a) {
            HashSet hashSet = this.f16255i;
            hashSet.clear();
            HashSet hashSet2 = this.f16256j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j10 = ((a) it.next()).f16244b;
                if (j10 != 0) {
                    hashSet.add(Long.valueOf(j10));
                }
            }
            HashSet hashSet3 = this.f16258l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                u6 u6Var = (u6) this.f16251c.get(((Long) it2.next()).longValue());
                if (u6Var != null) {
                    SparseArray sparseArray = u6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((v6) sparseArray.valueAt(i10)).f42134b;
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
                            hashSet3.add(Long.valueOf(u6Var.f41797a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f16257k = 0L;
        this.f16256j.clear();
        this.f16258l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.f16252e;
        }
        if (i10 == 3) {
            return this.f16253f;
        }
        if (i10 == 4) {
            return this.f16254g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f16264r;
        }
        if (i10 == 1) {
            return this.f16265s;
        }
        if (i10 == 2) {
            return this.f16266t;
        }
        if (i10 == 3) {
            return this.f16267u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z4) {
        long j10 = aVar.f16245c;
        if (!z4) {
            j10 = -j10;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f16264r += j10;
        } else if (i10 == 1) {
            this.f16265s += j10;
        } else if (i10 == 2) {
            this.f16266t += j10;
        } else if (i10 == 3) {
            this.f16267u += j10;
        } else if (i10 == 4) {
            this.v += j10;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f16252e.isEmpty() && this.f16253f.isEmpty()) {
            if (this.f16249a || this.f16250b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f16256j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f16257k -= aVar.f16245c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f16257k += aVar.f16245c;
            a(aVar.d, true);
        }
        c();
    }
}
