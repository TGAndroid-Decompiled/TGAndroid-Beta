package ih;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.w41;
public final class d5 implements Utilities.Callback5 {
    public final int f9102a;
    public final p5 f9103b;
    public final j70 f9104c;

    public d5(p5 p5Var, j70 j70Var, int i10) {
        this.f9102a = i10;
        this.f9103b = p5Var;
        this.f9104c = j70Var;
    }

    @Override
    public final void mo19run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        w41 w41Var = (w41) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f9 = (Float) obj4;
        Float f10 = (Float) obj5;
        switch (this.f9102a) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributeModel) w41Var.G).document.f22398id;
                b5 b5Var = this.f9103b.f9329c;
                HashSet hashSet = b5Var.f9050j;
                HashSet hashSet2 = b5Var.f9050j;
                if (!hashSet.contains(Long.valueOf(j10))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList = b5Var.f9047f;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj6 = arrayList.get(i10);
                            i10++;
                            long j11 = ((TL_stars.starGiftAttributeModel) obj6).document.f22398id;
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
                this.f9104c.u();
                return;
            case 1:
                int i11 = ((TL_stars.starGiftAttributeBackdrop) w41Var.G).backdrop_id;
                b5 b5Var2 = this.f9103b.f9329c;
                HashSet hashSet3 = b5Var2.f9051k;
                HashSet hashSet4 = b5Var2.f9051k;
                if (!hashSet3.contains(Integer.valueOf(i11))) {
                    if (hashSet4.isEmpty()) {
                        ArrayList arrayList2 = b5Var2.f9048g;
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
                this.f9104c.u();
                return;
            default:
                long j12 = ((TL_stars.starGiftAttributePattern) w41Var.G).document.f22398id;
                b5 b5Var3 = this.f9103b.f9329c;
                HashSet hashSet5 = b5Var3.f9052l;
                HashSet hashSet6 = b5Var3.f9052l;
                if (!hashSet5.contains(Long.valueOf(j12))) {
                    if (hashSet6.isEmpty()) {
                        ArrayList arrayList3 = b5Var3.h;
                        int size3 = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj8 = arrayList3.get(i14);
                            i14++;
                            long j13 = ((TL_stars.starGiftAttributePattern) obj8).document.f22398id;
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
                this.f9104c.u();
                return;
        }
    }
}
