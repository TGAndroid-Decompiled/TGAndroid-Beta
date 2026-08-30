package kh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.o70;
public final class d5 implements Utilities.Callback5 {
    public final int f10539a;
    public final p5 f10540b;
    public final o70 f10541c;

    public d5(p5 p5Var, o70 o70Var, int i10) {
        this.f10539a = i10;
        this.f10540b = p5Var;
        this.f10541c = o70Var;
    }

    @Override
    public final void mo28run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        i51 i51Var = (i51) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f10 = (Float) obj4;
        Float f11 = (Float) obj5;
        switch (this.f10539a) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributeModel) i51Var.G).document.f19190id;
                b5 b5Var = this.f10540b.f10752c;
                HashSet hashSet = b5Var.f10488j;
                HashSet hashSet2 = b5Var.f10488j;
                if (!hashSet.contains(Long.valueOf(j10))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList = b5Var.f10485f;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj6 = arrayList.get(i10);
                            i10++;
                            long j11 = ((TL_stars.starGiftAttributeModel) obj6).document.f19190id;
                            if (j11 != j10) {
                                hashSet2.add(Long.valueOf(j11));
                            }
                        }
                    } else {
                        hashSet2.add(Long.valueOf(j10));
                    }
                } else {
                    hashSet2.remove(Long.valueOf(j10));
                }
                b5Var.h();
                this.f10541c.u();
                return;
            case 1:
                int i11 = ((TL_stars.starGiftAttributeBackdrop) i51Var.G).backdrop_id;
                b5 b5Var2 = this.f10540b.f10752c;
                HashSet hashSet3 = b5Var2.f10489k;
                HashSet hashSet4 = b5Var2.f10489k;
                if (!hashSet3.contains(Integer.valueOf(i11))) {
                    if (hashSet4.isEmpty()) {
                        ArrayList arrayList2 = b5Var2.f10486g;
                        int size2 = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            Object obj7 = arrayList2.get(i12);
                            i12++;
                            int i13 = ((TL_stars.starGiftAttributeBackdrop) obj7).backdrop_id;
                            if (i13 != i11) {
                                hashSet4.add(Integer.valueOf(i13));
                            }
                        }
                    } else {
                        hashSet4.add(Integer.valueOf(i11));
                    }
                } else {
                    hashSet4.remove(Integer.valueOf(i11));
                }
                b5Var2.h();
                this.f10541c.u();
                return;
            default:
                long j12 = ((TL_stars.starGiftAttributePattern) i51Var.G).document.f19190id;
                b5 b5Var3 = this.f10540b.f10752c;
                HashSet hashSet5 = b5Var3.f10490l;
                HashSet hashSet6 = b5Var3.f10490l;
                if (!hashSet5.contains(Long.valueOf(j12))) {
                    if (hashSet6.isEmpty()) {
                        ArrayList arrayList3 = b5Var3.h;
                        int size3 = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj8 = arrayList3.get(i14);
                            i14++;
                            long j13 = ((TL_stars.starGiftAttributePattern) obj8).document.f19190id;
                            if (j13 != j12) {
                                hashSet6.add(Long.valueOf(j13));
                            }
                        }
                    } else {
                        hashSet6.add(Long.valueOf(j12));
                    }
                } else {
                    hashSet6.remove(Long.valueOf(j12));
                }
                b5Var3.h();
                this.f10541c.u();
                return;
        }
    }
}
