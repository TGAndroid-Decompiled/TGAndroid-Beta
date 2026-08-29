package eg;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import bg.j3;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b5;
import org.telegram.ui.Components.c5;
import org.telegram.ui.Components.e4;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.f4;
import org.telegram.ui.Components.j70;
import org.telegram.ui.Components.nx0;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.w3;
import org.telegram.ui.Components.y3;
import org.telegram.ui.kl0;
import org.telegram.ui.s41;
public final class f implements View.OnClickListener {
    public final int f5981a;
    public final Object f5982b;
    public final Object f5983c;
    public final Object d;
    public final Object f5984e;
    public final Object f5985f;
    public final Object h;

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f5981a = i10;
        this.f5983c = obj;
        this.f5982b = obj2;
        this.f5984e = obj3;
        this.f5985f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        Runnable runnable4;
        boolean z10;
        switch (this.f5981a) {
            case 0:
                Calendar calendar = (Calendar) this.f5983c;
                calendar.setTimeInMillis((((qc0) this.f5982b).getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, ((o) this.f5984e).getValue());
                calendar.set(12, ((p) this.f5985f).getValue() * 5);
                ((s0) this.h).I((int) (calendar.getTimeInMillis() / 1000), 0, true);
                runnable = ((a3) this.d).f22729a.dismissRunnable;
                runnable.run();
                return;
            case 1:
                qc0 qc0Var = (qc0) this.f5982b;
                qc0 qc0Var2 = (qc0) this.f5984e;
                qc0 qc0Var3 = (qc0) this.f5985f;
                Calendar calendar2 = (Calendar) this.f5983c;
                c5.b(qc0Var, qc0Var2, qc0Var3);
                calendar2.set(1, qc0Var3.getValue());
                calendar2.set(2, qc0Var2.getValue());
                calendar2.set(5, qc0Var.getValue());
                calendar2.set(12, 0);
                calendar2.set(11, 0);
                calendar2.set(13, 0);
                ((MessagesStorage.IntCallback) this.h).run((int) (calendar2.getTimeInMillis() / 1000));
                runnable2 = ((a3) this.d).f22729a.dismissRunnable;
                runnable2.run();
                return;
            case 2:
                qc0 qc0Var4 = (qc0) this.f5982b;
                e4 e4Var = (e4) this.f5984e;
                f4 f4Var = (f4) this.f5985f;
                Calendar calendar3 = (Calendar) this.f5983c;
                kl0 kl0Var = (kl0) this.h;
                a3 a3Var = (a3) this.d;
                boolean g10 = c5.g(null, null, 0L, 0L, 0, qc0Var4, e4Var, f4Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, qc0Var4.getValue());
                calendar3.set(11, e4Var.getValue());
                calendar3.set(12, f4Var.getValue());
                if (g10) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                int timeInMillis = (int) (calendar3.getTimeInMillis() / 1000);
                ((boolean[]) kl0Var.f39925c)[0] = true;
                ((s41) kl0Var.f39924b).e(Integer.valueOf(timeInMillis));
                runnable3 = a3Var.f22729a.dismissRunnable;
                runnable3.run();
                return;
            case 3:
                qc0 qc0Var5 = (qc0) this.f5982b;
                w3 w3Var = (w3) this.f5984e;
                y3 y3Var = (y3) this.f5985f;
                Calendar calendar4 = (Calendar) this.f5983c;
                b5 b5Var = (b5) this.h;
                a3 a3Var2 = (a3) this.d;
                boolean g11 = c5.g(null, null, 0L, 0L, 0, qc0Var5, w3Var, y3Var);
                calendar4.setTimeInMillis(System.currentTimeMillis());
                calendar4.add(6, qc0Var5.getValue());
                calendar4.set(11, w3Var.getValue());
                calendar4.set(12, y3Var.getValue());
                if (g11) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                b5Var.I((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = a3Var2.f22729a.dismissRunnable;
                runnable4.run();
                return;
            case 4:
                nx0.x((nx0) this.f5983c, (int[]) this.f5982b, (EditTextBoldCursor) this.f5984e, (TextView) this.f5985f, (TextView) this.h, (AlertDialog$Builder) this.d);
                return;
            default:
                f3 f3Var = (f3) this.f5983c;
                ArrayList arrayList = (ArrayList) this.f5984e;
                int[] iArr = (int[]) this.f5985f;
                e9 e9Var = (e9) this.h;
                t9 t9Var = (t9) this.d;
                j70 F = j70.F(f3Var.container, f3Var.getResourcesProvider(), (FrameLayout) this.f5982b);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList.get(i10)).intValue();
                    TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                    if (currentUser != null) {
                        if (iArr[0] == intValue) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        F.e(intValue, z10, new j3(iArr, intValue, e9Var, currentUser, t9Var, 24));
                    }
                    i10 = i11;
                }
                F.f29601t = false;
                F.Y = true;
                F.f29600s = 0;
                F.f29582i = 3;
                F.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                F.Z();
                return;
        }
    }

    public f(qc0 qc0Var, qc0 qc0Var2, qc0 qc0Var3, Calendar calendar, Object obj, a3 a3Var, int i10) {
        this.f5981a = i10;
        this.f5982b = qc0Var;
        this.f5984e = qc0Var2;
        this.f5985f = qc0Var3;
        this.f5983c = calendar;
        this.h = obj;
        this.d = a3Var;
    }
}
