package defpackage;

import android.view.View;
import java.util.ArrayList;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public final class y42 implements pt2 {
    public final byte a;
    public final Object b;
    public final boolean c;

    public y42(byte b, Object obj, boolean z) {
        this.a = b;
        this.b = obj;
        this.c = z;
    }

    @Override
    public final void accept(Object obj) {
        v21 v21Var;
        byte b = this.a;
        boolean z = false;
        boolean z2 = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ArrayList arrayList = (ArrayList) obj2;
                View view = (View) obj;
                boolean z3 = ChatAttachAlertPhotoLayout.r1;
                if (view instanceof d88) {
                    d88 d88Var = (d88) view;
                    no6 photoEntry = d88Var.getPhotoEntry();
                    if (photoEntry != null && arrayList.contains(Integer.valueOf(photoEntry.C)) && z2) {
                        z = true;
                    }
                    d88Var.setHasSpoiler(z);
                    return;
                }
                return;
            case 1:
                ArrayList arrayList2 = (ArrayList) obj2;
                View view2 = (View) obj;
                boolean z4 = ChatAttachAlertPhotoLayout.r1;
                if (view2 instanceof d88) {
                    d88 d88Var2 = (d88) view2;
                    no6 photoEntry2 = d88Var2.getPhotoEntry();
                    if (photoEntry2 != null && arrayList2.contains(Integer.valueOf(photoEntry2.C)) && z2) {
                        z = true;
                    }
                    d88Var2.setHighQuality(z);
                    return;
                }
                return;
            default:
                Float f = (Float) obj;
                r11 r11Var = ((m11) obj2).b.q;
                if (r11Var != null && !z2) {
                    r11Var.b(v21Var.e.getHeight() - f.floatValue());
                    return;
                }
                return;
        }
    }
}
