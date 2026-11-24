package defpackage;

import android.content.SharedPreferences;
public final class ab6 implements Runnable {
    public final byte a;
    public final jb6 b;
    public final String c;
    public final ez5 d;

    public ab6(jb6 jb6Var, String str, ez5 ez5Var, byte b) {
        this.a = b;
        this.b = jb6Var;
        this.c = str;
        this.d = ez5Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        ez5 ez5Var = this.d;
        String str = this.c;
        jb6 jb6Var = this.b;
        switch (b) {
            case 0:
                gm.c3(new ab6(jb6Var, str, ez5Var, (byte) 1));
                return;
            default:
                SharedPreferences.Editor edit = oc7.d1().edit();
                edit.putBoolean("langpack_patched" + str, true).apply();
                ez5Var.run();
                jb6Var.Q = false;
                return;
        }
    }
}
