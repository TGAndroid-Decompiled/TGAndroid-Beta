package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
public final class xl6 implements Runnable {
    public final byte a;
    public final cm6 b;

    public xl6(cm6 cm6Var, byte b) {
        this.a = b;
        this.b = cm6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        cm6 cm6Var = this.b;
        switch (b) {
            case 0:
                cm6Var.b0();
                return;
            default:
                Activity parentActivity = cm6Var.getParentActivity();
                Activity parentActivity2 = cm6Var.getParentActivity();
                np3 np3Var = hba.m;
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
