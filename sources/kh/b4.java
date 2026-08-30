package kh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.o70;
public final class b4 implements Utilities.Callback5 {
    public final int f10479a;
    public final r5 f10480b;
    public final o70 f10481c;

    public b4(r5 r5Var, o70 o70Var, int i10) {
        this.f10479a = i10;
        this.f10480b = r5Var;
        this.f10481c = o70Var;
    }

    @Override
    public final void mo28run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = this.f10479a;
        i51 i51Var = (i51) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f10 = (Float) obj4;
        Float f11 = (Float) obj5;
        r5 r5Var = this.f10480b;
        r5Var.getClass();
        switch (i10) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributePattern) i51Var.G).document.f19190id;
                b5 b5Var = r5Var.d;
                HashSet hashSet = b5Var.f10490l;
                if (!hashSet.contains(Long.valueOf(j10))) {
                    if (hashSet.isEmpty()) {
                        ArrayList arrayList = b5Var.h;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj6 = arrayList.get(i11);
                            i11++;
                            long j11 = ((TL_stars.starGiftAttributePattern) obj6).document.f19190id;
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
                this.f10481c.u();
                return;
            case 1:
                int i12 = ((TL_stars.starGiftAttributeBackdrop) i51Var.G).backdrop_id;
                b5 b5Var2 = r5Var.d;
                HashSet hashSet2 = b5Var2.f10489k;
                if (!hashSet2.contains(Integer.valueOf(i12))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList2 = b5Var2.f10486g;
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
                this.f10481c.u();
                return;
            default:
                long j12 = ((TL_stars.starGiftAttributeModel) i51Var.G).document.f19190id;
                b5 b5Var3 = r5Var.d;
                HashSet hashSet3 = b5Var3.f10488j;
                if (!hashSet3.contains(Long.valueOf(j12))) {
                    if (hashSet3.isEmpty()) {
                        ArrayList arrayList3 = b5Var3.f10485f;
                        int size3 = arrayList3.size();
                        int i15 = 0;
                        while (i15 < size3) {
                            Object obj8 = arrayList3.get(i15);
                            i15++;
                            long j13 = ((TL_stars.starGiftAttributeModel) obj8).document.f19190id;
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
                this.f10481c.u();
                return;
        }
    }
}
