package defpackage;

import android.view.View;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class d42 implements vs2 {
    public final byte a;

    public d42(byte b) {
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
                if (view instanceof o48) {
                    o48 o48Var = (o48) view;
                    if (o48Var.getPhotoEntry() != null && o48Var.getPhotoEntry().M) {
                        z = true;
                    } else {
                        z = false;
                    }
                    o48Var.c(z, Float.valueOf(250.0f));
                    if (o48Var.getPhotoEntry() != null && o48Var.getPhotoEntry().c()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    o48Var.setHighQuality(z2);
                    if (o48Var.getPhotoEntry() != null) {
                        j = o48Var.getPhotoEntry().N;
                    } else {
                        j = 0;
                    }
                    if (ChatAttachAlertPhotoLayout.t1.size() <= 1) {
                        z3 = false;
                    }
                    o48Var.f(j, z3);
                    return;
                }
                return;
            case 1:
                TLRPC.User user = (TLRPC.User) obj;
                return;
            case 2:
                View view2 = (View) obj;
                if (view2 instanceof us9) {
                    ((us9) view2).a(false, true);
                    return;
                }
                return;
            default:
                View view3 = (View) obj;
                if (view3 instanceof us9) {
                    ((us9) view3).a(false, true);
                    return;
                }
                return;
        }
    }
}
