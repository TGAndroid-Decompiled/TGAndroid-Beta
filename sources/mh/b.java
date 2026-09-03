package mh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.w6;
import org.telegram.ui.x6;
public final class b {
    public final boolean f14162a;
    public long f14169k;
    public boolean f14171m;
    public boolean f14172n;
    public boolean f14173o;
    public boolean f14174p;
    public boolean f14175q;
    public long f14176r;
    public long f14177s;
    public long f14178t;
    public long f14179u;
    public long v;
    public ArrayList f14163b = new ArrayList();
    public final LongSparseArray f14164c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f14165f = new ArrayList();
    public final ArrayList f14166g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f14167i = new HashSet();
    public final HashSet f14168j = new HashSet();
    public final HashSet f14170l = new HashSet();

    public b(boolean z4) {
        this.f14162a = z4;
    }

    public final void a(int i10, boolean z4) {
        if (this.f14162a) {
            if (!z4) {
                if (i10 == 0) {
                    this.f14171m = false;
                    return;
                } else if (i10 == 1) {
                    this.f14172n = false;
                    return;
                } else if (i10 == 2) {
                    this.f14173o = false;
                    return;
                } else if (i10 == 3) {
                    this.f14174p = false;
                    return;
                } else if (i10 == 4) {
                    this.f14175q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f14171m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f14172n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f14173o = b(i10, this.e);
            } else if (i10 == 3) {
                this.f14174p = b(i10, this.f14165f);
            } else if (i10 == 4) {
                this.f14175q = b(i10, this.f14166g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f14168j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f14162a) {
            HashSet hashSet = this.f14167i;
            hashSet.clear();
            HashSet hashSet2 = this.f14168j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j10 = ((a) it.next()).f14158b;
                if (j10 != 0) {
                    hashSet.add(Long.valueOf(j10));
                }
            }
            HashSet hashSet3 = this.f14170l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                w6 w6Var = (w6) this.f14164c.get(((Long) it2.next()).longValue());
                if (w6Var != null) {
                    SparseArray sparseArray = w6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((x6) sparseArray.valueAt(i10)).f39847b;
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
                            hashSet3.add(Long.valueOf(w6Var.f39277a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f14169k = 0L;
        this.f14168j.clear();
        this.f14170l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.e;
        }
        if (i10 == 3) {
            return this.f14165f;
        }
        if (i10 == 4) {
            return this.f14166g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f14176r;
        }
        if (i10 == 1) {
            return this.f14177s;
        }
        if (i10 == 2) {
            return this.f14178t;
        }
        if (i10 == 3) {
            return this.f14179u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z4) {
        long j10 = aVar.f14159c;
        if (!z4) {
            j10 = -j10;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f14176r += j10;
        } else if (i10 == 1) {
            this.f14177s += j10;
        } else if (i10 == 2) {
            this.f14178t += j10;
        } else if (i10 == 3) {
            this.f14179u += j10;
        } else if (i10 == 4) {
            this.v += j10;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f14165f.isEmpty()) {
            if (this.f14162a || this.f14163b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f14168j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f14169k -= aVar.f14159c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f14169k += aVar.f14159c;
            a(aVar.d, true);
        }
        c();
    }
}
