package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class i42 implements vs2 {
    public final byte a;
    public final Object b;
    public final boolean c;

    public i42(byte b, Object obj, boolean z) {
        this.a = b;
        this.b = obj;
        this.c = z;
    }

    @Override
    public final void accept(Object obj) {
        m21 m21Var;
        byte b = this.a;
        boolean z = false;
        boolean z2 = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z3 = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof o48) {
                    o48 o48Var = (o48) view;
                    jm6 photoEntry = o48Var.getPhotoEntry();
                    if (photoEntry != null && arrayList.contains(Integer.valueOf(photoEntry.C)) && z2) {
                        z = true;
                    }
                    o48Var.setHasSpoiler(z);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                View view2 = (View) obj;
                boolean z4 = ChatAttachAlertPhotoLayout.r1;
                if (view2 instanceof o48) {
                    o48 o48Var2 = (o48) view2;
                    jm6 photoEntry2 = o48Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.C)) && z2) {
                        z = true;
                    }
                    o48Var2.setHighQuality(z);
                    return;
                }
                return;
            default:
                Float f = (Float) obj;
                i11 i11Var = ((d11) obj2).b.p;
                if (i11Var != null && !z2) {
                    i11Var.b(m21Var.e.getHeight() - f.floatValue());
                    return;
                }
                return;
        }
    }
}
