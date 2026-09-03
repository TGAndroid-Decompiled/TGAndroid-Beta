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
import c2.v0;
import java.lang.ref.WeakReference;
public final class e {
    public final Context f6244a;
    public final f f6245b;
    public final Window f6246c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public View f6247f;
    public Button h;
    public Button f6249i;
    public CharSequence f6250j;
    public Message f6251k;
    public Button f6252l;
    public NestedScrollView f6253m;
    public Drawable f6254n;
    public ImageView f6255o;
    public TextView f6256p;
    public TextView f6257q;
    public View f6258r;
    public ListAdapter f6259s;
    public final int f6261u;
    public final int v;
    public final int f6262w;
    public final int f6263x;
    public final boolean f6264y;
    public final v0 f6265z;
    public boolean f6248g = false;
    public int f6260t = -1;
    public final androidx.mediarouter.app.y A = new androidx.mediarouter.app.y(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f6244a = context;
        this.f6245b = fVar;
        this.f6246c = window;
        v0 v0Var = new v0(1);
        v0Var.f2040b = new WeakReference(fVar);
        this.f6265z = v0Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.e, 2130968614, 0);
        this.f6261u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f6262w = obtainStyledAttributes.getResourceId(7, 0);
        this.f6263x = obtainStyledAttributes.getResourceId(3, 0);
        this.f6264y = obtainStyledAttributes.getBoolean(6, true);
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
