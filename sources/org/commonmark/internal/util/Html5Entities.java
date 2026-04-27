package org.commonmark.internal.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.Charset;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class Html5Entities {
    private static final Map NAMED_CHARACTER_REFERENCES = readEntities();
    private static final Pattern NUMERIC_PATTERN = Pattern.compile("^&#[Xx]?");

    public static String entityToString(String str) throws NumberFormatException {
        Matcher matcher = NUMERIC_PATTERN.matcher(str);
        if (matcher.find()) {
            try {
                int i = Integer.parseInt(str.substring(matcher.end(), str.length() - 1), matcher.end() == 2 ? 10 : 16);
                if (i == 0) {
                    return "�";
                }
                return new String(Character.toChars(i));
            } catch (IllegalArgumentException unused) {
                return "�";
            }
        }
        String str2 = (String) NAMED_CHARACTER_REFERENCES.get(str.substring(1, str.length() - 1));
        return str2 != null ? str2 : str;
    }

    private static Map readEntities() throws IOException {
        HashMap map = new HashMap();
        try {
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(Html5Entities.class.getResourceAsStream("/org/commonmark/internal/util/entities.properties"), Charset.forName("UTF-8")));
            while (true) {
                try {
                    String line = bufferedReader.readLine();
                    if (line != null) {
                        if (line.length() != 0) {
                            int iIndexOf = line.indexOf("=");
                            map.put(line.substring(0, iIndexOf), line.substring(iIndexOf + 1));
                        }
                    } else {
                        bufferedReader.close();
                        map.put("NewLine", "\n");
                        return map;
                    }
                } finally {
                }
            }
        } catch (IOException e) {
            throw new IllegalStateException("Failed reading data for HTML named character references", e);
        }
    }
}
