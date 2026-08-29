package m5;

import a4.w;
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
    public static final ReentrantLock f16860c = new ReentrantLock();
    public static b d;
    public final ReentrantLock f16861a = new ReentrantLock();
    public final SharedPreferences f16862b;

    public b(Context context) {
        this.f16862b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    public static b a(Context context) {
        z5.l.h(context);
        ReentrantLock reentrantLock = f16860c;
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
        return w.y(str, ":", str2);
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
        z5.l.h(googleSignInAccount);
        z5.l.h(googleSignInOptions);
        String str = googleSignInAccount.f3684r;
        e("defaultGoogleSignInAccount", str);
        String f9 = f("googleSignInAccount", str);
        JSONObject jSONObject = new JSONObject();
        try {
            String str2 = googleSignInAccount.f3679b;
            if (str2 != null) {
                jSONObject.put("id", str2);
            }
            String str3 = googleSignInAccount.f3680c;
            if (str3 != null) {
                jSONObject.put("tokenId", str3);
            }
            String str4 = googleSignInAccount.d;
            if (str4 != null) {
                jSONObject.put("email", str4);
            }
            String str5 = googleSignInAccount.f3681e;
            if (str5 != null) {
                jSONObject.put("displayName", str5);
            }
            String str6 = googleSignInAccount.v;
            if (str6 != null) {
                jSONObject.put("givenName", str6);
            }
            String str7 = googleSignInAccount.f3686w;
            if (str7 != null) {
                jSONObject.put("familyName", str7);
            }
            Uri uri = googleSignInAccount.f3682f;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            String str8 = googleSignInAccount.h;
            if (str8 != null) {
                jSONObject.put("serverAuthCode", str8);
            }
            jSONObject.put("expirationTime", googleSignInAccount.f3683n);
            jSONObject.put("obfuscatedIdentifier", str);
            JSONArray jSONArray = new JSONArray();
            List list = googleSignInAccount.f3685s;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, l5.c.f14485b);
            int i10 = 0;
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.f3750b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            e(f9, jSONObject.toString());
            String f10 = f("googleSignInOptions", str);
            String str9 = googleSignInOptions.f3696n;
            String str10 = googleSignInOptions.h;
            ArrayList arrayList = googleSignInOptions.f3692b;
            JSONObject jSONObject2 = new JSONObject();
            try {
                JSONArray jSONArray2 = new JSONArray();
                Collections.sort(arrayList, GoogleSignInOptions.B);
                int size = arrayList.size();
                while (i10 < size) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    jSONArray2.put(((Scope) obj).f3750b);
                }
                jSONObject2.put("scopes", jSONArray2);
                Account account = googleSignInOptions.f3693c;
                if (account != null) {
                    jSONObject2.put("accountName", account.name);
                }
                jSONObject2.put("idTokenRequested", googleSignInOptions.d);
                jSONObject2.put("forceCodeForRefreshToken", googleSignInOptions.f3695f);
                jSONObject2.put("serverAuthRequested", googleSignInOptions.f3694e);
                if (!TextUtils.isEmpty(str10)) {
                    jSONObject2.put("serverClientId", str10);
                }
                if (!TextUtils.isEmpty(str9)) {
                    jSONObject2.put("hostedDomain", str9);
                }
                e(f10, jSONObject2.toString());
            } catch (JSONException e10) {
                throw new RuntimeException(e10);
            }
        } catch (JSONException e11) {
            throw new RuntimeException(e11);
        }
    }

    public final String d(String str) {
        ReentrantLock reentrantLock = this.f16861a;
        reentrantLock.lock();
        try {
            return this.f16862b.getString(str, null);
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void e(String str, String str2) {
        ReentrantLock reentrantLock = this.f16861a;
        reentrantLock.lock();
        try {
            this.f16862b.edit().putString(str, str2).apply();
        } finally {
            reentrantLock.unlock();
        }
    }
}
