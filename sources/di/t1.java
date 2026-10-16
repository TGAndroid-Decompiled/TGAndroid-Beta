package di;

import android.graphics.Bitmap;
import android.widget.TextView;
import java.io.File;
import org.telegram.messenger.NotificationCenter;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.ui.Components.dz;
import org.telegram.ui.Components.nu;
import org.telegram.ui.ap0;
import org.telegram.ui.oh1;
public final class t1 implements Runnable {
    public final int f7824a;
    public final boolean f7825b;
    public final Object f7826c;
    public final Object d;
    public final Object e;
    public final Object f7827f;

    public t1(Object obj, Object obj2, Object obj3, Object obj4, boolean z10, int i10) {
        this.f7824a = i10;
        this.f7826c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f7827f = obj4;
        this.f7825b = z10;
    }

    @Override
    public final void run() {
        throw new UnsupportedOperationException("Method not decompiled: di.t1.run():void");
    }

    public t1(Object obj, Object obj2, Object obj3, boolean z10, Object obj4, int i10) {
        this.f7824a = i10;
        this.f7826c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f7825b = z10;
        this.f7827f = obj4;
    }

    public t1(Object obj, Object obj2, TLObject tLObject, Object obj3, boolean z10, int i10) {
        this.f7824a = i10;
        this.f7826c = obj;
        this.e = obj2;
        this.d = tLObject;
        this.f7827f = obj3;
        this.f7825b = z10;
    }

    public t1(Object obj, Object obj2, boolean z10, Object obj3, Object obj4, int i10) {
        this.f7824a = i10;
        this.f7826c = obj;
        this.d = obj2;
        this.f7825b = z10;
        this.e = obj3;
        this.f7827f = obj4;
    }

    public t1(NotificationCenter.NotificationCenterDelegate notificationCenterDelegate, TLObject tLObject, boolean z10, TLObject tLObject2, Object obj, int i10) {
        this.f7824a = i10;
        this.f7826c = notificationCenterDelegate;
        this.e = tLObject;
        this.f7825b = z10;
        this.d = tLObject2;
        this.f7827f = obj;
    }

    public t1(TLRPC.payments_GiveawayInfo payments_giveawayinfo, boolean z10, String str, long j10, TLRPC.TL_messageMediaGiveaway tL_messageMediaGiveaway, org.telegram.ui.ActionBar.m2 m2Var) {
        this.f7824a = 24;
        this.f7826c = payments_giveawayinfo;
        this.f7825b = z10;
        this.f7827f = str;
        this.d = tL_messageMediaGiveaway;
        this.e = m2Var;
    }

    public t1(org.telegram.ui.Components.qa qaVar, String str, Bitmap bitmap, boolean z10, Bitmap bitmap2) {
        this.f7824a = 15;
        this.f7826c = qaVar;
        this.f7827f = str;
        this.d = bitmap;
        this.f7825b = z10;
        this.e = bitmap2;
    }

    public t1(nu nuVar, boolean z10, gi.o oVar, String str, TextView textView) {
        this.f7824a = 16;
        this.f7826c = nuVar;
        this.f7825b = z10;
        this.d = oVar;
        this.f7827f = str;
        this.e = textView;
    }

    public t1(dz dzVar, String str, boolean z10, String str2, TLObject tLObject) {
        this.f7824a = 17;
        this.f7826c = dzVar;
        this.f7827f = str;
        this.f7825b = z10;
        this.e = str2;
        this.d = tLObject;
    }

    public t1(ap0 ap0Var, boolean z10, String str, String str2, TL_account.updatePasswordSettings updatepasswordsettings) {
        this.f7824a = 20;
        this.f7826c = ap0Var;
        this.f7825b = z10;
        this.f7827f = str;
        this.d = str2;
        this.e = updatepasswordsettings;
    }

    public t1(oh1 oh1Var, TLObject tLObject, boolean z10, String str, TL_account.passwordInputSettings passwordinputsettings) {
        this.f7824a = 22;
        this.f7826c = oh1Var;
        this.d = tLObject;
        this.f7825b = z10;
        this.f7827f = str;
        this.e = passwordinputsettings;
    }

    public t1(ri.r0 r0Var, boolean z10, ri.v vVar, ri.n0 n0Var, File file) {
        this.f7824a = 23;
        this.f7826c = r0Var;
        this.f7825b = z10;
        this.d = vVar;
        this.e = n0Var;
        this.f7827f = file;
    }
}
