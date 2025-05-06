package org.telegram.messenger.pip.activity;

public interface IPipActivityAnimationListener {

    public abstract class CC {
        public static void $default$onEnterAnimationEnd(IPipActivityAnimationListener iPipActivityAnimationListener, long j) {
        }

        public static void $default$onEnterAnimationStart(IPipActivityAnimationListener iPipActivityAnimationListener, long j) {
        }

        public static void $default$onLeaveAnimationEnd(IPipActivityAnimationListener iPipActivityAnimationListener, long j) {
        }

        public static void $default$onLeaveAnimationStart(IPipActivityAnimationListener iPipActivityAnimationListener, long j) {
        }
    }

    void onEnterAnimationEnd(long j);

    void onEnterAnimationStart(long j);

    void onLeaveAnimationEnd(long j);

    void onLeaveAnimationStart(long j);

    void onTransitionAnimationFrame();

    void onTransitionAnimationProgress(float f);
}
