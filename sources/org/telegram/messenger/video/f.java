package org.telegram.messenger.video;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.dd;
import org.telegram.messenger.i0;
import org.telegram.messenger.m20;
import org.telegram.messenger.video.VideoAds;
import org.telegram.messenger.w3;
import org.telegram.messenger.wp;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.ac0;
import org.telegram.ui.Components.s4;
import org.telegram.ui.Components.wb;
import org.telegram.ui.Wallet.e5;
import org.telegram.ui.a3;
import org.telegram.ui.a50;
import org.telegram.ui.aa;
import org.telegram.ui.k30;
import org.telegram.ui.l30;
import org.telegram.ui.n30;
import org.telegram.ui.p20;
public final class f implements View.OnClickListener {
    public final int f18712a;
    public final Object f18713b;
    public final Object f18714c;
    public final Object d;
    public final Object e;
    public final Object f18715f;
    public final Object h;
    public final Object f18716n;

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f18712a = i10;
        this.f18713b = obj;
        this.f18714c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f18715f = obj5;
        this.h = obj6;
        this.f18716n = obj7;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f18712a;
        Object obj = this.f18715f;
        Object obj2 = this.f18716n;
        Object obj3 = this.h;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f18714c;
        Object obj7 = this.f18713b;
        switch (i10) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((wb) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (p6) obj, (VideoAds.AdLayout) obj3, (e) obj2, view);
                return;
            case 1:
                a50 a50Var = (a50) obj7;
                ac0 ac0Var = (ac0) obj6;
                k30 k30Var = (k30) obj5;
                l30 l30Var = (l30) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                p20 p20Var = a50Var.V2;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                a50Var.O2 = ofFloat;
                ofFloat.setDuration(600L);
                a50Var.O2.addUpdateListener(new a3(a50Var, 12));
                a50Var.O2.addListener(new n30(a50Var));
                a50Var.O2.start();
                if (w3.W(a50Var.Q2)) {
                    p20Var.b(dd.L0(2131743473, null), true);
                } else {
                    p20Var.b(dd.L0(2131743332, null), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g10 = s4.g(null, null, 0L, 604800L, 3, ac0Var, k30Var, l30Var);
                calendar.setTimeInMillis((ac0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, k30Var.getValue());
                calendar.set(12, l30Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                }
                a50Var.f35584b4 = (int) (calendar.getTimeInMillis() / 1000);
                a50Var.O1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = wp.k1(chat);
                creategroupcall.random_id = Utilities.f14520b.nextInt();
                creategroupcall.schedule_date = a50Var.f35584b4;
                creategroupcall.flags |= 2;
                ConnectionsManager.getInstance(cVar.f15043a).sendRequest(creategroupcall, new aa(a50Var, chat, inputPeer, 11), 2);
                return;
            default:
                vh.d dVar = (vh.d) obj7;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj6;
                m20 m20Var = (m20) obj5;
                String[] strArr = (String[]) obj4;
                boolean[] zArr = (boolean[]) obj3;
                org.telegram.ui.Wallet.a3[] a3VarArr = (org.telegram.ui.Wallet.a3[]) obj2;
                p6 p6Var = (p6) obj;
                if (!dVar.Q) {
                    if (editTextBoldCursor != null && editTextBoldCursor.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                        i0.G3(editTextBoldCursor);
                        return;
                    }
                    dVar.setLoading(true);
                    m20Var.a(strArr[0], Boolean.valueOf(zArr[0]), new org.telegram.ui.Wallet.m(dVar, a3VarArr, p6Var, 5));
                    return;
                }
                return;
        }
    }

    public f(vh.d dVar, e5 e5Var, m20 m20Var, String[] strArr, boolean[] zArr, org.telegram.ui.Wallet.a3[] a3VarArr, p6 p6Var) {
        this.f18712a = 2;
        this.f18713b = dVar;
        this.f18714c = e5Var;
        this.d = m20Var;
        this.e = strArr;
        this.h = zArr;
        this.f18716n = a3VarArr;
        this.f18715f = p6Var;
    }
}
