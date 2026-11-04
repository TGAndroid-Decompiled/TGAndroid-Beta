package ai;

import android.view.View;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.s10;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.r31;
public final class y4 implements s10 {
    public final int f1115a;
    public final i6 f1116b;
    public final f60 f1117c;

    public y4(i6 i6Var, f60 f60Var, int i3) {
        this.f1115a = i3;
        this.f1116b = i6Var;
        this.f1117c = f60Var;
    }

    @Override
    public final void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        r31 r31Var = (r31) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f10 = (Float) serializable;
        Float f11 = (Float) serializable2;
        switch (this.f1115a) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributePattern) r31Var.G).document.f27007id;
                w5 w5Var = this.f1116b.d;
                HashSet hashSet = w5Var.f1076l;
                if (!hashSet.contains(Long.valueOf(j10))) {
                    if (hashSet.isEmpty()) {
                        ArrayList arrayList = w5Var.h;
                        int size = arrayList.size();
                        int i3 = 0;
                        while (i3 < size) {
                            Object obj3 = arrayList.get(i3);
                            i3++;
                            long j11 = ((TL_stars.starGiftAttributePattern) obj3).document.f27007id;
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
                w5Var.h();
                this.f1117c.u();
                return;
            case 1:
                int i10 = ((TL_stars.starGiftAttributeBackdrop) r31Var.G).backdrop_id;
                w5 w5Var2 = this.f1116b.d;
                HashSet hashSet2 = w5Var2.f1075k;
                if (!hashSet2.contains(Integer.valueOf(i10))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList2 = w5Var2.f1072g;
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
                w5Var2.h();
                this.f1117c.u();
                return;
            default:
                long j12 = ((TL_stars.starGiftAttributeModel) r31Var.G).document.f27007id;
                w5 w5Var3 = this.f1116b.d;
                HashSet hashSet3 = w5Var3.f1074j;
                if (!hashSet3.contains(Long.valueOf(j12))) {
                    if (hashSet3.isEmpty()) {
                        ArrayList arrayList3 = w5Var3.f1071f;
                        int size3 = arrayList3.size();
                        int i13 = 0;
                        while (i13 < size3) {
                            Object obj5 = arrayList3.get(i13);
                            i13++;
                            long j13 = ((TL_stars.starGiftAttributeModel) obj5).document.f27007id;
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
                w5Var3.h();
                this.f1117c.u();
                return;
        }
    }
}
