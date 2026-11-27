package defpackage;

import android.content.Context;
import com.google.android.gms.tasks.Task;
import java.util.HashMap;
public final class j2f {
    public static imf j;
    public static final vad k;
    public final String a;
    public final String b;
    public final q1f c;
    public final lja d;
    public final Task e;
    public final Task f;
    public final String g;
    public final int h;
    public final HashMap i = new HashMap();

    static {
        Object[] objArr = {"optional-module-barcode", "com.google.android.gms.vision.barcode"};
        objArr[0].getClass();
        objArr[1].getClass();
        k = new vad(objArr);
    }

    public j2f(Context context, lja ljaVar, q1f q1fVar, String str) {
        int i;
        this.a = context.getPackageName();
        this.b = in2.a(context);
        this.d = ljaVar;
        this.c = q1fVar;
        z3f.p();
        this.g = str;
        ri6.v();
        this.e = ri6.G(new tg7(this, (byte) 5));
        ri6.v();
        ljaVar.getClass();
        this.f = ri6.G(new z1f(ljaVar, (byte) 0));
        vad vadVar = k;
        if (vadVar.containsKey(str)) {
            i = vs3.d(context, (String) vadVar.get(str), false);
        } else {
            i = -1;
        }
        this.h = i;
    }
}
