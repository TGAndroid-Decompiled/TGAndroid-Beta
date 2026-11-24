package defpackage;

import android.util.SparseIntArray;
import java.util.Calendar;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.d;
public final class pn0 implements jp7, a29, ee {
    public final int a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public pn0(int i, boolean[] zArr, TLRPC.Document document, int i2, boolean[] zArr2, qac qacVar) {
        this.a = i;
        this.c = zArr;
        this.d = document;
        this.b = i2;
        this.e = zArr2;
        this.f = qacVar;
    }

    @Override
    public final void f(c29 c29Var, int i) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.e;
        int[] iArr = (int[]) this.f;
        int i2 = this.b + i;
        int i3 = this.a;
        ((SparseIntArray) this.c).put(i3, i2);
        if (((ggc) this.d).getCurrentItem() == i3) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i2, true);
        }
    }

    @Override
    public final void g(lp7 lp7Var, int i) {
        jj jjVar = (jj) this.c;
        wn0 wn0Var = (wn0) this.d;
        xn0 xn0Var = (xn0) this.e;
        lp7 lp7Var2 = (lp7) this.f;
        try {
            jjVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (lp7Var.getTag() != null && lp7Var.getTag().equals("DAY")) {
            if (lp7Var.getValue() == lp7Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i2 = calendar.get(11);
                int i3 = (calendar.get(12) / 5) + 1;
                if (i3 > 11) {
                    if (i2 == 23) {
                        lp7Var.setMinValue(lp7Var.getMinValue() + 1);
                        wn0Var.setMinValue(0);
                    } else {
                        wn0Var.setMinValue(i2 + 1);
                    }
                    xn0Var.setMinValue(0);
                } else {
                    wn0Var.setMinValue(i2);
                    xn0Var.setMinValue(i3);
                }
            } else if (lp7Var.getValue() == lp7Var.getMaxValue()) {
                wn0Var.setMaxValue(this.a);
                xn0Var.setMaxValue(Math.min(this.b / 5, 11));
            } else {
                wn0Var.setMinValue(0);
                xn0Var.setMinValue(0);
                wn0Var.setMaxValue(23);
                xn0Var.setMaxValue(11);
            }
        }
        if (lp7Var.getTag() != null && lp7Var.getTag().equals("HOUR") && lp7Var2.getValue() == lp7Var2.getMinValue()) {
            if (lp7Var.getValue() == lp7Var.getMinValue()) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(System.currentTimeMillis());
                int i4 = (calendar2.get(12) / 5) + 1;
                if (i4 > 11) {
                    xn0Var.setMinValue(0);
                    return;
                } else {
                    xn0Var.setMinValue(i4);
                    return;
                }
            }
            xn0Var.setMinValue(0);
            xn0Var.setMaxValue(11);
        }
    }

    @Override
    public final void r(he heVar, int i) {
        boolean[] zArr = (boolean[]) this.c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        boolean[] zArr2 = (boolean[]) this.e;
        qac qacVar = (qac) this.f;
        int i2 = this.a;
        if (!z8c.h(i2).p()) {
            new kj8(new d(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.id;
        int i3 = this.b;
        if (i3 > 0) {
            tL_emojiStatus.flags |= 1;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i2).getCurrentTime() + i3;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i2).sendRequest(updateemojistatus, new af(zArr2, qacVar, i2, updateemojistatus, (byte) 8));
    }

    public pn0(jj jjVar, wn0 wn0Var, xn0 xn0Var, int i, int i2, lp7 lp7Var) {
        this.c = jjVar;
        this.d = wn0Var;
        this.e = xn0Var;
        this.a = i;
        this.b = i2;
        this.f = lp7Var;
    }

    public pn0(SparseIntArray sparseIntArray, int i, int i2, ggc ggcVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.c = sparseIntArray;
        this.a = i;
        this.b = i2;
        this.d = ggcVar;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f = iArr;
    }
}
