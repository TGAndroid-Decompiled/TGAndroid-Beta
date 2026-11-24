package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.content.SharedPreferences;
import android.net.Uri;
import android.text.TextUtils;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.api.Scope;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class d1b {
    public static final ReentrantLock c = new ReentrantLock();
    public static d1b d;
    public final ReentrantLock a = new ReentrantLock();
    public final SharedPreferences b;

    public d1b(Context context) {
        this.b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static d1b a(Context context) {
        fre.h(context);
        ReentrantLock reentrantLock = c;
        reentrantLock.lock();
        try {
            d1b d1bVar = d;
            if (d1bVar == null) {
                d1bVar = new d1b(context.getApplicationContext());
                d = d1bVar;
            }
            return d1bVar;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String f(String str, String str2) {
        return ls6.o(str, ":", str2, new StringBuilder(str.length() + 1 + String.valueOf(str2).length()));
    }

    public final GoogleSignInAccount b() {
        String e;
        String e2 = e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(e2) && (e = e(f("googleSignInAccount", e2))) != null) {
            try {
                return GoogleSignInAccount.b(e);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        fre.h(googleSignInAccount);
        fre.h(googleSignInOptions);
        String str = googleSignInAccount.n;
        d("defaultGoogleSignInAccount", str);
        String f = f("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.a;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.b;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.c;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.d;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.s;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.w;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.e;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.h);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            ArrayList arrayList = googleSignInAccount.r;
            Scope[] scopeArr = (Scope[]) arrayList.toArray(new Scope[arrayList.size()]);
            Arrays.sort(scopeArr, is6.f);
            int i = 0;
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            d(f, jSONObject.toString());
            String f2 = f("googleSignInOptions", str);
            String str9 = googleSignInOptions.n;
            String str10 = googleSignInOptions.h;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                ArrayList arrayList2 = googleSignInOptions.b;
                Collections.sort(arrayList2, GoogleSignInOptions.G);
                int size = arrayList2.size();
                while (i < size) {
                    Object obj = arrayList2.get(i);
                    i++;
                    jSONArray2.put(((Scope) obj).b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.e);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                d(f2, jSONObject2.toString());
            } catch (JSONException e) {
                sdb.b(e);
            }
        } catch (JSONException e2) {
            sdb.b(e2);
        }
    }

    public final void d(String str, String str2) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            this.b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String e(String str) {
        ReentrantLock reentrantLock = this.a;
        reentrantLock.lock();
        try {
            return this.b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
