package defpackage;

import android.app.Activity;
import android.content.Context;
import android.view.View;
import org.telegram.tgnet.TLRPC;
public final class vb2 implements View.OnClickListener {
    public final byte a;
    public final int b;
    public final Object c;
    public final Context d;
    public final Object e;
    public final Object f;

    public vb2(Object obj, Context context, Object obj2, int i, Object obj3, byte b) {
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
                ((yb2) obj3).a();
                ij.D(context, (wjb) obj2, new jh(this.b, (xb2) obj, (byte) 4));
                return;
            default:
                wf2 wf2Var = (wf2) obj2;
                TLRPC.TL_inputGroupCallSlug tL_inputGroupCallSlug = (TLRPC.TL_inputGroupCallSlug) obj;
                ((fx0) obj3).dismiss();
                Activity W = gl.W((Activity) context);
                if (W != null) {
                    na7.c1().edit().putBoolean("callmiconstart", wf2Var.a.q).apply();
                    rgc.g(W, this.b, tL_inputGroupCallSlug, false, null, null);
                    return;
                }
                return;
        }
    }
}
