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
    public final Context f9745a;
    public final f f9746b;
    public final Window f9747c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public View f9748f;
    public Button h;
    public Button f9750i;
    public CharSequence f9751j;
    public Message f9752k;
    public Button f9753l;
    public NestedScrollView f9754m;
    public Drawable f9755n;
    public ImageView f9756o;
    public TextView f9757p;
    public TextView f9758q;
    public View f9759r;
    public ListAdapter f9760s;
    public final int f9762u;
    public final int v;
    public final int f9763w;
    public final int f9764x;
    public final boolean f9765y;
    public final c f9766z;
    public boolean f9749g = false;
    public int f9761t = -1;
    public final androidx.mediarouter.app.w A = new androidx.mediarouter.app.w(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f9745a = context;
        this.f9746b = fVar;
        this.f9747c = window;
        c cVar = new c(0);
        cVar.f9744b = new WeakReference(fVar);
        this.f9766z = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.e, 2130968614, 0);
        this.f9762u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f9763w = obtainStyledAttributes.getResourceId(7, 0);
        this.f9764x = obtainStyledAttributes.getResourceId(3, 0);
        this.f9765y = obtainStyledAttributes.getBoolean(6, true);
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
