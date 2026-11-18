package org.telegram.messenger;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.d80;
public final class mh implements oi, or {
    public final c1 f25565a;
    public final Object f25566b;
    public final Object f25567c;
    public final Object d;

    public mh(c1 c1Var, Object obj, Object obj2, Object obj3) {
        this.f25565a = c1Var;
        this.f25566b = obj;
        this.f25567c = obj2;
        this.d = obj3;
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        ri riVar = (ri) this.f25565a;
        pi piVar = (pi) this.f25566b;
        qi qiVar = (qi) this.f25567c;
        x10 x10Var = (x10) this.d;
        HashMap hashMap = riVar.S1;
        if (!hashMap.containsKey(piVar)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            ni niVar = (ni) obj;
            if (!TextUtils.isEmpty(niVar.f25927a) && !niVar.f25927a.startsWith("animated_")) {
                sb2.append(niVar.f25927a);
            }
        }
        TLRPC.TL_messages_searchStickers tL_messages_searchStickers = new TLRPC.TL_messages_searchStickers();
        boolean z10 = piVar.f26251a;
        String str2 = piVar.f26252b;
        tL_messages_searchStickers.emojis = z10;
        if (!TextUtils.isEmpty(str2)) {
            tL_messages_searchStickers.lang_code.add(str2);
        }
        tL_messages_searchStickers.emoticon = sb2.toString();
        tL_messages_searchStickers.f28518q = piVar.f26253c;
        tL_messages_searchStickers.limit = 100;
        if (qiVar != null) {
            i7 = qiVar.f26408b.intValue();
        }
        tL_messages_searchStickers.offset = i7;
        hashMap.put(piVar, Integer.valueOf(riVar.getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new d3.b(1), new k9(riVar, piVar, qiVar, x10Var, 1))));
    }

    @Override
    public void run(long j3) {
        zy zyVar = (zy) this.f25565a;
        Uri uri = (Uri) this.f25566b;
        ArrayList arrayList = (ArrayList) this.f25567c;
        d80 d80Var = (d80) this.d;
        if (j3 != 0) {
            zyVar.Q(-j3, uri, arrayList, d80Var);
        } else {
            d80Var.run(0L);
        }
    }
}
