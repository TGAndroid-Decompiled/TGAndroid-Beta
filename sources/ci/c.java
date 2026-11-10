package ci;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.s6;
import org.telegram.ui.t6;
public final class c {
    public final boolean f6426a;
    public long f6434k;
    public boolean f6436m;
    public boolean f6437n;
    public boolean f6438o;
    public boolean f6439p;
    public boolean f6440q;
    public long f6441r;
    public long f6442s;
    public long f6443t;
    public long f6444u;
    public long v;
    public ArrayList f6427b = new ArrayList();
    public final LongSparseArray f6428c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f6429e = new ArrayList();
    public final ArrayList f6430f = new ArrayList();
    public final ArrayList f6431g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f6432i = new HashSet();
    public final HashSet f6433j = new HashSet();
    public final HashSet f6435l = new HashSet();

    public c(boolean z9) {
        this.f6426a = z9;
    }

    public final void a(int i7, boolean z9) {
        if (this.f6426a) {
            if (!z9) {
                if (i7 == 0) {
                    this.f6436m = false;
                    return;
                } else if (i7 == 1) {
                    this.f6437n = false;
                    return;
                } else if (i7 == 2) {
                    this.f6438o = false;
                    return;
                } else if (i7 == 3) {
                    this.f6439p = false;
                    return;
                } else if (i7 == 4) {
                    this.f6440q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i7 == 0) {
                this.f6436m = b(i7, arrayList);
            } else if (i7 == 1) {
                this.f6437n = b(i7, arrayList);
            } else if (i7 == 2) {
                this.f6438o = b(i7, this.f6429e);
            } else if (i7 == 3) {
                this.f6439p = b(i7, this.f6430f);
            } else if (i7 == 4) {
                this.f6440q = b(i7, this.f6431g);
            } else if (i7 == 7) {
                b(i7, this.h);
            }
        }
    }

    public final boolean b(int i7, ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((b) arrayList.get(i10)).d == i7 && !this.f6433j.contains(arrayList.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f6426a) {
            HashSet hashSet = this.f6432i;
            hashSet.clear();
            HashSet hashSet2 = this.f6433j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((b) it.next()).f6421b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f6435l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                s6 s6Var = (s6) this.f6428c.get(((Long) it2.next()).longValue());
                if (s6Var != null) {
                    SparseArray sparseArray = s6Var.d;
                    int i7 = 0;
                    while (true) {
                        if (i7 < sparseArray.size()) {
                            ArrayList arrayList = ((t6) sparseArray.valueAt(i7)).f50142b;
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
                            hashSet3.add(Long.valueOf(s6Var.f49684a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f6434k = 0L;
        this.f6433j.clear();
        this.f6435l.clear();
    }

    public final ArrayList e(int i7) {
        if (i7 == 0 || i7 == 1) {
            return this.d;
        }
        if (i7 == 2) {
            return this.f6429e;
        }
        if (i7 == 3) {
            return this.f6430f;
        }
        if (i7 == 4) {
            return this.f6431g;
        }
        if (i7 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i7) {
        if (i7 == 0) {
            return this.f6441r;
        }
        if (i7 == 1) {
            return this.f6442s;
        }
        if (i7 == 2) {
            return this.f6443t;
        }
        if (i7 == 3) {
            return this.f6444u;
        }
        if (i7 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(b bVar, boolean z9) {
        long j3 = bVar.f6422c;
        if (!z9) {
            j3 = -j3;
        }
        int i7 = bVar.d;
        if (i7 == 0) {
            this.f6441r += j3;
        } else if (i7 == 1) {
            this.f6442s += j3;
        } else if (i7 == 2) {
            this.f6443t += j3;
        } else if (i7 == 3) {
            this.f6444u += j3;
        } else if (i7 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f6429e.isEmpty() && this.f6430f.isEmpty()) {
            if (this.f6426a || this.f6427b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(b bVar) {
        HashSet hashSet = this.f6433j;
        if (hashSet.contains(bVar)) {
            hashSet.remove(bVar);
            g(bVar, false);
            this.f6434k -= bVar.f6422c;
            a(bVar.d, false);
        } else {
            hashSet.add(bVar);
            g(bVar, true);
            this.f6434k += bVar.f6422c;
            a(bVar.d, true);
        }
        c();
    }
}
