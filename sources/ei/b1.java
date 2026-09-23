package ei;

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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.f60;
import org.telegram.ui.g31;
import org.telegram.ui.xh;
import org.telegram.ui.xn;
public final class b1 implements RequestDelegate {
    public final int f8226a = 0;
    public final long f8227b;
    public final int f8228c;
    public final Object d;
    public final Object e;
    public final Object f8229f;
    public final Object f8230g;
    public final Object h;

    public b1(int i10, org.telegram.ui.ActionBar.b2 b2Var, Context context, long j3, d6 d6Var, org.telegram.ui.web.s sVar, org.telegram.tgnet.e eVar) {
        this.f8228c = i10;
        this.d = b2Var;
        this.e = context;
        this.f8227b = j3;
        this.f8229f = d6Var;
        this.f8230g = sVar;
        this.h = eVar;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f8226a;
        Object obj = this.h;
        Object obj2 = this.f8230g;
        Object obj3 = this.e;
        Object obj4 = this.f8229f;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                org.telegram.tgnet.e eVar = (org.telegram.tgnet.e) obj;
                AndroidUtilities.runOnUIThread(new e1(tLObject, this.f8228c, (org.telegram.ui.ActionBar.b2) obj5, (Context) obj3, this.f8227b, (d6) obj4, (org.telegram.ui.web.s) obj2, eVar));
                return;
            case 1:
                f60.v((f60) obj5, this.f8227b, (HashSet) obj3, (AtomicInteger) obj4, this.f8228c, (ChatObject.Call) obj2, (String) obj, tLObject, tL_error);
                return;
            case 2:
                Pattern pattern = LaunchActivity.B1;
                AndroidUtilities.runOnUIThread(new e1((LaunchActivity) obj5, tLObject, this.f8228c, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.f8227b));
                return;
            default:
                Activity activity = (Activity) obj5;
                d6 d6Var = (d6) obj4;
                byte[] bArr = (byte[]) obj3;
                xn xnVar = (xn) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tLObject, activity, d6Var, this.f8227b, bArr, xnVar, messageObject));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new g31(xnVar, activity, d6Var, messageObject, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new xh(xnVar, this.f8228c, messageObject), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new g31(xnVar, activity, d6Var, messageObject, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public b1(Activity activity, d6 d6Var, long j3, byte[] bArr, xn xnVar, MessageObject messageObject, int i10) {
        this.d = activity;
        this.f8229f = d6Var;
        this.f8227b = j3;
        this.e = bArr;
        this.f8230g = xnVar;
        this.h = messageObject;
        this.f8228c = i10;
    }

    public b1(f60 f60Var, long j3, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str) {
        this.d = f60Var;
        this.f8227b = j3;
        this.e = hashSet;
        this.f8229f = atomicInteger;
        this.f8228c = i10;
        this.f8230g = call;
        this.h = str;
    }

    public b1(LaunchActivity launchActivity, int i10, String str, String str2, TLRPC.User user, String str3, long j3) {
        this.d = launchActivity;
        this.f8228c = i10;
        this.e = str;
        this.f8229f = str2;
        this.f8230g = user;
        this.h = str3;
        this.f8227b = j3;
    }
}
