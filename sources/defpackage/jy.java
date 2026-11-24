package defpackage;

import android.text.TextUtils;
import android.util.LongSparseArray;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class jy implements i8c {
    public final byte a;
    public final long b;
    public final Object c;

    public jy(na7 na7Var, long j, np0 np0Var) {
        this.a = (byte) 4;
        this.c = na7Var;
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
                ty tyVar = (ty) obj3;
                Boolean bool = (Boolean) obj;
                String str = (String) obj2;
                FrameLayout frameLayout = tyVar.f2;
                tyVar.V1.setLoading(false);
                tyVar.u2 = false;
                if (bool != null) {
                    if (j > 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    i21 i21Var = new i21(tyVar.getContext(), tyVar.J0);
                    i21Var.a.setImageResource(2131231119);
                    if (z) {
                        i = 2131750291;
                    } else {
                        i = 2131750290;
                    }
                    String M0 = k96.M0(i, null);
                    TextView textView = i21Var.b;
                    textView.setText(M0);
                    textView.setSingleLine(true);
                    textView.setTextSize(1, 15.0f);
                    textView.setMaxLines(1);
                    textView.setTypeface(gl.o());
                    String a0 = k96.a0(null, null, 2131750326, Integer.valueOf(tyVar.g2.d.gifts_per_round));
                    TextView textView2 = i21Var.c;
                    textView2.setText(a0);
                    textView2.setSingleLine(false);
                    textView2.setMaxLines(5);
                    tyVar.c1();
                    m21.f(frameLayout, i21Var, 2750).j();
                    gta.v(tyVar.a, false).n(null, false, true);
                }
                if (str != null) {
                    tyVar.c1();
                    new u21(frameLayout, tyVar.J0).Q(2131624012, 36, k96.a0(null, null, 2131743639, str)).j();
                    return;
                }
                return;
            case 1:
                d dVar = (d) obj3;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (tL_error != null) {
                    if (TextUtils.equals("COMMUNITY_REQUEST_CREATED", tL_error.text)) {
                        no2.d(2, -j, dVar);
                        return;
                    } else {
                        u21.b0(dVar).g0(tL_error, false);
                        return;
                    }
                }
                no2.d(1, -j, dVar);
                return;
            case 2:
                kt4 kt4Var = (kt4) obj3;
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                LongSparseArray longSparseArray = kt4Var.e;
                if (tL_StarGiftAuctionState != null) {
                    kt4Var.getMessagesController().a4(tL_StarGiftAuctionState.users, false);
                    kt4Var.getMessagesController().U3(tL_StarGiftAuctionState.chats, false);
                    Boolean bool3 = Boolean.FALSE;
                    long j2 = this.b;
                    if (!((Boolean) longSparseArray.get(j2, bool3)).booleanValue()) {
                        longSparseArray.put(j2, Boolean.TRUE);
                        kt4Var.j(j2, new p0c(kt4Var, j2, tL_StarGiftAuctionState, (byte) 3));
                        return;
                    }
                    kt4Var.f(j2, tL_StarGiftAuctionState);
                    return;
                }
                return;
            case 3:
                LaunchActivity launchActivity = (LaunchActivity) obj3;
                Long l = (Long) obj2;
                String str2 = LaunchActivity.C1;
                if ("paid".equals((String) obj) && l.longValue() != 0) {
                    gl.d3(new de2(launchActivity, l, this.b, (byte) 26));
                    return;
                }
                return;
            default:
                na7 na7Var = (na7) obj3;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                if (((TLRPC.Bool) obj) != null) {
                    na7Var.X2(0, j, true);
                    return;
                }
                return;
        }
    }

    public jy(Object obj, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.b = j;
    }
}
