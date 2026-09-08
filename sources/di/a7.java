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
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UnconfirmedAuthController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.gl;
import org.telegram.ui.Components.jf0;
import org.telegram.ui.Components.u61;
import org.telegram.ui.Components.vz;
import org.telegram.ui.LaunchActivity;
public final class a7 implements Utilities.Callback {
    public final int f6932a;
    public final int f6933b;
    public final Object f6934c;

    public a7(Object obj, int i10, int i11) {
        this.f6932a = i11;
        this.f6934c = obj;
        this.f6933b = i10;
    }

    @Override
    public final void run(Object obj) {
        float f7;
        int i10 = this.f6932a;
        int i11 = this.f6933b;
        Object obj2 = this.f6934c;
        switch (i10) {
            case 0:
                d7 d7Var = (d7) obj2;
                int[] iArr = (int[]) obj;
                o8 o8Var = d7Var.d;
                int i12 = iArr[0];
                d7Var.U = i12;
                o8Var.A0 = i12;
                int i13 = iArr[1];
                d7Var.V = i13;
                o8Var.B0 = i13;
                d7Var.T.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i11, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                d7Var.invalidate();
                u61 u61Var = d7Var.f7113n;
                if (u61Var != null) {
                    int i14 = d7Var.U;
                    int i15 = d7Var.V;
                    vz vzVar = u61Var.f30848b;
                    if (vzVar == null) {
                        u61Var.f30852n = i14;
                        u61Var.f30853r = i15;
                    } else {
                        vzVar.i(i14, i15);
                    }
                }
                jf0 jf0Var = d7Var.f7120s;
                if (jf0Var != null) {
                    int i16 = d7Var.U;
                    int i17 = d7Var.V;
                    vz vzVar2 = jf0Var.f27510l0;
                    if (vzVar2 != null) {
                        vzVar2.i(i16, i17);
                        return;
                    }
                    jf0Var.J0 = i16;
                    jf0Var.K0 = i17;
                    return;
                }
                return;
            case 1:
                ig.y1 y1Var = ((ig.p1) obj2).f12206a;
                ig.y1.X(y1Var);
                ig.b2.f(ig.y1.c0(y1Var)).k(i11, (String) obj);
                return;
            case 2:
                org.telegram.ui.Cells.wa waVar = (org.telegram.ui.Cells.wa) obj2;
                ArrayList arrayList = (ArrayList) obj;
                waVar.getClass();
                if (LaunchActivity.C1) {
                    if (arrayList != null && arrayList.size() != 0) {
                        LinearLayout linearLayout = new LinearLayout(waVar.getContext());
                        linearLayout.setOrientation(1);
                        ?? imageView = new ImageView(waVar.getContext());
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.f(R.raw.ic_ban, 50, 50, null);
                        imageView.d();
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false)));
                        linearLayout.addView((View) imageView, w7.x5.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(waVar.getContext());
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.formatPluralString("UnconfirmedAuthDeniedTitle", arrayList.size(), new Object[0]));
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20797j5, false));
                        linearLayout.addView(textView, w7.x5.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(waVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageSingle, org.telegram.ui.Cells.wa.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(0))));
                        } else {
                            String str = "\n";
                            for (int i18 = 0; i18 < Math.min(arrayList.size(), 10); i18++) {
                                StringBuilder g10 = w.f.g(str, "• ");
                                g10.append(org.telegram.ui.Cells.wa.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(i18)));
                                g10.append("\n");
                                str = g10.toString();
                            }
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageMultiple, str));
                        }
                        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f20797j5, false));
                        linearLayout.addView(textView2, w7.x5.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(waVar.getContext());
                        frameLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f));
                        int dp = AndroidUtilities.dp(12.0f);
                        int i19 = org.telegram.ui.ActionBar.j6.f20925q7;
                        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i19, false);
                        if (org.telegram.ui.ActionBar.j6.I.q()) {
                            f7 = 0.2f;
                        } else {
                            f7 = 0.15f;
                        }
                        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.l1(f7, w02)));
                        TextView textView3 = new TextView(waVar.getContext());
                        textView3.setTypeface(AndroidUtilities.bold());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i19, false));
                        textView3.setText(LocaleController.getString(R.string.UnconfirmedAuthDeniedWarning));
                        frameLayout.addView(textView3, w7.x5.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, w7.x5.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        d dVar = new d(waVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        w7.z5.b(dVar, 0.02f, 1.5f);
                        dVar.g(LocaleController.getString(R.string.GotIt), false, true);
                        linearLayout.addView(dVar, w7.x5.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, waVar.getContext(), (org.telegram.ui.ActionBar.f6) null, false);
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
                        bi.s8 s8Var = new bi.s8(22, dVar, gVar);
                        dVar.G = s8Var;
                        AndroidUtilities.runOnUIThread(s8Var, 1000L);
                        dVar.setOnClickListener(new org.telegram.ui.Cells.y2(dVar, f3Var, 1));
                    } else {
                        org.telegram.messenger.w1.p(R.string.UnknownError, new org.telegram.ui.Components.yc(org.telegram.ui.Components.lb.a(waVar.getContext()), null), null);
                    }
                }
                waVar.f23530e.a(false, true);
                MessagesController.getInstance(i11).getUnconfirmedAuthController().cleanup();
                return;
            default:
                gl glVar = (gl) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(glVar.f26471q0.getLatitude());
                tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(glVar.f26471q0.getLongitude());
                tL_messageMediaGeoLive.period = i11;
                glVar.f26482x0.b(tL_messageMediaGeoLive, glVar.f26484y0, true, 0, ((Long) obj).longValue());
                glVar.f28780b.dismiss(true);
                return;
        }
    }
}
