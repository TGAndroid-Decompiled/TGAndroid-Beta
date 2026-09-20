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
import org.telegram.ui.Components.ad0;
import org.telegram.ui.Components.cd0;
import org.telegram.ui.Components.xj0;
import org.telegram.ui.Components.zj0;
public final class u4 implements org.telegram.ui.ActionBar.a2, xj0, ad0 {
    public final int f8653a;
    public final int f8654b;
    public final Object f8655c;
    public final Object d;
    public final Object e;
    public final Object f8656f;

    public u4(int i10, boolean[] zArr, TLRPC.Document document, int i11, boolean[] zArr2, Utilities.Callback callback) {
        this.f8653a = i10;
        this.f8655c = zArr;
        this.e = document;
        this.f8654b = i11;
        this.d = zArr2;
        this.f8656f = callback;
    }

    @Override
    public void a(zj0 zj0Var, int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.e;
        int[] iArr = (int[]) this.f8656f;
        int i11 = this.f8654b + i10;
        int i12 = this.f8653a;
        ((SparseIntArray) this.f8655c).put(i12, i11);
        if (((z4.g) this.d).getCurrentItem() == i12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i11, true);
        }
    }

    @Override
    public void k(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean[] zArr = (boolean[]) this.f8655c;
        TLRPC.Document document = (TLRPC.Document) this.e;
        boolean[] zArr2 = (boolean[]) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f8656f;
        int i11 = this.f8653a;
        if (!UserConfig.getInstance(i11).isPremium()) {
            new rg.x0(new org.telegram.ui.ActionBar.n2(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.f18334id;
        int i12 = this.f8654b;
        if (i12 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i11).getCurrentTime() + i12;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i11).sendRequest(updateemojistatus, new za(zArr2, callback, i11, updateemojistatus, 1));
    }

    @Override
    public void q(cd0 cd0Var, int i10) {
        org.telegram.ui.Components.b4 b4Var = (org.telegram.ui.Components.b4) this.f8655c;
        tg.g gVar = (tg.g) this.d;
        tg.h hVar = (tg.h) this.e;
        cd0 cd0Var2 = (cd0) this.f8656f;
        try {
            b4Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (cd0Var.getTag() != null && cd0Var.getTag().equals("DAY")) {
            if (cd0Var.getValue() == cd0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i11 = calendar.get(11);
                int i12 = (calendar.get(12) / 5) + 1;
                if (i12 > 11) {
                    if (i11 == 23) {
                        cd0Var.setMinValue(cd0Var.getMinValue() + 1);
                        gVar.setMinValue(0);
                    } else {
                        gVar.setMinValue(i11 + 1);
                    }
                    hVar.setMinValue(0);
                } else {
                    gVar.setMinValue(i11);
                    hVar.setMinValue(i12);
                }
            } else if (cd0Var.getValue() == cd0Var.getMaxValue()) {
                gVar.setMaxValue(this.f8653a);
                hVar.setMaxValue(Math.min(this.f8654b / 5, 11));
            } else {
                gVar.setMinValue(0);
                hVar.setMinValue(0);
                gVar.setMaxValue(23);
                hVar.setMaxValue(11);
            }
        }
        if (cd0Var.getTag() != null && cd0Var.getTag().equals("HOUR") && cd0Var2.getValue() == cd0Var2.getMinValue()) {
            if (cd0Var.getValue() == cd0Var.getMinValue()) {
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
        this.f8655c = sparseIntArray;
        this.f8653a = i10;
        this.f8654b = i11;
        this.d = gVar;
        this.e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f8656f = iArr;
    }

    public u4(org.telegram.ui.Components.b4 b4Var, tg.g gVar, tg.h hVar, int i10, int i11, cd0 cd0Var) {
        this.f8655c = b4Var;
        this.d = gVar;
        this.e = hVar;
        this.f8653a = i10;
        this.f8654b = i11;
        this.f8656f = cd0Var;
    }
}
