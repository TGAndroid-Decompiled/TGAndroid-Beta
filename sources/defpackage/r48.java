package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.d;
public final class r48 extends d {
    public Bitmap a;
    public BitmapDrawable b;
    public wl5 c;
    public q48 d;
    public boolean e;
    public boolean f;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackgroundColor(-13421773);
        this.actionBar.G(-12763843, false);
        this.actionBar.setTitleColor(-1);
        this.actionBar.H(-1, false);
        this.actionBar.setBackButtonImage(2131231243);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(k96.M0(2131751686, null));
        this.actionBar.setActionBarMenuOnItemClick(new bq5(this, (byte) 18));
        this.actionBar.t().h(1, 2131231245, gl.L(56.0f), k96.M0(2131751342, null));
        q48 q48Var = new q48(this, context);
        this.d = q48Var;
        this.fragmentView = q48Var;
        q48Var.H = getArguments().getBoolean("freeform", false);
        this.fragmentView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        return this.fragmentView;
    }

    @Override
    public final boolean isSwipeBackEnabled(MotionEvent motionEvent) {
        return false;
    }

    @Override
    public final boolean onFragmentCreate() {
        int max;
        if (this.a == null) {
            String string = getArguments().getString("photoPath");
            Uri uri = (Uri) getArguments().getParcelable("photoUri");
            if (string == null) {
                if (uri == null) {
                    return false;
                }
            } else if (!oo1.t(string)) {
                return false;
            }
            if (gl.O1()) {
                max = gl.L(520.0f);
            } else {
                Point point = gl.q;
                max = Math.max(point.x, point.y);
            }
            float f = max;
            Bitmap G = fl5.G(string, uri, f, f, true);
            this.a = G;
            if (G == null) {
                return false;
            }
        }
        this.b = new BitmapDrawable(this.a);
        super.onFragmentCreate();
        return true;
    }

    @Override
    public final void onFragmentDestroy() {
        super.onFragmentDestroy();
        Bitmap bitmap = this.a;
        if (bitmap != null && !this.e) {
            bitmap.recycle();
            this.a = null;
        }
        this.b = null;
    }
}
