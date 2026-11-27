package defpackage;

import android.os.Bundle;
import java.util.ArrayList;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.ProfileActivity;
public final class p1b {
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

    public final void b(e eVar) {
        Bundle bundle = new Bundle();
        bundle.putLong("user_id", this.a.id);
        uc7.s1(yac.t0).i4(this.a, false, false);
        eVar.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void c(final org.telegram.tgnet.TLRPC.ChatFull r17, final defpackage.w1b r18, final defpackage.id[] r19, boolean r20) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.p1b.c(org.telegram.tgnet.TLRPC$ChatFull, w1b, id[], boolean):void");
    }
}
