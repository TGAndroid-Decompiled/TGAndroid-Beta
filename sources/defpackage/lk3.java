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
import org.telegram.ui.ActionBar.d;
public final class lk3 extends eu5 {
    public u69 e;
    public boolean f;
    public boolean g;
    public final mk3 h;
    public final nk3 i;

    public lk3(nk3 nk3Var, mk3 mk3Var) {
        this.i = nk3Var;
        this.h = mk3Var;
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
        nk3 nk3Var;
        hg3 hg3Var;
        if (i == 4) {
            return 200L;
        }
        if (i == 8 && (hg3Var = (nk3Var = this.i).Z0) != null) {
            gm.d3(new ud(hg3Var, (byte) 1), this.h.y.e);
            nk3Var.Z0 = null;
        }
        return super.d(recyclerView, i, f, f2);
    }

    @Override
    public final int f(androidx.recyclerview.widget.RecyclerView r13, defpackage.u69 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lk3.f(androidx.recyclerview.widget.RecyclerView, u69):int");
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
    public final boolean o(RecyclerView recyclerView, u69 u69Var, u69 u69Var2) {
        char c;
        nk3 nk3Var = this.i;
        ArrayList arrayList = nk3Var.c1;
        View view = u69Var2.a;
        char c2 = 0;
        if (view instanceof hg3) {
            long dialogId = ((hg3) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) nk3Var.getMessagesController().R.f(dialogId);
            if (dialog != null && nk3Var.H3(dialog) && !pg3.C(dialogId)) {
                int b = u69Var.b();
                int b2 = u69Var2.b();
                mk3 mk3Var = this.h;
                if (mk3Var.a.getItemAnimator() == null) {
                    mk3Var.a.setItemAnimator(mk3Var.y);
                }
                qi3 qi3Var = mk3Var.d;
                nk3 nk3Var2 = qi3Var.S;
                int i = qi3Var.G;
                ArrayList o3 = nk3Var2.o3(i, qi3Var.h, qi3Var.r, false);
                int H = qi3Var.H(b);
                int H2 = qi3Var.H(b2);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) o3.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) o3.get(H2);
                int i2 = qi3Var.h;
                if (i2 != 7 && i2 != 8) {
                    int i3 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i3;
                } else {
                    ub7[] ub7VarArr = oc7.r1(i).N;
                    if (qi3Var.h == 8) {
                        c = 1;
                    } else {
                        c = 0;
                    }
                    LongSparseIntArray longSparseIntArray = ub7VarArr[c].j;
                    int i4 = longSparseIntArray.get(dialog2.id);
                    longSparseIntArray.put(dialog2.id, longSparseIntArray.get(dialog3.id));
                    longSparseIntArray.put(dialog3.id, i4);
                }
                Collections.swap(o3, H, H2);
                qi3Var.S(null);
                int i5 = nk3Var.f0[0].s;
                if (i5 != 7 && i5 != 8) {
                    nk3Var.b1 = true;
                    return true;
                }
                ub7[] ub7VarArr2 = nk3Var.getMessagesController().N;
                if (nk3Var.f0[0].s == 8) {
                    c2 = 1;
                }
                ub7 ub7Var = ub7VarArr2[c2];
                if (!arrayList.contains(ub7Var)) {
                    arrayList.add(ub7Var);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void q(u69 u69Var, int i) {
        if (u69Var != null) {
            this.h.a.e1(false);
        }
        this.e = u69Var;
        if (u69Var != null) {
            View view = u69Var.a;
            if (view instanceof hg3) {
                ((hg3) view).x = false;
            }
        }
    }

    @Override
    public final void r(u69 u69Var) {
        int i;
        nk3 nk3Var = this.i;
        if (u69Var != null) {
            hg3 hg3Var = (hg3) u69Var.a;
            long dialogId = hg3Var.getDialogId();
            boolean C = pg3.C(dialogId);
            int i2 = 0;
            mk3 mk3Var = this.h;
            if (C) {
                jk3 jk3Var = mk3Var.a;
                int i3 = jk3.C3;
                jk3Var.C1(false, hg3Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) nk3Var.getMessagesController().R.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!nk3Var.getMessagesController().D2(dialogId, false) && nk3Var.Y2 == 0) {
                i = ((d) nk3Var).currentAccount;
                if (gda.m(i) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    if (dialog.unread_count > 0 || dialog.unread_mark) {
                        i2 = 1;
                    }
                    nk3Var.P2 = i2;
                    nk3Var.K4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (sd2.Y(nk3Var.getMessagesController().L0(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                nk3Var.K4(arrayList2, 111, true, false, null);
                return;
            }
            nk3Var.Y0 = hg3Var;
            zq1 zq1Var = new zq1(this, dialog, mk3Var.d.b(), u69Var.b(), (byte) 4);
            nk3Var.U4(true, true);
            if (Utilities.b.nextInt(1000) == 1) {
                nt7 nt7Var = nk3Var.X0;
                nt7 nt7Var2 = nt7Var;
                if (nt7Var == null) {
                    jk3 jk3Var2 = mk3Var.a;
                    ?? obj = new Object();
                    obj.a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.b = paint;
                    obj.e = 0L;
                    obj.f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(gm.L(2.0f));
                    obj.c = jk3Var2;
                    nk3Var.X0 = obj;
                    nt7Var2 = obj;
                }
                nt7Var2.d = zq1Var;
                nt7Var2.h = 0.0f;
                nt7Var2.g = 0.0f;
                nt7Var2.e = System.currentTimeMillis();
                nt7Var2.c.invalidate();
                return;
            }
            zq1Var.run();
            return;
        }
        nk3Var.Y0 = null;
    }
}
