package bi;

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
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.h71;
import org.telegram.ui.Components.ll;
import org.telegram.ui.Components.sf0;
import org.telegram.ui.LaunchActivity;
public final class c8 implements Utilities.Callback {
    public final int f2415a;
    public final int f2416b;
    public final Object f2417c;

    public c8(Object obj, int i10, int i11) {
        this.f2415a = i11;
        this.f2417c = obj;
        this.f2416b = i10;
    }

    @Override
    public final void run(Object obj) {
        int i10;
        float f7;
        int i11 = this.f2415a;
        int i12 = this.f2416b;
        Object obj2 = this.f2417c;
        switch (i11) {
            case 0:
                e8 e8Var = (e8) obj2;
                int[] iArr = (int[]) obj;
                r9 r9Var = e8Var.d;
                int i13 = iArr[0];
                e8Var.U = i13;
                r9Var.A0 = i13;
                int i14 = iArr[1];
                e8Var.V = i14;
                r9Var.B0 = i14;
                e8Var.T.setShader(new LinearGradient(0.0f, 0.0f, 0.0f, i12, iArr, new float[]{0.0f, 1.0f}, Shader.TileMode.CLAMP));
                e8Var.invalidate();
                h71 h71Var = e8Var.f2647n;
                if (h71Var != null) {
                    int i15 = e8Var.U;
                    int i16 = e8Var.V;
                    c00 c00Var = h71Var.f23538b;
                    if (c00Var == null) {
                        h71Var.f23541n = i15;
                        h71Var.f23542r = i16;
                    } else {
                        c00Var.i(i15, i16);
                    }
                }
                sf0 sf0Var = e8Var.f2654s;
                if (sf0Var != null) {
                    int i17 = e8Var.U;
                    int i18 = e8Var.V;
                    c00 c00Var2 = sf0Var.f27026l0;
                    if (c00Var2 != null) {
                        c00Var2.i(i17, i18);
                        return;
                    }
                    sf0Var.J0 = i17;
                    sf0Var.K0 = i18;
                    return;
                }
                return;
            case 1:
                gg.h2 h2Var = ((gg.y1) obj2).f9100a;
                gg.h2.X(h2Var);
                i10 = ((org.telegram.ui.ActionBar.p2) h2Var).currentAccount;
                gg.k2.f(i10).k(i12, (String) obj);
                return;
            case 2:
                org.telegram.ui.Cells.ya yaVar = (org.telegram.ui.Cells.ya) obj2;
                ArrayList arrayList = (ArrayList) obj;
                yaVar.getClass();
                if (LaunchActivity.C1) {
                    if (arrayList != null && arrayList.size() != 0) {
                        LinearLayout linearLayout = new LinearLayout(yaVar.getContext());
                        linearLayout.setOrientation(1);
                        ?? imageView = new ImageView(yaVar.getContext());
                        imageView.setColorFilter(new PorterDuffColorFilter(-1, PorterDuff.Mode.SRC_IN));
                        imageView.f(R.raw.ic_ban, 50, 50, null);
                        imageView.d();
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        imageView.setBackground(org.telegram.ui.ActionBar.j6.K(AndroidUtilities.dp(80.0f), org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.I6, false)));
                        linearLayout.addView((View) imageView, w7.a6.t(80, 80, 17, 0, 14, 0, 0));
                        TextView textView = new TextView(yaVar.getContext());
                        textView.setTypeface(AndroidUtilities.bold());
                        textView.setTextSize(1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.formatPluralString("UnconfirmedAuthDeniedTitle", arrayList.size(), new Object[0]));
                        textView.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false));
                        linearLayout.addView(textView, w7.a6.k(28.0f, 14.0f, 28.0f, 0.0f, -1, -2));
                        TextView textView2 = new TextView(yaVar.getContext());
                        textView2.setTextSize(1, 14.0f);
                        textView2.setGravity(17);
                        if (arrayList.size() == 1) {
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageSingle, org.telegram.ui.Cells.ya.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(0))));
                        } else {
                            String str = "\n";
                            for (int i19 = 0; i19 < Math.min(arrayList.size(), 10); i19++) {
                                StringBuilder g10 = w.f.g(str, "• ");
                                g10.append(org.telegram.ui.Cells.ya.a((UnconfirmedAuthController.UnconfirmedAuth) arrayList.get(i19)));
                                g10.append("\n");
                                str = g10.toString();
                            }
                            textView2.setText(LocaleController.formatString(R.string.UnconfirmedAuthDeniedMessageMultiple, str));
                        }
                        textView2.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, org.telegram.ui.ActionBar.j6.f18034j5, false));
                        linearLayout.addView(textView2, w7.a6.k(40.0f, 9.0f, 40.0f, 0.0f, -1, -2));
                        FrameLayout frameLayout = new FrameLayout(yaVar.getContext());
                        frameLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f), AndroidUtilities.dp(24.0f), AndroidUtilities.dp(10.0f));
                        int dp = AndroidUtilities.dp(12.0f);
                        int i20 = org.telegram.ui.ActionBar.j6.f18162q7;
                        int w02 = org.telegram.ui.ActionBar.j6.w0(null, i20, false);
                        if (org.telegram.ui.ActionBar.j6.I.q()) {
                            f7 = 0.2f;
                        } else {
                            f7 = 0.15f;
                        }
                        frameLayout.setBackground(org.telegram.ui.ActionBar.j6.b0(dp, org.telegram.ui.ActionBar.j6.l1(f7, w02)));
                        TextView textView3 = new TextView(yaVar.getContext());
                        textView3.setTypeface(AndroidUtilities.bold());
                        textView3.setTextSize(1, 14.0f);
                        textView3.setGravity(17);
                        textView3.setTextColor(org.telegram.ui.ActionBar.j6.w0(null, i20, false));
                        textView3.setText(LocaleController.getString(R.string.UnconfirmedAuthDeniedWarning));
                        frameLayout.addView(textView3, w7.a6.e(-1, -1, 119));
                        linearLayout.addView(frameLayout, w7.a6.k(14.0f, 19.0f, 14.0f, 0.0f, -1, -2));
                        d dVar = new d(yaVar.getContext(), null, true);
                        dVar.setRoundRadius(24);
                        w7.c6.b(dVar, 0.02f, 1.5f);
                        dVar.g(LocaleController.getString(R.string.GotIt), false, true);
                        linearLayout.addView(dVar, w7.a6.k(14.0f, 20.0f, 14.0f, 4.0f, -1, 48));
                        org.telegram.ui.ActionBar.h3 h3Var = new org.telegram.ui.ActionBar.h3(1, yaVar.getContext(), (org.telegram.ui.ActionBar.f6) null, false);
                        h3Var.fixNavigationBar();
                        h3Var.customView = linearLayout;
                        h3Var.show();
                        h3Var.setCanDismissWithSwipe(false);
                        h3Var.setCanDismissWithTouchOutside(false);
                        org.telegram.ui.Cells.g gVar = new org.telegram.ui.Cells.g(h3Var, 11);
                        AndroidUtilities.cancelRunOnUIThread(dVar.G);
                        dVar.setCountFilled(false);
                        dVar.F = 5;
                        dVar.b(5, false);
                        dVar.setShowZero(false);
                        a1.e eVar = new a1.e(9, dVar, gVar);
                        dVar.G = eVar;
                        AndroidUtilities.runOnUIThread(eVar, 1000L);
                        dVar.setOnClickListener(new org.telegram.ui.Cells.y2(dVar, h3Var, 1));
                    } else {
                        org.telegram.messenger.a2.p(R.string.UnknownError, new org.telegram.ui.Components.wc(org.telegram.ui.Components.kb.a(yaVar.getContext()), null), null);
                    }
                }
                yaVar.e.a(false, true);
                MessagesController.getInstance(i12).getUnconfirmedAuthController().cleanup();
                return;
            default:
                ll llVar = (ll) obj2;
                TLRPC.TL_messageMediaGeoLive tL_messageMediaGeoLive = new TLRPC.TL_messageMediaGeoLive();
                TLRPC.TL_geoPoint tL_geoPoint = new TLRPC.TL_geoPoint();
                tL_messageMediaGeoLive.geo = tL_geoPoint;
                tL_geoPoint.lat = AndroidUtilities.fixLocationCoord(llVar.f25040q0.getLatitude());
                tL_messageMediaGeoLive.geo._long = AndroidUtilities.fixLocationCoord(llVar.f25040q0.getLongitude());
                tL_messageMediaGeoLive.period = i12;
                llVar.f25051x0.b(tL_messageMediaGeoLive, llVar.f25053y0, true, 0, ((Long) obj).longValue());
                llVar.f26422b.dismiss(true);
                return;
        }
    }
}
