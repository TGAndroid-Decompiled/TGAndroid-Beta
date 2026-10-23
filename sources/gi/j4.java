package gi;

import android.util.SparseIntArray;
import ci.s8;
import java.util.Calendar;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.od0;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Components.qk0;
public final class j4 implements org.telegram.ui.ActionBar.z1, ok0, od0 {
    public final int f11310a;
    public final int f11311b;
    public final Object f11312c;
    public final Object d;
    public final Object e;
    public final Object f11313f;

    public j4(int i10, boolean[] zArr, TLRPC.Document document, int i11, boolean[] zArr2, Utilities.Callback callback) {
        this.f11310a = i10;
        this.f11312c = zArr;
        this.e = document;
        this.f11311b = i11;
        this.d = zArr2;
        this.f11313f = callback;
    }

    @Override
    public void a(qk0 qk0Var, int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.e;
        int[] iArr = (int[]) this.f11313f;
        int i11 = this.f11311b + i10;
        int i12 = this.f11310a;
        ((SparseIntArray) this.f11312c).put(i12, i11);
        if (((z4.h) this.d).getCurrentItem() == i12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i11, true);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        boolean[] zArr = (boolean[]) this.f11312c;
        TLRPC.Document document = (TLRPC.Document) this.e;
        boolean[] zArr2 = (boolean[]) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f11313f;
        int i11 = this.f11310a;
        if (!UserConfig.getInstance(i11).isPremium()) {
            new sg.y0(new org.telegram.ui.ActionBar.o2(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.f20349id;
        int i12 = this.f11311b;
        if (i12 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i11).getCurrentTime() + i12;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i11).sendRequest(updateemojistatus, new s8(zArr2, callback, i11, updateemojistatus, 1));
    }

    @Override
    public void n(qd0 qd0Var, int i10) {
        org.telegram.ui.Components.c4 c4Var = (org.telegram.ui.Components.c4) this.f11312c;
        ug.f fVar = (ug.f) this.d;
        ug.g gVar = (ug.g) this.e;
        qd0 qd0Var2 = (qd0) this.f11313f;
        try {
            c4Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (qd0Var.getTag() != null && qd0Var.getTag().equals("DAY")) {
            if (qd0Var.getValue() == qd0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i11 = calendar.get(11);
                int i12 = (calendar.get(12) / 5) + 1;
                if (i12 > 11) {
                    if (i11 == 23) {
                        qd0Var.setMinValue(qd0Var.getMinValue() + 1);
                        fVar.setMinValue(0);
                    } else {
                        fVar.setMinValue(i11 + 1);
                    }
                    gVar.setMinValue(0);
                } else {
                    fVar.setMinValue(i11);
                    gVar.setMinValue(i12);
                }
            } else if (qd0Var.getValue() == qd0Var.getMaxValue()) {
                fVar.setMaxValue(this.f11310a);
                gVar.setMaxValue(Math.min(this.f11311b / 5, 11));
            } else {
                fVar.setMinValue(0);
                gVar.setMinValue(0);
                fVar.setMaxValue(23);
                gVar.setMaxValue(11);
            }
        }
        if (qd0Var.getTag() != null && qd0Var.getTag().equals("HOUR") && qd0Var2.getValue() == qd0Var2.getMinValue()) {
            if (qd0Var.getValue() == qd0Var.getMinValue()) {
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

    public j4(SparseIntArray sparseIntArray, int i10, int i11, z4.h hVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f11312c = sparseIntArray;
        this.f11310a = i10;
        this.f11311b = i11;
        this.d = hVar;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f11313f = iArr;
    }

    public j4(org.telegram.ui.Components.c4 c4Var, ug.f fVar, ug.g gVar, int i10, int i11, qd0 qd0Var) {
        this.f11312c = c4Var;
        this.d = fVar;
        this.e = gVar;
        this.f11310a = i10;
        this.f11311b = i11;
        this.f11313f = qd0Var;
    }
}
