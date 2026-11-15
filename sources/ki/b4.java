package ki;

import android.util.SparseIntArray;
import fi.b8;
import java.util.Calendar;
import org.telegram.messenger.m10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.gb0;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.th0;
import org.telegram.ui.Components.vh0;
public final class b4 implements org.telegram.ui.ActionBar.q1, th0, gb0 {
    public final int f18220a;
    public final int f18221b;
    public final Object f18222c;
    public final Object d;
    public final Object f18223e;
    public final Object f18224f;

    public b4(int i7, boolean[] zArr, TLRPC.Document document, int i10, boolean[] zArr2, z10 z10Var) {
        this.f18220a = i7;
        this.f18222c = zArr;
        this.f18223e = document;
        this.f18221b = i10;
        this.d = zArr2;
        this.f18224f = z10Var;
    }

    @Override
    public void b(vh0 vh0Var, int i7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f18223e;
        int[] iArr = (int[]) this.f18224f;
        int i10 = this.f18221b + i7;
        int i11 = this.f18220a;
        ((SparseIntArray) this.f18222c).put(i11, i10);
        if (((c5.l) this.d).getCurrentItem() == i11) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i10, true);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        boolean[] zArr = (boolean[]) this.f18222c;
        TLRPC.Document document = (TLRPC.Document) this.f18223e;
        boolean[] zArr2 = (boolean[]) this.d;
        z10 z10Var = (z10) this.f18224f;
        int i10 = this.f18220a;
        if (!m10.i(i10).q()) {
            new ug.x0(new org.telegram.ui.ActionBar.e2(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.f28057id;
        int i11 = this.f18221b;
        if (i11 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i10).getCurrentTime() + i11;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i10).sendRequest(updateemojistatus, new b8(zArr2, z10Var, i10, updateemojistatus, 1));
    }

    @Override
    public void m(ib0 ib0Var, int i7) {
        org.telegram.ui.Components.w3 w3Var = (org.telegram.ui.Components.w3) this.f18222c;
        wg.f fVar = (wg.f) this.d;
        wg.g gVar = (wg.g) this.f18223e;
        ib0 ib0Var2 = (ib0) this.f18224f;
        try {
            w3Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (ib0Var.getTag() != null && ib0Var.getTag().equals("DAY")) {
            if (ib0Var.getValue() == ib0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i10 = calendar.get(11);
                int i11 = (calendar.get(12) / 5) + 1;
                if (i11 > 11) {
                    if (i10 == 23) {
                        ib0Var.setMinValue(ib0Var.getMinValue() + 1);
                        fVar.setMinValue(0);
                    } else {
                        fVar.setMinValue(i10 + 1);
                    }
                    gVar.setMinValue(0);
                } else {
                    fVar.setMinValue(i10);
                    gVar.setMinValue(i11);
                }
            } else if (ib0Var.getValue() == ib0Var.getMaxValue()) {
                fVar.setMaxValue(this.f18220a);
                gVar.setMaxValue(Math.min(this.f18221b / 5, 11));
            } else {
                fVar.setMinValue(0);
                gVar.setMinValue(0);
                fVar.setMaxValue(23);
                gVar.setMaxValue(11);
            }
        }
        if (ib0Var.getTag() != null && ib0Var.getTag().equals("HOUR") && ib0Var2.getValue() == ib0Var2.getMinValue()) {
            if (ib0Var.getValue() == ib0Var.getMinValue()) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(System.currentTimeMillis());
                int i12 = (calendar2.get(12) / 5) + 1;
                if (i12 > 11) {
                    gVar.setMinValue(0);
                    return;
                } else {
                    gVar.setMinValue(i12);
                    return;
                }
            }
            gVar.setMinValue(0);
            gVar.setMaxValue(11);
        }
    }

    public b4(SparseIntArray sparseIntArray, int i7, int i10, c5.l lVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f18222c = sparseIntArray;
        this.f18220a = i7;
        this.f18221b = i10;
        this.d = lVar;
        this.f18223e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f18224f = iArr;
    }

    public b4(org.telegram.ui.Components.w3 w3Var, wg.f fVar, wg.g gVar, int i7, int i10, ib0 ib0Var) {
        this.f18222c = w3Var;
        this.d = fVar;
        this.f18223e = gVar;
        this.f18220a = i7;
        this.f18221b = i10;
        this.f18224f = ib0Var;
    }
}
