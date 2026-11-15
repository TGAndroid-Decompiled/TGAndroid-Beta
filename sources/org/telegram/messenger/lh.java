package org.telegram.messenger;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.a80;
public final class lh implements pi, qr {
    public final c1 f24835a;
    public final Object f24836b;
    public final Object f24837c;
    public final Object d;

    public lh(c1 c1Var, Object obj, Object obj2, Object obj3) {
        this.f24835a = c1Var;
        this.f24836b = obj;
        this.f24837c = obj2;
        this.d = obj3;
    }

    @Override
    public void c(String str, ArrayList arrayList) {
        si siVar = (si) this.f24835a;
        qi qiVar = (qi) this.f24836b;
        ri riVar = (ri) this.f24837c;
        z10 z10Var = (z10) this.d;
        HashMap hashMap = siVar.Q1;
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
            if (!TextUtils.isEmpty(oiVar.f25765a) && !oiVar.f25765a.startsWith("animated_")) {
                sb2.append(oiVar.f25765a);
            }
        }
        TLRPC.TL_messages_searchStickers tL_messages_searchStickers = new TLRPC.TL_messages_searchStickers();
        boolean z10 = qiVar.f26098a;
        String str2 = qiVar.f26099b;
        tL_messages_searchStickers.emojis = z10;
        if (!TextUtils.isEmpty(str2)) {
            tL_messages_searchStickers.lang_code.add(str2);
        }
        tL_messages_searchStickers.emoticon = sb2.toString();
        tL_messages_searchStickers.f28166q = qiVar.f26100c;
        tL_messages_searchStickers.limit = 100;
        if (riVar != null) {
            i7 = riVar.f26304b.intValue();
        }
        tL_messages_searchStickers.offset = i7;
        hashMap.put(qiVar, Integer.valueOf(siVar.getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new d3.b(1), new l9(siVar, qiVar, riVar, z10Var, 1))));
    }

    @Override
    public void run(long j3) {
        ez ezVar = (ez) this.f24835a;
        Uri uri = (Uri) this.f24836b;
        ArrayList arrayList = (ArrayList) this.f24837c;
        a80 a80Var = (a80) this.d;
        if (j3 != 0) {
            ezVar.Q(-j3, uri, arrayList, a80Var);
        } else {
            a80Var.run(0L);
        }
    }
}
