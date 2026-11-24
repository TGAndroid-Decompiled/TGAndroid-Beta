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
public final class i98 implements ee, kac, gla, OnCompleteListener, ke3, pac, ku4, Vector.TLDeserializer, NativeInstance.AudioLevelsCallback, v84 {
    public final byte a;

    public i98(byte b) {
        this.a = b;
    }

    public static void g() {
        throw new IllegalArgumentException();
    }

    public static void h(Object obj, Object obj2, String str) {
        throw new RuntimeException(str + obj + obj2);
    }

    @Override
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        return Boolean.FALSE;
    }

    @Override
    public final TLObject deserialize(InputSerializedData inputSerializedData, int i, boolean z) {
        return TL_iv.RichText.TLdeserialize(inputSerializedData, i, z);
    }

    @Override
    public final s84[] e(Uri uri, Map map) {
        return new s84[]{new bd3()};
    }

    @Override
    public final void f(nv8 nv8Var) {
        nv8Var.get().getClass();
        throw new ClassCastException();
    }

    @Override
    public final void i(int i) {
        gda.X0 = i;
        gda.x();
    }

    @Override
    public final Object j(Integer num, Object obj) {
        Integer num2 = (Integer) obj;
        if (num.intValue() == 0) {
            return nxa.b1(false, jb6.H(',', "Stars", num2.intValue()), 0.66f, null);
        }
        return jb6.E(num2.intValue(), ',');
    }

    @Override
    public final Object l(Object obj) {
        Integer num = (Integer) obj;
        int i = yb9.f2;
        return 0;
    }

    @Override
    public final void onComplete(Task task) {
        gda.i = SystemClock.elapsedRealtime();
        if (!task.isSuccessful()) {
            if (e21.a) {
                fc4.b("Failed to get regid");
            }
            gda.g = "__FIREBASE_FAILED__";
            PushListenerController.sendRegistrationToServer(2, null);
            return;
        }
        String str = (String) task.getResult();
        if (!TextUtils.isEmpty(str)) {
            PushListenerController.sendRegistrationToServer(2, str);
        }
    }

    @Override
    public final void r(he heVar, int i) {
        switch (this.a) {
            case 0:
                heVar.dismiss();
                return;
            case 1:
                heVar.dismiss();
                return;
            case 2:
            case 3:
            case 6:
            default:
                heVar.dismiss();
                return;
            case 4:
                RectF rectF = ProfileActivity.e7;
                heVar.dismiss();
                return;
            case 5:
                heVar.dismiss();
                return;
            case 7:
                heVar.dismiss();
                return;
        }
    }

    public i98(Object obj, byte b) {
        this.a = b;
    }

    @Override
    public final void m() {
    }

    @Override
    public final void run(int[] iArr, float[] fArr, boolean[] zArr) {
    }
}
