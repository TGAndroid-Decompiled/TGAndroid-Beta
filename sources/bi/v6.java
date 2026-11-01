package bi;

import android.util.SparseIntArray;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.i20;
import org.telegram.messenger.wp;
import org.telegram.messenger.xe;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
public final class v6 implements Comparator {
    public final int f3414a;
    public final Object f3415b;

    public v6(Object obj, int i10) {
        this.f3414a = i10;
        this.f3415b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ?? r02;
        ?? r12;
        int i10;
        int indexOf;
        int indexOf2;
        switch (this.f3414a) {
            case 0:
                w6 w6Var = (w6) this.f3415b;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                int b10 = w6Var.b(pagetablecell);
                int b11 = w6Var.b(pagetablecell2);
                if (b10 != b11) {
                    return Integer.compare(b10, b11);
                }
                return Integer.compare(w6Var.a(pagetablecell), w6Var.a(pagetablecell2));
            case 1:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f3415b;
                return sparseIntArray.get(((kg.j) obj).e, Integer.MAX_VALUE) - sparseIntArray.get(((kg.j) obj2).e, Integer.MAX_VALUE);
            case 2:
                return ((Collator) this.f3415b).compare((String) obj, (String) obj2);
            case 3:
                r2.v vVar = (r2.v) this.f3415b;
                return vVar.d(obj2) - vVar.d(obj);
            case 4:
                float[] fArr = ((rh.v2) this.f3415b).f47581r;
                return Float.compare(fArr[((Integer) obj).intValue()], fArr[((Integer) obj2).intValue()]);
            case 5:
                th.e5 e5Var = (th.e5) this.f3415b;
                int i11 = e5Var.f48918a;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                long o10 = org.telegram.messenger.o5.o(peerStories.peer);
                long o11 = org.telegram.messenger.o5.o(peerStories2.peer);
                boolean M = e5Var.M(o10);
                boolean M2 = e5Var.M(o11);
                boolean L = e5Var.L(o10);
                boolean L2 = e5Var.L(o11);
                boolean H = e5Var.H(o10);
                boolean H2 = e5Var.H(o11);
                if (H != H2) {
                    return (H2 ? 1 : 0) - (H ? 1 : 0);
                }
                if (M == M2) {
                    if (L == L2) {
                        boolean A = i20.A(o10);
                        boolean A2 = i20.A(o11);
                        if (A == A2) {
                            TLRPC.User Z1 = wp.r1(i11).Z1(Long.valueOf(o10));
                            int i12 = 0;
                            if (Z1 == null) {
                                r02 = 0;
                            } else {
                                r02 = Z1.premium;
                            }
                            TLRPC.User Z12 = wp.r1(i11).Z1(Long.valueOf(o11));
                            if (Z12 == null) {
                                r12 = 0;
                            } else {
                                r12 = Z12.premium;
                            }
                            if (r02 == r12) {
                                if (peerStories.stories.isEmpty()) {
                                    i10 = 0;
                                } else {
                                    i10 = ((TL_stories.StoryItem) i0.a.g(1, peerStories.stories)).date;
                                }
                                if (!peerStories2.stories.isEmpty()) {
                                    i12 = ((TL_stories.StoryItem) i0.a.g(1, peerStories2.stories)).date;
                                }
                                return i12 - i10;
                            }
                            return r12 - r02;
                        }
                        return (A2 ? 1 : 0) - (A ? 1 : 0);
                    }
                    return (L2 ? 1 : 0) - (L ? 1 : 0);
                }
                return (M2 ? 1 : 0) - (M ? 1 : 0);
            default:
                ArrayList arrayList = (ArrayList) this.f3415b;
                xe xeVar = (xe) obj;
                xe xeVar2 = (xe) obj2;
                int i13 = xeVar.f19428a;
                if (i13 != 0 || xeVar2.f19428a == 0) {
                    if ((i13 != 0 && xeVar2.f19428a == 0) || (indexOf = arrayList.indexOf(xeVar)) > (indexOf2 = arrayList.indexOf(xeVar2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
        }
    }
}
