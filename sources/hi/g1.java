package hi;

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
import org.telegram.ui.ActionBar.u6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h21;
import org.telegram.ui.sh;
import org.telegram.ui.un;
import org.telegram.ui.v50;
public final class g1 implements RequestDelegate {
    public final int f12990a = 0;
    public final long f12991b;
    public final int f12992c;
    public final Object d;
    public final Object e;
    public final Object f12993f;
    public final Object f12994g;
    public final Object h;

    public g1(int i10, org.telegram.ui.ActionBar.e2 e2Var, Context context, long j10, u6 u6Var, org.telegram.ui.web.t tVar, bi.t0 t0Var) {
        this.f12992c = i10;
        this.d = e2Var;
        this.e = context;
        this.f12991b = j10;
        this.f12993f = u6Var;
        this.f12994g = tVar;
        this.h = t0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f12990a;
        Object obj = this.h;
        Object obj2 = this.f12994g;
        Object obj3 = this.e;
        Object obj4 = this.f12993f;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                bi.t0 t0Var = (bi.t0) obj;
                AndroidUtilities.runOnUIThread(new i1(tLObject, this.f12992c, (org.telegram.ui.ActionBar.e2) obj5, (Context) obj3, this.f12991b, (u6) obj4, (org.telegram.ui.web.t) obj2, t0Var));
                return;
            case 1:
                v50.v((v50) obj5, this.f12991b, (HashSet) obj3, (AtomicInteger) obj4, this.f12992c, (ChatObject.Call) obj2, (String) obj, tLObject, tL_error);
                return;
            case 2:
                Pattern pattern = LaunchActivity.D1;
                AndroidUtilities.runOnUIThread(new i1((LaunchActivity) obj5, tLObject, this.f12992c, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.f12991b));
                return;
            default:
                Activity activity = (Activity) obj5;
                u6 u6Var = (u6) obj4;
                byte[] bArr = (byte[]) obj3;
                un unVar = (un) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new ag.m0(tLObject, activity, u6Var, this.f12991b, bArr, unVar, messageObject));
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new h21(unVar, activity, u6Var, messageObject, 0), 200L);
                        return;
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new sh(unVar, this.f12992c, messageObject), 200L);
                        return;
                    } else {
                        return;
                    }
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new h21(unVar, activity, u6Var, messageObject, 1), 200L);
                    return;
                } else {
                    return;
                }
        }
    }

    public g1(Activity activity, u6 u6Var, long j10, byte[] bArr, un unVar, MessageObject messageObject, int i10) {
        this.d = activity;
        this.f12993f = u6Var;
        this.f12991b = j10;
        this.e = bArr;
        this.f12994g = unVar;
        this.h = messageObject;
        this.f12992c = i10;
    }

    public g1(v50 v50Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str) {
        this.d = v50Var;
        this.f12991b = j10;
        this.e = hashSet;
        this.f12993f = atomicInteger;
        this.f12992c = i10;
        this.f12994g = call;
        this.h = str;
    }

    public g1(LaunchActivity launchActivity, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.d = launchActivity;
        this.f12992c = i10;
        this.e = str;
        this.f12993f = str2;
        this.f12994g = user;
        this.h = str3;
        this.f12991b = j10;
    }
}
