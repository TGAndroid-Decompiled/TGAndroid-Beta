package defpackage;
public final class yna implements ed {
    public final byte a;
    public final vqa b;

    public yna(vqa vqaVar, byte b) {
        this.a = b;
        this.b = vqaVar;
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        vqa vqaVar = this.b;
        switch (b) {
            case 0:
                vqaVar.X1();
                return;
            case 1:
                hmc.L0(vqaVar.a, vqaVar.J0, vqaVar.getContext());
                return;
            default:
                vqaVar.X1();
                return;
        }
    }
}
