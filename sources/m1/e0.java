package m1;

import java.io.File;
public final class e0 extends kotlin.jvm.internal.k implements rd.l {
    public static final e0 f19371b = new kotlin.jvm.internal.k(1);

    @Override
    public final Object invoke(Object obj) {
        File it = (File) obj;
        kotlin.jvm.internal.j.e(it, "it");
        String absolutePath = it.getCanonicalFile().getAbsolutePath();
        kotlin.jvm.internal.j.d(absolutePath, "file.canonicalFile.absolutePath");
        return new d1(absolutePath);
    }
}
