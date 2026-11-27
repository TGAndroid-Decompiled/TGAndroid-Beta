package defpackage;

import android.util.SparseIntArray;
import java.util.ArrayList;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.ui.NotificationsSettingsActivity;
public final class o77 implements Runnable {
    public final byte a;
    public final fn7 b;
    public final Cloneable c;
    public final Cloneable d;
    public final Cloneable e;
    public final Cloneable f;
    public final Cloneable h;
    public final Cloneable n;
    public final Cloneable r;
    public final Object s;
    public final Cloneable w;

    public o77(NotificationsSettingsActivity notificationsSettingsActivity, ArrayList arrayList, ArrayList arrayList2, ArrayList arrayList3, ArrayList arrayList4, ArrayList arrayList5, ArrayList arrayList6, ArrayList arrayList7, ArrayList arrayList8, av2 av2Var) {
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
        this.s = av2Var;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.o77.run():void");
    }

    public o77(uc7 uc7Var, LongSparseIntArray longSparseIntArray, LongSparseIntArray longSparseIntArray2, SparseIntArray sparseIntArray, zh6 zh6Var, zh6 zh6Var2, zh6 zh6Var3, zh6 zh6Var4, zh6 zh6Var5, LongSparseIntArray longSparseIntArray3, byte b) {
        this.a = b;
        this.b = uc7Var;
        this.c = longSparseIntArray;
        this.d = longSparseIntArray2;
        this.e = sparseIntArray;
        this.f = zh6Var;
        this.h = zh6Var2;
        this.n = zh6Var3;
        this.r = zh6Var4;
        this.s = zh6Var5;
        this.w = longSparseIntArray3;
    }
}
