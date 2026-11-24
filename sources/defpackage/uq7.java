package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
public abstract class uq7 {
    public static final f84[] a = new f84[0];
    public static final f84 b;
    public static final f84 c;
    public static final v8d d;

    static {
        f84 f84Var = new f84("vision.barcode", 1L);
        f84 f84Var2 = new f84("vision.custom.ica", 1L);
        f84 f84Var3 = new f84("vision.face", 1L);
        f84 f84Var4 = new f84("vision.ica", 1L);
        f84 f84Var5 = new f84("vision.ocr", 1L);
        f84 f84Var6 = new f84("mlkit.langid", 1L);
        b = f84Var6;
        f84 f84Var7 = new f84("mlkit.nlclassifier", 1L);
        f84 f84Var8 = new f84("tflite_dynamite", 1L);
        f84 f84Var9 = new f84("mlkit.barcode.ui", 1L);
        f84 f84Var10 = new f84("mlkit.smartreply", 1L);
        c = new f84("mlkit.segmentation.subject", 1L);
        kp kpVar = new kp((byte) 17);
        kpVar.B("barcode", f84Var);
        kpVar.B("custom_ica", f84Var2);
        kpVar.B("face", f84Var3);
        kpVar.B("ica", f84Var4);
        kpVar.B("ocr", f84Var5);
        kpVar.B("langid", f84Var6);
        kpVar.B("nlclassifier", f84Var7);
        kpVar.B("tflite_dynamite", f84Var8);
        kpVar.B("barcode_ui", f84Var9);
        kpVar.B("smart_reply", f84Var10);
        v6d v6dVar = (v6d) kpVar.d;
        if (v6dVar == null) {
            v8d c2 = v8d.c(kpVar.b, (Object[]) kpVar.c, kpVar);
            v6d v6dVar2 = (v6d) kpVar.d;
            if (v6dVar2 == null) {
                d = c2;
                kp kpVar2 = new kp((byte) 17);
                kpVar2.B("com.google.android.gms.vision.barcode", f84Var);
                kpVar2.B("com.google.android.gms.vision.custom.ica", f84Var2);
                kpVar2.B("com.google.android.gms.vision.face", f84Var3);
                kpVar2.B("com.google.android.gms.vision.ica", f84Var4);
                kpVar2.B("com.google.android.gms.vision.ocr", f84Var5);
                kpVar2.B("com.google.android.gms.mlkit.langid", f84Var6);
                kpVar2.B("com.google.android.gms.mlkit.nlclassifier", f84Var7);
                kpVar2.B("com.google.android.gms.tflite_dynamite", f84Var8);
                kpVar2.B("com.google.android.gms.mlkit_smartreply", f84Var10);
                v6d v6dVar3 = (v6d) kpVar2.d;
                if (v6dVar3 == null) {
                    v8d.c(kpVar2.b, (Object[]) kpVar2.c, kpVar2);
                    v6d v6dVar4 = (v6d) kpVar2.d;
                    if (v6dVar4 == null) {
                        return;
                    }
                    throw v6dVar4.a();
                }
                throw v6dVar3.a();
            }
            throw v6dVar2.a();
        }
        throw v6dVar.a();
    }

    public static void a(Context context) {
        b6d b6dVar = r6d.n;
        Object[] objArr = {"ica"};
        fze.a(1, objArr);
        b8d b8dVar = new b8d(1, objArr);
        dy4.b.getClass();
        if (yy4.a(context) >= 221500000) {
            int i = b8dVar.s;
            f84[] f84VarArr = new f84[i];
            for (int i2 = 0; i2 < i; i2++) {
                f84 f84Var = (f84) d.get(b8dVar.get(i2));
                fre.h(f84Var);
                f84VarArr[i2] = f84Var;
            }
            b(context, f84VarArr);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", b8dVar));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static void b(Context context, f84[] f84VarArr) {
        Task e;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new d5f(f84VarArr, (byte) 0));
        fre.a("APIs must not be empty.", !arrayList.isEmpty());
        by4 by4Var = new by4(context, u84.p, vn.g, ay4.c);
        eo b2 = eo.b(arrayList, true);
        if (b2.a.isEmpty()) {
            e = Tasks.forResult(new oe7(0, false));
        } else {
            agb b3 = bgb.b();
            b3.c = new f84[]{vdd.a};
            b3.b = true;
            b3.d = (char) 27304;
            b3.a = new v8b(by4Var, b2, false, (byte) 10);
            e = by4Var.e(0, b3.a());
        }
        e.addOnFailureListener(new z4d((byte) 4));
    }
}
