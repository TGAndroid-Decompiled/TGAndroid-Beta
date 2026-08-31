package lh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.q70;
public final class b4 implements Utilities.Callback5 {
    public final int f12615a;
    public final r5 f12616b;
    public final q70 f12617c;

    public b4(r5 r5Var, q70 q70Var, int i10) {
        this.f12615a = i10;
        this.f12616b = r5Var;
        this.f12617c = q70Var;
    }

    @Override
    public final void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = this.f12615a;
        j51 j51Var = (j51) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f10 = (Float) obj4;
        Float f11 = (Float) obj5;
        r5 r5Var = this.f12616b;
        r5Var.getClass();
        switch (i10) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributePattern) j51Var.G).document.f20849id;
                b5 b5Var = r5Var.d;
                HashSet hashSet = b5Var.f12627l;
                if (!hashSet.contains(Long.valueOf(j10))) {
                    if (hashSet.isEmpty()) {
                        ArrayList arrayList = b5Var.h;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj6 = arrayList.get(i11);
                            i11++;
                            long j11 = ((TL_stars.starGiftAttributePattern) obj6).document.f20849id;
                            if (j11 != j10) {
                                hashSet.add(Long.valueOf(j11));
                            }
                        }
                    } else {
                        hashSet.add(Long.valueOf(j10));
                    }
                } else {
                    hashSet.remove(Long.valueOf(j10));
                }
                b5Var.h();
                this.f12617c.u();
                return;
            case 1:
                int i12 = ((TL_stars.starGiftAttributeBackdrop) j51Var.G).backdrop_id;
                b5 b5Var2 = r5Var.d;
                HashSet hashSet2 = b5Var2.f12626k;
                if (!hashSet2.contains(Integer.valueOf(i12))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList2 = b5Var2.f12623g;
                        int size2 = arrayList2.size();
                        int i13 = 0;
                        while (i13 < size2) {
                            Object obj7 = arrayList2.get(i13);
                            i13++;
                            int i14 = ((TL_stars.starGiftAttributeBackdrop) obj7).backdrop_id;
                            if (i14 != i12) {
                                hashSet2.add(Integer.valueOf(i14));
                            }
                        }
                    } else {
                        hashSet2.add(Integer.valueOf(i12));
                    }
                } else {
                    hashSet2.remove(Integer.valueOf(i12));
                }
                b5Var2.h();
                this.f12617c.u();
                return;
            default:
                long j12 = ((TL_stars.starGiftAttributeModel) j51Var.G).document.f20849id;
                b5 b5Var3 = r5Var.d;
                HashSet hashSet3 = b5Var3.f12625j;
                if (!hashSet3.contains(Long.valueOf(j12))) {
                    if (hashSet3.isEmpty()) {
                        ArrayList arrayList3 = b5Var3.f12622f;
                        int size3 = arrayList3.size();
                        int i15 = 0;
                        while (i15 < size3) {
                            Object obj8 = arrayList3.get(i15);
                            i15++;
                            long j13 = ((TL_stars.starGiftAttributeModel) obj8).document.f20849id;
                            if (j13 != j12) {
                                hashSet3.add(Long.valueOf(j13));
                            }
                        }
                    } else {
                        hashSet3.add(Long.valueOf(j12));
                    }
                } else {
                    hashSet3.remove(Long.valueOf(j12));
                }
                b5Var3.h();
                this.f12617c.u();
                return;
        }
    }
}
