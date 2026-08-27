package gh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.n41;

public final class h4 implements Utilities.Callback5 {

    public final int f7289a;

    public final y5 f7290b;

    public final b70 f7291c;

    public h4(y5 y5Var, b70 b70Var, int i10) {
        this.f7289a = i10;
        this.f7290b = y5Var;
        this.f7291c = b70Var;
    }

    @Override
    public final void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        int i10 = this.f7289a;
        n41 n41Var = (n41) obj;
        y5 y5Var = this.f7290b;
        y5Var.getClass();
        switch (i10) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributePattern) n41Var.G).document.f22386id;
                i5 i5Var = y5Var.d;
                HashSet hashSet = i5Var.f7332l;
                if (hashSet.contains(Long.valueOf(j10))) {
                    hashSet.remove(Long.valueOf(j10));
                } else if (hashSet.isEmpty()) {
                    ArrayList arrayList = i5Var.h;
                    int size = arrayList.size();
                    int i11 = 0;
                    while (i11 < size) {
                        Object obj6 = arrayList.get(i11);
                        i11++;
                        long j11 = ((TL_stars.starGiftAttributePattern) obj6).document.f22386id;
                        if (j11 != j10) {
                            hashSet.add(Long.valueOf(j11));
                        }
                    }
                } else {
                    hashSet.add(Long.valueOf(j10));
                }
                i5Var.h();
                this.f7291c.u();
                break;
            case 1:
                int i12 = ((TL_stars.starGiftAttributeBackdrop) n41Var.G).backdrop_id;
                i5 i5Var2 = y5Var.d;
                HashSet hashSet2 = i5Var2.f7331k;
                if (hashSet2.contains(Integer.valueOf(i12))) {
                    hashSet2.remove(Integer.valueOf(i12));
                } else if (hashSet2.isEmpty()) {
                    ArrayList arrayList2 = i5Var2.f7328g;
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
                i5Var2.h();
                this.f7291c.u();
                break;
            default:
                long j12 = ((TL_stars.starGiftAttributeModel) n41Var.G).document.f22386id;
                i5 i5Var3 = y5Var.d;
                HashSet hashSet3 = i5Var3.f7330j;
                if (hashSet3.contains(Long.valueOf(j12))) {
                    hashSet3.remove(Long.valueOf(j12));
                } else if (hashSet3.isEmpty()) {
                    ArrayList arrayList3 = i5Var3.f7327f;
                    int size3 = arrayList3.size();
                    int i15 = 0;
                    while (i15 < size3) {
                        Object obj8 = arrayList3.get(i15);
                        i15++;
                        long j13 = ((TL_stars.starGiftAttributeModel) obj8).document.f22386id;
                        if (j13 != j12) {
                            hashSet3.add(Long.valueOf(j13));
                        }
                    }
                } else {
                    hashSet3.add(Long.valueOf(j12));
                }
                i5Var3.h();
                this.f7291c.u();
                break;
        }
    }
}
