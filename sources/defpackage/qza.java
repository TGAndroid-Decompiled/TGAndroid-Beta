package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.ProfileActivity;
public final class qza {
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
        oc7.r1(z8c.t0).c4(this.a, false, false);
        dVar.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final org.telegram.tgnet.TLRPC.ChatFull r17, final defpackage.xza r18, final defpackage.he[] r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.qza.c(org.telegram.tgnet.TLRPC$ChatFull, xza, he[], boolean):void");
    }
}
