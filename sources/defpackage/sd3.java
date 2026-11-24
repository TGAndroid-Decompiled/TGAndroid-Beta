package defpackage;

import android.content.Context;
import android.content.Intent;
import android.view.View;
public final class sd3 implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;

    public sd3(jvb jvbVar) {
        this.a = (byte) 2;
        this.c = jvbVar;
        Context context = jvbVar.a.getContext();
        CharSequence charSequence = jvbVar.h;
        ?? obj = new Object();
        obj.e = 4096;
        obj.g = 4096;
        obj.l = null;
        obj.m = null;
        obj.n = false;
        obj.o = false;
        obj.p = 16;
        obj.i = context;
        obj.a = charSequence;
        this.b = obj;
    }

    @Override
    public final void onClick(android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.sd3.onClick(android.view.View):void");
    }

    public sd3(Object obj, Object obj2, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
    }

    public sd3(Context context, Intent intent) {
        this.a = (byte) 3;
        this.b = context;
        this.c = intent;
    }
}
