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
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.nd0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Wallet.j2;
import org.telegram.ui.Wallet.o4;
import org.telegram.ui.b3;
import org.telegram.ui.b40;
import org.telegram.ui.c40;
import org.telegram.ui.e40;
import org.telegram.ui.ea;
import org.telegram.ui.g30;
import org.telegram.ui.x50;
public final class f implements View.OnClickListener {
    public final int f21552a;
    public final Object f21553b;
    public final Object f21554c;
    public final Object d;
    public final Object e;
    public final Object f21555f;
    public final Object h;
    public final Object f21556n;

    public f(fi.d dVar, o4 o4Var, Utilities.Callback3 callback3, String[] strArr, boolean[] zArr, j2[] j2VarArr, u6 u6Var) {
        this.f21552a = 2;
        this.f21553b = dVar;
        this.f21554c = o4Var;
        this.d = callback3;
        this.e = strArr;
        this.h = zArr;
        this.f21556n = j2VarArr;
        this.f21555f = u6Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f21552a;
        Object obj = this.f21555f;
        Object obj2 = this.f21556n;
        Object obj3 = this.h;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f21554c;
        Object obj7 = this.f21553b;
        switch (i10) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((qc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (u6) obj, (VideoAds.AdLayout) obj3, (e) obj2, view);
                return;
            case 1:
                x50 x50Var = (x50) obj7;
                nd0 nd0Var = (nd0) obj6;
                b40 b40Var = (b40) obj5;
                c40 c40Var = (c40) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                AccountInstance accountInstance = (AccountInstance) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                g30 g30Var = x50Var.f45508e1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                x50Var.X0 = ofFloat;
                ofFloat.setDuration(600L);
                x50Var.X0.addUpdateListener(new b3(x50Var, 13));
                x50Var.X0.addListener(new e40(x50Var));
                x50Var.X0.start();
                if (ChatObject.isChannelOrGiga(x50Var.Z0)) {
                    g30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    g30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean g7 = g5.g(null, null, 0L, 604800L, 3, nd0Var, b40Var, c40Var);
                calendar.setTimeInMillis((nd0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, b40Var.getValue());
                calendar.set(12, c40Var.getValue());
                if (g7) {
                    calendar.set(13, 0);
                }
                x50Var.f45534k2 = (int) (calendar.getTimeInMillis() / 1000);
                x50Var.M1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = x50Var.f45534k2;
                creategroupcall.flags |= 2;
                accountInstance.getConnectionsManager().sendRequest(creategroupcall, new ea(x50Var, chat, inputPeer, 11), 2);
                return;
            default:
                fi.d dVar = (fi.d) obj7;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj6;
                Utilities.Callback3 callback3 = (Utilities.Callback3) obj5;
                String[] strArr = (String[]) obj4;
                boolean[] zArr = (boolean[]) obj3;
                j2[] j2VarArr = (j2[]) obj2;
                u6 u6Var = (u6) obj;
                if (!dVar.Q) {
                    if (editTextBoldCursor != null && editTextBoldCursor.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                        AndroidUtilities.shakeViewSpring(editTextBoldCursor);
                        return;
                    }
                    dVar.setLoading(true);
                    callback3.run(strArr[0], Boolean.valueOf(zArr[0]), new org.telegram.ui.Wallet.o(dVar, j2VarArr, u6Var, 5));
                    return;
                }
                return;
        }
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f21552a = i10;
        this.f21553b = obj;
        this.f21554c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f21555f = obj5;
        this.h = obj6;
        this.f21556n = obj7;
    }
}
