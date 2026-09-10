package di;

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
import org.telegram.ui.Components.g21;
import org.telegram.ui.Components.iv0;
import org.telegram.ui.Components.ls;
import org.telegram.ui.Components.rs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ri0;
import org.telegram.ui.t70;
public final class c5 implements RequestDelegate {
    public final int f6563a;
    public final int f6564b;
    public final Object f6565c;
    public final Object d;
    public final Object e;

    public c5(int i10, ri0 ri0Var, org.telegram.ui.ActionBar.p2 p2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f6563a = 6;
        this.f6564b = i10;
        this.f6565c = ri0Var;
        this.d = p2Var;
        this.e = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f6563a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f6565c;
        switch (i10) {
            case 0:
                AndroidUtilities.runOnUIThread(new o3(tLObject, (boolean[]) obj3, (Utilities.Callback) obj2, this.f6564b, (TL_account.updateEmojiStatus) obj, 1));
                return;
            case 1:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.w0((t70) obj3, (org.telegram.ui.h4) obj2, tL_error, tLObject, this.f6564b, (org.telegram.ui.e1) obj));
                return;
            case 2:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.d2 d2Var = (org.telegram.ui.ActionBar.d2) obj2;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new o3(sharedPreferences, (TLRPC.TL_help_support) tLObject, d2Var, this.f6564b, p2Var, 20));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.d2(d2Var, 0));
                    return;
                }
            case 3:
                AndroidUtilities.runOnUIThread(new o3((ls) obj3, tLObject, (TLRPC.InputPeer) obj2, this.f6564b, (int[]) obj, 21));
                return;
            case 4:
                iv0 iv0Var = (iv0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new rs((org.telegram.ui.ActionBar.d2[]) obj2, 2));
                int i11 = this.f6564b;
                if (tL_error == null) {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new q(iv0Var, i11, tL_error, tL_messages_editMessage, 25));
                    return;
                }
            case 5:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new o3((LaunchActivity) obj3, tLObject, (Uri) obj2, this.f6564b, (org.telegram.ui.ActionBar.d2) obj, 23), 2L);
                return;
            case 6:
                ri0 ri0Var = (ri0) obj3;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i12 = this.f6564b;
                if (z10) {
                    MessagesController.getInstance(i12).processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(ri0Var);
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new g21(i12, tL_error, p2Var2, tL_payments_assignPlayMarketTransaction, 10));
                    return;
                } else {
                    return;
                }
            case 7:
                AndroidUtilities.runOnUIThread(new org.telegram.messenger.w0((org.telegram.ui.web.c1) obj3, tLObject, this.f6564b, (org.telegram.ui.web.y0) obj2, (org.telegram.ui.web.a1) obj, tL_error));
                return;
            default:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                fg.e1 e1Var = (fg.e1) obj;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj3 != null) {
                    FileRefController.getInstance(this.f6564b).requestReference(obj3, tL_messages_getAttachedStickers, e1Var);
                    return;
                } else {
                    e1Var.run(tLObject, tL_error);
                    return;
                }
        }
    }

    public c5(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f6563a = i11;
        this.f6565c = obj;
        this.f6564b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public c5(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f6563a = i11;
        this.f6565c = obj;
        this.d = obj2;
        this.f6564b = i10;
        this.e = obj3;
    }
}
