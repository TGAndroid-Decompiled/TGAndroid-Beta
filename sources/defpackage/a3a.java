package defpackage;
public final class a3a implements Runnable {
    public final byte a;
    public final j3a b;

    public a3a(j3a j3aVar, byte b) {
        this.a = b;
        this.b = j3aVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        j3a j3aVar = this.b;
        switch (b) {
            case 0:
                j3aVar.a1(false);
                return;
            case 1:
                j3aVar.a1(true);
                return;
            case 2:
                wsa wsaVar = new wsa(j3aVar.getContext(), j3aVar.T1, j3aVar.U1, j3aVar.J0, null);
                long j = j3aVar.X1.id;
                String str = j3aVar.a2;
                wsaVar.l3 = true;
                jva.v(wsaVar.a, false).H(j, new ts9(wsaVar, str, (byte) 9));
                return;
            case 3:
                e00.b1(j3aVar.J0, j3aVar.getContext(), j3aVar.X1);
                return;
            case 4:
                new exa(j3aVar.getContext(), j3aVar.J0).show();
                return;
            default:
                j3aVar.dismiss();
                return;
        }
    }
}
