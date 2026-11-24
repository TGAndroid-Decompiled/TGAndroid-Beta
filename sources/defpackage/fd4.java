package defpackage;

import android.content.Context;
public final class fd4 extends ld5 {
    public final ri r;

    public fd4(Context context, wjb wjbVar) {
        super(context);
        int i;
        ri riVar = new ri(context, true, true, true, (byte) 1);
        this.r = riVar;
        if (k96.a0) {
            i = 3;
        } else {
            i = 5;
        }
        riVar.setGravity(i);
        zkb.U(riVar, bkb.K6, wjbVar);
        riVar.setTextSize(gl.N(15.0f));
        addView(riVar, nme.d(-1, 18.0f, (k96.a0 ? 3 : 5) | 48, 22.0f, 17.0f, 22.0f, 0.0f));
        ote.b(riVar, 0.04f, 1.2f);
    }
}
