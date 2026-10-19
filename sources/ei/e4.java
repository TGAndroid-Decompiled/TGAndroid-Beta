package ei;

import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
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
import org.telegram.messenger.kk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.cg0;
import org.telegram.ui.Components.e00;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.q71;
import org.telegram.ui.Components.rl;
import org.telegram.ui.Components.xc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.z50;
public final class e4 implements Utilities.Callback {
    public final int f8952a;
    public final int f8953b;
    public final Object f8954c;

    public e4(int i10, Utilities.Callback callback) {
        this.f8952a = 6;
        this.f8953b = i10;
        this.f8954c = callback;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        float f7;
        int i10 = this.f8952a;
        TLRPC.User user = null;
        String str = null;
        user = null;
        user = null;
        boolean z11 = false;
        int i11 = this.f8953b;
        Object obj2 = this.f8954c;
        switch (i10) {
            case 0:
                l4 l4Var = (l4) obj2;
                View view = (View) obj;
                g4 g4Var = l4Var.f9365b;
                if (view instanceof k4) {
                    g4Var.getClass();
                    int R = RecyclerView.R(view);
                    g61 G = g4Var.W2.G(R);
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
                q71 q71Var = r6Var.f9721n;
                if (q71Var != null) {
                    int i14 = r6Var.U;
                    int i15 = r6Var.V;
                    e00 e00Var = q71Var.f29538b;
                    if (e00Var == null) {
                        q71Var.f29541n = i14;
                        q71Var.f29542r = i15;
                    } else {
                        e00Var.i(i14, i15);
                    }
                }
                cg0 cg0Var = r6Var.f9728s;
                if (cg0Var != null) {
                    int i16 = r6Var.U;
                    int i17 = r6Var.V;
                    e00 e00Var2 = cg0Var.f25195l0;
                    if (e00Var2 != null) {
                        e00Var2.i(i16, i17);
                        return;
                    }
                    cg0Var.J0 = i16;
                    cg0Var.K0 = i17;
                    return;
                }
                return;
            case 2:
                ig.x1 x1Var = ((ig.o1) obj2).f12984a;
                ig.x1.X(x1Var);
                ig.a2.f(ig.x1.c0(x1Var)).k(i11, (String) obj);
                return;
            case 3:
                org.telegram.ui.Cells.sa saVar = (org.telegram.ui.Cells.sa) obj2;
                ArrayList arrayList = (ArrayList) obj;
                saVar.getClass();
                if (LaunchActivity.D1) {
                    if (arrayList != null && arrayList.size() != 0) {
                        LinearLayout linearLayout = new LinearLayout(saVar.getContext());
                        linearLayout.setOrientation(1);
                        ?? imageView = new ImageView(saVar.getContext());
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.f(R.raw.ic_ban, 50, 50, null);
                        imageView.d();
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        imageView.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.I6, false)));
                        linearLayout.addView((View) imageView, w7.z5.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(saVar.getContext());
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.formatPluralString("UnconfirmedAuthDeniedTitle", arrayList.size(), new Object[0]));
                        textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21093j5, false));
                        linearLayout.addView(textView, w7.z5.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(saVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageSingle, org.telegram.ui.Cells.sa.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(0))));
                        } else {
                            String str2 = "\n";
                            for (int i18 = 0; i18 < Math.min(arrayList.size(), 10); i18++) {
                                StringBuilder i19 = r4.c.i(str2, "• ");
                                i19.append(org.telegram.ui.Cells.sa.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(i18)));
                                i19.append("\n");
                                str2 = i19.toString();
                            }
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageMultiple, str2));
                        }
                        textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, org.telegram.ui.ActionBar.h6.f21093j5, false));
                        linearLayout.addView(textView2, w7.z5.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(saVar.getContext());
                        frameLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f));
                        int dp = AndroidUtilities.dp(12.0f);
                        int i20 = org.telegram.ui.ActionBar.h6.f21225q7;
                        int x02 = org.telegram.ui.ActionBar.h6.x0(null, i20, false);
                        if (org.telegram.ui.ActionBar.h6.I.q()) {
                            f7 = 0.2f;
                        } else {
                            f7 = 0.15f;
                        }
                        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(dp, org.telegram.ui.ActionBar.h6.m1(f7, x02)));
                        TextView textView3 = new TextView(saVar.getContext());
                        textView3.setTypeface(AndroidUtilities.bold());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i20, false));
                        textView3.setText(LocaleController.getString(R.string.UnconfirmedAuthDeniedWarning));
                        frameLayout.addView(textView3, w7.z5.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, w7.z5.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        d dVar = new d(saVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        w7.b6.b(dVar, 0.02f, 1.5f);
                        dVar.g(LocaleController.getString(R.string.GotIt), false, true);
                        linearLayout.addView(dVar, w7.z5.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, saVar.getContext(), (org.telegram.ui.ActionBar.d6) null, false);
                        f3Var.fixNavigationBar();
                        f3Var.customView = linearLayout;
                        f3Var.show();
                        f3Var.setCanDismissWithSwipe(false);
                        f3Var.setCanDismissWithTouchOutside(false);
                        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(f3Var, 11);
                        AndroidUtilities.cancelRunOnUIThread(dVar.G);
                        dVar.setCountFilled(false);
                        dVar.F = 5;
                        dVar.b(5, false);
                        dVar.setShowZero(false);
                        ci.v7 v7Var = new ci.v7(22, dVar, gVar);
                        dVar.G = v7Var;
                        AndroidUtilities.runOnUIThread(v7Var, 1000L);
                        dVar.setOnClickListener(new org.telegram.ui.Cells.y2(dVar, f3Var, 1));
                    } else {
                        kk.q(R.string.UnknownError, new xc(org.telegram.ui.Components.lb.a(saVar.getContext()), null), null);
                    }
                }
                saVar.e.a(false, true);
                MessagesController.getInstance(i11).getUnconfirmedAuthController().cleanup();
                return;
            case 4:
                rl rlVar = (rl) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(rlVar.f29983q0.getLatitude());
                tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(rlVar.f29983q0.getLongitude());
                tL_messageMediaGeoLive.period = i11;
                rlVar.f29994x0.b(tL_messageMediaGeoLive, rlVar.f29996y0, true, 0, ((Long) obj).longValue());
                rlVar.f28223b.dismiss(true);
                return;
            case 5:
                z50.e1((z50) obj2, i11, (ChannelBoostsController.CanApplyBoost) obj);
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
                org.telegram.ui.Wallet.r9 r9Var = (org.telegram.ui.Wallet.r9) obj2;
                String str3 = (String) obj;
                if (!r9Var.f34809n && i11 == r9Var.I) {
                    r9Var.f34814y = 0;
                    r9Var.K = false;
                    if (WalletEngine2.isValidRecipientAddress(str3)) {
                        str = WalletEngine2.toUserFriendlyAddress(str3);
                    }
                    r9Var.f34812w = str;
                    d dVar2 = r9Var.V;
                    if (dVar2 != null) {
                        if (str != null) {
                            z11 = true;
                        }
                        dVar2.setEnabled(z11);
                    }
                    r9Var.f32025a.W2.N(true);
                    return;
                }
                return;
        }
    }

    public e4(Object obj, int i10, int i11) {
        this.f8952a = i11;
        this.f8954c = obj;
        this.f8953b = i10;
    }
}
