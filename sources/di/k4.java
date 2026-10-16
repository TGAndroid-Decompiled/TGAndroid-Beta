package di;

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
import org.telegram.messenger.sk;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.h00;
import org.telegram.ui.Components.jg0;
import org.telegram.ui.Components.m61;
import org.telegram.ui.Components.tl;
import org.telegram.ui.Components.y71;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.Wallet.WalletEngine2;
import org.telegram.ui.x60;
public final class k4 implements Utilities.Callback {
    public final int f7166a;
    public final int f7167b;
    public final Object f7168c;

    public k4(Object obj, int i10, int i11) {
        this.f7166a = i11;
        this.f7168c = obj;
        this.f7167b = i10;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        float f7;
        int i10 = this.f7166a;
        String str = null;
        boolean z11 = false;
        int i11 = this.f7167b;
        Object obj2 = this.f7168c;
        switch (i10) {
            case 0:
                s4 s4Var = (s4) obj2;
                View view = (View) obj;
                n4 n4Var = s4Var.f7756b;
                if (view instanceof r4) {
                    n4Var.getClass();
                    int R = RecyclerView.R(view);
                    m61 G = n4Var.W2.G(R);
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
                a7 a7Var = (a7) obj2;
                int[] iArr = (int[]) obj;
                k8 k8Var = a7Var.d;
                int i12 = iArr[0];
                a7Var.U = i12;
                k8Var.A0 = i12;
                int i13 = iArr[1];
                a7Var.V = i13;
                k8Var.B0 = i13;
                a7Var.T.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i11, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                a7Var.invalidate();
                y71 y71Var = a7Var.f6612n;
                if (y71Var != null) {
                    int i14 = a7Var.U;
                    int i15 = a7Var.V;
                    h00 h00Var = y71Var.f31176b;
                    if (h00Var == null) {
                        y71Var.f31179n = i14;
                        y71Var.f31180r = i15;
                    } else {
                        h00Var.i(i14, i15);
                    }
                }
                jg0 jg0Var = a7Var.f6619s;
                if (jg0Var != null) {
                    int i16 = a7Var.U;
                    int i17 = a7Var.V;
                    h00 h00Var2 = jg0Var.f26009l0;
                    if (h00Var2 != null) {
                        h00Var2.i(i16, i17);
                        return;
                    }
                    jg0Var.J0 = i16;
                    jg0Var.K0 = i17;
                    return;
                }
                return;
            case 2:
                ig.y1 y1Var = ((ig.p1) obj2).f11608a;
                ig.y1.X(y1Var);
                ig.b2.f(ig.y1.c0(y1Var)).k(i11, (String) obj);
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
                        imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.I6, false)));
                        linearLayout.addView((View) imageView, w7.z5.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(uaVar.getContext());
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.formatPluralString("UnconfirmedAuthDeniedTitle", arrayList.size(), new Object[0]));
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19707j5, false));
                        linearLayout.addView(textView, w7.z5.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(uaVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageSingle, org.telegram.ui.Cells.ua.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(0))));
                        } else {
                            String str2 = "\n";
                            for (int i18 = 0; i18 < Math.min(arrayList.size(), 10); i18++) {
                                StringBuilder i19 = t8.b.i(str2, "• ");
                                i19.append(org.telegram.ui.Cells.ua.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(i18)));
                                i19.append("\n");
                                str2 = i19.toString();
                            }
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageMultiple, str2));
                        }
                        textView2.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, org.telegram.ui.ActionBar.g6.f19707j5, false));
                        linearLayout.addView(textView2, w7.z5.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(uaVar.getContext());
                        frameLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f));
                        int dp = AndroidUtilities.dp(12.0f);
                        int i20 = org.telegram.ui.ActionBar.g6.f19839q7;
                        int x02 = org.telegram.ui.ActionBar.g6.x0(null, i20, false);
                        if (org.telegram.ui.ActionBar.g6.I.q()) {
                            f7 = 0.2f;
                        } else {
                            f7 = 0.15f;
                        }
                        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.c0(dp, org.telegram.ui.ActionBar.g6.m1(f7, x02)));
                        TextView textView3 = new TextView(uaVar.getContext());
                        textView3.setTypeface(AndroidUtilities.bold());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        textView3.setTextColor(org.telegram.ui.ActionBar.g6.x0(null, i20, false));
                        textView3.setText(LocaleController.getString(R.string.UnconfirmedAuthDeniedWarning));
                        frameLayout.addView(textView3, w7.z5.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, w7.z5.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        d dVar = new d(uaVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        w7.b6.b(dVar, 0.02f, 1.5f);
                        dVar.g(LocaleController.getString(R.string.GotIt), false, true);
                        linearLayout.addView(dVar, w7.z5.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.e3 e3Var = new org.telegram.ui.ActionBar.e3(1, uaVar.getContext(), (org.telegram.ui.ActionBar.c6) null, false);
                        e3Var.fixNavigationBar();
                        e3Var.customView = linearLayout;
                        e3Var.show();
                        e3Var.setCanDismissWithSwipe(false);
                        e3Var.setCanDismissWithTouchOutside(false);
                        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(e3Var, 11);
                        AndroidUtilities.cancelRunOnUIThread(dVar.G);
                        dVar.setCountFilled(false);
                        dVar.F = 5;
                        dVar.b(5, false);
                        dVar.setShowZero(false);
                        bi.u8 u8Var = new bi.u8(24, dVar, gVar);
                        dVar.G = u8Var;
                        AndroidUtilities.runOnUIThread(u8Var, 1000L);
                        dVar.setOnClickListener(new org.telegram.ui.Cells.z2(dVar, e3Var, 1));
                    } else {
                        sk.q(R.string.UnknownError, new org.telegram.ui.Components.zc(org.telegram.ui.Components.nb.a(uaVar.getContext()), null), null);
                    }
                }
                uaVar.e.a(false, true);
                MessagesController.getInstance(i11).getUnconfirmedAuthController().cleanup();
                return;
            case 4:
                tl tlVar = (tl) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(tlVar.f29108q0.getLatitude());
                tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(tlVar.f29108q0.getLongitude());
                tL_messageMediaGeoLive.period = i11;
                tlVar.f29119x0.b(tL_messageMediaGeoLive, tlVar.f29121y0, true, 0, ((Long) obj).longValue());
                tlVar.f27360b.dismiss(true);
                return;
            case 5:
                x60.e1((x60) obj2, i11, (ChannelBoostsController.CanApplyBoost) obj);
                return;
            default:
                org.telegram.ui.Wallet.s8 s8Var = (org.telegram.ui.Wallet.s8) obj2;
                String str3 = (String) obj;
                if (!s8Var.f33436n && i11 == s8Var.I) {
                    s8Var.f33441y = 0;
                    s8Var.K = false;
                    if (WalletEngine2.isValidRecipientAddress(str3)) {
                        str = WalletEngine2.toUserFriendlyAddress(str3);
                    }
                    s8Var.f33439w = str;
                    d dVar2 = s8Var.V;
                    if (dVar2 != null) {
                        if (str != null) {
                            z11 = true;
                        }
                        dVar2.setEnabled(z11);
                    }
                    s8Var.f24003a.W2.N(true);
                    return;
                }
                return;
        }
    }
}
