package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLObject;
public final class cs3 extends if0 {
    public final ema s;
    public TLObject w;

    public cs3(Context context, vnb vnbVar) {
        super(context, vnbVar);
        int i;
        float f;
        float f2;
        this.c.setVisibility(8);
        ema emaVar = this.e;
        int i2 = aob.B6;
        yob.W(emaVar, i2, vnbVar);
        ema emaVar2 = new ema(context);
        this.s = emaVar2;
        emaVar2.setTextSize(16);
        yob.W(emaVar2, i2, vnbVar);
        if (ob6.a0) {
            i = 3;
        } else {
            i = 5;
        }
        emaVar2.setGravity(i);
        addView(emaVar2);
        boolean z = ob6.a0;
        int i3 = (z ? 3 : 5) | 16;
        if (z) {
            f = 20.0f;
        } else {
            f = 0.0f;
        }
        if (z) {
            f2 = 0.0f;
        } else {
            f2 = 20.0f;
        }
        emaVar2.setLayoutParams(tre.d(-1, -2.0f, i3, f, 0.0f, f2, 0.0f));
    }

    @Override
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.w;
    }
}
