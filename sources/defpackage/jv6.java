package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import java.util.HashMap;
public abstract class jv6 extends u69 {
    public ew6 v;
    public final ImageButton w;
    public final MediaRouteVolumeSlider x;
    public final rv6 y;

    public jv6(rv6 rv6Var, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        super(view);
        int color;
        int color2;
        this.y = rv6Var;
        this.w = imageButton;
        this.x = mediaRouteVolumeSlider;
        Context context = rv6Var.E;
        Drawable a = kod.a(context, 2131232000);
        if (yqe.h(context)) {
            a.setTint(context.getColor(2131099765));
        }
        imageButton.setImageDrawable(a);
        if (yqe.h(context)) {
            color = context.getColor(2131099757);
            color2 = context.getColor(2131099755);
        } else {
            color = context.getColor(2131099756);
            color2 = context.getColor(2131099754);
        }
        mediaRouteVolumeSlider.a(color, color2);
    }

    public final void t(ew6 ew6Var) {
        boolean z;
        this.v = ew6Var;
        int i = ew6Var.p;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        ImageButton imageButton = this.w;
        imageButton.setActivated(z);
        imageButton.setOnClickListener(new g6(this, (byte) 10));
        ew6 ew6Var2 = this.v;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.x;
        mediaRouteVolumeSlider.setTag(ew6Var2);
        mediaRouteVolumeSlider.setMax(ew6Var.q);
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
