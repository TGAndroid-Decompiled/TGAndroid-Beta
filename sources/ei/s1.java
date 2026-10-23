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
import org.telegram.ui.bg1;
import org.telegram.ui.io0;
public final class s1 implements Runnable {
    public final int f9778a;
    public final boolean f9779b;
    public final Object f9780c;
    public final Object d;
    public final Object e;
    public final Object f9781f;

    public s1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f9778a = i10;
        this.f9780c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f9781f = obj4;
        this.f9779b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ei.s1.run():void");
    }

    public s1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.f9778a = i10;
        this.f9780c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f9779b = z10;
        this.f9781f = obj4;
    }

    public s1(Object obj, Object obj2, TLObject tLObject, Object obj3, boolean z10, int i10) {
        this.f9778a = i10;
        this.f9780c = obj;
        this.e = obj2;
        this.d = tLObject;
        this.f9781f = obj3;
        this.f9779b = z10;
    }

    public s1(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.f9778a = i10;
        this.f9780c = obj;
        this.d = obj2;
        this.f9779b = z10;
        this.e = obj3;
        this.f9781f = obj4;
    }

    public s1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, boolean z10, TLObject tLObject2, Object obj, int i10) {
        this.f9778a = i10;
        this.f9780c = notificationCenterDelegate;
        this.e = tLObject;
        this.f9779b = z10;
        this.d = tLObject2;
        this.f9781f = obj;
    }

    public s1(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j10, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.o2 o2Var) {
        this.f9778a = 24;
        this.f9780c = payments_giveawayinfo;
        this.f9779b = z10;
        this.f9781f = str;
        this.d = tL_messageMediaGiveaway;
        this.e = o2Var;
    }

    public s1(org.telegram.ui.Components.oa oaVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.f9778a = 15;
        this.f9780c = oaVar;
        this.f9781f = str;
        this.d = bitmap;
        this.f9779b = z10;
        this.e = bitmap2;
    }

    public s1(iu iuVar, boolean z10, ai.t tVar, String str, TextView textView) {
        this.f9778a = 16;
        this.f9780c = iuVar;
        this.f9779b = z10;
        this.d = tVar;
        this.f9781f = str;
        this.e = textView;
    }

    public s1(bz bzVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.f9778a = 17;
        this.f9780c = bzVar;
        this.f9781f = str;
        this.f9779b = z10;
        this.e = str2;
        this.d = tLObject;
    }

    public s1(io0 io0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f9778a = 20;
        this.f9780c = io0Var;
        this.f9779b = z10;
        this.f9781f = str;
        this.d = str2;
        this.e = updatepasswordsettings;
    }

    public s1(bg1 bg1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f9778a = 22;
        this.f9780c = bg1Var;
        this.d = tLObject;
        this.f9779b = z10;
        this.f9781f = str;
        this.e = passwordinputsettings;
    }

    public s1(si.u0 u0Var, boolean z10, si.w wVar, si.q0 q0Var, File file) {
        this.f9778a = 23;
        this.f9780c = u0Var;
        this.f9779b = z10;
        this.d = wVar;
        this.e = q0Var;
        this.f9781f = file;
    }
}
