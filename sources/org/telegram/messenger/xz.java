package org.telegram.messenger;

import android.content.SharedPreferences;
public final class xz implements Runnable {
    public final int f28174a;
    public final d00 f28175b;

    public xz(d00 d00Var, int i7) {
        this.f28174a = i7;
        this.f28175b = d00Var;
    }

    @Override
    public final void run() {
        int i7 = this.f28174a;
        d00 d00Var = this.f28175b;
        switch (i7) {
            case 0:
                ks f10 = ks.f(d00Var.currentAccount);
                int i10 = mp.I8;
                f10.k(2, 512);
                return;
            default:
                d00Var.f23570a.b();
                d00Var.f23571b.b();
                d00Var.d.clear();
                SharedPreferences.Editor edit = d00Var.getUserConfig().k().edit();
                for (String str : d00Var.getUserConfig().k().getAll().keySet()) {
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
