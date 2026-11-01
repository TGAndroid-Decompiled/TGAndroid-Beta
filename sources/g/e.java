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
    public final Context f7171a;
    public final f f7172b;
    public final Window f7173c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public View f7174f;
    public Button h;
    public Button f7176i;
    public CharSequence f7177j;
    public Message f7178k;
    public Button f7179l;
    public NestedScrollView f7180m;
    public Drawable f7181n;
    public ImageView f7182o;
    public TextView f7183p;
    public TextView f7184q;
    public View f7185r;
    public ListAdapter f7186s;
    public final int f7188u;
    public final int v;
    public final int f7189w;
    public final int f7190x;
    public final boolean f7191y;
    public final c f7192z;
    public boolean f7175g = false;
    public int f7187t = -1;
    public final androidx.mediarouter.app.w A = new androidx.mediarouter.app.w(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f7171a = context;
        this.f7172b = fVar;
        this.f7173c = window;
        c cVar = new c(0);
        cVar.f7170b = new WeakReference(fVar);
        this.f7192z = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.e, 2130968614, 0);
        this.f7188u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f7189w = obtainStyledAttributes.getResourceId(7, 0);
        this.f7190x = obtainStyledAttributes.getResourceId(3, 0);
        this.f7191y = obtainStyledAttributes.getBoolean(6, true);
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
