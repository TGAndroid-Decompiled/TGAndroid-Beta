package dg;

import android.content.Context;
import android.view.ViewGroup;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
public final class u1 implements Runnable {
    public final int f4684a;
    public final int f4685b;
    public final Object f4686c;
    public final Object d;
    public final Object f4687e;

    public u1(int i10, Context context, g6 g6Var, TL_stars.SavedStarGift savedStarGift) {
        this.f4684a = 4;
        this.f4685b = i10;
        this.f4686c = context;
        this.d = g6Var;
        this.f4687e = savedStarGift;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: dg.u1.run():void");
    }

    public u1(ViewGroup viewGroup, Object obj, Object obj2, int i10, int i11) {
        this.f4684a = i11;
        this.f4686c = viewGroup;
        this.d = obj;
        this.f4687e = obj2;
        this.f4685b = i10;
    }

    public u1(fg.v0 v0Var, ArrayList arrayList, int i10, TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats) {
        this.f4684a = 3;
        this.f4686c = v0Var;
        this.f4687e = arrayList;
        this.f4685b = i10;
        this.d = tL_messages_inactiveChats;
    }

    public u1(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f4684a = i11;
        this.f4686c = obj;
        this.f4685b = i10;
        this.d = obj2;
        this.f4687e = obj3;
    }

    public u1(Object obj, int i10, ArrayList arrayList, Serializable serializable, int i11) {
        this.f4684a = i11;
        this.f4686c = obj;
        this.f4685b = i10;
        this.f4687e = arrayList;
        this.d = serializable;
    }

    public u1(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f4684a = i11;
        this.f4686c = obj;
        this.d = obj2;
        this.f4685b = i10;
        this.f4687e = obj3;
    }

    public u1(Object obj, ArrayList arrayList, Object obj2, int i10, int i11) {
        this.f4684a = i11;
        this.f4686c = obj;
        this.f4687e = arrayList;
        this.d = obj2;
        this.f4685b = i10;
    }
}
