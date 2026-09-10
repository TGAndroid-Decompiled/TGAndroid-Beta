package ed;

import bf.p;
import bf.s;
import com.google.android.gms.internal.vision.e2;
import java.util.regex.Pattern;
import org.telegram.ui.Cells.r6;
public final class a extends h {
    public static final Pattern e = Pattern.compile("^<([a-zA-Z0-9.!#$%&'*+/=?^_`{|}~-]+@[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?(?:\\.[a-zA-Z0-9](?:[a-zA-Z0-9-]{0,61}[a-zA-Z0-9])?)*)>");
    public static final Pattern f7452f = Pattern.compile("^<[a-zA-Z][a-zA-Z0-9.+-]{1,31}:[^<>\u0000- ]*>");

    @Override
    public final p b() {
        String a2 = a(e);
        if (a2 != null) {
            String h = e2.h(1, 1, a2);
            bf.k kVar = new bf.k(1, r6.i("mailto:", h), null);
            kVar.b(new s(h));
            return kVar;
        }
        String a10 = a(f7452f);
        if (a10 == null) {
            return null;
        }
        String h10 = e2.h(1, 1, a10);
        bf.k kVar2 = new bf.k(1, h10, null);
        kVar2.b(new s(h10));
        return kVar2;
    }

    @Override
    public final char d() {
        return '<';
    }
}
