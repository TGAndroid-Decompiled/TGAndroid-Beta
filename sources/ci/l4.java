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
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.jl;
import org.telegram.ui.Components.u71;
import org.telegram.ui.Components.vf0;
import org.telegram.ui.Components.yz;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.r60;
public final class l4 implements Utilities.Callback {
    public final int f5489a;
    public final int f5490b;
    public final Object f5491c;

    public l4(Object obj, int i10, int i11) {
        this.f5489a = i11;
        this.f5491c = obj;
        this.f5490b = i10;
    }

    @Override
    public final void run(Object obj) {
        boolean z10;
        float f7;
        int i10 = this.f5489a;
        int i11 = this.f5490b;
        Object obj2 = this.f5491c;
        switch (i10) {
            case 0:
                t4 t4Var = (t4) obj2;
                View view = (View) obj;
                o4 o4Var = t4Var.f5964b;
                if (view instanceof s4) {
                    o4Var.getClass();
                    int R = RecyclerView.R(view);
                    h61 G = o4Var.f26034f3.G(R);
                    if (G != null) {
                        s4 s4Var = (s4) view;
                        s4Var.setPosition(t4Var.b(R));
                        if (i11 == G.d) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        s4Var.b(z10, true);
                        view.setPressed(false);
                        return;
                    }
                    return;
                }
                return;
            case 1:
                b7 b7Var = (b7) obj2;
                int[] iArr = (int[]) obj;
                k8 k8Var = b7Var.d;
                int i12 = iArr[0];
                b7Var.U = i12;
                k8Var.A0 = i12;
                int i13 = iArr[1];
                b7Var.V = i13;
                k8Var.B0 = i13;
                b7Var.T.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i11, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                b7Var.invalidate();
                u71 u71Var = b7Var.f4755n;
                if (u71Var != null) {
                    int i14 = b7Var.U;
                    int i15 = b7Var.V;
                    yz yzVar = u71Var.f31370b;
                    if (yzVar == null) {
                        u71Var.f31374n = i14;
                        u71Var.f31375r = i15;
                    } else {
                        yzVar.i(i14, i15);
                    }
                }
                vf0 vf0Var = b7Var.f4762s;
                if (vf0Var != null) {
                    int i16 = b7Var.U;
                    int i17 = b7Var.V;
                    yz yzVar2 = vf0Var.f31732l0;
                    if (yzVar2 != null) {
                        yzVar2.i(i16, i17);
                        return;
                    }
                    vf0Var.J0 = i16;
                    vf0Var.K0 = i17;
                    return;
                }
                return;
            case 2:
                hg.y1 y1Var = ((hg.p1) obj2).f11297a;
                hg.y1.W(y1Var);
                hg.b2.f(hg.y1.c0(y1Var)).k(i11, (String) obj);
                return;
            case 3:
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
                        imageView.setBackground(org.telegram.ui.ActionBar.i6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.I6, false)));
                        linearLayout.addView((View) imageView, w7.z5.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(waVar.getContext());
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.formatPluralString("UnconfirmedAuthDeniedTitle", arrayList.size(), new Object[0]));
                        textView.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20935j5, false));
                        linearLayout.addView(textView, w7.z5.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(waVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageSingle, org.telegram.ui.Cells.wa.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(0))));
                        } else {
                            String str = "\n";
                            for (int i18 = 0; i18 < Math.min(arrayList.size(), 10); i18++) {
                                StringBuilder j3 = sa.e.j(str, "• ");
                                j3.append(org.telegram.ui.Cells.wa.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(i18)));
                                j3.append("\n");
                                str = j3.toString();
                            }
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageMultiple, str));
                        }
                        textView2.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, org.telegram.ui.ActionBar.i6.f20935j5, false));
                        linearLayout.addView(textView2, w7.z5.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(waVar.getContext());
                        frameLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f));
                        int dp = AndroidUtilities.dp(12.0f);
                        int i19 = org.telegram.ui.ActionBar.i6.f21068q7;
                        int w02 = org.telegram.ui.ActionBar.i6.w0(null, i19, false);
                        if (org.telegram.ui.ActionBar.i6.I.q()) {
                            f7 = 0.2f;
                        } else {
                            f7 = 0.15f;
                        }
                        frameLayout.setBackground(org.telegram.ui.ActionBar.i6.b0(dp, org.telegram.ui.ActionBar.i6.l1(f7, w02)));
                        TextView textView3 = new TextView(waVar.getContext());
                        textView3.setTypeface(AndroidUtilities.bold());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        textView3.setTextColor(org.telegram.ui.ActionBar.i6.w0(null, i19, false));
                        textView3.setText(LocaleController.getString(R.string.UnconfirmedAuthDeniedWarning));
                        frameLayout.addView(textView3, w7.z5.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, w7.z5.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        d dVar = new d(waVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        w7.b6.b(dVar, 0.02f, 1.5f);
                        dVar.g(LocaleController.getString(R.string.GotIt), false, true);
                        linearLayout.addView(dVar, w7.z5.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.f3 f3Var = new org.telegram.ui.ActionBar.f3(1, waVar.getContext(), (org.telegram.ui.ActionBar.d6) null, false);
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
                        ai.ba baVar = new ai.ba(13, dVar, gVar);
                        dVar.G = baVar;
                        AndroidUtilities.runOnUIThread(baVar, 1000L);
                        dVar.setOnClickListener(new org.telegram.ui.Cells.z2(dVar, f3Var, 1));
                    } else {
                        bi.o(R.string.UnknownError, new org.telegram.ui.Components.yc(org.telegram.ui.Components.mb.a(waVar.getContext()), null), null);
                    }
                }
                waVar.f23712e.a(false, true);
                MessagesController.getInstance(i11).getUnconfirmedAuthController().cleanup();
                return;
            case 4:
                jl jlVar = (jl) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(jlVar.f27892q0.getLatitude());
                tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(jlVar.f27892q0.getLongitude());
                tL_messageMediaGeoLive.period = i11;
                jlVar.f27903x0.b(tL_messageMediaGeoLive, jlVar.f27905y0, true, 0, ((Long) obj).longValue());
                jlVar.f29741b.dismiss(true);
                return;
            default:
                r60.e1((r60) obj2, i11, (ChannelBoostsController.CanApplyBoost) obj);
                return;
        }
    }
}
