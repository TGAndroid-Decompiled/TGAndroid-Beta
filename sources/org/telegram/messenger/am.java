package org.telegram.messenger;
public final class am implements Runnable {
    public final int f16796a;
    public final WebProxyTransport f16797b;

    public am(WebProxyTransport webProxyTransport, int i10) {
        this.f16796a = i10;
        this.f16797b = webProxyTransport;
    }

    @Override
    public final void run() {
        switch (this.f16796a) {
            case 0:
                WebProxyTransport.e(this.f16797b);
                return;
            case 1:
                WebProxyTransport.f(this.f16797b);
                return;
            case 2:
                WebProxyTransport.i(this.f16797b);
                return;
            case 3:
                WebProxyTransport.g(this.f16797b);
                return;
            default:
                WebProxyTransport.c(this.f16797b);
                return;
        }
    }
}
