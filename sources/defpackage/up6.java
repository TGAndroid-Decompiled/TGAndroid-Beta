package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Wallet.c;
public final class up6 implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public up6(int i, ArrayList arrayList, HashMap hashMap, qac qacVar) {
        this.a = (byte) 7;
        this.b = i;
        this.c = arrayList;
        this.d = hashMap;
        this.e = qacVar;
    }

    private final void a() {
        ln4 ln4Var;
        d dVar = (d) this.c;
        TLObject tLObject = (TLObject) this.e;
        qac qacVar = (qac) this.d;
        if (dVar.getParentActivity() == null) {
            return;
        }
        boolean z = tLObject instanceof Vector;
        int i = this.b;
        if (z) {
            Vector vector = (Vector) tLObject;
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < vector.objects.size(); i2++) {
                try {
                    arrayList.add(Long.valueOf(pg3.n((TLRPC.Peer) vector.objects.get(i2))));
                } catch (Exception unused) {
                }
            }
            ln4Var = new ln4(dVar, i, arrayList);
        } else {
            ln4Var = new ln4(dVar, i, null);
        }
        ln4Var.w2 = qacVar;
        dVar.showDialog(ln4Var);
    }

    private final void b() {
        p35 p35Var = (p35) this.c;
        String str = (String) this.e;
        int i = this.b;
        if (p35Var.c((cwc) this.d, i)) {
            p35Var.f(str);
            return;
        }
        p35Var.d("ignoring stale socket callback; attempt=" + i + ", " + str);
    }

    private final void c() {
        String str;
        JSONArray optJSONArray;
        JSONObject jSONObject = (JSONObject) this.e;
        p35 p35Var = ((o35) this.c).c;
        if (p35Var.c((cwc) this.d, this.b)) {
            c cVar = p35Var.c;
            String str2 = p35Var.b;
            o04 o04Var = p35Var.p;
            String optString = jSONObject.optString("status");
            if ((jSONObject.has("error") && !jSONObject.isNull("error")) || "error".equals(optString)) {
                StringBuilder sb = new StringBuilder("subscription error; id=");
                sb.append(jSONObject.optString("id"));
                sb.append(", code=");
                sb.append(jSONObject.optString("code"));
                wi8.z(", status=", optString, ", error=", sb);
                sb.append(jSONObject.opt("error"));
                sb.append(", message=");
                sb.append(jSONObject.optString("message"));
                p35Var.d(sb.toString());
                p35Var.f("subscription rejected");
                return;
            }
            if ("subscribed".equals(optString)) {
                p35Var.d("subscription acknowledgement: " + jSONObject);
                if (TextUtils.equals(p35Var.f, jSONObject.optString("id"))) {
                    p35Var.e = true;
                    p35Var.j = 0;
                    p35Var.l = SystemClock.elapsedRealtime();
                    gm.r(p35Var.o);
                    gm.r(o04Var);
                    gm.d3(o04Var, 15000L);
                    p35Var.d("subscription acknowledged; requested transactions and account state");
                }
            } else if ("pong".equals(optString) && "heartbeat".equals(jSONObject.optString("id"))) {
                p35Var.d("received pong");
                p35Var.l = SystemClock.elapsedRealtime();
            } else if (!p35Var.e) {
                p35Var.d("ignoring message before subscription; type=" + jSONObject.optString("type") + ", status=" + optString);
            } else {
                String optString2 = jSONObject.optString("type");
                if (!"account_state_change".equals(optString2) || c.b(str2, jSONObject.optString("account"))) {
                    if (!"transactions".equals(optString2) && !"account_state_change".equals(optString2) && !"trace_invalidated".equals(optString2)) {
                        p35Var.d("ignoring message; type=" + optString2 + ", status=" + optString);
                        return;
                    }
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("transactions");
                    JSONObject optJSONObject = jSONObject.optJSONObject("state");
                    StringBuilder p = wi8.p("event type=", optString2, ", finality=");
                    p.append(jSONObject.optString("finality"));
                    p.append(", trace=");
                    p.append(jSONObject.optString("trace_external_hash_norm"));
                    String str3 = "";
                    if (optJSONArray2 == null) {
                        str = "";
                    } else {
                        str = ", transactions=" + optJSONArray2.length();
                    }
                    p.append(str);
                    if (optJSONObject != null) {
                        str3 = ", balance=" + optJSONObject.optString("balance");
                    }
                    p.append(str3);
                    p35Var.d(p.toString());
                    if ("transactions".equals(optString2)) {
                        if (str2 != null && (optJSONArray = jSONObject.optJSONArray("transactions")) != null) {
                            JSONArray jSONArray = new JSONArray();
                            for (int i = 0; i < optJSONArray.length(); i++) {
                                JSONObject optJSONObject2 = optJSONArray.optJSONObject(i);
                                if (optJSONObject2 != null && c.b(str2, optJSONObject2.optString("account"))) {
                                    jSONArray.put(optJSONObject2);
                                }
                            }
                            if (jSONArray.length() != 0) {
                                try {
                                    JSONObject jSONObject2 = new JSONObject(jSONObject.toString());
                                    jSONObject2.put("transactions", jSONArray);
                                    cVar.T(jSONObject2);
                                    return;
                                } catch (JSONException unused) {
                                    p35Var.d("could not filter streaming transactions");
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    cVar.T(jSONObject);
                }
            }
        }
    }

    private final void d() {
        int i;
        long B1;
        od5 od5Var = (od5) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        od5Var.getClass();
        String lowerCase = ((String) this.d).trim().toLowerCase();
        int length = lowerCase.length();
        int i2 = this.b;
        if (length == 0) {
            gm.c3(new h65(od5Var, i2, new ArrayList(), (byte) 1));
            return;
        }
        boolean z = 0;
        String S0 = jb6.D0().S0(lowerCase, true, false);
        S0 = (lowerCase.equals(S0) || S0.length() == 0) ? null : null;
        if (S0 != null) {
            i = 1;
        } else {
            i = 0;
        }
        int i3 = i + 1;
        String[] strArr = new String[i3];
        strArr[0] = lowerCase;
        if (S0 != null) {
            strArr[1] = S0;
        }
        ArrayList arrayList2 = new ArrayList();
        int size = arrayList.size();
        int i4 = 0;
        while (i4 < size) {
            TLObject tLObject = (TLObject) arrayList.get(i4);
            if (tLObject instanceof TLRPC.ChatParticipant) {
                B1 = ((TLRPC.ChatParticipant) tLObject).user_id;
            } else if (tLObject instanceof TLRPC.ChannelParticipant) {
                B1 = k47.B1(((TLRPC.ChannelParticipant) tLObject).peer);
            } else {
                i4++;
                z = 0;
            }
            TLRPC.User W1 = oc7.r1(od5Var.x.a).W1(Long.valueOf(B1));
            if (!m9c.D(W1)) {
                String lowerCase2 = m9c.r(W1).toLowerCase();
                String S02 = jb6.D0().S0(lowerCase2, true, z);
                if (lowerCase2.equals(S02)) {
                    S02 = null;
                }
                int i5 = z;
                int i6 = i5;
                while (true) {
                    if (i5 < i3) {
                        String str = strArr[i5];
                        if (!lowerCase2.startsWith(str) && !hg9.s(" ", str, lowerCase2) && (S02 == null || (!S02.startsWith(str) && !hg9.s(" ", str, S02)))) {
                            String p = m9c.p(W1);
                            if (p != null && p.startsWith(str)) {
                                i6 = 2;
                            }
                        } else {
                            i6 = 1;
                        }
                        if (i6 != 0) {
                            arrayList2.add(tLObject);
                            break;
                        }
                        i5++;
                    }
                }
            }
            i4++;
            z = 0;
        }
        gm.c3(new h65(od5Var, i2, arrayList2, (byte) 1));
    }

    private final void e() {
        boolean z;
        bf5 bf5Var = (bf5) this.c;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.d;
        int i = bf5Var.Q;
        ArrayList arrayList = bf5Var.R;
        if (this.b == bf5Var.W) {
            boolean isEmpty = arrayList.isEmpty();
            bf5Var.V = false;
            if (tLObject instanceof TLRPC.messages_Messages) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                if (messages_messages instanceof TLRPC.TL_messages_messages) {
                    bf5Var.Z = ((TLRPC.TL_messages_messages) messages_messages).messages.size();
                } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                    bf5Var.Z = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
                }
                bf5Var.c0 = messages_messages.next_rate;
                oc7.r1(i).d4(messages_messages.users, false);
                oc7.r1(i).X3(messages_messages.chats, false);
                for (int i2 = 0; i2 < messages_messages.messages.size(); i2++) {
                    k47 k47Var = new k47(i, messages_messages.messages.get(i2), false, true);
                    k47Var.J5(str, true);
                    arrayList.add(k47Var);
                }
                if (arrayList.size() >= bf5Var.Z) {
                    z = true;
                } else {
                    z = false;
                }
                bf5Var.Y = z;
                bf5Var.X();
            } else {
                bf5Var.Y = true;
                bf5Var.Z = arrayList.size();
            }
            bf5Var.O(true);
            if (isEmpty) {
                ((mv9) bf5Var).f0.w0.g1(0, 0);
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.up6.run():void");
    }

    public up6(q59 q59Var, int i, TLObject tLObject, String str, byte b) {
        this.a = b;
        this.c = q59Var;
        this.b = i;
        this.e = tLObject;
        this.d = str;
    }

    public up6(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public up6(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public up6(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    public up6(d dVar, TLObject tLObject, int i, Object obj, byte b) {
        this.a = b;
        this.c = dVar;
        this.e = tLObject;
        this.b = i;
        this.d = obj;
    }
}
