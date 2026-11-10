package g;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Message;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
public final class e {
    public final Context f13300a;
    public final f f13301b;
    public final Window f13302c;
    public CharSequence d;
    public AlertController$RecycleListView f13303e;
    public View f13304f;
    public Button h;
    public Button f13306i;
    public CharSequence f13307j;
    public Message f13308k;
    public Button f13309l;
    public NestedScrollView f13310m;
    public Drawable f13311n;
    public ImageView f13312o;
    public TextView f13313p;
    public TextView f13314q;
    public View f13315r;
    public ListAdapter f13316s;
    public final int f13318u;
    public final int v;
    public final int f13319w;
    public final int f13320x;
    public final boolean f13321y;
    public final c f13322z;
    public boolean f13305g = false;
    public int f13317t = -1;
    public final androidx.mediarouter.app.w A = new androidx.mediarouter.app.w(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f13300a = context;
        this.f13301b = fVar;
        this.f13302c = window;
        c cVar = new c(0);
        cVar.f13299b = new WeakReference(fVar);
        this.f13322z = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f10863e, 2130968614, 0);
        this.f13318u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f13319w = obtainStyledAttributes.getResourceId(7, 0);
        this.f13320x = obtainStyledAttributes.getResourceId(3, 0);
        this.f13321y = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        fVar.c().c(1);
    }

    public static boolean a(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (a(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static ViewGroup b(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}
