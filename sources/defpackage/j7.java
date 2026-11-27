package defpackage;

import android.transition.Transition;
public final class j7 implements Transition.TransitionListener {
    public final byte a;
    public final Object b;

    public j7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((s7) obj).j0.e();
                return;
            case 1:
                ((rq4) obj).G.e();
                return;
            default:
                return;
        }
    }

    @Override
    public final void onTransitionEnd(Transition transition) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((s7) obj).j0.e();
                return;
            case 1:
                ((rq4) obj).G.e();
                return;
            default:
                ((me7) obj).run();
                return;
        }
    }

    @Override
    public final void onTransitionPause(Transition transition) {
        byte b = this.a;
    }

    @Override
    public final void onTransitionResume(Transition transition) {
        byte b = this.a;
    }

    @Override
    public final void onTransitionStart(Transition transition) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((s7) obj).j0.d();
                return;
            case 1:
                ((rq4) obj).G.d();
                return;
            default:
                return;
        }
    }

    private final void a(Transition transition) {
    }

    private final void b(Transition transition) {
    }

    private final void c(Transition transition) {
    }

    private final void d(Transition transition) {
    }

    private final void e(Transition transition) {
    }

    private final void f(Transition transition) {
    }

    private final void g(Transition transition) {
    }

    private final void h(Transition transition) {
    }
}
