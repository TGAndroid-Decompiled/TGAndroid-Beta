package defpackage;

import android.transition.Transition;
public final class i7 implements Transition.TransitionListener {
    public final byte a;
    public final Object b;

    public i7(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override
    public final void onTransitionCancel(Transition transition) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                ((r7) obj).j0.e();
                return;
            case 1:
                ((no4) obj).F.e();
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
                ((r7) obj).j0.e();
                return;
            case 1:
                ((no4) obj).F.e();
                return;
            default:
                ((on7) obj).run();
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
                ((r7) obj).j0.d();
                return;
            case 1:
                ((no4) obj).F.d();
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
