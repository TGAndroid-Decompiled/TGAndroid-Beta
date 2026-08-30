package mh;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.u6;
import org.telegram.ui.v6;
public final class b {
    public final boolean f14174a;
    public long f14181k;
    public boolean f14183m;
    public boolean f14184n;
    public boolean f14185o;
    public boolean f14186p;
    public boolean f14187q;
    public long f14188r;
    public long f14189s;
    public long f14190t;
    public long f14191u;
    public long v;
    public ArrayList f14175b = new ArrayList();
    public final LongSparseArray f14176c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f14177f = new ArrayList();
    public final ArrayList f14178g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f14179i = new HashSet();
    public final HashSet f14180j = new HashSet();
    public final HashSet f14182l = new HashSet();

    public b(boolean z4) {
        this.f14174a = z4;
    }

    public final void a(int i10, boolean z4) {
        if (this.f14174a) {
            if (!z4) {
                if (i10 == 0) {
                    this.f14183m = false;
                    return;
                } else if (i10 == 1) {
                    this.f14184n = false;
                    return;
                } else if (i10 == 2) {
                    this.f14185o = false;
                    return;
                } else if (i10 == 3) {
                    this.f14186p = false;
                    return;
                } else if (i10 == 4) {
                    this.f14187q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f14183m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f14184n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f14185o = b(i10, this.e);
            } else if (i10 == 3) {
                this.f14186p = b(i10, this.f14177f);
            } else if (i10 == 4) {
                this.f14187q = b(i10, this.f14178g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f14180j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f14174a) {
            HashSet hashSet = this.f14179i;
            hashSet.clear();
            HashSet hashSet2 = this.f14180j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j10 = ((a) it.next()).f14170b;
                if (j10 != 0) {
                    hashSet.add(Long.valueOf(j10));
                }
            }
            HashSet hashSet3 = this.f14182l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                u6 u6Var = (u6) this.f14176c.get(((Long) it2.next()).longValue());
                if (u6Var != null) {
                    SparseArray sparseArray = u6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((v6) sparseArray.valueAt(i10)).f39086b;
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
                            hashSet3.add(Long.valueOf(u6Var.f38849a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f14181k = 0L;
        this.f14180j.clear();
        this.f14182l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.e;
        }
        if (i10 == 3) {
            return this.f14177f;
        }
        if (i10 == 4) {
            return this.f14178g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f14188r;
        }
        if (i10 == 1) {
            return this.f14189s;
        }
        if (i10 == 2) {
            return this.f14190t;
        }
        if (i10 == 3) {
            return this.f14191u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z4) {
        long j10 = aVar.f14171c;
        if (!z4) {
            j10 = -j10;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f14188r += j10;
        } else if (i10 == 1) {
            this.f14189s += j10;
        } else if (i10 == 2) {
            this.f14190t += j10;
        } else if (i10 == 3) {
            this.f14191u += j10;
        } else if (i10 == 4) {
            this.v += j10;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f14177f.isEmpty()) {
            if (this.f14174a || this.f14175b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f14180j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f14181k -= aVar.f14171c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f14181k += aVar.f14171c;
            a(aVar.d, true);
        }
        c();
    }
}
