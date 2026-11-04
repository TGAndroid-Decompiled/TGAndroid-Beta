package org.telegram.messenger.video;

import java.util.ArrayList;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.p6;
import org.telegram.ui.z6;
public final class o implements Runnable {
    public final int f25934a;
    public final boolean f25935b;
    public final long f25936c;
    public final Object d;
    public final Object f25937e;

    public o(Object obj, long j10, boolean z10, Object obj2, int i3) {
        this.f25934a = i3;
        this.d = obj;
        this.f25936c = j10;
        this.f25935b = z10;
        this.f25937e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.o.run():void");
    }

    public o(z6 z6Var, boolean z10, long j10, p6 p6Var) {
        this.f25934a = 1;
        this.d = z6Var;
        this.f25935b = z10;
        this.f25936c = j10;
        this.f25937e = p6Var;
    }

    public o(ProfileActivity profileActivity, long j10, ArrayList arrayList, boolean z10) {
        this.f25934a = 2;
        this.d = profileActivity;
        this.f25936c = j10;
        this.f25937e = arrayList;
        this.f25935b = z10;
    }
}
