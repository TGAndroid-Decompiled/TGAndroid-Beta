package bi;

import android.util.LongSparseArray;
import android.util.SparseArray;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import org.telegram.ui.v6;
import org.telegram.ui.w6;
public final class c {
    public final boolean f4431a;
    public long f4438k;
    public boolean f4440m;
    public boolean f4441n;
    public boolean f4442o;
    public boolean f4443p;
    public boolean f4444q;
    public long f4445r;
    public long f4446s;
    public long f4447t;
    public long f4448u;
    public long v;
    public ArrayList f4432b = new ArrayList();
    public final LongSparseArray f4433c = new LongSparseArray();
    public final ArrayList d = new ArrayList();
    public final ArrayList e = new ArrayList();
    public final ArrayList f4434f = new ArrayList();
    public final ArrayList f4435g = new ArrayList();
    public final ArrayList h = new ArrayList();
    public final HashSet f4436i = new HashSet();
    public final HashSet f4437j = new HashSet();
    public final HashSet f4439l = new HashSet();

    public c(boolean z10) {
        this.f4431a = z10;
    }

    public final void a(int i10, boolean z10) {
        if (this.f4431a) {
            if (!z10) {
                if (i10 == 0) {
                    this.f4440m = false;
                    return;
                } else if (i10 == 1) {
                    this.f4441n = false;
                    return;
                } else if (i10 == 2) {
                    this.f4442o = false;
                    return;
                } else if (i10 == 3) {
                    this.f4443p = false;
                    return;
                } else if (i10 == 4) {
                    this.f4444q = false;
                    return;
                } else {
                    return;
                }
            }
            ArrayList arrayList = this.d;
            if (i10 == 0) {
                this.f4440m = b(i10, arrayList);
            } else if (i10 == 1) {
                this.f4441n = b(i10, arrayList);
            } else if (i10 == 2) {
                this.f4442o = b(i10, this.e);
            } else if (i10 == 3) {
                this.f4443p = b(i10, this.f4434f);
            } else if (i10 == 4) {
                this.f4444q = b(i10, this.f4435g);
            } else if (i10 == 7) {
                b(i10, this.h);
            }
        }
    }

    public final boolean b(int i10, ArrayList arrayList) {
        for (int i11 = 0; i11 < arrayList.size(); i11++) {
            if (((b) arrayList.get(i11)).d == i10 && !this.f4437j.contains(arrayList.get(i11))) {
                return false;
            }
        }
        return true;
    }

    public final void c() {
        if (!this.f4431a) {
            HashSet hashSet = this.f4436i;
            hashSet.clear();
            HashSet hashSet2 = this.f4437j;
            Iterator it = hashSet2.iterator();
            while (it.hasNext()) {
                long j10 = ((b) it.next()).f4427b;
                if (j10 != 0) {
                    hashSet.add(Long.valueOf(j10));
                }
            }
            HashSet hashSet3 = this.f4439l;
            hashSet3.clear();
            Iterator it2 = hashSet.iterator();
            while (it2.hasNext()) {
                v6 v6Var = (v6) this.f4433c.get(((Long) it2.next()).longValue());
                if (v6Var != null) {
                    SparseArray sparseArray = v6Var.d;
                    int i10 = 0;
                    while (true) {
                        if (i10 < sparseArray.size()) {
                            ArrayList arrayList = ((w6) sparseArray.valueAt(i10)).f42471b;
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
                            hashSet3.add(Long.valueOf(v6Var.f42109a));
                            break;
                        }
                    }
                }
            }
        }
    }

    public final void d() {
        this.f4438k = 0L;
        this.f4437j.clear();
        this.f4439l.clear();
    }

    public final ArrayList e(int i10) {
        if (i10 == 0 || i10 == 1) {
            return this.d;
        }
        if (i10 == 2) {
            return this.e;
        }
        if (i10 == 3) {
            return this.f4434f;
        }
        if (i10 == 4) {
            return this.f4435g;
        }
        if (i10 == 7) {
            return this.h;
        }
        return null;
    }

    public final long f(int i10) {
        if (i10 == 0) {
            return this.f4445r;
        }
        if (i10 == 1) {
            return this.f4446s;
        }
        if (i10 == 2) {
            return this.f4447t;
        }
        if (i10 == 3) {
            return this.f4448u;
        }
        if (i10 == 4) {
            return this.v;
        }
        return -1L;
    }

    public final void g(b bVar, boolean z10) {
        long j10 = bVar.f4428c;
        if (!z10) {
            j10 = -j10;
        }
        int i10 = bVar.d;
        if (i10 == 0) {
            this.f4445r += j10;
        } else if (i10 == 1) {
            this.f4446s += j10;
        } else if (i10 == 2) {
            this.f4447t += j10;
        } else if (i10 == 3) {
            this.f4448u += j10;
        } else if (i10 == 4) {
            this.v += j10;
        }
    }

    public final boolean h() {
        if (this.d.isEmpty() && this.e.isEmpty() && this.f4434f.isEmpty()) {
            if (this.f4431a || this.f4432b.isEmpty()) {
                return true;
            }
            return false;
        }
        return false;
    }

    public final void i(b bVar) {
        HashSet hashSet = this.f4437j;
        if (hashSet.contains(bVar)) {
            hashSet.remove(bVar);
            g(bVar, false);
            this.f4438k -= bVar.f4428c;
            a(bVar.d, false);
        } else {
            hashSet.add(bVar);
            g(bVar, true);
            this.f4438k += bVar.f4428c;
            a(bVar.d, true);
        }
        c();
    }
}
