package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class t42 implements pt2 {
    public final byte a;

    public t42(byte b) {
        this.a = b;
    }

    @Override
    public final void accept(Object obj) {
        boolean z;
        boolean z2;
        long j;
        boolean z3 = true;
        switch (this.a) {
            case 0:
                View view = (View) obj;
                boolean z4 = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof d88) {
                    d88 d88Var = (d88) view;
                    if (d88Var.getPhotoEntry() != null && d88Var.getPhotoEntry().M) {
                        z = true;
                    } else {
                        z = false;
                    }
                    d88Var.c(z, Float.valueOf(250.0f));
                    if (d88Var.getPhotoEntry() != null && d88Var.getPhotoEntry().c()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    d88Var.setHighQuality(z2);
                    if (d88Var.getPhotoEntry() != null) {
                        j = d88Var.getPhotoEntry().N;
                    } else {
                        j = 0;
                    }
                    if (ChatAttachAlertPhotoLayout.t1.size() <= 1) {
                        z3 = false;
                    }
                    d88Var.f(j, z3);
                    return;
                }
                return;
            case 1:
                TLRPC.User user = (TLRPC.User) obj;
                return;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof nw9) {
                    ((nw9) view2).a(false, true);
                    return;
                }
                return;
            default:
                View view3 = (View) obj;
                if (view3 instanceof nw9) {
                    ((nw9) view3).a(false, true);
                    return;
                }
                return;
        }
    }
}
