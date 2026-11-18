package ei;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.r6;
import org.telegram.ui.s6;
public final class c {
    public final boolean f10969a;
    public long f10977k;
    public boolean f10979m;
    public boolean f10980n;
    public boolean f10981o;
    public boolean f10982p;
    public boolean f10983q;
    public long f10984r;
    public long f10985s;
    public long f10986t;
    public long f10987u;
    public long v;
    public ArrayList f10970b = new ArrayList();
    public final LongSparseArray f10971c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f10972e = new ArrayList();
    public final ArrayList f10973f = new ArrayList();
    public final ArrayList f10974g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f10975i = new HashSet();
    public final HashSet f10976j = new HashSet();
    public final HashSet f10978l = new HashSet();

    public c(boolean z10) {
        this.f10969a = z10;
    }

    public final void a(int i7, boolean z10) {
        if (this.f10969a) {
            if (!z10) {
                if (i7 == 0) {
                    this.f10979m = false;
                    return;
                } else if (i7 == 1) {
                    this.f10980n = false;
                    return;
                } else if (i7 == 2) {
                    this.f10981o = false;
                    return;
                } else if (i7 == 3) {
                    this.f10982p = false;
                    return;
                } else if (i7 == 4) {
                    this.f10983q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i7 == 0) {
                this.f10979m = b(i7, arrayList);
            } else if (i7 == 1) {
                this.f10980n = b(i7, arrayList);
            } else if (i7 == 2) {
                this.f10981o = b(i7, this.f10972e);
            } else if (i7 == 3) {
                this.f10982p = b(i7, this.f10973f);
            } else if (i7 == 4) {
                this.f10983q = b(i7, this.f10974g);
            } else if (i7 == 7) {
                b(i7, this.h);
            }
        }
    }

    public final boolean b(int i7, ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((b) arrayList.get(i10)).d == i7 && !this.f10976j.contains(arrayList.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f10969a) {
            HashSet hashSet = this.f10975i;
            hashSet.clear();
            HashSet hashSet2 = this.f10976j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((b) it.next()).f10964b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f10978l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                r6 r6Var = (r6) this.f10971c.get(((Long) it2.next()).longValue());
                if (r6Var != null) {
                    SparseArray sparseArray = r6Var.d;
                    int i7 = 0;
                    while (true) {
                        if (i7 < sparseArray.size()) {
                            ArrayList arrayList = ((s6) sparseArray.valueAt(i7)).f51903b;
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
                            hashSet3.add(Long.valueOf(r6Var.f51471a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f10977k = 0L;
        this.f10976j.clear();
        this.f10978l.clear();
    }

    public final ArrayList e(int i7) {
        if (i7 == 0 || i7 == 1) {
            return this.d;
        }
        if (i7 == 2) {
            return this.f10972e;
        }
        if (i7 == 3) {
            return this.f10973f;
        }
        if (i7 == 4) {
            return this.f10974g;
        }
        if (i7 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i7) {
        if (i7 == 0) {
            return this.f10984r;
        }
        if (i7 == 1) {
            return this.f10985s;
        }
        if (i7 == 2) {
            return this.f10986t;
        }
        if (i7 == 3) {
            return this.f10987u;
        }
        if (i7 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(b bVar, boolean z10) {
        long j3 = bVar.f10965c;
        if (!z10) {
            j3 = -j3;
        }
        int i7 = bVar.d;
        if (i7 == 0) {
            this.f10984r += j3;
        } else if (i7 == 1) {
            this.f10985s += j3;
        } else if (i7 == 2) {
            this.f10986t += j3;
        } else if (i7 == 3) {
            this.f10987u += j3;
        } else if (i7 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f10972e.isEmpty() && this.f10973f.isEmpty()) {
            if (this.f10969a || this.f10970b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(b bVar) {
        HashSet hashSet = this.f10976j;
        if (hashSet.contains(bVar)) {
            hashSet.remove(bVar);
            g(bVar, false);
            this.f10977k -= bVar.f10965c;
            a(bVar.d, false);
        } else {
            hashSet.add(bVar);
            g(bVar, true);
            this.f10977k += bVar.f10965c;
            a(bVar.d, true);
        }
        c();
    }
}
