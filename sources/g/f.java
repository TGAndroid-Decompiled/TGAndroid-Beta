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
    public final Context f10176a;
    public final g f10177b;
    public final Window f10178c;
    public CharSequence d;
    public AlertController$RecycleListView f10179e;
    public View f10180f;
    public Button h;
    public Button f10182i;
    public CharSequence f10183j;
    public Message f10184k;
    public Button f10185l;
    public NestedScrollView f10186m;
    public Drawable f10187n;
    public ImageView f10188o;
    public TextView f10189p;
    public TextView f10190q;
    public View f10191r;
    public ListAdapter f10192s;
    public final int f10194u;
    public final int v;
    public final int f10195w;
    public final int f10196x;
    public final boolean f10197y;
    public final d f10198z;
    public boolean f10181g = false;
    public int f10193t = -1;
    public final androidx.mediarouter.app.x A = new androidx.mediarouter.app.x(this, 5);

    public f(Context context, g gVar, Window window) {
        this.f10176a = context;
        this.f10177b = gVar;
        this.f10178c = window;
        d dVar = new d(0);
        dVar.f10175b = new WeakReference(gVar);
        this.f10198z = dVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f9140e, 2130968614, 0);
        this.f10194u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f10195w = obtainStyledAttributes.getResourceId(7, 0);
        this.f10196x = obtainStyledAttributes.getResourceId(3, 0);
        this.f10197y = obtainStyledAttributes.getBoolean(6, true);
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
