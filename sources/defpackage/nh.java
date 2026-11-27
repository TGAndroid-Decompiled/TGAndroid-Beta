package defpackage;

import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
public final class nh implements View.OnClickListener {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;

    public nh(n8 n8Var, ArrayList arrayList, TLRPC.TL_messages_stickerSet tL_messages_stickerSet, e eVar, vnb vnbVar) {
        this.a = (byte) 14;
        this.c = n8Var;
        this.d = arrayList;
        this.e = tL_messages_stickerSet;
        this.b = eVar;
        this.f = vnbVar;
    }

    @Override
    public final void onClick(android.view.View r21) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nh.onClick(android.view.View):void");
    }

    public nh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
    }

    public nh(AtomicReference atomicReference, ed0 ed0Var, wk5 wk5Var, TLRPC.TL_forumTopic tL_forumTopic, e eVar) {
        this.a = (byte) 1;
        this.c = atomicReference;
        this.d = ed0Var;
        this.e = wk5Var;
        this.f = tL_forumTopic;
        this.b = eVar;
    }
}
