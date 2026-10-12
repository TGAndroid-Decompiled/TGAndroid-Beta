package ci;

import android.graphics.Bitmap;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.kz;
import org.telegram.ui.Components.uu;
import org.telegram.ui.kh1;
import org.telegram.ui.xo0;
public final class t1 implements Runnable {
    public final int f5986a;
    public final boolean f5987b;
    public final Object f5988c;
    public final Object d;
    public final Object f5989e;
    public final Object f5990f;

    public t1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f5986a = i10;
        this.f5988c = obj;
        this.d = obj2;
        this.f5989e = obj3;
        this.f5990f = obj4;
        this.f5987b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ci.t1.run():void");
    }

    public t1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.f5986a = i10;
        this.f5988c = obj;
        this.d = obj2;
        this.f5989e = obj3;
        this.f5987b = z10;
        this.f5990f = obj4;
    }

    public t1(Object obj, Object obj2, TLObject tLObject, Object obj3, boolean z10, int i10) {
        this.f5986a = i10;
        this.f5988c = obj;
        this.f5989e = obj2;
        this.d = tLObject;
        this.f5990f = obj3;
        this.f5987b = z10;
    }

    public t1(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.f5986a = i10;
        this.f5988c = obj;
        this.d = obj2;
        this.f5987b = z10;
        this.f5989e = obj3;
        this.f5990f = obj4;
    }

    public t1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, boolean z10, TLObject tLObject2, Object obj, int i10) {
        this.f5986a = i10;
        this.f5988c = notificationCenterDelegate;
        this.f5989e = tLObject;
        this.f5987b = z10;
        this.d = tLObject2;
        this.f5990f = obj;
    }

    public t1(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j3, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f5986a = 24;
        this.f5988c = payments_giveawayinfo;
        this.f5987b = z10;
        this.f5990f = str;
        this.d = tL_messageMediaGiveaway;
        this.f5989e = m2Var;
    }

    public t1(org.telegram.ui.Components.qa qaVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.f5986a = 15;
        this.f5988c = qaVar;
        this.f5990f = str;
        this.d = bitmap;
        this.f5987b = z10;
        this.f5989e = bitmap2;
    }

    public t1(uu uuVar, boolean z10, fi.o oVar, String str, TextView textView) {
        this.f5986a = 16;
        this.f5988c = uuVar;
        this.f5987b = z10;
        this.d = oVar;
        this.f5990f = str;
        this.f5989e = textView;
    }

    public t1(kz kzVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.f5986a = 17;
        this.f5988c = kzVar;
        this.f5990f = str;
        this.f5987b = z10;
        this.f5989e = str2;
        this.d = tLObject;
    }

    public t1(xo0 xo0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f5986a = 20;
        this.f5988c = xo0Var;
        this.f5987b = z10;
        this.f5990f = str;
        this.d = str2;
        this.f5989e = updatepasswordsettings;
    }

    public t1(kh1 kh1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f5986a = 22;
        this.f5988c = kh1Var;
        this.d = tLObject;
        this.f5987b = z10;
        this.f5990f = str;
        this.f5989e = passwordinputsettings;
    }

    public t1(qi.p0 p0Var, boolean z10, qi.s sVar, qi.l0 l0Var, File file) {
        this.f5986a = 23;
        this.f5988c = p0Var;
        this.f5987b = z10;
        this.d = sVar;
        this.f5989e = l0Var;
        this.f5990f = file;
    }
}
