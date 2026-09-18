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
import org.telegram.ui.ActionBar.e6;
import org.telegram.ui.Components.dd0;
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.qc;
import org.telegram.ui.b3;
import org.telegram.ui.ba;
import org.telegram.ui.i60;
import org.telegram.ui.n40;
import org.telegram.ui.o40;
import org.telegram.ui.q40;
import org.telegram.ui.s30;
public final class f implements View.OnClickListener {
    public final int f17758a;
    public final Object f17759b;
    public final Object f17760c;
    public final Object d;
    public final Object e;
    public final Object f17761f;
    public final Object h;
    public final Object f17762n;

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f17758a = i10;
        this.f17759b = obj;
        this.f17760c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f17761f = obj5;
        this.h = obj6;
        this.f17762n = obj7;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f17758a;
        Object obj = this.f17762n;
        Object obj2 = this.h;
        Object obj3 = this.f17761f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f17760c;
        Object obj7 = this.f17759b;
        switch (i10) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((qc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (e6) obj3, (VideoAds.AdLayout) obj2, (e) obj, view);
                return;
            default:
                i60 i60Var = (i60) obj7;
                dd0 dd0Var = (dd0) obj6;
                n40 n40Var = (n40) obj5;
                o40 o40Var = (o40) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                AccountInstance accountInstance = (AccountInstance) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                s30 s30Var = i60Var.f34346e1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                i60Var.X0 = ofFloat;
                ofFloat.setDuration(600L);
                i60Var.X0.addUpdateListener(new b3(i60Var, 14));
                i60Var.X0.addListener(new q40(i60Var));
                i60Var.X0.start();
                if (ChatObject.isChannelOrGiga(i60Var.Z0)) {
                    s30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    s30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g10 = e5.g(null, null, 0L, 604800L, 3, dd0Var, n40Var, o40Var);
                calendar.setTimeInMillis((dd0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, n40Var.getValue());
                calendar.set(12, o40Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                }
                i60Var.f34371k2 = (int) (calendar.getTimeInMillis() / 1000);
                i60Var.L1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = i60Var.f34371k2;
                creategroupcall.flags |= 2;
                accountInstance.getConnectionsManager().sendRequest(creategroupcall, new ba(i60Var, chat, inputPeer, 11), 2);
                return;
        }
    }
}
