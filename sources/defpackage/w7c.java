package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class w7c extends no4 {
    public final l7 K;
    public final x7c L;

    public w7c(x7c x7cVar, Context context, wjb wjbVar) {
        super(context, wjbVar);
        this.L = x7cVar;
        l7 l7Var = this.r;
        this.K = l7Var;
        l7Var.setImeOptions(268435459);
        l7Var.setHint(k96.M0(2131743097, null));
        l7Var.addTextChangedListener(new jf6(this, (byte) 21));
        l7Var.setOnEditorActionListener(new j(this, (byte) 28));
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.L.E0(motionEvent, this.K);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
