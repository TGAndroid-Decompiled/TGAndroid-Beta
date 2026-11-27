package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Point;
import android.graphics.drawable.BitmapDrawable;
import android.net.Uri;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import org.telegram.ui.ActionBar.e;
public final class g88 extends e {
    public Bitmap a;
    public BitmapDrawable b;
    public zn5 c;
    public f88 d;
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
        this.actionBar.setTitle(ob6.M0(2131751663, null));
        this.actionBar.setActionBarMenuOnItemClick(new zl5(this, (byte) 20));
        this.actionBar.u().h(1, 2131231245, hl.L(56.0f), ob6.M0(2131751319, null));
        f88 f88Var = new f88(this, context);
        this.d = f88Var;
        this.fragmentView = f88Var;
        f88Var.H = getArguments().getBoolean("freeform", false);
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
            } else if (!bp1.t(string)) {
                return false;
            }
            if (hl.O1()) {
                max = hl.L(520.0f);
            } else {
                Point point = hl.q;
                max = Math.max(point.x, point.y);
            }
            float f = max;
            Bitmap G = in5.G(string, uri, f, f, true);
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
