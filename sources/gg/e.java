package gg;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import dg.f3;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b3;
import org.telegram.ui.ActionBar.g3;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.b4;
import org.telegram.ui.Components.c4;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.t3;
import org.telegram.ui.Components.v3;
import org.telegram.ui.Components.xc0;
import org.telegram.ui.Components.xx0;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.l51;
import org.telegram.ui.vl0;
public final class e implements View.OnClickListener {
    public final int f6594a;
    public final Object f6595b;
    public final Object f6596c;
    public final Object d;
    public final Object e;
    public final Object f6597f;
    public final Object h;

    public e(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f6594a = i10;
        this.f6596c = obj;
        this.f6595b = obj2;
        this.e = obj3;
        this.f6597f = obj4;
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
        switch (this.f6594a) {
            case 0:
                Calendar calendar = (Calendar) this.f6596c;
                calendar.setTimeInMillis((((xc0) this.f6595b).getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, ((n) this.e).getValue());
                calendar.set(12, ((o) this.f6597f).getValue() * 5);
                ((r0) this.h).J((int) (calendar.getTimeInMillis() / 1000), 0, true);
                runnable = ((b3) this.d).f19500a.dismissRunnable;
                runnable.run();
                return;
            case 1:
                xc0 xc0Var = (xc0) this.f6595b;
                xc0 xc0Var2 = (xc0) this.e;
                xc0 xc0Var3 = (xc0) this.f6597f;
                Calendar calendar2 = (Calendar) this.f6596c;
                z4.b(xc0Var, xc0Var2, xc0Var3);
                calendar2.set(1, xc0Var3.getValue());
                calendar2.set(2, xc0Var2.getValue());
                calendar2.set(5, xc0Var.getValue());
                calendar2.set(12, 0);
                calendar2.set(11, 0);
                calendar2.set(13, 0);
                ((MessagesStorage.IntCallback) this.h).run((int) (calendar2.getTimeInMillis() / 1000));
                runnable2 = ((b3) this.d).f19500a.dismissRunnable;
                runnable2.run();
                return;
            case 2:
                xc0 xc0Var4 = (xc0) this.f6595b;
                b4 b4Var = (b4) this.e;
                c4 c4Var = (c4) this.f6597f;
                Calendar calendar3 = (Calendar) this.f6596c;
                vl0 vl0Var = (vl0) this.h;
                b3 b3Var = (b3) this.d;
                boolean g10 = z4.g(null, null, 0L, 0L, 0, xc0Var4, b4Var, c4Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, xc0Var4.getValue());
                calendar3.set(11, b4Var.getValue());
                calendar3.set(12, c4Var.getValue());
                if (g10) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                int timeInMillis = (int) (calendar3.getTimeInMillis() / 1000);
                ((boolean[]) vl0Var.f39134c)[0] = true;
                ((l51) vl0Var.f39133b).e(Integer.valueOf(timeInMillis));
                runnable3 = b3Var.f19500a.dismissRunnable;
                runnable3.run();
                return;
            case 3:
                xc0 xc0Var5 = (xc0) this.f6595b;
                t3 t3Var = (t3) this.e;
                v3 v3Var = (v3) this.f6597f;
                Calendar calendar4 = (Calendar) this.f6596c;
                y4 y4Var = (y4) this.h;
                b3 b3Var2 = (b3) this.d;
                boolean g11 = z4.g(null, null, 0L, 0L, 0, xc0Var5, t3Var, v3Var);
                calendar4.setTimeInMillis(System.currentTimeMillis());
                calendar4.add(6, xc0Var5.getValue());
                calendar4.set(11, t3Var.getValue());
                calendar4.set(12, v3Var.getValue());
                if (g11) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                y4Var.J((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = b3Var2.f19500a.dismissRunnable;
                runnable4.run();
                return;
            case 4:
                xx0.x((xx0) this.f6596c, (int[]) this.f6595b, (EditTextBoldCursor) this.e, (TextView) this.f6597f, (TextView) this.h, (AlertDialog$Builder) this.d);
                return;
            default:
                g3 g3Var = (g3) this.f6596c;
                ArrayList arrayList = (ArrayList) this.e;
                int[] iArr = (int[]) this.f6597f;
                z8 z8Var = (z8) this.h;
                p9 p9Var = (p9) this.d;
                p70 F = p70.F(g3Var.container, g3Var.getResourcesProvider(), (FrameLayout) this.f6595b);
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
                        F.e(intValue, z4, new f3(iArr, intValue, z8Var, currentUser, p9Var, 24));
                    }
                    i10 = i11;
                }
                F.f27778t = false;
                F.Y = true;
                F.f27777s = 0;
                F.f27759i = 3;
                F.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                F.Z();
                return;
        }
    }

    public e(xc0 xc0Var, xc0 xc0Var2, xc0 xc0Var3, Calendar calendar, Object obj, b3 b3Var, int i10) {
        this.f6594a = i10;
        this.f6595b = xc0Var;
        this.e = xc0Var2;
        this.f6597f = xc0Var3;
        this.f6596c = calendar;
        this.h = obj;
        this.d = b3Var;
    }
}
