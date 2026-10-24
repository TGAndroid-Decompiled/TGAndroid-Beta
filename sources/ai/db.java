package ai;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.Components.fo0;
import org.telegram.ui.Components.io0;
import org.telegram.ui.Components.wv0;
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
        wv0.g((wv0) this.f1156c, this.f1155b, (TL_stories.StoryItem) this.d, (String) this.e);
    }

    private final void c() {
        org.telegram.ui.ActionBar.o2 o2Var = ((wv0) this.f1156c).f32410v1;
        org.telegram.ui.Components.d5.e0(this.f1155b, (TLRPC.TL_error) this.d, o2Var, (TLRPC.TL_messages_editMessage) this.e, new Object[0]);
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

    public db(io0 io0Var, int i10, fo0 fo0Var, org.telegram.ui.ActionBar.g6 g6Var) {
        this.f1154a = 24;
        this.f1156c = io0Var;
        this.f1155b = i10;
        this.e = fo0Var;
        this.d = g6Var;
    }
}
