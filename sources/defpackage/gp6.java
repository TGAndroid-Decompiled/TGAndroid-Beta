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
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Wallet.c;
public final class gp6 implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public gp6(int i, ArrayList arrayList, HashMap hashMap, pcc pccVar) {
        this.a = (byte) 7;
        this.b = i;
        this.c = arrayList;
        this.d = hashMap;
        this.e = pccVar;
    }

    private final void a() {
        qn4 qn4Var;
        e eVar = (e) this.c;
        TLObject tLObject = (TLObject) this.e;
        pcc pccVar = (pcc) this.d;
        if (eVar.getParentActivity() == null) {
            return;
        }
        boolean z = tLObject instanceof Vector;
        int i = this.b;
        if (z) {
            Vector vector = (Vector) tLObject;
            ArrayList arrayList = new ArrayList();
            for (int i2 = 0; i2 < vector.objects.size(); i2++) {
                try {
                    arrayList.add(Long.valueOf(wf3.n((TLRPC.Peer) vector.objects.get(i2))));
                } catch (Exception unused) {
                }
            }
            qn4Var = new qn4(eVar, i, arrayList);
        } else {
            qn4Var = new qn4(eVar, i, null);
        }
        qn4Var.w2 = pccVar;
        eVar.showDialog(qn4Var);
    }

    private final void b() {
        t35 t35Var = (t35) this.c;
        String str = (String) this.e;
        int i = this.b;
        if (t35Var.c((ryc) this.d, i)) {
            t35Var.f(str);
            return;
        }
        t35Var.d("ignoring stale socket callback; attempt=" + i + ", " + str);
    }

    private final void c() {
        String str;
        JSONArray optJSONArray;
        JSONObject jSONObject = (JSONObject) this.e;
        t35 t35Var = ((s35) this.c).c;
        if (t35Var.c((ryc) this.d, this.b)) {
            c cVar = t35Var.c;
            String str2 = t35Var.b;
            zz3 zz3Var = t35Var.p;
            String optString = jSONObject.optString("status");
            if ((jSONObject.has("error") && !jSONObject.isNull("error")) || "error".equals(optString)) {
                StringBuilder sb = new StringBuilder("subscription error; id=");
                sb.append(jSONObject.optString("id"));
                sb.append(", code=");
                sb.append(jSONObject.optString("code"));
                ik8.z(", status=", optString, ", error=", sb);
                sb.append(jSONObject.opt("error"));
                sb.append(", message=");
                sb.append(jSONObject.optString("message"));
                t35Var.d(sb.toString());
                t35Var.f("subscription rejected");
                return;
            }
            if ("subscribed".equals(optString)) {
                t35Var.d("subscription acknowledgement: " + jSONObject);
                if (TextUtils.equals(t35Var.f, jSONObject.optString("id"))) {
                    t35Var.e = true;
                    t35Var.j = 0;
                    t35Var.l = SystemClock.elapsedRealtime();
                    hl.r(t35Var.o);
                    hl.r(zz3Var);
                    hl.d3(zz3Var, 15000L);
                    t35Var.d("subscription acknowledged; requested transactions and account state");
                }
            } else if ("pong".equals(optString) && "heartbeat".equals(jSONObject.optString("id"))) {
                t35Var.d("received pong");
                t35Var.l = SystemClock.elapsedRealtime();
            } else if (!t35Var.e) {
                t35Var.d("ignoring message before subscription; type=" + jSONObject.optString("type") + ", status=" + optString);
            } else {
                String optString2 = jSONObject.optString("type");
                if (!"account_state_change".equals(optString2) || c.b(str2, jSONObject.optString("account"))) {
                    if (!"transactions".equals(optString2) && !"account_state_change".equals(optString2) && !"trace_invalidated".equals(optString2)) {
                        t35Var.d("ignoring message; type=" + optString2 + ", status=" + optString);
                        return;
                    }
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("transactions");
                    JSONObject optJSONObject = jSONObject.optJSONObject("state");
                    StringBuilder p = ik8.p("event type=", optString2, ", finality=");
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
                    t35Var.d(p.toString());
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
                                    cVar.U(jSONObject2);
                                    return;
                                } catch (JSONException unused) {
                                    t35Var.d("could not filter streaming transactions");
                                    return;
                                }
                            }
                            return;
                        }
                        return;
                    }
                    cVar.U(jSONObject);
                }
            }
        }
    }

    private final void d() {
        int i;
        long B1;
        rd5 rd5Var = (rd5) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        rd5Var.getClass();
        String lowerCase = ((String) this.d).trim().toLowerCase();
        int length = lowerCase.length();
        int i2 = this.b;
        if (length == 0) {
            hl.c3(new l65(rd5Var, i2, new ArrayList(), (byte) 1));
            return;
        }
        boolean z = 0;
        String S0 = ob6.D0().S0(lowerCase, true, false);
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
                B1 = r47.B1(((TLRPC.ChannelParticipant) tLObject).peer);
            } else {
                i4++;
                z = 0;
            }
            TLRPC.User X1 = uc7.s1(rd5Var.x.a).X1(Long.valueOf(B1));
            if (!lbc.D(X1)) {
                String lowerCase2 = lbc.r(X1).toLowerCase();
                String S02 = ob6.D0().S0(lowerCase2, true, z);
                if (lowerCase2.equals(S02)) {
                    S02 = null;
                }
                int i5 = z;
                int i6 = i5;
                while (true) {
                    if (i5 < i3) {
                        String str = strArr[i5];
                        if (!lowerCase2.startsWith(str) && !uh9.t(" ", str, lowerCase2) && (S02 == null || (!S02.startsWith(str) && !uh9.t(" ", str, S02)))) {
                            String p = lbc.p(X1);
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
        hl.c3(new l65(rd5Var, i2, arrayList2, (byte) 1));
    }

    private final void e() {
        boolean z;
        ef5 ef5Var = (ef5) this.c;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.d;
        int i = ef5Var.Q;
        ArrayList arrayList = ef5Var.R;
        if (this.b == ef5Var.W) {
            boolean isEmpty = arrayList.isEmpty();
            ef5Var.V = false;
            if (tLObject instanceof TLRPC.messages_Messages) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                if (messages_messages instanceof TLRPC.TL_messages_messages) {
                    ef5Var.Z = ((TLRPC.TL_messages_messages) messages_messages).messages.size();
                } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                    ef5Var.Z = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
                }
                ef5Var.c0 = messages_messages.next_rate;
                uc7.s1(i).j4(messages_messages.users, false);
                uc7.s1(i).c4(messages_messages.chats, false);
                for (int i2 = 0; i2 < messages_messages.messages.size(); i2++) {
                    r47 r47Var = new r47(i, messages_messages.messages.get(i2), false, true);
                    r47Var.J5(str, true);
                    arrayList.add(r47Var);
                }
                if (arrayList.size() >= ef5Var.Z) {
                    z = true;
                } else {
                    z = false;
                }
                ef5Var.Y = z;
                ef5Var.X();
            } else {
                ef5Var.Y = true;
                ef5Var.Z = arrayList.size();
            }
            ef5Var.O(true);
            if (isEmpty) {
                ((ex9) ef5Var).f0.w0.g1(0, 0);
            }
        }
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.gp6.run():void");
    }

    public gp6(c79 c79Var, int i, TLObject tLObject, String str, byte b) {
        this.a = b;
        this.c = c79Var;
        this.b = i;
        this.e = tLObject;
        this.d = str;
    }

    public gp6(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public gp6(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public gp6(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    public gp6(e eVar, TLObject tLObject, int i, Object obj, byte b) {
        this.a = b;
        this.c = eVar;
        this.e = tLObject;
        this.b = i;
        this.d = obj;
    }
}
