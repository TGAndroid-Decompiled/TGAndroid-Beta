package dh;

import android.app.Activity;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.view.View;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.UserConfig;
import org.telegram.ui.Cells.s1;

public final class k extends View {

    public final HashMap f5032a;

    public final ArrayList f5033b;

    public final ArrayList f5034c;
    public final int d;

    public k(Activity activity) {
        super(activity);
        this.f5032a = new HashMap();
        this.f5033b = new ArrayList();
        this.f5034c = new ArrayList();
        this.d = UserConfig.selectedAccount;
    }

    public static String b(s1 s1Var) {
        MessageObject messageObject = s1Var.getMessageObject();
        if (messageObject == null) {
            return null;
        }
        return messageObject.getChatId() + "_" + messageObject.getId();
    }

    public final boolean a() {
        Iterator it = this.f5032a.entrySet().iterator();
        while (it.hasNext()) {
            if (!((j) ((Map.Entry) it.next()).getValue()).K) {
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
        HashMap map = this.f5032a;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((j) ((Map.Entry) it.next()).getValue()).d();
        }
        map.clear();
        this.f5033b.clear();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        HashMap map = this.f5032a;
        Iterator it = map.entrySet().iterator();
        while (it.hasNext()) {
            ((j) ((Map.Entry) it.next()).getValue()).draw(canvas);
        }
        ArrayList arrayList = this.f5033b;
        if (arrayList.isEmpty()) {
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            j jVar = (j) map.remove((String) obj);
            if (jVar != null) {
                jVar.d();
            }
        }
        arrayList.clear();
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        Iterator it = this.f5032a.entrySet().iterator();
        while (it.hasNext()) {
            ((j) ((Map.Entry) it.next()).getValue()).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
