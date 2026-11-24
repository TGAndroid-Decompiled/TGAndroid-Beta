package defpackage;

import android.os.Bundle;
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
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.c;
public final class tn6 implements Runnable {
    public final byte a;
    public final int b;
    public final Object c;
    public final Object d;
    public final Object e;

    public tn6(int i, ArrayList arrayList, HashMap hashMap, p8c p8cVar) {
        this.a = (byte) 7;
        this.b = i;
        this.c = arrayList;
        this.d = hashMap;
        this.e = p8cVar;
    }

    private final void a() {
        int i;
        mt9 mt9Var = (mt9) this.c;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.d;
        int i2 = mt9Var.t0;
        if (this.b == mt9Var.e0 && (tLObject instanceof TLRPC.messages_Messages)) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            boolean z = false;
            if (messages_messages instanceof TLRPC.TL_messages_messages) {
                i = ((TLRPC.TL_messages_messages) messages_messages).messages.size();
            } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                i = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
            } else {
                i = 0;
            }
            mt9Var.w = i;
            mt9Var.x = messages_messages.next_rate;
            mt9Var.E = str;
            na7.q1(i2).a4(messages_messages.users, false);
            na7.q1(i2).U3(messages_messages.chats, false);
            for (int i3 = 0; i3 < messages_messages.messages.size(); i3++) {
                mt9Var.y.add(new k27(i2, messages_messages.messages.get(i3), false, true));
            }
            ji3 ji3Var = mt9Var.V;
            if (ji3Var != null) {
                if (mt9Var.E0 > 0) {
                    z = true;
                }
                ji3Var.d(z, true);
            }
            mt9Var.f();
        }
    }

    private final void b() {
        ll4 ll4Var;
        d dVar = (d) this.c;
        TLObject tLObject = (TLObject) this.e;
        p8c p8cVar = (p8c) this.d;
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
                    arrayList.add(Long.valueOf(cf3.n((TLRPC.Peer) vector.objects.get(i2))));
                } catch (Exception unused) {
                }
            }
            ll4Var = new ll4(dVar, i, arrayList);
        } else {
            ll4Var = new ll4(dVar, i, null);
        }
        ll4Var.w2 = p8cVar;
        dVar.showDialog(ll4Var);
    }

    private final void c() {
        String str;
        JSONArray optJSONArray;
        JSONObject jSONObject = (JSONObject) this.e;
        p15 p15Var = ((o15) this.c).c;
        if (p15Var.c((buc) this.d, this.b)) {
            c cVar = p15Var.c;
            String str2 = p15Var.b;
            ez3 ez3Var = p15Var.p;
            String optString = jSONObject.optString("status");
            if ((jSONObject.has("error") && !jSONObject.isNull("error")) || "error".equals(optString)) {
                StringBuilder sb = new StringBuilder("subscription error; id=");
                sb.append(jSONObject.optString("id"));
                sb.append(", code=");
                sb.append(jSONObject.optString("code"));
                ug8.z(", status=", optString, ", error=", sb);
                sb.append(jSONObject.opt("error"));
                sb.append(", message=");
                sb.append(jSONObject.optString("message"));
                p15Var.d(sb.toString());
                p15Var.f("subscription rejected");
                return;
            }
            if ("subscribed".equals(optString)) {
                p15Var.d("subscription acknowledgement: " + jSONObject);
                if (TextUtils.equals(p15Var.f, jSONObject.optString("id"))) {
                    p15Var.e = true;
                    p15Var.j = 0;
                    p15Var.l = SystemClock.elapsedRealtime();
                    gl.r(p15Var.o);
                    gl.r(ez3Var);
                    gl.e3(ez3Var, 15000L);
                    p15Var.d("subscription acknowledged; requested transactions and account state");
                }
            } else if ("pong".equals(optString) && "heartbeat".equals(jSONObject.optString("id"))) {
                p15Var.d("received pong");
                p15Var.l = SystemClock.elapsedRealtime();
            } else if (!p15Var.e) {
                p15Var.d("ignoring message before subscription; type=" + jSONObject.optString("type") + ", status=" + optString);
            } else {
                String optString2 = jSONObject.optString("type");
                if (!"account_state_change".equals(optString2) || c.b(str2, jSONObject.optString("account"))) {
                    if (!"transactions".equals(optString2) && !"account_state_change".equals(optString2) && !"trace_invalidated".equals(optString2)) {
                        p15Var.d("ignoring message; type=" + optString2 + ", status=" + optString);
                        return;
                    }
                    JSONArray optJSONArray2 = jSONObject.optJSONArray("transactions");
                    JSONObject optJSONObject = jSONObject.optJSONObject("state");
                    StringBuilder p = ug8.p("event type=", optString2, ", finality=");
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
                    p15Var.d(p.toString());
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
                                    p15Var.d("could not filter streaming transactions");
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
        qb5 qb5Var = (qb5) this.c;
        ArrayList arrayList = (ArrayList) this.e;
        qb5Var.getClass();
        String lowerCase = ((String) this.d).trim().toLowerCase();
        int length = lowerCase.length();
        int i2 = this.b;
        if (length == 0) {
            gl.d3(new j45(qb5Var, i2, new ArrayList(), (byte) 1));
            return;
        }
        boolean z = 0;
        String S0 = k96.D0().S0(lowerCase, true, false);
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
                B1 = k27.B1(((TLRPC.ChannelParticipant) tLObject).peer);
            } else {
                i4++;
                z = 0;
            }
            TLRPC.User V1 = na7.q1(qb5Var.x.a).V1(Long.valueOf(B1));
            if (!l7c.C(V1)) {
                String lowerCase2 = l7c.q(V1).toLowerCase();
                String S02 = k96.D0().S0(lowerCase2, true, z);
                if (lowerCase2.equals(S02)) {
                    S02 = null;
                }
                int i5 = z;
                int i6 = i5;
                while (true) {
                    if (i5 < i3) {
                        String str = strArr[i5];
                        if (!lowerCase2.startsWith(str) && !de9.t(" ", str, lowerCase2) && (S02 == null || (!S02.startsWith(str) && !de9.t(" ", str, S02)))) {
                            String o = l7c.o(V1);
                            if (o != null && o.startsWith(str)) {
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
        gl.d3(new j45(qb5Var, i2, arrayList2, (byte) 1));
    }

    private final void e() {
        boolean z;
        dd5 dd5Var = (dd5) this.c;
        TLObject tLObject = (TLObject) this.e;
        String str = (String) this.d;
        int i = dd5Var.Q;
        ArrayList arrayList = dd5Var.R;
        if (this.b == dd5Var.W) {
            boolean isEmpty = arrayList.isEmpty();
            dd5Var.V = false;
            if (tLObject instanceof TLRPC.messages_Messages) {
                TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
                if (messages_messages instanceof TLRPC.TL_messages_messages) {
                    dd5Var.Z = ((TLRPC.TL_messages_messages) messages_messages).messages.size();
                } else if (messages_messages instanceof TLRPC.TL_messages_messagesSlice) {
                    dd5Var.Z = ((TLRPC.TL_messages_messagesSlice) messages_messages).count;
                }
                dd5Var.c0 = messages_messages.next_rate;
                na7.q1(i).a4(messages_messages.users, false);
                na7.q1(i).U3(messages_messages.chats, false);
                for (int i2 = 0; i2 < messages_messages.messages.size(); i2++) {
                    k27 k27Var = new k27(i, messages_messages.messages.get(i2), false, true);
                    k27Var.J5(str, true);
                    arrayList.add(k27Var);
                }
                if (arrayList.size() >= dd5Var.Z) {
                    z = true;
                } else {
                    z = false;
                }
                dd5Var.Y = z;
                dd5Var.X();
            } else {
                dd5Var.Y = true;
                dd5Var.Z = arrayList.size();
            }
            dd5Var.O(true);
            if (isEmpty) {
                ((kt9) dd5Var).f0.w0.g1(0, 0);
            }
        }
    }

    private final void f() {
        LaunchActivity launchActivity = (LaunchActivity) this.c;
        String str = LaunchActivity.C1;
        kk7.f(this.b).k(kk7.s, new Object[0]);
        Bundle bundle = new Bundle();
        bundle.putBoolean("scrollToTopOnResume", true);
        bundle.putLong("chat_id", ((TLRPC.Chat) this.d).id);
        if (!na7.q1(launchActivity.P).A(bundle, (cj3) this.e, null, null)) {
            return;
        }
        launchActivity.u0(new mu1(bundle), true, false);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.tn6.run():void");
    }

    public tn6(n39 n39Var, int i, TLObject tLObject, String str, byte b) {
        this.a = b;
        this.c = n39Var;
        this.b = i;
        this.e = tLObject;
        this.d = str;
    }

    public tn6(Object obj, int i, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
        this.d = obj2;
        this.e = obj3;
    }

    public tn6(Object obj, Object obj2, int i, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.b = i;
        this.e = obj3;
    }

    public tn6(Object obj, Object obj2, Object obj3, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = i;
    }

    public tn6(d dVar, TLObject tLObject, int i, Object obj, byte b) {
        this.a = b;
        this.c = dVar;
        this.e = tLObject;
        this.b = i;
        this.d = obj;
    }
}
