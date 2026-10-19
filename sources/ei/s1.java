package ei;

import android.graphics.Bitmap;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.iu;
import org.telegram.ui.eo0;
import org.telegram.ui.vf1;
public final class s1 implements Runnable {
    public final int f9762a;
    public final boolean f9763b;
    public final Object f9764c;
    public final Object d;
    public final Object e;
    public final Object f9765f;

    public s1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f9762a = i10;
        this.f9764c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f9765f = obj4;
        this.f9763b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.s1.run():void");
    }

    public s1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.f9762a = i10;
        this.f9764c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f9763b = z10;
        this.f9765f = obj4;
    }

    public s1(Object obj, Object obj2, TLObject tLObject, Object obj3, boolean z10, int i10) {
        this.f9762a = i10;
        this.f9764c = obj;
        this.e = obj2;
        this.d = tLObject;
        this.f9765f = obj3;
        this.f9763b = z10;
    }

    public s1(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.f9762a = i10;
        this.f9764c = obj;
        this.d = obj2;
        this.f9763b = z10;
        this.e = obj3;
        this.f9765f = obj4;
    }

    public s1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, boolean z10, TLObject tLObject2, Object obj, int i10) {
        this.f9762a = i10;
        this.f9764c = notificationCenterDelegate;
        this.e = tLObject;
        this.f9763b = z10;
        this.d = tLObject2;
        this.f9765f = obj;
    }

    public s1(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j10, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f9762a = 24;
        this.f9764c = payments_giveawayinfo;
        this.f9763b = z10;
        this.f9765f = str;
        this.d = tL_messageMediaGiveaway;
        this.e = n2Var;
    }

    public s1(org.telegram.ui.Components.oa oaVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.f9762a = 15;
        this.f9764c = oaVar;
        this.f9765f = str;
        this.d = bitmap;
        this.f9763b = z10;
        this.e = bitmap2;
    }

    public s1(iu iuVar, boolean z10, ai.t tVar, String str, TextView textView) {
        this.f9762a = 16;
        this.f9764c = iuVar;
        this.f9763b = z10;
        this.d = tVar;
        this.f9765f = str;
        this.e = textView;
    }

    public s1(bz bzVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.f9762a = 17;
        this.f9764c = bzVar;
        this.f9765f = str;
        this.f9763b = z10;
        this.e = str2;
        this.d = tLObject;
    }

    public s1(eo0 eo0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f9762a = 20;
        this.f9764c = eo0Var;
        this.f9763b = z10;
        this.f9765f = str;
        this.d = str2;
        this.e = updatepasswordsettings;
    }

    public s1(vf1 vf1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f9762a = 22;
        this.f9764c = vf1Var;
        this.d = tLObject;
        this.f9763b = z10;
        this.f9765f = str;
        this.e = passwordinputsettings;
    }

    public s1(si.s0 s0Var, boolean z10, si.w wVar, si.o0 o0Var, File file) {
        this.f9762a = 23;
        this.f9764c = s0Var;
        this.f9763b = z10;
        this.d = wVar;
        this.e = o0Var;
        this.f9765f = file;
    }
}
