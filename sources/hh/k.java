package hh;

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
import org.telegram.ui.Cells.s1;
public final class k extends View {
    public final HashMap f7151a;
    public final ArrayList f7152b;
    public final ArrayList f7153c;
    public final int d;

    public k(Activity activity) {
        super(activity);
        this.f7151a = new HashMap();
        this.f7152b = new ArrayList();
        this.f7153c = new ArrayList();
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
        for (Map.Entry entry : this.f7151a.entrySet()) {
            if (!((j) entry.getValue()).L) {
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
        HashMap hashMap = this.f7151a;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((j) entry.getValue()).d();
        }
        hashMap.clear();
        this.f7152b.clear();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        HashMap hashMap = this.f7151a;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((j) entry.getValue()).draw(canvas);
        }
        ArrayList arrayList = this.f7152b;
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
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        super.onLayout(z4, i10, i11, i12, i13);
        for (Map.Entry entry : this.f7151a.entrySet()) {
            ((j) entry.getValue()).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
