package defpackage;

import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Collections;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class sj3 extends iu5 {
    public f89 e;
    public boolean f;
    public boolean g;
    public final tj3 h;
    public final uj3 i;

    public sj3(uj3 uj3Var, tj3 tj3Var) {
        this.i = uj3Var;
        this.h = tj3Var;
    }

    @Override
    public final int b(int i, int i2) {
        if (this.g) {
            return 0;
        }
        return super.b(i, i2);
    }

    @Override
    public final long d(RecyclerView recyclerView, int i, float f, float f2) {
        uj3 uj3Var;
        of3 of3Var;
        if (i == 4) {
            return 200L;
        }
        if (i == 8 && (of3Var = (uj3Var = this.i).Z0) != null) {
            hl.d3(new vc(of3Var, (byte) 1), this.h.y.e);
            uj3Var.Z0 = null;
        }
        return super.d(recyclerView, i, f, f2);
    }

    @Override
    public final int f(androidx.recyclerview.widget.RecyclerView r13, defpackage.f89 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sj3.f(androidx.recyclerview.widget.RecyclerView, f89):int");
    }

    @Override
    public final float g(float f) {
        return 3500.0f;
    }

    @Override
    public final float h() {
        return 0.45f;
    }

    @Override
    public final float i(float f) {
        return Float.MAX_VALUE;
    }

    @Override
    public final boolean o(RecyclerView recyclerView, f89 f89Var, f89 f89Var2) {
        char c;
        uj3 uj3Var = this.i;
        ArrayList arrayList = uj3Var.c1;
        View view = f89Var2.a;
        char c2 = 0;
        if (view instanceof of3) {
            long dialogId = ((of3) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) uj3Var.getMessagesController().R.f(dialogId);
            if (dialog != null && uj3Var.H3(dialog) && !wf3.C(dialogId)) {
                int b = f89Var.b();
                int b2 = f89Var2.b();
                tj3 tj3Var = this.h;
                if (tj3Var.a.getItemAnimator() == null) {
                    tj3Var.a.setItemAnimator(tj3Var.y);
                }
                yh3 yh3Var = tj3Var.d;
                uj3 uj3Var2 = yh3Var.S;
                int i = yh3Var.G;
                ArrayList o3 = uj3Var2.o3(i, yh3Var.h, yh3Var.r, false);
                int H = yh3Var.H(b);
                int H2 = yh3Var.H(b2);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) o3.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) o3.get(H2);
                int i2 = yh3Var.h;
                if (i2 != 7 && i2 != 8) {
                    int i3 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i3;
                } else {
                    ac7[] ac7VarArr = uc7.s1(i).N;
                    if (yh3Var.h == 8) {
                        c = 1;
                    } else {
                        c = 0;
                    }
                    LongSparseIntArray longSparseIntArray = ac7VarArr[c].j;
                    int i4 = longSparseIntArray.get(dialog2.id);
                    longSparseIntArray.put(dialog2.id, longSparseIntArray.get(dialog3.id));
                    longSparseIntArray.put(dialog3.id, i4);
                }
                Collections.swap(o3, H, H2);
                yh3Var.S(null);
                int i5 = uj3Var.f0[0].s;
                if (i5 != 7 && i5 != 8) {
                    uj3Var.b1 = true;
                    return true;
                }
                ac7[] ac7VarArr2 = uj3Var.getMessagesController().N;
                if (uj3Var.f0[0].s == 8) {
                    c2 = 1;
                }
                ac7 ac7Var = ac7VarArr2[c2];
                if (!arrayList.contains(ac7Var)) {
                    arrayList.add(ac7Var);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void q(f89 f89Var, int i) {
        if (f89Var != null) {
            this.h.a.f1(false);
        }
        this.e = f89Var;
        if (f89Var != null) {
            View view = f89Var.a;
            if (view instanceof of3) {
                ((of3) view).x = false;
            }
        }
    }

    @Override
    public final void r(f89 f89Var) {
        int i;
        uj3 uj3Var = this.i;
        if (f89Var != null) {
            of3 of3Var = (of3) f89Var.a;
            long dialogId = of3Var.getDialogId();
            boolean C = wf3.C(dialogId);
            int i2 = 0;
            tj3 tj3Var = this.h;
            if (C) {
                qj3 qj3Var = tj3Var.a;
                int i3 = qj3.C3;
                qj3Var.D1(false, of3Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) uj3Var.getMessagesController().R.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!uj3Var.getMessagesController().G2(dialogId, false) && uj3Var.Y2 == 0) {
                i = ((e) uj3Var).currentAccount;
                if (xea.m(i) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    if (dialog.unread_count > 0 || dialog.unread_mark) {
                        i2 = 1;
                    }
                    uj3Var.P2 = i2;
                    uj3Var.K4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (xc2.Y(uj3Var.getMessagesController().M0(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                uj3Var.K4(arrayList2, 111, true, false, null);
                return;
            }
            uj3Var.Y0 = of3Var;
            aq1 aq1Var = new aq1(this, dialog, tj3Var.d.b(), f89Var.b(), (byte) 4);
            uj3Var.U4(true, true);
            if (Utilities.b.nextInt(1000) == 1) {
                su7 su7Var = uj3Var.X0;
                su7 su7Var2 = su7Var;
                if (su7Var == null) {
                    qj3 qj3Var2 = tj3Var.a;
                    ?? obj = new Object();
                    obj.a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.b = paint;
                    obj.e = 0L;
                    obj.f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(hl.L(2.0f));
                    obj.c = qj3Var2;
                    uj3Var.X0 = obj;
                    su7Var2 = obj;
                }
                su7Var2.d = aq1Var;
                su7Var2.h = 0.0f;
                su7Var2.g = 0.0f;
                su7Var2.e = System.currentTimeMillis();
                su7Var2.c.invalidate();
                return;
            }
            aq1Var.run();
            return;
        }
        uj3Var.Y0 = null;
    }
}
