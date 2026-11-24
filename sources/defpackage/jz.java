package defpackage;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class jz implements jac {
    public final byte a;
    public final long b;
    public final Object c;

    public jz(oc7 oc7Var, long j, nq0 nq0Var) {
        this.a = (byte) 4;
        this.c = oc7Var;
        this.b = j;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        boolean z;
        int i;
        byte b = this.a;
        long j = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                tz tzVar = (tz) obj3;
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                FrameLayout frameLayout = tzVar.f2;
                tzVar.V1.setLoading(false);
                tzVar.u2 = false;
                if (bool != null) {
                    if (j > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    q31 q31Var = new q31(tzVar.getContext(), tzVar.J0);
                    q31Var.a.setImageResource(2131231120);
                    if (z) {
                        i = 2131750240;
                    } else {
                        i = 2131750239;
                    }
                    String M0 = jb6.M0(i, null);
                    TextView textView = q31Var.b;
                    textView.setText(M0);
                    textView.setSingleLine(true);
                    textView.setTextSize(1, 15.0f);
                    textView.setMaxLines(1);
                    textView.setTypeface(gm.o());
                    String a0 = jb6.a0(null, null, 2131750275, Integer.valueOf(tzVar.g2.d.gifts_per_round));
                    TextView textView2 = q31Var.c;
                    textView2.setText(a0);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(5);
                    tzVar.c1();
                    u31.f(frameLayout, q31Var, 2750).j();
                    jva.v(tzVar.a, false).n(null, false, true);
                }
                if (str != null) {
                    tzVar.c1();
                    new c41(frameLayout, tzVar.J0).Q(2131624012, 36, jb6.a0(null, null, 2131743565, str)).j();
                    return;
                }
                return;
            case 1:
                d dVar = (d) obj3;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        yp2.d(2, -j, dVar);
                        return;
                    } else {
                        c41.b0(dVar).g0(tL_error, false);
                        return;
                    }
                }
                yp2.d(1, -j, dVar);
                return;
            case 2:
                lv4 lv4Var = (lv4) obj3;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = lv4Var.e;
                if (tL_StarGiftAuctionState != null) {
                    lv4Var.getMessagesController().d4(tL_StarGiftAuctionState.users, false);
                    lv4Var.getMessagesController().X3(tL_StarGiftAuctionState.chats, false);
                    Boolean bool3 = Boolean.FALSE;
                    long j2 = this.b;
                    if (!((Boolean) longSparseArray.get(j2, bool3)).booleanValue()) {
                        longSparseArray.put(j2, Boolean.TRUE);
                        lv4Var.j(j2, new p2c(lv4Var, j2, tL_StarGiftAuctionState, (byte) 3));
                        return;
                    }
                    lv4Var.f(j2, tL_StarGiftAuctionState);
                    return;
                }
                return;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l = (Long) obj2;
                String str2 = LaunchActivity.C1;
                if ("paid".equals((String) obj) && l.longValue() != 0) {
                    gm.c3(new of2(launchActivity, l, this.b, (byte) 26));
                    return;
                }
                return;
            default:
                oc7 oc7Var = (oc7) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (((TLRPC.Bool) obj) != null) {
                    oc7Var.a3(0, j, true);
                    return;
                }
                return;
        }
    }

    public jz(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }
}
