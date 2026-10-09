package ci;

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
import org.telegram.messenger.bi;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.kg0;
import org.telegram.ui.Components.l00;
import org.telegram.ui.Components.p61;
import org.telegram.ui.Components.xl;
import org.telegram.ui.Components.z71;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.q60;
public final class k4 implements Utilities.Callback {
    public final int f5315a;
    public final int f5316b;
    public final Object f5317c;

    public k4(Object obj, int i10, int i11) {
        this.f5315a = i11;
        this.f5317c = obj;
        this.f5316b = i10;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        float f7;
        int i10 = this.f5315a;
        String str = null;
        boolean z11 = false;
        int i11 = this.f5316b;
        Object obj2 = this.f5317c;
        switch (i10) {
            case 0:
                s4 s4Var = (s4) obj2;
                View view = (View) obj;
                n4 n4Var = s4Var.f5942b;
                if (view instanceof r4) {
                    n4Var.getClass();
                    int R = RecyclerView.R(view);
                    p61 G = n4Var.W2.G(R);
                    if (G != null) {
                        r4 r4Var = (r4) view;
                        r4Var.setPosition(s4Var.b(R));
                        if (i11 == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        r4Var.b(z10, true);
                        view.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                b7 b7Var = (b7) obj2;
                int[] iArr = (int[]) obj;
                l8 l8Var = b7Var.d;
                int i12 = iArr[0];
                b7Var.U = i12;
                l8Var.A0 = i12;
                int i13 = iArr[1];
                b7Var.V = i13;
                l8Var.B0 = i13;
                b7Var.T.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i11, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                b7Var.invalidate();
                z71 z71Var = b7Var.f4773n;
                if (z71Var != null) {
                    int i14 = b7Var.U;
                    int i15 = b7Var.V;
                    l00 l00Var = z71Var.f33491b;
                    if (l00Var == null) {
                        z71Var.f33495n = i14;
                        z71Var.f33496r = i15;
                    } else {
                        l00Var.i(i14, i15);
                    }
                }
                kg0 kg0Var = b7Var.f4780s;
                if (kg0Var != null) {
                    int i16 = b7Var.U;
                    int i17 = b7Var.V;
                    l00 l00Var2 = kg0Var.f27987l0;
                    if (l00Var2 != null) {
                        l00Var2.i(i16, i17);
                        return;
                    }
                    kg0Var.J0 = i16;
                    kg0Var.K0 = i17;
                    return;
                }
                return;
            case 2:
                hg.z1 z1Var = ((hg.q1) obj2).f11357a;
                hg.z1.X(z1Var);
                hg.c2.f(hg.z1.c0(z1Var)).k(i11, (String) obj);
                return;
            case 3:
                org.telegram.ui.Cells.ua uaVar = (org.telegram.ui.Cells.ua) obj2;
                ArrayList arrayList = (ArrayList) obj;
                uaVar.getClass();
                if (LaunchActivity.C1) {
                    if (arrayList != null && arrayList.size() != 0) {
                        LinearLayout linearLayout = new LinearLayout(uaVar.getContext());
                        linearLayout.setOrientation(1);
                        ?? imageView = new ImageView(uaVar.getContext());
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.f(R.raw.ic_ban, 50, 50, null);
                        imageView.d();
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        imageView.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.I6, false)));
                        linearLayout.addView((View) imageView, w7.x5.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(uaVar.getContext());
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.formatPluralString("UnconfirmedAuthDeniedTitle", arrayList.size(), new Object[0]));
                        textView.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20905j5, false));
                        linearLayout.addView(textView, w7.x5.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(uaVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageSingle, org.telegram.ui.Cells.ua.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(0))));
                        } else {
                            String str2 = "\n";
                            for (int i18 = 0; i18 < Math.min(arrayList.size(), 10); i18++) {
                                StringBuilder j3 = sc.v.j(str2, "• ");
                                j3.append(org.telegram.ui.Cells.ua.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(i18)));
                                j3.append("\n");
                                str2 = j3.toString();
                            }
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageMultiple, str2));
                        }
                        textView2.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, org.telegram.ui.ActionBar.i6.f20905j5, false));
                        linearLayout.addView(textView2, w7.x5.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(uaVar.getContext());
                        frameLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f));
                        int dp = AndroidUtilities.dp(12.0f);
                        int i19 = org.telegram.ui.ActionBar.i6.f21037q7;
                        int x02 = org.telegram.ui.ActionBar.i6.x0(null, i19, false);
                        if (org.telegram.ui.ActionBar.i6.I.q()) {
                            f7 = 0.2f;
                        } else {
                            f7 = 0.15f;
                        }
                        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.c0(dp, org.telegram.ui.ActionBar.i6.m1(f7, x02)));
                        TextView textView3 = new TextView(uaVar.getContext());
                        textView3.setTypeface(AndroidUtilities.bold());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        textView3.setTextColor(org.telegram.ui.ActionBar.i6.x0(null, i19, false));
                        textView3.setText(LocaleController.getString(R.string.UnconfirmedAuthDeniedWarning));
                        frameLayout.addView(textView3, w7.x5.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, w7.x5.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        d dVar = new d(uaVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        w7.z5.b(dVar, 0.02f, 1.5f);
                        dVar.g(LocaleController.getString(R.string.GotIt), false, true);
                        linearLayout.addView(dVar, w7.x5.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, uaVar.getContext(), (org.telegram.ui.ActionBar.e6) null, false);
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
                        ai.ca caVar = new ai.ca(13, dVar, gVar);
                        dVar.G = caVar;
                        AndroidUtilities.runOnUIThread(caVar, 1000L);
                        dVar.setOnClickListener(new org.telegram.ui.Cells.z2(dVar, f3Var, 1));
                    } else {
                        bi.q(R.string.UnknownError, new org.telegram.ui.Components.ad(org.telegram.ui.Components.ob.a(uaVar.getContext()), null), null);
                    }
                }
                uaVar.f23526e.a(false, true);
                MessagesController.getInstance(i11).getUnconfirmedAuthController().cleanup();
                return;
            case 4:
                xl xlVar = (xl) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(xlVar.f32920q0.getLatitude());
                tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(xlVar.f32920q0.getLongitude());
                tL_messageMediaGeoLive.period = i11;
                xlVar.f32931x0.b(tL_messageMediaGeoLive, xlVar.f32933y0, true, 0, ((Long) obj).longValue());
                xlVar.f30173b.dismiss(true);
                return;
            case 5:
                q60.e1((q60) obj2, i11, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                org.telegram.ui.Wallet.r8 r8Var = (org.telegram.ui.Wallet.r8) obj2;
                String str3 = (String) obj;
                if (!r8Var.f35426n && i11 == r8Var.I) {
                    r8Var.f35431y = 0;
                    r8Var.K = false;
                    if (WalletEngine2.isValidRecipientAddress(str3)) {
                        str = WalletEngine2.toUserFriendlyAddress(str3);
                    }
                    r8Var.f35429w = str;
                    d dVar2 = r8Var.V;
                    if (dVar2 != null) {
                        if (str != null) {
                            z11 = true;
                        }
                        dVar2.setEnabled(z11);
                    }
                    r8Var.f26290a.W2.N(true);
                    return;
                }
                return;
        }
    }
}
