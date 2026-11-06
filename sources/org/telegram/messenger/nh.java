package org.telegram.messenger;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.b80;
public final class nh implements ri, tr {
    public final c1 f24180a;
    public final Object f24181b;
    public final Object f24182c;
    public final Object d;

    public nh(c1 c1Var, Object obj, Object obj2, Object obj3) {
        this.f24180a = c1Var;
        this.f24181b = obj;
        this.f24182c = obj2;
        this.d = obj3;
    }

    @Override
    public void e(String str, ArrayList arrayList) {
        ui uiVar = (ui) this.f24180a;
        si siVar = (si) this.f24181b;
        ti tiVar = (ti) this.f24182c;
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
            if (!TextUtils.isEmpty(qiVar.f24690a) && !qiVar.f24690a.startsWith("animated_")) {
                sb2.append(qiVar.f24690a);
            }
        }
        TLRPC.TL_messages_searchStickers tL_messages_searchStickers = new TLRPC.TL_messages_searchStickers();
        boolean z9 = siVar.f25466a;
        String str2 = siVar.f25467b;
        tL_messages_searchStickers.emojis = z9;
        if (!TextUtils.isEmpty(str2)) {
            tL_messages_searchStickers.lang_code.add(str2);
        }
        tL_messages_searchStickers.emoticon = sb2.toString();
        tL_messages_searchStickers.f27067q = siVar.f25468c;
        tL_messages_searchStickers.limit = 100;
        if (tiVar != null) {
            i7 = tiVar.f25621b.intValue();
        }
        tL_messages_searchStickers.offset = i7;
        hashMap.put(siVar, Integer.valueOf(uiVar.getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new d3.b(1), new m9(uiVar, siVar, tiVar, c20Var, 1))));
    }

    @Override
    public void run(long j3) {
        gz gzVar = (gz) this.f24180a;
        Uri uri = (Uri) this.f24181b;
        ArrayList arrayList = (ArrayList) this.f24182c;
        b80 b80Var = (b80) this.d;
        if (j3 != 0) {
            gzVar.Q(-j3, uri, arrayList, b80Var);
        } else {
            b80Var.run(0L);
        }
    }
}
