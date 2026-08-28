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
    public final Context f6957a;
    public final f f6958b;
    public final Window f6959c;
    public CharSequence d;
    public AlertController$RecycleListView f6960e;
    public View f6961f;
    public Button h;
    public Button f6963i;
    public CharSequence f6964j;
    public Message f6965k;
    public Button f6966l;
    public NestedScrollView f6967m;
    public Drawable f6968n;
    public ImageView f6969o;
    public TextView f6970p;
    public TextView f6971q;
    public View f6972r;
    public ListAdapter f6973s;
    public final int f6975u;
    public final int v;
    public final int f6976w;
    public final int f6977x;
    public final boolean f6978y;
    public final v0 f6979z;
    public boolean f6962g = false;
    public int f6974t = -1;
    public final androidx.mediarouter.app.y A = new androidx.mediarouter.app.y(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f6957a = context;
        this.f6958b = fVar;
        this.f6959c = window;
        v0 v0Var = new v0(1);
        v0Var.f2240b = new WeakReference(fVar);
        this.f6979z = v0Var;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f5272e, 2130968614, 0);
        this.f6975u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f6976w = obtainStyledAttributes.getResourceId(7, 0);
        this.f6977x = obtainStyledAttributes.getResourceId(3, 0);
        this.f6978y = obtainStyledAttributes.getBoolean(6, true);
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
        int i9;
        int i10 = 4;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i9 = 0;
            } else {
                i9 = 4;
            }
            view2.setVisibility(i9);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i10 = 0;
            }
            view3.setVisibility(i10);
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
