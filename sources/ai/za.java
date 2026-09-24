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
import org.telegram.ui.Components.f21;
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.jv0;
import org.telegram.ui.Components.ms;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ki0;
import org.telegram.ui.p70;
public final class za implements RequestDelegate {
    public final int f1789a;
    public final int f1790b;
    public final Object f1791c;
    public final Object d;
    public final Object e;

    public za(int i10, ki0 ki0Var, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f1789a = 7;
        this.f1790b = i10;
        this.f1791c = ki0Var;
        this.d = m2Var;
        this.e = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f1789a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f1791c;
        switch (i10) {
            case 0:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                ya yaVar = (ya) obj;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj3 != null) {
                    FileRefController.getInstance(this.f1790b).requestReference(obj3, tL_messages_getAttachedStickers, yaVar);
                    return;
                } else {
                    yaVar.run(tLObject, tL_error);
                    return;
                }
            case 1:
                AndroidUtilities.runOnUIThread(new ei.l3(tLObject, (boolean[]) obj3, (Utilities.Callback) obj2, this.f1790b, (TL_account.updateEmojiStatus) obj, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new cb((p70) obj3, (org.telegram.ui.g4) obj2, tL_error, tLObject, this.f1790b, (org.telegram.ui.d1) obj));
                return;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new ei.l3(sharedPreferences, (TLRPC.TL_help_support) tLObject, a2Var, this.f1790b, m2Var, 21));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c2(a2Var, 0));
                    return;
                }
            case 4:
                AndroidUtilities.runOnUIThread(new ei.l3((gs) obj3, tLObject, (TLRPC.InputPeer) obj2, this.f1790b, (int[]) obj, 22));
                return;
            case 5:
                jv0 jv0Var = (jv0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new ms((org.telegram.ui.ActionBar.a2[]) obj2, 2));
                int i11 = this.f1790b;
                if (tL_error == null) {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new c9(jv0Var, i11, tL_error, tL_messages_editMessage, 25));
                    return;
                }
            case 6:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new ei.l3((LaunchActivity) obj3, tLObject, (Uri) obj2, this.f1790b, (org.telegram.ui.ActionBar.a2) obj, 24), 2L);
                return;
            case 7:
                ki0 ki0Var = (ki0) obj3;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i12 = this.f1790b;
                if (z10) {
                    MessagesController.getInstance(i12).processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(ki0Var);
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new f21(i12, tL_error, m2Var2, tL_payments_assignPlayMarketTransaction, 10));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new cb((org.telegram.ui.web.b1) obj3, tLObject, this.f1790b, (org.telegram.ui.web.y0) obj2, (da) obj, tL_error));
                return;
        }
    }

    public za(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f1789a = i11;
        this.f1791c = obj;
        this.f1790b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public za(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f1789a = i11;
        this.f1791c = obj;
        this.d = obj2;
        this.f1790b = i10;
        this.e = obj3;
    }
}
