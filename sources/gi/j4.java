package gi;

import android.util.SparseIntArray;
import ci.t8;
import java.util.Calendar;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.kk0;
import org.telegram.ui.Components.md0;
import org.telegram.ui.Components.mk0;
import org.telegram.ui.Components.od0;
public final class j4 implements org.telegram.ui.ActionBar.a2, kk0, md0 {
    public final int f11289a;
    public final int f11290b;
    public final Object f11291c;
    public final Object d;
    public final Object e;
    public final Object f11292f;

    public j4(int i10, boolean[] zArr, TLRPC.Document document, int i11, boolean[] zArr2, Utilities.Callback callback) {
        this.f11289a = i10;
        this.f11291c = zArr;
        this.e = document;
        this.f11290b = i11;
        this.d = zArr2;
        this.f11292f = callback;
    }

    @Override
    public void a(mk0 mk0Var, int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.e;
        int[] iArr = (int[]) this.f11292f;
        int i11 = this.f11290b + i10;
        int i12 = this.f11289a;
        ((SparseIntArray) this.f11291c).put(i12, i11);
        if (((z4.g) this.d).getCurrentItem() == i12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i11, true);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean[] zArr = (boolean[]) this.f11291c;
        TLRPC.Document document = (TLRPC.Document) this.e;
        boolean[] zArr2 = (boolean[]) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f11292f;
        int i11 = this.f11289a;
        if (!UserConfig.getInstance(i11).isPremium()) {
            new sg.x0(new org.telegram.ui.ActionBar.n2(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.f20278id;
        int i12 = this.f11290b;
        if (i12 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i11).getCurrentTime() + i12;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i11).sendRequest(updateemojistatus, new t8(zArr2, callback, i11, updateemojistatus, 1));
    }

    @Override
    public void q(od0 od0Var, int i10) {
        org.telegram.ui.Components.d4 d4Var = (org.telegram.ui.Components.d4) this.f11291c;
        ug.f fVar = (ug.f) this.d;
        ug.g gVar = (ug.g) this.e;
        od0 od0Var2 = (od0) this.f11292f;
        try {
            d4Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (od0Var.getTag() != null && od0Var.getTag().equals("DAY")) {
            if (od0Var.getValue() == od0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i11 = calendar.get(11);
                int i12 = (calendar.get(12) / 5) + 1;
                if (i12 > 11) {
                    if (i11 == 23) {
                        od0Var.setMinValue(od0Var.getMinValue() + 1);
                        fVar.setMinValue(0);
                    } else {
                        fVar.setMinValue(i11 + 1);
                    }
                    gVar.setMinValue(0);
                } else {
                    fVar.setMinValue(i11);
                    gVar.setMinValue(i12);
                }
            } else if (od0Var.getValue() == od0Var.getMaxValue()) {
                fVar.setMaxValue(this.f11289a);
                gVar.setMaxValue(Math.min(this.f11290b / 5, 11));
            } else {
                fVar.setMinValue(0);
                gVar.setMinValue(0);
                fVar.setMaxValue(23);
                gVar.setMaxValue(11);
            }
        }
        if (od0Var.getTag() != null && od0Var.getTag().equals("HOUR") && od0Var2.getValue() == od0Var2.getMinValue()) {
            if (od0Var.getValue() == od0Var.getMinValue()) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(System.currentTimeMillis());
                int i13 = (calendar2.get(12) / 5) + 1;
                if (i13 > 11) {
                    gVar.setMinValue(0);
                    return;
                } else {
                    gVar.setMinValue(i13);
                    return;
                }
            }
            gVar.setMinValue(0);
            gVar.setMaxValue(11);
        }
    }

    public j4(SparseIntArray sparseIntArray, int i10, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f11291c = sparseIntArray;
        this.f11289a = i10;
        this.f11290b = i11;
        this.d = gVar;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f11292f = iArr;
    }

    public j4(org.telegram.ui.Components.d4 d4Var, ug.f fVar, ug.g gVar, int i10, int i11, od0 od0Var) {
        this.f11291c = d4Var;
        this.d = fVar;
        this.e = gVar;
        this.f11289a = i10;
        this.f11290b = i11;
        this.f11292f = od0Var;
    }
}
