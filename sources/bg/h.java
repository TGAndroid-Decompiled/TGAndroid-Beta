package bg;

import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Calendar;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a4;
import org.telegram.ui.Components.b4;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.cx0;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.s3;
import org.telegram.ui.Components.u3;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.x60;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.z8;
import org.telegram.ui.nl0;
import org.telegram.ui.q41;
public final class h implements View.OnClickListener {
    public final int f1798a;
    public final Object f1799b;
    public final Object f1800c;
    public final Object d;
    public final Object f1801e;
    public final Object f1802f;
    public final Object h;

    public h(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i9) {
        this.f1798a = i9;
        this.f1800c = obj;
        this.f1799b = obj2;
        this.f1801e = obj3;
        this.f1802f = obj4;
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
        switch (this.f1798a) {
            case 0:
                Calendar calendar = (Calendar) this.f1800c;
                calendar.setTimeInMillis((((bc0) this.f1799b).getValue() * 86400000) + System.currentTimeMillis());
                calendar.set(11, ((q) this.f1801e).getValue());
                calendar.set(12, ((r) this.f1802f).getValue() * 5);
                ((w0) this.h).B((int) (calendar.getTimeInMillis() / 1000), 0, true);
                runnable = ((org.telegram.ui.ActionBar.a3) this.d).f22713a.dismissRunnable;
                runnable.run();
                return;
            case 1:
                bc0 bc0Var = (bc0) this.f1799b;
                bc0 bc0Var2 = (bc0) this.f1801e;
                bc0 bc0Var3 = (bc0) this.f1802f;
                Calendar calendar2 = (Calendar) this.f1800c;
                y4.b(bc0Var, bc0Var2, bc0Var3);
                calendar2.set(1, bc0Var3.getValue());
                calendar2.set(2, bc0Var2.getValue());
                calendar2.set(5, bc0Var.getValue());
                calendar2.set(12, 0);
                calendar2.set(11, 0);
                calendar2.set(13, 0);
                ((MessagesStorage.IntCallback) this.h).run((int) (calendar2.getTimeInMillis() / 1000));
                runnable2 = ((org.telegram.ui.ActionBar.a3) this.d).f22713a.dismissRunnable;
                runnable2.run();
                return;
            case 2:
                bc0 bc0Var4 = (bc0) this.f1799b;
                a4 a4Var = (a4) this.f1801e;
                b4 b4Var = (b4) this.f1802f;
                Calendar calendar3 = (Calendar) this.f1800c;
                nl0 nl0Var = (nl0) this.h;
                org.telegram.ui.ActionBar.a3 a3Var = (org.telegram.ui.ActionBar.a3) this.d;
                boolean g10 = y4.g(null, null, 0L, 0L, 0, bc0Var4, a4Var, b4Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, bc0Var4.getValue());
                calendar3.set(11, a4Var.getValue());
                calendar3.set(12, b4Var.getValue());
                if (g10) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                int timeInMillis = (int) (calendar3.getTimeInMillis() / 1000);
                ((boolean[]) nl0Var.f40773c)[0] = true;
                ((q41) nl0Var.f40772b).e(Integer.valueOf(timeInMillis));
                runnable3 = a3Var.f22713a.dismissRunnable;
                runnable3.run();
                return;
            case 3:
                bc0 bc0Var5 = (bc0) this.f1799b;
                s3 s3Var = (s3) this.f1801e;
                u3 u3Var = (u3) this.f1802f;
                Calendar calendar4 = (Calendar) this.f1800c;
                x4 x4Var = (x4) this.h;
                org.telegram.ui.ActionBar.a3 a3Var2 = (org.telegram.ui.ActionBar.a3) this.d;
                boolean g11 = y4.g(null, null, 0L, 0L, 0, bc0Var5, s3Var, u3Var);
                calendar4.setTimeInMillis(System.currentTimeMillis());
                calendar4.add(6, bc0Var5.getValue());
                calendar4.set(11, s3Var.getValue());
                calendar4.set(12, u3Var.getValue());
                if (g11) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                x4Var.B((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                runnable4 = a3Var2.f22713a.dismissRunnable;
                runnable4.run();
                return;
            case 4:
                cx0.x((cx0) this.f1800c, (int[]) this.f1799b, (EditTextBoldCursor) this.f1801e, (TextView) this.f1802f, (TextView) this.h, (AlertDialog$Builder) this.d);
                return;
            default:
                org.telegram.ui.ActionBar.f3 f3Var = (org.telegram.ui.ActionBar.f3) this.f1800c;
                ArrayList arrayList = (ArrayList) this.f1801e;
                int[] iArr = (int[]) this.f1802f;
                z8 z8Var = (z8) this.h;
                o9 o9Var = (o9) this.d;
                x60 F = x60.F(f3Var.container, f3Var.getResourcesProvider(), (FrameLayout) this.f1799b);
                int size = arrayList.size();
                int i9 = 0;
                while (i9 < size) {
                    int i10 = i9 + 1;
                    int intValue = ((Integer) arrayList.get(i9)).intValue();
                    TLRPC.User currentUser = UserConfig.getInstance(intValue).getCurrentUser();
                    if (currentUser != null) {
                        if (iArr[0] == intValue) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        F.e(intValue, z10, new fh.g1(iArr, intValue, z8Var, currentUser, o9Var, 27));
                    }
                    i9 = i10;
                }
                F.f34581t = false;
                F.Y = true;
                F.f34580s = 0;
                F.f34562i = 3;
                F.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                F.Z();
                return;
        }
    }

    public h(bc0 bc0Var, bc0 bc0Var2, bc0 bc0Var3, Calendar calendar, Object obj, org.telegram.ui.ActionBar.a3 a3Var, int i9) {
        this.f1798a = i9;
        this.f1799b = bc0Var;
        this.f1801e = bc0Var2;
        this.f1802f = bc0Var3;
        this.f1800c = calendar;
        this.h = obj;
        this.d = a3Var;
    }
}
