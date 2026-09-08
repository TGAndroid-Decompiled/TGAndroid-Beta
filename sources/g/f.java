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
    public final Context f10204a;
    public final g f10205b;
    public final Window f10206c;
    public CharSequence d;
    public AlertController$RecycleListView f10207e;
    public View f10208f;
    public Button h;
    public Button f10210i;
    public CharSequence f10211j;
    public Message f10212k;
    public Button f10213l;
    public NestedScrollView f10214m;
    public Drawable f10215n;
    public ImageView f10216o;
    public TextView f10217p;
    public TextView f10218q;
    public View f10219r;
    public ListAdapter f10220s;
    public final int f10222u;
    public final int v;
    public final int f10223w;
    public final int f10224x;
    public final boolean f10225y;
    public final d f10226z;
    public boolean f10209g = false;
    public int f10221t = -1;
    public final androidx.mediarouter.app.x A = new androidx.mediarouter.app.x(this, 5);

    public f(Context context, g gVar, Window window) {
        this.f10204a = context;
        this.f10205b = gVar;
        this.f10206c = window;
        d dVar = new d(0);
        dVar.f10203b = new WeakReference(gVar);
        this.f10226z = dVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f9168e, 2130968614, 0);
        this.f10222u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f10223w = obtainStyledAttributes.getResourceId(7, 0);
        this.f10224x = obtainStyledAttributes.getResourceId(3, 0);
        this.f10225y = obtainStyledAttributes.getBoolean(6, true);
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
