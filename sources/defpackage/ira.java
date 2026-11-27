package defpackage;

import android.view.View;
public final class ira implements View.OnClickListener {
    public final byte a;
    public final wua b;
    public final int c;

    public ira(wua wuaVar, int i, byte b) {
        this.a = b;
        this.b = wuaVar;
        this.c = i;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        int i = -1;
        int i2 = this.c;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                wuaVar.P2 = i2;
                fta ftaVar = wuaVar.U1;
                int currentPosition = ftaVar.getCurrentPosition();
                if (i2 > wuaVar.x1()) {
                    i = 1;
                }
                ftaVar.F(currentPosition + i);
                return;
            case 1:
                wuaVar.P2 = i2;
                fta ftaVar2 = wuaVar.U1;
                int currentPosition2 = ftaVar2.getCurrentPosition();
                if (i2 > wuaVar.x1()) {
                    i = 1;
                }
                ftaVar2.F(currentPosition2 + i);
                return;
            case 2:
                wuaVar.P2 = i2;
                fta ftaVar3 = wuaVar.U1;
                int currentPosition3 = ftaVar3.getCurrentPosition();
                if (i2 > wuaVar.x1()) {
                    i = 1;
                }
                ftaVar3.F(currentPosition3 + i);
                return;
            default:
                wuaVar.P2 = i2;
                fta ftaVar4 = wuaVar.U1;
                int currentPosition4 = ftaVar4.getCurrentPosition();
                if (i2 > wuaVar.x1()) {
                    i = 1;
                }
                ftaVar4.F(currentPosition4 + i);
                return;
        }
    }
}
