package bi;

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
import org.telegram.ui.Components.es;
import org.telegram.ui.Components.ks;
import org.telegram.ui.Components.r11;
import org.telegram.ui.Components.xu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ri0;
import org.telegram.ui.v70;
public final class ga implements RequestDelegate {
    public final int f3035a;
    public final int f3036b;
    public final Object f3037c;
    public final Object d;
    public final Object f3038e;

    public ga(int i10, ri0 ri0Var, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f3035a = 7;
        this.f3036b = i10;
        this.f3037c = ri0Var;
        this.d = n2Var;
        this.f3038e = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f3035a;
        Object obj = this.f3038e;
        Object obj2 = this.d;
        Object obj3 = this.f3037c;
        switch (i10) {
            case 0:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                fa faVar = (fa) obj;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj3 != null) {
                    FileRefController.getInstance(this.f3036b).requestReference(obj3, tL_messages_getAttachedStickers, faVar);
                    return;
                } else {
                    faVar.run(tLObject, tL_error);
                    return;
                }
            case 1:
                AndroidUtilities.runOnUIThread(new fi.l3(tLObject, (boolean[]) obj3, (Utilities.Callback) obj2, this.f3036b, (TL_account.updateEmojiStatus) obj, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ia((v70) obj3, (org.telegram.ui.g4) obj2, tL_error, tLObject, this.f3036b, (org.telegram.ui.d1) obj));
                return;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new fi.l3(sharedPreferences, (TLRPC.TL_help_support) tLObject, b2Var, this.f3036b, n2Var, 20));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c2(b2Var, 0));
                    return;
                }
            case 4:
                AndroidUtilities.runOnUIThread(new fi.l3((es) obj3, tLObject, (TLRPC.InputPeer) obj2, this.f3036b, (int[]) obj, 21));
                return;
            case 5:
                xu0 xu0Var = (xu0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new ks((org.telegram.ui.ActionBar.b2[]) obj2, 2));
                int i11 = this.f3036b;
                if (tL_error == null) {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new k8(xu0Var, i11, tL_error, tL_messages_editMessage, 25));
                    return;
                }
            case 6:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new fi.l3((LaunchActivity) obj3, tLObject, (Uri) obj2, this.f3036b, (org.telegram.ui.ActionBar.b2) obj, 23), 2L);
                return;
            case 7:
                ri0 ri0Var = (ri0) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i12 = this.f3036b;
                if (z10) {
                    MessagesController.getInstance(i12).processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(ri0Var);
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new r11(i12, tL_error, n2Var2, tL_payments_assignPlayMarketTransaction, 10));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new ia((org.telegram.ui.web.d1) obj3, tLObject, this.f3036b, (org.telegram.ui.web.z0) obj2, (k9) obj, tL_error));
                return;
        }
    }

    public ga(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f3035a = i11;
        this.f3037c = obj;
        this.f3036b = i10;
        this.d = obj2;
        this.f3038e = obj3;
    }

    public ga(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f3035a = i11;
        this.f3037c = obj;
        this.d = obj2;
        this.f3036b = i10;
        this.f3038e = obj3;
    }
}
