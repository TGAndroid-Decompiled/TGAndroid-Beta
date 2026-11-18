package bi;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.v10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.l41;
public final class w6 implements v10 {
    public final int f4155a;
    public final g8 f4156b;
    public final e51[] f4157c;

    public w6(g8 g8Var, e51[] e51VarArr, int i7) {
        this.f4155a = i7;
        this.f4156b = g8Var;
        this.f4157c = e51VarArr;
    }

    @Override
    public final void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        l41 l41Var = (l41) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        switch (this.f4155a) {
            case 0:
                long j3 = ((TL_stars.starGiftAttributePattern) l41Var.H).document.f28409id;
                u7 u7Var = this.f4156b.d;
                HashSet hashSet = u7Var.f4096l;
                if (!hashSet.contains(Long.valueOf(j3))) {
                    if (hashSet.isEmpty()) {
                        ArrayList arrayList = u7Var.h;
                        int size = arrayList.size();
                        int i7 = 0;
                        while (i7 < size) {
                            Object obj3 = arrayList.get(i7);
                            i7++;
                            long j10 = ((TL_stars.starGiftAttributePattern) obj3).document.f28409id;
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
                u7Var.m();
                e51 e51Var = this.f4157c[0];
                if (e51Var != null) {
                    e51Var.f34607g3.O(true);
                    return;
                }
                return;
            case 1:
                int i10 = ((TL_stars.starGiftAttributeBackdrop) l41Var.H).backdrop_id;
                u7 u7Var2 = this.f4156b.d;
                HashSet hashSet2 = u7Var2.f4095k;
                if (!hashSet2.contains(Integer.valueOf(i10))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList2 = u7Var2.f4092g;
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
                u7Var2.m();
                e51 e51Var2 = this.f4157c[0];
                if (e51Var2 != null) {
                    e51Var2.f34607g3.O(true);
                    return;
                }
                return;
            default:
                long j11 = ((TL_stars.starGiftAttributeModel) l41Var.H).document.f28409id;
                u7 u7Var3 = this.f4156b.d;
                HashSet hashSet3 = u7Var3.f4094j;
                if (!hashSet3.contains(Long.valueOf(j11))) {
                    if (hashSet3.isEmpty()) {
                        ArrayList arrayList3 = u7Var3.f4091f;
                        int size3 = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            Object obj5 = arrayList3.get(i13);
                            i13++;
                            long j12 = ((TL_stars.starGiftAttributeModel) obj5).document.f28409id;
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
                u7Var3.m();
                e51 e51Var3 = this.f4157c[0];
                if (e51Var3 != null) {
                    e51Var3.f34607g3.O(true);
                    return;
                }
                return;
        }
    }
}
