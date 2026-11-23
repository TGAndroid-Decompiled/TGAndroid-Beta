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
    public final Context f12956a;
    public final f f12957b;
    public final Window f12958c;
    public CharSequence d;
    public AlertController$RecycleListView f12959e;
    public View f12960f;
    public Button h;
    public Button f12962i;
    public CharSequence f12963j;
    public Message f12964k;
    public Button f12965l;
    public NestedScrollView f12966m;
    public Drawable f12967n;
    public ImageView f12968o;
    public TextView f12969p;
    public TextView f12970q;
    public View f12971r;
    public ListAdapter f12972s;
    public final int f12974u;
    public final int v;
    public final int f12975w;
    public final int f12976x;
    public final boolean f12977y;
    public final c f12978z;
    public boolean f12961g = false;
    public int f12973t = -1;
    public final androidx.mediarouter.app.w A = new androidx.mediarouter.app.w(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f12956a = context;
        this.f12957b = fVar;
        this.f12958c = window;
        c cVar = new c(0);
        cVar.f12955b = new WeakReference(fVar);
        this.f12978z = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f10984e, 2130968614, 0);
        this.f12974u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f12975w = obtainStyledAttributes.getResourceId(7, 0);
        this.f12976x = obtainStyledAttributes.getResourceId(3, 0);
        this.f12977y = obtainStyledAttributes.getBoolean(6, true);
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
