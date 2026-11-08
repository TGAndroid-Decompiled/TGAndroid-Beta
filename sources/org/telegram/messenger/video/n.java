package org.telegram.messenger.video;

import java.util.ArrayList;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.o6;
import org.telegram.ui.y6;
public final class n implements Runnable {
    public final int f26034a;
    public final boolean f26035b;
    public final long f26036c;
    public final Object d;
    public final Object f26037e;

    public n(Object obj, long j3, boolean z9, Object obj2, int i7) {
        this.f26034a = i7;
        this.d = obj;
        this.f26036c = j3;
        this.f26035b = z9;
        this.f26037e = obj2;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.video.n.run():void");
    }

    public n(y6 y6Var, boolean z9, long j3, o6 o6Var) {
        this.f26034a = 1;
        this.d = y6Var;
        this.f26035b = z9;
        this.f26036c = j3;
        this.f26037e = o6Var;
    }

    public n(ProfileActivity profileActivity, long j3, ArrayList arrayList, boolean z9) {
        this.f26034a = 2;
        this.d = profileActivity;
        this.f26036c = j3;
        this.f26037e = arrayList;
        this.f26035b = z9;
    }
}
