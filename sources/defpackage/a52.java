package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public abstract class a52 extends i98 {
    public final ChatAttachAlertPhotoLayout a;

    public a52(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final int D(int i, oac oacVar) {
        boolean z;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        s42 s42Var = chatAttachAlertPhotoLayout.r;
        s42 s42Var2 = chatAttachAlertPhotoLayout.F;
        x02 x02Var = chatAttachAlertPhotoLayout.b;
        if (x02Var.P3 < 0 || ChatAttachAlertPhotoLayout.t1.size() < x02Var.P3 || w(i)) {
            boolean z2 = ChatAttachAlertPhotoLayout.r1;
            jm6 d0 = chatAttachAlertPhotoLayout.d0(i);
            if (d0 != null && !chatAttachAlertPhotoLayout.Y(d0)) {
                int i2 = 1;
                if (ChatAttachAlertPhotoLayout.t1.size() + 1 <= chatAttachAlertPhotoLayout.i0()) {
                    int R = chatAttachAlertPhotoLayout.R(d0, -1);
                    if (R == -1) {
                        R = ChatAttachAlertPhotoLayout.u1.indexOf(Integer.valueOf(d0.C));
                        z = true;
                    } else {
                        d0.s = null;
                        z = false;
                    }
                    d0.s = oacVar;
                    int childCount = s42Var2.getChildCount();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= childCount) {
                            break;
                        }
                        View childAt = s42Var2.getChildAt(i3);
                        if ((childAt instanceof o48) && ((Integer) childAt.getTag()).intValue() == i) {
                            if ((x02Var.Z1 instanceof mu1) && x02Var.Q3) {
                                ((o48) childAt).b(R, z, false);
                            } else {
                                ((o48) childAt).b(-1, z, false);
                            }
                        } else {
                            i3++;
                        }
                    }
                    int childCount2 = s42Var.getChildCount();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= childCount2) {
                            break;
                        }
                        View childAt2 = s42Var.getChildAt(i4);
                        if ((childAt2 instanceof o48) && ((Integer) childAt2.getTag()).intValue() == i) {
                            if ((x02Var.Z1 instanceof mu1) && x02Var.Q3) {
                                ((o48) childAt2).b(R, z, false);
                            } else {
                                ((o48) childAt2).b(-1, z, false);
                            }
                        } else {
                            i4++;
                        }
                    }
                    if (!z) {
                        i2 = 2;
                    }
                    x02Var.F1(i2);
                    return R;
                }
            }
        }
        return -1;
    }

    @Override
    public final int G() {
        return ChatAttachAlertPhotoLayout.t1.size();
    }

    @Override
    public final boolean O() {
        x02 x02Var = this.a.b;
        if (x02Var != null && x02Var.c2) {
            return true;
        }
        return false;
    }

    @Override
    public final int S(int i) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        jm6 d0 = this.a.d0(i);
        if (d0 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.u1.indexOf(Integer.valueOf(d0.C));
    }

    @Override
    public final ArrayList d() {
        return ChatAttachAlertPhotoLayout.u1;
    }

    @Override
    public final void m() {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        this.a.y0();
    }

    @Override
    public final HashMap u() {
        return ChatAttachAlertPhotoLayout.t1;
    }

    @Override
    public final boolean w(int i) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        jm6 d0 = this.a.d0(i);
        if (d0 != null && ChatAttachAlertPhotoLayout.t1.containsKey(Integer.valueOf(d0.C))) {
            return true;
        }
        return false;
    }
}
