package defpackage;

import android.content.DialogInterface;
import java.util.ArrayList;
public final class ff implements DialogInterface.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public ff(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override
    public final void onClick(android.content.DialogInterface r19, int r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ff.onClick(android.content.DialogInterface, int):void");
    }

    public ff(Object obj, ArrayList arrayList, byte b) {
        this.a = b;
        this.c = obj;
        this.b = arrayList;
    }
}
