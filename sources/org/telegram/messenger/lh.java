package org.telegram.messenger;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.c90;
public final class lh implements ri, cs {
    public final f1 f16737a;
    public final Object f16738b;
    public final Object f16739c;
    public final Object d;

    public lh(f1 f1Var, Object obj, Object obj2, Object obj3) {
        this.f16737a = f1Var;
        this.f16738b = obj;
        this.f16739c = obj2;
        this.d = obj3;
    }

    @Override
    public void c(String str, ArrayList arrayList) {
        ui uiVar = (ui) this.f16737a;
        si siVar = (si) this.f16738b;
        ti tiVar = (ti) this.f16739c;
        q20 q20Var = (q20) this.d;
        HashMap hashMap = uiVar.P1;
        if (!hashMap.containsKey(siVar)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i10 = 0;
        int i11 = 0;
        while (i11 < size) {
            Object obj = arrayList.get(i11);
            i11++;
            qi qiVar = (qi) obj;
            if (!TextUtils.isEmpty(qiVar.f17590a) && !qiVar.f17590a.startsWith("animated_")) {
                sb2.append(qiVar.f17590a);
            }
        }
        TLRPC.TL_messages_searchStickers tL_messages_searchStickers = new TLRPC.TL_messages_searchStickers();
        boolean z10 = siVar.f17915a;
        String str2 = siVar.f17916b;
        tL_messages_searchStickers.emojis = z10;
        if (!TextUtils.isEmpty(str2)) {
            tL_messages_searchStickers.lang_code.add(str2);
        }
        tL_messages_searchStickers.emoticon = sb2.toString();
        tL_messages_searchStickers.f19908q = siVar.f17917c;
        tL_messages_searchStickers.limit = 100;
        if (tiVar != null) {
            i10 = tiVar.f18065b.intValue();
        }
        tL_messages_searchStickers.offset = i10;
        hashMap.put(siVar, Integer.valueOf(uiVar.getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new a3.b(1), new n9(uiVar, siVar, tiVar, q20Var, 1))));
    }

    @Override
    public void run(long j10) {
        qz qzVar = (qz) this.f16737a;
        Uri uri = (Uri) this.f16738b;
        ArrayList arrayList = (ArrayList) this.f16739c;
        c90 c90Var = (c90) this.d;
        if (j10 != 0) {
            qzVar.Q(-j10, uri, arrayList, c90Var);
        } else {
            c90Var.run(0L);
        }
    }
}
