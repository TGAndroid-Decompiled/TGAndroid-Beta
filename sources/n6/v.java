package n6;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import android.util.Base64;
import android.util.Log;
import com.google.android.gms.fido.common.Transport;
import h7.r8;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public final class v extends z5.a {
    public static final Parcelable.Creator<v> CREATOR = new o0(5);

    public final y f18418a;

    public final b0 f18419b;

    public final byte[] f18420c;
    public final List d;

    public final Double f18421e;

    public final List f18422f;
    public final m h;

    public final Integer f18423n;

    public final h0 f18424r;

    public final e f18425s;
    public final f v;

    public final String f18426w;

    public final ResultReceiver f18427x;

    public v(String str) {
        try {
            v vVarB = b(new JSONObject(str));
            this.f18418a = vVarB.f18418a;
            this.f18419b = vVarB.f18419b;
            this.f18420c = vVarB.f18420c;
            this.d = vVarB.d;
            this.f18421e = vVarB.f18421e;
            this.f18422f = vVarB.f18422f;
            this.h = vVarB.h;
            this.f18423n = vVarB.f18423n;
            this.f18424r = vVarB.f18424r;
            this.f18425s = vVarB.f18425s;
            this.v = vVarB.v;
            this.f18426w = str;
        } catch (JSONException e9) {
            throw new IllegalArgumentException(e9);
        }
    }

    public static v b(JSONObject jSONObject) throws JSONException {
        ArrayList arrayList;
        m mVar;
        f fVar;
        e eVarA;
        int i10;
        r0 r0Var;
        r0 r0VarB;
        y0 y0Var;
        i0 i0Var;
        a1 a1Var;
        m0 m0Var;
        n0 n0Var;
        z0 z0Var;
        p0 p0Var;
        t tVar;
        s0 s0Var;
        JSONArray jSONArray;
        ArrayList arrayList2;
        String str;
        ArrayList arrayList3;
        JSONArray jSONArray2;
        String str2;
        y6.d eVar;
        JSONObject jSONObject2 = jSONObject.getJSONObject("rp");
        String str3 = "id";
        y yVar = new y(jSONObject2.getString("id"), jSONObject2.getString("name"), jSONObject2.has("icon") ? jSONObject2.optString("icon") : null);
        JSONObject jSONObject3 = jSONObject.getJSONObject("user");
        b0 b0Var = new b0(jSONObject3.getString("name"), f6.b.b(jSONObject3.getString("id")), jSONObject3.has("icon") ? jSONObject3.optString("icon") : null, jSONObject3.optString("displayName"));
        byte[] bArrB = f6.b.b(jSONObject.getString("challenge"));
        y5.l.h(bArrB);
        JSONArray jSONArray3 = jSONObject.getJSONArray("pubKeyCredParams");
        ArrayList arrayList4 = new ArrayList();
        for (int i11 = 0; i11 < jSONArray3.length(); i11++) {
            JSONObject jSONObject4 = jSONArray3.getJSONObject(i11);
            try {
                eVar = new y6.e(new x(jSONObject4.getString("type"), jSONObject4.getInt("alg")));
            } catch (IllegalArgumentException unused) {
                eVar = y6.b.f49716a;
            }
            if (eVar.b()) {
                arrayList4.add(eVar.a());
            }
        }
        Double dValueOf = jSONObject.has("timeout") ? Double.valueOf(jSONObject.getDouble("timeout") / 1000.0d) : null;
        int i12 = 11;
        if (jSONObject.has("excludeCredentials")) {
            JSONArray jSONArray4 = jSONObject.getJSONArray("excludeCredentials");
            ArrayList arrayList5 = new ArrayList();
            int i13 = 0;
            while (i13 < jSONArray4.length()) {
                JSONObject jSONObject5 = jSONArray4.getJSONObject(i13);
                Parcelable.Creator<w> creator = w.CREATOR;
                String string = jSONObject5.getString("type");
                byte[] bArrDecode = Base64.decode(jSONObject5.getString(str3), i12);
                if (!jSONObject5.has("transports") || (jSONArray2 = jSONObject5.getJSONArray("transports")) == null) {
                    str = str3;
                    arrayList3 = null;
                } else {
                    HashSet hashSet = new HashSet(jSONArray2.length());
                    int i14 = 0;
                    while (i14 < jSONArray2.length()) {
                        String string2 = jSONArray2.getString(i14);
                        if (string2 == null || string2.isEmpty()) {
                            str2 = str3;
                        } else {
                            str2 = str3;
                            try {
                                hashSet.add(Transport.a(string2));
                            } catch (l6.a unused2) {
                                Log.w("Transport", "Ignoring unrecognized transport ".concat(string2));
                            }
                        }
                        i14++;
                        str3 = str2;
                    }
                    str = str3;
                    arrayList3 = new ArrayList(hashSet);
                }
                arrayList5.add(new w(string, bArrDecode, arrayList3));
                i13++;
                jSONArray4 = jSONArray4;
                str3 = str;
                i12 = 11;
            }
            arrayList = arrayList5;
        } else {
            arrayList = null;
        }
        if (jSONObject.has("authenticatorSelection")) {
            JSONObject jSONObject6 = jSONObject.getJSONObject("authenticatorSelection");
            mVar = new m(jSONObject6.has("authenticatorAttachment") ? jSONObject6.optString("authenticatorAttachment") : null, jSONObject6.has("requireResidentKey") ? Boolean.valueOf(jSONObject6.optBoolean("requireResidentKey")) : null, jSONObject6.has("userVerification") ? jSONObject6.optString("userVerification") : null, jSONObject6.has("residentKey") ? jSONObject6.optString("residentKey") : null);
        } else {
            mVar = null;
        }
        if (jSONObject.has("extensions")) {
            JSONObject jSONObject7 = jSONObject.getJSONObject("extensions");
            s sVar = jSONObject7.has("fidoAppIdExtension") ? new s(jSONObject7.getJSONObject("fidoAppIdExtension").getString("appid")) : null;
            if (jSONObject7.has("appid")) {
                sVar = new s(jSONObject7.getString("appid"));
            }
            s sVar2 = sVar;
            if (!jSONObject7.has("prf")) {
                i10 = 0;
                if (jSONObject7.has("prfAlreadyHashed")) {
                    r0VarB = r0.b(jSONObject7.getJSONObject("prfAlreadyHashed"), true);
                } else {
                    r0Var = null;
                }
                if (jSONObject7.has("cableAuthenticationExtension")) {
                    jSONArray = jSONObject7.getJSONArray("cableAuthenticationExtension");
                    arrayList2 = new ArrayList();
                    while (i10 < jSONArray.length()) {
                        JSONObject jSONObject8 = jSONArray.getJSONObject(i10);
                        arrayList2.add(new x0(jSONObject8.getLong("version"), Base64.decode(jSONObject8.getString("clientEid"), 11), Base64.decode(jSONObject8.getString("authenticatorEid"), 11), Base64.decode(jSONObject8.getString("sessionPreKey"), 11)));
                        i10++;
                    }
                    y0Var = new y0(arrayList2);
                } else {
                    y0Var = null;
                }
                if (jSONObject7.has("userVerificationMethodExtension")) {
                    i0Var = new i0(jSONObject7.getJSONObject("userVerificationMethodExtension").getBoolean("uvm"));
                } else {
                    i0Var = null;
                }
                if (jSONObject7.has("google_multiAssertionExtension")) {
                    a1Var = new a1(jSONObject7.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion"));
                } else {
                    a1Var = null;
                }
                if (jSONObject7.has("google_sessionIdExtension")) {
                    m0Var = new m0(jSONObject7.getJSONObject("google_sessionIdExtension").getInt("sessionId"));
                } else {
                    m0Var = null;
                }
                if (jSONObject7.has("google_silentVerificationExtension")) {
                    n0Var = new n0(jSONObject7.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification"));
                } else {
                    n0Var = null;
                }
                if (jSONObject7.has("devicePublicKeyExtension")) {
                    jSONObject7.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                    z0Var = new z0();
                } else {
                    z0Var = null;
                }
                if (jSONObject7.has("google_tunnelServerIdExtension")) {
                    p0Var = new p0(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId"));
                } else {
                    p0Var = null;
                }
                if (jSONObject7.has("google_thirdPartyPaymentExtension")) {
                    tVar = new t(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment"));
                } else {
                    tVar = null;
                }
                if (jSONObject7.has("txAuthSimple")) {
                    s0Var = new s0(jSONObject7.getString("txAuthSimple"));
                } else {
                    s0Var = null;
                }
                fVar = new f(sVar2, y0Var, i0Var, a1Var, m0Var, n0Var, z0Var, p0Var, tVar, r0Var, s0Var, null);
            } else {
                if (jSONObject7.has("prfAlreadyHashed")) {
                    throw new JSONException("both prf and prfAlreadyHashed extensions found");
                }
                i10 = 0;
                r0VarB = r0.b(jSONObject7.getJSONObject("prf"), false);
            }
            r0Var = r0VarB;
            if (jSONObject7.has("cableAuthenticationExtension")) {
                jSONArray = jSONObject7.getJSONArray("cableAuthenticationExtension");
                arrayList2 = new ArrayList();
                while (i10 < jSONArray.length()) {
                    JSONObject jSONObject9 = jSONArray.getJSONObject(i10);
                    arrayList2.add(new x0(jSONObject9.getLong("version"), Base64.decode(jSONObject9.getString("clientEid"), 11), Base64.decode(jSONObject9.getString("authenticatorEid"), 11), Base64.decode(jSONObject9.getString("sessionPreKey"), 11)));
                    i10++;
                }
                y0Var = new y0(arrayList2);
            } else {
                y0Var = null;
            }
            if (jSONObject7.has("userVerificationMethodExtension")) {
                i0Var = new i0(jSONObject7.getJSONObject("userVerificationMethodExtension").getBoolean("uvm"));
            } else {
                i0Var = null;
            }
            if (jSONObject7.has("google_multiAssertionExtension")) {
                a1Var = new a1(jSONObject7.getJSONObject("google_multiAssertionExtension").getBoolean("requestForMultiAssertion"));
            } else {
                a1Var = null;
            }
            if (jSONObject7.has("google_sessionIdExtension")) {
                m0Var = new m0(jSONObject7.getJSONObject("google_sessionIdExtension").getInt("sessionId"));
            } else {
                m0Var = null;
            }
            if (jSONObject7.has("google_silentVerificationExtension")) {
                n0Var = new n0(jSONObject7.getJSONObject("google_silentVerificationExtension").getBoolean("silentVerification"));
            } else {
                n0Var = null;
            }
            if (jSONObject7.has("devicePublicKeyExtension")) {
                jSONObject7.getJSONObject("devicePublicKeyExtension").getBoolean("devicePublicKey");
                z0Var = new z0();
            } else {
                z0Var = null;
            }
            if (jSONObject7.has("google_tunnelServerIdExtension")) {
                p0Var = new p0(jSONObject7.getJSONObject("google_tunnelServerIdExtension").getString("tunnelServerId"));
            } else {
                p0Var = null;
            }
            if (jSONObject7.has("google_thirdPartyPaymentExtension")) {
                tVar = new t(jSONObject7.getJSONObject("google_thirdPartyPaymentExtension").getBoolean("thirdPartyPayment"));
            } else {
                tVar = null;
            }
            if (jSONObject7.has("txAuthSimple")) {
                s0Var = new s0(jSONObject7.getString("txAuthSimple"));
            } else {
                s0Var = null;
            }
            fVar = new f(sVar2, y0Var, i0Var, a1Var, m0Var, n0Var, z0Var, p0Var, tVar, r0Var, s0Var, null);
        } else {
            fVar = null;
        }
        if (jSONObject.has("attestation")) {
            try {
                eVarA = e.a(jSONObject.getString("attestation"));
            } catch (d e9) {
                Log.w("PKCCreationOptions", "Invalid AttestationConveyancePreference", e9);
                eVarA = e.NONE;
            }
        } else {
            eVarA = null;
        }
        return new v(yVar, b0Var, bArrB, arrayList4, dValueOf, arrayList, mVar, null, null, eVarA == null ? null : eVarA.f18342a, fVar, null, null);
    }

    public final boolean equals(Object obj) {
        List list;
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        List list2 = vVar.d;
        List list3 = vVar.f18422f;
        if (y5.l.l(this.f18418a, vVar.f18418a) && y5.l.l(this.f18419b, vVar.f18419b) && Arrays.equals(this.f18420c, vVar.f18420c) && y5.l.l(this.f18421e, vVar.f18421e)) {
            List list4 = this.d;
            if (list4.containsAll(list2) && list2.containsAll(list4) && ((((list = this.f18422f) == null && list3 == null) || (list != null && list3 != null && list.containsAll(list3) && list3.containsAll(list))) && y5.l.l(this.h, vVar.h) && y5.l.l(this.f18423n, vVar.f18423n) && y5.l.l(this.f18424r, vVar.f18424r) && y5.l.l(this.f18425s, vVar.f18425s) && y5.l.l(this.v, vVar.v) && y5.l.l(this.f18426w, vVar.f18426w))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f18418a, this.f18419b, Integer.valueOf(Arrays.hashCode(this.f18420c)), this.d, this.f18421e, this.f18422f, this.h, this.f18423n, this.f18424r, this.f18425s, this.v, this.f18426w});
    }

    public final String toString() {
        String strValueOf = String.valueOf(this.f18418a);
        String strValueOf2 = String.valueOf(this.f18419b);
        String strC = f6.b.c(this.f18420c);
        String strValueOf3 = String.valueOf(this.d);
        String strValueOf4 = String.valueOf(this.f18422f);
        String strValueOf5 = String.valueOf(this.h);
        String strValueOf6 = String.valueOf(this.f18424r);
        String strValueOf7 = String.valueOf(this.f18425s);
        String strValueOf8 = String.valueOf(this.v);
        StringBuilder sbP = i0.a.p("PublicKeyCredentialCreationOptions{\n rp=", strValueOf, ", \n user=", strValueOf2, ", \n challenge=");
        i0.a.z(sbP, strC, ", \n parameters=", strValueOf3, ", \n timeoutSeconds=");
        sbP.append(this.f18421e);
        sbP.append(", \n excludeList=");
        sbP.append(strValueOf4);
        sbP.append(", \n authenticatorSelection=");
        sbP.append(strValueOf5);
        sbP.append(", \n requestId=");
        sbP.append(this.f18423n);
        sbP.append(", \n tokenBinding=");
        sbP.append(strValueOf6);
        sbP.append(", \n attestationConveyancePreference=");
        sbP.append(strValueOf7);
        sbP.append(", \n authenticationExtensions=");
        sbP.append(strValueOf8);
        sbP.append("}");
        return sbP.toString();
    }

    @Override
    public final void writeToParcel(Parcel parcel, int i10) {
        int iQ = r8.q(parcel, 20293);
        r8.k(parcel, 2, this.f18418a, i10);
        r8.k(parcel, 3, this.f18419b, i10);
        r8.c(parcel, 4, this.f18420c);
        r8.p(parcel, 5, this.d);
        Double d = this.f18421e;
        if (d != null) {
            r8.s(parcel, 6, 8);
            parcel.writeDouble(d.doubleValue());
        }
        r8.p(parcel, 7, this.f18422f);
        r8.k(parcel, 8, this.h, i10);
        r8.i(parcel, 9, this.f18423n);
        r8.k(parcel, 10, this.f18424r, i10);
        e eVar = this.f18425s;
        r8.l(parcel, 11, eVar == null ? null : eVar.f18342a);
        r8.k(parcel, 12, this.v, i10);
        r8.l(parcel, 13, this.f18426w);
        r8.k(parcel, 14, this.f18427x, i10);
        r8.r(parcel, iQ);
    }

    public v(y yVar, b0 b0Var, byte[] bArr, ArrayList arrayList, Double d, ArrayList arrayList2, m mVar, Integer num, h0 h0Var, String str, f fVar, String str2, ResultReceiver resultReceiver) {
        this.f18427x = resultReceiver;
        if (str2 != null) {
            try {
                v vVarB = b(new JSONObject(str2));
                this.f18418a = vVarB.f18418a;
                this.f18419b = vVarB.f18419b;
                this.f18420c = vVarB.f18420c;
                this.d = vVarB.d;
                this.f18421e = vVarB.f18421e;
                this.f18422f = vVarB.f18422f;
                this.h = vVarB.h;
                this.f18423n = vVarB.f18423n;
                this.f18424r = vVarB.f18424r;
                this.f18425s = vVarB.f18425s;
                this.v = vVarB.v;
                this.f18426w = str2;
                return;
            } catch (JSONException e9) {
                throw new IllegalArgumentException(e9);
            }
        }
        y5.l.h(yVar);
        this.f18418a = yVar;
        y5.l.h(b0Var);
        this.f18419b = b0Var;
        y5.l.h(bArr);
        this.f18420c = bArr;
        y5.l.h(arrayList);
        this.d = arrayList;
        this.f18421e = d;
        this.f18422f = arrayList2;
        this.h = mVar;
        this.f18423n = num;
        this.f18424r = h0Var;
        if (str != null) {
            try {
                this.f18425s = e.a(str);
            } catch (d e10) {
                throw new IllegalArgumentException(e10);
            }
        } else {
            this.f18425s = null;
        }
        this.v = fVar;
        this.f18426w = null;
    }
}
