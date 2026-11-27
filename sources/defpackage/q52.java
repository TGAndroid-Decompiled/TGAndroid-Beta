package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.ui.Components.ChatAttachAlertPhotoLayout;
public abstract class q52 extends yc8 {
    public final ChatAttachAlertPhotoLayout a;

    public q52(ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout) {
        this.a = chatAttachAlertPhotoLayout;
    }

    @Override
    public final int D(int i, oec oecVar) {
        boolean z;
        ChatAttachAlertPhotoLayout chatAttachAlertPhotoLayout = this.a;
        i52 i52Var = chatAttachAlertPhotoLayout.r;
        i52 i52Var2 = chatAttachAlertPhotoLayout.F;
        n12 n12Var = chatAttachAlertPhotoLayout.b;
        if (n12Var.P3 < 0 || ChatAttachAlertPhotoLayout.t1.size() < n12Var.P3 || w(i)) {
            boolean z2 = ChatAttachAlertPhotoLayout.r1;
            no6 c0 = chatAttachAlertPhotoLayout.c0(i);
            if (c0 != null && !chatAttachAlertPhotoLayout.X(c0)) {
                int i2 = 1;
                if (ChatAttachAlertPhotoLayout.t1.size() + 1 <= chatAttachAlertPhotoLayout.h0()) {
                    int Q = chatAttachAlertPhotoLayout.Q(c0, -1);
                    if (Q == -1) {
                        Q = ChatAttachAlertPhotoLayout.u1.indexOf(Integer.valueOf(c0.C));
                        z = true;
                    } else {
                        c0.s = null;
                        z = false;
                    }
                    c0.s = oecVar;
                    int childCount = i52Var2.getChildCount();
                    int i3 = 0;
                    while (true) {
                        if (i3 >= childCount) {
                            break;
                        }
                        View childAt = i52Var2.getChildAt(i3);
                        if ((childAt instanceof d88) && ((Integer) childAt.getTag()).intValue() == i) {
                            if ((n12Var.Z1 instanceof zu1) && n12Var.Q3) {
                                ((d88) childAt).b(Q, z, false);
                            } else {
                                ((d88) childAt).b(-1, z, false);
                            }
                        } else {
                            i3++;
                        }
                    }
                    int childCount2 = i52Var.getChildCount();
                    int i4 = 0;
                    while (true) {
                        if (i4 >= childCount2) {
                            break;
                        }
                        View childAt2 = i52Var.getChildAt(i4);
                        if ((childAt2 instanceof d88) && ((Integer) childAt2.getTag()).intValue() == i) {
                            if ((n12Var.Z1 instanceof zu1) && n12Var.Q3) {
                                ((d88) childAt2).b(Q, z, false);
                            } else {
                                ((d88) childAt2).b(-1, z, false);
                            }
                        } else {
                            i4++;
                        }
                    }
                    if (!z) {
                        i2 = 2;
                    }
                    n12Var.G1(i2);
                    return Q;
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
        n12 n12Var = this.a.b;
        if (n12Var != null && n12Var.c2) {
            return true;
        }
        return false;
    }

    @Override
    public final int S(int i) {
        boolean z = ChatAttachAlertPhotoLayout.r1;
        no6 c0 = this.a.c0(i);
        if (c0 == null) {
            return -1;
        }
        return ChatAttachAlertPhotoLayout.u1.indexOf(Integer.valueOf(c0.C));
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
        no6 c0 = this.a.c0(i);
        if (c0 != null && ChatAttachAlertPhotoLayout.t1.containsKey(Integer.valueOf(c0.C))) {
            return true;
        }
        return false;
    }
}
