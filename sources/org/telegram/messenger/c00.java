package org.telegram.messenger;

import android.content.SharedPreferences;
public final class c00 implements Runnable {
    public final int f22784a;
    public final h00 f22785b;

    public c00(h00 h00Var, int i7) {
        this.f22784a = i7;
        this.f22785b = h00Var;
    }

    @Override
    public final void run() {
        int i7 = this.f22784a;
        h00 h00Var = this.f22785b;
        switch (i7) {
            case 0:
                ns f10 = ns.f(h00Var.currentAccount);
                int i10 = np.D8;
                f10.k(2, 512);
                return;
            default:
                h00Var.f24011a.b();
                h00Var.f24012b.b();
                h00Var.d.clear();
                SharedPreferences.Editor edit = h00Var.getUserConfig().k().edit();
                for (String str : h00Var.getUserConfig().k().getAll().keySet()) {
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
