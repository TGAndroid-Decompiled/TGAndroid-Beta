package defpackage;

import android.app.Activity;
import android.content.SharedPreferences;
public final class uj6 implements Runnable {
    public final byte a;
    public final zj6 b;

    public uj6(zj6 zj6Var, byte b) {
        this.a = b;
        this.b = zj6Var;
    }

    @Override
    public final void run() {
        byte b = this.a;
        zj6 zj6Var = this.b;
        switch (b) {
            case 0:
                zj6Var.a0();
                return;
            default:
                Activity parentActivity = zj6Var.getParentActivity();
                Activity parentActivity2 = zj6Var.getParentActivity();
                do3 do3Var = h9a.m;
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
