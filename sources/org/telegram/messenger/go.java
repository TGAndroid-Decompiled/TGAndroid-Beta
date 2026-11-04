package org.telegram.messenger;

import android.graphics.RectF;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.ej0;
import org.telegram.ui.Components.et0;
import org.telegram.ui.Components.it0;
import org.telegram.ui.Components.jt0;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.tt0;
public final class go implements Vector.TLDeserializer, OnCompleteListener, org.telegram.ui.ActionBar.p1, tt0, o10, et0, t10, kh.i, ej0, it0, jt0 {
    public final int f22750a;

    public go(int i3) {
        this.f22750a = i3;
    }

    public static String f() {
        return Build.SOC_MODEL;
    }

    @Override
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.FALSE;
    }

    @Override
    public void c(Object obj, float f10) {
        org.telegram.ui.zq zqVar = (org.telegram.ui.zq) obj;
        switch (this.f22750a) {
            case 23:
                zqVar.H1 = f10;
                if (zqVar.getParent() != null) {
                    ((View) zqVar.getParent()).invalidate();
                    return;
                }
                return;
            case 24:
            case 26:
            default:
                zqVar.K1 = f10;
                if (zqVar.getParent() != null) {
                    ((View) zqVar.getParent()).invalidate();
                    return;
                }
                return;
            case 25:
                zqVar.I1 = f10;
                if (zqVar.getParent() != null) {
                    ((View) zqVar.getParent()).invalidate();
                    return;
                }
                return;
            case 27:
                zqVar.J1 = f10;
                if (zqVar.getParent() != null) {
                    ((View) zqVar.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) number;
        Integer num2 = (Integer) obj;
        switch (this.f22750a) {
            case 14:
                if (num.intValue() == 0) {
                    return bd.G(num2.intValue(), "MaximumReactionsValue", new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return bd.H(',', "Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i3, boolean z10) {
        switch (this.f22750a) {
            case 0:
                return TL_account.WebBrowserSettings.TLdeserialize(inputSerializedData, i3, z10);
            case 1:
                return TLRPC.MessageEntity.TLdeserialize(inputSerializedData, i3, z10);
            case 2:
                return TL_ephemeral.EphemeralMessage.TLdeserialize(inputSerializedData, i3, z10);
            case 3:
            case 4:
            case 5:
            default:
                return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i3, z10);
            case 6:
                return TL_iv.RichText.TLdeserialize(inputSerializedData, i3, z10);
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.s1 s1Var, int i3) {
        switch (this.f22750a) {
            case 8:
                int i10 = az.f21612a;
                return;
            case 11:
                s1Var.dismiss();
                return;
            case 15:
                s1Var.dismiss();
                return;
            default:
                s1Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        org.telegram.ui.zq zqVar = (org.telegram.ui.zq) obj;
        switch (this.f22750a) {
            case 22:
                return zqVar.H1;
            case 23:
            case 25:
            default:
                return zqVar.K1;
            case 24:
                return zqVar.I1;
            case 26:
                return zqVar.J1;
        }
    }

    @Override
    public float i(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override
    public void k(RectF rectF, View view) {
        view.invalidate();
    }

    @Override
    public void l(int i3) {
        if (i3 == 0) {
            az.A(3);
        } else if (i3 == 1) {
            az.A(0);
        } else if (i3 == 2) {
            az.A(1);
        } else if (i3 == 3) {
            az.A(2);
        }
    }

    @Override
    public RecyclerView m(View view) {
        return ((org.telegram.ui.rd) view).f49199a;
    }

    @Override
    public void onComplete(Task task) {
        az.f21637j = SystemClock.elapsedRealtime();
        if (!task.isSuccessful()) {
            if (r2.f25040a) {
                a8.b("Failed to get regid");
            }
            az.h = "__FIREBASE_FAILED__";
            PushListenerController.sendRegistrationToServer(2, null);
            return;
        }
        String str = (String) task.getResult();
        if (!TextUtils.isEmpty(str)) {
            PushListenerController.sendRegistrationToServer(2, str);
        }
    }

    @Override
    public void r(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    public go(Object obj, int i3) {
        this.f22750a = i3;
    }

    @Override
    public void p() {
    }
}
