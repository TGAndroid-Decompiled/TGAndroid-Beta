package org.telegram.messenger;

import android.graphics.BlendMode;
import android.graphics.Shader;
import android.os.Build;
import android.os.SystemClock;
import android.text.TextUtils;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_ephemeral;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.Components.xu0;
public final class e9 implements l9, Vector.TLDeserializer, OnCompleteListener, org.telegram.ui.ActionBar.u1, xu0 {
    public final int f15373a;

    public e9(int i10) {
        this.f15373a = i10;
    }

    public static BlendMode b(Object obj) {
        return (BlendMode) obj;
    }

    public static Shader.TileMode c() {
        return Shader.TileMode.DECAL;
    }

    public static String f() {
        return Build.SOC_MODEL;
    }

    @Override
    public TLObject deserialize(InputSerializedData inputSerializedData, int i10, boolean z10) {
        switch (this.f15373a) {
            case 16:
                return TLRPC.Peer.TLdeserialize(inputSerializedData, i10, z10);
            case 17:
                return TL_account.WebBrowserSettings.TLdeserialize(inputSerializedData, i10, z10);
            case 18:
                return TLRPC.MessageEntity.TLdeserialize(inputSerializedData, i10, z10);
            case 19:
                return TL_ephemeral.EphemeralMessage.TLdeserialize(inputSerializedData, i10, z10);
            case 20:
            case 21:
            case 22:
            default:
                return TLRPC.PollAnswer.TLdeserialize(inputSerializedData, i10, z10);
            case 23:
                return TL_iv.RichText.TLdeserialize(inputSerializedData, i10, z10);
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f15373a) {
            case 25:
                int i11 = tz.f18131a;
                return;
            default:
                x1Var.dismiss();
                return;
        }
    }

    @Override
    public Object l(Object obj) {
        Void r22 = (Void) obj;
        switch (this.f15373a) {
            case 12:
                return new TLRPC.TL_messageEntityBold();
            case 13:
                return new TLRPC.TL_messageEntityItalic();
            case 14:
                return new TLRPC.TL_messageEntitySpoiler();
            default:
                return new TLRPC.TL_messageEntityStrike();
        }
    }

    @Override
    public void m(int i10) {
        if (i10 == 0) {
            tz.A(3);
        } else if (i10 == 1) {
            tz.A(0);
        } else if (i10 == 2) {
            tz.A(1);
        } else if (i10 == 3) {
            tz.A(2);
        }
    }

    @Override
    public void onComplete(Task task) {
        tz.f18155j = SystemClock.elapsedRealtime();
        if (!task.isSuccessful()) {
            if (v2.f18448a) {
                f8.b("Failed to get regid");
            }
            tz.h = "__FIREBASE_FAILED__";
            PushListenerController.sendRegistrationToServer(2, null);
            return;
        }
        String str = (String) task.getResult();
        if (!TextUtils.isEmpty(str)) {
            PushListenerController.sendRegistrationToServer(2, str);
        }
    }

    public e9(eu euVar) {
        this.f15373a = 22;
    }

    @Override
    public void s() {
    }
}
