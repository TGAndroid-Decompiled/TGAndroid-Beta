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
    public final Context f12994a;
    public final f f12995b;
    public final Window f12996c;
    public CharSequence d;
    public AlertController$RecycleListView f12997e;
    public View f12998f;
    public Button h;
    public Button f13000i;
    public CharSequence f13001j;
    public Message f13002k;
    public Button f13003l;
    public NestedScrollView f13004m;
    public Drawable f13005n;
    public ImageView f13006o;
    public TextView f13007p;
    public TextView f13008q;
    public View f13009r;
    public ListAdapter f13010s;
    public final int f13012u;
    public final int v;
    public final int f13013w;
    public final int f13014x;
    public final boolean f13015y;
    public final c f13016z;
    public boolean f12999g = false;
    public int f13011t = -1;
    public final androidx.mediarouter.app.w A = new androidx.mediarouter.app.w(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f12994a = context;
        this.f12995b = fVar;
        this.f12996c = window;
        c cVar = new c(0);
        cVar.f12993b = new WeakReference(fVar);
        this.f13016z = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f11023e, 2130968614, 0);
        this.f13012u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f13013w = obtainStyledAttributes.getResourceId(7, 0);
        this.f13014x = obtainStyledAttributes.getResourceId(3, 0);
        this.f13015y = obtainStyledAttributes.getBoolean(6, true);
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
