package jh;

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
import org.telegram.ui.Components.as;
import org.telegram.ui.Components.hu0;
import org.telegram.ui.Components.ur;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ci0;
import org.telegram.ui.d70;
import org.telegram.ui.xs;

public final class b8 implements RequestDelegate {

    public final int f13126a;

    public final int f13127b;

    public final Object f13128c;
    public final Object d;

    public final Object f13129e;

    public b8(int i10, ci0 ci0Var, org.telegram.ui.ActionBar.n2 n2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f13126a = 7;
        this.f13127b = i10;
        this.f13128c = ci0Var;
        this.d = n2Var;
        this.f13129e = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f13126a;
        int i11 = this.f13127b;
        Object obj = this.f13129e;
        Object obj2 = this.d;
        Object obj3 = this.f13128c;
        switch (i10) {
            case 0:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                gf.j0 j0Var = (gf.j0) obj;
                if (tL_error == null || !FileRefController.isFileRefError(tL_error.text) || obj3 == null) {
                    j0Var.run(tLObject, tL_error);
                } else {
                    FileRefController.getInstance(i11).requestReference(obj3, tL_messages_getAttachedStickers, j0Var);
                }
                break;
            case 1:
                AndroidUtilities.runOnUIThread(new gh.e1(tLObject, (boolean[]) obj3, (Utilities.Callback) obj2, this.f13127b, (TL_account.updateEmojiStatus) obj));
                break;
            case 2:
                AndroidUtilities.runOnUIThread(new gf.k0((d70) obj3, (org.telegram.ui.k4) obj2, tL_error, tLObject, this.f13127b, (org.telegram.ui.g1) obj));
                break;
            case 3:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.b2 b2Var = (org.telegram.ui.ActionBar.b2) obj2;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) obj;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.a2(b2Var, 0));
                } else {
                    AndroidUtilities.runOnUIThread(new gh.e1(sharedPreferences, (TLRPC.TL_help_support) tLObject, b2Var, this.f13127b, n2Var, 18));
                }
                break;
            case 4:
                AndroidUtilities.runOnUIThread(new gh.e1((ur) obj3, tLObject, (TLRPC.InputPeer) obj2, this.f13127b, (int[]) obj, 19));
                break;
            case 5:
                hu0 hu0Var = (hu0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new as((org.telegram.ui.ActionBar.b2[]) obj2, 2));
                int i12 = this.f13127b;
                if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new ag.k0(hu0Var, i12, tL_error, tL_messages_editMessage, 24));
                } else {
                    MessagesController.getInstance(i12).processUpdates((TLRPC.Updates) tLObject, false);
                }
                break;
            case 6:
                Pattern pattern = LaunchActivity.f35496x1;
                AndroidUtilities.runOnUIThread(new gh.e1((LaunchActivity) obj3, tLObject, (Uri) obj2, this.f13127b, (org.telegram.ui.ActionBar.b2) obj, 21), 2L);
                break;
            case 7:
                ci0 ci0Var = (ci0) obj3;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                if (tLObject instanceof TLRPC.Updates) {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(ci0Var);
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new xs(i11, tL_error, n2Var2, tL_payments_assignPlayMarketTransaction));
                }
                break;
            default:
                AndroidUtilities.runOnUIThread(new gf.k0((org.telegram.ui.web.z0) obj3, (String) obj2, tLObject, tL_error, this.f13127b, (org.telegram.ui.web.w0) obj));
                break;
        }
    }

    public b8(Object obj, int i10, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, gf.j0 j0Var) {
        this.f13126a = 0;
        this.f13128c = obj;
        this.f13127b = i10;
        this.d = tL_messages_getAttachedStickers;
        this.f13129e = j0Var;
    }

    public b8(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f13126a = i11;
        this.f13128c = obj;
        this.d = obj2;
        this.f13127b = i10;
        this.f13129e = obj3;
    }
}
