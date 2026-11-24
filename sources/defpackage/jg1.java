package defpackage;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class jg1 extends jb8 {
    public final vg1 a;

    public jg1(vg1 vg1Var) {
        this.a = vg1Var;
    }

    @Override
    public final qb8 N(k47 k47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        cm1 cm1Var;
        k47 messageObject;
        rc2 rc2Var;
        k47 messageObject2;
        vg1 vg1Var = this.a;
        int childCount = vg1Var.w.getChildCount();
        int i2 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i2 >= childCount) {
                return null;
            }
            View childAt = vg1Var.w.getChildAt(i2);
            if (childAt instanceof rc2) {
                if (k47Var != null && (messageObject2 = (rc2Var = (rc2) childAt).getMessageObject()) != null && messageObject2.e1() == k47Var.e1()) {
                    imageReceiver = rc2Var.getPhotoImage();
                }
            } else if ((childAt instanceof cm1) && (messageObject = (cm1Var = (cm1) childAt).getMessageObject()) != null) {
                if (k47Var != null) {
                    if (messageObject.e1() == k47Var.e1()) {
                        imageReceiver = cm1Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject.p0 != null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= messageObject.p0.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = ((TLRPC.PhotoSize) messageObject.p0.get(i3)).location;
                        if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                            imageReceiver = cm1Var.getPhotoImage();
                            break;
                        }
                        i3++;
                    }
                }
            }
            if (imageReceiver != null) {
                int[] iArr = new int[2];
                childAt.getLocationInWindow(iArr);
                qb8 qb8Var = new qb8();
                qb8Var.b = iArr[0];
                qb8Var.c = iArr[1];
                qb8Var.d = vg1Var.w;
                qb8Var.a = imageReceiver;
                qb8Var.e = imageReceiver.p();
                qb8Var.h = imageReceiver.z();
                qb8Var.l = true;
                return qb8Var;
            }
            i2++;
        }
    }
}
