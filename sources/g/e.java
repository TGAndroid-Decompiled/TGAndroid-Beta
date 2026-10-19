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
    public final Context f10652a;
    public final f f10653b;
    public final Window f10654c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public View f10655f;
    public Button h;
    public Button f10657i;
    public CharSequence f10658j;
    public Message f10659k;
    public Button f10660l;
    public NestedScrollView f10661m;
    public Drawable f10662n;
    public ImageView f10663o;
    public TextView f10664p;
    public TextView f10665q;
    public View f10666r;
    public ListAdapter f10667s;
    public final int f10669u;
    public final int v;
    public final int f10670w;
    public final int f10671x;
    public final boolean f10672y;
    public final c f10673z;
    public boolean f10656g = false;
    public int f10668t = -1;
    public final androidx.mediarouter.app.w A = new androidx.mediarouter.app.w(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f10652a = context;
        this.f10653b = fVar;
        this.f10654c = window;
        c cVar = new c(0);
        cVar.f10651b = new WeakReference(fVar);
        this.f10673z = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.e, 2130968614, 0);
        this.f10669u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f10670w = obtainStyledAttributes.getResourceId(7, 0);
        this.f10671x = obtainStyledAttributes.getResourceId(3, 0);
        this.f10672y = obtainStyledAttributes.getBoolean(6, true);
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
