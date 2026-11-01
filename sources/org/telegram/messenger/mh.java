package org.telegram.messenger;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.b90;
public final class mh implements si, ds {
    public final f1 f17121a;
    public final Object f17122b;
    public final Object f17123c;
    public final Object d;

    public mh(f1 f1Var, Object obj, Object obj2, Object obj3) {
        this.f17121a = f1Var;
        this.f17122b = obj;
        this.f17123c = obj2;
        this.d = obj3;
    }

    @Override
    public void c(String str, ArrayList arrayList) {
        vi viVar = (vi) this.f17121a;
        ti tiVar = (ti) this.f17122b;
        ui uiVar = (ui) this.f17123c;
        r20 r20Var = (r20) this.d;
        HashMap hashMap = viVar.P1;
        if (!hashMap.containsKey(tiVar)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            ri riVar = (ri) obj;
            if (!TextUtils.isEmpty(riVar.f17936a) && !riVar.f17936a.startsWith("animated_")) {
                sb2.append(riVar.f17936a);
            }
        }
        TLRPC.TL_messages_searchStickers tL_messages_searchStickers = new TLRPC.TL_messages_searchStickers();
        boolean z10 = tiVar.f18266a;
        String str2 = tiVar.f18267b;
        tL_messages_searchStickers.emojis = z10;
        if (!TextUtils.isEmpty(str2)) {
            tL_messages_searchStickers.lang_code.add(str2);
        }
        tL_messages_searchStickers.emoticon = sb2.toString();
        tL_messages_searchStickers.f19909q = tiVar.f18268c;
        tL_messages_searchStickers.limit = 100;
        if (uiVar != null) {
            i10 = uiVar.f18434b.intValue();
        }
        tL_messages_searchStickers.offset = i10;
        hashMap.put(tiVar, Integer.valueOf(viVar.getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new a3.b(1), new o9(viVar, tiVar, uiVar, r20Var, 1))));
    }

    @Override
    public void run(long j10) {
        rz rzVar = (rz) this.f17121a;
        Uri uri = (Uri) this.f17122b;
        ArrayList arrayList = (ArrayList) this.f17123c;
        b90 b90Var = (b90) this.d;
        if (j10 != 0) {
            rzVar.Q(-j10, uri, arrayList, b90Var);
        } else {
            b90Var.run(0L);
        }
    }
}
