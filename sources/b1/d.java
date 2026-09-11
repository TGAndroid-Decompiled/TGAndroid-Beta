package b1;

import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import hd.r;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import rd.l;
import rd.p;
import v7.f0;
public abstract class d {
    public static final a f1922a = new Object();
    public static final LinkedHashSet f1923b;
    public static final int f1924c;
    public static final int d = 0;

    static {
        Integer[] numArr = {7, 20};
        LinkedHashSet linkedHashSet = new LinkedHashSet(r.a(2));
        for (int i10 = 0; i10 < 2; i10++) {
            linkedHashSet.add(numArr[i10]);
        }
        f1923b = linkedHashSet;
        f1924c = 1;
    }

    public static void a(ResultReceiver resultReceiver, Intent intent, String str) {
        i.e(resultReceiver, "resultReceiver");
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", f1924c);
        Parcel obtain = Parcel.obtain();
        i.d(obtain, "obtain(...)");
        resultReceiver.writeToParcel(obtain, 0);
        obtain.setDataPosition(0);
        obtain.recycle();
        intent.putExtra("RESULT_RECEIVER", (ResultReceiver) ResultReceiver.CREATOR.createFromParcel(obtain));
        intent.setFlags(65536);
    }

    public static boolean b(Bundle bundle, p pVar, Executor executor, v0.i callback, CancellationSignal cancellationSignal) {
        i.e(executor, "executor");
        i.e(callback, "callback");
        if (!bundle.getBoolean("FAILURE_RESPONSE")) {
            return false;
        }
        f0.a(cancellationSignal, new b(executor, callback, pVar.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE")), 0));
        return true;
    }

    public static final boolean c(int i10, p pVar, l lVar, CancellationSignal cancellationSignal) {
        if (i10 != -1) {
            ?? obj = new Object();
            obj.f15053a = new w0.c(i2.g.j(i10, "activity with result code: ", " indicating not RESULT_OK"), 2);
            if (i10 == 0) {
                obj.f15053a = new w0.b("activity is cancelled by the user.");
            }
            pVar.invoke(cancellationSignal, new c(lVar, obj, 0));
            return true;
        }
        return false;
    }
}
