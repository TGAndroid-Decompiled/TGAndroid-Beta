package defpackage;

import android.content.SharedPreferences;
public final class kwb implements Runnable {
    public final byte a;
    public final qwb b;

    public kwb(qwb qwbVar, byte b) {
        this.a = b;
        this.b = qwbVar;
    }

    @Override
    public final void run() {
        byte b = this.a;
        qwb qwbVar = this.b;
        switch (b) {
            case 0:
                nm7 f = nm7.f(qwbVar.currentAccount);
                int i = oc7.s5;
                f.k(2, 512);
                return;
            default:
                qwbVar.a.b();
                qwbVar.b.b();
                qwbVar.d.clear();
                SharedPreferences.Editor edit = qwbVar.getUserConfig().j().edit();
                for (String str : qwbVar.getUserConfig().j().getAll().keySet()) {
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
