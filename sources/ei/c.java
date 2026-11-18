package ei;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.r6;
import org.telegram.ui.s6;
public final class c {
    public final boolean f10972a;
    public long f10980k;
    public boolean f10982m;
    public boolean f10983n;
    public boolean f10984o;
    public boolean f10985p;
    public boolean f10986q;
    public long f10987r;
    public long f10988s;
    public long f10989t;
    public long f10990u;
    public long v;
    public ArrayList f10973b = new ArrayList();
    public final LongSparseArray f10974c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f10975e = new ArrayList();
    public final ArrayList f10976f = new ArrayList();
    public final ArrayList f10977g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f10978i = new HashSet();
    public final HashSet f10979j = new HashSet();
    public final HashSet f10981l = new HashSet();

    public c(boolean z10) {
        this.f10972a = z10;
    }

    public final void a(int i7, boolean z10) {
        if (this.f10972a) {
            if (!z10) {
                if (i7 == 0) {
                    this.f10982m = false;
                    return;
                } else if (i7 == 1) {
                    this.f10983n = false;
                    return;
                } else if (i7 == 2) {
                    this.f10984o = false;
                    return;
                } else if (i7 == 3) {
                    this.f10985p = false;
                    return;
                } else if (i7 == 4) {
                    this.f10986q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i7 == 0) {
                this.f10982m = b(i7, arrayList);
            } else if (i7 == 1) {
                this.f10983n = b(i7, arrayList);
            } else if (i7 == 2) {
                this.f10984o = b(i7, this.f10975e);
            } else if (i7 == 3) {
                this.f10985p = b(i7, this.f10976f);
            } else if (i7 == 4) {
                this.f10986q = b(i7, this.f10977g);
            } else if (i7 == 7) {
                b(i7, this.h);
            }
        }
    }

    public final boolean b(int i7, ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((b) arrayList.get(i10)).d == i7 && !this.f10979j.contains(arrayList.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f10972a) {
            HashSet hashSet = this.f10978i;
            hashSet.clear();
            HashSet hashSet2 = this.f10979j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((b) it.next()).f10967b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f10981l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                r6 r6Var = (r6) this.f10974c.get(((Long) it2.next()).longValue());
                if (r6Var != null) {
                    SparseArray sparseArray = r6Var.d;
                    int i7 = 0;
                    while (true) {
                        if (i7 < sparseArray.size()) {
                            ArrayList arrayList = ((s6) sparseArray.valueAt(i7)).f51914b;
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
                            hashSet3.add(Long.valueOf(r6Var.f51511a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f10980k = 0L;
        this.f10979j.clear();
        this.f10981l.clear();
    }

    public final ArrayList e(int i7) {
        if (i7 == 0 || i7 == 1) {
            return this.d;
        }
        if (i7 == 2) {
            return this.f10975e;
        }
        if (i7 == 3) {
            return this.f10976f;
        }
        if (i7 == 4) {
            return this.f10977g;
        }
        if (i7 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i7) {
        if (i7 == 0) {
            return this.f10987r;
        }
        if (i7 == 1) {
            return this.f10988s;
        }
        if (i7 == 2) {
            return this.f10989t;
        }
        if (i7 == 3) {
            return this.f10990u;
        }
        if (i7 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(b bVar, boolean z10) {
        long j3 = bVar.f10968c;
        if (!z10) {
            j3 = -j3;
        }
        int i7 = bVar.d;
        if (i7 == 0) {
            this.f10987r += j3;
        } else if (i7 == 1) {
            this.f10988s += j3;
        } else if (i7 == 2) {
            this.f10989t += j3;
        } else if (i7 == 3) {
            this.f10990u += j3;
        } else if (i7 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f10975e.isEmpty() && this.f10976f.isEmpty()) {
            if (this.f10972a || this.f10973b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(b bVar) {
        HashSet hashSet = this.f10979j;
        if (hashSet.contains(bVar)) {
            hashSet.remove(bVar);
            g(bVar, false);
            this.f10980k -= bVar.f10968c;
            a(bVar.d, false);
        } else {
            hashSet.add(bVar);
            g(bVar, true);
            this.f10980k += bVar.f10968c;
            a(bVar.d, true);
        }
        c();
    }
}
