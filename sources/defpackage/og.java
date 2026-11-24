package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class og implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public og(m8 m8Var, ArrayList arrayList, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, d dVar, wjb wjbVar) {
        this.a = (byte) 14;
        this.c = m8Var;
        this.d = arrayList;
        this.e = tL_messages_stickerSet;
        this.b = dVar;
        this.f = wjbVar;
    }

    @Override
    public final void onClick(android.view.View r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.og.onClick(android.view.View):void");
    }

    public og(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public og(AtomicReference atomicReference, cd0 cd0Var, ui5 ui5Var, TLRPC.TL_forumTopic tL_forumTopic, d dVar) {
        this.a = (byte) 1;
        this.c = atomicReference;
        this.d = cd0Var;
        this.e = ui5Var;
        this.f = tL_forumTopic;
        this.b = dVar;
    }
}
