package b6;

import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.text.TextUtils;
import android.util.Log;
import java.util.Locale;
import java.util.concurrent.atomic.AtomicBoolean;
public abstract class r {
    public static final a0.k f1771a = new a0.k(0);
    public static Locale f1772b;

    public static String a(Context context) {
        String packageName = context.getPackageName();
        try {
            Context context2 = k6.c.a(context).f10475a;
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
                return resources.getString(2131701323);
            }
            return resources.getString(2131701333);
        }
        return resources.getString(2131701326);
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
                                            return resources.getString(2131701336, a2);
                                        default:
                                            return resources.getString(2131701331, a2);
                                    }
                                }
                                return e(context, "common_google_play_services_restricted_profile_text", a2);
                            }
                            return resources.getString(2131701332, a2);
                        }
                        return e(context, "common_google_play_services_network_error_text", a2);
                    }
                    return e(context, "common_google_play_services_invalid_account_text", a2);
                }
                return resources.getString(2131701324, a2);
            } else if (i6.b.f(context)) {
                return resources.getString(2131701337);
            } else {
                return resources.getString(2131701334, a2);
            }
        }
        return resources.getString(2131701327, a2);
    }

    public static String d(Context context, int i10) {
        Resources resources = context.getResources();
        switch (i10) {
            case 1:
                return resources.getString(2131701328);
            case 2:
                return resources.getString(2131701335);
            case 3:
                return resources.getString(2131701325);
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
        String f10 = f(context, str);
        if (f10 == null) {
            f10 = resources.getString(2131701331);
        }
        return String.format(resources.getConfiguration().locale, f10, str2);
    }

    public static String f(Context context, String str) {
        Resources resources;
        a0.k kVar = f1771a;
        synchronized (kVar) {
            try {
                Locale locale = k7.x.a(context.getResources().getConfiguration()).f15175a.get(0);
                if (!locale.equals(f1772b)) {
                    kVar.clear();
                    f1772b = locale;
                }
                String str2 = (String) kVar.get(str);
                if (str2 != null) {
                    return str2;
                }
                AtomicBoolean atomicBoolean = y5.g.f50770a;
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
                            f1771a.put(str, string);
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
