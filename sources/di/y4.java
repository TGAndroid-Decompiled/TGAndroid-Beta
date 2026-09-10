package di;

import android.util.SparseIntArray;
import java.util.Calendar;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.bd0;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.zj0;
public final class y4 implements org.telegram.ui.ActionBar.c2, xj0, bd0 {
    public final int f7039a;
    public final int f7040b;
    public final Object f7041c;
    public final Object d;
    public final Object e;
    public final Object f7042f;

    public y4(int i10, boolean[] zArr, TLRPC.Document document, int i11, boolean[] zArr2, Utilities.Callback callback) {
        this.f7039a = i10;
        this.f7041c = zArr;
        this.e = document;
        this.f7040b = i11;
        this.d = zArr2;
        this.f7042f = callback;
    }

    @Override
    public void a(zj0 zj0Var, int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.e;
        int[] iArr = (int[]) this.f7042f;
        int i11 = this.f7040b + i10;
        int i12 = this.f7039a;
        ((SparseIntArray) this.f7041c).put(i12, i11);
        if (((z4.g) this.d).getCurrentItem() == i12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i11, true);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        boolean[] zArr = (boolean[]) this.f7041c;
        TLRPC.Document document = (TLRPC.Document) this.e;
        boolean[] zArr2 = (boolean[]) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f7042f;
        int i11 = this.f7039a;
        if (!UserConfig.getInstance(i11).isPremium()) {
            new qg.a1(new org.telegram.ui.ActionBar.p2(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.f17201id;
        int i12 = this.f7040b;
        if (i12 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i11).getCurrentTime() + i12;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i11).sendRequest(updateemojistatus, new c5(zArr2, callback, i11, updateemojistatus, 0));
    }

    @Override
    public void q(dd0 dd0Var, int i10) {
        org.telegram.ui.Components.b4 b4Var = (org.telegram.ui.Components.b4) this.f7041c;
        sg.g gVar = (sg.g) this.d;
        sg.h hVar = (sg.h) this.e;
        dd0 dd0Var2 = (dd0) this.f7042f;
        try {
            b4Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (dd0Var.getTag() != null && dd0Var.getTag().equals("DAY")) {
            if (dd0Var.getValue() == dd0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i11 = calendar.get(11);
                int i12 = (calendar.get(12) / 5) + 1;
                if (i12 > 11) {
                    if (i11 == 23) {
                        dd0Var.setMinValue(dd0Var.getMinValue() + 1);
                        gVar.setMinValue(0);
                    } else {
                        gVar.setMinValue(i11 + 1);
                    }
                    hVar.setMinValue(0);
                } else {
                    gVar.setMinValue(i11);
                    hVar.setMinValue(i12);
                }
            } else if (dd0Var.getValue() == dd0Var.getMaxValue()) {
                gVar.setMaxValue(this.f7039a);
                hVar.setMaxValue(Math.min(this.f7040b / 5, 11));
            } else {
                gVar.setMinValue(0);
                hVar.setMinValue(0);
                gVar.setMaxValue(23);
                hVar.setMaxValue(11);
            }
        }
        if (dd0Var.getTag() != null && dd0Var.getTag().equals("HOUR") && dd0Var2.getValue() == dd0Var2.getMinValue()) {
            if (dd0Var.getValue() == dd0Var.getMinValue()) {
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

    public y4(SparseIntArray sparseIntArray, int i10, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f7041c = sparseIntArray;
        this.f7039a = i10;
        this.f7040b = i11;
        this.d = gVar;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f7042f = iArr;
    }

    public y4(org.telegram.ui.Components.b4 b4Var, sg.g gVar, sg.h hVar, int i10, int i11, dd0 dd0Var) {
        this.f7041c = b4Var;
        this.d = gVar;
        this.e = hVar;
        this.f7039a = i10;
        this.f7040b = i11;
        this.f7042f = dd0Var;
    }
}
