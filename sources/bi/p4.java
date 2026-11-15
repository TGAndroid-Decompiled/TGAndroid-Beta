package bi;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.m60;
public final class p4 implements x10 {
    public final int f3787a;
    public final a6 f3788b;
    public final m60 f3789c;

    public p4(a6 a6Var, m60 m60Var, int i7) {
        this.f3787a = i7;
        this.f3788b = a6Var;
        this.f3789c = m60Var;
    }

    @Override
    public final void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        b41 b41Var = (b41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        switch (this.f3787a) {
            case 0:
                long j3 = ((TL_stars.starGiftAttributeModel) b41Var.G).document.f28057id;
                o5 o5Var = this.f3788b.d;
                HashSet hashSet = o5Var.f3761j;
                if (!hashSet.contains(Long.valueOf(j3))) {
                    if (hashSet.isEmpty()) {
                        ArrayList arrayList = o5Var.f3758f;
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj3 = arrayList.get(i7);
                            i7++;
                            long j10 = ((TL_stars.starGiftAttributeModel) obj3).document.f28057id;
                            if (j10 != j3) {
                                hashSet.add(Long.valueOf(j10));
                            }
                        }
                    } else {
                        hashSet.add(Long.valueOf(j3));
                    }
                } else {
                    hashSet.remove(Long.valueOf(j3));
                }
                o5Var.h();
                this.f3789c.u();
                return;
            case 1:
                int i10 = ((TL_stars.starGiftAttributeBackdrop) b41Var.G).backdrop_id;
                o5 o5Var2 = this.f3788b.d;
                HashSet hashSet2 = o5Var2.f3762k;
                if (!hashSet2.contains(Integer.valueOf(i10))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList2 = o5Var2.f3759g;
                        int size2 = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj4 = arrayList2.get(i11);
                            i11++;
                            int i12 = ((TL_stars.starGiftAttributeBackdrop) obj4).backdrop_id;
                            if (i12 != i10) {
                                hashSet2.add(Integer.valueOf(i12));
                            }
                        }
                    } else {
                        hashSet2.add(Integer.valueOf(i10));
                    }
                } else {
                    hashSet2.remove(Integer.valueOf(i10));
                }
                o5Var2.h();
                this.f3789c.u();
                return;
            default:
                long j11 = ((TL_stars.starGiftAttributePattern) b41Var.G).document.f28057id;
                o5 o5Var3 = this.f3788b.d;
                HashSet hashSet3 = o5Var3.f3763l;
                if (!hashSet3.contains(Long.valueOf(j11))) {
                    if (hashSet3.isEmpty()) {
                        ArrayList arrayList3 = o5Var3.h;
                        int size3 = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            Object obj5 = arrayList3.get(i13);
                            i13++;
                            long j12 = ((TL_stars.starGiftAttributePattern) obj5).document.f28057id;
                            if (j12 != j11) {
                                hashSet3.add(Long.valueOf(j12));
                            }
                        }
                    } else {
                        hashSet3.add(Long.valueOf(j11));
                    }
                } else {
                    hashSet3.remove(Long.valueOf(j11));
                }
                o5Var3.h();
                this.f3789c.u();
                return;
        }
    }
}
