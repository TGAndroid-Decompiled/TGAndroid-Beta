package ag;

import android.content.Context;
import android.view.ViewGroup;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.c6;
public final class z1 implements Runnable {
    public final int f732a;
    public final int f733b;
    public final Object f734c;
    public final Object d;
    public final Object f735e;

    public z1(int i10, Context context, c6 c6Var, TL_stars.SavedStarGift savedStarGift) {
        this.f732a = 4;
        this.f733b = i10;
        this.f734c = context;
        this.d = c6Var;
        this.f735e = savedStarGift;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ag.z1.run():void");
    }

    public z1(ViewGroup viewGroup, Object obj, Object obj2, int i10, int i11) {
        this.f732a = i11;
        this.f734c = viewGroup;
        this.d = obj;
        this.f735e = obj2;
        this.f733b = i10;
    }

    public z1(cg.v0 v0Var, ArrayList arrayList, int i10, TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats) {
        this.f732a = 2;
        this.f734c = v0Var;
        this.f735e = arrayList;
        this.f733b = i10;
        this.d = tL_messages_inactiveChats;
    }

    public z1(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f732a = i11;
        this.f734c = obj;
        this.f733b = i10;
        this.d = obj2;
        this.f735e = obj3;
    }

    public z1(Object obj, int i10, ArrayList arrayList, Serializable serializable, int i11) {
        this.f732a = i11;
        this.f734c = obj;
        this.f733b = i10;
        this.f735e = arrayList;
        this.d = serializable;
    }

    public z1(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f732a = i11;
        this.f734c = obj;
        this.d = obj2;
        this.f733b = i10;
        this.f735e = obj3;
    }

    public z1(Object obj, ArrayList arrayList, Object obj2, int i10, int i11) {
        this.f732a = i11;
        this.f734c = obj;
        this.f735e = arrayList;
        this.d = obj2;
        this.f733b = i10;
    }
}
