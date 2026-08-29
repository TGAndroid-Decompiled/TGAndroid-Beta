package eg;

import android.util.SparseIntArray;
import java.util.Calendar;
import lh.b8;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.qc0;
public final class e implements oc0, nj0, org.telegram.ui.ActionBar.b2 {
    public final int f5970a;
    public final int f5971b;
    public final Object f5972c;
    public final Object d;
    public final Object f5973e;
    public final Object f5974f;

    public e(int i10, boolean[] zArr, TLRPC.Document document, int i11, boolean[] zArr2, Utilities.Callback callback) {
        this.f5970a = i10;
        this.f5972c = zArr;
        this.d = document;
        this.f5971b = i11;
        this.f5973e = zArr2;
        this.f5974f = callback;
    }

    @Override
    public void a(pj0 pj0Var, int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f5973e;
        int[] iArr = (int[]) this.f5974f;
        int i11 = this.f5971b + i10;
        int i12 = this.f5970a;
        ((SparseIntArray) this.f5972c).put(i12, i11);
        if (((m2.g) this.d).getCurrentItem() == i12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i11, true);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        boolean[] zArr = (boolean[]) this.f5972c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        boolean[] zArr2 = (boolean[]) this.f5973e;
        Utilities.Callback callback = (Utilities.Callback) this.f5974f;
        int i11 = this.f5970a;
        if (!UserConfig.getInstance(i11).isPremium()) {
            new cg.p1(new org.telegram.ui.ActionBar.o2(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.f22398id;
        int i12 = this.f5971b;
        if (i12 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i11).getCurrentTime() + i12;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i11).sendRequest(updateemojistatus, new b8(zArr2, callback, i11, updateemojistatus, 8));
    }

    @Override
    public void q(qc0 qc0Var, int i10) {
        q qVar = (q) this.f5972c;
        o oVar = (o) this.d;
        p pVar = (p) this.f5973e;
        qc0 qc0Var2 = (qc0) this.f5974f;
        try {
            qVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (qc0Var.getTag() != null && qc0Var.getTag().equals("DAY")) {
            if (qc0Var.getValue() == qc0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i11 = calendar.get(11);
                int i12 = (calendar.get(12) / 5) + 1;
                if (i12 > 11) {
                    if (i11 == 23) {
                        qc0Var.setMinValue(qc0Var.getMinValue() + 1);
                        oVar.setMinValue(0);
                    } else {
                        oVar.setMinValue(i11 + 1);
                    }
                    pVar.setMinValue(0);
                } else {
                    oVar.setMinValue(i11);
                    pVar.setMinValue(i12);
                }
            } else if (qc0Var.getValue() == qc0Var.getMaxValue()) {
                oVar.setMaxValue(this.f5970a);
                pVar.setMaxValue(Math.min(this.f5971b / 5, 11));
            } else {
                oVar.setMinValue(0);
                pVar.setMinValue(0);
                oVar.setMaxValue(23);
                pVar.setMaxValue(11);
            }
        }
        if (qc0Var.getTag() != null && qc0Var.getTag().equals("HOUR") && qc0Var2.getValue() == qc0Var2.getMinValue()) {
            if (qc0Var.getValue() == qc0Var.getMinValue()) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(System.currentTimeMillis());
                int i13 = (calendar2.get(12) / 5) + 1;
                if (i13 > 11) {
                    pVar.setMinValue(0);
                    return;
                } else {
                    pVar.setMinValue(i13);
                    return;
                }
            }
            pVar.setMinValue(0);
            pVar.setMaxValue(11);
        }
    }

    public e(SparseIntArray sparseIntArray, int i10, int i11, m2.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f5972c = sparseIntArray;
        this.f5970a = i10;
        this.f5971b = i11;
        this.d = gVar;
        this.f5973e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f5974f = iArr;
    }

    public e(q qVar, o oVar, p pVar, int i10, int i11, qc0 qc0Var) {
        this.f5972c = qVar;
        this.d = oVar;
        this.f5973e = pVar;
        this.f5970a = i10;
        this.f5971b = i11;
        this.f5974f = qc0Var;
    }
}
