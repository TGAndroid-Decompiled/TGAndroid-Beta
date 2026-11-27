package defpackage;

import android.net.Uri;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class lh implements RequestDelegate {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public lh(int i, yv1 yv1Var, e eVar, TLRPC.TL_payments_assignPlayMarketTransaction tL_payments_assignPlayMarketTransaction) {
        this.a = (byte) 7;
        this.b = i;
        this.c = yv1Var;
        this.e = eVar;
        this.d = tL_payments_assignPlayMarketTransaction;
    }

    @Override
    public final void run(org.telegram.tgnet.TLObject r20, org.telegram.tgnet.TLRPC.TL_error r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lh.run(org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_error):void");
    }

    public lh(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public lh(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public lh(LaunchActivity launchActivity, Uri uri, int i, id idVar) {
        this.a = (byte) 4;
        this.c = launchActivity;
        this.e = uri;
        this.b = i;
        this.d = idVar;
    }
}
