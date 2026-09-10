package bi;

import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.hy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.fj;
public final class te implements Runnable {
    public final int f3697a;
    public final Object f3698b;
    public final Object f3699c;
    public final Object d;
    public final Object e;
    public final Object f3700f;
    public final Object h;

    public te(fg.b1 b1Var, String str, TLRPC.TL_error tL_error, TLObject tLObject, MessagesController messagesController, MessagesStorage messagesStorage) {
        this.f3697a = 2;
        this.f3698b = b1Var;
        this.e = str;
        this.f3700f = tL_error;
        this.f3699c = tLObject;
        this.d = messagesController;
        this.h = messagesStorage;
    }

    private final void a() {
        String str;
        xh.v5 v5Var = (xh.v5) this.f3698b;
        TLObject tLObject = (TLObject) this.f3699c;
        MessageObject messageObject = (MessageObject) this.d;
        TLRPC.TL_inputInvoiceMessage tL_inputInvoiceMessage = (TLRPC.TL_inputInvoiceMessage) this.e;
        fj fjVar = (fj) this.f3700f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
        if (tLObject instanceof TLRPC.TL_payments_paymentFormStars) {
            v5Var.Y(messageObject, tL_inputInvoiceMessage, (TLRPC.TL_payments_paymentFormStars) tLObject, fjVar, null);
        } else {
            if (tL_error == null) {
                str = "NO_PAYMENT_FORM";
            } else {
                str = tL_error.text;
            }
            xh.v5.e(str);
        }
        fjVar.run();
    }

    private final void b() {
        ((boolean[]) this.f3699c)[0] = true;
        ((xh.v5) this.f3698b).a0((MessageObject) this.d, (TLRPC.InputInvoice) this.e, (TLRPC.TL_payments_paymentFormStars) this.f3700f, new xh.w0(1, (Utilities.Callback) this.h));
    }

    private final void c() {
        org.telegram.ui.ActionBar.p2 U;
        xh.l5 l5Var = (xh.l5) this.f3698b;
        TLObject tLObject = (TLObject) this.f3699c;
        TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) this.d;
        xh.n5 n5Var = (xh.n5) this.e;
        Utilities.Callback callback = (Utilities.Callback) this.f3700f;
        TLRPC.TL_error tL_error = (TLRPC.TL_error) this.h;
        long j3 = l5Var.f45663b;
        int i10 = l5Var.f45662a;
        HashMap hashMap = l5Var.h;
        ArrayList arrayList = l5Var.e;
        l5Var.f45669k = false;
        if (tLObject instanceof TL_stars.TL_starGiftCollection) {
            TL_stars.TL_starGiftCollection tL_starGiftCollection2 = (TL_stars.TL_starGiftCollection) tLObject;
            arrayList.remove(tL_starGiftCollection);
            arrayList.add(tL_starGiftCollection2);
            hashMap.remove(-1);
            int i11 = tL_starGiftCollection2.collection_id;
            n5Var.d = i11;
            hashMap.put(Integer.valueOf(i11), n5Var);
            l5Var.j();
            NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), l5Var);
            if (callback != null) {
                callback.run(tL_starGiftCollection2);
                return;
            }
            return;
        }
        if (tL_error != null && (U = LaunchActivity.U()) != null) {
            org.telegram.ui.Components.wc.a0(U).d0(tL_error, false);
        }
        arrayList.remove(tL_starGiftCollection);
        hashMap.remove(-1);
        l5Var.j();
        NotificationCenter.getInstance(i10).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(j3), l5Var);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: bi.te.run():void");
    }

    public te(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f3697a = i10;
        this.f3698b = obj;
        this.f3699c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f3700f = obj5;
        this.h = obj6;
    }

    public te(TLObject tLObject, Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i10) {
        this.f3697a = i10;
        this.f3699c = tLObject;
        this.f3698b = obj;
        this.d = obj2;
        this.e = obj3;
        this.f3700f = obj4;
        this.h = obj5;
    }

    public te(org.telegram.ui.ActionBar.p2 p2Var, Object obj, Object obj2, Object obj3, TLObject tLObject, Object obj4, int i10) {
        this.f3697a = i10;
        this.f3698b = p2Var;
        this.d = obj;
        this.e = obj2;
        this.f3700f = obj3;
        this.f3699c = tLObject;
        this.h = obj4;
    }

    public te(hy0 hy0Var, TLObject tLObject, EditTextBoldCursor editTextBoldCursor, TextView textView, TextView textView2, int[] iArr) {
        this.f3697a = 7;
        this.d = hy0Var;
        this.f3699c = tLObject;
        this.e = editTextBoldCursor;
        this.f3700f = textView;
        this.h = textView2;
        this.f3698b = iArr;
    }

    public te(wh.p1 p1Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, xh.r6 r6Var, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        this.f3697a = 14;
        this.f3698b = p1Var;
        this.d = d2Var;
        this.f3699c = tLObject;
        this.e = r6Var;
        this.f3700f = callback;
        this.h = tL_error;
    }
}
