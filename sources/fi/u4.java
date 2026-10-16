package fi;

import android.util.SparseIntArray;
import bi.ja;
import java.util.Calendar;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ok0;
import org.telegram.ui.Components.qk0;
import org.telegram.ui.Components.sd0;
import org.telegram.ui.Components.ud0;
public final class u4 implements org.telegram.ui.ActionBar.z1, ok0, sd0 {
    public final int f9592a;
    public final int f9593b;
    public final Object f9594c;
    public final Object d;
    public final Object e;
    public final Object f9595f;

    public u4(int i10, boolean[] zArr, TLRPC.Document document, int i11, boolean[] zArr2, Utilities.Callback callback) {
        this.f9592a = i10;
        this.f9594c = zArr;
        this.e = document;
        this.f9593b = i11;
        this.d = zArr2;
        this.f9595f = callback;
    }

    @Override
    public void a(qk0 qk0Var, int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.e;
        int[] iArr = (int[]) this.f9595f;
        int i11 = this.f9593b + i10;
        int i12 = this.f9592a;
        ((SparseIntArray) this.f9594c).put(i12, i11);
        if (((z4.g) this.d).getCurrentItem() == i12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i11, true);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.a2 a2Var, int i10) {
        boolean[] zArr = (boolean[]) this.f9594c;
        TLRPC.Document document = (TLRPC.Document) this.e;
        boolean[] zArr2 = (boolean[]) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f9595f;
        int i11 = this.f9592a;
        if (!UserConfig.getInstance(i11).isPremium()) {
            new sg.y0(new org.telegram.ui.ActionBar.m2(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.f18922id;
        int i12 = this.f9593b;
        if (i12 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i11).getCurrentTime() + i12;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i11).sendRequest(updateemojistatus, new ja(zArr2, callback, i11, updateemojistatus, 1));
    }

    @Override
    public void r(ud0 ud0Var, int i10) {
        org.telegram.ui.Components.e4 e4Var = (org.telegram.ui.Components.e4) this.f9594c;
        ug.h hVar = (ug.h) this.d;
        ug.i iVar = (ug.i) this.e;
        ud0 ud0Var2 = (ud0) this.f9595f;
        try {
            e4Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (ud0Var.getTag() != null && ud0Var.getTag().equals("DAY")) {
            if (ud0Var.getValue() == ud0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i11 = calendar.get(11);
                int i12 = (calendar.get(12) / 5) + 1;
                if (i12 > 11) {
                    if (i11 == 23) {
                        ud0Var.setMinValue(ud0Var.getMinValue() + 1);
                        hVar.setMinValue(0);
                    } else {
                        hVar.setMinValue(i11 + 1);
                    }
                    iVar.setMinValue(0);
                } else {
                    hVar.setMinValue(i11);
                    iVar.setMinValue(i12);
                }
            } else if (ud0Var.getValue() == ud0Var.getMaxValue()) {
                hVar.setMaxValue(this.f9592a);
                iVar.setMaxValue(Math.min(this.f9593b / 5, 11));
            } else {
                hVar.setMinValue(0);
                iVar.setMinValue(0);
                hVar.setMaxValue(23);
                iVar.setMaxValue(11);
            }
        }
        if (ud0Var.getTag() != null && ud0Var.getTag().equals("HOUR") && ud0Var2.getValue() == ud0Var2.getMinValue()) {
            if (ud0Var.getValue() == ud0Var.getMinValue()) {
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

    public u4(SparseIntArray sparseIntArray, int i10, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f9594c = sparseIntArray;
        this.f9592a = i10;
        this.f9593b = i11;
        this.d = gVar;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f9595f = iArr;
    }

    public u4(org.telegram.ui.Components.e4 e4Var, ug.h hVar, ug.i iVar, int i10, int i11, ud0 ud0Var) {
        this.f9594c = e4Var;
        this.d = hVar;
        this.e = iVar;
        this.f9592a = i10;
        this.f9593b = i11;
        this.f9595f = ud0Var;
    }
}
