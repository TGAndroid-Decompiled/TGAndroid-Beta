package ai;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.go0;
import org.telegram.ui.Components.jo0;
import org.telegram.ui.Components.xv0;
public final class db implements Runnable {
    public final int f1154a;
    public final int f1155b;
    public final Object f1156c;
    public final Object d;
    public final Object e;

    public db(int i10, Object obj, Object obj2, Object obj3, int i11) {
        this.f1154a = i11;
        this.f1155b = i10;
        this.f1156c = obj;
        this.d = obj2;
        this.e = obj3;
    }

    private final void a() {
        throw new UnsupportedOperationException("Method not decompiled: ai.db.a():void");
    }

    private final void b() {
        xv0.g((xv0) this.f1156c, this.f1155b, (TL_stories.StoryItem) this.d, (String) this.e);
    }

    private final void c() {
        org.telegram.ui.ActionBar.o2 o2Var = ((xv0) this.f1156c).f32711v1;
        org.telegram.ui.Components.f5.f0(this.f1155b, (TLRPC.TL_error) this.d, o2Var, (TLRPC.TL_messages_editMessage) this.e, new Object[0]);
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ai.db.run():void");
    }

    public db(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f1154a = i11;
        this.f1156c = obj;
        this.f1155b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public db(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f1154a = i11;
        this.f1156c = obj;
        this.d = obj2;
        this.f1155b = i10;
        this.e = obj3;
    }

    public db(Object obj, Object obj2, Object obj3, int i10, int i11) {
        this.f1154a = i11;
        this.f1156c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f1155b = i10;
    }

    public db(jo0 jo0Var, int i10, go0 go0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f1154a = 24;
        this.f1156c = jo0Var;
        this.f1155b = i10;
        this.e = go0Var;
        this.d = g6Var;
    }
}
