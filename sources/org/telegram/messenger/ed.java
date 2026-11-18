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
import org.telegram.ui.Components.du0;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.nj0;
import org.telegram.ui.Components.ot0;
public final class ed implements i9, Vector.TLDeserializer, OnCompleteListener, org.telegram.ui.ActionBar.r1, du0, r10, ot0, w10, jh.i, nj0 {
    public final int f23699a;

    public ed(int i7) {
        this.f23699a = i7;
    }

    public static Shader.TileMode c() {
        return Shader.TileMode.DECAL;
    }

    @Override
    public Boolean a(l41 l41Var, View view, Integer num, Float f10, Float f11) {
        return Boolean.FALSE;
    }

    @Override
    public void d(View view, RectF rectF) {
        view.invalidate();
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i7, boolean z10) {
        switch (this.f23699a) {
            case 7:
                return TLRPC.Peer.TLdeserialize(inputSerializedData, i7, z10);
            case 8:
                return TL_account.WebBrowserSettings.TLdeserialize(inputSerializedData, i7, z10);
            case 9:
                return TLRPC.MessageEntity.TLdeserialize(inputSerializedData, i7, z10);
            case 10:
                return TL_ephemeral.EphemeralMessage.TLdeserialize(inputSerializedData, i7, z10);
            case 11:
            case 12:
            case 13:
            default:
                return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i7, z10);
            case 14:
                return TL_iv.RichText.TLdeserialize(inputSerializedData, i7, z10);
        }
    }

    @Override
    public Object g(Number number, Object obj) {
        Integer num = (Integer) number;
        Integer num2 = (Integer) obj;
        switch (this.f23699a) {
            case 22:
                if (num.intValue() == 0) {
                    return gd.G(num2.intValue(), "MaximumReactionsValue", new Object[0]);
                }
                return "" + num2;
            default:
                if (num.intValue() == 0) {
                    return gd.H(',', "Stars", num2.intValue());
                }
                return "" + num2;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.u1 u1Var, int i7) {
        switch (this.f23699a) {
            case 16:
                int i10 = bz.f23145a;
                return;
            case 19:
                u1Var.dismiss();
                return;
            case 23:
                u1Var.dismiss();
                return;
            default:
                u1Var.dismiss();
                return;
        }
    }

    @Override
    public float j(RecyclerView recyclerView) {
        return org.telegram.ui.Cells.c0.c(recyclerView);
    }

    @Override
    public void k(int i7) {
        if (i7 == 0) {
            bz.A(3);
        } else if (i7 == 1) {
            bz.A(0);
        } else if (i7 == 2) {
            bz.A(1);
        } else if (i7 == 3) {
            bz.A(2);
        }
    }

    @Override
    public Object m(Object obj) {
        Void r22 = (Void) obj;
        switch (this.f23699a) {
            case 3:
                return new TLRPC.TL_messageEntityBold();
            case 4:
                return new TLRPC.TL_messageEntityItalic();
            case 5:
                return new TLRPC.TL_messageEntitySpoiler();
            default:
                return new TLRPC.TL_messageEntityStrike();
        }
    }

    @Override
    public RecyclerView n(View view) {
        return ((org.telegram.ui.rd) view).f51564a;
    }

    @Override
    public void onComplete(Task task) {
        bz.f23170j = SystemClock.elapsedRealtime();
        if (!task.isSuccessful()) {
            if (s2.f26721a) {
                a8.b("Failed to get regid");
            }
            bz.h = "__FIREBASE_FAILED__";
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
        org.telegram.ui.Cells.c0.b(recyclerView);
    }

    public ed(Object obj, int i7) {
        this.f23699a = i7;
    }

    @Override
    public void o() {
    }
}
