package bi;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.o41;
public final class a7 implements v10 {
    public final int f3405a;
    public final k8 f3406b;
    public final h51[] f3407c;

    public a7(k8 k8Var, h51[] h51VarArr, int i7) {
        this.f3405a = i7;
        this.f3406b = k8Var;
        this.f3407c = h51VarArr;
    }

    @Override
    public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        o41 o41Var = (o41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        switch (this.f3405a) {
            case 0:
                long j3 = ((TL_stars.starGiftAttributePattern) o41Var.H).document.f28437id;
                y7 y7Var = this.f3406b.d;
                HashSet hashSet = y7Var.f4302l;
                if (!hashSet.contains(Long.valueOf(j3))) {
                    if (hashSet.isEmpty()) {
                        ArrayList arrayList = y7Var.h;
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj3 = arrayList.get(i7);
                            i7++;
                            long j10 = ((TL_stars.starGiftAttributePattern) obj3).document.f28437id;
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
                y7Var.m();
                h51 h51Var = this.f3407c[0];
                if (h51Var != null) {
                    h51Var.f35796g3.O(true);
                    return;
                }
                return;
            case 1:
                int i10 = ((TL_stars.starGiftAttributeBackdrop) o41Var.H).backdrop_id;
                y7 y7Var2 = this.f3406b.d;
                HashSet hashSet2 = y7Var2.f4301k;
                if (!hashSet2.contains(Integer.valueOf(i10))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList2 = y7Var2.f4298g;
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
                y7Var2.m();
                h51 h51Var2 = this.f3407c[0];
                if (h51Var2 != null) {
                    h51Var2.f35796g3.O(true);
                    return;
                }
                return;
            default:
                long j11 = ((TL_stars.starGiftAttributeModel) o41Var.H).document.f28437id;
                y7 y7Var3 = this.f3406b.d;
                HashSet hashSet3 = y7Var3.f4300j;
                if (!hashSet3.contains(Long.valueOf(j11))) {
                    if (hashSet3.isEmpty()) {
                        ArrayList arrayList3 = y7Var3.f4297f;
                        int size3 = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            Object obj5 = arrayList3.get(i13);
                            i13++;
                            long j12 = ((TL_stars.starGiftAttributeModel) obj5).document.f28437id;
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
                y7Var3.m();
                h51 h51Var3 = this.f3407c[0];
                if (h51Var3 != null) {
                    h51Var3.f35796g3.O(true);
                    return;
                }
                return;
        }
    }
}
