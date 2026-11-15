package di;

import android.util.SparseIntArray;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.ve;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
public final class p4 implements Comparator {
    public final int f9217a;
    public final Object f9218b;

    public p4(Object obj, int i7) {
        this.f9217a = i7;
        this.f9218b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ?? r02;
        ?? r12;
        int i7;
        int indexOf;
        int indexOf2;
        int i10;
        switch (this.f9217a) {
            case 0:
                float[] fArr = ((s4) this.f9218b).f9376r;
                return Float.compare(fArr[((Integer) obj).intValue()], fArr[((Integer) obj2).intValue()]);
            case 1:
                fi.s6 s6Var = (fi.s6) this.f9218b;
                int i11 = s6Var.f12319a;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                long o4 = org.telegram.messenger.m5.o(peerStories.peer);
                long o10 = org.telegram.messenger.m5.o(peerStories2.peer);
                boolean M = s6Var.M(o4);
                boolean M2 = s6Var.M(o10);
                boolean L = s6Var.L(o4);
                boolean L2 = s6Var.L(o10);
                boolean H = s6Var.H(o4);
                boolean H2 = s6Var.H(o10);
                if (H != H2) {
                    return (H2 ? 1 : 0) - (H ? 1 : 0);
                }
                if (M == M2) {
                    if (L == L2) {
                        boolean A = q10.A(o4);
                        boolean A2 = q10.A(o10);
                        if (A == A2) {
                            TLRPC.User a22 = np.s1(i11).a2(Long.valueOf(o4));
                            int i12 = 0;
                            if (a22 == null) {
                                r02 = 0;
                            } else {
                                r02 = a22.premium;
                            }
                            TLRPC.User a23 = np.s1(i11).a2(Long.valueOf(o10));
                            if (a23 == null) {
                                r12 = 0;
                            } else {
                                r12 = a23.premium;
                            }
                            if (r02 == r12) {
                                if (peerStories.stories.isEmpty()) {
                                    i7 = 0;
                                } else {
                                    i7 = ((TL_stories.StoryItem) i5.c.h(1, peerStories.stories)).date;
                                }
                                if (!peerStories2.stories.isEmpty()) {
                                    i12 = ((TL_stories.StoryItem) i5.c.h(1, peerStories2.stories)).date;
                                }
                                return i12 - i7;
                            }
                            return r12 - r02;
                        }
                        return (A2 ? 1 : 0) - (A ? 1 : 0);
                    }
                    return (L2 ? 1 : 0) - (L ? 1 : 0);
                }
                return (M2 ? 1 : 0) - (M ? 1 : 0);
            case 2:
                ArrayList arrayList = (ArrayList) this.f9218b;
                ve veVar = (ve) obj;
                ve veVar2 = (ve) obj2;
                int i13 = veVar.f26969a;
                if (i13 != 0 || veVar2.f26969a == 0) {
                    if ((i13 != 0 && veVar2.f26969a == 0) || (indexOf = arrayList.indexOf(veVar)) > (indexOf2 = arrayList.indexOf(veVar2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            case 3:
                oi.c6 c6Var = (oi.c6) this.f9218b;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                int b10 = c6Var.b(pagetablecell);
                int b11 = c6Var.b(pagetablecell2);
                if (b10 != b11) {
                    return Integer.compare(b10, b11);
                }
                return Integer.compare(c6Var.a(pagetablecell), c6Var.a(pagetablecell2));
            case 4:
                u2.v vVar = (u2.v) this.f9218b;
                return vVar.c(obj2) - vVar.c(obj);
            case 5:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f9218b;
                return sparseIntArray.get(((ug.g) obj).f58084e, Integer.MAX_VALUE) - sparseIntArray.get(((ug.g) obj2).f58084e, Integer.MAX_VALUE);
            case 6:
                return ((Collator) this.f9218b).compare((String) obj, (String) obj2);
            default:
                int[] iArr = (int[]) this.f9218b;
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                int i14 = Integer.MAX_VALUE;
                if (iArr[num.intValue()] < 0) {
                    i10 = Integer.MAX_VALUE;
                } else {
                    i10 = iArr[num.intValue()];
                }
                if (iArr[num2.intValue()] >= 0) {
                    i14 = iArr[num2.intValue()];
                }
                if (i10 != i14) {
                    return Integer.compare(i10, i14);
                }
                return Integer.compare(num.intValue(), num2.intValue());
        }
    }
}
