package ab;

import ag.j2;
import ag.o1;
import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.Tasks;
import h7.g7;
import java.util.ArrayList;
import java.util.concurrent.ExecutionException;
public abstract class k {
    public static final w5.c[] f318a = new w5.c[0];
    public static final w5.c f319b;
    public static final w5.c f320c;
    public static final f7.l d;

    static {
        w5.c cVar = new w5.c("vision.barcode", 1L);
        w5.c cVar2 = new w5.c("vision.custom.ica", 1L);
        w5.c cVar3 = new w5.c("vision.face", 1L);
        w5.c cVar4 = new w5.c("vision.ica", 1L);
        w5.c cVar5 = new w5.c("vision.ocr", 1L);
        w5.c cVar6 = new w5.c("mlkit.langid", 1L);
        f319b = cVar6;
        w5.c cVar7 = new w5.c("mlkit.nlclassifier", 1L);
        w5.c cVar8 = new w5.c("tflite_dynamite", 1L);
        w5.c cVar9 = new w5.c("mlkit.barcode.ui", 1L);
        w5.c cVar10 = new w5.c("mlkit.smartreply", 1L);
        f320c = new w5.c("mlkit.segmentation.subject", 1L);
        j2 j2Var = new j2(6, (byte) 0);
        j2Var.p("barcode", cVar);
        j2Var.p("custom_ica", cVar2);
        j2Var.p("face", cVar3);
        j2Var.p("ica", cVar4);
        j2Var.p("ocr", cVar5);
        j2Var.p("langid", cVar6);
        j2Var.p("nlclassifier", cVar7);
        j2Var.p("tflite_dynamite", cVar8);
        j2Var.p("barcode_ui", cVar9);
        j2Var.p("smart_reply", cVar10);
        f7.e eVar = (f7.e) j2Var.d;
        if (eVar == null) {
            f7.l b10 = f7.l.b(j2Var.f558b, (Object[]) j2Var.f559c, j2Var);
            f7.e eVar2 = (f7.e) j2Var.d;
            if (eVar2 == null) {
                d = b10;
                j2 j2Var2 = new j2(6, (byte) 0);
                j2Var2.p("com.google.android.gms.vision.barcode", cVar);
                j2Var2.p("com.google.android.gms.vision.custom.ica", cVar2);
                j2Var2.p("com.google.android.gms.vision.face", cVar3);
                j2Var2.p("com.google.android.gms.vision.ica", cVar4);
                j2Var2.p("com.google.android.gms.vision.ocr", cVar5);
                j2Var2.p("com.google.android.gms.mlkit.langid", cVar6);
                j2Var2.p("com.google.android.gms.mlkit.nlclassifier", cVar7);
                j2Var2.p("com.google.android.gms.tflite_dynamite", cVar8);
                j2Var2.p("com.google.android.gms.mlkit_smartreply", cVar10);
                f7.e eVar3 = (f7.e) j2Var2.d;
                if (eVar3 == null) {
                    f7.l.b(j2Var2.f558b, (Object[]) j2Var2.f559c, j2Var2);
                    f7.e eVar4 = (f7.e) j2Var2.d;
                    if (eVar4 == null) {
                        return;
                    }
                    throw eVar4.a();
                }
                throw eVar3.a();
            }
            throw eVar2.a();
        }
        throw eVar.a();
    }

    public static boolean a(Context context, w5.c[] cVarArr) {
        try {
            return ((d6.a) Tasks.await(new com.google.android.gms.common.api.j(context, e6.g.f5835k, com.google.android.gms.common.api.b.f3758i, com.google.android.gms.common.api.i.f3767c).f(new v(cVarArr, 1)).addOnFailureListener(new ya.a(1)))).f5421a;
        } catch (InterruptedException | ExecutionException e10) {
            Log.e("OptionalModuleUtils", "Failed to complete the task of features availability check", e10);
            return false;
        }
    }

    public static void b(Context context) {
        f7.b bVar = f7.d.f6656b;
        Object[] objArr = {"ica"};
        g7.a(1, objArr);
        f7.g gVar = new f7.g(1, objArr);
        w5.e.f49769b.getClass();
        if (w5.e.a(context) >= 221500000) {
            int i10 = gVar.d;
            w5.c[] cVarArr = new w5.c[i10];
            for (int i11 = 0; i11 < i10; i11++) {
                w5.c cVar = (w5.c) d.get(gVar.get(i11));
                z5.l.h(cVar);
                cVarArr[i11] = cVar;
            }
            c(context, cVarArr);
            return;
        }
        Intent intent = new Intent();
        intent.setClassName("com.google.android.gms", "com.google.android.gms.vision.DependencyBroadcastReceiverProxy");
        intent.setAction("com.google.android.gms.vision.DEPENDENCY");
        intent.putExtra("com.google.android.gms.vision.DEPENDENCIES", TextUtils.join(",", gVar));
        intent.putExtra("requester_app_package", context.getApplicationInfo().packageName);
        context.sendBroadcast(intent);
    }

    public static void c(Context context, w5.c[] cVarArr) {
        Task e10;
        ArrayList arrayList = new ArrayList();
        arrayList.add(new v(cVarArr, 0));
        z5.l.a("APIs must not be empty.", !arrayList.isEmpty());
        com.google.android.gms.common.api.j jVar = new com.google.android.gms.common.api.j(context, e6.g.f5835k, com.google.android.gms.common.api.b.f3758i, com.google.android.gms.common.api.i.f3767c);
        e6.a b10 = e6.a.b(arrayList, true);
        if (b10.f5829a.isEmpty()) {
            e10 = Tasks.forResult(new d6.c(0, false));
        } else {
            com.google.android.gms.common.api.internal.v b11 = com.google.android.gms.common.api.internal.w.b();
            b11.d = new w5.c[]{w6.b.f49793c};
            b11.f3927b = true;
            b11.f3926a = 27304;
            b11.f3928c = new o1(jVar, b10, 11);
            e10 = jVar.e(0, b11.b());
        }
        e10.addOnFailureListener(new x9.d(1));
    }
}
