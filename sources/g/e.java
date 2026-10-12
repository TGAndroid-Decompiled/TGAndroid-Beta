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
    public final Context f9742a;
    public final f f9743b;
    public final Window f9744c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public View f9745f;
    public Button h;
    public Button f9747i;
    public CharSequence f9748j;
    public Message f9749k;
    public Button f9750l;
    public NestedScrollView f9751m;
    public Drawable f9752n;
    public ImageView f9753o;
    public TextView f9754p;
    public TextView f9755q;
    public View f9756r;
    public ListAdapter f9757s;
    public final int f9759u;
    public final int v;
    public final int f9760w;
    public final int f9761x;
    public final boolean f9762y;
    public final c f9763z;
    public boolean f9746g = false;
    public int f9758t = -1;
    public final androidx.mediarouter.app.w A = new androidx.mediarouter.app.w(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f9742a = context;
        this.f9743b = fVar;
        this.f9744c = window;
        c cVar = new c(0);
        cVar.f9741b = new WeakReference(fVar);
        this.f9763z = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.e, 2130968614, 0);
        this.f9759u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f9760w = obtainStyledAttributes.getResourceId(7, 0);
        this.f9761x = obtainStyledAttributes.getResourceId(3, 0);
        this.f9762y = obtainStyledAttributes.getBoolean(6, true);
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
