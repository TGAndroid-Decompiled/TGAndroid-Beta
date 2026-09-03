package jd;

import java.nio.charset.Charset;
public abstract class a {
    public static final Charset f9341a;

    static {
        Charset forName = Charset.forName("UTF-8");
        kotlin.jvm.internal.j.d(forName, "forName(...)");
        f9341a = forName;
        kotlin.jvm.internal.j.d(Charset.forName("UTF-16"), "forName(...)");
        kotlin.jvm.internal.j.d(Charset.forName("UTF-16BE"), "forName(...)");
        kotlin.jvm.internal.j.d(Charset.forName("UTF-16LE"), "forName(...)");
        kotlin.jvm.internal.j.d(Charset.forName("US-ASCII"), "forName(...)");
        kotlin.jvm.internal.j.d(Charset.forName("ISO-8859-1"), "forName(...)");
    }
}
