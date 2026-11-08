package jf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public abstract class b {
    public static final Map f16659a;
    public static final Pattern f16660b;

    static {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(b.class.getResourceAsStream("/org/commonmark/internal/util/entities.properties"), Charset.forName("UTF-8")));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    if (readLine.length() != 0) {
                        int indexOf = readLine.indexOf("=");
                        hashMap.put(readLine.substring(0, indexOf), readLine.substring(indexOf + 1));
                    }
                } else {
                    bufferedReader.close();
                    hashMap.put("NewLine", "\n");
                    f16659a = hashMap;
                    f16660b = Pattern.compile("^&#[Xx]?");
                    return;
                }
            }
        } catch (IOException e10) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e10);
        }
    }

    public static String a(String str) {
        int i7;
        Matcher matcher = f16660b.matcher(str);
        if (matcher.find()) {
            if (matcher.end() == 2) {
                i7 = 10;
            } else {
                i7 = 16;
            }
            try {
                int parseInt = Integer.parseInt(str.substring(matcher.end(), str.length() - 1), i7);
                if (parseInt == 0) {
                    return "�";
                }
                return new String(Character.toChars(parseInt));
            } catch (IllegalArgumentException unused) {
                return "�";
            }
        }
        String str2 = (String) f16659a.get(com.google.android.recaptcha.internal.a.k(str, 1, 1));
        if (str2 != null) {
            return str2;
        }
        return str;
    }
}
