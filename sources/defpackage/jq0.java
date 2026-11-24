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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
public final class jq0 implements p8c {
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
                    na7 q1 = na7.q1(i3);
                    TLRPC.TL_messages_inviteUsersToBot tL_messages_inviteUsersToBot = new TLRPC.TL_messages_inviteUsersToBot();
                    tL_messages_inviteUsersToBot.bot = q1.o1(user2);
                    int size = arrayList.size();
                    while (i2 < size) {
                        Object obj3 = arrayList.get(i2);
                        i2++;
                        tL_messages_inviteUsersToBot.users.add(q1.o1((TLRPC.User) obj3));
                    }
                    ConnectionsManager.getInstance(i3).sendRequest(tL_messages_inviteUsersToBot, new pl(l7c.r(user2), arrayList));
                    return;
                }
                return;
            case 1:
                c42 c42Var = (c42) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = gl.b0(c42Var.i0.getLatitude());
                tL_messageMediaGeoLive.geo._long = gl.b0(c42Var.i0.getLongitude());
                tL_messageMediaGeoLive.period = i3;
                c42Var.o0.b(tL_messageMediaGeoLive, c42Var.p0, true, 0, ((Long) obj).longValue());
                c42Var.b.a(true);
                return;
            case 2:
                dh7 dh7Var = (dh7) obj2;
                View view = (View) obj;
                va vaVar = dh7Var.b;
                if (view instanceof ch7) {
                    vaVar.getClass();
                    int R = RecyclerView.R(view);
                    c4c G = vaVar.g3.G(R);
                    if (G != null) {
                        ch7 ch7Var = (ch7) view;
                        ch7Var.setPosition(dh7Var.b(R));
                        if (i3 == G.d) {
                            z = true;
                        } else {
                            z = false;
                        }
                        ch7Var.b(z, true);
                        view.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 3:
                zi8 zi8Var = (zi8) obj2;
                int[] iArr = (int[]) obj;
                f4b f4bVar = zi8Var.d;
                int i4 = iArr[0];
                zi8Var.V = i4;
                f4bVar.A0 = i4;
                int i5 = iArr[1];
                zi8Var.W = i5;
                f4bVar.B0 = i5;
                zi8Var.U.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i3, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                zi8Var.invalidate();
                kac kacVar = zi8Var.n;
                if (kacVar != null) {
                    int i6 = zi8Var.V;
                    int i7 = zi8Var.W;
                    td4 td4Var = kacVar.b;
                    if (td4Var == null) {
                        kacVar.n = i6;
                        kacVar.r = i7;
                    } else {
                        td4Var.f(i6, i7);
                    }
                }
                l58 l58Var = zi8Var.s;
                if (l58Var != null) {
                    int i8 = zi8Var.V;
                    int i9 = zi8Var.W;
                    td4 td4Var2 = l58Var.m0;
                    if (td4Var2 != null) {
                        td4Var2.f(i8, i9);
                        return;
                    }
                    l58Var.K0 = i8;
                    l58Var.L0 = i9;
                    return;
                }
                return;
            case 4:
                kx8 kx8Var = (kx8) ((kk8) obj2).b;
                kx8Var.d0();
                i = ((d) kx8Var).currentAccount;
                ox8.f(i).k(i3, (String) obj);
                return;
            case 5:
                x4c x4cVar = (x4c) obj2;
                ArrayList arrayList2 = (ArrayList) obj;
                x4cVar.getClass();
                if (LaunchActivity.E1) {
                    if (arrayList2 != null && arrayList2.size() != 0) {
                        LinearLayout linearLayout = new LinearLayout(x4cVar.getContext());
                        linearLayout.setOrientation(1);
                        ?? imageView = new ImageView(x4cVar.getContext());
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.f(2131624050, 50, 50, null);
                        imageView.d();
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int L = gl.L(80.0f);
                        int i10 = bkb.H6;
                        ShapeDrawable K = bkb.K(L, bkb.w0(null, i10, false));
                        vkb M = zkb.M(i10);
                        imageView.setBackground(K);
                        zkb.j(imageView, K, M, null, null);
                        linearLayout.addView((View) imageView, nme.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(x4cVar.getContext());
                        textView.setTypeface(gl.o());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(k96.G(arrayList2.size(), "UnconfirmedAuthDeniedTitle", new Object[0]));
                        zkb.X(textView, bkb.i5, null);
                        linearLayout.addView(textView, nme.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(x4cVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList2.size() == 1) {
                            textView2.setText(k96.a0(null, null, 2131743666, x4c.a((u4c) arrayList2.get(0))));
                        } else {
                            String str2 = "\n";
                            for (int i11 = 0; i11 < Math.min(arrayList2.size(), 10); i11++) {
                                StringBuilder k = b00.k(str2, "• ");
                                k.append(x4c.a((u4c) arrayList2.get(i11)));
                                k.append("\n");
                                str2 = k.toString();
                            }
                            textView2.setText(k96.a0(null, null, 2131743667, str2));
                        }
                        zkb.X(textView2, bkb.i5, null);
                        linearLayout.addView(textView2, nme.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(x4cVar.getContext());
                        frameLayout.setPadding(gl.L(24.0f), gl.L(10.0f), gl.L(24.0f), gl.L(10.0f));
                        int L2 = gl.L(12.0f);
                        int i12 = bkb.p7;
                        int w0 = bkb.w0(null, i12, false);
                        float f2 = 0.15f;
                        if (bkb.I.o()) {
                            f = 0.2f;
                        } else {
                            f = 0.15f;
                        }
                        Drawable b0 = bkb.b0(L2, bkb.p1(f, w0));
                        if (bkb.I.o()) {
                            f2 = 0.2f;
                        }
                        vkb K2 = zkb.K(f2, i12);
                        frameLayout.setBackground(b0);
                        zkb.j(frameLayout, b0, K2, null, null);
                        TextView textView3 = new TextView(x4cVar.getContext());
                        textView3.setTypeface(gl.o());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        ug8.x(textView3, i12, null, null, 2131743662);
                        frameLayout.addView(textView3, nme.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, nme.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        u41 u41Var = new u41(null, x4cVar.getContext(), true);
                        u41Var.setRoundRadius(24);
                        ote.b(u41Var, 0.02f, 1.5f);
                        u41Var.i(k96.M0(2131749356, null), false, true);
                        linearLayout.addView(u41Var, nme.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        fx0 h = de9.h(1, null, x4cVar.getContext(), false);
                        h.O = linearLayout;
                        h.show();
                        h.c0 = false;
                        h.d0 = false;
                        rw0 rw0Var = new rw0(h, (byte) 5);
                        gl.r(u41Var.K);
                        u41Var.setCountFilled(false);
                        u41Var.J = 5;
                        u41Var.c(5, false);
                        u41Var.setShowZero(false);
                        q21 q21Var = new q21(u41Var, rw0Var, (byte) 2);
                        u41Var.K = q21Var;
                        gl.d3(q21Var, 1000L);
                        u41Var.setOnClickListener(new vzb(u41Var, h, (byte) 3));
                    } else {
                        yjb.x(null, 2131743640, new u21(f11.a(x4cVar.getContext()), null), null);
                    }
                }
                x4cVar.e.a(false, true);
                na7.q1(i3).P1().a();
                return;
            case 6:
                p8c p8cVar = (p8c) obj2;
                Long l = (Long) obj;
                if (l != null && l.longValue() > 0 && l.longValue() != Long.MAX_VALUE) {
                    user = na7.q1(i3).V1(l);
                }
                p8cVar.a(user);
                return;
            default:
                ypc ypcVar = (ypc) obj2;
                String str3 = (String) obj;
                if (!ypcVar.r && i3 == ypcVar.K) {
                    ypcVar.F = 0;
                    ypcVar.M = false;
                    if (WalletEngine2.isValidRecipientAddress(str3)) {
                        str = WalletEngine2.toUserFriendlyAddress(str3);
                    }
                    ypcVar.y = str;
                    u41 u41Var2 = ypcVar.a0;
                    if (u41Var2 != null) {
                        if (str != null) {
                            z2 = true;
                        }
                        u41Var2.setEnabled(z2);
                    }
                    ypcVar.a.g3.O(true);
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
