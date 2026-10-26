package m4;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.HashMap;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.IMapsProvider;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.ui.ActionBar.f7;
import org.telegram.ui.ActionBar.y6;
import org.telegram.ui.Cells.y4;
import org.telegram.ui.Components.gb1;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.y9;
import org.telegram.ui.d3;
import org.telegram.ui.jc0;
import org.telegram.ui.lc0;
import org.telegram.ui.mc0;
import org.telegram.ui.oc0;
import org.telegram.ui.pc0;
public final class l0 implements o0, IMapsProvider.OnMarkerClickListener {
    public final float f18123a;
    public final Object f18124b;

    public l0(Object obj, float f7) {
        this.f18124b = obj;
        this.f18123a = f7;
    }

    @Override
    public void i(w wVar) {
        ((p0) this.f18124b).f18181g.f18057t.b(this.f18123a);
    }

    @Override
    public boolean onClick(IMapsProvider.IMarker iMarker) {
        int i10;
        int i11;
        int i12;
        pc0 pc0Var = (pc0) this.f18124b;
        ArrayList arrayList = pc0Var.f42438g0;
        if (iMarker.getTag() instanceof oc0) {
            pc0Var.X.setVisibility(4);
            if (!pc0Var.B0) {
                ImageView imageView = pc0Var.f42428a;
                int i13 = y6.f23685ui;
                f7.t(imageView, i13, pc0Var.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                pc0Var.f42428a.setTag(Integer.valueOf(i13));
                pc0Var.B0 = true;
            }
            int i14 = 0;
            while (true) {
                if (i14 >= arrayList.size()) {
                    break;
                }
                jc0 jc0Var = (jc0) arrayList.get(i14);
                if (jc0Var != null && jc0Var.e == iMarker) {
                    pc0Var.f42440i0 = jc0Var.f40553a;
                    if (pc0Var.f42441j0) {
                        pc0Var.f42441j0 = false;
                        pc0Var.D0();
                    }
                    pc0Var.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLngZoom(jc0Var.e.getPosition(), this.f18123a));
                } else {
                    i14++;
                }
            }
            mc0 mc0Var = pc0Var.f42458x;
            pc0 pc0Var2 = mc0Var.f41532b;
            HashMap hashMap = mc0Var.f41531a;
            oc0 oc0Var = (oc0) iMarker.getTag();
            if (oc0Var != null && pc0Var2.f42445n0 != oc0Var) {
                pc0Var2.z0(false);
                IMapsProvider.IMarker iMarker2 = pc0Var2.m0;
                if (iMarker2 != null) {
                    View view = (View) hashMap.get(iMarker2);
                    if (view != null) {
                        mc0Var.removeView(view);
                        hashMap.remove(iMarker2);
                    }
                    pc0Var2.m0 = null;
                }
                pc0Var2.f42445n0 = oc0Var;
                pc0Var2.m0 = iMarker;
                Context context = mc0Var.getContext();
                FrameLayout frameLayout = new FrameLayout(context);
                mc0Var.addView(frameLayout, gb1.g(114.0f, -2));
                FrameLayout frameLayout2 = new FrameLayout(context);
                pc0Var2.f42446o0 = frameLayout2;
                frameLayout2.setBackgroundResource(R.drawable.venue_tooltip);
                FrameLayout frameLayout3 = pc0Var2.f42446o0;
                f7.y(frameLayout3, frameLayout3.getBackground(), y6.f23427h5, pc0Var2.getResourceProvider(), PorterDuff.Mode.MULTIPLY);
                frameLayout.addView(pc0Var2.f42446o0, gb1.g(71.0f, -2));
                pc0Var2.f42446o0.setAlpha(0.0f);
                pc0Var2.f42446o0.setOnClickListener(new k51(28, mc0Var, oc0Var));
                TextView textView = new TextView(context);
                textView.setTextSize(1, 16.0f);
                textView.setMaxLines(1);
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView.setEllipsize(truncateAt);
                textView.setSingleLine(true);
                f7.V(textView, y6.G6, pc0Var2.getResourceProvider());
                textView.setTypeface(AndroidUtilities.bold());
                int i15 = 3;
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10);
                FrameLayout frameLayout4 = pc0Var2.f42446o0;
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                TextView k10 = d3.k(frameLayout4, textView, gb1.h(-2, -2.0f, i11 | 48, 18.0f, 10.0f, 18.0f, 0.0f), context);
                k10.setTextSize(1, 14.0f);
                k10.setMaxLines(1);
                k10.setEllipsize(truncateAt);
                k10.setSingleLine(true);
                f7.V(k10, y6.A6, pc0Var2.getResourceProvider());
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                k10.setGravity(i12);
                FrameLayout frameLayout5 = pc0Var2.f42446o0;
                if (LocaleController.isRTL) {
                    i15 = 5;
                }
                frameLayout5.addView(k10, gb1.h(-2, -2.0f, i15 | 48, 18.0f, 32.0f, 18.0f, 0.0f));
                textView.setText(oc0Var.f42152c.title);
                k10.setText(LocaleController.getString(R.string.TapToSendLocation));
                FrameLayout frameLayout6 = new FrameLayout(context);
                frameLayout6.setBackground(y6.K(AndroidUtilities.dp(36.0f), y4.a(oc0Var.f42150a)));
                frameLayout.addView(frameLayout6, gb1.h(36, 36.0f, 81, 0.0f, 0.0f, 0.0f, 4.0f));
                y9 y9Var = new y9(context);
                y9Var.g(a1.g.s(new StringBuilder("https://ss3.4sqi.net/img/categories_v2/"), oc0Var.f42152c.venue_type, "_64.png"), null, null);
                frameLayout6.addView(y9Var, gb1.i(30, 30, 17));
                ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                ofFloat.addUpdateListener(new lc0(mc0Var, frameLayout6));
                ofFloat.setDuration(360L);
                ofFloat.start();
                hashMap.put(iMarker, frameLayout);
                pc0Var2.I.animateCamera(ApplicationLoader.getMapsProvider().newCameraUpdateLatLng(iMarker.getPosition()), 300, null);
            }
        }
        return true;
    }
}
