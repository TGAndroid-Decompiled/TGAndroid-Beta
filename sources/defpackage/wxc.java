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
import org.telegram.tgnet.tl.TL_bots;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.utils.twidget.z;
public abstract class wxc {
    public static boolean i;
    public static boolean j;
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final HashMap c = new HashMap();
    public static final HashMap d = new HashMap();
    public static final e1b e = new e1b((byte) 19);
    public static final ArrayList f = new ArrayList();
    public static final ArrayList g = new ArrayList();
    public static final ArrayList h = new ArrayList();
    public static final boolean[] k = new boolean[4];
    public static final HashMap l = new HashMap();
    public static final f8e m = new Object();

    public static boolean A() {
        for (txc txcVar : a.values()) {
            cyc cycVar = txcVar.v;
            al9 al9Var = txcVar.y;
            if (txcVar.z != 0 && cycVar != null && al9Var != null && !txcVar.L && !cycVar.e()) {
                String j2 = j(txcVar.a, cycVar, al9Var.t0());
                if (j2.equals("placeholder") || j2.startsWith("cache of width")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void B(txc txcVar) {
        cyc cycVar = txcVar.v;
        if (txcVar.L) {
            if (txcVar.D >= 2) {
                return;
            }
            txcVar.L = false;
            cycVar.n();
        }
        cycVar.a();
    }

    public static String C(int i2, int i3, long j2) {
        return i2 + "/" + j2 + "/" + i3;
    }

    public static String D(String str) {
        if (str != null && !str.isEmpty()) {
            return str;
        }
        return null;
    }

    public static void E() {
        ArrayList arrayList = new ArrayList();
        for (txc txcVar : a.values()) {
            if (txcVar.v != null && txcVar.z == 0 && !g.contains(txcVar)) {
                arrayList.add(txcVar);
            }
        }
        Collections.sort(arrayList, new zua((byte) 15));
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            cyc cycVar = ((txc) arrayList.get(i2)).v;
            if (i2 >= 4) {
                cycVar.n();
            }
            if (i2 >= 12 && cycVar.e == null) {
                cycVar.f = null;
            }
        }
    }

    public static void F() {
        long j2;
        cyc cycVar;
        StringBuilder sb;
        long j3;
        HashMap hashMap = new HashMap();
        for (txc txcVar : a.values()) {
            long j4 = txcVar.l;
            boolean z = txcVar.o;
            if (j4 != 0 || z) {
                if (!txcVar.k && txcVar.z != 0 && !j && (cycVar = txcVar.v) != null && cycVar.e != null && cycVar.z) {
                    int i2 = txcVar.b;
                    if (z) {
                        sb = new StringBuilder();
                        sb.append(i2);
                        sb.append("/bot");
                        j3 = txcVar.n;
                    } else {
                        sb = new StringBuilder();
                        sb.append(i2);
                        sb.append("/");
                        j3 = txcVar.l;
                    }
                    sb.append(j3);
                    hashMap.put(sb.toString(), txcVar);
                }
            }
        }
        HashMap hashMap2 = l;
        Iterator it = hashMap2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!hashMap.containsKey(entry.getKey())) {
                vxc vxcVar = (vxc) entry.getValue();
                gm.r(vxcVar.g);
                if (vxcVar.f != 0) {
                    ConnectionsManager.getInstance(vxcVar.a).cancelRequest(vxcVar.f, true);
                }
                it.remove();
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!hashMap2.containsKey(entry2.getKey())) {
                txc txcVar2 = (txc) entry2.getValue();
                int i3 = txcVar2.b;
                long j5 = txcVar2.l;
                if (txcVar2.o) {
                    j2 = txcVar2.n;
                } else {
                    j2 = 0;
                }
                vxc vxcVar2 = new vxc(j5, i3, j2);
                vxcVar2.d = txcVar2.s;
                hashMap2.put((String) entry2.getKey(), vxcVar2);
                gm.d3(vxcVar2.g, vxcVar2.e * 1000);
            }
        }
    }

    public static boolean G(txc txcVar) {
        if (txcVar.i && !txcVar.k && oc7.r1(txcVar.b).l4.n0.f) {
            return true;
        }
        return false;
    }

    public static void a(txc txcVar, String str, String str2) {
        if (!TextUtils.equals(txcVar.q, str) || !TextUtils.equals(txcVar.r, str2)) {
            txcVar.q = str;
            txcVar.r = str2;
            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = txcVar.t;
            if (tL_messageMediaWidget != null) {
                tL_messageMediaWidget.chat_data = str;
                tL_messageMediaWidget.public_data = str2;
                tL_messageMediaWidget.public_data_hash = txcVar.s;
            }
            cyc cycVar = txcVar.v;
            if (cycVar != null) {
                cycVar.i(f(str, str2));
            }
        }
    }

    public static void b() {
        ArrayList arrayList = h;
        if (!arrayList.isEmpty() && A()) {
            ArrayList arrayList2 = new ArrayList(arrayList);
            int size = arrayList2.size();
            int i2 = 0;
            while (i2 < size) {
                Object obj = arrayList2.get(i2);
                i2++;
                gm.c3((Runnable) obj);
            }
        }
    }

    public static int c(String str, cyc cycVar, int i2) {
        txc txcVar;
        int i3;
        int i4;
        int i5;
        if (m(str)) {
            txcVar = (txc) a.get(str);
        } else {
            txcVar = null;
        }
        int i6 = 0;
        if (txcVar == null) {
            return 0;
        }
        if (txcVar.f > 0) {
            return gm.L(Math.max(50, Math.min(600, i3)));
        }
        if (cycVar != null && Math.abs(cycVar.j - i2) <= 1) {
            i4 = cycVar.h;
        } else {
            i4 = 0;
        }
        if (i4 > 0) {
            return Math.min(gm.L(600.0f), Math.max(gm.L(50.0f), i4));
        }
        uxc uxcVar = (uxc) b.get(txcVar.a());
        if (uxcVar != null) {
            int e2 = e(i2);
            synchronized (uxcVar) {
                ArrayList arrayList = uxcVar.a;
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
        return gm.L(Math.max(50, Math.min(600, i6)));
    }

    public static String d(txc txcVar) {
        TLRPC.User user;
        try {
            JSONObject jSONObject = new JSONObject();
            boolean z = txcVar.h;
            boolean z2 = txcVar.i;
            jSONObject.put("isCopy", z);
            jSONObject.put("canQuery", z2);
            jSONObject.put("backgroundQuery", txcVar.j);
            jSONObject.put("preview", txcVar.k);
            jSONObject.put("wallet", G(txcVar));
            Object obj = txcVar.m;
            if (obj != null) {
                jSONObject.put("chatType", obj);
            }
            if (txcVar.o) {
                jSONObject.put("surface", "profile");
            }
            if (z2) {
                user = z8c.h(txcVar.b).f();
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
                String p = m9c.p(user);
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
        return Math.round(i2 / gm.p);
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

    public static txc g(cyc cycVar) {
        if (cycVar == null) {
            return null;
        }
        return (txc) a.get(cycVar.a);
    }

    public static cyc h(String str) {
        txc txcVar;
        String str2;
        if (m(str)) {
            txcVar = (txc) a.get(str);
        } else {
            txcVar = null;
        }
        if (txcVar == null || z.a()) {
            return null;
        }
        synchronized (txcVar) {
            cyc cycVar = txcVar.v;
            if (cycVar == null) {
                String str3 = txcVar.u;
                if (str3 == null) {
                    str3 = l(txcVar.g);
                    txcVar.u = str3;
                }
                if (str3 == null) {
                    return null;
                }
                cyc cycVar2 = new cyc(a.b, txcVar.a, txcVar.u);
                try {
                    str2 = jb6.D0().y.toLanguageTag();
                } catch (Exception unused) {
                    str2 = null;
                }
                cycVar2.s = str2;
                cycVar2.t = null;
                int i2 = txcVar.b;
                long j2 = txcVar.n;
                long j3 = 0;
                if (j2 != 0) {
                    j3 = j2 ^ ((i2 + 1) << 56);
                }
                cycVar2.A = j3;
                String d2 = d(txcVar);
                if (d2 != null) {
                    cycVar2.v = d2;
                }
                cycVar2.i(f(txcVar.q, txcVar.r));
                cycVar2.d = m;
                txcVar.v = cycVar2;
                cycVar = cycVar2;
            }
            return cycVar;
        }
    }

    public static void i() {
        JSONObject jSONObject;
        String str;
        gm.r(e);
        HashMap hashMap = d;
        if (hashMap.isEmpty()) {
            return;
        }
        for (txc txcVar : hashMap.values()) {
            JSONObject jSONObject2 = (JSONObject) c.get(txcVar.a());
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
            cf7 Y = cf7.Y(txcVar.b);
            Y.a.c(new o77(Y, str2, txcVar.c, txcVar.d, (byte) 14));
        }
        hashMap.clear();
    }

    public static String j(String str, cyc cycVar, int i2) {
        txc txcVar;
        int[] iArr = null;
        if (m(str)) {
            txcVar = (txc) a.get(str);
        } else {
            txcVar = null;
        }
        if (txcVar == null) {
            return "none";
        }
        if (txcVar.f > 0) {
            return "anchor " + txcVar.f;
        } else if (cycVar != null && Math.abs(cycVar.j - i2) <= 1 && cycVar.h > 0) {
            return "frame";
        } else {
            uxc uxcVar = (uxc) b.get(txcVar.a());
            if (uxcVar != null) {
                int e2 = e(i2);
                synchronized (uxcVar) {
                    ArrayList arrayList = uxcVar.a;
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

    public static uxc k(String str) {
        ConcurrentHashMap concurrentHashMap = b;
        uxc uxcVar = (uxc) concurrentHashMap.get(str);
        if (uxcVar == null) {
            uxc uxcVar2 = new uxc();
            uxc uxcVar3 = (uxc) concurrentHashMap.putIfAbsent(str, uxcVar2);
            if (uxcVar3 == null) {
                return uxcVar2;
            }
            return uxcVar3;
        }
        return uxcVar;
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
                if (e21.a) {
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
                    fc4.b(sb.toString());
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
            fc4.g(e2, true);
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
                txc txcVar = null;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    txc txcVar2 = (txc) arrayList2.get(size);
                    if (txcVar2.B) {
                        long j3 = 9223372036854775806L;
                        for (txc txcVar3 : a.values()) {
                            if (txcVar3.z != 0 && txcVar3.b == txcVar2.b && txcVar3.c == txcVar2.c) {
                                j3 = Math.min(j3, Math.abs(txcVar3.d - txcVar2.d));
                            }
                        }
                        if (j3 < j2) {
                            txcVar = txcVar2;
                            j2 = j3;
                        }
                    }
                }
                if (txcVar != null) {
                    arrayList2.remove(txcVar);
                    cyc cycVar = txcVar.v;
                    if (cycVar != null && !txcVar.L && txcVar.z <= 0) {
                        String j4 = j(txcVar.a, cycVar, txcVar.M);
                        if (j4.equals("placeholder") || j4.startsWith("cache of width")) {
                            cycVar.m(txcVar.M);
                            if (cycVar.r == null) {
                                cycVar.k(nyc.a(null, txcVar.N));
                            }
                            if (!cycVar.n) {
                                arrayList.add(txcVar);
                                B(txcVar);
                                gm.d3(txcVar.O, 4000L);
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

    public static al9 p(ArrayList arrayList) {
        int size = arrayList.size();
        al9 al9Var = null;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            al9 al9Var2 = (al9) obj;
            if (al9Var == null || al9Var2.d0 > al9Var.d0) {
                al9Var = al9Var2;
            }
        }
        return al9Var;
    }

    public static void q(boolean z) {
        boolean z2;
        if (j == z) {
            return;
        }
        j = z;
        for (txc txcVar : a.values()) {
            cyc cycVar = txcVar.v;
            if (cycVar != null && cycVar.o != z) {
                cycVar.o = z;
                z zVar = cycVar.e;
                if (zVar != null) {
                    if (cycVar.m && !z) {
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
        F();
    }

    public static void r(cyc cycVar) {
        txc g2 = g(cycVar);
        if (g2 == null) {
            return;
        }
        g2.z = Math.max(0, g2.z - 1);
        g2.A = System.currentTimeMillis();
        E();
        i();
        F();
    }

    public static void s(txc txcVar) {
        gm.r(txcVar.O);
        if (!g.remove(txcVar)) {
            return;
        }
        E();
        o();
    }

    public static void t(int i2, String str, long j2) {
        for (txc txcVar : a.values()) {
            if (txcVar.o && txcVar.b == i2 && txcVar.n == j2) {
                a(txcVar, D(str), txcVar.r);
            }
        }
    }

    public static void u(cyc cycVar) {
        boolean z;
        txc g2 = g(cycVar);
        if (g2 == null) {
            return;
        }
        g2.z++;
        g2.A = System.currentTimeMillis();
        boolean z2 = j;
        if (cycVar.o != z2) {
            cycVar.o = z2;
            z zVar = cycVar.e;
            if (zVar != null) {
                if (cycVar.m && !z2) {
                    z = true;
                } else {
                    z = false;
                }
                zVar.g(z);
            }
        }
        if (g2.B) {
            B(g2);
        } else {
            g2.C = true;
        }
        E();
        F();
    }

    public static void v(int i2) {
        gm.c3(new fx0(i2, (byte) 13));
    }

    public static String w(int i2, TLRPC.BotInlineResult botInlineResult) {
        TLRPC.TL_botInlineMessageWidget tL_botInlineMessageWidget = (TLRPC.TL_botInlineMessageWidget) botInlineResult.send_message;
        StringBuilder l2 = hg9.l(i2, "tg-widget:preview/", "/");
        l2.append(botInlineResult.query_id);
        l2.append("/");
        l2.append(botInlineResult.id);
        l2.append("/");
        l2.append(Arrays.hashCode(tL_botInlineMessageWidget.payload));
        String sb = l2.toString();
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
            txc txcVar = new txc(sb, i2, 0L, 0, 0L, tL_messageMediaWidget, true);
            txcVar.B = true;
            concurrentHashMap.putIfAbsent(sb, txcVar);
        }
        return sb;
    }

    public static void x(txc txcVar, cyc cycVar, long j2, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr) {
        boolean[] zArr = new boolean[1];
        int[] iArr = new int[1];
        r97 r97Var = new r97(zArr, ConnectionsManager.getInstance(txcVar.b), iArr, cycVar, j2, (byte) 23);
        z(txcVar, widgetQueryType, bArr, iArr, new tm3(zArr, r97Var, cycVar, j2));
        gm.d3(r97Var, 30000L);
    }

    public static void y(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).startsWith(str)) {
                it.remove();
            }
        }
    }

    public static void z(txc txcVar, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, tm3 tm3Var) {
        boolean z;
        TLRPC.TL_messages_getBotWidgetQueryAnswer tL_messages_getBotWidgetQueryAnswer;
        if ((widgetQueryType instanceof TLRPC.TL_widgetQueryTypeData) && !((TLRPC.TL_widgetQueryTypeData) widgetQueryType).with_wallet) {
            z = true;
        } else {
            z = false;
        }
        int i2 = txcVar.b;
        boolean z2 = k[i2];
        if (z2 && !z) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.code = 400;
            tL_error.text = "WIDGET_QUERY_TYPE_UNSUPPORTED";
            gm.c3(new ptc(tm3Var, tL_error, (byte) 13));
        } else if (txcVar.o) {
            TL_bots.getProfileWidgetQueryAnswer getprofilewidgetqueryanswer = new TL_bots.getProfileWidgetQueryAnswer();
            getprofilewidgetqueryanswer.bot = oc7.r1(i2).n1(txcVar.n);
            getprofilewidgetqueryanswer.query_type = widgetQueryType;
            getprofilewidgetqueryanswer.data = bArr;
            iArr[0] = ConnectionsManager.getInstance(i2).sendRequestTyped(getprofilewidgetqueryanswer, new kc((byte) 0), new o6b(tm3Var, (byte) 14));
        } else {
            if (z2) {
                tL_messages_getBotWidgetQueryAnswer = new TLRPC.TL_messages_getBotWidgetQueryAnswer_layer233();
            } else {
                tL_messages_getBotWidgetQueryAnswer = new TLRPC.TL_messages_getBotWidgetQueryAnswer();
            }
            tL_messages_getBotWidgetQueryAnswer.peer = oc7.r1(i2).i1(txcVar.c);
            tL_messages_getBotWidgetQueryAnswer.msg_id = txcVar.d;
            tL_messages_getBotWidgetQueryAnswer.query_type = widgetQueryType;
            tL_messages_getBotWidgetQueryAnswer.data = bArr;
            iArr[0] = ConnectionsManager.getInstance(i2).sendRequestTyped(tL_messages_getBotWidgetQueryAnswer, new kc((byte) 0), new n45(z2, txcVar, widgetQueryType, bArr, iArr, tm3Var));
        }
    }
}
