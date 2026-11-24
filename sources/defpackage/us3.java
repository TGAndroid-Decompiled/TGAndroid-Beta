package defpackage;

import android.content.Context;
import org.telegram.tgnet.TLObject;
public final class us3 extends gg0 {
    public final lka s;
    public TLObject w;

    public us3(Context context, ylb ylbVar) {
        super(context, ylbVar);
        int i;
        float f;
        float f2;
        this.c.setVisibility(8);
        lka lkaVar = this.e;
        int i2 = cmb.A6;
        anb.W(lkaVar, i2, ylbVar);
        lka lkaVar2 = new lka(context);
        this.s = lkaVar2;
        lkaVar2.setTextSize(16);
        anb.W(lkaVar2, i2, ylbVar);
        if (jb6.a0) {
            i = 3;
        } else {
            i = 5;
        }
        lkaVar2.setGravity(i);
        addView(lkaVar2);
        boolean z = jb6.a0;
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
        lkaVar2.setLayoutParams(qoe.d(-1, -2.0f, i3, f, 0.0f, f2, 0.0f));
    }

    @Override
    public final boolean b() {
        return true;
    }

    public Object getGifCode() {
        return this.w;
    }
}
