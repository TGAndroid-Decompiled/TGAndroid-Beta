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
    public final Context f7170a;
    public final f f7171b;
    public final Window f7172c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public View f7173f;
    public Button h;
    public Button f7175i;
    public CharSequence f7176j;
    public Message f7177k;
    public Button f7178l;
    public NestedScrollView f7179m;
    public Drawable f7180n;
    public ImageView f7181o;
    public TextView f7182p;
    public TextView f7183q;
    public View f7184r;
    public ListAdapter f7185s;
    public final int f7187u;
    public final int v;
    public final int f7188w;
    public final int f7189x;
    public final boolean f7190y;
    public final c f7191z;
    public boolean f7174g = false;
    public int f7186t = -1;
    public final androidx.mediarouter.app.w A = new androidx.mediarouter.app.w(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f7170a = context;
        this.f7171b = fVar;
        this.f7172c = window;
        c cVar = new c(0);
        cVar.f7169b = new WeakReference(fVar);
        this.f7191z = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.e, 2130968614, 0);
        this.f7187u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f7188w = obtainStyledAttributes.getResourceId(7, 0);
        this.f7189x = obtainStyledAttributes.getResourceId(3, 0);
        this.f7190y = obtainStyledAttributes.getBoolean(6, true);
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
