package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class qt1 extends yc8 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final zu1 c;

    public qt1(zu1 zu1Var, ArrayList arrayList) {
        this.c = zu1Var;
        this.a = arrayList;
    }

    @Override
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        char c;
        char c2;
        ImageReceiver imageReceiver;
        wb2 wb2Var;
        r47 messageObject;
        hl9 hl9Var;
        TL_iv.PageBlock pageBlock;
        ImageReceiver imageReceiver2;
        qt1 qt1Var = this;
        zu1 zu1Var = qt1Var.c;
        if (zu1Var.A0 != null && i >= 0) {
            ArrayList arrayList = qt1Var.a;
            if (i < arrayList.size()) {
                TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) arrayList.get(i);
                int childCount = zu1Var.A0.getChildCount();
                int i2 = 0;
                while (i2 < childCount) {
                    View childAt = zu1Var.A0.getChildAt(i2);
                    boolean z3 = childAt instanceof wb2;
                    int[] iArr = qt1Var.b;
                    if (z3 && (messageObject = (wb2Var = (wb2) childAt).getMessageObject()) != null && (hl9Var = messageObject.y2) != null) {
                        int[] iArr2 = new int[2];
                        ArrayList arrayList2 = hl9Var.g;
                        int i3 = 0;
                        while (true) {
                            if (i3 < arrayList2.size()) {
                                dk9 dk9Var = (dk9) arrayList2.get(i3);
                                if (dk9Var instanceof qk9) {
                                    qk9 qk9Var = (qk9) dk9Var;
                                    pageBlock = qk9Var.r0;
                                    imageReceiver2 = qk9Var.Y;
                                } else if (dk9Var instanceof cl9) {
                                    cl9 cl9Var = (cl9) dk9Var;
                                    TL_iv.pageBlockVideo pageblockvideo = cl9Var.r0;
                                    imageReceiver2 = cl9Var.Y;
                                    pageBlock = pageblockvideo;
                                } else if (dk9Var instanceof ik9) {
                                    ArrayList arrayList3 = ((ik9) dk9Var).Y;
                                    int size = arrayList3.size();
                                    c = 0;
                                    int i4 = 0;
                                    while (i4 < size) {
                                        Object obj = arrayList3.get(i4);
                                        i4++;
                                        c2 = 1;
                                        xj9 xj9Var = (xj9) obj;
                                        if (xj9Var.b == pageBlock2) {
                                            Rect rect = dk9Var.b;
                                            iArr2[0] = rect.left;
                                            iArr2[1] = dk9Var.U + rect.top;
                                            imageReceiver = xj9Var.c;
                                            break;
                                        }
                                    }
                                    continue;
                                    i3++;
                                } else {
                                    c = 0;
                                    c2 = 1;
                                    if (dk9Var instanceof uk9) {
                                        uk9 uk9Var = (uk9) dk9Var;
                                        ArrayList arrayList4 = uk9Var.Y;
                                        int i5 = uk9Var.b0;
                                        if (i5 >= 0 && i5 < arrayList4.size() && ((xj9) arrayList4.get(i5)).b == pageBlock2) {
                                            Rect rect2 = dk9Var.b;
                                            iArr2[0] = rect2.left;
                                            iArr2[1] = dk9Var.U + rect2.top;
                                            imageReceiver = ((xj9) arrayList4.get(i5)).c;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        pageBlock = null;
                                        imageReceiver2 = null;
                                        if (pageBlock == pageBlock2 && imageReceiver2 != null) {
                                            Rect rect3 = dk9Var.b;
                                            iArr2[c] = rect3.left;
                                            iArr2[c2] = dk9Var.U + rect3.top;
                                            imageReceiver = imageReceiver2;
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                                c = 0;
                                c2 = 1;
                                if (pageBlock == pageBlock2) {
                                    Rect rect32 = dk9Var.b;
                                    iArr2[c] = rect32.left;
                                    iArr2[c2] = dk9Var.U + rect32.top;
                                    imageReceiver = imageReceiver2;
                                    break;
                                }
                                continue;
                                i3++;
                            } else {
                                c = 0;
                                c2 = 1;
                                imageReceiver = null;
                                break;
                            }
                        }
                        if (imageReceiver != null) {
                            childAt.getLocationInWindow(iArr);
                            iArr[c] = wb2Var.getTextX() + iArr2[c] + iArr[c];
                            iArr[c2] = wb2Var.getTextY() + iArr2[c2] + iArr[c2];
                        }
                    } else {
                        c = 0;
                        c2 = 1;
                        imageReceiver = null;
                    }
                    if (imageReceiver == null) {
                        i2++;
                        qt1Var = this;
                    } else {
                        fd8 fd8Var = new fd8();
                        fd8Var.b = iArr[c];
                        fd8Var.c = iArr[c2];
                        fd8Var.d = zu1Var.A0;
                        fd8Var.a = imageReceiver;
                        fd8Var.e = imageReceiver.p();
                        fd8Var.h = imageReceiver.z();
                        fd8Var.j = (int) ((zu1Var.P9 - zu1Var.R9) - hl.L(4.0f));
                        fd8Var.i = (int) (zu1Var.u7(h1c.c) + zu1Var.w.d() + hl.L(9.0f) + zu1Var.Ya + zu1Var.od);
                        return fd8Var;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
