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
public final class f {
    public final Context f10039a;
    public final g f10040b;
    public final Window f10041c;
    public CharSequence d;
    public AlertController$RecycleListView f10042e;
    public View f10043f;
    public Button h;
    public Button f10045i;
    public CharSequence f10046j;
    public Message f10047k;
    public Button f10048l;
    public NestedScrollView f10049m;
    public Drawable f10050n;
    public ImageView f10051o;
    public TextView f10052p;
    public TextView f10053q;
    public View f10054r;
    public ListAdapter f10055s;
    public final int f10057u;
    public final int v;
    public final int f10058w;
    public final int f10059x;
    public final boolean f10060y;
    public final d f10061z;
    public boolean f10044g = false;
    public int f10056t = -1;
    public final androidx.mediarouter.app.x A = new androidx.mediarouter.app.x(this, 5);

    public f(Context context, g gVar, Window window) {
        this.f10039a = context;
        this.f10040b = gVar;
        this.f10041c = window;
        d dVar = new d(0);
        dVar.f10038b = new WeakReference(gVar);
        this.f10061z = dVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f9517e, 2130968614, 0);
        this.f10057u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f10058w = obtainStyledAttributes.getResourceId(7, 0);
        this.f10059x = obtainStyledAttributes.getResourceId(3, 0);
        this.f10060y = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
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
        int i10;
        int i11 = 4;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i10 = 0;
            } else {
                i10 = 4;
            }
            view2.setVisibility(i10);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i11 = 0;
            }
            view3.setVisibility(i11);
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
