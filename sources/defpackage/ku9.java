package defpackage;

import java.util.ArrayList;
import org.telegram.messenger.Utilities;
public final class ku9 {
    public static ArrayList d;
    public final String a;
    public final String b;
    public final String c;

    public ku9(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static ku9 a() {
        ArrayList b = b();
        if (b.isEmpty()) {
            return new ku9("Google", "https://www.google.com/search?q=", "https://suggestqueries.google.com/complete/search?client=chrome&amp;q=");
        }
        return (ku9) b.get(Utilities.j(gda.m0, b.size() - 1, 0));
    }

    public static ArrayList b() {
        if (d == null) {
            d = new ArrayList();
            int i = 1;
            while (true) {
                String c = c(jb6.N0("SearchEngine" + i + "Name"));
                if (c == null) {
                    break;
                }
                String c2 = c(jb6.N0("SearchEngine" + i + "SearchURL"));
                String c3 = c(jb6.N0("SearchEngine" + i + "AutocompleteURL"));
                c(jb6.N0("SearchEngine" + i + "PrivacyPolicyURL"));
                d.add(new ku9(c, c2, c3));
                i++;
            }
        }
        return d;
    }

    public static String c(String str) {
        if (!str.startsWith("LOC_ERR") && !"reserved".equals(str)) {
            return str;
        }
        return null;
    }
}
