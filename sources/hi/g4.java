package hi;

import android.util.SparseIntArray;
import di.i8;
import java.util.Calendar;
import org.telegram.messenger.c20;
import org.telegram.messenger.p10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.fb0;
import org.telegram.ui.Components.hb0;
import org.telegram.ui.Components.ph0;
import org.telegram.ui.Components.rh0;
public final class g4 implements org.telegram.ui.ActionBar.r1, ph0, fb0 {
    public final int f14685a;
    public final int f14686b;
    public final Object f14687c;
    public final Object d;
    public final Object f14688e;
    public final Object f14689f;

    public g4(int i7, boolean[] zArr, TLRPC.Document document, int i10, boolean[] zArr2, c20 c20Var) {
        this.f14685a = i7;
        this.f14687c = zArr;
        this.f14688e = document;
        this.f14686b = i10;
        this.d = zArr2;
        this.f14689f = c20Var;
    }

    @Override
    public void b(rh0 rh0Var, int i7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f14688e;
        int[] iArr = (int[]) this.f14689f;
        int i10 = this.f14686b + i7;
        int i11 = this.f14685a;
        ((SparseIntArray) this.f14687c).put(i11, i10);
        if (((c5.k) this.d).getCurrentItem() == i11) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i10, true);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        boolean[] zArr = (boolean[]) this.f14687c;
        TLRPC.Document document = (TLRPC.Document) this.f14688e;
        boolean[] zArr2 = (boolean[]) this.d;
        c20 c20Var = (c20) this.f14689f;
        int i10 = this.f14685a;
        if (!p10.i(i10).q()) {
            new ug.w0(new org.telegram.ui.ActionBar.f2(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.f26959id;
        int i11 = this.f14686b;
        if (i11 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i10).getCurrentTime() + i11;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i10).sendRequest(updateemojistatus, new i8(zArr2, c20Var, i10, updateemojistatus, 1));
    }

    @Override
    public void n(hb0 hb0Var, int i7) {
        org.telegram.ui.Components.y3 y3Var = (org.telegram.ui.Components.y3) this.f14687c;
        wg.f fVar = (wg.f) this.d;
        wg.g gVar = (wg.g) this.f14688e;
        hb0 hb0Var2 = (hb0) this.f14689f;
        try {
            y3Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (hb0Var.getTag() != null && hb0Var.getTag().equals("DAY")) {
            if (hb0Var.getValue() == hb0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i10 = calendar.get(11);
                int i11 = (calendar.get(12) / 5) + 1;
                if (i11 > 11) {
                    if (i10 == 23) {
                        hb0Var.setMinValue(hb0Var.getMinValue() + 1);
                        fVar.setMinValue(0);
                    } else {
                        fVar.setMinValue(i10 + 1);
                    }
                    gVar.setMinValue(0);
                } else {
                    fVar.setMinValue(i10);
                    gVar.setMinValue(i11);
                }
            } else if (hb0Var.getValue() == hb0Var.getMaxValue()) {
                fVar.setMaxValue(this.f14685a);
                gVar.setMaxValue(Math.min(this.f14686b / 5, 11));
            } else {
                fVar.setMinValue(0);
                gVar.setMinValue(0);
                fVar.setMaxValue(23);
                gVar.setMaxValue(11);
            }
        }
        if (hb0Var.getTag() != null && hb0Var.getTag().equals("HOUR") && hb0Var2.getValue() == hb0Var2.getMinValue()) {
            if (hb0Var.getValue() == hb0Var.getMinValue()) {
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

    public g4(SparseIntArray sparseIntArray, int i7, int i10, c5.k kVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f14687c = sparseIntArray;
        this.f14685a = i7;
        this.f14686b = i10;
        this.d = kVar;
        this.f14688e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f14689f = iArr;
    }

    public g4(org.telegram.ui.Components.y3 y3Var, wg.f fVar, wg.g gVar, int i7, int i10, hb0 hb0Var) {
        this.f14687c = y3Var;
        this.d = fVar;
        this.f14688e = gVar;
        this.f14685a = i7;
        this.f14686b = i10;
        this.f14689f = hb0Var;
    }
}
