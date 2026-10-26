package ci;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.w6;
import org.telegram.ui.x6;
public final class b {
    public final boolean f6369a;
    public long f6376k;
    public boolean f6378m;
    public boolean f6379n;
    public boolean f6380o;
    public boolean f6381p;
    public boolean f6382q;
    public long f6383r;
    public long f6384s;
    public long f6385t;
    public long f6386u;
    public long v;
    public ArrayList f6370b = new ArrayList();
    public final LongSparseArray f6371c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f6372f = new ArrayList();
    public final ArrayList f6373g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f6374i = new HashSet();
    public final HashSet f6375j = new HashSet();
    public final HashSet f6377l = new HashSet();

    public b(boolean z10) {
        this.f6369a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f6369a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f6378m = false;
                    return;
                } else if (i10 == 1) {
                    this.f6379n = false;
                    return;
                } else if (i10 == 2) {
                    this.f6380o = false;
                    return;
                } else if (i10 == 3) {
                    this.f6381p = false;
                    return;
                } else if (i10 == 4) {
                    this.f6382q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f6378m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f6379n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f6380o = b(i10, this.e);
            } else if (i10 == 3) {
                this.f6381p = b(i10, this.f6372f);
            } else if (i10 == 4) {
                this.f6382q = b(i10, this.f6373g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((a) arrayList.get(i11)).d == i10 && !this.f6375j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f6369a) {
            HashSet hashSet = this.f6374i;
            hashSet.clear();
            HashSet hashSet2 = this.f6375j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j10 = ((a) it.next()).f6365b;
                if (j10 != 0) {
                    hashSet.add(Long.valueOf(j10));
                }
            }
            HashSet hashSet3 = this.f6377l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                w6 w6Var = (w6) this.f6371c.get(((Long) it2.next()).longValue());
                if (w6Var != null) {
                    SparseArray sparseArray = w6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((x6) sparseArray.valueAt(i10)).f45664b;
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
                            hashSet3.add(Long.valueOf(w6Var.f44986a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f6376k = 0L;
        this.f6375j.clear();
        this.f6377l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.e;
        }
        if (i10 == 3) {
            return this.f6372f;
        }
        if (i10 == 4) {
            return this.f6373g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f6383r;
        }
        if (i10 == 1) {
            return this.f6384s;
        }
        if (i10 == 2) {
            return this.f6385t;
        }
        if (i10 == 3) {
            return this.f6386u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(a aVar, boolean z10) {
        long j10 = aVar.f6366c;
        if (!z10) {
            j10 = -j10;
        }
        int i10 = aVar.d;
        if (i10 == 0) {
            this.f6383r += j10;
        } else if (i10 == 1) {
            this.f6384s += j10;
        } else if (i10 == 2) {
            this.f6385t += j10;
        } else if (i10 == 3) {
            this.f6386u += j10;
        } else if (i10 == 4) {
            this.v += j10;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f6372f.isEmpty()) {
            if (this.f6369a || this.f6370b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(a aVar) {
        HashSet hashSet = this.f6375j;
        if (hashSet.contains(aVar)) {
            hashSet.remove(aVar);
            g(aVar, false);
            this.f6376k -= aVar.f6366c;
            a(aVar.d, false);
        } else {
            hashSet.add(aVar);
            g(aVar, true);
            this.f6376k += aVar.f6366c;
            a(aVar.d, true);
        }
        c();
    }
}
