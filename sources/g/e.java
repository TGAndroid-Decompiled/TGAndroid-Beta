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
    public final Context f10110a;
    public final f f10111b;
    public final Window f10112c;
    public CharSequence d;
    public AlertController$RecycleListView f10113e;
    public View f10114f;
    public Button h;
    public Button f10116i;
    public CharSequence f10117j;
    public Message f10118k;
    public Button f10119l;
    public NestedScrollView f10120m;
    public Drawable f10121n;
    public ImageView f10122o;
    public TextView f10123p;
    public TextView f10124q;
    public View f10125r;
    public ListAdapter f10126s;
    public final int f10128u;
    public final int v;
    public final int f10129w;
    public final int f10130x;
    public final boolean f10131y;
    public final c f10132z;
    public boolean f10115g = false;
    public int f10127t = -1;
    public final androidx.mediarouter.app.x A = new androidx.mediarouter.app.x(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f10110a = context;
        this.f10111b = fVar;
        this.f10112c = window;
        c cVar = new c(0);
        cVar.f10109b = new WeakReference(fVar);
        this.f10132z = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f9529e, 2130968614, 0);
        this.f10128u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f10129w = obtainStyledAttributes.getResourceId(7, 0);
        this.f10130x = obtainStyledAttributes.getResourceId(3, 0);
        this.f10131y = obtainStyledAttributes.getBoolean(6, true);
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
