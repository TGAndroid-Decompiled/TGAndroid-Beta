package me;

import e2.c;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public abstract class b {
    public static final Map f13647a;
    public static final Pattern f13648b;

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
                    f13647a = hashMap;
                    f13648b = Pattern.compile("^&#[Xx]?");
                    return;
                }
            }
        } catch (IOException e6) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e6);
        }
    }

    public static String a(String str) {
        int i10;
        Matcher matcher = f13648b.matcher(str);
        if (matcher.find()) {
            if (matcher.end() == 2) {
                i10 = 10;
            } else {
                i10 = 16;
            }
            try {
                int parseInt = Integer.parseInt(str.substring(matcher.end(), str.length() - 1), i10);
                if (parseInt == 0) {
                    return "�";
                }
                return new String(Character.toChars(parseInt));
            } catch (IllegalArgumentException unused) {
                return "�";
            }
        }
        String str2 = (String) f13647a.get(c.j(str, 1, 1));
        if (str2 != null) {
            return str2;
        }
        return str;
    }
}
