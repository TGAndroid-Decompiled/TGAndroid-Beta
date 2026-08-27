package gh;

import java.util.ArrayList;
import java.util.HashSet;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.n41;

public final class k5 implements Utilities.Callback5 {

    public final int f7401a;

    public final w5 f7402b;

    public final b70 f7403c;

    public k5(w5 w5Var, b70 b70Var, int i10) {
        this.f7401a = i10;
        this.f7402b = w5Var;
        this.f7403c = b70Var;
    }

    @Override
    public final void mo18run(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        n41 n41Var = (n41) obj;
        switch (this.f7401a) {
            case 0:
                long j10 = ((TL_stars.starGiftAttributeModel) n41Var.G).document.f22386id;
                i5 i5Var = this.f7402b.f7607c;
                HashSet hashSet = i5Var.f7330j;
                HashSet hashSet2 = i5Var.f7330j;
                if (hashSet.contains(Long.valueOf(j10))) {
                    hashSet2.remove(Long.valueOf(j10));
                } else if (hashSet2.isEmpty()) {
                    ArrayList arrayList = i5Var.f7327f;
                    int size = arrayList.size();
                    int i10 = 0;
                    while (i10 < size) {
                        Object obj6 = arrayList.get(i10);
                        i10++;
                        long j11 = ((TL_stars.starGiftAttributeModel) obj6).document.f22386id;
                        if (j11 != j10) {
                            hashSet2.add(Long.valueOf(j11));
                        }
                    }
                } else {
                    hashSet2.add(Long.valueOf(j10));
                }
                i5Var.h();
                this.f7403c.u();
                break;
            case 1:
                int i11 = ((TL_stars.starGiftAttributeBackdrop) n41Var.G).backdrop_id;
                i5 i5Var2 = this.f7402b.f7607c;
                HashSet hashSet3 = i5Var2.f7331k;
                HashSet hashSet4 = i5Var2.f7331k;
                if (hashSet3.contains(Integer.valueOf(i11))) {
                    hashSet4.remove(Integer.valueOf(i11));
                } else if (hashSet4.isEmpty()) {
                    ArrayList arrayList2 = i5Var2.f7328g;
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
                i5Var2.h();
                this.f7403c.u();
                break;
            default:
                long j12 = ((TL_stars.starGiftAttributePattern) n41Var.G).document.f22386id;
                i5 i5Var3 = this.f7402b.f7607c;
                HashSet hashSet5 = i5Var3.f7332l;
                HashSet hashSet6 = i5Var3.f7332l;
                if (hashSet5.contains(Long.valueOf(j12))) {
                    hashSet6.remove(Long.valueOf(j12));
                } else if (hashSet6.isEmpty()) {
                    ArrayList arrayList3 = i5Var3.h;
                    int size3 = arrayList3.size();
                    int i14 = 0;
                    while (i14 < size3) {
                        Object obj8 = arrayList3.get(i14);
                        i14++;
                        long j13 = ((TL_stars.starGiftAttributePattern) obj8).document.f22386id;
                        if (j13 != j12) {
                            hashSet6.add(Long.valueOf(j13));
                        }
                    }
                } else {
                    hashSet6.add(Long.valueOf(j12));
                }
                i5Var3.h();
                this.f7403c.u();
                break;
        }
    }
}
