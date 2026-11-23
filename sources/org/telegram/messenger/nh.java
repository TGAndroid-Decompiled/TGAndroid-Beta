package org.telegram.messenger;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.d80;
public final class nh implements pi, pr {
    public final c1 f25728a;
    public final Object f25729b;
    public final Object f25730c;
    public final Object d;

    public nh(c1 c1Var, Object obj, Object obj2, Object obj3) {
        this.f25728a = c1Var;
        this.f25729b = obj;
        this.f25730c = obj2;
        this.d = obj3;
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        si siVar = (si) this.f25728a;
        qi qiVar = (qi) this.f25729b;
        ri riVar = (ri) this.f25730c;
        y10 y10Var = (y10) this.d;
        HashMap hashMap = siVar.S1;
        if (!hashMap.containsKey(qiVar)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            oi oiVar = (oi) obj;
            if (!TextUtils.isEmpty(oiVar.f26090a) && !oiVar.f26090a.startsWith("animated_")) {
                sb2.append(oiVar.f26090a);
            }
        }
        TLRPC.TL_messages_searchStickers tL_messages_searchStickers = new TLRPC.TL_messages_searchStickers();
        boolean z10 = qiVar.f26424a;
        String str2 = qiVar.f26425b;
        tL_messages_searchStickers.emojis = z10;
        if (!TextUtils.isEmpty(str2)) {
            tL_messages_searchStickers.lang_code.add(str2);
        }
        tL_messages_searchStickers.emoticon = sb2.toString();
        tL_messages_searchStickers.f28513q = qiVar.f26426c;
        tL_messages_searchStickers.limit = 100;
        if (riVar != null) {
            i7 = riVar.f26583b.intValue();
        }
        tL_messages_searchStickers.offset = i7;
        hashMap.put(qiVar, Integer.valueOf(siVar.getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new d3.b(1), new l9(siVar, qiVar, riVar, y10Var, 1))));
    }

    @Override
    public void run(long j3) {
        az azVar = (az) this.f25728a;
        Uri uri = (Uri) this.f25729b;
        ArrayList arrayList = (ArrayList) this.f25730c;
        d80 d80Var = (d80) this.d;
        if (j3 != 0) {
            azVar.Q(-j3, uri, arrayList, d80Var);
        } else {
            d80Var.run(0L);
        }
    }
}
