package defpackage;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class bf1 extends i98 {
    public final nf1 a;

    public bf1(nf1 nf1Var) {
        this.a = nf1Var;
    }

    @Override
    public final p98 M(k27 k27Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        uk1 uk1Var;
        k27 messageObject;
        gb2 gb2Var;
        k27 messageObject2;
        nf1 nf1Var = this.a;
        int childCount = nf1Var.w.getChildCount();
        int i2 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i2 >= childCount) {
                return null;
            }
            View childAt = nf1Var.w.getChildAt(i2);
            if (childAt instanceof gb2) {
                if (k27Var != null && (messageObject2 = (gb2Var = (gb2) childAt).getMessageObject()) != null && messageObject2.e1() == k27Var.e1()) {
                    imageReceiver = gb2Var.getPhotoImage();
                }
            } else if ((childAt instanceof uk1) && (messageObject = (uk1Var = (uk1) childAt).getMessageObject()) != null) {
                if (k27Var != null) {
                    if (messageObject.e1() == k27Var.e1()) {
                        imageReceiver = uk1Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject.p0 != null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= messageObject.p0.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = ((TLRPC.PhotoSize) messageObject.p0.get(i3)).location;
                        if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                            imageReceiver = uk1Var.getPhotoImage();
                            break;
                        }
                        i3++;
                    }
                }
            }
            if (imageReceiver != null) {
                int[] iArr = new int[2];
                childAt.getLocationInWindow(iArr);
                p98 p98Var = new p98();
                p98Var.b = iArr[0];
                p98Var.c = iArr[1];
                p98Var.d = nf1Var.w;
                p98Var.a = imageReceiver;
                p98Var.e = imageReceiver.p();
                p98Var.h = imageReceiver.z();
                p98Var.l = true;
                return p98Var;
            }
            i2++;
        }
    }
}
