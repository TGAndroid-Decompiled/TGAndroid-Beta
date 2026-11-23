package ki;

import android.util.SparseIntArray;
import fi.y7;
import java.util.Calendar;
import org.telegram.messenger.k10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.f4;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.rb0;
import org.telegram.ui.Components.tb0;
public final class v3 implements org.telegram.ui.ActionBar.q1, ei0, rb0 {
    public final int f19007a;
    public final int f19008b;
    public final Object f19009c;
    public final Object d;
    public final Object f19010e;
    public final Object f19011f;

    public v3(int i7, boolean[] zArr, TLRPC.Document document, int i10, boolean[] zArr2, y10 y10Var) {
        this.f19007a = i7;
        this.f19009c = zArr;
        this.f19010e = document;
        this.f19008b = i10;
        this.d = zArr2;
        this.f19011f = y10Var;
    }

    @Override
    public void b(gi0 gi0Var, int i7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f19010e;
        int[] iArr = (int[]) this.f19011f;
        int i10 = this.f19008b + i7;
        int i11 = this.f19007a;
        ((SparseIntArray) this.f19009c).put(i11, i10);
        if (((c5.l) this.d).getCurrentItem() == i11) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i10, true);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        boolean[] zArr = (boolean[]) this.f19009c;
        TLRPC.Document document = (TLRPC.Document) this.f19010e;
        boolean[] zArr2 = (boolean[]) this.d;
        y10 y10Var = (y10) this.f19011f;
        int i10 = this.f19007a;
        if (!k10.i(i10).q()) {
            new ug.y0(new org.telegram.ui.ActionBar.g2(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.f28404id;
        int i11 = this.f19008b;
        if (i11 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i10).getCurrentTime() + i11;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i10).sendRequest(updateemojistatus, new y7(zArr2, y10Var, i10, updateemojistatus, 1));
    }

    @Override
    public void n(tb0 tb0Var, int i7) {
        f4 f4Var = (f4) this.f19009c;
        wg.f fVar = (wg.f) this.d;
        wg.g gVar = (wg.g) this.f19010e;
        tb0 tb0Var2 = (tb0) this.f19011f;
        try {
            f4Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (tb0Var.getTag() != null && tb0Var.getTag().equals("DAY")) {
            if (tb0Var.getValue() == tb0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i10 = calendar.get(11);
                int i11 = (calendar.get(12) / 5) + 1;
                if (i11 > 11) {
                    if (i10 == 23) {
                        tb0Var.setMinValue(tb0Var.getMinValue() + 1);
                        fVar.setMinValue(0);
                    } else {
                        fVar.setMinValue(i10 + 1);
                    }
                    gVar.setMinValue(0);
                } else {
                    fVar.setMinValue(i10);
                    gVar.setMinValue(i11);
                }
            } else if (tb0Var.getValue() == tb0Var.getMaxValue()) {
                fVar.setMaxValue(this.f19007a);
                gVar.setMaxValue(Math.min(this.f19008b / 5, 11));
            } else {
                fVar.setMinValue(0);
                gVar.setMinValue(0);
                fVar.setMaxValue(23);
                gVar.setMaxValue(11);
            }
        }
        if (tb0Var.getTag() != null && tb0Var.getTag().equals("HOUR") && tb0Var2.getValue() == tb0Var2.getMinValue()) {
            if (tb0Var.getValue() == tb0Var.getMinValue()) {
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

    public v3(SparseIntArray sparseIntArray, int i7, int i10, c5.l lVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f19009c = sparseIntArray;
        this.f19007a = i7;
        this.f19008b = i10;
        this.d = lVar;
        this.f19010e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f19011f = iArr;
    }

    public v3(f4 f4Var, wg.f fVar, wg.g gVar, int i7, int i10, tb0 tb0Var) {
        this.f19009c = f4Var;
        this.d = fVar;
        this.f19010e = gVar;
        this.f19007a = i7;
        this.f19008b = i10;
        this.f19011f = tb0Var;
    }
}
