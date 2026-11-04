package ii;

import android.util.SparseIntArray;
import ei.i8;
import java.util.Calendar;
import org.telegram.messenger.h10;
import org.telegram.messenger.u10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ab0;
import org.telegram.ui.Components.cb0;
import org.telegram.ui.Components.sh0;
import org.telegram.ui.Components.uh0;
public final class g4 implements org.telegram.ui.ActionBar.p1, sh0, ab0 {
    public final int f14964a;
    public final int f14965b;
    public final Object f14966c;
    public final Object d;
    public final Object f14967e;
    public final Object f14968f;

    public g4(int i3, boolean[] zArr, TLRPC.Document document, int i10, boolean[] zArr2, u10 u10Var) {
        this.f14964a = i3;
        this.f14966c = zArr;
        this.f14967e = document;
        this.f14965b = i10;
        this.d = zArr2;
        this.f14968f = u10Var;
    }

    @Override
    public void c(uh0 uh0Var, int i3) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f14967e;
        int[] iArr = (int[]) this.f14968f;
        int i10 = this.f14965b + i3;
        int i11 = this.f14964a;
        ((SparseIntArray) this.f14966c).put(i11, i10);
        if (((b5.l) this.d).getCurrentItem() == i11) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i10, true);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        boolean[] zArr = (boolean[]) this.f14966c;
        TLRPC.Document document = (TLRPC.Document) this.f14967e;
        boolean[] zArr2 = (boolean[]) this.d;
        u10 u10Var = (u10) this.f14968f;
        int i10 = this.f14964a;
        if (!h10.i(i10).q()) {
            new vg.v0(new org.telegram.ui.ActionBar.d2(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.f27007id;
        int i11 = this.f14965b;
        if (i11 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i10).getCurrentTime() + i11;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i10).sendRequest(updateemojistatus, new i8(zArr2, u10Var, i10, updateemojistatus, 1));
    }

    @Override
    public void l(cb0 cb0Var, int i3) {
        org.telegram.ui.Components.w3 w3Var = (org.telegram.ui.Components.w3) this.f14966c;
        xg.h hVar = (xg.h) this.d;
        xg.i iVar = (xg.i) this.f14967e;
        cb0 cb0Var2 = (cb0) this.f14968f;
        try {
            w3Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (cb0Var.getTag() != null && cb0Var.getTag().equals("DAY")) {
            if (cb0Var.getValue() == cb0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i10 = calendar.get(11);
                int i11 = (calendar.get(12) / 5) + 1;
                if (i11 > 11) {
                    if (i10 == 23) {
                        cb0Var.setMinValue(cb0Var.getMinValue() + 1);
                        hVar.setMinValue(0);
                    } else {
                        hVar.setMinValue(i10 + 1);
                    }
                    iVar.setMinValue(0);
                } else {
                    hVar.setMinValue(i10);
                    iVar.setMinValue(i11);
                }
            } else if (cb0Var.getValue() == cb0Var.getMaxValue()) {
                hVar.setMaxValue(this.f14964a);
                iVar.setMaxValue(Math.min(this.f14965b / 5, 11));
            } else {
                hVar.setMinValue(0);
                iVar.setMinValue(0);
                hVar.setMaxValue(23);
                iVar.setMaxValue(11);
            }
        }
        if (cb0Var.getTag() != null && cb0Var.getTag().equals("HOUR") && cb0Var2.getValue() == cb0Var2.getMinValue()) {
            if (cb0Var.getValue() == cb0Var.getMinValue()) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(System.currentTimeMillis());
                int i12 = (calendar2.get(12) / 5) + 1;
                if (i12 > 11) {
                    iVar.setMinValue(0);
                    return;
                } else {
                    iVar.setMinValue(i12);
                    return;
                }
            }
            iVar.setMinValue(0);
            iVar.setMaxValue(11);
        }
    }

    public g4(SparseIntArray sparseIntArray, int i3, int i10, b5.l lVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f14966c = sparseIntArray;
        this.f14964a = i3;
        this.f14965b = i10;
        this.d = lVar;
        this.f14967e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f14968f = iArr;
    }

    public g4(org.telegram.ui.Components.w3 w3Var, xg.h hVar, xg.i iVar, int i3, int i10, cb0 cb0Var) {
        this.f14966c = w3Var;
        this.d = hVar;
        this.f14967e = iVar;
        this.f14964a = i3;
        this.f14965b = i10;
        this.f14968f = cb0Var;
    }
}
