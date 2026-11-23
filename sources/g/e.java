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
    public final Context f12957a;
    public final f f12958b;
    public final Window f12959c;
    public CharSequence d;
    public AlertController$RecycleListView f12960e;
    public View f12961f;
    public Button h;
    public Button f12963i;
    public CharSequence f12964j;
    public Message f12965k;
    public Button f12966l;
    public NestedScrollView f12967m;
    public Drawable f12968n;
    public ImageView f12969o;
    public TextView f12970p;
    public TextView f12971q;
    public View f12972r;
    public ListAdapter f12973s;
    public final int f12975u;
    public final int v;
    public final int f12976w;
    public final int f12977x;
    public final boolean f12978y;
    public final c f12979z;
    public boolean f12962g = false;
    public int f12974t = -1;
    public final androidx.mediarouter.app.w A = new androidx.mediarouter.app.w(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f12957a = context;
        this.f12958b = fVar;
        this.f12959c = window;
        c cVar = new c(0);
        cVar.f12956b = new WeakReference(fVar);
        this.f12979z = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f10986e, 2130968614, 0);
        this.f12975u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f12976w = obtainStyledAttributes.getResourceId(7, 0);
        this.f12977x = obtainStyledAttributes.getResourceId(3, 0);
        this.f12978y = obtainStyledAttributes.getBoolean(6, true);
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
