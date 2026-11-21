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
    public final Context f12991a;
    public final f f12992b;
    public final Window f12993c;
    public CharSequence d;
    public AlertController$RecycleListView f12994e;
    public View f12995f;
    public Button h;
    public Button f12997i;
    public CharSequence f12998j;
    public Message f12999k;
    public Button f13000l;
    public NestedScrollView f13001m;
    public Drawable f13002n;
    public ImageView f13003o;
    public TextView f13004p;
    public TextView f13005q;
    public View f13006r;
    public ListAdapter f13007s;
    public final int f13009u;
    public final int v;
    public final int f13010w;
    public final int f13011x;
    public final boolean f13012y;
    public final c f13013z;
    public boolean f12996g = false;
    public int f13008t = -1;
    public final androidx.mediarouter.app.w A = new androidx.mediarouter.app.w(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f12991a = context;
        this.f12992b = fVar;
        this.f12993c = window;
        c cVar = new c(0);
        cVar.f12990b = new WeakReference(fVar);
        this.f13013z = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f11020e, 2130968614, 0);
        this.f13009u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f13010w = obtainStyledAttributes.getResourceId(7, 0);
        this.f13011x = obtainStyledAttributes.getResourceId(3, 0);
        this.f13012y = obtainStyledAttributes.getBoolean(6, true);
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
