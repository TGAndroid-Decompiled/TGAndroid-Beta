package ai;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public final class o1 implements Runnable {
    public final int f1404a;
    public final c2 f1405b;

    public o1(c2 c2Var, int i7) {
        this.f1404a = i7;
        this.f1405b = c2Var;
    }

    @Override
    public final void run() {
        switch (this.f1404a) {
            case 0:
                c2 c2Var = this.f1405b;
                c2Var.f1151i = true;
                c2Var.f(null);
                return;
            case 1:
                c2 c2Var2 = this.f1405b;
                c2Var2.getClass();
                Log.d("Dictation", "stop: no final within 1.6 s, keeping the partial");
                c2Var2.f1148g.g(c2Var2.f1155k, "stop-timeout");
                c2Var2.f(null);
                return;
            case 2:
                this.f1405b.f(null);
                return;
            case 3:
                final c2 c2Var3 = this.f1405b;
                if (!c2Var3.f1153j && !c2Var3.f1151i && c2Var3.V && !c2Var3.U) {
                    String n10 = c2Var3.f1148g.n();
                    if (c2Var3.T < n10.length()) {
                        final int i7 = c2Var3.T;
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
                            c2Var3.U = true;
                            final long elapsedRealtime = SystemClock.elapsedRealtime();
                            Log.d("Dictation", "clean (voice) " + trim.length() + " chars from " + i7 + ": \"" + i2.c(trim) + "\"");
                            c2Var3.W = ConnectionsManager.getInstance(c2Var3.f1139b).sendRequestTyped(tL_messages_composeMessageWithAI, new d3.b(1), new s10() {
                                @Override
                                public final void a(Object obj, Object obj2) {
                                    String str;
                                    TLRPC.TL_textWithEntities tL_textWithEntities2;
                                    TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                                    c2 c2Var4 = c2.this;
                                    c2Var4.U = false;
                                    c2Var4.W = -1;
                                    if (!c2Var4.f1153j) {
                                        if (tL_composedMessageWithAI != null && (tL_textWithEntities2 = tL_composedMessageWithAI.result_text) != null && !TextUtils.isEmpty(tL_textWithEntities2.text)) {
                                            Log.d("Dictation", "clean done in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + " ms: \"" + i2.c(tL_composedMessageWithAI.result_text.text) + "\"");
                                            String n11 = c2Var4.f1148g.n();
                                            String str2 = substring;
                                            int i10 = i7;
                                            if (!n11.startsWith(str2, i10)) {
                                                return;
                                            }
                                            ArrayList arrayList = c2Var4.S;
                                            StringBuilder m10 = com.google.android.gms.internal.vision.e2.m(substring2);
                                            m10.append(tL_composedMessageWithAI.result_text.text.trim());
                                            m10.append(substring3);
                                            arrayList.add(new z1(i10, str2, m10.toString()));
                                            c2Var4.T = str2.length() + i10;
                                            c2Var4.e();
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
                this.f1405b.f(null);
                return;
            case 5:
                c2 c2Var4 = this.f1405b;
                if (!c2Var4.f1153j) {
                    c2Var4.f(null);
                    return;
                }
                return;
            default:
                this.f1405b.j(2, "I recorded it this morning on my way to the office.");
                return;
        }
    }
}
