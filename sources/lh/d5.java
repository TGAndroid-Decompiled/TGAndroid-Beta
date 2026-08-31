package lh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.q70;
public final class d5 implements Utilities.Callback5 {
    public final int f12672a;
    public final p5 f12673b;
    public final q70 f12674c;

    public d5(p5 p5Var, q70 q70Var, int i10) {
        this.f12672a = i10;
        this.f12673b = p5Var;
        this.f12674c = q70Var;
    }

    @Override
    public final void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        j51 j51Var = (j51) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f10 = (Float) obj4;
        Float f11 = (Float) obj5;
        switch (this.f12672a) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributeModel) j51Var.G).document.f20849id;
                b5 b5Var = this.f12673b.f12896c;
                HashSet hashSet = b5Var.f12625j;
                HashSet hashSet2 = b5Var.f12625j;
                if (!hashSet.contains(Long.valueOf(j10))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList = b5Var.f12622f;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj6 = arrayList.get(i10);
                            i10++;
                            long j11 = ((TL_stars.starGiftAttributeModel) obj6).document.f20849id;
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
                this.f12674c.u();
                return;
            case 1:
                int i11 = ((TL_stars.starGiftAttributeBackdrop) j51Var.G).backdrop_id;
                b5 b5Var2 = this.f12673b.f12896c;
                HashSet hashSet3 = b5Var2.f12626k;
                HashSet hashSet4 = b5Var2.f12626k;
                if (!hashSet3.contains(Integer.valueOf(i11))) {
                    if (hashSet4.isEmpty()) {
                        ArrayList arrayList2 = b5Var2.f12623g;
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
                this.f12674c.u();
                return;
            default:
                long j12 = ((TL_stars.starGiftAttributePattern) j51Var.G).document.f20849id;
                b5 b5Var3 = this.f12673b.f12896c;
                HashSet hashSet5 = b5Var3.f12627l;
                HashSet hashSet6 = b5Var3.f12627l;
                if (!hashSet5.contains(Long.valueOf(j12))) {
                    if (hashSet6.isEmpty()) {
                        ArrayList arrayList3 = b5Var3.h;
                        int size3 = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj8 = arrayList3.get(i14);
                            i14++;
                            long j13 = ((TL_stars.starGiftAttributePattern) obj8).document.f20849id;
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
                this.f12674c.u();
                return;
        }
    }
}
