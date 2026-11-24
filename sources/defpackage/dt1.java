package defpackage;

import android.graphics.Rect;
import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public final class dt1 extends i98 {
    public final ArrayList a;
    public final int[] b = new int[2];
    public final mu1 c;

    public dt1(mu1 mu1Var, ArrayList arrayList) {
        this.c = mu1Var;
        this.a = arrayList;
    }

    @Override
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        char c;
        char c2;
        ImageReceiver imageReceiver;
        gb2 gb2Var;
        k27 messageObject;
        rh9 rh9Var;
        TL_iv.PageBlock pageBlock;
        ImageReceiver imageReceiver2;
        dt1 dt1Var = this;
        mu1 mu1Var = dt1Var.c;
        if (mu1Var.A0 != null && i >= 0) {
            ArrayList arrayList = dt1Var.a;
            if (i < arrayList.size()) {
                TL_iv.PageBlock pageBlock2 = (TL_iv.PageBlock) arrayList.get(i);
                int childCount = mu1Var.A0.getChildCount();
                int i2 = 0;
                while (i2 < childCount) {
                    View childAt = mu1Var.A0.getChildAt(i2);
                    boolean z3 = childAt instanceof gb2;
                    int[] iArr = dt1Var.b;
                    if (z3 && (messageObject = (gb2Var = (gb2) childAt).getMessageObject()) != null && (rh9Var = messageObject.y2) != null) {
                        int[] iArr2 = new int[2];
                        ArrayList arrayList2 = rh9Var.g;
                        int i3 = 0;
                        while (true) {
                            if (i3 < arrayList2.size()) {
                                mg9 mg9Var = (mg9) arrayList2.get(i3);
                                if (mg9Var instanceof ah9) {
                                    ah9 ah9Var = (ah9) mg9Var;
                                    pageBlock = ah9Var.r0;
                                    imageReceiver2 = ah9Var.Y;
                                } else if (mg9Var instanceof mh9) {
                                    mh9 mh9Var = (mh9) mg9Var;
                                    TL_iv.pageBlockVideo pageblockvideo = mh9Var.r0;
                                    imageReceiver2 = mh9Var.Y;
                                    pageBlock = pageblockvideo;
                                } else if (mg9Var instanceof sg9) {
                                    ArrayList arrayList3 = ((sg9) mg9Var).Y;
                                    int size = arrayList3.size();
                                    c = 0;
                                    int i4 = 0;
                                    while (i4 < size) {
                                        Object obj = arrayList3.get(i4);
                                        i4++;
                                        c2 = 1;
                                        gg9 gg9Var = (gg9) obj;
                                        if (gg9Var.b == pageBlock2) {
                                            Rect rect = mg9Var.b;
                                            iArr2[0] = rect.left;
                                            iArr2[1] = mg9Var.U + rect.top;
                                            imageReceiver = gg9Var.c;
                                            break;
                                        }
                                    }
                                    continue;
                                    i3++;
                                } else {
                                    c = 0;
                                    c2 = 1;
                                    if (mg9Var instanceof eh9) {
                                        eh9 eh9Var = (eh9) mg9Var;
                                        ArrayList arrayList4 = eh9Var.Y;
                                        int i5 = eh9Var.b0;
                                        if (i5 >= 0 && i5 < arrayList4.size() && ((gg9) arrayList4.get(i5)).b == pageBlock2) {
                                            Rect rect2 = mg9Var.b;
                                            iArr2[0] = rect2.left;
                                            iArr2[1] = mg9Var.U + rect2.top;
                                            imageReceiver = ((gg9) arrayList4.get(i5)).c;
                                            break;
                                        }
                                        i3++;
                                    } else {
                                        pageBlock = null;
                                        imageReceiver2 = null;
                                        if (pageBlock == pageBlock2 && imageReceiver2 != null) {
                                            Rect rect3 = mg9Var.b;
                                            iArr2[c] = rect3.left;
                                            iArr2[c2] = mg9Var.U + rect3.top;
                                            imageReceiver = imageReceiver2;
                                            break;
                                        }
                                        i3++;
                                    }
                                }
                                c = 0;
                                c2 = 1;
                                if (pageBlock == pageBlock2) {
                                    Rect rect32 = mg9Var.b;
                                    iArr2[c] = rect32.left;
                                    iArr2[c2] = mg9Var.U + rect32.top;
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
                            iArr[c] = gb2Var.getTextX() + iArr2[c] + iArr[c];
                            iArr[c2] = gb2Var.getTextY() + iArr2[c2] + iArr[c2];
                        }
                    } else {
                        c = 0;
                        c2 = 1;
                        imageReceiver = null;
                    }
                    if (imageReceiver == null) {
                        i2++;
                        dt1Var = this;
                    } else {
                        p98 p98Var = new p98();
                        p98Var.b = iArr[c];
                        p98Var.c = iArr[c2];
                        p98Var.d = mu1Var.A0;
                        p98Var.a = imageReceiver;
                        p98Var.e = imageReceiver.p();
                        p98Var.h = imageReceiver.z();
                        p98Var.j = (int) ((mu1Var.P9 - mu1Var.R9) - gl.L(4.0f));
                        p98Var.i = (int) (mu1Var.k7(gxb.c) + mu1Var.w.d() + gl.L(9.0f) + mu1Var.Ya + mu1Var.ad);
                        return p98Var;
                    }
                }
                return null;
            }
            return null;
        }
        return null;
    }
}
