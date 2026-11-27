package defpackage;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import java.util.ArrayList;
public abstract class zt7 {
    public static final a94[] a = new a94[0];
    public static final a94 b;
    public static final a94 c;
    public static final odd d;

    static {
        a94 a94Var = new a94("vision.barcode", 1L);
        a94 a94Var2 = new a94("vision.custom.ica", 1L);
        a94 a94Var3 = new a94("vision.face", 1L);
        a94 a94Var4 = new a94("vision.ica", 1L);
        a94 a94Var5 = new a94("vision.ocr", 1L);
        a94 a94Var6 = new a94("mlkit.langid", 1L);
        b = a94Var6;
        a94 a94Var7 = new a94("mlkit.nlclassifier", 1L);
        a94 a94Var8 = new a94("tflite_dynamite", 1L);
        a94 a94Var9 = new a94("mlkit.barcode.ui", 1L);
        a94 a94Var10 = new a94("mlkit.smartreply", 1L);
        c = new a94("mlkit.segmentation.subject", 1L);
        lp lpVar = new lp((byte) 18);
        lpVar.C("barcode", a94Var);
        lpVar.C("custom_ica", a94Var2);
        lpVar.C("face", a94Var3);
        lpVar.C("ica", a94Var4);
        lpVar.C("ocr", a94Var5);
        lpVar.C("langid", a94Var6);
        lpVar.C("nlclassifier", a94Var7);
        lpVar.C("tflite_dynamite", a94Var8);
        lpVar.C("barcode_ui", a94Var9);
        lpVar.C("smart_reply", a94Var10);
        obd obdVar = (obd) lpVar.d;
        if (obdVar == null) {
            odd c2 = odd.c(lpVar.b, (Object[]) lpVar.c, lpVar);
            obd obdVar2 = (obd) lpVar.d;
            if (obdVar2 == null) {
                d = c2;
                lp lpVar2 = new lp((byte) 18);
                lpVar2.C("com.google.android.gms.vision.barcode", a94Var);
                lpVar2.C("com.google.android.gms.vision.custom.ica", a94Var2);
                lpVar2.C("com.google.android.gms.vision.face", a94Var3);
                lpVar2.C("com.google.android.gms.vision.ica", a94Var4);
                lpVar2.C("com.google.android.gms.vision.ocr", a94Var5);
                lpVar2.C("com.google.android.gms.mlkit.langid", a94Var6);
                lpVar2.C("com.google.android.gms.mlkit.nlclassifier", a94Var7);
                lpVar2.C("com.google.android.gms.tflite_dynamite", a94Var8);
                lpVar2.C("com.google.android.gms.mlkit_smartreply", a94Var10);
                obd obdVar3 = (obd) lpVar2.d;
                if (obdVar3 == null) {
                    odd.c(lpVar2.b, (Object[]) lpVar2.c, lpVar2);
                    obd obdVar4 = (obd) lpVar2.d;
                    if (obdVar4 == null) {
                        return;
                    }
                    throw obdVar4.a();
                }
                throw obdVar3.a();
            }
            throw obdVar2.a();
        }
        throw obdVar.a();
    }

    public static void a(Context context) {
        uad uadVar = kbd.n;
        Object[] objArr = {"ica"};
        x3f.a(1, objArr);
        ucd ucdVar = new ucd(1, objArr);
        j05.b.getClass();
        if (c15.a(context) >= 221500000) {
            int i = ucdVar.s;
            a94[] a94VarArr = new a94[i];
            for (int i2 = 0; i2 < i; i2++) {
                a94 a94Var = (a94) d.get(ucdVar.get(i2));
                xve.h(a94Var);
                a94VarArr[i2] = a94Var;
            }
            b(context, a94VarArr);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", ucdVar));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static void b(Context context, a94[] a94VarArr) {
        Task e;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new u9f(a94VarArr, (byte) 0));
        xve.a("APIs must not be empty.", !arrayList.isEmpty());
        h05 h05Var = new h05(context, qa4.p, wn.g, g05.c);
        fo b2 = fo.b(arrayList, true);
        if (b2.a.isEmpty()) {
            e = Tasks.forResult(new yg7(0, false));
        } else {
            wjb b3 = xjb.b();
            b3.c = new a94[]{nid.a};
            b3.b = true;
            b3.d = (char) 27304;
            b3.a = new k7b(h05Var, b2, (byte) 11);
            e = h05Var.e(0, b3.a());
        }
        e.addOnFailureListener(new s9d((byte) 4));
    }
}
