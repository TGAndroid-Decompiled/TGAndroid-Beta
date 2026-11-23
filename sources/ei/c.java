package ei;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.r6;
import org.telegram.ui.s6;
public final class c {
    public final boolean f11001a;
    public long f11009k;
    public boolean f11011m;
    public boolean f11012n;
    public boolean f11013o;
    public boolean f11014p;
    public boolean f11015q;
    public long f11016r;
    public long f11017s;
    public long f11018t;
    public long f11019u;
    public long v;
    public ArrayList f11002b = new ArrayList();
    public final LongSparseArray f11003c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f11004e = new ArrayList();
    public final ArrayList f11005f = new ArrayList();
    public final ArrayList f11006g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f11007i = new HashSet();
    public final HashSet f11008j = new HashSet();
    public final HashSet f11010l = new HashSet();

    public c(boolean z10) {
        this.f11001a = z10;
    }

    public final void a(int i7, boolean z10) {
        if (this.f11001a) {
            if (!z10) {
                if (i7 == 0) {
                    this.f11011m = false;
                    return;
                } else if (i7 == 1) {
                    this.f11012n = false;
                    return;
                } else if (i7 == 2) {
                    this.f11013o = false;
                    return;
                } else if (i7 == 3) {
                    this.f11014p = false;
                    return;
                } else if (i7 == 4) {
                    this.f11015q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i7 == 0) {
                this.f11011m = b(i7, arrayList);
            } else if (i7 == 1) {
                this.f11012n = b(i7, arrayList);
            } else if (i7 == 2) {
                this.f11013o = b(i7, this.f11004e);
            } else if (i7 == 3) {
                this.f11014p = b(i7, this.f11005f);
            } else if (i7 == 4) {
                this.f11015q = b(i7, this.f11006g);
            } else if (i7 == 7) {
                b(i7, this.h);
            }
        }
    }

    public final boolean b(int i7, ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((b) arrayList.get(i10)).d == i7 && !this.f11008j.contains(arrayList.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f11001a) {
            HashSet hashSet = this.f11007i;
            hashSet.clear();
            HashSet hashSet2 = this.f11008j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((b) it.next()).f10996b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f11010l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                r6 r6Var = (r6) this.f11003c.get(((Long) it2.next()).longValue());
                if (r6Var != null) {
                    SparseArray sparseArray = r6Var.d;
                    int i7 = 0;
                    while (true) {
                        if (i7 < sparseArray.size()) {
                            ArrayList arrayList = ((s6) sparseArray.valueAt(i7)).f51947b;
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
                            hashSet3.add(Long.valueOf(r6Var.f51464a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f11009k = 0L;
        this.f11008j.clear();
        this.f11010l.clear();
    }

    public final ArrayList e(int i7) {
        if (i7 == 0 || i7 == 1) {
            return this.d;
        }
        if (i7 == 2) {
            return this.f11004e;
        }
        if (i7 == 3) {
            return this.f11005f;
        }
        if (i7 == 4) {
            return this.f11006g;
        }
        if (i7 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i7) {
        if (i7 == 0) {
            return this.f11016r;
        }
        if (i7 == 1) {
            return this.f11017s;
        }
        if (i7 == 2) {
            return this.f11018t;
        }
        if (i7 == 3) {
            return this.f11019u;
        }
        if (i7 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(b bVar, boolean z10) {
        long j3 = bVar.f10997c;
        if (!z10) {
            j3 = -j3;
        }
        int i7 = bVar.d;
        if (i7 == 0) {
            this.f11016r += j3;
        } else if (i7 == 1) {
            this.f11017s += j3;
        } else if (i7 == 2) {
            this.f11018t += j3;
        } else if (i7 == 3) {
            this.f11019u += j3;
        } else if (i7 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f11004e.isEmpty() && this.f11005f.isEmpty()) {
            if (this.f11001a || this.f11002b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(b bVar) {
        HashSet hashSet = this.f11008j;
        if (hashSet.contains(bVar)) {
            hashSet.remove(bVar);
            g(bVar, false);
            this.f11009k -= bVar.f10997c;
            a(bVar.d, false);
        } else {
            hashSet.add(bVar);
            g(bVar, true);
            this.f11009k += bVar.f10997c;
            a(bVar.d, true);
        }
        c();
    }
}
