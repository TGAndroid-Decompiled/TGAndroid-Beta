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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.g5;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.ud0;
import org.telegram.ui.Wallet.e4;
import org.telegram.ui.Wallet.i2;
import org.telegram.ui.e3;
import org.telegram.ui.fa;
import org.telegram.ui.n60;
import org.telegram.ui.r40;
import org.telegram.ui.s40;
import org.telegram.ui.u40;
import org.telegram.ui.w30;
public final class f implements View.OnClickListener {
    public final int f18722a;
    public final Object f18723b;
    public final Object f18724c;
    public final Object d;
    public final Object e;
    public final Object f18725f;
    public final Object h;
    public final Object f18726n;

    public f(di.d dVar, e4 e4Var, Utilities.Callback3 callback3, String[] strArr, boolean[] zArr, i2[] i2VarArr, c6 c6Var) {
        this.f18722a = 2;
        this.f18723b = dVar;
        this.f18724c = e4Var;
        this.d = callback3;
        this.e = strArr;
        this.h = zArr;
        this.f18726n = i2VarArr;
        this.f18725f = c6Var;
    }

    @Override
    public final void onClick(View view) {
        int i10 = this.f18722a;
        Object obj = this.f18725f;
        Object obj2 = this.f18726n;
        Object obj3 = this.h;
        Object obj4 = this.e;
        Object obj5 = this.d;
        Object obj6 = this.f18724c;
        Object obj7 = this.f18723b;
        switch (i10) {
            case 0:
                ((VideoAds) obj7).lambda$show$17((sc) obj6, (TLRPC.TL_sponsoredMessage) obj5, (Context) obj4, (c6) obj, (VideoAds.AdLayout) obj3, (e) obj2, view);
                return;
            case 1:
                n60 n60Var = (n60) obj7;
                ud0 ud0Var = (ud0) obj6;
                r40 r40Var = (r40) obj5;
                s40 s40Var = (s40) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj;
                AccountInstance accountInstance = (AccountInstance) obj3;
                TLRPC.InputPeer inputPeer = (TLRPC.InputPeer) obj2;
                w30 w30Var = n60Var.f38459e1;
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                n60Var.X0 = ofFloat;
                ofFloat.setDuration(600L);
                n60Var.X0.addUpdateListener(new e3(n60Var, 15));
                n60Var.X0.addListener(new u40(n60Var));
                n60Var.X0.start();
                if (ChatObject.isChannelOrGiga(n60Var.Z0)) {
                    w30Var.b(LocaleController.getString(R.string.VoipChannelVoiceChat), true);
                } else {
                    w30Var.b(LocaleController.getString(R.string.VoipGroupVoiceChat), true);
                }
                Calendar calendar = Calendar.getInstance();
                boolean f7 = g5.f(null, null, 0L, 604800L, 3, ud0Var, r40Var, s40Var);
                calendar.setTimeInMillis((ud0Var.getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, r40Var.getValue());
                calendar.set(12, s40Var.getValue());
                if (f7) {
                    calendar.set(13, 0);
                }
                n60Var.f38485k2 = (int) (calendar.getTimeInMillis() / 1000);
                n60Var.M1(false);
                TL_phone.createGroupCall creategroupcall = new TL_phone.createGroupCall();
                creategroupcall.peer = MessagesController.getInputPeer(chat);
                creategroupcall.random_id = Utilities.random.nextInt();
                creategroupcall.schedule_date = n60Var.f38485k2;
                creategroupcall.flags |= 2;
                accountInstance.getConnectionsManager().sendRequest(creategroupcall, new fa(n60Var, chat, inputPeer, 11), 2);
                return;
            default:
                di.d dVar = (di.d) obj7;
                EditTextBoldCursor editTextBoldCursor = (EditTextBoldCursor) obj6;
                Utilities.Callback3 callback3 = (Utilities.Callback3) obj5;
                String[] strArr = (String[]) obj4;
                boolean[] zArr = (boolean[]) obj3;
                i2[] i2VarArr = (i2[]) obj2;
                c6 c6Var = (c6) obj;
                if (!dVar.N) {
                    if (editTextBoldCursor != null && editTextBoldCursor.getText().toString().getBytes(StandardCharsets.UTF_8).length > 960) {
                        AndroidUtilities.shakeViewSpring(editTextBoldCursor);
                        return;
                    }
                    dVar.setLoading(true);
                    callback3.run(strArr[0], Boolean.valueOf(zArr[0]), new org.telegram.ui.Wallet.o(dVar, i2VarArr, c6Var, 5));
                    return;
                }
                return;
        }
    }

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i10) {
        this.f18722a = i10;
        this.f18723b = obj;
        this.f18724c = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f18725f = obj5;
        this.h = obj6;
        this.f18726n = obj7;
    }
}
