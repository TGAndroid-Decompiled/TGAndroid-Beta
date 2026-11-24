package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class pu1 extends jb8 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final yv1 c;

    public pu1(yv1 yv1Var, ArrayList arrayList) {
        this.c = yv1Var;
        this.a = arrayList;
    }

    @Override
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        char c;
        char c2;
        ImageReceiver imageReceiver;
        rc2 rc2Var;
        k47 messageObject;
        uj9 uj9Var;
        TL_iv.PageBlock pageBlock;
        ImageReceiver imageReceiver2;
        pu1 pu1Var = this;
        yv1 yv1Var = pu1Var.c;
        if (yv1Var.A0 != null && i >= 0) {
            ArrayList arrayList = pu1Var.a;
            if (i < arrayList.size()) {
                TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) arrayList.get(i);
                int childCount = yv1Var.A0.getChildCount();
                int i2 = 0;
                while (i2 < childCount) {
                    View childAt = yv1Var.A0.getChildAt(i2);
                    boolean z3 = childAt instanceof rc2;
                    int[] iArr = pu1Var.b;
                    if (z3 && (messageObject = (rc2Var = (rc2) childAt).getMessageObject()) != null && (uj9Var = messageObject.y2) != null) {
                        int[] iArr2 = new int[2];
                        ArrayList arrayList2 = uj9Var.g;
                        int i3 = 0;
                        while (true) {
                            if (i3 < arrayList2.size()) {
                                qi9 qi9Var = (qi9) arrayList2.get(i3);
                                if (qi9Var instanceof dj9) {
                                    dj9 dj9Var = (dj9) qi9Var;
                                    pageBlock = dj9Var.r0;
                                    imageReceiver2 = dj9Var.Y;
                                } else if (qi9Var instanceof pj9) {
                                    pj9 pj9Var = (pj9) qi9Var;
                                    TL_iv.pageBlockVideo pageblockvideo = pj9Var.r0;
                                    imageReceiver2 = pj9Var.Y;
                                    pageBlock = pageblockvideo;
                                } else if (qi9Var instanceof vi9) {
                                    ArrayList arrayList3 = ((vi9) qi9Var).Y;
                                    int size = arrayList3.size();
                                    c = 0;
                                    int i4 = 0;
                                    while (i4 < size) {
                                        Object obj = arrayList3.get(i4);
                                        i4++;
                                        c2 = 1;
                                        ki9 ki9Var = (ki9) obj;
                                        if (ki9Var.b == pageBlock2) {
                                            Rect rect = qi9Var.b;
                                            iArr2[0] = rect.left;
                                            iArr2[1] = qi9Var.U + rect.top;
                                            imageReceiver = ki9Var.c;
                                            break;
                                        }
                                    }
                                    continue;
                                    i3++;
                                } else {
                                    c = 0;
                                    c2 = 1;
                                    if (qi9Var instanceof hj9) {
                                        hj9 hj9Var = (hj9) qi9Var;
                                        ArrayList arrayList4 = hj9Var.Y;
                                        int i5 = hj9Var.b0;
                                        if (i5 >= 0 && i5 < arrayList4.size() && ((ki9) arrayList4.get(i5)).b == pageBlock2) {
                                            Rect rect2 = qi9Var.b;
                                            iArr2[0] = rect2.left;
                                            iArr2[1] = qi9Var.U + rect2.top;
                                            imageReceiver = ((ki9) arrayList4.get(i5)).c;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        pageBlock = null;
                                        imageReceiver2 = null;
                                        if (pageBlock == pageBlock2 && imageReceiver2 != null) {
                                            Rect rect3 = qi9Var.b;
                                            iArr2[c] = rect3.left;
                                            iArr2[c2] = qi9Var.U + rect3.top;
                                            imageReceiver = imageReceiver2;
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                                c = 0;
                                c2 = 1;
                                if (pageBlock == pageBlock2) {
                                    Rect rect32 = qi9Var.b;
                                    iArr2[c] = rect32.left;
                                    iArr2[c2] = qi9Var.U + rect32.top;
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
                            iArr[c] = rc2Var.getTextX() + iArr2[c] + iArr[c];
                            iArr[c2] = rc2Var.getTextY() + iArr2[c2] + iArr[c2];
                        }
                    } else {
                        c = 0;
                        c2 = 1;
                        imageReceiver = null;
                    }
                    if (imageReceiver == null) {
                        i2++;
                        pu1Var = this;
                    } else {
                        qb8 qb8Var = new qb8();
                        qb8Var.b = iArr[c];
                        qb8Var.c = iArr[c2];
                        qb8Var.d = yv1Var.A0;
                        qb8Var.a = imageReceiver;
                        qb8Var.e = imageReceiver.p();
                        qb8Var.h = imageReceiver.z();
                        qb8Var.j = (int) ((yv1Var.P9 - yv1Var.R9) - gm.L(4.0f));
                        qb8Var.i = (int) (yv1Var.u7(izb.c) + yv1Var.w.d() + gm.L(9.0f) + yv1Var.Ya + yv1Var.ld);
                        return qb8Var;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
