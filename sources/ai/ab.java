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
import org.telegram.ui.Components.dt;
import org.telegram.ui.Components.hw0;
import org.telegram.ui.Components.w21;
import org.telegram.ui.Components.xs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ti0;
import org.telegram.ui.w70;
public final class ab implements RequestDelegate {
    public final int f656a;
    public final int f657b;
    public final Object f658c;
    public final Object d;
    public final Object f659e;

    public ab(int i10, ti0 ti0Var, org.telegram.ui.ActionBar.m2 m2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f656a = 7;
        this.f657b = i10;
        this.f658c = ti0Var;
        this.d = m2Var;
        this.f659e = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f656a;
        Object obj = this.f659e;
        Object obj2 = this.d;
        Object obj3 = this.f658c;
        switch (i10) {
            case 0:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                za zaVar = (za) obj;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj3 != null) {
                    FileRefController.getInstance(this.f657b).requestReference(obj3, tL_messages_getAttachedStickers, zaVar);
                    return;
                } else {
                    zaVar.run(tLObject, tL_error);
                    return;
                }
            case 1:
                AndroidUtilities.runOnUIThread(new ei.l3(tLObject, (boolean[]) obj3, (Utilities.Callback) obj2, this.f657b, (TL_account.updateEmojiStatus) obj, 1));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new db((w70) obj3, (org.telegram.ui.g4) obj2, tL_error, tLObject, this.f657b, (org.telegram.ui.d1) obj));
                return;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.a2 a2Var = (org.telegram.ui.ActionBar.a2) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = (org.telegram.ui.ActionBar.m2) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new ei.l3(sharedPreferences, (TLRPC.TL_help_support) tLObject, a2Var, this.f657b, m2Var, 21));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.c2(a2Var, 0));
                    return;
                }
            case 4:
                AndroidUtilities.runOnUIThread(new ei.l3((xs) obj3, tLObject, (TLRPC.InputPeer) obj2, this.f657b, (int[]) obj, 22));
                return;
            case 5:
                hw0 hw0Var = (hw0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new dt((org.telegram.ui.ActionBar.a2[]) obj2, 2));
                int i11 = this.f657b;
                if (tL_error == null) {
                    MessagesController.getInstance(i11).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new d9(hw0Var, i11, tL_error, tL_messages_editMessage, 26));
                    return;
                }
            case 6:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new ei.l3((LaunchActivity) obj3, tLObject, (Uri) obj2, this.f657b, (org.telegram.ui.ActionBar.a2) obj, 24), 2L);
                return;
            case 7:
                ti0 ti0Var = (ti0) obj3;
                org.telegram.ui.ActionBar.m2 m2Var2 = (org.telegram.ui.ActionBar.m2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i12 = this.f657b;
                if (z10) {
                    MessagesController.getInstance(i12).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(ti0Var);
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new w21(i12, tL_error, m2Var2, tL_payments_assignPlayMarketTransaction, 11));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new db((org.telegram.ui.web.b1) obj3, tLObject, this.f657b, (org.telegram.ui.web.y0) obj2, (ea) obj, tL_error));
                return;
        }
    }

    public ab(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f656a = i11;
        this.f658c = obj;
        this.f657b = i10;
        this.d = obj2;
        this.f659e = obj3;
    }

    public ab(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f656a = i11;
        this.f658c = obj;
        this.d = obj2;
        this.f657b = i10;
        this.f659e = obj3;
    }
}
