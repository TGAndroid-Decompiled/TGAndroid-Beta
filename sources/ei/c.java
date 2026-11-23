package ei;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.r6;
import org.telegram.ui.s6;
public final class c {
    public final boolean f10964a;
    public long f10972k;
    public boolean f10974m;
    public boolean f10975n;
    public boolean f10976o;
    public boolean f10977p;
    public boolean f10978q;
    public long f10979r;
    public long f10980s;
    public long f10981t;
    public long f10982u;
    public long v;
    public ArrayList f10965b = new ArrayList();
    public final LongSparseArray f10966c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f10967e = new ArrayList();
    public final ArrayList f10968f = new ArrayList();
    public final ArrayList f10969g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f10970i = new HashSet();
    public final HashSet f10971j = new HashSet();
    public final HashSet f10973l = new HashSet();

    public c(boolean z10) {
        this.f10964a = z10;
    }

    public final void a(int i7, boolean z10) {
        if (this.f10964a) {
            if (!z10) {
                if (i7 == 0) {
                    this.f10974m = false;
                    return;
                } else if (i7 == 1) {
                    this.f10975n = false;
                    return;
                } else if (i7 == 2) {
                    this.f10976o = false;
                    return;
                } else if (i7 == 3) {
                    this.f10977p = false;
                    return;
                } else if (i7 == 4) {
                    this.f10978q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i7 == 0) {
                this.f10974m = b(i7, arrayList);
            } else if (i7 == 1) {
                this.f10975n = b(i7, arrayList);
            } else if (i7 == 2) {
                this.f10976o = b(i7, this.f10967e);
            } else if (i7 == 3) {
                this.f10977p = b(i7, this.f10968f);
            } else if (i7 == 4) {
                this.f10978q = b(i7, this.f10969g);
            } else if (i7 == 7) {
                b(i7, this.h);
            }
        }
    }

    public final boolean b(int i7, ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((b) arrayList.get(i10)).d == i7 && !this.f10971j.contains(arrayList.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f10964a) {
            HashSet hashSet = this.f10970i;
            hashSet.clear();
            HashSet hashSet2 = this.f10971j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((b) it.next()).f10959b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f10973l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                r6 r6Var = (r6) this.f10966c.get(((Long) it2.next()).longValue());
                if (r6Var != null) {
                    SparseArray sparseArray = r6Var.d;
                    int i7 = 0;
                    while (true) {
                        if (i7 < sparseArray.size()) {
                            ArrayList arrayList = ((s6) sparseArray.valueAt(i7)).f51916b;
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
                            hashSet3.add(Long.valueOf(r6Var.f51495a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f10972k = 0L;
        this.f10971j.clear();
        this.f10973l.clear();
    }

    public final ArrayList e(int i7) {
        if (i7 == 0 || i7 == 1) {
            return this.d;
        }
        if (i7 == 2) {
            return this.f10967e;
        }
        if (i7 == 3) {
            return this.f10968f;
        }
        if (i7 == 4) {
            return this.f10969g;
        }
        if (i7 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i7) {
        if (i7 == 0) {
            return this.f10979r;
        }
        if (i7 == 1) {
            return this.f10980s;
        }
        if (i7 == 2) {
            return this.f10981t;
        }
        if (i7 == 3) {
            return this.f10982u;
        }
        if (i7 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(b bVar, boolean z10) {
        long j3 = bVar.f10960c;
        if (!z10) {
            j3 = -j3;
        }
        int i7 = bVar.d;
        if (i7 == 0) {
            this.f10979r += j3;
        } else if (i7 == 1) {
            this.f10980s += j3;
        } else if (i7 == 2) {
            this.f10981t += j3;
        } else if (i7 == 3) {
            this.f10982u += j3;
        } else if (i7 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f10967e.isEmpty() && this.f10968f.isEmpty()) {
            if (this.f10964a || this.f10965b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(b bVar) {
        HashSet hashSet = this.f10971j;
        if (hashSet.contains(bVar)) {
            hashSet.remove(bVar);
            g(bVar, false);
            this.f10972k -= bVar.f10960c;
            a(bVar.d, false);
        } else {
            hashSet.add(bVar);
            g(bVar, true);
            this.f10972k += bVar.f10960c;
            a(bVar.d, true);
        }
        c();
    }
}
