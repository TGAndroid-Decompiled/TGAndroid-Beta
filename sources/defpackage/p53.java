package defpackage;

import android.net.Uri;
import android.text.TextUtils;
import j$.util.DesugarTimeZone;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public final class p53 implements bv7 {
    public static final Pattern a = Pattern.compile("(.+?)(Z|((\\+|-|−)(\\d\\d)(:?(\\d\\d))?))");

    @Override
    public final Object v(Uri uri, s63 s63Var) {
        long j;
        long parseLong;
        String readLine = new BufferedReader(new InputStreamReader(s63Var, StandardCharsets.UTF_8)).readLine();
        try {
            Matcher matcher = a.matcher(readLine);
            if (matcher.matches()) {
                String group = matcher.group(1);
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd'T'HH:mm:ss", Locale.US);
                simpleDateFormat.setTimeZone(DesugarTimeZone.getTimeZone("UTC"));
                long time = simpleDateFormat.parse(group).getTime();
                if (!"Z".equals(matcher.group(2))) {
                    if ("+".equals(matcher.group(4))) {
                        j = 1;
                    } else {
                        j = -1;
                    }
                    long parseLong2 = Long.parseLong(matcher.group(5));
                    String group2 = matcher.group(7);
                    if (TextUtils.isEmpty(group2)) {
                        parseLong = 0;
                    } else {
                        parseLong = Long.parseLong(group2);
                    }
                    time -= (((parseLong2 * 60) + parseLong) * 60000) * j;
                }
                return Long.valueOf(time);
            }
            throw av7.b("Couldn't parse timestamp: " + readLine, null);
        } catch (ParseException e) {
            throw av7.b(null, e);
        }
    }
}
