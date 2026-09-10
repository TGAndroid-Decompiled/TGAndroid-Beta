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
public final class f {
    public final Context f8368a;
    public final g f8369b;
    public final Window f8370c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public View f8371f;
    public Button h;
    public Button f8373i;
    public CharSequence f8374j;
    public Message f8375k;
    public Button f8376l;
    public NestedScrollView f8377m;
    public Drawable f8378n;
    public ImageView f8379o;
    public TextView f8380p;
    public TextView f8381q;
    public View f8382r;
    public ListAdapter f8383s;
    public final int f8385u;
    public final int v;
    public final int f8386w;
    public final int f8387x;
    public final boolean f8388y;
    public final d f8389z;
    public boolean f8372g = false;
    public int f8384t = -1;
    public final androidx.mediarouter.app.x A = new androidx.mediarouter.app.x(this, 5);

    public f(Context context, g gVar, Window window) {
        this.f8368a = context;
        this.f8369b = gVar;
        this.f8370c = window;
        d dVar = new d(0);
        dVar.f8367b = new WeakReference(gVar);
        this.f8389z = dVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.e, 2130968614, 0);
        this.f8385u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f8386w = obtainStyledAttributes.getResourceId(7, 0);
        this.f8387x = obtainStyledAttributes.getResourceId(3, 0);
        this.f8388y = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        gVar.c().c(1);
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

    public static void b(View view, View view2, View view3) {
        int i10;
        int i11 = 4;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            view2.setVisibility(i10);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i11 = 0;
            }
            view3.setVisibility(i11);
        }
    }

    public static ViewGroup c(View view, View view2) {
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
