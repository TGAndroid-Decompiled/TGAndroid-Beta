package org.telegram.messenger;

import android.content.SharedPreferences;
public final class s00 implements Runnable {
    public final int f17860a;
    public final x00 f17861b;

    public s00(x00 x00Var, int i10) {
        this.f17860a = i10;
        this.f17861b = x00Var;
    }

    @Override
    public final void run() {
        int i10 = this.f17860a;
        x00 x00Var = this.f17861b;
        switch (i10) {
            case 0:
                zs f7 = zs.f(x00Var.currentAccount);
                int i11 = vp.D8;
                f7.k(2, 512);
                return;
            default:
                x00Var.f19171a.b();
                x00Var.f19172b.b();
                x00Var.d.clear();
                SharedPreferences.Editor edit = x00Var.getUserConfig().k().edit();
                for (String str : x00Var.getUserConfig().k().getAll().keySet()) {
                    if (str.startsWith("topics_load_offset_message_id_")) {
                        edit.remove(str);
                    }
                    if (str.startsWith("topics_load_offset_date_")) {
                        edit.remove(str);
                    }
                    if (str.startsWith("topics_load_offset_topic_id_")) {
                        edit.remove(str);
                    }
                    if (str.startsWith("topics_end_reached_")) {
                        edit.remove(str);
                    }
                }
                edit.apply();
                return;
        }
    }
}
