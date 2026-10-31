package mh;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.ui.Cells.q1;
public final class l extends View {
    public final HashMap f13372a;
    public final ArrayList f13373b;
    public final ArrayList f13374c;
    public final int d;

    public l(Activity activity) {
        super(activity);
        this.f13372a = new HashMap();
        this.f13373b = new ArrayList();
        this.f13374c = new ArrayList();
        this.d = d20.f15147s0;
    }

    public static String b(q1 q1Var) {
        jj messageObject = q1Var.getMessageObject();
        if (messageObject == null) {
            return null;
        }
        return messageObject.x0() + "_" + messageObject.f1();
    }

    public final boolean a() {
        for (Map.Entry entry : this.f13372a.entrySet()) {
            if (!((j) entry.getValue()).O) {
                return true;
            }
        }
        return false;
    }

    @Override
    public final void invalidateDrawable(Drawable drawable) {
        super.invalidateDrawable(drawable);
        if (drawable instanceof j) {
            invalidate();
        }
    }

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        HashMap hashMap = this.f13372a;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((j) entry.getValue()).d();
        }
        hashMap.clear();
        this.f13373b.clear();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        HashMap hashMap = this.f13372a;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((j) entry.getValue()).draw(canvas);
        }
        ArrayList arrayList = this.f13373b;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                j jVar = (j) hashMap.remove((String) obj);
                if (jVar != null) {
                    jVar.d();
                }
            }
            arrayList.clear();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        for (Map.Entry entry : this.f13372a.entrySet()) {
            ((j) entry.getValue()).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
