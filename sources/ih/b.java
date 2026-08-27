package ih;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.s6;
import org.telegram.ui.t6;

public final class b {

    public final boolean f11482a;

    public long f11490k;

    public boolean f11492m;

    public boolean f11493n;

    public boolean f11494o;

    public boolean f11495p;

    public boolean f11496q;

    public long f11497r;

    public long f11498s;

    public long f11499t;

    public long f11500u;
    public long v;

    public ArrayList f11483b = new ArrayList();

    public final LongSparseArray f11484c = new LongSparseArray();
    public final ArrayList d = new ArrayList();

    public final ArrayList f11485e = new ArrayList();

    public final ArrayList f11486f = new ArrayList();

    public final ArrayList f11487g = new ArrayList();
    public final ArrayList h = new ArrayList();

    public final HashSet f11488i = new HashSet();

    public final HashSet f11489j = new HashSet();

    public final HashSet f11491l = new HashSet();

    public b(boolean z10) {
        this.f11482a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f11482a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f11492m = false;
                    return;
                }
                if (i10 == 1) {
                    this.f11493n = false;
                    return;
                }
                if (i10 == 2) {
                    this.f11494o = false;
                    return;
                } else if (i10 == 3) {
                    this.f11495p = false;
                    return;
                } else {
                    if (i10 == 4) {
                        this.f11496q = false;
                        return;
                    }
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f11492m = b(i10, arrayList);
                return;
            }
            if (i10 == 1) {
                this.f11493n = b(i10, arrayList);
                return;
            }
            if (i10 == 2) {
                this.f11494o = b(i10, this.f11485e);
                return;
            }
            if (i10 == 3) {
                this.f11495p = b(i10, this.f11486f);
            } else if (i10 == 4) {
                this.f11496q = b(i10, this.f11487g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f11489j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (this.f11482a) {
            return;
        }
        HashSet hashSet = this.f11488i;
        hashSet.clear();
        HashSet hashSet2 = this.f11489j;
        Iterator it = hashSet2.iterator();
        while (it.hasNext()) {
            long j10 = ((a) it.next()).f11477b;
            if (j10 != 0) {
                hashSet.add(Long.valueOf(j10));
            }
        }
        HashSet hashSet3 = this.f11491l;
        hashSet3.clear();
        Iterator it2 = hashSet.iterator();
        while (it2.hasNext()) {
            s6 s6Var = (s6) this.f11484c.get(((Long) it2.next()).longValue());
            if (s6Var != null) {
                SparseArray sparseArray = s6Var.d;
                int i10 = 0;
                while (true) {
                    if (i10 >= sparseArray.size()) {
                        hashSet3.add(Long.valueOf(s6Var.f42522a));
                        break;
                    }
                    ArrayList arrayList = ((t6) sparseArray.valueAt(i10)).f42788b;
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
                }
            }
        }
    }

    public final void d() {
        this.f11490k = 0L;
        this.f11489j.clear();
        this.f11491l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.f11485e;
        }
        if (i10 == 3) {
            return this.f11486f;
        }
        if (i10 == 4) {
            return this.f11487g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f11497r;
        }
        if (i10 == 1) {
            return this.f11498s;
        }
        if (i10 == 2) {
            return this.f11499t;
        }
        if (i10 == 3) {
            return this.f11500u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j10 = aVar.f11478c;
        if (!z10) {
            j10 = -j10;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f11497r += j10;
            return;
        }
        if (i10 == 1) {
            this.f11498s += j10;
            return;
        }
        if (i10 == 2) {
            this.f11499t += j10;
        } else if (i10 == 3) {
            this.f11500u += j10;
        } else if (i10 == 4) {
            this.v += j10;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f11485e.isEmpty() && this.f11486f.isEmpty()) {
            return this.f11482a || this.f11483b.isEmpty();
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f11489j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f11490k -= aVar.f11478c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f11490k += aVar.f11478c;
            a(aVar.d, true);
        }
        c();
    }
}
