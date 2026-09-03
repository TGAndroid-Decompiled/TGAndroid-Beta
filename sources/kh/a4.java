package kh;

import android.view.View;
import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.p70;
public final class a4 implements Utilities.Callback5 {
    public final int f10577a;
    public final q5 f10578b;
    public final p70 f10579c;

    public a4(q5 q5Var, p70 p70Var, int i10) {
        this.f10577a = i10;
        this.f10578b = q5Var;
        this.f10579c = p70Var;
    }

    @Override
    public final void mo27run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = this.f10577a;
        i51 i51Var = (i51) obj;
        View view = (View) obj2;
        Integer num = (Integer) obj3;
        Float f10 = (Float) obj4;
        Float f11 = (Float) obj5;
        q5 q5Var = this.f10578b;
        q5Var.getClass();
        switch (i10) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributePattern) i51Var.G).document.f19165id;
                a5 a5Var = q5Var.d;
                HashSet hashSet = a5Var.f10588l;
                if (!hashSet.contains(Long.valueOf(j10))) {
                    if (hashSet.isEmpty()) {
                        ArrayList arrayList = a5Var.h;
                        int size = arrayList.size();
                        int i11 = 0;
                        while (i11 < size) {
                            Object obj6 = arrayList.get(i11);
                            i11++;
                            long j11 = ((TL_stars.starGiftAttributePattern) obj6).document.f19165id;
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
                a5Var.h();
                this.f10579c.u();
                return;
            case 1:
                int i12 = ((TL_stars.starGiftAttributeBackdrop) i51Var.G).backdrop_id;
                a5 a5Var2 = q5Var.d;
                HashSet hashSet2 = a5Var2.f10587k;
                if (!hashSet2.contains(Integer.valueOf(i12))) {
                    if (hashSet2.isEmpty()) {
                        ArrayList arrayList2 = a5Var2.f10584g;
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
                a5Var2.h();
                this.f10579c.u();
                return;
            default:
                long j12 = ((TL_stars.starGiftAttributeModel) i51Var.G).document.f19165id;
                a5 a5Var3 = q5Var.d;
                HashSet hashSet3 = a5Var3.f10586j;
                if (!hashSet3.contains(Long.valueOf(j12))) {
                    if (hashSet3.isEmpty()) {
                        ArrayList arrayList3 = a5Var3.f10583f;
                        int size3 = arrayList3.size();
                        int i15 = 0;
                        while (i15 < size3) {
                            Object obj8 = arrayList3.get(i15);
                            i15++;
                            long j13 = ((TL_stars.starGiftAttributeModel) obj8).document.f19165id;
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
                a5Var3.h();
                this.f10579c.u();
                return;
        }
    }
}
