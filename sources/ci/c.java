package ci;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.s6;
import org.telegram.ui.t6;
public final class c {
    public final boolean f6423a;
    public long f6431k;
    public boolean f6433m;
    public boolean f6434n;
    public boolean f6435o;
    public boolean f6436p;
    public boolean f6437q;
    public long f6438r;
    public long f6439s;
    public long f6440t;
    public long f6441u;
    public long v;
    public ArrayList f6424b = new ArrayList();
    public final LongSparseArray f6425c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList f6426e = new ArrayList();
    public final ArrayList f6427f = new ArrayList();
    public final ArrayList f6428g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f6429i = new HashSet();
    public final HashSet f6430j = new HashSet();
    public final HashSet f6432l = new HashSet();

    public c(boolean z9) {
        this.f6423a = z9;
    }

    public final void a(int i7, boolean z9) {
        if (this.f6423a) {
            if (!z9) {
                if (i7 == 0) {
                    this.f6433m = false;
                    return;
                } else if (i7 == 1) {
                    this.f6434n = false;
                    return;
                } else if (i7 == 2) {
                    this.f6435o = false;
                    return;
                } else if (i7 == 3) {
                    this.f6436p = false;
                    return;
                } else if (i7 == 4) {
                    this.f6437q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i7 == 0) {
                this.f6433m = b(i7, arrayList);
            } else if (i7 == 1) {
                this.f6434n = b(i7, arrayList);
            } else if (i7 == 2) {
                this.f6435o = b(i7, this.f6426e);
            } else if (i7 == 3) {
                this.f6436p = b(i7, this.f6427f);
            } else if (i7 == 4) {
                this.f6437q = b(i7, this.f6428g);
            } else if (i7 == 7) {
                b(i7, this.h);
            }
        }
    }

    public final boolean b(int i7, ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            if (((b) arrayList.get(i10)).d == i7 && !this.f6430j.contains(arrayList.get(i10))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f6423a) {
            HashSet hashSet = this.f6429i;
            hashSet.clear();
            HashSet hashSet2 = this.f6430j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j3 = ((b) it.next()).f6418b;
                if (j3 != 0) {
                    hashSet.add(Long.valueOf(j3));
                }
            }
            HashSet hashSet3 = this.f6432l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                s6 s6Var = (s6) this.f6425c.get(((Long) it2.next()).longValue());
                if (s6Var != null) {
                    SparseArray sparseArray = s6Var.d;
                    int i7 = 0;
                    while (true) {
                        if (i7 < sparseArray.size()) {
                            ArrayList arrayList = ((t6) sparseArray.valueAt(i7)).f49944b;
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
                            hashSet3.add(Long.valueOf(s6Var.f49639a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f6431k = 0L;
        this.f6430j.clear();
        this.f6432l.clear();
    }

    public final ArrayList e(int i7) {
        if (i7 == 0 || i7 == 1) {
            return this.d;
        }
        if (i7 == 2) {
            return this.f6426e;
        }
        if (i7 == 3) {
            return this.f6427f;
        }
        if (i7 == 4) {
            return this.f6428g;
        }
        if (i7 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i7) {
        if (i7 == 0) {
            return this.f6438r;
        }
        if (i7 == 1) {
            return this.f6439s;
        }
        if (i7 == 2) {
            return this.f6440t;
        }
        if (i7 == 3) {
            return this.f6441u;
        }
        if (i7 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(b bVar, boolean z9) {
        long j3 = bVar.f6419c;
        if (!z9) {
            j3 = -j3;
        }
        int i7 = bVar.d;
        if (i7 == 0) {
            this.f6438r += j3;
        } else if (i7 == 1) {
            this.f6439s += j3;
        } else if (i7 == 2) {
            this.f6440t += j3;
        } else if (i7 == 3) {
            this.f6441u += j3;
        } else if (i7 == 4) {
            this.v += j3;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.f6426e.isEmpty() && this.f6427f.isEmpty()) {
            if (this.f6423a || this.f6424b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(b bVar) {
        HashSet hashSet = this.f6430j;
        if (hashSet.contains(bVar)) {
            hashSet.remove(bVar);
            g(bVar, false);
            this.f6431k -= bVar.f6419c;
            a(bVar.d, false);
        } else {
            hashSet.add(bVar);
            g(bVar, true);
            this.f6431k += bVar.f6419c;
            a(bVar.d, true);
        }
        c();
    }
}
