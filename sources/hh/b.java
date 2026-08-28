package hh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.r6;
import org.telegram.ui.s6;
public final class b {
    public final boolean f10786a;
    public long f10794k;
    public boolean f10796m;
    public boolean f10797n;
    public boolean f10798o;
    public boolean f10799p;
    public boolean f10800q;
    public long f10801r;
    public long f10802s;
    public long f10803t;
    public long f10804u;
    public long v;
    public ArrayList f10787b = new ArrayList();
    public final LongSparseArray f10788c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f10789e = new ArrayList();
    public final ArrayList f10790f = new ArrayList();
    public final ArrayList f10791g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f10792i = new HashSet();
    public final HashSet f10793j = new HashSet();
    public final HashSet f10795l = new HashSet();

    public b(boolean z10) {
        this.f10786a = z10;
    }

    public final void a(int i9, boolean z10) {
        if (this.f10786a) {
            if (!z10) {
                if (i9 == 0) {
                    this.f10796m = false;
                    return;
                } else if (i9 == 1) {
                    this.f10797n = false;
                    return;
                } else if (i9 == 2) {
                    this.f10798o = false;
                    return;
                } else if (i9 == 3) {
                    this.f10799p = false;
                    return;
                } else if (i9 == 4) {
                    this.f10800q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i9 == 0) {
                this.f10796m = b(i9, arrayList);
            } else if (i9 == 1) {
                this.f10797n = b(i9, arrayList);
            } else if (i9 == 2) {
                this.f10798o = b(i9, this.f10789e);
            } else if (i9 == 3) {
                this.f10799p = b(i9, this.f10790f);
            } else if (i9 == 4) {
                this.f10800q = b(i9, this.f10791g);
            } else if (i9 == 7) {
                b(i9, this.h);
            }
        }
    }

    public final boolean b(int i9, ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((a) arrayList.get(i10)).d == i9 && !this.f10793j.contains(arrayList.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f10786a) {
            HashSet hashSet = this.f10792i;
            hashSet.clear();
            HashSet hashSet2 = this.f10793j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j10 = ((a) it.next()).f10781b;
                if (j10 != 0) {
                    hashSet.add(Long.valueOf(j10));
                }
            }
            HashSet hashSet3 = this.f10795l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                r6 r6Var = (r6) this.f10788c.get(((Long) it2.next()).longValue());
                if (r6Var != null) {
                    SparseArray sparseArray = r6Var.d;
                    int i9 = 0;
                    while (true) {
                        if (i9 < sparseArray.size()) {
                            ArrayList arrayList = ((s6) sparseArray.valueAt(i9)).f42567b;
                            int size = arrayList.size();
                            int i10 = 0;
                            while (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                if (!hashSet2.contains((a) obj)) {
                                    break;
                                }
                            }
                            i9++;
                        } else {
                            hashSet3.add(Long.valueOf(r6Var.f42274a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f10794k = 0L;
        this.f10793j.clear();
        this.f10795l.clear();
    }

    public final ArrayList e(int i9) {
        if (i9 == 0 || i9 == 1) {
            return this.d;
        }
        if (i9 == 2) {
            return this.f10789e;
        }
        if (i9 == 3) {
            return this.f10790f;
        }
        if (i9 == 4) {
            return this.f10791g;
        }
        if (i9 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i9) {
        if (i9 == 0) {
            return this.f10801r;
        }
        if (i9 == 1) {
            return this.f10802s;
        }
        if (i9 == 2) {
            return this.f10803t;
        }
        if (i9 == 3) {
            return this.f10804u;
        }
        if (i9 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j10 = aVar.f10782c;
        if (!z10) {
            j10 = -j10;
        }
        int i9 = aVar.d;
        if (i9 == 0) {
            this.f10801r += j10;
        } else if (i9 == 1) {
            this.f10802s += j10;
        } else if (i9 == 2) {
            this.f10803t += j10;
        } else if (i9 == 3) {
            this.f10804u += j10;
        } else if (i9 == 4) {
            this.v += j10;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f10789e.isEmpty() && this.f10790f.isEmpty()) {
            if (this.f10786a || this.f10787b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f10793j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f10794k -= aVar.f10782c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f10794k += aVar.f10782c;
            a(aVar.d, true);
        }
        c();
    }
}
