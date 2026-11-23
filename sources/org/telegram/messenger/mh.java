package org.telegram.messenger;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.c80;
public final class mh implements oi, or {
    public final c1 f25660a;
    public final Object f25661b;
    public final Object f25662c;
    public final Object d;

    public mh(c1 c1Var, Object obj, Object obj2, Object obj3) {
        this.f25660a = c1Var;
        this.f25661b = obj;
        this.f25662c = obj2;
        this.d = obj3;
    }

    @Override
    public void c(String str, ArrayList arrayList) {
        ri riVar = (ri) this.f25660a;
        pi piVar = (pi) this.f25661b;
        qi qiVar = (qi) this.f25662c;
        w10 w10Var = (w10) this.d;
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
            if (!TextUtils.isEmpty(niVar.f26023a) && !niVar.f26023a.startsWith("animated_")) {
                sb2.append(niVar.f26023a);
            }
        }
        TLRPC.TL_messages_searchStickers tL_messages_searchStickers = new TLRPC.TL_messages_searchStickers();
        boolean z10 = piVar.f26345a;
        String str2 = piVar.f26346b;
        tL_messages_searchStickers.emojis = z10;
        if (!TextUtils.isEmpty(str2)) {
            tL_messages_searchStickers.lang_code.add(str2);
        }
        tL_messages_searchStickers.emoticon = sb2.toString();
        tL_messages_searchStickers.f28607q = piVar.f26347c;
        tL_messages_searchStickers.limit = 100;
        if (qiVar != null) {
            i7 = qiVar.f26520b.intValue();
        }
        tL_messages_searchStickers.offset = i7;
        hashMap.put(piVar, Integer.valueOf(riVar.getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new d3.b(1), new k9(riVar, piVar, qiVar, w10Var, 1))));
    }

    @Override
    public void run(long j3) {
        zy zyVar = (zy) this.f25660a;
        Uri uri = (Uri) this.f25661b;
        ArrayList arrayList = (ArrayList) this.f25662c;
        c80 c80Var = (c80) this.d;
        if (j3 != 0) {
            zyVar.Q(-j3, uri, arrayList, c80Var);
        } else {
            c80Var.run(0L);
        }
    }
}
