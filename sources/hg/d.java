package hg;

import android.util.SparseIntArray;
import java.util.Calendar;
import oh.b8;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.zj0;
public final class d implements wc0, xj0, org.telegram.ui.ActionBar.c2 {
    public final int f7438a;
    public final int f7439b;
    public final Object f7440c;
    public final Object d;
    public final Object f7441e;
    public final Object f7442f;

    public d(int i10, boolean[] zArr, TLRPC.Document document, int i11, boolean[] zArr2, Utilities.Callback callback) {
        this.f7438a = i10;
        this.f7440c = zArr;
        this.d = document;
        this.f7439b = i11;
        this.f7441e = zArr2;
        this.f7442f = callback;
    }

    @Override
    public void a(zj0 zj0Var, int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f7441e;
        int[] iArr = (int[]) this.f7442f;
        int i11 = this.f7439b + i10;
        int i12 = this.f7438a;
        ((SparseIntArray) this.f7440c).put(i12, i11);
        if (((m2.h) this.d).getCurrentItem() == i12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i11, true);
        }
    }

    @Override
    public void j(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        boolean[] zArr = (boolean[]) this.f7440c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        boolean[] zArr2 = (boolean[]) this.f7441e;
        Utilities.Callback callback = (Utilities.Callback) this.f7442f;
        int i11 = this.f7438a;
        if (!UserConfig.getInstance(i11).isPremium()) {
            new fg.n1(new org.telegram.ui.ActionBar.p2(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.f20851id;
        int i12 = this.f7439b;
        if (i12 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i11).getCurrentTime() + i12;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i11).sendRequest(updateemojistatus, new b8(zArr2, callback, i11, updateemojistatus, 8));
    }

    @Override
    public void q(yc0 yc0Var, int i10) {
        p pVar = (p) this.f7440c;
        n nVar = (n) this.d;
        o oVar = (o) this.f7441e;
        yc0 yc0Var2 = (yc0) this.f7442f;
        try {
            pVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (yc0Var.getTag() != null && yc0Var.getTag().equals("DAY")) {
            if (yc0Var.getValue() == yc0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i11 = calendar.get(11);
                int i12 = (calendar.get(12) / 5) + 1;
                if (i12 > 11) {
                    if (i11 == 23) {
                        yc0Var.setMinValue(yc0Var.getMinValue() + 1);
                        nVar.setMinValue(0);
                    } else {
                        nVar.setMinValue(i11 + 1);
                    }
                    oVar.setMinValue(0);
                } else {
                    nVar.setMinValue(i11);
                    oVar.setMinValue(i12);
                }
            } else if (yc0Var.getValue() == yc0Var.getMaxValue()) {
                nVar.setMaxValue(this.f7438a);
                oVar.setMaxValue(Math.min(this.f7439b / 5, 11));
            } else {
                nVar.setMinValue(0);
                oVar.setMinValue(0);
                nVar.setMaxValue(23);
                oVar.setMaxValue(11);
            }
        }
        if (yc0Var.getTag() != null && yc0Var.getTag().equals("HOUR") && yc0Var2.getValue() == yc0Var2.getMinValue()) {
            if (yc0Var.getValue() == yc0Var.getMinValue()) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(System.currentTimeMillis());
                int i13 = (calendar2.get(12) / 5) + 1;
                if (i13 > 11) {
                    oVar.setMinValue(0);
                    return;
                } else {
                    oVar.setMinValue(i13);
                    return;
                }
            }
            oVar.setMinValue(0);
            oVar.setMaxValue(11);
        }
    }

    public d(SparseIntArray sparseIntArray, int i10, int i11, m2.h hVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f7440c = sparseIntArray;
        this.f7438a = i10;
        this.f7439b = i11;
        this.d = hVar;
        this.f7441e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f7442f = iArr;
    }

    public d(p pVar, n nVar, o oVar, int i10, int i11, yc0 yc0Var) {
        this.f7440c = pVar;
        this.d = nVar;
        this.f7441e = oVar;
        this.f7438a = i10;
        this.f7439b = i11;
        this.f7442f = yc0Var;
    }
}
