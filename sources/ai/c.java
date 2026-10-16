package ai;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.w6;
import org.telegram.ui.x6;
public final class c {
    public final boolean f924a;
    public long f931k;
    public boolean f933m;
    public boolean f934n;
    public boolean f935o;
    public boolean f936p;
    public boolean f937q;
    public long f938r;
    public long f939s;
    public long f940t;
    public long f941u;
    public long v;
    public ArrayList f925b = new ArrayList();
    public final LongSparseArray f926c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f927f = new ArrayList();
    public final ArrayList f928g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f929i = new HashSet();
    public final HashSet f930j = new HashSet();
    public final HashSet f932l = new HashSet();

    public c(boolean z10) {
        this.f924a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f924a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f933m = false;
                    return;
                } else if (i10 == 1) {
                    this.f934n = false;
                    return;
                } else if (i10 == 2) {
                    this.f935o = false;
                    return;
                } else if (i10 == 3) {
                    this.f936p = false;
                    return;
                } else if (i10 == 4) {
                    this.f937q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f933m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f934n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f935o = b(i10, this.e);
            } else if (i10 == 3) {
                this.f936p = b(i10, this.f927f);
            } else if (i10 == 4) {
                this.f937q = b(i10, this.f928g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((b) arrayList.get(i11)).d == i10 && !this.f930j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f924a) {
            HashSet hashSet = this.f929i;
            hashSet.clear();
            HashSet hashSet2 = this.f930j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j10 = ((b) it.next()).f920b;
                if (j10 != 0) {
                    hashSet.add(Long.valueOf(j10));
                }
            }
            HashSet hashSet3 = this.f932l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                w6 w6Var = (w6) this.f926c.get(((Long) it2.next()).longValue());
                if (w6Var != null) {
                    SparseArray sparseArray = w6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((x6) sparseArray.valueAt(i10)).f41445b;
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
                            hashSet3.add(Long.valueOf(w6Var.f40870a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f931k = 0L;
        this.f930j.clear();
        this.f932l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.e;
        }
        if (i10 == 3) {
            return this.f927f;
        }
        if (i10 == 4) {
            return this.f928g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f938r;
        }
        if (i10 == 1) {
            return this.f939s;
        }
        if (i10 == 2) {
            return this.f940t;
        }
        if (i10 == 3) {
            return this.f941u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(b bVar, boolean z10) {
        long j10 = bVar.f921c;
        if (!z10) {
            j10 = -j10;
        }
        int i10 = bVar.d;
        if (i10 == 0) {
            this.f938r += j10;
        } else if (i10 == 1) {
            this.f939s += j10;
        } else if (i10 == 2) {
            this.f940t += j10;
        } else if (i10 == 3) {
            this.f941u += j10;
        } else if (i10 == 4) {
            this.v += j10;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f927f.isEmpty()) {
            if (this.f924a || this.f925b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(b bVar) {
        HashSet hashSet = this.f930j;
        if (hashSet.contains(bVar)) {
            hashSet.remove(bVar);
            g(bVar, false);
            this.f931k -= bVar.f921c;
            a(bVar.d, false);
        } else {
            hashSet.add(bVar);
            g(bVar, true);
            this.f931k += bVar.f921c;
            a(bVar.d, true);
        }
        c();
    }
}
