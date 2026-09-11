package org.telegram.messenger.video;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.util.Calendar;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.vc0;
import org.telegram.ui.aa;
import org.telegram.ui.c3;
import org.telegram.ui.j60;
import org.telegram.ui.n40;
import org.telegram.ui.o40;
import org.telegram.ui.q40;
import org.telegram.ui.s30;
public final class f implements View.OnClickListener {
    public final int f19282a;
    public final Object f19283b;
    public final Object f19284c;
    public final Object d;
    public final Object f19285e;
    public final Object f19286f;
    public final Object h;
    public final Object f19287n;

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f19282a = i10;
        this.f19283b = obj;
        this.f19284c = obj2;
        this.d = obj3;
        this.f19285e = obj4;
        this.f19286f = obj5;
        this.h = obj6;
        this.f19287n = obj7;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f19282a;
        Object obj = this.f19287n;
        Object obj2 = this.h;
        Object obj3 = this.f19286f;
        Object obj4 = this.f19285e;
        Object obj5 = this.d;
        Object obj6 = this.f19284c;
        Object obj7 = this.f19283b;
        switch (i10) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((qc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (f6) obj3, (VideoAds.AdLayout) obj2, (e) obj, view);
                return;
            default:
                j60 j60Var = (j60) obj7;
                vc0 vc0Var = (vc0) obj6;
                n40 n40Var = (n40) obj5;
                o40 o40Var = (o40) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                AccountInstance accountInstance = (AccountInstance) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                s30 s30Var = j60Var.f37531e1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                j60Var.X0 = ofFloat;
                ofFloat.setDuration(600L);
                j60Var.X0.addUpdateListener(new c3(j60Var, 15));
                j60Var.X0.addListener(new q40(j60Var));
                j60Var.X0.start();
                if (ChatObject.isChannelOrGiga(j60Var.Z0)) {
                    s30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    s30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g10 = e5.g(null, null, 0L, 604800L, 3, vc0Var, n40Var, o40Var);
                calendar.setTimeInMillis((vc0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, n40Var.getValue());
                calendar.set(12, o40Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                }
                j60Var.f37556k2 = (int) (calendar.getTimeInMillis() / 1000);
                j60Var.L1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = j60Var.f37556k2;
                creategroupcall.flags |= 2;
                accountInstance.getConnectionsManager().sendRequest(creategroupcall, new aa(j60Var, chat, inputPeer, 11), 2);
                return;
        }
    }
}
