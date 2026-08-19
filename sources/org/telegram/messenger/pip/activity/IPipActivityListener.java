package org.telegram.messenger.pip.activity;

public interface IPipActivityListener {

    public abstract class CC {
        public static void $default$onCompleteEnterToPip(IPipActivityListener iPipActivityListener) {
        }

        public static void $default$onPipStashEnd(IPipActivityListener iPipActivityListener) {
        }

        public static void $default$onPipStashStart(IPipActivityListener iPipActivityListener) {
        }

        public static void $default$onStartEnterToPip(IPipActivityListener iPipActivityListener) {
        }

        public static void $default$onStartExitFromPip(IPipActivityListener iPipActivityListener, boolean z) {
        }
    }

    void onCompleteEnterToPip();

    void onCompleteExitFromPip(boolean z);

    void onPipStashEnd();

    void onPipStashStart();

    void onStartEnterToPip();

    void onStartExitFromPip(boolean z);
}
