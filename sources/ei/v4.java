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
import org.telegram.ui.Components.ak0;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.gd0;
public final class v4 implements org.telegram.ui.ActionBar.a2, ak0, ed0 {
    public final int f9397a;
    public final int f9398b;
    public final Object f9399c;
    public final Object d;
    public final Object f9400e;
    public final Object f9401f;

    public v4(int i10, boolean[] zArr, TLRPC.Document document, int i11, boolean[] zArr2, Utilities.Callback callback) {
        this.f9397a = i10;
        this.f9399c = zArr;
        this.f9400e = document;
        this.f9398b = i11;
        this.d = zArr2;
        this.f9401f = callback;
    }

    @Override
    public void a(ck0 ck0Var, int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f9400e;
        int[] iArr = (int[]) this.f9401f;
        int i11 = this.f9398b + i10;
        int i12 = this.f9397a;
        ((SparseIntArray) this.f9399c).put(i12, i11);
        if (((z4.g) this.d).getCurrentItem() == i12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i11, true);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean[] zArr = (boolean[]) this.f9399c;
        TLRPC.Document document = (TLRPC.Document) this.f9400e;
        boolean[] zArr2 = (boolean[]) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f9401f;
        int i11 = this.f9397a;
        if (!UserConfig.getInstance(i11).isPremium()) {
            new rg.y0(new org.telegram.ui.ActionBar.n2(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.f20044id;
        int i12 = this.f9398b;
        if (i12 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i11).getCurrentTime() + i12;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i11).sendRequest(updateemojistatus, new za(zArr2, callback, i11, updateemojistatus, 1));
    }

    @Override
    public void q(gd0 gd0Var, int i10) {
        org.telegram.ui.Components.c4 c4Var = (org.telegram.ui.Components.c4) this.f9399c;
        tg.g gVar = (tg.g) this.d;
        tg.h hVar = (tg.h) this.f9400e;
        gd0 gd0Var2 = (gd0) this.f9401f;
        try {
            c4Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (gd0Var.getTag() != null && gd0Var.getTag().equals("DAY")) {
            if (gd0Var.getValue() == gd0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i11 = calendar.get(11);
                int i12 = (calendar.get(12) / 5) + 1;
                if (i12 > 11) {
                    if (i11 == 23) {
                        gd0Var.setMinValue(gd0Var.getMinValue() + 1);
                        gVar.setMinValue(0);
                    } else {
                        gVar.setMinValue(i11 + 1);
                    }
                    hVar.setMinValue(0);
                } else {
                    gVar.setMinValue(i11);
                    hVar.setMinValue(i12);
                }
            } else if (gd0Var.getValue() == gd0Var.getMaxValue()) {
                gVar.setMaxValue(this.f9397a);
                hVar.setMaxValue(Math.min(this.f9398b / 5, 11));
            } else {
                gVar.setMinValue(0);
                hVar.setMinValue(0);
                gVar.setMaxValue(23);
                hVar.setMaxValue(11);
            }
        }
        if (gd0Var.getTag() != null && gd0Var.getTag().equals("HOUR") && gd0Var2.getValue() == gd0Var2.getMinValue()) {
            if (gd0Var.getValue() == gd0Var.getMinValue()) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(System.currentTimeMillis());
                int i13 = (calendar2.get(12) / 5) + 1;
                if (i13 > 11) {
                    hVar.setMinValue(0);
                    return;
                } else {
                    hVar.setMinValue(i13);
                    return;
                }
            }
            hVar.setMinValue(0);
            hVar.setMaxValue(11);
        }
    }

    public v4(SparseIntArray sparseIntArray, int i10, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f9399c = sparseIntArray;
        this.f9397a = i10;
        this.f9398b = i11;
        this.d = gVar;
        this.f9400e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f9401f = iArr;
    }

    public v4(org.telegram.ui.Components.c4 c4Var, tg.g gVar, tg.h hVar, int i10, int i11, gd0 gd0Var) {
        this.f9399c = c4Var;
        this.d = gVar;
        this.f9400e = hVar;
        this.f9397a = i10;
        this.f9398b = i11;
        this.f9401f = gd0Var;
    }
}
