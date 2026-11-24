package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class fx3 extends n39 {
    public final qx3 c;

    public fx3(qx3 qx3Var) {
        this.c = qx3Var;
    }

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.f == 1) {
            return true;
        }
        return false;
    }

    public final int E(int i) {
        int i2;
        qx3 qx3Var = this.c;
        bx3 bx3Var = qx3Var.o1;
        if (qx3Var.C1) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        int i3 = 0;
        while (true) {
            ArrayList[] arrayListArr = bx3Var.c;
            if (i3 >= arrayListArr.length || i3 == i) {
                break;
            }
            int size = arrayListArr[i3].size();
            if (bx3Var.c.length > 1) {
                size = Math.min(qx3Var.x1.J << 1, size);
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
        qx3 qx3Var = this.c;
        bx3 bx3Var = qx3Var.o1;
        if (!y6c.h(qx3Var.a).p() && (arrayList = bx3Var.b) != null && arrayList.size() == 1 && k27.U3((TLRPC.TL_messages_stickerSet) bx3Var.b.get(0))) {
            r1 = 1;
        } else {
            r1 = 0;
        }
        qx3Var.C1 = r1;
        int i2 = r1 + 1;
        if (bx3Var.c == null) {
            i = 0;
        } else {
            int i3 = 0;
            i = 0;
            while (true) {
                ArrayList[] arrayListArr = bx3Var.c;
                if (i3 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i3];
                if (arrayList2 != null) {
                    if (arrayListArr.length == 1) {
                        min = arrayList2.size();
                    } else {
                        min = Math.min(bx3Var.f.x1.J << 1, arrayList2.size());
                    }
                    i = min + i + 1;
                }
                i3++;
            }
        }
        return Math.max(0, bx3Var.c.length - 1) + i2 + i;
    }

    @Override
    public final int d(int i) {
        qx3 qx3Var = this.c;
        bx3 bx3Var = qx3Var.o1;
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int i3 = i - 1;
        if (qx3Var.C1) {
            if (i3 == 1) {
                return 3;
            }
            if (i3 > 0) {
                i3 = i - 2;
            }
        }
        int i4 = 0;
        while (true) {
            ArrayList[] arrayListArr = bx3Var.c;
            if (i2 >= arrayListArr.length) {
                return 1;
            }
            if (i3 == i4) {
                return 2;
            }
            int size = arrayListArr[i2].size();
            if (bx3Var.c.length > 1) {
                size = Math.min(qx3Var.x1.J << 1, size);
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
    public final void t(defpackage.s49 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.fx3.t(s49, int):void");
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        qx3 qx3Var = this.c;
        if (i == 0) {
            view = qx3Var.n1;
        } else {
            boolean z = true;
            if (i == 1) {
                ?? view3 = new View(qx3Var.getContext());
                view3.a = new il5[2];
                view = view3;
            } else {
                if (i == 2) {
                    Context context = qx3Var.getContext();
                    if (qx3Var.o1.c.length > 1) {
                        z = false;
                    }
                    view2 = new mx3(qx3Var, context, z);
                } else if (i == 3) {
                    view2 = new TextView(qx3Var.getContext());
                } else if (i == 4) {
                    view2 = new View(qx3Var.getContext());
                    int i2 = bkb.Bf;
                    Pattern pattern = qx3.P1;
                    zkb.h(i2, qx3Var.J0, view2);
                    e49 e49Var = new e49(-1, gl.e1());
                    ((ViewGroup.MarginLayoutParams) e49Var).topMargin = gl.L(14.0f);
                    view2.setLayoutParams(e49Var);
                } else {
                    view = null;
                }
                view = view2;
            }
        }
        return new s49(view);
    }
}
