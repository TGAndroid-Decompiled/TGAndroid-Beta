package org.telegram.messenger;

import android.graphics.RectF;
import android.graphics.Shader;
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
import org.telegram.ui.Components.aj0;
import org.telegram.ui.Components.gt0;
import org.telegram.ui.Components.kt0;
import org.telegram.ui.Components.lt0;
import org.telegram.ui.Components.vt0;
import org.telegram.ui.Components.x31;
public final class ch implements k9, Vector.TLDeserializer, OnCompleteListener, org.telegram.ui.ActionBar.r1, vt0, w10, gt0, b20, jh.i, aj0, kt0, lt0 {
    public final int f21858a;

    public ch(int i7) {
        this.f21858a = i7;
    }

    public static Shader.TileMode e() {
        return Shader.TileMode.DECAL;
    }

    @Override
    public Boolean a(x31 x31Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.FALSE;
    }

    @Override
    public void b(RectF rectF, View view) {
        view.invalidate();
    }

    @Override
    public Object d(Number number, Object obj) {
        Integer num = (Integer) number;
        Integer num2 = (Integer) obj;
        switch (this.f21858a) {
            case 17:
                if (num.intValue() == 0) {
                    return id.G(num2.intValue(), "MaximumReactionsValue", new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return id.H(',', "Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i7, boolean z9) {
        switch (this.f21858a) {
            case 2:
                return TLRPC.Peer.TLdeserialize(inputSerializedData, i7, z9);
            case 3:
                return TL_account.WebBrowserSettings.TLdeserialize(inputSerializedData, i7, z9);
            case 4:
                return TLRPC.MessageEntity.TLdeserialize(inputSerializedData, i7, z9);
            case 5:
                return TL_ephemeral.EphemeralMessage.TLdeserialize(inputSerializedData, i7, z9);
            case 6:
            case 7:
            case 8:
            default:
                return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i7, z9);
            case 9:
                return TL_iv.RichText.TLdeserialize(inputSerializedData, i7, z9);
        }
    }

    @Override
    public void f(Object obj, float f10) {
        org.telegram.ui.er erVar = (org.telegram.ui.er) obj;
        switch (this.f21858a) {
            case 26:
                erVar.G1 = f10;
                if (erVar.getParent() != null) {
                    ((View) erVar.getParent()).invalidate();
                    return;
                }
                return;
            default:
                erVar.H1 = f10;
                if (erVar.getParent() != null) {
                    ((View) erVar.getParent()).invalidate();
                    return;
                }
                return;
        }
    }

    @Override
    public void g(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f21858a) {
            case 11:
                int i10 = iz.f23389a;
                return;
            case 14:
                u1Var.dismiss();
                return;
            case 18:
                u1Var.dismiss();
                return;
            default:
                u1Var.dismiss();
                return;
        }
    }

    @Override
    public float get(Object obj) {
        org.telegram.ui.er erVar = (org.telegram.ui.er) obj;
        switch (this.f21858a) {
            case 25:
                return erVar.G1;
            case 26:
            default:
                return erVar.I1;
            case 27:
                return erVar.H1;
        }
    }

    @Override
    public float h(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.f1.c(recyclerView);
    }

    @Override
    public Object j(Object obj) {
        Void r22 = (Void) obj;
        switch (this.f21858a) {
            case 0:
                return new TLRPC.TL_messageEntitySpoiler();
            default:
                return new TLRPC.TL_messageEntityStrike();
        }
    }

    @Override
    public RecyclerView l(View view) {
        return ((org.telegram.ui.td) view).f50245a;
    }

    @Override
    public void m(int i7) {
        if (i7 == 0) {
            iz.A(3);
        } else if (i7 == 1) {
            iz.A(0);
        } else if (i7 == 2) {
            iz.A(1);
        } else if (i7 == 3) {
            iz.A(2);
        }
    }

    @Override
    public void onComplete(Task task) {
        iz.f23414j = SystemClock.elapsedRealtime();
        if (!task.isSuccessful()) {
            if (r2.f25216a) {
                a8.b("Failed to get regid");
            }
            iz.h = "__FIREBASE_FAILED__";
            PushListenerController.sendRegistrationToServer(2, null);
            return;
        }
        String str = (String) task.getResult();
        if (!TextUtils.isEmpty(str)) {
            PushListenerController.sendRegistrationToServer(2, str);
        }
    }

    @Override
    public void s(RecyclerView recyclerView) {
        org.telegram.ui.Cells.f1.b(recyclerView);
    }

    public ch(Object obj, int i7) {
        this.f21858a = i7;
    }

    @Override
    public void n() {
    }
}
