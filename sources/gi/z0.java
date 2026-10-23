package gi;

import android.app.Activity;
import android.content.Context;
import java.util.HashSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.regex.Pattern;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.MessageObject;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.e21;
import org.telegram.ui.qh;
import org.telegram.ui.sn;
import org.telegram.ui.u50;
public final class z0 implements RequestDelegate {
    public final int f11601a = 0;
    public final long f11602b;
    public final int f11603c;
    public final Object d;
    public final Object e;
    public final Object f11604f;
    public final Object f11605g;
    public final Object h;

    public z0(int i10, org.telegram.ui.ActionBar.c2 c2Var, Context context, long j10, g6 g6Var, org.telegram.ui.web.t tVar, ai.s0 s0Var) {
        this.f11603c = i10;
        this.d = c2Var;
        this.e = context;
        this.f11602b = j10;
        this.f11604f = g6Var;
        this.f11605g = tVar;
        this.h = s0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f11601a;
        Object obj = this.h;
        Object obj2 = this.f11605g;
        Object obj3 = this.e;
        Object obj4 = this.f11604f;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ai.s0 s0Var = (ai.s0) obj;
                AndroidUtilities.runOnUIThread(new b1(tLObject, this.f11603c, (org.telegram.ui.ActionBar.c2) obj5, (Context) obj3, this.f11602b, (g6) obj4, (org.telegram.ui.web.t) obj2, s0Var));
                return;
            case 1:
                u50.w((u50) obj5, this.f11602b, (HashSet) obj3, (AtomicInteger) obj4, this.f11603c, (ChatObject.Call) obj2, (String) obj, tLObject, tL_error);
                return;
            case 2:
                Pattern pattern = LaunchActivity.E1;
                AndroidUtilities.runOnUIThread(new b1((LaunchActivity) obj5, tLObject, this.f11603c, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.f11602b));
                return;
            default:
                Activity activity = (Activity) obj5;
                g6 g6Var = (g6) obj4;
                byte[] bArr = (byte[]) obj3;
                sn snVar = (sn) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tLObject, activity, g6Var, this.f11602b, bArr, snVar, messageObject));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new e21(snVar, activity, g6Var, messageObject, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new qh(snVar, this.f11603c, messageObject), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new e21(snVar, activity, g6Var, messageObject, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public z0(Activity activity, g6 g6Var, long j10, byte[] bArr, sn snVar, MessageObject messageObject, int i10) {
        this.d = activity;
        this.f11604f = g6Var;
        this.f11602b = j10;
        this.e = bArr;
        this.f11605g = snVar;
        this.h = messageObject;
        this.f11603c = i10;
    }

    public z0(u50 u50Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str) {
        this.d = u50Var;
        this.f11602b = j10;
        this.e = hashSet;
        this.f11604f = atomicInteger;
        this.f11603c = i10;
        this.f11605g = call;
        this.h = str;
    }

    public z0(LaunchActivity launchActivity, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.d = launchActivity;
        this.f11603c = i10;
        this.e = str;
        this.f11604f = str2;
        this.f11605g = user;
        this.h = str3;
        this.f11602b = j10;
    }
}
