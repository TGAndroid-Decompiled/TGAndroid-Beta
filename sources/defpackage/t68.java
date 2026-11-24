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
public final class t68 extends d {
    public Bitmap a;
    public BitmapDrawable b;
    public wn5 c;
    public s68 d;
    public boolean e;
    public boolean f;

    @Override
    public final View createView(Context context) {
        this.actionBar.setBackgroundColor(-13421773);
        this.actionBar.G(-12763843, false);
        this.actionBar.setTitleColor(-1);
        this.actionBar.H(-1, false);
        this.actionBar.setBackButtonImage(2131231244);
        this.actionBar.setAllowOverlayTitle(true);
        this.actionBar.setTitle(jb6.M0(2131751635, null));
        this.actionBar.setActionBarMenuOnItemClick(new wl5(this, (byte) 19));
        this.actionBar.t().h(1, 2131231246, gm.L(56.0f), jb6.M0(2131751291, null));
        s68 s68Var = new s68(this, context);
        this.d = s68Var;
        this.fragmentView = s68Var;
        s68Var.H = getArguments().getBoolean("freeform", false);
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
            } else if (!aq1.t(string)) {
                return false;
            }
            if (gm.O1()) {
                max = gm.L(520.0f);
            } else {
                Point point = gm.q;
                max = Math.max(point.x, point.y);
            }
            float f = max;
            Bitmap G = fn5.G(string, uri, f, f, true);
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
