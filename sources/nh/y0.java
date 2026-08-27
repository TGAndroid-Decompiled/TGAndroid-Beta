package nh;

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
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.h21;
import org.telegram.ui.qh;
import org.telegram.ui.rn;
import org.telegram.ui.s50;

public final class y0 implements RequestDelegate {

    public final int f19051a = 0;

    public final long f19052b;

    public final int f19053c;
    public final Object d;

    public final Object f19054e;

    public final Object f19055f;

    public final Object f19056g;
    public final Object h;

    public y0(int i10, org.telegram.ui.ActionBar.b2 b2Var, Context context, long j10, c6 c6Var, org.telegram.ui.web.u uVar, cg.u0 u0Var) {
        this.f19053c = i10;
        this.d = b2Var;
        this.f19054e = context;
        this.f19052b = j10;
        this.f19055f = c6Var;
        this.f19056g = uVar;
        this.h = u0Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10 = this.f19051a;
        Object obj = this.h;
        Object obj2 = this.f19056g;
        Object obj3 = this.f19054e;
        Object obj4 = this.f19055f;
        Object obj5 = this.d;
        switch (i10) {
            case 0:
                cg.u0 u0Var = (cg.u0) obj;
                AndroidUtilities.runOnUIThread(new a1(tLObject, this.f19053c, (org.telegram.ui.ActionBar.b2) obj5, (Context) obj3, this.f19052b, (c6) obj4, (org.telegram.ui.web.u) obj2, u0Var));
                break;
            case 1:
                s50.w((s50) obj5, this.f19052b, (HashSet) obj3, (AtomicInteger) obj4, this.f19053c, (ChatObject.Call) obj2, (String) obj, tLObject, tL_error);
                break;
            case 2:
                Pattern pattern = LaunchActivity.f35496x1;
                AndroidUtilities.runOnUIThread(new a1((LaunchActivity) obj5, tLObject, this.f19053c, (String) obj3, (String) obj4, (TLRPC.User) obj2, (String) obj, this.f19052b));
                break;
            default:
                Activity activity = (Activity) obj5;
                c6 c6Var = (c6) obj4;
                byte[] bArr = (byte[]) obj3;
                rn rnVar = (rn) obj2;
                MessageObject messageObject = (MessageObject) obj;
                if (tLObject != null) {
                    if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultChooseOption) {
                        AndroidUtilities.runOnUIThread(new gf.h0(tLObject, activity, c6Var, this.f19052b, bArr, rnVar, messageObject));
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultReported) {
                        AndroidUtilities.runOnUIThread(new h21(rnVar, activity, c6Var, messageObject, 0), 200L);
                    } else if (tLObject instanceof TLRPC.TL_channels_sponsoredMessageReportResultAdsHidden) {
                        AndroidUtilities.runOnUIThread(new qh(rnVar, this.f19053c, messageObject), 200L);
                    }
                    break;
                } else if (tL_error != null && "AD_EXPIRED".equalsIgnoreCase(tL_error.text)) {
                    AndroidUtilities.runOnUIThread(new h21(rnVar, activity, c6Var, messageObject, 1), 200L);
                    break;
                }
                break;
        }
    }

    public y0(Activity activity, c6 c6Var, long j10, byte[] bArr, rn rnVar, MessageObject messageObject, int i10) {
        this.d = activity;
        this.f19055f = c6Var;
        this.f19052b = j10;
        this.f19054e = bArr;
        this.f19056g = rnVar;
        this.h = messageObject;
        this.f19053c = i10;
    }

    public y0(s50 s50Var, long j10, HashSet hashSet, AtomicInteger atomicInteger, int i10, ChatObject.Call call, String str) {
        this.d = s50Var;
        this.f19052b = j10;
        this.f19054e = hashSet;
        this.f19055f = atomicInteger;
        this.f19053c = i10;
        this.f19056g = call;
        this.h = str;
    }

    public y0(LaunchActivity launchActivity, int i10, String str, String str2, TLRPC.User user, String str3, long j10) {
        this.d = launchActivity;
        this.f19053c = i10;
        this.f19054e = str;
        this.f19055f = str2;
        this.f19056g = user;
        this.h = str3;
        this.f19052b = j10;
    }
}
