package fh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.x60;
public final class r5 implements Utilities.Callback5 {
    public final int f6741a;
    public final e6 f6742b;
    public final x60 f6743c;

    public r5(e6 e6Var, x60 x60Var, int i9) {
        this.f6741a = i9;
        this.f6742b = e6Var;
        this.f6743c = x60Var;
    }

    @Override
    public final void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        l41 l41Var = (l41) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f10 = (Float) obj4;
        Float f11 = (Float) obj5;
        switch (this.f6741a) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributeModel) l41Var.G).document.f22386id;
                p5 p5Var = this.f6742b.f6430c;
                HashSet hashSet = p5Var.f6708j;
                HashSet hashSet2 = p5Var.f6708j;
                if (!hashSet.contains(Long.valueOf(j10))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList = p5Var.f6705f;
                        int size = arrayList.size();
                        int i9 = 0;
                        while (i9 < size) {
                            Object obj6 = arrayList.get(i9);
                            i9++;
                            long j11 = ((TL_stars.starGiftAttributeModel) obj6).document.f22386id;
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
                p5Var.h();
                this.f6743c.u();
                return;
            case 1:
                int i10 = ((TL_stars.starGiftAttributeBackdrop) l41Var.G).backdrop_id;
                p5 p5Var2 = this.f6742b.f6430c;
                HashSet hashSet3 = p5Var2.f6709k;
                HashSet hashSet4 = p5Var2.f6709k;
                if (!hashSet3.contains(Integer.valueOf(i10))) {
                    if (hashSet4.isEmpty()) {
                        ArrayList arrayList2 = p5Var2.f6706g;
                        int size2 = arrayList2.size();
                        int i11 = 0;
                        while (i11 < size2) {
                            Object obj7 = arrayList2.get(i11);
                            i11++;
                            int i12 = ((TL_stars.starGiftAttributeBackdrop) obj7).backdrop_id;
                            if (i12 != i10) {
                                hashSet4.add(Integer.valueOf(i12));
                            }
                        }
                    } else {
                        hashSet4.add(Integer.valueOf(i10));
                    }
                } else {
                    hashSet4.remove(Integer.valueOf(i10));
                }
                p5Var2.h();
                this.f6743c.u();
                return;
            default:
                long j12 = ((TL_stars.starGiftAttributePattern) l41Var.G).document.f22386id;
                p5 p5Var3 = this.f6742b.f6430c;
                HashSet hashSet5 = p5Var3.f6710l;
                HashSet hashSet6 = p5Var3.f6710l;
                if (!hashSet5.contains(Long.valueOf(j12))) {
                    if (hashSet6.isEmpty()) {
                        ArrayList arrayList3 = p5Var3.h;
                        int size3 = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            Object obj8 = arrayList3.get(i13);
                            i13++;
                            long j13 = ((TL_stars.starGiftAttributePattern) obj8).document.f22386id;
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
                p5Var3.h();
                this.f6743c.u();
                return;
        }
    }
}
