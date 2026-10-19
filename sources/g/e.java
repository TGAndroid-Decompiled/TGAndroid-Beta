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
    public final Context f10650a;
    public final f f10651b;
    public final Window f10652c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public View f10653f;
    public Button h;
    public Button f10655i;
    public CharSequence f10656j;
    public Message f10657k;
    public Button f10658l;
    public NestedScrollView f10659m;
    public Drawable f10660n;
    public ImageView f10661o;
    public TextView f10662p;
    public TextView f10663q;
    public View f10664r;
    public ListAdapter f10665s;
    public final int f10667u;
    public final int v;
    public final int f10668w;
    public final int f10669x;
    public final boolean f10670y;
    public final c f10671z;
    public boolean f10654g = false;
    public int f10666t = -1;
    public final androidx.mediarouter.app.w A = new androidx.mediarouter.app.w(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f10650a = context;
        this.f10651b = fVar;
        this.f10652c = window;
        c cVar = new c(0);
        cVar.f10649b = new WeakReference(fVar);
        this.f10671z = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.e, 2130968614, 0);
        this.f10667u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f10668w = obtainStyledAttributes.getResourceId(7, 0);
        this.f10669x = obtainStyledAttributes.getResourceId(3, 0);
        this.f10670y = obtainStyledAttributes.getBoolean(6, true);
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
