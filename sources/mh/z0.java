package mh;

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
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.i21;
import org.telegram.ui.o50;
import org.telegram.ui.oh;
import org.telegram.ui.qn;
public final class z0 implements RequestDelegate {
    public final int f18234a = 0;
    public final long f18235b;
    public final int f18236c;
    public final Object d;
    public final Object f18237e;
    public final Object f18238f;
    public final Object f18239g;
    public final Object h;

    public z0(int i9, org.telegram.ui.ActionBar.c2 c2Var, Context context, long j10, b6 b6Var, org.telegram.ui.web.t tVar, bg.y0 y0Var) {
        this.f18236c = i9;
        this.d = c2Var;
        this.f18237e = context;
        this.f18235b = j10;
        this.f18238f = b6Var;
        this.f18239g = tVar;
        this.h = y0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i9 = this.f18234a;
        Object obj = this.h;
        Object obj2 = this.f18239g;
        Object obj3 = this.f18237e;
        Object obj4 = this.f18238f;
        Object obj5 = this.d;
        switch (i9) {
            case 0:
                bg.y0 y0Var = (bg.y0) obj;
                AndroidUtilities.runOnUIThread(new b1(tLObject, this.f18236c, (org.telegram.ui.ActionBar.c2) obj5, (Context) obj3, this.f18235b, (b6) obj4, (org.telegram.ui.web.t) obj2, y0Var));
                return;
            case 1:
                o50.v((o50) obj5, this.f18235b, (HashSet) obj3, (AtomicInteger) obj4, this.f18236c, (ChatObject.Call) obj2, (String) obj, tLObject, tL_error);
                return;
            case 2:
                Pattern pattern = LaunchActivity.f35493x1;
                AndroidUtilities.runOnUIThread(new b1((LaunchActivity) obj5, tLObject, this.f18236c, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.f18235b));
                return;
            default:
                Activity activity = (Activity) obj5;
                b6 b6Var = (b6) obj4;
                byte[] bArr = (byte[]) obj3;
                qn qnVar = (qn) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new ff.h0(tLObject, activity, b6Var, this.f18235b, bArr, qnVar, messageObject));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new i21(qnVar, activity, b6Var, messageObject, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new oh(qnVar, this.f18236c, messageObject), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new i21(qnVar, activity, b6Var, messageObject, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public z0(Activity activity, b6 b6Var, long j10, byte[] bArr, qn qnVar, MessageObject messageObject, int i9) {
        this.d = activity;
        this.f18238f = b6Var;
        this.f18235b = j10;
        this.f18237e = bArr;
        this.f18239g = qnVar;
        this.h = messageObject;
        this.f18236c = i9;
    }

    public z0(o50 o50Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i9, ChatObject.Call call, String str) {
        this.d = o50Var;
        this.f18235b = j10;
        this.f18237e = hashSet;
        this.f18238f = atomicInteger;
        this.f18236c = i9;
        this.f18239g = call;
        this.h = str;
    }

    public z0(LaunchActivity launchActivity, int i9, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.d = launchActivity;
        this.f18236c = i9;
        this.f18237e = str;
        this.f18238f = str2;
        this.f18239g = user;
        this.h = str3;
        this.f18235b = j10;
    }
}
