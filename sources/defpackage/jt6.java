package defpackage;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import androidx.mediarouter.app.MediaRouteVolumeSlider;
import java.util.HashMap;
public abstract class jt6 extends s49 {
    public eu6 v;
    public final ImageButton w;
    public final MediaRouteVolumeSlider x;
    public final rt6 y;

    public jt6(rt6 rt6Var, View view, ImageButton imageButton, MediaRouteVolumeSlider mediaRouteVolumeSlider) {
        super(view);
        int color;
        int color2;
        this.y = rt6Var;
        this.w = imageButton;
        this.x = mediaRouteVolumeSlider;
        Context context = rt6Var.E;
        Drawable a = hmd.a(context, 2131231999);
        if (voe.h(context)) {
            a.setTint(context.getColor(2131099765));
        }
        imageButton.setImageDrawable(a);
        if (voe.h(context)) {
            color = context.getColor(2131099757);
            color2 = context.getColor(2131099755);
        } else {
            color = context.getColor(2131099756);
            color2 = context.getColor(2131099754);
        }
        mediaRouteVolumeSlider.a(color, color2);
    }

    public final void t(eu6 eu6Var) {
        boolean z;
        this.v = eu6Var;
        int i = eu6Var.p;
        if (i == 0) {
            z = true;
        } else {
            z = false;
        }
        ImageButton imageButton = this.w;
        imageButton.setActivated(z);
        imageButton.setOnClickListener(new g6(this, (byte) 10));
        eu6 eu6Var2 = this.v;
        MediaRouteVolumeSlider mediaRouteVolumeSlider = this.x;
        mediaRouteVolumeSlider.setTag(eu6Var2);
        mediaRouteVolumeSlider.setMax(eu6Var.q);
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
