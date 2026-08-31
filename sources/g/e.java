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
import c2.u0;
import java.lang.ref.WeakReference;
public final class e {
    public final Context f6710a;
    public final f f6711b;
    public final Window f6712c;
    public CharSequence d;
    public AlertController$RecycleListView f6713e;
    public View f6714f;
    public Button h;
    public Button f6716i;
    public CharSequence f6717j;
    public Message f6718k;
    public Button f6719l;
    public NestedScrollView f6720m;
    public Drawable f6721n;
    public ImageView f6722o;
    public TextView f6723p;
    public TextView f6724q;
    public View f6725r;
    public ListAdapter f6726s;
    public final int f6728u;
    public final int v;
    public final int f6729w;
    public final int f6730x;
    public final boolean f6731y;
    public final u0 f6732z;
    public boolean f6715g = false;
    public int f6727t = -1;
    public final androidx.mediarouter.app.y A = new androidx.mediarouter.app.y(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f6710a = context;
        this.f6711b = fVar;
        this.f6712c = window;
        u0 u0Var = new u0(1);
        u0Var.f2182b = new WeakReference(fVar);
        this.f6732z = u0Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f5691e, 2130968614, 0);
        this.f6728u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f6729w = obtainStyledAttributes.getResourceId(7, 0);
        this.f6730x = obtainStyledAttributes.getResourceId(3, 0);
        this.f6731y = obtainStyledAttributes.getBoolean(6, true);
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
