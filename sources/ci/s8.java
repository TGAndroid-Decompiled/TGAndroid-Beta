package ci;

import ai.db;
import ai.tb;
import ai.vb;
import ai.wb;
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
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.ps;
import org.telegram.ui.Components.vs;
import org.telegram.ui.Components.xv0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f70;
import org.telegram.ui.fi0;
public final class s8 implements RequestDelegate {
    public final int f5934a;
    public final int f5935b;
    public final Object f5936c;
    public final Object d;
    public final Object e;

    public s8(int i10, fi0 fi0Var, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f5934a = 7;
        this.f5935b = i10;
        this.f5936c = fi0Var;
        this.d = o2Var;
        this.e = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f5934a;
        int i11 = this.f5935b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f5936c;
        switch (i10) {
            case 0:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                tb tbVar = (tb) obj;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj3 != null) {
                    FileRefController.getInstance(i11).requestReference(obj3, tL_messages_getAttachedStickers, tbVar);
                    return;
                } else {
                    tbVar.run(tLObject, tL_error);
                    return;
                }
            case 1:
                AndroidUtilities.runOnUIThread(new vb(tLObject, (boolean[]) obj3, (Utilities.Callback) obj2, this.f5935b, (TL_account.updateEmojiStatus) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new wb((f70) obj3, (org.telegram.ui.i4) obj2, tL_error, tLObject, this.f5935b, (org.telegram.ui.e1) obj));
                return;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new vb((Object) sharedPreferences, (Object) ((TLRPC.TL_help_support) tLObject), (Object) c2Var, this.f5935b, (Object) o2Var, 22));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.b2(c2Var, 0));
                    return;
                }
            case 4:
                AndroidUtilities.runOnUIThread(new vb((Object) ((ps) obj3), tLObject, (Object) ((TLRPC.InputPeer) obj2), this.f5935b, (Object) ((int[]) obj), 23));
                return;
            case 5:
                xv0 xv0Var = (xv0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new vs((org.telegram.ui.ActionBar.c2[]) obj2, 2));
                int i12 = this.f5935b;
                if (tL_error == null) {
                    MessagesController.getInstance(i12).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new db(xv0Var, i12, tL_error, tL_messages_editMessage, 28));
                    return;
                }
            case 6:
                Pattern pattern = LaunchActivity.E1;
                AndroidUtilities.runOnUIThread(new vb((Object) ((LaunchActivity) obj3), tLObject, (Object) ((Uri) obj2), this.f5935b, (Object) ((org.telegram.ui.ActionBar.c2) obj), 25), 2L);
                return;
            case 7:
                fi0 fi0Var = (fi0) obj3;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(i11).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(fi0Var);
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new fz0(i11, tL_error, o2Var2, tL_payments_assignPlayMarketTransaction));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new wb((org.telegram.ui.web.b1) obj3, tLObject, this.f5935b, (org.telegram.ui.web.y0) obj2, (y7) obj, tL_error));
                return;
        }
    }

    public s8(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f5934a = i11;
        this.f5936c = obj;
        this.f5935b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public s8(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f5934a = i11;
        this.f5936c = obj;
        this.d = obj2;
        this.f5935b = i10;
        this.e = obj3;
    }
}
