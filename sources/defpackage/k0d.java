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
public abstract class k0d {
    public static boolean i;
    public static boolean j;
    public static final ConcurrentHashMap a = new ConcurrentHashMap();
    public static final ConcurrentHashMap b = new ConcurrentHashMap();
    public static final HashMap c = new HashMap();
    public static final HashMap d = new HashMap();
    public static final osa e = new osa((byte) 22);
    public static final ArrayList f = new ArrayList();
    public static final ArrayList g = new ArrayList();
    public static final ArrayList h = new ArrayList();
    public static final boolean[] k = new boolean[4];
    public static final HashMap l = new HashMap();
    public static final z3f m = new z3f((byte) 29);

    public static boolean A() {
        for (h0d h0dVar : a.values()) {
            q0d q0dVar = h0dVar.v;
            nm9 nm9Var = h0dVar.y;
            if (h0dVar.z != 0 && q0dVar != null && nm9Var != null && !h0dVar.L && !q0dVar.e()) {
                String j2 = j(h0dVar.a, q0dVar, nm9Var.t0());
                if (j2.equals("placeholder") || j2.startsWith("cache of width")) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void B(h0d h0dVar) {
        q0d q0dVar = h0dVar.v;
        if (h0dVar.L) {
            if (h0dVar.D >= 2) {
                return;
            }
            h0dVar.L = false;
            q0dVar.n();
        }
        q0dVar.a();
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
        for (h0d h0dVar : a.values()) {
            if (h0dVar.v != null && h0dVar.z == 0 && !g.contains(h0dVar)) {
                arrayList.add(h0dVar);
            }
        }
        Collections.sort(arrayList, new fna((byte) 17));
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            q0d q0dVar = ((h0d) arrayList.get(i2)).v;
            if (i2 >= 4) {
                q0dVar.n();
            }
            if (i2 >= 12 && q0dVar.e == null) {
                q0dVar.f = null;
            }
        }
    }

    public static void F() {
        long j2;
        q0d q0dVar;
        StringBuilder sb;
        long j3;
        HashMap hashMap = new HashMap();
        for (h0d h0dVar : a.values()) {
            long j4 = h0dVar.l;
            boolean z = h0dVar.o;
            if (j4 != 0 || z) {
                if (!h0dVar.k && h0dVar.z != 0 && !j && (q0dVar = h0dVar.v) != null && q0dVar.e != null && q0dVar.z) {
                    int i2 = h0dVar.b;
                    if (z) {
                        sb = new StringBuilder();
                        sb.append(i2);
                        sb.append("/bot");
                        j3 = h0dVar.n;
                    } else {
                        sb = new StringBuilder();
                        sb.append(i2);
                        sb.append("/");
                        j3 = h0dVar.l;
                    }
                    sb.append(j3);
                    hashMap.put(sb.toString(), h0dVar);
                }
            }
        }
        HashMap hashMap2 = l;
        Iterator it = hashMap2.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!hashMap.containsKey(entry.getKey())) {
                j0d j0dVar = (j0d) entry.getValue();
                hl.r(j0dVar.g);
                if (j0dVar.f != 0) {
                    ConnectionsManager.getInstance(j0dVar.a).cancelRequest(j0dVar.f, true);
                }
                it.remove();
            }
        }
        for (Map.Entry entry2 : hashMap.entrySet()) {
            if (!hashMap2.containsKey(entry2.getKey())) {
                h0d h0dVar2 = (h0d) entry2.getValue();
                int i3 = h0dVar2.b;
                long j5 = h0dVar2.l;
                if (h0dVar2.o) {
                    j2 = h0dVar2.n;
                } else {
                    j2 = 0;
                }
                j0d j0dVar2 = new j0d(j5, i3, j2);
                j0dVar2.d = h0dVar2.s;
                hashMap2.put((String) entry2.getKey(), j0dVar2);
                hl.d3(j0dVar2.g, j0dVar2.e * 1000);
            }
        }
    }

    public static boolean G(h0d h0dVar) {
        if (h0dVar.i && !h0dVar.k && uc7.s1(h0dVar.b).l4.v0.f) {
            return true;
        }
        return false;
    }

