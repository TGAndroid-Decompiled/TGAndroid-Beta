package defpackage;

import android.content.Context;
public final class twa extends o39 {
    public int f3;
    public final uxa g3;

    public twa(uxa uxaVar, Context context) {
        super(context, null);
        this.g3 = uxaVar;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        ywa ywaVar;
        super.onMeasure(i, i2);
        if (this.f3 != getMeasuredHeight() && (ywaVar = this.g3.X) != null) {
            ywaVar.f();
        }
        this.f3 = getMeasuredHeight();
    }
}
