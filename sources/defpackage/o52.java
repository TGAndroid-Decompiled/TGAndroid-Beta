package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class o52 implements gu2 {
    public final byte a;

    public o52(byte b) {
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
                if (view instanceof q68) {
                    q68 q68Var = (q68) view;
                    if (q68Var.getPhotoEntry() != null && q68Var.getPhotoEntry().M) {
                        z = true;
                    } else {
                        z = false;
                    }
                    q68Var.c(z, Float.valueOf(250.0f));
                    if (q68Var.getPhotoEntry() != null && q68Var.getPhotoEntry().c()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    q68Var.setHighQuality(z2);
                    if (q68Var.getPhotoEntry() != null) {
                        j = q68Var.getPhotoEntry().N;
                    } else {
                        j = 0;
                    }
                    if (ChatAttachAlertPhotoLayout.t1.size() <= 1) {
                        z3 = false;
                    }
                    q68Var.f(j, z3);
                    return;
                }
                return;
            case 1:
                TLRPC.User user = (TLRPC.User) obj;
                return;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof wu9) {
                    ((wu9) view2).a(false, true);
                    return;
                }
                return;
            default:
                View view3 = (View) obj;
                if (view3 instanceof wu9) {
                    ((wu9) view3).a(false, true);
                    return;
                }
                return;
        }
    }
}
