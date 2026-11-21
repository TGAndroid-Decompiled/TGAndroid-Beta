package ei;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.r6;
import org.telegram.ui.s6;
public final class c {
    public final boolean f10998a;
    public long f11006k;
    public boolean f11008m;
    public boolean f11009n;
    public boolean f11010o;
    public boolean f11011p;
    public boolean f11012q;
    public long f11013r;
    public long f11014s;
    public long f11015t;
    public long f11016u;
    public long v;
    public ArrayList f10999b = new ArrayList();
    public final LongSparseArray f11000c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f11001e = new ArrayList();
    public final ArrayList f11002f = new ArrayList();
    public final ArrayList f11003g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f11004i = new HashSet();
    public final HashSet f11005j = new HashSet();
    public final HashSet f11007l = new HashSet();

    public c(boolean z10) {
        this.f10998a = z10;
    }

    public final void a(int i7, boolean z10) {
        if (this.f10998a) {
            if (!z10) {
                if (i7 == 0) {
                    this.f11008m = false;
                    return;
                } else if (i7 == 1) {
                    this.f11009n = false;
                    return;
                } else if (i7 == 2) {
                    this.f11010o = false;
                    return;
                } else if (i7 == 3) {
                    this.f11011p = false;
                    return;
                } else if (i7 == 4) {
                    this.f11012q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i7 == 0) {
                this.f11008m = b(i7, arrayList);
            } else if (i7 == 1) {
                this.f11009n = b(i7, arrayList);
            } else if (i7 == 2) {
                this.f11010o = b(i7, this.f11001e);
            } else if (i7 == 3) {
                this.f11011p = b(i7, this.f11002f);
            } else if (i7 == 4) {
                this.f11012q = b(i7, this.f11003g);
            } else if (i7 == 7) {
                b(i7, this.h);
            }
        }
    }

    public final boolean b(int i7, ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((b) arrayList.get(i10)).d == i7 && !this.f11005j.contains(arrayList.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f10998a) {
            HashSet hashSet = this.f11004i;
            hashSet.clear();
            HashSet hashSet2 = this.f11005j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((b) it.next()).f10993b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f11007l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                r6 r6Var = (r6) this.f11000c.get(((Long) it2.next()).longValue());
                if (r6Var != null) {
                    SparseArray sparseArray = r6Var.d;
                    int i7 = 0;
                    while (true) {
                        if (i7 < sparseArray.size()) {
                            ArrayList arrayList = ((s6) sparseArray.valueAt(i7)).f51943b;
                            int size = arrayList.size();
                            int i10 = 0;
                            while (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                if (!hashSet2.contains((b) obj)) {
                                    break;
                                }
                            }
                            i7++;
                        } else {
                            hashSet3.add(Long.valueOf(r6Var.f51460a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f11006k = 0L;
        this.f11005j.clear();
        this.f11007l.clear();
    }

    public final ArrayList e(int i7) {
        if (i7 == 0 || i7 == 1) {
            return this.d;
        }
        if (i7 == 2) {
            return this.f11001e;
        }
        if (i7 == 3) {
            return this.f11002f;
        }
        if (i7 == 4) {
            return this.f11003g;
        }
        if (i7 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i7) {
        if (i7 == 0) {
            return this.f11013r;
        }
        if (i7 == 1) {
            return this.f11014s;
        }
        if (i7 == 2) {
            return this.f11015t;
        }
        if (i7 == 3) {
            return this.f11016u;
        }
        if (i7 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(b bVar, boolean z10) {
        long j3 = bVar.f10994c;
        if (!z10) {
            j3 = -j3;
        }
        int i7 = bVar.d;
        if (i7 == 0) {
            this.f11013r += j3;
        } else if (i7 == 1) {
            this.f11014s += j3;
        } else if (i7 == 2) {
            this.f11015t += j3;
        } else if (i7 == 3) {
            this.f11016u += j3;
        } else if (i7 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f11001e.isEmpty() && this.f11002f.isEmpty()) {
            if (this.f10998a || this.f10999b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(b bVar) {
        HashSet hashSet = this.f11005j;
        if (hashSet.contains(bVar)) {
            hashSet.remove(bVar);
            g(bVar, false);
            this.f11006k -= bVar.f10994c;
            a(bVar.d, false);
        } else {
            hashSet.add(bVar);
            g(bVar, true);
            this.f11006k += bVar.f10994c;
            a(bVar.d, true);
        }
        c();
    }
}
