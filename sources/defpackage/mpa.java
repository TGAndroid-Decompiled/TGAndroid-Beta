package defpackage;

import android.view.View;
public final class mpa implements View.OnClickListener {
    public final byte a;
    public final wsa b;
    public final int c;

    public mpa(wsa wsaVar, int i, byte b) {
        this.a = b;
        this.b = wsaVar;
        this.c = i;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        int i = -1;
        int i2 = this.c;
        wsa wsaVar = this.b;
        switch (b) {
            case 0:
                wsaVar.P2 = i2;
                fra fraVar = wsaVar.U1;
                int currentPosition = fraVar.getCurrentPosition();
                if (i2 > wsaVar.w1()) {
                    i = 1;
                }
                fraVar.E(currentPosition + i);
                return;
            case 1:
                wsaVar.P2 = i2;
                fra fraVar2 = wsaVar.U1;
                int currentPosition2 = fraVar2.getCurrentPosition();
                if (i2 > wsaVar.w1()) {
                    i = 1;
                }
                fraVar2.E(currentPosition2 + i);
                return;
            case 2:
                wsaVar.P2 = i2;
                fra fraVar3 = wsaVar.U1;
                int currentPosition3 = fraVar3.getCurrentPosition();
                if (i2 > wsaVar.w1()) {
                    i = 1;
                }
                fraVar3.E(currentPosition3 + i);
                return;
            default:
                wsaVar.P2 = i2;
                fra fraVar4 = wsaVar.U1;
                int currentPosition4 = fraVar4.getCurrentPosition();
                if (i2 > wsaVar.w1()) {
                    i = 1;
                }
                fraVar4.E(currentPosition4 + i);
                return;
        }
    }
}
