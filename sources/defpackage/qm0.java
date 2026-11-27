package defpackage;

import android.util.SparseIntArray;
import java.util.Calendar;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.e;
public final class qm0 implements fq7, m39, fd {
    public final int a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public qm0(int i, boolean[] zArr, TLRPC.Document document, int i2, boolean[] zArr2, pcc pccVar) {
        this.a = i;
        this.c = zArr;
        this.d = document;
        this.b = i2;
        this.e = zArr2;
        this.f = pccVar;
    }

    @Override
    public final void i(hq7 hq7Var, int i) {
        ki kiVar = (ki) this.c;
        wm0 wm0Var = (wm0) this.d;
        xm0 xm0Var = (xm0) this.e;
        hq7 hq7Var2 = (hq7) this.f;
        try {
            kiVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (hq7Var.getTag() != null && hq7Var.getTag().equals("DAY")) {
            if (hq7Var.getValue() == hq7Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i2 = calendar.get(11);
                int i3 = (calendar.get(12) / 5) + 1;
                if (i3 > 11) {
                    if (i2 == 23) {
                        hq7Var.setMinValue(hq7Var.getMinValue() + 1);
                        wm0Var.setMinValue(0);
                    } else {
                        wm0Var.setMinValue(i2 + 1);
                    }
                    xm0Var.setMinValue(0);
                } else {
                    wm0Var.setMinValue(i2);
                    xm0Var.setMinValue(i3);
                }
            } else if (hq7Var.getValue() == hq7Var.getMaxValue()) {
                wm0Var.setMaxValue(this.a);
                xm0Var.setMaxValue(Math.min(this.b / 5, 11));
            } else {
                wm0Var.setMinValue(0);
                xm0Var.setMinValue(0);
                wm0Var.setMaxValue(23);
                xm0Var.setMaxValue(11);
            }
        }
        if (hq7Var.getTag() != null && hq7Var.getTag().equals("HOUR") && hq7Var2.getValue() == hq7Var2.getMinValue()) {
            if (hq7Var.getValue() == hq7Var.getMinValue()) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(System.currentTimeMillis());
                int i4 = (calendar2.get(12) / 5) + 1;
                if (i4 > 11) {
                    xm0Var.setMinValue(0);
                    return;
                } else {
                    xm0Var.setMinValue(i4);
                    return;
                }
            }
            xm0Var.setMinValue(0);
            xm0Var.setMaxValue(11);
        }
    }

    @Override
    public final void k(o39 o39Var, int i) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.e;
        int[] iArr = (int[]) this.f;
        int i2 = this.b + i;
        int i3 = this.a;
        ((SparseIntArray) this.c).put(i3, i2);
        if (((fic) this.d).getCurrentItem() == i3) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i2, true);
        }
    }

    @Override
    public final void w(id idVar, int i) {
        boolean[] zArr = (boolean[]) this.c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        boolean[] zArr2 = (boolean[]) this.e;
        pcc pccVar = (pcc) this.f;
        int i2 = this.a;
        if (!yac.h(i2).p()) {
            new xk8(new e(null), 12, false).show();
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
        ConnectionsManager.getInstance(i2).sendRequest(updateemojistatus, new lh(zArr2, pccVar, i2, updateemojistatus, (byte) 8));
    }

    public qm0(ki kiVar, wm0 wm0Var, xm0 xm0Var, int i, int i2, hq7 hq7Var) {
        this.c = kiVar;
        this.d = wm0Var;
        this.e = xm0Var;
        this.a = i;
        this.b = i2;
        this.f = hq7Var;
    }

    public qm0(SparseIntArray sparseIntArray, int i, int i2, fic ficVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.c = sparseIntArray;
        this.a = i;
        this.b = i2;
        this.d = ficVar;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f = iArr;
    }
}
