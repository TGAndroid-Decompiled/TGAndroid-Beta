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
import c2.u0;
import java.lang.ref.WeakReference;

public final class f {

    public final Context f6238a;

    public final g f6239b;

    public final Window f6240c;
    public CharSequence d;

    public AlertController$RecycleListView f6241e;

    public View f6242f;
    public Button h;

    public Button f6244i;

    public CharSequence f6245j;

    public Message f6246k;

    public Button f6247l;

    public NestedScrollView f6248m;

    public Drawable f6249n;

    public ImageView f6250o;

    public TextView f6251p;

    public TextView f6252q;

    public View f6253r;

    public ListAdapter f6254s;

    public final int f6256u;
    public final int v;

    public final int f6257w;

    public final int f6258x;

    public final boolean f6259y;

    public final u0 f6260z;

    public boolean f6243g = false;

    public int f6255t = -1;
    public final a A = new a(this, 0);

    public f(Context context, g gVar, Window window) {
        this.f6238a = context;
        this.f6239b = gVar;
        this.f6240c = window;
        u0 u0Var = new u0(1);
        u0Var.f2352b = new WeakReference(gVar);
        this.f6260z = u0Var;
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f5577e, 2130968614, 0);
        this.f6256u = typedArrayObtainStyledAttributes.getResourceId(0, 0);
        typedArrayObtainStyledAttributes.getResourceId(2, 0);
        this.v = typedArrayObtainStyledAttributes.getResourceId(4, 0);
        typedArrayObtainStyledAttributes.getResourceId(5, 0);
        this.f6257w = typedArrayObtainStyledAttributes.getResourceId(7, 0);
        this.f6258x = typedArrayObtainStyledAttributes.getResourceId(3, 0);
        this.f6259y = typedArrayObtainStyledAttributes.getBoolean(6, true);
        typedArrayObtainStyledAttributes.getDimensionPixelSize(1, 0);
        typedArrayObtainStyledAttributes.recycle();
        gVar.c().c(1);
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

    public static void b(View view, View view2, View view3) {
        if (view2 != null) {
            view2.setVisibility(view.canScrollVertically(-1) ? 0 : 4);
        }
        if (view3 != null) {
            view3.setVisibility(view.canScrollVertically(1) ? 0 : 4);
        }
    }

    public static ViewGroup c(View view, View view2) {
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
