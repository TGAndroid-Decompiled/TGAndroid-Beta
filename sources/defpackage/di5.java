package defpackage;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public abstract class di5 {
    public static final Map a;
    public static final Pattern b;

    static {
        HashMap hashMap = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(di5.class.getResourceAsStream("/org/commonmark/internal/util/entities.properties"), Charset.forName("UTF-8")));
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
                    a = hashMap;
                    b = Pattern.compile("^&#[Xx]?");
                    return;
                }
            }
        } catch (IOException e) {
            su3.f("Failed reading data for HTML named character references", e);
        }
    }

    public static String a(String str) {
        int i;
        Matcher matcher = b.matcher(str);
        if (matcher.find()) {
            if (matcher.end() == 2) {
                i = 10;
            } else {
                i = 16;
            }
            try {
                int parseInt = Integer.parseInt(str.substring(matcher.end(), str.length() - 1), i);
                if (parseInt == 0) {
                    return "�";
                }
                return new String(Character.toChars(parseInt));
            } catch (IllegalArgumentException unused) {
                return "�";
            }
        }
        String str2 = (String) a.get(bs2.n(1, 1, str));
        if (str2 != null) {
            return str2;
        }
        return str;
    }
}
