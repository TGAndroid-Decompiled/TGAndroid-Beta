package defpackage;

import android.content.Context;
import android.icu.util.ULocale;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Locale;
public abstract class bo3 {
    public static final HashMap a = new HashMap();

    public static void a(LinkedHashMap linkedHashMap, Locale locale) {
        if (locale != null) {
            String language = locale.getLanguage();
            if (!TextUtils.isEmpty(language) && !"und".equals(language) && !linkedHashMap.containsKey(language)) {
                String country = locale.getCountry();
                if (TextUtils.isEmpty(country) && Build.VERSION.SDK_INT >= 24) {
                    country = ULocale.addLikelySubtags(z2.a(language)).getCountry();
                }
                if (country == null) {
                    country = "";
                }
                linkedHashMap.put(language, new Locale(language, country).toLanguageTag());
            }
        }
    }

    public static void b(LinkedHashMap linkedHashMap, Context context) {
        try {
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            if (inputMethodManager != null) {
                a(linkedHashMap, d(inputMethodManager.getCurrentInputMethodSubtype()));
                String string = Settings.Secure.getString(context.getContentResolver(), "default_input_method");
                for (InputMethodInfo inputMethodInfo : inputMethodManager.getEnabledInputMethodList()) {
                    if (TextUtils.equals(inputMethodInfo.getId(), string)) {
                        for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(inputMethodInfo, true)) {
                            a(linkedHashMap, d(inputMethodSubtype));
                        }
                    }
                }
            }
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    public static ArrayList c(Context context, long j) {
        ArrayList arrayList = (ArrayList) a.get(Long.valueOf(j));
        if (arrayList != null && !arrayList.isEmpty()) {
            return new ArrayList(arrayList);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        b(linkedHashMap, context);
        return new ArrayList(linkedHashMap.values());
    }

    public static Locale d(InputMethodSubtype inputMethodSubtype) {
        String str;
        if (inputMethodSubtype == null || !"keyboard".equals(inputMethodSubtype.getMode())) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 24) {
            str = inputMethodSubtype.getLanguageTag();
        } else {
            str = null;
        }
        if (TextUtils.isEmpty(str)) {
            String locale = inputMethodSubtype.getLocale();
            if (locale == null) {
                str = null;
            } else {
                str = locale.replace('_', '-');
            }
        }
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return Locale.forLanguageTag(str);
    }
}
