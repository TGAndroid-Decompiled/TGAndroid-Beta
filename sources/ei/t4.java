package ei;

import ai.ab;
import android.util.SparseIntArray;
import java.util.Calendar;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wd0;
import org.telegram.ui.Components.xk0;
import org.telegram.ui.Components.yd0;
public final class t4 implements org.telegram.ui.ActionBar.z1, vk0, wd0 {
    public final int f9375a;
    public final int f9376b;
    public final Object f9377c;
    public final Object d;
    public final Object f9378e;
    public final Object f9379f;

    public t4(int i10, boolean[] zArr, TLRPC.Document document, int i11, boolean[] zArr2, Utilities.Callback callback) {
        this.f9375a = i10;
        this.f9377c = zArr;
        this.f9378e = document;
        this.f9376b = i11;
        this.d = zArr2;
        this.f9379f = callback;
    }

    @Override
    public void a(xk0 xk0Var, int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f9378e;
        int[] iArr = (int[]) this.f9379f;
        int i11 = this.f9376b + i10;
        int i12 = this.f9375a;
        ((SparseIntArray) this.f9377c).put(i12, i11);
        if (((z4.g) this.d).getCurrentItem() == i12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i11, true);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        boolean[] zArr = (boolean[]) this.f9377c;
        TLRPC.Document document = (TLRPC.Document) this.f9378e;
        boolean[] zArr2 = (boolean[]) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f9379f;
        int i11 = this.f9375a;
        if (!UserConfig.getInstance(i11).isPremium()) {
            new rg.y0(new org.telegram.ui.ActionBar.m2(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.f19808id;
        int i12 = this.f9376b;
        if (i12 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i11).getCurrentTime() + i12;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i11).sendRequest(updateemojistatus, new ab(zArr2, callback, i11, updateemojistatus, 1));
    }

    @Override
    public void q(yd0 yd0Var, int i10) {
        org.telegram.ui.Components.e4 e4Var = (org.telegram.ui.Components.e4) this.f9377c;
        tg.g gVar = (tg.g) this.d;
        tg.h hVar = (tg.h) this.f9378e;
        yd0 yd0Var2 = (yd0) this.f9379f;
        try {
            e4Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (yd0Var.getTag() != null && yd0Var.getTag().equals("DAY")) {
            if (yd0Var.getValue() == yd0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i11 = calendar.get(11);
                int i12 = (calendar.get(12) / 5) + 1;
                if (i12 > 11) {
                    if (i11 == 23) {
                        yd0Var.setMinValue(yd0Var.getMinValue() + 1);
                        gVar.setMinValue(0);
                    } else {
                        gVar.setMinValue(i11 + 1);
                    }
                    hVar.setMinValue(0);
                } else {
                    gVar.setMinValue(i11);
                    hVar.setMinValue(i12);
                }
            } else if (yd0Var.getValue() == yd0Var.getMaxValue()) {
                gVar.setMaxValue(this.f9375a);
                hVar.setMaxValue(Math.min(this.f9376b / 5, 11));
            } else {
                gVar.setMinValue(0);
                hVar.setMinValue(0);
                gVar.setMaxValue(23);
                hVar.setMaxValue(11);
            }
        }
        if (yd0Var.getTag() != null && yd0Var.getTag().equals("HOUR") && yd0Var2.getValue() == yd0Var2.getMinValue()) {
            if (yd0Var.getValue() == yd0Var.getMinValue()) {
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

    public t4(SparseIntArray sparseIntArray, int i10, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f9377c = sparseIntArray;
        this.f9375a = i10;
        this.f9376b = i11;
        this.d = gVar;
        this.f9378e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f9379f = iArr;
    }

    public t4(org.telegram.ui.Components.e4 e4Var, tg.g gVar, tg.h hVar, int i10, int i11, yd0 yd0Var) {
        this.f9377c = e4Var;
        this.d = gVar;
        this.f9378e = hVar;
        this.f9375a = i10;
        this.f9376b = i11;
        this.f9379f = yd0Var;
    }
}
