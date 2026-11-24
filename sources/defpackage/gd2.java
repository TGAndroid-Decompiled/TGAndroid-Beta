package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class gd2 implements View.OnClickListener {
    public final byte a;
    public final int b;
    public final Object c;
    public final Context d;
    public final Object e;
    public final Object f;

    public gd2(Object obj, Context context, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = context;
        this.e = obj2;
        this.b = i;
        this.f = obj3;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.e;
        Context context = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ((jd2) obj3).a();
                ik.D(context, (ylb) obj2, new ji(this.b, (id2) obj, (byte) 4));
                return;
            default:
                jh2 jh2Var = (jh2) obj2;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) obj;
                ((my0) obj3).dismiss();
                Activity W = gm.W((Activity) context);
                if (W != null) {
                    oc7.d1().edit().putBoolean("callmiconstart", jh2Var.a.q).apply();
                    sic.g(W, this.b, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
