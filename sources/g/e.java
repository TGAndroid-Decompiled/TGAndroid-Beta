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
    public final Context f12116a;
    public final f f12117b;
    public final Window f12118c;
    public CharSequence d;
    public AlertController$RecycleListView e;
    public View f12119f;
    public Button h;
    public Button f12121i;
    public CharSequence f12122j;
    public Message f12123k;
    public Button f12124l;
    public NestedScrollView f12125m;
    public Drawable f12126n;
    public ImageView f12127o;
    public TextView f12128p;
    public TextView f12129q;
    public View f12130r;
    public ListAdapter f12131s;
    public final int f12133u;
    public final int v;
    public final int f12134w;
    public final int f12135x;
    public final boolean f12136y;
    public final c f12137z;
    public boolean f12120g = false;
    public int f12132t = -1;
    public final androidx.mediarouter.app.x A = new androidx.mediarouter.app.x(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f12116a = context;
        this.f12117b = fVar;
        this.f12118c = window;
        c cVar = new c(0);
        cVar.f12115b = new WeakReference(fVar);
        this.f12137z = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.e, 2130968614, 0);
        this.f12133u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f12134w = obtainStyledAttributes.getResourceId(7, 0);
        this.f12135x = obtainStyledAttributes.getResourceId(3, 0);
        this.f12136y = obtainStyledAttributes.getBoolean(6, true);
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
