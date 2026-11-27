package defpackage;

import android.content.Context;
import android.view.View;
import java.util.ArrayList;
import org.telegram.tgnet.tl.TL_stars;
public final class az implements View.OnClickListener {
    public final byte a;
    public final long b;
    public final Context c;
    public final Object d;
    public final Object e;
    public final Object f;

    public az(Context context, vnb vnbVar, long j, TL_stars.StarGift starGift, ArrayList arrayList) {
        this.a = (byte) 2;
        this.c = context;
        this.d = vnbVar;
        this.b = j;
        this.f = starGift;
        this.e = arrayList;
    }

    @Override
    public final void onClick(android.view.View r23) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.az.onClick(android.view.View):void");
    }

    public az(ny0 ny0Var, long j, Context context, Object obj, Object obj2, byte b) {
        this.a = b;
        this.f = ny0Var;
        this.b = j;
        this.c = context;
        this.d = obj;
        this.e = obj2;
    }
}
