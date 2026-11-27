package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
public final class zl6 implements Runnable {
    public final byte a;
    public final em6 b;

    public zl6(em6 em6Var, byte b) {
        this.a = b;
        this.b = em6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        em6 em6Var = this.b;
        switch (b) {
            case 0:
                em6Var.a0();
                return;
            default:
                Activity parentActivity = em6Var.getParentActivity();
                Activity parentActivity2 = em6Var.getParentActivity();
                uo3 uo3Var = yca.m;
                boolean z = parentActivity2.getSharedPreferences("shapedetector_conf", 0).getBoolean("learning", false);
                SharedPreferences.Editor edit = parentActivity.getSharedPreferences("shapedetector_conf", 0).edit();
                if (z) {
                    edit.clear();
                } else {
                    edit.putBoolean("learning", true);
                }
                edit.apply();
                return;
        }
    }
}
