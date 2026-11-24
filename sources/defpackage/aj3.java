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
public final class aj3 extends fs5 {
    public s49 e;
    public boolean f;
    public boolean g;
    public final bj3 h;
    public final cj3 i;

    public aj3(cj3 cj3Var, bj3 bj3Var) {
        this.i = cj3Var;
        this.h = bj3Var;
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
        cj3 cj3Var;
        ue3 ue3Var;
        if (i == 4) {
            return 200L;
        }
        if (i == 8 && (ue3Var = (cj3Var = this.i).Z0) != null) {
            gl.d3(new uc(ue3Var, (byte) 1), this.h.y.e);
            cj3Var.Z0 = null;
        }
        return super.d(recyclerView, i, f, f2);
    }

    @Override
    public final int f(androidx.recyclerview.widget.RecyclerView r13, defpackage.s49 r14) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.aj3.f(androidx.recyclerview.widget.RecyclerView, s49):int");
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
    public final boolean o(RecyclerView recyclerView, s49 s49Var, s49 s49Var2) {
        char c;
        cj3 cj3Var = this.i;
        ArrayList arrayList = cj3Var.c1;
        View view = s49Var2.a;
        char c2 = 0;
        if (view instanceof ue3) {
            long dialogId = ((ue3) view).getDialogId();
            TLRPC.Dialog dialog = (TLRPC.Dialog) cj3Var.getMessagesController().R.f(dialogId);
            if (dialog != null && cj3Var.F3(dialog) && !cf3.C(dialogId)) {
                int b = s49Var.b();
                int b2 = s49Var2.b();
                bj3 bj3Var = this.h;
                if (bj3Var.a.getItemAnimator() == null) {
                    bj3Var.a.setItemAnimator(bj3Var.y);
                }
                eh3 eh3Var = bj3Var.d;
                cj3 cj3Var2 = eh3Var.S;
                int i = eh3Var.G;
                ArrayList m3 = cj3Var2.m3(i, eh3Var.h, eh3Var.r, false);
                int H = eh3Var.H(b);
                int H2 = eh3Var.H(b2);
                TLRPC.Dialog dialog2 = (TLRPC.Dialog) m3.get(H);
                TLRPC.Dialog dialog3 = (TLRPC.Dialog) m3.get(H2);
                int i2 = eh3Var.h;
                if (i2 != 7 && i2 != 8) {
                    int i3 = dialog2.pinnedNum;
                    dialog2.pinnedNum = dialog3.pinnedNum;
                    dialog3.pinnedNum = i3;
                } else {
                    t97[] t97VarArr = na7.q1(i).N;
                    if (eh3Var.h == 8) {
                        c = 1;
                    } else {
                        c = 0;
                    }
                    LongSparseIntArray longSparseIntArray = t97VarArr[c].j;
                    int i4 = longSparseIntArray.get(dialog2.id);
                    longSparseIntArray.put(dialog2.id, longSparseIntArray.get(dialog3.id));
                    longSparseIntArray.put(dialog3.id, i4);
                }
                Collections.swap(m3, H, H2);
                eh3Var.S(null);
                int i5 = cj3Var.f0[0].s;
                if (i5 != 7 && i5 != 8) {
                    cj3Var.b1 = true;
                    return true;
                }
                t97[] t97VarArr2 = cj3Var.getMessagesController().N;
                if (cj3Var.f0[0].s == 8) {
                    c2 = 1;
                }
                t97 t97Var = t97VarArr2[c2];
                if (!arrayList.contains(t97Var)) {
                    arrayList.add(t97Var);
                    return true;
                }
                return true;
            }
        }
        return false;
    }

    @Override
    public final void q(s49 s49Var, int i) {
        if (s49Var != null) {
            this.h.a.e1(false);
        }
        this.e = s49Var;
        if (s49Var != null) {
            View view = s49Var.a;
            if (view instanceof ue3) {
                ((ue3) view).x = false;
            }
        }
    }

    @Override
    public final void r(s49 s49Var) {
        int i;
        cj3 cj3Var = this.i;
        if (s49Var != null) {
            ue3 ue3Var = (ue3) s49Var.a;
            long dialogId = ue3Var.getDialogId();
            boolean C = cf3.C(dialogId);
            int i2 = 0;
            bj3 bj3Var = this.h;
            if (C) {
                yi3 yi3Var = bj3Var.a;
                int i3 = yi3.C3;
                yi3Var.C1(false, ue3Var);
                return;
            }
            TLRPC.Dialog dialog = (TLRPC.Dialog) cj3Var.getMessagesController().R.f(dialogId);
            if (dialog == null) {
                return;
            }
            if (!cj3Var.getMessagesController().B2(dialogId, false) && cj3Var.Y2 == 0) {
                i = ((d) cj3Var).currentAccount;
                if (gba.m(i) == 1) {
                    ArrayList arrayList = new ArrayList();
                    arrayList.add(Long.valueOf(dialogId));
                    if (dialog.unread_count > 0 || dialog.unread_mark) {
                        i2 = 1;
                    }
                    cj3Var.P2 = i2;
                    cj3Var.G4(arrayList, 101, true, false, null);
                    return;
                }
            }
            if (hc2.Y(cj3Var.getMessagesController().K0(Long.valueOf(-dialogId)))) {
                ArrayList arrayList2 = new ArrayList();
                arrayList2.add(Long.valueOf(dialogId));
                cj3Var.G4(arrayList2, 111, true, false, null);
                return;
            }
            cj3Var.Y0 = ue3Var;
            mp1 mp1Var = new mp1(this, dialog, bj3Var.d.b(), s49Var.b(), (byte) 4);
            cj3Var.Q4(true, true);
            if (Utilities.b.nextInt(1000) == 1) {
                mr7 mr7Var = cj3Var.X0;
                mr7 mr7Var2 = mr7Var;
                if (mr7Var == null) {
                    yi3 yi3Var2 = bj3Var.a;
                    ?? obj = new Object();
                    obj.a = new Paint(1);
                    Paint paint = new Paint(1);
                    obj.b = paint;
                    obj.e = 0L;
                    obj.f = new RectF();
                    paint.setStyle(Paint.Style.STROKE);
                    paint.setStrokeWidth(gl.L(2.0f));
                    obj.c = yi3Var2;
                    cj3Var.X0 = obj;
                    mr7Var2 = obj;
                }
                mr7Var2.d = mp1Var;
                mr7Var2.h = 0.0f;
                mr7Var2.g = 0.0f;
                mr7Var2.e = System.currentTimeMillis();
                mr7Var2.c.invalidate();
                return;
            }
            mp1Var.run();
            return;
        }
        cj3Var.Y0 = null;
    }
}
