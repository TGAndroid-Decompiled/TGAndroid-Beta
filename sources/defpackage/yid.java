package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import com.android.billingclient.api.Purchase;
import java.util.ArrayList;
import org.json.JSONException;
public abstract class yid {
    public static final int a = Runtime.getRuntime().availableProcessors();

    public static int a(String str, Bundle bundle) {
        if (bundle == null) {
            h(str, "Unexpected null bundle received!");
            return 6;
        }
        Object obj = bundle.get("RESPONSE_CODE");
        if (obj == null) {
            g(str, "getResponseCodeFromBundle() got null response code, assuming OK");
            return 0;
        } else if (obj instanceof Integer) {
            return ((Integer) obj).intValue();
        } else {
            h(str, "Unexpected type for bundle response code: ".concat(obj.getClass().getName()));
            return 6;
        }
    }

    public static void b(Bundle bundle, String str, String str2, long j) {
        bundle.putString("playBillingLibraryVersion", str);
        if (str2 != null) {
            bundle.putString("playBillingLibraryWrapperVersion", str2);
        }
        bundle.putLong("billingClientSessionId", j);
    }

    public static Bundle c(int i, fj0 fj0Var) {
        Bundle bundle = new Bundle();
        bundle.putInt("RESPONSE_CODE", fj0Var.a);
        bundle.putString("DEBUG_MESSAGE", fj0Var.c);
        bundle.putInt("LOG_REASON", mlb.e(i));
        return bundle;
    }

    public static Bundle d(String str, String str2, ArrayList arrayList, dhf dhfVar, long j) {
        Bundle bundle = new Bundle();
        b(bundle, str, str2, j);
        bundle.putBoolean("enablePendingPurchases", true);
        bundle.putString("SKU_DETAILS_RESPONSE_FORMAT", "PRODUCT_DETAILS");
        tgd tgdVar = fhd.b;
        Object[] objArr = {"subs", "inapp"};
        u2f.a(2, objArr);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_MULTIPLE_OFFERS", new ArrayList<>(fhd.o(2, objArr)));
        Object[] objArr2 = {"inapp"};
        u2f.a(1, objArr2);
        bundle.putStringArrayList("PRODUCT_TYPES_TO_RETURN_RENT_OFFERS", new ArrayList<>(fhd.o(1, objArr2)));
        bundle.putBoolean("SHOULD_RETURN_UNFETCHED_PRODUCTS", true);
        ArrayList arrayList2 = new ArrayList();
        ArrayList<String> arrayList3 = new ArrayList<>();
        ArrayList arrayList4 = new ArrayList();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList2.add(null);
            arrayList4.add(null);
            if (((zy8) arrayList.get(i)).b.equals("first_party")) {
                gxc.d("Serialized DocId is required for constructing ExtraParams to query ProductDetails for all first party products.");
                return null;
            }
        }
        if (!arrayList3.isEmpty()) {
            bundle.putStringArrayList("SKU_SERIALIZED_DOCID_LIST", arrayList3);
        }
        return bundle;
    }

    public static fj0 e(String str, Intent intent) {
        if (intent == null) {
            h("BillingHelper", "Got null intent!");
            g1 a2 = fj0.a();
            a2.a = 6;
            a2.c = "An internal error occurred.";
            return a2.a();
        }
        g1 a3 = fj0.a();
        a3.a = a(str, intent.getExtras());
        a3.c = f(str, intent.getExtras());
        return a3.a();
    }

    public static String f(String str, Bundle bundle) {
        if (bundle == null) {
            h(str, "Unexpected null bundle received!");
            return "";
        }
        Object obj = bundle.get("DEBUG_MESSAGE");
        if (obj == null) {
            g(str, "getDebugMessageFromBundle() got null response code, assuming OK");
            return "";
        } else if (obj instanceof String) {
            return (String) obj;
        } else {
            h(str, "Unexpected type for debug message: ".concat(obj.getClass().getName()));
            return "";
        }
    }

    public static void g(String str, String str2) {
        if (Log.isLoggable(str, 2)) {
            if (!str2.isEmpty()) {
                int i = 40000;
                while (!str2.isEmpty() && i > 0) {
                    int min = Math.min(str2.length(), Math.min(4000, i));
                    Log.v(str, str2.substring(0, min));
                    str2 = str2.substring(min);
                    i -= min;
                }
                return;
            }
            Log.v(str, str2);
        }
    }

    public static void h(String str, String str2) {
        if (Log.isLoggable(str, 5)) {
            Log.w(str, str2);
        }
    }

    public static void i(String str, String str2, Throwable th) {
        try {
            if (Log.isLoggable(str, 5)) {
                if (th == null) {
                    Log.w(str, str2);
                } else {
                    Log.w(str, str2, th);
                }
            }
        } catch (Throwable unused) {
        }
    }

    public static Purchase j(String str, String str2) {
        if (str != null && str2 != null) {
            try {
                return new Purchase(str, str2);
            } catch (JSONException e) {
                h("BillingHelper", "Got JSONException while parsing purchase data: ".concat(e.toString()));
                return null;
            }
        }
        g("BillingHelper", "Received a null purchase data.");
        return null;
    }
}
