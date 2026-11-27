package defpackage;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
public final class jq2 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public ArrayList d = new ArrayList();
    public final transient HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final Bundle g = new Bundle();
    public final pq2 h;

    public jq2(pq2 pq2Var) {
        this.h = pq2Var;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        w9 w9Var = (w9) this.e.get(str);
        if (w9Var != null) {
            s9 s9Var = w9Var.a;
            if (this.d.contains(str)) {
                s9Var.k(w9Var.b.a(intent, i2));
                this.d.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new r9(intent, i2));
        return true;
    }

    public final void b(int i, t9 t9Var, Object obj) {
        ri6 ri6Var;
        Intent putExtra;
        int i2;
        Bundle bundleExtra;
        byte b = t9Var.a;
        Bundle bundle = null;
        pq2 pq2Var = this.h;
        switch (b) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    ri6Var = new ri6(y24.a, (byte) 3);
                    break;
                } else {
                    for (String str : strArr) {
                        if (sr.b(pq2Var, str) == 0) {
                        }
                    }
                    int b2 = uk6.b(strArr.length);
                    if (b2 < 16) {
                        b2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(b2);
                    for (String str2 : strArr) {
                        linkedHashMap.put(str2, Boolean.TRUE);
                    }
                    ri6Var = new ri6(linkedHashMap, (byte) 3);
                    break;
                }
            default:
                ri6Var = null;
                break;
        }
        if (ri6Var != null) {
            new Handler(Looper.getMainLooper()).post(new kq(this, i, ri6Var, (byte) 1));
            return;
        }
        switch (t9Var.a) {
            case 0:
                String[] strArr2 = (String[]) obj;
                strArr2.getClass();
                putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", strArr2);
                putExtra.getClass();
                break;
            case 1:
                putExtra = (Intent) obj;
                putExtra.getClass();
                break;
            case 2:
                mr5 mr5Var = (mr5) obj;
                mr5Var.getClass();
                putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", mr5Var);
                putExtra.getClass();
                break;
            default:
                mr5 mr5Var2 = (mr5) obj;
                putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent = mr5Var2.b;
                if (intent != null && (bundleExtra = intent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    putExtra.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        mr5Var2 = new mr5(mr5Var2.a, null, mr5Var2.c, mr5Var2.d);
                    }
                }
                putExtra.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", mr5Var2);
                if (kq4.K(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + putExtra);
                    break;
                }
                break;
        }
        if (putExtra.getExtras() != null && putExtra.getExtras().getClassLoader() == null) {
            putExtra.setExtrasClassLoader(pq2Var.getClassLoader());
        }
        if (putExtra.hasExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) {
            bundle = putExtra.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
            putExtra.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
        }
        Bundle bundle2 = bundle;
        if ("androidx.activity.result.contract.action.REQUEST_PERMISSIONS".equals(putExtra.getAction())) {
            String[] stringArrayExtra = putExtra.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
            if (stringArrayExtra == null) {
                stringArrayExtra = new String[0];
            }
            o9.v(pq2Var, stringArrayExtra, i);
        } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(putExtra.getAction())) {
            mr5 mr5Var3 = (mr5) putExtra.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                pq2Var.startIntentSenderForResult(mr5Var3.a, i2, mr5Var3.b, mr5Var3.c, mr5Var3.d, 0, bundle2);
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new kq(this, i2, e, (byte) 2));
            }
        } else {
            pq2Var.startActivityForResult(putExtra, i, bundle2);
        }
    }

    public final v9 c(String str, t9 t9Var, s9 s9Var) {
        d(str);
        this.e.put(str, new w9(s9Var, t9Var));
        HashMap hashMap = this.f;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            s9Var.k(obj);
        }
        Bundle bundle = this.g;
        r9 r9Var = (r9) bundle.getParcelable(str);
        if (r9Var != null) {
            bundle.remove(str);
            s9Var.k(t9Var.a(r9Var.b, r9Var.a));
        }
        return new v9(this, str, t9Var, (byte) 1);
    }

    public final void d(String str) {
        HashMap hashMap = this.b;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        s3 s3Var = l29.a;
        int nextInt = l29.a.a().nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            Integer valueOf = Integer.valueOf(i);
            HashMap hashMap2 = this.a;
            if (hashMap2.containsKey(valueOf)) {
                s3 s3Var2 = l29.a;
                nextInt = l29.a.a().nextInt(2147418112);
            } else {
                hashMap2.put(Integer.valueOf(i), str);
                hashMap.put(str, Integer.valueOf(i));
                return;
            }
        }
    }

    public final void e(String str) {
        Integer num;
        if (!this.d.contains(str) && (num = (Integer) this.b.remove(str)) != null) {
            this.a.remove(num);
        }
        this.e.remove(str);
        HashMap hashMap = this.f;
        if (hashMap.containsKey(str)) {
            StringBuilder p = ik8.p("Dropping pending result for request ", str, ": ");
            p.append(hashMap.get(str));
            Log.w("ActivityResultRegistry", p.toString());
            hashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            StringBuilder p2 = ik8.p("Dropping pending result for request ", str, ": ");
            p2.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", p2.toString());
            bundle.remove(str);
        }
        HashMap hashMap2 = this.c;
        x9 x9Var = (x9) hashMap2.get(str);
        if (x9Var != null) {
            ArrayList arrayList = x9Var.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                x9Var.a.b((f36) obj);
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
