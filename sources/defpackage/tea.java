package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class tea extends i98 {
    public final uea a;

    public tea(uea ueaVar) {
        this.a = ueaVar;
    }

    @Override
    public final boolean K() {
        return true;
    }

    @Override
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        ImageReceiver imageReceiver;
        gb2 gb2Var;
        k27 messageObject;
        wea weaVar = this.a.c;
        sca scaVar = weaVar.r;
        if (scaVar != null) {
            int childCount = scaVar.getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = weaVar.r.getChildAt(i2);
                if ((childAt instanceof gb2) && k27Var != null && (messageObject = (gb2Var = (gb2) childAt).getMessageObject()) != null && messageObject.e1() == k27Var.e1()) {
                    ArrayList arrayList = messageObject.s0;
                    if (arrayList != null && i >= 0 && i < arrayList.size()) {
                        imageReceiver = gb2Var.V1(((Integer) messageObject.s0.get(i)).intValue());
                    } else {
                        imageReceiver = gb2Var.V1(i);
                    }
                } else {
                    imageReceiver = null;
                }
                if (imageReceiver != null) {
                    int[] iArr = new int[2];
                    childAt.getLocationInWindow(iArr);
                    p98 p98Var = new p98();
                    p98Var.b = iArr[0];
                    p98Var.c = childAt.getPaddingTop() + iArr[1];
                    p98Var.d = weaVar.r;
                    p98Var.m = null;
                    p98Var.a = imageReceiver;
                    if (z) {
                        p98Var.e = imageReceiver.p();
                    }
                    p98Var.h = imageReceiver.z();
                    p98Var.j = 0;
                    p98Var.i = 0;
                    return p98Var;
                }
            }
        }
        return null;
    }
}
