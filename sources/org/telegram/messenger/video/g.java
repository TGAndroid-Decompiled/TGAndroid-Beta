package org.telegram.messenger.video;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.g0;
import org.telegram.messenger.hd;
import org.telegram.messenger.np;
import org.telegram.messenger.t3;
import org.telegram.messenger.u10;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ib0;
import org.telegram.ui.Components.t4;
import org.telegram.ui.Components.xb;
import org.telegram.ui.Wallet.c5;
import org.telegram.ui.Wallet.x2;
import org.telegram.ui.a3;
import org.telegram.ui.c40;
import org.telegram.ui.m20;
import org.telegram.ui.n20;
import org.telegram.ui.p20;
import org.telegram.ui.q10;
import org.telegram.ui.z9;
public final class g implements View.OnClickListener {
    public final int f27016a;
    public final Object f27017b;
    public final Object f27018c;
    public final Object d;
    public final Object f27019e;
    public final Object f27020f;
    public final Object h;
    public final Object f27021n;

    public g(hi.d dVar, c5 c5Var, u10 u10Var, String[] strArr, boolean[] zArr, x2[] x2VarArr, e6 e6Var) {
        this.f27016a = 2;
        this.f27017b = dVar;
        this.f27018c = c5Var;
        this.d = u10Var;
        this.f27019e = strArr;
        this.h = zArr;
        this.f27021n = x2VarArr;
        this.f27020f = e6Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f27016a;
        Object obj = this.f27020f;
        Object obj2 = this.f27021n;
        Object obj3 = this.h;
        Object obj4 = this.f27019e;
        Object obj5 = this.d;
        Object obj6 = this.f27018c;
        Object obj7 = this.f27017b;
        switch (i7) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((xb) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (e6) obj, (VideoAds.AdLayout) obj3, (f) obj2, view);
                return;
            case 1:
                c40 c40Var = (c40) obj7;
                ib0 ib0Var = (ib0) obj6;
                m20 m20Var = (m20) obj5;
                n20 n20Var = (n20) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                q10 q10Var = c40Var.Z2;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                c40Var.S2 = ofFloat;
                ofFloat.setDuration(600L);
                c40Var.S2.addUpdateListener(new a3(c40Var, 12));
                c40Var.S2.addListener(new p20(c40Var));
                c40Var.S2.start();
                if (t3.W(c40Var.U2)) {
                    q10Var.b(hd.M0(2131743447, null), true);
                } else {
                    q10Var.b(hd.M0(2131743306, null), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g10 = t4.g(null, null, 0L, 604800L, 3, ib0Var, m20Var, n20Var);
                calendar.setTimeInMillis((ib0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, m20Var.getValue());
                calendar.set(12, n20Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                }
                c40Var.f45921j4 = (int) (calendar.getTimeInMillis() / 1000);
                c40Var.T1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = np.l1(chat);
                creategroupcall.random_id = Utilities.f22414b.nextInt();
                creategroupcall.schedule_date = c40Var.f45921j4;
                creategroupcall.flags |= 2;
                ConnectionsManager.getInstance(cVar.f22782a).sendRequest(creategroupcall, new z9(c40Var, chat, inputPeer, 11), 2);
                return;
            default:
                hi.d dVar = (hi.d) obj7;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj6;
                u10 u10Var = (u10) obj5;
                String[] strArr = (String[]) obj4;
                boolean[] zArr = (boolean[]) obj3;
                x2[] x2VarArr = (x2[]) obj2;
                e6 e6Var = (e6) obj;
                if (!dVar.R) {
                    if (editTextBoldCursor != null && editTextBoldCursor.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                        g0.G3(editTextBoldCursor);
                        return;
                    }
                    dVar.setLoading(true);
                    u10Var.a(strArr[0], Boolean.valueOf(zArr[0]), new org.telegram.ui.Wallet.m(dVar, x2VarArr, e6Var, 5));
                    return;
                }
                return;
        }
    }

    public g(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i7) {
        this.f27016a = i7;
        this.f27017b = obj;
        this.f27018c = obj2;
        this.d = obj3;
        this.f27019e = obj4;
        this.f27020f = obj5;
        this.h = obj6;
        this.f27021n = obj7;
    }
}
