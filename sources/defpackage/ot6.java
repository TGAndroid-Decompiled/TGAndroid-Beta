package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.media.Rating;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import java.util.Arrays;
import java.util.MissingFormatArgumentException;
import org.json.JSONArray;
import org.json.JSONException;
public final class ot6 {
    public final Bundle a;

    public ot6(Bundle bundle) {
        this.a = new Bundle(bundle);
    }

    public static boolean f(Bundle bundle) {
        if (!"1".equals(bundle.getString("gcm.n.e")) && !"1".equals(bundle.getString("gcm.n.e".replace("gcm.n.", "gcm.notification.")))) {
            return false;
        }
        return true;
    }

    public static String m(String str) {
        if (str.startsWith("gcm.n.")) {
            return str.substring(6);
        }
        return str;
    }

    public final boolean a(String str) {
        String e = e(str);
        if (!"1".equals(e) && !Boolean.parseBoolean(e)) {
            return false;
        }
        return true;
    }

    public final Integer b(String str) {
        String e = e(str);
        if (!TextUtils.isEmpty(e)) {
            try {
                return Integer.valueOf(Integer.parseInt(e));
            } catch (NumberFormatException unused) {
                Log.w("NotificationParams", "Couldn't parse value of " + m(str) + "(" + e + ") into an int");
                return null;
            }
        }
        return null;
    }

    public final JSONArray c(String str) {
        String e = e(str);
        if (!TextUtils.isEmpty(e)) {
            try {
                return new JSONArray(e);
            } catch (JSONException unused) {
                Log.w("NotificationParams", "Malformed JSON for key " + m(str) + ": " + e + ", falling back to default");
                return null;
            }
        }
        return null;
    }

    public final String d(Resources resources, String str, String str2) {
        String[] strArr;
        String e = e(str2);
        if (!TextUtils.isEmpty(e)) {
            return e;
        }
        String e2 = e(str2.concat("_loc_key"));
        if (TextUtils.isEmpty(e2)) {
            return null;
        }
        int identifier = resources.getIdentifier(e2, "string", str);
        if (identifier == 0) {
            Log.w("NotificationParams", m(str2.concat("_loc_key")) + " resource not found: " + str2 + " Default value will be used.");
            return null;
        }
        JSONArray c = c(str2.concat("_loc_args"));
        if (c == null) {
            strArr = null;
        } else {
            int length = c.length();
            strArr = new String[length];
            for (int i = 0; i < length; i++) {
                strArr[i] = c.optString(i);
            }
        }
        if (strArr == null) {
            return resources.getString(identifier);
        }
        try {
            return resources.getString(identifier, strArr);
        } catch (MissingFormatArgumentException e3) {
            Log.w("NotificationParams", "Missing format argument for " + m(str2) + ": " + Arrays.toString(strArr) + " Default value will be used.", e3);
            return null;
        }
    }

    public final String e(String str) {
        String replace;
        Bundle bundle = this.a;
        if (!bundle.containsKey(str) && str.startsWith("gcm.n.")) {
            if (!str.startsWith("gcm.n.")) {
                replace = str;
            } else {
                replace = str.replace("gcm.n.", "gcm.notification.");
            }
            if (bundle.containsKey(replace)) {
                str = replace;
            }
        }
        return bundle.getString(str);
    }

    public final Bundle g() {
        Bundle bundle = this.a;
        Bundle bundle2 = new Bundle(bundle);
        for (String str : bundle.keySet()) {
            if (!str.startsWith("google.c.a.") && !str.equals("from")) {
                bundle2.remove(str);
            }
        }
        return bundle2;
    }

    public final void h(String str, Bitmap bitmap) {
        Integer num = (Integer) pt6.c.get(str);
        if (num != null && num.intValue() != 2) {
            lq5.j(qd4.y("The ", str, " key cannot be used to put a Bitmap"));
        } else {
            this.a.putParcelable(str, bitmap);
        }
    }

    public final void i(long j, String str) {
        Integer num = (Integer) pt6.c.get(str);
        if (num != null && num.intValue() != 0) {
            lq5.j(qd4.y("The ", str, " key cannot be used to put a long"));
        } else {
            this.a.putLong(str, j);
        }
    }

    public final void j(String str, u29 u29Var) {
        Rating rating;
        float f = u29Var.b;
        Integer num = (Integer) pt6.c.get(str);
        if (num != null && num.intValue() != 3) {
            lq5.j(qd4.y("The ", str, " key cannot be used to put a Rating"));
            return;
        }
        Rating rating2 = u29Var.c;
        if (rating2 == null) {
            boolean b = u29Var.b();
            int i = u29Var.a;
            if (b) {
                boolean z = true;
                switch (i) {
                    case 1:
                        if (i != 1 || f != 1.0f) {
                            z = false;
                        }
                        rating2 = Rating.newHeartRating(z);
                        u29Var.c = rating2;
                        break;
                    case 2:
                        if (i != 2 || f != 1.0f) {
                            z = false;
                        }
                        rating2 = Rating.newThumbRating(z);
                        u29Var.c = rating2;
                        break;
                    case 3:
                    case 4:
                    case 5:
                        rating2 = Rating.newStarRating(i, u29Var.a());
                        u29Var.c = rating2;
                        break;
                    case 6:
                        rating2 = Rating.newPercentageRating((i == 6 && u29Var.b()) ? -1.0f : -1.0f);
                        u29Var.c = rating2;
                        break;
                    default:
                        rating = null;
                        break;
                }
                this.a.putParcelable(str, rating);
            }
            rating2 = Rating.newUnratedRating(i);
            u29Var.c = rating2;
        }
        rating = rating2;
        this.a.putParcelable(str, rating);
    }

    public final void k(String str, String str2) {
        Integer num = (Integer) pt6.c.get(str);
        if (num != null && num.intValue() != 1) {
            lq5.j(qd4.y("The ", str, " key cannot be used to put a String"));
        } else {
            this.a.putCharSequence(str, str2);
        }
    }

    public final void l(CharSequence charSequence, String str) {
        Integer num = (Integer) pt6.c.get(str);
        if (num != null && num.intValue() != 1) {
            lq5.j(qd4.y("The ", str, " key cannot be used to put a CharSequence"));
        } else {
            this.a.putCharSequence(str, charSequence);
        }
    }

    public ot6() {
        this.a = new Bundle();
    }
}
