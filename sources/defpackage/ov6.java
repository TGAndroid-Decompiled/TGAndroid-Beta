package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import java.util.HashMap;
public abstract class ov6 extends f89 {
    public jw6 v;
    public final ImageButton w;
    public final MediaRouteVolumeSlider x;
    public final wv6 y;

    public ov6(wv6 wv6Var, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        super(view);
        int color;
        int color2;
        this.y = wv6Var;
        this.w = imageButton;
        this.x = mediaRouteVolumeSlider;
        Context context = wv6Var.E;
        Drawable a = yqd.a(context, 2131231999);
        if (nte.h(context)) {
            a.setTint(context.getColor(2131099765));
        }
        imageButton.setImageDrawable(a);
        if (nte.h(context)) {
            color = context.getColor(2131099757);
            color2 = context.getColor(2131099755);
        } else {
            color = context.getColor(2131099756);
            color2 = context.getColor(2131099754);
        }
        mediaRouteVolumeSlider.a(color, color2);
    }

    public final void t(jw6 jw6Var) {
        boolean z;
        this.v = jw6Var;
        int i = jw6Var.p;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        ImageButton imageButton = this.w;
        imageButton.setActivated(z);
        imageButton.setOnClickListener(new h6(this, (byte) 10));
        jw6 jw6Var2 = this.v;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.x;
        mediaRouteVolumeSlider.setTag(jw6Var2);
        mediaRouteVolumeSlider.setMax(jw6Var.q);
        mediaRouteVolumeSlider.setProgress(i);
        mediaRouteVolumeSlider.setOnSeekBarChangeListener(this.y.L);
    }

    public final void u(boolean z) {
        ImageButton imageButton = this.w;
        if (imageButton.isActivated() == z) {
            return;
        }
        imageButton.setActivated(z);
        HashMap hashMap = this.y.O;
        if (z) {
            hashMap.put(this.v.c, Integer.valueOf(this.x.getProgress()));
        } else {
            hashMap.remove(this.v.c);
        }
    }
}
