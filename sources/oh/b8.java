package oh;

import android.content.SharedPreferences;
import android.net.Uri;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.ms;
import org.telegram.ui.Components.yu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.dt;
import org.telegram.ui.ii0;
import org.telegram.ui.o70;
public final class b8 implements RequestDelegate {
    public final int f16902a;
    public final int f16903b;
    public final Object f16904c;
    public final Object d;
    public final Object f16905e;

    public b8(int i10, ii0 ii0Var, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f16902a = 6;
        this.f16903b = i10;
        this.f16904c = ii0Var;
        this.d = p2Var;
        this.f16905e = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f16902a;
        Object obj = this.f16905e;
        Object obj2 = this.d;
        Object obj3 = this.f16904c;
        switch (i10) {
            case 0:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                lf.i0 i0Var = (lf.i0) obj;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj3 != null) {
                    FileRefController.getInstance(this.f16903b).requestReference(obj3, tL_messages_getAttachedStickers, i0Var);
                    return;
                } else {
                    i0Var.run(tLObject, tL_error);
                    return;
                }
            case 1:
                AndroidUtilities.runOnUIThread(new lf.j0((o70) obj3, (org.telegram.ui.j4) obj2, tL_error, tLObject, this.f16903b, (org.telegram.ui.e1) obj));
                return;
            case 2:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new eg.d3(sharedPreferences, (TLRPC.TL_help_support) tLObject, d2Var, this.f16903b, p2Var, 17));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c2(d2Var, 0));
                    return;
                }
            case 3:
                AndroidUtilities.runOnUIThread(new eg.d3((gs) obj3, tLObject, (TLRPC.InputPeer) obj2, this.f16903b, (int[]) obj, 18));
                return;
            case 4:
                yu0 yu0Var = (yu0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new ms((org.telegram.ui.ActionBar.d2[]) obj2, 2));
                int i11 = this.f16903b;
                if (tL_error == null) {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new dg.u1(yu0Var, i11, tL_error, tL_messages_editMessage, 24));
                    return;
                }
            case 5:
                Pattern pattern = LaunchActivity.f34134y1;
                AndroidUtilities.runOnUIThread(new eg.d3((LaunchActivity) obj3, tLObject, (Uri) obj2, this.f16903b, (org.telegram.ui.ActionBar.d2) obj, 20), 2L);
                return;
            case 6:
                ii0 ii0Var = (ii0) obj3;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                boolean z4 = tLObject instanceof TLRPC.Updates;
                int i12 = this.f16903b;
                if (z4) {
                    MessagesController.getInstance(i12).processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(ii0Var);
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new dt(i12, tL_error, p2Var2, tL_payments_assignPlayMarketTransaction, 9));
                    return;
                } else {
                    return;
                }
            case 7:
                AndroidUtilities.runOnUIThread(new lf.j0((org.telegram.ui.web.a1) obj3, (String) obj2, tLObject, tL_error, this.f16903b, (org.telegram.ui.web.x0) obj));
                return;
            default:
                AndroidUtilities.runOnUIThread(new eg.d3(tLObject, (boolean[]) obj3, (Utilities.Callback) obj2, this.f16903b, (TL_account.updateEmojiStatus) obj, 27));
                return;
        }
    }

    public b8(Object obj, int i10, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, lf.i0 i0Var) {
        this.f16902a = 0;
        this.f16904c = obj;
        this.f16903b = i10;
        this.d = tL_messages_getAttachedStickers;
        this.f16905e = i0Var;
    }

    public b8(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f16902a = i11;
        this.f16904c = obj;
        this.d = obj2;
        this.f16903b = i10;
        this.f16905e = obj3;
    }
}
