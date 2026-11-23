package ai;

import android.text.TextUtils;
import java.util.ArrayList;
import org.telegram.messenger.np;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_aicompose;
public final class h {
    public static final g f1218c = new g(null, 0, null, true);
    public final int f1219a;
    public int f1220b = -1;

    public h(int i7) {
        this.f1219a = i7;
        try {
            np.u1(i7).T1().b();
        } catch (Exception unused) {
        }
    }

    public final void a(g gVar, String str, f fVar) {
        b();
        boolean z10 = gVar.d;
        TL_aicompose.AiComposeTone aiComposeTone = gVar.f1211c;
        if (!z10 && aiComposeTone == null) {
            org.telegram.messenger.g0.g3(new a3.f(fVar, 4));
            return;
        }
        long currentTimeMillis = System.currentTimeMillis();
        TLRPC.TL_messages_composeMessageWithAI tL_messages_composeMessageWithAI = new TLRPC.TL_messages_composeMessageWithAI();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_textWithEntities.text = str;
        tL_messages_composeMessageWithAI.text = tL_textWithEntities;
        if (gVar.d) {
            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.fromDefault("voice");
        } else {
            tL_messages_composeMessageWithAI.tone = TL_aicompose.InputAiComposeTone.from(aiComposeTone);
        }
        boolean[] zArr = new boolean[1];
        org.telegram.messenger.g0.h3(new aa.r(this, zArr, fVar, 2), 25000L);
        this.f1220b = ConnectionsManager.getInstance(this.f1219a).sendRequestTyped(tL_messages_composeMessageWithAI, new d3.b(1), new e(this, zArr, currentTimeMillis, fVar));
    }

    public final void b() {
        if (this.f1220b >= 0) {
            ConnectionsManager.getInstance(this.f1219a).cancelRequest(this.f1220b, true);
            this.f1220b = -1;
        }
    }

    public final ArrayList c() {
        ArrayList arrayList = new ArrayList();
        org.telegram.messenger.e T1 = np.u1(this.f1219a).T1();
        if (T1 != null) {
            ArrayList arrayList2 = T1.f23645b;
            int size = arrayList2.size();
            int i7 = 0;
            while (i7 < size) {
                Object obj = arrayList2.get(i7);
                i7++;
                TL_aicompose.AiComposeTone aiComposeTone = (TL_aicompose.AiComposeTone) obj;
                if (aiComposeTone != null && !TextUtils.isEmpty(aiComposeTone.title)) {
                    arrayList.add(new g(aiComposeTone.title, aiComposeTone.emoji_id, aiComposeTone, false));
                }
            }
        }
        return arrayList;
    }
}
