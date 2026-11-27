package defpackage;

import android.view.View;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class kf1 extends yc8 {
    public final wf1 a;

    public kf1(wf1 wf1Var) {
        this.a = wf1Var;
    }

    @Override
    public final fd8 M(r47 r47Var, TLRPC.FileLocation fileLocation, int i, boolean z, boolean z2) {
        dl1 dl1Var;
        r47 messageObject;
        wb2 wb2Var;
        r47 messageObject2;
        wf1 wf1Var = this.a;
        int childCount = wf1Var.w.getChildCount();
        int i2 = 0;
        while (true) {
            ImageReceiver imageReceiver = null;
            if (i2 >= childCount) {
                return null;
            }
            View childAt = wf1Var.w.getChildAt(i2);
            if (childAt instanceof wb2) {
                if (r47Var != null && (messageObject2 = (wb2Var = (wb2) childAt).getMessageObject()) != null && messageObject2.e1() == r47Var.e1()) {
                    imageReceiver = wb2Var.getPhotoImage();
                }
            } else if ((childAt instanceof dl1) && (messageObject = (dl1Var = (dl1) childAt).getMessageObject()) != null) {
                if (r47Var != null) {
                    if (messageObject.e1() == r47Var.e1()) {
                        imageReceiver = dl1Var.getPhotoImage();
                    }
                } else if (fileLocation != null && messageObject.p0 != null) {
                    int i3 = 0;
                    while (true) {
                        if (i3 >= messageObject.p0.size()) {
                            break;
                        }
                        TLRPC.FileLocation fileLocation2 = ((TLRPC.PhotoSize) messageObject.p0.get(i3)).location;
                        if (fileLocation2.volume_id == fileLocation.volume_id && fileLocation2.local_id == fileLocation.local_id) {
                            imageReceiver = dl1Var.getPhotoImage();
                            break;
                        }
                        i3++;
                    }
                }
            }
            if (imageReceiver != null) {
                int[] iArr = new int[2];
                childAt.getLocationInWindow(iArr);
                fd8 fd8Var = new fd8();
                fd8Var.b = iArr[0];
                fd8Var.c = iArr[1];
                fd8Var.d = wf1Var.w;
                fd8Var.a = imageReceiver;
                fd8Var.e = imageReceiver.p();
                fd8Var.h = imageReceiver.z();
                fd8Var.l = true;
                return fd8Var;
            }
            i2++;
        }
    }
}
