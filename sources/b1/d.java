package b1;

import android.content.Intent;
import android.os.Bundle;
import android.os.CancellationSignal;
import android.os.Parcel;
import android.os.ResultReceiver;
import id.r;
import java.util.LinkedHashSet;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.i;
import sd.l;
import sd.p;
import v7.c0;
public abstract class d {
    public static final a f3195a = new Object();
    public static final LinkedHashSet f3196b;
    public static final int f3197c;
    public static final int d = 0;

    static {
        Integer[] numArr = {7, 20};
        LinkedHashSet linkedHashSet = new LinkedHashSet(r.a(2));
        for (int i10 = 0; i10 < 2; i10++) {
            linkedHashSet.add(numArr[i10]);
        }
        f3196b = linkedHashSet;
        f3197c = 1;
    }

    public static void a(ResultReceiver resultReceiver, Intent intent, String str) {
        i.e(resultReceiver, "resultReceiver");
        intent.putExtra("TYPE", str);
        intent.putExtra("ACTIVITY_REQUEST_CODE", f3197c);
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
        c0.a(cancellationSignal, new b(executor, callback, pVar.invoke(bundle.getString("EXCEPTION_TYPE"), bundle.getString("EXCEPTION_MESSAGE")), 0));
        return true;
    }

    public static final boolean c(int i10, p pVar, l lVar, CancellationSignal cancellationSignal) {
        if (i10 != -1) {
            ?? obj = new Object();
            obj.f15180a = new w0.c(hg.c.i(i10, "activity with result code: ", " indicating not RESULT_OK"), 2);
            if (i10 == 0) {
                obj.f15180a = new w0.b("activity is cancelled by the user.");
            }
            pVar.invoke(cancellationSignal, new c(lVar, obj, 0));
            return true;
        }
        return false;
    }
}
