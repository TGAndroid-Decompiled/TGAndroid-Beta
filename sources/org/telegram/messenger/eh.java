package org.telegram.messenger;

import android.net.Uri;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.w70;
public final class eh implements ii, lr {
    public final c1 f22352a;
    public final Object f22353b;
    public final Object f22354c;
    public final Object d;

    public eh(c1 c1Var, Object obj, Object obj2, Object obj3) {
        this.f22352a = c1Var;
        this.f22353b = obj;
        this.f22354c = obj2;
        this.d = obj3;
    }

    @Override
    public void h(String str, ArrayList arrayList) {
        li liVar = (li) this.f22352a;
        ji jiVar = (ji) this.f22353b;
        ki kiVar = (ki) this.f22354c;
        u10 u10Var = (u10) this.d;
        HashMap hashMap = liVar.Q1;
        if (!hashMap.containsKey(jiVar)) {
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        int size = arrayList.size();
        int i3 = 0;
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            hi hiVar = (hi) obj;
            if (!TextUtils.isEmpty(hiVar.f22931a) && !hiVar.f22931a.startsWith("animated_")) {
                sb2.append(hiVar.f22931a);
            }
        }
        TLRPC.TL_messages_searchStickers tL_messages_searchStickers = new TLRPC.TL_messages_searchStickers();
        boolean z10 = jiVar.f23673a;
        String str2 = jiVar.f23674b;
        tL_messages_searchStickers.emojis = z10;
        if (!TextUtils.isEmpty(str2)) {
            tL_messages_searchStickers.lang_code.add(str2);
        }
        tL_messages_searchStickers.emoticon = sb2.toString();
        tL_messages_searchStickers.f27116q = jiVar.f23675c;
        tL_messages_searchStickers.limit = 100;
        if (kiVar != null) {
            i3 = kiVar.f23831b.intValue();
        }
        tL_messages_searchStickers.offset = i3;
        hashMap.put(jiVar, Integer.valueOf(liVar.getConnectionsManager().sendRequestTyped(tL_messages_searchStickers, new c3.b(1), new g9(liVar, jiVar, kiVar, u10Var, 1))));
    }

    @Override
    public void run(long j10) {
        yy yyVar = (yy) this.f22352a;
        Uri uri = (Uri) this.f22353b;
        ArrayList arrayList = (ArrayList) this.f22354c;
        w70 w70Var = (w70) this.d;
        if (j10 != 0) {
            yyVar.Q(-j10, uri, arrayList, w70Var);
        } else {
            w70Var.run(0L);
        }
    }
}
