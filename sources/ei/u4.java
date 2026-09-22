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
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.fd0;
public final class u4 implements org.telegram.ui.ActionBar.a2, ak0, dd0 {
    public final int f8652a;
    public final int f8653b;
    public final Object f8654c;
    public final Object d;
    public final Object e;
    public final Object f8655f;

    public u4(int i10, boolean[] zArr, TLRPC.Document document, int i11, boolean[] zArr2, Utilities.Callback callback) {
        this.f8652a = i10;
        this.f8654c = zArr;
        this.e = document;
        this.f8653b = i11;
        this.d = zArr2;
        this.f8655f = callback;
    }

    @Override
    public void a(ck0 ck0Var, int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.e;
        int[] iArr = (int[]) this.f8655f;
        int i11 = this.f8653b + i10;
        int i12 = this.f8652a;
        ((SparseIntArray) this.f8654c).put(i12, i11);
        if (((z4.g) this.d).getCurrentItem() == i12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i11, true);
        }
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean[] zArr = (boolean[]) this.f8654c;
        TLRPC.Document document = (TLRPC.Document) this.e;
        boolean[] zArr2 = (boolean[]) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f8655f;
        int i11 = this.f8652a;
        if (!UserConfig.getInstance(i11).isPremium()) {
            new rg.x0(new org.telegram.ui.ActionBar.n2(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.f18349id;
        int i12 = this.f8653b;
        if (i12 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i11).getCurrentTime() + i12;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i11).sendRequest(updateemojistatus, new za(zArr2, callback, i11, updateemojistatus, 1));
    }

    @Override
    public void q(fd0 fd0Var, int i10) {
        org.telegram.ui.Components.b4 b4Var = (org.telegram.ui.Components.b4) this.f8654c;
        tg.g gVar = (tg.g) this.d;
        tg.h hVar = (tg.h) this.e;
        fd0 fd0Var2 = (fd0) this.f8655f;
        try {
            b4Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (fd0Var.getTag() != null && fd0Var.getTag().equals("DAY")) {
            if (fd0Var.getValue() == fd0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i11 = calendar.get(11);
                int i12 = (calendar.get(12) / 5) + 1;
                if (i12 > 11) {
                    if (i11 == 23) {
                        fd0Var.setMinValue(fd0Var.getMinValue() + 1);
                        gVar.setMinValue(0);
                    } else {
                        gVar.setMinValue(i11 + 1);
                    }
                    hVar.setMinValue(0);
                } else {
                    gVar.setMinValue(i11);
                    hVar.setMinValue(i12);
                }
            } else if (fd0Var.getValue() == fd0Var.getMaxValue()) {
                gVar.setMaxValue(this.f8652a);
                hVar.setMaxValue(Math.min(this.f8653b / 5, 11));
            } else {
                gVar.setMinValue(0);
                hVar.setMinValue(0);
                gVar.setMaxValue(23);
                hVar.setMaxValue(11);
            }
        }
        if (fd0Var.getTag() != null && fd0Var.getTag().equals("HOUR") && fd0Var2.getValue() == fd0Var2.getMinValue()) {
            if (fd0Var.getValue() == fd0Var.getMinValue()) {
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

    public u4(SparseIntArray sparseIntArray, int i10, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f8654c = sparseIntArray;
        this.f8652a = i10;
        this.f8653b = i11;
        this.d = gVar;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f8655f = iArr;
    }

    public u4(org.telegram.ui.Components.b4 b4Var, tg.g gVar, tg.h hVar, int i10, int i11, fd0 fd0Var) {
        this.f8654c = b4Var;
        this.d = gVar;
        this.e = hVar;
        this.f8652a = i10;
        this.f8653b = i11;
        this.f8655f = fd0Var;
    }
}
