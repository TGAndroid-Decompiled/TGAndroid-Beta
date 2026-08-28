package ch;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Cells.t1;
public final class k extends View {
    public final HashMap f2488a;
    public final ArrayList f2489b;
    public final ArrayList f2490c;
    public final int d;

    public k(Activity activity) {
        super(activity);
        this.f2488a = new HashMap();
        this.f2489b = new ArrayList();
        this.f2490c = new ArrayList();
        this.d = UserConfig.selectedAccount;
    }

    public static String b(t1 t1Var) {
        MessageObject messageObject = t1Var.getMessageObject();
        if (messageObject == null) {
            return null;
        }
        return messageObject.getChatId() + "_" + messageObject.getId();
    }

    public final boolean a() {
        for (Map.Entry entry : this.f2488a.entrySet()) {
            if (!((j) entry.getValue()).K) {
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
        HashMap hashMap = this.f2488a;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((j) entry.getValue()).d();
        }
        hashMap.clear();
        this.f2489b.clear();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        HashMap hashMap = this.f2488a;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((j) entry.getValue()).draw(canvas);
        }
        ArrayList arrayList = this.f2489b;
        if (!arrayList.isEmpty()) {
            int size = arrayList.size();
            int i9 = 0;
            while (i9 < size) {
                Object obj = arrayList.get(i9);
                i9++;
                j jVar = (j) hashMap.remove((String) obj);
                if (jVar != null) {
                    jVar.d();
                }
            }
            arrayList.clear();
        }
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        super.onLayout(z10, i9, i10, i11, i12);
        for (Map.Entry entry : this.f2488a.entrySet()) {
            ((j) entry.getValue()).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
