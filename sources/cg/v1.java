package cg;

import android.content.Context;
import android.view.ViewGroup;
import java.io.Serializable;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
public final class v1 implements Runnable {
    public final int f2549a;
    public final int f2550b;
    public final Object f2551c;
    public final Object d;
    public final Object e;

    public v1(int i10, Context context, f6 f6Var, TL_stars.SavedStarGift savedStarGift) {
        this.f2549a = 4;
        this.f2550b = i10;
        this.f2551c = context;
        this.d = f6Var;
        this.e = savedStarGift;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: cg.v1.run():void");
    }

    public v1(ViewGroup viewGroup, Object obj, Object obj2, int i10, int i11) {
        this.f2549a = i11;
        this.f2551c = viewGroup;
        this.d = obj;
        this.e = obj2;
        this.f2550b = i10;
    }

    public v1(eg.v0 v0Var, ArrayList arrayList, int i10, TLRPC.TL_messages_inactiveChats tL_messages_inactiveChats) {
        this.f2549a = 3;
        this.f2551c = v0Var;
        this.e = arrayList;
        this.f2550b = i10;
        this.d = tL_messages_inactiveChats;
    }

    public v1(Object obj, int i10, Object obj2, Object obj3, int i11) {
        this.f2549a = i11;
        this.f2551c = obj;
        this.f2550b = i10;
        this.d = obj2;
        this.e = obj3;
    }

    public v1(Object obj, int i10, ArrayList arrayList, Serializable serializable, int i11) {
        this.f2549a = i11;
        this.f2551c = obj;
        this.f2550b = i10;
        this.e = arrayList;
        this.d = serializable;
    }

    public v1(Object obj, Object obj2, int i10, Object obj3, int i11) {
        this.f2549a = i11;
        this.f2551c = obj;
        this.d = obj2;
        this.f2550b = i10;
        this.e = obj3;
    }

    public v1(Object obj, ArrayList arrayList, Object obj2, int i10, int i11) {
        this.f2549a = i11;
        this.f2551c = obj;
        this.e = arrayList;
        this.d = obj2;
        this.f2550b = i10;
    }
}
