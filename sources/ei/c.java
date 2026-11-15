package ei;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.s6;
import org.telegram.ui.t6;
public final class c {
    public final boolean f10652a;
    public long f10660k;
    public boolean f10662m;
    public boolean f10663n;
    public boolean f10664o;
    public boolean f10665p;
    public boolean f10666q;
    public long f10667r;
    public long f10668s;
    public long f10669t;
    public long f10670u;
    public long v;
    public ArrayList f10653b = new ArrayList();
    public final LongSparseArray f10654c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f10655e = new ArrayList();
    public final ArrayList f10656f = new ArrayList();
    public final ArrayList f10657g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f10658i = new HashSet();
    public final HashSet f10659j = new HashSet();
    public final HashSet f10661l = new HashSet();

    public c(boolean z10) {
        this.f10652a = z10;
    }

    public final void a(int i7, boolean z10) {
        if (this.f10652a) {
            if (!z10) {
                if (i7 == 0) {
                    this.f10662m = false;
                    return;
                } else if (i7 == 1) {
                    this.f10663n = false;
                    return;
                } else if (i7 == 2) {
                    this.f10664o = false;
                    return;
                } else if (i7 == 3) {
                    this.f10665p = false;
                    return;
                } else if (i7 == 4) {
                    this.f10666q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i7 == 0) {
                this.f10662m = b(i7, arrayList);
            } else if (i7 == 1) {
                this.f10663n = b(i7, arrayList);
            } else if (i7 == 2) {
                this.f10664o = b(i7, this.f10655e);
            } else if (i7 == 3) {
                this.f10665p = b(i7, this.f10656f);
            } else if (i7 == 4) {
                this.f10666q = b(i7, this.f10657g);
            } else if (i7 == 7) {
                b(i7, this.h);
            }
        }
    }

    public final boolean b(int i7, ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((b) arrayList.get(i10)).d == i7 && !this.f10659j.contains(arrayList.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f10652a) {
            HashSet hashSet = this.f10658i;
            hashSet.clear();
            HashSet hashSet2 = this.f10659j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((b) it.next()).f10647b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f10661l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                s6 s6Var = (s6) this.f10654c.get(((Long) it2.next()).longValue());
                if (s6Var != null) {
                    SparseArray sparseArray = s6Var.d;
                    int i7 = 0;
                    while (true) {
                        if (i7 < sparseArray.size()) {
                            ArrayList arrayList = ((t6) sparseArray.valueAt(i7)).f51389b;
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
                            hashSet3.add(Long.valueOf(s6Var.f51116a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f10660k = 0L;
        this.f10659j.clear();
        this.f10661l.clear();
    }

    public final ArrayList e(int i7) {
        if (i7 == 0 || i7 == 1) {
            return this.d;
        }
        if (i7 == 2) {
            return this.f10655e;
        }
        if (i7 == 3) {
            return this.f10656f;
        }
        if (i7 == 4) {
            return this.f10657g;
        }
        if (i7 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i7) {
        if (i7 == 0) {
            return this.f10667r;
        }
        if (i7 == 1) {
            return this.f10668s;
        }
        if (i7 == 2) {
            return this.f10669t;
        }
        if (i7 == 3) {
            return this.f10670u;
        }
        if (i7 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(b bVar, boolean z10) {
        long j3 = bVar.f10648c;
        if (!z10) {
            j3 = -j3;
        }
        int i7 = bVar.d;
        if (i7 == 0) {
            this.f10667r += j3;
        } else if (i7 == 1) {
            this.f10668s += j3;
        } else if (i7 == 2) {
            this.f10669t += j3;
        } else if (i7 == 3) {
            this.f10670u += j3;
        } else if (i7 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f10655e.isEmpty() && this.f10656f.isEmpty()) {
            if (this.f10652a || this.f10653b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(b bVar) {
        HashSet hashSet = this.f10659j;
        if (hashSet.contains(bVar)) {
            hashSet.remove(bVar);
            g(bVar, false);
            this.f10660k -= bVar.f10648c;
            a(bVar.d, false);
        } else {
            hashSet.add(bVar);
            g(bVar, true);
            this.f10660k += bVar.f10648c;
            a(bVar.d, true);
        }
        c();
    }
}
