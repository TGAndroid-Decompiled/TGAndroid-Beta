package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class nxa {
    public TLRPC.User a;
    public String b;

    public static TLRPC.User a(ArrayList arrayList, long j) {
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            Object obj = arrayList.get(i);
            i++;
            TLRPC.User user = (TLRPC.User) obj;
            if (user.id == j) {
                return user;
            }
        }
        return null;
    }

    public final void b(d dVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.a.id);
        na7.q1(y6c.t0).a4(this.a, false, false);
        dVar.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final org.telegram.tgnet.TLRPC.ChatFull r17, final defpackage.uxa r18, final defpackage.hd[] r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.nxa.c(org.telegram.tgnet.TLRPC$ChatFull, uxa, hd[], boolean):void");
    }
}
