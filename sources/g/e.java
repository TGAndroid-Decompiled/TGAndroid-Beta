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
    public final Context f11682a;
    public final f f11683b;
    public final Window f11684c;
    public CharSequence d;
    public AlertController$RecycleListView f11685e;
    public View f11686f;
    public Button h;
    public Button f11688i;
    public CharSequence f11689j;
    public Message f11690k;
    public Button f11691l;
    public NestedScrollView f11692m;
    public Drawable f11693n;
    public ImageView f11694o;
    public TextView f11695p;
    public TextView f11696q;
    public View f11697r;
    public ListAdapter f11698s;
    public final int f11700u;
    public final int v;
    public final int f11701w;
    public final int f11702x;
    public final boolean f11703y;
    public final c f11704z;
    public boolean f11687g = false;
    public int f11699t = -1;
    public final androidx.mediarouter.app.w A = new androidx.mediarouter.app.w(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f11682a = context;
        this.f11683b = fVar;
        this.f11684c = window;
        c cVar = new c(0);
        cVar.f11681b = new WeakReference(fVar);
        this.f11704z = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f11310e, 2130968614, 0);
        this.f11700u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f11701w = obtainStyledAttributes.getResourceId(7, 0);
        this.f11702x = obtainStyledAttributes.getResourceId(3, 0);
        this.f11703y = obtainStyledAttributes.getBoolean(6, true);
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
