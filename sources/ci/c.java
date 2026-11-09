package ci;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.s6;
import org.telegram.ui.t6;
public final class c {
    public final boolean f6421a;
    public long f6429k;
    public boolean f6431m;
    public boolean f6432n;
    public boolean f6433o;
    public boolean f6434p;
    public boolean f6435q;
    public long f6436r;
    public long f6437s;
    public long f6438t;
    public long f6439u;
    public long v;
    public ArrayList f6422b = new ArrayList();
    public final LongSparseArray f6423c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f6424e = new ArrayList();
    public final ArrayList f6425f = new ArrayList();
    public final ArrayList f6426g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f6427i = new HashSet();
    public final HashSet f6428j = new HashSet();
    public final HashSet f6430l = new HashSet();

    public c(boolean z9) {
        this.f6421a = z9;
    }

    public final void a(int i7, boolean z9) {
        if (this.f6421a) {
            if (!z9) {
                if (i7 == 0) {
                    this.f6431m = false;
                    return;
                } else if (i7 == 1) {
                    this.f6432n = false;
                    return;
                } else if (i7 == 2) {
                    this.f6433o = false;
                    return;
                } else if (i7 == 3) {
                    this.f6434p = false;
                    return;
                } else if (i7 == 4) {
                    this.f6435q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i7 == 0) {
                this.f6431m = b(i7, arrayList);
            } else if (i7 == 1) {
                this.f6432n = b(i7, arrayList);
            } else if (i7 == 2) {
                this.f6433o = b(i7, this.f6424e);
            } else if (i7 == 3) {
                this.f6434p = b(i7, this.f6425f);
            } else if (i7 == 4) {
                this.f6435q = b(i7, this.f6426g);
            } else if (i7 == 7) {
                b(i7, this.h);
            }
        }
    }

    public final boolean b(int i7, ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((b) arrayList.get(i10)).d == i7 && !this.f6428j.contains(arrayList.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f6421a) {
            HashSet hashSet = this.f6427i;
            hashSet.clear();
            HashSet hashSet2 = this.f6428j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((b) it.next()).f6416b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f6430l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                s6 s6Var = (s6) this.f6423c.get(((Long) it2.next()).longValue());
                if (s6Var != null) {
                    SparseArray sparseArray = s6Var.d;
                    int i7 = 0;
                    while (true) {
                        if (i7 < sparseArray.size()) {
                            ArrayList arrayList = ((t6) sparseArray.valueAt(i7)).f50095b;
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
                            hashSet3.add(Long.valueOf(s6Var.f49776a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f6429k = 0L;
        this.f6428j.clear();
        this.f6430l.clear();
    }

    public final ArrayList e(int i7) {
        if (i7 == 0 || i7 == 1) {
            return this.d;
        }
        if (i7 == 2) {
            return this.f6424e;
        }
        if (i7 == 3) {
            return this.f6425f;
        }
        if (i7 == 4) {
            return this.f6426g;
        }
        if (i7 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i7) {
        if (i7 == 0) {
            return this.f6436r;
        }
        if (i7 == 1) {
            return this.f6437s;
        }
        if (i7 == 2) {
            return this.f6438t;
        }
        if (i7 == 3) {
            return this.f6439u;
        }
        if (i7 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(b bVar, boolean z9) {
        long j3 = bVar.f6417c;
        if (!z9) {
            j3 = -j3;
        }
        int i7 = bVar.d;
        if (i7 == 0) {
            this.f6436r += j3;
        } else if (i7 == 1) {
            this.f6437s += j3;
        } else if (i7 == 2) {
            this.f6438t += j3;
        } else if (i7 == 3) {
            this.f6439u += j3;
        } else if (i7 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f6424e.isEmpty() && this.f6425f.isEmpty()) {
            if (this.f6421a || this.f6422b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(b bVar) {
        HashSet hashSet = this.f6428j;
        if (hashSet.contains(bVar)) {
            hashSet.remove(bVar);
            g(bVar, false);
            this.f6429k -= bVar.f6417c;
            a(bVar.d, false);
        } else {
            hashSet.add(bVar);
            g(bVar, true);
            this.f6429k += bVar.f6417c;
            a(bVar.d, true);
        }
        c();
    }
}
