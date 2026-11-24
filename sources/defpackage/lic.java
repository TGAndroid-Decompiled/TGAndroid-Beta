package defpackage;

import android.app.Activity;
import org.telegram.messenger.voip.VoIPService;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class lic implements uv5, ee {
    public final TLRPC.User a;
    public final TLRPC.Chat b;
    public final String c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final Activity h;
    public final d n;
    public final j5 r;

    public lic(TLRPC.User user, TLRPC.Chat chat, String str, boolean z, boolean z2, boolean z3, Activity activity, d dVar, j5 j5Var) {
        this.a = user;
        this.b = chat;
        this.c = str;
        this.d = z;
        this.e = z2;
        this.f = z3;
        this.h = activity;
        this.n = dVar;
        this.r = j5Var;
    }

    @Override
    public final void a(TLRPC.InputPeer inputPeer, boolean z, boolean z2, boolean z3) {
        boolean z4 = this.d;
        Activity activity = this.h;
        j5 j5Var = this.r;
        TLRPC.Chat chat = this.b;
        String str = this.c;
        if (z4 && z2) {
            g95.S0((LaunchActivity) activity, j5Var, chat, inputPeer, z, str);
            return;
        }
        TLRPC.User user = this.a;
        boolean z5 = this.e;
        boolean z6 = this.f;
        d dVar = this.n;
        if (!z && str != null) {
            ric ricVar = new ric(activity, chat, user, chat, str, inputPeer, z5, z6, z4, activity, dVar, j5Var, z3);
            if (dVar != null) {
                dVar.showDialog(ricVar);
                return;
            }
            return;
        }
        sic.b(user, chat, str, inputPeer, z, z5, z6, z4, activity, dVar, j5Var, false, true, z3);
    }

    @Override
    public final void r(he heVar, int i) {
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        final TLRPC.User user = this.a;
        final TLRPC.Chat chat = this.b;
        final String str = this.c;
        final boolean z = this.d;
        final boolean z2 = this.e;
        final boolean z3 = this.f;
        final Activity activity = this.h;
        final d dVar = this.n;
        final j5 j5Var = this.r;
        if (sharedInstance != null) {
            VoIPService.getSharedInstance().hangUp(new Runnable() {
                @Override
                public final void run() {
                    sic.a = 0L;
                    sic.b(TLRPC.User.this, chat, str, null, false, z, z2, z3, activity, dVar, j5Var, true, true, false);
                }
            });
        } else {
            sic.b(user, chat, str, null, false, z, z2, z3, activity, dVar, j5Var, true, true, false);
        }
    }

    public lic(boolean z, Activity activity, j5 j5Var, TLRPC.Chat chat, String str, TLRPC.User user, boolean z2, boolean z3, d dVar) {
        this.d = z;
        this.h = activity;
        this.r = j5Var;
        this.b = chat;
        this.c = str;
        this.a = user;
        this.e = z2;
        this.f = z3;
        this.n = dVar;
    }
}
