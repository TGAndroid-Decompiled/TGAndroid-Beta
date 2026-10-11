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
    public final Context f10109a;
    public final f f10110b;
    public final Window f10111c;
    public CharSequence d;
    public AlertController$RecycleListView f10112e;
    public View f10113f;
    public Button h;
    public Button f10115i;
    public CharSequence f10116j;
    public Message f10117k;
    public Button f10118l;
    public NestedScrollView f10119m;
    public Drawable f10120n;
    public ImageView f10121o;
    public TextView f10122p;
    public TextView f10123q;
    public View f10124r;
    public ListAdapter f10125s;
    public final int f10127u;
    public final int v;
    public final int f10128w;
    public final int f10129x;
    public final boolean f10130y;
    public final c f10131z;
    public boolean f10114g = false;
    public int f10126t = -1;
    public final androidx.mediarouter.app.x A = new androidx.mediarouter.app.x(this, 5);

    public e(Context context, f fVar, Window window) {
        this.f10109a = context;
        this.f10110b = fVar;
        this.f10111c = window;
        c cVar = new c(0);
        cVar.f10108b = new WeakReference(fVar);
        this.f10131z = cVar;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, f.a.f9528e, 2130968614, 0);
        this.f10127u = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.v = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.f10128w = obtainStyledAttributes.getResourceId(7, 0);
        this.f10129x = obtainStyledAttributes.getResourceId(3, 0);
        this.f10130y = obtainStyledAttributes.getBoolean(6, true);
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
