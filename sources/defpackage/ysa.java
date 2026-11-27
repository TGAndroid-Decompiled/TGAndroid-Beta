package defpackage;

import android.view.View;
public final class ysa implements View.OnClickListener {
    public final byte a;
    public final wua b;

    public ysa(wua wuaVar, byte b) {
        this.a = b;
        this.b = wuaVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        wua wuaVar = this.b;
        switch (b) {
            case 0:
                wuaVar.e2();
                return;
            case 1:
                wuaVar.onBackPressed();
                return;
            case 2:
                wuaVar.U1(false);
                return;
            case 3:
                wuaVar.g2();
                return;
            case 4:
                wuaVar.onBackPressed();
                return;
            default:
                wuaVar.Y1();
                return;
        }
    }
}
