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
import org.telegram.ui.ActionBar.d6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.c21;
import org.telegram.ui.s50;
import org.telegram.ui.sh;
import org.telegram.ui.sn;
public final class z0 implements RequestDelegate {
    public final int f11577a = 0;
    public final long f11578b;
    public final int f11579c;
    public final Object d;
    public final Object e;
    public final Object f11580f;
    public final Object f11581g;
    public final Object h;

    public z0(int i10, org.telegram.ui.ActionBar.b2 b2Var, Context context, long j10, d6 d6Var, org.telegram.ui.web.t tVar, ai.s0 s0Var) {
        this.f11579c = i10;
        this.d = b2Var;
        this.e = context;
        this.f11578b = j10;
        this.f11580f = d6Var;
        this.f11581g = tVar;
        this.h = s0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f11577a;
        Object obj = this.h;
        Object obj2 = this.f11581g;
        Object obj3 = this.e;
        Object obj4 = this.f11580f;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                ai.s0 s0Var = (ai.s0) obj;
                AndroidUtilities.runOnUIThread(new b1(tLObject, this.f11579c, (org.telegram.ui.ActionBar.b2) obj5, (Context) obj3, this.f11578b, (d6) obj4, (org.telegram.ui.web.t) obj2, s0Var));
                return;
            case 1:
                s50.x((s50) obj5, this.f11578b, (HashSet) obj3, (AtomicInteger) obj4, this.f11579c, (ChatObject.Call) obj2, (String) obj, tLObject, tL_error);
                return;
            case 2:
                Pattern pattern = LaunchActivity.C1;
                AndroidUtilities.runOnUIThread(new b1((LaunchActivity) obj5, tLObject, this.f11579c, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.f11578b));
                return;
            default:
                Activity activity = (Activity) obj5;
                d6 d6Var = (d6) obj4;
                byte[] bArr = (byte[]) obj3;
                sn snVar = (sn) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new org.telegram.messenger.voip.e(tLObject, activity, d6Var, this.f11578b, bArr, snVar, messageObject));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new c21(snVar, activity, d6Var, messageObject, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new sh(snVar, this.f11579c, messageObject), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new c21(snVar, activity, d6Var, messageObject, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public z0(Activity activity, d6 d6Var, long j10, byte[] bArr, sn snVar, MessageObject messageObject, int i10) {
        this.d = activity;
        this.f11580f = d6Var;
        this.f11578b = j10;
        this.e = bArr;
        this.f11581g = snVar;
        this.h = messageObject;
        this.f11579c = i10;
    }

    public z0(s50 s50Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str) {
        this.d = s50Var;
        this.f11578b = j10;
        this.e = hashSet;
        this.f11580f = atomicInteger;
        this.f11579c = i10;
        this.f11581g = call;
        this.h = str;
    }

    public z0(LaunchActivity launchActivity, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.d = launchActivity;
        this.f11579c = i10;
        this.e = str;
        this.f11580f = str2;
        this.f11581g = user;
        this.h = str3;
        this.f11578b = j10;
    }
}
