package ai;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.s6;
import org.telegram.ui.t6;
public final class c {
    public final boolean f756a;
    public long f764k;
    public boolean f766m;
    public boolean f767n;
    public boolean f768o;
    public boolean f769p;
    public boolean f770q;
    public long f771r;
    public long f772s;
    public long f773t;
    public long f774u;
    public long v;
    public ArrayList f757b = new ArrayList();
    public final LongSparseArray f758c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f759e = new ArrayList();
    public final ArrayList f760f = new ArrayList();
    public final ArrayList f761g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f762i = new HashSet();
    public final HashSet f763j = new HashSet();
    public final HashSet f765l = new HashSet();

    public c(boolean z10) {
        this.f756a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f756a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f766m = false;
                    return;
                } else if (i10 == 1) {
                    this.f767n = false;
                    return;
                } else if (i10 == 2) {
                    this.f768o = false;
                    return;
                } else if (i10 == 3) {
                    this.f769p = false;
                    return;
                } else if (i10 == 4) {
                    this.f770q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f766m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f767n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f768o = b(i10, this.f759e);
            } else if (i10 == 3) {
                this.f769p = b(i10, this.f760f);
            } else if (i10 == 4) {
                this.f770q = b(i10, this.f761g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((b) arrayList.get(i11)).d == i10 && !this.f763j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f756a) {
            HashSet hashSet = this.f762i;
            hashSet.clear();
            HashSet hashSet2 = this.f763j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((b) it.next()).f751b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f765l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                s6 s6Var = (s6) this.f758c.get(((Long) it2.next()).longValue());
                if (s6Var != null) {
                    SparseArray sparseArray = s6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((t6) sparseArray.valueAt(i10)).f40660b;
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
                            hashSet3.add(Long.valueOf(s6Var.f40339a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f764k = 0L;
        this.f763j.clear();
        this.f765l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.f759e;
        }
        if (i10 == 3) {
            return this.f760f;
        }
        if (i10 == 4) {
            return this.f761g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f771r;
        }
        if (i10 == 1) {
            return this.f772s;
        }
        if (i10 == 2) {
            return this.f773t;
        }
        if (i10 == 3) {
            return this.f774u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(b bVar, boolean z10) {
        long j3 = bVar.f752c;
        if (!z10) {
            j3 = -j3;
        }
        int i10 = bVar.d;
        if (i10 == 0) {
            this.f771r += j3;
        } else if (i10 == 1) {
            this.f772s += j3;
        } else if (i10 == 2) {
            this.f773t += j3;
        } else if (i10 == 3) {
            this.f774u += j3;
        } else if (i10 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f759e.isEmpty() && this.f760f.isEmpty()) {
            if (this.f756a || this.f757b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(b bVar) {
        HashSet hashSet = this.f763j;
        if (hashSet.contains(bVar)) {
            hashSet.remove(bVar);
            g(bVar, false);
            this.f764k -= bVar.f752c;
            a(bVar.d, false);
        } else {
            hashSet.add(bVar);
            g(bVar, true);
            this.f764k += bVar.f752c;
            a(bVar.d, true);
        }
        c();
    }
}
