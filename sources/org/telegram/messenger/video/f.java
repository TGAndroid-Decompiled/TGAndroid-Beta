package org.telegram.messenger.video;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.s10;
import org.telegram.messenger.v3;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.sb0;
import org.telegram.ui.Wallet.e3;
import org.telegram.ui.Wallet.r5;
import org.telegram.ui.a3;
import org.telegram.ui.f40;
import org.telegram.ui.p20;
import org.telegram.ui.q20;
import org.telegram.ui.s20;
import org.telegram.ui.t10;
import org.telegram.ui.z9;
public final class f implements View.OnClickListener {
    public final int f27391a;
    public final Object f27392b;
    public final Object f27393c;
    public final Object d;
    public final Object f27394e;
    public final Object f27395f;
    public final Object h;
    public final Object f27396n;

    public f(hi.d dVar, r5 r5Var, s10 s10Var, String[] strArr, boolean[] zArr, e3[] e3VarArr, i6 i6Var) {
        this.f27391a = 2;
        this.f27392b = dVar;
        this.f27393c = r5Var;
        this.d = s10Var;
        this.f27394e = strArr;
        this.h = zArr;
        this.f27396n = e3VarArr;
        this.f27395f = i6Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f27391a;
        Object obj = this.f27395f;
        Object obj2 = this.f27396n;
        Object obj3 = this.h;
        Object obj4 = this.f27394e;
        Object obj5 = this.d;
        Object obj6 = this.f27393c;
        Object obj7 = this.f27392b;
        switch (i7) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((gc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (i6) obj, (VideoAds.AdLayout) obj3, (e) obj2, view);
                return;
            case 1:
                f40 f40Var = (f40) obj7;
                sb0 sb0Var = (sb0) obj6;
                p20 p20Var = (p20) obj5;
                q20 q20Var = (q20) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                t10 t10Var = f40Var.Z2;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                f40Var.S2 = ofFloat;
                ofFloat.setDuration(600L);
                f40Var.S2.addUpdateListener(new a3(f40Var, 12));
                f40Var.S2.addListener(new s20(f40Var));
                f40Var.S2.start();
                if (v3.W(f40Var.U2)) {
                    t10Var.b(gd.M0(2131743210, null), true);
                } else {
                    t10Var.b(gd.M0(2131743069, null), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g10 = b5.g(null, null, 0L, 604800L, 3, sb0Var, p20Var, q20Var);
                calendar.setTimeInMillis((sb0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, p20Var.getValue());
                calendar.set(12, q20Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                }
                f40Var.f47435j4 = (int) (calendar.getTimeInMillis() / 1000);
                f40Var.U1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = mp.n1(chat);
                creategroupcall.random_id = Utilities.f22777b.nextInt();
                creategroupcall.schedule_date = f40Var.f47435j4;
                creategroupcall.flags |= 2;
                ConnectionsManager.getInstance(cVar.f23218a).sendRequest(creategroupcall, new z9(f40Var, chat, inputPeer, 11), 2);
                return;
            default:
                hi.d dVar = (hi.d) obj7;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj6;
                s10 s10Var = (s10) obj5;
                String[] strArr = (String[]) obj4;
                boolean[] zArr = (boolean[]) obj3;
                e3[] e3VarArr = (e3[]) obj2;
                i6 i6Var = (i6) obj;
                if (!dVar.R) {
                    if (editTextBoldCursor != null && editTextBoldCursor.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                        g0.F3(editTextBoldCursor);
                        return;
                    }
                    dVar.setLoading(true);
                    s10Var.a(strArr[0], Boolean.valueOf(zArr[0]), new org.telegram.ui.Wallet.o(dVar, e3VarArr, i6Var, 6));
                    return;
                }
                return;
        }
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i7) {
        this.f27391a = i7;
        this.f27392b = obj;
        this.f27393c = obj2;
        this.d = obj3;
        this.f27394e = obj4;
        this.f27395f = obj5;
        this.h = obj6;
        this.f27396n = obj7;
    }
}
