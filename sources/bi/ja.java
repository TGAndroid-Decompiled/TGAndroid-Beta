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
import org.telegram.ui.Components.m21;
import org.telegram.ui.Components.ss;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.Components.ys;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.wi0;
import org.telegram.ui.z70;
public final class ja implements RequestDelegate {
    public final int f3215a;
    public final int f3216b;
    public final Object f3217c;
    public final Object d;
    public final Object e;

    public ja(int i10, wi0 wi0Var, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f3215a = 7;
        this.f3216b = i10;
        this.f3217c = wi0Var;
        this.d = m2Var;
        this.e = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f3215a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f3217c;
        switch (i10) {
            case 0:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                ia iaVar = (ia) obj;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj3 != null) {
                    FileRefController.getInstance(this.f3216b).requestReference(obj3, tL_messages_getAttachedStickers, iaVar);
                    return;
                } else {
                    iaVar.run(tLObject, tL_error);
                    return;
                }
            case 1:
                AndroidUtilities.runOnUIThread(new fi.l3(tLObject, (boolean[]) obj3, (Utilities.Callback) obj2, this.f3216b, (TL_account.updateEmojiStatus) obj, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ma((z70) obj3, (org.telegram.ui.i4) obj2, tL_error, tLObject, this.f3216b, (org.telegram.ui.f1) obj));
                return;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new fi.l3(sharedPreferences, (TLRPC.TL_help_support) tLObject, a2Var, this.f3216b, m2Var, 21));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c2(a2Var, 0));
                    return;
                }
            case 4:
                AndroidUtilities.runOnUIThread(new fi.l3((ss) obj3, tLObject, (TLRPC.InputPeer) obj2, this.f3216b, (int[]) obj, 22));
                return;
            case 5:
                xv0 xv0Var = (xv0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new ys((org.telegram.ui.ActionBar.a2[]) obj2, 2));
                int i11 = this.f3216b;
                if (tL_error == null) {
                    MessagesController.getInstance(i11).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new n8(xv0Var, i11, tL_error, tL_messages_editMessage, 26));
                    return;
                }
            case 6:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new fi.l3((LaunchActivity) obj3, tLObject, (Uri) obj2, this.f3216b, (org.telegram.ui.ActionBar.a2) obj, 24), 2L);
                return;
            case 7:
                wi0 wi0Var = (wi0) obj3;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i12 = this.f3216b;
                if (z10) {
                    MessagesController.getInstance(i12).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(wi0Var);
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new m21(i12, tL_error, m2Var2, tL_payments_assignPlayMarketTransaction, 11));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new ma((org.telegram.ui.web.b1) obj3, tLObject, this.f3216b, (org.telegram.ui.web.y0) obj2, (n9) obj, tL_error));
                return;
        }
    }

    public ja(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f3215a = i11;
        this.f3217c = obj;
        this.f3216b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public ja(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f3215a = i11;
        this.f3217c = obj;
        this.d = obj2;
        this.f3216b = i10;
        this.e = obj3;
    }
}
