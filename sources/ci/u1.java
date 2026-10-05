package ci;

import android.graphics.Bitmap;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.eu;
import org.telegram.ui.Components.vy;
import org.telegram.ui.so0;
import org.telegram.ui.zg1;
public final class u1 implements Runnable {
    public final int f6053a;
    public final boolean f6054b;
    public final Object f6055c;
    public final Object d;
    public final Object f6056e;
    public final Object f6057f;

    public u1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f6053a = i10;
        this.f6055c = obj;
        this.d = obj2;
        this.f6056e = obj3;
        this.f6057f = obj4;
        this.f6054b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ci.u1.run():void");
    }

    public u1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.f6053a = i10;
        this.f6055c = obj;
        this.d = obj2;
        this.f6056e = obj3;
        this.f6054b = z10;
        this.f6057f = obj4;
    }

    public u1(Object obj, Object obj2, TLObject tLObject, Object obj3, boolean z10, int i10) {
        this.f6053a = i10;
        this.f6055c = obj;
        this.f6056e = obj2;
        this.d = tLObject;
        this.f6057f = obj3;
        this.f6054b = z10;
    }

    public u1(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.f6053a = i10;
        this.f6055c = obj;
        this.d = obj2;
        this.f6054b = z10;
        this.f6056e = obj3;
        this.f6057f = obj4;
    }

    public u1(ki.s0 s0Var, boolean z10, ki.t tVar, ki.o0 o0Var, File file) {
        this.f6053a = 4;
        this.f6055c = s0Var;
        this.f6054b = z10;
        this.d = tVar;
        this.f6056e = o0Var;
        this.f6057f = file;
    }

    public u1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, boolean z10, TLObject tLObject2, Object obj, int i10) {
        this.f6053a = i10;
        this.f6055c = notificationCenterDelegate;
        this.f6056e = tLObject;
        this.f6054b = z10;
        this.d = tLObject2;
        this.f6057f = obj;
    }

    public u1(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j3, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f6053a = 24;
        this.f6055c = payments_giveawayinfo;
        this.f6054b = z10;
        this.f6057f = str;
        this.d = tL_messageMediaGiveaway;
        this.f6056e = n2Var;
    }

    public u1(org.telegram.ui.Components.pa paVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.f6053a = 16;
        this.f6055c = paVar;
        this.f6057f = str;
        this.d = bitmap;
        this.f6054b = z10;
        this.f6056e = bitmap2;
    }

    public u1(eu euVar, boolean z10, fi.o oVar, String str, TextView textView) {
        this.f6053a = 17;
        this.f6055c = euVar;
        this.f6054b = z10;
        this.d = oVar;
        this.f6057f = str;
        this.f6056e = textView;
    }

    public u1(vy vyVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.f6053a = 18;
        this.f6055c = vyVar;
        this.f6057f = str;
        this.f6054b = z10;
        this.f6056e = str2;
        this.d = tLObject;
    }

    public u1(so0 so0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f6053a = 21;
        this.f6055c = so0Var;
        this.f6054b = z10;
        this.f6057f = str;
        this.d = str2;
        this.f6056e = updatepasswordsettings;
    }

    public u1(zg1 zg1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f6053a = 23;
        this.f6055c = zg1Var;
        this.d = tLObject;
        this.f6054b = z10;
        this.f6057f = str;
        this.f6056e = passwordinputsettings;
    }
}
