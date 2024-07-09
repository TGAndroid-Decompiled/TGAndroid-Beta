package org.telegram.messenger;

import org.telegram.ui.Components.RLottieDrawable;

public class TONSitesProxy {
    private long ptr;

    public static native void resolve(long j, String str, String str2);

    public static native long start(String str);

    public static native void stop(long j);

    public TONSitesProxy() {
        this(RLottieDrawable.readRes(null, R.raw.ton_global_config));
    }

    public TONSitesProxy(String str) {
        this.ptr = start(str);
    }

    public void resolve(String str, String str2) {
        if (isDestroyed()) {
            return;
        }
        resolve(this.ptr, str, str2);
    }

    public void destroy() {
        stop(this.ptr);
        this.ptr = 0L;
    }

    public boolean isDestroyed() {
        return this.ptr != 0;
    }
}
