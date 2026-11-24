package defpackage;

import android.graphics.RectF;
import android.net.Uri;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.View;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import java.util.Map;
import org.telegram.messenger.PushListenerController;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_iv;
import org.telegram.ui.ProfileActivity;
public final class sc8 implements j8c, ed, eja, OnCompleteListener, yc3, o8c, js4, Vector.TLDeserializer, NativeInstance.AudioLevelsCallback, m74 {
    public final byte a;

    public sc8(byte b) {
        this.a = b;
    }

    public static void e() {
        throw new IllegalArgumentException();
    }

    public static void i(Object obj, Object obj2, String str) {
        throw new RuntimeException(str + obj + obj2);
    }

    public static void j(String str) {
        throw new IllegalStateException(str);
    }

    @Override
    public final Boolean d(c4c c4cVar, View view, Integer num, Float f, Float f2) {
        return Boolean.FALSE;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TL_iv.RichText.TLdeserialize(inputSerializedData, i, z);
    }

    @Override
    public final j74[] f(Uri uri, Map map) {
        return new j74[]{new pb3()};
    }

    @Override
    public final Object g(Integer num, Object obj) {
        Integer num2 = (Integer) obj;
        if (num.intValue() == 0) {
            return jva.a1(false, k96.H(',', "Stars", num2.intValue()), 0.66f, null);
        }
        return k96.E(num2.intValue(), ',');
    }

    @Override
    public final void h(mt8 mt8Var) {
        mt8Var.get().getClass();
        throw new ClassCastException();
    }

    @Override
    public final void k(int i) {
        gba.Y0 = i;
        gba.x();
    }

    @Override
    public final Object m(Object obj) {
        Integer num = (Integer) obj;
        int i = y99.f2;
        return 0;
    }

    @Override
    public final void onComplete(Task task) {
        gba.i = SystemClock.elapsedRealtime();
        if (!task.isSuccessful()) {
            if (w01.a) {
                fa4.b("Failed to get regid");
            }
            gba.g = "__FIREBASE_FAILED__";
            PushListenerController.sendRegistrationToServer(2, null);
            return;
        }
        String str = (String) task.getResult();
        if (!TextUtils.isEmpty(str)) {
            PushListenerController.sendRegistrationToServer(2, str);
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        switch (this.a) {
            case 2:
                RectF rectF = ProfileActivity.Z6;
                hdVar.dismiss();
                return;
            case 3:
                hdVar.dismiss();
                return;
            case 4:
            default:
                hdVar.dismiss();
                return;
            case 5:
                hdVar.dismiss();
                return;
        }
    }

    public sc8(Object obj, byte b) {
        this.a = b;
    }

    @Override
    public final void n() {
    }

    @Override
    public final void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
