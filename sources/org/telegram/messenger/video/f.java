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
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.b30;
import org.telegram.ui.g3;
import org.telegram.ui.s50;
import org.telegram.ui.w30;
import org.telegram.ui.x30;
import org.telegram.ui.z30;
import org.telegram.ui.z9;

public final class f implements View.OnClickListener {

    public final int f21839a;

    public final Object f21840b;

    public final Object f21841c;
    public final Object d;

    public final Object f21842e;

    public final Object f21843f;
    public final Object h;

    public final Object f21844n;

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f21839a = i10;
        this.f21840b = obj;
        this.f21841c = obj2;
        this.d = obj3;
        this.f21842e = obj4;
        this.f21843f = obj5;
        this.h = obj6;
        this.f21844n = obj7;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f21839a;
        Object obj = this.f21844n;
        Object obj2 = this.h;
        Object obj3 = this.f21843f;
        Object obj4 = this.f21842e;
        Object obj5 = this.d;
        Object obj6 = this.f21841c;
        Object obj7 = this.f21840b;
        switch (i10) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((ec) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (c6) obj3, (VideoAds.AdLayout) obj2, (e) obj, view);
                break;
            default:
                s50 s50Var = (s50) obj7;
                fc0 fc0Var = (fc0) obj6;
                w30 w30Var = (w30) obj5;
                x30 x30Var = (x30) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                AccountInstance accountInstance = (AccountInstance) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                b30 b30Var = s50Var.f42411a1;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                s50Var.T0 = valueAnimatorOfFloat;
                valueAnimatorOfFloat.setDuration(600L);
                s50Var.T0.addUpdateListener(new g3(s50Var, 15));
                s50Var.T0.addListener(new z30(s50Var));
                s50Var.T0.start();
                if (ChatObject.isChannelOrGiga(s50Var.V0)) {
                    b30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    b30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean zG = y4.g(null, null, 0L, 604800L, 3, fc0Var, w30Var, x30Var);
                calendar.setTimeInMillis((((long) fc0Var.getValue()) * 86400000) + System.currentTimeMillis());
                int i11 = 11;
                calendar.set(11, w30Var.getValue());
                calendar.set(12, x30Var.getValue());
                if (zG) {
                    calendar.set(13, 0);
                }
                s50Var.f42438g2 = (int) (calendar.getTimeInMillis() / 1000);
                s50Var.L1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = s50Var.f42438g2;
                creategroupcall.flags |= 2;
                accountInstance.getConnectionsManager().sendRequest(creategroupcall, new z9(s50Var, chat, inputPeer, i11), 2);
                break;
        }
    }
}
