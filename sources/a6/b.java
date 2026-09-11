package a6;

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
import java.util.List;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
public final class b {
    public static final ReentrantLock f292c = new ReentrantLock();
    public static b d;
    public final ReentrantLock f293a = new ReentrantLock();
    public final SharedPreferences f294b;

    public b(Context context) {
        this.f294b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static b a(Context context) {
        n6.l.h(context);
        ReentrantLock reentrantLock = f292c;
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
        return a4.a.C(str, ":", str2);
    }

    public final GoogleSignInAccount b() {
        String d10;
        String d11 = d("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(d11) && (d10 = d(f("googleSignInAccount", d11))) != null) {
            try {
                return GoogleSignInAccount.b(d10);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        n6.l.h(googleSignInAccount);
        n6.l.h(googleSignInOptions);
        String str = googleSignInAccount.f4875r;
        e("defaultGoogleSignInAccount", str);
        String f7 = f("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f4870b;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f4871c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.d;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f4872e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.v;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f4877w;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f4873f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.h;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f4874n);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.f4876s;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, z5.c.f50767b);
            int i10 = 0;
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f4941b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            e(f7, jSONObject.toString());
            String f10 = f("googleSignInOptions", str);
            String str9 = googleSignInOptions.f4887n;
            String str10 = googleSignInOptions.h;
            ArrayList arrayList = googleSignInOptions.f4883b;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList, GoogleSignInOptions.F);
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    jSONArray2.put(((Scope) obj).f4941b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f4884c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f4886f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f4885e);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                e(f10, jSONObject2.toString());
            } catch (JSONException e7) {
                throw new RuntimeException(e7);
            }
        } catch (JSONException e10) {
            throw new RuntimeException(e10);
        }
    }

    public final String d(String str) {
        ReentrantLock reentrantLock = this.f293a;
        reentrantLock.lock();
        try {
            return this.f294b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(String str, String str2) {
        ReentrantLock reentrantLock = this.f293a;
        reentrantLock.lock();
        try {
            this.f294b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
