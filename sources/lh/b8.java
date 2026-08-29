package lh;

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
import org.telegram.ui.Components.gs;
import org.telegram.ui.Components.qu0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.d70;
import org.telegram.ui.vs;
import org.telegram.ui.zh0;
public final class b8 implements RequestDelegate {
    public final int f15409a;
    public final int f15410b;
    public final Object f15411c;
    public final Object d;
    public final Object f15412e;

    public b8(int i10, zh0 zh0Var, org.telegram.ui.ActionBar.o2 o2Var, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.f15409a = 6;
        this.f15410b = i10;
        this.f15411c = zh0Var;
        this.d = o2Var;
        this.f15412e = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f15409a;
        Object obj = this.f15412e;
        Object obj2 = this.d;
        Object obj3 = this.f15411c;
        switch (i10) {
            case 0:
                TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers = (TLRPC.TL_messages_getAttachedStickers) obj2;
                jf.i0 i0Var = (jf.i0) obj;
                if (tL_error != null && FileRefController.isFileRefError(tL_error.text) && obj3 != null) {
                    FileRefController.getInstance(this.f15410b).requestReference(obj3, tL_messages_getAttachedStickers, i0Var);
                    return;
                } else {
                    i0Var.run(tLObject, tL_error);
                    return;
                }
            case 1:
                AndroidUtilities.runOnUIThread(new jf.j0((d70) obj3, (org.telegram.ui.k4) obj2, tL_error, tLObject, this.f15410b, (org.telegram.ui.g1) obj));
                return;
            case 2:
                SharedPreferences sharedPreferences = (SharedPreferences) obj3;
                org.telegram.ui.ActionBar.c2 c2Var = (org.telegram.ui.ActionBar.c2) obj2;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) obj;
                if (tL_error == null) {
                    AndroidUtilities.runOnUIThread(new bg.j3(sharedPreferences, (TLRPC.TL_help_support) tLObject, c2Var, this.f15410b, o2Var, 17));
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new org.telegram.ui.Components.e2(c2Var, 0));
                    return;
                }
            case 3:
                AndroidUtilities.runOnUIThread(new bg.j3((as) obj3, tLObject, (TLRPC.InputPeer) obj2, this.f15410b, (int[]) obj, 18));
                return;
            case 4:
                qu0 qu0Var = (qu0) obj3;
                TLRPC.TL_messages_editMessage tL_messages_editMessage = (TLRPC.TL_messages_editMessage) obj;
                AndroidUtilities.runOnUIThread(new gs((org.telegram.ui.ActionBar.c2[]) obj2, 2));
                int i11 = this.f15410b;
                if (tL_error == null) {
                    MessagesController.getInstance(i11).processUpdates((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    AndroidUtilities.runOnUIThread(new ag.z1(qu0Var, i11, tL_error, tL_messages_editMessage, 24));
                    return;
                }
            case 5:
                Pattern pattern = LaunchActivity.f35560x1;
                AndroidUtilities.runOnUIThread(new bg.j3((LaunchActivity) obj3, tLObject, (Uri) obj2, this.f15410b, (org.telegram.ui.ActionBar.c2) obj, 20), 2L);
                return;
            case 6:
                zh0 zh0Var = (zh0) obj3;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) obj2;
                TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction = (TLRPC.TL_payments_assignPlayMarketTransaction) obj;
                boolean z10 = tLObject instanceof TLRPC.Updates;
                int i12 = this.f15410b;
                if (z10) {
                    MessagesController.getInstance(i12).processUpdates((TLRPC.Updates) tLObject, false);
                    AndroidUtilities.runOnUIThread(zh0Var);
                    return;
                } else if (tL_error != null) {
                    AndroidUtilities.runOnUIThread(new vs(i12, tL_error, o2Var2, tL_payments_assignPlayMarketTransaction, 9));
                    return;
                } else {
                    return;
                }
            case 7:
                AndroidUtilities.runOnUIThread(new jf.j0((org.telegram.ui.web.z0) obj3, (String) obj2, tLObject, tL_error, this.f15410b, (org.telegram.ui.web.w0) obj));
                return;
            default:
                AndroidUtilities.runOnUIThread(new bg.j3(tLObject, (boolean[]) obj3, (Utilities.Callback) obj2, this.f15410b, (TL_account.updateEmojiStatus) obj, 27));
                return;
        }
    }

    public b8(Object obj, int i10, TLRPC.TL_messages_getAttachedStickers tL_messages_getAttachedStickers, jf.i0 i0Var) {
        this.f15409a = 0;
        this.f15411c = obj;
        this.f15410b = i10;
        this.d = tL_messages_getAttachedStickers;
        this.f15412e = i0Var;
    }

    public b8(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f15409a = i11;
        this.f15411c = obj;
        this.d = obj2;
        this.f15410b = i10;
        this.f15412e = obj3;
    }
}
