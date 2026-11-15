package ai;

import android.text.TextUtils;
import android.util.Log;
import java.util.ArrayList;
import java.util.Locale;
import org.telegram.messenger.np;
import org.telegram.messenger.s10;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public final class i {
    public static final h f1241c = new h("Enhance", null, 0, null, true);
    public static final String[][] d = {new String[]{"Zen", "🧘"}, new String[]{"Corp", "💼"}, new String[]{"Viking", "⚔️"}, new String[]{"Short", "🎯"}, new String[]{"Tribal", "🥁"}, new String[]{"Biblical", "📜"}, new String[]{"Formal", "🤝"}};
    public static boolean f1242e;
    public final int f1243a;
    public int f1244b = -1;

    public i(int i7) {
        this.f1243a = i7;
        try {
            np.s1(i7).R1().b();
        } catch (Exception unused) {
        }
    }

    public static void c(h hVar, String str, g gVar, long j3) {
        String lowerCase;
        String str2;
        String str3;
        int indexOf;
        if (hVar.f1219e) {
            lowerCase = "enhance";
        } else {
            lowerCase = hVar.f1216a.toLowerCase(Locale.ROOT);
        }
        String trim = str.trim();
        if (!trim.isEmpty()) {
            if (lowerCase.contains("short")) {
                String[] split = trim.split("(?<=[.!?])\\s+");
                StringBuilder sb2 = new StringBuilder();
                for (String str4 : split) {
                    String trim2 = str4.replaceAll("(?i)\\b(really|just|actually|basically|guys|I think|so)\\b,?\\s*", "").trim();
                    if (trim2.indexOf(", ") > 12) {
                        trim2 = trim2.substring(0, indexOf) + trim2.charAt(trim2.length() - 1);
                    }
                    if (!trim2.isEmpty()) {
                        if (sb2.length() > 0) {
                            sb2.append(' ');
                        }
                        sb2.append(Character.toUpperCase(trim2.charAt(0)));
                        sb2.append(trim2.substring(1));
                    }
                }
                if (sb2.length() != 0) {
                    trim = sb2.toString();
                }
            } else {
                trim = (" " + trim + " ").replace(" Hey guys, how are you?", " Hello everyone, I hope you are all doing well.").replace(" Hey guys", " Hello everyone").replace("What do you think about", "What are your thoughts on").replace(" I think ", " In my opinion, ").replace("looks really nice now,", "now looks truly polished,").replace("looks really nice", "now looks truly polished").replace("let's", "so let us").replace("ship it", "release it").replace(" gonna ", " going to ").replace(" wanna ", " want to ").replace(" i ", " I ").trim();
                if (!trim.isEmpty()) {
                    trim = Character.toUpperCase(trim.charAt(0)) + trim.substring(1);
                    char charAt = trim.charAt(trim.length() - 1);
                    if (charAt != '.' && charAt != '!' && charAt != '?') {
                        trim = trim.concat(".");
                    }
                }
                if (!lowerCase.contains("enhance")) {
                    if (lowerCase.contains("formal")) {
                        str2 = "Dear all,\n\n";
                        str3 = "\n\nKind regards.";
                    } else if (lowerCase.contains("zen")) {
                        StringBuilder sb3 = new StringBuilder("Breathe in. ");
                        if (!trim.isEmpty()) {
                            trim = Character.toLowerCase(trim.charAt(0)) + trim.substring(1);
                        }
                        sb3.append(trim.replace("!", "."));
                        sb3.append(" No rush — all in good time. 🍃");
                        trim = sb3.toString();
                    } else if (lowerCase.contains("corp")) {
                        str2 = "Quick sync: ";
                        str3 = " Let's align on next steps and circle back by EOD. 📈";
                    } else if (lowerCase.contains("viking")) {
                        trim = "Hail, shield-brothers! " + trim.replace("everyone", "warriors").replace("release it", "sail it to glory") + " Skål! ⚔️";
                    } else if (lowerCase.contains("tribal")) {
                        str2 = "Hear me, my tribe! ";
                        str3 = " The drums have spoken. 🥁";
                    } else if (lowerCase.contains("biblical")) {
                        trim = "Behold, brethren: " + trim.replace("I hope you are all doing well", "peace be upon you") + " And it was good.";
                    }
                    trim = a8.p0.p(str2, trim, str3);
                }
            }
        }
        org.telegram.messenger.g0.i3(new a1.e(11, gVar, trim), Math.max(0L, 1300 - (System.currentTimeMillis() - j3)));
    }

    public final void a(final h hVar, final String str, final g gVar) {
        b();
        final long currentTimeMillis = System.currentTimeMillis();
        if (!f1242e) {
            boolean z10 = hVar.f1219e;
            TL_aicompose.AiComposeTone aiComposeTone = hVar.d;
            if (z10 || aiComposeTone != null) {
                TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
                TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
                tL_textWithEntities.text = str;
                tL_messages_composeMessageWithAI.text = tL_textWithEntities;
                if (hVar.f1219e) {
                    tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault("voice");
                } else {
                    tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
                }
                final boolean[] zArr = new boolean[1];
                org.telegram.messenger.g0.i3(new e(this, zArr, hVar, str, gVar, currentTimeMillis, 0), 25000L);
                this.f1244b = ConnectionsManager.getInstance(this.f1243a).sendRequestTyped(tL_messages_composeMessageWithAI, new d3.b(1), new s10() {
                    @Override
                    public final void a(Object obj, Object obj2) {
                        String str2;
                        String str3;
                        TLRPC.TL_textWithEntities tL_textWithEntities2;
                        TLRPC.TL_composedMessageWithAI tL_composedMessageWithAI = (TLRPC.TL_composedMessageWithAI) obj;
                        TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                        i.this.f1244b = -1;
                        boolean[] zArr2 = zArr;
                        if (zArr2[0]) {
                            return;
                        }
                        zArr2[0] = true;
                        h hVar2 = hVar;
                        long j3 = currentTimeMillis;
                        g gVar2 = gVar;
                        if (tL_composedMessageWithAI != null && (tL_textWithEntities2 = tL_composedMessageWithAI.result_text) != null && !TextUtils.isEmpty(tL_textWithEntities2.text)) {
                            Log.d("Dictation", "AI server ok: " + hVar2.f1216a);
                            org.telegram.messenger.g0.i3(new a1.e(10, gVar2, tL_composedMessageWithAI), Math.max(0L, 900 - (System.currentTimeMillis() - j3)));
                            return;
                        }
                        StringBuilder sb2 = new StringBuilder("AI server failed: ");
                        if (tL_error != null) {
                            str2 = tL_error.text;
                        } else {
                            str2 = "null";
                        }
                        sb2.append(str2);
                        sb2.append(" → mock");
                        Log.d("Dictation", sb2.toString());
                        if (tL_error != null && (str3 = tL_error.text) != null && (str3.contains("PREMIUM") || tL_error.text.contains("FLOOD") || tL_error.text.contains("METHOD_INVALID"))) {
                            i.f1242e = true;
                        }
                        i.c(hVar2, str, gVar2, j3);
                    }
                });
                return;
            }
        }
        c(hVar, str, gVar, currentTimeMillis);
    }

    public final void b() {
        if (this.f1244b >= 0) {
            ConnectionsManager.getInstance(this.f1243a).cancelRequest(this.f1244b, true);
            this.f1244b = -1;
        }
    }

    public final ArrayList d() {
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.e R1 = np.s1(this.f1243a).R1();
        if (R1 != null) {
            ArrayList arrayList2 = R1.f23218b;
            if (!arrayList2.isEmpty()) {
                int size = arrayList2.size();
                int i7 = 0;
                while (i7 < size) {
                    Object obj = arrayList2.get(i7);
                    i7++;
                    TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                    if (aiComposeTone != null && !TextUtils.isEmpty(aiComposeTone.title)) {
                        arrayList.add(new h(aiComposeTone.title, null, aiComposeTone.emoji_id, aiComposeTone, false));
                    }
                }
                Log.d("Dictation", "styles from server tones: " + arrayList.size());
            }
        }
        if (arrayList.isEmpty()) {
            for (int i10 = 0; i10 < 7; i10++) {
                String[] strArr = d[i10];
                arrayList.add(new h(strArr[0], strArr[1], 0L, null, false));
            }
        }
        return arrayList;
    }
}
