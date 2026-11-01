package org.telegram.messenger;

import android.content.SharedPreferences;
public final class t00 implements Runnable {
    public final int f18189a;
    public final y00 f18190b;

    public t00(y00 y00Var, int i10) {
        this.f18189a = i10;
        this.f18190b = y00Var;
    }

    @Override
    public final void run() {
        int i10 = this.f18189a;
        y00 y00Var = this.f18190b;
        switch (i10) {
            case 0:
                at f7 = at.f(y00Var.currentAccount);
                int i11 = wp.D8;
                f7.k(2, 512);
                return;
            default:
                y00Var.f19511a.b();
                y00Var.f19512b.b();
                y00Var.d.clear();
                SharedPreferences.Editor edit = y00Var.getUserConfig().k().edit();
                for (String str : y00Var.getUserConfig().k().getAll().keySet()) {
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
