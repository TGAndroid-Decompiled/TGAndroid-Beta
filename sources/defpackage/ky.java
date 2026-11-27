package defpackage;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class ky implements icc {
    public final byte a;
    public final long b;
    public final Object c;

    public ky(uc7 uc7Var, long j, pp0 pp0Var) {
        this.a = (byte) 4;
        this.c = uc7Var;
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
                uy uyVar = (uy) obj3;
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                FrameLayout frameLayout = uyVar.f2;
                uyVar.V1.setLoading(false);
                uyVar.u2 = false;
                if (bool != null) {
                    if (j > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    r21 r21Var = new r21(uyVar.getContext(), uyVar.J0);
                    r21Var.a.setImageResource(2131231119);
                    if (z) {
                        i = 2131750268;
                    } else {
                        i = 2131750267;
                    }
                    String M0 = ob6.M0(i, null);
                    TextView textView = r21Var.b;
                    textView.setText(M0);
                    textView.setSingleLine(true);
                    textView.setTextSize(1, 15.0f);
                    textView.setMaxLines(1);
                    textView.setTypeface(hl.o());
                    String a0 = ob6.a0(null, null, 2131750303, Integer.valueOf(uyVar.g2.d.gifts_per_round));
                    TextView textView2 = r21Var.c;
                    textView2.setText(a0);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(5);
                    uyVar.d1();
                    v21.f(frameLayout, r21Var, 2750).j();
                    jxa.v(uyVar.a, false).n(null, false, true);
                }
                if (str != null) {
                    uyVar.d1();
                    new d31(frameLayout, uyVar.J0).Q(2131624012, 36, ob6.a0(null, null, 2131743533, str)).j();
                    return;
                }
                return;
            case 1:
                e eVar = (e) obj3;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        gp2.d(2, -j, eVar);
                        return;
                    } else {
                        d31.b0(eVar).g0(tL_error, false);
                        return;
                    }
                }
                gp2.d(1, -j, eVar);
                return;
            case 2:
                ov4 ov4Var = (ov4) obj3;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = ov4Var.e;
                if (tL_StarGiftAuctionState != null) {
                    ov4Var.getMessagesController().j4(tL_StarGiftAuctionState.users, false);
                    ov4Var.getMessagesController().c4(tL_StarGiftAuctionState.chats, false);
                    Boolean bool3 = Boolean.FALSE;
                    long j2 = this.b;
                    if (!((Boolean) longSparseArray.get(j2, bool3)).booleanValue()) {
                        longSparseArray.put(j2, Boolean.TRUE);
                        ov4Var.j(j2, new p4c(ov4Var, j2, tL_StarGiftAuctionState, (byte) 3));
                        return;
                    }
                    ov4Var.f(j2, tL_StarGiftAuctionState);
                    return;
                }
                return;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l = (Long) obj2;
                String str2 = LaunchActivity.C1;
                if ("paid".equals((String) obj) && l.longValue() != 0) {
                    hl.c3(new ue2(launchActivity, l, this.b, (byte) 26));
                    return;
                }
                return;
            default:
                uc7 uc7Var = (uc7) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (((TLRPC.Bool) obj) != null) {
                    uc7Var.e3(0, j, true);
                    return;
                }
                return;
        }
    }

    public ky(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }
}
