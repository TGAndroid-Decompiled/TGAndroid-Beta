package cg;

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
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Components.EditTextBoldCursor;
import org.telegram.ui.Components.a4;
import org.telegram.ui.Components.b4;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.ex0;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.s3;
import org.telegram.ui.Components.u3;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.y4;
import org.telegram.ui.Components.y8;
import org.telegram.ui.nl0;
import org.telegram.ui.p41;

public final class f implements View.OnClickListener {

    public final int f2672a;

    public final Object f2673b;

    public final Object f2674c;
    public final Object d;

    public final Object f2675e;

    public final Object f2676f;
    public final Object h;

    public f(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f2672a = i10;
        this.f2674c = obj;
        this.f2673b = obj2;
        this.f2675e = obj3;
        this.f2676f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    @Override
    public final void onClick(View view) {
        switch (this.f2672a) {
            case 0:
                Calendar calendar = (Calendar) this.f2674c;
                fc0 fc0Var = (fc0) this.f2673b;
                n nVar = (n) this.f2675e;
                o oVar = (o) this.f2676f;
                s0 s0Var = (s0) this.h;
                z2 z2Var = (z2) this.d;
                calendar.setTimeInMillis((((long) fc0Var.getValue()) * 86400000) + System.currentTimeMillis());
                calendar.set(11, nVar.getValue());
                calendar.set(12, oVar.getValue() * 5);
                s0Var.I((int) (calendar.getTimeInMillis() / 1000), 0, true);
                z2Var.f23994a.dismissRunnable.run();
                break;
            case 1:
                fc0 fc0Var2 = (fc0) this.f2673b;
                fc0 fc0Var3 = (fc0) this.f2675e;
                fc0 fc0Var4 = (fc0) this.f2676f;
                Calendar calendar2 = (Calendar) this.f2674c;
                MessagesStorage.IntCallback intCallback = (MessagesStorage.IntCallback) this.h;
                z2 z2Var2 = (z2) this.d;
                y4.b(fc0Var2, fc0Var3, fc0Var4);
                calendar2.set(1, fc0Var4.getValue());
                calendar2.set(2, fc0Var3.getValue());
                calendar2.set(5, fc0Var2.getValue());
                calendar2.set(12, 0);
                calendar2.set(11, 0);
                calendar2.set(13, 0);
                intCallback.run((int) (calendar2.getTimeInMillis() / 1000));
                z2Var2.f23994a.dismissRunnable.run();
                break;
            case 2:
                fc0 fc0Var5 = (fc0) this.f2673b;
                a4 a4Var = (a4) this.f2675e;
                b4 b4Var = (b4) this.f2676f;
                Calendar calendar3 = (Calendar) this.f2674c;
                nl0 nl0Var = (nl0) this.h;
                z2 z2Var3 = (z2) this.d;
                boolean zG = y4.g(null, null, 0L, 0L, 0, fc0Var5, a4Var, b4Var);
                calendar3.setTimeInMillis(System.currentTimeMillis());
                calendar3.add(6, fc0Var5.getValue());
                calendar3.set(11, a4Var.getValue());
                calendar3.set(12, b4Var.getValue());
                if (zG) {
                    calendar3.set(13, 0);
                    calendar3.set(14, 0);
                }
                int timeInMillis = (int) (calendar3.getTimeInMillis() / 1000);
                p41 p41Var = (p41) nl0Var.f40885b;
                ((boolean[]) nl0Var.f40886c)[0] = true;
                p41Var.e(Integer.valueOf(timeInMillis));
                z2Var3.f23994a.dismissRunnable.run();
                break;
            case 3:
                fc0 fc0Var6 = (fc0) this.f2673b;
                s3 s3Var = (s3) this.f2675e;
                u3 u3Var = (u3) this.f2676f;
                Calendar calendar4 = (Calendar) this.f2674c;
                x4 x4Var = (x4) this.h;
                z2 z2Var4 = (z2) this.d;
                boolean zG2 = y4.g(null, null, 0L, 0L, 0, fc0Var6, s3Var, u3Var);
                calendar4.setTimeInMillis(System.currentTimeMillis());
                calendar4.add(6, fc0Var6.getValue());
                calendar4.set(11, s3Var.getValue());
                calendar4.set(12, u3Var.getValue());
                if (zG2) {
                    calendar4.set(13, 0);
                    calendar4.set(14, 0);
                }
                x4Var.I((int) (calendar4.getTimeInMillis() / 1000), 0, true);
                z2Var4.f23994a.dismissRunnable.run();
                break;
            case 4:
                ex0.y((ex0) this.f2674c, (int[]) this.f2673b, (EditTextBoldCursor) this.f2675e, (TextView) this.f2676f, (TextView) this.h, (AlertDialog$Builder) this.d);
                break;
            default:
                e3 e3Var = (e3) this.f2674c;
                FrameLayout frameLayout = (FrameLayout) this.f2673b;
                ArrayList arrayList = (ArrayList) this.f2675e;
                int[] iArr = (int[]) this.f2676f;
                y8 y8Var = (y8) this.h;
                n9 n9Var = (n9) this.d;
                b70 b70VarF = b70.F(e3Var.container, e3Var.getResourcesProvider(), frameLayout);
                int size = arrayList.size();
                int i10 = 0;
                while (i10 < size) {
                    int i11 = i10 + 1;
                    int iIntValue = ((Integer) arrayList.get(i10)).intValue();
                    TLRPC.User currentUser = UserConfig.getInstance(iIntValue).getCurrentUser();
                    if (currentUser != null) {
                        b70VarF.e(iIntValue, iArr[0] == iIntValue, new gh.e1(iArr, iIntValue, y8Var, currentUser, n9Var, 25));
                    }
                    i10 = i11;
                }
                b70VarF.f26993t = false;
                b70VarF.Y = true;
                b70VarF.f26992s = 0;
                b70VarF.f26974i = 3;
                b70VarF.a0(-AndroidUtilities.dp(8.0f), -AndroidUtilities.dp(8.0f));
                b70VarF.Z();
                break;
        }
    }

    public f(fc0 fc0Var, fc0 fc0Var2, fc0 fc0Var3, Calendar calendar, Object obj, z2 z2Var, int i10) {
        this.f2672a = i10;
        this.f2673b = fc0Var;
        this.f2675e = fc0Var2;
        this.f2676f = fc0Var3;
        this.f2674c = calendar;
        this.h = obj;
        this.d = z2Var;
    }
}
