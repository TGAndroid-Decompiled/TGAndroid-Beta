package defpackage;

import android.content.Context;
import android.view.MotionEvent;
public final class wbc extends rq4 {
    public final m7 L;
    public final xbc M;

    public wbc(xbc xbcVar, Context context, vnb vnbVar) {
        super(context, vnbVar);
        this.M = xbcVar;
        m7 m7Var = this.r;
        this.L = m7Var;
        m7Var.setImeOptions(268435459);
        m7Var.setHint(ob6.M0(2131742991, null));
        m7Var.addTextChangedListener(new nh6(this, (byte) 22));
        m7Var.setOnEditorActionListener(new j(this, (byte) 28));
    }

    @Override
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        this.M.F0(motionEvent, this.L);
        return super.onInterceptTouchEvent(motionEvent);
    }
}
