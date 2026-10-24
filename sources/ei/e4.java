package ei;

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
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.tl;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.gg0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.pl;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.y71;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.d60;
public final class e4 implements Utilities.Callback {
    public final int f8963a;
    public final int f8964b;
    public final Object f8965c;

    public e4(int i10, Utilities.Callback callback) {
        this.f8963a = 6;
        this.f8964b = i10;
        this.f8965c = callback;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        float f7;
        int i10 = this.f8963a;
        TLRPC.User user = null;
        String str = null;
        user = null;
        user = null;
        boolean z11 = false;
        int i11 = this.f8964b;
        Object obj2 = this.f8965c;
        switch (i10) {
            case 0:
                l4 l4Var = (l4) obj2;
                View view = (View) obj;
                g4 g4Var = l4Var.f9376b;
                if (view instanceof k4) {
                    g4Var.getClass();
                    int R = RecyclerView.R(view);
                    l61 G = g4Var.Z2.G(R);
                    if (G != null) {
                        k4 k4Var = (k4) view;
                        k4Var.setPosition(l4Var.b(R));
                        if (i11 == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        k4Var.b(z10, true);
                        view.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                r6 r6Var = (r6) obj2;
                int[] iArr = (int[]) obj;
                a8 a8Var = r6Var.d;
                int i12 = iArr[0];
                r6Var.U = i12;
                a8Var.A0 = i12;
                int i13 = iArr[1];
                r6Var.V = i13;
                a8Var.B0 = i13;
                r6Var.T.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i11, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                r6Var.invalidate();
                y71 y71Var = r6Var.f9737n;
                if (y71Var != null) {
                    int i14 = r6Var.U;
                    int i15 = r6Var.V;
                    c00 c00Var = y71Var.f32834b;
                    if (c00Var == null) {
                        y71Var.f32837n = i14;
                        y71Var.f32838r = i15;
                    } else {
                        c00Var.i(i14, i15);
                    }
                }
                gg0 gg0Var = r6Var.f9744s;
                if (gg0Var != null) {
                    int i16 = r6Var.U;
                    int i17 = r6Var.V;
                    c00 c00Var2 = gg0Var.f26670l0;
                    if (c00Var2 != null) {
                        c00Var2.i(i16, i17);
                        return;
                    }
                    gg0Var.J0 = i16;
                    gg0Var.K0 = i17;
                    return;
                }
                return;
            case 2:
                ig.w1 w1Var = ((ig.n1) obj2).f13009a;
                ig.w1.X(w1Var);
                ig.z1.f(ig.w1.c0(w1Var)).k(i11, (String) obj);
                return;
            case 3:
                org.telegram.ui.Cells.ta taVar = (org.telegram.ui.Cells.ta) obj2;
                ArrayList arrayList = (ArrayList) obj;
                taVar.getClass();
                if (LaunchActivity.E1) {
                    if (arrayList != null && arrayList.size() != 0) {
                        LinearLayout linearLayout = new LinearLayout(taVar.getContext());
                        linearLayout.setOrientation(1);
                        ?? imageView = new ImageView(taVar.getContext());
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.f(R.raw.ic_ban, 50, 50, null);
                        imageView.d();
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int dp = AndroidUtilities.dp(80.0f);
                        int i18 = org.telegram.ui.ActionBar.k6.I6;
                        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.x0(null, i18, false));
                        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i18);
                        imageView.setBackground(K);
                        org.telegram.ui.ActionBar.r6.k(imageView, K, O, null, null);
                        linearLayout.addView((View) imageView, w7.z5.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(taVar.getContext());
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.formatPluralString("UnconfirmedAuthDeniedTitle", arrayList.size(), new Object[0]));
                        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21290j5, null);
                        linearLayout.addView(textView, w7.z5.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(taVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageSingle, org.telegram.ui.Cells.ta.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(0))));
                        } else {
                            String str2 = "\n";
                            for (int i19 = 0; i19 < Math.min(arrayList.size(), 10); i19++) {
                                StringBuilder i20 = si.o0.i(str2, "• ");
                                i20.append(org.telegram.ui.Cells.ta.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(i19)));
                                i20.append("\n");
                                str2 = i20.toString();
                            }
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageMultiple, str2));
                        }
                        org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21290j5, null);
                        linearLayout.addView(textView2, w7.z5.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(taVar.getContext());
                        frameLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f));
                        int dp2 = AndroidUtilities.dp(12.0f);
                        int i21 = org.telegram.ui.ActionBar.k6.f21422q7;
                        int x02 = org.telegram.ui.ActionBar.k6.x0(null, i21, false);
                        float f10 = 0.15f;
                        if (org.telegram.ui.ActionBar.k6.I.q()) {
                            f7 = 0.2f;
                        } else {
                            f7 = 0.15f;
                        }
                        Drawable c02 = org.telegram.ui.ActionBar.k6.c0(dp2, org.telegram.ui.ActionBar.k6.o1(f7, x02));
                        if (org.telegram.ui.ActionBar.k6.I.q()) {
                            f10 = 0.2f;
                        }
                        org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(f10, i21);
                        frameLayout.setBackground(c02);
                        org.telegram.ui.ActionBar.r6.k(frameLayout, c02, M, null, null);
                        TextView textView3 = new TextView(taVar.getContext());
                        textView3.setTypeface(AndroidUtilities.bold());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        org.telegram.ui.ActionBar.r6.W(textView3, i21, null);
                        textView3.setText(LocaleController.getString(R.string.UnconfirmedAuthDeniedWarning));
                        frameLayout.addView(textView3, w7.z5.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, w7.z5.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        d dVar = new d(taVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        w7.b6.b(dVar, 0.02f, 1.5f);
                        dVar.i(LocaleController.getString(R.string.GotIt), false, true);
                        linearLayout.addView(dVar, w7.z5.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, taVar.getContext(), (org.telegram.ui.ActionBar.g6) null, false);
                        h3Var.fixNavigationBar();
                        h3Var.customView = linearLayout;
                        h3Var.show();
                        h3Var.setCanDismissWithSwipe(false);
                        h3Var.setCanDismissWithTouchOutside(false);
                        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(h3Var, 11);
                        AndroidUtilities.cancelRunOnUIThread(dVar.J);
                        dVar.setCountFilled(false);
                        dVar.I = 5;
                        dVar.b(5, false);
                        dVar.setShowZero(false);
                        ci.u7 u7Var = new ci.u7(22, dVar, gVar);
                        dVar.J = u7Var;
                        AndroidUtilities.runOnUIThread(u7Var, 1000L);
                        dVar.setOnClickListener(new org.telegram.ui.Cells.x2(dVar, h3Var, 1));
                    } else {
                        tl.q(R.string.UnknownError, new vc(org.telegram.ui.Components.jb.a(taVar.getContext()), null), null);
                    }
                }
                taVar.e.a(false, true);
                MessagesController.getInstance(i11).getUnconfirmedAuthController().cleanup();
                return;
            case 4:
                pl plVar = (pl) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(plVar.f29601n0.getLatitude());
                tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(plVar.f29601n0.getLongitude());
                tL_messageMediaGeoLive.period = i11;
                plVar.f29610u0.b(tL_messageMediaGeoLive, plVar.f29611v0, true, 0, ((Long) obj).longValue());
                plVar.f27704b.dismiss(true);
                return;
            case 5:
                d60.g1((d60) obj2, i11, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            case 6:
                Utilities.Callback callback = (Utilities.Callback) obj2;
                Long l4 = (Long) obj;
                if (l4 != null && l4.longValue() > 0 && l4.longValue() != Long.MAX_VALUE) {
                    user = MessagesController.getInstance(i11).getUser(l4);
                }
                callback.run(user);
                return;
            default:
                org.telegram.ui.Wallet.s9 s9Var = (org.telegram.ui.Wallet.s9) obj2;
                String str3 = (String) obj;
                if (!s9Var.f35187n && i11 == s9Var.I) {
                    s9Var.f35192y = 0;
                    s9Var.K = false;
                    if (WalletEngine2.isValidRecipientAddress(str3)) {
                        str = WalletEngine2.toUserFriendlyAddress(str3);
                    }
                    s9Var.f35190w = str;
                    d dVar2 = s9Var.Y;
                    if (dVar2 != null) {
                        if (str != null) {
                            z11 = true;
                        }
                        dVar2.setEnabled(z11);
                    }
                    s9Var.f25615a.Z2.N(true);
                    return;
                }
                return;
        }
    }

    public e4(Object obj, int i10, int i11) {
        this.f8963a = i11;
        this.f8965c = obj;
        this.f8964b = i10;
    }
}
