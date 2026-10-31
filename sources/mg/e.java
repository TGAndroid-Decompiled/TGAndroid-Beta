package mg;

import android.util.SparseIntArray;
import java.util.Calendar;
import org.telegram.messenger.d20;
import org.telegram.messenger.q20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.ti0;
import org.telegram.ui.Components.vi0;
import org.telegram.ui.Components.yb0;
public final class e implements yb0, ti0, org.telegram.ui.ActionBar.u1 {
    public final int f13096a;
    public final int f13097b;
    public final Object f13098c;
    public final Object d;
    public final Object e;
    public final Object f13099f;

    public e(int i10, boolean[] zArr, TLRPC.Document document, int i11, boolean[] zArr2, q20 q20Var) {
        this.f13096a = i10;
        this.f13098c = zArr;
        this.d = document;
        this.f13097b = i11;
        this.e = zArr2;
        this.f13099f = q20Var;
    }

    @Override
    public void c(vi0 vi0Var, int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.e;
        int[] iArr = (int[]) this.f13099f;
        int i11 = this.f13097b + i10;
        int i12 = this.f13096a;
        ((SparseIntArray) this.f13098c).put(i12, i11);
        if (((z4.g) this.d).getCurrentItem() == i12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i11, true);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        boolean[] zArr = (boolean[]) this.f13098c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        boolean[] zArr2 = (boolean[]) this.e;
        q20 q20Var = (q20) this.f13099f;
        int i11 = this.f13096a;
        if (!d20.i(i11).q()) {
            new kg.i1(new k2(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.f19799id;
        int i12 = this.f13097b;
        if (i12 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i11).getCurrentTime() + i12;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i11).sendRequest(updateemojistatus, new org.telegram.ui.b0(zArr2, q20Var, i11, updateemojistatus, 8));
    }

    @Override
    public void t(ac0 ac0Var, int i10) {
        o oVar = (o) this.f13098c;
        m mVar = (m) this.d;
        n nVar = (n) this.e;
        ac0 ac0Var2 = (ac0) this.f13099f;
        try {
            oVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (ac0Var.getTag() != null && ac0Var.getTag().equals("DAY")) {
            if (ac0Var.getValue() == ac0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i11 = calendar.get(11);
                int i12 = (calendar.get(12) / 5) + 1;
                if (i12 > 11) {
                    if (i11 == 23) {
                        ac0Var.setMinValue(ac0Var.getMinValue() + 1);
                        mVar.setMinValue(0);
                    } else {
                        mVar.setMinValue(i11 + 1);
                    }
                    nVar.setMinValue(0);
                } else {
                    mVar.setMinValue(i11);
                    nVar.setMinValue(i12);
                }
            } else if (ac0Var.getValue() == ac0Var.getMaxValue()) {
                mVar.setMaxValue(this.f13096a);
                nVar.setMaxValue(Math.min(this.f13097b / 5, 11));
            } else {
                mVar.setMinValue(0);
                nVar.setMinValue(0);
                mVar.setMaxValue(23);
                nVar.setMaxValue(11);
            }
        }
        if (ac0Var.getTag() != null && ac0Var.getTag().equals("HOUR") && ac0Var2.getValue() == ac0Var2.getMinValue()) {
            if (ac0Var.getValue() == ac0Var.getMinValue()) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(System.currentTimeMillis());
                int i13 = (calendar2.get(12) / 5) + 1;
                if (i13 > 11) {
                    nVar.setMinValue(0);
                    return;
                } else {
                    nVar.setMinValue(i13);
                    return;
                }
            }
            nVar.setMinValue(0);
            nVar.setMaxValue(11);
        }
    }

    public e(SparseIntArray sparseIntArray, int i10, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f13098c = sparseIntArray;
        this.f13096a = i10;
        this.f13097b = i11;
        this.d = gVar;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f13099f = iArr;
    }

    public e(o oVar, m mVar, n nVar, int i10, int i11, ac0 ac0Var) {
        this.f13098c = oVar;
        this.d = mVar;
        this.e = nVar;
        this.f13096a = i10;
        this.f13097b = i11;
        this.f13099f = ac0Var;
    }
}
