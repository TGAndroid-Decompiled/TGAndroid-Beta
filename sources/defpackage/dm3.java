package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public final class dm3 {
    public static final cm3 c = new cm3(null, 0, null, true);
    public final int a;
    public int b = -1;

    public dm3(int i) {
        this.a = i;
        try {
            uc7.s1(i).Q1().b();
        } catch (Exception unused) {
        }
    }

    public final void a(cm3 cm3Var, String str, bm3 bm3Var) {
        b();
        boolean z = cm3Var.d;
        TL_aicompose.AiComposeTone aiComposeTone = cm3Var.c;
        if (!z && aiComposeTone == null && cm3Var.e == null) {
            hl.c3(new zg3(bm3Var, (byte) 14));
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        tL_messages_composeMessageWithAI.text = tL_textWithEntities;
        String str2 = cm3Var.e;
        if (str2 != null) {
            tL_messages_composeMessageWithAI.translate_to_lang = str2;
        } else if (cm3Var.d) {
            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault("voice");
        } else {
            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
        }
        boolean[] zArr = new boolean[1];
        hl.d3(new cv2(this, zArr, bm3Var, (byte) 10), 25000L);
        this.b = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_composeMessageWithAI, new ic((byte) 0), new am3(this, zArr, currentTimeMillis, bm3Var));
    }

    public final void b() {
        if (this.b >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.b, true);
            this.b = -1;
        }
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = uc7.s1(this.a).Q1().b;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
            if (aiComposeTone != null && !TextUtils.isEmpty(aiComposeTone.title)) {
                arrayList.add(new cm3(aiComposeTone.title, aiComposeTone.emoji_id, aiComposeTone, false));
            }
        }
        return arrayList;
    }
}
