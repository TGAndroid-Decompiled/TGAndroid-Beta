package kh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.p70;
public final class c5 implements Utilities.Callback5 {
    public final int f10636a;
    public final o5 f10637b;
    public final p70 f10638c;

    public c5(o5 o5Var, p70 p70Var, int i10) {
        this.f10636a = i10;
        this.f10637b = o5Var;
        this.f10638c = p70Var;
    }

    @Override
    public final void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        i51 i51Var = (i51) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f10 = (Float) obj4;
        Float f11 = (Float) obj5;
        switch (this.f10636a) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributeModel) i51Var.G).document.f19165id;
                a5 a5Var = this.f10637b.f10851c;
                HashSet hashSet = a5Var.f10586j;
                HashSet hashSet2 = a5Var.f10586j;
                if (!hashSet.contains(Long.valueOf(j10))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList = a5Var.f10583f;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj6 = arrayList.get(i10);
                            i10++;
                            long j11 = ((TL_stars.starGiftAttributeModel) obj6).document.f19165id;
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
                a5Var.h();
                this.f10638c.u();
                return;
            case 1:
                int i11 = ((TL_stars.starGiftAttributeBackdrop) i51Var.G).backdrop_id;
                a5 a5Var2 = this.f10637b.f10851c;
                HashSet hashSet3 = a5Var2.f10587k;
                HashSet hashSet4 = a5Var2.f10587k;
                if (!hashSet3.contains(Integer.valueOf(i11))) {
                    if (hashSet4.isEmpty()) {
                        ArrayList arrayList2 = a5Var2.f10584g;
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
                a5Var2.h();
                this.f10638c.u();
                return;
            default:
                long j12 = ((TL_stars.starGiftAttributePattern) i51Var.G).document.f19165id;
                a5 a5Var3 = this.f10637b.f10851c;
                HashSet hashSet5 = a5Var3.f10588l;
                HashSet hashSet6 = a5Var3.f10588l;
                if (!hashSet5.contains(Long.valueOf(j12))) {
                    if (hashSet6.isEmpty()) {
                        ArrayList arrayList3 = a5Var3.h;
                        int size3 = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj8 = arrayList3.get(i14);
                            i14++;
                            long j13 = ((TL_stars.starGiftAttributePattern) obj8).document.f19165id;
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
                a5Var3.h();
                this.f10638c.u();
                return;
        }
    }
}
