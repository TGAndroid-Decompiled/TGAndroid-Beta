package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLObject;
public final class kr3 extends gf0 {
    public final jia s;
    public TLObject w;

    public kr3(Context context, wjb wjbVar) {
        super(context, wjbVar);
        int i;
        float f;
        float f2;
        this.c.setVisibility(8);
        jia jiaVar = this.e;
        int i2 = bkb.A6;
        zkb.W(jiaVar, i2, wjbVar);
        jia jiaVar2 = new jia(context);
        this.s = jiaVar2;
        jiaVar2.setTextSize(16);
        zkb.W(jiaVar2, i2, wjbVar);
        if (k96.a0) {
            i = 3;
        } else {
            i = 5;
        }
        jiaVar2.setGravity(i);
        addView(jiaVar2);
        boolean z = k96.a0;
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
        jiaVar2.setLayoutParams(nme.d(-1, -2.0f, i3, f, 0.0f, f2, 0.0f));
    }

    @Override
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.w;
    }
}
