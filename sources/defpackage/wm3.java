package defpackage;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public final class wm3 {
    public static final vm3 c = new vm3(null, 0, null, true);
    public final int a;
    public int b = -1;

    public wm3(int i) {
        this.a = i;
        try {
            oc7.r1(i).P1().b();
        } catch (Exception unused) {
        }
    }

    public final void a(vm3 vm3Var, String str, um3 um3Var) {
        b();
        boolean z = vm3Var.d;
        TL_aicompose.AiComposeTone aiComposeTone = vm3Var.c;
        if (!z && aiComposeTone == null) {
            gm.c3(new bi3(um3Var, (byte) 13));
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        tL_messages_composeMessageWithAI.text = tL_textWithEntities;
        if (vm3Var.d) {
            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault("voice");
        } else {
            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
        }
        boolean[] zArr = new boolean[1];
        gm.d3(new pz2(this, zArr, um3Var, (byte) 8), 25000L);
        this.b = ConnectionsManager.getInstance(this.a).sendRequestTyped(tL_messages_composeMessageWithAI, new kc((byte) 0), new tm3(this, zArr, currentTimeMillis, um3Var));
    }

    public final void b() {
        if (this.b >= 0) {
            ConnectionsManager.getInstance(this.a).cancelRequest(this.b, true);
            this.b = -1;
        }
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = oc7.r1(this.a).P1().b;
        int size = arrayList2.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList2.get(i);
            i++;
            TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
            if (aiComposeTone != null && !TextUtils.isEmpty(aiComposeTone.title)) {
                arrayList.add(new vm3(aiComposeTone.title, aiComposeTone.emoji_id, aiComposeTone, false));
            }
        }
        return arrayList;
    }
}
