package cg;

import android.util.SparseIntArray;
import java.util.Calendar;
import jh.b8;
import nh.k4;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.dc0;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.gj0;

public final class e implements dc0, org.telegram.ui.ActionBar.a2, ej0 {

    public final int f2656a;

    public final int f2657b;

    public final Object f2658c;
    public final Object d;

    public final Object f2659e;

    public final Object f2660f;

    public e(int i10, boolean[] zArr, TLRPC.Document document, int i11, boolean[] zArr2, Utilities.Callback callback) {
        this.f2656a = i10;
        this.f2658c = zArr;
        this.d = document;
        this.f2657b = i11;
        this.f2659e = zArr2;
        this.f2660f = callback;
    }

    @Override
    public void a(gj0 gj0Var, int i10) {
        SparseIntArray sparseIntArray = (SparseIntArray) this.f2658c;
        m2.g gVar = (m2.g) this.d;
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f2659e;
        int[] iArr = (int[]) this.f2660f;
        int i11 = this.f2657b + i10;
        int i12 = this.f2656a;
        sparseIntArray.put(i12, i11);
        if (gVar.getCurrentItem() == i12) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i11, true);
        }
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        boolean[] zArr = (boolean[]) this.f2658c;
        TLRPC.Document document = (TLRPC.Document) this.d;
        boolean[] zArr2 = (boolean[]) this.f2659e;
        Utilities.Callback callback = (Utilities.Callback) this.f2660f;
        int i11 = this.f2656a;
        if (!UserConfig.getInstance(i11).isPremium()) {
            new ag.g2((org.telegram.ui.ActionBar.n2) new k4(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.f22386id;
        int i12 = this.f2657b;
        if (i12 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i11).getCurrentTime() + i12;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i11).sendRequest(updateemojistatus, new b8(zArr2, callback, i11, updateemojistatus, 1));
    }

    @Override
    public void m(fc0 fc0Var, int i10) {
        p pVar = (p) this.f2658c;
        n nVar = (n) this.d;
        o oVar = (o) this.f2659e;
        fc0 fc0Var2 = (fc0) this.f2660f;
        try {
            pVar.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (fc0Var.getTag() != null && fc0Var.getTag().equals("DAY")) {
            if (fc0Var.getValue() == fc0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i11 = calendar.get(11);
                int i12 = (calendar.get(12) / 5) + 1;
                if (i12 > 11) {
                    if (i11 == 23) {
                        fc0Var.setMinValue(fc0Var.getMinValue() + 1);
                        nVar.setMinValue(0);
                    } else {
                        nVar.setMinValue(i11 + 1);
                    }
                    oVar.setMinValue(0);
                } else {
                    nVar.setMinValue(i11);
                    oVar.setMinValue(i12);
                }
            } else if (fc0Var.getValue() == fc0Var.getMaxValue()) {
                nVar.setMaxValue(this.f2656a);
                oVar.setMaxValue(Math.min(this.f2657b / 5, 11));
            } else {
                nVar.setMinValue(0);
                oVar.setMinValue(0);
                nVar.setMaxValue(23);
                oVar.setMaxValue(11);
            }
        }
        if (fc0Var.getTag() != null && fc0Var.getTag().equals("HOUR") && fc0Var2.getValue() == fc0Var2.getMinValue()) {
            if (fc0Var.getValue() != fc0Var.getMinValue()) {
                oVar.setMinValue(0);
                oVar.setMaxValue(11);
                return;
            }
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(System.currentTimeMillis());
            int i13 = (calendar2.get(12) / 5) + 1;
            if (i13 > 11) {
                oVar.setMinValue(0);
            } else {
                oVar.setMinValue(i13);
            }
        }
    }

    public e(SparseIntArray sparseIntArray, int i10, int i11, m2.g gVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f2658c = sparseIntArray;
        this.f2656a = i10;
        this.f2657b = i11;
        this.d = gVar;
        this.f2659e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f2660f = iArr;
    }

    public e(p pVar, n nVar, o oVar, int i10, int i11, fc0 fc0Var) {
        this.f2658c = pVar;
        this.d = nVar;
        this.f2659e = oVar;
        this.f2656a = i10;
        this.f2657b = i11;
        this.f2660f = fc0Var;
    }
}
