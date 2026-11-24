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
public final class qp2 {
    public final HashMap a = new HashMap();
    public final HashMap b = new HashMap();
    public final HashMap c = new HashMap();
    public ArrayList d = new ArrayList();
    public final transient HashMap e = new HashMap();
    public final HashMap f = new HashMap();
    public final Bundle g = new Bundle();
    public final wp2 h;

    public qp2(wp2 wp2Var) {
        this.h = wp2Var;
    }

    public final boolean a(int i, int i2, Intent intent) {
        String str = (String) this.a.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        v9 v9Var = (v9) this.e.get(str);
        if (v9Var != null) {
            r9 r9Var = v9Var.a;
            if (this.d.contains(str)) {
                r9Var.i(v9Var.b.a(intent, i2));
                this.d.remove(str);
                return true;
            }
        }
        this.f.remove(str);
        this.g.putParcelable(str, new q9(intent, i2));
        return true;
    }

    public final void b(int i, s9 s9Var, Object obj) {
        l69 l69Var;
        Intent putExtra;
        int i2;
        Bundle bundleExtra;
        byte b = s9Var.a;
        Bundle bundle = null;
        wp2 wp2Var = this.h;
        switch (b) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                if (strArr.length == 0) {
                    l69Var = new l69(d24.a, (byte) 4);
                    break;
                } else {
                    for (String str : strArr) {
                        if (rr.b(wp2Var, str) == 0) {
                        }
                    }
                    int b2 = qi6.b(strArr.length);
                    if (b2 < 16) {
                        b2 = 16;
                    }
                    LinkedHashMap linkedHashMap = new LinkedHashMap(b2);
                    for (String str2 : strArr) {
                        linkedHashMap.put(str2, Boolean.TRUE);
                    }
                    l69Var = new l69(linkedHashMap, (byte) 4);
                    break;
                }
            default:
                l69Var = null;
                break;
        }
        if (l69Var != null) {
            new Handler(Looper.getMainLooper()).post(new jq(this, i, l69Var, (byte) 1));
            return;
        }
        switch (s9Var.a) {
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
                jp5 jp5Var = (jp5) obj;
                jp5Var.getClass();
                putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST").putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", jp5Var);
                putExtra.getClass();
                break;
            default:
                jp5 jp5Var2 = (jp5) obj;
                putExtra = new Intent("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST");
                Intent intent = jp5Var2.b;
                if (intent != null && (bundleExtra = intent.getBundleExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE")) != null) {
                    putExtra.putExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE", bundleExtra);
                    intent.removeExtra("androidx.activity.result.contract.extra.ACTIVITY_OPTIONS_BUNDLE");
                    if (intent.getBooleanExtra("androidx.fragment.extra.ACTIVITY_OPTIONS_BUNDLE", false)) {
                        jp5Var2 = new jp5(jp5Var2.a, null, jp5Var2.c, jp5Var2.d);
                    }
                }
                putExtra.putExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST", jp5Var2);
                if (go4.K(2)) {
                    Log.v("FragmentManager", "CreateIntent created the following intent: " + putExtra);
                    break;
                }
                break;
        }
        if (putExtra.getExtras() != null && putExtra.getExtras().getClassLoader() == null) {
            putExtra.setExtrasClassLoader(wp2Var.getClassLoader());
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
            n9.v(wp2Var, stringArrayExtra, i);
        } else if ("androidx.activity.result.contract.action.INTENT_SENDER_REQUEST".equals(putExtra.getAction())) {
            jp5 jp5Var3 = (jp5) putExtra.getParcelableExtra("androidx.activity.result.contract.extra.INTENT_SENDER_REQUEST");
            try {
                i2 = i;
            } catch (IntentSender.SendIntentException e) {
                e = e;
                i2 = i;
            }
            try {
                wp2Var.startIntentSenderForResult(jp5Var3.a, i2, jp5Var3.b, jp5Var3.c, jp5Var3.d, 0, bundle2);
            } catch (IntentSender.SendIntentException e2) {
                e = e2;
                new Handler(Looper.getMainLooper()).post(new jq(this, i2, e, (byte) 2));
            }
        } else {
            wp2Var.startActivityForResult(putExtra, i, bundle2);
        }
    }

    public final u9 c(String str, s9 s9Var, r9 r9Var) {
        d(str);
        this.e.put(str, new v9(r9Var, s9Var));
        HashMap hashMap = this.f;
        if (hashMap.containsKey(str)) {
            Object obj = hashMap.get(str);
            hashMap.remove(str);
            r9Var.i(obj);
        }
        Bundle bundle = this.g;
        q9 q9Var = (q9) bundle.getParcelable(str);
        if (q9Var != null) {
            bundle.remove(str);
            r9Var.i(s9Var.a(q9Var.b, q9Var.a));
        }
        return new u9(this, str, s9Var, (byte) 1);
    }

    public final void d(String str) {
        HashMap hashMap = this.b;
        if (((Integer) hashMap.get(str)) != null) {
            return;
        }
        r3 r3Var = yy8.a;
        int nextInt = yy8.a.a().nextInt(2147418112);
        while (true) {
            int i = nextInt + 65536;
            Integer valueOf = Integer.valueOf(i);
            HashMap hashMap2 = this.a;
            if (hashMap2.containsKey(valueOf)) {
                r3 r3Var2 = yy8.a;
                nextInt = yy8.a.a().nextInt(2147418112);
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
            StringBuilder p = ug8.p("Dropping pending result for request ", str, ": ");
            p.append(hashMap.get(str));
            Log.w("ActivityResultRegistry", p.toString());
            hashMap.remove(str);
        }
        Bundle bundle = this.g;
        if (bundle.containsKey(str)) {
            StringBuilder p2 = ug8.p("Dropping pending result for request ", str, ": ");
            p2.append(bundle.getParcelable(str));
            Log.w("ActivityResultRegistry", p2.toString());
            bundle.remove(str);
        }
        HashMap hashMap2 = this.c;
        w9 w9Var = (w9) hashMap2.get(str);
        if (w9Var != null) {
            ArrayList arrayList = w9Var.b;
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                w9Var.a.b((b16) obj);
            }
            arrayList.clear();
            hashMap2.remove(str);
        }
    }
}
