package fh;

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
    public final HashMap f6827a;
    public final ArrayList f6828b;
    public final ArrayList f6829c;
    public final int d;

    public k(Activity activity) {
        super(activity);
        this.f6827a = new HashMap();
        this.f6828b = new ArrayList();
        this.f6829c = new ArrayList();
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
        for (Map.Entry entry : this.f6827a.entrySet()) {
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
        HashMap hashMap = this.f6827a;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((j) entry.getValue()).d();
        }
        hashMap.clear();
        this.f6828b.clear();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        HashMap hashMap = this.f6827a;
        for (Map.Entry entry : hashMap.entrySet()) {
            ((j) entry.getValue()).draw(canvas);
        }
        ArrayList arrayList = this.f6828b;
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
        for (Map.Entry entry : this.f6827a.entrySet()) {
            ((j) entry.getValue()).setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
        }
    }
}
