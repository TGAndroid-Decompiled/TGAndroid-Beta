package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class t52 implements gu2 {
    public final byte a;
    public final Object b;
    public final boolean c;

    public t52(byte b, Object obj, boolean z) {
        this.a = b;
        this.b = obj;
        this.c = z;
    }

    @Override
    public final void accept(Object obj) {
        u31 u31Var;
        byte b = this.a;
        boolean z = false;
        boolean z2 = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z3 = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof q68) {
                    q68 q68Var = (q68) view;
                    jo6 photoEntry = q68Var.getPhotoEntry();
                    if (photoEntry != null && arrayList.contains(Integer.valueOf(photoEntry.C)) && z2) {
                        z = true;
                    }
                    q68Var.setHasSpoiler(z);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                View view2 = (View) obj;
                boolean z4 = ChatAttachAlertPhotoLayout.r1;
                if (view2 instanceof q68) {
                    q68 q68Var2 = (q68) view2;
                    jo6 photoEntry2 = q68Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.C)) && z2) {
                        z = true;
                    }
                    q68Var2.setHighQuality(z);
                    return;
                }
                return;
            default:
                Float f = (Float) obj;
                q21 q21Var = ((l21) obj2).b.q;
                if (q21Var != null && !z2) {
                    q21Var.b(u31Var.e.getHeight() - f.floatValue());
                    return;
                }
                return;
        }
    }
}
