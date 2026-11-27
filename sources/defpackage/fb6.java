package defpackage;

import android.content.SharedPreferences;
public final class fb6 implements Runnable {
    public final byte a;
    public final ob6 b;
    public final String c;
    public final jz5 d;

    public fb6(ob6 ob6Var, String str, jz5 jz5Var, byte b) {
        this.a = b;
        this.b = ob6Var;
        this.c = str;
        this.d = jz5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        jz5 jz5Var = this.d;
        String str = this.c;
        ob6 ob6Var = this.b;
        switch (b) {
            case 0:
                hl.c3(new fb6(ob6Var, str, jz5Var, (byte) 1));
                return;
            default:
                SharedPreferences.Editor edit = uc7.e1().edit();
                edit.putBoolean("langpack_patched" + str, true).apply();
                jz5Var.run();
                ob6Var.Q = false;
                return;
        }
    }
}
