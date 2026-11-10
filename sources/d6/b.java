package d6;

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
import org.telegram.ui.Cells.f1;
import q6.m;
public final class b {
    public static final ReentrantLock f8192c = new ReentrantLock();
    public static b d;
    public final ReentrantLock f8193a = new ReentrantLock();
    public final SharedPreferences f8194b;

    public b(Context context) {
        this.f8194b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static b a(Context context) {
        m.g(context);
        ReentrantLock reentrantLock = f8192c;
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
        return f1.n(str, ":", str2, new StringBuilder(str.length() + 1 + String.valueOf(str2).length()));
    }

    public final GoogleSignInAccount b() {
        String e10;
        String e11 = e("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(e11) && (e10 = e(f("googleSignInAccount", e11))) != null) {
            try {
                return GoogleSignInAccount.b(e10);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    public final void c(GoogleSignInAccount googleSignInAccount, GoogleSignInOptions googleSignInOptions) {
        m.g(googleSignInAccount);
        m.g(googleSignInOptions);
        String str = googleSignInAccount.f6460n;
        d("defaultGoogleSignInAccount", str);
        String f10 = f("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f6455a;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f6456b;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.f6457c;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.d;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.f6462s;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f6463w;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f6458e;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.f6459f;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.h);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.f6461r;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, c5.b.f5308b);
            int i7 = 0;
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f6527b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            d(f10, jSONObject.toString());
            String f11 = f("googleSignInOptions", str);
            String str9 = googleSignInOptions.f6473n;
            String str10 = googleSignInOptions.h;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                ArrayList arrayList = googleSignInOptions.f6469b;
                Collections.sort(arrayList, GoogleSignInOptions.F);
                int size = arrayList.size();
                while (i7 < size) {
                    Object obj = arrayList.get(i7);
                    i7++;
                    jSONArray2.put(((Scope) obj).f6527b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f6470c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f6472f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f6471e);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                d(f11, jSONObject2.toString());
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        } catch (JSONException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final void d(String str, String str2) {
        ReentrantLock reentrantLock = this.f8193a;
        reentrantLock.lock();
        try {
            this.f8194b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }

    public final String e(String str) {
        ReentrantLock reentrantLock = this.f8193a;
        reentrantLock.lock();
        try {
            return this.f8194b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }
}
