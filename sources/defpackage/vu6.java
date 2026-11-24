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
public final class vu6 extends ArrayAdapter {
    public final float a;
    public final wu6 b;

    public vu6(wu6 wu6Var, Context context, ArrayList arrayList) {
        super(context, 0, arrayList);
        this.b = wu6Var;
        this.a = yqe.c(context);
    }

    @Override
    public final View getView(int i, View view, ViewGroup viewGroup) {
        int i2;
        int i3 = 0;
        wu6 wu6Var = this.b;
        if (view == null) {
            view = LayoutInflater.from(viewGroup.getContext()).inflate(2131492931, viewGroup, false);
        } else {
            wu6.o(wu6Var.f0, (LinearLayout) view.findViewById(2131296736));
            View findViewById = view.findViewById(2131296577);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            int i4 = wu6Var.e0;
            layoutParams.width = i4;
            layoutParams.height = i4;
            findViewById.setLayoutParams(layoutParams);
        }
        ew6 ew6Var = (ew6) getItem(i);
        if (ew6Var != null) {
            boolean z = ew6Var.g;
            TextView textView = (TextView) view.findViewById(2131296566);
            textView.setEnabled(z);
            textView.setText(ew6Var.d);
            MediaRouteVolumeSlider mediaRouteVolumeSlider = (MediaRouteVolumeSlider) view.findViewById(2131296578);
            Context context = viewGroup.getContext();
            OverlayListView overlayListView = wu6Var.V;
            int b = yqe.b(context);
            int i5 = 255;
            if (Color.alpha(b) != 255) {
                b = on2.l(b, ((Integer) overlayListView.getTag()).intValue());
            }
            mediaRouteVolumeSlider.a(b, b);
            mediaRouteVolumeSlider.setTag(ew6Var);
            wu6Var.i0.put(ew6Var, mediaRouteVolumeSlider);
            mediaRouteVolumeSlider.b(!z);
            mediaRouteVolumeSlider.setEnabled(z);
            if (z) {
                if (wu6Var.P) {
                    if (ew6Var.e() && !gw6.g()) {
                        i2 = 0;
                    } else {
                        i2 = ew6Var.o;
                    }
                    if (i2 == 1) {
                        mediaRouteVolumeSlider.setMax(ew6Var.q);
                        mediaRouteVolumeSlider.setProgress(ew6Var.p);
                        mediaRouteVolumeSlider.setOnSeekBarChangeListener(wu6Var.c0);
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
            if (wu6Var.a0.contains(ew6Var)) {
                i3 = 4;
            }
            linearLayout.setVisibility(i3);
            HashSet hashSet = wu6Var.Y;
            if (hashSet != null && hashSet.contains(ew6Var)) {
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
