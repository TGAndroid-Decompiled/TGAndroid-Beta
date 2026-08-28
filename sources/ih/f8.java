package ih;

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
import org.telegram.ui.Components.cs;
import org.telegram.ui.Components.eu0;
import org.telegram.ui.Components.wr;
import org.telegram.ui.Components.y01;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.a70;
import org.telegram.ui.ai0;
public final class f8 implements RequestDelegate {
    public final int f11452a;
    public final int f11453b;
    public final Object f11454c;
    public final Object d;
    public final Object f11455e;

    public f8(int i9, ai0 ai0Var, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f11452a = 7;
        this.f11453b = i9;
        this.f11454c = ai0Var;
        this.d = o2Var;
        this.f11455e = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.f11452a;
        int i10 = this.f11453b;
        Object obj = this.f11455e;
        Object obj2 = this.d;
        Object obj3 = this.f11454c;
        switch (i9) {
            case 0:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                ff.j0 j0Var = (ff.j0) obj;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj3 != null) {
                    FileRefController.getInstance(i10).requestReference(obj3, tL_messages_getAttachedStickers, j0Var);
                    return;
                } else {
                    j0Var.run(tLObject, tL_error);
                    return;
                }
            case 1:
                AndroidUtilities.runOnUIThread(new fh.g1(tLObject, (boolean[]) obj3, (Utilities.Callback) obj2, this.f11453b, (TL_account.updateEmojiStatus) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ff.k0((a70) obj3, (org.telegram.ui.j4) obj2, tL_error, tLObject, this.f11453b, (org.telegram.ui.f1) obj));
                return;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new fh.g1(sharedPreferences, (TLRPC.TL_help_support) tLObject, c2Var, this.f11453b, o2Var, 20));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.a2(c2Var, 0));
                    return;
                }
            case 4:
                AndroidUtilities.runOnUIThread(new fh.g1((wr) obj3, tLObject, (TLRPC.InputPeer) obj2, this.f11453b, (int[]) obj, 21));
                return;
            case 5:
                eu0 eu0Var = (eu0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new cs((org.telegram.ui.ActionBar.c2[]) obj2, 2));
                int i11 = this.f11453b;
                if (tL_error == null) {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new c3.d(eu0Var, i11, tL_error, tL_messages_editMessage, 25));
                    return;
                }
            case 6:
                Pattern pattern = LaunchActivity.f35493x1;
                AndroidUtilities.runOnUIThread(new fh.g1((LaunchActivity) obj3, tLObject, (Uri) obj2, this.f11453b, (org.telegram.ui.ActionBar.c2) obj, 23), 2L);
                return;
            case 7:
                ai0 ai0Var = (ai0) obj3;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(i10).processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(ai0Var);
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new y01(i10, tL_error, o2Var2, tL_payments_assignPlayMarketTransaction));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new ff.k0((org.telegram.ui.web.y0) obj3, (String) obj2, tLObject, tL_error, this.f11453b, (org.telegram.ui.web.v0) obj));
                return;
        }
    }

    public f8(Object obj, int i9, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, ff.j0 j0Var) {
        this.f11452a = 0;
        this.f11454c = obj;
        this.f11453b = i9;
        this.d = tL_messages_getAttachedStickers;
        this.f11455e = j0Var;
    }

    public f8(Object obj, Object obj2, int i9, Object obj3, int i10) {
        this.f11452a = i10;
        this.f11454c = obj;
        this.d = obj2;
        this.f11453b = i9;
        this.f11455e = obj3;
    }
}
