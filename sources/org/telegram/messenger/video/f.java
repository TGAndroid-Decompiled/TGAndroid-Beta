package org.telegram.messenger.video;

import android.animation.ValueAnimator;
import android.content.Context;
import android.view.View;
import java.nio.charset.StandardCharsets;
import java.util.Calendar;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.video.VideoAds;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.f5;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qd0;
import org.telegram.ui.Wallet.j2;
import org.telegram.ui.Wallet.q4;
import org.telegram.ui.a40;
import org.telegram.ui.c30;
import org.telegram.ui.ca;
import org.telegram.ui.d3;
import org.telegram.ui.u50;
import org.telegram.ui.x30;
import org.telegram.ui.y30;
public final class f implements View.OnClickListener {
    public final int f19860a;
    public final Object f19861b;
    public final Object f19862c;
    public final Object d;
    public final Object e;
    public final Object f19863f;
    public final Object h;
    public final Object f19864n;

    public f(ei.d dVar, q4 q4Var, Utilities.Callback3 callback3, String[] strArr, boolean[] zArr, j2[] j2VarArr, g6 g6Var) {
        this.f19860a = 2;
        this.f19861b = dVar;
        this.f19862c = q4Var;
        this.d = callback3;
        this.e = strArr;
        this.h = zArr;
        this.f19864n = j2VarArr;
        this.f19863f = g6Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f19860a;
        Object obj = this.f19863f;
        Object obj2 = this.f19864n;
        Object obj3 = this.h;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f19862c;
        Object obj7 = this.f19861b;
        switch (i10) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((qc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (g6) obj, (VideoAds.AdLayout) obj3, (e) obj2, view);
                return;
            case 1:
                u50 u50Var = (u50) obj7;
                qd0 qd0Var = (qd0) obj6;
                x30 x30Var = (x30) obj5;
                y30 y30Var = (y30) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                AccountInstance accountInstance = (AccountInstance) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                c30 c30Var = u50Var.f42188e1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                u50Var.X0 = ofFloat;
                ofFloat.setDuration(600L);
                u50Var.X0.addUpdateListener(new d3(u50Var, 15));
                u50Var.X0.addListener(new a40(u50Var));
                u50Var.X0.start();
                if (ChatObject.isChannelOrGiga(u50Var.Z0)) {
                    c30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    c30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g10 = f5.g(null, null, 0L, 604800L, 3, qd0Var, x30Var, y30Var);
                calendar.setTimeInMillis((qd0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, x30Var.getValue());
                calendar.set(12, y30Var.getValue());
                if (g10) {
                    calendar.set(13, 0);
                }
                u50Var.f42214k2 = (int) (calendar.getTimeInMillis() / 1000);
                u50Var.M1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = u50Var.f42214k2;
                creategroupcall.flags |= 2;
                accountInstance.getConnectionsManager().sendRequest(creategroupcall, new ca(u50Var, chat, inputPeer, 11), 2);
                return;
            default:
                ei.d dVar = (ei.d) obj7;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj6;
                Utilities.Callback3 callback3 = (Utilities.Callback3) obj5;
                String[] strArr = (String[]) obj4;
                boolean[] zArr = (boolean[]) obj3;
                j2[] j2VarArr = (j2[]) obj2;
                g6 g6Var = (g6) obj;
                if (!dVar.Q) {
                    if (editTextBoldCursor != null && editTextBoldCursor.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                        AndroidUtilities.shakeViewSpring(editTextBoldCursor);
                        return;
                    }
                    dVar.setLoading(true);
                    callback3.run(strArr[0], Boolean.valueOf(zArr[0]), new org.telegram.ui.Wallet.o(dVar, j2VarArr, g6Var, 5));
                    return;
                }
                return;
        }
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f19860a = i10;
        this.f19861b = obj;
        this.f19862c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f19863f = obj5;
        this.h = obj6;
        this.f19864n = obj7;
    }
}
