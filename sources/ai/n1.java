package ai;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public final class n1 implements Runnable {
    public final int f1398a;
    public final b2 f1399b;

    public n1(b2 b2Var, int i7) {
        this.f1398a = i7;
        this.f1399b = b2Var;
    }

    @Override
    public final void run() {
        switch (this.f1398a) {
            case 0:
                b2 b2Var = this.f1399b;
                b2Var.f1144i = true;
                b2Var.f(null);
                return;
            case 1:
                b2 b2Var2 = this.f1399b;
                b2Var2.getClass();
                Log.d("Dictation", "stop: no final within 1.6 s, keeping the partial");
                b2Var2.f1141g.g(b2Var2.f1148k, "stop-timeout");
                b2Var2.f(null);
                return;
            case 2:
                this.f1399b.f(null);
                return;
            case 3:
                final b2 b2Var3 = this.f1399b;
                if (!b2Var3.f1146j && !b2Var3.f1144i && b2Var3.V && !b2Var3.U) {
                    String n10 = b2Var3.f1141g.n();
                    if (b2Var3.T < n10.length()) {
                        final int i7 = b2Var3.T;
                        final String substring = n10.substring(i7);
                        String trim = substring.trim();
                        if (trim.split("\\s+").length >= 2) {
                            int indexOf = substring.indexOf(trim);
                            final String substring2 = substring.substring(0, indexOf);
                            final String substring3 = substring.substring(trim.length() + indexOf);
                            TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
                            TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                            tL_messages_composeMessageWithAI.text = tL_textWithEntities;
                            tL_textWithEntities.text = trim;
                            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault("voice");
                            b2Var3.U = true;
                            final long elapsedRealtime = SystemClock.elapsedRealtime();
                            Log.d("Dictation", "clean (voice) " + trim.length() + " chars from " + i7 + ": \"" + h2.c(trim) + "\"");
                            b2Var3.W = ConnectionsManager.getInstance(b2Var3.f1132b).sendRequestTyped(tL_messages_composeMessageWithAI, new d3.b(1), new s10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    String str;
                                    TLRPC.TL_textWithEntities tL_textWithEntities2;
                                    TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                    b2 b2Var4 = b2.this;
                                    b2Var4.U = false;
                                    b2Var4.W = -1;
                                    if (!b2Var4.f1146j) {
                                        if (tL_composedMessageWithAI != null && (tL_textWithEntities2 = tL_composedMessageWithAI.result_text) != null && !TextUtils.isEmpty(tL_textWithEntities2.text)) {
                                            Log.d("Dictation", "clean done in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms: \"" + h2.c(tL_composedMessageWithAI.result_text.text) + "\"");
                                            String n11 = b2Var4.f1141g.n();
                                            String str2 = substring;
                                            int i10 = i7;
                                            if (!n11.startsWith(str2, i10)) {
                                                return;
                                            }
                                            ArrayList arrayList = b2Var4.S;
                                            StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(substring2);
                                            m10.append(tL_composedMessageWithAI.result_text.text.trim());
                                            m10.append(substring3);
                                            arrayList.add(new y1(i10, str2, m10.toString()));
                                            b2Var4.T = str2.length() + i10;
                                            b2Var4.e();
                                            return;
                                        }
                                        StringBuilder sb2 = new StringBuilder("clean failed: ");
                                        if (tL_error != null) {
                                            str = tL_error.text;
                                        } else {
                                            str = null;
                                        }
                                        r.b.t(sb2, str, "Dictation");
                                    }
                                }
                            });
                            return;
                        }
                        return;
                    }
                    return;
                }
                return;
            case 4:
                this.f1399b.f(null);
                return;
            case 5:
                b2 b2Var4 = this.f1399b;
                if (!b2Var4.f1146j) {
                    b2Var4.f(null);
                    return;
                }
                return;
            default:
                this.f1399b.j(2, "I recorded it this morning on my way to the office.");
                return;
        }
    }
}
