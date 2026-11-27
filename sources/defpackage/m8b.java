package defpackage;

import android.view.View;
public final class m8b implements View.OnClickListener {
    public final byte a;
    public final r8b b;

    public m8b(r8b r8bVar, byte b) {
        this.a = b;
        this.b = r8bVar;
    }

    @Override
    public final void onClick(View view) {
        byte b = this.a;
        r8b r8bVar = this.b;
        switch (b) {
            case 0:
                r8bVar.a1();
                return;
            default:
                r8bVar.d1();
                return;
        }
    }
}
