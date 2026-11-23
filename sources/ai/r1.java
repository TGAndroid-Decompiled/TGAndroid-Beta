package ai;

import android.os.SystemClock;
import android.util.Log;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public final class r1 implements Runnable {
    public final int f1435a;
    public final f2 f1436b;

    public r1(f2 f2Var, int i7) {
        this.f1435a = i7;
        this.f1436b = f2Var;
    }

    @Override
    public final void run() {
        switch (this.f1435a) {
            case 0:
                f2 f2Var = this.f1436b;
                f2Var.f1191i = true;
                f2Var.g(null);
                return;
            case 1:
                f2 f2Var2 = this.f1436b;
                f2Var2.getClass();
                Log.d("Dictation", "stop: no final within 1.6 s, keeping the partial");
                f2Var2.f1188g.g(f2Var2.f1194k, "stop-timeout");
                f2Var2.g(null);
                return;
            case 2:
                this.f1436b.g(null);
                return;
            case 3:
                f2 f2Var3 = this.f1436b;
                if (!f2Var3.f1193j && !f2Var3.f1191i && f2Var3.T && !f2Var3.S) {
                    String n10 = f2Var3.f1188g.n();
                    if (f2Var3.R < n10.length()) {
                        int i7 = f2Var3.R;
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
                            f2Var3.S = true;
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            Log.d("Dictation", "clean (voice) " + trim.length() + " chars from " + i7 + ": " + l2.c(trim));
                            f2Var3.U = ConnectionsManager.getInstance(f2Var3.f1179b).sendRequestTyped(tL_messages_composeMessageWithAI, new d3.b(1), new t1(f2Var3, elapsedRealtime, substring, i7, substring2, substring3));
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                this.f1436b.g(null);
                return;
            case 5:
                f2 f2Var4 = this.f1436b;
                if (!f2Var4.f1193j) {
                    f2Var4.g(null);
                    return;
                }
                return;
            default:
                this.f1436b.k(2, "I recorded it this morning on my way to the office.");
                return;
        }
    }
}
