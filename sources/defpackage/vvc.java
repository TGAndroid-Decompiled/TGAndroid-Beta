package defpackage;

import android.text.TextUtils;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import org.json.JSONObject;
import org.telegram.messenger.a;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.utils.twidget.z;
public abstract class vvc {
    public static boolean i;
    public static boolean j;
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final HashMap c = new HashMap();
    public static final HashMap d = new HashMap();
    public static final cza e = new cza((byte) 19);
    public static final ArrayList f = new ArrayList();
    public static final ArrayList g = new ArrayList();
    public static final ArrayList h = new ArrayList();
    public static final boolean[] k = new boolean[4];
    public static final HashMap l = new HashMap();
    public static final c6e m = new Object();

    public static void A(svc svcVar) {
        bwc bwcVar = svcVar.t;
        if (svcVar.J) {
            if (svcVar.B >= 2) {
                return;
            }
            svcVar.J = false;
            bwcVar.m();
        }
        bwcVar.a();
    }

    public static String B(int i2, int i3, long j2) {
        return i2 + "/" + j2 + "/" + i3;
    }

    public static String C(String str) {
        if (str != null && !str.isEmpty()) {
            return str;
        }
        return null;
    }

    public static void D() {
        ArrayList arrayList = new ArrayList();
        for (svc svcVar : a.values()) {
            if (svcVar.t != null && svcVar.x == 0 && !g.contains(svcVar)) {
                arrayList.add(svcVar);
            }
        }
        Collections.sort(arrayList, new pva((byte) 14));
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            bwc bwcVar = ((svc) arrayList.get(i2)).t;
            if (i2 >= 4) {
                bwcVar.m();
            }
            if (i2 >= 12 && bwcVar.e == null) {
                bwcVar.f = null;
            }
        }
    }

    public static void E() {
        bwc bwcVar;
        HashMap hashMap = new HashMap();
        for (svc svcVar : a.values()) {
            if (svcVar.l != 0 && !svcVar.k && svcVar.x != 0 && !j && (bwcVar = svcVar.t) != null && bwcVar.e != null && bwcVar.z) {
                hashMap.put(svcVar.b + "/" + svcVar.l, svcVar);
            }
        }
        HashMap hashMap2 = l;
        Iterator it = hashMap2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!hashMap.containsKey(entry.getKey())) {
                uvc uvcVar = (uvc) entry.getValue();
                gl.r(uvcVar.f);
                if (uvcVar.e != 0) {
                    ConnectionsManager.getInstance(uvcVar.a).cancelRequest(uvcVar.e, true);
                }
                it.remove();
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!hashMap2.containsKey(entry2.getKey())) {
                svc svcVar2 = (svc) entry2.getValue();
                uvc uvcVar2 = new uvc(svcVar2.b, svcVar2.l);
                uvcVar2.c = svcVar2.q;
                hashMap2.put((String) entry2.getKey(), uvcVar2);
                gl.d3(uvcVar2.f, uvcVar2.d * 1000);
            }
        }
    }

    public static boolean F(svc svcVar) {
        if (svcVar.i && !svcVar.k && na7.q1(svcVar.b).k4.n0.f) {
            return true;
        }
        return false;
    }

    public static void a(svc svcVar, String str, String str2) {
        if (!TextUtils.equals(svcVar.o, str) || !TextUtils.equals(svcVar.p, str2)) {
            svcVar.o = str;
            svcVar.p = str2;
            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = svcVar.r;
            if (tL_messageMediaWidget != null) {
                tL_messageMediaWidget.chat_data = str;
                tL_messageMediaWidget.public_data = str2;
                tL_messageMediaWidget.public_data_hash = svcVar.q;
            }
            bwc bwcVar = svcVar.t;
            if (bwcVar != null) {
                bwcVar.h(f(str, str2));
            }
        }
    }

    public static void b() {
        ArrayList arrayList = h;
        if (!arrayList.isEmpty() && z()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                gl.c3((Runnable) obj);
            }
        }
    }

    public static int c(String str, bwc bwcVar, int i2) {
        svc svcVar;
        int i3;
        int i4;
        int i5;
        if (m(str)) {
            svcVar = (svc) a.get(str);
        } else {
            svcVar = null;
        }
        int i6 = 0;
        if (svcVar == null) {
            return 0;
        }
        if (svcVar.f > 0) {
            return gl.L(Math.max(50, Math.min(600, i3)));
        }
        if (bwcVar != null && Math.abs(bwcVar.j - i2) <= 1) {
            i4 = bwcVar.h;
        } else {
            i4 = 0;
        }
        if (i4 > 0) {
            return Math.min(gl.L(600.0f), Math.max(gl.L(50.0f), i4));
        }
        tvc tvcVar = (tvc) b.get(svcVar.a());
        if (tvcVar != null) {
            int e2 = e(i2);
            synchronized (tvcVar) {
                ArrayList arrayList = tvcVar.a;
                int size = arrayList.size();
                int i7 = Integer.MAX_VALUE;
                i5 = 0;
                int i8 = 0;
                while (i8 < size) {
                    Object obj = arrayList.get(i8);
                    i8++;
                    int[] iArr = (int[]) obj;
                    int abs = Math.abs(iArr[0] - e2);
                    if (abs < i7) {
                        i5 = iArr[1];
                        i7 = abs;
                    }
                }
            }
            i6 = i5;
        }
        if (i6 <= 0) {
            i6 = 160;
        }
        return gl.L(Math.max(50, Math.min(600, i6)));
    }

    public static String d(svc svcVar) {
        TLRPC.User user;
        try {
            JSONObject jSONObject = new JSONObject();
            boolean z = svcVar.h;
            boolean z2 = svcVar.i;
            jSONObject.put("isCopy", z);
            jSONObject.put("canQuery", z2);
            jSONObject.put("backgroundQuery", svcVar.j);
            jSONObject.put("preview", svcVar.k);
            jSONObject.put("wallet", F(svcVar));
            Object obj = svcVar.m;
            if (obj != null) {
                jSONObject.put("chatType", obj);
            }
            if (z2) {
                user = y6c.h(svcVar.b).f();
            } else {
                user = null;
            }
            if (user != null) {
                JSONObject jSONObject2 = new JSONObject();
                jSONObject2.put("id", user.id);
                if (!TextUtils.isEmpty(user.first_name)) {
                    jSONObject2.put("firstName", user.first_name);
                }
                if (!TextUtils.isEmpty(user.last_name)) {
                    jSONObject2.put("lastName", user.last_name);
                }
                String p = l7c.p(user);
                if (!TextUtils.isEmpty(p)) {
                    jSONObject2.put("username", p);
                }
                jSONObject2.put("isPremium", user.premium);
                jSONObject.put("viewer", jSONObject2);
            }
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public static int e(int i2) {
        return Math.round(i2 / gl.p);
    }

    public static String f(String str, String str2) {
        try {
            JSONObject jSONObject = new JSONObject();
            Object obj = str;
            if (str == null) {
                obj = JSONObject.NULL;
            }
            jSONObject.put("chatData", obj);
            Object obj2 = str2;
            if (str2 == null) {
                obj2 = JSONObject.NULL;
            }
            jSONObject.put("publicData", obj2);
            return jSONObject.toString();
        } catch (Exception unused) {
            return "{}";
        }
    }

    public static svc g(bwc bwcVar) {
        if (bwcVar == null) {
            return null;
        }
        return (svc) a.get(bwcVar.a);
    }

    public static bwc h(String str) {
        svc svcVar;
        String str2;
        if (m(str)) {
            svcVar = (svc) a.get(str);
        } else {
            svcVar = null;
        }
        if (svcVar == null || z.a()) {
            return null;
        }
        synchronized (svcVar) {
            bwc bwcVar = svcVar.t;
            if (bwcVar == null) {
                String str3 = svcVar.s;
                if (str3 == null) {
                    str3 = l(svcVar.g);
                    svcVar.s = str3;
                }
                if (str3 == null) {
                    return null;
                }
                bwc bwcVar2 = new bwc(a.b, svcVar.a, svcVar.s);
                try {
                    str2 = k96.D0().y.toLanguageTag();
                } catch (Exception unused) {
                    str2 = null;
                }
                bwcVar2.s = str2;
                bwcVar2.t = null;
                int i2 = svcVar.b;
                long j2 = svcVar.n;
                long j3 = 0;
                if (j2 != 0) {
                    j3 = j2 ^ ((i2 + 1) << 56);
                }
                bwcVar2.A = j3;
                String d2 = d(svcVar);
                if (d2 != null) {
                    bwcVar2.v = d2;
                }
                bwcVar2.h(f(svcVar.o, svcVar.p));
                bwcVar2.d = m;
                svcVar.t = bwcVar2;
                bwcVar = bwcVar2;
            }
            return bwcVar;
        }
    }

    public static void i() {
        JSONObject jSONObject;
        String str;
        gl.r(e);
        HashMap hashMap = d;
        if (hashMap.isEmpty()) {
            return;
        }
        for (svc svcVar : hashMap.values()) {
            JSONObject jSONObject2 = (JSONObject) c.get(svcVar.a());
            if (jSONObject2 != null) {
                jSONObject = jSONObject2.optJSONObject("local");
            } else {
                jSONObject = null;
            }
            if (jSONObject != null && jSONObject.length() != 0) {
                str = jSONObject.toString();
            } else {
                str = "";
            }
            String str2 = str;
            ad7 Y = ad7.Y(svcVar.b);
            Y.a.c(new o57(Y, str2, svcVar.c, svcVar.d, (byte) 14));
        }
        hashMap.clear();
    }

    public static String j(String str, bwc bwcVar, int i2) {
        svc svcVar;
        int[] iArr = null;
        if (m(str)) {
            svcVar = (svc) a.get(str);
        } else {
            svcVar = null;
        }
        if (svcVar == null) {
            return "none";
        }
        if (svcVar.f > 0) {
            return "anchor " + svcVar.f;
        } else if (bwcVar != null && Math.abs(bwcVar.j - i2) <= 1 && bwcVar.h > 0) {
            return "frame";
        } else {
            tvc tvcVar = (tvc) b.get(svcVar.a());
            if (tvcVar != null) {
                int e2 = e(i2);
                synchronized (tvcVar) {
                    ArrayList arrayList = tvcVar.a;
                    int size = arrayList.size();
                    int i3 = 0;
                    while (i3 < size) {
                        Object obj = arrayList.get(i3);
                        i3++;
                        int[] iArr2 = (int[]) obj;
                        if (iArr == null || Math.abs(iArr2[0] - e2) < Math.abs(iArr[0] - e2)) {
                            iArr = iArr2;
                        }
                    }
                }
            }
            if (iArr != null && iArr[1] > 0) {
                if (iArr[0] == e(i2)) {
                    return "cache";
                }
                return "cache of width " + iArr[0];
            }
            return "placeholder";
        }
    }

    public static tvc k(String str) {
        ConcurrentHashMap concurrentHashMap = b;
        tvc tvcVar = (tvc) concurrentHashMap.get(str);
        if (tvcVar == null) {
            tvc tvcVar2 = new tvc();
            tvc tvcVar3 = (tvc) concurrentHashMap.putIfAbsent(str, tvcVar2);
            if (tvcVar3 == null) {
                return tvcVar2;
            }
            return tvcVar3;
        }
        return tvcVar;
    }

    public static String l(byte[] bArr) {
        boolean z;
        InputStream inflaterInputStream;
        String str;
        if (bArr == null) {
            return null;
        }
        if (bArr.length >= 2 && (bArr[0] & 255) == 31 && (bArr[1] & 255) == 139) {
            z = true;
        } else {
            z = false;
        }
        try {
            if (z) {
                inflaterInputStream = new GZIPInputStream(new ByteArrayInputStream(bArr));
            } else {
                inflaterInputStream = new InflaterInputStream(new ByteArrayInputStream(bArr));
            }
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(bArr.length << 2);
            try {
                byte[] bArr2 = new byte[8192];
                while (true) {
                    int read = inflaterInputStream.read(bArr2);
                    if (read == -1) {
                        break;
                    }
                    byteArrayOutputStream.write(bArr2, 0, read);
                }
                if (w01.a) {
                    StringBuilder sb = new StringBuilder();
                    sb.append("widget payload: ");
                    if (z) {
                        str = "gzip";
                    } else {
                        str = "zlib";
                    }
                    sb.append(str);
                    sb.append(", ");
                    sb.append(bArr.length);
                    sb.append(" -> ");
                    sb.append(byteArrayOutputStream.size());
                    sb.append(" bytes");
                    fa4.b(sb.toString());
                }
                String str2 = new String(byteArrayOutputStream.toByteArray(), StandardCharsets.UTF_8);
                byteArrayOutputStream.close();
                inflaterInputStream.close();
                return str2;
            } catch (Throwable th) {
                try {
                    byteArrayOutputStream.close();
                } catch (Throwable th2) {
                    th.addSuppressed(th2);
                }
                throw th;
            }
        } catch (Exception e2) {
            fa4.g(e2, true);
            return null;
        }
    }

    public static boolean m(String str) {
        if (str != null && str.startsWith("tg-widget:")) {
            return true;
        }
        return false;
    }

    public static TL_iv.RichMessage n(String str) {
        TL_iv.pageBlockEmbed pageblockembed = new TL_iv.pageBlockEmbed();
        pageblockembed.url = str;
        pageblockembed.html = "";
        TL_iv.PageCaption pageCaption = new TL_iv.PageCaption();
        pageblockembed.caption = pageCaption;
        pageCaption.text = new TL_iv.textEmpty();
        pageblockembed.caption.credit = new TL_iv.textEmpty();
        TL_iv.RichMessage richMessage = new TL_iv.RichMessage();
        richMessage.blocks.add(pageblockembed);
        return richMessage;
    }

    public static void o() {
        while (true) {
            ArrayList arrayList = g;
            if (arrayList.size() < 3 && !j) {
                ArrayList arrayList2 = f;
                long j2 = Long.MAX_VALUE;
                svc svcVar = null;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    svc svcVar2 = (svc) arrayList2.get(size);
                    if (svcVar2.z) {
                        long j3 = 9223372036854775806L;
                        for (svc svcVar3 : a.values()) {
                            if (svcVar3.x != 0 && svcVar3.b == svcVar2.b && svcVar3.c == svcVar2.c) {
                                j3 = Math.min(j3, Math.abs(svcVar3.d - svcVar2.d));
                            }
                        }
                        if (j3 < j2) {
                            svcVar = svcVar2;
                            j2 = j3;
                        }
                    }
                }
                if (svcVar != null) {
                    arrayList2.remove(svcVar);
                    bwc bwcVar = svcVar.t;
                    if (bwcVar != null && !svcVar.J && svcVar.x <= 0) {
                        String j4 = j(svcVar.a, bwcVar, svcVar.K);
                        if (j4.equals("placeholder") || j4.startsWith("cache of width")) {
                            bwcVar.l(svcVar.K);
                            if (bwcVar.r == null) {
                                bwcVar.j(mwc.a(null, svcVar.L));
                            }
                            if (!bwcVar.n) {
                                arrayList.add(svcVar);
                                A(svcVar);
                                gl.d3(svcVar.M, 4000L);
                            }
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
    }

    public static zi9 p(ArrayList arrayList) {
        int size = arrayList.size();
        zi9 zi9Var = null;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            zi9 zi9Var2 = (zi9) obj;
            if (zi9Var == null || zi9Var2.d0 > zi9Var.d0) {
                zi9Var = zi9Var2;
            }
        }
        return zi9Var;
    }

    public static void q(boolean z) {
        boolean z2;
        if (j == z) {
            return;
        }
        j = z;
        for (svc svcVar : a.values()) {
            bwc bwcVar = svcVar.t;
            if (bwcVar != null && bwcVar.o != z) {
                bwcVar.o = z;
                z zVar = bwcVar.e;
                if (zVar != null) {
                    if (bwcVar.m && !z) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    zVar.g(z2);
                }
            }
        }
        if (z) {
            i();
        } else {
            o();
        }
        E();
    }

    public static void r(bwc bwcVar) {
        svc g2 = g(bwcVar);
        if (g2 == null) {
            return;
        }
        g2.x = Math.max(0, g2.x - 1);
        g2.y = System.currentTimeMillis();
        D();
        i();
        E();
    }

    public static void s(svc svcVar) {
        gl.r(svcVar.M);
        if (!g.remove(svcVar)) {
            return;
        }
        D();
        o();
    }

    public static void t(bwc bwcVar) {
        boolean z;
        svc g2 = g(bwcVar);
        if (g2 == null) {
            return;
        }
        g2.x++;
        g2.y = System.currentTimeMillis();
        boolean z2 = j;
        if (bwcVar.o != z2) {
            bwcVar.o = z2;
            z zVar = bwcVar.e;
            if (zVar != null) {
                if (bwcVar.m && !z2) {
                    z = true;
                } else {
                    z = false;
                }
                zVar.g(z);
            }
        }
        if (g2.z) {
            A(g2);
        } else {
            g2.A = true;
        }
        D();
        E();
    }

    public static void u(int i2) {
        gl.c3(new xv0(i2, (byte) 13));
    }

    public static String v(int i2, TLRPC.BotInlineResult botInlineResult) {
        TLRPC.TL_botInlineMessageWidget tL_botInlineMessageWidget = (TLRPC.TL_botInlineMessageWidget) botInlineResult.send_message;
        StringBuilder m2 = de9.m(i2, "tg-widget:preview/", "/");
        m2.append(botInlineResult.query_id);
        m2.append("/");
        m2.append(botInlineResult.id);
        m2.append("/");
        m2.append(Arrays.hashCode(tL_botInlineMessageWidget.payload));
        String sb = m2.toString();
        ConcurrentHashMap concurrentHashMap = a;
        if (!concurrentHashMap.containsKey(sb)) {
            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = new TLRPC.TL_messageMediaWidget();
            tL_messageMediaWidget.width = tL_botInlineMessageWidget.width;
            tL_messageMediaWidget.height = tL_botInlineMessageWidget.height;
            tL_messageMediaWidget.payload = tL_botInlineMessageWidget.payload;
            tL_messageMediaWidget.public_data = tL_botInlineMessageWidget.public_data;
            tL_messageMediaWidget.public_data_hash = tL_botInlineMessageWidget.public_data_hash;
            tL_messageMediaWidget.chat_data = tL_botInlineMessageWidget.chat_data;
            tL_messageMediaWidget.widget_id = tL_botInlineMessageWidget.widget_id;
            svc svcVar = new svc(sb, i2, 0L, 0, 0L, tL_messageMediaWidget, true);
            svcVar.z = true;
            concurrentHashMap.putIfAbsent(sb, svcVar);
        }
        return sb;
    }

    public static void w(svc svcVar, bwc bwcVar, long j2, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr) {
        boolean[] zArr = new boolean[1];
        int[] iArr = new int[1];
        o77 o77Var = new o77(zArr, ConnectionsManager.getInstance(svcVar.b), iArr, bwcVar, j2, (byte) 23);
        y(svcVar, widgetQueryType, bArr, iArr, new il3(zArr, o77Var, bwcVar, j2));
        gl.d3(o77Var, 30000L);
    }

    public static void x(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).startsWith(str)) {
                it.remove();
            }
        }
    }

    public static void y(svc svcVar, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, il3 il3Var) {
        boolean z;
        TLRPC.TL_messages_getBotWidgetQueryAnswer tL_messages_getBotWidgetQueryAnswer;
        if ((widgetQueryType instanceof TLRPC.TL_widgetQueryTypeData) && !((TLRPC.TL_widgetQueryTypeData) widgetQueryType).with_wallet) {
            z = true;
        } else {
            z = false;
        }
        int i2 = svcVar.b;
        boolean z2 = k[i2];
        if (z2) {
            if (!z) {
                TLRPC.TL_error tL_error = new TLRPC.TL_error();
                tL_error.code = 400;
                tL_error.text = "WIDGET_QUERY_TYPE_UNSUPPORTED";
                gl.c3(new isc(il3Var, tL_error, (byte) 11));
                return;
            }
            tL_messages_getBotWidgetQueryAnswer = new TLRPC.TL_messages_getBotWidgetQueryAnswer_layer233();
        } else {
            tL_messages_getBotWidgetQueryAnswer = new TLRPC.TL_messages_getBotWidgetQueryAnswer();
        }
        tL_messages_getBotWidgetQueryAnswer.peer = na7.q1(i2).h1(svcVar.c);
        tL_messages_getBotWidgetQueryAnswer.msg_id = svcVar.d;
        tL_messages_getBotWidgetQueryAnswer.query_type = widgetQueryType;
        tL_messages_getBotWidgetQueryAnswer.data = bArr;
        iArr[0] = ConnectionsManager.getInstance(i2).sendRequestTyped(tL_messages_getBotWidgetQueryAnswer, new hc((byte) 0), new n25(z2, svcVar, widgetQueryType, bArr, iArr, il3Var));
    }

    public static boolean z() {
        z zVar;
        kwc kwcVar;
        for (svc svcVar : a.values()) {
            bwc bwcVar = svcVar.t;
            zi9 zi9Var = svcVar.w;
            if (svcVar.x != 0 && bwcVar != null && zi9Var != null && !svcVar.J && ((zVar = bwcVar.e) == null || (kwcVar = zVar.N) == null || (!kwcVar.h && !zVar.F))) {
                String j2 = j(svcVar.a, bwcVar, zi9Var.u0());
                if (j2.equals("placeholder") || j2.startsWith("cache of width")) {
                    return false;
                }
            }
        }
        return true;
    }
}
