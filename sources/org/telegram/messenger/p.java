package org.telegram.messenger;

import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Canvas;
import android.net.Uri;
import android.text.StaticLayout;
import android.view.View;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import org.telegram.tgnet.QuickAckDelegate;
import org.telegram.tgnet.RequestTimeDelegate;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.yh0;
public final class p implements org.telegram.ui.ActionBar.u1, RequestTimeDelegate, gp, yh0, QuickAckDelegate {
    public final int f17388a;
    public final Object f17389b;
    public final Object f17390c;

    public p(int i10, Object obj, Object obj2) {
        this.f17388a = i10;
        this.f17389b = obj;
        this.f17390c = obj2;
    }

    @Override
    public boolean a(TLRPC.TL_error tL_error) {
        q0.a aVar = (q0.a) this.f17389b;
        TLRPC.User user = (TLRPC.User) this.f17390c;
        if (aVar != null) {
            aVar.accept(user);
        }
        if (tL_error != null && "USER_PRIVACY_RESTRICTED".equals(tL_error.text)) {
            return false;
        }
        return true;
    }

    @Override
    public void d(Canvas canvas) {
        uv uvVar = ((nv) this.f17389b).W;
        AtomicReference atomicReference = uvVar.D;
        StaticLayout staticLayout = uvVar.f18396b;
        ArrayList arrayList = uvVar.f18403x;
        nh.i.g((View) this.f17390c, false, -1, 0, atomicReference, 0, staticLayout, arrayList, canvas, false);
        org.telegram.ui.Components.o5.drawAnimatedEmojis(canvas, uvVar.f18396b, uvVar.E, 0.0f, arrayList, 0.0f, 0.0f, 0.0f, 1.0f);
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f17388a) {
            case 0:
                String str = (String) this.f17389b;
                org.telegram.ui.ActionBar.k2 k2Var = (org.telegram.ui.ActionBar.k2) this.f17390c;
                try {
                    k2Var.getParentActivity().startActivityForResult(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=" + str)), 500);
                    return;
                } catch (Exception e) {
                    f8.g(e, true);
                    return;
                }
            default:
                ((SharedPreferences) this.f17389b).edit().putBoolean("proxycheckstatusip", true).apply();
                ((mg) this.f17390c).run();
                return;
        }
    }

    @Override
    public void run(long j10) {
        i0.g3(new d4((boolean[]) this.f17389b, j10, (org.telegram.ui.Components.ec[]) this.f17390c, 10));
    }

    @Override
    public void run() {
        TLRPC.Message message = (TLRPC.Message) this.f17390c;
        i0.g3(new ix((qz) this.f17389b, message, message.f19814id, 1));
    }
}
