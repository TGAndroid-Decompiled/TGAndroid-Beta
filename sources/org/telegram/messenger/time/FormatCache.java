package org.telegram.messenger.time;

import j$.util.concurrent.ConcurrentHashMap;
import java.text.DateFormat;
import java.text.Format;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Locale;
import java.util.TimeZone;
import java.util.concurrent.ConcurrentMap;
public abstract class FormatCache<F extends Format> {
    static final int NONE = -1;
    private static final ConcurrentMap<MultipartKey, String> cDateTimeInstanceCache = new ConcurrentHashMap(7);
    private final ConcurrentMap<MultipartKey, F> cInstanceCache = new ConcurrentHashMap(7);

    public static class MultipartKey {
        private int hashCode;
        private final Object[] keys;

        public MultipartKey(Object... objArr) {
            this.keys = objArr;
        }

        public boolean equals(Object obj) {
            return Arrays.equals(this.keys, ((MultipartKey) obj).keys);
        }

        public int hashCode() {
            Object[] objArr;
            int i = this.hashCode;
            if (i == 0) {
                int i2 = 0;
                for (Object obj : this.keys) {
                    if (obj != null) {
                        i2 = obj.hashCode() + (i2 * 7);
                    }
                }
                this.hashCode = i2;
                return i2;
            }
            return i;
        }
    }

    private F getDateTimeInstance(Integer num, Integer num2, TimeZone timeZone, Locale locale) {
        if (locale == null) {
            locale = Locale.getDefault();
        }
        return getInstance(getPatternForStyle(num, num2, locale), timeZone, locale);
    }

    public static String getPatternForStyle(Integer num, Integer num2, Locale locale) {
        DateFormat dateTimeInstance;
        MultipartKey multipartKey = new MultipartKey(num, num2, locale);
        ConcurrentMap<MultipartKey, String> concurrentMap = cDateTimeInstanceCache;
        String str = concurrentMap.get(multipartKey);
        if (str == null) {
            try {
                if (num == null) {
                    dateTimeInstance = DateFormat.getTimeInstance(num2.intValue(), locale);
                } else if (num2 == null) {
                    dateTimeInstance = DateFormat.getDateInstance(num.intValue(), locale);
                } else {
                    dateTimeInstance = DateFormat.getDateTimeInstance(num.intValue(), num2.intValue(), locale);
                }
                String pattern = ((SimpleDateFormat) dateTimeInstance).toPattern();
                String putIfAbsent = concurrentMap.putIfAbsent(multipartKey, pattern);
                if (putIfAbsent != null) {
                    return putIfAbsent;
                }
                return pattern;
            } catch (ClassCastException unused) {
                w26.i(locale, "No date time pattern for locale: ");
                return null;
            }
        }
        return str;
    }

    public abstract F createInstance(String str, TimeZone timeZone, Locale locale);

    public F getDateInstance(int i, TimeZone timeZone, Locale locale) {
        return getDateTimeInstance(Integer.valueOf(i), (Integer) null, timeZone, locale);
    }

    public F getInstance(String str, TimeZone timeZone, Locale locale) {
        if (str != null) {
            if (timeZone == null) {
                timeZone = TimeZone.getDefault();
            }
            if (locale == null) {
                locale = Locale.getDefault();
            }
            MultipartKey multipartKey = new MultipartKey(str, timeZone, locale);
            F f = this.cInstanceCache.get(multipartKey);
            if (f == null) {
                F createInstance = createInstance(str, timeZone, locale);
                F putIfAbsent = this.cInstanceCache.putIfAbsent(multipartKey, createInstance);
                if (putIfAbsent != null) {
                    return putIfAbsent;
                }
                return createInstance;
            }
            return f;
        }
        fvc.f("pattern must not be null");
        return null;
    }

    public F getTimeInstance(int i, TimeZone timeZone, Locale locale) {
        return getDateTimeInstance((Integer) null, Integer.valueOf(i), timeZone, locale);
    }

    public F getDateTimeInstance(int i, int i2, TimeZone timeZone, Locale locale) {
        return getDateTimeInstance(Integer.valueOf(i), Integer.valueOf(i2), timeZone, locale);
    }

    public F getInstance() {
        return getDateTimeInstance(3, 3, TimeZone.getDefault(), Locale.getDefault());
    }
}
