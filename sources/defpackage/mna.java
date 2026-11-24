package defpackage;

import android.view.View;
public final class mna implements View.OnClickListener {
    public final byte a;
    public final vqa b;
    public final int c;

    public mna(vqa vqaVar, int i, byte b) {
        this.a = b;
        this.b = vqaVar;
        this.c = i;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        int i = -1;
        int i2 = this.c;
        vqa vqaVar = this.b;
        switch (b) {
            case 0:
                vqaVar.P2 = i2;
                fpa fpaVar = vqaVar.U1;
                int currentPosition = fpaVar.getCurrentPosition();
                if (i2 > vqaVar.w1()) {
                    i = 1;
                }
                fpaVar.E(currentPosition + i);
                return;
            case 1:
                vqaVar.P2 = i2;
                fpa fpaVar2 = vqaVar.U1;
                int currentPosition2 = fpaVar2.getCurrentPosition();
                if (i2 > vqaVar.w1()) {
                    i = 1;
                }
                fpaVar2.E(currentPosition2 + i);
                return;
            case 2:
                vqaVar.P2 = i2;
                fpa fpaVar3 = vqaVar.U1;
                int currentPosition3 = fpaVar3.getCurrentPosition();
                if (i2 > vqaVar.w1()) {
                    i = 1;
                }
                fpaVar3.E(currentPosition3 + i);
                return;
            default:
                vqaVar.P2 = i2;
                fpa fpaVar4 = vqaVar.U1;
                int currentPosition4 = fpaVar4.getCurrentPosition();
                if (i2 > vqaVar.w1()) {
                    i = 1;
                }
                fpaVar4.E(currentPosition4 + i);
                return;
        }
    }
}
