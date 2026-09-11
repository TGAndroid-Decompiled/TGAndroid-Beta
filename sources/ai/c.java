package ai;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.s6;
import org.telegram.ui.t6;
public final class c {
    public final boolean f744a;
    public long f752k;
    public boolean f754m;
    public boolean f755n;
    public boolean f756o;
    public boolean f757p;
    public boolean f758q;
    public long f759r;
    public long f760s;
    public long f761t;
    public long f762u;
    public long v;
    public ArrayList f745b = new ArrayList();
    public final LongSparseArray f746c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f747e = new ArrayList();
    public final ArrayList f748f = new ArrayList();
    public final ArrayList f749g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f750i = new HashSet();
    public final HashSet f751j = new HashSet();
    public final HashSet f753l = new HashSet();

    public c(boolean z10) {
        this.f744a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f744a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f754m = false;
                    return;
                } else if (i10 == 1) {
                    this.f755n = false;
                    return;
                } else if (i10 == 2) {
                    this.f756o = false;
                    return;
                } else if (i10 == 3) {
                    this.f757p = false;
                    return;
                } else if (i10 == 4) {
                    this.f758q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f754m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f755n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f756o = b(i10, this.f747e);
            } else if (i10 == 3) {
                this.f757p = b(i10, this.f748f);
            } else if (i10 == 4) {
                this.f758q = b(i10, this.f749g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((b) arrayList.get(i11)).d == i10 && !this.f751j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f744a) {
            HashSet hashSet = this.f750i;
            hashSet.clear();
            HashSet hashSet2 = this.f751j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((b) it.next()).f739b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f753l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                s6 s6Var = (s6) this.f746c.get(((Long) it2.next()).longValue());
                if (s6Var != null) {
                    SparseArray sparseArray = s6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((t6) sparseArray.valueAt(i10)).f40633b;
                            int size = arrayList.size();
                            int i11 = 0;
                            while (i11 < size) {
                                Object obj = arrayList.get(i11);
                                i11++;
                                if (!hashSet2.contains((b) obj)) {
                                    break;
                                }
                            }
                            i10++;
                        } else {
                            hashSet3.add(Long.valueOf(s6Var.f40312a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f752k = 0L;
        this.f751j.clear();
        this.f753l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.f747e;
        }
        if (i10 == 3) {
            return this.f748f;
        }
        if (i10 == 4) {
            return this.f749g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f759r;
        }
        if (i10 == 1) {
            return this.f760s;
        }
        if (i10 == 2) {
            return this.f761t;
        }
        if (i10 == 3) {
            return this.f762u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(b bVar, boolean z10) {
        long j3 = bVar.f740c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = bVar.d;
        if (i10 == 0) {
            this.f759r += j3;
        } else if (i10 == 1) {
            this.f760s += j3;
        } else if (i10 == 2) {
            this.f761t += j3;
        } else if (i10 == 3) {
            this.f762u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f747e.isEmpty() && this.f748f.isEmpty()) {
            if (this.f744a || this.f745b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(b bVar) {
        HashSet hashSet = this.f751j;
        if (hashSet.contains(bVar)) {
            hashSet.remove(bVar);
            g(bVar, false);
            this.f752k -= bVar.f740c;
            a(bVar.d, false);
        } else {
            hashSet.add(bVar);
            g(bVar, true);
            this.f752k += bVar.f740c;
            a(bVar.d, true);
        }
        c();
    }
}
