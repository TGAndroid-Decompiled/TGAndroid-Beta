package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
public abstract class ws7 {
    public static final o94[] a = new o94[0];
    public static final o94 b;
    public static final o94 c;
    public static final xad d;

    static {
        o94 o94Var = new o94("vision.barcode", 1L);
        o94 o94Var2 = new o94("vision.custom.ica", 1L);
        o94 o94Var3 = new o94("vision.face", 1L);
        o94 o94Var4 = new o94("vision.ica", 1L);
        o94 o94Var5 = new o94("vision.ocr", 1L);
        o94 o94Var6 = new o94("mlkit.langid", 1L);
        b = o94Var6;
        o94 o94Var7 = new o94("mlkit.nlclassifier", 1L);
        o94 o94Var8 = new o94("tflite_dynamite", 1L);
        o94 o94Var9 = new o94("mlkit.barcode.ui", 1L);
        o94 o94Var10 = new o94("mlkit.smartreply", 1L);
        c = new o94("mlkit.segmentation.subject", 1L);
        kq kqVar = new kq((byte) 17);
        kqVar.B("barcode", o94Var);
        kqVar.B("custom_ica", o94Var2);
        kqVar.B("face", o94Var3);
        kqVar.B("ica", o94Var4);
        kqVar.B("ocr", o94Var5);
        kqVar.B("langid", o94Var6);
        kqVar.B("nlclassifier", o94Var7);
        kqVar.B("tflite_dynamite", o94Var8);
        kqVar.B("barcode_ui", o94Var9);
        kqVar.B("smart_reply", o94Var10);
        x8d x8dVar = (x8d) kqVar.d;
        if (x8dVar == null) {
            xad c2 = xad.c(kqVar.b, (Object[]) kqVar.c, kqVar);
            x8d x8dVar2 = (x8d) kqVar.d;
            if (x8dVar2 == null) {
                d = c2;
                kq kqVar2 = new kq((byte) 17);
                kqVar2.B("com.google.android.gms.vision.barcode", o94Var);
                kqVar2.B("com.google.android.gms.vision.custom.ica", o94Var2);
                kqVar2.B("com.google.android.gms.vision.face", o94Var3);
                kqVar2.B("com.google.android.gms.vision.ica", o94Var4);
                kqVar2.B("com.google.android.gms.vision.ocr", o94Var5);
                kqVar2.B("com.google.android.gms.mlkit.langid", o94Var6);
                kqVar2.B("com.google.android.gms.mlkit.nlclassifier", o94Var7);
                kqVar2.B("com.google.android.gms.tflite_dynamite", o94Var8);
                kqVar2.B("com.google.android.gms.mlkit_smartreply", o94Var10);
                x8d x8dVar3 = (x8d) kqVar2.d;
                if (x8dVar3 == null) {
                    xad.c(kqVar2.b, (Object[]) kqVar2.c, kqVar2);
                    x8d x8dVar4 = (x8d) kqVar2.d;
                    if (x8dVar4 == null) {
                        return;
                    }
                    throw x8dVar4.a();
                }
                throw x8dVar3.a();
            }
            throw x8dVar2.a();
        }
        throw x8dVar.a();
    }

    public static void a(Context context) {
        d8d d8dVar = t8d.n;
        Object[] objArr = {"ica"};
        h1f.a(1, objArr);
        dad dadVar = new dad(1, objArr);
        e05.b.getClass();
        if (x05.a(context) >= 221500000) {
            int i = dadVar.s;
            o94[] o94VarArr = new o94[i];
            for (int i2 = 0; i2 < i; i2++) {
                o94 o94Var = (o94) d.get(dadVar.get(i2));
                ite.h(o94Var);
                o94VarArr[i2] = o94Var;
            }
            b(context, o94VarArr);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", dadVar));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static void b(Context context, o94[] o94VarArr) {
        Task e;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new f7f(o94VarArr, (byte) 0));
        ite.a("APIs must not be empty.", !arrayList.isEmpty());
        c05 c05Var = new c05(context, ua4.p, wo.g, b05.c);
        ep b2 = ep.b(arrayList, true);
        if (b2.a.isEmpty()) {
            e = Tasks.forResult(new qg7(0, false));
        } else {
            bib b3 = cib.b();
            b3.c = new o94[]{xfd.a};
            b3.b = true;
            b3.d = (char) 27304;
            b3.a = new xab(c05Var, b2, false, (byte) 10);
            e = c05Var.e(0, b3.a());
        }
        e.addOnFailureListener(new b7d((byte) 4));
    }
}
