package defpackage;
public final class h3b implements Runnable {
    public final byte a;
    public final i3b b;

    public h3b(i3b i3bVar, byte b) {
        this.a = b;
        this.b = i3bVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        i3b i3bVar = this.b;
        switch (b) {
            case 0:
                j3b j3bVar = i3bVar.v;
                j3bVar.s = 0;
                j3bVar.requestLayout();
                k3b k3bVar = j3bVar.K;
                k3bVar.L(k3bVar.getWidth(), k3bVar.getHeight());
                k3bVar.requestLayout();
                return;
            case 1:
                j3b j3bVar2 = i3bVar.v;
                j3bVar2.s = 0;
                j3bVar2.requestLayout();
                k3b k3bVar2 = j3bVar2.K;
                k3bVar2.L(k3bVar2.getWidth(), k3bVar2.getHeight());
                k3bVar2.requestLayout();
                return;
            case 2:
                i3bVar.v.post(new h3b(i3bVar, (byte) 3));
                return;
            default:
                i3bVar.v.y = true;
                return;
        }
    }
}
