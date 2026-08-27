package ka;

import ad.p;
import android.util.Log;
import h7.k6;
import id.c0;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Serializable;
import java.net.URLConnection;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
import kotlin.jvm.internal.q;
import org.json.JSONException;
import org.json.JSONObject;

public final class b extends tc.i implements p {

    public final int f15107a = 1;

    public int f15108b;

    public Object f15109c;
    public Object d;

    public Serializable f15110e;

    public final Object f15111f;

    public b(j9.a aVar, Map map, b bVar, c cVar, rc.c cVar2) {
        super(2, cVar2);
        this.d = aVar;
        this.f15109c = map;
        this.f15110e = bVar;
        this.f15111f = cVar;
    }

    @Override
    public final rc.c create(Object obj, rc.c cVar) {
        switch (this.f15107a) {
            case 0:
                b bVar = new b((d) this.f15111f, cVar);
                bVar.f15109c = obj;
                return bVar;
            default:
                return new b((j9.a) this.d, this.f15109c, (b) this.f15110e, (c) this.f15111f, cVar);
        }
    }

    @Override
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f15107a) {
            case 0:
                return ((b) create((JSONObject) obj, (rc.c) obj2)).invokeSuspend(pc.i.f45696a);
            default:
                return ((b) create((c0) obj, (rc.c) obj2)).invokeSuspend(pc.i.f45696a);
        }
    }

    @Override
    public final Object invokeSuspend(Object obj) throws JSONException {
        q qVar;
        Boolean bool;
        q qVar2;
        q qVar3;
        q qVar4;
        q qVar5;
        Object obj2;
        Object objC;
        Object obj3;
        Object objC2;
        Object obj4;
        pc.i iVar;
        Object objC3;
        Object objC4;
        Object objC5;
        switch (this.f15107a) {
            case 0:
                k kVar = ((d) this.f15111f).f15115c;
                sc.a aVar = sc.a.f47847a;
                int i10 = this.f15108b;
                n1.e eVar = k.f15135f;
                pc.i iVar2 = pc.i.f45696a;
                switch (i10) {
                    case 0:
                        k6.b(obj);
                        JSONObject jSONObject = (JSONObject) this.f15109c;
                        Log.d("SessionConfigFetcher", "Fetched settings: " + jSONObject);
                        q qVar6 = new q();
                        qVar = new q();
                        q qVar7 = new q();
                        if (jSONObject.has("app_quality")) {
                            Object obj5 = jSONObject.get("app_quality");
                            kotlin.jvm.internal.j.c(obj5, "null cannot be cast to non-null type org.json.JSONObject");
                            JSONObject jSONObject2 = (JSONObject) obj5;
                            try {
                                bool = jSONObject2.has("sessions_enabled") ? (Boolean) jSONObject2.get("sessions_enabled") : null;
                                try {
                                    if (jSONObject2.has("sampling_rate")) {
                                        qVar6.f15253a = (Double) jSONObject2.get("sampling_rate");
                                    }
                                    if (jSONObject2.has("session_timeout_seconds")) {
                                        qVar.f15253a = (Integer) jSONObject2.get("session_timeout_seconds");
                                    }
                                    if (jSONObject2.has("cache_duration")) {
                                        qVar7.f15253a = (Integer) jSONObject2.get("cache_duration");
                                    }
                                } catch (JSONException e9) {
                                    e = e9;
                                    Log.e("SessionConfigFetcher", "Error parsing the configs remotely fetched: ", e);
                                }
                            } catch (JSONException e10) {
                                e = e10;
                                bool = null;
                            }
                            break;
                        } else {
                            bool = null;
                        }
                        if (bool != null) {
                            this.f15109c = qVar6;
                            this.d = qVar;
                            this.f15110e = qVar7;
                            this.f15108b = 1;
                            Object objC6 = kVar.c(k.f15133c, bool, this);
                            if (objC6 != sc.a.f47847a) {
                                objC6 = iVar2;
                            }
                            if (objC6 == aVar) {
                                return aVar;
                            }
                            qVar4 = qVar6;
                            qVar5 = qVar;
                            qVar3 = qVar7;
                            qVar = qVar5;
                            qVar2 = qVar4;
                        } else {
                            qVar2 = qVar6;
                            qVar3 = qVar7;
                        }
                        obj2 = qVar.f15253a;
                        if (((Integer) obj2) != null) {
                            this.f15109c = qVar2;
                            this.d = qVar3;
                            this.f15110e = null;
                            this.f15108b = 2;
                            objC = kVar.c(k.f15134e, (Integer) obj2, this);
                            if (objC != sc.a.f47847a) {
                                objC = iVar2;
                            }
                            if (objC == aVar) {
                                return aVar;
                            }
                        }
                        obj3 = qVar2.f15253a;
                        if (((Double) obj3) != null) {
                            this.f15109c = qVar3;
                            this.d = null;
                            this.f15110e = null;
                            this.f15108b = 3;
                            objC2 = kVar.c(k.d, (Double) obj3, this);
                            if (objC2 != sc.a.f47847a) {
                                objC2 = iVar2;
                            }
                            if (objC2 == aVar) {
                                return aVar;
                            }
                        }
                        obj4 = qVar3.f15253a;
                        if (((Integer) obj4) != null) {
                            this.f15109c = null;
                            this.d = null;
                            this.f15110e = null;
                            this.f15108b = 4;
                            objC3 = kVar.c(eVar, (Integer) obj4, this);
                            if (objC3 != sc.a.f47847a) {
                                objC3 = iVar2;
                            }
                            if (objC3 == aVar) {
                                return aVar;
                            }
                            iVar = iVar2;
                        } else {
                            iVar = null;
                        }
                        if (iVar == null) {
                            Integer num = new Integer(86400);
                            this.f15109c = null;
                            this.d = null;
                            this.f15110e = null;
                            this.f15108b = 5;
                            objC4 = kVar.c(eVar, num, this);
                            if (objC4 != sc.a.f47847a) {
                                objC4 = iVar2;
                            }
                            if (objC4 == aVar) {
                                return aVar;
                            }
                        }
                        Long l10 = new Long(System.currentTimeMillis());
                        this.f15109c = null;
                        this.d = null;
                        this.f15110e = null;
                        this.f15108b = 6;
                        objC5 = kVar.c(k.f15136g, l10, this);
                        if (objC5 != sc.a.f47847a) {
                            objC5 = iVar2;
                        }
                        if (objC5 == aVar) {
                            return aVar;
                        }
                        return iVar2;
                    case 1:
                        qVar3 = (q) this.f15110e;
                        qVar5 = (q) this.d;
                        qVar4 = (q) this.f15109c;
                        k6.b(obj);
                        qVar = qVar5;
                        qVar2 = qVar4;
                        obj2 = qVar.f15253a;
                        if (((Integer) obj2) != null) {
                            this.f15109c = qVar2;
                            this.d = qVar3;
                            this.f15110e = null;
                            this.f15108b = 2;
                            objC = kVar.c(k.f15134e, (Integer) obj2, this);
                            if (objC != sc.a.f47847a) {
                                objC = iVar2;
                            }
                            if (objC == aVar) {
                                return aVar;
                            }
                        }
                        obj3 = qVar2.f15253a;
                        if (((Double) obj3) != null) {
                            this.f15109c = qVar3;
                            this.d = null;
                            this.f15110e = null;
                            this.f15108b = 3;
                            objC2 = kVar.c(k.d, (Double) obj3, this);
                            if (objC2 != sc.a.f47847a) {
                                objC2 = iVar2;
                            }
                            if (objC2 == aVar) {
                                return aVar;
                            }
                        }
                        obj4 = qVar3.f15253a;
                        if (((Integer) obj4) != null) {
                            this.f15109c = null;
                            this.d = null;
                            this.f15110e = null;
                            this.f15108b = 4;
                            objC3 = kVar.c(eVar, (Integer) obj4, this);
                            if (objC3 != sc.a.f47847a) {
                                objC3 = iVar2;
                            }
                            if (objC3 == aVar) {
                                return aVar;
                            }
                            iVar = iVar2;
                        } else {
                            iVar = null;
                        }
                        if (iVar == null) {
                            Integer num2 = new Integer(86400);
                            this.f15109c = null;
                            this.d = null;
                            this.f15110e = null;
                            this.f15108b = 5;
                            objC4 = kVar.c(eVar, num2, this);
                            if (objC4 != sc.a.f47847a) {
                                objC4 = iVar2;
                            }
                            if (objC4 == aVar) {
                                return aVar;
                            }
                        }
                        Long l11 = new Long(System.currentTimeMillis());
                        this.f15109c = null;
                        this.d = null;
                        this.f15110e = null;
                        this.f15108b = 6;
                        objC5 = kVar.c(k.f15136g, l11, this);
                        if (objC5 != sc.a.f47847a) {
                            objC5 = iVar2;
                        }
                        if (objC5 == aVar) {
                            return aVar;
                        }
                        return iVar2;
                    case 2:
                        qVar3 = (q) this.d;
                        qVar2 = (q) this.f15109c;
                        k6.b(obj);
                        obj3 = qVar2.f15253a;
                        if (((Double) obj3) != null) {
                            this.f15109c = qVar3;
                            this.d = null;
                            this.f15110e = null;
                            this.f15108b = 3;
                            objC2 = kVar.c(k.d, (Double) obj3, this);
                            if (objC2 != sc.a.f47847a) {
                                objC2 = iVar2;
                            }
                            if (objC2 == aVar) {
                                return aVar;
                            }
                        }
                        obj4 = qVar3.f15253a;
                        if (((Integer) obj4) != null) {
                            this.f15109c = null;
                            this.d = null;
                            this.f15110e = null;
                            this.f15108b = 4;
                            objC3 = kVar.c(eVar, (Integer) obj4, this);
                            if (objC3 != sc.a.f47847a) {
                                objC3 = iVar2;
                            }
                            if (objC3 == aVar) {
                                return aVar;
                            }
                            iVar = iVar2;
                        } else {
                            iVar = null;
                        }
                        if (iVar == null) {
                            Integer num3 = new Integer(86400);
                            this.f15109c = null;
                            this.d = null;
                            this.f15110e = null;
                            this.f15108b = 5;
                            objC4 = kVar.c(eVar, num3, this);
                            if (objC4 != sc.a.f47847a) {
                                objC4 = iVar2;
                            }
                            if (objC4 == aVar) {
                                return aVar;
                            }
                        }
                        Long l12 = new Long(System.currentTimeMillis());
                        this.f15109c = null;
                        this.d = null;
                        this.f15110e = null;
                        this.f15108b = 6;
                        objC5 = kVar.c(k.f15136g, l12, this);
                        if (objC5 != sc.a.f47847a) {
                            objC5 = iVar2;
                        }
                        if (objC5 == aVar) {
                            return aVar;
                        }
                        return iVar2;
                    case 3:
                        qVar3 = (q) this.f15109c;
                        k6.b(obj);
                        obj4 = qVar3.f15253a;
                        if (((Integer) obj4) != null) {
                            this.f15109c = null;
                            this.d = null;
                            this.f15110e = null;
                            this.f15108b = 4;
                            objC3 = kVar.c(eVar, (Integer) obj4, this);
                            if (objC3 != sc.a.f47847a) {
                                objC3 = iVar2;
                            }
                            if (objC3 == aVar) {
                                return aVar;
                            }
                            iVar = iVar2;
                        } else {
                            iVar = null;
                        }
                        if (iVar == null) {
                            Integer num4 = new Integer(86400);
                            this.f15109c = null;
                            this.d = null;
                            this.f15110e = null;
                            this.f15108b = 5;
                            objC4 = kVar.c(eVar, num4, this);
                            if (objC4 != sc.a.f47847a) {
                                objC4 = iVar2;
                            }
                            if (objC4 == aVar) {
                                return aVar;
                            }
                        }
                        Long l13 = new Long(System.currentTimeMillis());
                        this.f15109c = null;
                        this.d = null;
                        this.f15110e = null;
                        this.f15108b = 6;
                        objC5 = kVar.c(k.f15136g, l13, this);
                        if (objC5 != sc.a.f47847a) {
                            objC5 = iVar2;
                        }
                        if (objC5 == aVar) {
                            return aVar;
                        }
                        return iVar2;
                    case 4:
                        k6.b(obj);
                        iVar = iVar2;
                        if (iVar == null) {
                            Integer num5 = new Integer(86400);
                            this.f15109c = null;
                            this.d = null;
                            this.f15110e = null;
                            this.f15108b = 5;
                            objC4 = kVar.c(eVar, num5, this);
                            if (objC4 != sc.a.f47847a) {
                                objC4 = iVar2;
                            }
                            if (objC4 == aVar) {
                                return aVar;
                            }
                        }
                        Long l14 = new Long(System.currentTimeMillis());
                        this.f15109c = null;
                        this.d = null;
                        this.f15110e = null;
                        this.f15108b = 6;
                        objC5 = kVar.c(k.f15136g, l14, this);
                        if (objC5 != sc.a.f47847a) {
                            objC5 = iVar2;
                        }
                        if (objC5 == aVar) {
                            return aVar;
                        }
                        return iVar2;
                    case 5:
                        k6.b(obj);
                        Long l15 = new Long(System.currentTimeMillis());
                        this.f15109c = null;
                        this.d = null;
                        this.f15110e = null;
                        this.f15108b = 6;
                        objC5 = kVar.c(k.f15136g, l15, this);
                        if (objC5 != sc.a.f47847a) {
                            objC5 = iVar2;
                        }
                        if (objC5 == aVar) {
                            return aVar;
                        }
                        return iVar2;
                    case 6:
                        k6.b(obj);
                        return iVar2;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            default:
                c cVar = (c) this.f15111f;
                sc.a aVar2 = sc.a.f47847a;
                int i11 = this.f15108b;
                pc.i iVar3 = pc.i.f45696a;
                try {
                    if (i11 == 0) {
                        k6.b(obj);
                        URLConnection uRLConnectionOpenConnection = j9.a.p((j9.a) this.d).openConnection();
                        kotlin.jvm.internal.j.c(uRLConnectionOpenConnection, "null cannot be cast to non-null type javax.net.ssl.HttpsURLConnection");
                        HttpsURLConnection httpsURLConnection = (HttpsURLConnection) uRLConnectionOpenConnection;
                        httpsURLConnection.setRequestMethod("GET");
                        httpsURLConnection.setRequestProperty("Accept", "application/json");
                        for (Map.Entry entry : this.f15109c.entrySet()) {
                            httpsURLConnection.setRequestProperty((String) entry.getKey(), (String) entry.getValue());
                        }
                        int responseCode = httpsURLConnection.getResponseCode();
                        if (responseCode == 200) {
                            InputStream inputStream = httpsURLConnection.getInputStream();
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(inputStream));
                            StringBuilder sb2 = new StringBuilder();
                            while (true) {
                                String line = bufferedReader.readLine();
                                if (line != null) {
                                    sb2.append(line);
                                } else {
                                    bufferedReader.close();
                                    inputStream.close();
                                    JSONObject jSONObject3 = new JSONObject(sb2.toString());
                                    b bVar = (b) this.f15110e;
                                    this.f15108b = 1;
                                    if (bVar.invoke(jSONObject3, this) == aVar2) {
                                        return aVar2;
                                    }
                                }
                            }
                        } else {
                            this.f15108b = 2;
                            cVar.invoke("Bad response code: " + responseCode, this);
                            if (iVar3 == aVar2) {
                                return aVar2;
                            }
                        }
                    } else {
                        if (i11 != 1 && i11 != 2 && i11 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        k6.b(obj);
                    }
                } catch (Exception e11) {
                    String message = e11.getMessage();
                    if (message == null) {
                        message = e11.toString();
                    }
                    this.f15108b = 3;
                    cVar.invoke(message, this);
                    if (iVar3 == aVar2) {
                        return aVar2;
                    }
                }
                return iVar3;
        }
    }

    public b(d dVar, rc.c cVar) {
        super(2, cVar);
        this.f15111f = dVar;
    }
}
