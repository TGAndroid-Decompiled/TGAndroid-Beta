package ci;

import android.util.SparseIntArray;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.hp;
import org.telegram.messenger.l10;
import org.telegram.messenger.pe;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
public final class y4 implements Comparator {
    public final int f6397a;
    public final Object f6398b;

    public y4(Object obj, int i3) {
        this.f6397a = i3;
        this.f6398b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ?? r02;
        ?? r12;
        int i3;
        int indexOf;
        int indexOf2;
        switch (this.f6397a) {
            case 0:
                float[] fArr = ((b5) this.f6398b).f4871r;
                return Float.compare(fArr[((Integer) obj).intValue()], fArr[((Integer) obj2).intValue()]);
            case 1:
                ei.z6 z6Var = (ei.z6) this.f6398b;
                int i10 = z6Var.f11274a;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                long o10 = org.telegram.messenger.m5.o(peerStories.peer);
                long o11 = org.telegram.messenger.m5.o(peerStories2.peer);
                boolean M = z6Var.M(o10);
                boolean M2 = z6Var.M(o11);
                boolean L = z6Var.L(o10);
                boolean L2 = z6Var.L(o11);
                boolean H = z6Var.H(o10);
                boolean H2 = z6Var.H(o11);
                if (H != H2) {
                    return (H2 ? 1 : 0) - (H ? 1 : 0);
                }
                if (M == M2) {
                    if (L == L2) {
                        boolean A = l10.A(o10);
                        boolean A2 = l10.A(o11);
                        if (A == A2) {
                            TLRPC.User a22 = hp.s1(i10).a2(Long.valueOf(o10));
                            int i11 = 0;
                            if (a22 == null) {
                                r02 = 0;
                            } else {
                                r02 = a22.premium;
                            }
                            TLRPC.User a23 = hp.s1(i10).a2(Long.valueOf(o11));
                            if (a23 == null) {
                                r12 = 0;
                            } else {
                                r12 = a23.premium;
                            }
                            if (r02 == r12) {
                                if (peerStories.stories.isEmpty()) {
                                    i3 = 0;
                                } else {
                                    i3 = ((TL_stories.StoryItem) k2.p1.h(1, peerStories.stories)).date;
                                }
                                if (!peerStories2.stories.isEmpty()) {
                                    i11 = ((TL_stories.StoryItem) k2.p1.h(1, peerStories2.stories)).date;
                                }
                                return i11 - i3;
                            }
                            return r12 - r02;
                        }
                        return (A2 ? 1 : 0) - (A ? 1 : 0);
                    }
                    return (L2 ? 1 : 0) - (L ? 1 : 0);
                }
                return (M2 ? 1 : 0) - (M ? 1 : 0);
            case 2:
                ArrayList arrayList = (ArrayList) this.f6398b;
                pe peVar = (pe) obj;
                pe peVar2 = (pe) obj2;
                int i12 = peVar.f24735a;
                if (i12 != 0 || peVar2.f24735a == 0) {
                    if ((i12 != 0 && peVar2.f24735a == 0) || (indexOf = arrayList.indexOf(peVar)) > (indexOf2 = arrayList.indexOf(peVar2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            case 3:
                mi.f6 f6Var = (mi.f6) this.f6398b;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                int b10 = f6Var.b(pagetablecell);
                int b11 = f6Var.b(pagetablecell2);
                if (b10 != b11) {
                    return Integer.compare(b10, b11);
                }
                return Integer.compare(f6Var.a(pagetablecell), f6Var.a(pagetablecell2));
            case 4:
                t2.v vVar = (t2.v) this.f6398b;
                return vVar.a(obj2) - vVar.a(obj);
            case 5:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f6398b;
                return sparseIntArray.get(((vg.g) obj).f56614e, Integer.MAX_VALUE) - sparseIntArray.get(((vg.g) obj2).f56614e, Integer.MAX_VALUE);
            default:
                return ((Collator) this.f6398b).compare((String) obj, (String) obj2);
        }
    }
}
