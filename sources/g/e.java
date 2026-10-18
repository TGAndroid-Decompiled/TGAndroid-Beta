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
    public final Context f10653a;
    public final f f10654b;
    public final Window f10655c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public View f10656f;
    public Button h;
    public Button f10658i;
    public CharSequence f10659j;
    public Message f10660k;
    public Button f10661l;
    public NestedScrollView f10662m;
    public Drawable f10663n;
    public ImageView f10664o;
    public TextView f10665p;
    public TextView f10666q;
    public View f10667r;
    public ListAdapter f10668s;
    public final int f10670u;
    public final int v;
    public final int f10671w;
    public final int f10672x;
    public final boolean f10673y;
    public final c f10674z;
    public boolean f10657g = false;
    public int f10669t = -1;
    public final androidx.mediarouter.app.w A = new androidx.mediarouter.app.w(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f10653a = context;
        this.f10654b = fVar;
        this.f10655c = window;
        c cVar = new c(0);
        cVar.f10652b = new WeakReference(fVar);
        this.f10674z = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.e, 2130968614, 0);
        this.f10670u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f10671w = obtainStyledAttributes.getResourceId(7, 0);
        this.f10672x = obtainStyledAttributes.getResourceId(3, 0);
        this.f10673y = obtainStyledAttributes.getBoolean(6, true);
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
