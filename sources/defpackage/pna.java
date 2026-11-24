package defpackage;
public final class pna implements Runnable {
    public final byte a;
    public final vqa b;
    public final long c;

    public pna(vqa vqaVar, long j, byte b) {
        this.a = b;
        this.b = vqaVar;
        this.c = j;
    }

    @Override
    public final void run() {
        byte b = this.a;
        long j = this.c;
        vqa vqaVar = this.b;
        switch (b) {
            case 0:
                vqaVar.Y1(j);
                return;
            case 1:
                vqaVar.Y1(j);
                return;
            case 2:
                nna nnaVar = vqaVar.s3;
                vqaVar.z2(1, true, null);
                if (j > 0) {
                    gl.r(nnaVar);
                    gl.c3(nnaVar);
                    return;
                }
                return;
            case 3:
                vqaVar.Y1(j);
                return;
            case 4:
                vqaVar.Y1(j);
                return;
            case 5:
                vqaVar.U1(j);
                return;
            case 6:
                zua zuaVar = new zua(vqaVar.getContext(), vqaVar.J0, this.c, 10, null, new t7a(vqaVar, new boolean[]{false}, (byte) 19), 0L);
                zuaVar.setOnDismissListener(new qoa(vqaVar, (byte) 0));
                zuaVar.show();
                return;
            case 7:
                vqaVar.Y1(j);
                return;
            case 8:
                vqaVar.U1(j);
                return;
            case 9:
                vqaVar.Y1(j);
                return;
            case 10:
                vqaVar.U1(j);
                return;
            case 11:
                vqaVar.Y1(j);
                return;
            default:
                vqaVar.U1(j);
                return;
        }
    }
}
