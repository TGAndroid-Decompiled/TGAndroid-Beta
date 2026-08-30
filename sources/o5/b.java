package o5;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import b6.m;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class b {
    public static final ReentrantLock f16438c = new ReentrantLock();
    public static b d;
    public final ReentrantLock f16439a = new ReentrantLock();
    public final SharedPreferences f16440b;

    public b(Context context) {
        this.f16440b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static b a(Context context) {
        m.h(context);
        ReentrantLock reentrantLock = f16438c;
        reentrantLock.lock();
        try {
            if (d == null) {
                d = new b(context.getApplicationContext());
            }
            b bVar = d;
            reentrantLock.unlock();
            return bVar;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String f(String str, String str2) {
        return android.support.v4.media.a.z(str, ":", str2);
    }

    public final GoogleSignInAccount b() {
        String d10;
        String d11 = d("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(d11) && (d10 = d(f("googleSignInAccount", d11))) != null) {
            try {
                return GoogleSignInAccount.e(d10);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        m.h(googleSignInAccount);
        m.h(googleSignInOptions);
        String str = googleSignInAccount.f2653r;
        e("defaultGoogleSignInAccount", str);
        String f10 = f("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f2649b;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f2650c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.d;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.v;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f2655w;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f2651f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.h;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f2652n);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.f2654s;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, n5.c.f14272b);
            int i10 = 0;
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f2714b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            e(f10, jSONObject.toString());
            String f11 = f("googleSignInOptions", str);
            String str9 = googleSignInOptions.f2664n;
            String str10 = googleSignInOptions.h;
            ArrayList arrayList = googleSignInOptions.f2661b;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList, GoogleSignInOptions.C);
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    jSONArray2.put(((Scope) obj).f2714b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f2662c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f2663f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.e);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                e(f11, jSONObject2.toString());
            } catch (JSONException e) {
                throw new RuntimeException(e);
            }
        } catch (JSONException e6) {
            throw new RuntimeException(e6);
        }
    }

    public final String d(String str) {
        ReentrantLock reentrantLock = this.f16439a;
        reentrantLock.lock();
        try {
            return this.f16440b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(String str, String str2) {
        ReentrantLock reentrantLock = this.f16439a;
        reentrantLock.lock();
        try {
            this.f16440b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
