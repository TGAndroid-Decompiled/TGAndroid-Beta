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
import org.telegram.ui.Components.d5;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.pc;
import org.telegram.ui.aa;
import org.telegram.ui.d3;
import org.telegram.ui.j60;
import org.telegram.ui.o40;
import org.telegram.ui.p40;
import org.telegram.ui.r40;
import org.telegram.ui.t30;
public final class f implements View.OnClickListener {
    public final int f16635a;
    public final Object f16636b;
    public final Object f16637c;
    public final Object d;
    public final Object e;
    public final Object f16638f;
    public final Object h;
    public final Object f16639n;

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f16635a = i10;
        this.f16636b = obj;
        this.f16637c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f16638f = obj5;
        this.h = obj6;
        this.f16639n = obj7;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f16635a;
        Object obj = this.f16639n;
        Object obj2 = this.h;
        Object obj3 = this.f16638f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f16637c;
        Object obj7 = this.f16636b;
        switch (i10) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((pc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (f6) obj3, (VideoAds.AdLayout) obj2, (e) obj, view);
                return;
            default:
                j60 j60Var = (j60) obj7;
                dd0 dd0Var = (dd0) obj6;
                o40 o40Var = (o40) obj5;
                p40 p40Var = (p40) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                AccountInstance accountInstance = (AccountInstance) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                t30 t30Var = j60Var.f33953e1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                j60Var.X0 = ofFloat;
                ofFloat.setDuration(600L);
                j60Var.X0.addUpdateListener(new d3(j60Var, 15));
                j60Var.X0.addListener(new r40(j60Var));
                j60Var.X0.start();
                if (ChatObject.isChannelOrGiga(j60Var.Z0)) {
                    t30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    t30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g10 = d5.g(null, null, 0L, 604800L, 3, dd0Var, o40Var, p40Var);
                calendar.setTimeInMillis((dd0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, o40Var.getValue());
                calendar.set(12, p40Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                }
                j60Var.f33978k2 = (int) (calendar.getTimeInMillis() / 1000);
                j60Var.L1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = j60Var.f33978k2;
                creategroupcall.flags |= 2;
                accountInstance.getConnectionsManager().sendRequest(creategroupcall, new aa(j60Var, chat, inputPeer, 11), 2);
                return;
        }
    }
}
