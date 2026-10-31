package org.telegram.messenger.video;

import java.util.ArrayList;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.o6;
import org.telegram.ui.y6;
public final class o implements Runnable {
    public final int f18581a;
    public final boolean f18582b;
    public final long f18583c;
    public final Object d;
    public final Object e;

    public o(Object obj, long j10, boolean z10, Object obj2, int i10) {
        this.f18581a = i10;
        this.d = obj;
        this.f18583c = j10;
        this.f18582b = z10;
        this.e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.o.run():void");
    }

    public o(y6 y6Var, boolean z10, long j10, o6 o6Var) {
        this.f18581a = 1;
        this.d = y6Var;
        this.f18582b = z10;
        this.f18583c = j10;
        this.e = o6Var;
    }

    public o(ProfileActivity profileActivity, long j10, ArrayList arrayList, boolean z10) {
        this.f18581a = 2;
        this.d = profileActivity;
        this.f18583c = j10;
        this.e = arrayList;
        this.f18582b = z10;
    }
}
