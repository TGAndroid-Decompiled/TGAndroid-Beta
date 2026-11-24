package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class qy3 extends q59 {
    public final az3 c;

    public qy3(az3 az3Var) {
        this.c = az3Var;
    }

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.f == 1) {
            return true;
        }
        return false;
    }

    public final int E(int i) {
        int i2;
        az3 az3Var = this.c;
        my3 my3Var = az3Var.o1;
        if (az3Var.C1) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        int i3 = 0;
        while (true) {
            ArrayList[] arrayListArr = my3Var.c;
            if (i3 >= arrayListArr.length || i3 == i) {
                break;
            }
            int size = arrayListArr[i3].size();
            if (my3Var.c.length > 1) {
                size = Math.min(az3Var.x1.J << 1, size);
            }
            i2 += size + 2;
            i3++;
        }
        return i2;
    }

    @Override
    public final int b() {
        ?? r1;
        int i;
        int min;
        ArrayList arrayList;
        az3 az3Var = this.c;
        my3 my3Var = az3Var.o1;
        if (!z8c.h(az3Var.a).p() && (arrayList = my3Var.b) != null && arrayList.size() == 1 && k47.U3((TLRPC.TL_messages_stickerSet) my3Var.b.get(0))) {
            r1 = 1;
        } else {
            r1 = 0;
        }
        az3Var.C1 = r1;
        int i2 = r1 + 1;
        if (my3Var.c == null) {
            i = 0;
        } else {
            int i3 = 0;
            i = 0;
            while (true) {
                ArrayList[] arrayListArr = my3Var.c;
                if (i3 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i3];
                if (arrayList2 != null) {
                    if (arrayListArr.length == 1) {
                        min = arrayList2.size();
                    } else {
                        min = Math.min(my3Var.f.x1.J << 1, arrayList2.size());
                    }
                    i = min + i + 1;
                }
                i3++;
            }
        }
        return Math.max(0, my3Var.c.length - 1) + i2 + i;
    }

    @Override
    public final int d(int i) {
        az3 az3Var = this.c;
        my3 my3Var = az3Var.o1;
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int i3 = i - 1;
        if (az3Var.C1) {
            if (i3 == 1) {
                return 3;
            }
            if (i3 > 0) {
                i3 = i - 2;
            }
        }
        int i4 = 0;
        while (true) {
            ArrayList[] arrayListArr = my3Var.c;
            if (i2 >= arrayListArr.length) {
                return 1;
            }
            if (i3 == i4) {
                return 2;
            }
            int size = arrayListArr[i2].size();
            if (my3Var.c.length > 1) {
                size = Math.min(az3Var.x1.J << 1, size);
            }
            int i5 = size + 1 + i4;
            if (i3 == i5) {
                return 4;
            }
            i4 = i5 + 1;
            i2++;
        }
    }

    @Override
    public final void t(defpackage.u69 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qy3.t(u69, int):void");
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        az3 az3Var = this.c;
        if (i == 0) {
            view = az3Var.n1;
        } else {
            boolean z = true;
            if (i == 1) {
                ?? view3 = new View(az3Var.getContext());
                view3.a = new in5[2];
                view = view3;
            } else {
                if (i == 2) {
                    Context context = az3Var.getContext();
                    if (az3Var.o1.c.length > 1) {
                        z = false;
                    }
                    view2 = new wy3(az3Var, context, z);
                } else if (i == 3) {
                    view2 = new TextView(az3Var.getContext());
                } else if (i == 4) {
                    view2 = new View(az3Var.getContext());
                    int i2 = cmb.Bf;
                    Pattern pattern = az3.P1;
                    anb.h(i2, az3Var.J0, view2);
                    g69 g69Var = new g69(-1, gm.e1());
                    ((ViewGroup.MarginLayoutParams) g69Var).topMargin = gm.L(14.0f);
                    view2.setLayoutParams(g69Var);
                } else {
                    view = null;
                }
                view = view2;
            }
        }
        return new u69(view);
    }
}
