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
    public final Context f12965a;
    public final f f12966b;
    public final Window f12967c;
    public CharSequence d;
    public AlertController$RecycleListView f12968e;
    public View f12969f;
    public Button h;
    public Button f12971i;
    public CharSequence f12972j;
    public Message f12973k;
    public Button f12974l;
    public NestedScrollView f12975m;
    public Drawable f12976n;
    public ImageView f12977o;
    public TextView f12978p;
    public TextView f12979q;
    public View f12980r;
    public ListAdapter f12981s;
    public final int f12983u;
    public final int v;
    public final int f12984w;
    public final int f12985x;
    public final boolean f12986y;
    public final c f12987z;
    public boolean f12970g = false;
    public int f12982t = -1;
    public final androidx.mediarouter.app.w A = new androidx.mediarouter.app.w(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f12965a = context;
        this.f12966b = fVar;
        this.f12967c = window;
        c cVar = new c(0);
        cVar.f12964b = new WeakReference(fVar);
        this.f12987z = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f10994e, 2130968614, 0);
        this.f12983u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f12984w = obtainStyledAttributes.getResourceId(7, 0);
        this.f12985x = obtainStyledAttributes.getResourceId(3, 0);
        this.f12986y = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        fVar.c().d(1);
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
