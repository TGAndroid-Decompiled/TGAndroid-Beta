package di;

import android.content.SharedPreferences;
import android.net.Uri;
import bi.sb;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.FileRefController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.as0;
import org.telegram.ui.Components.bw0;
import org.telegram.ui.Components.rs;
import org.telegram.ui.Components.xs;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ei0;
import org.telegram.ui.j70;
public final class q8 implements RequestDelegate {
    public final int f9066a;
    public final int f9067b;
    public final Object f9068c;
    public final Object d;
    public final Object e;

    public q8(int i10, ei0 ei0Var, org.telegram.ui.ActionBar.r2 r2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f9066a = 7;
        this.f9067b = i10;
        this.f9068c = ei0Var;
        this.d = r2Var;
        this.e = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f9066a;
        int i11 = this.f9067b;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.f9068c;
        switch (i10) {
            case 0:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                ag.p0 p0Var = (ag.p0) obj;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj3 != null) {
                    FileRefController.getInstance(i11).requestReference(obj3, tL_messages_getAttachedStickers, p0Var);
                    return;
                } else {
                    p0Var.run(tLObject, tL_error);
                    return;
                }
            case 1:
                AndroidUtilities.runOnUIThread(new sb(tLObject, (boolean[]) obj3, (Utilities.Callback) obj2, this.f9067b, (TL_account.updateEmojiStatus) obj));
                return;
            case 2:
                AndroidUtilities.runOnUIThread(new ag.q0((j70) obj3, (org.telegram.ui.h4) obj2, tL_error, tLObject, this.f9067b, (org.telegram.ui.c1) obj));
                return;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.e2 e2Var = (org.telegram.ui.ActionBar.e2) obj2;
                org.telegram.ui.ActionBar.r2 r2Var = (org.telegram.ui.ActionBar.r2) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new sb((Object) sharedPreferences, (Object) ((TLRPC.TL_help_support) tLObject), (Object) e2Var, this.f9067b, (Object) r2Var, 22));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e2(e2Var, 0));
                    return;
                }
            case 4:
                AndroidUtilities.runOnUIThread(new sb((Object) ((rs) obj3), tLObject, (Object) ((TLRPC.InputPeer) obj2), this.f9067b, (Object) ((int[]) obj), 23));
                return;
            case 5:
                bw0 bw0Var = (bw0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new xs((org.telegram.ui.ActionBar.e2[]) obj2, 2));
                int i12 = this.f9067b;
                if (tL_error == null) {
                    MessagesController.getInstance(i12).lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new ai.h1(bw0Var, i12, tL_error, tL_messages_editMessage, 28));
                    return;
                }
            case 6:
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new sb((Object) ((LaunchActivity) obj3), tLObject, (Object) ((Uri) obj2), this.f9067b, (Object) ((org.telegram.ui.ActionBar.e2) obj), 25), 2L);
                return;
            case 7:
                ei0 ei0Var = (ei0) obj3;
                org.telegram.ui.ActionBar.r2 r2Var2 = (org.telegram.ui.ActionBar.r2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(i11).lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(ei0Var);
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new as0(i11, tL_error, r2Var2, tL_payments_assignPlayMarketTransaction));
                    return;
                } else {
                    return;
                }
            default:
                AndroidUtilities.runOnUIThread(new ag.q0((org.telegram.ui.web.a1) obj3, tLObject, this.f9067b, (org.telegram.ui.web.x0) obj2, (x7) obj, tL_error));
                return;
        }
    }

    public q8(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f9066a = i11;
        this.f9068c = obj;
        this.f9067b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public q8(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f9066a = i11;
        this.f9068c = obj;
        this.d = obj2;
        this.f9067b = i10;
        this.e = obj3;
    }
}
