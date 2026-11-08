package bi;

import android.util.SparseIntArray;
import java.text.Collator;
import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.we;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
public final class s5 implements Comparator {
    public final int f4671a;
    public final Object f4672b;

    public s5(Object obj, int i7) {
        this.f4671a = i7;
        this.f4672b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        ?? r02;
        ?? r12;
        int i7;
        int indexOf;
        int indexOf2;
        int i10;
        float f10;
        switch (this.f4671a) {
            case 0:
                float[] fArr = ((w5) this.f4672b).f4969r;
                return Float.compare(fArr[((Integer) obj).intValue()], fArr[((Integer) obj2).intValue()]);
            case 1:
                di.y6 y6Var = (di.y6) this.f4672b;
                int i11 = y6Var.f9963a;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                long o4 = org.telegram.messenger.m5.o(peerStories.peer);
                long o10 = org.telegram.messenger.m5.o(peerStories2.peer);
                boolean M = y6Var.M(o4);
                boolean M2 = y6Var.M(o10);
                boolean L = y6Var.L(o4);
                boolean L2 = y6Var.L(o10);
                boolean H = y6Var.H(o4);
                boolean H2 = y6Var.H(o10);
                if (H != H2) {
                    return (H2 ? 1 : 0) - (H ? 1 : 0);
                }
                if (M == M2) {
                    if (L == L2) {
                        boolean A = t10.A(o4);
                        boolean A2 = t10.A(o10);
                        if (A == A2) {
                            TLRPC.User a22 = qp.s1(i11).a2(Long.valueOf(o4));
                            int i12 = 0;
                            if (a22 == null) {
                                r02 = 0;
                            } else {
                                r02 = a22.premium;
                            }
                            TLRPC.User a23 = qp.s1(i11).a2(Long.valueOf(o10));
                            if (a23 == null) {
                                r12 = 0;
                            } else {
                                r12 = a23.premium;
                            }
                            if (r02 == r12) {
                                if (peerStories.stories.isEmpty()) {
                                    i7 = 0;
                                } else {
                                    i7 = ((TL_stories.StoryItem) jg.g.i(1, peerStories.stories)).date;
                                }
                                if (!peerStories2.stories.isEmpty()) {
                                    i12 = ((TL_stories.StoryItem) jg.g.i(1, peerStories2.stories)).date;
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
                ArrayList arrayList = (ArrayList) this.f4672b;
                we weVar = (we) obj;
                we weVar2 = (we) obj2;
                int i13 = weVar.f26297a;
                if (i13 != 0 || weVar2.f26297a == 0) {
                    if ((i13 != 0 && weVar2.f26297a == 0) || (indexOf = arrayList.indexOf(weVar)) > (indexOf2 = arrayList.indexOf(weVar2))) {
                        return 1;
                    }
                    if (indexOf >= indexOf2) {
                        return 0;
                    }
                }
                return -1;
            case 3:
                li.e6 e6Var = (li.e6) this.f4672b;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                int b10 = e6Var.b(pagetablecell);
                int b11 = e6Var.b(pagetablecell2);
                if (b10 != b11) {
                    return Integer.compare(b10, b11);
                }
                return Integer.compare(e6Var.a(pagetablecell), e6Var.a(pagetablecell2));
            case 4:
                int[] iArr = (int[]) this.f4672b;
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
            case 5:
                float[] fArr2 = (float[]) this.f4672b;
                Integer num3 = (Integer) obj2;
                float f11 = fArr2[((Integer) obj).intValue()];
                float f12 = 0.0f;
                if (f11 > 0.0f) {
                    f10 = (float) Math.log(f11);
                } else {
                    f10 = 0.0f;
                }
                float f13 = fArr2[num3.intValue()];
                if (f13 > 0.0f) {
                    f12 = (float) Math.log(f13);
                }
                return Float.compare(f10, f12);
            case 6:
                u2.v vVar = (u2.v) this.f4672b;
                return vVar.d(obj2) - vVar.d(obj);
            case 7:
                SparseIntArray sparseIntArray = (SparseIntArray) this.f4672b;
                return sparseIntArray.get(((ug.g) obj).f56590e, Integer.MAX_VALUE) - sparseIntArray.get(((ug.g) obj2).f56590e, Integer.MAX_VALUE);
            default:
                return ((Collator) this.f4672b).compare((String) obj, (String) obj2);
        }
    }
}
