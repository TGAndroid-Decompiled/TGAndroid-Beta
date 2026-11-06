package org.telegram.messenger;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.b80;
public final class nh implements ri, tr {
    public final c1 f24187a;
    public final Object f24188b;
    public final Object f24189c;
    public final Object d;

    public nh(c1 c1Var, Object obj, Object obj2, Object obj3) {
        this.f24187a = c1Var;
        this.f24188b = obj;
        this.f24189c = obj2;
        this.d = obj3;
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        ui uiVar = (ui) this.f24187a;
        si siVar = (si) this.f24188b;
        ti tiVar = (ti) this.f24189c;
        c20 c20Var = (c20) this.d;
        HashMap hashMap = uiVar.P1;
        if (!hashMap.containsKey(siVar)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i7 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            qi qiVar = (qi) obj;
            if (!TextUtils.isEmpty(qiVar.f24698a) && !qiVar.f24698a.startsWith("animated_")) {
                sb2.append(qiVar.f24698a);
            }
        }
        TLRPC.TL_messages_searchStickers tL_messages_searchStickers = new TLRPC.TL_messages_searchStickers();
        boolean z9 = siVar.f25474a;
        String str2 = siVar.f25475b;
        tL_messages_searchStickers.emojis = z9;
        if (!TextUtils.isEmpty(str2)) {
            tL_messages_searchStickers.lang_code.add(str2);
        }
        tL_messages_searchStickers.emoticon = sb2.toString();
        tL_messages_searchStickers.f27068q = siVar.f25476c;
        tL_messages_searchStickers.limit = 100;
        if (tiVar != null) {
            i7 = tiVar.f25629b.intValue();
        }
        tL_messages_searchStickers.offset = i7;
        hashMap.put(siVar, Integer.valueOf(uiVar.getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new d3.b(1), new m9(uiVar, siVar, tiVar, c20Var, 1))));
    }

    @Override
    public void run(long j3) {
        gz gzVar = (gz) this.f24187a;
        Uri uri = (Uri) this.f24188b;
        ArrayList arrayList = (ArrayList) this.f24189c;
        b80 b80Var = (b80) this.d;
        if (j3 != 0) {
            gzVar.Q(-j3, uri, arrayList, b80Var);
        } else {
            b80Var.run(0L);
        }
    }
}
