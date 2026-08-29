package nh;

import android.graphics.LinearGradient;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.bl;
import org.telegram.ui.Components.ef0;
import org.telegram.ui.Components.l61;
import org.telegram.ui.Components.qz;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
public final class c6 implements Utilities.Callback {
    public final int f17474a;
    public final int f17475b;
    public final Object f17476c;

    public c6(Object obj, int i10, int i11) {
        this.f17474a = i11;
        this.f17476c = obj;
        this.f17475b = i10;
    }

    @Override
    public final void run(Object obj) {
        float f9;
        int i10;
        int i11 = this.f17474a;
        int i12 = this.f17475b;
        Object obj2 = this.f17476c;
        switch (i11) {
            case 0:
                f6 f6Var = (f6) obj2;
                int[] iArr = (int[]) obj;
                o7 o7Var = f6Var.d;
                int i13 = iArr[0];
                f6Var.Q = i13;
                o7Var.A0 = i13;
                int i14 = iArr[1];
                f6Var.R = i14;
                o7Var.B0 = i14;
                f6Var.P.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i12, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                f6Var.invalidate();
                l61 l61Var = f6Var.f17661n;
                if (l61Var != null) {
                    int i15 = f6Var.Q;
                    int i16 = f6Var.R;
                    qz qzVar = l61Var.f30235b;
                    if (qzVar == null) {
                        l61Var.f30239n = i15;
                        l61Var.f30240r = i16;
                    } else {
                        qzVar.i(i15, i16);
                    }
                }
                ef0 ef0Var = f6Var.f17668s;
                if (ef0Var != null) {
                    int i17 = f6Var.Q;
                    int i18 = f6Var.R;
                    qz qzVar2 = ef0Var.f28034h0;
                    if (qzVar2 != null) {
                        qzVar2.i(i17, i18);
                        return;
                    }
                    ef0Var.F0 = i17;
                    ef0Var.G0 = i18;
                    return;
                }
                return;
            case 1:
                org.telegram.ui.Cells.pa paVar = (org.telegram.ui.Cells.pa) obj2;
                ArrayList arrayList = (ArrayList) obj;
                paVar.getClass();
                if (LaunchActivity.f35561y1) {
                    if (arrayList != null && arrayList.size() != 0) {
                        LinearLayout linearLayout = new LinearLayout(paVar.getContext());
                        linearLayout.setOrientation(1);
                        ?? imageView = new ImageView(paVar.getContext());
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.f(R.raw.ic_ban, 50, 50, null);
                        imageView.d();
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        imageView.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.I6, false)));
                        linearLayout.addView((View) imageView, i7.f6.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(paVar.getContext());
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.formatPluralString("UnconfirmedAuthDeniedTitle", arrayList.size(), new Object[0]));
                        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false));
                        linearLayout.addView(textView, i7.f6.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(paVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageSingle, org.telegram.ui.Cells.pa.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(0))));
                        } else {
                            String str = "\n";
                            for (int i19 = 0; i19 < Math.min(arrayList.size(), 10); i19++) {
                                StringBuilder f10 = u3.c.f(str, "• ");
                                f10.append(org.telegram.ui.Cells.pa.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(i19)));
                                f10.append("\n");
                                str = f10.toString();
                            }
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageMultiple, str));
                        }
                        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, org.telegram.ui.ActionBar.g6.f23169j5, false));
                        linearLayout.addView(textView2, i7.f6.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(paVar.getContext());
                        frameLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f));
                        int dp = AndroidUtilities.dp(12.0f);
                        int i20 = org.telegram.ui.ActionBar.g6.f23295q7;
                        int w02 = org.telegram.ui.ActionBar.g6.w0(null, i20, false);
                        if (org.telegram.ui.ActionBar.g6.I.q()) {
                            f9 = 0.2f;
                        } else {
                            f9 = 0.15f;
                        }
                        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.b0(dp, org.telegram.ui.ActionBar.g6.l1(f9, w02)));
                        TextView textView3 = new TextView(paVar.getContext());
                        textView3.setTypeface(AndroidUtilities.bold());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i20, false));
                        textView3.setText(LocaleController.getString(R.string.UnconfirmedAuthDeniedWarning));
                        frameLayout.addView(textView3, i7.f6.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, i7.f6.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        d dVar = new d(paVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        i7.h6.b(dVar, 0.02f, 1.5f);
                        dVar.g(LocaleController.getString(R.string.GotIt), false, true);
                        linearLayout.addView(dVar, i7.f6.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(paVar.getContext(), null, false, false);
                        f3Var.fixNavigationBar();
                        f3Var.customView = linearLayout;
                        f3Var.show();
                        f3Var.setCanDismissWithSwipe(false);
                        f3Var.setCanDismissWithTouchOutside(false);
                        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(f3Var, 11);
                        AndroidUtilities.cancelRunOnUIThread(dVar.C);
                        dVar.setCountFilled(false);
                        dVar.B = 5;
                        dVar.c(5, false);
                        dVar.setShowZero(false);
                        lh.r3 r3Var = new lh.r3(24, dVar, gVar);
                        dVar.C = r3Var;
                        AndroidUtilities.runOnUIThread(r3Var, 1000L);
                        dVar.setOnClickListener(new org.telegram.ui.Cells.w2(dVar, f3Var, 1));
                    } else {
                        org.telegram.messenger.x3.s(R.string.UnknownError, new tc(org.telegram.ui.Components.hb.a(paVar.getContext()), null), null);
                    }
                }
                paVar.f25022e.a(false, true);
                MessagesController.getInstance(i12).getUnconfirmedAuthController().cleanup();
                return;
            case 2:
                bl blVar = (bl) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(blVar.m0.getLatitude());
                tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(blVar.m0.getLongitude());
                tL_messageMediaGeoLive.period = i12;
                blVar.f27173t0.d(tL_messageMediaGeoLive, blVar.f27174u0, true, 0, ((Long) obj).longValue());
                blVar.f28403b.dismiss(true);
                return;
            default:
                sf.n1 n1Var = ((sf.g1) obj2).f47814a;
                sf.n1.X(n1Var);
                i10 = ((org.telegram.ui.ActionBar.o2) n1Var).currentAccount;
                sf.s1.f(i10).k(i12, (String) obj);
                return;
        }
    }
}
