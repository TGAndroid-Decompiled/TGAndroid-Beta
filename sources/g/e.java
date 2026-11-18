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
    public final Context f12962a;
    public final f f12963b;
    public final Window f12964c;
    public CharSequence d;
    public AlertController$RecycleListView f12965e;
    public View f12966f;
    public Button h;
    public Button f12968i;
    public CharSequence f12969j;
    public Message f12970k;
    public Button f12971l;
    public NestedScrollView f12972m;
    public Drawable f12973n;
    public ImageView f12974o;
    public TextView f12975p;
    public TextView f12976q;
    public View f12977r;
    public ListAdapter f12978s;
    public final int f12980u;
    public final int v;
    public final int f12981w;
    public final int f12982x;
    public final boolean f12983y;
    public final c f12984z;
    public boolean f12967g = false;
    public int f12979t = -1;
    public final androidx.mediarouter.app.w A = new androidx.mediarouter.app.w(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f12962a = context;
        this.f12963b = fVar;
        this.f12964c = window;
        c cVar = new c(0);
        cVar.f12961b = new WeakReference(fVar);
        this.f12984z = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f10991e, 2130968614, 0);
        this.f12980u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f12981w = obtainStyledAttributes.getResourceId(7, 0);
        this.f12982x = obtainStyledAttributes.getResourceId(3, 0);
        this.f12983y = obtainStyledAttributes.getBoolean(6, true);
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
