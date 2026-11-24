package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class ha4 {
    public final pa4 a;
    public final int b;
    public final String c;
    public final ArrayList d = new ArrayList();
    public final a14 e = new a14(this, (byte) 9);

    public ha4(int i, String str) {
        this.b = i;
        this.c = ia4.f(i);
        this.a = new pa4(new h64((byte) 11), str, this);
    }

    public final void a() {
        LinkedHashMap linkedHashMap;
        HashMap hashMap;
        int i;
        int i2;
        long j;
        String str;
        gm.r(this.e);
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        int i3 = 0;
        ia4.a(ia4.i.d(0, 0, elapsedRealtime, true));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ma4 ma4Var = (ma4) obj;
            TLRPC.InputPeer g = ia4.g(this.b, ma4Var.c, 0L, ma4Var.a, ma4Var.b);
            if (g != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(ma4Var.c);
                if (g instanceof TLRPC.TL_inputPeerChannelFromMessage) {
                    str = "/" + ma4Var.a + ":" + ma4Var.b;
                } else {
                    str = "";
                }
                sb.append(str);
                String sb2 = sb.toString();
                if (!linkedHashMap2.containsKey(sb2)) {
                    linkedHashMap2.put(sb2, new ArrayList());
                }
                ((ArrayList) linkedHashMap2.get(sb2)).add(ma4Var);
                hashMap2.put(sb2, g);
            }
        }
        arrayList.clear();
        Iterator it = linkedHashMap2.keySet().iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            List list = (List) linkedHashMap2.get(str2);
            ArrayList arrayList2 = new ArrayList();
            int i5 = i3;
            while (i5 < list.size()) {
                int i6 = i5 + 100;
                arrayList2.add(list.subList(i5, Math.min(list.size(), i6)));
                i5 = i6;
            }
            int size2 = arrayList2.size();
            int i7 = i3;
            while (i7 < size2) {
                Object obj2 = arrayList2.get(i7);
                i7++;
                TLRPC.TL_messages_reportReadMetrics tL_messages_reportReadMetrics = new TLRPC.TL_messages_reportReadMetrics();
                tL_messages_reportReadMetrics.peer = (TLRPC.InputPeer) hashMap2.get(str2);
                tL_messages_reportReadMetrics.metrics = new ArrayList<>();
                for (ma4 ma4Var2 : (List) obj2) {
                    TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
                    int i8 = ma4Var2.e;
                    ja4 ja4Var = ma4Var2.j;
                    tL_inputMessageReadMetric.msg_id = i8;
                    Iterator it2 = it;
                    tL_inputMessageReadMetric.view_id = ma4Var2.d;
                    tL_inputMessageReadMetric.time_in_view_ms = ma4Var2.f;
                    tL_inputMessageReadMetric.active_time_in_view_ms = ma4Var2.g;
                    tL_inputMessageReadMetric.height_to_viewport_ratio_permille = ma4Var2.h;
                    tL_inputMessageReadMetric.seen_range_ratio_permille = ma4Var2.i;
                    tL_inputMessageReadMetric.flags = 24;
                    tL_inputMessageReadMetric.surface = ma4Var2.k;
                    tL_inputMessageReadMetric.event_time = ma4Var2.l;
                    if (ja4Var != null) {
                        String str3 = ja4Var.c;
                        if (str3 != null) {
                            i = 4;
                        } else {
                            i = 0;
                        }
                        Long l = ja4Var.a;
                        if (l != null) {
                            i2 = 3;
                        } else {
                            i2 = 0;
                        }
                        tL_inputMessageReadMetric.flags = 24 | i | i2;
                        if (l != null) {
                            j = l.longValue();
                        } else {
                            j = 0;
                        }
                        linkedHashMap = linkedHashMap2;
                        hashMap = hashMap2;
                        tL_inputMessageReadMetric.recommendation_id = j;
                        tL_inputMessageReadMetric.recommendation_rank = ja4Var.b;
                        tL_inputMessageReadMetric.recommendation_role = str3;
                    } else {
                        linkedHashMap = linkedHashMap2;
                        hashMap = hashMap2;
                    }
                    tL_messages_reportReadMetrics.metrics.add(tL_inputMessageReadMetric);
                    linkedHashMap2 = linkedHashMap;
                    hashMap2 = hashMap;
                    it = it2;
                }
                ia4.h(this.c, this.b, tL_messages_reportReadMetrics, new nf2((byte) 0), elapsedRealtime + 3600);
                linkedHashMap2 = linkedHashMap2;
                hashMap2 = hashMap2;
                i3 = 0;
                it = it;
            }
        }
    }
}
