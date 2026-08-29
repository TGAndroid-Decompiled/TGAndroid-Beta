package b1;

import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import bd.l;
import bd.p;
import h7.g5;
import j7.l1;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.j;
import rc.r;
import v0.i;
public abstract class d {
    public static final a f1884a = new Object();
    public static final LinkedHashSet f1885b;
    public static final int f1886c;
    public static final int d = 0;

    static {
        Integer[] numArr = {7, 20};
        LinkedHashSet linkedHashSet = new LinkedHashSet(r.a(2));
        for (int i10 = 0; i10 < 2; i10++) {
            linkedHashSet.add(numArr[i10]);
        }
        f1885b = linkedHashSet;
        f1886c = 1;
    }

    public static void a(ResultReceiver resultReceiver, Intent intent, String str) {
        j.e(resultReceiver, "resultReceiver");
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", f1886c);
        Parcel obtain = Parcel.obtain();
        j.d(obtain, "obtain(...)");
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        obtain.recycle();
        intent.putExtra("RESULT_RECEIVER", (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain));
        intent.setFlags(65536);
    }

    public static boolean b(Bundle bundle, p pVar, Executor executor, i callback, CancellationSignal cancellationSignal) {
        j.e(executor, "executor");
        j.e(callback, "callback");
        if (!bundle.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        g5.a(cancellationSignal, new b(executor, callback, pVar.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE")), 0));
        return true;
    }

    public static final boolean c(int i10, p pVar, l lVar, CancellationSignal cancellationSignal) {
        if (i10 != -1) {
            ?? obj = new Object();
            obj.f13927a = new w0.c(l1.l(i10, "activity with result code: ", " indicating not RESULT_OK"), 2);
            if (i10 == 0) {
                obj.f13927a = new w0.b("activity is cancelled by the user.");
            }
            pVar.invoke(cancellationSignal, new c(lVar, obj, 0));
            return true;
        }
        return false;
    }
}
