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
    public final Context f9227a;
    public final g f9228b;
    public final Window f9229c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public View f9230f;
    public Button h;
    public Button f9232i;
    public CharSequence f9233j;
    public Message f9234k;
    public Button f9235l;
    public NestedScrollView f9236m;
    public Drawable f9237n;
    public ImageView f9238o;
    public TextView f9239p;
    public TextView f9240q;
    public View f9241r;
    public ListAdapter f9242s;
    public final int f9244u;
    public final int v;
    public final int f9245w;
    public final int f9246x;
    public final boolean f9247y;
    public final d f9248z;
    public boolean f9231g = false;
    public int f9243t = -1;
    public final androidx.mediarouter.app.x A = new androidx.mediarouter.app.x(this, 5);

    public f(Context context, g gVar, Window window) {
        this.f9227a = context;
        this.f9228b = gVar;
        this.f9229c = window;
        d dVar = new d(0);
        dVar.f9226b = new WeakReference(gVar);
        this.f9248z = dVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.e, 2130968614, 0);
        this.f9244u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f9245w = obtainStyledAttributes.getResourceId(7, 0);
        this.f9246x = obtainStyledAttributes.getResourceId(3, 0);
        this.f9247y = obtainStyledAttributes.getBoolean(6, true);
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
