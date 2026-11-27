package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public final class j19 extends View {
    public final HashMap a;
    public final ArrayList b;
    public final ArrayList c;
    public final int d;

    public j19(Activity activity) {
        super(activity);
        this.a = new HashMap();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = yac.t0;
    }

    public static String b(wb2 wb2Var) {
        r47 messageObject = wb2Var.getMessageObject();
        if (messageObject == null) {
            return null;
        }
        return messageObject.x0() + "_" + messageObject.e1();
    }

    public final boolean a() {
        for (Map.Entry entry : this.a.entrySet()) {
            if (!((i19) entry.getValue()).P) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (drawable instanceof i19) {
            invalidate();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        HashMap hashMap = this.a;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((i19) entry.getValue()).d();
        }
        hashMap.clear();
        this.b.clear();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        HashMap hashMap = this.a;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((i19) entry.getValue()).draw(canvas);
        }
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                i19 i19Var = (i19) hashMap.remove((String) obj);
                if (i19Var != null) {
                    i19Var.d();
                }
            }
            arrayList.clear();
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        for (Map.Entry entry : this.a.entrySet()) {
            ((i19) entry.getValue()).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
