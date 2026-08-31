package hg;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import eg.d3;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b4;
import org.telegram.ui.Components.c4;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.q70;
import org.telegram.ui.Components.t3;
import org.telegram.ui.Components.v3;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.Components.yx0;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.g51;
import org.telegram.ui.vl0;
public final class e implements View.OnClickListener {
    public final int f7449a;
    public final Object f7450b;
    public final Object f7451c;
    public final Object d;
    public final Object f7452e;
    public final Object f7453f;
    public final Object h;

    public e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f7449a = i10;
        this.f7451c = obj;
        this.f7450b = obj2;
        this.f7452e = obj3;
        this.f7453f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    @Override
    public final void onClick(View view) {
        Runnable runnable;
        Runnable runnable2;
        Runnable runnable3;
        Runnable runnable4;
        boolean z4;
        switch (this.f7449a) {
            case 0:
                Calendar calendar = (Calendar) this.f7451c;
                calendar.setTimeInMillis((((yc0) this.f7450b).getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, ((n) this.f7452e).getValue());
                calendar.set(12, ((o) this.f7453f).getValue() * 5);
                ((r0) this.h).I((int) (calendar.getTimeInMillis() / 1000), 0, true);
                runnable = ((c3) this.d).f21207a.dismissRunnable;
                runnable.run();
                return;
            case 1:
                yc0 yc0Var = (yc0) this.f7450b;
                yc0 yc0Var2 = (yc0) this.f7452e;
                yc0 yc0Var3 = (yc0) this.f7453f;
                Calendar calendar2 = (Calendar) this.f7451c;
                z4.b(yc0Var, yc0Var2, yc0Var3);
                calendar2.set(1, yc0Var3.getValue());
                calendar2.set(2, yc0Var2.getValue());
                calendar2.set(5, yc0Var.getValue());
                calendar2.set(12, 0);
                calendar2.set(11, 0);
                calendar2.set(13, 0);
                ((MessagesStorage.IntCallback) this.h).run((int) (calendar2.getTimeInMillis() / 1000));
                runnable2 = ((c3) this.d).f21207a.dismissRunnable;
                runnable2.run();
                return;
            case 2:
                yc0 yc0Var4 = (yc0) this.f7450b;
                b4 b4Var = (b4) this.f7452e;
                c4 c4Var = (c4) this.f7453f;
                Calendar calendar3 = (Calendar) this.f7451c;
                vl0 vl0Var = (vl0) this.h;
                c3 c3Var = (c3) this.d;
                boolean g10 = z4.g(null, null, 0L, 0L, 0, yc0Var4, b4Var, c4Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, yc0Var4.getValue());
                calendar3.set(11, b4Var.getValue());
                calendar3.set(12, c4Var.getValue());
                if (g10) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                int timeInMillis = (int) (calendar3.getTimeInMillis() / 1000);
                ((boolean[]) vl0Var.f42254c)[0] = true;
                ((g51) vl0Var.f42253b).e(Integer.valueOf(timeInMillis));
                runnable3 = c3Var.f21207a.dismissRunnable;
                runnable3.run();
                return;
            case 3:
                yc0 yc0Var5 = (yc0) this.f7450b;
                t3 t3Var = (t3) this.f7452e;
                v3 v3Var = (v3) this.f7453f;
                Calendar calendar4 = (Calendar) this.f7451c;
                y4 y4Var = (y4) this.h;
                c3 c3Var2 = (c3) this.d;
                boolean g11 = z4.g(null, null, 0L, 0L, 0, yc0Var5, t3Var, v3Var);
                calendar4.setTimeInMillis(System.currentTimeMillis());
                calendar4.add(6, yc0Var5.getValue());
                calendar4.set(11, t3Var.getValue());
                calendar4.set(12, v3Var.getValue());
                if (g11) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                y4Var.I((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = c3Var2.f21207a.dismissRunnable;
                runnable4.run();
                return;
            case 4:
                yx0.x((yx0) this.f7451c, (int[]) this.f7450b, (EditTextBoldCursor) this.f7452e, (TextView) this.f7453f, (TextView) this.h, (AlertDialog$Builder) this.d);
                return;
            default:
                h3 h3Var = (h3) this.f7451c;
                ArrayList arrayList = (ArrayList) this.f7452e;
                int[] iArr = (int[]) this.f7453f;
                z8 z8Var = (z8) this.h;
                p9 p9Var = (p9) this.d;
                q70 F = q70.F(h3Var.container, h3Var.getResourcesProvider(), (FrameLayout) this.f7450b);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int intValue = ((Integer) arrayList.get(i10)).intValue();
                    TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                    if (currentUser != null) {
                        if (iArr[0] == intValue) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        F.e(intValue, z4, new d3(iArr, intValue, z8Var, currentUser, p9Var, 24));
                    }
                    i10 = i11;
                }
                F.f30330t = false;
                F.Y = true;
                F.f30329s = 0;
                F.f30311i = 3;
                F.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                F.Z();
                return;
        }
    }

    public e(yc0 yc0Var, yc0 yc0Var2, yc0 yc0Var3, Calendar calendar, Object obj, c3 c3Var, int i10) {
        this.f7449a = i10;
        this.f7450b = yc0Var;
        this.f7452e = yc0Var2;
        this.f7453f = yc0Var3;
        this.f7451c = calendar;
        this.h = obj;
        this.d = c3Var;
    }
}
