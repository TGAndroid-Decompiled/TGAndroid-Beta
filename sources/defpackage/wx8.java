package defpackage;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
public final class wx8 extends View {
    public final HashMap a;
    public final ArrayList b;
    public final ArrayList c;
    public final int d;

    public wx8(Activity activity) {
        super(activity);
        this.a = new HashMap();
        this.b = new ArrayList();
        this.c = new ArrayList();
        this.d = y6c.t0;
    }

    public static String b(gb2 gb2Var) {
        k27 messageObject = gb2Var.getMessageObject();
        if (messageObject == null) {
            return null;
        }
        return messageObject.x0() + "_" + messageObject.e1();
    }

    public final boolean a() {
        for (Map.Entry entry : this.a.entrySet()) {
            if (!((vx8) entry.getValue()).P) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (drawable instanceof vx8) {
            invalidate();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        HashMap hashMap = this.a;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((vx8) entry.getValue()).d();
        }
        hashMap.clear();
        this.b.clear();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        HashMap hashMap = this.a;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((vx8) entry.getValue()).draw(canvas);
        }
        ArrayList arrayList = this.b;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                vx8 vx8Var = (vx8) hashMap.remove((String) obj);
                if (vx8Var != null) {
                    vx8Var.d();
                }
            }
            arrayList.clear();
        }
    }

    @Override
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        super.onLayout(z, i, i2, i3, i4);
        for (Map.Entry entry : this.a.entrySet()) {
            ((vx8) entry.getValue()).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
