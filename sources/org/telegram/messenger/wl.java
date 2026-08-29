package org.telegram.messenger;
public final class wl implements Runnable {
    public final int f22125a;
    public final WebProxyTransport f22126b;

    public wl(WebProxyTransport webProxyTransport, int i10) {
        this.f22125a = i10;
        this.f22126b = webProxyTransport;
    }

    @Override
    public final void run() {
        switch (this.f22125a) {
            case 0:
                WebProxyTransport.e(this.f22126b);
                return;
            case 1:
                WebProxyTransport.f(this.f22126b);
                return;
            case 2:
                WebProxyTransport.i(this.f22126b);
                return;
            case 3:
                WebProxyTransport.g(this.f22126b);
                return;
            default:
                WebProxyTransport.c(this.f22126b);
                return;
        }
    }
}
