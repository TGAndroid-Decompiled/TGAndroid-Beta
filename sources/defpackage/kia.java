package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class kia extends yc8 {
    public final lia a;

    public kia(lia liaVar) {
        this.a = liaVar;
    }

    @Override
    public final boolean K() {
        return true;
    }

    @Override
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        ImageReceiver imageReceiver;
        wb2 wb2Var;
        r47 messageObject;
        nia niaVar = this.a.c;
        jga jgaVar = niaVar.r;
        if (jgaVar != null) {
            int childCount = jgaVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = niaVar.r.getChildAt(i2);
                if ((childAt instanceof wb2) && r47Var != null && (messageObject = (wb2Var = (wb2) childAt).getMessageObject()) != null && messageObject.e1() == r47Var.e1()) {
                    ArrayList arrayList = messageObject.s0;
                    if (arrayList != null && i >= 0 && i < arrayList.size()) {
                        imageReceiver = wb2Var.V1(((Integer) messageObject.s0.get(i)).intValue());
                    } else {
                        imageReceiver = wb2Var.V1(i);
                    }
                } else {
                    imageReceiver = null;
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    fd8 fd8Var = new fd8();
                    fd8Var.b = iArr[0];
                    fd8Var.c = childAt.getPaddingTop() + iArr[1];
                    fd8Var.d = niaVar.r;
                    fd8Var.m = null;
                    fd8Var.a = imageReceiver;
                    if (z) {
                        fd8Var.e = imageReceiver.p();
                    }
                    fd8Var.h = imageReceiver.z();
                    fd8Var.j = 0;
                    fd8Var.i = 0;
                    return fd8Var;
                }
            }
        }
        return null;
    }
}
