package defpackage;
public final class dvb implements Runnable {
    public final byte a;
    public final evb b;

    public dvb(evb evbVar, byte b) {
        this.a = b;
        this.b = evbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        evb evbVar = this.b;
        switch (b) {
            case 0:
                evbVar.F = null;
                if (evbVar.G != -1) {
                    evbVar.H.getNotificationCenter().j(evbVar.G);
                    evbVar.G = -1;
                    return;
                }
                return;
            default:
                evbVar.F = null;
                if (evbVar.G != -1) {
                    evbVar.H.getNotificationCenter().j(evbVar.G);
                    evbVar.G = -1;
                    return;
                }
                return;
        }
    }
}
