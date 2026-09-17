package fi;

import android.util.SparseIntArray;
import bi.ga;
import java.util.Calendar;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.Components.tc0;
import org.telegram.ui.Components.vc0;
public final class v4 implements org.telegram.ui.ActionBar.a2, nj0, tc0 {
    public final int f10039a;
    public final int f10040b;
    public final Object f10041c;
    public final Object d;
    public final Object f10042e;
    public final Object f10043f;

    public v4(int i10, boolean[] zArr, TLRPC.Document document, int i11, boolean[] zArr2, Utilities.Callback callback) {
        this.f10039a = i10;
        this.f10041c = zArr;
        this.f10042e = document;
        this.f10040b = i11;
        this.d = zArr2;
        this.f10043f = callback;
    }

    @Override
    public void a(pj0 pj0Var, int i10) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f10042e;
        int[] iArr = (int[]) this.f10043f;
        int i11 = this.f10040b + i10;
        int i12 = this.f10039a;
        ((SparseIntArray) this.f10041c).put(i12, i11);
        if (((z4.g) this.d).getCurrentItem() == i12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i11, true);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean[] zArr = (boolean[]) this.f10041c;
        TLRPC.Document document = (TLRPC.Document) this.f10042e;
        boolean[] zArr2 = (boolean[]) this.d;
        Utilities.Callback callback = (Utilities.Callback) this.f10043f;
        int i11 = this.f10039a;
        if (!UserConfig.getInstance(i11).isPremium()) {
            new sg.a1(new org.telegram.ui.ActionBar.n2(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.f19875id;
        int i12 = this.f10040b;
        if (i12 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i11).getCurrentTime() + i12;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i11).sendRequest(updateemojistatus, new ga(zArr2, callback, i11, updateemojistatus, 1));
    }

    @Override
    public void s(vc0 vc0Var, int i10) {
        org.telegram.ui.Components.c4 c4Var = (org.telegram.ui.Components.c4) this.f10041c;
        ug.h hVar = (ug.h) this.d;
        ug.i iVar = (ug.i) this.f10042e;
        vc0 vc0Var2 = (vc0) this.f10043f;
        try {
            c4Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (vc0Var.getTag() != null && vc0Var.getTag().equals("DAY")) {
            if (vc0Var.getValue() == vc0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i11 = calendar.get(11);
                int i12 = (calendar.get(12) / 5) + 1;
                if (i12 > 11) {
                    if (i11 == 23) {
                        vc0Var.setMinValue(vc0Var.getMinValue() + 1);
                        hVar.setMinValue(0);
                    } else {
                        hVar.setMinValue(i11 + 1);
                    }
                    iVar.setMinValue(0);
                } else {
                    hVar.setMinValue(i11);
                    iVar.setMinValue(i12);
                }
            } else if (vc0Var.getValue() == vc0Var.getMaxValue()) {
                hVar.setMaxValue(this.f10039a);
                iVar.setMaxValue(Math.min(this.f10040b / 5, 11));
            } else {
                hVar.setMinValue(0);
                iVar.setMinValue(0);
                hVar.setMaxValue(23);
                iVar.setMaxValue(11);
            }
        }
        if (vc0Var.getTag() != null && vc0Var.getTag().equals("HOUR") && vc0Var2.getValue() == vc0Var2.getMinValue()) {
            if (vc0Var.getValue() == vc0Var.getMinValue()) {
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

    public v4(SparseIntArray sparseIntArray, int i10, int i11, z4.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f10041c = sparseIntArray;
        this.f10039a = i10;
        this.f10040b = i11;
        this.d = gVar;
        this.f10042e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f10043f = iArr;
    }

    public v4(org.telegram.ui.Components.c4 c4Var, ug.h hVar, ug.i iVar, int i10, int i11, vc0 vc0Var) {
        this.f10041c = c4Var;
        this.d = hVar;
        this.f10042e = iVar;
        this.f10039a = i10;
        this.f10040b = i11;
        this.f10043f = vc0Var;
    }
}
