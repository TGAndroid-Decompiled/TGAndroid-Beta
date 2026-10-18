package ci;

import ai.cb;
import ai.sb;
import ai.ub;
import ai.vb;
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
import org.telegram.ui.Components.az0;
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.sv0;
import org.telegram.ui.Components.vs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.d70;
import org.telegram.ui.di0;
public final class t8 implements RequestDelegate {
    public final int f6028a;
    public final int f6029b;
    public final Object f6030c;
    public final Object d;
    public final Object e;

    public t8(int i10, di0 di0Var, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f6028a = 7;
        this.f6029b = i10;
        this.f6030c = di0Var;
        this.d = n2Var;
        this.e = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f6028a;
        int i11 = this.f6029b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f6030c;
        switch (i10) {
            case 0:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                sb sbVar = (sb) obj;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj3 != null) {
                    FileRefController.getInstance(i11).requestReference(obj3, tL_messages_getAttachedStickers, sbVar);
                    return;
                } else {
                    sbVar.run(tLObject, tL_error);
                    return;
                }
            case 1:
                AndroidUtilities.runOnUIThread(new ub(tLObject, (boolean[]) obj3, (Utilities.Callback) obj2, this.f6029b, (TL_account.updateEmojiStatus) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new vb((d70) obj3, (org.telegram.ui.j4) obj2, tL_error, tLObject, this.f6029b, (org.telegram.ui.f1) obj));
                return;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new ub((Object) sharedPreferences, (Object) ((TLRPC.TL_help_support) tLObject), (Object) b2Var, this.f6029b, (Object) n2Var, 22));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c2(b2Var, 0));
                    return;
                }
            case 4:
                AndroidUtilities.runOnUIThread(new ub((Object) ((ps) obj3), tLObject, (Object) ((TLRPC.InputPeer) obj2), this.f6029b, (Object) ((int[]) obj), 23));
                return;
            case 5:
                sv0 sv0Var = (sv0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new vs((org.telegram.ui.ActionBar.b2[]) obj2, 2));
                int i12 = this.f6029b;
                if (tL_error == null) {
                    MessagesController.getInstance(i12).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new cb(sv0Var, i12, tL_error, tL_messages_editMessage, 27));
                    return;
                }
            case 6:
                Pattern pattern = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new ub((Object) ((LaunchActivity) obj3), tLObject, (Object) ((Uri) obj2), this.f6029b, (Object) ((org.telegram.ui.ActionBar.b2) obj), 25), 2L);
                return;
            case 7:
                di0 di0Var = (di0) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(i11).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(di0Var);
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new az0(i11, tL_error, n2Var2, tL_payments_assignPlayMarketTransaction));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new vb((org.telegram.ui.web.a1) obj3, tLObject, this.f6029b, (org.telegram.ui.web.x0) obj2, (z7) obj, tL_error));
                return;
        }
    }

    public t8(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f6028a = i11;
        this.f6030c = obj;
        this.f6029b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public t8(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f6028a = i11;
        this.f6030c = obj;
        this.d = obj2;
        this.f6029b = i10;
        this.e = obj3;
    }
}
