package ki;

import android.util.SparseIntArray;
import fi.y7;
import java.util.Calendar;
import org.telegram.messenger.j10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.ActionBar.ActionBarPopupWindow$ActionBarPopupWindowLayout;
import org.telegram.ui.Components.ci0;
import org.telegram.ui.Components.ei0;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Components.sb0;
public final class w3 implements org.telegram.ui.ActionBar.r1, ci0, qb0 {
    public final int f19028a;
    public final int f19029b;
    public final Object f19030c;
    public final Object d;
    public final Object f19031e;
    public final Object f19032f;

    public w3(int i7, boolean[] zArr, TLRPC.Document document, int i10, boolean[] zArr2, x10 x10Var) {
        this.f19028a = i7;
        this.f19030c = zArr;
        this.f19031e = document;
        this.f19029b = i10;
        this.d = zArr2;
        this.f19032f = x10Var;
    }

    @Override
    public void b(ei0 ei0Var, int i7) {
        ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout = (ActionBarPopupWindow$ActionBarPopupWindowLayout) this.f19031e;
        int[] iArr = (int[]) this.f19032f;
        int i10 = this.f19029b + i7;
        int i11 = this.f19028a;
        ((SparseIntArray) this.f19030c).put(i11, i10);
        if (((c5.l) this.d).getCurrentItem() == i11) {
            actionBarPopupWindow$ActionBarPopupWindowLayout.getSwipeBack().f(iArr[0], i10, true);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        boolean[] zArr = (boolean[]) this.f19030c;
        TLRPC.Document document = (TLRPC.Document) this.f19031e;
        boolean[] zArr2 = (boolean[]) this.d;
        x10 x10Var = (x10) this.f19032f;
        int i10 = this.f19028a;
        if (!j10.i(i10).q()) {
            new ug.z0(new org.telegram.ui.ActionBar.h2(null), 12, false).show();
            return;
        }
        zArr[0] = true;
        TL_account.updateEmojiStatus updateemojistatus = new TL_account.updateEmojiStatus();
        TLRPC.TL_emojiStatus tL_emojiStatus = new TLRPC.TL_emojiStatus();
        tL_emojiStatus.document_id = document.f28409id;
        int i11 = this.f19029b;
        if (i11 > 0) {
            tL_emojiStatus.flags = 1 | tL_emojiStatus.flags;
            tL_emojiStatus.until = ConnectionsManager.getInstance(i10).getCurrentTime() + i11;
        }
        updateemojistatus.emoji_status = tL_emojiStatus;
        ConnectionsManager.getInstance(i10).sendRequest(updateemojistatus, new y7(zArr2, x10Var, i10, updateemojistatus, 1));
    }

    @Override
    public void n(sb0 sb0Var, int i7) {
        org.telegram.ui.Components.e4 e4Var = (org.telegram.ui.Components.e4) this.f19030c;
        wg.f fVar = (wg.f) this.d;
        wg.g gVar = (wg.g) this.f19031e;
        sb0 sb0Var2 = (sb0) this.f19032f;
        try {
            e4Var.performHapticFeedback(3, 2);
        } catch (Exception unused) {
        }
        if (sb0Var.getTag() != null && sb0Var.getTag().equals("DAY")) {
            if (sb0Var.getValue() == sb0Var.getMinValue()) {
                Calendar calendar = Calendar.getInstance();
                calendar.setTimeInMillis(System.currentTimeMillis());
                int i10 = calendar.get(11);
                int i11 = (calendar.get(12) / 5) + 1;
                if (i11 > 11) {
                    if (i10 == 23) {
                        sb0Var.setMinValue(sb0Var.getMinValue() + 1);
                        fVar.setMinValue(0);
                    } else {
                        fVar.setMinValue(i10 + 1);
                    }
                    gVar.setMinValue(0);
                } else {
                    fVar.setMinValue(i10);
                    gVar.setMinValue(i11);
                }
            } else if (sb0Var.getValue() == sb0Var.getMaxValue()) {
                fVar.setMaxValue(this.f19028a);
                gVar.setMaxValue(Math.min(this.f19029b / 5, 11));
            } else {
                fVar.setMinValue(0);
                gVar.setMinValue(0);
                fVar.setMaxValue(23);
                gVar.setMaxValue(11);
            }
        }
        if (sb0Var.getTag() != null && sb0Var.getTag().equals("HOUR") && sb0Var2.getValue() == sb0Var2.getMinValue()) {
            if (sb0Var.getValue() == sb0Var.getMinValue()) {
                Calendar calendar2 = Calendar.getInstance();
                calendar2.setTimeInMillis(System.currentTimeMillis());
                int i12 = (calendar2.get(12) / 5) + 1;
                if (i12 > 11) {
                    gVar.setMinValue(0);
                    return;
                } else {
                    gVar.setMinValue(i12);
                    return;
                }
            }
            gVar.setMinValue(0);
            gVar.setMaxValue(11);
        }
    }

    public w3(SparseIntArray sparseIntArray, int i7, int i10, c5.l lVar, ActionBarPopupWindow$ActionBarPopupWindowLayout actionBarPopupWindow$ActionBarPopupWindowLayout, int[] iArr) {
        this.f19030c = sparseIntArray;
        this.f19028a = i7;
        this.f19029b = i10;
        this.d = lVar;
        this.f19031e = actionBarPopupWindow$ActionBarPopupWindowLayout;
        this.f19032f = iArr;
    }

    public w3(org.telegram.ui.Components.e4 e4Var, wg.f fVar, wg.g gVar, int i7, int i10, sb0 sb0Var) {
        this.f19030c = e4Var;
        this.d = fVar;
        this.f19031e = gVar;
        this.f19028a = i7;
        this.f19029b = i10;
        this.f19032f = sb0Var;
    }
}
