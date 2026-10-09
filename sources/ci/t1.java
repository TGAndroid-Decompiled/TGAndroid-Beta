package ci;

import android.graphics.Bitmap;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.hz;
import org.telegram.ui.Components.ru;
import org.telegram.ui.ih1;
import org.telegram.ui.vo0;
public final class t1 implements Runnable {
    public final int f5988a;
    public final boolean f5989b;
    public final Object f5990c;
    public final Object d;
    public final Object f5991e;
    public final Object f5992f;

    public t1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f5988a = i10;
        this.f5990c = obj;
        this.d = obj2;
        this.f5991e = obj3;
        this.f5992f = obj4;
        this.f5989b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: ci.t1.run():void");
    }

    public t1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.f5988a = i10;
        this.f5990c = obj;
        this.d = obj2;
        this.f5991e = obj3;
        this.f5989b = z10;
        this.f5992f = obj4;
    }

    public t1(Object obj, Object obj2, TLObject tLObject, Object obj3, boolean z10, int i10) {
        this.f5988a = i10;
        this.f5990c = obj;
        this.f5991e = obj2;
        this.d = tLObject;
        this.f5992f = obj3;
        this.f5989b = z10;
    }

    public t1(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.f5988a = i10;
        this.f5990c = obj;
        this.d = obj2;
        this.f5989b = z10;
        this.f5991e = obj3;
        this.f5992f = obj4;
    }

    public t1(ki.t0 t0Var, boolean z10, ki.u uVar, ki.p0 p0Var, File file) {
        this.f5988a = 4;
        this.f5990c = t0Var;
        this.f5989b = z10;
        this.d = uVar;
        this.f5991e = p0Var;
        this.f5992f = file;
    }

    public t1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, boolean z10, TLObject tLObject2, Object obj, int i10) {
        this.f5988a = i10;
        this.f5990c = notificationCenterDelegate;
        this.f5991e = tLObject;
        this.f5989b = z10;
        this.d = tLObject2;
        this.f5992f = obj;
    }

    public t1(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j3, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.n2 n2Var) {
        this.f5988a = 24;
        this.f5990c = payments_giveawayinfo;
        this.f5989b = z10;
        this.f5992f = str;
        this.d = tL_messageMediaGiveaway;
        this.f5991e = n2Var;
    }

    public t1(org.telegram.ui.Components.ra raVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.f5988a = 16;
        this.f5990c = raVar;
        this.f5992f = str;
        this.d = bitmap;
        this.f5989b = z10;
        this.f5991e = bitmap2;
    }

    public t1(ru ruVar, boolean z10, fi.o oVar, String str, TextView textView) {
        this.f5988a = 17;
        this.f5990c = ruVar;
        this.f5989b = z10;
        this.d = oVar;
        this.f5992f = str;
        this.f5991e = textView;
    }

    public t1(hz hzVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.f5988a = 18;
        this.f5990c = hzVar;
        this.f5992f = str;
        this.f5989b = z10;
        this.f5991e = str2;
        this.d = tLObject;
    }

    public t1(vo0 vo0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f5988a = 21;
        this.f5990c = vo0Var;
        this.f5989b = z10;
        this.f5992f = str;
        this.d = str2;
        this.f5991e = updatepasswordsettings;
    }

    public t1(ih1 ih1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f5988a = 23;
        this.f5990c = ih1Var;
        this.d = tLObject;
        this.f5989b = z10;
        this.f5992f = str;
        this.f5991e = passwordinputsettings;
    }
}
