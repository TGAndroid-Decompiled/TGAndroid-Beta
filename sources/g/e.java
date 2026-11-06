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
    public final Context f13298a;
    public final f f13299b;
    public final Window f13300c;
    public CharSequence d;
    public AlertController$RecycleListView f13301e;
    public View f13302f;
    public Button h;
    public Button f13304i;
    public CharSequence f13305j;
    public Message f13306k;
    public Button f13307l;
    public NestedScrollView f13308m;
    public Drawable f13309n;
    public ImageView f13310o;
    public TextView f13311p;
    public TextView f13312q;
    public View f13313r;
    public ListAdapter f13314s;
    public final int f13316u;
    public final int v;
    public final int f13317w;
    public final int f13318x;
    public final boolean f13319y;
    public final c f13320z;
    public boolean f13303g = false;
    public int f13315t = -1;
    public final androidx.mediarouter.app.w A = new androidx.mediarouter.app.w(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f13298a = context;
        this.f13299b = fVar;
        this.f13300c = window;
        c cVar = new c(0);
        cVar.f13297b = new WeakReference(fVar);
        this.f13320z = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f10858e, 2130968614, 0);
        this.f13316u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f13317w = obtainStyledAttributes.getResourceId(7, 0);
        this.f13318x = obtainStyledAttributes.getResourceId(3, 0);
        this.f13319y = obtainStyledAttributes.getBoolean(6, true);
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
