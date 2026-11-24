package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public final class ll3 {
    public static final kl3 c = new kl3(null, 0, null, true);
    public final int a;
    public int b = -1;

    public ll3(int i) {
        this.a = i;
        try {
            na7.q1(i).O1().b();
        } catch (Exception unused) {
        }
    }

    public final void a(kl3 kl3Var, String str, jl3 jl3Var) {
        b();
        boolean z = kl3Var.d;
        TL_aicompose.AiComposeTone aiComposeTone = kl3Var.c;
        if (!z && aiComposeTone == null) {
            gl.d3(new li3(jl3Var, (byte) 8));
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        tL_messages_composeMessageWithAI.text = tL_textWithEntities;
        if (kl3Var.d) {
            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault("voice");
        } else {
            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
        }
        boolean[] zArr = new boolean[1];
        gl.e3(new mg3(this, zArr, jl3Var, (byte) 6), 25000L);
        this.b = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_composeMessageWithAI, new hc((byte) 0), new il3(this, zArr, currentTimeMillis, jl3Var));
    }

    public final void b() {
        if (this.b >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.b, true);
            this.b = -1;
        }
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = na7.q1(this.a).O1().b;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
            if (aiComposeTone != null && !TextUtils.isEmpty(aiComposeTone.title)) {
                arrayList.add(new kl3(aiComposeTone.title, aiComposeTone.emoji_id, aiComposeTone, false));
            }
        }
        return arrayList;
    }
}
