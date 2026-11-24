package defpackage;
public final class y0a implements Runnable {
    public final byte a;
    public final h1a b;

    public y0a(h1a h1aVar, byte b) {
        this.a = b;
        this.b = h1aVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        h1a h1aVar = this.b;
        switch (b) {
            case 0:
                h1aVar.a1(false);
                return;
            case 1:
                h1aVar.a1(true);
                return;
            case 2:
                vqa vqaVar = new vqa(h1aVar.getContext(), h1aVar.T1, h1aVar.U1, h1aVar.J0, null);
                long j = h1aVar.X1.id;
                String str = h1aVar.a2;
                vqaVar.l3 = true;
                gta.v(vqaVar.a, false).H(j, new nu9(vqaVar, str, (byte) 8));
                return;
            case 3:
                ez.b1(h1aVar.J0, h1aVar.getContext(), h1aVar.X1);
                return;
            case 4:
                new ava(h1aVar.getContext(), h1aVar.J0).show();
                return;
            default:
                h1aVar.dismiss();
                return;
        }
    }
}
