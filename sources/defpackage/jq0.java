package defpackage;

import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
public final class jq0 implements pcc {
    public final byte a;
    public final int b;
    public final Object c;

    public jq0(int i, Object obj, byte b) {
        this.a = b;
        this.b = i;
        this.c = obj;
    }

    @Override
    public final void a(Object obj) {
        boolean z;
        int i;
        float f;
        byte b = this.a;
        TLRPC.User user = null;
        String str = null;
        user = null;
        user = null;
        int i2 = 0;
        boolean z2 = false;
        int i3 = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                TLRPC.User user2 = (TLRPC.User) obj2;
                ArrayList arrayList = (ArrayList) obj;
                if (arrayList != null && !arrayList.isEmpty()) {
                    uc7 s1 = uc7.s1(i3);
                    TLRPC.TL_messages_inviteUsersToBot tL_messages_inviteUsersToBot = new TLRPC.TL_messages_inviteUsersToBot();
                    tL_messages_inviteUsersToBot.bot = s1.q1(user2);
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        tL_messages_inviteUsersToBot.users.add(s1.q1((TLRPC.User) obj3));
                    }
                    ConnectionsManager.getInstance(i3).sendRequest(tL_messages_inviteUsersToBot, new ql(lbc.r(user2), arrayList));
                    return;
                }
                return;
            case 1:
                s42 s42Var = (s42) obj2;
                s42Var.getClass();
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = hl.b0(s42Var.i0.getLatitude());
                tL_messageMediaGeoLive.geo._long = hl.b0(s42Var.i0.getLongitude());
                tL_messageMediaGeoLive.period = i3;
                s42Var.o0.b(tL_messageMediaGeoLive, s42Var.p0, true, 0, ((Long) obj).longValue());
                s42Var.b.a(true);
                return;
            case 2:
                nj7 nj7Var = (nj7) obj2;
                View view = (View) obj;
                wa waVar = nj7Var.b;
                if (view instanceof mj7) {
                    waVar.getClass();
                    int S = RecyclerView.S(view);
                    b8c G = waVar.g3.G(S);
                    if (G != null) {
                        mj7 mj7Var = (mj7) view;
                        mj7Var.setPosition(nj7Var.b(S));
                        if (i3 == G.d) {
                            z = true;
                        } else {
                            z = false;
                        }
                        mj7Var.b(z, true);
                        view.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                mm8 mm8Var = (mm8) obj2;
                int[] iArr = (int[]) obj;
                c8b c8bVar = mm8Var.d;
                int i4 = iArr[0];
                mm8Var.V = i4;
                c8bVar.A0 = i4;
                int i5 = iArr[1];
                mm8Var.W = i5;
                c8bVar.B0 = i5;
                mm8Var.U.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i3, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                mm8Var.invalidate();
                kec kecVar = mm8Var.n;
                if (kecVar != null) {
                    int i6 = mm8Var.V;
                    int i7 = mm8Var.W;
                    rf4 rf4Var = kecVar.b;
                    if (rf4Var == null) {
                        kecVar.n = i6;
                        kecVar.r = i7;
                    } else {
                        rf4Var.f(i6, i7);
                    }
                }
                c98 c98Var = mm8Var.s;
                if (c98Var != null) {
                    int i8 = mm8Var.V;
                    int i9 = mm8Var.W;
                    rf4 rf4Var2 = c98Var.m0;
                    if (rf4Var2 != null) {
                        rf4Var2.f(i8, i9);
                        return;
                    }
                    c98Var.K0 = i8;
                    c98Var.L0 = i9;
                    return;
                }
                return;
            case 4:
                x09 x09Var = (x09) ((rn8) obj2).b;
                x09Var.d0();
                i = ((e) x09Var).currentAccount;
                b19.f(i).k(i3, (String) obj);
                return;
            case 5:
                w8c w8cVar = (w8c) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                w8cVar.getClass();
                if (LaunchActivity.E1) {
                    if (arrayList2 != null && arrayList2.size() != 0) {
                        LinearLayout linearLayout = new LinearLayout(w8cVar.getContext());
                        linearLayout.setOrientation(1);
                        ?? imageView = new ImageView(w8cVar.getContext());
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.f(2131624050, 50, 50, null);
                        imageView.d();
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int L = hl.L(80.0f);
                        int i10 = aob.I6;
                        ShapeDrawable K = aob.K(L, aob.w0(null, i10, false));
                        uob M = yob.M(i10);
                        imageView.setBackground(K);
                        yob.j(imageView, K, M, null, null);
                        linearLayout.addView((View) imageView, tre.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(w8cVar.getContext());
                        textView.setTypeface(hl.o());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(ob6.G(arrayList2.size(), "UnconfirmedAuthDeniedTitle", new Object[0]));
                        yob.X(textView, aob.j5, null);
                        linearLayout.addView(textView, tre.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(w8cVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList2.size() == 1) {
                            textView2.setText(ob6.a0(null, null, 2131743560, w8c.a((t8c) arrayList2.get(0))));
                        } else {
                            String str2 = "\n";
                            for (int i11 = 0; i11 < Math.min(arrayList2.size(), 10); i11++) {
                                StringBuilder l = c00.l(str2, "• ");
                                l.append(w8c.a((t8c) arrayList2.get(i11)));
                                l.append("\n");
                                str2 = l.toString();
                            }
                            textView2.setText(ob6.a0(null, null, 2131743561, str2));
                        }
                        yob.X(textView2, aob.j5, null);
                        linearLayout.addView(textView2, tre.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(w8cVar.getContext());
                        frameLayout.setPadding(hl.L(24.0f), hl.L(10.0f), hl.L(24.0f), hl.L(10.0f));
                        int L2 = hl.L(12.0f);
                        int i12 = aob.q7;
                        int w0 = aob.w0(null, i12, false);
                        float f2 = 0.15f;
                        if (aob.I.o()) {
                            f = 0.2f;
                        } else {
                            f = 0.15f;
                        }
                        Drawable b0 = aob.b0(L2, aob.p1(f, w0));
                        if (aob.I.o()) {
                            f2 = 0.2f;
                        }
                        uob K2 = yob.K(f2, i12);
                        frameLayout.setBackground(b0);
                        yob.j(frameLayout, b0, K2, null, null);
                        TextView textView3 = new TextView(w8cVar.getContext());
                        textView3.setTypeface(hl.o());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        ik8.x(textView3, i12, null, null, 2131743556);
                        frameLayout.addView(textView3, tre.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, tre.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        c51 c51Var = new c51(null, w8cVar.getContext(), true);
                        c51Var.setRoundRadius(24);
                        iye.b(c51Var, 0.02f, 1.5f);
                        c51Var.i(ob6.M0(2131749302, null), false, true);
                        linearLayout.addView(c51Var, tre.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        nx0 h = uh9.h(1, null, w8cVar.getContext(), false);
                        h.O = linearLayout;
                        h.show();
                        h.c0 = false;
                        h.d0 = false;
                        ax0 ax0Var = new ax0(h, (byte) 5);
                        hl.r(c51Var.K);
                        c51Var.setCountFilled(false);
                        c51Var.J = 5;
                        c51Var.c(5, false);
                        c51Var.setShowZero(false);
                        z21 z21Var = new z21(c51Var, ax0Var, (byte) 2);
                        c51Var.K = z21Var;
                        hl.d3(z21Var, 1000L);
                        c51Var.setOnClickListener(new jjb((byte) 6, h, c51Var));
                    } else {
                        xnb.x(null, 2131743534, new d31(o11.a(w8cVar.getContext()), null), null);
                    }
                }
                w8cVar.e.a(false, true);
                uc7.s1(i3).R1().a();
                return;
            case 6:
                pcc pccVar = (pcc) obj2;
                Long l2 = (Long) obj;
                if (l2 != null && l2.longValue() > 0 && l2.longValue() != Long.MAX_VALUE) {
                    user = uc7.s1(i3).X1(l2);
                }
                pccVar.a(user);
                return;
            default:
                muc mucVar = (muc) obj2;
                String str3 = (String) obj;
                if (!mucVar.r && i3 == mucVar.K) {
                    mucVar.F = 0;
                    mucVar.M = false;
                    if (WalletEngine2.isValidRecipientAddress(str3)) {
                        str = WalletEngine2.toUserFriendlyAddress(str3);
                    }
                    mucVar.y = str;
                    c51 c51Var2 = mucVar.a0;
                    if (c51Var2 != null) {
                        if (str != null) {
                            z2 = true;
                        }
                        c51Var2.setEnabled(z2);
                    }
                    mucVar.a.g3.O(true);
                    return;
                }
                return;
        }
    }

    public jq0(Object obj, int i, byte b) {
        this.a = b;
        this.c = obj;
        this.b = i;
    }
}
