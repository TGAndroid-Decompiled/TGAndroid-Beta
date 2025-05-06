package org.telegram.messenger.pip.activity;

public interface IPipActivityListener {

    public abstract class CC {
        public static void $default$onCompleteEnterToPip(IPipActivityListener iPipActivityListener) {
        }

        public static void $default$onCompleteExitFromPip(IPipActivityListener iPipActivityListener, boolean z) {
        }

        public static void $default$onStartEnterToPip(IPipActivityListener iPipActivityListener) {
        }

        public static void $default$onStartExitFromPip(IPipActivityListener iPipActivityListener, boolean z) {
        }
    }

    void onCompleteEnterToPip();

    void onCompleteExitFromPip(boolean z);

    void onStartEnterToPip();

    void onStartExitFromPip(boolean z);
}
