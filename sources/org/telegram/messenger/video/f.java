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
import org.telegram.ui.Components.e5;
import org.telegram.ui.Components.ed0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.d3;
import org.telegram.ui.da;
import org.telegram.ui.g60;
import org.telegram.ui.l40;
import org.telegram.ui.m40;
import org.telegram.ui.o40;
import org.telegram.ui.q30;
public final class f implements View.OnClickListener {
    public final int f17801a;
    public final Object f17802b;
    public final Object f17803c;
    public final Object d;
    public final Object e;
    public final Object f17804f;
    public final Object h;
    public final Object f17805n;

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f17801a = i10;
        this.f17802b = obj;
        this.f17803c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f17804f = obj5;
        this.h = obj6;
        this.f17805n = obj7;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f17801a;
        Object obj = this.f17805n;
        Object obj2 = this.h;
        Object obj3 = this.f17804f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f17803c;
        Object obj7 = this.f17802b;
        switch (i10) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((qc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (e6) obj3, (VideoAds.AdLayout) obj2, (e) obj, view);
                return;
            default:
                g60 g60Var = (g60) obj7;
                ed0 ed0Var = (ed0) obj6;
                l40 l40Var = (l40) obj5;
                m40 m40Var = (m40) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                AccountInstance accountInstance = (AccountInstance) obj2;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj;
                q30 q30Var = g60Var.f33743e1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                g60Var.X0 = ofFloat;
                ofFloat.setDuration(600L);
                g60Var.X0.addUpdateListener(new d3(g60Var, 14));
                g60Var.X0.addListener(new o40(g60Var));
                g60Var.X0.start();
                if (ChatObject.isChannelOrGiga(g60Var.Z0)) {
                    q30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    q30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g10 = e5.g(null, null, 0L, 604800L, 3, ed0Var, l40Var, m40Var);
                calendar.setTimeInMillis((ed0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, l40Var.getValue());
                calendar.set(12, m40Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                }
                g60Var.f33768k2 = (int) (calendar.getTimeInMillis() / 1000);
                g60Var.L1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = g60Var.f33768k2;
                creategroupcall.flags |= 2;
                accountInstance.getConnectionsManager().sendRequest(creategroupcall, new da(g60Var, chat, inputPeer, 11), 2);
                return;
        }
    }
}
