package kh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.q6;
import org.telegram.ui.r6;
public final class b {
    public final boolean f13895a;
    public long f13903k;
    public boolean f13905m;
    public boolean f13906n;
    public boolean f13907o;
    public boolean f13908p;
    public boolean f13909q;
    public long f13910r;
    public long f13911s;
    public long f13912t;
    public long f13913u;
    public long v;
    public ArrayList f13896b = new ArrayList();
    public final LongSparseArray f13897c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f13898e = new ArrayList();
    public final ArrayList f13899f = new ArrayList();
    public final ArrayList f13900g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f13901i = new HashSet();
    public final HashSet f13902j = new HashSet();
    public final HashSet f13904l = new HashSet();

    public b(boolean z10) {
        this.f13895a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f13895a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f13905m = false;
                    return;
                } else if (i10 == 1) {
                    this.f13906n = false;
                    return;
                } else if (i10 == 2) {
                    this.f13907o = false;
                    return;
                } else if (i10 == 3) {
                    this.f13908p = false;
                    return;
                } else if (i10 == 4) {
                    this.f13909q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f13905m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f13906n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f13907o = b(i10, this.f13898e);
            } else if (i10 == 3) {
                this.f13908p = b(i10, this.f13899f);
            } else if (i10 == 4) {
                this.f13909q = b(i10, this.f13900g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f13902j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f13895a) {
            HashSet hashSet = this.f13901i;
            hashSet.clear();
            HashSet hashSet2 = this.f13902j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j10 = ((a) it.next()).f13890b;
                if (j10 != 0) {
                    hashSet.add(Long.valueOf(j10));
                }
            }
            HashSet hashSet3 = this.f13904l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                q6 q6Var = (q6) this.f13897c.get(((Long) it2.next()).longValue());
                if (q6Var != null) {
                    SparseArray sparseArray = q6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((r6) sparseArray.valueAt(i10)).f41979b;
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
                            hashSet3.add(Long.valueOf(q6Var.f41543a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f13903k = 0L;
        this.f13902j.clear();
        this.f13904l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.f13898e;
        }
        if (i10 == 3) {
            return this.f13899f;
        }
        if (i10 == 4) {
            return this.f13900g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f13910r;
        }
        if (i10 == 1) {
            return this.f13911s;
        }
        if (i10 == 2) {
            return this.f13912t;
        }
        if (i10 == 3) {
            return this.f13913u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j10 = aVar.f13891c;
        if (!z10) {
            j10 = -j10;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f13910r += j10;
        } else if (i10 == 1) {
            this.f13911s += j10;
        } else if (i10 == 2) {
            this.f13912t += j10;
        } else if (i10 == 3) {
            this.f13913u += j10;
        } else if (i10 == 4) {
            this.v += j10;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f13898e.isEmpty() && this.f13899f.isEmpty()) {
            if (this.f13895a || this.f13896b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f13902j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f13903k -= aVar.f13891c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f13903k += aVar.f13891c;
            a(aVar.d, true);
        }
        c();
    }
}
