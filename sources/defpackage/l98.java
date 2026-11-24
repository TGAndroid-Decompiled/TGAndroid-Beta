package defpackage;

import java.io.File;
import java.util.List;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_iv;
public interface l98 {
    boolean a(int i);

    File b(int i);

    String c(int i);

    TLObject d(int i);

    boolean e(int i);

    TLRPC.PhotoSize f(TLObject tLObject, int[] iArr);

    Object g();

    TL_iv.PageBlock get(int i);

    List getAll();

    void h(TL_iv.PageBlock pageBlock);

    CharSequence i(int i);

    int j();
}
