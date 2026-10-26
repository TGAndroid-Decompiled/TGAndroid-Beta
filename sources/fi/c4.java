package fi;

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
import org.telegram.messenger.vh;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.eg0;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.h81;
import org.telegram.ui.Components.sl;
import org.telegram.ui.Components.t61;
import org.telegram.ui.Components.wc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.e60;
public final class c4 implements Utilities.Callback {
    public final int f10607a;
    public final int f10608b;
    public final Object f10609c;

    public c4(int i10, Utilities.Callback callback) {
        this.f10607a = 6;
        this.f10608b = i10;
        this.f10609c = callback;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        int i10;
        float f7;
        int i11 = this.f10607a;
        TLRPC.User user = null;
        String str = null;
        user = null;
        user = null;
        boolean z11 = false;
        int i12 = this.f10608b;
        Object obj2 = this.f10609c;
        switch (i11) {
            case 0:
                k4 k4Var = (k4) obj2;
                View view = (View) obj;
                f4 f4Var = k4Var.f11107b;
                if (view instanceof j4) {
                    f4Var.getClass();
                    int R = RecyclerView.R(view);
                    t61 G = f4Var.f32152g3.G(R);
                    if (G != null) {
                        j4 j4Var = (j4) view;
                        j4Var.setPosition(k4Var.b(R));
                        if (i12 == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        j4Var.b(z10, true);
                        view.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                o6 o6Var = (o6) obj2;
                int[] iArr = (int[]) obj;
                w7 w7Var = o6Var.d;
                int i13 = iArr[0];
                o6Var.U = i13;
                w7Var.A0 = i13;
                int i14 = iArr[1];
                o6Var.V = i14;
                w7Var.B0 = i14;
                o6Var.T.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i12, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                o6Var.invalidate();
                h81 h81Var = o6Var.f11377n;
                if (h81Var != null) {
                    int i15 = o6Var.U;
                    int i16 = o6Var.V;
                    e00 e00Var = h81Var.f28862b;
                    if (e00Var == null) {
                        h81Var.f28865n = i15;
                        h81Var.f28866r = i16;
                    } else {
                        e00Var.i(i15, i16);
                    }
                }
                eg0 eg0Var = o6Var.f11384s;
                if (eg0Var != null) {
                    int i17 = o6Var.U;
                    int i18 = o6Var.V;
                    e00 e00Var2 = eg0Var.f27843l0;
                    if (e00Var2 != null) {
                        e00Var2.i(i17, i18);
                        return;
                    }
                    eg0Var.J0 = i17;
                    eg0Var.K0 = i18;
                    return;
                }
                return;
            case 2:
                jg.z1 z1Var = ((jg.q1) obj2).f15818a;
                jg.z1.Y(z1Var);
                i10 = ((org.telegram.ui.ActionBar.r2) z1Var).currentAccount;
                jg.c2.f(i10).k(i12, (String) obj);
                return;
            case 3:
                org.telegram.ui.Cells.xa xaVar = (org.telegram.ui.Cells.xa) obj2;
                ArrayList arrayList = (ArrayList) obj;
                xaVar.getClass();
                if (LaunchActivity.E1) {
                    if (arrayList != null && arrayList.size() != 0) {
                        LinearLayout linearLayout = new LinearLayout(xaVar.getContext());
                        linearLayout.setOrientation(1);
                        ?? imageView = new ImageView(xaVar.getContext());
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.f(R.raw.ic_ban, 50, 50, null);
                        imageView.d();
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int dp = AndroidUtilities.dp(80.0f);
                        int i19 = org.telegram.ui.ActionBar.y6.I6;
                        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.x0(null, i19, false));
                        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i19);
                        imageView.setBackground(K);
                        org.telegram.ui.ActionBar.f7.k(imageView, K, N, null, null);
                        linearLayout.addView((View) imageView, gb1.x(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(xaVar.getContext());
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.formatPluralString("UnconfirmedAuthDeniedTitle", arrayList.size(), new Object[0]));
                        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23464j5, null);
                        linearLayout.addView(textView, gb1.o(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(xaVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageSingle, org.telegram.ui.Cells.xa.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(0))));
                        } else {
                            String str2 = "\n";
                            for (int i20 = 0; i20 < Math.min(arrayList.size(), 10); i20++) {
                                StringBuilder l4 = b10.l(str2, "• ");
                                l4.append(org.telegram.ui.Cells.xa.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(i20)));
                                l4.append("\n");
                                str2 = l4.toString();
                            }
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageMultiple, str2));
                        }
                        org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23464j5, null);
                        linearLayout.addView(textView2, gb1.o(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(xaVar.getContext());
                        frameLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f));
                        int dp2 = AndroidUtilities.dp(12.0f);
                        int i21 = org.telegram.ui.ActionBar.y6.f23598q7;
                        int x02 = org.telegram.ui.ActionBar.y6.x0(null, i21, false);
                        float f10 = 0.15f;
                        if (org.telegram.ui.ActionBar.y6.I.q()) {
                            f7 = 0.2f;
                        } else {
                            f7 = 0.15f;
                        }
                        Drawable c02 = org.telegram.ui.ActionBar.y6.c0(dp2, org.telegram.ui.ActionBar.y6.o1(f7, x02));
                        if (org.telegram.ui.ActionBar.y6.I.q()) {
                            f10 = 0.2f;
                        }
                        org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(f10, i21);
                        frameLayout.setBackground(c02);
                        org.telegram.ui.ActionBar.f7.k(frameLayout, c02, L, null, null);
                        TextView textView3 = new TextView(xaVar.getContext());
                        textView3.setTypeface(AndroidUtilities.bold());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        org.telegram.ui.ActionBar.f7.V(textView3, i21, null);
                        textView3.setText(LocaleController.getString(R.string.UnconfirmedAuthDeniedWarning));
                        frameLayout.addView(textView3, gb1.i(-1, -1, 119));
                        linearLayout.addView(frameLayout, gb1.o(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        d dVar = new d(xaVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        gb1.c(dVar, 0.02f, 1.5f);
                        dVar.i(LocaleController.getString(R.string.GotIt), false, true);
                        linearLayout.addView(dVar, gb1.o(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.k3 k3Var = new org.telegram.ui.ActionBar.k3(1, xaVar.getContext(), (org.telegram.ui.ActionBar.u6) null, false);
                        k3Var.fixNavigationBar();
                        k3Var.customView = linearLayout;
                        k3Var.show();
                        k3Var.setCanDismissWithSwipe(false);
                        k3Var.setCanDismissWithTouchOutside(false);
                        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(k3Var, 11);
                        AndroidUtilities.cancelRunOnUIThread(dVar.J);
                        dVar.setCountFilled(false);
                        dVar.I = 5;
                        dVar.b(5, false);
                        dVar.setShowZero(false);
                        e2.q0 q0Var = new e2.q0(3, dVar, gVar);
                        dVar.J = q0Var;
                        AndroidUtilities.runOnUIThread(q0Var, 1000L);
                        dVar.setOnClickListener(new org.telegram.ui.Cells.w2(2, dVar, k3Var));
                    } else {
                        vh.n(R.string.UnknownError, new wc(org.telegram.ui.Components.lb.a(xaVar.getContext()), null), null);
                    }
                }
                xaVar.e.a(false, true);
                MessagesController.getInstance(i12).getUnconfirmedAuthController().cleanup();
                return;
            case 4:
                sl slVar = (sl) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(slVar.f32606n0.getLatitude());
                tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(slVar.f32606n0.getLongitude());
                tL_messageMediaGeoLive.period = i12;
                slVar.f32615u0.d(tL_messageMediaGeoLive, slVar.f32616v0, true, 0, ((Long) obj).longValue());
                slVar.f30215b.dismiss(true);
                return;
            case 5:
                e60.h1((e60) obj2, i12, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            case 6:
                Utilities.Callback callback = (Utilities.Callback) obj2;
                Long l10 = (Long) obj;
                if (l10 != null && l10.longValue() > 0 && l10.longValue() != Long.MAX_VALUE) {
                    user = MessagesController.getInstance(i12).getUser(l10);
                }
                callback.run(user);
                return;
            default:
                org.telegram.ui.Wallet.r9 r9Var = (org.telegram.ui.Wallet.r9) obj2;
                String str3 = (String) obj;
                if (!r9Var.f37202r && i12 == r9Var.J) {
                    r9Var.E = 0;
                    r9Var.L = false;
                    if (WalletEngine2.isValidRecipientAddress(str3)) {
                        str = WalletEngine2.toUserFriendlyAddress(str3);
                    }
                    r9Var.f37205x = str;
                    d dVar2 = r9Var.Z;
                    if (dVar2 != null) {
                        if (str != null) {
                            z11 = true;
                        }
                        dVar2.setEnabled(z11);
                    }
                    r9Var.f30419a.f32152g3.O(true);
                    return;
                }
                return;
        }
    }

    public c4(Object obj, int i10, int i11) {
        this.f10607a = i11;
        this.f10609c = obj;
        this.f10608b = i10;
    }
}
