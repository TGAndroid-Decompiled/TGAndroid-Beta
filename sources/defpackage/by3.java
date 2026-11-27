package defpackage;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.regex.Pattern;
import org.telegram.tgnet.TLRPC;
public final class by3 extends c79 {
    public final ly3 c;

    public by3(ly3 ly3Var) {
        this.c = ly3Var;
    }

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.f == 1) {
            return true;
        }
        return false;
    }

    public final int E(int i) {
        int i2;
        ly3 ly3Var = this.c;
        xx3 xx3Var = ly3Var.o1;
        if (ly3Var.C1) {
            i2 = 2;
        } else {
            i2 = 1;
        }
        int i3 = 0;
        while (true) {
            ArrayList[] arrayListArr = xx3Var.c;
            if (i3 >= arrayListArr.length || i3 == i) {
                break;
            }
            int size = arrayListArr[i3].size();
            if (xx3Var.c.length > 1) {
                size = Math.min(ly3Var.x1.J << 1, size);
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
        ly3 ly3Var = this.c;
        xx3 xx3Var = ly3Var.o1;
        if (!yac.h(ly3Var.a).p() && (arrayList = xx3Var.b) != null && arrayList.size() == 1 && r47.U3((TLRPC.TL_messages_stickerSet) xx3Var.b.get(0))) {
            r1 = 1;
        } else {
            r1 = 0;
        }
        ly3Var.C1 = r1;
        int i2 = r1 + 1;
        if (xx3Var.c == null) {
            i = 0;
        } else {
            int i3 = 0;
            i = 0;
            while (true) {
                ArrayList[] arrayListArr = xx3Var.c;
                if (i3 >= arrayListArr.length) {
                    break;
                }
                ArrayList arrayList2 = arrayListArr[i3];
                if (arrayList2 != null) {
                    if (arrayListArr.length == 1) {
                        min = arrayList2.size();
                    } else {
                        min = Math.min(xx3Var.f.x1.J << 1, arrayList2.size());
                    }
                    i = min + i + 1;
                }
                i3++;
            }
        }
        return Math.max(0, xx3Var.c.length - 1) + i2 + i;
    }

    @Override
    public final int d(int i) {
        ly3 ly3Var = this.c;
        xx3 xx3Var = ly3Var.o1;
        int i2 = 0;
        if (i == 0) {
            return 0;
        }
        int i3 = i - 1;
        if (ly3Var.C1) {
            if (i3 == 1) {
                return 3;
            }
            if (i3 > 0) {
                i3 = i - 2;
            }
        }
        int i4 = 0;
        while (true) {
            ArrayList[] arrayListArr = xx3Var.c;
            if (i2 >= arrayListArr.length) {
                return 1;
            }
            if (i3 == i4) {
                return 2;
            }
            int size = arrayListArr[i2].size();
            if (xx3Var.c.length > 1) {
                size = Math.min(ly3Var.x1.J << 1, size);
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
    public final void t(defpackage.f89 r17, int r18) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.by3.t(f89, int):void");
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        View view;
        View view2;
        ly3 ly3Var = this.c;
        if (i == 0) {
            view = ly3Var.n1;
        } else {
            boolean z = true;
            if (i == 1) {
                ?? view3 = new View(ly3Var.getContext());
                view3.a = new ln5[2];
                view = view3;
            } else {
                if (i == 2) {
                    Context context = ly3Var.getContext();
                    if (ly3Var.o1.c.length > 1) {
                        z = false;
                    }
                    view2 = new hy3(ly3Var, context, z);
                } else if (i == 3) {
                    view2 = new TextView(ly3Var.getContext());
                } else if (i == 4) {
                    view2 = new View(ly3Var.getContext());
                    int i2 = aob.Cf;
                    Pattern pattern = ly3.P1;
                    yob.h(i2, ly3Var.J0, view2);
                    r79 r79Var = new r79(-1, hl.e1());
                    ((ViewGroup.MarginLayoutParams) r79Var).topMargin = hl.L(14.0f);
                    view2.setLayoutParams(r79Var);
                } else {
                    view = null;
                }
                view = view2;
            }
        }
        return new f89(view);
    }
}
