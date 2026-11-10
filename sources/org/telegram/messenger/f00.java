package org.telegram.messenger;

import android.content.SharedPreferences;
public final class f00 implements Runnable {
    public final int f22342a;
    public final k00 f22343b;

    public f00(k00 k00Var, int i7) {
        this.f22342a = i7;
        this.f22343b = k00Var;
    }

    @Override
    public final void run() {
        int i7 = this.f22342a;
        k00 k00Var = this.f22343b;
        switch (i7) {
            case 0:
                qs f10 = qs.f(k00Var.currentAccount);
                int i10 = qp.C8;
                f10.k(2, 512);
                return;
            default:
                k00Var.f23644a.b();
                k00Var.f23645b.b();
                k00Var.d.clear();
                SharedPreferences.Editor edit = k00Var.getUserConfig().k().edit();
                for (String str : k00Var.getUserConfig().k().getAll().keySet()) {
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
