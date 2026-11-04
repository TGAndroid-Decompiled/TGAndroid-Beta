package di;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.t6;
import org.telegram.ui.u6;
public final class c {
    public final boolean f9186a;
    public long f9194k;
    public boolean f9196m;
    public boolean f9197n;
    public boolean f9198o;
    public boolean f9199p;
    public boolean f9200q;
    public long f9201r;
    public long f9202s;
    public long f9203t;
    public long f9204u;
    public long v;
    public ArrayList f9187b = new ArrayList();
    public final LongSparseArray f9188c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f9189e = new ArrayList();
    public final ArrayList f9190f = new ArrayList();
    public final ArrayList f9191g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f9192i = new HashSet();
    public final HashSet f9193j = new HashSet();
    public final HashSet f9195l = new HashSet();

    public c(boolean z10) {
        this.f9186a = z10;
    }

    public final void a(int i3, boolean z10) {
        if (this.f9186a) {
            if (!z10) {
                if (i3 == 0) {
                    this.f9196m = false;
                    return;
                } else if (i3 == 1) {
                    this.f9197n = false;
                    return;
                } else if (i3 == 2) {
                    this.f9198o = false;
                    return;
                } else if (i3 == 3) {
                    this.f9199p = false;
                    return;
                } else if (i3 == 4) {
                    this.f9200q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i3 == 0) {
                this.f9196m = b(i3, arrayList);
            } else if (i3 == 1) {
                this.f9197n = b(i3, arrayList);
            } else if (i3 == 2) {
                this.f9198o = b(i3, this.f9189e);
            } else if (i3 == 3) {
                this.f9199p = b(i3, this.f9190f);
            } else if (i3 == 4) {
                this.f9200q = b(i3, this.f9191g);
            } else if (i3 == 7) {
                b(i3, this.h);
            }
        }
    }

    public final boolean b(int i3, ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((b) arrayList.get(i10)).d == i3 && !this.f9193j.contains(arrayList.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f9186a) {
            HashSet hashSet = this.f9192i;
            hashSet.clear();
            HashSet hashSet2 = this.f9193j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j10 = ((b) it.next()).f9181b;
                if (j10 != 0) {
                    hashSet.add(Long.valueOf(j10));
                }
            }
            HashSet hashSet3 = this.f9195l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                t6 t6Var = (t6) this.f9188c.get(((Long) it2.next()).longValue());
                if (t6Var != null) {
                    SparseArray sparseArray = t6Var.d;
                    int i3 = 0;
                    while (true) {
                        if (i3 < sparseArray.size()) {
                            ArrayList arrayList = ((u6) sparseArray.valueAt(i3)).f49986b;
                            int size = arrayList.size();
                            int i10 = 0;
                            while (i10 < size) {
                                Object obj = arrayList.get(i10);
                                i10++;
                                if (!hashSet2.contains((b) obj)) {
                                    break;
                                }
                            }
                            i3++;
                        } else {
                            hashSet3.add(Long.valueOf(t6Var.f49713a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f9194k = 0L;
        this.f9193j.clear();
        this.f9195l.clear();
    }

    public final ArrayList e(int i3) {
        if (i3 == 0 || i3 == 1) {
            return this.d;
        }
        if (i3 == 2) {
            return this.f9189e;
        }
        if (i3 == 3) {
            return this.f9190f;
        }
        if (i3 == 4) {
            return this.f9191g;
        }
        if (i3 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i3) {
        if (i3 == 0) {
            return this.f9201r;
        }
        if (i3 == 1) {
            return this.f9202s;
        }
        if (i3 == 2) {
            return this.f9203t;
        }
        if (i3 == 3) {
            return this.f9204u;
        }
        if (i3 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(b bVar, boolean z10) {
        long j10 = bVar.f9182c;
        if (!z10) {
            j10 = -j10;
        }
        int i3 = bVar.d;
        if (i3 == 0) {
            this.f9201r += j10;
        } else if (i3 == 1) {
            this.f9202s += j10;
        } else if (i3 == 2) {
            this.f9203t += j10;
        } else if (i3 == 3) {
            this.f9204u += j10;
        } else if (i3 == 4) {
            this.v += j10;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f9189e.isEmpty() && this.f9190f.isEmpty()) {
            if (this.f9186a || this.f9187b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(b bVar) {
        HashSet hashSet = this.f9193j;
        if (hashSet.contains(bVar)) {
            hashSet.remove(bVar);
            g(bVar, false);
            this.f9194k -= bVar.f9182c;
            a(bVar.d, false);
        } else {
            hashSet.add(bVar);
            g(bVar, true);
            this.f9194k += bVar.f9182c;
            a(bVar.d, true);
        }
        c();
    }
}
