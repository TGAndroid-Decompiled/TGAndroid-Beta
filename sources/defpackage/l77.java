package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class l77 implements Runnable {
    public final byte a;
    public final jm7 b;
    public final Cloneable c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f;
    public final Cloneable h;
    public final Cloneable n;
    public final Cloneable r;
    public final Object s;
    public final Cloneable w;

    public l77(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, sv2 sv2Var) {
        this.a = (byte) 2;
        this.b = notificationsSettingsActivity;
        this.c = arrayList;
        this.d = arrayList2;
        this.w = arrayList3;
        this.e = arrayList4;
        this.f = arrayList5;
        this.h = arrayList6;
        this.n = arrayList7;
        this.r = arrayList8;
        this.s = sv2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.l77.run():void");
    }

    public l77(oc7 oc7Var, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, vh6 vh6Var, vh6 vh6Var2, vh6 vh6Var3, vh6 vh6Var4, vh6 vh6Var5, LongSparseIntArray longSparseIntArray3, byte b) {
        this.a = b;
        this.b = oc7Var;
        this.c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f = vh6Var;
        this.h = vh6Var2;
        this.n = vh6Var3;
        this.r = vh6Var4;
        this.s = vh6Var5;
        this.w = longSparseIntArray3;
    }
}
