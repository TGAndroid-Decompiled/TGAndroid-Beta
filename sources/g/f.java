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
    public final Context f9234a;
    public final g f9235b;
    public final Window f9236c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public View f9237f;
    public Button h;
    public Button f9239i;
    public CharSequence f9240j;
    public Message f9241k;
    public Button f9242l;
    public NestedScrollView f9243m;
    public Drawable f9244n;
    public ImageView f9245o;
    public TextView f9246p;
    public TextView f9247q;
    public View f9248r;
    public ListAdapter f9249s;
    public final int f9251u;
    public final int v;
    public final int f9252w;
    public final int f9253x;
    public final boolean f9254y;
    public final d f9255z;
    public boolean f9238g = false;
    public int f9250t = -1;
    public final androidx.mediarouter.app.x A = new androidx.mediarouter.app.x(this, 5);

    public f(Context context, g gVar, Window window) {
        this.f9234a = context;
        this.f9235b = gVar;
        this.f9236c = window;
        d dVar = new d(0);
        dVar.f9233b = new WeakReference(gVar);
        this.f9255z = dVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.e, 2130968614, 0);
        this.f9251u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f9252w = obtainStyledAttributes.getResourceId(7, 0);
        this.f9253x = obtainStyledAttributes.getResourceId(3, 0);
        this.f9254y = obtainStyledAttributes.getBoolean(6, true);
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
