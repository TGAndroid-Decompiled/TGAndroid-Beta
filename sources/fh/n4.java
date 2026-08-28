package fh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.x60;
public final class n4 implements Utilities.Callback5 {
    public final int f6643a;
    public final g6 f6644b;
    public final x60 f6645c;

    public n4(g6 g6Var, x60 x60Var, int i9) {
        this.f6643a = i9;
        this.f6644b = g6Var;
        this.f6645c = x60Var;
    }

    @Override
    public final void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i9 = this.f6643a;
        l41 l41Var = (l41) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f10 = (Float) obj4;
        Float f11 = (Float) obj5;
        g6 g6Var = this.f6644b;
        g6Var.getClass();
        switch (i9) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributePattern) l41Var.G).document.f22386id;
                p5 p5Var = g6Var.d;
                HashSet hashSet = p5Var.f6710l;
                if (!hashSet.contains(Long.valueOf(j10))) {
                    if (hashSet.isEmpty()) {
                        ArrayList arrayList = p5Var.h;
                        int size = arrayList.size();
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj6 = arrayList.get(i10);
                            i10++;
                            long j11 = ((TL_stars.starGiftAttributePattern) obj6).document.f22386id;
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
                p5Var.h();
                this.f6645c.u();
                return;
            case 1:
                int i11 = ((TL_stars.starGiftAttributeBackdrop) l41Var.G).backdrop_id;
                p5 p5Var2 = g6Var.d;
                HashSet hashSet2 = p5Var2.f6709k;
                if (!hashSet2.contains(Integer.valueOf(i11))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList2 = p5Var2.f6706g;
                        int size2 = arrayList2.size();
                        int i12 = 0;
                        while (i12 < size2) {
                            Object obj7 = arrayList2.get(i12);
                            i12++;
                            int i13 = ((TL_stars.starGiftAttributeBackdrop) obj7).backdrop_id;
                            if (i13 != i11) {
                                hashSet2.add(Integer.valueOf(i13));
                            }
                        }
                    } else {
                        hashSet2.add(Integer.valueOf(i11));
                    }
                } else {
                    hashSet2.remove(Integer.valueOf(i11));
                }
                p5Var2.h();
                this.f6645c.u();
                return;
            default:
                long j12 = ((TL_stars.starGiftAttributeModel) l41Var.G).document.f22386id;
                p5 p5Var3 = g6Var.d;
                HashSet hashSet3 = p5Var3.f6708j;
                if (!hashSet3.contains(Long.valueOf(j12))) {
                    if (hashSet3.isEmpty()) {
                        ArrayList arrayList3 = p5Var3.f6705f;
                        int size3 = arrayList3.size();
                        int i14 = 0;
                        while (i14 < size3) {
                            Object obj8 = arrayList3.get(i14);
                            i14++;
                            long j13 = ((TL_stars.starGiftAttributeModel) obj8).document.f22386id;
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
                p5Var3.h();
                this.f6645c.u();
                return;
        }
    }
}
