package b1;

import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import bd.t;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import ld.l;
import ld.p;
import v7.c0;
public abstract class d {
    public static final a f1947a = new Object();
    public static final LinkedHashSet f1948b;
    public static final int f1949c;
    public static final int d = 0;

    static {
        Integer[] numArr = {7, 20};
        LinkedHashSet linkedHashSet = new LinkedHashSet(t.a(2));
        for (int i10 = 0; i10 < 2; i10++) {
            linkedHashSet.add(numArr[i10]);
        }
        f1948b = linkedHashSet;
        f1949c = 1;
    }

    public static void a(ResultReceiver resultReceiver, Intent intent, String str) {
        i.e(resultReceiver, "resultReceiver");
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", f1949c);
        Parcel obtain = Parcel.obtain();
        i.d(obtain, "obtain(...)");
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        obtain.recycle();
        intent.putExtra("RESULT_RECEIVER", (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain));
        intent.setFlags(65536);
    }

    public static boolean b(Bundle bundle, p pVar, Executor executor, v0.h callback, CancellationSignal cancellationSignal) {
        i.e(executor, "executor");
        i.e(callback, "callback");
        if (!bundle.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        c0.a(cancellationSignal, new b(executor, callback, pVar.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE")), 0));
        return true;
    }

    public static final boolean c(int i10, p pVar, l lVar, CancellationSignal cancellationSignal) {
        if (i10 != -1) {
            ?? obj = new Object();
            obj.f11444a = new w0.c(2, i0.a.j(i10, "activity with result code: ", " indicating not RESULT_OK"));
            if (i10 == 0) {
                obj.f11444a = new w0.b("activity is cancelled by the user.");
            }
            pVar.invoke(cancellationSignal, new c(lVar, obj, 0));
            return true;
        }
        return false;
    }
}
