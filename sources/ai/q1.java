package ai;

import android.os.SystemClock;
import android.util.Log;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public final class q1 implements Runnable {
    public final int f1418a;
    public final e2 f1419b;

    public q1(e2 e2Var, int i7) {
        this.f1418a = i7;
        this.f1419b = e2Var;
    }

    @Override
    public final void run() {
        switch (this.f1418a) {
            case 0:
                e2 e2Var = this.f1419b;
                e2Var.f1176i = true;
                e2Var.f(null);
                return;
            case 1:
                e2 e2Var2 = this.f1419b;
                e2Var2.getClass();
                Log.d("Dictation", "stop: no final within 1.6 s, keeping the partial");
                e2Var2.f1173g.g(e2Var2.f1179k, "stop-timeout");
                e2Var2.f(null);
                return;
            case 2:
                this.f1419b.f(null);
                return;
            case 3:
                e2 e2Var3 = this.f1419b;
                if (!e2Var3.f1178j && !e2Var3.f1176i && e2Var3.T && !e2Var3.S) {
                    String n10 = e2Var3.f1173g.n();
                    if (e2Var3.R < n10.length()) {
                        int i7 = e2Var3.R;
                        String substring = n10.substring(i7);
                        String trim = substring.trim();
                        if (trim.split("\\s+").length >= 2) {
                            int indexOf = substring.indexOf(trim);
                            String substring2 = substring.substring(0, indexOf);
                            String substring3 = substring.substring(trim.length() + indexOf);
                            TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
                            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                            tL_messages_composeMessageWithAI.text = tL_textWithEntities;
                            tL_textWithEntities.text = trim;
                            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault("voice");
                            e2Var3.S = true;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Log.d("Dictation", "clean (voice) " + trim.length() + " chars from " + i7 + ": " + k2.c(trim));
                            e2Var3.U = ConnectionsManager.getInstance(e2Var3.f1164b).sendRequestTyped(tL_messages_composeMessageWithAI, new d3.b(1), new s1(e2Var3, elapsedRealtime, substring, i7, substring2, substring3));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                this.f1419b.f(null);
                return;
            case 5:
                e2 e2Var4 = this.f1419b;
                if (!e2Var4.f1178j) {
                    e2Var4.f(null);
                    return;
                }
                return;
            default:
                this.f1419b.j(2, "I recorded it this morning on my way to the office.");
                return;
        }
    }
}