    public static void a(h0d h0dVar, String str, String str2) {
        if (!TextUtils.equals(h0dVar.q, str) || !TextUtils.equals(h0dVar.r, str2)) {
            h0dVar.q = str;
            h0dVar.r = str2;
            TLRPC.TL_messageMediaWidget tL_messageMediaWidget = h0dVar.t;
            if (tL_messageMediaWidget != null) {
                tL_messageMediaWidget.chat_data = str;
                tL_messageMediaWidget.public_data = str2;
                tL_messageMediaWidget.public_data_hash = h0dVar.s;
            }
            q0d q0dVar = h0dVar.v;
            if (q0dVar != null) {
                q0dVar.i(f(str, str2));
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
                hl.c3((Runnable) obj);
            }
        }
    }

    public static int c(String str, q0d q0dVar, int i2) {
        h0d h0dVar;
        int i3;
        int i4;
        int i5;
        if (m(str)) {
            h0dVar = (h0d) a.get(str);
        } else {
            h0dVar = null;
        }
        int i6 = 0;
        if (h0dVar == null) {
            return 0;
        }
        if (h0dVar.f > 0) {
            return hl.L(Math.max(50, Math.min(600, i3)));
        }
        if (q0dVar != null && Math.abs(q0dVar.j - i2) <= 1) {
            i4 = q0dVar.h;
        } else {
            i4 = 0;
        }
        if (i4 > 0) {
            return Math.min(hl.L(600.0f), Math.max(hl.L(50.0f), i4));
        }
        i0d i0dVar = (i0d) b.get(h0dVar.a());
        if (i0dVar != null) {
            int e2 = e(i2);
            synchronized (i0dVar) {
                ArrayList arrayList = i0dVar.a;
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
        return hl.L(Math.max(50, Math.min(600, i6)));
    }

    public static String d(h0d h0dVar) {
        TLRPC.User user;
        try {
            JSONObject jSONObject = new JSONObject();
            boolean z = h0dVar.h;
            boolean z2 = h0dVar.i;
            jSONObject.put("isCopy", z);
            jSONObject.put("canQuery", z2);
            jSONObject.put("backgroundQuery", h0dVar.j);
            jSONObject.put("preview", h0dVar.k);
            jSONObject.put("wallet", G(h0dVar));
            Object obj = h0dVar.m;
            if (obj != null) {
                jSONObject.put("chatType", obj);
            }
            if (h0dVar.o) {
                jSONObject.put("surface", "profile");
            }
            if (z2) {
                user = yac.h(h0dVar.b).f();
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
                String p = lbc.p(user);
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
        return Math.round(i2 / hl.p);
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

    public static h0d g(q0d q0dVar) {
        if (q0dVar == null) {
            return null;
        }
        return (h0d) a.get(q0dVar.a);
    }

    public static q0d h(String str) {
        h0d h0dVar;
        String str2;
        if (m(str)) {
            h0dVar = (h0d) a.get(str);
        } else {
            h0dVar = null;
        }
        if (h0dVar == null || z.a()) {
            return null;
        }
        synchronized (h0dVar) {
            q0d q0dVar = h0dVar.v;
            if (q0dVar == null) {
                String str3 = h0dVar.u;
                if (str3 == null) {
                    str3 = l(h0dVar.g);
                    h0dVar.u = str3;
                }
                if (str3 == null) {
                    return null;
                }
                q0d q0dVar2 = new q0d(a.b, h0dVar.a, h0dVar.u);
                try {
                    str2 = ob6.D0().y.toLanguageTag();
                } catch (Exception unused) {
                    str2 = null;
                }
                q0dVar2.s = str2;
                q0dVar2.t = null;
                int i2 = h0dVar.b;
                long j2 = h0dVar.n;
                long j3 = 0;
                if (j2 != 0) {
                    j3 = j2 ^ ((i2 + 1) << 56);
                }
                q0dVar2.A = j3;
                String d2 = d(h0dVar);
                if (d2 != null) {
                    q0dVar2.v = d2;
                }
                q0dVar2.i(f(h0dVar.q, h0dVar.r));
                q0dVar2.d = m;
                h0dVar.v = q0dVar2;
                q0dVar = q0dVar2;
            }
            return q0dVar;
        }
    }

    public static void i() {
        JSONObject jSONObject;
        String str;
        hl.r(e);
        HashMap hashMap = d;
        if (hashMap.isEmpty()) {
            return;
        }
        for (h0d h0dVar : hashMap.values()) {
            JSONObject jSONObject2 = (JSONObject) c.get(h0dVar.a());
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
            kf7 a0 = kf7.a0(h0dVar.b);
            a0.a.c(new r77(a0, str2, h0dVar.c, h0dVar.d, (byte) 14));
        }
        hashMap.clear();
    }

    public static String j(String str, q0d q0dVar, int i2) {
        h0d h0dVar;
        int[] iArr = null;
        if (m(str)) {
            h0dVar = (h0d) a.get(str);
        } else {
            h0dVar = null;
        }
        if (h0dVar == null) {
            return "none";
        }
        if (h0dVar.f > 0) {
            return "anchor " + h0dVar.f;
        } else if (q0dVar != null && Math.abs(q0dVar.j - i2) <= 1 && q0dVar.h > 0) {
            return "frame";
        } else {
            i0d i0dVar = (i0d) b.get(h0dVar.a());
            if (i0dVar != null) {
                int e2 = e(i2);
                synchronized (i0dVar) {
                    ArrayList arrayList = i0dVar.a;
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

    public static i0d k(String str) {
        ConcurrentHashMap concurrentHashMap = b;
        i0d i0dVar = (i0d) concurrentHashMap.get(str);
        if (i0dVar == null) {
            i0d i0dVar2 = new i0d();
            i0d i0dVar3 = (i0d) concurrentHashMap.putIfAbsent(str, i0dVar2);
            if (i0dVar3 == null) {
                return i0dVar2;
            }
            return i0dVar3;
        }
        return i0dVar;
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
                if (f11.a) {
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
                    cc4.b(sb.toString());
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
            cc4.g(e2, true);
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
                h0d h0dVar = null;
                for (int size = arrayList2.size() - 1; size >= 0; size--) {
                    h0d h0dVar2 = (h0d) arrayList2.get(size);
                    if (h0dVar2.B) {
                        long j3 = 9223372036854775806L;
                        for (h0d h0dVar3 : a.values()) {
                            if (h0dVar3.z != 0 && h0dVar3.b == h0dVar2.b && h0dVar3.c == h0dVar2.c) {
                                j3 = Math.min(j3, Math.abs(h0dVar3.d - h0dVar2.d));
                            }
                        }
                        if (j3 < j2) {
                            h0dVar = h0dVar2;
                            j2 = j3;
                        }
                    }
                }
                if (h0dVar != null) {
                    arrayList2.remove(h0dVar);
                    q0d q0dVar = h0dVar.v;
                    if (q0dVar != null && !h0dVar.L && h0dVar.z <= 0) {
                        String j4 = j(h0dVar.a, q0dVar, h0dVar.M);
                        if (j4.equals("placeholder") || j4.startsWith("cache of width")) {
                            q0dVar.m(h0dVar.M);
                            if (q0dVar.r == null) {
                                q0dVar.k(c1d.a(null, h0dVar.N));
                            }
                            if (!q0dVar.n) {
                                arrayList.add(h0dVar);
                                B(h0dVar);
                                hl.d3(h0dVar.O, 4000L);
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

    public static nm9 p(ArrayList arrayList) {
        int size = arrayList.size();
        nm9 nm9Var = null;
        int i2 = 0;
        while (i2 < size) {
            Object obj = arrayList.get(i2);
            i2++;
            nm9 nm9Var2 = (nm9) obj;
            if (nm9Var == null || nm9Var2.d0 > nm9Var.d0) {
                nm9Var = nm9Var2;
            }
        }
        return nm9Var;
    }

    public static void q(boolean z) {
        boolean z2;
        if (j == z) {
            return;
        }
        j = z;
        for (h0d h0dVar : a.values()) {
            q0d q0dVar = h0dVar.v;
            if (q0dVar != null && q0dVar.o != z) {
                q0dVar.o = z;
                z zVar = q0dVar.e;
                if (zVar != null) {
                    if (q0dVar.m && !z) {
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

    public static void r(q0d q0dVar) {
        h0d g2 = g(q0dVar);
        if (g2 == null) {
            return;
        }
        g2.z = Math.max(0, g2.z - 1);
        g2.A = System.currentTimeMillis();
        E();
        i();
        F();
    }

    public static void s(h0d h0dVar) {
        hl.r(h0dVar.O);
        if (!g.remove(h0dVar)) {
            return;
        }
        E();
        o();
    }

    public static void t(int i2, String str, long j2) {
        for (h0d h0dVar : a.values()) {
            if (h0dVar.o && h0dVar.b == i2 && h0dVar.n == j2) {
                a(h0dVar, D(str), h0dVar.r);
            }
        }
    }

    public static void u(q0d q0dVar) {
        boolean z;
        h0d g2 = g(q0dVar);
        if (g2 == null) {
            return;
        }
        g2.z++;
        g2.A = System.currentTimeMillis();
        boolean z2 = j;
        if (q0dVar.o != z2) {
            q0dVar.o = z2;
            z zVar = q0dVar.e;
            if (zVar != null) {
                if (q0dVar.m && !z2) {
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
        hl.c3(new gw0(i2, (byte) 17));
    }

    public static String w(int i2, TLRPC.BotInlineResult botInlineResult) {
        TLRPC.TL_botInlineMessageWidget tL_botInlineMessageWidget = (TLRPC.TL_botInlineMessageWidget) botInlineResult.send_message;
        StringBuilder m2 = uh9.m(i2, "tg-widget:preview/", "/");
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
            h0d h0dVar = new h0d(sb, i2, 0L, 0, 0L, tL_messageMediaWidget, true);
            h0dVar.B = true;
            concurrentHashMap.putIfAbsent(sb, h0dVar);
        }
        return sb;
    }

    public static void x(h0d h0dVar, q0d q0dVar, long j2, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr) {
        boolean[] zArr = new boolean[1];
        int[] iArr = new int[1];
        da7 da7Var = new da7(zArr, ConnectionsManager.getInstance(h0dVar.b), iArr, q0dVar, j2, (byte) 24);
        z(h0dVar, widgetQueryType, bArr, iArr, new am3(zArr, da7Var, q0dVar, j2));
        hl.d3(da7Var, 30000L);
    }

    public static void y(String str, Set set) {
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((String) it.next()).startsWith(str)) {
                it.remove();
            }
        }
    }

    public static void z(h0d h0dVar, TLRPC.WidgetQueryType widgetQueryType, byte[] bArr, int[] iArr, am3 am3Var) {
        boolean z;
        TLRPC.TL_messages_getBotWidgetQueryAnswer tL_messages_getBotWidgetQueryAnswer;
        if ((widgetQueryType instanceof TLRPC.TL_widgetQueryTypeData) && !((TLRPC.TL_widgetQueryTypeData) widgetQueryType).with_wallet) {
            z = true;
        } else {
            z = false;
        }
        int i2 = h0dVar.b;
        boolean z2 = k[i2];
        if (z2 && !z) {
            TLRPC.TL_error tL_error = new TLRPC.TL_error();
            tL_error.code = 400;
            tL_error.text = "WIDGET_QUERY_TYPE_UNSUPPORTED";
            hl.c3(new zwc(am3Var, tL_error, (byte) 11));
        } else if (h0dVar.o) {
            TL_bots.getProfileWidgetQueryAnswer getprofilewidgetqueryanswer = new TL_bots.getProfileWidgetQueryAnswer();
            getprofilewidgetqueryanswer.bot = uc7.s1(i2).o1(h0dVar.n);
            getprofilewidgetqueryanswer.query_type = widgetQueryType;
            getprofilewidgetqueryanswer.data = bArr;
            iArr[0] = ConnectionsManager.getInstance(i2).sendRequestTyped(getprofilewidgetqueryanswer, new ic((byte) 0), new l8b(am3Var, (byte) 14));
        } else {
            if (z2) {
                tL_messages_getBotWidgetQueryAnswer = new TLRPC.TL_messages_getBotWidgetQueryAnswer_layer233();
            } else {
                tL_messages_getBotWidgetQueryAnswer = new TLRPC.TL_messages_getBotWidgetQueryAnswer();
            }
            tL_messages_getBotWidgetQueryAnswer.peer = uc7.s1(i2).j1(h0dVar.c);
            tL_messages_getBotWidgetQueryAnswer.msg_id = h0dVar.d;
            tL_messages_getBotWidgetQueryAnswer.query_type = widgetQueryType;
            tL_messages_getBotWidgetQueryAnswer.data = bArr;
            iArr[0] = ConnectionsManager.getInstance(i2).sendRequestTyped(tL_messages_getBotWidgetQueryAnswer, new ic((byte) 0), new r45(z2, h0dVar, widgetQueryType, bArr, iArr, am3Var));
        }
    }
}
