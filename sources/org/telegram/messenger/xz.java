package org.telegram.messenger;

import android.content.SharedPreferences;
public final class xz implements Runnable {
    public final int f26498a;
    public final c00 f26499b;

    public xz(c00 c00Var, int i3) {
        this.f26498a = i3;
        this.f26499b = c00Var;
    }

    @Override
    public final void run() {
        int i3 = this.f26498a;
        c00 c00Var = this.f26499b;
        switch (i3) {
            case 0:
                hs f10 = hs.f(c00Var.currentAccount);
                int i10 = hp.C8;
                f10.k(2, 512);
                return;
            default:
                c00Var.f21922a.b();
                c00Var.f21923b.b();
                c00Var.d.clear();
                SharedPreferences.Editor edit = c00Var.getUserConfig().k().edit();
                for (String str : c00Var.getUserConfig().k().getAll().keySet()) {
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
