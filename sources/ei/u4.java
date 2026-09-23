package ei;

import ai.za;
import android.util.SparseIntArray;
import java.util.Calendar;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.oj0;
import org.telegram.ui.Components.qj0;
import org.telegram.ui.Components.rc0;
import org.telegram.ui.Components.tc0;
public final class u4 implements org.telegram.ui.ActionBar.a2, oj0, rc0 {
    public final int f8636a;
    public final int f8637b;
    public final Object f8638c;
    public final Object d;
    public final Object e;
    public final Object f8639f;

    public u4(int i10, boolean[] zArr, TLRPC.Document document, int i11, boolean[] zArr2, Utilities.Callback callback) {
        this.f8636a = i10;
        this.f8638c = zArr;
        this.e = document;
        this.f8637b = i11;
        this.d = zArr2;
        this.f8639f = callback;
    }

    @Override
    public void a(qj0 qj0Var, int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.e;
        int[] iArr = (int[]) this.f8639f;
        int i11 = this.f8637b + i10;
        int i12 = this.f8636a;
        ((SparseIntArray) this.f8638c).put(i12, i11);
        if (((z4.g) this.d).getCurrentItem() == i12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i11, true);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean[] zArr = (boolean[]) this.f8638c;
        TLRPC.Document document = (TLRPC.Document) this.e;
        boolean[] zArr2 = (boolean[]) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f8639f;
        int i11 = this.f8636a;
        if (!UserConfig.getInstance(i11).isPremium()) {
            new rg.x0(new org.telegram.ui.ActionBar.n2(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.f18089id;
        int i12 = this.f8637b;
        if (i12 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i11).getCurrentTime() + i12;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i11).sendRequest(updateemojistatus, new za(zArr2, callback, i11, updateemojistatus, 1));
    }

    @Override
    public void q(tc0 tc0Var, int i10) {
        org.telegram.ui.Components.c4 c4Var = (org.telegram.ui.Components.c4) this.f8638c;
        tg.i iVar = (tg.i) this.d;
        tg.j jVar = (tg.j) this.e;
        tc0 tc0Var2 = (tc0) this.f8639f;
        try {
            c4Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (tc0Var.getTag() != null && tc0Var.getTag().equals("DAY")) {
            if (tc0Var.getValue() == tc0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i11 = calendar.get(11);
                int i12 = (calendar.get(12) / 5) + 1;
                if (i12 > 11) {
                    if (i11 == 23) {
                        tc0Var.setMinValue(tc0Var.getMinValue() + 1);
                        iVar.setMinValue(0);
                    } else {
                        iVar.setMinValue(i11 + 1);
                    }
                    jVar.setMinValue(0);
                } else {
                    iVar.setMinValue(i11);
                    jVar.setMinValue(i12);
                }
            } else if (tc0Var.getValue() == tc0Var.getMaxValue()) {
                iVar.setMaxValue(this.f8636a);
                jVar.setMaxValue(Math.min(this.f8637b / 5, 11));
            } else {
                iVar.setMinValue(0);
                jVar.setMinValue(0);
                iVar.setMaxValue(23);
                jVar.setMaxValue(11);
            }
        }
        if (tc0Var.getTag() != null && tc0Var.getTag().equals("HOUR") && tc0Var2.getValue() == tc0Var2.getMinValue()) {
            if (tc0Var.getValue() == tc0Var.getMinValue()) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(System.currentTimeMillis());
                int i13 = (calendar2.get(12) / 5) + 1;
                if (i13 > 11) {
                    jVar.setMinValue(0);
                    return;
                } else {
                    jVar.setMinValue(i13);
                    return;
                }
            }
            jVar.setMinValue(0);
            jVar.setMaxValue(11);
        }
    }

    public u4(SparseIntArray sparseIntArray, int i10, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f8638c = sparseIntArray;
        this.f8636a = i10;
        this.f8637b = i11;
        this.d = gVar;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f8639f = iArr;
    }

    public u4(org.telegram.ui.Components.c4 c4Var, tg.i iVar, tg.j jVar, int i10, int i11, tc0 tc0Var) {
        this.f8638c = c4Var;
        this.d = iVar;
        this.e = jVar;
        this.f8636a = i10;
        this.f8637b = i11;
        this.f8639f = tc0Var;
    }
}
