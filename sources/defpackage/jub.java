package defpackage;

import android.content.SharedPreferences;
public final class jub implements Runnable {
    public final byte a;
    public final pub b;

    public jub(pub pubVar, byte b) {
        this.a = b;
        this.b = pubVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        pub pubVar = this.b;
        switch (b) {
            case 0:
                kk7 f = kk7.f(pubVar.currentAccount);
                int i = na7.q5;
                f.k(2, 512);
                return;
            default:
                pubVar.a.b();
                pubVar.b.b();
                pubVar.d.clear();
                SharedPreferences.Editor edit = pubVar.getUserConfig().j().edit();
                for (String str : pubVar.getUserConfig().j().getAll().keySet()) {
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
