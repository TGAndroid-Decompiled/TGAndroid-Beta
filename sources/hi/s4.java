package hi;

import android.util.SparseIntArray;
import di.q8;
import java.util.Calendar;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.kd0;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.nk0;
import org.telegram.ui.Components.pk0;
public final class s4 implements org.telegram.ui.ActionBar.b2, nk0, kd0 {
    public final int f13277a;
    public final int f13278b;
    public final Object f13279c;
    public final Object d;
    public final Object e;
    public final Object f13280f;

    public s4(int i10, boolean[] zArr, TLRPC.Document document, int i11, boolean[] zArr2, Utilities.Callback callback) {
        this.f13277a = i10;
        this.f13279c = zArr;
        this.e = document;
        this.f13278b = i11;
        this.d = zArr2;
        this.f13280f = callback;
    }

    @Override
    public void a(pk0 pk0Var, int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.e;
        int[] iArr = (int[]) this.f13280f;
        int i11 = this.f13278b + i10;
        int i12 = this.f13277a;
        ((SparseIntArray) this.f13279c).put(i12, i11);
        if (((a5.m) this.d).getCurrentItem() == i12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i11, true);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        boolean[] zArr = (boolean[]) this.f13279c;
        TLRPC.Document document = (TLRPC.Document) this.e;
        boolean[] zArr2 = (boolean[]) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f13280f;
        int i11 = this.f13277a;
        if (!UserConfig.getInstance(i11).isPremium()) {
            new tg.y0(new org.telegram.ui.ActionBar.r2(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.f22033id;
        int i12 = this.f13278b;
        if (i12 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i11).getCurrentTime() + i12;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i11).sendRequest(updateemojistatus, new q8(zArr2, callback, i11, updateemojistatus, 1));
    }

    @Override
    public void q(md0 md0Var, int i10) {
        org.telegram.ui.Components.e4 e4Var = (org.telegram.ui.Components.e4) this.f13279c;
        vg.h hVar = (vg.h) this.d;
        vg.i iVar = (vg.i) this.e;
        md0 md0Var2 = (md0) this.f13280f;
        try {
            e4Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (md0Var.getTag() != null && md0Var.getTag().equals("DAY")) {
            if (md0Var.getValue() == md0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i11 = calendar.get(11);
                int i12 = (calendar.get(12) / 5) + 1;
                if (i12 > 11) {
                    if (i11 == 23) {
                        md0Var.setMinValue(md0Var.getMinValue() + 1);
                        hVar.setMinValue(0);
                    } else {
                        hVar.setMinValue(i11 + 1);
                    }
                    iVar.setMinValue(0);
                } else {
                    hVar.setMinValue(i11);
                    iVar.setMinValue(i12);
                }
            } else if (md0Var.getValue() == md0Var.getMaxValue()) {
                hVar.setMaxValue(this.f13277a);
                iVar.setMaxValue(Math.min(this.f13278b / 5, 11));
            } else {
                hVar.setMinValue(0);
                iVar.setMinValue(0);
                hVar.setMaxValue(23);
                iVar.setMaxValue(11);
            }
        }
        if (md0Var.getTag() != null && md0Var.getTag().equals("HOUR") && md0Var2.getValue() == md0Var2.getMinValue()) {
            if (md0Var.getValue() == md0Var.getMinValue()) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(System.currentTimeMillis());
                int i13 = (calendar2.get(12) / 5) + 1;
                if (i13 > 11) {
                    iVar.setMinValue(0);
                    return;
                } else {
                    iVar.setMinValue(i13);
                    return;
                }
            }
            iVar.setMinValue(0);
            iVar.setMaxValue(11);
        }
    }

    public s4(SparseIntArray sparseIntArray, int i10, int i11, a5.m mVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f13279c = sparseIntArray;
        this.f13277a = i10;
        this.f13278b = i11;
        this.d = mVar;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f13280f = iArr;
    }

    public s4(org.telegram.ui.Components.e4 e4Var, vg.h hVar, vg.i iVar, int i10, int i11, md0 md0Var) {
        this.f13279c = e4Var;
        this.d = hVar;
        this.e = iVar;
        this.f13277a = i10;
        this.f13278b = i11;
        this.f13280f = md0Var;
    }
}
