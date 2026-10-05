package ai;

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
import org.telegram.ui.Components.is;
import org.telegram.ui.Components.os;
import org.telegram.ui.Components.qv0;
import org.telegram.ui.Components.r21;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.oi0;
import org.telegram.ui.t70;
public final class za implements RequestDelegate {
    public final int f1945a;
    public final int f1946b;
    public final Object f1947c;
    public final Object d;
    public final Object f1948e;

    public za(int i10, oi0 oi0Var, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f1945a = 7;
        this.f1946b = i10;
        this.f1947c = oi0Var;
        this.d = n2Var;
        this.f1948e = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f1945a;
        Object obj = this.f1948e;
        Object obj2 = this.d;
        Object obj3 = this.f1947c;
        switch (i10) {
            case 0:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                ya yaVar = (ya) obj;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj3 != null) {
                    FileRefController.getInstance(this.f1946b).requestReference(obj3, tL_messages_getAttachedStickers, yaVar);
                    return;
                } else {
                    yaVar.run(tLObject, tL_error);
                    return;
                }
            case 1:
                AndroidUtilities.runOnUIThread(new ei.m3(tLObject, (boolean[]) obj3, (Utilities.Callback) obj2, this.f1946b, (TL_account.updateEmojiStatus) obj, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new cb((t70) obj3, (org.telegram.ui.g4) obj2, tL_error, tLObject, this.f1946b, (org.telegram.ui.d1) obj));
                return;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new ei.m3(sharedPreferences, (TLRPC.TL_help_support) tLObject, b2Var, this.f1946b, n2Var, 21));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c2(b2Var, 0));
                    return;
                }
            case 4:
                AndroidUtilities.runOnUIThread(new ei.m3((is) obj3, tLObject, (TLRPC.InputPeer) obj2, this.f1946b, (int[]) obj, 22));
                return;
            case 5:
                qv0 qv0Var = (qv0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new os((org.telegram.ui.ActionBar.b2[]) obj2, 2));
                int i11 = this.f1946b;
                if (tL_error == null) {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new c9(qv0Var, i11, tL_error, tL_messages_editMessage, 25));
                    return;
                }
            case 6:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new ei.m3((LaunchActivity) obj3, tLObject, (Uri) obj2, this.f1946b, (org.telegram.ui.ActionBar.b2) obj, 24), 2L);
                return;
            case 7:
                oi0 oi0Var = (oi0) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i12 = this.f1946b;
                if (z10) {
                    MessagesController.getInstance(i12).processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(oi0Var);
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new r21(i12, tL_error, n2Var2, tL_payments_assignPlayMarketTransaction, 10));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new cb((org.telegram.ui.web.c1) obj3, tLObject, this.f1946b, (org.telegram.ui.web.z0) obj2, (da) obj, tL_error));
                return;
        }
    }

    public za(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f1945a = i11;
        this.f1947c = obj;
        this.f1946b = i10;
        this.d = obj2;
        this.f1948e = obj3;
    }

    public za(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f1945a = i11;
        this.f1947c = obj;
        this.d = obj2;
        this.f1946b = i10;
        this.f1948e = obj3;
    }
}
