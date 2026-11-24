package defpackage;

import android.content.SharedPreferences;
public final class b96 implements Runnable {
    public final byte a;
    public final k96 b;
    public final String c;
    public final ex5 d;

    public b96(k96 k96Var, String str, ex5 ex5Var, byte b) {
        this.a = b;
        this.b = k96Var;
        this.c = str;
        this.d = ex5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ex5 ex5Var = this.d;
        String str = this.c;
        k96 k96Var = this.b;
        switch (b) {
            case 0:
                gl.c3(new b96(k96Var, str, ex5Var, (byte) 1));
                return;
            default:
                SharedPreferences.Editor edit = na7.c1().edit();
                edit.putBoolean("langpack_patched" + str, true).apply();
                ex5Var.run();
                k96Var.Q = false;
                return;
        }
    }
}
