package bg;

import android.util.SparseIntArray;
import ih.f8;
import java.util.Calendar;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.cj0;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.zb0;
public final class g implements zb0, org.telegram.ui.ActionBar.b2, cj0 {
    public final int f1763a;
    public final int f1764b;
    public final Object f1765c;
    public final Object d;
    public final Object f1766e;
    public final Object f1767f;

    public g(int i9, boolean[] zArr, TLRPC.Document document, int i10, boolean[] zArr2, Utilities.Callback callback) {
        this.f1763a = i9;
        this.f1765c = zArr;
        this.d = document;
        this.f1764b = i10;
        this.f1766e = zArr2;
        this.f1767f = callback;
    }

    @Override
    public void a(ej0 ej0Var, int i9) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f1766e;
        int[] iArr = (int[]) this.f1767f;
        int i10 = this.f1764b + i9;
        int i11 = this.f1763a;
        ((SparseIntArray) this.f1765c).put(i11, i10);
        if (((m2.g) this.d).getCurrentItem() == i11) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i10, true);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        boolean[] zArr = (boolean[]) this.f1765c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        boolean[] zArr2 = (boolean[]) this.f1766e;
        Utilities.Callback callback = (Utilities.Callback) this.f1767f;
        int i10 = this.f1763a;
        if (!UserConfig.getInstance(i10).isPremium()) {
            new zf.x0(new org.telegram.ui.ActionBar.o2(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.f22386id;
        int i11 = this.f1764b;
        if (i11 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i10).getCurrentTime() + i11;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i10).sendRequest(updateemojistatus, new f8(zArr2, callback, i10, updateemojistatus, 1));
    }

    @Override
    public void m(bc0 bc0Var, int i9) {
        s sVar = (s) this.f1765c;
        q qVar = (q) this.d;
        r rVar = (r) this.f1766e;
        bc0 bc0Var2 = (bc0) this.f1767f;
        try {
            sVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (bc0Var.getTag() != null && bc0Var.getTag().equals("DAY")) {
            if (bc0Var.getValue() == bc0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i10 = calendar.get(11);
                int i11 = (calendar.get(12) / 5) + 1;
                if (i11 > 11) {
                    if (i10 == 23) {
                        bc0Var.setMinValue(bc0Var.getMinValue() + 1);
                        qVar.setMinValue(0);
                    } else {
                        qVar.setMinValue(i10 + 1);
                    }
                    rVar.setMinValue(0);
                } else {
                    qVar.setMinValue(i10);
                    rVar.setMinValue(i11);
                }
            } else if (bc0Var.getValue() == bc0Var.getMaxValue()) {
                qVar.setMaxValue(this.f1763a);
                rVar.setMaxValue(Math.min(this.f1764b / 5, 11));
            } else {
                qVar.setMinValue(0);
                rVar.setMinValue(0);
                qVar.setMaxValue(23);
                rVar.setMaxValue(11);
            }
        }
        if (bc0Var.getTag() != null && bc0Var.getTag().equals("HOUR") && bc0Var2.getValue() == bc0Var2.getMinValue()) {
            if (bc0Var.getValue() == bc0Var.getMinValue()) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(System.currentTimeMillis());
                int i12 = (calendar2.get(12) / 5) + 1;
                if (i12 > 11) {
                    rVar.setMinValue(0);
                    return;
                } else {
                    rVar.setMinValue(i12);
                    return;
                }
            }
            rVar.setMinValue(0);
            rVar.setMaxValue(11);
        }
    }

    public g(SparseIntArray sparseIntArray, int i9, int i10, m2.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f1765c = sparseIntArray;
        this.f1763a = i9;
        this.f1764b = i10;
        this.d = gVar;
        this.f1766e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f1767f = iArr;
    }

    public g(s sVar, q qVar, r rVar, int i9, int i10, bc0 bc0Var) {
        this.f1765c = sVar;
        this.d = qVar;
        this.f1766e = rVar;
        this.f1763a = i9;
        this.f1764b = i10;
        this.f1767f = bc0Var;
    }
}
