package defpackage;

import android.content.SharedPreferences;
public final class fyb implements Runnable {
    public final byte a;
    public final qyb b;

    public fyb(qyb qybVar, byte b) {
        this.a = b;
        this.b = qybVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qyb qybVar = this.b;
        switch (b) {
            case 0:
                jn7 f = jn7.f(qybVar.currentAccount);
                int i = uc7.s5;
                f.k(2, 512);
                return;
            default:
                qybVar.a.b();
                qybVar.b.b();
                qybVar.d.clear();
                SharedPreferences.Editor edit = qybVar.getUserConfig().j().edit();
                for (String str : qybVar.getUserConfig().j().getAll().keySet()) {
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
