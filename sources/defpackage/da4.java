package defpackage;

import android.os.SystemClock;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import org.telegram.tgnet.TLRPC;
public final class da4 {
    public final la4 a;
    public final int b;
    public final String c;
    public final ArrayList d = new ArrayList();
    public final lw3 e = new lw3(this, (byte) 15);

    public da4(int i, String str) {
        this.b = i;
        this.c = ea4.i(i);
        this.a = new la4(new su3((byte) 21), str, this);
    }

    public final void a() {
        LinkedHashMap linkedHashMap;
        HashMap hashMap;
        int i;
        int i2;
        long j;
        String str;
        hl.r(this.e);
        int elapsedRealtime = (int) (SystemClock.elapsedRealtime() / 1000);
        int i3 = 0;
        ea4.a(ea4.j.i(0, 0, elapsedRealtime, true));
        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
        HashMap hashMap2 = new HashMap();
        ArrayList arrayList = this.d;
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            Object obj = arrayList.get(i4);
            i4++;
            ia4 ia4Var = (ia4) obj;
            TLRPC.InputPeer j2 = ea4.j(this.b, ia4Var.c, 0L, ia4Var.a, ia4Var.b);
            if (j2 != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(ia4Var.c);
                if (j2 instanceof TLRPC.TL_inputPeerChannelFromMessage) {
                    str = "/" + ia4Var.a + ":" + ia4Var.b;
                } else {
                    str = "";
                }
                sb.append(str);
                String sb2 = sb.toString();
                if (!linkedHashMap2.containsKey(sb2)) {
                    linkedHashMap2.put(sb2, new ArrayList());
                }
                ((ArrayList) linkedHashMap2.get(sb2)).add(ia4Var);
                hashMap2.put(sb2, j2);
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
                for (ia4 ia4Var2 : (List) obj2) {
                    TLRPC.TL_inputMessageReadMetric tL_inputMessageReadMetric = new TLRPC.TL_inputMessageReadMetric();
                    int i8 = ia4Var2.e;
                    fa4 fa4Var = ia4Var2.j;
                    tL_inputMessageReadMetric.msg_id = i8;
                    Iterator it2 = it;
                    tL_inputMessageReadMetric.view_id = ia4Var2.d;
                    tL_inputMessageReadMetric.time_in_view_ms = ia4Var2.f;
                    tL_inputMessageReadMetric.active_time_in_view_ms = ia4Var2.g;
                    tL_inputMessageReadMetric.height_to_viewport_ratio_permille = ia4Var2.h;
                    tL_inputMessageReadMetric.seen_range_ratio_permille = ia4Var2.i;
                    tL_inputMessageReadMetric.flags = 24;
                    tL_inputMessageReadMetric.surface = ia4Var2.k;
                    tL_inputMessageReadMetric.event_time = ia4Var2.l;
                    if (fa4Var != null) {
                        String str3 = fa4Var.c;
                        if (str3 != null) {
                            i = 4;
                        } else {
                            i = 0;
                        }
                        Long l = fa4Var.a;
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
                        tL_inputMessageReadMetric.recommendation_rank = fa4Var.b;
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
                ea4.k(this.c, this.b, tL_messages_reportReadMetrics, new xe2((byte) 0), elapsedRealtime + 3600);
                linkedHashMap2 = linkedHashMap2;
                hashMap2 = hashMap2;
                i3 = 0;
                it = it;
            }
        }
    }
}
