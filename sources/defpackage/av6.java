package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.AlphaAnimation;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import androidx.mediarouter.app.OverlayListView;
import java.util.ArrayList;
import java.util.HashSet;
public final class av6 extends ArrayAdapter {
    public final float a;
    public final bv6 b;

    public av6(bv6 bv6Var, Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.b = bv6Var;
        this.a = nte.c(context);
    }

    @Override
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        int i3 = 0;
        bv6 bv6Var = this.b;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(2131492931, viewGroup, false);
        } else {
            bv6.o(bv6Var.f0, (LinearLayout) view.findViewById(2131296736));
            View findViewById = view.findViewById(2131296577);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            int i4 = bv6Var.e0;
            layoutParams.width = i4;
            layoutParams.height = i4;
            findViewById.setLayoutParams(layoutParams);
        }
        jw6 jw6Var = (jw6) getItem(i);
        if (jw6Var != null) {
            boolean z = jw6Var.g;
            TextView textView = (TextView) view.findViewById(2131296566);
            textView.setEnabled(z);
            textView.setText(jw6Var.d);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(2131296578);
            Context context = viewGroup.getContext();
            OverlayListView overlayListView = bv6Var.V;
            int b = nte.b(context);
            int i5 = 255;
            if (Color.alpha(b) != 255) {
                b = vm2.k(b, ((Integer) overlayListView.getTag()).intValue());
            }
            mediaRouteVolumeSlider.a(b, b);
            mediaRouteVolumeSlider.setTag(jw6Var);
            bv6Var.i0.put(jw6Var, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.b(!z);
            mediaRouteVolumeSlider.setEnabled(z);
            if (z) {
                if (bv6Var.P) {
                    if (jw6Var.e() && !lw6.g()) {
                        i2 = 0;
                    } else {
                        i2 = jw6Var.o;
                    }
                    if (i2 == 1) {
                        mediaRouteVolumeSlider.setMax(jw6Var.q);
                        mediaRouteVolumeSlider.setProgress(jw6Var.p);
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(bv6Var.c0);
                    }
                }
                mediaRouteVolumeSlider.setMax(100);
                mediaRouteVolumeSlider.setProgress(100);
                mediaRouteVolumeSlider.setEnabled(false);
            }
            ImageView imageView = (ImageView) view.findViewById(2131296577);
            if (!z) {
                i5 = (int) (this.a * 255.0f);
            }
            imageView.setAlpha(i5);
            LinearLayout linearLayout = (LinearLayout) view.findViewById(2131296736);
            if (bv6Var.a0.contains(jw6Var)) {
                i3 = 4;
            }
            linearLayout.setVisibility(i3);
            HashSet hashSet = bv6Var.Y;
            if (hashSet != null && hashSet.contains(jw6Var)) {
                AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 0.0f);
                alphaAnimation.setDuration(0L);
                alphaAnimation.setFillEnabled(true);
                alphaAnimation.setFillAfter(true);
                view.clearAnimation();
                view.startAnimation(alphaAnimation);
            }
        }
        return view;
    }

    @Override
    public final boolean isEnabled(int i) {
        return false;
    }
}
