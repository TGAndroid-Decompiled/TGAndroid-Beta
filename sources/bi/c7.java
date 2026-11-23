package bi;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.w10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o41;
public final class c7 implements w10 {
    public final int f3441a;
    public final m8 f3442b;
    public final h51[] f3443c;

    public c7(m8 m8Var, h51[] h51VarArr, int i7) {
        this.f3441a = i7;
        this.f3442b = m8Var;
        this.f3443c = h51VarArr;
    }

    @Override
    public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        o41 o41Var = (o41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        switch (this.f3441a) {
            case 0:
                long j3 = ((TL_stars.starGiftAttributePattern) o41Var.H).document.f28404id;
                a8 a8Var = this.f3442b.d;
                HashSet hashSet = a8Var.f3370l;
                if (!hashSet.contains(Long.valueOf(j3))) {
                    if (hashSet.isEmpty()) {
                        ArrayList arrayList = a8Var.h;
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj3 = arrayList.get(i7);
                            i7++;
                            long j10 = ((TL_stars.starGiftAttributePattern) obj3).document.f28404id;
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
                a8Var.m();
                h51 h51Var = this.f3443c[0];
                if (h51Var != null) {
                    h51Var.f35742g3.O(true);
                    return;
                }
                return;
            case 1:
                int i10 = ((TL_stars.starGiftAttributeBackdrop) o41Var.H).backdrop_id;
                a8 a8Var2 = this.f3442b.d;
                HashSet hashSet2 = a8Var2.f3369k;
                if (!hashSet2.contains(Integer.valueOf(i10))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList2 = a8Var2.f3366g;
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
                a8Var2.m();
                h51 h51Var2 = this.f3443c[0];
                if (h51Var2 != null) {
                    h51Var2.f35742g3.O(true);
                    return;
                }
                return;
            default:
                long j11 = ((TL_stars.starGiftAttributeModel) o41Var.H).document.f28404id;
                a8 a8Var3 = this.f3442b.d;
                HashSet hashSet3 = a8Var3.f3368j;
                if (!hashSet3.contains(Long.valueOf(j11))) {
                    if (hashSet3.isEmpty()) {
                        ArrayList arrayList3 = a8Var3.f3365f;
                        int size3 = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            Object obj5 = arrayList3.get(i13);
                            i13++;
                            long j12 = ((TL_stars.starGiftAttributeModel) obj5).document.f28404id;
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
                a8Var3.m();
                h51 h51Var3 = this.f3443c[0];
                if (h51Var3 != null) {
                    h51Var3.f35742g3.O(true);
                    return;
                }
                return;
        }
    }
}
