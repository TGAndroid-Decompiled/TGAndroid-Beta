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
    public final Context f10108a;
    public final f f10109b;
    public final Window f10110c;
    public CharSequence d;
    public AlertController$RecycleListView f10111e;
    public View f10112f;
    public Button h;
    public Button f10114i;
    public CharSequence f10115j;
    public Message f10116k;
    public Button f10117l;
    public NestedScrollView f10118m;
    public Drawable f10119n;
    public ImageView f10120o;
    public TextView f10121p;
    public TextView f10122q;
    public View f10123r;
    public ListAdapter f10124s;
    public final int f10126u;
    public final int v;
    public final int f10127w;
    public final int f10128x;
    public final boolean f10129y;
    public final c f10130z;
    public boolean f10113g = false;
    public int f10125t = -1;
    public final androidx.mediarouter.app.x A = new androidx.mediarouter.app.x(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f10108a = context;
        this.f10109b = fVar;
        this.f10110c = window;
        c cVar = new c(0);
        cVar.f10107b = new WeakReference(fVar);
        this.f10130z = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f9526e, 2130968614, 0);
        this.f10126u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f10127w = obtainStyledAttributes.getResourceId(7, 0);
        this.f10128x = obtainStyledAttributes.getResourceId(3, 0);
        this.f10129y = obtainStyledAttributes.getBoolean(6, true);
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
