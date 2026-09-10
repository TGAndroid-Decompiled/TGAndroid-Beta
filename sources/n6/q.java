package n6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class q {
    public static final a0.l f13907a = new a0.l(0);
    public static Locale f13908b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = w6.b.a(context).f11992a;
            return context2.getPackageManager().getApplicationLabel(context2.getPackageManager().getApplicationInfo(packageName, 0)).toString();
        } catch (PackageManager.NameNotFoundException | NullPointerException unused) {
            String str = context.getApplicationInfo().name;
            if (TextUtils.isEmpty(str)) {
                return packageName;
            }
            return str;
        }
    }

    public static String b(Context context, int i10) {
        Resources resources = context.getResources();
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    return resources.getString(17039370);
                }
                return resources.getString(2131689558);
            }
            return resources.getString(2131689568);
        }
        return resources.getString(2131689561);
    }

    public static String c(Context context, int i10) {
        Resources resources = context.getResources();
        String a2 = a(context);
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 3) {
                    if (i10 != 5) {
                        if (i10 != 7) {
                            if (i10 != 9) {
                                if (i10 != 20) {
                                    switch (i10) {
                                        case 16:
                                            return e(context, "common_google_play_services_api_unavailable_text", a2);
                                        case 17:
                                            return e(context, "common_google_play_services_sign_in_failed_text", a2);
                                        case 18:
                                            return resources.getString(2131689571, a2);
                                        default:
                                            return resources.getString(2131689566, a2);
                                    }
                                }
                                return e(context, "common_google_play_services_restricted_profile_text", a2);
                            }
                            return resources.getString(2131689567, a2);
                        }
                        return e(context, "common_google_play_services_network_error_text", a2);
                    }
                    return e(context, "common_google_play_services_invalid_account_text", a2);
                }
                return resources.getString(2131689559, a2);
            } else if (u6.b.f(context)) {
                return resources.getString(2131689572);
            } else {
                return resources.getString(2131689569, a2);
            }
        }
        return resources.getString(2131689562, a2);
    }

    public static String d(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(2131689563);
            case 2:
                return resources.getString(2131689570);
            case 3:
                return resources.getString(2131689560);
            case 4:
            case 6:
            case 18:
                return null;
            case 5:
                Log.e("GoogleApiAvailability", "An invalid account was specified when connecting. Please provide a valid account.");
                return f(context, "common_google_play_services_invalid_account_title");
            case 7:
                Log.e("GoogleApiAvailability", "Network error occurred. Please retry request later.");
                return f(context, "common_google_play_services_network_error_title");
            case 8:
                Log.e("GoogleApiAvailability", "Internal error occurred. Please see logs for detailed information");
                return null;
            case 9:
                Log.e("GoogleApiAvailability", "Google Play services is invalid. Cannot recover.");
                return null;
            case 10:
                Log.e("GoogleApiAvailability", "Developer error occurred. Please see logs for detailed information");
                return null;
            case 11:
                Log.e("GoogleApiAvailability", "The application is not licensed to the user.");
                return null;
            case 12:
            case 13:
            case 14:
            case 15:
            case 19:
            default:
                Log.e("GoogleApiAvailability", "Unexpected error code " + i10);
                return null;
            case 16:
                Log.e("GoogleApiAvailability", "One of the API components you attempted to connect to is not available.");
                return null;
            case 17:
                Log.e("GoogleApiAvailability", "The specified account could not be signed in.");
                return f(context, "common_google_play_services_sign_in_failed_title");
            case 20:
                Log.e("GoogleApiAvailability", "The current user profile is restricted and could not use authenticated features.");
                return f(context, "common_google_play_services_restricted_profile_title");
        }
    }

    public static String e(Context context, String str, String str2) {
        Resources resources = context.getResources();
        String f7 = f(context, str);
        if (f7 == null) {
            f7 = resources.getString(2131689566);
        }
        return String.format(resources.getConfiguration().locale, f7, str2);
    }

    public static String f(Context context, String str) {
        Resources resources;
        a0.l lVar = f13907a;
        synchronized (lVar) {
            try {
                Locale locale = w7.z.a(context.getResources().getConfiguration()).f13677a.get(0);
                if (!locale.equals(f13908b)) {
                    lVar.clear();
                    f13908b = locale;
                }
                String str2 = (String) lVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = k6.g.f12357a;
                try {
                    resources = context.getPackageManager().getResourcesForApplication("com.google.android.gms");
                } catch (PackageManager.NameNotFoundException unused) {
                    resources = null;
                }
                if (resources != null) {
                    int identifier = resources.getIdentifier(str, "string", "com.google.android.gms");
                    if (identifier == 0) {
                        Log.w("GoogleApiAvailability", "Missing resource: ".concat(str));
                    } else {
                        String string = resources.getString(identifier);
                        if (TextUtils.isEmpty(string)) {
                            Log.w("GoogleApiAvailability", "Got empty resource: ".concat(str));
                        } else {
                            f13907a.put(str, string);
                            return string;
                        }
                    }
                }
                return null;
            } finally {
            }
        }
    }
}
