package ki;

import android.util.SparseIntArray;
import fi.y7;
import java.util.Calendar;
import org.telegram.messenger.i10;
import org.telegram.messenger.w10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.gi0;
import org.telegram.ui.Components.ob0;
import org.telegram.ui.Components.qb0;
public final class w3 implements org.telegram.ui.ActionBar.q1, ei0, ob0 {
    public final int f19125a;
    public final int f19126b;
    public final Object f19127c;
    public final Object d;
    public final Object f19128e;
    public final Object f19129f;

    public w3(int i7, boolean[] zArr, TLRPC.Document document, int i10, boolean[] zArr2, w10 w10Var) {
        this.f19125a = i7;
        this.f19127c = zArr;
        this.f19128e = document;
        this.f19126b = i10;
        this.d = zArr2;
        this.f19129f = w10Var;
    }

    @Override
    public void b(gi0 gi0Var, int i7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f19128e;
        int[] iArr = (int[]) this.f19129f;
        int i10 = this.f19126b + i7;
        int i11 = this.f19125a;
        ((SparseIntArray) this.f19127c).put(i11, i10);
        if (((c5.l) this.d).getCurrentItem() == i11) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i10, true);
        }
    }

    @Override
    public void i(org.telegram.ui.ActionBar.t1 t1Var, int i7) {
        boolean[] zArr = (boolean[]) this.f19127c;
        TLRPC.Document document = (TLRPC.Document) this.f19128e;
        boolean[] zArr2 = (boolean[]) this.d;
        w10 w10Var = (w10) this.f19129f;
        int i10 = this.f19125a;
        if (!i10.i(i10).q()) {
            new ug.y0(new org.telegram.ui.ActionBar.g2(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.f28498id;
        int i11 = this.f19126b;
        if (i11 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i10).getCurrentTime() + i11;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i10).sendRequest(updateemojistatus, new y7(zArr2, w10Var, i10, updateemojistatus, 1));
    }

    @Override
    public void o(qb0 qb0Var, int i7) {
        org.telegram.ui.Components.e4 e4Var = (org.telegram.ui.Components.e4) this.f19127c;
        wg.f fVar = (wg.f) this.d;
        wg.g gVar = (wg.g) this.f19128e;
        qb0 qb0Var2 = (qb0) this.f19129f;
        try {
            e4Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (qb0Var.getTag() != null && qb0Var.getTag().equals("DAY")) {
            if (qb0Var.getValue() == qb0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i10 = calendar.get(11);
                int i11 = (calendar.get(12) / 5) + 1;
                if (i11 > 11) {
                    if (i10 == 23) {
                        qb0Var.setMinValue(qb0Var.getMinValue() + 1);
                        fVar.setMinValue(0);
                    } else {
                        fVar.setMinValue(i10 + 1);
                    }
                    gVar.setMinValue(0);
                } else {
                    fVar.setMinValue(i10);
                    gVar.setMinValue(i11);
                }
            } else if (qb0Var.getValue() == qb0Var.getMaxValue()) {
                fVar.setMaxValue(this.f19125a);
                gVar.setMaxValue(Math.min(this.f19126b / 5, 11));
            } else {
                fVar.setMinValue(0);
                gVar.setMinValue(0);
                fVar.setMaxValue(23);
                gVar.setMaxValue(11);
            }
        }
        if (qb0Var.getTag() != null && qb0Var.getTag().equals("HOUR") && qb0Var2.getValue() == qb0Var2.getMinValue()) {
            if (qb0Var.getValue() == qb0Var.getMinValue()) {
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

    public w3(SparseIntArray sparseIntArray, int i7, int i10, c5.l lVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f19127c = sparseIntArray;
        this.f19125a = i7;
        this.f19126b = i10;
        this.d = lVar;
        this.f19128e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f19129f = iArr;
    }

    public w3(org.telegram.ui.Components.e4 e4Var, wg.f fVar, wg.g gVar, int i7, int i10, qb0 qb0Var) {
        this.f19127c = e4Var;
        this.d = fVar;
        this.f19128e = gVar;
        this.f19125a = i7;
        this.f19126b = i10;
        this.f19129f = qb0Var;
    }
}
