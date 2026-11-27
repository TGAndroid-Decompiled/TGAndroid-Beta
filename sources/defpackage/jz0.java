package defpackage;

import android.text.SpannableStringBuilder;
import android.util.SparseIntArray;
import java.util.ArrayList;
import java.util.Comparator;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.StickersActivity;
public final class jz0 implements Comparator {
    public final byte a;
    public final Object b;

    public jz0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final int compare(Object obj, Object obj2) {
        int a;
        int a2;
        int i;
        ?? r11;
        ?? r0;
        int i2;
        byte b = this.a;
        int i3 = Integer.MAX_VALUE;
        int i4 = 0;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = ((xz0) obj3).H;
                return Integer.compare(((uz0) arrayList.get(((Integer) obj).intValue())).b, ((uz0) arrayList.get(((Integer) obj2).intValue())).b);
            case 1:
                sz1 sz1Var = (sz1) obj3;
                return Integer.compare(sz1Var.d((m47) obj), sz1Var.d((m47) obj2));
            case 2:
                ArrayList arrayList2 = ((b04) obj3).H0.e1;
                int indexOf = arrayList2.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf2 = arrayList2.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf < 0 || indexOf2 < 0) {
                    return 0;
                }
                return indexOf - indexOf2;
            case 3:
                SparseIntArray sparseIntArray = (SparseIntArray) obj3;
                return sparseIntArray.get(((k94) obj).e, Integer.MAX_VALUE) - sparseIntArray.get(((k94) obj2).e, Integer.MAX_VALUE);
            case 4:
                vm6 vm6Var = (vm6) obj3;
                a = vm6Var.a(obj2);
                a2 = vm6Var.a(obj);
                break;
            case 5:
                int[] iArr = (int[]) obj3;
                Integer num = (Integer) obj;
                Integer num2 = (Integer) obj2;
                if (iArr[num.intValue()] < 0) {
                    i = Integer.MAX_VALUE;
                } else {
                    i = iArr[num.intValue()];
                }
                if (iArr[num2.intValue()] >= 0) {
                    i3 = iArr[num2.intValue()];
                }
                if (i != i3) {
                    return Integer.compare(i, i3);
                }
                return Integer.compare(num.intValue(), num2.intValue());
            case 6:
                float[] fArr = ((pta) obj3).r;
                return Float.compare(fArr[((Integer) obj).intValue()], fArr[((Integer) obj2).intValue()]);
            case 7:
                StickersActivity stickersActivity = (StickersActivity) obj3;
                int indexOf3 = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj);
                int indexOf4 = stickersActivity.d.indexOf((TLRPC.TL_messages_stickerSet) obj2);
                if (indexOf3 < 0 || indexOf4 < 0) {
                    return 0;
                }
                return indexOf3 - indexOf4;
            case 8:
                c6b c6bVar = (c6b) obj3;
                int i5 = c6bVar.a;
                TL_stories.PeerStories peerStories = (TL_stories.PeerStories) obj;
                TL_stories.PeerStories peerStories2 = (TL_stories.PeerStories) obj2;
                long n = wf3.n(peerStories.peer);
                long n2 = wf3.n(peerStories2.peer);
                boolean L = c6bVar.L(n);
                boolean L2 = c6bVar.L(n2);
                boolean K = c6bVar.K(n);
                boolean K2 = c6bVar.K(n2);
                boolean G = c6bVar.G(n);
                boolean G2 = c6bVar.G(n2);
                if (G != G2) {
                    return (G2 ? 1 : 0) - (G ? 1 : 0);
                } else if (L == L2) {
                    if (K == K2) {
                        boolean C = lbc.C(n);
                        boolean C2 = lbc.C(n2);
                        if (C == C2) {
                            TLRPC.User X1 = uc7.s1(i5).X1(Long.valueOf(n));
                            if (X1 == null) {
                                r11 = 0;
                            } else {
                                r11 = X1.premium;
                            }
                            TLRPC.User X12 = uc7.s1(i5).X1(Long.valueOf(n2));
                            if (X12 == null) {
                                r0 = 0;
                            } else {
                                r0 = X12.premium;
                            }
                            if (r11 == r0) {
                                if (peerStories.stories.isEmpty()) {
                                    i2 = 0;
                                } else {
                                    i2 = ((TL_stories.StoryItem) c00.g(1, peerStories.stories)).date;
                                }
                                if (!peerStories2.stories.isEmpty()) {
                                    i4 = ((TL_stories.StoryItem) c00.g(1, peerStories2.stories)).date;
                                }
                                return i4 - i2;
                            }
                            return r0 - r11;
                        }
                        return (C2 ? 1 : 0) - (C ? 1 : 0);
                    }
                    return (K2 ? 1 : 0) - (K ? 1 : 0);
                } else {
                    return (L2 ? 1 : 0) - (L ? 1 : 0);
                }
            case 9:
                ajb ajbVar = (ajb) obj3;
                TL_iv.pageTableCell pagetablecell = (TL_iv.pageTableCell) obj;
                TL_iv.pageTableCell pagetablecell2 = (TL_iv.pageTableCell) obj2;
                int b2 = ajbVar.b(pagetablecell);
                int b3 = ajbVar.b(pagetablecell2);
                if (b2 != b3) {
                    return Integer.compare(b2, b3);
                }
                return Integer.compare(ajbVar.a(pagetablecell), ajbVar.a(pagetablecell2));
            default:
                SpannableStringBuilder spannableStringBuilder = (SpannableStringBuilder) obj3;
                a = spannableStringBuilder.getSpanStart((fmb) obj2);
                a2 = spannableStringBuilder.getSpanStart((fmb) obj);
                break;
        }
        return a - a2;
    }
}
