package ei;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.s6;
import org.telegram.ui.t6;
public final class c {
    public final boolean f10962a;
    public long f10970k;
    public boolean f10972m;
    public boolean f10973n;
    public boolean f10974o;
    public boolean f10975p;
    public boolean f10976q;
    public long f10977r;
    public long f10978s;
    public long f10979t;
    public long f10980u;
    public long v;
    public ArrayList f10963b = new ArrayList();
    public final LongSparseArray f10964c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f10965e = new ArrayList();
    public final ArrayList f10966f = new ArrayList();
    public final ArrayList f10967g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f10968i = new HashSet();
    public final HashSet f10969j = new HashSet();
    public final HashSet f10971l = new HashSet();

    public c(boolean z10) {
        this.f10962a = z10;
    }

    public final void a(int i7, boolean z10) {
        if (this.f10962a) {
            if (!z10) {
                if (i7 == 0) {
                    this.f10972m = false;
                    return;
                } else if (i7 == 1) {
                    this.f10973n = false;
                    return;
                } else if (i7 == 2) {
                    this.f10974o = false;
                    return;
                } else if (i7 == 3) {
                    this.f10975p = false;
                    return;
                } else if (i7 == 4) {
                    this.f10976q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i7 == 0) {
                this.f10972m = b(i7, arrayList);
            } else if (i7 == 1) {
                this.f10973n = b(i7, arrayList);
            } else if (i7 == 2) {
                this.f10974o = b(i7, this.f10965e);
            } else if (i7 == 3) {
                this.f10975p = b(i7, this.f10966f);
            } else if (i7 == 4) {
                this.f10976q = b(i7, this.f10967g);
            } else if (i7 == 7) {
                b(i7, this.h);
            }
        }
    }

    public final boolean b(int i7, ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((b) arrayList.get(i10)).d == i7 && !this.f10969j.contains(arrayList.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f10962a) {
            HashSet hashSet = this.f10968i;
            hashSet.clear();
            HashSet hashSet2 = this.f10969j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((b) it.next()).f10957b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f10971l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                s6 s6Var = (s6) this.f10964c.get(((Long) it2.next()).longValue());
                if (s6Var != null) {
                    SparseArray sparseArray = s6Var.d;
                    int i7 = 0;
                    while (true) {
                        if (i7 < sparseArray.size()) {
                            ArrayList arrayList = ((t6) sparseArray.valueAt(i7)).f52264b;
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
                            hashSet3.add(Long.valueOf(s6Var.f51980a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f10970k = 0L;
        this.f10969j.clear();
        this.f10971l.clear();
    }

    public final ArrayList e(int i7) {
        if (i7 == 0 || i7 == 1) {
            return this.d;
        }
        if (i7 == 2) {
            return this.f10965e;
        }
        if (i7 == 3) {
            return this.f10966f;
        }
        if (i7 == 4) {
            return this.f10967g;
        }
        if (i7 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i7) {
        if (i7 == 0) {
            return this.f10977r;
        }
        if (i7 == 1) {
            return this.f10978s;
        }
        if (i7 == 2) {
            return this.f10979t;
        }
        if (i7 == 3) {
            return this.f10980u;
        }
        if (i7 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(b bVar, boolean z10) {
        long j3 = bVar.f10958c;
        if (!z10) {
            j3 = -j3;
        }
        int i7 = bVar.d;
        if (i7 == 0) {
            this.f10977r += j3;
        } else if (i7 == 1) {
            this.f10978s += j3;
        } else if (i7 == 2) {
            this.f10979t += j3;
        } else if (i7 == 3) {
            this.f10980u += j3;
        } else if (i7 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f10965e.isEmpty() && this.f10966f.isEmpty()) {
            if (this.f10962a || this.f10963b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(b bVar) {
        HashSet hashSet = this.f10969j;
        if (hashSet.contains(bVar)) {
            hashSet.remove(bVar);
            g(bVar, false);
            this.f10970k -= bVar.f10958c;
            a(bVar.d, false);
        } else {
            hashSet.add(bVar);
            g(bVar, true);
            this.f10970k += bVar.f10958c;
            a(bVar.d, true);
        }
        c();
    }
}
