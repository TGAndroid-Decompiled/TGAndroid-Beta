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
import org.telegram.messenger.r10;
import org.telegram.messenger.v3;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.i6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.qb0;
import org.telegram.ui.Wallet.f3;
import org.telegram.ui.Wallet.s5;
import org.telegram.ui.a3;
import org.telegram.ui.e40;
import org.telegram.ui.o20;
import org.telegram.ui.p20;
import org.telegram.ui.r20;
import org.telegram.ui.s10;
import org.telegram.ui.z9;
public final class f implements View.OnClickListener {
    public final int f27487a;
    public final Object f27488b;
    public final Object f27489c;
    public final Object d;
    public final Object f27490e;
    public final Object f27491f;
    public final Object h;
    public final Object f27492n;

    public f(hi.e eVar, s5 s5Var, r10 r10Var, String[] strArr, boolean[] zArr, f3[] f3VarArr, i6 i6Var) {
        this.f27487a = 2;
        this.f27488b = eVar;
        this.f27489c = s5Var;
        this.d = r10Var;
        this.f27490e = strArr;
        this.h = zArr;
        this.f27492n = f3VarArr;
        this.f27491f = i6Var;
    }

    @Override
    public final void onClick(View view) {
        int i7 = this.f27487a;
        Object obj = this.f27491f;
        Object obj2 = this.f27492n;
        Object obj3 = this.h;
        Object obj4 = this.f27490e;
        Object obj5 = this.d;
        Object obj6 = this.f27489c;
        Object obj7 = this.f27488b;
        switch (i7) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((fc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (i6) obj, (VideoAds.AdLayout) obj3, (e) obj2, view);
                return;
            case 1:
                e40 e40Var = (e40) obj7;
                qb0 qb0Var = (qb0) obj6;
                o20 o20Var = (o20) obj5;
                p20 p20Var = (p20) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                s10 s10Var = e40Var.Z2;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                e40Var.S2 = ofFloat;
                ofFloat.setDuration(600L);
                e40Var.S2.addUpdateListener(new a3(e40Var, 12));
                e40Var.S2.addListener(new r20(e40Var));
                e40Var.S2.start();
                if (v3.W(e40Var.U2)) {
                    s10Var.b(gd.N0(2131743197, null), true);
                } else {
                    s10Var.b(gd.N0(2131743056, null), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g10 = b5.g(null, null, 0L, 604800L, 3, qb0Var, o20Var, p20Var);
                calendar.setTimeInMillis((qb0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, o20Var.getValue());
                calendar.set(12, p20Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                }
                e40Var.f47357j4 = (int) (calendar.getTimeInMillis() / 1000);
                e40Var.T1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = mp.n1(chat);
                creategroupcall.random_id = Utilities.f22875b.nextInt();
                creategroupcall.schedule_date = e40Var.f47357j4;
                creategroupcall.flags |= 2;
                ConnectionsManager.getInstance(cVar.f23343a).sendRequest(creategroupcall, new z9(e40Var, chat, inputPeer, 11), 2);
                return;
            default:
                hi.e eVar = (hi.e) obj7;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj6;
                r10 r10Var = (r10) obj5;
                String[] strArr = (String[]) obj4;
                boolean[] zArr = (boolean[]) obj3;
                f3[] f3VarArr = (f3[]) obj2;
                i6 i6Var = (i6) obj;
                if (!eVar.R) {
                    if (editTextBoldCursor != null && editTextBoldCursor.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                        g0.F3(editTextBoldCursor);
                        return;
                    }
                    eVar.setLoading(true);
                    r10Var.a(strArr[0], Boolean.valueOf(zArr[0]), new org.telegram.ui.Wallet.o(eVar, f3VarArr, i6Var, 6));
                    return;
                }
                return;
        }
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i7) {
        this.f27487a = i7;
        this.f27488b = obj;
        this.f27489c = obj2;
        this.d = obj3;
        this.f27490e = obj4;
        this.f27491f = obj5;
        this.h = obj6;
        this.f27492n = obj7;
    }
}
